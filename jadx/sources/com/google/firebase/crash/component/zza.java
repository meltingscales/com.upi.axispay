package com.google.firebase.crash.component;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crash.FirebaseCrash;
import com.google.firebase.events.Subscriber;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final /* synthetic */ class zza implements ComponentFactory {
    public static final ComponentFactory zzaj = new zza();

    private zza() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new FirebaseCrash((FirebaseApp) componentContainer.get(FirebaseApp.class), (Subscriber) componentContainer.get(Subscriber.class));
    }
}
