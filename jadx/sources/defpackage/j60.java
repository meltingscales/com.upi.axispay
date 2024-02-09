package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: j60  reason: default package */
/* loaded from: classes.dex */
public class j60 {
    public static final String b = null;
    public static volatile j60 c;
    public k60 a;

    static {
        C0059ao.a(j60.class, 255);
    }

    public static j60 a() {
        if (c == null) {
            synchronized (j60.class) {
                if (c == null) {
                    c = new j60();
                }
            }
        }
        return c;
    }

    public synchronized void b(k60 k60Var) {
        if (k60Var != null) {
            if (this.a == null) {
                y60.a(C0059ao.a(15401), new Object[0]);
                new l60(k60Var);
                this.a = k60Var;
            } else {
                y60.e(C0059ao.a(15402), new Object[0]);
            }
        } else {
            throw new IllegalArgumentException(C0059ao.a(15403));
        }
    }
}
