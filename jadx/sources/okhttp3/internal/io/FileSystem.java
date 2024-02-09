package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import myunmn.C0059ao;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import okio.Sink;
import okio.Source;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface FileSystem {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public Sink appendingSink(File file) throws FileNotFoundException {
                yl0.e(file, C0059ao.a(11141));
                try {
                    return Okio.appendingSink(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.appendingSink(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                yl0.e(file, C0059ao.a(11142));
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException(C0059ao.a(11143) + file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File file) throws IOException {
                yl0.e(file, C0059ao.a(11144));
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        yl0.d(file2, C0059ao.a(11145));
                        if (file2.isDirectory()) {
                            deleteContents(file2);
                        }
                        if (!file2.delete()) {
                            throw new IOException(C0059ao.a(11146) + file2);
                        }
                    }
                    return;
                }
                throw new IOException(C0059ao.a(11147) + file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                yl0.e(file, C0059ao.a(11148));
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File file, File file2) throws IOException {
                yl0.e(file, C0059ao.a(11149));
                yl0.e(file2, C0059ao.a(11150));
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException(C0059ao.a(11151) + file + C0059ao.a(11152) + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public Sink sink(File file) throws FileNotFoundException {
                yl0.e(file, C0059ao.a(11153));
                try {
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                yl0.e(file, C0059ao.a(11154));
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public Source source(File file) throws FileNotFoundException {
                yl0.e(file, C0059ao.a(11155));
                return Okio.source(file);
            }

            public String toString() {
                return C0059ao.a(11156);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
