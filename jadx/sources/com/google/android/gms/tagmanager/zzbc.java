package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzbc extends SQLiteOpenHelper {
    public final /* synthetic */ zzbe zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzbe zzbeVar, Context context, String str) {
        super(context, "google_tagmanager.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzbeVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        Context context;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            context = this.zza.zzc;
            context.getDatabasePath("google_tagmanager.db").delete();
            sQLiteDatabase = null;
        }
        return sQLiteDatabase == null ? super.getWritableDatabase() : sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzbv.zza(sQLiteDatabase.getPath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        Cursor cursor = null;
        if (Build.VERSION.SDK_INT < 15) {
            try {
                sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null).moveToFirst();
            } finally {
            }
        }
        try {
            try {
                Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{"datalayer"}, null, null, null);
                try {
                    boolean moveToFirst = query.moveToFirst();
                    if (query != null) {
                        query.close();
                    }
                    if (moveToFirst) {
                        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
                        HashSet hashSet = new HashSet();
                        try {
                            for (String str2 : rawQuery.getColumnNames()) {
                                hashSet.add(str2);
                            }
                            rawQuery.close();
                            if (hashSet.remove("key") && hashSet.remove("value") && hashSet.remove("ID") && hashSet.remove("expires")) {
                                if (!hashSet.isEmpty()) {
                                    throw new SQLiteException("Database has extra columns");
                                }
                                return;
                            }
                            throw new SQLiteException("Database column missing");
                        } finally {
                        }
                    }
                } catch (SQLiteException unused) {
                    cursor = query;
                    zzdh.zzc("Error querying for table datalayer");
                    if (cursor != null) {
                        cursor.close();
                    }
                    str = zzbe.zza;
                    sQLiteDatabase.execSQL(str);
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException unused2) {
        }
        str = zzbe.zza;
        sQLiteDatabase.execSQL(str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
