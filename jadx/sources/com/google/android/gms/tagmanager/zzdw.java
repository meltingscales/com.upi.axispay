package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdw implements zzcd {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time");
    private final zzdv zzb;
    private volatile zzbk zzc;
    private final Context zzd;
    private final String zze;
    private long zzf;
    private final Clock zzg;
    private final int zzh;
    private final zzez zzi;

    public zzdw(zzez zzezVar, Context context, byte[] bArr) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        this.zze = "gtm_urls.db";
        this.zzi = zzezVar;
        this.zzg = DefaultClock.getInstance();
        this.zzb = new zzdv(this, applicationContext, "gtm_urls.db");
        this.zzc = new zzfj(applicationContext, new zzdu(this));
        this.zzf = 0L;
        this.zzh = RecyclerView.MAX_SCROLL_DURATION;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzdw zzdwVar, long j, long j2) {
        SQLiteDatabase zzk = zzdwVar.zzk("Error opening database for getNumStoredHits.");
        if (zzk == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(j2));
        try {
            zzk.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
        } catch (SQLiteException unused) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ");
            sb.append(j);
            zzdh.zzc(sb.toString());
            zzdwVar.zzl(j);
        }
    }

    private final SQLiteDatabase zzk(String str) {
        try {
            return this.zzb.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzdh.zzc(str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(long j) {
        zzj(new String[]{String.valueOf(j)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[Catch: all -> 0x00ed, TryCatch #5 {all -> 0x00ed, blocks: (B:20:0x009e, B:23:0x00a5, B:25:0x00b2, B:27:0x00dd, B:26:0x00c1, B:46:0x0101, B:48:0x0111, B:50:0x011b, B:51:0x0128, B:53:0x012e, B:58:0x0142, B:49:0x0116), top: B:126:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116 A[Catch: all -> 0x00ed, TryCatch #5 {all -> 0x00ed, blocks: (B:20:0x009e, B:23:0x00a5, B:25:0x00b2, B:27:0x00dd, B:26:0x00c1, B:46:0x0101, B:48:0x0111, B:50:0x011b, B:51:0x0128, B:53:0x012e, B:58:0x0142, B:49:0x0116), top: B:126:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e A[Catch: all -> 0x00ed, TryCatch #5 {all -> 0x00ed, blocks: (B:20:0x009e, B:23:0x00a5, B:25:0x00b2, B:27:0x00dd, B:26:0x00c1, B:46:0x0101, B:48:0x0111, B:50:0x011b, B:51:0x0128, B:53:0x012e, B:58:0x0142, B:49:0x0116), top: B:126:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017e A[Catch: all -> 0x01ee, TryCatch #7 {all -> 0x01ee, blocks: (B:79:0x016e, B:81:0x017e, B:83:0x0188, B:82:0x0183), top: B:127:0x016e }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0183 A[Catch: all -> 0x01ee, TryCatch #7 {all -> 0x01ee, blocks: (B:79:0x016e, B:81:0x017e, B:83:0x0188, B:82:0x0183), top: B:127:0x016e }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    @Override // com.google.android.gms.tagmanager.zzcd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza() {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzdw.zza():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
        r2.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    @Override // com.google.android.gms.tagmanager.zzcd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(long r19, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzdw.zzb(long, java.lang.String):void");
    }

    public final int zzc() {
        SQLiteDatabase zzk = zzk("Error opening database for getNumStoredHits.");
        if (zzk != null) {
            Cursor cursor = null;
            try {
                try {
                    cursor = zzk.rawQuery("SELECT COUNT(*) from gtm_hits", null);
                    r1 = cursor.moveToFirst() ? (int) cursor.getLong(0) : 0;
                    if (cursor != null) {
                        return r1;
                    }
                } catch (SQLiteException unused) {
                    zzdh.zzc("Error getting numStoredHits");
                    if (cursor != null) {
                        cursor.close();
                        return 0;
                    }
                }
                return r1;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return 0;
    }

    public final void zzj(String[] strArr) {
        int length;
        SQLiteDatabase zzk;
        if (strArr == null || (length = strArr.length) == 0 || (zzk = zzk("Error opening database for deleteHits.")) == null) {
            return;
        }
        boolean z = true;
        try {
            zzk.delete("gtm_hits", String.format("HIT_ID in (%s)", TextUtils.join(",", Collections.nCopies(length, "?"))), strArr);
            zzez zzezVar = this.zzi;
            if (zzc() != 0) {
                z = false;
            }
            zzezVar.zza(z);
        } catch (SQLiteException unused) {
            zzdh.zzc("Error deleting hits");
        }
    }
}
