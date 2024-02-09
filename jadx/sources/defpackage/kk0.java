package defpackage;

import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: kk0  reason: default package */
/* loaded from: classes.dex */
public class kk0 {

    /* compiled from: AxisPay */
    /* renamed from: kk0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final Method a;

        /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[EDGE_INSN: B:19:0x0049->B:13:0x0049 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                r2 = 10847(0x2a5f, float:1.52E-41)
                java.lang.String r2 = myunmn.C0059ao.a(r2)
                defpackage.yl0.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L13:
                if (r4 >= r2) goto L48
                r5 = r1[r4]
                int r4 = r4 + 1
                java.lang.String r6 = r5.getName()
                r7 = 10848(0x2a60, float:1.5201E-41)
                java.lang.String r7 = myunmn.C0059ao.a(r7)
                boolean r6 = defpackage.yl0.a(r6, r7)
                if (r6 == 0) goto L44
                java.lang.Class[] r6 = r5.getParameterTypes()
                r7 = 10849(0x2a61, float:1.5203E-41)
                java.lang.String r7 = myunmn.C0059ao.a(r7)
                defpackage.yl0.d(r6, r7)
                java.lang.Object r6 = defpackage.xi0.r(r6)
                boolean r6 = defpackage.yl0.a(r6, r0)
                if (r6 == 0) goto L44
                r6 = 1
                goto L45
            L44:
                r6 = r3
            L45:
                if (r6 == 0) goto L13
                goto L49
            L48:
                r5 = 0
            L49:
                defpackage.kk0.a.a = r5
                int r0 = r1.length
            L4c:
                if (r3 >= r0) goto L63
                r2 = r1[r3]
                int r3 = r3 + 1
                java.lang.String r2 = r2.getName()
                r4 = 10850(0x2a62, float:1.5204E-41)
                java.lang.String r4 = myunmn.C0059ao.a(r4)
                boolean r2 = defpackage.yl0.a(r2, r4)
                if (r2 == 0) goto L4c
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kk0.a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        yl0.e(th, C0059ao.a(12884));
        yl0.e(th2, C0059ao.a(12885));
        Method method = a.a;
        if (method == null) {
            return;
        }
        method.invoke(th, th2);
    }
}
