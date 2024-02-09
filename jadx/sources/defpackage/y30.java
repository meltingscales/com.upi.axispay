package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: y30  reason: default package */
/* loaded from: classes.dex */
public final class y30 implements z30 {
    public static void b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c >= '@' && c <= '^') {
            sb.append((char) (c - '@'));
        } else {
            c40.e(c);
            throw null;
        }
    }

    public static String c(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            int charAt = (charSequence.charAt(0) << 18) + ((length >= 2 ? charSequence.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(3) : (char) 0);
            char c = (char) ((charAt >> 8) & 255);
            char c2 = (char) (charAt & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((charAt >> 16) & 255));
            if (length >= 2) {
                sb.append(c);
            }
            if (length >= 3) {
                sb.append(c2);
            }
            return sb.toString();
        }
        throw new IllegalStateException(C0059ao.a(988));
    }

    public static void e(a40 a40Var, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                a40Var.p();
                int a = a40Var.g().a() - a40Var.a();
                int f = a40Var.f();
                if (f > a) {
                    a40Var.q(a40Var.a() + 1);
                    a = a40Var.g().a() - a40Var.a();
                }
                if (f <= a && a <= 2) {
                    return;
                }
            }
            if (length <= 4) {
                int i = length - 1;
                String c = c(charSequence);
                if (!(!a40Var.i()) || i > 2) {
                    z = false;
                }
                if (i <= 2) {
                    a40Var.q(a40Var.a() + i);
                    if (a40Var.g().a() - a40Var.a() >= 3) {
                        a40Var.q(a40Var.a() + c.length());
                        z = false;
                    }
                }
                if (z) {
                    a40Var.k();
                    a40Var.f -= i;
                } else {
                    a40Var.s(c);
                }
                return;
            }
            throw new IllegalStateException(C0059ao.a(989));
        } finally {
            a40Var.o(0);
        }
    }

    @Override // defpackage.z30
    public void a(a40 a40Var) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!a40Var.i()) {
                break;
            }
            b(a40Var.c(), sb);
            a40Var.f++;
            if (sb.length() >= 4) {
                a40Var.s(c(sb));
                sb.delete(0, 4);
                if (c40.n(a40Var.d(), a40Var.f, d()) != d()) {
                    a40Var.o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        e(a40Var, sb);
    }

    public int d() {
        return 4;
    }
}
