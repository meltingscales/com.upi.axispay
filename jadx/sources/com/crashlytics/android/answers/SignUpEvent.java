package com.crashlytics.android.answers;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SignUpEvent extends PredefinedEvent<SignUpEvent> {
    public static final String METHOD_ATTRIBUTE = null;
    public static final String SUCCESS_ATTRIBUTE = null;
    public static final String TYPE = null;

    static {
        C0059ao.a(SignUpEvent.class, 219);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(15665);
    }

    public SignUpEvent putMethod(String str) {
        this.predefinedAttributes.put(C0059ao.a(15666), str);
        return this;
    }

    public SignUpEvent putSuccess(boolean z) {
        this.predefinedAttributes.put(C0059ao.a(15667), Boolean.toString(z));
        return this;
    }
}
