package defpackage;

import java.io.Serializable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hi0  reason: default package */
/* loaded from: classes.dex */
public final class hi0<T> implements Serializable {
    public static final a b = new a(null);

    /* compiled from: AxisPay */
    /* renamed from: hi0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: hi0$b */
    /* loaded from: classes.dex */
    public static final class b implements Serializable {
        public final Throwable b;

        public b(Throwable th) {
            yl0.e(th, C0059ao.a(2774));
            this.b = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && yl0.a(this.b, ((b) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return C0059ao.a(2775) + this.b + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }
}
