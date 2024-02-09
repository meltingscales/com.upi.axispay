package com.appsflyer.internal.model.event;

import android.content.Context;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class Purchase extends BackgroundEvent {
    public Purchase() {
        this(null, null, null);
    }

    public Purchase(String str, Boolean bool, Context context) {
        super(str, Boolean.FALSE, null, bool, context);
    }
}
