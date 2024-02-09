package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiKey;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface HasApiKey<O extends Api.ApiOptions> {
    @KeepForSdk
    ApiKey<O> getApiKey();
}
