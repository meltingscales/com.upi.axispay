package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.cache.MemoryValueCache;
import io.fabric.sdk.android.services.cache.ValueLoader;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class InstallerPackageNameProvider {
    private static final String NO_INSTALLER_PACKAGE_NAME = null;
    private final ValueLoader<String> installerPackageNameLoader = new ValueLoader<String>() { // from class: io.fabric.sdk.android.services.common.InstallerPackageNameProvider.1
        @Override // io.fabric.sdk.android.services.cache.ValueLoader
        public String load(Context context) throws Exception {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? C0059ao.a(11058) : installerPackageName;
        }
    };
    private final MemoryValueCache<String> installerPackageNameCache = new MemoryValueCache<>();

    static {
        C0059ao.a(InstallerPackageNameProvider.class, 303);
    }

    public String getInstallerPackageName(Context context) {
        try {
            String str = this.installerPackageNameCache.get(context, this.installerPackageNameLoader);
            if (C0059ao.a(12538).equals(str)) {
                return null;
            }
            return str;
        } catch (Exception e) {
            Fabric.getLogger().e(C0059ao.a(12539), C0059ao.a(12540), e);
            return null;
        }
    }
}
