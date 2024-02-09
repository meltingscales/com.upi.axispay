package defpackage;

import defpackage.x4;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: w4  reason: default package */
/* loaded from: classes.dex */
public class w4 implements x4.a {
    public static float l;
    public final x4 b;
    public final y4 c;
    public int a = 0;
    public int d = 8;
    public e5 e = null;
    public int[] f = new int[8];
    public int[] g = new int[8];
    public float[] h = new float[8];
    public int i = -1;
    public int j = -1;
    public boolean k = false;

    static {
        C0059ao.a(w4.class, 385);
    }

    public w4(x4 x4Var, y4 y4Var) {
        this.b = x4Var;
        this.c = y4Var;
    }

    @Override // defpackage.x4.a
    public float a(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    @Override // defpackage.x4.a
    public final float b(e5 e5Var, boolean z) {
        if (this.e == e5Var) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.f[i] == e5Var.d) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    e5Var.d(this.b);
                }
                e5Var.n--;
                this.a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // defpackage.x4.a
    public int c() {
        return this.a;
    }

    @Override // defpackage.x4.a
    public final void clear() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            e5 e5Var = this.c.d[this.f[i]];
            if (e5Var != null) {
                e5Var.d(this.b);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    @Override // defpackage.x4.a
    public final float d(e5 e5Var) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == e5Var.d) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // defpackage.x4.a
    public boolean e(e5 e5Var) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == e5Var.d) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    @Override // defpackage.x4.a
    public float f(x4 x4Var, boolean z) {
        float d = d(x4Var.a);
        b(x4Var.a, z);
        x4.a aVar = x4Var.e;
        int c = aVar.c();
        for (int i = 0; i < c; i++) {
            e5 h = aVar.h(i);
            i(h, aVar.d(h) * d, z);
        }
        return d;
    }

    @Override // defpackage.x4.a
    public final void g(e5 e5Var, float f) {
        if (f == 0.0f) {
            b(e5Var, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = e5Var.d;
            this.g[0] = -1;
            e5Var.n++;
            e5Var.a(this.b);
            this.a++;
            if (this.k) {
                return;
            }
            int i2 = this.j + 1;
            this.j = i2;
            int[] iArr = this.f;
            if (i2 >= iArr.length) {
                this.k = true;
                this.j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int[] iArr2 = this.f;
            int i5 = iArr2[i];
            int i6 = e5Var.d;
            if (i5 == i6) {
                this.h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int i7 = this.j;
        int i8 = i7 + 1;
        if (this.k) {
            int[] iArr3 = this.f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f;
        if (i7 >= iArr4.length && this.a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.k = false;
            this.j = i7 - 1;
            this.h = Arrays.copyOf(this.h, i10);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i7] = e5Var.d;
        this.h[i7] = f;
        if (i3 != -1) {
            int[] iArr7 = this.g;
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            this.g[i7] = this.i;
            this.i = i7;
        }
        e5Var.n++;
        e5Var.a(this.b);
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.k) {
            this.j++;
        }
        int[] iArr8 = this.f;
        if (i11 >= iArr8.length) {
            this.k = true;
        }
        if (this.j >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    @Override // defpackage.x4.a
    public e5 h(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.c.d[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    @Override // defpackage.x4.a
    public void i(e5 e5Var, float f, boolean z) {
        float f2 = l;
        if (f <= (-f2) || f >= f2) {
            int i = this.i;
            if (i == -1) {
                this.i = 0;
                this.h[0] = f;
                this.f[0] = e5Var.d;
                this.g[0] = -1;
                e5Var.n++;
                e5Var.a(this.b);
                this.a++;
                if (this.k) {
                    return;
                }
                int i2 = this.j + 1;
                this.j = i2;
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int[] iArr2 = this.f;
                int i5 = iArr2[i];
                int i6 = e5Var.d;
                if (i5 == i6) {
                    float[] fArr = this.h;
                    float f3 = fArr[i] + f;
                    float f4 = l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.i) {
                            this.i = this.g[i];
                        } else {
                            int[] iArr3 = this.g;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            e5Var.d(this.b);
                        }
                        if (this.k) {
                            this.j = i;
                        }
                        e5Var.n--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.g[i];
            }
            int i7 = this.j;
            int i8 = i7 + 1;
            if (this.k) {
                int[] iArr4 = this.f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f;
            if (i7 >= iArr5.length && this.a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.k = false;
                this.j = i7 - 1;
                this.h = Arrays.copyOf(this.h, i10);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[i7] = e5Var.d;
            this.h[i7] = f;
            if (i3 != -1) {
                int[] iArr8 = this.g;
                iArr8[i7] = iArr8[i3];
                iArr8[i3] = i7;
            } else {
                this.g[i7] = this.i;
                this.i = i7;
            }
            e5Var.n++;
            e5Var.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
            }
            int i11 = this.j;
            int[] iArr9 = this.f;
            if (i11 >= iArr9.length) {
                this.k = true;
                this.j = iArr9.length - 1;
            }
        }
    }

    @Override // defpackage.x4.a
    public void j(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    @Override // defpackage.x4.a
    public void k() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.g[i];
        }
    }

    public String toString() {
        int i = this.i;
        String a = C0059ao.a(4097);
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            a = ((a + C0059ao.a(4098)) + this.h[i] + C0059ao.a(4099)) + this.c.d[this.f[i]];
            i = this.g[i];
        }
        return a;
    }
}
