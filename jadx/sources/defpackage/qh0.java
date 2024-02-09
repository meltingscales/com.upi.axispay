package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qh0  reason: default package */
/* loaded from: classes.dex */
public final class qh0 extends ContextWrapper {
    public static final /* synthetic */ an0[] b;
    public static final a c;
    public final ci0 a;

    /* compiled from: AxisPay */
    /* renamed from: qh0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public final ContextWrapper a(Context context) {
            yl0.f(context, C0059ao.a(6716));
            return new qh0(context, null);
        }

        public /* synthetic */ a(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qh0$b */
    /* loaded from: classes.dex */
    public static final class b extends zl0 implements sk0<vh0> {
        public b() {
            super(0);
        }

        @Override // defpackage.sk0
        /* renamed from: b */
        public final vh0 invoke() {
            LayoutInflater from = LayoutInflater.from(qh0.this.getBaseContext());
            yl0.b(from, C0059ao.a(6702));
            return new vh0(from, qh0.this, false);
        }
    }

    static {
        fm0 fm0Var = new fm0(km0.a(qh0.class), C0059ao.a(8174), C0059ao.a(8175));
        km0.d(fm0Var);
        b = new an0[]{fm0Var};
        c = new a(null);
    }

    public qh0(Context context) {
        super(context);
        this.a = di0.a(ei0.NONE, new b());
    }

    public static final ContextWrapper b(Context context) {
        return c.a(context);
    }

    public final vh0 a() {
        ci0 ci0Var = this.a;
        an0 an0Var = b[0];
        return (vh0) ci0Var.getValue();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        yl0.f(str, C0059ao.a(8176));
        if (yl0.a(C0059ao.a(8177), str)) {
            return a();
        }
        return super.getSystemService(str);
    }

    public /* synthetic */ qh0(Context context, vl0 vl0Var) {
        this(context);
    }
}
