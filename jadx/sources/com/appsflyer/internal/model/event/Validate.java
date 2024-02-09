package com.appsflyer.internal.model.event;

import android.content.Context;
import com.appsflyer.AFEvent;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Validate extends Purchase {
    public Validate(Context context) {
        super(C0059ao.a(14113), Boolean.TRUE, context);
    }

    @Override // com.appsflyer.AFEvent
    public AFEvent urlString(String str) {
        return super.urlString(addChannel(str));
    }
}
