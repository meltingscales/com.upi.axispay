package defpackage;

import java.util.Collection;
import java.util.Collections;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: m40  reason: default package */
/* loaded from: classes.dex */
public final class m40 extends u40 {
    public static void h(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        sb.append(C0059ao.a(2803));
                    } else if (charAt == '`') {
                        sb.append(C0059ao.a(2802));
                    } else if (charAt != '-' && charAt != '.') {
                        if (charAt <= 26) {
                            sb.append('$');
                            sb.append((char) ((charAt - 1) + 65));
                        } else if (charAt < ' ') {
                            sb.append('%');
                            sb.append((char) ((charAt - 27) + 65));
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb.append('/');
                            sb.append((char) ((charAt - '!') + 65));
                        } else if (charAt <= '9') {
                            sb.append((char) ((charAt - '0') + 48));
                        } else if (charAt <= '?') {
                            sb.append('%');
                            sb.append((char) ((charAt - ';') + 70));
                        } else if (charAt <= 'Z') {
                            sb.append((char) ((charAt - 'A') + 65));
                        } else if (charAt <= '_') {
                            sb.append('%');
                            sb.append((char) ((charAt - '[') + 75));
                        } else if (charAt <= 'z') {
                            sb.append('+');
                            sb.append((char) ((charAt - 'a') + 65));
                        } else if (charAt <= 127) {
                            sb.append('%');
                            sb.append((char) ((charAt - '{') + 80));
                        } else {
                            throw new IllegalArgumentException(C0059ao.a(2800) + str.charAt(i) + C0059ao.a(2801));
                        }
                    }
                }
                sb.append(charAt);
            } else {
                sb.append(C0059ao.a(2804));
            }
        }
        return sb.toString();
    }

    @Override // defpackage.u40
    public boolean[] d(String str) {
        String a;
        int length = str.length();
        String a2 = C0059ao.a(2805);
        if (length <= 80) {
            int i = 0;
            while (true) {
                a = C0059ao.a(2806);
                if (i >= length) {
                    break;
                } else if (a.indexOf(str.charAt(i)) < 0) {
                    str = i(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException(a2 + length + C0059ao.a(2807));
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[(length * 13) + 25];
            h(148, iArr);
            int b = u40.b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int b2 = b + u40.b(zArr, b, iArr2, false);
            for (int i2 = 0; i2 < length; i2++) {
                h(l40.a[a.indexOf(str.charAt(i2))], iArr);
                int b3 = b2 + u40.b(zArr, b2, iArr, true);
                b2 = b3 + u40.b(zArr, b3, iArr2, false);
            }
            h(148, iArr);
            u40.b(zArr, b2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException(a2.concat(String.valueOf(length)));
    }

    @Override // defpackage.u40
    public Collection<w20> f() {
        return Collections.singleton(w20.CODE_39);
    }
}
