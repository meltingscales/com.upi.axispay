package com.crashlytics.android.answers;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LoginEvent extends PredefinedEvent<LoginEvent> {
    public static final String METHOD_ATTRIBUTE = null;
    public static final String SUCCESS_ATTRIBUTE = null;
    public static final String TYPE = null;

    static {
        C0059ao.a(LoginEvent.class, 75);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(15318);
    }

    public LoginEvent putMethod(String str) {
        this.predefinedAttributes.put(C0059ao.a(15319), str);
        return this;
    }

    public LoginEvent putSuccess(boolean z) {
        this.predefinedAttributes.put(C0059ao.a(15320), Boolean.toString(z));
        return this;
    }
}
