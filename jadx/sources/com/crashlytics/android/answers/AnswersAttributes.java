package com.crashlytics.android.answers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import myunmn.C0059ao;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AnswersAttributes {
    public final Map<String, Object> attributes = new ConcurrentHashMap();
    public final AnswersEventValidator validator;

    public AnswersAttributes(AnswersEventValidator answersEventValidator) {
        this.validator = answersEventValidator;
    }

    public void put(String str, String str2) {
        if (this.validator.isNull(str, C0059ao.a(12452)) || this.validator.isNull(str2, C0059ao.a(12453))) {
            return;
        }
        putAttribute(this.validator.limitStringLength(str), this.validator.limitStringLength(str2));
    }

    public void putAttribute(String str, Object obj) {
        if (this.validator.isFullMap(this.attributes, str)) {
            return;
        }
        this.attributes.put(str, obj);
    }

    public String toString() {
        return new JSONObject(this.attributes).toString();
    }

    public void put(String str, Number number) {
        if (this.validator.isNull(str, C0059ao.a(12450)) || this.validator.isNull(number, C0059ao.a(12451))) {
            return;
        }
        putAttribute(this.validator.limitStringLength(str), number);
    }
}
