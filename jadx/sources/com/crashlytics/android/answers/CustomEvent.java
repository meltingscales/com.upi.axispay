package com.crashlytics.android.answers;

import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CustomEvent extends AnswersEvent<CustomEvent> {
    private final String eventName;

    public CustomEvent(String str) {
        Objects.requireNonNull(str, C0059ao.a(3939));
        this.eventName = this.validator.limitStringLength(str);
    }

    public String getCustomType() {
        return this.eventName;
    }

    public String toString() {
        return C0059ao.a(3940) + this.eventName + '\"' + C0059ao.a(3941) + this.customAttributes + C0059ao.a(3942);
    }
}
