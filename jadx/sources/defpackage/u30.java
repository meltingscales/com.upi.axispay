package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: u30  reason: default package */
/* loaded from: classes.dex */
public final class u30 implements z30 {
    public static char c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    @Override // defpackage.z30
    public void a(a40 a40Var) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!a40Var.i()) {
                break;
            }
            sb.append(a40Var.c());
            a40Var.f++;
            if (c40.n(a40Var.d(), a40Var.f, b()) != b()) {
                a40Var.o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a = a40Var.a() + length + 1;
        a40Var.q(a);
        boolean z = a40Var.g().a() - a > 0;
        if (a40Var.i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException(C0059ao.a(11140).concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            a40Var.r(c(sb.charAt(i), a40Var.a() + 1));
        }
    }

    public int b() {
        return 5;
    }
}
