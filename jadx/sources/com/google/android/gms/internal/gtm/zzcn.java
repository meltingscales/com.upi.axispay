package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcn extends zzbs {
    private volatile String zza;
    private Future<String> zzb;

    public zzcn(zzbv zzbvVar) {
        super(zzbvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @VisibleForTesting
    public final String zzf() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context zza = zzq().zza();
            Preconditions.checkNotEmpty(lowerCase);
            Preconditions.checkNotMainThread("ClientId should be saved from worker thread");
            FileOutputStream fileOutputStream = null;
            try {
                zzP("Storing clientId", lowerCase);
                fileOutputStream = zza.openFileOutput("gaClientId", 0);
                fileOutputStream.write(lowerCase.getBytes());
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        zzK("Failed to close clientId writing stream", e);
                    }
                }
                return lowerCase;
            } catch (FileNotFoundException e2) {
                zzK("Error creating clientId file", e2);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                        zzK("Failed to close clientId writing stream", e);
                        return CrashlyticsReportDataCapture.SIGNAL_DEFAULT;
                    }
                }
                return CrashlyticsReportDataCapture.SIGNAL_DEFAULT;
            } catch (IOException e4) {
                zzK("Error writing to clientId file", e4);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                        zzK("Failed to close clientId writing stream", e);
                        return CrashlyticsReportDataCapture.SIGNAL_DEFAULT;
                    }
                }
                return CrashlyticsReportDataCapture.SIGNAL_DEFAULT;
            }
        } catch (Exception e6) {
            zzK("Error saving clientId file", e6);
            return CrashlyticsReportDataCapture.SIGNAL_DEFAULT;
        }
    }

    public final String zzb() {
        String str;
        zzW();
        synchronized (this) {
            if (this.zza == null) {
                this.zzb = zzq().zzg(new zzcl(this));
            }
            Future<String> future = this.zzb;
            if (future != null) {
                try {
                    this.zza = future.get();
                } catch (InterruptedException e) {
                    zzS("ClientId loading or generation was interrupted", e);
                    this.zza = CrashlyticsReportDataCapture.SIGNAL_DEFAULT;
                } catch (ExecutionException e2) {
                    zzK("Failed to load or generate client id", e2);
                    this.zza = CrashlyticsReportDataCapture.SIGNAL_DEFAULT;
                }
                if (this.zza == null) {
                    this.zza = CrashlyticsReportDataCapture.SIGNAL_DEFAULT;
                }
                zzP("Loaded clientId", this.zza);
                this.zzb = null;
            }
            str = this.zza;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: IOException -> 0x008c, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x008c, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x0074, B:44:0x0088), top: B:61:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088 A[Catch: IOException -> 0x008c, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x008c, blocks: (B:9:0x0032, B:15:0x0047, B:32:0x0074, B:44:0x0088), top: B:61:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0072 -> B:53:0x0090). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0074 -> B:53:0x0090). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0088 -> B:60:0x0090). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x008d -> B:53:0x0090). Please submit an issue!!! */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzc() {
        /*
            r9 = this;
            java.lang.String r0 = "gaClientId"
            java.lang.String r1 = "Failed to close client id reading stream"
            com.google.android.gms.analytics.zzr r2 = r9.zzq()
            android.content.Context r2 = r2.zza()
            java.lang.String r3 = "ClientId should be loaded from worker thread"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r3)
            r3 = 0
            java.io.FileInputStream r4 = r2.openFileInput(r0)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68 java.io.FileNotFoundException -> L85
            r5 = 36
            byte[] r6 = new byte[r5]     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            r7 = 0
            int r5 = r4.read(r6, r7, r5)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            int r8 = r4.available()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            if (r8 <= 0) goto L36
            java.lang.String r5 = "clientId file seems corrupted, deleting it."
            r9.zzR(r5)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            r4.close()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            r2.deleteFile(r0)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            if (r4 == 0) goto L90
            r4.close()     // Catch: java.io.IOException -> L8c
            goto L90
        L36:
            r8 = 14
            if (r5 >= r8) goto L4b
            java.lang.String r5 = "clientId file is empty, deleting it."
            r9.zzR(r5)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            r4.close()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            r2.deleteFile(r0)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            if (r4 == 0) goto L90
            r4.close()     // Catch: java.io.IOException -> L8c
            goto L90
        L4b:
            r4.close()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            java.lang.String r8 = new java.lang.String     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            r8.<init>(r6, r7, r5)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            java.lang.String r5 = "Read client id from disk"
            r9.zzP(r5, r8)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.io.FileNotFoundException -> L86
            if (r4 == 0) goto L62
            r4.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r9.zzK(r1, r0)
        L62:
            r3 = r8
            goto L90
        L64:
            r5 = move-exception
            goto L6a
        L66:
            r0 = move-exception
            goto L7a
        L68:
            r5 = move-exception
            r4 = r3
        L6a:
            java.lang.String r6 = "Error reading client id file, deleting it"
            r9.zzK(r6, r5)     // Catch: java.lang.Throwable -> L78
            r2.deleteFile(r0)     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L90
            r4.close()     // Catch: java.io.IOException -> L8c
            goto L90
        L78:
            r0 = move-exception
            r3 = r4
        L7a:
            if (r3 == 0) goto L84
            r3.close()     // Catch: java.io.IOException -> L80
            goto L84
        L80:
            r2 = move-exception
            r9.zzK(r1, r2)
        L84:
            throw r0
        L85:
            r4 = r3
        L86:
            if (r4 == 0) goto L90
            r4.close()     // Catch: java.io.IOException -> L8c
            goto L90
        L8c:
            r0 = move-exception
            r9.zzK(r1, r0)
        L90:
            if (r3 != 0) goto L97
            java.lang.String r0 = r9.zzf()
            return r0
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcn.zzc():java.lang.String");
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }

    public final String zze() {
        synchronized (this) {
            this.zza = null;
            this.zzb = zzq().zzg(new zzcm(this));
        }
        return zzb();
    }
}
