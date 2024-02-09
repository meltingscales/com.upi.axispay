package defpackage;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: l5  reason: default package */
/* loaded from: classes.dex */
public abstract class l5 {
    public g5 a;
    public int e;
    public String f;
    public long i;
    public int b = 0;
    public int[] c = new int[10];
    public float[][] d = (float[][]) Array.newInstance(float.class, 10, 3);
    public float[] g = new float[3];
    public boolean h = false;
    public float j = Float.NaN;

    public String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat(C0059ao.a(10161));
        for (int i = 0; i < this.e; i++) {
            str = str + C0059ao.a(10162) + this.c[i] + C0059ao.a(10163) + decimalFormat.format(this.d[i]) + C0059ao.a(10164);
        }
        return str;
    }
}
