package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface StateListener {
    boolean onException(Exception exc);

    boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry);
}
