package com.crashlytics.android.core;

import java.io.File;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface Report {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum Type {
        JAVA,
        NATIVE
    }

    Map<String, String> getCustomHeaders();

    File getFile();

    String getFileName();

    File[] getFiles();

    String getIdentifier();

    Type getType();

    void remove();
}
