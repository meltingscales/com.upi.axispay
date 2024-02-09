package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class QueueFileEventStorage implements EventsStorage {
    private final Context context;
    private QueueFile queueFile;
    private File targetDirectory;
    private final String targetDirectoryName;
    private final File workingDirectory;
    private final File workingFile;

    public QueueFileEventStorage(Context context, File file, String str, String str2) throws IOException {
        this.context = context;
        this.workingDirectory = file;
        this.targetDirectoryName = str2;
        File file2 = new File(file, str);
        this.workingFile = file2;
        this.queueFile = new QueueFile(file2);
        createTargetDirectory();
    }

    private void createTargetDirectory() {
        File file = new File(this.workingDirectory, this.targetDirectoryName);
        this.targetDirectory = file;
        if (file.exists()) {
            return;
        }
        this.targetDirectory.mkdirs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    private void move(File file, File file2) throws IOException {
        OutputStream outputStream;
        ?? fileInputStream;
        String a = C0059ao.a(13878);
        String a2 = C0059ao.a(13879);
        OutputStream outputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
            outputStream = null;
        }
        try {
            outputStream2 = getMoveOutputStream(file2);
            CommonUtils.copyStream(fileInputStream, outputStream2, new byte[1024]);
            CommonUtils.closeOrLog(fileInputStream, a2);
            CommonUtils.closeOrLog(outputStream2, a);
            file.delete();
        } catch (Throwable th2) {
            th = th2;
            outputStream = outputStream2;
            outputStream2 = fileInputStream;
            CommonUtils.closeOrLog(outputStream2, a2);
            CommonUtils.closeOrLog(outputStream, a);
            file.delete();
            throw th;
        }
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public void add(byte[] bArr) throws IOException {
        this.queueFile.add(bArr);
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public boolean canWorkingFileStore(int i, int i2) {
        return this.queueFile.hasSpaceFor(i, i2);
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public void deleteFilesInRollOverDirectory(List<File> list) {
        for (File file : list) {
            CommonUtils.logControlled(this.context, String.format(C0059ao.a(13880), file.getName()));
            file.delete();
        }
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public void deleteWorkingFile() {
        try {
            this.queueFile.close();
        } catch (IOException unused) {
        }
        this.workingFile.delete();
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public List<File> getAllFilesInRollOverDirectory() {
        return Arrays.asList(this.targetDirectory.listFiles());
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public List<File> getBatchOfFilesToSend(int i) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.targetDirectory.listFiles()) {
            arrayList.add(file);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    public OutputStream getMoveOutputStream(File file) throws IOException {
        return new FileOutputStream(file);
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public File getRollOverDirectory() {
        return this.targetDirectory;
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public File getWorkingDirectory() {
        return this.workingDirectory;
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public int getWorkingFileUsedSizeInBytes() {
        return this.queueFile.usedBytes();
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public boolean isWorkingFileEmpty() {
        return this.queueFile.isEmpty();
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public void rollOver(String str) throws IOException {
        this.queueFile.close();
        move(this.workingFile, new File(this.targetDirectory, str));
        this.queueFile = new QueueFile(this.workingFile);
    }
}
