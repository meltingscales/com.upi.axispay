package com.crashlytics.android.beta;

import android.content.Context;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.cache.ValueLoader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DeviceTokenLoader implements ValueLoader<String> {
    private static final String BETA_APP_PACKAGE_NAME = null;
    private static final String DIRFACTOR_DEVICE_TOKEN_PREFIX = null;

    static {
        C0059ao.a(DeviceTokenLoader.class, 243);
    }

    public String determineDeviceToken(ZipInputStream zipInputStream) throws IOException {
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        if (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.startsWith(C0059ao.a(1778))) {
                return name.substring(59, name.length() - 1);
            }
        }
        return C0059ao.a(1779);
    }

    public ZipInputStream getZipInputStreamOfApkFrom(Context context, String str) throws PackageManager.NameNotFoundException, FileNotFoundException {
        return new ZipInputStream(new FileInputStream(context.getPackageManager().getApplicationInfo(str, 0).sourceDir));
    }

    @Override // io.fabric.sdk.android.services.cache.ValueLoader
    public String load(Context context) throws Exception {
        String a;
        String a2 = C0059ao.a(1780);
        String a3 = C0059ao.a(1781);
        long nanoTime = System.nanoTime();
        ZipInputStream zipInputStream = null;
        try {
        } catch (IOException e) {
            Fabric.getLogger().e(a3, a2, e);
        }
        try {
            try {
                try {
                    try {
                        zipInputStream = getZipInputStreamOfApkFrom(context, C0059ao.a(1782));
                        a = determineDeviceToken(zipInputStream);
                    } catch (PackageManager.NameNotFoundException unused) {
                        Fabric.getLogger().d(a3, C0059ao.a(1785));
                        if (zipInputStream != null) {
                            zipInputStream.close();
                        }
                        a = C0059ao.a(1786);
                        Logger logger = Fabric.getLogger();
                        logger.d(a3, C0059ao.a(1787) + ((System.nanoTime() - nanoTime) / 1000000.0d) + C0059ao.a(1788));
                        return a;
                    }
                } catch (FileNotFoundException e2) {
                    Fabric.getLogger().e(a3, C0059ao.a(1784), e2);
                    if (zipInputStream != null) {
                        zipInputStream.close();
                    }
                    a = C0059ao.a(1786);
                    Logger logger2 = Fabric.getLogger();
                    logger2.d(a3, C0059ao.a(1787) + ((System.nanoTime() - nanoTime) / 1000000.0d) + C0059ao.a(1788));
                    return a;
                }
            } catch (IOException e3) {
                Fabric.getLogger().e(a3, C0059ao.a(1783), e3);
                if (zipInputStream != null) {
                    zipInputStream.close();
                }
                a = C0059ao.a(1786);
                Logger logger22 = Fabric.getLogger();
                logger22.d(a3, C0059ao.a(1787) + ((System.nanoTime() - nanoTime) / 1000000.0d) + C0059ao.a(1788));
                return a;
            }
            Logger logger222 = Fabric.getLogger();
            logger222.d(a3, C0059ao.a(1787) + ((System.nanoTime() - nanoTime) / 1000000.0d) + C0059ao.a(1788));
            return a;
        } finally {
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                } catch (IOException e4) {
                    Fabric.getLogger().e(a3, a2, e4);
                }
            }
        }
    }
}
