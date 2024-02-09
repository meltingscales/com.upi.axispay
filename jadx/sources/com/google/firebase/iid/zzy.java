package com.google.firebase.iid;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzy implements InstanceIdResult {
    private final String zzbw;
    private final String zzbx;

    public zzy(String str, String str2) {
        this.zzbw = str;
        this.zzbx = str2;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public final String getId() {
        return this.zzbw;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public final String getToken() {
        return this.zzbx;
    }
}
