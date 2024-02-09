package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public interface ContainerHolder extends Result, Releasable {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface ContainerAvailableListener {
        void onContainerAvailable(ContainerHolder containerHolder, String str);
    }

    Container getContainer();

    void refresh();

    void setContainerAvailableListener(ContainerAvailableListener containerAvailableListener);
}
