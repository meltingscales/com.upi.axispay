package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class GetIdListener implements StateListener {
    public final TaskCompletionSource<String> taskCompletionSource;

    public GetIdListener(TaskCompletionSource<String> taskCompletionSource) {
        this.taskCompletionSource = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.isUnregistered() || persistedInstallationEntry.isRegistered() || persistedInstallationEntry.isErrored()) {
            this.taskCompletionSource.trySetResult(persistedInstallationEntry.getFirebaseInstallationId());
            return true;
        }
        return false;
    }
}
