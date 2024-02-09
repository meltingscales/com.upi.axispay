package defpackage;

import java.util.Arrays;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: wi0  reason: default package */
/* loaded from: classes.dex */
public class wi0 extends vi0 {
    public static final <T> List<T> b(T[] tArr) {
        yl0.e(tArr, C0059ao.a(9787));
        List<T> a = yi0.a(tArr);
        yl0.d(a, C0059ao.a(9788));
        return a;
    }

    public static final byte[] c(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        yl0.e(bArr, C0059ao.a(9789));
        yl0.e(bArr2, C0059ao.a(9790));
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static /* synthetic */ byte[] d(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        c(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    public static final byte[] e(byte[] bArr, int i, int i2) {
        yl0.e(bArr, C0059ao.a(9791));
        ui0.a(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        yl0.d(copyOfRange, C0059ao.a(9792));
        return copyOfRange;
    }

    public static final <T> T[] f(T[] tArr, int i, int i2) {
        yl0.e(tArr, C0059ao.a(9793));
        ui0.a(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        yl0.d(tArr2, C0059ao.a(9794));
        return tArr2;
    }

    public static final void g(int[] iArr, int i, int i2, int i3) {
        yl0.e(iArr, C0059ao.a(9795));
        Arrays.fill(iArr, i2, i3, i);
    }

    public static final <T> void h(T[] tArr, T t, int i, int i2) {
        yl0.e(tArr, C0059ao.a(9796));
        Arrays.fill(tArr, i, i2, t);
    }

    public static /* synthetic */ void i(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        g(iArr, i, i2, i3);
    }

    public static /* synthetic */ void j(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        h(objArr, obj, i, i2);
    }
}
