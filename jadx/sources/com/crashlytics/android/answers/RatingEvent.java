package com.crashlytics.android.answers;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RatingEvent extends PredefinedEvent<RatingEvent> {
    public static final String CONTENT_ID_ATTRIBUTE = null;
    public static final String CONTENT_NAME_ATTRIBUTE = null;
    public static final String CONTENT_TYPE_ATTRIBUTE = null;
    public static final String RATING_ATTRIBUTE = null;
    public static final String TYPE = null;

    static {
        C0059ao.a(RatingEvent.class, 268);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(15281);
    }

    public RatingEvent putContentId(String str) {
        this.predefinedAttributes.put(C0059ao.a(15282), str);
        return this;
    }

    public RatingEvent putContentName(String str) {
        this.predefinedAttributes.put(C0059ao.a(15283), str);
        return this;
    }

    public RatingEvent putContentType(String str) {
        this.predefinedAttributes.put(C0059ao.a(15284), str);
        return this;
    }

    public RatingEvent putRating(int i) {
        this.predefinedAttributes.put(C0059ao.a(15285), Integer.valueOf(i));
        return this;
    }
}
