package com.crashlytics.android.core;

import com.crashlytics.android.core.Report;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.File;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class NativeSessionReport implements Report {
    private final File reportDirectory;

    public NativeSessionReport(File file) {
        this.reportDirectory = file;
    }

    @Override // com.crashlytics.android.core.Report
    public Map<String, String> getCustomHeaders() {
        return null;
    }

    @Override // com.crashlytics.android.core.Report
    public File getFile() {
        return null;
    }

    @Override // com.crashlytics.android.core.Report
    public String getFileName() {
        return null;
    }

    @Override // com.crashlytics.android.core.Report
    public File[] getFiles() {
        return this.reportDirectory.listFiles();
    }

    @Override // com.crashlytics.android.core.Report
    public String getIdentifier() {
        return this.reportDirectory.getName();
    }

    @Override // com.crashlytics.android.core.Report
    public Report.Type getType() {
        return Report.Type.NATIVE;
    }

    @Override // com.crashlytics.android.core.Report
    public void remove() {
        File[] files = getFiles();
        int length = files.length;
        int i = 0;
        while (true) {
            String a = C0059ao.a(13627);
            if (i < length) {
                File file = files[i];
                Logger logger = Fabric.getLogger();
                logger.d(a, C0059ao.a(13628) + file.getPath());
                file.delete();
                i++;
            } else {
                Logger logger2 = Fabric.getLogger();
                logger2.d(a, C0059ao.a(13629) + this.reportDirectory);
                this.reportDirectory.delete();
                return;
            }
        }
    }
}
