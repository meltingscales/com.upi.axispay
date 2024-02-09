package defpackage;

/* compiled from: AxisPay */
/* renamed from: fz  reason: default package */
/* loaded from: classes.dex */
public class fz extends ez {
    public float a = -1.0f;

    @Override // defpackage.ez
    public void a(nz nzVar, float f, float f2, float f3) {
        nzVar.o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        nzVar.m((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }
}
