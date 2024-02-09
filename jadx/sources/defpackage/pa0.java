package defpackage;

import com.olive.upi.transport.model.Registration;

/* compiled from: AxisPay */
/* renamed from: pa0  reason: default package */
/* loaded from: classes.dex */
public class pa0 {
    public static pa0 d;
    public int a;
    public String b;
    public Registration c;

    public static pa0 a() {
        if (d == null) {
            d = new pa0();
        }
        return d;
    }

    public String b() {
        return this.b;
    }

    public Registration c() {
        return this.c;
    }

    public int d() {
        return this.a;
    }

    public void e(String str) {
        this.b = str;
    }

    public void f(Registration registration) {
        this.c = registration;
    }

    public void g(int i) {
        this.a = i;
    }
}
