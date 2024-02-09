package defpackage;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: l70  reason: default package */
/* loaded from: classes.dex */
public final class l70 implements k70 {
    public final bl a;
    public final ok<j70> b;
    public final hl c;

    /* compiled from: AxisPay */
    /* renamed from: l70$a */
    /* loaded from: classes.dex */
    public class a extends ok<j70> {
        public a(l70 l70Var, bl blVar) {
            super(blVar);
        }

        @Override // defpackage.hl
        public String d() {
            return C0059ao.a(829);
        }

        @Override // defpackage.ok
        /* renamed from: i */
        public void g(fm fmVar, j70 j70Var) {
            if (j70Var.a() == null) {
                fmVar.q(1);
            } else {
                fmVar.a(1, j70Var.a());
            }
            if (j70Var.b() == null) {
                fmVar.q(2);
            } else {
                fmVar.a(2, j70Var.b());
            }
            fmVar.C(3, j70Var.c() ? 1L : 0L);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l70$b */
    /* loaded from: classes.dex */
    public class b extends ok<j70> {
        public b(l70 l70Var, bl blVar) {
            super(blVar);
        }

        @Override // defpackage.hl
        public String d() {
            return C0059ao.a(834);
        }

        @Override // defpackage.ok
        /* renamed from: i */
        public void g(fm fmVar, j70 j70Var) {
            if (j70Var.a() == null) {
                fmVar.q(1);
            } else {
                fmVar.a(1, j70Var.a());
            }
            if (j70Var.b() == null) {
                fmVar.q(2);
            } else {
                fmVar.a(2, j70Var.b());
            }
            fmVar.C(3, j70Var.c() ? 1L : 0L);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l70$c */
    /* loaded from: classes.dex */
    public class c extends nk<j70> {
        public c(l70 l70Var, bl blVar) {
            super(blVar);
        }

        @Override // defpackage.hl
        public String d() {
            return C0059ao.a(717);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l70$d */
    /* loaded from: classes.dex */
    public class d extends hl {
        public d(l70 l70Var, bl blVar) {
            super(blVar);
        }

        @Override // defpackage.hl
        public String d() {
            return C0059ao.a(753);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l70$e */
    /* loaded from: classes.dex */
    public class e extends hl {
        public e(l70 l70Var, bl blVar) {
            super(blVar);
        }

        @Override // defpackage.hl
        public String d() {
            return C0059ao.a(702);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l70$f */
    /* loaded from: classes.dex */
    public class f extends hl {
        public f(l70 l70Var, bl blVar) {
            super(blVar);
        }

        @Override // defpackage.hl
        public String d() {
            return C0059ao.a(703);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l70$g */
    /* loaded from: classes.dex */
    public class g extends hl {
        public g(l70 l70Var, bl blVar) {
            super(blVar);
        }

        @Override // defpackage.hl
        public String d() {
            return C0059ao.a(705);
        }
    }

    public l70(bl blVar) {
        this.a = blVar;
        this.b = new a(this, blVar);
        new b(this, blVar);
        new c(this, blVar);
        new d(this, blVar);
        new e(this, blVar);
        this.c = new f(this, blVar);
        new g(this, blVar);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    @Override // defpackage.k70
    public int a(String str) {
        this.a.b();
        fm a2 = this.c.a();
        if (str == null) {
            a2.q(1);
        } else {
            a2.a(1, str);
        }
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

    @Override // defpackage.k70
    public long b(j70 j70Var) {
        this.a.b();
        this.a.c();
        try {
            long h = this.b.h(j70Var);
            this.a.A();
            return h;
        } finally {
            this.a.g();
        }
    }

    @Override // defpackage.k70
    public int c(String str) {
        el k = el.k(C0059ao.a(8855), 1);
        if (str == null) {
            k.q(1);
        } else {
            k.a(1, str);
        }
        this.a.b();
        Cursor b2 = nl.b(this.a, k, false, null);
        try {
            return b2.moveToFirst() ? b2.getInt(0) : 0;
        } finally {
            b2.close();
            k.release();
        }
    }

    @Override // defpackage.k70
    public j70 d(String str) {
        boolean z = true;
        el k = el.k(C0059ao.a(8856), 1);
        if (str == null) {
            k.q(1);
        } else {
            k.a(1, str);
        }
        this.a.b();
        j70 j70Var = null;
        String string = null;
        Cursor b2 = nl.b(this.a, k, false, null);
        try {
            int e2 = ml.e(b2, C0059ao.a(8857));
            int e3 = ml.e(b2, C0059ao.a(8858));
            int e4 = ml.e(b2, C0059ao.a(8859));
            if (b2.moveToFirst()) {
                String string2 = b2.isNull(e2) ? null : b2.getString(e2);
                if (!b2.isNull(e3)) {
                    string = b2.getString(e3);
                }
                if (b2.getInt(e4) == 0) {
                    z = false;
                }
                j70Var = new j70(string2, string, z);
            }
            return j70Var;
        } finally {
            b2.close();
            k.release();
        }
    }
}
