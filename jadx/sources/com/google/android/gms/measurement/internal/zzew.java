package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzew implements Runnable {
    private final /* synthetic */ String zzao;
    private final /* synthetic */ String zzav;
    private final /* synthetic */ boolean zzbd;
    private final /* synthetic */ String zzdk;
    private final /* synthetic */ zzm zzos;
    private final /* synthetic */ zzeg zzqq;
    private final /* synthetic */ AtomicReference zzqs;

    public zzew(zzeg zzegVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzm zzmVar) {
        this.zzqq = zzegVar;
        this.zzqs = atomicReference;
        this.zzdk = str;
        this.zzao = str2;
        this.zzav = str3;
        this.zzbd = z;
        this.zzos = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzam zzamVar;
        synchronized (this.zzqs) {
            try {
                zzamVar = this.zzqq.zzqk;
            } catch (RemoteException e) {
                this.zzqq.zzad().zzda().zza("Failed to get user properties", zzau.zzao(this.zzdk), this.zzao, e);
                this.zzqs.set(Collections.emptyList());
                this.zzqs.notify();
            }
            if (zzamVar == null) {
                this.zzqq.zzad().zzda().zza("Failed to get user properties", zzau.zzao(this.zzdk), this.zzao, this.zzav);
                this.zzqs.set(Collections.emptyList());
                this.zzqs.notify();
                return;
            }
            if (TextUtils.isEmpty(this.zzdk)) {
                this.zzqs.set(zzamVar.zza(this.zzao, this.zzav, this.zzbd, this.zzos));
            } else {
                this.zzqs.set(zzamVar.zza(this.zzdk, this.zzao, this.zzav, this.zzbd));
            }
            this.zzqq.zzfg();
            this.zzqs.notify();
        }
    }
}
