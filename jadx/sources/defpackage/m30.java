package defpackage;

import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: m30  reason: default package */
/* loaded from: classes.dex */
public final class m30 implements Cloneable {
    public int[] b;
    public int c;

    public m30() {
        this.c = 0;
        this.b = new int[1];
    }

    public static int[] i(int i) {
        return new int[(i + 31) / 32];
    }

    public void a(boolean z) {
        e(this.c + 1);
        if (z) {
            int[] iArr = this.b;
            int i = this.c;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.c++;
    }

    public void b(m30 m30Var) {
        int i = m30Var.c;
        e(this.c + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(m30Var.f(i2));
        }
    }

    public void c(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            e(this.c + i2);
            while (i2 > 0) {
                boolean z = true;
                if (((i >> (i2 - 1)) & 1) != 1) {
                    z = false;
                }
                a(z);
                i2--;
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(1831));
    }

    /* renamed from: d */
    public m30 clone() {
        return new m30((int[]) this.b.clone(), this.c);
    }

    public final void e(int i) {
        if (i > (this.b.length << 5)) {
            int[] i2 = i(i);
            int[] iArr = this.b;
            System.arraycopy(iArr, 0, i2, 0, iArr.length);
            this.b = i2;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof m30) {
            m30 m30Var = (m30) obj;
            return this.c == m30Var.c && Arrays.equals(this.b, m30Var.b);
        }
        return false;
    }

    public boolean f(int i) {
        return ((1 << (i & 31)) & this.b[i / 32]) != 0;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return (this.c + 7) / 8;
    }

    public int hashCode() {
        return (this.c * 31) + Arrays.hashCode(this.b);
    }

    public void j(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (f(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public void k(m30 m30Var) {
        if (this.c != m30Var.c) {
            throw new IllegalArgumentException(C0059ao.a(1832));
        }
        int i = 0;
        while (true) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ m30Var.b[i];
            i++;
        }
    }

    public String toString() {
        int i = this.c;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.c; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(f(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public m30(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }
}
