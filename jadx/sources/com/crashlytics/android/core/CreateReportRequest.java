package com.crashlytics.android.core;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CreateReportRequest {
    public final String apiKey;
    public final Report report;

    public CreateReportRequest(String str, Report report) {
        this.apiKey = str;
        this.report = report;
    }
}
