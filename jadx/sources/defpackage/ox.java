package defpackage;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: AxisPay */
/* renamed from: ox  reason: default package */
/* loaded from: classes.dex */
public class ox implements View.OnTouchListener {
    public final Dialog b;
    public final int c;
    public final int d;
    public final int e;

    public ox(Dialog dialog, Rect rect) {
        this.b = dialog;
        this.c = rect.left;
        this.d = rect.top;
        this.e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.c + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.d + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.e;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.b.onTouchEvent(obtain);
    }
}
