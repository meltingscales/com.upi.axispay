package defpackage;

import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: o5  reason: default package */
/* loaded from: classes.dex */
public class o5 {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r8 == 2) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r8 == 2) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x052f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.s5 r38, defpackage.z4 r39, int r40, int r41, defpackage.p5 r42) {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5.a(s5, z4, int, int, p5):void");
    }

    public static void b(s5 s5Var, z4 z4Var, ArrayList<r5> arrayList, int i) {
        p5[] p5VarArr;
        int i2;
        int i3;
        if (i == 0) {
            i3 = s5Var.F0;
            p5VarArr = s5Var.I0;
            i2 = 0;
        } else {
            int i4 = s5Var.G0;
            p5VarArr = s5Var.H0;
            i2 = 2;
            i3 = i4;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            p5 p5Var = p5VarArr[i5];
            p5Var.a();
            if (arrayList == null || (arrayList != null && arrayList.contains(p5Var.a))) {
                a(s5Var, z4Var, i, i2, p5Var);
            }
        }
    }
}
