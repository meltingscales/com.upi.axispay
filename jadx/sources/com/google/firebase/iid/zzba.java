package com.google.firebase.iid;

import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzba {
    private final zzax zzar;
    private int zzdw = 0;
    private final Map<Integer, TaskCompletionSource<Void>> zzdx = new o4();

    public zzba(zzax zzaxVar) {
        this.zzar = zzaxVar;
    }

    private final String zzar() {
        String zzak;
        synchronized (this.zzar) {
            zzak = this.zzar.zzak();
        }
        if (TextUtils.isEmpty(zzak)) {
            return null;
        }
        String[] split = zzak.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    private final synchronized boolean zzn(String str) {
        synchronized (this.zzar) {
            String zzak = this.zzar.zzak();
            String valueOf = String.valueOf(str);
            if (zzak.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
                String valueOf2 = String.valueOf(str);
                this.zzar.zzh(zzak.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length()));
                return true;
            }
            return false;
        }
    }

    public final synchronized Task<Void> zza(String str) {
        String zzak;
        TaskCompletionSource<Void> taskCompletionSource;
        synchronized (this.zzar) {
            zzak = this.zzar.zzak();
            zzax zzaxVar = this.zzar;
            StringBuilder sb = new StringBuilder(String.valueOf(zzak).length() + 1 + String.valueOf(str).length());
            sb.append(zzak);
            sb.append(",");
            sb.append(str);
            zzaxVar.zzh(sb.toString());
        }
        taskCompletionSource = new TaskCompletionSource<>();
        this.zzdx.put(Integer.valueOf(this.zzdw + (TextUtils.isEmpty(zzak) ? 0 : zzak.split(",").length - 1)), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final synchronized boolean zzaq() {
        return zzar() != null;
    }

    public final boolean zzc(FirebaseInstanceId firebaseInstanceId) {
        TaskCompletionSource<Void> remove;
        while (true) {
            synchronized (this) {
                String zzar = zzar();
                if (zzar == null) {
                    FirebaseInstanceId.zzm();
                    return true;
                } else if (!zza(firebaseInstanceId, zzar)) {
                    return false;
                } else {
                    synchronized (this) {
                        remove = this.zzdx.remove(Integer.valueOf(this.zzdw));
                        zzn(zzar);
                        this.zzdw++;
                    }
                    if (remove != null) {
                        remove.setResult(null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r3 == 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        r6.zzc(r7);
        com.google.firebase.iid.FirebaseInstanceId.zzm();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean zza(com.google.firebase.iid.FirebaseInstanceId r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "!"
            java.lang.String[] r7 = r7.split(r0)
            int r0 = r7.length
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L67
            r0 = 0
            r2 = r7[r0]
            r7 = r7[r1]
            r3 = -1
            int r4 = r2.hashCode()     // Catch: java.io.IOException -> L46
            r5 = 83
            if (r4 == r5) goto L28
            r5 = 85
            if (r4 == r5) goto L1e
            goto L31
        L1e:
            java.lang.String r4 = "U"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L46
            if (r2 == 0) goto L31
            r3 = r1
            goto L31
        L28:
            java.lang.String r4 = "S"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L46
            if (r2 == 0) goto L31
            r3 = r0
        L31:
            if (r3 == 0) goto L3e
            if (r3 == r1) goto L36
            goto L67
        L36:
            r6.zzc(r7)     // Catch: java.io.IOException -> L46
            boolean r6 = com.google.firebase.iid.FirebaseInstanceId.zzm()     // Catch: java.io.IOException -> L46
            goto L67
        L3e:
            r6.zzb(r7)     // Catch: java.io.IOException -> L46
            boolean r6 = com.google.firebase.iid.FirebaseInstanceId.zzm()     // Catch: java.io.IOException -> L46
            goto L67
        L46:
            r6 = move-exception
            java.lang.String r7 = "Topic sync failed: "
            java.lang.String r6 = r6.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r1 = r6.length()
            if (r1 == 0) goto L5c
            java.lang.String r6 = r7.concat(r6)
            goto L61
        L5c:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L61:
            java.lang.String r7 = "FirebaseInstanceId"
            android.util.Log.e(r7, r6)
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzba.zza(com.google.firebase.iid.FirebaseInstanceId, java.lang.String):boolean");
    }
}
