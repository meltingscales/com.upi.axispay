package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class QueueFileLogStore implements FileLogStore {
    private QueueFile logFile;
    private final int maxLogSize;
    private final File workingFile;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class LogBytes {
        public final byte[] bytes;
        public final int offset;

        public LogBytes(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    public QueueFileLogStore(File file, int i) {
        this.workingFile = file;
        this.maxLogSize = i;
    }

    private void doWriteToLog(long j, String str) {
        int i;
        String a = C0059ao.a(14051);
        if (this.logFile == null) {
            return;
        }
        if (str == null) {
            str = C0059ao.a(14052);
        }
        try {
            if (str.length() > this.maxLogSize / 4) {
                str = C0059ao.a(14053) + str.substring(str.length() - i);
            }
            this.logFile.add(String.format(Locale.US, C0059ao.a(14056), Long.valueOf(j), str.replaceAll(C0059ao.a(14054), a).replaceAll(C0059ao.a(14055), a)).getBytes(C0059ao.a(14057)));
            while (!this.logFile.isEmpty() && this.logFile.usedBytes() > this.maxLogSize) {
                this.logFile.remove();
            }
        } catch (IOException e) {
            Fabric.getLogger().e(C0059ao.a(14058), C0059ao.a(14059), e);
        }
    }

    private LogBytes getLogBytes() {
        if (this.workingFile.exists()) {
            openLogFile();
            QueueFile queueFile = this.logFile;
            if (queueFile == null) {
                return null;
            }
            final int[] iArr = {0};
            final byte[] bArr = new byte[queueFile.usedBytes()];
            try {
                this.logFile.forEach(new QueueFile.ElementReader() { // from class: com.crashlytics.android.core.QueueFileLogStore.1
                    @Override // io.fabric.sdk.android.services.common.QueueFile.ElementReader
                    public void read(InputStream inputStream, int i) throws IOException {
                        try {
                            inputStream.read(bArr, iArr[0], i);
                            int[] iArr2 = iArr;
                            iArr2[0] = iArr2[0] + i;
                        } finally {
                            inputStream.close();
                        }
                    }
                });
            } catch (IOException e) {
                Fabric.getLogger().e(C0059ao.a(14060), C0059ao.a(14061), e);
            }
            return new LogBytes(bArr, iArr[0]);
        }
        return null;
    }

    private void openLogFile() {
        if (this.logFile == null) {
            try {
                this.logFile = new QueueFile(this.workingFile);
            } catch (IOException e) {
                Logger logger = Fabric.getLogger();
                logger.e(C0059ao.a(14063), C0059ao.a(14062) + this.workingFile, e);
            }
        }
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public void closeLogFile() {
        CommonUtils.closeOrLog(this.logFile, C0059ao.a(14064));
        this.logFile = null;
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public void deleteLogFile() {
        closeLogFile();
        this.workingFile.delete();
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public ByteString getLogAsByteString() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return ByteString.copyFrom(logBytes.bytes, 0, logBytes.offset);
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public byte[] getLogAsBytes() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return logBytes.bytes;
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public void writeToLog(long j, String str) {
        openLogFile();
        doWriteToLog(j, str);
    }
}
