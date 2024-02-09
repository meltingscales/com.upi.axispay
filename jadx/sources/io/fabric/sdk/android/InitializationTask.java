package io.fabric.sdk.android;

import io.fabric.sdk.android.services.common.TimingMetric;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityAsyncTask;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class InitializationTask<Result> extends PriorityAsyncTask<Void, Void, Result> {
    private static final String TIMING_METRIC_TAG = null;
    public final Kit<Result> kit;

    static {
        C0059ao.a(InitializationTask.class, 374);
    }

    public InitializationTask(Kit<Result> kit) {
        this.kit = kit;
    }

    private TimingMetric createAndStartTimingMetric(String str) {
        TimingMetric timingMetric = new TimingMetric(this.kit.getIdentifier() + C0059ao.a(864) + str, C0059ao.a(865));
        timingMetric.startMeasuring();
        return timingMetric;
    }

    @Override // io.fabric.sdk.android.services.concurrency.PriorityAsyncTask, io.fabric.sdk.android.services.concurrency.PriorityProvider
    public Priority getPriority() {
        return Priority.HIGH;
    }

    @Override // io.fabric.sdk.android.services.concurrency.AsyncTask
    public void onCancelled(Result result) {
        this.kit.onCancelled(result);
        this.kit.initializationCallback.failure(new InitializationException(this.kit.getIdentifier() + C0059ao.a(867)));
    }

    @Override // io.fabric.sdk.android.services.concurrency.AsyncTask
    public void onPostExecute(Result result) {
        this.kit.onPostExecute(result);
        this.kit.initializationCallback.success(result);
    }

    @Override // io.fabric.sdk.android.services.concurrency.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        TimingMetric createAndStartTimingMetric = createAndStartTimingMetric(C0059ao.a(868));
        try {
            try {
                boolean onPreExecute = this.kit.onPreExecute();
                createAndStartTimingMetric.stopMeasuring();
                if (onPreExecute) {
                    return;
                }
            } catch (UnmetDependencyException e) {
                throw e;
            } catch (Exception e2) {
                Fabric.getLogger().e(C0059ao.a(869), C0059ao.a(870), e2);
                createAndStartTimingMetric.stopMeasuring();
            }
            cancel(true);
        } catch (Throwable th) {
            createAndStartTimingMetric.stopMeasuring();
            cancel(true);
            throw th;
        }
    }

    @Override // io.fabric.sdk.android.services.concurrency.AsyncTask
    public Result doInBackground(Void... voidArr) {
        TimingMetric createAndStartTimingMetric = createAndStartTimingMetric(C0059ao.a(866));
        Result doInBackground = !isCancelled() ? this.kit.doInBackground() : null;
        createAndStartTimingMetric.stopMeasuring();
        return doInBackground;
    }
}
