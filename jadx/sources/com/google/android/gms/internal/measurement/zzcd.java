package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcd extends zzip<zzcd> {
    private static volatile zzcd[] zzww;
    public String name = null;
    public Boolean zzwx = null;
    public Boolean zzwy = null;
    public Integer zzwz = null;

    public zzcd() {
        this.zzand = null;
        this.zzanm = -1;
    }

    public static zzcd[] zzje() {
        if (zzww == null) {
            synchronized (zzit.zzanl) {
                if (zzww == null) {
                    zzww = new zzcd[0];
                }
            }
        }
        return zzww;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            String str = this.name;
            if (str == null) {
                if (zzcdVar.name != null) {
                    return false;
                }
            } else if (!str.equals(zzcdVar.name)) {
                return false;
            }
            Boolean bool = this.zzwx;
            if (bool == null) {
                if (zzcdVar.zzwx != null) {
                    return false;
                }
            } else if (!bool.equals(zzcdVar.zzwx)) {
                return false;
            }
            Boolean bool2 = this.zzwy;
            if (bool2 == null) {
                if (zzcdVar.zzwy != null) {
                    return false;
                }
            } else if (!bool2.equals(zzcdVar.zzwy)) {
                return false;
            }
            Integer num = this.zzwz;
            if (num == null) {
                if (zzcdVar.zzwz != null) {
                    return false;
                }
            } else if (!num.equals(zzcdVar.zzwz)) {
                return false;
            }
            zzir zzirVar = this.zzand;
            if (zzirVar != null && !zzirVar.isEmpty()) {
                return this.zzand.equals(zzcdVar.zzand);
            }
            zzir zzirVar2 = zzcdVar.zzand;
            return zzirVar2 == null || zzirVar2.isEmpty();
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (zzcd.class.getName().hashCode() + 527) * 31;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.zzwx;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.zzwy;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.zzwz;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        zzir zzirVar = this.zzand;
        if (zzirVar != null && !zzirVar.isEmpty()) {
            i = this.zzand.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final void zza(zzin zzinVar) throws IOException {
        String str = this.name;
        if (str != null) {
            zzinVar.zzb(1, str);
        }
        Boolean bool = this.zzwx;
        if (bool != null) {
            zzinVar.zzb(2, bool.booleanValue());
        }
        Boolean bool2 = this.zzwy;
        if (bool2 != null) {
            zzinVar.zzb(3, bool2.booleanValue());
        }
        Integer num = this.zzwz;
        if (num != null) {
            zzinVar.zzc(4, num.intValue());
        }
        super.zza(zzinVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final int zzja() {
        int zzja = super.zzja();
        String str = this.name;
        if (str != null) {
            zzja += zzin.zzc(1, str);
        }
        Boolean bool = this.zzwx;
        if (bool != null) {
            bool.booleanValue();
            zzja += zzin.zzaj(2) + 1;
        }
        Boolean bool2 = this.zzwy;
        if (bool2 != null) {
            bool2.booleanValue();
            zzja += zzin.zzaj(3) + 1;
        }
        Integer num = this.zzwz;
        return num != null ? zzja + zzin.zzg(4, num.intValue()) : zzja;
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final /* synthetic */ zziv zza(zzim zzimVar) throws IOException {
        while (true) {
            int zzkj = zzimVar.zzkj();
            if (zzkj == 0) {
                return this;
            }
            if (zzkj == 10) {
                this.name = zzimVar.readString();
            } else if (zzkj == 16) {
                this.zzwx = Boolean.valueOf(zzimVar.zzkp());
            } else if (zzkj == 24) {
                this.zzwy = Boolean.valueOf(zzimVar.zzkp());
            } else if (zzkj != 32) {
                if (!super.zza(zzimVar, zzkj)) {
                    return this;
                }
            } else {
                this.zzwz = Integer.valueOf(zzimVar.zzlb());
            }
        }
    }
}
