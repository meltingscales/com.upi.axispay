package com.crashlytics.android.answers;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ShareEvent extends PredefinedEvent<ShareEvent> {
    public static final String CONTENT_ID_ATTRIBUTE = null;
    public static final String CONTENT_NAME_ATTRIBUTE = null;
    public static final String CONTENT_TYPE_ATTRIBUTE = null;
    public static final String METHOD_ATTRIBUTE = null;
    public static final String TYPE = null;

    static {
        C0059ao.a(ShareEvent.class, 314);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(9797);
    }

    public ShareEvent putContentId(String str) {
        this.predefinedAttributes.put(C0059ao.a(9798), str);
        return this;
    }

    public ShareEvent putContentName(String str) {
        this.predefinedAttributes.put(C0059ao.a(9799), str);
        return this;
    }

    public ShareEvent putContentType(String str) {
        this.predefinedAttributes.put(C0059ao.a(9800), str);
        return this;
    }

    public ShareEvent putMethod(String str) {
        this.predefinedAttributes.put(C0059ao.a(9801), str);
        return this;
    }
}
