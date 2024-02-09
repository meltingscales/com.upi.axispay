package myunmn;

import android.app.Application;
import java.io.IOException;
import java.util.Objects;

/* renamed from: myunmn.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0095z {
    private static long a = 0;
    private static boolean b = true;
    private static boolean c = true;

    static {
        a();
    }

    public static void a() {
        if (b) {
            a((ApplicationC0063as) null);
        }
    }

    private static synchronized void a(ApplicationC0063as applicationC0063as) {
        synchronized (C0095z.class) {
            try {
                if (a == 0) {
                    a = System.currentTimeMillis();
                }
                if (b) {
                    b = false;
                    c();
                }
                if (c && applicationC0063as != null) {
                    c = false;
                    b(applicationC0063as);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static native boolean a(Application application);

    private static void b() {
        char[] cArr = {(char) (cArr[10] ^ '\b'), (char) (cArr[2] ^ '\n'), (char) (cArr[10] ^ 1), (char) (cArr[6] ^ 15), (char) (cArr[11] ^ 14), (char) (cArr[10] ^ 14), (char) (cArr[10] ^ 7), (char) (cArr[10] ^ '\r'), (char) (cArr[10] ^ 14), (char) (cArr[2] ^ '\r'), (char) ((-16565) ^ (-16606)), (char) (cArr[10] ^ 14)};
        System.loadLibrary(new String(cArr).intern());
    }

    private static void b(ApplicationC0063as applicationC0063as) {
        d(applicationC0063as);
    }

    private static void c() {
        C0057am.c();
        b();
    }

    public static void c(ApplicationC0063as applicationC0063as) {
        Objects.requireNonNull(applicationC0063as);
        a(applicationC0063as);
    }

    public static native void d(ApplicationC0063as applicationC0063as);
}
