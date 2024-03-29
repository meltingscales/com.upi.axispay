package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcy extends zzcw<Integer> {
    public zzcy(zzdc zzdcVar, String str, Integer num) {
        super(zzdcVar, str, num, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzcw
    /* renamed from: zze */
    public final Integer zzc(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String zzjq = super.zzjq();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(zzjq).length() + 24 + String.valueOf(valueOf).length());
        sb.append("Invalid int value for ");
        sb.append(zzjq);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
