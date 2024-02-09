package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbr;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzce extends zzip<zzce> {
    public Long zzxa = null;
    public String zzch = null;
    private Integer zzxb = null;
    public zzbr.zza[] zzxc = new zzbr.zza[0];
    public zzcd[] zzxd = zzcd.zzje();
    public zzbx[] zzxe = zzbx.zziz();
    private String zzxf = null;
    public Boolean zzxg = null;

    public zzce() {
        this.zzand = null;
        this.zzanm = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzce) {
            zzce zzceVar = (zzce) obj;
            Long l = this.zzxa;
            if (l == null) {
                if (zzceVar.zzxa != null) {
                    return false;
                }
            } else if (!l.equals(zzceVar.zzxa)) {
                return false;
            }
            String str = this.zzch;
            if (str == null) {
                if (zzceVar.zzch != null) {
                    return false;
                }
            } else if (!str.equals(zzceVar.zzch)) {
                return false;
            }
            Integer num = this.zzxb;
            if (num == null) {
                if (zzceVar.zzxb != null) {
                    return false;
                }
            } else if (!num.equals(zzceVar.zzxb)) {
                return false;
            }
            if (zzit.equals(this.zzxc, zzceVar.zzxc) && zzit.equals(this.zzxd, zzceVar.zzxd) && zzit.equals(this.zzxe, zzceVar.zzxe)) {
                String str2 = this.zzxf;
                if (str2 == null) {
                    if (zzceVar.zzxf != null) {
                        return false;
                    }
                } else if (!str2.equals(zzceVar.zzxf)) {
                    return false;
                }
                Boolean bool = this.zzxg;
                if (bool == null) {
                    if (zzceVar.zzxg != null) {
                        return false;
                    }
                } else if (!bool.equals(zzceVar.zzxg)) {
                    return false;
                }
                zzir zzirVar = this.zzand;
                if (zzirVar != null && !zzirVar.isEmpty()) {
                    return this.zzand.equals(zzceVar.zzand);
                }
                zzir zzirVar2 = zzceVar.zzand;
                return zzirVar2 == null || zzirVar2.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (zzce.class.getName().hashCode() + 527) * 31;
        Long l = this.zzxa;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.zzch;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.zzxb;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + zzit.hashCode(this.zzxc)) * 31) + zzit.hashCode(this.zzxd)) * 31) + zzit.hashCode(this.zzxe)) * 31;
        String str2 = this.zzxf;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.zzxg;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        zzir zzirVar = this.zzand;
        if (zzirVar != null && !zzirVar.isEmpty()) {
            i = this.zzand.hashCode();
        }
        return hashCode6 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final void zza(zzin zzinVar) throws IOException {
        Long l = this.zzxa;
        if (l != null) {
            zzinVar.zzi(1, l.longValue());
        }
        String str = this.zzch;
        if (str != null) {
            zzinVar.zzb(2, str);
        }
        Integer num = this.zzxb;
        if (num != null) {
            zzinVar.zzc(3, num.intValue());
        }
        zzbr.zza[] zzaVarArr = this.zzxc;
        int i = 0;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzbr.zza[] zzaVarArr2 = this.zzxc;
                if (i2 >= zzaVarArr2.length) {
                    break;
                }
                zzbr.zza zzaVar = zzaVarArr2[i2];
                if (zzaVar != null) {
                    zzinVar.zze(4, zzaVar);
                }
                i2++;
            }
        }
        zzcd[] zzcdVarArr = this.zzxd;
        if (zzcdVarArr != null && zzcdVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzcd[] zzcdVarArr2 = this.zzxd;
                if (i3 >= zzcdVarArr2.length) {
                    break;
                }
                zzcd zzcdVar = zzcdVarArr2[i3];
                if (zzcdVar != null) {
                    zzinVar.zza(5, zzcdVar);
                }
                i3++;
            }
        }
        zzbx[] zzbxVarArr = this.zzxe;
        if (zzbxVarArr != null && zzbxVarArr.length > 0) {
            while (true) {
                zzbx[] zzbxVarArr2 = this.zzxe;
                if (i >= zzbxVarArr2.length) {
                    break;
                }
                zzbx zzbxVar = zzbxVarArr2[i];
                if (zzbxVar != null) {
                    zzinVar.zza(6, zzbxVar);
                }
                i++;
            }
        }
        String str2 = this.zzxf;
        if (str2 != null) {
            zzinVar.zzb(7, str2);
        }
        Boolean bool = this.zzxg;
        if (bool != null) {
            zzinVar.zzb(8, bool.booleanValue());
        }
        super.zza(zzinVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final int zzja() {
        int zzja = super.zzja();
        Long l = this.zzxa;
        if (l != null) {
            zzja += zzin.zzd(1, l.longValue());
        }
        String str = this.zzch;
        if (str != null) {
            zzja += zzin.zzc(2, str);
        }
        Integer num = this.zzxb;
        if (num != null) {
            zzja += zzin.zzg(3, num.intValue());
        }
        zzbr.zza[] zzaVarArr = this.zzxc;
        int i = 0;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzbr.zza[] zzaVarArr2 = this.zzxc;
                if (i2 >= zzaVarArr2.length) {
                    break;
                }
                zzbr.zza zzaVar = zzaVarArr2[i2];
                if (zzaVar != null) {
                    zzja += zzeg.zzc(4, zzaVar);
                }
                i2++;
            }
        }
        zzcd[] zzcdVarArr = this.zzxd;
        if (zzcdVarArr != null && zzcdVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzcd[] zzcdVarArr2 = this.zzxd;
                if (i3 >= zzcdVarArr2.length) {
                    break;
                }
                zzcd zzcdVar = zzcdVarArr2[i3];
                if (zzcdVar != null) {
                    zzja += zzin.zzb(5, zzcdVar);
                }
                i3++;
            }
        }
        zzbx[] zzbxVarArr = this.zzxe;
        if (zzbxVarArr != null && zzbxVarArr.length > 0) {
            while (true) {
                zzbx[] zzbxVarArr2 = this.zzxe;
                if (i >= zzbxVarArr2.length) {
                    break;
                }
                zzbx zzbxVar = zzbxVarArr2[i];
                if (zzbxVar != null) {
                    zzja += zzin.zzb(6, zzbxVar);
                }
                i++;
            }
        }
        String str2 = this.zzxf;
        if (str2 != null) {
            zzja += zzin.zzc(7, str2);
        }
        Boolean bool = this.zzxg;
        if (bool != null) {
            bool.booleanValue();
            return zzja + zzin.zzaj(8) + 1;
        }
        return zzja;
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final /* synthetic */ zziv zza(zzim zzimVar) throws IOException {
        while (true) {
            int zzkj = zzimVar.zzkj();
            if (zzkj == 0) {
                return this;
            }
            if (zzkj == 8) {
                this.zzxa = Long.valueOf(zzimVar.zzlc());
            } else if (zzkj == 18) {
                this.zzch = zzimVar.readString();
            } else if (zzkj == 24) {
                this.zzxb = Integer.valueOf(zzimVar.zzlb());
            } else if (zzkj == 34) {
                int zzb = zziy.zzb(zzimVar, 34);
                zzbr.zza[] zzaVarArr = this.zzxc;
                int length = zzaVarArr == null ? 0 : zzaVarArr.length;
                int i = zzb + length;
                zzbr.zza[] zzaVarArr2 = new zzbr.zza[i];
                if (length != 0) {
                    System.arraycopy(zzaVarArr, 0, zzaVarArr2, 0, length);
                }
                while (length < i - 1) {
                    zzaVarArr2[length] = (zzbr.zza) zzimVar.zza(zzbr.zza.zzgs());
                    zzimVar.zzkj();
                    length++;
                }
                zzaVarArr2[length] = (zzbr.zza) zzimVar.zza(zzbr.zza.zzgs());
                this.zzxc = zzaVarArr2;
            } else if (zzkj == 42) {
                int zzb2 = zziy.zzb(zzimVar, 42);
                zzcd[] zzcdVarArr = this.zzxd;
                int length2 = zzcdVarArr == null ? 0 : zzcdVarArr.length;
                int i2 = zzb2 + length2;
                zzcd[] zzcdVarArr2 = new zzcd[i2];
                if (length2 != 0) {
                    System.arraycopy(zzcdVarArr, 0, zzcdVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    zzcdVarArr2[length2] = new zzcd();
                    zzimVar.zza(zzcdVarArr2[length2]);
                    zzimVar.zzkj();
                    length2++;
                }
                zzcdVarArr2[length2] = new zzcd();
                zzimVar.zza(zzcdVarArr2[length2]);
                this.zzxd = zzcdVarArr2;
            } else if (zzkj == 50) {
                int zzb3 = zziy.zzb(zzimVar, 50);
                zzbx[] zzbxVarArr = this.zzxe;
                int length3 = zzbxVarArr == null ? 0 : zzbxVarArr.length;
                int i3 = zzb3 + length3;
                zzbx[] zzbxVarArr2 = new zzbx[i3];
                if (length3 != 0) {
                    System.arraycopy(zzbxVarArr, 0, zzbxVarArr2, 0, length3);
                }
                while (length3 < i3 - 1) {
                    zzbxVarArr2[length3] = new zzbx();
                    zzimVar.zza(zzbxVarArr2[length3]);
                    zzimVar.zzkj();
                    length3++;
                }
                zzbxVarArr2[length3] = new zzbx();
                zzimVar.zza(zzbxVarArr2[length3]);
                this.zzxe = zzbxVarArr2;
            } else if (zzkj == 58) {
                this.zzxf = zzimVar.readString();
            } else if (zzkj != 64) {
                if (!super.zza(zzimVar, zzkj)) {
                    return this;
                }
            } else {
                this.zzxg = Boolean.valueOf(zzimVar.zzkp());
            }
        }
    }
}
