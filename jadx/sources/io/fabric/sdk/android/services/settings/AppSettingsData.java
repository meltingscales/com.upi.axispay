package io.fabric.sdk.android.services.settings;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AppSettingsData {
    public static final String STATUS_ACTIVATED = null;
    public static final String STATUS_CONFIGURED = null;
    public static final String STATUS_NEW = null;
    public final AppIconSettingsData icon;
    public final String identifier;
    public final String ndkReportsUrl;
    public final String reportsUrl;
    public final String status;
    public final boolean updateRequired;
    public final String url;

    static {
        C0059ao.a(AppSettingsData.class, 330);
    }

    public AppSettingsData(String str, String str2, String str3, String str4, String str5, boolean z, AppIconSettingsData appIconSettingsData) {
        this.identifier = str;
        this.status = str2;
        this.url = str3;
        this.reportsUrl = str4;
        this.ndkReportsUrl = str5;
        this.updateRequired = z;
        this.icon = appIconSettingsData;
    }
}
