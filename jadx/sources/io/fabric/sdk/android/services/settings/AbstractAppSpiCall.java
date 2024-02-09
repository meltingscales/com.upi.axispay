package io.fabric.sdk.android.services.settings;

import android.content.res.Resources;
import com.google.android.gms.vision.barcode.Barcode;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.KitInfo;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.InputStream;
import java.util.Collection;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class AbstractAppSpiCall extends AbstractSpiCall implements AppSpiCall {
    public static final String APP_BUILD_VERSION_PARAM = null;
    public static final String APP_BUILT_SDK_VERSION_PARAM = null;
    public static final String APP_DISPLAY_VERSION_PARAM = null;
    public static final String APP_ICON_DATA_PARAM = null;
    public static final String APP_ICON_HASH_PARAM = null;
    public static final String APP_ICON_HEIGHT_PARAM = null;
    public static final String APP_ICON_PRERENDERED_PARAM = null;
    public static final String APP_ICON_WIDTH_PARAM = null;
    public static final String APP_IDENTIFIER_PARAM = null;
    public static final String APP_INSTANCE_IDENTIFIER_PARAM = null;
    public static final String APP_MIN_SDK_VERSION_PARAM = null;
    public static final String APP_NAME_PARAM = null;
    public static final String APP_SDK_MODULES_PARAM_BUILD_TYPE = null;
    public static final String APP_SDK_MODULES_PARAM_PREFIX = null;
    public static final String APP_SDK_MODULES_PARAM_VERSION = null;
    public static final String APP_SOURCE_PARAM = null;
    public static final String ICON_CONTENT_TYPE = null;
    public static final String ICON_FILE_NAME = null;

    static {
        C0059ao.a(AbstractAppSpiCall.class, 115);
    }

    public AbstractAppSpiCall(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod) {
        super(kit, str, str2, httpRequestFactory, httpMethod);
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, AppRequestData appRequestData) {
        return httpRequest.header(C0059ao.a(2035), appRequestData.apiKey).header(C0059ao.a(2036), C0059ao.a(2037)).header(C0059ao.a(2038), this.kit.getVersion());
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, AppRequestData appRequestData) {
        String a = C0059ao.a(2039);
        HttpRequest part = httpRequest.part(C0059ao.a(2040), appRequestData.appId).part(C0059ao.a(2041), appRequestData.name).part(C0059ao.a(2042), appRequestData.displayVersion).part(C0059ao.a(2043), appRequestData.buildVersion).part(C0059ao.a(2044), Integer.valueOf(appRequestData.source)).part(C0059ao.a(2045), appRequestData.minSdkVersion).part(C0059ao.a(2046), appRequestData.builtSdkVersion);
        if (!CommonUtils.isNullOrEmpty(appRequestData.instanceIdentifier)) {
            part.part(C0059ao.a(2047), appRequestData.instanceIdentifier);
        }
        if (appRequestData.icon != null) {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.kit.getContext().getResources().openRawResource(appRequestData.icon.iconResourceId);
                    part.part(C0059ao.a(Barcode.PDF417), appRequestData.icon.hash).part(C0059ao.a(2049), C0059ao.a(2050), C0059ao.a(2051), inputStream).part(C0059ao.a(2052), Integer.valueOf(appRequestData.icon.width)).part(C0059ao.a(2053), Integer.valueOf(appRequestData.icon.height));
                } catch (Resources.NotFoundException e) {
                    Logger logger = Fabric.getLogger();
                    String a2 = C0059ao.a(2054);
                    logger.e(a2, C0059ao.a(2055) + appRequestData.icon.iconResourceId, e);
                }
            } finally {
                CommonUtils.closeOrLog(inputStream, a);
            }
        }
        Collection<KitInfo> collection = appRequestData.sdkKits;
        if (collection != null) {
            for (KitInfo kitInfo : collection) {
                part.part(getKitVersionKey(kitInfo), kitInfo.getVersion());
                part.part(getKitBuildTypeKey(kitInfo), kitInfo.getBuildType());
            }
        }
        return part;
    }

    public String getKitBuildTypeKey(KitInfo kitInfo) {
        return String.format(Locale.US, C0059ao.a(2056), kitInfo.getIdentifier());
    }

    public String getKitVersionKey(KitInfo kitInfo) {
        return String.format(Locale.US, C0059ao.a(2057), kitInfo.getIdentifier());
    }

    @Override // io.fabric.sdk.android.services.settings.AppSpiCall
    public boolean invoke(AppRequestData appRequestData) {
        HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), appRequestData), appRequestData);
        String a = C0059ao.a(2059);
        Fabric.getLogger().d(a, C0059ao.a(2058) + getUrl());
        if (appRequestData.icon != null) {
            Fabric.getLogger().d(a, C0059ao.a(2060) + appRequestData.icon.hash);
            Fabric.getLogger().d(a, C0059ao.a(2061) + appRequestData.icon.width + C0059ao.a(2062) + appRequestData.icon.height);
        }
        int code = applyMultipartDataTo.code();
        String a2 = C0059ao.a(2063).equals(applyMultipartDataTo.method()) ? C0059ao.a(2064) : C0059ao.a(2065);
        Fabric.getLogger().d(a, a2 + C0059ao.a(2066) + applyMultipartDataTo.header(C0059ao.a(2067)));
        Fabric.getLogger().d(a, C0059ao.a(2068) + code);
        return ResponseParser.parse(code) == 0;
    }
}
