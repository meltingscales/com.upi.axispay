package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class NativeCreateReportSpiCall extends AbstractSpiCall implements CreateReportSpiCall {
    private static final String APP_META_FILE_MULTIPART_PARAM = null;
    private static final String BINARY_IMAGES_FILE_MULTIPART_PARAM = null;
    private static final String DEVICE_META_FILE_MULTIPART_PARAM = null;
    private static final String GZIP_FILE_CONTENT_TYPE = null;
    private static final String KEYS_FILE_MULTIPART_PARAM = null;
    private static final String LOGS_FILE_MULTIPART_PARAM = null;
    private static final String METADATA_FILE_MULTIPART_PARAM = null;
    private static final String MINIDUMP_FILE_MULTIPART_PARAM = null;
    private static final String OS_META_FILE_MULTIPART_PARAM = null;
    private static final String REPORT_IDENTIFIER_PARAM = null;
    private static final String SESSION_META_FILE_MULTIPART_PARAM = null;
    private static final String USER_META_FILE_MULTIPART_PARAM = null;

    static {
        C0059ao.a(NativeCreateReportSpiCall.class, 170);
    }

    public NativeCreateReportSpiCall(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory) {
        super(kit, str, str2, httpRequestFactory, HttpMethod.POST);
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, String str) {
        httpRequest.header(C0059ao.a(5776), C0059ao.a(5775) + this.kit.getVersion()).header(C0059ao.a(5777), C0059ao.a(5778)).header(C0059ao.a(5779), this.kit.getVersion()).header(C0059ao.a(5780), str);
        return httpRequest;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, Report report) {
        File[] files;
        httpRequest.part(C0059ao.a(5781), report.getIdentifier());
        for (File file : report.getFiles()) {
            boolean equals = file.getName().equals(C0059ao.a(5782));
            String a = C0059ao.a(5783);
            if (equals) {
                httpRequest.part(C0059ao.a(5784), file.getName(), a, file);
            } else if (file.getName().equals(C0059ao.a(5785))) {
                httpRequest.part(C0059ao.a(5786), file.getName(), a, file);
            } else if (file.getName().equals(C0059ao.a(5787))) {
                httpRequest.part(C0059ao.a(5788), file.getName(), a, file);
            } else if (file.getName().equals(C0059ao.a(5789))) {
                httpRequest.part(C0059ao.a(5790), file.getName(), a, file);
            } else if (file.getName().equals(C0059ao.a(5791))) {
                httpRequest.part(C0059ao.a(5792), file.getName(), a, file);
            } else if (file.getName().equals(C0059ao.a(5793))) {
                httpRequest.part(C0059ao.a(5794), file.getName(), a, file);
            } else if (file.getName().equals(C0059ao.a(5795))) {
                httpRequest.part(C0059ao.a(5796), file.getName(), a, file);
            } else if (file.getName().equals(C0059ao.a(5797))) {
                httpRequest.part(C0059ao.a(5798), file.getName(), a, file);
            } else if (file.getName().equals(C0059ao.a(5799))) {
                httpRequest.part(C0059ao.a(5800), file.getName(), a, file);
            } else if (file.getName().equals(C0059ao.a(5801))) {
                httpRequest.part(C0059ao.a(5802), file.getName(), a, file);
            }
        }
        return httpRequest;
    }

    @Override // com.crashlytics.android.core.CreateReportSpiCall
    public boolean invoke(CreateReportRequest createReportRequest) {
        HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest.apiKey), createReportRequest.report);
        String a = C0059ao.a(5804);
        Fabric.getLogger().d(a, C0059ao.a(5803) + getUrl());
        int code = applyMultipartDataTo.code();
        Fabric.getLogger().d(a, C0059ao.a(5805) + code);
        return ResponseParser.parse(code) == 0;
    }
}
