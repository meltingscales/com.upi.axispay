package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: z50  reason: default package */
/* loaded from: classes.dex */
public final class z50 {
    public static final Charset a = Charset.forName(C0059ao.a(14511));

    static {
        Charset.forName(C0059ao.a(14512));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void b(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    b(file2);
                }
                if (!file2.delete()) {
                    throw new IOException(C0059ao.a(14513) + file2);
                }
            }
            return;
        }
        throw new IOException(C0059ao.a(14514) + file);
    }
}
