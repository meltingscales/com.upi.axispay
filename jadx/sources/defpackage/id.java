package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import defpackage.jd;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: id  reason: default package */
/* loaded from: classes.dex */
public abstract class id extends eb {
    public static final Rect n = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    public static final jd.a<lc> o = new a();
    public static final jd.b<v4<lc>, lc> p = new b();
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = RecyclerView.UNDEFINED_DURATION;
    public int l = RecyclerView.UNDEFINED_DURATION;
    private int m = RecyclerView.UNDEFINED_DURATION;

    /* compiled from: AxisPay */
    /* renamed from: id$a */
    /* loaded from: classes.dex */
    public static class a implements jd.a<lc> {
        @Override // defpackage.jd.a
        /* renamed from: b */
        public void a(lc lcVar, Rect rect) {
            lcVar.m(rect);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: id$b */
    /* loaded from: classes.dex */
    public static class b implements jd.b<v4<lc>, lc> {
        @Override // defpackage.jd.b
        /* renamed from: c */
        public lc a(v4<lc> v4Var, int i) {
            return v4Var.k(i);
        }

        @Override // defpackage.jd.b
        /* renamed from: d */
        public int b(v4<lc> v4Var) {
            return v4Var.j();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: id$c */
    /* loaded from: classes.dex */
    public class c extends mc {
        public c() {
        }

        @Override // defpackage.mc
        public lc b(int i) {
            return lc.P(id.this.H(i));
        }

        @Override // defpackage.mc
        public lc d(int i) {
            int i2 = i == 2 ? id.this.k : id.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // defpackage.mc
        public boolean f(int i, int i2, Bundle bundle) {
            return id.this.P(i, i2, bundle);
        }
    }

    public id(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService(C0059ao.a(8872));
            view.setFocusable(true);
            if (ac.A(view) == 0) {
                ac.B0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(8873));
    }

    public static Rect D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException(C0059ao.a(8874));
        }
        return rect;
    }

    public static int F(int i) {
        if (i != 19) {
            if (i != 21) {
                return i != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    public final int A() {
        return this.l;
    }

    public abstract int B(float f, float f2);

    public abstract void C(List<Integer> list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean G(int i, Rect rect) {
        lc lcVar;
        v4<lc> y = y();
        int i2 = this.l;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        lc e = i2 == Integer.MIN_VALUE ? null : y.e(i2);
        if (i == 1 || i == 2) {
            lcVar = (lc) jd.d(y, p, o, e, i, ac.C(this.i) == 1, false);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException(C0059ao.a(8875));
        } else {
            Rect rect2 = new Rect();
            int i4 = this.l;
            if (i4 != Integer.MIN_VALUE) {
                z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.i, i, rect2);
            }
            lcVar = (lc) jd.c(y, p, o, e, rect2, i);
        }
        if (lcVar != null) {
            i3 = y.h(y.g(lcVar));
        }
        return T(i3);
    }

    public lc H(int i) {
        if (i == -1) {
            return u();
        }
        return t(i);
    }

    public final void I(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (z) {
            G(i, rect);
        }
    }

    public abstract boolean J(int i, int i2, Bundle bundle);

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i, AccessibilityEvent accessibilityEvent) {
    }

    public void M(lc lcVar) {
    }

    public abstract void N(int i, lc lcVar);

    public void O(int i, boolean z) {
    }

    public boolean P(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return Q(i, i2, bundle);
        }
        return R(i2, bundle);
    }

    public final boolean Q(int i, int i2, Bundle bundle) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 64) {
                    if (i2 != 128) {
                        return J(i, i2, bundle);
                    }
                    return n(i);
                }
                return S(i);
            }
            return o(i);
        }
        return T(i);
    }

    public final boolean R(int i, Bundle bundle) {
        return ac.f0(this.i, i, bundle);
    }

