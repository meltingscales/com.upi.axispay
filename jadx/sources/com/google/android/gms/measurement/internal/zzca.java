package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzca extends zzan {
    private final zzft zzkt;
    private Boolean zzoq;
    private String zzor;

    public zzca(zzft zzftVar) {
        this(zzftVar, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(zzaj zzajVar, zzm zzmVar) {
        Preconditions.checkNotNull(zzajVar);
        zzb(zzmVar, false);
        zzc(new zzcl(this, zzajVar, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zzb(zzm zzmVar) {
        zzb(zzmVar, false);
        zzc(new zzcb(this, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final String zzc(zzm zzmVar) {
        zzb(zzmVar, false);
        return this.zzkt.zzh(zzmVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final List<zzr> zzd(String str, String str2, String str3) {
        zza(str, true);
        try {
            return (List) this.zzkt.zzac().zza(new zzcj(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zzkt.zzad().zzda().zza("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    private zzca(zzft zzftVar, String str) {
        Preconditions.checkNotNull(zzftVar);
        this.zzkt = zzftVar;
        this.zzor = null;
    }

    @VisibleForTesting
    private final void zzc(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (zzal.zzhw.get(null).booleanValue() && this.zzkt.zzac().zzef()) {
            runnable.run();
        } else {
            this.zzkt.zzac().zza(runnable);
        }
    }

    @VisibleForTesting
    public final zzaj zzb(zzaj zzajVar, zzm zzmVar) {
        zzag zzagVar;
        boolean z = false;
        if ("_cmp".equals(zzajVar.name) && (zzagVar = zzajVar.zzfd) != null && zzagVar.size() != 0) {
            String string = zzajVar.zzfd.getString("_cis");
            if (!TextUtils.isEmpty(string) && (("referrer broadcast".equals(string) || "referrer API".equals(string)) && this.zzkt.zzaf().zzw(zzmVar.packageName))) {
                z = true;
            }
        }
        if (z) {
            this.zzkt.zzad().zzdg().zza("Event has been filtered ", zzajVar.toString());
            return new zzaj("_cmpx", zzajVar.zzfd, zzajVar.origin, zzajVar.zzfp);
        }
        return zzajVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(zzaj zzajVar, String str, String str2) {
        Preconditions.checkNotNull(zzajVar);
        Preconditions.checkNotEmpty(str);
        zza(str, true);
        zzc(new zzcm(this, zzajVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final byte[] zza(zzaj zzajVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzajVar);
        zza(str, true);
        this.zzkt.zzad().zzdh().zza("Log and bundle. event", this.zzkt.zzaa().zzal(zzajVar.name));
        long nanoTime = this.zzkt.zzz().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zzkt.zzac().zzb(new zzcn(this, zzajVar, str)).get();
            if (bArr == null) {
                this.zzkt.zzad().zzda().zza("Log and bundle returned null. appId", zzau.zzao(str));
                bArr = new byte[0];
            }
            this.zzkt.zzad().zzdh().zza("Log and bundle processed. event, size, time_ms", this.zzkt.zzaa().zzal(zzajVar.name), Integer.valueOf(bArr.length), Long.valueOf((this.zzkt.zzz().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.zzkt.zzad().zzda().zza("Failed to log and bundle. appId, event, error", zzau.zzao(str), this.zzkt.zzaa().zzal(zzajVar.name), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zzd(zzm zzmVar) {
        zza(zzmVar.packageName, false);
        zzc(new zzck(this, zzmVar));
    }

    private final void zzb(zzm zzmVar, boolean z) {
        Preconditions.checkNotNull(zzmVar);
        zza(zzmVar.packageName, false);
        this.zzkt.zzab().zzr(zzmVar.zzch, zzmVar.zzcv);
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zzb(zzr zzrVar) {
        Preconditions.checkNotNull(zzrVar);
        Preconditions.checkNotNull(zzrVar.zzdv);
        zza(zzrVar.packageName, true);
        zzr zzrVar2 = new zzr(zzrVar);
        if (zzrVar.zzdv.getValue() == null) {
            zzc(new zzce(this, zzrVar2));
        } else {
            zzc(new zzcf(this, zzrVar2));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(zzga zzgaVar, zzm zzmVar) {
        Preconditions.checkNotNull(zzgaVar);
        zzb(zzmVar, false);
        if (zzgaVar.getValue() == null) {
            zzc(new zzco(this, zzgaVar, zzmVar));
        } else {
            zzc(new zzcp(this, zzgaVar, zzmVar));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final List<zzga> zza(zzm zzmVar, boolean z) {
        zzb(zzmVar, false);
        try {
            List<zzgc> list = (List) this.zzkt.zzac().zza(new zzcq(this, zzmVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzgc zzgcVar : list) {
                if (z || !zzgd.zzbs(zzgcVar.name)) {
                    arrayList.add(new zzga(zzgcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zzkt.zzad().zzda().zza("Failed to get user attributes. appId", zzau.zzao(zzmVar.packageName), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(zzm zzmVar) {
        zzb(zzmVar, false);
        zzc(new zzcr(this, zzmVar));
    }

    private final void zza(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.zzoq == null) {
                        if (!"com.google.android.gms".equals(this.zzor) && !UidVerifier.isGooglePlayServicesUid(this.zzkt.getContext(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(this.zzkt.getContext()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z2 = false;
                            this.zzoq = Boolean.valueOf(z2);
                        }
                        z2 = true;
                        this.zzoq = Boolean.valueOf(z2);
                    }
                    if (this.zzoq.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.zzkt.zzad().zzda().zza("Measurement Service called with invalid calling package. appId", zzau.zzao(str));
                    throw e;
                }
            }
            if (this.zzor == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zzkt.getContext(), Binder.getCallingUid(), str)) {
                this.zzor = str;
            }
            if (str.equals(this.zzor)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        this.zzkt.zzad().zzda().zzaq("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(long j, String str, String str2, String str3) {
        zzc(new zzcs(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zza(zzr zzrVar, zzm zzmVar) {
        Preconditions.checkNotNull(zzrVar);
        Preconditions.checkNotNull(zzrVar.zzdv);
        zzb(zzmVar, false);
        zzr zzrVar2 = new zzr(zzrVar);
        zzrVar2.packageName = zzmVar.packageName;
        if (zzrVar.zzdv.getValue() == null) {
            zzc(new zzcc(this, zzrVar2, zzmVar));
        } else {
            zzc(new zzcd(this, zzrVar2, zzmVar));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final List<zzga> zza(String str, String str2, boolean z, zzm zzmVar) {
        zzb(zzmVar, false);
        try {
            List<zzgc> list = (List) this.zzkt.zzac().zza(new zzcg(this, zzmVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzgc zzgcVar : list) {
                if (z || !zzgd.zzbs(zzgcVar.name)) {
                    arrayList.add(new zzga(zzgcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zzkt.zzad().zzda().zza("Failed to get user attributes. appId", zzau.zzao(zzmVar.packageName), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final List<zzga> zza(String str, String str2, String str3, boolean z) {
        zza(str, true);
        try {
            List<zzgc> list = (List) this.zzkt.zzac().zza(new zzch(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzgc zzgcVar : list) {
                if (z || !zzgd.zzbs(zzgcVar.name)) {
                    arrayList.add(new zzga(zzgcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zzkt.zzad().zzda().zza("Failed to get user attributes. appId", zzau.zzao(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final List<zzr> zza(String str, String str2, zzm zzmVar) {
        zzb(zzmVar, false);
        try {
            return (List) this.zzkt.zzac().zza(new zzci(this, zzmVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zzkt.zzad().zzda().zza("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }
}
