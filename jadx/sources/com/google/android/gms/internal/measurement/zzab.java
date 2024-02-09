package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzaa;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzab extends zzaa.zza {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzao;
    private final /* synthetic */ String zzap;
    private final /* synthetic */ Bundle zzaq;
    private final /* synthetic */ zzaa zzar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzaa zzaaVar, String str, String str2, Context context, Bundle bundle) {
        super(zzaaVar);
        this.zzar = zzaaVar;
        this.zzao = str;
        this.zzap = str2;
        this.val$context = context;
        this.zzaq = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[Catch: RemoteException -> 0x009e, TryCatch #0 {RemoteException -> 0x009e, blocks: (B:3:0x0002, B:5:0x0019, B:7:0x002a, B:13:0x003f, B:15:0x0052, B:17:0x005e, B:19:0x006c, B:30:0x0081), top: B:35:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: RemoteException -> 0x009e, TryCatch #0 {RemoteException -> 0x009e, blocks: (B:3:0x0002, B:5:0x0019, B:7:0x002a, B:13:0x003f, B:15:0x0052, B:17:0x005e, B:19:0x006c, B:30:0x0081), top: B:35:0x0002 }] */
    @Override // com.google.android.gms.internal.measurement.zzaa.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzl() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.measurement.zzaa r2 = r14.zzar     // Catch: android.os.RemoteException -> L9e
            java.util.HashMap r3 = new java.util.HashMap     // Catch: android.os.RemoteException -> L9e
            r3.<init>()     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzaa.zza(r2, r3)     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzaa r2 = r14.zzar     // Catch: android.os.RemoteException -> L9e
            java.lang.String r3 = r14.zzao     // Catch: android.os.RemoteException -> L9e
            java.lang.String r4 = r14.zzap     // Catch: android.os.RemoteException -> L9e
            boolean r2 = com.google.android.gms.internal.measurement.zzaa.zza(r2, r3, r4)     // Catch: android.os.RemoteException -> L9e
            r3 = 0
            if (r2 == 0) goto L27
            java.lang.String r3 = r14.zzap     // Catch: android.os.RemoteException -> L9e
            java.lang.String r2 = r14.zzao     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzaa r4 = r14.zzar     // Catch: android.os.RemoteException -> L9e
            java.lang.String r4 = com.google.android.gms.internal.measurement.zzaa.zzb(r4)     // Catch: android.os.RemoteException -> L9e
            r10 = r2
            r11 = r3
            r9 = r4
            goto L2a
        L27:
            r9 = r3
            r10 = r9
            r11 = r10
        L2a:
            android.content.Context r2 = r14.val$context     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzaa.zzg(r2)     // Catch: android.os.RemoteException -> L9e
            java.lang.Boolean r2 = com.google.android.gms.internal.measurement.zzaa.zzk()     // Catch: android.os.RemoteException -> L9e
            boolean r2 = r2.booleanValue()     // Catch: android.os.RemoteException -> L9e
            if (r2 != 0) goto L3e
            if (r10 == 0) goto L3c
            goto L3e
        L3c:
            r2 = r0
            goto L3f
        L3e:
            r2 = r1
        L3f:
            com.google.android.gms.internal.measurement.zzaa r3 = r14.zzar     // Catch: android.os.RemoteException -> L9e
            android.content.Context r4 = r14.val$context     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzn r4 = r3.zza(r4, r2)     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzaa.zza(r3, r4)     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzaa r3 = r14.zzar     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzn r3 = com.google.android.gms.internal.measurement.zzaa.zzc(r3)     // Catch: android.os.RemoteException -> L9e
            if (r3 != 0) goto L5e
            com.google.android.gms.internal.measurement.zzaa r2 = r14.zzar     // Catch: android.os.RemoteException -> L9e
            java.lang.String r2 = com.google.android.gms.internal.measurement.zzaa.zzb(r2)     // Catch: android.os.RemoteException -> L9e
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch: android.os.RemoteException -> L9e
            return
        L5e:
            android.content.Context r3 = r14.val$context     // Catch: android.os.RemoteException -> L9e
            int r3 = com.google.android.gms.internal.measurement.zzaa.zzh(r3)     // Catch: android.os.RemoteException -> L9e
            android.content.Context r4 = r14.val$context     // Catch: android.os.RemoteException -> L9e
            int r4 = com.google.android.gms.internal.measurement.zzaa.zzi(r4)     // Catch: android.os.RemoteException -> L9e
            if (r2 == 0) goto L77
            int r2 = java.lang.Math.max(r3, r4)     // Catch: android.os.RemoteException -> L9e
            if (r4 >= r3) goto L74
            r3 = r1
            goto L75
        L74:
            r3 = r0
        L75:
            r8 = r3
            goto L81
        L77:
            if (r3 <= 0) goto L7a
            r4 = r3
        L7a:
            if (r3 <= 0) goto L7e
            r2 = r1
            goto L7f
        L7e:
            r2 = r0
        L7f:
            r8 = r2
            r2 = r4
        L81:
            com.google.android.gms.internal.measurement.zzy r13 = new com.google.android.gms.internal.measurement.zzy     // Catch: android.os.RemoteException -> L9e
            r4 = 15300(0x3bc4, double:7.559E-320)
            long r6 = (long) r2     // Catch: android.os.RemoteException -> L9e
            android.os.Bundle r12 = r14.zzaq     // Catch: android.os.RemoteException -> L9e
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzaa r2 = r14.zzar     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.measurement.zzn r2 = com.google.android.gms.internal.measurement.zzaa.zzc(r2)     // Catch: android.os.RemoteException -> L9e
            android.content.Context r3 = r14.val$context     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> L9e
            long r4 = r14.timestamp     // Catch: android.os.RemoteException -> L9e
            r2.initialize(r3, r13, r4)     // Catch: android.os.RemoteException -> L9e
            return
        L9e:
            r2 = move-exception
            com.google.android.gms.internal.measurement.zzaa r3 = r14.zzar
            com.google.android.gms.internal.measurement.zzaa.zza(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzab.zzl():void");
    }
}
