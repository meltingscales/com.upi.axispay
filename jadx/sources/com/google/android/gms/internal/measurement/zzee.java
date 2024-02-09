package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzee implements zzgx {
    private int tag;
    private final zzeb zzacr;
    private int zzacs;
    private int zzact = 0;

    private zzee(zzeb zzebVar) {
        zzeb zzebVar2 = (zzeb) zzfb.zza(zzebVar, "input");
        this.zzacr = zzebVar2;
        zzebVar2.zzack = this;
    }

    public static zzee zza(zzeb zzebVar) {
        zzee zzeeVar = zzebVar.zzack;
        return zzeeVar != null ? zzeeVar : new zzee(zzebVar);
    }

    private final void zzab(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzfh.zzmz();
        }
    }

    private static void zzac(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzfh.zznb();
        }
    }

    private static void zzad(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzfh.zznb();
        }
    }

    private final void zzae(int i) throws IOException {
        if (this.zzacr.zzla() != i) {
            throw zzfh.zzmu();
        }
    }

    private final <T> T zzc(zzgy<T> zzgyVar, zzem zzemVar) throws IOException {
        zzeb zzebVar;
        int zzks = this.zzacr.zzks();
        zzeb zzebVar2 = this.zzacr;
        if (zzebVar2.zzach < zzebVar2.zzaci) {
            int zzx = zzebVar2.zzx(zzks);
            T newInstance = zzgyVar.newInstance();
            this.zzacr.zzach++;
            zzgyVar.zza(newInstance, this, zzemVar);
            zzgyVar.zzi(newInstance);
            this.zzacr.zzu(0);
            zzebVar.zzach--;
            this.zzacr.zzy(zzx);
            return newInstance;
        }
        throw zzfh.zzna();
    }

    private final <T> T zzd(zzgy<T> zzgyVar, zzem zzemVar) throws IOException {
        int i = this.zzacs;
        this.zzacs = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzgyVar.newInstance();
            zzgyVar.zza(newInstance, this, zzemVar);
            zzgyVar.zzi(newInstance);
            if (this.tag == this.zzacs) {
                return newInstance;
            }
            throw zzfh.zznb();
        } finally {
            this.zzacs = i;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final double readDouble() throws IOException {
        zzab(1);
        return this.zzacr.readDouble();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final float readFloat() throws IOException {
        zzab(5);
        return this.zzacr.readFloat();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final String readString() throws IOException {
        zzab(2);
        return this.zzacr.readString();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final <T> T zzb(zzgy<T> zzgyVar, zzem zzemVar) throws IOException {
        zzab(3);
        return (T) zzd(zzgyVar, zzemVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zze(List<Float> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzew) {
            zzew zzewVar = (zzew) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzks = this.zzacr.zzks();
                zzad(zzks);
                int zzla = this.zzacr.zzla() + zzks;
                do {
                    zzewVar.zzc(this.zzacr.readFloat());
                } while (this.zzacr.zzla() < zzla);
                return;
            } else if (i == 5) {
                do {
                    zzewVar.zzc(this.zzacr.readFloat());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzks2 = this.zzacr.zzks();
            zzad(zzks2);
            int zzla2 = this.zzacr.zzla() + zzks2;
            do {
                list.add(Float.valueOf(this.zzacr.readFloat()));
            } while (this.zzacr.zzla() < zzla2);
        } else if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.zzacr.readFloat()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzf(List<Long> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfvVar.zzbb(this.zzacr.zzkk());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else if (i == 2) {
                int zzla = this.zzacr.zzla() + this.zzacr.zzks();
                do {
                    zzfvVar.zzbb(this.zzacr.zzkk());
                } while (this.zzacr.zzla() < zzla);
                zzae(zzla);
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzacr.zzkk()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else if (i2 == 2) {
            int zzla2 = this.zzacr.zzla() + this.zzacr.zzks();
            do {
                list.add(Long.valueOf(this.zzacr.zzkk()));
            } while (this.zzacr.zzla() < zzla2);
            zzae(zzla2);
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzg(List<Long> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfvVar.zzbb(this.zzacr.zzkl());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else if (i == 2) {
                int zzla = this.zzacr.zzla() + this.zzacr.zzks();
                do {
                    zzfvVar.zzbb(this.zzacr.zzkl());
                } while (this.zzacr.zzla() < zzla);
                zzae(zzla);
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzacr.zzkl()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else if (i2 == 2) {
            int zzla2 = this.zzacr.zzla() + this.zzacr.zzks();
            do {
                list.add(Long.valueOf(this.zzacr.zzkl()));
            } while (this.zzacr.zzla() < zzla2);
            zzae(zzla2);
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzh(List<Integer> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfaVar.zzau(this.zzacr.zzkm());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else if (i == 2) {
                int zzla = this.zzacr.zzla() + this.zzacr.zzks();
                do {
                    zzfaVar.zzau(this.zzacr.zzkm());
                } while (this.zzacr.zzla() < zzla);
                zzae(zzla);
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzacr.zzkm()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else if (i2 == 2) {
            int zzla2 = this.zzacr.zzla() + this.zzacr.zzks();
            do {
                list.add(Integer.valueOf(this.zzacr.zzkm()));
            } while (this.zzacr.zzla() < zzla2);
            zzae(zzla2);
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzi(List<Long> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzfvVar.zzbb(this.zzacr.zzkn());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else if (i == 2) {
                int zzks = this.zzacr.zzks();
                zzac(zzks);
                int zzla = this.zzacr.zzla() + zzks;
                do {
                    zzfvVar.zzbb(this.zzacr.zzkn());
                } while (this.zzacr.zzla() < zzla);
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzacr.zzkn()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else if (i2 == 2) {
            int zzks2 = this.zzacr.zzks();
            zzac(zzks2);
            int zzla2 = this.zzacr.zzla() + zzks2;
            do {
                list.add(Long.valueOf(this.zzacr.zzkn()));
            } while (this.zzacr.zzla() < zzla2);
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzj(List<Integer> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzks = this.zzacr.zzks();
                zzad(zzks);
                int zzla = this.zzacr.zzla() + zzks;
                do {
                    zzfaVar.zzau(this.zzacr.zzko());
                } while (this.zzacr.zzla() < zzla);
                return;
            } else if (i == 5) {
                do {
                    zzfaVar.zzau(this.zzacr.zzko());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzks2 = this.zzacr.zzks();
            zzad(zzks2);
            int zzla2 = this.zzacr.zzla() + zzks2;
            do {
                list.add(Integer.valueOf(this.zzacr.zzko()));
            } while (this.zzacr.zzla() < zzla2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzacr.zzko()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzk(List<Boolean> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzdn) {
            zzdn zzdnVar = (zzdn) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdnVar.addBoolean(this.zzacr.zzkp());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else if (i == 2) {
                int zzla = this.zzacr.zzla() + this.zzacr.zzks();
                do {
                    zzdnVar.addBoolean(this.zzacr.zzkp());
                } while (this.zzacr.zzla() < zzla);
                zzae(zzla);
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zzacr.zzkp()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else if (i2 == 2) {
            int zzla2 = this.zzacr.zzla() + this.zzacr.zzks();
            do {
                list.add(Boolean.valueOf(this.zzacr.zzkp()));
            } while (this.zzacr.zzla() < zzla2);
            zzae(zzla2);
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final long zzkk() throws IOException {
        zzab(0);
        return this.zzacr.zzkk();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final long zzkl() throws IOException {
        zzab(0);
        return this.zzacr.zzkl();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int zzkm() throws IOException {
        zzab(0);
        return this.zzacr.zzkm();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final long zzkn() throws IOException {
        zzab(1);
        return this.zzacr.zzkn();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int zzko() throws IOException {
        zzab(5);
        return this.zzacr.zzko();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final boolean zzkp() throws IOException {
        zzab(0);
        return this.zzacr.zzkp();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final String zzkq() throws IOException {
        zzab(2);
        return this.zzacr.zzkq();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final zzdp zzkr() throws IOException {
        zzab(2);
        return this.zzacr.zzkr();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int zzks() throws IOException {
        zzab(0);
        return this.zzacr.zzks();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int zzkt() throws IOException {
        zzab(0);
        return this.zzacr.zzkt();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int zzku() throws IOException {
        zzab(5);
        return this.zzacr.zzku();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final long zzkv() throws IOException {
        zzab(1);
        return this.zzacr.zzkv();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int zzkw() throws IOException {
        zzab(0);
        return this.zzacr.zzkw();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final long zzkx() throws IOException {
        zzab(0);
        return this.zzacr.zzkx();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzl(List<String> list) throws IOException {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final int zzlh() throws IOException {
        int i = this.zzact;
        if (i != 0) {
            this.tag = i;
            this.zzact = 0;
        } else {
            this.tag = this.zzacr.zzkj();
        }
        int i2 = this.tag;
        return (i2 == 0 || i2 == this.zzacs) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final boolean zzli() throws IOException {
        int i;
        if (this.zzacr.zzkz() || (i = this.tag) == this.zzacs) {
            return false;
        }
        return this.zzacr.zzv(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzm(List<zzdp> list) throws IOException {
        int zzkj;
        if ((this.tag & 7) == 2) {
            do {
                list.add(zzkr());
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
            return;
        }
        throw zzfh.zzmz();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzn(List<Integer> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfaVar.zzau(this.zzacr.zzks());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else if (i == 2) {
                int zzla = this.zzacr.zzla() + this.zzacr.zzks();
                do {
                    zzfaVar.zzau(this.zzacr.zzks());
                } while (this.zzacr.zzla() < zzla);
                zzae(zzla);
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzacr.zzks()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else if (i2 == 2) {
            int zzla2 = this.zzacr.zzla() + this.zzacr.zzks();
            do {
                list.add(Integer.valueOf(this.zzacr.zzks()));
            } while (this.zzacr.zzla() < zzla2);
            zzae(zzla2);
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzo(List<Integer> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfaVar.zzau(this.zzacr.zzkt());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else if (i == 2) {
                int zzla = this.zzacr.zzla() + this.zzacr.zzks();
                do {
                    zzfaVar.zzau(this.zzacr.zzkt());
                } while (this.zzacr.zzla() < zzla);
                zzae(zzla);
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzacr.zzkt()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else if (i2 == 2) {
            int zzla2 = this.zzacr.zzla() + this.zzacr.zzks();
            do {
                list.add(Integer.valueOf(this.zzacr.zzkt()));
            } while (this.zzacr.zzla() < zzla2);
            zzae(zzla2);
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzp(List<Integer> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzks = this.zzacr.zzks();
                zzad(zzks);
                int zzla = this.zzacr.zzla() + zzks;
                do {
                    zzfaVar.zzau(this.zzacr.zzku());
                } while (this.zzacr.zzla() < zzla);
                return;
            } else if (i == 5) {
                do {
                    zzfaVar.zzau(this.zzacr.zzku());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzks2 = this.zzacr.zzks();
            zzad(zzks2);
            int zzla2 = this.zzacr.zzla() + zzks2;
            do {
                list.add(Integer.valueOf(this.zzacr.zzku()));
            } while (this.zzacr.zzla() < zzla2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzacr.zzku()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzq(List<Long> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzfvVar.zzbb(this.zzacr.zzkv());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else if (i == 2) {
                int zzks = this.zzacr.zzks();
                zzac(zzks);
                int zzla = this.zzacr.zzla() + zzks;
                do {
                    zzfvVar.zzbb(this.zzacr.zzkv());
                } while (this.zzacr.zzla() < zzla);
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzacr.zzkv()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else if (i2 == 2) {
            int zzks2 = this.zzacr.zzks();
            zzac(zzks2);
            int zzla2 = this.zzacr.zzla() + zzks2;
            do {
                list.add(Long.valueOf(this.zzacr.zzkv()));
            } while (this.zzacr.zzla() < zzla2);
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzr(List<Integer> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfaVar.zzau(this.zzacr.zzkw());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else if (i == 2) {
                int zzla = this.zzacr.zzla() + this.zzacr.zzks();
                do {
                    zzfaVar.zzau(this.zzacr.zzkw());
                } while (this.zzacr.zzla() < zzla);
                zzae(zzla);
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzacr.zzkw()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else if (i2 == 2) {
            int zzla2 = this.zzacr.zzla() + this.zzacr.zzks();
            do {
                list.add(Integer.valueOf(this.zzacr.zzkw()));
            } while (this.zzacr.zzla() < zzla2);
            zzae(zzla2);
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzs(List<Long> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfvVar.zzbb(this.zzacr.zzkx());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else if (i == 2) {
                int zzla = this.zzacr.zzla() + this.zzacr.zzks();
                do {
                    zzfvVar.zzbb(this.zzacr.zzkx());
                } while (this.zzacr.zzla() < zzla);
                zzae(zzla);
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzacr.zzkx()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else if (i2 == 2) {
            int zzla2 = this.zzacr.zzla() + this.zzacr.zzks();
            do {
                list.add(Long.valueOf(this.zzacr.zzkx()));
            } while (this.zzacr.zzla() < zzla2);
            zzae(zzla2);
        } else {
            throw zzfh.zzmz();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final <T> T zza(zzgy<T> zzgyVar, zzem zzemVar) throws IOException {
        zzab(2);
        return (T) zzc(zzgyVar, zzemVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzgx
    public final <T> void zzb(List<T> list, zzgy<T> zzgyVar, zzem zzemVar) throws IOException {
        int zzkj;
        int i = this.tag;
        if ((i & 7) == 3) {
            do {
                list.add(zzd(zzgyVar, zzemVar));
                if (this.zzacr.zzkz() || this.zzact != 0) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == i);
            this.zzact = zzkj;
            return;
        }
        throw zzfh.zzmz();
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zzkj;
        int zzkj2;
        if ((this.tag & 7) == 2) {
            if ((list instanceof zzfq) && !z) {
                zzfq zzfqVar = (zzfq) list;
                do {
                    zzfqVar.zzc(zzkr());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            }
            do {
                list.add(z ? zzkq() : readString());
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
            return;
        }
        throw zzfh.zzmz();
    }

    @Override // com.google.android.gms.internal.measurement.zzgx
    public final void zzd(List<Double> list) throws IOException {
        int zzkj;
        int zzkj2;
        if (list instanceof zzej) {
            zzej zzejVar = (zzej) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzejVar.zzf(this.zzacr.readDouble());
                    if (this.zzacr.zzkz()) {
                        return;
                    }
                    zzkj2 = this.zzacr.zzkj();
                } while (zzkj2 == this.tag);
                this.zzact = zzkj2;
                return;
            } else if (i == 2) {
                int zzks = this.zzacr.zzks();
                zzac(zzks);
                int zzla = this.zzacr.zzla() + zzks;
                do {
                    zzejVar.zzf(this.zzacr.readDouble());
                } while (this.zzacr.zzla() < zzla);
                return;
            } else {
                throw zzfh.zzmz();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zzacr.readDouble()));
                if (this.zzacr.zzkz()) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == this.tag);
            this.zzact = zzkj;
        } else if (i2 == 2) {
            int zzks2 = this.zzacr.zzks();
            zzac(zzks2);
            int zzla2 = this.zzacr.zzla() + zzks2;
            do {
                list.add(Double.valueOf(this.zzacr.readDouble()));
            } while (this.zzacr.zzla() < zzla2);
        } else {
            throw zzfh.zzmz();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzgx
    public final <T> void zza(List<T> list, zzgy<T> zzgyVar, zzem zzemVar) throws IOException {
        int zzkj;
        int i = this.tag;
        if ((i & 7) == 2) {
            do {
                list.add(zzc(zzgyVar, zzemVar));
                if (this.zzacr.zzkz() || this.zzact != 0) {
                    return;
                }
                zzkj = this.zzacr.zzkj();
            } while (zzkj == i);
            this.zzact = zzkj;
            return;
        }
        throw zzfh.zzmz();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzgx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.zzga<K, V> r9, com.google.android.gms.internal.measurement.zzem r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.zzab(r0)
            com.google.android.gms.internal.measurement.zzeb r1 = r7.zzacr
            int r1 = r1.zzks()
            com.google.android.gms.internal.measurement.zzeb r2 = r7.zzacr
            int r1 = r2.zzx(r1)
            K r2 = r9.zzait
            V r3 = r9.zzzw
        L14:
            int r4 = r7.zzlh()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.measurement.zzeb r5 = r7.zzacr     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.zzkz()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.zzli()     // Catch: com.google.android.gms.internal.measurement.zzfi -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.measurement.zzfh r4 = new com.google.android.gms.internal.measurement.zzfh     // Catch: com.google.android.gms.internal.measurement.zzfi -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.measurement.zzfi -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.measurement.zzfi -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.measurement.zzif r4 = r9.zzaiu     // Catch: com.google.android.gms.internal.measurement.zzfi -> L4e java.lang.Throwable -> L64
            V r5 = r9.zzzw     // Catch: com.google.android.gms.internal.measurement.zzfi -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.measurement.zzfi -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: com.google.android.gms.internal.measurement.zzfi -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.measurement.zzif r4 = r9.zzais     // Catch: com.google.android.gms.internal.measurement.zzfi -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: com.google.android.gms.internal.measurement.zzfi -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.zzli()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.measurement.zzfh r8 = new com.google.android.gms.internal.measurement.zzfh     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.measurement.zzeb r8 = r7.zzacr
            r8.zzy(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.measurement.zzeb r9 = r7.zzacr
            r9.zzy(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzee.zza(java.util.Map, com.google.android.gms.internal.measurement.zzga, com.google.android.gms.internal.measurement.zzem):void");
    }

    private final Object zza(zzif zzifVar, Class<?> cls, zzem zzemVar) throws IOException {
        switch (zzef.zzacu[zzifVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzkp());
            case 2:
                return zzkr();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzkt());
            case 5:
                return Integer.valueOf(zzko());
            case 6:
                return Long.valueOf(zzkn());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzkm());
            case 9:
                return Long.valueOf(zzkl());
            case 10:
                zzab(2);
                return zzc(zzgu.zznz().zzf(cls), zzemVar);
            case 11:
                return Integer.valueOf(zzku());
            case 12:
                return Long.valueOf(zzkv());
            case 13:
                return Integer.valueOf(zzkw());
            case 14:
                return Long.valueOf(zzkx());
            case 15:
                return zzkq();
            case 16:
                return Integer.valueOf(zzks());
            case 17:
                return Long.valueOf(zzkk());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }
}
