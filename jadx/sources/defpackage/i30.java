package defpackage;

import com.google.android.gms.vision.barcode.Barcode;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: i30  reason: default package */
/* loaded from: classes.dex */
public final class i30 {
    public static final String[] b = {C0059ao.a(15544), C0059ao.a(15545), C0059ao.a(15546), C0059ao.a(15547), C0059ao.a(15548)};
    public static final int[][] c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    public static final int[][] d;
    public static final int[][] e;
    public final byte[] a;

    /* compiled from: AxisPay */
    /* renamed from: i30$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<k30> {
        public a(i30 i30Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(k30 k30Var, k30 k30Var2) {
            return k30Var.e() - k30Var2.e();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance(int.class, 5, Barcode.QR_CODE);
        d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            d[0][i] = (i - 65) + 2;
        }
        d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            d[1][i2] = (i2 - 97) + 2;
        }
        d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            d[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = d;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                d[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(int.class, 6, 6);
        e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = e;
        iArr7[0][4] = 0;
        iArr7[1][4] = 0;
        iArr7[1][0] = 28;
        iArr7[3][4] = 0;
        iArr7[2][4] = 0;
        iArr7[2][0] = 15;
    }

    public i30(byte[] bArr) {
        this.a = bArr;
    }

    public static Collection<k30> b(Iterable<k30> iterable) {
        LinkedList linkedList = new LinkedList();
        for (k30 k30Var : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k30 k30Var2 = (k30) it.next();
                if (k30Var2.g(k30Var)) {
                    z = false;
                    break;
                } else if (k30Var.g(k30Var2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(k30Var);
            }
        }
        return linkedList;
    }

    public static void d(k30 k30Var, int i, int i2, Collection<k30> collection) {
        k30 c2 = k30Var.c(i);
        collection.add(c2.h(4, i2));
        if (k30Var.f() != 4) {
            collection.add(c2.i(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(c2.h(2, 16 - i2).h(2, 1));
        }
        if (k30Var.d() > 0) {
            collection.add(k30Var.a(i).a(i + 1));
        }
    }

    public static Collection<k30> f(Iterable<k30> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (k30 k30Var : iterable) {
            d(k30Var, i, i2, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.m30 a() {
        /*
            r8 = this;
            k30 r0 = defpackage.k30.e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L8:
            byte[] r3 = r8.a
            int r4 = r3.length
            if (r2 >= r4) goto L4c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L15
            r5 = r3[r4]
            goto L16
        L15:
            r5 = r1
        L16:
            r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L38
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L34
            r6 = 46
            if (r3 == r6) goto L30
            r6 = 58
            if (r3 == r6) goto L2c
        L2a:
            r3 = r1
            goto L3d
        L2c:
            if (r5 != r7) goto L2a
            r3 = 5
            goto L3d
        L30:
            if (r5 != r7) goto L2a
            r3 = 3
            goto L3d
        L34:
            if (r5 != r7) goto L2a
            r3 = 4
            goto L3d
        L38:
            r3 = 10
            if (r5 != r3) goto L2a
            r3 = 2
        L3d:
            if (r3 <= 0) goto L45
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L49
        L45:
            java.util.Collection r0 = r8.e(r0, r2)
        L49:
            int r2 = r2 + 1
            goto L8
        L4c:
            i30$a r1 = new i30$a
            r1.<init>(r8)
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            k30 r0 = (defpackage.k30) r0
            byte[] r1 = r8.a
            m30 r0 = r0.j(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i30.a():m30");
    }

    public final void c(k30 k30Var, int i, Collection<k30> collection) {
        char c2 = (char) (this.a[i] & 255);
        boolean z = d[k30Var.f()][c2] > 0;
        k30 k30Var2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = d[i2][c2];
            if (i3 > 0) {
                if (k30Var2 == null) {
                    k30Var2 = k30Var.c(i);
                }
                if (!z || i2 == k30Var.f() || i2 == 2) {
                    collection.add(k30Var2.h(i2, i3));
                }
                if (!z && e[k30Var.f()][i2] >= 0) {
                    collection.add(k30Var2.i(i2, i3));
                }
            }
        }
        if (k30Var.d() > 0 || d[k30Var.f()][c2] == 0) {
            collection.add(k30Var.a(i));
        }
    }

    public final Collection<k30> e(Iterable<k30> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (k30 k30Var : iterable) {
            c(k30Var, i, linkedList);
        }
        return b(linkedList);
    }
}
