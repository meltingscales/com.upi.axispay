package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Response<T extends Result> {
    private T zza;

    public Response() {
    }

    public Response(T t) {
        this.zza = t;
    }

    public T getResult() {
        return this.zza;
    }

    public void setResult(T t) {
        this.zza = t;
    }
}
