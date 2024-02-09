package com.google.android.gms.internal.gtm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzce extends zzbs implements Closeable {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    private static final String zzb = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    private final zzcd zzc;
    private final zzfo zzd;
    private final zzfo zze;

    public zzce(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzd = new zzfo(zzC());
        this.zze = new zzfo(zzC());
        this.zzc = new zzcd(this, zzbvVar.zza(), zzae());
    }

    private final long zzad(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzf().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                    return 0L;
                }
                return 0L;
            } catch (SQLiteException e) {
                zzL("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzae() {
        zzw();
        zzw();
        return "google_analytics_v4.db";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (SQLiteException e) {
            zzK("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            zzK("Error closing database", e2);
        }
    }

    public final void zzZ(List<Long> list) {
        Preconditions.checkNotNull(list);
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("hit_id");
        sb.append(" in (");
        for (int i = 0; i < list.size(); i++) {
            Long l = list.get(i);
            if (l != null && l.longValue() != 0) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(l);
            } else {
                throw new SQLiteException("Invalid hit id");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        try {
            SQLiteDatabase zzf = zzf();
            zzP("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int delete = zzf.delete("hits2", sb2, null);
            if (delete != list.size()) {
                zzU("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
            }
        } catch (SQLiteException e) {
            zzK("Error deleting hits", e);
            throw e;
        }
    }

    public final int zza() {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        if (this.zzd.zzc(86400000L)) {
            this.zzd.zzb();
            zzO("Deleting stale hits (if any)");
            int delete = zzf().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzC().currentTimeMillis() - 2592000000L)});
            zzP("Deleted stale hits, count", Integer.valueOf(delete));
            return delete;
        }
        return 0;
    }

    public final void zzaa() {
        zzW();
        zzf().endTransaction();
    }

    public final void zzab() {
        zzW();
        zzf().setTransactionSuccessful();
    }

    public final boolean zzac() {
        return zzb() == 0;
    }

    public final long zzb() {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzf().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzL("Database error", "SELECT COUNT(*) FROM hits2", e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zzc() {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        return zzad(zzb, null, 0L);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }

    public final long zze(long j, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzW();
        com.google.android.gms.analytics.zzr.zzh();
        return zzad("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{CrashlyticsReportDataCapture.SIGNAL_DEFAULT, str, str2}, 0L);
    }

    @VisibleForTesting
    public final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e) {
            zzS("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.internal.gtm.zzex> zzj(long r17) {
        /*
            r16 = this;
            r11 = r16
            java.lang.String r0 = "hit_id"
            r1 = 0
            int r1 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            r12 = 0
            r13 = 1
            if (r1 < 0) goto Le
            r1 = r13
            goto Lf
        Le:
            r1 = r12
        Lf:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            com.google.android.gms.analytics.zzr.zzh()
            r16.zzW()
            android.database.sqlite.SQLiteDatabase r2 = r16.zzf()
            r1 = 0
            java.lang.String r3 = "hit_time"
            java.lang.String r4 = "hit_string"
            java.lang.String r5 = "hit_url"
            java.lang.String r6 = "hit_app_id"
            java.lang.String[] r4 = new java.lang.String[]{r0, r3, r4, r5, r6}     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            r3[r12] = r0     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            java.lang.String r0 = "hits2"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "%s ASC"
            java.lang.String r9 = java.lang.String.format(r9, r3)     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            java.lang.String r10 = java.lang.Long.toString(r17)     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            r3 = r0
            android.database.Cursor r14 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            r0.<init>()     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            boolean r1 = r14.moveToFirst()     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            if (r1 == 0) goto L8c
        L4d:
            long r7 = r14.getLong(r12)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            long r4 = r14.getLong(r13)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            r1 = 2
            java.lang.String r1 = r14.getString(r1)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            r2 = 3
            java.lang.String r2 = r14.getString(r2)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            r3 = 4
            int r9 = r14.getInt(r3)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            java.util.Map r3 = r11.zzk(r1)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            if (r1 == 0) goto L70
        L6e:
            r6 = r13
            goto L7a
        L70:
            java.lang.String r1 = "http:"
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            if (r1 != 0) goto L79
            goto L6e
        L79:
            r6 = r12
        L7a:
            com.google.android.gms.internal.gtm.zzex r15 = new com.google.android.gms.internal.gtm.zzex     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            r10 = 0
            r1 = r15
            r2 = r16
            r1.<init>(r2, r3, r4, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            r0.add(r15)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            boolean r1 = r14.moveToNext()     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L95
            if (r1 != 0) goto L4d
        L8c:
            if (r14 == 0) goto L91
            r14.close()
        L91:
            return r0
        L92:
            r0 = move-exception
            r1 = r14
            goto La1
        L95:
            r0 = move-exception
            r1 = r14
            goto L9b
        L98:
            r0 = move-exception
            goto La1
        L9a:
            r0 = move-exception
        L9b:
            java.lang.String r2 = "Error loading hits from the database"
            r11.zzK(r2, r0)     // Catch: java.lang.Throwable -> L98
            throw r0     // Catch: java.lang.Throwable -> L98
        La1:
            if (r1 == 0) goto La6
            r1.close()
        La6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzce.zzj(long):java.util.List");
    }

    @VisibleForTesting
    public final Map<String, String> zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                String valueOf = String.valueOf(str);
                str = valueOf.length() != 0 ? "?".concat(valueOf) : new String("?");
            }
            return HttpUtils.parse(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            zzK("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    @VisibleForTesting
    public final Map<String, String> zzl(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            String valueOf = String.valueOf(str);
            return HttpUtils.parse(new URI(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")), "UTF-8");
        } catch (URISyntaxException e) {
            zzK("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        zzW();
        zzf().beginTransaction();
    }

    public final void zzn(long j) {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        ArrayList arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j);
        arrayList.add(valueOf);
        zzP("Deleting hit, id", valueOf);
        zzZ(arrayList);
    }
}
