package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: f40  reason: default package */
/* loaded from: classes.dex */
public final class f40 extends v30 {
    @Override // defpackage.v30
    public int c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'a' && c <= 'z') {
            sb.append((char) ((c - 'a') + 14));
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
        } else if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c == '`') {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c <= 'Z') {
            sb.append((char) 2);
            sb.append((char) ((c - 'A') + 1));
            return 2;
        } else if (c <= 127) {
            sb.append((char) 2);
            sb.append((char) ((c - '{') + 27));
            return 2;
        } else {
            sb.append(C0059ao.a(9544));
            return c((char) (c - 128), sb) + 2;
        }
    }

    @Override // defpackage.v30
    public int e() {
        return 2;
    }
}
