package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.IMediaSession;
import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.vision.barcode.Barcode;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzch extends zzip<zzch> {
    private static volatile zzch[] zzxm;
    public Integer zzxn = null;
    public zzcf[] zzxo = zzcf.zzjf();
    public zzbt.zzh[] zzxp = new zzbt.zzh[0];
    public Long zzxq = null;
    public Long zzxr = null;
    public Long zzxs = null;
    public Long zzxt = null;
    public Long zzxu = null;
    public String zzxv = null;
    public String zzxw = null;
    public String zzxx = null;
    public String zzex = null;
    public Integer zzxy = null;
    public String zzcp = null;
    public String zzcf = null;
    public String zzcn = null;
    public Long zzxz = null;
    public Long zzya = null;
    public String zzyb = null;
    public Boolean zzyc = null;
    public String zzcg = null;
    public Long zzyd = null;
    public Integer zzye = null;
    public String zzdn = null;
    public String zzch = null;
    public Boolean zzyf = null;
    public zzbt.zza[] zzyg = new zzbt.zza[0];
    public String zzcj = null;
    public Integer zzyh = null;
    private Integer zzyi = null;
    private Integer zzyj = null;
    public String zzyk = null;
    public Long zzyl = null;
    public Long zzym = null;
    public String zzyn = null;
    private String zzyo = null;
    public Integer zzyp = null;
    public String zzxf = null;
    public zzbt.zze zzyq = null;
    public int[] zzyr = zziy.zzaiy;
    public Long zzys = null;
    public Long zzyt = null;

    public zzch() {
        this.zzand = null;
        this.zzanm = -1;
    }

    public static zzch zzf(byte[] bArr) throws zziu {
        return (zzch) zziv.zza(new zzch(), bArr);
    }

    public static zzch[] zzjg() {
        if (zzxm == null) {
            synchronized (zzit.zzanl) {
                if (zzxm == null) {
                    zzxm = new zzch[0];
                }
            }
        }
        return zzxm;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzch) {
            zzch zzchVar = (zzch) obj;
            Integer num = this.zzxn;
            if (num == null) {
                if (zzchVar.zzxn != null) {
                    return false;
                }
            } else if (!num.equals(zzchVar.zzxn)) {
                return false;
            }
            if (zzit.equals(this.zzxo, zzchVar.zzxo) && zzit.equals(this.zzxp, zzchVar.zzxp)) {
                Long l = this.zzxq;
                if (l == null) {
                    if (zzchVar.zzxq != null) {
                        return false;
                    }
                } else if (!l.equals(zzchVar.zzxq)) {
                    return false;
                }
                Long l2 = this.zzxr;
                if (l2 == null) {
                    if (zzchVar.zzxr != null) {
                        return false;
                    }
                } else if (!l2.equals(zzchVar.zzxr)) {
                    return false;
                }
                Long l3 = this.zzxs;
                if (l3 == null) {
                    if (zzchVar.zzxs != null) {
                        return false;
                    }
                } else if (!l3.equals(zzchVar.zzxs)) {
                    return false;
                }
                Long l4 = this.zzxt;
                if (l4 == null) {
                    if (zzchVar.zzxt != null) {
                        return false;
                    }
                } else if (!l4.equals(zzchVar.zzxt)) {
                    return false;
                }
                Long l5 = this.zzxu;
                if (l5 == null) {
                    if (zzchVar.zzxu != null) {
                        return false;
                    }
                } else if (!l5.equals(zzchVar.zzxu)) {
                    return false;
                }
                String str = this.zzxv;
                if (str == null) {
                    if (zzchVar.zzxv != null) {
                        return false;
                    }
                } else if (!str.equals(zzchVar.zzxv)) {
                    return false;
                }
                String str2 = this.zzxw;
                if (str2 == null) {
                    if (zzchVar.zzxw != null) {
                        return false;
                    }
                } else if (!str2.equals(zzchVar.zzxw)) {
                    return false;
                }
                String str3 = this.zzxx;
                if (str3 == null) {
                    if (zzchVar.zzxx != null) {
                        return false;
                    }
                } else if (!str3.equals(zzchVar.zzxx)) {
                    return false;
                }
                String str4 = this.zzex;
                if (str4 == null) {
                    if (zzchVar.zzex != null) {
                        return false;
                    }
                } else if (!str4.equals(zzchVar.zzex)) {
                    return false;
                }
                Integer num2 = this.zzxy;
                if (num2 == null) {
                    if (zzchVar.zzxy != null) {
                        return false;
                    }
                } else if (!num2.equals(zzchVar.zzxy)) {
                    return false;
                }
                String str5 = this.zzcp;
                if (str5 == null) {
                    if (zzchVar.zzcp != null) {
                        return false;
                    }
                } else if (!str5.equals(zzchVar.zzcp)) {
                    return false;
                }
                String str6 = this.zzcf;
                if (str6 == null) {
                    if (zzchVar.zzcf != null) {
                        return false;
                    }
                } else if (!str6.equals(zzchVar.zzcf)) {
                    return false;
                }
                String str7 = this.zzcn;
                if (str7 == null) {
                    if (zzchVar.zzcn != null) {
                        return false;
                    }
                } else if (!str7.equals(zzchVar.zzcn)) {
                    return false;
                }
                Long l6 = this.zzxz;
                if (l6 == null) {
                    if (zzchVar.zzxz != null) {
                        return false;
                    }
                } else if (!l6.equals(zzchVar.zzxz)) {
                    return false;
                }
                Long l7 = this.zzya;
                if (l7 == null) {
                    if (zzchVar.zzya != null) {
                        return false;
                    }
                } else if (!l7.equals(zzchVar.zzya)) {
                    return false;
                }
                String str8 = this.zzyb;
                if (str8 == null) {
                    if (zzchVar.zzyb != null) {
                        return false;
                    }
                } else if (!str8.equals(zzchVar.zzyb)) {
                    return false;
                }
                Boolean bool = this.zzyc;
                if (bool == null) {
                    if (zzchVar.zzyc != null) {
                        return false;
                    }
                } else if (!bool.equals(zzchVar.zzyc)) {
                    return false;
                }
                String str9 = this.zzcg;
                if (str9 == null) {
                    if (zzchVar.zzcg != null) {
                        return false;
                    }
                } else if (!str9.equals(zzchVar.zzcg)) {
                    return false;
                }
                Long l8 = this.zzyd;
                if (l8 == null) {
                    if (zzchVar.zzyd != null) {
                        return false;
                    }
                } else if (!l8.equals(zzchVar.zzyd)) {
                    return false;
                }
                Integer num3 = this.zzye;
                if (num3 == null) {
                    if (zzchVar.zzye != null) {
                        return false;
                    }
                } else if (!num3.equals(zzchVar.zzye)) {
                    return false;
                }
                String str10 = this.zzdn;
                if (str10 == null) {
                    if (zzchVar.zzdn != null) {
                        return false;
                    }
                } else if (!str10.equals(zzchVar.zzdn)) {
                    return false;
                }
                String str11 = this.zzch;
                if (str11 == null) {
                    if (zzchVar.zzch != null) {
                        return false;
                    }
                } else if (!str11.equals(zzchVar.zzch)) {
                    return false;
                }
                Boolean bool2 = this.zzyf;
                if (bool2 == null) {
                    if (zzchVar.zzyf != null) {
                        return false;
                    }
                } else if (!bool2.equals(zzchVar.zzyf)) {
                    return false;
                }
                if (zzit.equals(this.zzyg, zzchVar.zzyg)) {
                    String str12 = this.zzcj;
                    if (str12 == null) {
                        if (zzchVar.zzcj != null) {
                            return false;
                        }
                    } else if (!str12.equals(zzchVar.zzcj)) {
                        return false;
                    }
                    Integer num4 = this.zzyh;
                    if (num4 == null) {
                        if (zzchVar.zzyh != null) {
                            return false;
                        }
                    } else if (!num4.equals(zzchVar.zzyh)) {
                        return false;
                    }
                    Integer num5 = this.zzyi;
                    if (num5 == null) {
                        if (zzchVar.zzyi != null) {
                            return false;
                        }
                    } else if (!num5.equals(zzchVar.zzyi)) {
                        return false;
                    }
                    Integer num6 = this.zzyj;
                    if (num6 == null) {
                        if (zzchVar.zzyj != null) {
                            return false;
                        }
                    } else if (!num6.equals(zzchVar.zzyj)) {
                        return false;
                    }
                    String str13 = this.zzyk;
                    if (str13 == null) {
                        if (zzchVar.zzyk != null) {
                            return false;
                        }
                    } else if (!str13.equals(zzchVar.zzyk)) {
                        return false;
                    }
                    Long l9 = this.zzyl;
                    if (l9 == null) {
                        if (zzchVar.zzyl != null) {
                            return false;
                        }
                    } else if (!l9.equals(zzchVar.zzyl)) {
                        return false;
                    }
                    Long l10 = this.zzym;
                    if (l10 == null) {
                        if (zzchVar.zzym != null) {
                            return false;
                        }
                    } else if (!l10.equals(zzchVar.zzym)) {
                        return false;
                    }
                    String str14 = this.zzyn;
                    if (str14 == null) {
                        if (zzchVar.zzyn != null) {
                            return false;
                        }
                    } else if (!str14.equals(zzchVar.zzyn)) {
                        return false;
                    }
                    String str15 = this.zzyo;
                    if (str15 == null) {
                        if (zzchVar.zzyo != null) {
                            return false;
                        }
                    } else if (!str15.equals(zzchVar.zzyo)) {
                        return false;
                    }
                    Integer num7 = this.zzyp;
                    if (num7 == null) {
                        if (zzchVar.zzyp != null) {
                            return false;
                        }
                    } else if (!num7.equals(zzchVar.zzyp)) {
                        return false;
                    }
                    String str16 = this.zzxf;
                    if (str16 == null) {
                        if (zzchVar.zzxf != null) {
                            return false;
                        }
                    } else if (!str16.equals(zzchVar.zzxf)) {
                        return false;
                    }
                    zzbt.zze zzeVar = this.zzyq;
                    if (zzeVar == null) {
                        if (zzchVar.zzyq != null) {
                            return false;
                        }
                    } else if (!zzeVar.equals(zzchVar.zzyq)) {
                        return false;
                    }
                    if (zzit.equals(this.zzyr, zzchVar.zzyr)) {
                        Long l11 = this.zzys;
                        if (l11 == null) {
                            if (zzchVar.zzys != null) {
                                return false;
                            }
                        } else if (!l11.equals(zzchVar.zzys)) {
                            return false;
                        }
                        Long l12 = this.zzyt;
                        if (l12 == null) {
                            if (zzchVar.zzyt != null) {
                                return false;
                            }
                        } else if (!l12.equals(zzchVar.zzyt)) {
                            return false;
                        }
                        zzir zzirVar = this.zzand;
                        if (zzirVar != null && !zzirVar.isEmpty()) {
                            return this.zzand.equals(zzchVar.zzand);
                        }
                        zzir zzirVar2 = zzchVar.zzand;
                        return zzirVar2 == null || zzirVar2.isEmpty();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (zzch.class.getName().hashCode() + 527) * 31;
        Integer num = this.zzxn;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + zzit.hashCode(this.zzxo)) * 31) + zzit.hashCode(this.zzxp)) * 31;
        Long l = this.zzxq;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.zzxr;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.zzxs;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.zzxt;
        int hashCode6 = (hashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.zzxu;
        int hashCode7 = (hashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.zzxv;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zzxw;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zzxx;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zzex;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.zzxy;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.zzcp;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zzcf;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.zzcn;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l6 = this.zzxz;
        int hashCode16 = (hashCode15 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.zzya;
        int hashCode17 = (hashCode16 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str8 = this.zzyb;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.zzyc;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.zzcg;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l8 = this.zzyd;
        int hashCode21 = (hashCode20 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Integer num3 = this.zzye;
        int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.zzdn;
        int hashCode23 = (hashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.zzch;
        int hashCode24 = (hashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.zzyf;
        int hashCode25 = (((hashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + zzit.hashCode(this.zzyg)) * 31;
        String str12 = this.zzcj;
        int hashCode26 = (hashCode25 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num4 = this.zzyh;
        int hashCode27 = (hashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.zzyi;
        int hashCode28 = (hashCode27 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.zzyj;
        int hashCode29 = (hashCode28 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str13 = this.zzyk;
        int hashCode30 = (hashCode29 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l9 = this.zzyl;
        int hashCode31 = (hashCode30 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.zzym;
        int hashCode32 = (hashCode31 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str14 = this.zzyn;
        int hashCode33 = (hashCode32 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.zzyo;
        int hashCode34 = (hashCode33 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num7 = this.zzyp;
        int hashCode35 = (hashCode34 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str16 = this.zzxf;
        int hashCode36 = hashCode35 + (str16 == null ? 0 : str16.hashCode());
        zzbt.zze zzeVar = this.zzyq;
        int hashCode37 = ((((hashCode36 * 31) + (zzeVar == null ? 0 : zzeVar.hashCode())) * 31) + zzit.hashCode(this.zzyr)) * 31;
        Long l11 = this.zzys;
        int hashCode38 = (hashCode37 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.zzyt;
        int hashCode39 = (hashCode38 + (l12 == null ? 0 : l12.hashCode())) * 31;
        zzir zzirVar = this.zzand;
        if (zzirVar != null && !zzirVar.isEmpty()) {
            i = this.zzand.hashCode();
        }
        return hashCode39 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final void zza(zzin zzinVar) throws IOException {
        Integer num = this.zzxn;
        if (num != null) {
            zzinVar.zzc(1, num.intValue());
        }
        zzcf[] zzcfVarArr = this.zzxo;
        if (zzcfVarArr != null && zzcfVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzcf[] zzcfVarArr2 = this.zzxo;
                if (i >= zzcfVarArr2.length) {
                    break;
                }
                zzcf zzcfVar = zzcfVarArr2[i];
                if (zzcfVar != null) {
                    zzinVar.zza(2, zzcfVar);
                }
                i++;
            }
        }
        zzbt.zzh[] zzhVarArr = this.zzxp;
        if (zzhVarArr != null && zzhVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzbt.zzh[] zzhVarArr2 = this.zzxp;
                if (i2 >= zzhVarArr2.length) {
                    break;
                }
                zzbt.zzh zzhVar = zzhVarArr2[i2];
                if (zzhVar != null) {
                    zzinVar.zze(3, zzhVar);
                }
                i2++;
            }
        }
        Long l = this.zzxq;
        if (l != null) {
            zzinVar.zzi(4, l.longValue());
        }
        Long l2 = this.zzxr;
        if (l2 != null) {
            zzinVar.zzi(5, l2.longValue());
        }
        Long l3 = this.zzxs;
        if (l3 != null) {
            zzinVar.zzi(6, l3.longValue());
        }
        Long l4 = this.zzxu;
        if (l4 != null) {
            zzinVar.zzi(7, l4.longValue());
        }
        String str = this.zzxv;
        if (str != null) {
            zzinVar.zzb(8, str);
        }
        String str2 = this.zzxw;
        if (str2 != null) {
            zzinVar.zzb(9, str2);
        }
        String str3 = this.zzxx;
        if (str3 != null) {
            zzinVar.zzb(10, str3);
        }
        String str4 = this.zzex;
        if (str4 != null) {
            zzinVar.zzb(11, str4);
        }
        Integer num2 = this.zzxy;
        if (num2 != null) {
            zzinVar.zzc(12, num2.intValue());
        }
        String str5 = this.zzcp;
        if (str5 != null) {
            zzinVar.zzb(13, str5);
        }
        String str6 = this.zzcf;
        if (str6 != null) {
            zzinVar.zzb(14, str6);
        }
        String str7 = this.zzcn;
        if (str7 != null) {
            zzinVar.zzb(16, str7);
        }
        Long l5 = this.zzxz;
        if (l5 != null) {
            zzinVar.zzi(17, l5.longValue());
        }
        Long l6 = this.zzya;
        if (l6 != null) {
            zzinVar.zzi(18, l6.longValue());
        }
        String str8 = this.zzyb;
        if (str8 != null) {
            zzinVar.zzb(19, str8);
        }
        Boolean bool = this.zzyc;
        if (bool != null) {
            zzinVar.zzb(20, bool.booleanValue());
        }
        String str9 = this.zzcg;
        if (str9 != null) {
            zzinVar.zzb(21, str9);
        }
        Long l7 = this.zzyd;
        if (l7 != null) {
            zzinVar.zzi(22, l7.longValue());
        }
        Integer num3 = this.zzye;
        if (num3 != null) {
            zzinVar.zzc(23, num3.intValue());
        }
        String str10 = this.zzdn;
        if (str10 != null) {
            zzinVar.zzb(24, str10);
        }
        String str11 = this.zzch;
        if (str11 != null) {
            zzinVar.zzb(25, str11);
        }
        Long l8 = this.zzxt;
        if (l8 != null) {
            zzinVar.zzi(26, l8.longValue());
        }
        Boolean bool2 = this.zzyf;
        if (bool2 != null) {
            zzinVar.zzb(28, bool2.booleanValue());
        }
        zzbt.zza[] zzaVarArr = this.zzyg;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzbt.zza[] zzaVarArr2 = this.zzyg;
                if (i3 >= zzaVarArr2.length) {
                    break;
                }
                zzbt.zza zzaVar = zzaVarArr2[i3];
                if (zzaVar != null) {
                    zzinVar.zze(29, zzaVar);
                }
                i3++;
            }
        }
        String str12 = this.zzcj;
        if (str12 != null) {
            zzinVar.zzb(30, str12);
        }
        Integer num4 = this.zzyh;
        if (num4 != null) {
            zzinVar.zzc(31, num4.intValue());
        }
        Integer num5 = this.zzyi;
        if (num5 != null) {
            zzinVar.zzc(32, num5.intValue());
        }
        Integer num6 = this.zzyj;
        if (num6 != null) {
            zzinVar.zzc(33, num6.intValue());
        }
        String str13 = this.zzyk;
        if (str13 != null) {
            zzinVar.zzb(34, str13);
        }
        Long l9 = this.zzyl;
        if (l9 != null) {
            zzinVar.zzi(35, l9.longValue());
        }
        Long l10 = this.zzym;
        if (l10 != null) {
            zzinVar.zzi(36, l10.longValue());
        }
        String str14 = this.zzyn;
        if (str14 != null) {
            zzinVar.zzb(37, str14);
        }
        String str15 = this.zzyo;
        if (str15 != null) {
            zzinVar.zzb(38, str15);
        }
        Integer num7 = this.zzyp;
        if (num7 != null) {
            zzinVar.zzc(39, num7.intValue());
        }
        String str16 = this.zzxf;
        if (str16 != null) {
            zzinVar.zzb(41, str16);
        }
        zzbt.zze zzeVar = this.zzyq;
        if (zzeVar != null) {
            zzinVar.zze(44, zzeVar);
        }
        int[] iArr = this.zzyr;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.zzyr;
                if (i4 >= iArr2.length) {
                    break;
                }
                int i5 = iArr2[i4];
                zzinVar.zzb(45, 0);
                zzinVar.zzbl(i5);
                i4++;
            }
        }
        Long l11 = this.zzys;
        if (l11 != null) {
            zzinVar.zzi(46, l11.longValue());
        }
        Long l12 = this.zzyt;
        if (l12 != null) {
            zzinVar.zzi(47, l12.longValue());
        }
        super.zza(zzinVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final int zzja() {
        int[] iArr;
        int zzja = super.zzja();
        Integer num = this.zzxn;
        if (num != null) {
            zzja += zzin.zzg(1, num.intValue());
        }
        zzcf[] zzcfVarArr = this.zzxo;
        int i = 0;
        if (zzcfVarArr != null && zzcfVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzcf[] zzcfVarArr2 = this.zzxo;
                if (i2 >= zzcfVarArr2.length) {
                    break;
                }
                zzcf zzcfVar = zzcfVarArr2[i2];
                if (zzcfVar != null) {
                    zzja += zzin.zzb(2, zzcfVar);
                }
                i2++;
            }
        }
        zzbt.zzh[] zzhVarArr = this.zzxp;
        if (zzhVarArr != null && zzhVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzbt.zzh[] zzhVarArr2 = this.zzxp;
                if (i3 >= zzhVarArr2.length) {
                    break;
                }
                zzbt.zzh zzhVar = zzhVarArr2[i3];
                if (zzhVar != null) {
                    zzja += zzeg.zzc(3, zzhVar);
                }
                i3++;
            }
        }
        Long l = this.zzxq;
        if (l != null) {
            zzja += zzin.zzd(4, l.longValue());
        }
        Long l2 = this.zzxr;
        if (l2 != null) {
            zzja += zzin.zzd(5, l2.longValue());
        }
        Long l3 = this.zzxs;
        if (l3 != null) {
            zzja += zzin.zzd(6, l3.longValue());
        }
        Long l4 = this.zzxu;
        if (l4 != null) {
            zzja += zzin.zzd(7, l4.longValue());
        }
        String str = this.zzxv;
        if (str != null) {
            zzja += zzin.zzc(8, str);
        }
        String str2 = this.zzxw;
        if (str2 != null) {
            zzja += zzin.zzc(9, str2);
        }
        String str3 = this.zzxx;
        if (str3 != null) {
            zzja += zzin.zzc(10, str3);
        }
        String str4 = this.zzex;
        if (str4 != null) {
            zzja += zzin.zzc(11, str4);
        }
        Integer num2 = this.zzxy;
        if (num2 != null) {
            zzja += zzin.zzg(12, num2.intValue());
        }
        String str5 = this.zzcp;
        if (str5 != null) {
            zzja += zzin.zzc(13, str5);
        }
        String str6 = this.zzcf;
        if (str6 != null) {
            zzja += zzin.zzc(14, str6);
        }
        String str7 = this.zzcn;
        if (str7 != null) {
            zzja += zzin.zzc(16, str7);
        }
        Long l5 = this.zzxz;
        if (l5 != null) {
            zzja += zzin.zzd(17, l5.longValue());
        }
        Long l6 = this.zzya;
        if (l6 != null) {
            zzja += zzin.zzd(18, l6.longValue());
        }
        String str8 = this.zzyb;
        if (str8 != null) {
            zzja += zzin.zzc(19, str8);
        }
        Boolean bool = this.zzyc;
        if (bool != null) {
            bool.booleanValue();
            zzja += zzin.zzaj(20) + 1;
        }
        String str9 = this.zzcg;
        if (str9 != null) {
            zzja += zzin.zzc(21, str9);
        }
        Long l7 = this.zzyd;
        if (l7 != null) {
            zzja += zzin.zzd(22, l7.longValue());
        }
        Integer num3 = this.zzye;
        if (num3 != null) {
            zzja += zzin.zzg(23, num3.intValue());
        }
        String str10 = this.zzdn;
        if (str10 != null) {
            zzja += zzin.zzc(24, str10);
        }
        String str11 = this.zzch;
        if (str11 != null) {
            zzja += zzin.zzc(25, str11);
        }
        Long l8 = this.zzxt;
        if (l8 != null) {
            zzja += zzin.zzd(26, l8.longValue());
        }
        Boolean bool2 = this.zzyf;
        if (bool2 != null) {
            bool2.booleanValue();
            zzja += zzin.zzaj(28) + 1;
        }
        zzbt.zza[] zzaVarArr = this.zzyg;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                zzbt.zza[] zzaVarArr2 = this.zzyg;
                if (i4 >= zzaVarArr2.length) {
                    break;
                }
                zzbt.zza zzaVar = zzaVarArr2[i4];
                if (zzaVar != null) {
                    zzja += zzeg.zzc(29, zzaVar);
                }
                i4++;
            }
        }
        String str12 = this.zzcj;
        if (str12 != null) {
            zzja += zzin.zzc(30, str12);
        }
        Integer num4 = this.zzyh;
        if (num4 != null) {
            zzja += zzin.zzg(31, num4.intValue());
        }
        Integer num5 = this.zzyi;
        if (num5 != null) {
            zzja += zzin.zzg(32, num5.intValue());
        }
        Integer num6 = this.zzyj;
        if (num6 != null) {
            zzja += zzin.zzg(33, num6.intValue());
        }
        String str13 = this.zzyk;
        if (str13 != null) {
            zzja += zzin.zzc(34, str13);
        }
        Long l9 = this.zzyl;
        if (l9 != null) {
            zzja += zzin.zzd(35, l9.longValue());
        }
        Long l10 = this.zzym;
        if (l10 != null) {
            zzja += zzin.zzd(36, l10.longValue());
        }
        String str14 = this.zzyn;
        if (str14 != null) {
            zzja += zzin.zzc(37, str14);
        }
        String str15 = this.zzyo;
        if (str15 != null) {
            zzja += zzin.zzc(38, str15);
        }
        Integer num7 = this.zzyp;
        if (num7 != null) {
            zzja += zzin.zzg(39, num7.intValue());
        }
        String str16 = this.zzxf;
        if (str16 != null) {
            zzja += zzin.zzc(41, str16);
        }
        zzbt.zze zzeVar = this.zzyq;
        if (zzeVar != null) {
            zzja += zzeg.zzc(44, zzeVar);
        }
        int[] iArr2 = this.zzyr;
        if (iArr2 != null && iArr2.length > 0) {
            int i5 = 0;
            while (true) {
                iArr = this.zzyr;
                if (i >= iArr.length) {
                    break;
                }
                i5 += zzin.zzar(iArr[i]);
                i++;
            }
            zzja = zzja + i5 + (iArr.length * 2);
        }
        Long l11 = this.zzys;
        if (l11 != null) {
            zzja += zzin.zzd(46, l11.longValue());
        }
        Long l12 = this.zzyt;
        return l12 != null ? zzja + zzin.zzd(47, l12.longValue()) : zzja;
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final /* synthetic */ zziv zza(zzim zzimVar) throws IOException {
        while (true) {
            int zzkj = zzimVar.zzkj();
            switch (zzkj) {
                case 0:
                    return this;
                case 8:
                    this.zzxn = Integer.valueOf(zzimVar.zzlb());
                    break;
                case 18:
                    int zzb = zziy.zzb(zzimVar, 18);
                    zzcf[] zzcfVarArr = this.zzxo;
                    int length = zzcfVarArr == null ? 0 : zzcfVarArr.length;
                    int i = zzb + length;
                    zzcf[] zzcfVarArr2 = new zzcf[i];
                    if (length != 0) {
                        System.arraycopy(zzcfVarArr, 0, zzcfVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        zzcfVarArr2[length] = new zzcf();
                        zzimVar.zza(zzcfVarArr2[length]);
                        zzimVar.zzkj();
                        length++;
                    }
                    zzcfVarArr2[length] = new zzcf();
                    zzimVar.zza(zzcfVarArr2[length]);
                    this.zzxo = zzcfVarArr2;
                    break;
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    int zzb2 = zziy.zzb(zzimVar, 26);
                    zzbt.zzh[] zzhVarArr = this.zzxp;
                    int length2 = zzhVarArr == null ? 0 : zzhVarArr.length;
                    int i2 = zzb2 + length2;
                    zzbt.zzh[] zzhVarArr2 = new zzbt.zzh[i2];
                    if (length2 != 0) {
                        System.arraycopy(zzhVarArr, 0, zzhVarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        zzhVarArr2[length2] = (zzbt.zzh) zzimVar.zza(zzbt.zzh.zzgs());
                        zzimVar.zzkj();
                        length2++;
                    }
                    zzhVarArr2[length2] = (zzbt.zzh) zzimVar.zza(zzbt.zzh.zzgs());
                    this.zzxp = zzhVarArr2;
                    break;
                case 32:
                    this.zzxq = Long.valueOf(zzimVar.zzlc());
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    this.zzxr = Long.valueOf(zzimVar.zzlc());
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    this.zzxs = Long.valueOf(zzimVar.zzlc());
                    break;
                case 56:
                    this.zzxu = Long.valueOf(zzimVar.zzlc());
                    break;
                case 66:
                    this.zzxv = zzimVar.readString();
                    break;
                case 74:
                    this.zzxw = zzimVar.readString();
                    break;
                case 82:
                    this.zzxx = zzimVar.readString();
                    break;
                case 90:
                    this.zzex = zzimVar.readString();
                    break;
                case 96:
                    this.zzxy = Integer.valueOf(zzimVar.zzlb());
                    break;
                case 106:
                    this.zzcp = zzimVar.readString();
                    break;
                case 114:
                    this.zzcf = zzimVar.readString();
                    break;
                case 130:
                    this.zzcn = zzimVar.readString();
                    break;
                case 136:
                    this.zzxz = Long.valueOf(zzimVar.zzlc());
                    break;
                case 144:
                    this.zzya = Long.valueOf(zzimVar.zzlc());
                    break;
                case 154:
                    this.zzyb = zzimVar.readString();
                    break;
                case 160:
                    this.zzyc = Boolean.valueOf(zzimVar.zzkp());
                    break;
                case 170:
                    this.zzcg = zzimVar.readString();
                    break;
                case 176:
                    this.zzyd = Long.valueOf(zzimVar.zzlc());
                    break;
                case 184:
                    this.zzye = Integer.valueOf(zzimVar.zzlb());
                    break;
                case 194:
                    this.zzdn = zzimVar.readString();
                    break;
                case 202:
                    this.zzch = zzimVar.readString();
                    break;
                case 208:
                    this.zzxt = Long.valueOf(zzimVar.zzlc());
                    break;
                case 224:
                    this.zzyf = Boolean.valueOf(zzimVar.zzkp());
                    break;
                case 234:
                    int zzb3 = zziy.zzb(zzimVar, 234);
                    zzbt.zza[] zzaVarArr = this.zzyg;
                    int length3 = zzaVarArr == null ? 0 : zzaVarArr.length;
                    int i3 = zzb3 + length3;
                    zzbt.zza[] zzaVarArr2 = new zzbt.zza[i3];
                    if (length3 != 0) {
                        System.arraycopy(zzaVarArr, 0, zzaVarArr2, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        zzaVarArr2[length3] = (zzbt.zza) zzimVar.zza(zzbt.zza.zzgs());
                        zzimVar.zzkj();
                        length3++;
                    }
                    zzaVarArr2[length3] = (zzbt.zza) zzimVar.zza(zzbt.zza.zzgs());
                    this.zzyg = zzaVarArr2;
                    break;
                case 242:
                    this.zzcj = zzimVar.readString();
                    break;
                case 248:
                    this.zzyh = Integer.valueOf(zzimVar.zzlb());
                    break;
                case Barcode.QR_CODE /* 256 */:
                    this.zzyi = Integer.valueOf(zzimVar.zzlb());
                    break;
                case 264:
                    this.zzyj = Integer.valueOf(zzimVar.zzlb());
                    break;
                case 274:
                    this.zzyk = zzimVar.readString();
                    break;
                case 280:
                    this.zzyl = Long.valueOf(zzimVar.zzlc());
                    break;
                case 288:
                    this.zzym = Long.valueOf(zzimVar.zzlc());
                    break;
                case 298:
                    this.zzyn = zzimVar.readString();
                    break;
                case 306:
                    this.zzyo = zzimVar.readString();
                    break;
                case 312:
                    this.zzyp = Integer.valueOf(zzimVar.zzlb());
                    break;
                case 330:
                    this.zzxf = zzimVar.readString();
                    break;
                case 354:
                    zzbt.zze zzeVar = (zzbt.zze) zzimVar.zza(zzbt.zze.zzgs());
                    zzbt.zze zzeVar2 = this.zzyq;
                    if (zzeVar2 != null) {
                        zzeVar = (zzbt.zze) ((zzez) zzeVar2.zzmh().zza((zzbt.zze.zza) zzeVar).zzmr());
                    }
                    this.zzyq = zzeVar;
                    break;
                case 360:
                    int zzb4 = zziy.zzb(zzimVar, 360);
                    int[] iArr = this.zzyr;
                    int length4 = iArr == null ? 0 : iArr.length;
                    int i4 = zzb4 + length4;
                    int[] iArr2 = new int[i4];
                    if (length4 != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        iArr2[length4] = zzimVar.zzlb();
                        zzimVar.zzkj();
                        length4++;
                    }
                    iArr2[length4] = zzimVar.zzlb();
                    this.zzyr = iArr2;
                    break;
                case 362:
                    int zzx = zzimVar.zzx(zzimVar.zzlb());
                    int position = zzimVar.getPosition();
                    int i5 = 0;
                    while (zzimVar.zzpd() > 0) {
                        zzimVar.zzlb();
                        i5++;
                    }
                    zzimVar.zzbj(position);
                    int[] iArr3 = this.zzyr;
                    int length5 = iArr3 == null ? 0 : iArr3.length;
                    int i6 = i5 + length5;
                    int[] iArr4 = new int[i6];
                    if (length5 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length5);
                    }
                    while (length5 < i6) {
                        iArr4[length5] = zzimVar.zzlb();
                        length5++;
                    }
                    this.zzyr = iArr4;
                    zzimVar.zzy(zzx);
                    break;
                case 368:
                    this.zzys = Long.valueOf(zzimVar.zzlc());
                    break;
                case 376:
                    this.zzyt = Long.valueOf(zzimVar.zzlc());
                    break;
                default:
                    if (super.zza(zzimVar, zzkj)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }
}
