package com.crashlytics.android.answers;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class InviteEvent extends PredefinedEvent<InviteEvent> {
    public static final String METHOD_ATTRIBUTE = null;
    public static final String TYPE = null;

    static {
        C0059ao.a(InviteEvent.class, 299);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(10817);
    }

    public InviteEvent putMethod(String str) {
        this.predefinedAttributes.put(C0059ao.a(10818), str);
        return this;
    }
}
