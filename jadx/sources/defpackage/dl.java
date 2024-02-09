package defpackage;

import android.database.Cursor;
import defpackage.cm;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: dl  reason: default package */
/* loaded from: classes.dex */
public class dl extends cm.a {
    public lk b;
    public final a c;
    public final String d;
    public final String e;

    /* compiled from: AxisPay */
    /* renamed from: dl$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public abstract void a(bm bmVar);

        public abstract void b(bm bmVar);

        public abstract void c(bm bmVar);

        public abstract void d(bm bmVar);

        public abstract void e(bm bmVar);

        public abstract void f(bm bmVar);

        public abstract b g(bm bmVar);
    }

    /* compiled from: AxisPay */
    /* renamed from: dl$b */
    /* loaded from: classes.dex */
    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public dl(lk lkVar, a aVar, String str, String str2) {
        super(aVar.a);
        this.b = lkVar;
        this.c = aVar;
        this.d = str;
        this.e = str2;
    }

    public static boolean j(bm bmVar) {
        Cursor N = bmVar.N(C0059ao.a(4013));
        try {
            boolean z = false;
            if (N.moveToFirst()) {
                if (N.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            N.close();
        }
    }

    public static boolean k(bm bmVar) {
        Cursor N = bmVar.N(C0059ao.a(4014));
        try {
            boolean z = false;
            if (N.moveToFirst()) {
                if (N.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            N.close();
        }
    }

    @Override // defpackage.cm.a
    public void b(bm bmVar) {
        super.b(bmVar);
    }

    @Override // defpackage.cm.a
    public void d(bm bmVar) {
        boolean j = j(bmVar);
        this.c.a(bmVar);
        if (!j) {
            b g = this.c.g(bmVar);
            if (!g.a) {
                throw new IllegalStateException(C0059ao.a(4015) + g.b);
            }
        }
        l(bmVar);
        this.c.c(bmVar);
    }

    @Override // defpackage.cm.a
    public void e(bm bmVar, int i, int i2) {
        g(bmVar, i, i2);
    }

    @Override // defpackage.cm.a
    public void f(bm bmVar) {
        super.f(bmVar);
        h(bmVar);
        this.c.d(bmVar);
        this.b = null;
    }

    @Override // defpackage.cm.a
    public void g(bm bmVar, int i, int i2) {
        boolean z;
        List<kl> c;
        lk lkVar = this.b;
        if (lkVar == null || (c = lkVar.d.c(i, i2)) == null) {
            z = false;
        } else {
            this.c.f(bmVar);
            for (kl klVar : c) {
                klVar.a(bmVar);
            }
            b g = this.c.g(bmVar);
            if (g.a) {
                this.c.e(bmVar);
                l(bmVar);
                z = true;
            } else {
                throw new IllegalStateException(C0059ao.a(4016) + g.b);
            }
        }
        if (z) {
            return;
        }
        lk lkVar2 = this.b;
        if (lkVar2 != null && !lkVar2.a(i, i2)) {
            this.c.b(bmVar);
            this.c.a(bmVar);
            return;
        }
        throw new IllegalStateException(C0059ao.a(4017) + i + C0059ao.a(4018) + i2 + C0059ao.a(4019));
    }

    public final void h(bm bmVar) {
        if (k(bmVar)) {
            Cursor p = bmVar.p(new vl(C0059ao.a(4020)));
            try {
                String string = p.moveToFirst() ? p.getString(0) : null;
                p.close();
                if (!this.d.equals(string) && !this.e.equals(string)) {
                    throw new IllegalStateException(C0059ao.a(4021));
                }
                return;
            } catch (Throwable th) {
                p.close();
                throw th;
            }
        }
        b g = this.c.g(bmVar);
        if (g.a) {
            this.c.e(bmVar);
            l(bmVar);
            return;
        }
        throw new IllegalStateException(C0059ao.a(4022) + g.b);
    }

    public final void i(bm bmVar) {
        bmVar.i(C0059ao.a(4023));
    }

    public final void l(bm bmVar) {
        i(bmVar);
        bmVar.i(cl.a(this.d));
    }
}
