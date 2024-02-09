package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: AxisPay */
@KeepForSdk
/* loaded from: classes.dex */
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(T t, U u) throws RemoteException;
}
