package org.apache.xml.security.utils;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import myunmn.C0059ao;
import org.apache.xml.security.Init;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class I18n {
    public static String a;
    public static String b;
    public static ResourceBundle c;
    public static boolean d;
    public static String e;
    public static String f;

    static {
        C0059ao.a(I18n.class, 361);
    }

    private I18n() {
    }

    public static String a(String str) {
        return b(str);
    }

    public static String a(String str, Exception exc) {
        try {
            return MessageFormat.format(c.getString(str), exc.getMessage());
        } catch (Throwable unused) {
            if (Init.a()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C0059ao.a(1418));
                stringBuffer.append(str);
                stringBuffer.append(C0059ao.a(1419));
                stringBuffer.append(C0059ao.a(1420));
                stringBuffer.append(C0059ao.a(1421));
                stringBuffer.append(exc.getClass().getName());
                stringBuffer.append(C0059ao.a(1422));
                stringBuffer.append(exc.getMessage());
                return stringBuffer.toString();
            }
            return C0059ao.a(1423);
        }
    }

    public static String a(String str, Object[] objArr) {
        return b(str, objArr);
    }

    public static void a(String str, String str2) {
        a = str;
        if (str == null) {
            a = Locale.getDefault().getLanguage();
        }
        b = str2;
        if (str2 == null) {
            b = Locale.getDefault().getCountry();
        }
        b(a, b);
    }

    public static String b(String str) {
        try {
            return c.getString(str);
        } catch (Throwable unused) {
            if (Init.a()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C0059ao.a(1424));
                stringBuffer.append(str);
                stringBuffer.append(C0059ao.a(1425));
                stringBuffer.append(C0059ao.a(1426));
                stringBuffer.append(C0059ao.a(1427));
                return stringBuffer.toString();
            }
            return C0059ao.a(1428);
        }
    }

    public static String b(String str, Object[] objArr) {
        try {
            return MessageFormat.format(c.getString(str), objArr);
        } catch (Throwable unused) {
            if (Init.a()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C0059ao.a(1429));
                stringBuffer.append(str);
                stringBuffer.append(C0059ao.a(1430));
                stringBuffer.append(C0059ao.a(1431));
                stringBuffer.append(C0059ao.a(1432));
                return stringBuffer.toString();
            }
            return C0059ao.a(1433);
        }
    }

    public static void b(String str, String str2) {
        if (d && str.equals(e) && str2.equals(f)) {
            return;
        }
        if (str == null || str2 == null || str.length() <= 0 || str2.length() <= 0) {
            f = b;
            e = a;
        } else {
            e = str;
            f = str2;
        }
        c = ResourceBundle.getBundle(C0059ao.a(1434), new Locale(e, f));
    }
}