    public final boolean S(int i) {
        int i2;
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled() && (i2 = this.k) != i) {
            if (i2 != Integer.MIN_VALUE) {
                n(i2);
            }
            this.k = i;
            this.i.invalidate();
            U(i, 32768);
            return true;
        }
        return false;
    }

    public final boolean T(int i) {
        int i2;
        if ((this.i.isFocused() || this.i.requestFocus()) && (i2 = this.l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                o(i2);
            }
            this.l = i;
            O(i, true);
            U(i, 8);
            return true;
        }
        return false;
    }

    public final boolean U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return dc.h(parent, this.i, q(i, i2));
    }

    public final void V(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        U(i, Barcode.ITF);
        U(i2, Barcode.QR_CODE);
    }

    @Override // defpackage.eb
    public mc b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // defpackage.eb
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // defpackage.eb
    public void g(View view, lc lcVar) {
        super.g(view, lcVar);
        M(lcVar);
    }

    public final boolean n(int i) {
        if (this.k == i) {
            this.k = RecyclerView.UNDEFINED_DURATION;
            this.i.invalidate();
            U(i, LogFileManager.MAX_LOG_SIZE);
            return true;
        }
        return false;
    }

    public final boolean o(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = RecyclerView.UNDEFINED_DURATION;
        O(i, false);
        U(i, 8);
        return true;
    }

    public final boolean p() {
        int i = this.l;
        return i != Integer.MIN_VALUE && J(i, 16, null);
    }

    public final AccessibilityEvent q(int i, int i2) {
        if (i != -1) {
            return r(i, i2);
        }
        return s(i2);
    }

    public final AccessibilityEvent r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        lc H = H(i);
        obtain.getText().add(H.w());
        obtain.setContentDescription(H.r());
        obtain.setScrollable(H.J());
        obtain.setPassword(H.I());
        obtain.setEnabled(H.E());
        obtain.setChecked(H.C());
        L(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException(C0059ao.a(8876));
        }
        obtain.setClassName(H.p());
        nc.c(obtain, this.i, i);
        obtain.setPackageName(this.i.getContext().getPackageName());
        return obtain;
    }

    public final AccessibilityEvent s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final lc t(int i) {
        lc N = lc.N();
        N.g0(true);
        N.i0(true);
        N.a0(C0059ao.a(8877));
        Rect rect = n;
        N.W(rect);
        N.X(rect);
        N.q0(this.i);
        N(i, N);
        if (N.w() == null && N.r() == null) {
            throw new RuntimeException(C0059ao.a(8878));
        }
        N.m(this.e);
        if (!this.e.equals(rect)) {
            int k = N.k();
            if ((k & 64) == 0) {
                if ((k & Barcode.ITF) == 0) {
                    N.o0(this.i.getContext().getPackageName());
                    N.y0(this.i, i);
                    if (this.k == i) {
                        N.U(true);
                        N.a(Barcode.ITF);
                    } else {
                        N.U(false);
                        N.a(64);
                    }
                    boolean z = this.l == i;
                    if (z) {
                        N.a(2);
                    } else if (N.F()) {
                        N.a(1);
                    }
                    N.j0(z);
                    this.i.getLocationOnScreen(this.g);
                    N.n(this.d);
                    if (this.d.equals(rect)) {
                        N.m(this.d);
                        if (N.b != -1) {
                            lc N2 = lc.N();
                            for (int i2 = N.b; i2 != -1; i2 = N2.b) {
                                N2.r0(this.i, -1);
                                N2.W(n);
                                N(i2, N2);
                                N2.m(this.e);
                                Rect rect2 = this.d;
                                Rect rect3 = this.e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            N2.R();
                        }
                        this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    }
                    if (this.i.getLocalVisibleRect(this.f)) {
                        this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                        if (this.d.intersect(this.f)) {
                            N.X(this.d);
                            if (E(this.d)) {
                                N.C0(true);
                            }
                        }
                    }
                    return N;
                }
                throw new RuntimeException(C0059ao.a(8879));
            }
            throw new RuntimeException(C0059ao.a(8880));
        }
        throw new RuntimeException(C0059ao.a(8881));
    }

    public final lc u() {
        lc O = lc.O(this.i);
        ac.d0(this.i, O);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (O.o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException(C0059ao.a(8882));
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            O.d(this.i, ((Integer) arrayList.get(i)).intValue());
        }
        return O;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && this.m != Integer.MIN_VALUE) {
                    V(RecyclerView.UNDEFINED_DURATION);
                    return true;
                }
                return false;
            }
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            return B != Integer.MIN_VALUE;
        }
        return false;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int F = F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && G(F, null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            return false;
                        case 23:
                            break;
                        default:
                            return false;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    p();
                    return true;
                }
                return false;
            } else if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
                return false;
            }
        }
        return false;
    }

    public final int x() {
        return this.k;
    }

    public final v4<lc> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        v4<lc> v4Var = new v4<>();
        for (int i = 0; i < arrayList.size(); i++) {
            v4Var.i(i, t(i));
        }
        return v4Var;
    }

    public final void z(int i, Rect rect) {
        H(i).m(rect);
    }
}
