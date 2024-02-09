package com.crashlytics.android.core;

import com.crashlytics.android.core.BinaryImagesConverter;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Sha1FileIdStrategy implements BinaryImagesConverter.FileIdStrategy {
    private static String getFileSHA(String str) throws IOException {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
        } catch (Throwable th) {
            th = th;
        }
        try {
            String sha1 = CommonUtils.sha1(bufferedInputStream);
            CommonUtils.closeQuietly(bufferedInputStream);
            return sha1;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            CommonUtils.closeQuietly(bufferedInputStream2);
            throw th;
        }
    }

    @Override // com.crashlytics.android.core.BinaryImagesConverter.FileIdStrategy
    public String createId(File file) throws IOException {
        return getFileSHA(file.getPath());
    }
}
