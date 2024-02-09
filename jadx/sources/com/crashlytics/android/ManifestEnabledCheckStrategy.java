package com.crashlytics.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.crashlytics.android.CrashlyticsInitProvider;
import com.google.android.gms.vision.barcode.Barcode;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ManifestEnabledCheckStrategy implements CrashlyticsInitProvider.EnabledCheckStrategy {
    @Override // com.crashlytics.android.CrashlyticsInitProvider.EnabledCheckStrategy
    public boolean isCrashlyticsEnabled(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), Barcode.ITF).metaData;
            if (bundle != null) {
                return bundle.getBoolean(C0059ao.a(10565), true);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
