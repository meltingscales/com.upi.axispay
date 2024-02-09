package defpackage;

/* compiled from: AxisPay */
/* renamed from: g40  reason: default package */
/* loaded from: classes.dex */
public final class g40 extends v30 {
    @Override // defpackage.v30, defpackage.z30
    public void a(a40 a40Var) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!a40Var.i()) {
                break;
            }
            char c = a40Var.c();
            a40Var.f++;
            c(c, sb);
            if (sb.length() % 3 == 0) {
                v30.g(a40Var, sb);
                if (c40.n(a40Var.d(), a40Var.f, e()) != e()) {
                    a40Var.o(0);
                    break;
                }
            }
        }
        f(a40Var, sb);
    }

    @Override // defpackage.v30
    public int c(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
        } else {
            c40.e(c);
            throw null;
        }
        return 1;
    }

    @Override // defpackage.v30
    public int e() {
        return 3;
    }

    @Override // defpackage.v30
    public void f(a40 a40Var, StringBuilder sb) {
        a40Var.p();
        int a = a40Var.g().a() - a40Var.a();
        a40Var.f -= sb.length();
        if (a40Var.f() > 1 || a > 1 || a40Var.f() != a) {
            a40Var.r((char) 254);
        }
        if (a40Var.e() < 0) {
            a40Var.o(0);
        }
    }
}
