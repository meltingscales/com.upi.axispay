package com.upi.axispay.custom;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class NpciLayoutChangeListener implements ViewTreeObserver.OnGlobalLayoutListener {
    private final Activity activity;
    private final int etMpinId;

    public NpciLayoutChangeListener(Activity activity) {
        yl0.e(activity, C0059ao.a(12877));
        this.activity = activity;
        this.etMpinId = activity.getResources().getIdentifier(C0059ao.a(12878), null, activity.getPackageName());
    }

    public final Activity getActivity() {
        return this.activity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i = this.etMpinId;
        if (i == 0) {
            this.activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            return;
        }
        View findViewById = this.activity.findViewById(i);
        if (findViewById == null) {
            return;
        }
        findViewById.requestFocus();
        this.activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
