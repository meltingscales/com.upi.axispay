package defpackage;

/* compiled from: AxisPay */
/* renamed from: pi  reason: default package */
/* loaded from: classes.dex */
public final class pi {
    public static final pi e;
    public static final pi f;
    public static final pi g;
    public static final pi h;
    public static final pi i;
    public static final pi j;
    public final float[] a;
    public final float[] b;
    public final float[] c = new float[3];
    public boolean d = true;

    static {
        pi piVar = new pi();
        e = piVar;
        m(piVar);
        p(piVar);
        pi piVar2 = new pi();
        f = piVar2;
        o(piVar2);
        p(piVar2);
        pi piVar3 = new pi();
        g = piVar3;
        l(piVar3);
        p(piVar3);
        pi piVar4 = new pi();
        h = piVar4;
        m(piVar4);
        n(piVar4);
        pi piVar5 = new pi();
        i = piVar5;
        o(piVar5);
        n(piVar5);
        pi piVar6 = new pi();
        j = piVar6;
        l(piVar6);
        n(piVar6);
    }

    public pi() {
        float[] fArr = new float[3];
        this.a = fArr;
        float[] fArr2 = new float[3];
        this.b = fArr2;
        r(fArr);
        r(fArr2);
        q();
    }

    public static void l(pi piVar) {
        float[] fArr = piVar.b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    public static void m(pi piVar) {
        float[] fArr = piVar.b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    public static void n(pi piVar) {
        float[] fArr = piVar.a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public static void o(pi piVar) {
        float[] fArr = piVar.b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    public static void p(pi piVar) {
        float[] fArr = piVar.a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    public static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.c[1];
    }

    public float b() {
        return this.b[2];
    }

    public float c() {
        return this.a[2];
    }

    public float d() {
        return this.b[0];
    }

    public float e() {
        return this.a[0];
    }

    public float f() {
        return this.c[2];
    }

    public float g() {
        return this.c[0];
    }

    public float h() {
        return this.b[1];
    }

    public float i() {
        return this.a[1];
    }

    public boolean j() {
        return this.d;
    }

    public void k() {
        int length = this.c.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = this.c[i2];
            if (f3 > 0.0f) {
                f2 += f3;
            }
        }
        if (f2 != 0.0f) {
            int length2 = this.c.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float[] fArr = this.c;
                if (fArr[i3] > 0.0f) {
                    fArr[i3] = fArr[i3] / f2;
                }
            }
        }
    }

    public final void q() {
        float[] fArr = this.c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
