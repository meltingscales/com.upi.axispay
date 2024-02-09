package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: AxisPay */
/* renamed from: i2  reason: default package */
/* loaded from: classes.dex */
public class i2 extends PopupWindow {
    public static final boolean b;
    public boolean a;

    static {
        b = Build.VERSION.SDK_INT < 21;
    }

    public i2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        o3 v = o3.v(context, attributeSet, u.PopupWindow, i, i2);
        int i3 = u.PopupWindow_overlapAnchor;
        if (v.s(i3)) {
            b(v.a(i3, false));
        }
        setBackgroundDrawable(v.g(u.PopupWindow_android_popupBackground));
        v.w();
    }

    public final void b(boolean z) {
        if (b) {
            this.a = z;
        } else {
            zc.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
