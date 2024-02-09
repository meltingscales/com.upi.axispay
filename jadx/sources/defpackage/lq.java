package defpackage;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import defpackage.aq;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@AutoValue
/* renamed from: lq  reason: default package */
/* loaded from: classes.dex */
public abstract class lq {

    /* compiled from: AxisPay */
    @AutoValue.Builder
    /* renamed from: lq$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract lq a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(xo xoVar);
    }

    public static a a() {
        aq.b bVar = new aq.b();
        bVar.d(xo.DEFAULT);
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract xo d();

    public boolean e() {
        return c() != null;
    }

    public lq f(xo xoVar) {
        a a2 = a();
        a2.b(b());
        a2.d(xoVar);
        a2.c(c());
        return a2.a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? C0059ao.a(12510) : Base64.encodeToString(c(), 2);
        return String.format(C0059ao.a(12511), objArr);
    }
}
