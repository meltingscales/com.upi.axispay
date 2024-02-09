package com.google.firebase.iid;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.iid.Registrar;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final /* synthetic */ class zzap implements ComponentFactory {
    public static final ComponentFactory zzct = new zzap();

    private zzap() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new Registrar.zza((FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class));
    }
}
