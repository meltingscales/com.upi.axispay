package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* compiled from: AxisPay */
/* renamed from: gm  reason: default package */
/* loaded from: classes.dex */
public class gm implements bm {
    public static final String[] c = new String[0];
    public final SQLiteDatabase b;

    /* compiled from: AxisPay */
    /* renamed from: gm$a */
    /* loaded from: classes.dex */
    public class a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ em a;

        public a(gm gmVar, em emVar) {
            this.a = emVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.j(new jm(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: gm$b */
    /* loaded from: classes.dex */
    public class b implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ em a;

        public b(gm gmVar, em emVar) {
            this.a = emVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.j(new jm(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public gm(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    @Override // defpackage.bm
    public boolean B() {
        return wl.b(this.b);
    }

    @Override // defpackage.bm
    public void D() {
        this.b.setTransactionSuccessful();
    }

    @Override // defpackage.bm
    public void F() {
        this.b.beginTransactionNonExclusive();
    }

    @Override // defpackage.bm
    public Cursor N(String str) {
        return p(new vl(str));
    }

    public boolean b(SQLiteDatabase sQLiteDatabase) {
        return this.b == sQLiteDatabase;
    }

    @Override // defpackage.bm
    public void c() {
        this.b.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    @Override // defpackage.bm
    public void d() {
        this.b.beginTransaction();
    }

    @Override // defpackage.bm
    public List<Pair<String, String>> g() {
        return this.b.getAttachedDbs();
    }

    @Override // defpackage.bm
    public String getPath() {
        return this.b.getPath();
    }

    @Override // defpackage.bm
    public void h(int i) {
        this.b.setVersion(i);
    }

    @Override // defpackage.bm
    public void i(String str) throws SQLException {
        this.b.execSQL(str);
    }

    @Override // defpackage.bm
    public boolean isOpen() {
        return this.b.isOpen();
    }

    @Override // defpackage.bm
    public fm n(String str) {
        return new km(this.b.compileStatement(str));
    }

    @Override // defpackage.bm
    public Cursor p(em emVar) {
        return this.b.rawQueryWithFactory(new a(this, emVar), emVar.b(), c, null);
    }

    @Override // defpackage.bm
    public Cursor u(em emVar, CancellationSignal cancellationSignal) {
        return wl.c(this.b, emVar.b(), c, null, cancellationSignal, new b(this, emVar));
    }

    @Override // defpackage.bm
    public boolean v() {
        return this.b.inTransaction();
    }
}
