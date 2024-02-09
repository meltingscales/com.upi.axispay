package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class NativeFileUtils {
    private NativeFileUtils() {
    }

    public static byte[] binaryImagesJsonFromDirectory(File file, Context context) throws IOException {
        File filter = filter(file, C0059ao.a(11462));
        if (filter == null) {
            return null;
        }
        return binaryImagesJsonFromFile(filter, context);
    }

    private static byte[] binaryImagesJsonFromFile(File file, Context context) throws IOException {
        byte[] readFile = readFile(file);
        if (readFile == null || readFile.length == 0) {
            return null;
        }
        return processBinaryImages(context, new String(readFile));
    }

    private static File filter(File file, String str) {
        File[] listFiles;
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    public static byte[] metadataJsonFromDirectory(File file) {
        File filter = filter(file, C0059ao.a(11463));
        if (filter == null) {
            return null;
        }
        return readFile(filter);
    }

    public static byte[] minidumpFromDirectory(File file) {
        File filter = filter(file, C0059ao.a(11464));
        return filter == null ? new byte[0] : minidumpFromFile(filter);
    }

    private static byte[] minidumpFromFile(File file) {
        return readFile(file);
    }

    private static byte[] processBinaryImages(Context context, String str) throws IOException {
        return new BinaryImagesConverter(context, new Sha1FileIdStrategy()).convert(str);
    }

    private static byte[] readBytes(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static byte[] readFile(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            fileInputStream = null;
        } catch (IOException unused2) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] readBytes = readBytes(fileInputStream);
            CommonUtils.closeQuietly(fileInputStream);
            return readBytes;
        } catch (FileNotFoundException unused3) {
            CommonUtils.closeQuietly(fileInputStream);
            return null;
        } catch (IOException unused4) {
            CommonUtils.closeQuietly(fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            CommonUtils.closeQuietly(fileInputStream2);
            throw th;
        }
    }
}
