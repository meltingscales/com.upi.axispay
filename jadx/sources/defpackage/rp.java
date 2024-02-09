package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.lp;

/* compiled from: AxisPay */
@AutoValue
/* renamed from: rp  reason: default package */
/* loaded from: classes.dex */
public abstract class rp {

    /* compiled from: AxisPay */
    @AutoValue.Builder
    /* renamed from: rp$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract rp a();

        public abstract a b(hp hpVar);

        public abstract a c(b bVar);
    }

    /* compiled from: AxisPay */
    /* renamed from: rp$b */
    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        b(int i) {
        }
    }

    public static a a() {
        return new lp.b();
    }

    public abstract hp b();

    public abstract b c();
}
