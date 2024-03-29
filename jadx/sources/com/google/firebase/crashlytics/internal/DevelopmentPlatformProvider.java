package com.google.firebase.crashlytics.internal;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DevelopmentPlatformProvider {
    private static final String FLUTTER_ASSETS_PATH = "flutter_assets";
    private static final String FLUTTER_PLATFORM = "Flutter";
    private static final String UNITY_PLATFORM = "Unity";
    private static final String UNITY_VERSION_FIELD = "com.google.firebase.crashlytics.unity_version";
    private final Context context;
    private DevelopmentPlatform developmentPlatform = null;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class DevelopmentPlatform {
        private final String developmentPlatform;
        private final String developmentPlatformVersion;

        private DevelopmentPlatform() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.this.context, DevelopmentPlatformProvider.UNITY_VERSION_FIELD, "string");
            if (resourcesIdentifier == 0) {
                if (DevelopmentPlatformProvider.this.assetPathExists(DevelopmentPlatformProvider.FLUTTER_ASSETS_PATH)) {
                    this.developmentPlatform = DevelopmentPlatformProvider.FLUTTER_PLATFORM;
                    this.developmentPlatformVersion = null;
                    Logger.getLogger().v("Development platform is: Flutter");
                    return;
                }
                this.developmentPlatform = null;
                this.developmentPlatformVersion = null;
                return;
            }
            this.developmentPlatform = DevelopmentPlatformProvider.UNITY_PLATFORM;
            String string = DevelopmentPlatformProvider.this.context.getResources().getString(resourcesIdentifier);
            this.developmentPlatformVersion = string;
            Logger logger = Logger.getLogger();
            logger.v("Unity Editor version is: " + string);
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean assetPathExists(String str) {
        String[] list;
        try {
            if (this.context.getAssets() == null || (list = this.context.getAssets().list(str)) == null) {
                return false;
            }
            return list.length > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    private DevelopmentPlatform initDevelopmentPlatform() {
        if (this.developmentPlatform == null) {
            this.developmentPlatform = new DevelopmentPlatform();
        }
        return this.developmentPlatform;
    }

    public static boolean isUnity(Context context) {
        return CommonUtils.getResourcesIdentifier(context, UNITY_VERSION_FIELD, "string") != 0;
    }

    public String getDevelopmentPlatform() {
        return initDevelopmentPlatform().developmentPlatform;
    }

    public String getDevelopmentPlatformVersion() {
        return initDevelopmentPlatform().developmentPlatformVersion;
    }
}
