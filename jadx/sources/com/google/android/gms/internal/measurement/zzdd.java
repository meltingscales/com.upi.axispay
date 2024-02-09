package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdd implements zzcp {
    public static final Map<String, zzdd> zzaai = new HashMap();
    private final SharedPreferences zzaaj;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzaak;
    private final Object zzzk;
    private volatile Map<String, ?> zzzl;
    private final List<zzco> zzzm;

    private zzdd(SharedPreferences sharedPreferences) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.measurement.zzde
            private final zzdd zzaal;

            {
                this.zzaal = this;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.zzaal.zza(sharedPreferences2, str);
            }
        };
        this.zzaak = onSharedPreferenceChangeListener;
        this.zzzk = new Object();
        this.zzzm = new ArrayList();
        this.zzaaj = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static zzdd zze(Context context, String str) {
        zzdd zzddVar;
        SharedPreferences sharedPreferences;
        if ((!zzck.zzji() || str.startsWith("direct_boot:")) ? true : zzck.isUserUnlocked(context)) {
            synchronized (zzdd.class) {
                Map<String, zzdd> map = zzaai;
                zzddVar = map.get(str);
                if (zzddVar == null) {
                    if (str.startsWith("direct_boot:")) {
                        if (zzck.zzji()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    zzddVar = new zzdd(sharedPreferences);
                    map.put(str, zzddVar);
                }
            }
            return zzddVar;
        }
        return null;
    }

    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zzzk) {
            this.zzzl = null;
            zzcw.zzjp();
        }
        synchronized (this) {
            for (zzco zzcoVar : this.zzzm) {
                zzcoVar.zzjo();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final Object zzca(String str) {
        Map<String, ?> map = this.zzzl;
        if (map == null) {
            synchronized (this.zzzk) {
                map = this.zzzl;
                if (map == null) {
                    map = this.zzaaj.getAll();
                    this.zzzl = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
