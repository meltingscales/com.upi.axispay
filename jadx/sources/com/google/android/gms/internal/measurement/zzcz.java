package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcz extends zzcw<Boolean> {
    public zzcz(zzdc zzdcVar, String str, Boolean bool) {
        super(zzdcVar, str, bool, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcw
    public final /* synthetic */ Boolean zzc(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzci.zzyv.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzci.zzyw.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String zzjq = super.zzjq();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(zzjq).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(zzjq);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
