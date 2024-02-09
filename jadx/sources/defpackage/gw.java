package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: AxisPay */
/* renamed from: gw  reason: default package */
/* loaded from: classes.dex */
public class gw<V extends View> extends CoordinatorLayout.c<V> {
    public hw a;
    public int b;
    public int c;

    public gw() {
        this.b = 0;
        this.c = 0;
    }

    public int E() {
        hw hwVar = this.a;
        if (hwVar != null) {
            return hwVar.b();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.I(v, i);
    }

    public boolean G(int i) {
        hw hwVar = this.a;
        if (hwVar != null) {
            return hwVar.e(i);
        }
        this.b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        F(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new hw(v);
        }
        this.a.c();
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.e(i2);
            this.b = 0;
        }
        int i3 = this.c;
        if (i3 != 0) {
            this.a.d(i3);
            this.c = 0;
            return true;
        }
        return true;
    }

    public gw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
    }
}
