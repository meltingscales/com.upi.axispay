package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: q70  reason: default package */
/* loaded from: classes.dex */
public final class q70 implements p70 {
    public final bl a;
    public final ok<o70> b;
    public final hl c;

    /* compiled from: AxisPay */
    /* renamed from: q70$a */
    /* loaded from: classes.dex */
    public class a extends ok<o70> {
        public a(q70 q70Var, bl blVar) {
            super(blVar);
        }

        @Override // defpackage.hl
        public String d() {
            return C0059ao.a(7901);
        }

        @Override // defpackage.ok
        /* renamed from: i */
        public void g(fm fmVar, o70 o70Var) {
            if (o70Var.c() == null) {
                fmVar.q(1);
            } else {
                fmVar.a(1, o70Var.c());
            }
            if (o70Var.a() == null) {
                fmVar.q(2);
            } else {
                fmVar.a(2, o70Var.a());
            }
            if (o70Var.b() == null) {
                fmVar.q(3);
            } else {
                fmVar.a(3, o70Var.b());
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: q70$b */
    /* loaded from: classes.dex */
    public class b extends ok<o70> {
        public b(q70 q70Var, bl blVar) {
            super(blVar);
        }

        @Override // defpackage.hl
        public String d() {
            return C0059ao.a(7921);
        }

        @Override // defpackage.ok
        /* renamed from: i */
        public void g(fm fmVar, o70 o70Var) {
            if (o70Var.c() == null) {
                fmVar.q(1);
            } else {
                fmVar.a(1, o70Var.c());
            }
            if (o70Var.a() == null) {
                fmVar.q(2);
            } else {
                fmVar.a(2, o70Var.a());
            }
            if (o70Var.b() == null) {
                fmVar.q(3);
            } else {
                fmVar.a(3, o70Var.b());
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: q70$c */
    /* loaded from: classes.dex */
    public class c extends nk<o70> {
        public c(q70 q70Var, bl blVar) {
            super(blVar);
        }

        @Override // defpackage.hl
        public String d() {
            return C0059ao.a(7773);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: q70$d */
    /* loaded from: classes.dex */
    public class d extends hl {
        public d(q70 q70Var, bl blVar) {
            super(blVar);
        }

        @Override // defpackage.hl
        public String d() {
            return C0059ao.a(7870);
        }
    }

    public q70(bl blVar) {
        this.a = blVar;
        this.b = new a(this, blVar);
        new b(this, blVar);
        new c(this, blVar);
        this.c = new d(this, blVar);
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    @Override // defpackage.p70
    public long a(o70 o70Var) {
        this.a.b();
        this.a.c();
        try {
            long h = this.b.h(o70Var);
            this.a.A();
            return h;
        } finally {
            this.a.g();
        }
    }

    @Override // defpackage.p70
    public List<o70> b() {
        el k = el.k(C0059ao.a(10723), 0);
        this.a.b();
        Cursor b2 = nl.b(this.a, k, false, null);
        try {
            int e = ml.e(b2, C0059ao.a(10724));
            int e2 = ml.e(b2, C0059ao.a(10725));
            int e3 = ml.e(b2, C0059ao.a(10726));
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(new o70(b2.isNull(e) ? null : b2.getString(e), b2.isNull(e2) ? null : b2.getString(e2), b2.isNull(e3) ? null : b2.getString(e3)));
            }
            return arrayList;
        } finally {
            b2.close();
            k.release();
        }
    }

    @Override // defpackage.p70
    public int c() {
        this.a.b();
        fm a2 = this.c.a();
        this.a.c();
        try {
            int l = a2.l();
            this.a.A();
            return l;
        } finally {
            this.a.g();
            this.c.f(a2);
        }
    }
}
