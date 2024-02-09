package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: rm  reason: default package */
/* loaded from: classes.dex */
public class rm extends bn {
    public static final String[] N = {C0059ao.a(1150), C0059ao.a(1151), C0059ao.a(1152), C0059ao.a(1153), C0059ao.a(1154)};
    public static final Property<Drawable, PointF> O = new b(PointF.class, C0059ao.a(1155));
    public static final Property<k, PointF> P;
    public static final Property<k, PointF> Q;
    public static final Property<View, PointF> R;
    public static final Property<View, PointF> S;
    public static final Property<View, PointF> T;
    public static zm U;
    public int[] K = new int[2];
    public boolean L = false;
    public boolean M = false;

    /* compiled from: AxisPay */
    /* renamed from: rm$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ BitmapDrawable b;
        public final /* synthetic */ View c;
        public final /* synthetic */ float d;

        public a(rm rmVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.a = viewGroup;
            this.b = bitmapDrawable;
            this.c = view;
            this.d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            rn.b(this.a).d(this.b);
            rn.g(this.c, this.d);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rm$b */
    /* loaded from: classes.dex */
    public static class b extends Property<Drawable, PointF> {
        public Rect a;

        public b(Class cls, String str) {
            super(cls, str);
            this.a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rm$c */
    /* loaded from: classes.dex */
    public static class c extends Property<k, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rm$d */
    /* loaded from: classes.dex */
    public static class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rm$e */
    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            rn.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rm$f */
    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            rn.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rm$g */
    /* loaded from: classes.dex */
    public static class g extends Property<View, PointF> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            rn.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rm$h */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ k a;
        private k mViewBounds;

        public h(rm rmVar, k kVar) {
            this.a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rm$i */
    /* loaded from: classes.dex */
    public class i extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Rect c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        public i(rm rmVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.b = view;
            this.c = rect;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            ac.x0(this.b, this.c);
            rn.f(this.b, this.d, this.e, this.f, this.g);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rm$j */
    /* loaded from: classes.dex */
    public class j extends cn {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public j(rm rmVar, ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // defpackage.cn, defpackage.bn.f
        public void b(bn bnVar) {
            mn.c(this.b, false);
            this.a = true;
        }

        @Override // defpackage.cn, defpackage.bn.f
        public void c(bn bnVar) {
            mn.c(this.b, false);
        }

        @Override // defpackage.cn, defpackage.bn.f
        public void d(bn bnVar) {
            mn.c(this.b, true);
        }

        @Override // defpackage.bn.f
        public void e(bn bnVar) {
            if (!this.a) {
                mn.c(this.b, false);
            }
            bnVar.O(this);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rm$k */
    /* loaded from: classes.dex */
    public static class k {
        public int a;
        public int b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;

        public k(View view) {
            this.e = view;
        }

        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        public final void b() {
            rn.f(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        public void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    static {
        String a2 = C0059ao.a(1156);
        P = new c(PointF.class, a2);
        String a3 = C0059ao.a(1157);
        Q = new d(PointF.class, a3);
        R = new e(PointF.class, a3);
        S = new f(PointF.class, a2);
        T = new g(PointF.class, C0059ao.a(1158));
        U = new zm();
    }

    @Override // defpackage.bn
    public String[] C() {
        return N;
    }

    public final void b0(hn hnVar) {
        View view = hnVar.b;
        if (!ac.V(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hnVar.a.put(C0059ao.a(1159), new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hnVar.a.put(C0059ao.a(1160), hnVar.b.getParent());
        if (this.M) {
            hnVar.b.getLocationInWindow(this.K);
            hnVar.a.put(C0059ao.a(1161), Integer.valueOf(this.K[0]));
            hnVar.a.put(C0059ao.a(1162), Integer.valueOf(this.K[1]));
        }
        if (this.L) {
            hnVar.a.put(C0059ao.a(1163), ac.u(view));
        }
    }

    public final boolean c0(View view, View view2) {
        if (this.M) {
            hn s = s(view, true);
            if (s == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == s.b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.bn
    public void f(hn hnVar) {
        b0(hnVar);
    }

    @Override // defpackage.bn
    public void i(hn hnVar) {
        b0(hnVar);
    }

    @Override // defpackage.bn
    public Animator m(ViewGroup viewGroup, hn hnVar, hn hnVar2) {
        int i2;
        View view;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c2;
        if (hnVar == null || hnVar2 == null) {
            return null;
        }
        Map<String, Object> map = hnVar.a;
        Map<String, Object> map2 = hnVar2.a;
        String a2 = C0059ao.a(1164);
        ViewGroup viewGroup2 = (ViewGroup) map.get(a2);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(a2);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = hnVar2.b;
        if (c0(viewGroup2, viewGroup3)) {
            Map<String, Object> map3 = hnVar.a;
            String a3 = C0059ao.a(1165);
            Rect rect2 = (Rect) map3.get(a3);
            Rect rect3 = (Rect) hnVar2.a.get(a3);
            int i4 = rect2.left;
            int i5 = rect3.left;
            int i6 = rect2.top;
            int i7 = rect3.top;
            int i8 = rect2.right;
            int i9 = rect3.right;
            int i10 = rect2.bottom;
            int i11 = rect3.bottom;
            int i12 = i8 - i4;
            int i13 = i10 - i6;
            int i14 = i9 - i5;
            int i15 = i11 - i7;
            Map<String, Object> map4 = hnVar.a;
            String a4 = C0059ao.a(1166);
            Rect rect4 = (Rect) map4.get(a4);
            Rect rect5 = (Rect) hnVar2.a.get(a4);
            if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                i2 = 0;
            } else {
                i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
                if (i8 != i9 || i10 != i11) {
                    i2++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i2++;
            }
            if (i2 > 0) {
                if (!this.L) {
                    view = view2;
                    rn.f(view, i4, i6, i8, i10);
                    if (i2 == 2) {
                        if (i12 == i14 && i13 == i15) {
                            c2 = um.a(view, T, u().a(i4, i6, i5, i7));
                        } else {
                            k kVar = new k(view);
                            ObjectAnimator a5 = um.a(kVar, P, u().a(i4, i6, i5, i7));
                            ObjectAnimator a6 = um.a(kVar, Q, u().a(i8, i10, i9, i11));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a5, a6);
                            animatorSet.addListener(new h(this, kVar));
                            c2 = animatorSet;
                        }
                    } else if (i4 == i5 && i6 == i7) {
                        c2 = um.a(view, R, u().a(i8, i10, i9, i11));
                    } else {
                        c2 = um.a(view, S, u().a(i4, i6, i5, i7));
                    }
                } else {
                    view = view2;
                    rn.f(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                    ObjectAnimator a7 = (i4 == i5 && i6 == i7) ? null : um.a(view, T, u().a(i4, i6, i5, i7));
                    if (rect4 == null) {
                        i3 = 0;
                        rect = new Rect(0, 0, i12, i13);
                    } else {
                        i3 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
                    if (rect.equals(rect6)) {
                        objectAnimator = null;
                    } else {
                        ac.x0(view, rect);
                        zm zmVar = U;
                        Object[] objArr = new Object[2];
                        objArr[i3] = rect;
                        objArr[1] = rect6;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, C0059ao.a(1167), zmVar, objArr);
                        ofObject.addListener(new i(this, view, rect5, i5, i7, i9, i11));
                        objectAnimator = ofObject;
                    }
                    c2 = gn.c(a7, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    mn.c(viewGroup4, true);
                    a(new j(this, viewGroup4));
                }
                return c2;
            }
            return null;
        }
        Map<String, Object> map5 = hnVar.a;
        String a8 = C0059ao.a(1168);
        int intValue = ((Integer) map5.get(a8)).intValue();
        Map<String, Object> map6 = hnVar.a;
        String a9 = C0059ao.a(1169);
        int intValue2 = ((Integer) map6.get(a9)).intValue();
        int intValue3 = ((Integer) hnVar2.a.get(a8)).intValue();
        int intValue4 = ((Integer) hnVar2.a.get(a9)).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.K);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c3 = rn.c(view2);
        rn.g(view2, 0.0f);
        rn.b(viewGroup).b(bitmapDrawable);
        vm u = u();
        int[] iArr = this.K;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, xm.a(O, u.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
        ofPropertyValuesHolder.addListener(new a(this, viewGroup, bitmapDrawable, view2, c3));
        return ofPropertyValuesHolder;
    }
}
