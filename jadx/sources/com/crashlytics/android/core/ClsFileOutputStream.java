package com.crashlytics.android.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ClsFileOutputStream extends FileOutputStream {
    public static final String IN_PROGRESS_SESSION_FILE_EXTENSION = null;
    public static final String SESSION_FILE_EXTENSION = null;
    public static final FilenameFilter TEMP_FILENAME_FILTER;
    private boolean closed;
    private File complete;
    private File inProgress;
    private final String root;

    static {
        C0059ao.a(ClsFileOutputStream.class, 317);
        TEMP_FILENAME_FILTER = new FilenameFilter() { // from class: com.crashlytics.android.core.ClsFileOutputStream.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(C0059ao.a(4027));
            }
        };
    }

    public ClsFileOutputStream(String str, String str2) throws FileNotFoundException {
        this(new File(str), str2);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        super.flush();
        super.close();
        File file = new File(this.root + C0059ao.a(8535));
        if (this.inProgress.renameTo(file)) {
            this.inProgress = null;
            this.complete = file;
            return;
        }
        String a = C0059ao.a(8536);
        if (file.exists()) {
            a = C0059ao.a(8538);
        } else if (!this.inProgress.exists()) {
            a = C0059ao.a(8537);
        }
        throw new IOException(C0059ao.a(8539) + this.inProgress + C0059ao.a(8540) + file + a);
    }

    public void closeInProgressStream() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        super.flush();
        super.close();
    }

    public File getCompleteFile() {
        return this.complete;
    }

    public File getInProgressFile() {
        return this.inProgress;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ClsFileOutputStream(java.io.File r4, java.lang.String r5) throws java.io.FileNotFoundException {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r2 = 8534(0x2156, float:1.1959E-41)
            java.lang.String r2 = myunmn.C0059ao.a(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r4, r1)
            r3.<init>(r0)
            r0 = 0
            r3.closed = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = java.io.File.separator
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r3.root = r4
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            r3.inProgress = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.ClsFileOutputStream.<init>(java.io.File, java.lang.String):void");
    }
}
