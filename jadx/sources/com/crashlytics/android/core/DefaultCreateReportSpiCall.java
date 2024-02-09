package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DefaultCreateReportSpiCall extends AbstractSpiCall implements CreateReportSpiCall {
    public static final String FILE_CONTENT_TYPE = null;
    public static final String FILE_PARAM = null;
    public static final String IDENTIFIER_PARAM = null;
    public static final String MULTI_FILE_PARAM = null;

    static {
        C0059ao.a(DefaultCreateReportSpiCall.class, 139);
    }

    public DefaultCreateReportSpiCall(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory) {
        super(kit, str, str2, httpRequestFactory, HttpMethod.POST);
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, CreateReportRequest createReportRequest) {
        HttpRequest header = httpRequest.header(C0059ao.a(5843), createReportRequest.apiKey).header(C0059ao.a(5844), C0059ao.a(5845)).header(C0059ao.a(5846), this.kit.getVersion());
        for (Map.Entry<String, String> entry : createReportRequest.report.getCustomHeaders().entrySet()) {
            header = header.header(entry);
        }
        return header;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, Report report) {
        File[] files;
        httpRequest.part(C0059ao.a(5847), report.getIdentifier());
        int length = report.getFiles().length;
        String a = C0059ao.a(5848);
        String a2 = C0059ao.a(5849);
        String a3 = C0059ao.a(5850);
        if (length == 1) {
            Fabric.getLogger().d(a3, C0059ao.a(5851) + report.getFileName() + a2 + report.getIdentifier());
            return httpRequest.part(C0059ao.a(5852), report.getFileName(), a, report.getFile());
        }
        int i = 0;
        for (File file : report.getFiles()) {
            Fabric.getLogger().d(a3, C0059ao.a(5853) + file.getName() + a2 + report.getIdentifier());
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(5854));
            sb.append(i);
            sb.append(C0059ao.a(5855));
            httpRequest.part(sb.toString(), file.getName(), a, file);
            i++;
        }
        return httpRequest;
    }

    @Override // com.crashlytics.android.core.CreateReportSpiCall
    public boolean invoke(CreateReportRequest createReportRequest) {
        HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest), createReportRequest.report);
        String a = C0059ao.a(5857);
        Fabric.getLogger().d(a, C0059ao.a(5856) + getUrl());
        int code = applyMultipartDataTo.code();
        Fabric.getLogger().d(a, C0059ao.a(5858) + applyMultipartDataTo.header(C0059ao.a(5859)));
        Fabric.getLogger().d(a, C0059ao.a(5860) + code);
        return ResponseParser.parse(code) == 0;
    }

    public DefaultCreateReportSpiCall(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod) {
        super(kit, str, str2, httpRequestFactory, httpMethod);
    }
}
