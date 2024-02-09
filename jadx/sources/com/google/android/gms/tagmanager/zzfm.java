package com.google.android.gms.tagmanager;

import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfm implements zzav {
    public final /* synthetic */ TagManager zza;

    public zzfm(TagManager tagManager) {
        this.zza = tagManager;
    }

    @Override // com.google.android.gms.tagmanager.zzav
    public final void zza(Map<String, Object> map) {
        Object obj = map.get(DataLayer.EVENT_KEY);
        if (obj != null) {
            TagManager.zzb(this.zza, obj.toString());
        }
    }
}
