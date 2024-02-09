package defpackage;

import com.google.android.gms.vision.barcode.Barcode;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: v30  reason: default package */
/* loaded from: classes.dex */
public class v30 implements z30 {
    public static String d(CharSequence charSequence) {
        int charAt = (charSequence.charAt(0) * 1600) + (charSequence.charAt(1) * '(') + charSequence.charAt(2) + 1;
        return new String(new char[]{(char) (charAt / Barcode.QR_CODE), (char) (charAt % Barcode.QR_CODE)});
    }

    public static void g(a40 a40Var, StringBuilder sb) {
        a40Var.s(d(sb));
        sb.delete(0, 3);
    }

    @Override // defpackage.z30
    public void a(a40 a40Var) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!a40Var.i()) {
                break;
            }
            char c = a40Var.c();
            a40Var.f++;
            int c2 = c(c, sb);
            int a = a40Var.a() + ((sb.length() / 3) << 1);
            a40Var.q(a);
            int a2 = a40Var.g().a() - a;
            if (!a40Var.i()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && a2 != 2) {
                    c2 = b(a40Var, sb, sb2, c2);
                }
                while (sb.length() % 3 == 1 && (c2 > 3 || a2 != 1)) {
                    c2 = b(a40Var, sb, sb2, c2);
                }
            } else if (sb.length() % 3 == 0 && c40.n(a40Var.d(), a40Var.f, e()) != e()) {
                a40Var.o(0);
                break;
            }
        }
        f(a40Var, sb);
    }

    public final int b(a40 a40Var, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        a40Var.f--;
        int c = c(a40Var.c(), sb2);
        a40Var.k();
        return c;
    }

    public int c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        } else if (c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else {
            sb.append(C0059ao.a(10029));
            return c((char) (c - 128), sb) + 2;
        }
    }

    public int e() {
        return 1;
    }

    public void f(a40 a40Var, StringBuilder sb) {
        int length = sb.length() % 3;
        int a = a40Var.a() + ((sb.length() / 3) << 1);
        a40Var.q(a);
        int a2 = a40Var.g().a() - a;
        if (length == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                g(a40Var, sb);
            }
            if (a40Var.i()) {
                a40Var.r((char) 254);
            }
        } else if (a2 == 1 && length == 1) {
            while (sb.length() >= 3) {
                g(a40Var, sb);
            }
            if (a40Var.i()) {
                a40Var.r((char) 254);
            }
            a40Var.f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                g(a40Var, sb);
            }
            if (a2 > 0 || a40Var.i()) {
                a40Var.r((char) 254);
            }
        } else {
            throw new IllegalStateException(C0059ao.a(10030));
        }
        a40Var.o(0);
    }
}
