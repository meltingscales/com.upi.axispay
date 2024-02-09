package defpackage;

import android.content.Context;
import android.util.Log;
import defpackage.cm;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import myunmn.C0059ao;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: fl  reason: default package */
/* loaded from: classes.dex */
public class fl implements cm, mk {
    public final Context b;
    public final String c;
    public final File d;
    public final Callable<InputStream> e;
    public final int f;
    public final cm g;
    public lk h;
    public boolean i;

    /* compiled from: AxisPay */
    /* renamed from: fl$a */
    /* loaded from: classes.dex */
    public class a extends cm.a {
        public a(fl flVar, int i) {
            super(i);
        }

        @Override // defpackage.cm.a
        public void d(bm bmVar) {
        }

        @Override // defpackage.cm.a
        public void f(bm bmVar) {
            int i = this.a;
            if (i < 1) {
                bmVar.h(i);
            }
        }

        @Override // defpackage.cm.a
        public void g(bm bmVar, int i, int i2) {
        }
    }

    static {
        C0095z.a();
    }

    public fl(Context context, String str, File file, Callable<InputStream> callable, int i, cm cmVar) {
        this.b = context;
        this.c = str;
        this.d = file;
        this.e = callable;
        this.f = i;
        this.g = cmVar;
    }

    @Override // defpackage.cm
    public synchronized bm G() {
        if (!this.i) {
            r(false);
            this.i = true;
        }
        return this.g.G();
    }

    @Override // defpackage.cm
    public synchronized bm K() {
        if (!this.i) {
            r(true);
            this.i = true;
        }
        return this.g.K();
    }

    public final void b(File file, boolean z) throws IOException {
        ReadableByteChannel newChannel;
        if (this.c != null) {
            newChannel = Channels.newChannel(this.b.getAssets().open(this.c));
        } else if (this.d != null) {
            newChannel = new FileInputStream(this.d).getChannel();
        } else {
            Callable<InputStream> callable = this.e;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel(callable.call());
                } catch (Exception e) {
                    throw new IOException(C0059ao.a(5888), e);
                }
            } else {
                throw new IllegalStateException(C0059ao.a(5889));
            }
        }
        File createTempFile = File.createTempFile(C0059ao.a(5882), C0059ao.a(5883), this.b.getCacheDir());
        createTempFile.deleteOnExit();
        ol.a(newChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException(C0059ao.a(5884) + file.getAbsolutePath());
        }
        k(createTempFile, z);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException(C0059ao.a(5885) + createTempFile.getAbsolutePath() + C0059ao.a(5886) + file.getAbsolutePath() + C0059ao.a(5887));
    }

    @Override // defpackage.cm, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.g.close();
        this.i = false;
    }

    @Override // defpackage.cm
    public String getDatabaseName() {
        return this.g.getDatabaseName();
    }

    @Override // defpackage.mk
    public cm getDelegate() {
        return this.g;
    }

    public final cm j(File file) {
        try {
            int c = nl.c(file);
            im imVar = new im();
            cm.b.a a2 = cm.b.a(this.b);
            a2.c(file.getAbsolutePath());
            a2.b(new a(this, Math.max(c, 1)));
            return imVar.a(a2.a());
        } catch (IOException e) {
            throw new RuntimeException(C0059ao.a(5890), e);
        }
    }

    public final void k(File file, boolean z) {
        bm G;
        lk lkVar = this.h;
        if (lkVar == null || lkVar.f == null) {
            return;
        }
        cm j = j(file);
        try {
            if (z) {
                G = j.K();
            } else {
                G = j.G();
            }
            this.h.f.a(G);
        } finally {
            j.close();
        }
    }

    public void m(lk lkVar) {
        this.h = lkVar;
    }

    public final void r(boolean z) {
        String a2 = C0059ao.a(5891);
        String databaseName = getDatabaseName();
        File databasePath = this.b.getDatabasePath(databaseName);
        lk lkVar = this.h;
        ll llVar = new ll(databaseName, this.b.getFilesDir(), lkVar == null || lkVar.m);
        try {
            llVar.b();
            boolean exists = databasePath.exists();
            String a3 = C0059ao.a(5892);
            if (!exists) {
                try {
                    b(databasePath, z);
                    llVar.c();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(a3, e);
                }
            } else if (this.h == null) {
                llVar.c();
                return;
            } else {
                try {
                    int c = nl.c(databasePath);
                    int i = this.f;
                    if (c == i) {
                        llVar.c();
                        return;
                    } else if (this.h.a(c, i)) {
                        llVar.c();
                        return;
                    } else {
                        if (this.b.deleteDatabase(databaseName)) {
                            try {
                                b(databasePath, z);
                            } catch (IOException e2) {
                                Log.w(a2, a3, e2);
                            }
                        } else {
                            Log.w(a2, C0059ao.a(5893) + databaseName + C0059ao.a(5894));
                        }
                        llVar.c();
                        return;
                    }
                } catch (IOException e3) {
                    Log.w(a2, C0059ao.a(5895), e3);
                    llVar.c();
                    return;
                }
            }
        } catch (Throwable th) {
            llVar.c();
            throw th;
        }
        llVar.c();
        throw th;
    }

    @Override // defpackage.cm
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.g.setWriteAheadLoggingEnabled(z);
    }
}
