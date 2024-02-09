package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zabo implements Runnable {
    public final /* synthetic */ zabp zaa;

    public zabo(zabp zabpVar) {
        this.zaa = zabpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client;
        Api.Client client2;
        zabq zabqVar = this.zaa.zaa;
        client = zabqVar.zac;
        client2 = zabqVar.zac;
        client.disconnect(String.valueOf(client2.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
