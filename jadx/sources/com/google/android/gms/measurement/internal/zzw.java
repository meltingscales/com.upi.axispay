package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.measurement.zziv;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzw extends zzfs {
    private static final String[] zzed = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    private static final String[] zzee = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzef = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;"};
    private static final String[] zzeg = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzeh = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzei = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzz zzej;
    private final zzfo zzek;

    public zzw(zzft zzftVar) {
        super(zzftVar);
        this.zzek = new zzfo(zzz());
        this.zzej = new zzz(this, getContext(), "google_app_measurement.db");
    }

    private final long zza(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = getWritableDatabase().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzad().zzda().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean zzcg() {
        return getContext().getDatabasePath("google_app_measurement.db").exists();
    }

    public final void beginTransaction() {
        zzah();
        getWritableDatabase().beginTransaction();
    }

    public final void endTransaction() {
        zzah();
        getWritableDatabase().endTransaction();
    }

    @VisibleForTesting
    public final SQLiteDatabase getWritableDatabase() {
        zzq();
        try {
            return this.zzej.getWritableDatabase();
        } catch (SQLiteException e) {
            zzad().zzdd().zza("Error opening database", e);
            throw e;
        }
    }

    public final void setTransactionSuccessful() {
        zzah();
        getWritableDatabase().setTransactionSuccessful();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzgc> zzad(java.lang.String r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            r13.zzq()
            r13.zzah()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.getWritableDatabase()     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L84
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L84
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L84
            r12 = 0
            r6[r12] = r14     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L84
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L84
            boolean r3 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            if (r3 != 0) goto L3f
            if (r2 == 0) goto L3e
            r2.close()
        L3e:
            return r0
        L3f:
            java.lang.String r7 = r2.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            java.lang.String r3 = r2.getString(r11)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            if (r3 != 0) goto L4b
            java.lang.String r3 = ""
        L4b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            r3 = 3
            java.lang.Object r10 = r13.zza(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            if (r10 != 0) goto L6a
            com.google.android.gms.measurement.internal.zzau r3 = r13.zzad()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            com.google.android.gms.measurement.internal.zzaw r3 = r3.zzda()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzau.zzao(r14)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            r3.zza(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            goto L74
        L6a:
            com.google.android.gms.measurement.internal.zzgc r3 = new com.google.android.gms.measurement.internal.zzgc     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            r0.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
        L74:
            boolean r3 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> L9d
            if (r3 != 0) goto L3f
            if (r2 == 0) goto L7f
            r2.close()
        L7f:
            return r0
        L80:
            r0 = move-exception
            goto L86
        L82:
            r14 = move-exception
            goto L9f
        L84:
            r0 = move-exception
            r2 = r1
        L86:
            com.google.android.gms.measurement.internal.zzau r3 = r13.zzad()     // Catch: java.lang.Throwable -> L9d
            com.google.android.gms.measurement.internal.zzaw r3 = r3.zzda()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzau.zzao(r14)     // Catch: java.lang.Throwable -> L9d
            r3.zza(r4, r14, r0)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L9c
            r2.close()
        L9c:
            return r1
        L9d:
            r14 = move-exception
            r1 = r2
        L9f:
            if (r1 == 0) goto La4
            r1.close()
        La4:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zzad(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011b A[Catch: SQLiteException -> 0x01bb, all -> 0x01e4, TryCatch #1 {all -> 0x01e4, blocks: (B:11:0x006b, B:13:0x00cc, B:18:0x00d6, B:22:0x0120, B:26:0x0157, B:28:0x0162, B:33:0x016c, B:35:0x0177, B:39:0x017f, B:43:0x0198, B:45:0x01a4, B:42:0x0194, B:25:0x0153, B:21:0x011b, B:59:0x01cd), top: B:68:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0153 A[Catch: SQLiteException -> 0x01bb, all -> 0x01e4, TryCatch #1 {all -> 0x01e4, blocks: (B:11:0x006b, B:13:0x00cc, B:18:0x00d6, B:22:0x0120, B:26:0x0157, B:28:0x0162, B:33:0x016c, B:35:0x0177, B:39:0x017f, B:43:0x0198, B:45:0x01a4, B:42:0x0194, B:25:0x0153, B:21:0x011b, B:59:0x01cd), top: B:68:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0177 A[Catch: SQLiteException -> 0x01bb, all -> 0x01e4, TryCatch #1 {all -> 0x01e4, blocks: (B:11:0x006b, B:13:0x00cc, B:18:0x00d6, B:22:0x0120, B:26:0x0157, B:28:0x0162, B:33:0x016c, B:35:0x0177, B:39:0x017f, B:43:0x0198, B:45:0x01a4, B:42:0x0194, B:25:0x0153, B:21:0x011b, B:59:0x01cd), top: B:68:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0194 A[Catch: SQLiteException -> 0x01bb, all -> 0x01e4, TryCatch #1 {all -> 0x01e4, blocks: (B:11:0x006b, B:13:0x00cc, B:18:0x00d6, B:22:0x0120, B:26:0x0157, B:28:0x0162, B:33:0x016c, B:35:0x0177, B:39:0x017f, B:43:0x0198, B:45:0x01a4, B:42:0x0194, B:25:0x0153, B:21:0x011b, B:59:0x01cd), top: B:68:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a4 A[Catch: SQLiteException -> 0x01bb, all -> 0x01e4, TRY_LEAVE, TryCatch #1 {all -> 0x01e4, blocks: (B:11:0x006b, B:13:0x00cc, B:18:0x00d6, B:22:0x0120, B:26:0x0157, B:28:0x0162, B:33:0x016c, B:35:0x0177, B:39:0x017f, B:43:0x0198, B:45:0x01a4, B:42:0x0194, B:25:0x0153, B:21:0x011b, B:59:0x01cd), top: B:68:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzg zzae(java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zzae(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    public final long zzaf(String str) {
        Preconditions.checkNotEmpty(str);
        zzq();
        zzah();
        try {
            return getWritableDatabase().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zzaf().zzb(str, zzal.zzgs))))});
        } catch (SQLiteException e) {
            zzad().zzda().zza("Error deleting over the limit events. appId", zzau.zzao(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] zzag(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            r10.zzq()
            r10.zzah()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getWritableDatabase()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56
            r9 = 0
            r5[r9] = r11     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            if (r2 != 0) goto L31
            if (r1 == 0) goto L30
            r1.close()
        L30:
            return r0
        L31:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            if (r3 == 0) goto L4c
            com.google.android.gms.measurement.internal.zzau r3 = r10.zzad()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            com.google.android.gms.measurement.internal.zzaw r3 = r3.zzda()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzau.zzao(r11)     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            r3.zza(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
        L4c:
            if (r1 == 0) goto L51
            r1.close()
        L51:
            return r2
        L52:
            r2 = move-exception
            goto L58
        L54:
            r11 = move-exception
            goto L71
        L56:
            r2 = move-exception
            r1 = r0
        L58:
            com.google.android.gms.measurement.internal.zzau r3 = r10.zzad()     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.measurement.internal.zzaw r3 = r3.zzda()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzau.zzao(r11)     // Catch: java.lang.Throwable -> L6f
            r3.zza(r4, r11, r2)     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L6e
            r1.close()
        L6e:
            return r0
        L6f:
            r11 = move-exception
            r0 = r1
        L71:
            if (r0 == 0) goto L76
            r0.close()
        L76:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zzag(java.lang.String):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzbt.zzf> zzah(java.lang.String r12) {
        /*
            r11 = this;
            r11.zzah()
            r11.zzq()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.getWritableDatabase()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r10 = 0
            r4[r10] = r12     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            if (r1 != 0) goto L33
            if (r0 == 0) goto L32
            r0.close()
        L32:
            return r8
        L33:
            o4 r1 = new o4     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
        L38:
            int r2 = r0.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            byte[] r3 = r0.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.zzem r4 = com.google.android.gms.internal.measurement.zzem.zzlt()     // Catch: java.io.IOException -> L50 android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            com.google.android.gms.internal.measurement.zzbt$zzf r3 = com.google.android.gms.internal.measurement.zzbt.zzf.zza(r3, r4)     // Catch: java.io.IOException -> L50 android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            goto L66
        L50:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzau r4 = r11.zzad()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.zzaw r4 = r4.zzda()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzau.zzao(r12)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            r4.zza(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
        L66:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L8f
            if (r2 != 0) goto L38
            if (r0 == 0) goto L71
            r0.close()
        L71:
            return r1
        L72:
            r1 = move-exception
            goto L78
        L74:
            r12 = move-exception
            goto L91
        L76:
            r1 = move-exception
            r0 = r8
        L78:
            com.google.android.gms.measurement.internal.zzau r2 = r11.zzad()     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.zzaw r2 = r2.zzda()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzau.zzao(r12)     // Catch: java.lang.Throwable -> L8f
            r2.zza(r3, r12, r1)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L8e
            r0.close()
        L8e:
            return r8
        L8f:
            r12 = move-exception
            r8 = r0
        L91:
            if (r8 == 0) goto L96
            r8.close()
        L96:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zzah(java.lang.String):java.util.Map");
    }

    public final long zzai(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final boolean zzak() {
        return false;
    }

    public final List<zzr> zzb(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzq();
        zzah();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zzb(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzby() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.getWritableDatabase()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L29
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L2b
        L24:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3f
        L29:
            r2 = move-exception
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.zzau r3 = r6.zzad()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.zzaw r3 = r3.zzda()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zza(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            r1 = move-exception
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zzby():java.lang.String");
    }

    public final boolean zzbz() {
        return zza("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0123: MOVE  (r16 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:61:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzaf zzc(java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzaf");
    }

    public final void zzca() {
        int delete;
        zzq();
        zzah();
        if (zzcg()) {
            long j = zzae().zzle.get();
            long elapsedRealtime = zzz().elapsedRealtime();
            if (Math.abs(elapsedRealtime - j) > zzal.zzhb.get(null).longValue()) {
                zzae().zzle.set(elapsedRealtime);
                zzq();
                zzah();
                if (!zzcg() || (delete = getWritableDatabase().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzz().currentTimeMillis()), String.valueOf(zzt.zzbs())})) <= 0) {
                    return;
                }
                zzad().zzdi().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final long zzcb() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long zzcc() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final boolean zzcd() {
        return zza("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzce() {
        return zza("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long zzcf() {
        Cursor cursor = null;
        try {
            try {
                cursor = getWritableDatabase().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzad().zzda().zza("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzd(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzq();
        zzah();
        try {
            zzad().zzdi().zza("Deleted user attribute rows", Integer.valueOf(getWritableDatabase().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            zzad().zzda().zza("Error deleting user attribute. appId", zzau.zzao(str), zzaa().zzan(str2), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzgc zze(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r19)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            r18.zzq()
            r18.zzah()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            r1 = 0
            r14[r1] = r19     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            r2 = 1
            r14[r2] = r8     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            boolean r3 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L7a
            if (r3 != 0) goto L3f
            if (r10 == 0) goto L3e
            r10.close()
        L3e:
            return r9
        L3f:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L7a
            r11 = r18
            java.lang.Object r7 = r11.zza(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            java.lang.String r3 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            com.google.android.gms.measurement.internal.zzgc r0 = new com.google.android.gms.measurement.internal.zzgc     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            if (r1 == 0) goto L6e
            com.google.android.gms.measurement.internal.zzau r1 = r18.zzad()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            com.google.android.gms.measurement.internal.zzaw r1 = r1.zzda()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzau.zzao(r19)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            r1.zza(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
        L6e:
            if (r10 == 0) goto L73
            r10.close()
        L73:
            return r0
        L74:
            r0 = move-exception
            goto L86
        L76:
            r0 = move-exception
            r11 = r18
            goto La6
        L7a:
            r0 = move-exception
            r11 = r18
            goto L86
        L7e:
            r0 = move-exception
            r11 = r18
            goto La7
        L82:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L86:
            com.google.android.gms.measurement.internal.zzau r1 = r18.zzad()     // Catch: java.lang.Throwable -> La5
            com.google.android.gms.measurement.internal.zzaw r1 = r1.zzda()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzau.zzao(r19)     // Catch: java.lang.Throwable -> La5
            com.google.android.gms.measurement.internal.zzas r4 = r18.zzaa()     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = r4.zzan(r8)     // Catch: java.lang.Throwable -> La5
            r1.zza(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> La5
            if (r10 == 0) goto La4
            r10.close()
        La4:
            return r9
        La5:
            r0 = move-exception
        La6:
            r9 = r10
        La7:
            if (r9 == 0) goto Lac
            r9.close()
        Lac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zze(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzgc");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzr zzf(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zzf(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzr");
    }

    public final int zzg(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzq();
        zzah();
        try {
            return getWritableDatabase().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzad().zzda().zza("Error deleting conditional property", zzau.zzao(str), zzaa().zzan(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzby>> zzh(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzah()
            r12.zzq()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            o4 r0 = new o4
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.getWritableDatabase()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L93
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L93
            r10 = 0
            r5[r10] = r13     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L93
            r11 = 1
            r5[r11] = r14     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L93
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L93
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            if (r1 != 0) goto L42
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            if (r14 == 0) goto L41
            r14.close()
        L41:
            return r13
        L42:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            com.google.android.gms.internal.measurement.zzby r2 = new com.google.android.gms.internal.measurement.zzby     // Catch: java.io.IOException -> L71 android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            r2.<init>()     // Catch: java.io.IOException -> L71 android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            com.google.android.gms.internal.measurement.zziv r1 = com.google.android.gms.internal.measurement.zziv.zza(r2, r1)     // Catch: java.io.IOException -> L71 android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            com.google.android.gms.internal.measurement.zzby r1 = (com.google.android.gms.internal.measurement.zzby) r1     // Catch: java.io.IOException -> L71 android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            if (r3 != 0) goto L6d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
        L6d:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            goto L83
        L71:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzau r2 = r12.zzad()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            com.google.android.gms.measurement.internal.zzaw r2 = r2.zzda()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzau.zzao(r13)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            r2.zza(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
        L83:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            if (r1 != 0) goto L42
            if (r14 == 0) goto L8e
            r14.close()
        L8e:
            return r0
        L8f:
            r0 = move-exception
            goto L95
        L91:
            r13 = move-exception
            goto Lae
        L93:
            r0 = move-exception
            r14 = r9
        L95:
            com.google.android.gms.measurement.internal.zzau r1 = r12.zzad()     // Catch: java.lang.Throwable -> Lac
            com.google.android.gms.measurement.internal.zzaw r1 = r1.zzda()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzau.zzao(r13)     // Catch: java.lang.Throwable -> Lac
            r1.zza(r2, r13, r0)     // Catch: java.lang.Throwable -> Lac
            if (r14 == 0) goto Lab
            r14.close()
        Lab:
            return r9
        Lac:
            r13 = move-exception
            r9 = r14
        Lae:
            if (r9 == 0) goto Lb3
            r9.close()
        Lb3:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zzh(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzcb>> zzi(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzah()
            r12.zzq()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            o4 r0 = new o4
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.getWritableDatabase()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L93
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L93
            r10 = 0
            r5[r10] = r13     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L93
            r11 = 1
            r5[r11] = r14     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L93
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L93
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            if (r1 != 0) goto L42
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            if (r14 == 0) goto L41
            r14.close()
        L41:
            return r13
        L42:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            com.google.android.gms.internal.measurement.zzcb r2 = new com.google.android.gms.internal.measurement.zzcb     // Catch: java.io.IOException -> L71 android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            r2.<init>()     // Catch: java.io.IOException -> L71 android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            com.google.android.gms.internal.measurement.zziv r1 = com.google.android.gms.internal.measurement.zziv.zza(r2, r1)     // Catch: java.io.IOException -> L71 android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            com.google.android.gms.internal.measurement.zzcb r1 = (com.google.android.gms.internal.measurement.zzcb) r1     // Catch: java.io.IOException -> L71 android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            if (r3 != 0) goto L6d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
        L6d:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            goto L83
        L71:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzau r2 = r12.zzad()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            com.google.android.gms.measurement.internal.zzaw r2 = r2.zzda()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzau.zzao(r13)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            r2.zza(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
        L83:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L8f java.lang.Throwable -> Lac
            if (r1 != 0) goto L42
            if (r14 == 0) goto L8e
            r14.close()
        L8e:
            return r0
        L8f:
            r0 = move-exception
            goto L95
        L91:
            r13 = move-exception
            goto Lae
        L93:
            r0 = move-exception
            r14 = r9
        L95:
            com.google.android.gms.measurement.internal.zzau r1 = r12.zzad()     // Catch: java.lang.Throwable -> Lac
            com.google.android.gms.measurement.internal.zzaw r1 = r1.zzda()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzau.zzao(r13)     // Catch: java.lang.Throwable -> Lac
            r1.zza(r2, r13, r0)     // Catch: java.lang.Throwable -> Lac
            if (r14 == 0) goto Lab
            r14.close()
        Lab:
            return r9
        Lac:
            r13 = move-exception
            r9 = r14
        Lae:
            if (r9 == 0) goto Lb3
            r9.close()
        Lb3:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zzi(java.lang.String, java.lang.String):java.util.Map");
    }

    @VisibleForTesting
    public final long zzj(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzq();
        zzah();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        long j = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
                sb.append("select ");
                sb.append(str2);
                sb.append(" from app2 where app_id=?");
                long zza = zza(sb.toString(), new String[]{str}, -1L);
                if (zza == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (writableDatabase.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzad().zzda().zza("Failed to insert column (got -1). appId", zzau.zzao(str), str2);
                        return -1L;
                    }
                    zza = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + zza));
                    if (writableDatabase.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzad().zzda().zza("Failed to update column (got 0). appId", zzau.zzao(str), str2);
                        return -1L;
                    }
                    writableDatabase.setTransactionSuccessful();
                    return zza;
                } catch (SQLiteException e) {
                    e = e;
                    j = zza;
                    zzad().zzda().zza("Error inserting column. appId", zzau.zzao(str), str2, e);
                    writableDatabase.endTransaction();
                    return j;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzu(long r5) {
        /*
            r4 = this;
            r4.zzq()
            r4.zzah()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.zzau r6 = r4.zzad()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzaw r6 = r6.zzdi()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.zzaq(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L33
            r5.close()
        L33:
            return r0
        L34:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L3d
            r5.close()
        L3d:
            return r6
        L3e:
            r6 = move-exception
            goto L44
        L40:
            r6 = move-exception
            goto L59
        L42:
            r6 = move-exception
            r5 = r0
        L44:
            com.google.android.gms.measurement.internal.zzau r1 = r4.zzad()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzaw r1 = r1.zzda()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Error selecting expired configs"
            r1.zza(r2, r6)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L56
            r5.close()
        L56:
            return r0
        L57:
            r6 = move-exception
            r0 = r5
        L59:
            if (r0 == 0) goto L5e
            r0.close()
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zzu(long):java.lang.String");
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = getWritableDatabase().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzad().zzda().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        zzad().zzda().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzr> zzb(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zzb(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void zza(zzaf zzafVar) {
        Preconditions.checkNotNull(zzafVar);
        zzq();
        zzah();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzafVar.zzcf);
        contentValues.put("name", zzafVar.name);
        contentValues.put("lifetime_count", Long.valueOf(zzafVar.zzfe));
        contentValues.put("current_bundle_count", Long.valueOf(zzafVar.zzff));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzafVar.zzfg));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzafVar.zzfh));
        contentValues.put("last_bundled_day", zzafVar.zzfi);
        contentValues.put("last_sampled_complex_event_id", zzafVar.zzfj);
        contentValues.put("last_sampling_rate", zzafVar.zzfk);
        Boolean bool = zzafVar.zzfl;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (getWritableDatabase().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzad().zzda().zza("Failed to insert/update event aggregates (got -1). appId", zzau.zzao(zzafVar.zzcf));
            }
        } catch (SQLiteException e) {
            zzad().zzda().zza("Error storing event aggregates. appId", zzau.zzao(zzafVar.zzcf), e);
        }
    }

    public final boolean zza(zzgc zzgcVar) {
        Preconditions.checkNotNull(zzgcVar);
        zzq();
        zzah();
        if (zze(zzgcVar.zzcf, zzgcVar.name) == null) {
            if (zzgd.zzbm(zzgcVar.name)) {
                if (zza("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzgcVar.zzcf}) >= 25) {
                    return false;
                }
            } else if (zzaf().zze(zzgcVar.zzcf, zzal.zzin)) {
                if (!"_npa".equals(zzgcVar.name) && zza("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzgcVar.zzcf, zzgcVar.origin}) >= 25) {
                    return false;
                }
            } else if (zza("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzgcVar.zzcf, zzgcVar.origin}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzgcVar.zzcf);
        contentValues.put("origin", zzgcVar.origin);
        contentValues.put("name", zzgcVar.name);
        contentValues.put("set_timestamp", Long.valueOf(zzgcVar.zzsx));
        zza(contentValues, "value", zzgcVar.value);
        try {
            if (getWritableDatabase().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzad().zzda().zza("Failed to insert/update user property (got -1). appId", zzau.zzao(zzgcVar.zzcf));
            }
        } catch (SQLiteException e) {
            zzad().zzda().zza("Error storing user property. appId", zzau.zzao(zzgcVar.zzcf), e);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
        zzad().zzda().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzgc> zza(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zza(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean zza(zzr zzrVar) {
        Preconditions.checkNotNull(zzrVar);
        zzq();
        zzah();
        if (zze(zzrVar.packageName, zzrVar.zzdv.name) != null || zza("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzrVar.packageName}) < 1000) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzrVar.packageName);
            contentValues.put("origin", zzrVar.origin);
            contentValues.put("name", zzrVar.zzdv.name);
            zza(contentValues, "value", zzrVar.zzdv.getValue());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzrVar.active));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzrVar.triggerEventName);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzrVar.triggerTimeout));
            zzab();
            contentValues.put("timed_out_event", zzgd.zza(zzrVar.zzdw));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzrVar.creationTimestamp));
            zzab();
            contentValues.put("triggered_event", zzgd.zza(zzrVar.zzdx));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzrVar.zzdv.zzsx));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzrVar.timeToLive));
            zzab();
            contentValues.put("expired_event", zzgd.zza(zzrVar.zzdy));
            try {
                if (getWritableDatabase().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                    zzad().zzda().zza("Failed to insert/update conditional user property (got -1)", zzau.zzao(zzrVar.packageName));
                }
            } catch (SQLiteException e) {
                zzad().zzda().zza("Error storing conditional user property", zzau.zzao(zzrVar.packageName), e);
            }
            return true;
        }
        return false;
    }

    public final void zza(zzg zzgVar) {
        Preconditions.checkNotNull(zzgVar);
        zzq();
        zzah();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzgVar.zzan());
        contentValues.put("app_instance_id", zzgVar.getAppInstanceId());
        contentValues.put("gmp_app_id", zzgVar.getGmpAppId());
        contentValues.put("resettable_device_id_hash", zzgVar.zzap());
        contentValues.put("last_bundle_index", Long.valueOf(zzgVar.zzay()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzgVar.zzaq()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzgVar.zzar()));
        contentValues.put("app_version", zzgVar.zzas());
        contentValues.put("app_store", zzgVar.zzau());
        contentValues.put("gmp_version", Long.valueOf(zzgVar.zzav()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzgVar.zzaw()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzgVar.isMeasurementEnabled()));
        contentValues.put("day", Long.valueOf(zzgVar.zzbc()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzgVar.zzbd()));
        contentValues.put("daily_events_count", Long.valueOf(zzgVar.zzbe()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzgVar.zzbf()));
        contentValues.put("config_fetched_time", Long.valueOf(zzgVar.zzaz()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzgVar.zzba()));
        contentValues.put("app_version_int", Long.valueOf(zzgVar.zzat()));
        contentValues.put("firebase_instance_id", zzgVar.getFirebaseInstanceId());
        contentValues.put("daily_error_events_count", Long.valueOf(zzgVar.zzbh()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzgVar.zzbg()));
        contentValues.put("health_monitor_sample", zzgVar.zzbi());
        contentValues.put("android_id", Long.valueOf(zzgVar.zzbk()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzgVar.zzbl()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(zzgVar.zzbm()));
        contentValues.put("admob_app_id", zzgVar.zzao());
        contentValues.put("dynamite_version", Long.valueOf(zzgVar.zzax()));
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase.update("apps", contentValues, "app_id = ?", new String[]{zzgVar.zzan()}) == 0 && writableDatabase.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzad().zzda().zza("Failed to insert/update app (got -1). appId", zzau.zzao(zzgVar.zzan()));
            }
        } catch (SQLiteException e) {
            zzad().zzda().zza("Error storing app. appId", zzau.zzao(zzgVar.zzan()), e);
        }
    }

    public final zzx zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        zzq();
        zzah();
        String[] strArr = {str};
        zzx zzxVar = new zzx();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                Cursor query = writableDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    zzad().zzdd().zza("Not updating daily counts, app is not known. appId", zzau.zzao(str));
                    if (query != null) {
                        query.close();
                    }
                    return zzxVar;
                }
                if (query.getLong(0) == j) {
                    zzxVar.zzem = query.getLong(1);
                    zzxVar.zzel = query.getLong(2);
                    zzxVar.zzen = query.getLong(3);
                    zzxVar.zzeo = query.getLong(4);
                    zzxVar.zzep = query.getLong(5);
                }
                if (z) {
                    zzxVar.zzem++;
                }
                if (z2) {
                    zzxVar.zzel++;
                }
                if (z3) {
                    zzxVar.zzen++;
                }
                if (z4) {
                    zzxVar.zzeo++;
                }
                if (z5) {
                    zzxVar.zzep++;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(zzxVar.zzel));
                contentValues.put("daily_events_count", Long.valueOf(zzxVar.zzem));
                contentValues.put("daily_conversions_count", Long.valueOf(zzxVar.zzen));
                contentValues.put("daily_error_events_count", Long.valueOf(zzxVar.zzeo));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzxVar.zzep));
                writableDatabase.update("apps", contentValues, "app_id=?", strArr);
                if (query != null) {
                    query.close();
                }
                return zzxVar;
            } catch (SQLiteException e) {
                zzad().zzda().zza("Error updating daily counts. appId", zzau.zzao(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return zzxVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean zza(com.google.android.gms.internal.measurement.zzch zzchVar, boolean z) {
        zzq();
        zzah();
        Preconditions.checkNotNull(zzchVar);
        Preconditions.checkNotEmpty(zzchVar.zzcf);
        Preconditions.checkNotNull(zzchVar.zzxs);
        zzca();
        long currentTimeMillis = zzz().currentTimeMillis();
        if (zzchVar.zzxs.longValue() < currentTimeMillis - zzt.zzbs() || zzchVar.zzxs.longValue() > zzt.zzbs() + currentTimeMillis) {
            zzad().zzdd().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzau.zzao(zzchVar.zzcf), Long.valueOf(currentTimeMillis), zzchVar.zzxs);
        }
        try {
            byte[] zzc = zzdm().zzc(zziv.zzb(zzchVar));
            zzad().zzdi().zza("Saving bundle, size", Integer.valueOf(zzc.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzchVar.zzcf);
            contentValues.put("bundle_end_timestamp", zzchVar.zzxs);
            contentValues.put("data", zzc);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            Integer num = zzchVar.zzyp;
            if (num != null) {
                contentValues.put("retry_count", num);
            }
            try {
                if (getWritableDatabase().insert("queue", null, contentValues) == -1) {
                    zzad().zzda().zza("Failed to insert bundle (got -1). appId", zzau.zzao(zzchVar.zzcf));
                    return false;
                }
                return true;
            } catch (SQLiteException e) {
                zzad().zzda().zza("Error storing bundle. appId", zzau.zzao(zzchVar.zzcf), e);
                return false;
            }
        } catch (IOException e2) {
            zzad().zzda().zza("Data loss. Failed to serialize bundle. appId", zzau.zzao(zzchVar.zzcf), e2);
            return false;
        }
    }

    public final List<Pair<com.google.android.gms.internal.measurement.zzch, Long>> zza(String str, int i, int i2) {
        byte[] zzb;
        zzq();
        zzah();
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = getWritableDatabase().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!query.moveToFirst()) {
                    List<Pair<com.google.android.gms.internal.measurement.zzch, Long>> emptyList = Collections.emptyList();
                    if (query != null) {
                        query.close();
                    }
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                do {
                    long j = query.getLong(0);
                    try {
                        zzb = zzdm().zzb(query.getBlob(1));
                    } catch (IOException e) {
                        zzad().zzda().zza("Failed to unzip queued bundle. appId", zzau.zzao(str), e);
                    }
                    if (!arrayList.isEmpty() && zzb.length + i3 > i2) {
                        break;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzch zzf = com.google.android.gms.internal.measurement.zzch.zzf(zzb);
                        if (!query.isNull(2)) {
                            zzf.zzyp = Integer.valueOf(query.getInt(2));
                        }
                        i3 += zzb.length;
                        arrayList.add(Pair.create(zzf, Long.valueOf(j)));
                    } catch (IOException e2) {
                        zzad().zzda().zza("Failed to merge queued bundle. appId", zzau.zzao(str), e2);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (i3 <= i2);
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e3) {
                zzad().zzda().zza("Error querying bundles. appId", zzau.zzao(str), e3);
                List<Pair<com.google.android.gms.internal.measurement.zzch, Long>> emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    public final void zza(List<Long> list) {
        zzq();
        zzah();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzcg()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zza(sb3.toString(), (String[]) null) > 0) {
                zzad().zzdd().zzaq("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                writableDatabase.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                zzad().zzda().zza("Error incrementing retry count. error", e);
            }
        }
    }

    public final void zza(String str, com.google.android.gms.internal.measurement.zzbx[] zzbxVarArr) {
        boolean z;
        boolean z2;
        zzah();
        zzq();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbxVarArr);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            zzah();
            zzq();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase writableDatabase2 = getWritableDatabase();
            boolean z3 = true;
            writableDatabase2.delete("property_filters", "app_id=?", new String[]{str});
            writableDatabase2.delete("event_filters", "app_id=?", new String[]{str});
            int length = zzbxVarArr.length;
            int i = 0;
            while (i < length) {
                com.google.android.gms.internal.measurement.zzbx zzbxVar = zzbxVarArr[i];
                zzah();
                zzq();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzbxVar);
                Preconditions.checkNotNull(zzbxVar.zzvw);
                Preconditions.checkNotNull(zzbxVar.zzvv);
                Integer num = zzbxVar.zzvu;
                if (num == null) {
                    zzad().zzdd().zza("Audience with no ID. appId", zzau.zzao(str));
                    z2 = z3;
                } else {
                    int intValue = num.intValue();
                    com.google.android.gms.internal.measurement.zzby[] zzbyVarArr = zzbxVar.zzvw;
                    int length2 = zzbyVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            if (zzbyVarArr[i2].zzwa == null) {
                                zzad().zzdd().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzau.zzao(str), zzbxVar.zzvu);
                                break;
                            }
                            i2++;
                        } else {
                            com.google.android.gms.internal.measurement.zzcb[] zzcbVarArr = zzbxVar.zzvv;
                            int length3 = zzcbVarArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length3) {
                                    if (zzcbVarArr[i3].zzwa == null) {
                                        zzad().zzdd().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzau.zzao(str), zzbxVar.zzvu);
                                        break;
                                    }
                                    i3++;
                                } else {
                                    com.google.android.gms.internal.measurement.zzby[] zzbyVarArr2 = zzbxVar.zzvw;
                                    int length4 = zzbyVarArr2.length;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= length4) {
                                            z = true;
                                            break;
                                        } else if (!zza(str, intValue, zzbyVarArr2[i4])) {
                                            z = false;
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    if (z) {
                                        com.google.android.gms.internal.measurement.zzcb[] zzcbVarArr2 = zzbxVar.zzvv;
                                        int length5 = zzcbVarArr2.length;
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= length5) {
                                                break;
                                            } else if (!zza(str, intValue, zzcbVarArr2[i5])) {
                                                z = false;
                                                break;
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzah();
                                        zzq();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase writableDatabase3 = getWritableDatabase();
                                        writableDatabase3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                        z2 = true;
                                        writableDatabase3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                    }
                                }
                            }
                        }
                    }
                    z2 = true;
                }
                i++;
                z3 = z2;
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.zzbx zzbxVar2 : zzbxVarArr) {
                arrayList.add(zzbxVar2.zzvu);
            }
            zza(str, arrayList);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    private final boolean zza(String str, int i, com.google.android.gms.internal.measurement.zzby zzbyVar) {
        zzah();
        zzq();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbyVar);
        if (TextUtils.isEmpty(zzbyVar.zzwb)) {
            zzad().zzdd().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzau.zzao(str), Integer.valueOf(i), String.valueOf(zzbyVar.zzwa));
            return false;
        }
        byte[] zzb = zziv.zzb(zzbyVar);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzbyVar.zzwa);
        contentValues.put("event_name", zzbyVar.zzwb);
        contentValues.put("data", zzb);
        try {
            if (getWritableDatabase().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                zzad().zzda().zza("Failed to insert event filter (got -1). appId", zzau.zzao(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            zzad().zzda().zza("Error storing event filter. appId", zzau.zzao(str), e);
            return false;
        }
    }

    private final boolean zza(String str, int i, com.google.android.gms.internal.measurement.zzcb zzcbVar) {
        zzah();
        zzq();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzcbVar);
        if (TextUtils.isEmpty(zzcbVar.zzwq)) {
            zzad().zzdd().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzau.zzao(str), Integer.valueOf(i), String.valueOf(zzcbVar.zzwa));
            return false;
        }
        byte[] zzb = zziv.zzb(zzcbVar);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzcbVar.zzwa);
        contentValues.put("property_name", zzcbVar.zzwq);
        contentValues.put("data", zzb);
        try {
            if (getWritableDatabase().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                zzad().zzda().zza("Failed to insert property filter (got -1). appId", zzau.zzao(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzad().zzda().zza("Error storing property filter. appId", zzau.zzao(str), e);
            return false;
        }
    }

    private final boolean zza(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzah();
        zzq();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            long zza = zza("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min((int) RecyclerView.MAX_SCROLL_DURATION, zzaf().zzb(str, zzal.zzhi)));
            if (zza <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return writableDatabase.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzad().zzda().zza("Database error querying filters. appId", zzau.zzao(str), e);
            return false;
        }
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @VisibleForTesting
    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzad().zzda().zzaq("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        zzad().zzda().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    zzad().zzda().zzaq("Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i);
            }
            return Double.valueOf(cursor.getDouble(i));
        } else {
            return Long.valueOf(cursor.getLong(i));
        }
    }

    public final long zza(com.google.android.gms.internal.measurement.zzch zzchVar) throws IOException {
        zzq();
        zzah();
        Preconditions.checkNotNull(zzchVar);
        Preconditions.checkNotEmpty(zzchVar.zzcf);
        byte[] zzb = zziv.zzb(zzchVar);
        long zza = zzdm().zza(zzb);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzchVar.zzcf);
        contentValues.put("metadata_fingerprint", Long.valueOf(zza));
        contentValues.put("metadata", zzb);
        try {
            getWritableDatabase().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza;
        } catch (SQLiteException e) {
            zzad().zzda().zza("Error storing raw event metadata. appId", zzau.zzao(zzchVar.zzcf), e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0083: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0083 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzcf, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.zzq()
            r7.zzah()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.getWritableDatabase()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            if (r2 != 0) goto L37
            com.google.android.gms.measurement.internal.zzau r8 = r7.zzad()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzaw r8 = r8.zzdi()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            java.lang.String r9 = "Main event not found"
            r8.zzaq(r9)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzcf r8 = com.google.android.gms.internal.measurement.zzcf.zze(r2)     // Catch: java.io.IOException -> L51 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            android.util.Pair r8 = android.util.Pair.create(r8, r3)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            if (r1 == 0) goto L50
            r1.close()
        L50:
            return r8
        L51:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzau r3 = r7.zzad()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzaw r3 = r3.zzda()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzau.zzao(r8)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            r3.zza(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            if (r1 == 0) goto L68
            r1.close()
        L68:
            return r0
        L69:
            r8 = move-exception
            goto L6f
        L6b:
            r8 = move-exception
            goto L84
        L6d:
            r8 = move-exception
            r1 = r0
        L6f:
            com.google.android.gms.measurement.internal.zzau r9 = r7.zzad()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzaw r9 = r9.zzda()     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = "Error selecting main event"
            r9.zza(r2, r8)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L81
            r1.close()
        L81:
            return r0
        L82:
            r8 = move-exception
            r0 = r1
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final boolean zza(String str, Long l, long j, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzq();
        zzah();
        Preconditions.checkNotNull(zzcfVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzb = zziv.zzb(zzcfVar);
        zzad().zzdi().zza("Saving complex main event, appId, data size", zzaa().zzal(str), Integer.valueOf(zzb.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzb);
        try {
            if (getWritableDatabase().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzad().zzda().zza("Failed to insert complex main event (got -1). appId", zzau.zzao(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzad().zzda().zza("Error storing complex main event. appId", zzau.zzao(str), e);
            return false;
        }
    }

    public final boolean zza(zzae zzaeVar, long j, boolean z) {
        zzq();
        zzah();
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotEmpty(zzaeVar.zzcf);
        com.google.android.gms.internal.measurement.zzcf zzcfVar = new com.google.android.gms.internal.measurement.zzcf();
        zzcfVar.zzxk = Long.valueOf(zzaeVar.zzfc);
        zzcfVar.zzxi = new zzbt.zzd[zzaeVar.zzfd.size()];
        Iterator<String> it = zzaeVar.zzfd.iterator();
        int i = 0;
        while (it.hasNext()) {
            String next = it.next();
            zzbt.zzd.zza zzbw = zzbt.zzd.zzht().zzbw(next);
            zzdm().zza(zzbw, zzaeVar.zzfd.get(next));
            zzcfVar.zzxi[i] = (zzbt.zzd) ((com.google.android.gms.internal.measurement.zzez) zzbw.zzmr());
            i++;
        }
        byte[] zzb = zziv.zzb(zzcfVar);
        zzad().zzdi().zza("Saving event, name, data size", zzaa().zzal(zzaeVar.name), Integer.valueOf(zzb.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzaeVar.zzcf);
        contentValues.put("name", zzaeVar.name);
        contentValues.put("timestamp", Long.valueOf(zzaeVar.timestamp));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", zzb);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (getWritableDatabase().insert("raw_events", null, contentValues) == -1) {
                zzad().zzda().zza("Failed to insert raw event (got -1). appId", zzau.zzao(zzaeVar.zzcf));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzad().zzda().zza("Error storing raw event. appId", zzau.zzao(zzaeVar.zzcf), e);
            return false;
        }
    }
}
