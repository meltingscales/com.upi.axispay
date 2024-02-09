package defpackage;

import android.view.MotionEvent;

/* compiled from: AxisPay */
/* renamed from: nb  reason: default package */
/* loaded from: classes.dex */
public final class nb {
    @Deprecated
    public static int a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int c(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    public static float d(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    public static boolean e(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
