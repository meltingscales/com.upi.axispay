package com.google.android.gms.common.api.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zabn implements Runnable {
    public final /* synthetic */ int zaa;
    public final /* synthetic */ zabq zab;

    public zabn(zabq zabqVar, int i) {
        this.zab = zabqVar;
        this.zaa = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaH(this.zaa);
    }
}
