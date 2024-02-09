package com.olive.upi.transport;

import com.olive.upi.transport.api.Result;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface OliveUpiEventListener {
    void onCommonLibResponse(int i, Object obj);

    void onFailureResponse(OliveRequest oliveRequest, Result result);

    void onSuccessResponse(OliveRequest oliveRequest, Result result);
}
