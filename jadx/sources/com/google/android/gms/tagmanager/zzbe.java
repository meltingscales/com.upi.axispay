package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzfz;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbe implements zzax {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", "datalayer", "ID", "key", "value", "expires");
    private final Executor zzb;
    private final Context zzc;
    private final zzbc zzd;
    private final Clock zze;

    public zzbe(Context context) {
        Clock defaultClock = DefaultClock.getInstance();
        ExecutorService zza2 = zzfz.zza().zza(2);
        this.zzc = context;
        this.zze = defaultClock;
        this.zzb = zza2;
        this.zzd = new zzbc(this, context, "google_tagmanager.db");
    }

    public static /* bridge */ /* synthetic */ List zzf(zzbe zzbeVar) {
        ObjectInputStream objectInputStream;
        try {
            zzbeVar.zzk(zzbeVar.zze.currentTimeMillis());
            SQLiteDatabase zzi = zzbeVar.zzi("Error opening database for loadSerialized.");
            ArrayList<zzbd> arrayList = new ArrayList();
            if (zzi != null) {
                Cursor query = zzi.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
                while (query.moveToNext()) {
                    arrayList.add(new zzbd(query.getString(0), query.getBlob(1)));
                }
                query.close();
            }
            ArrayList arrayList2 = new ArrayList();
            for (zzbd zzbdVar : arrayList) {
                String str = zzbdVar.zza;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(zzbdVar.zzb);
                ObjectInputStream objectInputStream2 = null;
                r2 = null;
                r2 = null;
                r2 = null;
                Object obj = null;
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        obj = objectInputStream.readObject();
                    } catch (IOException unused) {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                        arrayList2.add(new zzau(str, obj));
                    } catch (ClassNotFoundException unused2) {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                        arrayList2.add(new zzau(str, obj));
                    } catch (Throwable th) {
                        th = th;
                        objectInputStream2 = objectInputStream;
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException unused3) {
                                throw th;
                            }
                        }
                        byteArrayInputStream.close();
                        throw th;
                    }
                } catch (IOException unused4) {
                    objectInputStream = null;
                } catch (ClassNotFoundException unused5) {
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    objectInputStream.close();
                    byteArrayInputStream.close();
                } catch (IOException unused6) {
                }
                arrayList2.add(new zzau(str, obj));
            }
            return arrayList2;
        } finally {
            zzbeVar.zzj();
        }
    }

    public static /* bridge */ /* synthetic */ void zzg(zzbe zzbeVar, String str) {
        SQLiteDatabase zzi = zzbeVar.zzi("Error opening database for clearKeysWithPrefix.");
        if (zzi == null) {
            return;
        }
        try {
            int delete = zzi.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, String.valueOf(str).concat(".%")});
            StringBuilder sb = new StringBuilder(25);
            sb.append("Cleared ");
            sb.append(delete);
            sb.append(" items");
            zzdh.zzb.zzd(sb.toString());
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 44 + String.valueOf(valueOf).length());
            sb2.append("Error deleting entries with key prefix: ");
            sb2.append(str);
            sb2.append(" (");
            sb2.append(valueOf);
            sb2.append(").");
            zzdh.zzc(sb2.toString());
        } finally {
            zzbeVar.zzj();
        }
    }

    private final SQLiteDatabase zzi(String str) {
        try {
            return this.zzd.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzdh.zzc(str);
            return null;
        }
    }

    private final void zzj() {
        try {
            this.zzd.close();
        } catch (SQLiteException unused) {
        }
    }

    private final void zzk(long j) {
        SQLiteDatabase zzi = zzi("Error opening database for deleteOlderThan.");
        if (zzi == null) {
            return;
        }
        try {
            int delete = zzi.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)});
            StringBuilder sb = new StringBuilder(33);
            sb.append("Deleted ");
            sb.append(delete);
            sb.append(" expired items");
            zzdh.zzb.zzd(sb.toString());
        } catch (SQLiteException unused) {
            zzdh.zzc("Error deleting old entries.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c4, code lost:
        if (r8 != null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #9 {, blocks: (B:87:0x0182, B:4:0x0003, B:23:0x0044, B:25:0x0049, B:59:0x00c7, B:61:0x00f2, B:64:0x00f6, B:66:0x00fe, B:67:0x0119, B:69:0x011f, B:71:0x012f, B:73:0x0139, B:72:0x0134, B:39:0x0096, B:77:0x0141, B:78:0x0144, B:79:0x0145, B:82:0x0150, B:83:0x0154, B:85:0x015a, B:15:0x0031, B:22:0x0040, B:93:0x018b, B:94:0x018e), top: B:114:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7 A[Catch: all -> 0x013d, TryCatch #12 {all -> 0x013d, blocks: (B:34:0x007d, B:36:0x0083, B:52:0x00a7, B:54:0x00b7, B:56:0x00c1, B:55:0x00bc), top: B:104:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[Catch: all -> 0x013d, TryCatch #12 {all -> 0x013d, blocks: (B:34:0x007d, B:36:0x0083, B:52:0x00a7, B:54:0x00b7, B:56:0x00c1, B:55:0x00bc), top: B:104:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0141 A[Catch: all -> 0x018f, TryCatch #9 {, blocks: (B:87:0x0182, B:4:0x0003, B:23:0x0044, B:25:0x0049, B:59:0x00c7, B:61:0x00f2, B:64:0x00f6, B:66:0x00fe, B:67:0x0119, B:69:0x011f, B:71:0x012f, B:73:0x0139, B:72:0x0134, B:39:0x0096, B:77:0x0141, B:78:0x0144, B:79:0x0145, B:82:0x0150, B:83:0x0154, B:85:0x015a, B:15:0x0031, B:22:0x0040, B:93:0x018b, B:94:0x018e), top: B:114:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0150 A[Catch: all -> 0x018f, TryCatch #9 {, blocks: (B:87:0x0182, B:4:0x0003, B:23:0x0044, B:25:0x0049, B:59:0x00c7, B:61:0x00f2, B:64:0x00f6, B:66:0x00fe, B:67:0x0119, B:69:0x011f, B:71:0x012f, B:73:0x0139, B:72:0x0134, B:39:0x0096, B:77:0x0141, B:78:0x0144, B:79:0x0145, B:82:0x0150, B:83:0x0154, B:85:0x015a, B:15:0x0031, B:22:0x0040, B:93:0x018b, B:94:0x018e), top: B:114:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018b A[Catch: all -> 0x018f, TRY_ENTER, TryCatch #9 {, blocks: (B:87:0x0182, B:4:0x0003, B:23:0x0044, B:25:0x0049, B:59:0x00c7, B:61:0x00f2, B:64:0x00f6, B:66:0x00fe, B:67:0x0119, B:69:0x011f, B:71:0x012f, B:73:0x0139, B:72:0x0134, B:39:0x0096, B:77:0x0141, B:78:0x0144, B:79:0x0145, B:82:0x0150, B:83:0x0154, B:85:0x015a, B:15:0x0031, B:22:0x0040, B:93:0x018b, B:94:0x018e), top: B:114:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzl(java.util.List<com.google.android.gms.tagmanager.zzbd> r18, long r19) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbe.zzl(java.util.List, long):void");
    }

    @Override // com.google.android.gms.tagmanager.zzax
    public final void zza(String str) {
        this.zzb.execute(new zzbb(this, str));
    }

    @Override // com.google.android.gms.tagmanager.zzax
    public final void zzb(zzaw zzawVar) {
        this.zzb.execute(new zzba(this, zzawVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r6 == null) goto L11;
     */
    @Override // com.google.android.gms.tagmanager.zzax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(java.util.List<com.google.android.gms.tagmanager.zzau> r8, long r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r8.next()
            com.google.android.gms.tagmanager.zzau r1 = (com.google.android.gms.tagmanager.zzau) r1
            com.google.android.gms.tagmanager.zzbd r2 = new com.google.android.gms.tagmanager.zzbd
            java.lang.String r3 = r1.zza
            java.lang.Object r1 = r1.zzb
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r5 = 0
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L41
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L41
            r6.writeObject(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L42
            byte[] r5 = r4.toByteArray()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L42
        L2d:
            r6.close()     // Catch: java.io.IOException -> L45
        L30:
            r4.close()     // Catch: java.io.IOException -> L45
            goto L45
        L34:
            r8 = move-exception
            r5 = r6
            goto L38
        L37:
            r8 = move-exception
        L38:
            if (r5 == 0) goto L3d
            r5.close()     // Catch: java.io.IOException -> L40
        L3d:
            r4.close()     // Catch: java.io.IOException -> L40
        L40:
            throw r8
        L41:
            r6 = r5
        L42:
            if (r6 == 0) goto L30
            goto L2d
        L45:
            r2.<init>(r3, r5)
            r0.add(r2)
            goto L9
        L4c:
            java.util.concurrent.Executor r8 = r7.zzb
            com.google.android.gms.tagmanager.zzaz r1 = new com.google.android.gms.tagmanager.zzaz
            r1.<init>(r7, r0, r9)
            r8.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbe.zzc(java.util.List, long):void");
    }
}
