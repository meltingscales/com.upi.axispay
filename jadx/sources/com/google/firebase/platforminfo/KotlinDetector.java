package com.google.firebase.platforminfo;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return ai0.f.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
