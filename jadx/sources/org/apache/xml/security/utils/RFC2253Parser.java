package org.apache.xml.security.utils;

import java.io.IOException;
import java.io.StringReader;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class RFC2253Parser {
    public static boolean a;
    public static int b;

    static {
        C0059ao.a(RFC2253Parser.class, 403);
    }

    private static int a(String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            if (str.charAt(i) == '\"') {
                i3++;
            }
            i++;
        }
        return i3;
    }

    public static String a(String str) {
        String a2 = C0059ao.a(6236);
        String a3 = C0059ao.a(6237);
        if (str == null || str.equals(a3)) {
            return a3;
        }
        try {
            String f = f(str);
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int indexOf = f.indexOf(a2, i);
                if (indexOf < 0) {
                    stringBuffer.append(b(g(f.substring(i2))));
                    return stringBuffer.toString();
                }
                i3 += a(f, i, indexOf);
                if (indexOf > 0 && f.charAt(indexOf - 1) != '\\' && i3 % 2 != 1) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(b(f.substring(i2, indexOf).trim()));
                    stringBuffer2.append(a2);
                    stringBuffer.append(stringBuffer2.toString());
                    i2 = indexOf + 1;
                    i3 = 0;
                }
                i = indexOf + 1;
            }
        } catch (IOException unused) {
            return str;
        }
    }

    public static String a(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                stringBuffer.append(g(str.substring(i2)));
                return stringBuffer.toString();
            }
            i3 += a(str, i, indexOf);
            if (indexOf > 0 && str.charAt(indexOf - 1) != '\\' && i3 % 2 != 1) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(g(str.substring(i2, indexOf)));
                stringBuffer2.append(str3);
                stringBuffer.append(stringBuffer2.toString());
                i2 = indexOf + 1;
                i3 = 0;
            }
            i = indexOf + 1;
        }
    }

    public static String b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String a2 = C0059ao.a(6238);
            int indexOf = str.indexOf(a2, i);
            if (indexOf < 0) {
                stringBuffer.append(c(g(str.substring(i2))));
                return stringBuffer.toString();
            }
            i3 += a(str, i, indexOf);
            if (indexOf > 0 && str.charAt(indexOf - 1) != '\\' && i3 % 2 != 1) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(c(g(str.substring(i2, indexOf))));
                stringBuffer2.append(a2);
                stringBuffer.append(stringBuffer2.toString());
                i2 = indexOf + 1;
                i3 = 0;
            }
            i = indexOf + 1;
        }
    }

    public static String c(String str) {
        String a2 = C0059ao.a(6239);
        int indexOf = str.indexOf(a2);
        if (indexOf != -1) {
            if (indexOf <= 0 || str.charAt(indexOf - 1) != '\\') {
                String d = d(str.substring(0, indexOf));
                String e = (d.charAt(0) < '0' || d.charAt(0) > '9') ? e(str.substring(indexOf + 1)) : str.substring(indexOf + 1);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(d);
                stringBuffer.append(a2);
                stringBuffer.append(e);
                return stringBuffer.toString();
            }
            return str;
        }
        return str;
    }

    public static String d(String str) {
        String trim = str.toUpperCase().trim();
        return trim.startsWith(C0059ao.a(6240)) ? trim.substring(3) : trim;
    }

    public static String e(String str) {
        String g = g(str);
        if (g.startsWith(C0059ao.a(6241))) {
            StringBuffer stringBuffer = new StringBuffer();
            StringReader stringReader = new StringReader(g.substring(1, g.length() - 1));
            while (true) {
                int read = stringReader.read();
                if (read <= -1) {
                    break;
                }
                char c = (char) read;
                if (c == ',' || c == '=' || c == '+' || c == '<' || c == '>' || c == '#' || c == ';') {
                    stringBuffer.append('\\');
                }
                stringBuffer.append(c);
            }
            g = g(stringBuffer.toString());
        }
        if (!a) {
            return g.startsWith(C0059ao.a(6243)) ? g.substring(1) : g;
        } else if (g.startsWith(C0059ao.a(6242))) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append('\\');
            stringBuffer2.append(g);
            return stringBuffer2.toString();
        } else {
            return g;
        }
    }

    public static String f(String str) {
        return a(str, C0059ao.a(6244), C0059ao.a(6245));
    }

    public static String g(String str) {
        String trim = str.trim();
        int indexOf = str.indexOf(trim) + trim.length();
        if (str.length() <= indexOf || !trim.endsWith(C0059ao.a(6246)) || trim.endsWith(C0059ao.a(6247)) || str.charAt(indexOf) != ' ') {
            return trim;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(trim);
        stringBuffer.append(C0059ao.a(6248));
        return stringBuffer.toString();
    }
}
