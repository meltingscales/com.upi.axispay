package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzav implements Runnable {
    private final /* synthetic */ int zzka;
    private final /* synthetic */ String zzkb;
    private final /* synthetic */ Object zzkc;
    private final /* synthetic */ Object zzkd;
    private final /* synthetic */ Object zzke;
    private final /* synthetic */ zzau zzkf;

    public zzav(zzau zzauVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzkf = zzauVar;
        this.zzka = i;
        this.zzkb = str;
        this.zzkc = obj;
        this.zzkd = obj2;
        this.zzke = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        zzbf zzae = this.zzkf.zzl.zzae();
        if (!zzae.isInitialized()) {
            this.zzkf.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c = this.zzkf.zzjp;
        if (c == 0) {
            if (this.zzkf.zzaf().zzbp()) {
                zzau zzauVar = this.zzkf;
                zzauVar.zzag();
                zzauVar.zzjp = 'C';
            } else {
                zzau zzauVar2 = this.zzkf;
                zzauVar2.zzag();
                zzauVar2.zzjp = 'c';
            }
        }
        j = this.zzkf.zzt;
        if (j < 0) {
            zzau zzauVar3 = this.zzkf;
            zzauVar3.zzt = zzauVar3.zzaf().zzav();
        }
        char charAt = "01VDIWEA?".charAt(this.zzka);
        c2 = this.zzkf.zzjp;
        j2 = this.zzkf.zzt;
        String zza = zzau.zza(true, this.zzkb, this.zzkc, this.zzkd, this.zzke);
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(c2);
        sb.append(j2);
        sb.append(":");
        sb.append(zza);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.zzkb.substring(0, 1024);
        }
        zzae.zzla.zzc(sb2, 1L);
    }
}
