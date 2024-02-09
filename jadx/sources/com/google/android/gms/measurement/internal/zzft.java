package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.measurement.zziv;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzft implements zzcv {
    private static volatile zzft zzrt;
    private boolean zzce;
    private final zzby zzl;
    private zzbs zzru;
    private zzay zzrv;
    private zzw zzrw;
    private zzbd zzrx;
    private zzfp zzry;
    private zzo zzrz;
    private final zzfz zzsa;
    private zzea zzsb;
    private boolean zzsc;
    private boolean zzsd;
    @VisibleForTesting
    private long zzse;
    private List<Runnable> zzsf;
    private int zzsg;
    private int zzsh;
    private boolean zzsi;
    private boolean zzsj;
    private boolean zzsk;
    private FileLock zzsl;
    private FileChannel zzsm;
    private List<Long> zzsn;
    private List<Long> zzso;
    private long zzsp;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class zza implements zzy {
        public com.google.android.gms.internal.measurement.zzch zzst;
        public List<Long> zzsu;
        public List<com.google.android.gms.internal.measurement.zzcf> zzsv;
        private long zzsw;

        private zza() {
        }

        @Override // com.google.android.gms.measurement.internal.zzy
        public final boolean zza(long j, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
            Preconditions.checkNotNull(zzcfVar);
            if (this.zzsv == null) {
                this.zzsv = new ArrayList();
            }
            if (this.zzsu == null) {
                this.zzsu = new ArrayList();
            }
            if (this.zzsv.size() <= 0 || zza(this.zzsv.get(0)) == zza(zzcfVar)) {
                long zzly = this.zzsw + zzcfVar.zzly();
                if (zzly >= Math.max(0, zzal.zzgl.get(null).intValue())) {
                    return false;
                }
                this.zzsw = zzly;
                this.zzsv.add(zzcfVar);
                this.zzsu.add(Long.valueOf(j));
                return this.zzsv.size() < Math.max(1, zzal.zzgm.get(null).intValue());
            }
            return false;
        }

        @Override // com.google.android.gms.measurement.internal.zzy
        public final void zzb(com.google.android.gms.internal.measurement.zzch zzchVar) {
            Preconditions.checkNotNull(zzchVar);
            this.zzst = zzchVar;
        }

        public /* synthetic */ zza(zzft zzftVar, zzfu zzfuVar) {
            this();
        }

        private static long zza(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
            return ((zzcfVar.zzxj.longValue() / 1000) / 60) / 60;
        }
    }

    private zzft(zzfy zzfyVar) {
        this(zzfyVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzfy zzfyVar) {
        this.zzl.zzac().zzq();
        zzw zzwVar = new zzw(this);
        zzwVar.zzai();
        this.zzrw = zzwVar;
        this.zzl.zzaf().zza(this.zzru);
        zzo zzoVar = new zzo(this);
        zzoVar.zzai();
        this.zzrz = zzoVar;
        zzea zzeaVar = new zzea(this);
        zzeaVar.zzai();
        this.zzsb = zzeaVar;
        zzfp zzfpVar = new zzfp(this);
        zzfpVar.zzai();
        this.zzry = zzfpVar;
        this.zzrx = new zzbd(this);
        if (this.zzsg != this.zzsh) {
            this.zzl.zzad().zzda().zza("Not all upload components initialized", Integer.valueOf(this.zzsg), Integer.valueOf(this.zzsh));
        }
        this.zzce = true;
    }

    private final void zzb(zzg zzgVar) {
        zzq();
        if (TextUtils.isEmpty(zzgVar.getGmpAppId()) && (!zzt.zzbx() || TextUtils.isEmpty(zzgVar.zzao()))) {
            zzb(zzgVar.zzan(), 204, null, null, null);
            return;
        }
        zzt zzaf = this.zzl.zzaf();
        Uri.Builder builder = new Uri.Builder();
        String gmpAppId = zzgVar.getGmpAppId();
        if (TextUtils.isEmpty(gmpAppId) && zzt.zzbx()) {
            gmpAppId = zzgVar.zzao();
        }
        o4 o4Var = null;
        Uri.Builder encodedAuthority = builder.scheme(zzal.zzgh.get(null)).encodedAuthority(zzal.zzgi.get(null));
        String valueOf = String.valueOf(gmpAppId);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", zzgVar.getAppInstanceId()).appendQueryParameter("platform", DefaultSettingsSpiCall.ANDROID_CLIENT_TYPE).appendQueryParameter("gmp_version", String.valueOf(zzaf.zzav()));
        String uri = builder.build().toString();
        try {
            URL url = new URL(uri);
            this.zzl.zzad().zzdi().zza("Fetching remote configuration", zzgVar.zzan());
            com.google.android.gms.internal.measurement.zzce zzay = zzdp().zzay(zzgVar.zzan());
            String zzaz = zzdp().zzaz(zzgVar.zzan());
            if (zzay != null && !TextUtils.isEmpty(zzaz)) {
                o4Var = new o4();
                o4Var.put("If-Modified-Since", zzaz);
            }
            this.zzsi = true;
            zzay zzfu = zzfu();
            String zzan = zzgVar.zzan();
            zzfw zzfwVar = new zzfw(this);
            zzfu.zzq();
            zzfu.zzah();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzfwVar);
            zzfu.zzac().zzb(new zzbc(zzfu, zzan, url, null, o4Var, zzfwVar));
        } catch (MalformedURLException unused) {
            this.zzl.zzad().zzda().zza("Failed to parse config URL. Not fetching. appId", zzau.zzao(zzgVar.zzan()), uri);
        }
    }

    private final zzm zzbk(String str) {
        zzg zzae = zzdo().zzae(str);
        if (zzae != null && !TextUtils.isEmpty(zzae.zzas())) {
            Boolean zzc = zzc(zzae);
            if (zzc != null && !zzc.booleanValue()) {
                this.zzl.zzad().zzda().zza("App version does not match; dropping. appId", zzau.zzao(str));
                return null;
            }
            return new zzm(str, zzae.getGmpAppId(), zzae.zzas(), zzae.zzat(), zzae.zzau(), zzae.zzav(), zzae.zzaw(), (String) null, zzae.isMeasurementEnabled(), false, zzae.getFirebaseInstanceId(), zzae.zzbk(), 0L, 0, zzae.zzbl(), zzae.zzbm(), false, zzae.zzao(), zzae.zzbn(), zzae.zzax());
        }
        this.zzl.zzad().zzdh().zza("No app data available; dropping", str);
        return null;
    }

    private final zzbd zzfv() {
        zzbd zzbdVar = this.zzrx;
        if (zzbdVar != null) {
            return zzbdVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzfp zzfw() {
        zza(this.zzry);
        return this.zzry;
    }

    private final long zzfz() {
        long currentTimeMillis = this.zzl.zzz().currentTimeMillis();
        zzbf zzae = this.zzl.zzae();
        zzae.zzah();
        zzae.zzq();
        long j = zzae.zzlf.get();
        if (j == 0) {
            j = 1 + zzae.zzab().zzgl().nextInt(86400000);
            zzae.zzlf.set(j);
        }
        return ((((currentTimeMillis + j) / 1000) / 60) / 60) / 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzg zzg(com.google.android.gms.measurement.internal.zzm r10) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzft.zzg(com.google.android.gms.measurement.internal.zzm):com.google.android.gms.measurement.internal.zzg");
    }

    private final boolean zzgb() {
        zzq();
        zzfy();
        return zzdo().zzcd() || !TextUtils.isEmpty(zzdo().zzby());
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzgc() {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzft.zzgc():void");
    }

    private final void zzgd() {
        zzq();
        if (!this.zzsi && !this.zzsj && !this.zzsk) {
            this.zzl.zzad().zzdi().zzaq("Stopping uploading service(s)");
            List<Runnable> list = this.zzsf;
            if (list == null) {
                return;
            }
            for (Runnable runnable : list) {
                runnable.run();
            }
            this.zzsf.clear();
            return;
        }
        this.zzl.zzad().zzdi().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzsi), Boolean.valueOf(this.zzsj), Boolean.valueOf(this.zzsk));
    }

    @VisibleForTesting
    private final boolean zzge() {
        zzq();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzl.getContext().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzsm = channel;
            FileLock tryLock = channel.tryLock();
            this.zzsl = tryLock;
            if (tryLock != null) {
                this.zzl.zzad().zzdi().zzaq("Storage concurrent access okay");
                return true;
            }
            this.zzl.zzad().zzda().zzaq("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.zzl.zzad().zzda().zza("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            this.zzl.zzad().zzda().zza("Failed to access storage lock file", e2);
            return false;
        }
    }

    private final boolean zzgg() {
        zzq();
        zzfy();
        return this.zzsc;
    }

    public static zzft zzm(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzrt == null) {
            synchronized (zzft.class) {
                if (zzrt == null) {
                    zzrt = new zzft(new zzfy(context));
                }
            }
        }
        return zzrt;
    }

    private final void zzq() {
        this.zzl.zzac().zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public final Context getContext() {
        return this.zzl.getContext();
    }

    public final void start() {
        this.zzl.zzac().zzq();
        zzdo().zzca();
        if (this.zzl.zzae().zzlb.get() == 0) {
            this.zzl.zzae().zzlb.set(this.zzl.zzz().currentTimeMillis());
        }
        zzgc();
    }

    public final zzas zzaa() {
        return this.zzl.zzaa();
    }

    public final zzgd zzab() {
        return this.zzl.zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public final zzbt zzac() {
        return this.zzl.zzac();
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public final zzau zzad() {
        return this.zzl.zzad();
    }

    public final zzt zzaf() {
        return this.zzl.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public final zzq zzag() {
        return this.zzl.zzag();
    }

    public final void zzc(zzaj zzajVar, zzm zzmVar) {
        List<zzr> zzb;
        List<zzr> zzb2;
        List<zzr> zzb3;
        Preconditions.checkNotNull(zzmVar);
        Preconditions.checkNotEmpty(zzmVar.packageName);
        zzq();
        zzfy();
        String str = zzmVar.packageName;
        long j = zzajVar.zzfp;
        if (zzdm().zze(zzajVar, zzmVar)) {
            if (!zzmVar.zzcr) {
                zzg(zzmVar);
                return;
            }
            zzdo().beginTransaction();
            try {
                zzw zzdo = zzdo();
                Preconditions.checkNotEmpty(str);
                zzdo.zzq();
                zzdo.zzah();
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i < 0) {
                    zzdo.zzad().zzdd().zza("Invalid time querying timed out conditional properties", zzau.zzao(str), Long.valueOf(j));
                    zzb = Collections.emptyList();
                } else {
                    zzb = zzdo.zzb("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzr zzrVar : zzb) {
                    if (zzrVar != null) {
                        this.zzl.zzad().zzdh().zza("User property timed out", zzrVar.packageName, this.zzl.zzaa().zzan(zzrVar.zzdv.name), zzrVar.zzdv.getValue());
                        if (zzrVar.zzdw != null) {
                            zzd(new zzaj(zzrVar.zzdw, j), zzmVar);
                        }
                        zzdo().zzg(str, zzrVar.zzdv.name);
                    }
                }
                zzw zzdo2 = zzdo();
                Preconditions.checkNotEmpty(str);
                zzdo2.zzq();
                zzdo2.zzah();
                if (i < 0) {
                    zzdo2.zzad().zzdd().zza("Invalid time querying expired conditional properties", zzau.zzao(str), Long.valueOf(j));
                    zzb2 = Collections.emptyList();
                } else {
                    zzb2 = zzdo2.zzb("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(zzb2.size());
                for (zzr zzrVar2 : zzb2) {
                    if (zzrVar2 != null) {
                        this.zzl.zzad().zzdh().zza("User property expired", zzrVar2.packageName, this.zzl.zzaa().zzan(zzrVar2.zzdv.name), zzrVar2.zzdv.getValue());
                        zzdo().zzd(str, zzrVar2.zzdv.name);
                        zzaj zzajVar2 = zzrVar2.zzdy;
                        if (zzajVar2 != null) {
                            arrayList.add(zzajVar2);
                        }
                        zzdo().zzg(str, zzrVar2.zzdv.name);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    zzd(new zzaj((zzaj) obj, j), zzmVar);
                }
                zzw zzdo3 = zzdo();
                String str2 = zzajVar.name;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                zzdo3.zzq();
                zzdo3.zzah();
                if (i < 0) {
                    zzdo3.zzad().zzdd().zza("Invalid time querying triggered conditional properties", zzau.zzao(str), zzdo3.zzaa().zzal(str2), Long.valueOf(j));
                    zzb3 = Collections.emptyList();
                } else {
                    zzb3 = zzdo3.zzb("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(zzb3.size());
                for (zzr zzrVar3 : zzb3) {
                    if (zzrVar3 != null) {
                        zzga zzgaVar = zzrVar3.zzdv;
                        zzgc zzgcVar = new zzgc(zzrVar3.packageName, zzrVar3.origin, zzgaVar.name, j, zzgaVar.getValue());
                        if (zzdo().zza(zzgcVar)) {
                            this.zzl.zzad().zzdh().zza("User property triggered", zzrVar3.packageName, this.zzl.zzaa().zzan(zzgcVar.name), zzgcVar.value);
                        } else {
                            this.zzl.zzad().zzda().zza("Too many active user properties, ignoring", zzau.zzao(zzrVar3.packageName), this.zzl.zzaa().zzan(zzgcVar.name), zzgcVar.value);
                        }
                        zzaj zzajVar3 = zzrVar3.zzdx;
                        if (zzajVar3 != null) {
                            arrayList2.add(zzajVar3);
                        }
                        zzrVar3.zzdv = new zzga(zzgcVar);
                        zzrVar3.active = true;
                        zzdo().zza(zzrVar3);
                    }
                }
                zzd(zzajVar, zzmVar);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    zzd(new zzaj((zzaj) obj2, j), zzmVar);
                }
                zzdo().setTransactionSuccessful();
            } finally {
                zzdo().endTransaction();
            }
        }
    }

    public final void zzd(zzaj zzajVar, String str) {
        zzg zzae = zzdo().zzae(str);
        if (zzae != null && !TextUtils.isEmpty(zzae.zzas())) {
            Boolean zzc = zzc(zzae);
            if (zzc == null) {
                if (!"_ui".equals(zzajVar.name)) {
                    this.zzl.zzad().zzdd().zza("Could not find package. appId", zzau.zzao(str));
                }
            } else if (!zzc.booleanValue()) {
                this.zzl.zzad().zzda().zza("App version does not match; dropping event. appId", zzau.zzao(str));
                return;
            }
            zzc(zzajVar, new zzm(str, zzae.getGmpAppId(), zzae.zzas(), zzae.zzat(), zzae.zzau(), zzae.zzav(), zzae.zzaw(), (String) null, zzae.isMeasurementEnabled(), false, zzae.getFirebaseInstanceId(), zzae.zzbk(), 0L, 0, zzae.zzbl(), zzae.zzbm(), false, zzae.zzao(), zzae.zzbn(), zzae.zzax()));
            return;
        }
        this.zzl.zzad().zzdh().zza("No app data available; dropping event", str);
    }

    public final zzfz zzdm() {
        zza(this.zzsa);
        return this.zzsa;
    }

    public final zzo zzdn() {
        zza(this.zzrz);
        return this.zzrz;
    }

    public final zzw zzdo() {
        zza(this.zzrw);
        return this.zzrw;
    }

    public final zzbs zzdp() {
        zza(this.zzru);
        return this.zzru;
    }

    public final void zze(zzm zzmVar) {
        zzq();
        zzfy();
        Preconditions.checkNotEmpty(zzmVar.packageName);
        zzg(zzmVar);
    }

    public final void zzf(Runnable runnable) {
        zzq();
        if (this.zzsf == null) {
            this.zzsf = new ArrayList();
        }
        this.zzsf.add(runnable);
    }

    public final zzay zzfu() {
        zza(this.zzrv);
        return this.zzrv;
    }

    public final zzea zzfx() {
        zza(this.zzsb);
        return this.zzsb;
    }

    public final void zzfy() {
        if (!this.zzce) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void zzga() {
        zzg zzae;
        String str;
        zzq();
        zzfy();
        this.zzsk = true;
        try {
            this.zzl.zzag();
            Boolean zzfi = this.zzl.zzu().zzfi();
            if (zzfi == null) {
                this.zzl.zzad().zzdd().zzaq("Upload data called on the client side before use of service was decided");
            } else if (zzfi.booleanValue()) {
                this.zzl.zzad().zzda().zzaq("Upload called in the client side when service should be used");
            } else if (this.zzse > 0) {
                zzgc();
            } else {
                zzq();
                if (this.zzsn != null) {
                    this.zzl.zzad().zzdi().zzaq("Uploading requested multiple times");
                } else if (!zzfu().zzdl()) {
                    this.zzl.zzad().zzdi().zzaq("Network not connected, ignoring upload request");
                    zzgc();
                } else {
                    long currentTimeMillis = this.zzl.zzz().currentTimeMillis();
                    zzd((String) null, currentTimeMillis - zzt.zzbt());
                    long j = this.zzl.zzae().zzlb.get();
                    if (j != 0) {
                        this.zzl.zzad().zzdh().zza("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - j)));
                    }
                    String zzby = zzdo().zzby();
                    if (!TextUtils.isEmpty(zzby)) {
                        if (this.zzsp == -1) {
                            this.zzsp = zzdo().zzcf();
                        }
                        List<Pair<com.google.android.gms.internal.measurement.zzch, Long>> zza2 = zzdo().zza(zzby, this.zzl.zzaf().zzb(zzby, zzal.zzgj), Math.max(0, this.zzl.zzaf().zzb(zzby, zzal.zzgk)));
                        if (!zza2.isEmpty()) {
                            Iterator<Pair<com.google.android.gms.internal.measurement.zzch, Long>> it = zza2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str = null;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zzch zzchVar = (com.google.android.gms.internal.measurement.zzch) it.next().first;
                                if (!TextUtils.isEmpty(zzchVar.zzyb)) {
                                    str = zzchVar.zzyb;
                                    break;
                                }
                            }
                            if (str != null) {
                                int i = 0;
                                while (true) {
                                    if (i >= zza2.size()) {
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.zzch zzchVar2 = (com.google.android.gms.internal.measurement.zzch) zza2.get(i).first;
                                    if (!TextUtils.isEmpty(zzchVar2.zzyb) && !zzchVar2.zzyb.equals(str)) {
                                        zza2 = zza2.subList(0, i);
                                        break;
                                    }
                                    i++;
                                }
                            }
                            com.google.android.gms.internal.measurement.zzcg zzcgVar = new com.google.android.gms.internal.measurement.zzcg();
                            zzcgVar.zzxl = new com.google.android.gms.internal.measurement.zzch[zza2.size()];
                            ArrayList arrayList = new ArrayList(zza2.size());
                            boolean z = zzt.zzbv() && this.zzl.zzaf().zzk(zzby);
                            int i2 = 0;
                            while (true) {
                                com.google.android.gms.internal.measurement.zzch[] zzchVarArr = zzcgVar.zzxl;
                                if (i2 >= zzchVarArr.length) {
                                    break;
                                }
                                zzchVarArr[i2] = (com.google.android.gms.internal.measurement.zzch) zza2.get(i2).first;
                                arrayList.add((Long) zza2.get(i2).second);
                                zzcgVar.zzxl[i2].zzya = Long.valueOf(this.zzl.zzaf().zzav());
                                zzcgVar.zzxl[i2].zzxq = Long.valueOf(currentTimeMillis);
                                com.google.android.gms.internal.measurement.zzch zzchVar3 = zzcgVar.zzxl[i2];
                                this.zzl.zzag();
                                zzchVar3.zzyf = Boolean.FALSE;
                                if (!z) {
                                    zzcgVar.zzxl[i2].zzyn = null;
                                }
                                if (this.zzl.zzaf().zze(zzby, zzal.zziu)) {
                                    zzcgVar.zzxl[i2].zzyt = Long.valueOf(zzdm().zza(zziv.zzb(zzcgVar.zzxl[i2])));
                                }
                                i2++;
                            }
                            String zzb = this.zzl.zzad().isLoggable(2) ? zzdm().zzb(zzcgVar) : null;
                            byte[] zza3 = zzdm().zza(zzcgVar);
                            String str2 = zzal.zzgt.get(null);
                            try {
                                URL url = new URL(str2);
                                Preconditions.checkArgument(!arrayList.isEmpty());
                                if (this.zzsn != null) {
                                    this.zzl.zzad().zzda().zzaq("Set uploading progress before finishing the previous upload");
                                } else {
                                    this.zzsn = new ArrayList(arrayList);
                                }
                                this.zzl.zzae().zzlc.set(currentTimeMillis);
                                com.google.android.gms.internal.measurement.zzch[] zzchVarArr2 = zzcgVar.zzxl;
                                this.zzl.zzad().zzdi().zza("Uploading data. app, uncompressed size, data", zzchVarArr2.length > 0 ? zzchVarArr2[0].zzcf : "?", Integer.valueOf(zza3.length), zzb);
                                this.zzsj = true;
                                zzay zzfu = zzfu();
                                zzfv zzfvVar = new zzfv(this, zzby);
                                zzfu.zzq();
                                zzfu.zzah();
                                Preconditions.checkNotNull(url);
                                Preconditions.checkNotNull(zza3);
                                Preconditions.checkNotNull(zzfvVar);
                                zzfu.zzac().zzb(new zzbc(zzfu, zzby, url, zza3, null, zzfvVar));
                            } catch (MalformedURLException unused) {
                                this.zzl.zzad().zzda().zza("Failed to parse upload URL. Not uploading. appId", zzau.zzao(zzby), str2);
                            }
                        }
                    } else {
                        this.zzsp = -1L;
                        String zzu = zzdo().zzu(currentTimeMillis - zzt.zzbt());
                        if (!TextUtils.isEmpty(zzu) && (zzae = zzdo().zzae(zzu)) != null) {
                            zzb(zzae);
                        }
                    }
                }
            }
        } finally {
            this.zzsk = false;
            zzgd();
        }
    }

    public final void zzgf() {
        zzq();
        zzfy();
        if (!this.zzsd) {
            this.zzsd = true;
            zzq();
            zzfy();
            if ((this.zzl.zzaf().zza(zzal.zzip) || zzgg()) && zzge()) {
                int zza2 = zza(this.zzsm);
                int zzcx = this.zzl.zzt().zzcx();
                zzq();
                if (zza2 > zzcx) {
                    this.zzl.zzad().zzda().zza("Panic: can't downgrade version. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzcx));
                } else if (zza2 < zzcx) {
                    if (zza(zzcx, this.zzsm)) {
                        this.zzl.zzad().zzdi().zza("Storage version upgraded. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzcx));
                    } else {
                        this.zzl.zzad().zzda().zza("Storage version upgrade failed. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzcx));
                    }
                }
            }
        }
        if (this.zzsc || this.zzl.zzaf().zza(zzal.zzip)) {
            return;
        }
        this.zzl.zzad().zzdg().zzaq("This instance being marked as an uploader");
        this.zzsc = true;
        zzgc();
    }

    public final void zzgh() {
        this.zzsh++;
    }

    public final zzby zzgi() {
        return this.zzl;
    }

    public final String zzh(zzm zzmVar) {
        try {
            return (String) this.zzl.zzac().zza(new zzfx(this, zzmVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zzl.zzad().zzda().zza("Failed to get app instance id. appId", zzau.zzao(zzmVar.packageName), e);
            return null;
        }
    }

    public final void zzj(boolean z) {
        zzgc();
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public final Clock zzz() {
        return this.zzl.zzz();
    }

    private zzft(zzfy zzfyVar, zzby zzbyVar) {
        this.zzce = false;
        Preconditions.checkNotNull(zzfyVar);
        zzby zza2 = zzby.zza(zzfyVar.zzno, (com.google.android.gms.internal.measurement.zzy) null);
        this.zzl = zza2;
        this.zzsp = -1L;
        zzfz zzfzVar = new zzfz(this);
        zzfzVar.zzai();
        this.zzsa = zzfzVar;
        zzay zzayVar = new zzay(this);
        zzayVar.zzai();
        this.zzrv = zzayVar;
        zzbs zzbsVar = new zzbs(this);
        zzbsVar.zzai();
        this.zzru = zzbsVar;
        zza2.zzac().zza(new zzfu(this, zzfyVar));
    }

    public final void zze(zzr zzrVar) {
        zzm zzbk = zzbk(zzrVar.packageName);
        if (zzbk != null) {
            zzb(zzrVar, zzbk);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:105|106)|(2:108|(8:110|(1:112)(1:130)|113|(1:115)(1:129)|116|117|118|(4:120|(1:122)|123|(1:125))))|131|117|118|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03a3, code lost:
        r21.zzl.zzad().zzda().zza("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzau.zzao(r22.packageName), r0);
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03bb A[Catch: all -> 0x04dc, TryCatch #2 {all -> 0x04dc, blocks: (B:29:0x00b9, B:31:0x00c9, B:33:0x00d7, B:35:0x00e1, B:37:0x00e5, B:41:0x00f6, B:43:0x010e, B:50:0x0136, B:52:0x0142, B:54:0x0159, B:55:0x0181, B:57:0x01cb, B:60:0x01de, B:63:0x01f2, B:66:0x01ff, B:68:0x0209, B:69:0x022a, B:71:0x0230, B:73:0x023c, B:74:0x025c, B:76:0x0261, B:81:0x0280, B:84:0x0293, B:86:0x02b5, B:87:0x02c3, B:89:0x02f4, B:90:0x02f9, B:92:0x0307, B:94:0x030b, B:95:0x0310, B:97:0x031c, B:128:0x03d1, B:130:0x03ec, B:131:0x03ef, B:143:0x046c, B:145:0x047c, B:147:0x0494, B:148:0x049b, B:152:0x04cd, B:99:0x0333, B:104:0x035e, B:106:0x0366, B:108:0x036c, B:110:0x0374, B:114:0x037f, B:117:0x0390, B:120:0x03a3, B:122:0x03bb, B:124:0x03c1, B:125:0x03c6, B:127:0x03cc, B:102:0x0346, B:134:0x0408, B:136:0x043c, B:137:0x0441, B:139:0x044f, B:141:0x0453, B:142:0x0458, B:149:0x04b0, B:151:0x04b4, B:78:0x0270, B:45:0x0118, B:48:0x0122), top: B:162:0x00b9, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(com.google.android.gms.measurement.internal.zzm r22) {
        /*
            Method dump skipped, instructions count: 1253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzft.zzf(com.google.android.gms.measurement.internal.zzm):void");
    }

    private static void zza(zzfs zzfsVar) {
        if (zzfsVar != null) {
            if (zzfsVar.isInitialized()) {
                return;
            }
            String valueOf = String.valueOf(zzfsVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Upload Component not created");
    }

    private final boolean zza(com.google.android.gms.internal.measurement.zzcf zzcfVar, com.google.android.gms.internal.measurement.zzcf zzcfVar2) {
        Preconditions.checkArgument("_e".equals(zzcfVar.name));
        zzdm();
        zzbt.zzd zza2 = zzfz.zza(zzcfVar, "_sc");
        String zzhl = zza2 == null ? null : zza2.zzhl();
        zzdm();
        zzbt.zzd zza3 = zzfz.zza(zzcfVar2, "_pc");
        String zzhl2 = zza3 != null ? zza3.zzhl() : null;
        if (zzhl2 == null || !zzhl2.equals(zzhl)) {
            return false;
        }
        zzdm();
        zzbt.zzd zza4 = zzfz.zza(zzcfVar, "_et");
        if (zza4.zzhn() && zza4.zzho() > 0) {
            long zzho = zza4.zzho();
            zzdm();
            zzbt.zzd zza5 = zzfz.zza(zzcfVar2, "_et");
            if (zza5 != null && zza5.zzho() > 0) {
                zzho += zza5.zzho();
            }
            zzdm();
            zzcfVar2.zzxi = zzfz.zza(zzcfVar2.zzxi, "_et", Long.valueOf(zzho));
            zzdm();
            zzcfVar.zzxi = zzfz.zza(zzcfVar.zzxi, "_fr", (Object) 1L);
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:198|(1:200)(1:224)|201|(2:203|(1:205)(8:206|207|208|(1:210)|211|(0)|43|(0)(0)))|216|217|218|219|207|208|(0)|211|(0)|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x07b3, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0238, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x023a, code lost:
        r7.zzad().zzda().zza("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzau.zzao(r15), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026f A[Catch: all -> 0x086b, TryCatch #1 {all -> 0x086b, blocks: (B:32:0x010d, B:35:0x011c, B:83:0x02b6, B:85:0x02f5, B:87:0x02fa, B:88:0x0313, B:92:0x0324, B:94:0x033a, B:96:0x033f, B:97:0x0359, B:103:0x037f, B:107:0x03a5, B:108:0x03be, B:112:0x03ce, B:115:0x03f1, B:116:0x040d, B:119:0x0417, B:121:0x0425, B:123:0x0431, B:125:0x0437, B:126:0x0442, B:128:0x044a, B:130:0x045a, B:132:0x0468, B:133:0x0471, B:135:0x047d, B:136:0x0494, B:138:0x04bd, B:141:0x04cd, B:144:0x0509, B:146:0x0531, B:150:0x057f, B:152:0x059b, B:155:0x05a7, B:159:0x05b5, B:161:0x05cf, B:162:0x05d9, B:164:0x05e7, B:166:0x05f1, B:168:0x05f5, B:180:0x065f, B:182:0x06af, B:184:0x06b5, B:185:0x06b8, B:187:0x06c4, B:188:0x072b, B:189:0x074b, B:191:0x0751, B:193:0x078b, B:194:0x0793, B:196:0x079b, B:197:0x079f, B:199:0x07a5, B:209:0x07f2, B:211:0x07f8, B:214:0x0812, B:216:0x0826, B:203:0x07b9, B:205:0x07dc, B:213:0x07fc, B:169:0x0602, B:171:0x0614, B:173:0x0618, B:175:0x062a, B:179:0x065d, B:176:0x0642, B:178:0x0648, B:158:0x05b1, B:154:0x05a3, B:149:0x057a, B:145:0x0523, B:39:0x012a, B:42:0x013c, B:44:0x0153, B:49:0x016c, B:52:0x0197, B:54:0x019d, B:56:0x01ab, B:58:0x01b7, B:60:0x01c1, B:62:0x01cc, B:65:0x01d3, B:74:0x0265, B:76:0x026f, B:80:0x02a7, B:67:0x0200, B:68:0x021f, B:73:0x024b, B:72:0x023a, B:59:0x01bc, B:50:0x0171, B:51:0x018d), top: B:224:0x010d, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a7 A[Catch: all -> 0x086b, TRY_LEAVE, TryCatch #1 {all -> 0x086b, blocks: (B:32:0x010d, B:35:0x011c, B:83:0x02b6, B:85:0x02f5, B:87:0x02fa, B:88:0x0313, B:92:0x0324, B:94:0x033a, B:96:0x033f, B:97:0x0359, B:103:0x037f, B:107:0x03a5, B:108:0x03be, B:112:0x03ce, B:115:0x03f1, B:116:0x040d, B:119:0x0417, B:121:0x0425, B:123:0x0431, B:125:0x0437, B:126:0x0442, B:128:0x044a, B:130:0x045a, B:132:0x0468, B:133:0x0471, B:135:0x047d, B:136:0x0494, B:138:0x04bd, B:141:0x04cd, B:144:0x0509, B:146:0x0531, B:150:0x057f, B:152:0x059b, B:155:0x05a7, B:159:0x05b5, B:161:0x05cf, B:162:0x05d9, B:164:0x05e7, B:166:0x05f1, B:168:0x05f5, B:180:0x065f, B:182:0x06af, B:184:0x06b5, B:185:0x06b8, B:187:0x06c4, B:188:0x072b, B:189:0x074b, B:191:0x0751, B:193:0x078b, B:194:0x0793, B:196:0x079b, B:197:0x079f, B:199:0x07a5, B:209:0x07f2, B:211:0x07f8, B:214:0x0812, B:216:0x0826, B:203:0x07b9, B:205:0x07dc, B:213:0x07fc, B:169:0x0602, B:171:0x0614, B:173:0x0618, B:175:0x062a, B:179:0x065d, B:176:0x0642, B:178:0x0648, B:158:0x05b1, B:154:0x05a3, B:149:0x057a, B:145:0x0523, B:39:0x012a, B:42:0x013c, B:44:0x0153, B:49:0x016c, B:52:0x0197, B:54:0x019d, B:56:0x01ab, B:58:0x01b7, B:60:0x01c1, B:62:0x01cc, B:65:0x01d3, B:74:0x0265, B:76:0x026f, B:80:0x02a7, B:67:0x0200, B:68:0x021f, B:73:0x024b, B:72:0x023a, B:59:0x01bc, B:50:0x0171, B:51:0x018d), top: B:224:0x010d, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f5 A[Catch: all -> 0x086b, TryCatch #1 {all -> 0x086b, blocks: (B:32:0x010d, B:35:0x011c, B:83:0x02b6, B:85:0x02f5, B:87:0x02fa, B:88:0x0313, B:92:0x0324, B:94:0x033a, B:96:0x033f, B:97:0x0359, B:103:0x037f, B:107:0x03a5, B:108:0x03be, B:112:0x03ce, B:115:0x03f1, B:116:0x040d, B:119:0x0417, B:121:0x0425, B:123:0x0431, B:125:0x0437, B:126:0x0442, B:128:0x044a, B:130:0x045a, B:132:0x0468, B:133:0x0471, B:135:0x047d, B:136:0x0494, B:138:0x04bd, B:141:0x04cd, B:144:0x0509, B:146:0x0531, B:150:0x057f, B:152:0x059b, B:155:0x05a7, B:159:0x05b5, B:161:0x05cf, B:162:0x05d9, B:164:0x05e7, B:166:0x05f1, B:168:0x05f5, B:180:0x065f, B:182:0x06af, B:184:0x06b5, B:185:0x06b8, B:187:0x06c4, B:188:0x072b, B:189:0x074b, B:191:0x0751, B:193:0x078b, B:194:0x0793, B:196:0x079b, B:197:0x079f, B:199:0x07a5, B:209:0x07f2, B:211:0x07f8, B:214:0x0812, B:216:0x0826, B:203:0x07b9, B:205:0x07dc, B:213:0x07fc, B:169:0x0602, B:171:0x0614, B:173:0x0618, B:175:0x062a, B:179:0x065d, B:176:0x0642, B:178:0x0648, B:158:0x05b1, B:154:0x05a3, B:149:0x057a, B:145:0x0523, B:39:0x012a, B:42:0x013c, B:44:0x0153, B:49:0x016c, B:52:0x0197, B:54:0x019d, B:56:0x01ab, B:58:0x01b7, B:60:0x01c1, B:62:0x01cc, B:65:0x01d3, B:74:0x0265, B:76:0x026f, B:80:0x02a7, B:67:0x0200, B:68:0x021f, B:73:0x024b, B:72:0x023a, B:59:0x01bc, B:50:0x0171, B:51:0x018d), top: B:224:0x010d, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0322  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzd(com.google.android.gms.measurement.internal.zzaj r28, com.google.android.gms.measurement.internal.zzm r29) {
        /*
            Method dump skipped, instructions count: 2165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzft.zzd(com.google.android.gms.measurement.internal.zzaj, com.google.android.gms.measurement.internal.zzm):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
        r6.zzl.zzae().zzld.set(r6.zzl.zzz().currentTimeMillis());
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x0196, blocks: (B:4:0x000c, B:5:0x000e, B:64:0x0180, B:43:0x00f6, B:50:0x0117, B:6:0x0029, B:15:0x0045, B:63:0x0179, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x0124, B:55:0x013a, B:57:0x0162, B:59:0x016c, B:61:0x0172, B:62:0x0176, B:56:0x014a, B:46:0x0103, B:48:0x010d), top: B:73:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x0196, blocks: (B:4:0x000c, B:5:0x000e, B:64:0x0180, B:43:0x00f6, B:50:0x0117, B:6:0x0029, B:15:0x0045, B:63:0x0179, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x0124, B:55:0x013a, B:57:0x0162, B:59:0x016c, B:61:0x0172, B:62:0x0176, B:56:0x014a, B:46:0x0103, B:48:0x010d), top: B:73:0x000c }] */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzft.zzb(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    @VisibleForTesting
    private static zzbt.zzd[] zza(zzbt.zzd[] zzdVarArr, String str) {
        int i = 0;
        while (true) {
            if (i >= zzdVarArr.length) {
                i = -1;
                break;
            } else if (str.equals(zzdVarArr[i].getName())) {
                break;
            } else {
                i++;
            }
        }
        return i < 0 ? zzdVarArr : zza(zzdVarArr, i);
    }

    @VisibleForTesting
    private static zzbt.zzd[] zza(zzbt.zzd[] zzdVarArr, int i) {
        int length = zzdVarArr.length - 1;
        zzbt.zzd[] zzdVarArr2 = new zzbt.zzd[length];
        if (i > 0) {
            System.arraycopy(zzdVarArr, 0, zzdVarArr2, 0, i);
        }
        if (i < length) {
            System.arraycopy(zzdVarArr, i + 1, zzdVarArr2, i, length - i);
        }
        return zzdVarArr2;
    }

    @VisibleForTesting
    private static zzbt.zzd[] zza(zzbt.zzd[] zzdVarArr, int i, String str) {
        for (zzbt.zzd zzdVar : zzdVarArr) {
            if ("_err".equals(zzdVar.getName())) {
                return zzdVarArr;
            }
        }
        int length = zzdVarArr.length + 2;
        zzbt.zzd[] zzdVarArr2 = new zzbt.zzd[length];
        System.arraycopy(zzdVarArr, 0, zzdVarArr2, 0, zzdVarArr.length);
        zzdVarArr2[length - 2] = (zzbt.zzd) ((com.google.android.gms.internal.measurement.zzez) zzbt.zzd.zzht().zzbw("_err").zzaj(Long.valueOf(i).longValue()).zzmr());
        zzdVarArr2[length - 1] = (zzbt.zzd) ((com.google.android.gms.internal.measurement.zzez) zzbt.zzd.zzht().zzbw("_ev").zzbx(str).zzmr());
        return zzdVarArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0156, code lost:
        r9.zzl.zzae().zzld.set(r9.zzl.zzz().currentTimeMillis());
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(int r10, java.lang.Throwable r11, byte[] r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzft.zza(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    public final void zzb(zzga zzgaVar, zzm zzmVar) {
        zzaf zzc;
        zzq();
        zzfy();
        if (TextUtils.isEmpty(zzmVar.zzch) && TextUtils.isEmpty(zzmVar.zzcv)) {
            return;
        }
        if (!zzmVar.zzcr) {
            zzg(zzmVar);
            return;
        }
        int zzbo = this.zzl.zzab().zzbo(zzgaVar.name);
        int i = 0;
        if (zzbo != 0) {
            this.zzl.zzab();
            String zza2 = zzgd.zza(zzgaVar.name, 24, true);
            String str = zzgaVar.name;
            this.zzl.zzab().zza(zzmVar.packageName, zzbo, "_ev", zza2, str != null ? str.length() : 0);
            return;
        }
        int zzc2 = this.zzl.zzab().zzc(zzgaVar.name, zzgaVar.getValue());
        if (zzc2 != 0) {
            this.zzl.zzab();
            String zza3 = zzgd.zza(zzgaVar.name, 24, true);
            Object value = zzgaVar.getValue();
            if (value != null && ((value instanceof String) || (value instanceof CharSequence))) {
                i = String.valueOf(value).length();
            }
            this.zzl.zzab().zza(zzmVar.packageName, zzc2, "_ev", zza3, i);
            return;
        }
        Object zzd = this.zzl.zzab().zzd(zzgaVar.name, zzgaVar.getValue());
        if (zzd == null) {
            return;
        }
        if ("_sid".equals(zzgaVar.name) && this.zzl.zzaf().zzz(zzmVar.packageName)) {
            long j = zzgaVar.zzsx;
            String str2 = zzgaVar.origin;
            long j2 = 0;
            zzgc zze = zzdo().zze(zzmVar.packageName, "_sno");
            if (zze != null) {
                Object obj = zze.value;
                if (obj instanceof Long) {
                    j2 = ((Long) obj).longValue();
                    zzb(new zzga("_sno", j, Long.valueOf(j2 + 1), str2), zzmVar);
                }
            }
            if (zze != null) {
                this.zzl.zzad().zzdd().zza("Retrieved last session number from database does not contain a valid (long) value", zze.value);
            }
            if (this.zzl.zzaf().zze(zzmVar.packageName, zzal.zzii) && (zzc = zzdo().zzc(zzmVar.packageName, "_s")) != null) {
                j2 = zzc.zzfe;
                this.zzl.zzad().zzdi().zza("Backfill the session number. Last used session number", Long.valueOf(j2));
            }
            zzb(new zzga("_sno", j, Long.valueOf(j2 + 1), str2), zzmVar);
        }
        zzgc zzgcVar = new zzgc(zzmVar.packageName, zzgaVar.origin, zzgaVar.name, zzgaVar.zzsx, zzd);
        this.zzl.zzad().zzdh().zza("Setting user property", this.zzl.zzaa().zzan(zzgcVar.name), zzd);
        zzdo().beginTransaction();
        try {
            zzg(zzmVar);
            boolean zza4 = zzdo().zza(zzgcVar);
            zzdo().setTransactionSuccessful();
            if (zza4) {
                this.zzl.zzad().zzdh().zza("User property set", this.zzl.zzaa().zzan(zzgcVar.name), zzgcVar.value);
            } else {
                this.zzl.zzad().zzda().zza("Too many unique user properties are set. Ignoring user property", this.zzl.zzaa().zzan(zzgcVar.name), zzgcVar.value);
                this.zzl.zzab().zza(zzmVar.packageName, 9, (String) null, (String) null, 0);
            }
        } finally {
            zzdo().endTransaction();
        }
    }

    private final Boolean zzc(zzg zzgVar) {
        try {
            if (zzgVar.zzat() != -2147483648L) {
                if (zzgVar.zzat() == Wrappers.packageManager(this.zzl.getContext()).getPackageInfo(zzgVar.zzan(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzl.getContext()).getPackageInfo(zzgVar.zzan(), 0).versionName;
                if (zzgVar.zzas() != null && zzgVar.zzas().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void zzc(zzga zzgaVar, zzm zzmVar) {
        zzq();
        zzfy();
        if (TextUtils.isEmpty(zzmVar.zzch) && TextUtils.isEmpty(zzmVar.zzcv)) {
            return;
        }
        if (!zzmVar.zzcr) {
            zzg(zzmVar);
        } else if (this.zzl.zzaf().zze(zzmVar.packageName, zzal.zzin)) {
            if ("_npa".equals(zzgaVar.name) && zzmVar.zzcw != null) {
                this.zzl.zzad().zzdh().zzaq("Falling back to manifest metadata value for ad personalization");
                zzb(new zzga("_npa", this.zzl.zzz().currentTimeMillis(), Long.valueOf(zzmVar.zzcw.booleanValue() ? 1L : 0L), "auto"), zzmVar);
                return;
            }
            this.zzl.zzad().zzdh().zza("Removing user property", this.zzl.zzaa().zzan(zzgaVar.name));
            zzdo().beginTransaction();
            try {
                zzg(zzmVar);
                zzdo().zzd(zzmVar.packageName, zzgaVar.name);
                zzdo().setTransactionSuccessful();
                this.zzl.zzad().zzdh().zza("User property removed", this.zzl.zzaa().zzan(zzgaVar.name));
            } finally {
            }
        } else {
            this.zzl.zzad().zzdh().zza("Removing user property", this.zzl.zzaa().zzan(zzgaVar.name));
            zzdo().beginTransaction();
            try {
                zzg(zzmVar);
                zzdo().zzd(zzmVar.packageName, zzgaVar.name);
                zzdo().setTransactionSuccessful();
                this.zzl.zzad().zzdh().zza("User property removed", this.zzl.zzaa().zzan(zzgaVar.name));
            } finally {
            }
        }
    }

    @VisibleForTesting
    private final int zza(FileChannel fileChannel) {
        zzq();
        if (fileChannel != null && fileChannel.isOpen()) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    return allocate.getInt();
                }
                if (read != -1) {
                    this.zzl.zzad().zzdd().zza("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            } catch (IOException e) {
                this.zzl.zzad().zzda().zza("Failed to read from channel", e);
                return 0;
            }
        }
        this.zzl.zzad().zzda().zzaq("Bad channel to read from");
        return 0;
    }

    @VisibleForTesting
    private final boolean zza(int i, FileChannel fileChannel) {
        zzq();
        if (fileChannel != null && fileChannel.isOpen()) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(i);
            allocate.flip();
            try {
                fileChannel.truncate(0L);
                fileChannel.write(allocate);
                fileChannel.force(true);
                if (fileChannel.size() != 4) {
                    this.zzl.zzad().zzda().zza("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
                }
                return true;
            } catch (IOException e) {
                this.zzl.zzad().zzda().zza("Failed to write to channel", e);
                return false;
            }
        }
        this.zzl.zzad().zzda().zzaq("Bad channel to read from");
        return false;
    }

    private final zzm zza(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3) {
        String str4;
        int i;
        String str5;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.zzl.zzad().zzda().zzaq("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str4 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            this.zzl.zzad().zzda().zza("Error retrieving installer package name. appId", zzau.zzao(str));
            str4 = "Unknown";
        }
        if (str4 == null) {
            str4 = "manual_install";
        } else if ("com.android.vending".equals(str4)) {
            str4 = "";
        }
        String str6 = str4;
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 0);
            if (packageInfo != null) {
                CharSequence applicationLabel = Wrappers.packageManager(context).getApplicationLabel(str);
                if (!TextUtils.isEmpty(applicationLabel)) {
                    applicationLabel.toString();
                }
                String str7 = packageInfo.versionName;
                i = packageInfo.versionCode;
                str5 = str7;
            } else {
                i = RecyclerView.UNDEFINED_DURATION;
                str5 = "Unknown";
            }
            this.zzl.zzag();
            return new zzm(str, str2, str5, i, str6, this.zzl.zzaf().zzav(), this.zzl.zzab().zzc(context, str), (String) null, z, false, "", 0L, this.zzl.zzaf().zzu(str) ? j : 0L, 0, z2, z3, false, str3, (Boolean) null, 0L);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.zzl.zzad().zzda().zza("Error retrieving newly installed package info. appId, appName", zzau.zzao(str), "Unknown");
            return null;
        }
    }

    public final void zzc(zzr zzrVar, zzm zzmVar) {
        Preconditions.checkNotNull(zzrVar);
        Preconditions.checkNotEmpty(zzrVar.packageName);
        Preconditions.checkNotNull(zzrVar.zzdv);
        Preconditions.checkNotEmpty(zzrVar.zzdv.name);
        zzq();
        zzfy();
        if (TextUtils.isEmpty(zzmVar.zzch) && TextUtils.isEmpty(zzmVar.zzcv)) {
            return;
        }
        if (!zzmVar.zzcr) {
            zzg(zzmVar);
            return;
        }
        zzdo().beginTransaction();
        try {
            zzg(zzmVar);
            zzr zzf = zzdo().zzf(zzrVar.packageName, zzrVar.zzdv.name);
            if (zzf != null) {
                this.zzl.zzad().zzdh().zza("Removing conditional user property", zzrVar.packageName, this.zzl.zzaa().zzan(zzrVar.zzdv.name));
                zzdo().zzg(zzrVar.packageName, zzrVar.zzdv.name);
                if (zzf.active) {
                    zzdo().zzd(zzrVar.packageName, zzrVar.zzdv.name);
                }
                zzaj zzajVar = zzrVar.zzdy;
                if (zzajVar != null) {
                    zzag zzagVar = zzajVar.zzfd;
                    Bundle zzct = zzagVar != null ? zzagVar.zzct() : null;
                    zzgd zzab = this.zzl.zzab();
                    String str = zzrVar.packageName;
                    zzaj zzajVar2 = zzrVar.zzdy;
                    zzd(zzab.zza(str, zzajVar2.name, zzct, zzf.origin, zzajVar2.zzfp, true, false), zzmVar);
                }
            } else {
                this.zzl.zzad().zzdd().zza("Conditional user property doesn't exist", zzau.zzao(zzrVar.packageName), this.zzl.zzaa().zzan(zzrVar.zzdv.name));
            }
            zzdo().setTransactionSuccessful();
        } finally {
            zzdo().endTransaction();
        }
    }

    public final void zzb(zzfs zzfsVar) {
        this.zzsg++;
    }

    public final void zzb(zzr zzrVar, zzm zzmVar) {
        boolean z;
        Preconditions.checkNotNull(zzrVar);
        Preconditions.checkNotEmpty(zzrVar.packageName);
        Preconditions.checkNotNull(zzrVar.origin);
        Preconditions.checkNotNull(zzrVar.zzdv);
        Preconditions.checkNotEmpty(zzrVar.zzdv.name);
        zzq();
        zzfy();
        if (TextUtils.isEmpty(zzmVar.zzch) && TextUtils.isEmpty(zzmVar.zzcv)) {
            return;
        }
        if (!zzmVar.zzcr) {
            zzg(zzmVar);
            return;
        }
        zzr zzrVar2 = new zzr(zzrVar);
        boolean z2 = false;
        zzrVar2.active = false;
        zzdo().beginTransaction();
        try {
            zzr zzf = zzdo().zzf(zzrVar2.packageName, zzrVar2.zzdv.name);
            if (zzf != null && !zzf.origin.equals(zzrVar2.origin)) {
                this.zzl.zzad().zzdd().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzl.zzaa().zzan(zzrVar2.zzdv.name), zzrVar2.origin, zzf.origin);
            }
            if (zzf != null && (z = zzf.active)) {
                zzrVar2.origin = zzf.origin;
                zzrVar2.creationTimestamp = zzf.creationTimestamp;
                zzrVar2.triggerTimeout = zzf.triggerTimeout;
                zzrVar2.triggerEventName = zzf.triggerEventName;
                zzrVar2.zzdx = zzf.zzdx;
                zzrVar2.active = z;
                zzga zzgaVar = zzrVar2.zzdv;
                zzrVar2.zzdv = new zzga(zzgaVar.name, zzf.zzdv.zzsx, zzgaVar.getValue(), zzf.zzdv.origin);
            } else if (TextUtils.isEmpty(zzrVar2.triggerEventName)) {
                zzga zzgaVar2 = zzrVar2.zzdv;
                zzrVar2.zzdv = new zzga(zzgaVar2.name, zzrVar2.creationTimestamp, zzgaVar2.getValue(), zzrVar2.zzdv.origin);
                zzrVar2.active = true;
                z2 = true;
            }
            if (zzrVar2.active) {
                zzga zzgaVar3 = zzrVar2.zzdv;
                zzgc zzgcVar = new zzgc(zzrVar2.packageName, zzrVar2.origin, zzgaVar3.name, zzgaVar3.zzsx, zzgaVar3.getValue());
                if (zzdo().zza(zzgcVar)) {
                    this.zzl.zzad().zzdh().zza("User property updated immediately", zzrVar2.packageName, this.zzl.zzaa().zzan(zzgcVar.name), zzgcVar.value);
                } else {
                    this.zzl.zzad().zzda().zza("(2)Too many active user properties, ignoring", zzau.zzao(zzrVar2.packageName), this.zzl.zzaa().zzan(zzgcVar.name), zzgcVar.value);
                }
                if (z2 && zzrVar2.zzdx != null) {
                    zzd(new zzaj(zzrVar2.zzdx, zzrVar2.creationTimestamp), zzmVar);
                }
            }
            if (zzdo().zza(zzrVar2)) {
                this.zzl.zzad().zzdh().zza("Conditional property added", zzrVar2.packageName, this.zzl.zzaa().zzan(zzrVar2.zzdv.name), zzrVar2.zzdv.getValue());
            } else {
                this.zzl.zzad().zzda().zza("Too many conditional properties, ignoring", zzau.zzao(zzrVar2.packageName), this.zzl.zzaa().zzan(zzrVar2.zzdv.name), zzrVar2.zzdv.getValue());
            }
            zzdo().setTransactionSuccessful();
        } finally {
            zzdo().endTransaction();
        }
    }

    public final void zzf(zzr zzrVar) {
        zzm zzbk = zzbk(zzrVar.packageName);
        if (zzbk != null) {
            zzc(zzrVar, zzbk);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:462:0x0bee, code lost:
        if (r19 != r7) goto L482;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023c A[Catch: all -> 0x0e8d, TryCatch #10 {all -> 0x0e8d, blocks: (B:3:0x000d, B:22:0x0083, B:99:0x0238, B:101:0x023c, B:107:0x0248, B:108:0x0277, B:111:0x028d, B:114:0x02a9, B:116:0x02da, B:122:0x02ee, B:124:0x02f6, B:301:0x0767, B:126:0x031d, B:129:0x0331, B:158:0x038e, B:160:0x0392, B:162:0x039c, B:165:0x03a7, B:167:0x03b9, B:171:0x03d4, B:168:0x03c2, B:170:0x03ce, B:175:0x03ef, B:177:0x0434, B:178:0x0477, B:181:0x04a9, B:183:0x04ae, B:185:0x04ba, B:187:0x04c3, B:189:0x04c9, B:190:0x04d1, B:191:0x04d4, B:193:0x04d9, B:214:0x05af, B:217:0x05c1, B:218:0x05c6, B:221:0x05cd, B:227:0x05e8, B:224:0x05db, B:230:0x05ee, B:232:0x05f6, B:234:0x05fe, B:251:0x064d, B:252:0x066a, B:254:0x066e, B:256:0x0680, B:258:0x068a, B:261:0x0695, B:263:0x06ac, B:288:0x070b, B:290:0x0713, B:292:0x0717, B:295:0x071b, B:297:0x0726, B:298:0x073e, B:299:0x0747, B:300:0x075e, B:271:0x06c0, B:273:0x06cc, B:276:0x06d9, B:278:0x06f0, B:239:0x0623, B:243:0x0633, B:245:0x0639, B:248:0x0644, B:196:0x04e3, B:198:0x0516, B:199:0x0531, B:201:0x0536, B:203:0x0542, B:207:0x0555, B:204:0x054a, B:210:0x055c, B:212:0x0576, B:213:0x0596, B:136:0x0351, B:139:0x035b, B:142:0x0365, B:306:0x0784, B:308:0x0790, B:310:0x0799, B:322:0x07d6, B:312:0x07ab, B:314:0x07b4, B:316:0x07ba, B:319:0x07c6, B:321:0x07d0, B:323:0x07d9, B:325:0x07e1, B:327:0x07ed, B:329:0x07fb, B:332:0x0800, B:334:0x0842, B:335:0x086d, B:337:0x0872, B:339:0x087e, B:343:0x088a, B:346:0x08a6, B:340:0x0884, B:333:0x0825, B:347:0x08be, B:349:0x08ce, B:351:0x08eb, B:353:0x08f7, B:355:0x08fd, B:357:0x0907, B:358:0x0939, B:360:0x093e, B:362:0x094a, B:366:0x0956, B:363:0x0950, B:367:0x0967, B:374:0x09b3, B:376:0x09c6, B:377:0x09d5, B:379:0x09d9, B:381:0x09e5, B:382:0x09f2, B:384:0x09f6, B:386:0x09fc, B:388:0x0a14, B:397:0x0a66, B:399:0x0a6e, B:401:0x0a7c, B:403:0x0a80, B:418:0x0abc, B:421:0x0ace, B:425:0x0af7, B:427:0x0b07, B:436:0x0b5a, B:438:0x0b62, B:440:0x0b66, B:442:0x0b6a, B:444:0x0b6e, B:448:0x0b80, B:450:0x0b9d, B:451:0x0ba6, B:458:0x0bcf, B:405:0x0a8e, B:407:0x0a92, B:409:0x0a9c, B:411:0x0aa0, B:414:0x0ab0, B:46:0x011f, B:61:0x01a9, B:70:0x01d6, B:78:0x01f5, B:84:0x020e, B:98:0x0235, B:38:0x00d8, B:49:0x0128), top: B:577:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0248 A[Catch: all -> 0x0e8d, TryCatch #10 {all -> 0x0e8d, blocks: (B:3:0x000d, B:22:0x0083, B:99:0x0238, B:101:0x023c, B:107:0x0248, B:108:0x0277, B:111:0x028d, B:114:0x02a9, B:116:0x02da, B:122:0x02ee, B:124:0x02f6, B:301:0x0767, B:126:0x031d, B:129:0x0331, B:158:0x038e, B:160:0x0392, B:162:0x039c, B:165:0x03a7, B:167:0x03b9, B:171:0x03d4, B:168:0x03c2, B:170:0x03ce, B:175:0x03ef, B:177:0x0434, B:178:0x0477, B:181:0x04a9, B:183:0x04ae, B:185:0x04ba, B:187:0x04c3, B:189:0x04c9, B:190:0x04d1, B:191:0x04d4, B:193:0x04d9, B:214:0x05af, B:217:0x05c1, B:218:0x05c6, B:221:0x05cd, B:227:0x05e8, B:224:0x05db, B:230:0x05ee, B:232:0x05f6, B:234:0x05fe, B:251:0x064d, B:252:0x066a, B:254:0x066e, B:256:0x0680, B:258:0x068a, B:261:0x0695, B:263:0x06ac, B:288:0x070b, B:290:0x0713, B:292:0x0717, B:295:0x071b, B:297:0x0726, B:298:0x073e, B:299:0x0747, B:300:0x075e, B:271:0x06c0, B:273:0x06cc, B:276:0x06d9, B:278:0x06f0, B:239:0x0623, B:243:0x0633, B:245:0x0639, B:248:0x0644, B:196:0x04e3, B:198:0x0516, B:199:0x0531, B:201:0x0536, B:203:0x0542, B:207:0x0555, B:204:0x054a, B:210:0x055c, B:212:0x0576, B:213:0x0596, B:136:0x0351, B:139:0x035b, B:142:0x0365, B:306:0x0784, B:308:0x0790, B:310:0x0799, B:322:0x07d6, B:312:0x07ab, B:314:0x07b4, B:316:0x07ba, B:319:0x07c6, B:321:0x07d0, B:323:0x07d9, B:325:0x07e1, B:327:0x07ed, B:329:0x07fb, B:332:0x0800, B:334:0x0842, B:335:0x086d, B:337:0x0872, B:339:0x087e, B:343:0x088a, B:346:0x08a6, B:340:0x0884, B:333:0x0825, B:347:0x08be, B:349:0x08ce, B:351:0x08eb, B:353:0x08f7, B:355:0x08fd, B:357:0x0907, B:358:0x0939, B:360:0x093e, B:362:0x094a, B:366:0x0956, B:363:0x0950, B:367:0x0967, B:374:0x09b3, B:376:0x09c6, B:377:0x09d5, B:379:0x09d9, B:381:0x09e5, B:382:0x09f2, B:384:0x09f6, B:386:0x09fc, B:388:0x0a14, B:397:0x0a66, B:399:0x0a6e, B:401:0x0a7c, B:403:0x0a80, B:418:0x0abc, B:421:0x0ace, B:425:0x0af7, B:427:0x0b07, B:436:0x0b5a, B:438:0x0b62, B:440:0x0b66, B:442:0x0b6a, B:444:0x0b6e, B:448:0x0b80, B:450:0x0b9d, B:451:0x0ba6, B:458:0x0bcf, B:405:0x0a8e, B:407:0x0a92, B:409:0x0a9c, B:411:0x0aa0, B:414:0x0ab0, B:46:0x011f, B:61:0x01a9, B:70:0x01d6, B:78:0x01f5, B:84:0x020e, B:98:0x0235, B:38:0x00d8, B:49:0x0128), top: B:577:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0680 A[Catch: all -> 0x0e8d, TryCatch #10 {all -> 0x0e8d, blocks: (B:3:0x000d, B:22:0x0083, B:99:0x0238, B:101:0x023c, B:107:0x0248, B:108:0x0277, B:111:0x028d, B:114:0x02a9, B:116:0x02da, B:122:0x02ee, B:124:0x02f6, B:301:0x0767, B:126:0x031d, B:129:0x0331, B:158:0x038e, B:160:0x0392, B:162:0x039c, B:165:0x03a7, B:167:0x03b9, B:171:0x03d4, B:168:0x03c2, B:170:0x03ce, B:175:0x03ef, B:177:0x0434, B:178:0x0477, B:181:0x04a9, B:183:0x04ae, B:185:0x04ba, B:187:0x04c3, B:189:0x04c9, B:190:0x04d1, B:191:0x04d4, B:193:0x04d9, B:214:0x05af, B:217:0x05c1, B:218:0x05c6, B:221:0x05cd, B:227:0x05e8, B:224:0x05db, B:230:0x05ee, B:232:0x05f6, B:234:0x05fe, B:251:0x064d, B:252:0x066a, B:254:0x066e, B:256:0x0680, B:258:0x068a, B:261:0x0695, B:263:0x06ac, B:288:0x070b, B:290:0x0713, B:292:0x0717, B:295:0x071b, B:297:0x0726, B:298:0x073e, B:299:0x0747, B:300:0x075e, B:271:0x06c0, B:273:0x06cc, B:276:0x06d9, B:278:0x06f0, B:239:0x0623, B:243:0x0633, B:245:0x0639, B:248:0x0644, B:196:0x04e3, B:198:0x0516, B:199:0x0531, B:201:0x0536, B:203:0x0542, B:207:0x0555, B:204:0x054a, B:210:0x055c, B:212:0x0576, B:213:0x0596, B:136:0x0351, B:139:0x035b, B:142:0x0365, B:306:0x0784, B:308:0x0790, B:310:0x0799, B:322:0x07d6, B:312:0x07ab, B:314:0x07b4, B:316:0x07ba, B:319:0x07c6, B:321:0x07d0, B:323:0x07d9, B:325:0x07e1, B:327:0x07ed, B:329:0x07fb, B:332:0x0800, B:334:0x0842, B:335:0x086d, B:337:0x0872, B:339:0x087e, B:343:0x088a, B:346:0x08a6, B:340:0x0884, B:333:0x0825, B:347:0x08be, B:349:0x08ce, B:351:0x08eb, B:353:0x08f7, B:355:0x08fd, B:357:0x0907, B:358:0x0939, B:360:0x093e, B:362:0x094a, B:366:0x0956, B:363:0x0950, B:367:0x0967, B:374:0x09b3, B:376:0x09c6, B:377:0x09d5, B:379:0x09d9, B:381:0x09e5, B:382:0x09f2, B:384:0x09f6, B:386:0x09fc, B:388:0x0a14, B:397:0x0a66, B:399:0x0a6e, B:401:0x0a7c, B:403:0x0a80, B:418:0x0abc, B:421:0x0ace, B:425:0x0af7, B:427:0x0b07, B:436:0x0b5a, B:438:0x0b62, B:440:0x0b66, B:442:0x0b6a, B:444:0x0b6e, B:448:0x0b80, B:450:0x0b9d, B:451:0x0ba6, B:458:0x0bcf, B:405:0x0a8e, B:407:0x0a92, B:409:0x0a9c, B:411:0x0aa0, B:414:0x0ab0, B:46:0x011f, B:61:0x01a9, B:70:0x01d6, B:78:0x01f5, B:84:0x020e, B:98:0x0235, B:38:0x00d8, B:49:0x0128), top: B:577:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0726 A[Catch: all -> 0x0e8d, TryCatch #10 {all -> 0x0e8d, blocks: (B:3:0x000d, B:22:0x0083, B:99:0x0238, B:101:0x023c, B:107:0x0248, B:108:0x0277, B:111:0x028d, B:114:0x02a9, B:116:0x02da, B:122:0x02ee, B:124:0x02f6, B:301:0x0767, B:126:0x031d, B:129:0x0331, B:158:0x038e, B:160:0x0392, B:162:0x039c, B:165:0x03a7, B:167:0x03b9, B:171:0x03d4, B:168:0x03c2, B:170:0x03ce, B:175:0x03ef, B:177:0x0434, B:178:0x0477, B:181:0x04a9, B:183:0x04ae, B:185:0x04ba, B:187:0x04c3, B:189:0x04c9, B:190:0x04d1, B:191:0x04d4, B:193:0x04d9, B:214:0x05af, B:217:0x05c1, B:218:0x05c6, B:221:0x05cd, B:227:0x05e8, B:224:0x05db, B:230:0x05ee, B:232:0x05f6, B:234:0x05fe, B:251:0x064d, B:252:0x066a, B:254:0x066e, B:256:0x0680, B:258:0x068a, B:261:0x0695, B:263:0x06ac, B:288:0x070b, B:290:0x0713, B:292:0x0717, B:295:0x071b, B:297:0x0726, B:298:0x073e, B:299:0x0747, B:300:0x075e, B:271:0x06c0, B:273:0x06cc, B:276:0x06d9, B:278:0x06f0, B:239:0x0623, B:243:0x0633, B:245:0x0639, B:248:0x0644, B:196:0x04e3, B:198:0x0516, B:199:0x0531, B:201:0x0536, B:203:0x0542, B:207:0x0555, B:204:0x054a, B:210:0x055c, B:212:0x0576, B:213:0x0596, B:136:0x0351, B:139:0x035b, B:142:0x0365, B:306:0x0784, B:308:0x0790, B:310:0x0799, B:322:0x07d6, B:312:0x07ab, B:314:0x07b4, B:316:0x07ba, B:319:0x07c6, B:321:0x07d0, B:323:0x07d9, B:325:0x07e1, B:327:0x07ed, B:329:0x07fb, B:332:0x0800, B:334:0x0842, B:335:0x086d, B:337:0x0872, B:339:0x087e, B:343:0x088a, B:346:0x08a6, B:340:0x0884, B:333:0x0825, B:347:0x08be, B:349:0x08ce, B:351:0x08eb, B:353:0x08f7, B:355:0x08fd, B:357:0x0907, B:358:0x0939, B:360:0x093e, B:362:0x094a, B:366:0x0956, B:363:0x0950, B:367:0x0967, B:374:0x09b3, B:376:0x09c6, B:377:0x09d5, B:379:0x09d9, B:381:0x09e5, B:382:0x09f2, B:384:0x09f6, B:386:0x09fc, B:388:0x0a14, B:397:0x0a66, B:399:0x0a6e, B:401:0x0a7c, B:403:0x0a80, B:418:0x0abc, B:421:0x0ace, B:425:0x0af7, B:427:0x0b07, B:436:0x0b5a, B:438:0x0b62, B:440:0x0b66, B:442:0x0b6a, B:444:0x0b6e, B:448:0x0b80, B:450:0x0b9d, B:451:0x0ba6, B:458:0x0bcf, B:405:0x0a8e, B:407:0x0a92, B:409:0x0a9c, B:411:0x0aa0, B:414:0x0ab0, B:46:0x011f, B:61:0x01a9, B:70:0x01d6, B:78:0x01f5, B:84:0x020e, B:98:0x0235, B:38:0x00d8, B:49:0x0128), top: B:577:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x073e A[Catch: all -> 0x0e8d, TryCatch #10 {all -> 0x0e8d, blocks: (B:3:0x000d, B:22:0x0083, B:99:0x0238, B:101:0x023c, B:107:0x0248, B:108:0x0277, B:111:0x028d, B:114:0x02a9, B:116:0x02da, B:122:0x02ee, B:124:0x02f6, B:301:0x0767, B:126:0x031d, B:129:0x0331, B:158:0x038e, B:160:0x0392, B:162:0x039c, B:165:0x03a7, B:167:0x03b9, B:171:0x03d4, B:168:0x03c2, B:170:0x03ce, B:175:0x03ef, B:177:0x0434, B:178:0x0477, B:181:0x04a9, B:183:0x04ae, B:185:0x04ba, B:187:0x04c3, B:189:0x04c9, B:190:0x04d1, B:191:0x04d4, B:193:0x04d9, B:214:0x05af, B:217:0x05c1, B:218:0x05c6, B:221:0x05cd, B:227:0x05e8, B:224:0x05db, B:230:0x05ee, B:232:0x05f6, B:234:0x05fe, B:251:0x064d, B:252:0x066a, B:254:0x066e, B:256:0x0680, B:258:0x068a, B:261:0x0695, B:263:0x06ac, B:288:0x070b, B:290:0x0713, B:292:0x0717, B:295:0x071b, B:297:0x0726, B:298:0x073e, B:299:0x0747, B:300:0x075e, B:271:0x06c0, B:273:0x06cc, B:276:0x06d9, B:278:0x06f0, B:239:0x0623, B:243:0x0633, B:245:0x0639, B:248:0x0644, B:196:0x04e3, B:198:0x0516, B:199:0x0531, B:201:0x0536, B:203:0x0542, B:207:0x0555, B:204:0x054a, B:210:0x055c, B:212:0x0576, B:213:0x0596, B:136:0x0351, B:139:0x035b, B:142:0x0365, B:306:0x0784, B:308:0x0790, B:310:0x0799, B:322:0x07d6, B:312:0x07ab, B:314:0x07b4, B:316:0x07ba, B:319:0x07c6, B:321:0x07d0, B:323:0x07d9, B:325:0x07e1, B:327:0x07ed, B:329:0x07fb, B:332:0x0800, B:334:0x0842, B:335:0x086d, B:337:0x0872, B:339:0x087e, B:343:0x088a, B:346:0x08a6, B:340:0x0884, B:333:0x0825, B:347:0x08be, B:349:0x08ce, B:351:0x08eb, B:353:0x08f7, B:355:0x08fd, B:357:0x0907, B:358:0x0939, B:360:0x093e, B:362:0x094a, B:366:0x0956, B:363:0x0950, B:367:0x0967, B:374:0x09b3, B:376:0x09c6, B:377:0x09d5, B:379:0x09d9, B:381:0x09e5, B:382:0x09f2, B:384:0x09f6, B:386:0x09fc, B:388:0x0a14, B:397:0x0a66, B:399:0x0a6e, B:401:0x0a7c, B:403:0x0a80, B:418:0x0abc, B:421:0x0ace, B:425:0x0af7, B:427:0x0b07, B:436:0x0b5a, B:438:0x0b62, B:440:0x0b66, B:442:0x0b6a, B:444:0x0b6e, B:448:0x0b80, B:450:0x0b9d, B:451:0x0ba6, B:458:0x0bcf, B:405:0x0a8e, B:407:0x0a92, B:409:0x0a9c, B:411:0x0aa0, B:414:0x0ab0, B:46:0x011f, B:61:0x01a9, B:70:0x01d6, B:78:0x01f5, B:84:0x020e, B:98:0x0235, B:38:0x00d8, B:49:0x0128), top: B:577:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0872 A[Catch: all -> 0x0e8d, TryCatch #10 {all -> 0x0e8d, blocks: (B:3:0x000d, B:22:0x0083, B:99:0x0238, B:101:0x023c, B:107:0x0248, B:108:0x0277, B:111:0x028d, B:114:0x02a9, B:116:0x02da, B:122:0x02ee, B:124:0x02f6, B:301:0x0767, B:126:0x031d, B:129:0x0331, B:158:0x038e, B:160:0x0392, B:162:0x039c, B:165:0x03a7, B:167:0x03b9, B:171:0x03d4, B:168:0x03c2, B:170:0x03ce, B:175:0x03ef, B:177:0x0434, B:178:0x0477, B:181:0x04a9, B:183:0x04ae, B:185:0x04ba, B:187:0x04c3, B:189:0x04c9, B:190:0x04d1, B:191:0x04d4, B:193:0x04d9, B:214:0x05af, B:217:0x05c1, B:218:0x05c6, B:221:0x05cd, B:227:0x05e8, B:224:0x05db, B:230:0x05ee, B:232:0x05f6, B:234:0x05fe, B:251:0x064d, B:252:0x066a, B:254:0x066e, B:256:0x0680, B:258:0x068a, B:261:0x0695, B:263:0x06ac, B:288:0x070b, B:290:0x0713, B:292:0x0717, B:295:0x071b, B:297:0x0726, B:298:0x073e, B:299:0x0747, B:300:0x075e, B:271:0x06c0, B:273:0x06cc, B:276:0x06d9, B:278:0x06f0, B:239:0x0623, B:243:0x0633, B:245:0x0639, B:248:0x0644, B:196:0x04e3, B:198:0x0516, B:199:0x0531, B:201:0x0536, B:203:0x0542, B:207:0x0555, B:204:0x054a, B:210:0x055c, B:212:0x0576, B:213:0x0596, B:136:0x0351, B:139:0x035b, B:142:0x0365, B:306:0x0784, B:308:0x0790, B:310:0x0799, B:322:0x07d6, B:312:0x07ab, B:314:0x07b4, B:316:0x07ba, B:319:0x07c6, B:321:0x07d0, B:323:0x07d9, B:325:0x07e1, B:327:0x07ed, B:329:0x07fb, B:332:0x0800, B:334:0x0842, B:335:0x086d, B:337:0x0872, B:339:0x087e, B:343:0x088a, B:346:0x08a6, B:340:0x0884, B:333:0x0825, B:347:0x08be, B:349:0x08ce, B:351:0x08eb, B:353:0x08f7, B:355:0x08fd, B:357:0x0907, B:358:0x0939, B:360:0x093e, B:362:0x094a, B:366:0x0956, B:363:0x0950, B:367:0x0967, B:374:0x09b3, B:376:0x09c6, B:377:0x09d5, B:379:0x09d9, B:381:0x09e5, B:382:0x09f2, B:384:0x09f6, B:386:0x09fc, B:388:0x0a14, B:397:0x0a66, B:399:0x0a6e, B:401:0x0a7c, B:403:0x0a80, B:418:0x0abc, B:421:0x0ace, B:425:0x0af7, B:427:0x0b07, B:436:0x0b5a, B:438:0x0b62, B:440:0x0b66, B:442:0x0b6a, B:444:0x0b6e, B:448:0x0b80, B:450:0x0b9d, B:451:0x0ba6, B:458:0x0bcf, B:405:0x0a8e, B:407:0x0a92, B:409:0x0a9c, B:411:0x0aa0, B:414:0x0ab0, B:46:0x011f, B:61:0x01a9, B:70:0x01d6, B:78:0x01f5, B:84:0x020e, B:98:0x0235, B:38:0x00d8, B:49:0x0128), top: B:577:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x088a A[Catch: all -> 0x0e8d, TryCatch #10 {all -> 0x0e8d, blocks: (B:3:0x000d, B:22:0x0083, B:99:0x0238, B:101:0x023c, B:107:0x0248, B:108:0x0277, B:111:0x028d, B:114:0x02a9, B:116:0x02da, B:122:0x02ee, B:124:0x02f6, B:301:0x0767, B:126:0x031d, B:129:0x0331, B:158:0x038e, B:160:0x0392, B:162:0x039c, B:165:0x03a7, B:167:0x03b9, B:171:0x03d4, B:168:0x03c2, B:170:0x03ce, B:175:0x03ef, B:177:0x0434, B:178:0x0477, B:181:0x04a9, B:183:0x04ae, B:185:0x04ba, B:187:0x04c3, B:189:0x04c9, B:190:0x04d1, B:191:0x04d4, B:193:0x04d9, B:214:0x05af, B:217:0x05c1, B:218:0x05c6, B:221:0x05cd, B:227:0x05e8, B:224:0x05db, B:230:0x05ee, B:232:0x05f6, B:234:0x05fe, B:251:0x064d, B:252:0x066a, B:254:0x066e, B:256:0x0680, B:258:0x068a, B:261:0x0695, B:263:0x06ac, B:288:0x070b, B:290:0x0713, B:292:0x0717, B:295:0x071b, B:297:0x0726, B:298:0x073e, B:299:0x0747, B:300:0x075e, B:271:0x06c0, B:273:0x06cc, B:276:0x06d9, B:278:0x06f0, B:239:0x0623, B:243:0x0633, B:245:0x0639, B:248:0x0644, B:196:0x04e3, B:198:0x0516, B:199:0x0531, B:201:0x0536, B:203:0x0542, B:207:0x0555, B:204:0x054a, B:210:0x055c, B:212:0x0576, B:213:0x0596, B:136:0x0351, B:139:0x035b, B:142:0x0365, B:306:0x0784, B:308:0x0790, B:310:0x0799, B:322:0x07d6, B:312:0x07ab, B:314:0x07b4, B:316:0x07ba, B:319:0x07c6, B:321:0x07d0, B:323:0x07d9, B:325:0x07e1, B:327:0x07ed, B:329:0x07fb, B:332:0x0800, B:334:0x0842, B:335:0x086d, B:337:0x0872, B:339:0x087e, B:343:0x088a, B:346:0x08a6, B:340:0x0884, B:333:0x0825, B:347:0x08be, B:349:0x08ce, B:351:0x08eb, B:353:0x08f7, B:355:0x08fd, B:357:0x0907, B:358:0x0939, B:360:0x093e, B:362:0x094a, B:366:0x0956, B:363:0x0950, B:367:0x0967, B:374:0x09b3, B:376:0x09c6, B:377:0x09d5, B:379:0x09d9, B:381:0x09e5, B:382:0x09f2, B:384:0x09f6, B:386:0x09fc, B:388:0x0a14, B:397:0x0a66, B:399:0x0a6e, B:401:0x0a7c, B:403:0x0a80, B:418:0x0abc, B:421:0x0ace, B:425:0x0af7, B:427:0x0b07, B:436:0x0b5a, B:438:0x0b62, B:440:0x0b66, B:442:0x0b6a, B:444:0x0b6e, B:448:0x0b80, B:450:0x0b9d, B:451:0x0ba6, B:458:0x0bcf, B:405:0x0a8e, B:407:0x0a92, B:409:0x0a9c, B:411:0x0aa0, B:414:0x0ab0, B:46:0x011f, B:61:0x01a9, B:70:0x01d6, B:78:0x01f5, B:84:0x020e, B:98:0x0235, B:38:0x00d8, B:49:0x0128), top: B:577:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x08a6 A[Catch: all -> 0x0e8d, TryCatch #10 {all -> 0x0e8d, blocks: (B:3:0x000d, B:22:0x0083, B:99:0x0238, B:101:0x023c, B:107:0x0248, B:108:0x0277, B:111:0x028d, B:114:0x02a9, B:116:0x02da, B:122:0x02ee, B:124:0x02f6, B:301:0x0767, B:126:0x031d, B:129:0x0331, B:158:0x038e, B:160:0x0392, B:162:0x039c, B:165:0x03a7, B:167:0x03b9, B:171:0x03d4, B:168:0x03c2, B:170:0x03ce, B:175:0x03ef, B:177:0x0434, B:178:0x0477, B:181:0x04a9, B:183:0x04ae, B:185:0x04ba, B:187:0x04c3, B:189:0x04c9, B:190:0x04d1, B:191:0x04d4, B:193:0x04d9, B:214:0x05af, B:217:0x05c1, B:218:0x05c6, B:221:0x05cd, B:227:0x05e8, B:224:0x05db, B:230:0x05ee, B:232:0x05f6, B:234:0x05fe, B:251:0x064d, B:252:0x066a, B:254:0x066e, B:256:0x0680, B:258:0x068a, B:261:0x0695, B:263:0x06ac, B:288:0x070b, B:290:0x0713, B:292:0x0717, B:295:0x071b, B:297:0x0726, B:298:0x073e, B:299:0x0747, B:300:0x075e, B:271:0x06c0, B:273:0x06cc, B:276:0x06d9, B:278:0x06f0, B:239:0x0623, B:243:0x0633, B:245:0x0639, B:248:0x0644, B:196:0x04e3, B:198:0x0516, B:199:0x0531, B:201:0x0536, B:203:0x0542, B:207:0x0555, B:204:0x054a, B:210:0x055c, B:212:0x0576, B:213:0x0596, B:136:0x0351, B:139:0x035b, B:142:0x0365, B:306:0x0784, B:308:0x0790, B:310:0x0799, B:322:0x07d6, B:312:0x07ab, B:314:0x07b4, B:316:0x07ba, B:319:0x07c6, B:321:0x07d0, B:323:0x07d9, B:325:0x07e1, B:327:0x07ed, B:329:0x07fb, B:332:0x0800, B:334:0x0842, B:335:0x086d, B:337:0x0872, B:339:0x087e, B:343:0x088a, B:346:0x08a6, B:340:0x0884, B:333:0x0825, B:347:0x08be, B:349:0x08ce, B:351:0x08eb, B:353:0x08f7, B:355:0x08fd, B:357:0x0907, B:358:0x0939, B:360:0x093e, B:362:0x094a, B:366:0x0956, B:363:0x0950, B:367:0x0967, B:374:0x09b3, B:376:0x09c6, B:377:0x09d5, B:379:0x09d9, B:381:0x09e5, B:382:0x09f2, B:384:0x09f6, B:386:0x09fc, B:388:0x0a14, B:397:0x0a66, B:399:0x0a6e, B:401:0x0a7c, B:403:0x0a80, B:418:0x0abc, B:421:0x0ace, B:425:0x0af7, B:427:0x0b07, B:436:0x0b5a, B:438:0x0b62, B:440:0x0b66, B:442:0x0b6a, B:444:0x0b6e, B:448:0x0b80, B:450:0x0b9d, B:451:0x0ba6, B:458:0x0bcf, B:405:0x0a8e, B:407:0x0a92, B:409:0x0a9c, B:411:0x0aa0, B:414:0x0ab0, B:46:0x011f, B:61:0x01a9, B:70:0x01d6, B:78:0x01f5, B:84:0x020e, B:98:0x0235, B:38:0x00d8, B:49:0x0128), top: B:577:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0e70  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0e87 A[Catch: all -> 0x0e8b, TRY_ENTER, TryCatch #8 {all -> 0x0e8b, blocks: (B:498:0x0d02, B:514:0x0d78, B:516:0x0d7d, B:518:0x0d90, B:521:0x0d95, B:526:0x0dc2, B:522:0x0d98, B:524:0x0da2, B:525:0x0dab, B:527:0x0dcb, B:528:0x0de2, B:531:0x0dea, B:532:0x0def, B:533:0x0dff, B:535:0x0e19, B:536:0x0e32, B:537:0x0e3a, B:542:0x0e5c, B:541:0x0e4b, B:499:0x0d1a, B:501:0x0d21, B:503:0x0d2b, B:505:0x0d31, B:511:0x0d43, B:513:0x0d49, B:548:0x0e71, B:554:0x0e87, B:555:0x0e8a), top: B:574:0x0027, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0887 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0235 A[Catch: all -> 0x0e8d, TRY_ENTER, TryCatch #10 {all -> 0x0e8d, blocks: (B:3:0x000d, B:22:0x0083, B:99:0x0238, B:101:0x023c, B:107:0x0248, B:108:0x0277, B:111:0x028d, B:114:0x02a9, B:116:0x02da, B:122:0x02ee, B:124:0x02f6, B:301:0x0767, B:126:0x031d, B:129:0x0331, B:158:0x038e, B:160:0x0392, B:162:0x039c, B:165:0x03a7, B:167:0x03b9, B:171:0x03d4, B:168:0x03c2, B:170:0x03ce, B:175:0x03ef, B:177:0x0434, B:178:0x0477, B:181:0x04a9, B:183:0x04ae, B:185:0x04ba, B:187:0x04c3, B:189:0x04c9, B:190:0x04d1, B:191:0x04d4, B:193:0x04d9, B:214:0x05af, B:217:0x05c1, B:218:0x05c6, B:221:0x05cd, B:227:0x05e8, B:224:0x05db, B:230:0x05ee, B:232:0x05f6, B:234:0x05fe, B:251:0x064d, B:252:0x066a, B:254:0x066e, B:256:0x0680, B:258:0x068a, B:261:0x0695, B:263:0x06ac, B:288:0x070b, B:290:0x0713, B:292:0x0717, B:295:0x071b, B:297:0x0726, B:298:0x073e, B:299:0x0747, B:300:0x075e, B:271:0x06c0, B:273:0x06cc, B:276:0x06d9, B:278:0x06f0, B:239:0x0623, B:243:0x0633, B:245:0x0639, B:248:0x0644, B:196:0x04e3, B:198:0x0516, B:199:0x0531, B:201:0x0536, B:203:0x0542, B:207:0x0555, B:204:0x054a, B:210:0x055c, B:212:0x0576, B:213:0x0596, B:136:0x0351, B:139:0x035b, B:142:0x0365, B:306:0x0784, B:308:0x0790, B:310:0x0799, B:322:0x07d6, B:312:0x07ab, B:314:0x07b4, B:316:0x07ba, B:319:0x07c6, B:321:0x07d0, B:323:0x07d9, B:325:0x07e1, B:327:0x07ed, B:329:0x07fb, B:332:0x0800, B:334:0x0842, B:335:0x086d, B:337:0x0872, B:339:0x087e, B:343:0x088a, B:346:0x08a6, B:340:0x0884, B:333:0x0825, B:347:0x08be, B:349:0x08ce, B:351:0x08eb, B:353:0x08f7, B:355:0x08fd, B:357:0x0907, B:358:0x0939, B:360:0x093e, B:362:0x094a, B:366:0x0956, B:363:0x0950, B:367:0x0967, B:374:0x09b3, B:376:0x09c6, B:377:0x09d5, B:379:0x09d9, B:381:0x09e5, B:382:0x09f2, B:384:0x09f6, B:386:0x09fc, B:388:0x0a14, B:397:0x0a66, B:399:0x0a6e, B:401:0x0a7c, B:403:0x0a80, B:418:0x0abc, B:421:0x0ace, B:425:0x0af7, B:427:0x0b07, B:436:0x0b5a, B:438:0x0b62, B:440:0x0b66, B:442:0x0b6a, B:444:0x0b6e, B:448:0x0b80, B:450:0x0b9d, B:451:0x0ba6, B:458:0x0bcf, B:405:0x0a8e, B:407:0x0a92, B:409:0x0a9c, B:411:0x0aa0, B:414:0x0ab0, B:46:0x011f, B:61:0x01a9, B:70:0x01d6, B:78:0x01f5, B:84:0x020e, B:98:0x0235, B:38:0x00d8, B:49:0x0128), top: B:577:0x000d, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzd(java.lang.String r43, long r44) {
        /*
            Method dump skipped, instructions count: 3736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzft.zzd(java.lang.String, long):boolean");
    }

    @VisibleForTesting
    public final void zzd(zzm zzmVar) {
        if (this.zzsn != null) {
            ArrayList arrayList = new ArrayList();
            this.zzso = arrayList;
            arrayList.addAll(this.zzsn);
        }
        zzw zzdo = zzdo();
        String str = zzmVar.packageName;
        Preconditions.checkNotEmpty(str);
        zzdo.zzq();
        zzdo.zzah();
        try {
            SQLiteDatabase writableDatabase = zzdo.getWritableDatabase();
            String[] strArr = {str};
            int delete = writableDatabase.delete("apps", "app_id=?", strArr) + 0 + writableDatabase.delete("events", "app_id=?", strArr) + writableDatabase.delete("user_attributes", "app_id=?", strArr) + writableDatabase.delete("conditional_properties", "app_id=?", strArr) + writableDatabase.delete("raw_events", "app_id=?", strArr) + writableDatabase.delete("raw_events_metadata", "app_id=?", strArr) + writableDatabase.delete("queue", "app_id=?", strArr) + writableDatabase.delete("audience_filter_values", "app_id=?", strArr) + writableDatabase.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzdo.zzad().zzdi().zza("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzdo.zzad().zzda().zza("Error resetting analytics data. appId, error", zzau.zzao(str), e);
        }
        zzm zza2 = zza(this.zzl.getContext(), zzmVar.packageName, zzmVar.zzch, zzmVar.zzcr, zzmVar.zzct, zzmVar.zzcu, zzmVar.zzdp, zzmVar.zzcv);
        if (!this.zzl.zzaf().zzs(zzmVar.packageName) || zzmVar.zzcr) {
            zzf(zza2);
        }
    }
}
