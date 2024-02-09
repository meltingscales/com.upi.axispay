package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TimeBasedFileRollOverRunnable implements Runnable {
    private final Context context;
    private final FileRollOverManager fileRollOverManager;

    public TimeBasedFileRollOverRunnable(Context context, FileRollOverManager fileRollOverManager) {
        this.context = context;
        this.fileRollOverManager = fileRollOverManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            CommonUtils.logControlled(this.context, C0059ao.a(14707));
            if (this.fileRollOverManager.rollFileOver()) {
                return;
            }
            this.fileRollOverManager.cancelTimeBasedFileRollOver();
        } catch (Exception e) {
            CommonUtils.logControlledError(this.context, C0059ao.a(14708), e);
        }
    }
}
