package com.crashlytics.android.answers;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LevelEndEvent extends PredefinedEvent<LevelEndEvent> {
    public static final String LEVEL_NAME_ATTRIBUTE = null;
    public static final String SCORE_ATTRIBUTE = null;
    public static final String SUCCESS_ATTRIBUTE = null;
    public static final String TYPE = null;

    static {
        C0059ao.a(LevelEndEvent.class, 368);
    }

    @Override // com.crashlytics.android.answers.PredefinedEvent
    public String getPredefinedType() {
        return C0059ao.a(8651);
    }

    public LevelEndEvent putLevelName(String str) {
        this.predefinedAttributes.put(C0059ao.a(8652), str);
        return this;
    }

    public LevelEndEvent putScore(Number number) {
        this.predefinedAttributes.put(C0059ao.a(8653), number);
        return this;
    }

    public LevelEndEvent putSuccess(boolean z) {
        this.predefinedAttributes.put(C0059ao.a(8656), z ? C0059ao.a(8654) : C0059ao.a(8655));
        return this;
    }
}
