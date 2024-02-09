package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdv extends SQLiteOpenHelper {
    public final /* synthetic */ zzdw zza;
    private boolean zzb;
    private long zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzdw zzdwVar, Context context, String str) {
        super(context, "gtm_urls.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzdwVar;
        this.zzc = 0L;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        Clock clock;
        Context context;
        String str;
        SQLiteDatabase sQLiteDatabase;
        Clock clock2;
        if (this.zzb) {
            clock2 = this.zza.zzg;
            if (this.zzc + 3600000 > clock2.currentTimeMillis()) {
                throw new SQLiteException("Database creation failed");
            }
        }
        this.zzb = true;
        clock = this.zza.zzg;
        this.zzc = clock.currentTimeMillis();
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            context = this.zza.zzd;
            str = this.zza.zze;
            context.getDatabasePath(str).delete();
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            sQLiteDatabase = super.getWritableDatabase();
        }
        this.zzb = false;
        return sQLiteDatabase;
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
                Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{"gtm_hits"}, null, null, null);
                try {
                    boolean moveToFirst = query.moveToFirst();
                    if (query != null) {
                        query.close();
                    }
                    if (moveToFirst) {
                        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM gtm_hits WHERE 0", null);
                        HashSet hashSet = new HashSet();
                        try {
                            for (String str2 : rawQuery.getColumnNames()) {
                                hashSet.add(str2);
                            }
                            rawQuery.close();
                            if (hashSet.remove("hit_id") && hashSet.remove("hit_url") && hashSet.remove("hit_time") && hashSet.remove("hit_first_send_time")) {
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
                    zzdh.zzc("Error querying for table gtm_hits");
                    if (cursor != null) {
                        cursor.close();
                    }
                    str = zzdw.zza;
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
        str = zzdw.zza;
        sQLiteDatabase.execSQL(str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
