package com.crashlytics.android.answers;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ContentViewEvent extends PredefinedEvent<ContentViewEvent> {
    public static final String CONTENT_ID_ATTRIBUTE = null;
    public static final String CONTENT_NAME_ATTRIBUTE = null;
    public static final String CONTENT_TYPE_ATTRIBUTE = null;
    public static final String TYPE = null;

    static {
        C0059ao.a(ContentViewEvent.class, 230);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(6380);
    }

    public ContentViewEvent putContentId(String str) {
        this.predefinedAttributes.put(C0059ao.a(6381), str);
        return this;
    }

    public ContentViewEvent putContentName(String str) {
        this.predefinedAttributes.put(C0059ao.a(6382), str);
        return this;
    }

    public ContentViewEvent putContentType(String str) {
        this.predefinedAttributes.put(C0059ao.a(6383), str);
        return this;
    }
}
