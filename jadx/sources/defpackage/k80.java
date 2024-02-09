package defpackage;

/* compiled from: AxisPay */
/* renamed from: k80  reason: default package */
/* loaded from: classes.dex */
public enum k80 {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    public final int b;

    k80(int i) {
        this.b = i;
    }

    public static boolean a(int i) {
        return (i & OFFLINE.b) != 0;
    }

    public static boolean b(int i) {
        return (i & NO_CACHE.b) == 0;
    }

    public static boolean c(int i) {
        return (i & NO_STORE.b) == 0;
    }
}
