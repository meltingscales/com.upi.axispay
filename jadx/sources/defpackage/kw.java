package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: kw  reason: default package */
/* loaded from: classes.dex */
public class kw extends gz implements Cloneable {
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;

    @Override // defpackage.gz
    public void b(float f, float f2, float f3, nz nzVar) {
        float f4;
        float f5;
        float f6 = this.d;
        if (f6 == 0.0f) {
            nzVar.m(f, 0.0f);
            return;
        }
        float f7 = ((this.c * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.b;
        float f9 = f2 + this.f;
        float f10 = (this.e * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            nzVar.m(f, 0.0f);
            return;
        }
        float f11 = this.g;
        float f12 = f11 * f3;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = f10;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        nzVar.m(f15, 0.0f);
        float f18 = f8 * 2.0f;
        nzVar.a(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z) {
            nzVar.a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.c;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            nzVar.a(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.c;
            nzVar.m(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.c;
            nzVar.a(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        nzVar.a(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        nzVar.m(f, 0.0f);
    }

    public float c() {
        return this.e;
    }

    public float d() {
        return this.g;
    }

    public float e() {
        return this.c;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.d;
    }

    public void h(float f) {
        if (f >= 0.0f) {
            this.e = f;
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(11394));
    }

    public void i(float f) {
        this.g = f;
    }

    public void j(float f) {
        this.c = f;
    }

    public void k(float f) {
        this.b = f;
    }

    public void l(float f) {
        this.d = f;
    }

    public void m(float f) {
        this.f = f;
    }
}
