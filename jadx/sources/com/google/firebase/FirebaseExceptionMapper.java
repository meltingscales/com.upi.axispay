package com.google.firebase;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

/* compiled from: AxisPay */
@KeepForSdk
/* loaded from: classes.dex */
public class FirebaseExceptionMapper implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    public final Exception getException(Status status) {
        if (status.getStatusCode() == 8) {
            return new FirebaseException(status.zza());
        }
        return new FirebaseApiNotAvailableException(status.zza());
    }
}
