package com.google.firebase.analytics.connector;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final /* synthetic */ class zzb implements EventHandler {
    public static final EventHandler zzaax = new zzb();

    private zzb() {
    }

    @Override // com.google.firebase.events.EventHandler
    public final void handle(Event event) {
        AnalyticsConnectorImpl.zza(event);
    }
}
