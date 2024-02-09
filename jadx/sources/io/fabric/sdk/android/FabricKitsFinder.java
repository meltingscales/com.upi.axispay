package io.fabric.sdk.android;

import android.os.SystemClock;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FabricKitsFinder implements Callable<Map<String, KitInfo>> {
    private static final String FABRIC_BUILD_TYPE_KEY = null;
    public static final String FABRIC_DIR = null;
    private static final String FABRIC_IDENTIFIER_KEY = null;
    private static final String FABRIC_VERSION_KEY = null;
    public final String apkFileName;

    static {
        C0059ao.a(FabricKitsFinder.class, 248);
    }

    public FabricKitsFinder(String str) {
        this.apkFileName = str;
    }

    private Map<String, KitInfo> findImplicitKits() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName(C0059ao.a(15095));
            KitInfo kitInfo = new KitInfo(C0059ao.a(15096), C0059ao.a(15097), C0059ao.a(15098));
            hashMap.put(kitInfo.getIdentifier(), kitInfo);
            Fabric.getLogger().v(C0059ao.a(15099), C0059ao.a(15100));
        } catch (Exception unused) {
        }
        return hashMap;
    }

    private Map<String, KitInfo> findRegisteredKits() throws Exception {
        KitInfo loadKitInfo;
        HashMap hashMap = new HashMap();
        ZipFile loadApkFile = loadApkFile();
        Enumeration<? extends ZipEntry> entries = loadApkFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (nextElement.getName().startsWith(C0059ao.a(15101)) && nextElement.getName().length() > 7 && (loadKitInfo = loadKitInfo(nextElement, loadApkFile)) != null) {
                hashMap.put(loadKitInfo.getIdentifier(), loadKitInfo);
                Fabric.getLogger().v(C0059ao.a(15103), String.format(C0059ao.a(15102), loadKitInfo.getIdentifier(), loadKitInfo.getVersion()));
            }
        }
        if (loadApkFile != null) {
            try {
                loadApkFile.close();
            } catch (IOException unused) {
            }
        }
        return hashMap;
    }

    private KitInfo loadKitInfo(ZipEntry zipEntry, ZipFile zipFile) {
        InputStream inputStream;
        ZipFile zipFile2 = null;
        try {
            try {
                inputStream = zipFile.getInputStream(zipEntry);
            } catch (IOException e) {
                e = e;
                inputStream = null;
            } catch (Throwable th) {
                th = th;
                CommonUtils.closeQuietly(zipFile2);
                throw th;
            }
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty(C0059ao.a(15104));
                String property2 = properties.getProperty(C0059ao.a(15105));
                String property3 = properties.getProperty(C0059ao.a(15106));
                if (!TextUtils.isEmpty(property) && !TextUtils.isEmpty(property2)) {
                    KitInfo kitInfo = new KitInfo(property, property2, property3);
                    CommonUtils.closeQuietly(inputStream);
                    return kitInfo;
                }
                throw new IllegalStateException(C0059ao.a(15107) + zipEntry.getName());
            } catch (IOException e2) {
                e = e2;
                Fabric.getLogger().e(C0059ao.a(15108), C0059ao.a(15109) + zipEntry.getName(), e);
                CommonUtils.closeQuietly(inputStream);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            CommonUtils.closeQuietly(zipFile2);
            throw th;
        }
    }

    public ZipFile loadApkFile() throws IOException {
        return new ZipFile(this.apkFileName);
    }

    @Override // java.util.concurrent.Callable
    public Map<String, KitInfo> call() throws Exception {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(findImplicitKits());
        hashMap.putAll(findRegisteredKits());
        Logger logger = Fabric.getLogger();
        logger.v(C0059ao.a(15111), C0059ao.a(15110) + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return hashMap;
    }
}
