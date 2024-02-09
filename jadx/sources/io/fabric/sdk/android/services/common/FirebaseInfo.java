package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FirebaseInfo {
    public static final String FIREBASE_FEATURE_SWITCH = null;
    public static final String GOOGLE_APP_ID = null;

    static {
        C0059ao.a(FirebaseInfo.class, 387);
    }

    public String createApiKeyFromFirebaseAppId(String str) {
        return CommonUtils.sha256(str).substring(0, 40);
    }

    public String getApiKeyFromFirebaseAppId(Context context) {
        int resourcesIdentifier = CommonUtils.getResourcesIdentifier(context, C0059ao.a(1956), C0059ao.a(1957));
        if (resourcesIdentifier != 0) {
            Fabric.getLogger().d(C0059ao.a(1958), C0059ao.a(1959));
            return createApiKeyFromFirebaseAppId(context.getResources().getString(resourcesIdentifier));
        }
        return null;
    }

    public boolean isFirebaseCrashlyticsEnabled(Context context) {
        if (CommonUtils.getBooleanResourceValue(context, C0059ao.a(1960), false)) {
            return true;
        }
        return (CommonUtils.getResourcesIdentifier(context, C0059ao.a(1961), C0059ao.a(1962)) != 0) && !(!TextUtils.isEmpty(new ApiKey().getApiKeyFromManifest(context)) || !TextUtils.isEmpty(new ApiKey().getApiKeyFromStrings(context)));
    }
}
