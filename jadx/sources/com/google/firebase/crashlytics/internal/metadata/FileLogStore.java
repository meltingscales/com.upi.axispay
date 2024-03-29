package com.google.firebase.crashlytics.internal.metadata;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    byte[] getLogAsBytes();

    String getLogAsString();

    void writeToLog(long j, String str);
}
