package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.vision.barcode.Barcode;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ApiKey {
    public static final String CRASHLYTICS_API_KEY = null;
    public static final String FABRIC_API_KEY = null;
    public static final String STRING_TWITTER_CONSUMER_SECRET = null;

    static {
        C0059ao.a(ApiKey.class, 152);
    }

    @Deprecated
    public static String getApiKey(Context context) {
        Fabric.getLogger().w(C0059ao.a(6081), C0059ao.a(6082));
        return new ApiKey().getValue(context);
    }

    public String buildApiKeyInstructions() {
        return C0059ao.a(6085);
    }

    public String getApiKeyFromFirebaseAppId(Context context) {
        return new FirebaseInfo().getApiKeyFromFirebaseAppId(context);
    }

    public String getApiKeyFromManifest(Context context) {
        String a = C0059ao.a(6086);
        String str = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), Barcode.ITF).metaData;
            if (bundle != null) {
                String string = bundle.getString(C0059ao.a(6087));
                try {
                    if (C0059ao.a(6088).equals(string)) {
                        Fabric.getLogger().d(a, C0059ao.a(6089));
                    } else {
                        str = string;
                    }
                    if (str == null) {
                        Fabric.getLogger().d(a, C0059ao.a(6090));
                        return bundle.getString(C0059ao.a(6091));
                    }
                    return str;
                } catch (Exception e) {
                    e = e;
                    str = string;
                    Logger logger = Fabric.getLogger();
                    logger.d(a, C0059ao.a(6092) + e);
                    return str;
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public String getApiKeyFromStrings(Context context) {
        String a = C0059ao.a(6093);
        String a2 = C0059ao.a(6094);
        int resourcesIdentifier = CommonUtils.getResourcesIdentifier(context, a, a2);
        if (resourcesIdentifier == 0) {
            Fabric.getLogger().d(C0059ao.a(6095), C0059ao.a(6096));
            resourcesIdentifier = CommonUtils.getResourcesIdentifier(context, C0059ao.a(6097), a2);
        }
        if (resourcesIdentifier != 0) {
            return context.getResources().getString(resourcesIdentifier);
        }
        return null;
    }

    public String getValue(Context context) {
        String apiKeyFromManifest = getApiKeyFromManifest(context);
        if (TextUtils.isEmpty(apiKeyFromManifest)) {
            apiKeyFromManifest = getApiKeyFromStrings(context);
        }
        if (TextUtils.isEmpty(apiKeyFromManifest)) {
            apiKeyFromManifest = getApiKeyFromFirebaseAppId(context);
        }
        if (TextUtils.isEmpty(apiKeyFromManifest)) {
            logErrorOrThrowException(context);
        }
        return apiKeyFromManifest;
    }

    public void logErrorOrThrowException(Context context) {
        if (!Fabric.isDebuggable() && !CommonUtils.isAppDebuggable(context)) {
            Fabric.getLogger().e(C0059ao.a(6098), buildApiKeyInstructions());
            return;
        }
        throw new IllegalArgumentException(buildApiKeyInstructions());
    }

    @Deprecated
    public static String getApiKey(Context context, boolean z) {
        Fabric.getLogger().w(C0059ao.a(6083), C0059ao.a(6084));
        return new ApiKey().getValue(context);
    }
}
