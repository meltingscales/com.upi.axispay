package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: t30  reason: default package */
/* loaded from: classes.dex */
public final class t30 implements z30 {
    public static char b(char c, char c2) {
        if (c40.f(c) && c40.f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException(C0059ao.a(15598) + c + c2);
    }

    @Override // defpackage.z30
    public void a(a40 a40Var) {
        if (c40.a(a40Var.d(), a40Var.f) >= 2) {
            a40Var.r(b(a40Var.d().charAt(a40Var.f), a40Var.d().charAt(a40Var.f + 1)));
            a40Var.f += 2;
            return;
        }
        char c = a40Var.c();
        int n = c40.n(a40Var.d(), a40Var.f, c());
        if (n == c()) {
            if (c40.g(c)) {
                a40Var.r((char) 235);
                a40Var.r((char) ((c - 128) + 1));
                a40Var.f++;
                return;
            }
            a40Var.r((char) (c + 1));
            a40Var.f++;
        } else if (n == 1) {
            a40Var.r((char) 230);
            a40Var.o(1);
        } else if (n == 2) {
            a40Var.r((char) 239);
            a40Var.o(2);
        } else if (n == 3) {
            a40Var.r((char) 238);
            a40Var.o(3);
        } else if (n == 4) {
            a40Var.r((char) 240);
            a40Var.o(4);
        } else if (n == 5) {
            a40Var.r((char) 231);
            a40Var.o(5);
        } else {
            throw new IllegalStateException(C0059ao.a(15599).concat(String.valueOf(n)));
        }
    }

    public int c() {
        return 0;
    }
}
