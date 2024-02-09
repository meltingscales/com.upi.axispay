package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.vision.barcode.Barcode;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzad extends zzcu {
    private long zzew;
    private String zzex;
    private Boolean zzey;
    private AccountManager zzez;
    private Boolean zzfa;
    private long zzfb;

    public zzad(zzby zzbyVar) {
        super(zzbyVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
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
        Calendar calendar = Calendar.getInstance();
        this.zzew = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.zzex = sb.toString();
        return false;
    }

    public final long zzco() {
        zzah();
        return this.zzew;
    }

    public final String zzcp() {
        zzah();
        return this.zzex;
    }

    public final long zzcq() {
        zzq();
        return this.zzfb;
    }

    public final void zzcr() {
        zzq();
        this.zzfa = null;
        this.zzfb = 0L;
    }

    public final boolean zzcs() {
        Account[] result;
        zzq();
        long currentTimeMillis = zzz().currentTimeMillis();
        if (currentTimeMillis - this.zzfb > 86400000) {
            this.zzfa = null;
        }
        Boolean bool = this.zzfa;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (t8.a(getContext(), "android.permission.GET_ACCOUNTS") != 0) {
            zzad().zzde().zzaq("Permission error checking for dasher/unicorn accounts");
            this.zzfb = currentTimeMillis;
            this.zzfa = Boolean.FALSE;
            return false;
        }
        if (this.zzez == null) {
            this.zzez = AccountManager.get(getContext());
        }
        try {
            result = this.zzez.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            zzad().zzdb().zza("Exception checking account types", e);
        }
        if (result != null && result.length > 0) {
            this.zzfa = Boolean.TRUE;
            this.zzfb = currentTimeMillis;
            return true;
        }
        Account[] result2 = this.zzez.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.zzfa = Boolean.TRUE;
            this.zzfb = currentTimeMillis;
            return true;
        }
        this.zzfb = currentTimeMillis;
        this.zzfa = Boolean.FALSE;
        return false;
    }

    public final boolean zzj(Context context) {
        if (this.zzey == null) {
            zzag();
            this.zzey = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", Barcode.ITF);
                    this.zzey = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.zzey.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzp() {
        super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzq() {
        super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzad zzy() {
        return super.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Clock zzz() {
        return super.zzz();
    }
}
