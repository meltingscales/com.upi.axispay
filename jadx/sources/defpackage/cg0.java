package defpackage;

import java.util.logging.Logger;
import java.util.prefs.Preferences;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: cg0  reason: default package */
/* loaded from: classes.dex */
public class cg0 {
    public static final String a = null;
    public static final Logger b;

    static {
        C0059ao.a(cg0.class, 325);
        b = Logger.getLogger(cg0.class.getName());
    }

    public static byte[] a(String str) {
        Logger logger = b;
        String str2 = a;
        String a2 = C0059ao.a(1701);
        logger.entering(str2, a2);
        Preferences userNodeForPackage = Preferences.userNodeForPackage(cg0.class);
        String a3 = C0059ao.a(1702);
        userNodeForPackage.put(a3, str);
        logger.exiting(str2, a2);
        return userNodeForPackage.getByteArray(a3, null);
    }

    public static String b(byte[] bArr) {
        Logger logger = b;
        String str = a;
        String a2 = C0059ao.a(1703);
        logger.entering(str, a2);
        Preferences userNodeForPackage = Preferences.userNodeForPackage(cg0.class);
        String a3 = C0059ao.a(1704);
        userNodeForPackage.putByteArray(a3, bArr);
        logger.exiting(str, a2);
        return userNodeForPackage.get(a3, null);
    }
}
