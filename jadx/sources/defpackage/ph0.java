package defpackage;

import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ph0  reason: default package */
/* loaded from: classes.dex */
public final class ph0 {
    public static ph0 f;
    public final List<nh0> a;
    public final List<nh0> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public static final c h = new c(null);
    public static final ci0 g = di0.b(b.b);

    /* compiled from: AxisPay */
    /* renamed from: ph0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final List<nh0> a = new ArrayList();
        public boolean b = true;
        public boolean c = true;
        public boolean d;

        public final a a(nh0 nh0Var) {
            yl0.f(nh0Var, C0059ao.a(14136));
            this.a.add(nh0Var);
            return this;
        }

        public final ph0 b() {
            return new ph0(ij0.I(this.a), this.b, this.c, this.d, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ph0$b */
    /* loaded from: classes.dex */
    public static final class b extends zl0 implements sk0<uh0> {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // defpackage.sk0
        /* renamed from: b */
        public final uh0 invoke() {
            return new uh0();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ph0$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static final /* synthetic */ an0[] a;

        static {
            fm0 fm0Var = new fm0(km0.a(c.class), C0059ao.a(14120), C0059ao.a(14121));
            km0.d(fm0Var);
            a = new an0[]{fm0Var};
        }

        public c() {
        }

        public final a a() {
            return new a();
        }

        public final ph0 b() {
            ph0 ph0Var = ph0.f;
            if (ph0Var != null) {
                return ph0Var;
            }
            ph0 b = a().b();
            ph0.f = b;
            return b;
        }

        public final void c(ph0 ph0Var) {
            ph0.f = ph0Var;
        }

        public /* synthetic */ c(vl0 vl0Var) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ph0(List<? extends nh0> list, boolean z, boolean z2, boolean z3) {
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.a = ij0.K(ij0.D(list, new rh0()));
    }

    public static final a c() {
        return h.a();
    }

    public static final void e(ph0 ph0Var) {
        h.c(ph0Var);
    }

    public final mh0 d(lh0 lh0Var) {
        yl0.f(lh0Var, C0059ao.a(13275));
        return new sh0(this.a, 0, lh0Var).a(lh0Var);
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.c;
    }

    public final boolean h() {
        return this.e;
    }

    public /* synthetic */ ph0(List list, boolean z, boolean z2, boolean z3, vl0 vl0Var) {
        this(list, z, z2, z3);
    }
}
