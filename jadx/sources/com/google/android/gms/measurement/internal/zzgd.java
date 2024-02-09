package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzgd extends zzcu {
    private static final String[] zztb = {"firebase_", "google_", "ga_"};
    private int zzae;
    private SecureRandom zztc;
    private final AtomicLong zztd;
    private Integer zzte;

    public zzgd(zzby zzbyVar) {
        super(zzbyVar);
        this.zzte = null;
        this.zztd = new AtomicLong(0L);
    }

    public static MessageDigest getMessageDigest() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static boolean zzbm(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    @VisibleForTesting
    private static boolean zzbp(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private static int zzbq(String str) {
        if ("_ldl".equals(str)) {
            return Barcode.PDF417;
        }
        if ("_id".equals(str)) {
            return Barcode.QR_CODE;
        }
        return 36;
    }

    public static boolean zzbs(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean zzc(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static Bundle zzh(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    private final boolean zzq(String str, String str2) {
        if (str2 == null) {
            zzad().zzda().zza("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzad().zzda().zza("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt) && codePointAt != 95) {
                zzad().zzda().zza("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    zzad().zzda().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public static boolean zzs(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final Bundle zza(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(FirebaseAnalytics.Param.CAMPAIGN, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString(FirebaseAnalytics.Param.MEDIUM, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            zzad().zzdd().zza("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzas zzaa() {
        return super.zzaa();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzgd zzab() {
        return super.zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzbt zzac() {
        return super.zzac();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzau zzad() {
        return super.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzbf zzae() {
        return super.zzae();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzt zzaf() {
        return super.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzq zzag() {
        return super.zzag();
    }

    @Override // com.google.android.gms.measurement.internal.zzcu
    public final boolean zzak() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzcu
    public final void zzal() {
        zzq();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzad().zzdd().zzaq("Utils falling back to Random for random id");
            }
        }
        this.zztd.set(nextLong);
    }

    public final Object zzb(String str, Object obj) {
        boolean equals = "_ev".equals(str);
        int i = Barcode.QR_CODE;
        if (equals) {
            return zza((int) Barcode.QR_CODE, obj, true);
        }
        if (!zzbs(str)) {
            i = 100;
        }
        return zza(i, obj, false);
    }

    public final int zzbn(String str) {
        if (zzq(DataLayer.EVENT_KEY, str)) {
            if (zza(DataLayer.EVENT_KEY, zzcx.zzoy, str)) {
                return !zza(DataLayer.EVENT_KEY, 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    public final int zzbo(String str) {
        if (zzq("user property", str)) {
            if (zza("user property", zzcz.zzpc, str)) {
                return !zza("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    public final boolean zzbr(String str) {
        zzq();
        if (Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzad().zzdh().zza("Permission not granted", str);
        return false;
    }

    public final boolean zzbt(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzbu = zzaf().zzbu();
        zzag();
        return zzbu.equals(str);
    }

    public final Object zzd(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return zza(zzbq(str), obj, true);
        }
        return zza(zzbq(str), obj, false);
    }

    public final Bundle zzg(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzb = zzb(str, bundle.get(str));
                if (zzb == null) {
                    zzad().zzdd().zza("Param value can't be null", zzaa().zzam(str));
                } else {
                    zza(bundle2, str, zzb);
                }
            }
        }
        return bundle2;
    }

    public final long zzgk() {
        long andIncrement;
        long j;
        if (this.zztd.get() == 0) {
            synchronized (this.zztd) {
                long nextLong = new Random(System.nanoTime() ^ zzz().currentTimeMillis()).nextLong();
                int i = this.zzae + 1;
                this.zzae = i;
                j = nextLong + i;
            }
            return j;
        }
        synchronized (this.zztd) {
            this.zztd.compareAndSet(-1L, 1L);
            andIncrement = this.zztd.getAndIncrement();
        }
        return andIncrement;
    }

    public final SecureRandom zzgl() {
        zzq();
        if (this.zztc == null) {
            this.zztc = new SecureRandom();
        }
        return this.zztc;
    }

    public final int zzgm() {
        if (this.zzte == null) {
            this.zzte = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(getContext()) / 1000);
        }
        return this.zzte.intValue();
    }

    public final String zzgn() {
        byte[] bArr = new byte[16];
        zzgl().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    public final boolean zzp(String str, String str2) {
        if (str2 == null) {
            zzad().zzda().zza("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzad().zzda().zza("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                zzad().zzda().zza("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    zzad().zzda().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean zzr(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzbp(str)) {
                return true;
            }
            if (this.zzl.zzel()) {
                zzad().zzda().zza("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzau.zzao(str));
            }
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            if (zzbp(str2)) {
                return true;
            }
            zzad().zzda().zza("Invalid admob_app_id. Analytics disabled.", zzau.zzao(str2));
            return false;
        } else {
            if (this.zzl.zzel()) {
                zzad().zzda().zzaq("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzad zzy() {
        return super.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Clock zzz() {
        return super.zzz();
    }

    @VisibleForTesting
    public static long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i = 0;
        Preconditions.checkState(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (bArr[length] & 255) << i;
            i += 8;
        }
        return j;
    }

    public static Bundle[] zzb(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        } else {
            return null;
        }
    }

    public final int zzc(String str, Object obj) {
        boolean zza;
        if ("_ldl".equals(str)) {
            zza = zza("user property referrer", str, zzbq(str), obj, false);
        } else {
            zza = zza("user property", str, zzbq(str), obj, false);
        }
        return zza ? 0 : 7;
    }

    @VisibleForTesting
    private final boolean zzd(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            zzad().zzda().zza("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            zzad().zzda().zza("Error obtaining certificate", e2);
            return true;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:17:0x0072). Please submit an issue!!! */
    public final long zzc(Context context, String str) {
        zzq();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest messageDigest = getMessageDigest();
        long j = -1;
        if (messageDigest == null) {
            zzad().zzda().zzaq("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e) {
                    zzad().zzda().zza("Package name not found", e);
                }
                if (!zzd(context, str)) {
                    Signature[] signatureArr = Wrappers.packageManager(context).getPackageInfo(getContext().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        j = zzd(messageDigest.digest(signatureArr[0].toByteArray()));
                    } else {
                        zzad().zzdd().zzaq("Could not get signatures");
                    }
                }
            }
            j = 0;
        }
        return j;
    }

    private static void zzb(Bundle bundle, Object obj) {
        Preconditions.checkNotNull(bundle);
        if (obj != null) {
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", String.valueOf(obj).length());
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzp() {
        super.zzp();
    }

    public static boolean zzb(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return zzb(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return zzb(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzq() {
        super.zzq();
    }

    private static boolean zzb(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final int zzd(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(getContext(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final void zzb(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            zzad().zzdd().zza("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    public static long zzc(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    public static ArrayList<Bundle> zzc(List<zzr> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzr zzrVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzrVar.packageName);
            bundle.putString("origin", zzrVar.origin);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzrVar.creationTimestamp);
            bundle.putString("name", zzrVar.zzdv.name);
            zzcw.zza(bundle, zzrVar.zzdv.getValue());
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzrVar.active);
            String str = zzrVar.triggerEventName;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzaj zzajVar = zzrVar.zzdw;
            if (zzajVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzajVar.name);
                zzag zzagVar = zzrVar.zzdw.zzfd;
                if (zzagVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzagVar.zzct());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzrVar.triggerTimeout);
            zzaj zzajVar2 = zzrVar.zzdx;
            if (zzajVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzajVar2.name);
                zzag zzagVar2 = zzrVar.zzdx.zzfd;
                if (zzagVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzagVar2.zzct());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzrVar.zzdv.zzsx);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzrVar.timeToLive);
            zzaj zzajVar3 = zzrVar.zzdy;
            if (zzajVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzajVar3.name);
                zzag zzagVar3 = zzrVar.zzdy.zzfd;
                if (zzagVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzagVar3.zzct());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzq zzqVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzqVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzl.zzad().zzdd().zza("Error returning string value to wrapper", e);
        }
    }

    public static Bundle zzb(List<zzga> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzga zzgaVar : list) {
            String str = zzgaVar.zzki;
            if (str != null) {
                bundle.putString(zzgaVar.name, str);
            } else {
                Long l = zzgaVar.zzsy;
                if (l != null) {
                    bundle.putLong(zzgaVar.name, l.longValue());
                } else {
                    Double d = zzgaVar.zzta;
                    if (d != null) {
                        bundle.putDouble(zzgaVar.name, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public final boolean zza(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            zzad().zzda().zza("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr2 = zztb;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            zzad().zzda().zza("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            Preconditions.checkNotNull(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (zzs(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                zzad().zzda().zza("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    public final boolean zza(String str, int i, String str2) {
        if (str2 == null) {
            zzad().zzda().zza("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i) {
            zzad().zzda().zza("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        } else {
            return true;
        }
    }

    private final boolean zza(String str, String str2, int i, Object obj, boolean z) {
        Parcelable[] parcelableArr;
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if ((obj instanceof Bundle) && z) {
                    return true;
                }
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            zzad().zzdd().zza("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if ((obj instanceof ArrayList) && z) {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!(obj2 instanceof Bundle)) {
                            zzad().zzdd().zza("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else {
                    return false;
                }
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                zzad().zzdd().zza("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public static boolean zza(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    private static Object zza(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return zza(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    public static String zza(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i) {
            if (z) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
            return null;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (zza("event param", 40, r15) == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle zza(java.lang.String r18, java.lang.String r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgd.zza(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    private static boolean zza(Bundle bundle, int i) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    public final void zza(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (str != null) {
            zzad().zzdf().zza("Not putting event parameter. Invalid value type. name, type", zzaa().zzam(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zza(int i, String str, String str2, int i2) {
        zza((String) null, i, str, str2, i2);
    }

    public final void zza(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        zza(bundle, i);
        if (zzaf().zze(str, zzal.zzis)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                bundle.putString(str2, str3);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        this.zzl.zzag();
        this.zzl.zzs().logEvent("auto", "_err", bundle);
    }

    public static boolean zza(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    public final zzaj zza(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzbn(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString(CrashlyticsAnalyticsListener.EVENT_ORIGIN_KEY, str3);
            return new zzaj(str2, new zzag(zzg(zza(str, str2, bundle2, CollectionUtils.listOf(CrashlyticsAnalyticsListener.EVENT_ORIGIN_KEY), false, false))), str3, j);
        }
        zzad().zzda().zza("Invalid conditional property event name", zzaa().zzan(str2));
        throw new IllegalArgumentException();
    }

    public static byte[] zza(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzq zzqVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzqVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzl.zzad().zzdd().zza("Error returning long value to wrapper", e);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzq zzqVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzqVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzl.zzad().zzdd().zza("Error returning int value to wrapper", e);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzq zzqVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzqVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzl.zzad().zzdd().zza("Error returning byte array to wrapper", e);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzq zzqVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzqVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzl.zzad().zzdd().zza("Error returning boolean value to wrapper", e);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzq zzqVar, Bundle bundle) {
        try {
            zzqVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzl.zzad().zzdd().zza("Error returning bundle value to wrapper", e);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzq zzqVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzqVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzl.zzad().zzdd().zza("Error returning bundle list to wrapper", e);
        }
    }
}
