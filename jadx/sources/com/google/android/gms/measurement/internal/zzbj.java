package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbj {
    private final /* synthetic */ zzbf zzly;
    @VisibleForTesting
    private final String zzma;
    private final String zzmb;
    private final String zzmc;
    private final long zzmd;

    private zzbj(zzbf zzbfVar, String str, long j) {
        this.zzly = zzbfVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.zzma = String.valueOf(str).concat(":start");
        this.zzmb = String.valueOf(str).concat(":count");
        this.zzmc = String.valueOf(str).concat(":value");
        this.zzmd = j;
    }

    private final void zzea() {
        SharedPreferences zzdr;
        this.zzly.zzq();
        long currentTimeMillis = this.zzly.zzz().currentTimeMillis();
        zzdr = this.zzly.zzdr();
        SharedPreferences.Editor edit = zzdr.edit();
        edit.remove(this.zzmb);
        edit.remove(this.zzmc);
        edit.putLong(this.zzma, currentTimeMillis);
        edit.apply();
    }

    private final long zzec() {
        SharedPreferences zzdr;
        zzdr = this.zzly.zzdr();
        return zzdr.getLong(this.zzma, 0L);
    }

    public final void zzc(String str, long j) {
        SharedPreferences zzdr;
        SharedPreferences zzdr2;
        SharedPreferences zzdr3;
        this.zzly.zzq();
        if (zzec() == 0) {
            zzea();
        }
        if (str == null) {
            str = "";
        }
        zzdr = this.zzly.zzdr();
        long j2 = zzdr.getLong(this.zzmb, 0L);
        if (j2 <= 0) {
            zzdr3 = this.zzly.zzdr();
            SharedPreferences.Editor edit = zzdr3.edit();
            edit.putString(this.zzmc, str);
            edit.putLong(this.zzmb, 1L);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.zzly.zzab().zzgl().nextLong() & RecyclerView.FOREVER_NS) < RecyclerView.FOREVER_NS / j3;
        zzdr2 = this.zzly.zzdr();
        SharedPreferences.Editor edit2 = zzdr2.edit();
        if (z) {
            edit2.putString(this.zzmc, str);
        }
        edit2.putLong(this.zzmb, j3);
        edit2.apply();
    }

    public final Pair<String, Long> zzeb() {
        long abs;
        SharedPreferences zzdr;
        SharedPreferences zzdr2;
        this.zzly.zzq();
        this.zzly.zzq();
        long zzec = zzec();
        if (zzec == 0) {
            zzea();
            abs = 0;
        } else {
            abs = Math.abs(zzec - this.zzly.zzz().currentTimeMillis());
        }
        long j = this.zzmd;
        if (abs < j) {
            return null;
        }
        if (abs <= (j << 1)) {
            zzdr = this.zzly.zzdr();
            String string = zzdr.getString(this.zzmc, null);
            zzdr2 = this.zzly.zzdr();
            long j2 = zzdr2.getLong(this.zzmb, 0L);
            zzea();
            if (string != null && j2 > 0) {
                return new Pair<>(string, Long.valueOf(j2));
            }
            return zzbf.zzky;
        }
        zzea();
        return null;
    }
}
