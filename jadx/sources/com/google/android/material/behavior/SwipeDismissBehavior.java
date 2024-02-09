package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.kd;
import defpackage.lc;
import defpackage.oc;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public kd a;
    public c b;
    public boolean c;
    public boolean e;
    public float d = 0.0f;
    public int f = 2;
    public float g = 0.5f;
    public float h = 0.0f;
    public float i = 0.5f;
    public final kd.c j = new a();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends kd.c {
        public int a;
        public int b = -1;

        public a() {
        }

        @Override // defpackage.kd.c
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = ac.C(view) == 1;
            int i3 = SwipeDismissBehavior.this.f;
            if (i3 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return SwipeDismissBehavior.G(width, i, width2);
        }

        @Override // defpackage.kd.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // defpackage.kd.c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // defpackage.kd.c
        public void i(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // defpackage.kd.c
        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // defpackage.kd.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = this.a + (view.getWidth() * SwipeDismissBehavior.this.h);
            float width2 = this.a + (view.getWidth() * SwipeDismissBehavior.this.i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f), 1.0f));
            }
        }

        @Override // defpackage.kd.c
        public void l(View view, float f, float f2) {
            int i;
            boolean z;
            c cVar;
            this.b = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                int left = view.getLeft();
                int i2 = this.a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.M(i, view.getTop())) {
                ac.i0(view, new d(view, z));
            } else if (!z || (cVar = SwipeDismissBehavior.this.b) == null) {
            } else {
                cVar.a(view);
            }
        }

        @Override // defpackage.kd.c
        public boolean m(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.E(view);
        }

        public final boolean n(View view, float f) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0) {
                return Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.g);
            }
            boolean z = ac.C(view) == 1;
            int i2 = SwipeDismissBehavior.this.f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (i <= 0) {
                    return false;
                }
                return true;
            } else if (i2 == 1) {
                if (z) {
                    if (i <= 0) {
                        return false;
                    }
                } else if (f >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements oc {
        public b() {
        }

        @Override // defpackage.oc
        public boolean a(View view, oc.a aVar) {
            boolean z = false;
            if (SwipeDismissBehavior.this.E(view)) {
                boolean z2 = ac.C(view) == 1;
                int i = SwipeDismissBehavior.this.f;
                if ((i == 0 && z2) || (i == 1 && !z2)) {
                    z = true;
                }
                int width = view.getWidth();
                if (z) {
                    width = -width;
                }
                ac.a0(view, width);
                view.setAlpha(0.0f);
                c cVar = SwipeDismissBehavior.this.b;
                if (cVar != null) {
                    cVar.a(view);
                }
                return true;
            }
            return false;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface c {
        void a(View view);

        void b(int i);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public final View b;
        public final boolean c;

        public d(View view, boolean z) {
            this.b = view;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            kd kdVar = SwipeDismissBehavior.this.a;
            if (kdVar != null && kdVar.m(true)) {
                ac.i0(this.b, this);
            } else if (!this.c || (cVar = SwipeDismissBehavior.this.b) == null) {
            } else {
                cVar.a(this.b);
            }
        }
    }

    public static float F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static float I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        kd kdVar = this.a;
        if (kdVar != null) {
            kdVar.E(motionEvent);
            return true;
        }
        return false;
    }

    public boolean E(View view) {
        return true;
    }

    public final void H(ViewGroup viewGroup) {
        kd o;
        if (this.a == null) {
            if (this.e) {
                o = kd.n(viewGroup, this.d, this.j);
            } else {
                o = kd.o(viewGroup, this.j);
            }
            this.a = o;
        }
    }

    public void J(float f) {
        this.i = F(0.0f, f, 1.0f);
    }

    public void K(c cVar) {
        this.b = cVar;
    }

    public void L(float f) {
        this.h = F(0.0f, f, 1.0f);
    }

    public void M(int i) {
        this.f = i;
    }

    public final void N(View view) {
        ac.k0(view, CommonUtils.BYTES_IN_A_MEGABYTE);
        if (E(view)) {
            ac.m0(view, lc.a.l, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (z) {
            H(coordinatorLayout);
            return this.a.N(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean l = super.l(coordinatorLayout, v, i);
        if (ac.A(v) == 0) {
            ac.B0(v, 1);
            N(v);
        }
        return l;
    }
}
