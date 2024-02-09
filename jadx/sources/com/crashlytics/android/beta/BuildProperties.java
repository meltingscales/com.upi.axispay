package com.crashlytics.android.beta;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BuildProperties {
    private static final String BUILD_ID = null;
    private static final String PACKAGE_NAME = null;
    private static final String VERSION_CODE = null;
    private static final String VERSION_NAME = null;
    public final String buildId;
    public final String packageName;
    public final String versionCode;
    public final String versionName;

    static {
        C0059ao.a(BuildProperties.class, 90);
    }

    public BuildProperties(String str, String str2, String str3, String str4) {
        this.versionCode = str;
        this.versionName = str2;
        this.buildId = str3;
        this.packageName = str4;
    }

    public static BuildProperties fromProperties(Properties properties) {
        return new BuildProperties(properties.getProperty(C0059ao.a(4773)), properties.getProperty(C0059ao.a(4774)), properties.getProperty(C0059ao.a(4775)), properties.getProperty(C0059ao.a(4776)));
    }

    public static BuildProperties fromPropertiesStream(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        return fromProperties(properties);
    }
}
