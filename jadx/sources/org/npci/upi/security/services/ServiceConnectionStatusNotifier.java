package org.npci.upi.security.services;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public interface ServiceConnectionStatusNotifier {
    void serviceConnected(CLServices cLServices);

    void serviceDisconnected();
}
