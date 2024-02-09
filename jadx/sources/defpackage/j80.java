package defpackage;

/* compiled from: AxisPay */
/* renamed from: j80  reason: default package */
/* loaded from: classes.dex */
public enum j80 {
    NO_CACHE(1),
    NO_STORE(2);
    
    public final int b;

    j80(int i) {
        this.b = i;
    }

    public static boolean a(int i) {
        return (i & NO_CACHE.b) == 0;
    }

    public static boolean b(int i) {
        return (i & NO_STORE.b) == 0;
    }
}
