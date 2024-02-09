package com.crashlytics.android.answers;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class SessionEventMetadata {
    public final String advertisingId;
    public final String androidId;
    public final String appBundleId;
    public final String appVersionCode;
    public final String appVersionName;
    public final String betaDeviceToken;
    public final String buildId;
    public final String deviceModel;
    public final String executionId;
    public final String installationId;
    public final Boolean limitAdTrackingEnabled;
    public final String osVersion;
    private String stringRepresentation;

    public SessionEventMetadata(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.appBundleId = str;
        this.executionId = str2;
        this.installationId = str3;
        this.androidId = str4;
        this.advertisingId = str5;
        this.limitAdTrackingEnabled = bool;
        this.betaDeviceToken = str6;
        this.buildId = str7;
        this.osVersion = str8;
        this.deviceModel = str9;
        this.appVersionCode = str10;
        this.appVersionName = str11;
    }

    public String toString() {
        if (this.stringRepresentation == null) {
            this.stringRepresentation = C0059ao.a(14100) + this.appBundleId + C0059ao.a(14101) + this.executionId + C0059ao.a(14102) + this.installationId + C0059ao.a(14103) + this.androidId + C0059ao.a(14104) + this.advertisingId + C0059ao.a(14105) + this.limitAdTrackingEnabled + C0059ao.a(14106) + this.betaDeviceToken + C0059ao.a(14107) + this.buildId + C0059ao.a(14108) + this.osVersion + C0059ao.a(14109) + this.deviceModel + C0059ao.a(14110) + this.appVersionCode + C0059ao.a(14111) + this.appVersionName;
        }
        return this.stringRepresentation;
    }
}
