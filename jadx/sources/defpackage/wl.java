package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;

/* compiled from: AxisPay */
/* renamed from: wl  reason: default package */
/* loaded from: classes.dex */
public final class wl {
    public static boolean a(File file) {
        return SQLiteDatabase.deleteDatabase(file);
    }

    public static boolean b(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public static Cursor c(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        return sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
    }

    public static void d(SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
    }
}
