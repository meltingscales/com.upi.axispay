package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import defpackage.cm;
import java.io.File;

/* compiled from: AxisPay */
/* renamed from: hm  reason: default package */
/* loaded from: classes.dex */
public class hm implements cm {
    public final Context b;
    public final String c;
    public final cm.a d;
    public final boolean e;
    public final Object f = new Object();
    public a g;
    public boolean h;

    /* compiled from: AxisPay */
    /* renamed from: hm$a */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {
        public final gm[] b;
        public final cm.a c;
        public boolean d;

        /* compiled from: AxisPay */
        /* renamed from: hm$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0025a implements DatabaseErrorHandler {
            public final /* synthetic */ cm.a a;
            public final /* synthetic */ gm[] b;

            public C0025a(cm.a aVar, gm[] gmVarArr) {
                this.a = aVar;
                this.b = gmVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.a.c(a.k(this.b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, gm[] gmVarArr, cm.a aVar) {
            super(context, str, null, aVar.a, new C0025a(aVar, gmVarArr));
            this.c = aVar;
            this.b = gmVarArr;
        }

        public static gm k(gm[] gmVarArr, SQLiteDatabase sQLiteDatabase) {
            gm gmVar = gmVarArr[0];
            if (gmVar == null || !gmVar.b(sQLiteDatabase)) {
                gmVarArr[0] = new gm(sQLiteDatabase);
            }
            return gmVarArr[0];
        }

        public synchronized bm b() {
            this.d = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.d) {
                close();
                return b();
            }
            return j(readableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.b[0] = null;
        }

        public gm j(SQLiteDatabase sQLiteDatabase) {
            return k(this.b, sQLiteDatabase);
        }

        public synchronized bm m() {
            this.d = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.d) {
                close();
                return m();
            }
            return j(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.c.b(j(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.c.d(j(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.d = true;
            this.c.e(j(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.d) {
                return;
            }
            this.c.f(j(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.d = true;
            this.c.g(j(sQLiteDatabase), i, i2);
        }
    }

    public hm(Context context, String str, cm.a aVar, boolean z) {
        this.b = context;
        this.c = str;
        this.d = aVar;
        this.e = z;
    }

    @Override // defpackage.cm
    public bm G() {
        return b().b();
    }

    @Override // defpackage.cm
    public bm K() {
        return b().m();
    }

    public final a b() {
        a aVar;
        synchronized (this.f) {
            if (this.g == null) {
                gm[] gmVarArr = new gm[1];
                int i = Build.VERSION.SDK_INT;
                if (i >= 23 && this.c != null && this.e) {
                    this.g = new a(this.b, new File(yl.a(this.b), this.c).getAbsolutePath(), gmVarArr, this.d);
                } else {
                    this.g = new a(this.b, this.c, gmVarArr, this.d);
                }
                if (i >= 16) {
                    wl.d(this.g, this.h);
                }
            }
            aVar = this.g;
        }
        return aVar;
    }

    @Override // defpackage.cm, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b().close();
    }

    @Override // defpackage.cm
    public String getDatabaseName() {
        return this.c;
    }

    @Override // defpackage.cm
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f) {
            a aVar = this.g;
            if (aVar != null) {
                wl.d(aVar, z);
            }
            this.h = z;
        }
    }
}
