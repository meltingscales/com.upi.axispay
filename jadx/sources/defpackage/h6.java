package defpackage;

import defpackage.r5;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: h6  reason: default package */
/* loaded from: classes.dex */
public class h6 {
    public static n6 a(r5 r5Var, int i, ArrayList<n6> arrayList, n6 n6Var) {
        int i2;
        int p1;
        if (i == 0) {
            i2 = r5Var.s0;
        } else {
            i2 = r5Var.t0;
        }
        if (i2 != -1 && (n6Var == null || i2 != n6Var.b)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                n6 n6Var2 = arrayList.get(i3);
                if (n6Var2.c() == i2) {
                    if (n6Var != null) {
                        n6Var.g(i, n6Var2);
                        arrayList.remove(n6Var);
                    }
                    n6Var = n6Var2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return n6Var;
        }
        if (n6Var == null) {
            if ((r5Var instanceof v5) && (p1 = ((v5) r5Var).p1(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    n6 n6Var3 = arrayList.get(i4);
                    if (n6Var3.c() == p1) {
                        n6Var = n6Var3;
                        break;
                    }
                    i4++;
                }
            }
            if (n6Var == null) {
                n6Var = new n6(i);
            }
            arrayList.add(n6Var);
        }
        if (n6Var.a(r5Var)) {
            if (r5Var instanceof t5) {
                t5 t5Var = (t5) r5Var;
                t5Var.o1().b(t5Var.p1() == 0 ? 1 : 0, arrayList, n6Var);
            }
            if (i == 0) {
                r5Var.s0 = n6Var.c();
                r5Var.L.b(i, arrayList, n6Var);
                r5Var.N.b(i, arrayList, n6Var);
            } else {
                r5Var.t0 = n6Var.c();
                r5Var.M.b(i, arrayList, n6Var);
                r5Var.P.b(i, arrayList, n6Var);
                r5Var.O.b(i, arrayList, n6Var);
            }
            r5Var.S.b(i, arrayList, n6Var);
        }
        return n6Var;
    }

    public static n6 b(ArrayList<n6> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            n6 n6Var = arrayList.get(i2);
            if (i == n6Var.b) {
                return n6Var;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0399 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(defpackage.s5 r16, defpackage.a6.b r17) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.c(s5, a6$b):boolean");
    }

    public static boolean d(r5.b bVar, r5.b bVar2, r5.b bVar3, r5.b bVar4) {
        r5.b bVar5;
        r5.b bVar6;
        r5.b bVar7 = r5.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = r5.b.WRAP_CONTENT) || (bVar3 == r5.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = r5.b.WRAP_CONTENT) || (bVar4 == r5.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
