package defpackage;

import android.view.View;
import android.view.ViewParent;

/* compiled from: AxisPay */
/* renamed from: pb  reason: default package */
/* loaded from: classes.dex */
public class pb {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public pb(View view) {
        this.c = view;
    }

    public boolean a(float f, float f2, boolean z) {
        ViewParent i;
        if (!m() || (i = i(0)) == null) {
            return false;
        }
        return dc.a(i, this.c, f, f2, z);
    }

    public boolean b(float f, float f2) {
        ViewParent i;
        if (!m() || (i = i(0)) == null) {
            return false;
        }
        return dc.b(i, this.c, f, f2);
    }

    public boolean c(int i, int i2, int[] iArr, int[] iArr2) {
        return d(i, i2, iArr, iArr2, 0);
    }

    public boolean d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent i4;
        int i5;
        int i6;
        if (!m() || (i4 = i(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        dc.c(i4, this.c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean f(int i, int i2, int i3, int i4, int[] iArr) {
        return h(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean g(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return h(i, i2, i3, i4, iArr, i5, null);
    }

    public final boolean h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent i6;
        int i7;
        int i8;
        int[] iArr3;
        if (!m() || (i6 = i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            int[] j = j();
            j[0] = 0;
            j[1] = 0;
            iArr3 = j;
        } else {
            iArr3 = iArr2;
        }
        dc.d(i6, this.c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public final ViewParent i(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    public final int[] j() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i) {
        return i(i) != null;
    }

    public boolean m() {
        return this.d;
    }

    public void n(boolean z) {
        if (this.d) {
            ac.M0(this.c);
        }
        this.d = z;
    }

    public final void o(int i, ViewParent viewParent) {
        if (i == 0) {
            this.a = viewParent;
        } else if (i != 1) {
        } else {
            this.b = viewParent;
        }
    }

    public boolean p(int i) {
        return q(i, 0);
    }

    public boolean q(int i, int i2) {
        if (l(i2)) {
            return true;
        }
        if (m()) {
            View view = this.c;
            for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
                if (dc.f(parent, view, this.c, i, i2)) {
                    o(i2, parent);
                    dc.e(parent, view, this.c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int i) {
        ViewParent i2 = i(i);
        if (i2 != null) {
            dc.g(i2, this.c, i);
            o(i, null);
        }
    }
}
