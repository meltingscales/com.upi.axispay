package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.events.GZIPQueueFileEventStorage;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.IOException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AnswersFilesManagerProvider {
    public static final String SESSION_ANALYTICS_FILE_NAME = null;
    public static final String SESSION_ANALYTICS_TO_SEND_DIR = null;
    public final Context context;
    public final FileStore fileStore;

    static {
        C0059ao.a(AnswersFilesManagerProvider.class, 167);
    }

    public AnswersFilesManagerProvider(Context context, FileStore fileStore) {
        this.context = context;
        this.fileStore = fileStore;
    }

    public SessionAnalyticsFilesManager getAnalyticsFilesManager() throws IOException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new SessionAnalyticsFilesManager(this.context, new SessionEventTransform(), new SystemCurrentTimeProvider(), new GZIPQueueFileEventStorage(this.context, this.fileStore.getFilesDir(), C0059ao.a(695), C0059ao.a(696)));
        }
        throw new IllegalStateException(C0059ao.a(697));
    }
}
