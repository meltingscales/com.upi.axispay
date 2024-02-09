package defpackage;

/* compiled from: AxisPay */
/* renamed from: jh0  reason: default package */
/* loaded from: classes.dex */
public class jh0 {
    public String a;
    public int b = 0;
    public int c = 0;

    public jh0(String str) {
        this.a = str;
    }

    public String a(int i) {
        int i2 = this.b;
        this.c = i2;
        this.b = i2 + i;
        return this.a.substring(i2, i + i2);
    }

    public boolean b(int i) {
        return this.b + i <= this.a.length();
    }
}
