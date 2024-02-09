package com.crashlytics.android.answers;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SearchEvent extends PredefinedEvent<SearchEvent> {
    public static final String QUERY_ATTRIBUTE = null;
    public static final String TYPE = null;

    static {
        C0059ao.a(SearchEvent.class, 337);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(3760);
    }

    public SearchEvent putQuery(String str) {
        this.predefinedAttributes.put(C0059ao.a(3761), str);
        return this;
    }
}
