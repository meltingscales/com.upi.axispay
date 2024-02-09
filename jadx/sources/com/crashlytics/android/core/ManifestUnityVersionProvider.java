package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.vision.barcode.Barcode;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ManifestUnityVersionProvider implements UnityVersionProvider {
    public static final String FABRIC_UNITY_CRASHLYTICS_VERSION_KEY = null;
    private final Context context;
    private final String packageName;

    static {
        C0059ao.a(ManifestUnityVersionProvider.class, 100);
    }

    public ManifestUnityVersionProvider(Context context, String str) {
        this.context = context;
        this.packageName = str;
    }

    @Override // com.crashlytics.android.core.UnityVersionProvider
    public String getUnityVersion() {
        try {
            Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.packageName, Barcode.ITF).metaData;
            if (bundle != null) {
                return bundle.getString(C0059ao.a(7722));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
