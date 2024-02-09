package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class HeartBeatConsumerComponent {
    private HeartBeatConsumerComponent() {
    }

    public static Component<?> create() {
        return Component.intoSet(new HeartBeatConsumer() { // from class: com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent.1
        }, HeartBeatConsumer.class);
    }
}
