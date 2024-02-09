package com.crashlytics.android.answers;

import com.crashlytics.android.answers.PredefinedEvent;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class PredefinedEvent<T extends PredefinedEvent> extends AnswersEvent<T> {
    public final AnswersAttributes predefinedAttributes = new AnswersAttributes(this.validator);

    public Map<String, Object> getPredefinedAttributes() {
        return this.predefinedAttributes.attributes;
    }

    public abstract String getPredefinedType();

    public String toString() {
        return C0059ao.a(830) + getPredefinedType() + '\"' + C0059ao.a(831) + this.predefinedAttributes + C0059ao.a(832) + this.customAttributes + C0059ao.a(833);
    }
}
