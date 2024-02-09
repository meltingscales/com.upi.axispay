package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bn;
import defpackage.pm;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: yn  reason: default package */
/* loaded from: classes.dex */
public abstract class yn extends bn {
    public static final String[] L = {C0059ao.a(8022), C0059ao.a(8023)};
    public int K = 3;

    /* compiled from: AxisPay */
    /* renamed from: yn$a */
    /* loaded from: classes.dex */
    public class a extends cn {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        @Override // defpackage.cn, defpackage.bn.f
        public void c(bn bnVar) {
            mn.a(this.a).c(this.b);
        }

        @Override // defpackage.cn, defpackage.bn.f
        public void d(bn bnVar) {
            if (this.b.getParent() == null) {
                mn.a(this.a).a(this.b);
            } else {
                yn.this.cancel();
            }
        }

        @Override // defpackage.bn.f
        public void e(bn bnVar) {
            this.c.setTag(ym.save_overlay_view, null);
            mn.a(this.a).c(this.b);
            bnVar.O(this);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yn$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements bn.f, pm.a {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f = false;

        public b(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            g(true);
        }

        @Override // defpackage.bn.f
        public void a(bn bnVar) {
        }

        @Override // defpackage.bn.f
        public void b(bn bnVar) {
        }

        @Override // defpackage.bn.f
        public void c(bn bnVar) {
            g(false);
        }

        @Override // defpackage.bn.f
        public void d(bn bnVar) {
            g(true);
        }

        @Override // defpackage.bn.f
        public void e(bn bnVar) {
            f();
            bnVar.O(this);
        }

        public final void f() {
            if (!this.f) {
                rn.h(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            mn.c(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, defpackage.pm.a
        public void onAnimationPause(Animator animator) {
            if (this.f) {
                return;
            }
            rn.h(this.a, this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, defpackage.pm.a
        public void onAnimationResume(Animator animator) {
            if (this.f) {
                return;
            }
            rn.h(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yn$c */
    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    @Override // defpackage.bn
    public String[] C() {
        return L;
    }

    @Override // defpackage.bn
    public boolean E(hn hnVar, hn hnVar2) {
        if (hnVar == null && hnVar2 == null) {
            return false;
        }
        if (hnVar != null && hnVar2 != null) {
            Map<String, Object> map = hnVar2.a;
            String a2 = C0059ao.a(8024);
            if (map.containsKey(a2) != hnVar.a.containsKey(a2)) {
                return false;
            }
        }
        c c0 = c0(hnVar, hnVar2);
        if (c0.a) {
            return c0.c == 0 || c0.d == 0;
        }
        return false;
    }

    public final void b0(hn hnVar) {
        int visibility = hnVar.b.getVisibility();
        hnVar.a.put(C0059ao.a(8025), Integer.valueOf(visibility));
        hnVar.a.put(C0059ao.a(8026), hnVar.b.getParent());
        int[] iArr = new int[2];
        hnVar.b.getLocationOnScreen(iArr);
        hnVar.a.put(C0059ao.a(8027), iArr);
    }

    public final c c0(hn hnVar, hn hnVar2) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        String a2 = C0059ao.a(8028);
        String a3 = C0059ao.a(8029);
        if (hnVar != null && hnVar.a.containsKey(a3)) {
            cVar.c = ((Integer) hnVar.a.get(a3)).intValue();
            cVar.e = (ViewGroup) hnVar.a.get(a2);
        } else {
            cVar.c = -1;
            cVar.e = null;
        }
        if (hnVar2 != null && hnVar2.a.containsKey(a3)) {
            cVar.d = ((Integer) hnVar2.a.get(a3)).intValue();
            cVar.f = (ViewGroup) hnVar2.a.get(a2);
        } else {
            cVar.d = -1;
            cVar.f = null;
        }
        if (hnVar != null && hnVar2 != null) {
            int i = cVar.c;
            int i2 = cVar.d;
            if (i == i2 && cVar.e == cVar.f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.b = false;
                    cVar.a = true;
                } else if (i2 == 0) {
                    cVar.b = true;
                    cVar.a = true;
                }
            } else if (cVar.f == null) {
                cVar.b = false;
                cVar.a = true;
            } else if (cVar.e == null) {
                cVar.b = true;
                cVar.a = true;
            }
        } else if (hnVar == null && cVar.d == 0) {
            cVar.b = true;
            cVar.a = true;
        } else if (hnVar2 == null && cVar.c == 0) {
            cVar.b = false;
            cVar.a = true;
        }
        return cVar;
    }

    public abstract Animator d0(ViewGroup viewGroup, View view, hn hnVar, hn hnVar2);

    public Animator e0(ViewGroup viewGroup, hn hnVar, int i, hn hnVar2, int i2) {
        if ((this.K & 1) != 1 || hnVar2 == null) {
            return null;
        }
        if (hnVar == null) {
            View view = (View) hnVar2.b.getParent();
            if (c0(s(view, false), D(view, false)).a) {
                return null;
            }
        }
        return d0(viewGroup, hnVar2.b, hnVar, hnVar2);
    }

    @Override // defpackage.bn
    public void f(hn hnVar) {
        b0(hnVar);
    }

    public abstract Animator f0(ViewGroup viewGroup, View view, hn hnVar, hn hnVar2);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r17.w != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator g0(android.view.ViewGroup r18, defpackage.hn r19, int r20, defpackage.hn r21, int r22) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn.g0(android.view.ViewGroup, hn, int, hn, int):android.animation.Animator");
    }

    public void h0(int i) {
        if ((i & (-4)) == 0) {
            this.K = i;
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(8031));
    }

    @Override // defpackage.bn
    public void i(hn hnVar) {
        b0(hnVar);
    }

    @Override // defpackage.bn
    public Animator m(ViewGroup viewGroup, hn hnVar, hn hnVar2) {
        c c0 = c0(hnVar, hnVar2);
        if (c0.a) {
            if (c0.e == null && c0.f == null) {
                return null;
            }
            if (c0.b) {
                return e0(viewGroup, hnVar, c0.c, hnVar2, c0.d);
            }
            return g0(viewGroup, hnVar, c0.c, hnVar2, c0.d);
        }
        return null;
    }
}
