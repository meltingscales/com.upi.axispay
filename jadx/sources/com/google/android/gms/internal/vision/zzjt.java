package com.google.android.gms.internal.vision;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzjt {
    private static final zzio zza = zzio.zzb();
    private zzht zzb;
    private volatile zzkk zzc;
    private volatile zzht zzd;

    private final zzkk zzb(zzkk zzkkVar) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzkkVar;
                        this.zzd = zzht.zza;
                    } catch (zzjk unused) {
                        this.zzc = zzkkVar;
                        this.zzd = zzht.zza;
                    }
                }
            }
        }
        return this.zzc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjt) {
            zzjt zzjtVar = (zzjt) obj;
            zzkk zzkkVar = this.zzc;
            zzkk zzkkVar2 = zzjtVar.zzc;
            if (zzkkVar == null && zzkkVar2 == null) {
                return zzc().equals(zzjtVar.zzc());
            }
            if (zzkkVar == null || zzkkVar2 == null) {
                if (zzkkVar != null) {
                    return zzkkVar.equals(zzjtVar.zzb(zzkkVar.zzr()));
                }
                return zzb(zzkkVar2.zzr()).equals(zzkkVar2);
            }
            return zzkkVar.equals(zzkkVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final zzkk zza(zzkk zzkkVar) {
        zzkk zzkkVar2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzkkVar;
        return zzkkVar2;
    }

    public final zzht zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            if (this.zzc == null) {
                this.zzd = zzht.zza;
            } else {
                this.zzd = this.zzc.zzg();
            }
            return this.zzd;
        }
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zza();
        }
        if (this.zzc != null) {
            return this.zzc.zzm();
        }
        return 0;
    }
}
