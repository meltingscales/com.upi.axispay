package com.crashlytics.android.core;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ProcMapEntry {
    public final long address;
    public final String path;
    public final String perms;
    public final long size;

    public ProcMapEntry(long j, long j2, String str, String str2) {
        this.address = j;
        this.size = j2;
        this.perms = str;
        this.path = str2;
    }
}
