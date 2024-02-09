package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import java.nio.charset.Charset;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private final zo<CrashlyticsReport> transport;
    private final yo<CrashlyticsReport, byte[]> transportTransform;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final yo<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = new yo() { // from class: d20
        @Override // defpackage.yo
        public final Object apply(Object obj) {
            byte[] bytes;
            bytes = DataTransportCrashlyticsReportSender.TRANSFORM.reportToJson((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
            return bytes;
        }
    };

    public DataTransportCrashlyticsReportSender(zo<CrashlyticsReport> zoVar, yo<CrashlyticsReport, byte[]> yoVar) {
        this.transport = zoVar;
        this.transportTransform = yoVar;
    }

    public static /* synthetic */ void a(TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
        } else {
            taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
        }
    }

    public static DataTransportCrashlyticsReportSender create(Context context) {
        pq.f(context);
        ap g = pq.c().g(new ep(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY));
        vo b = vo.b("json");
        yo<CrashlyticsReport, byte[]> yoVar = DEFAULT_TRANSFORM;
        return new DataTransportCrashlyticsReportSender(g.a(CRASHLYTICS_TRANSPORT_NAME, CrashlyticsReport.class, b, yoVar), yoVar);
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public Task<CrashlyticsReportWithSessionId> sendReport(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        CrashlyticsReport report = crashlyticsReportWithSessionId.getReport();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.transport.a(wo.d(report), new bp() { // from class: e20
            @Override // defpackage.bp
            public final void a(Exception exc) {
                DataTransportCrashlyticsReportSender.a(TaskCompletionSource.this, crashlyticsReportWithSessionId, exc);
            }
        });
        return taskCompletionSource.getTask();
    }
}
