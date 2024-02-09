package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzda extends zzcw<Double> {
    public zzda(zzdc zzdcVar, String str, Double d) {
        super(zzdcVar, str, d, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzcw
    /* renamed from: zzf */
    public final Double zzc(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String zzjq = super.zzjq();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(zzjq).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(zzjq);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
