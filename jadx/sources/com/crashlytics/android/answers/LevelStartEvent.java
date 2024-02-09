package com.crashlytics.android.answers;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LevelStartEvent extends PredefinedEvent<LevelStartEvent> {
    public static final String LEVEL_NAME_ATTRIBUTE = null;
    public static final String TYPE = null;

    static {
        C0059ao.a(LevelStartEvent.class, 332);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(5946);
    }

    public LevelStartEvent putLevelName(String str) {
        this.predefinedAttributes.put(C0059ao.a(5947), str);
        return this;
    }
}
