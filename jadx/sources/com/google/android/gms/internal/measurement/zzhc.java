package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzhc<FieldDescriptorType> extends zzhb<FieldDescriptorType, Object> {
    public zzhc(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhb
    public final void zzjz() {
        if (!isImmutable()) {
            for (int i = 0; i < zzoi(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzbf = zzbf(i);
                if (((zzes) zzbf.getKey()).zzmc()) {
                    zzbf.setValue(Collections.unmodifiableList((List) zzbf.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzoj()) {
                if (((zzes) entry.getKey()).zzmc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzjz();
    }
}
