package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import myunmn.C0059ao;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DefaultCachedSettingsIo implements CachedSettingsIo {
    private final Kit kit;

    public DefaultCachedSettingsIo(Kit kit) {
        this.kit = kit;
    }

    @Override // io.fabric.sdk.android.services.settings.CachedSettingsIo
    public JSONObject readCachedSettings() {
        FileInputStream fileInputStream;
        Throwable th;
        JSONObject jSONObject;
        String a = C0059ao.a(6876);
        Logger logger = Fabric.getLogger();
        String a2 = C0059ao.a(6877);
        logger.d(a2, C0059ao.a(6878));
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new FileStoreImpl(this.kit).getFilesDir(), C0059ao.a(6879));
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(CommonUtils.streamToString(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        CommonUtils.closeOrLog(fileInputStream, a);
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Fabric.getLogger().e(a2, C0059ao.a(6881), e);
                    CommonUtils.closeOrLog(fileInputStream, a);
                    return null;
                }
            } else {
                Fabric.getLogger().d(a2, C0059ao.a(6880));
                jSONObject = null;
            }
            CommonUtils.closeOrLog(fileInputStream2, a);
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            CommonUtils.closeOrLog(fileInputStream, a);
            throw th;
        }
    }

    @Override // io.fabric.sdk.android.services.settings.CachedSettingsIo
    public void writeCachedSettings(long j, JSONObject jSONObject) {
        String a = C0059ao.a(6882);
        Logger logger = Fabric.getLogger();
        String a2 = C0059ao.a(6883);
        logger.d(a2, C0059ao.a(6884));
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put(C0059ao.a(6885), j);
                FileWriter fileWriter2 = new FileWriter(new File(new FileStoreImpl(this.kit).getFilesDir(), C0059ao.a(6886)));
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    CommonUtils.closeOrLog(fileWriter2, a);
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    Fabric.getLogger().e(a2, C0059ao.a(6887), e);
                    CommonUtils.closeOrLog(fileWriter, a);
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    CommonUtils.closeOrLog(fileWriter, a);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
