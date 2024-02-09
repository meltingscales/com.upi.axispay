package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SessionAnalyticsFilesSender extends AbstractSpiCall implements FilesSender {
    public static final String FILE_CONTENT_TYPE = null;
    public static final String FILE_PARAM_NAME = null;
    private final String apiKey;

    static {
        C0059ao.a(SessionAnalyticsFilesSender.class, 218);
    }

    public SessionAnalyticsFilesSender(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory, String str3) {
        super(kit, str, str2, httpRequestFactory, HttpMethod.POST);
        this.apiKey = str3;
    }

    @Override // io.fabric.sdk.android.services.events.FilesSender
    public boolean send(List<File> list) {
        HttpRequest header = getHttpRequest().header(C0059ao.a(5233), C0059ao.a(5234)).header(C0059ao.a(5235), this.kit.getVersion()).header(C0059ao.a(5236), this.apiKey);
        int i = 0;
        for (File file : list) {
            header.part(C0059ao.a(5237) + i, file.getName(), C0059ao.a(5238), file);
            i++;
        }
        String a = C0059ao.a(5241);
        Fabric.getLogger().d(a, C0059ao.a(5239) + list.size() + C0059ao.a(5240) + getUrl());
        int code = header.code();
        Fabric.getLogger().d(a, C0059ao.a(5242) + code);
        return ResponseParser.parse(code) == 0;
    }
}
