package defpackage;

import java.nio.charset.StandardCharsets;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: a40  reason: default package */
/* loaded from: classes.dex */
public final class a40 {
    public final String a;
    public e40 b;
    public x20 c;
    public x20 d;
    public final StringBuilder e;
    public int f;
    public int g;
    public d40 h;
    public int i;

    public a40(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException(C0059ao.a(7990));
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = e40.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    public int a() {
        return this.e.length();
    }

    public StringBuilder b() {
        return this.e;
    }

    public char c() {
        return this.a.charAt(this.f);
    }

    public String d() {
        return this.a;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return h() - this.f;
    }

    public d40 g() {
        return this.h;
    }

    public final int h() {
        return this.a.length() - this.i;
    }

    public boolean i() {
        return this.f < h();
    }

    public void j() {
        this.g = -1;
    }

    public void k() {
        this.h = null;
    }

    public void l(x20 x20Var, x20 x20Var2) {
        this.c = x20Var;
        this.d = x20Var2;
    }

    public void m(int i) {
        this.i = i;
    }

    public void n(e40 e40Var) {
        this.b = e40Var;
    }

    public void o(int i) {
        this.g = i;
    }

    public void p() {
        q(a());
    }

    public void q(int i) {
        d40 d40Var = this.h;
        if (d40Var == null || i > d40Var.a()) {
            this.h = d40.l(i, this.b, this.c, this.d, true);
        }
    }

    public void r(char c) {
        this.e.append(c);
    }

    public void s(String str) {
        this.e.append(str);
    }
}
