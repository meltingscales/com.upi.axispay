package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FileBackedNativeSessionFile implements NativeSessionFile {
    private final String dataTransportFilename;
    private final File file;
    private final String reportsEndpointFilename;

    public FileBackedNativeSessionFile(String str, String str2, File file) {
        this.dataTransportFilename = str;
        this.reportsEndpointFilename = str2;
        this.file = file;
    }

    private byte[] asGzippedBytes() {
        byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        try {
            InputStream stream = getStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (stream == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (stream != null) {
                    stream.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = stream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    gZIPOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            if (stream != null) {
                stream.close();
            }
            return byteArray;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public CrashlyticsReport.FilesPayload.File asFilePayload() {
        byte[] asGzippedBytes = asGzippedBytes();
        if (asGzippedBytes != null) {
            return CrashlyticsReport.FilesPayload.File.builder().setContents(asGzippedBytes).setFilename(this.dataTransportFilename).build();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public String getReportsEndpointFilename() {
        return this.reportsEndpointFilename;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public InputStream getStream() {
        if (this.file.exists() && this.file.isFile()) {
            try {
                return new FileInputStream(this.file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
