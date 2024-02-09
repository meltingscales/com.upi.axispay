package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import defpackage.b9;
import defpackage.oa;
import defpackage.y8;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@SuppressLint({"NewApi"})
/* renamed from: g9  reason: default package */
/* loaded from: classes.dex */
public class g9 {
    public static final m9 a;
    public static final s4<String, Typeface> b;

    /* compiled from: AxisPay */
    /* renamed from: g9$a */
    /* loaded from: classes.dex */
    public static class a extends oa.c {
        public b9.c a;

        public a(b9.c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.oa.c
        public void a(int i) {
            b9.c cVar = this.a;
            if (cVar != null) {
                cVar.d(i);
            }
        }

        @Override // defpackage.oa.c
        public void b(Typeface typeface) {
            b9.c cVar = this.a;
            if (cVar != null) {
                cVar.e(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new l9();
        } else if (i >= 28) {
            a = new k9();
        } else if (i >= 26) {
            a = new j9();
        } else if (i >= 24 && i9.m()) {
            a = new i9();
        } else if (i >= 21) {
            a = new h9();
        } else {
            a = new m9();
        }
        b = new s4<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        Typeface g;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (g = g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : g;
        }
        throw new IllegalArgumentException(C0059ao.a(5291));
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, oa.b[] bVarArr, int i) {
        return a.c(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface c(Context context, y8.a aVar, Resources resources, int i, int i2, b9.c cVar, Handler handler, boolean z) {
        Typeface b2;
        if (aVar instanceof y8.d) {
            y8.d dVar = (y8.d) aVar;
            Typeface h = h(dVar.c());
            if (h != null) {
                if (cVar != null) {
                    cVar.b(h, handler);
                }
                return h;
            }
            boolean z2 = !z ? cVar != null : dVar.a() != 0;
            int d = z ? dVar.d() : -1;
            b2 = oa.a(context, dVar.b(), i2, z2, d, b9.c.c(handler), new a(cVar));
        } else {
            b2 = a.b(context, (y8.b) aVar, resources, i2);
            if (cVar != null) {
                if (b2 != null) {
                    cVar.b(b2, handler);
                } else {
                    cVar.a(-3, handler);
                }
            }
        }
        if (b2 != null) {
            b.put(e(resources, i, i2), b2);
        }
        return b2;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e = a.e(context, resources, i, str, i2);
        if (e != null) {
            b.put(e(resources, i, i2), e);
        }
        return e;
    }

    public static String e(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        String a2 = C0059ao.a(5292);
        sb.append(a2);
        sb.append(i);
        sb.append(a2);
        sb.append(i2);
        return sb.toString();
    }

    public static Typeface f(Resources resources, int i, int i2) {
        return b.get(e(resources, i, i2));
    }

    public static Typeface g(Context context, Typeface typeface, int i) {
        m9 m9Var = a;
        y8.b i2 = m9Var.i(typeface);
        if (i2 == null) {
            return null;
        }
        return m9Var.b(context, i2, context.getResources(), i);
    }

    public static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
