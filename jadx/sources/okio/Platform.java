package okio;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: okio.-Platform  reason: invalid class name */
/* loaded from: classes2.dex */
public final class Platform {
    public static final byte[] asUtf8ToByteArray(String str) {
        yl0.e(str, C0059ao.a(2910));
        byte[] bytes = str.getBytes(qn0.b);
        yl0.d(bytes, C0059ao.a(2911));
        return bytes;
    }

    /* renamed from: synchronized  reason: not valid java name */
    public static final <R> R m376synchronized(Object obj, sk0<? extends R> sk0Var) {
        R invoke;
        yl0.e(obj, C0059ao.a(2912));
        yl0.e(sk0Var, C0059ao.a(2913));
        synchronized (obj) {
            try {
                invoke = sk0Var.invoke();
                xl0.b(1);
            } catch (Throwable th) {
                xl0.b(1);
                xl0.a(1);
                throw th;
            }
        }
        xl0.a(1);
        return invoke;
    }

    public static final String toUtf8String(byte[] bArr) {
        yl0.e(bArr, C0059ao.a(2914));
        return new String(bArr, qn0.b);
    }
}
