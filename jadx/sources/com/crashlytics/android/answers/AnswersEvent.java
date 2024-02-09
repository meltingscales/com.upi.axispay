package com.crashlytics.android.answers;

import com.crashlytics.android.answers.AnswersEvent;
import io.fabric.sdk.android.Fabric;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class AnswersEvent<T extends AnswersEvent> {
    public static final int MAX_NUM_ATTRIBUTES = 0;
    public static final int MAX_STRING_LENGTH = 0;
    public final AnswersAttributes customAttributes;
    public final AnswersEventValidator validator;

    static {
        C0059ao.a(AnswersEvent.class, 187);
    }

    public AnswersEvent() {
        AnswersEventValidator answersEventValidator = new AnswersEventValidator(20, 100, Fabric.isDebuggable());
        this.validator = answersEventValidator;
        this.customAttributes = new AnswersAttributes(answersEventValidator);
    }

    public Map<String, Object> getCustomAttributes() {
        return this.customAttributes.attributes;
    }

    public T putCustomAttribute(String str, String str2) {
        this.customAttributes.put(str, str2);
        return this;
    }

    public T putCustomAttribute(String str, Number number) {
        this.customAttributes.put(str, number);
        return this;
    }
}
