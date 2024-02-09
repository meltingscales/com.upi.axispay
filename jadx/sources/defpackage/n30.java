package defpackage;

import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: n30  reason: default package */
/* loaded from: classes.dex */
public final class n30 implements Cloneable {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;

    public n30(int i) {
        this(i, i);
    }

    public final String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.c * (this.b + 1));
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                sb.append(d(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void b() {
        int length = this.e.length;
        for (int i = 0; i < length; i++) {
            this.e[i] = 0;
        }
    }

    /* renamed from: c */
    public n30 clone() {
        return new n30(this.b, this.c, this.d, (int[]) this.e.clone());
    }

    public boolean d(int i, int i2) {
        return ((this.e[(i2 * this.d) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n30) {
            n30 n30Var = (n30) obj;
            return this.b == n30Var.b && this.c == n30Var.c && this.d == n30Var.d && Arrays.equals(this.e, n30Var.e);
        }
        return false;
    }

    public int f() {
        return this.b;
    }

    public void g(int i, int i2) {
        int i3 = (i2 * this.d) + (i / 32);
        int[] iArr = this.e;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void h(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException(C0059ao.a(1042));
        }
        if (i4 > 0 && i3 > 0) {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.c || i5 > this.b) {
                throw new IllegalArgumentException(C0059ao.a(1040));
            }
            while (i2 < i6) {
                int i7 = this.d * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.e;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(1041));
    }

    public int hashCode() {
        int i = this.b;
        return (((((((i * 31) + i) * 31) + this.c) * 31) + this.d) * 31) + Arrays.hashCode(this.e);
    }

    public String i(String str, String str2) {
        return a(str, str2, C0059ao.a(1043));
    }

    public String toString() {
        return i(C0059ao.a(1044), C0059ao.a(1045));
    }

    public n30(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.b = i;
            this.c = i2;
            int i3 = (i + 31) / 32;
            this.d = i3;
            this.e = new int[i3 * i2];
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(1039));
    }

    public n30(int i, int i2, int i3, int[] iArr) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
    }
}
