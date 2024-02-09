package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class EventsFilesManager<T> {
    public static final int MAX_BYTE_SIZE_PER_FILE = 0;
    public static final int MAX_FILES_IN_BATCH = 0;
    public static final int MAX_FILES_TO_KEEP = 0;
    public static final String ROLL_OVER_FILE_NAME_SEPARATOR = null;
    public final Context context;
    public final CurrentTimeProvider currentTimeProvider;
    private final int defaultMaxFilesToKeep;
    public final EventsStorage eventStorage;
    public volatile long lastRollOverTime;
    public final List<EventsStorageListener> rollOverListeners = new CopyOnWriteArrayList();
    public final EventTransform<T> transform;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class FileWithTimestamp {
        public final File file;
        public final long timestamp;

        public FileWithTimestamp(File file, long j) {
            this.file = file;
            this.timestamp = j;
        }
    }

    static {
        C0059ao.a(EventsFilesManager.class, 57);
    }

    public EventsFilesManager(Context context, EventTransform<T> eventTransform, CurrentTimeProvider currentTimeProvider, EventsStorage eventsStorage, int i) throws IOException {
        this.context = context.getApplicationContext();
        this.transform = eventTransform;
        this.eventStorage = eventsStorage;
        this.currentTimeProvider = currentTimeProvider;
        this.lastRollOverTime = currentTimeProvider.getCurrentTimeMillis();
        this.defaultMaxFilesToKeep = i;
    }

    private void rollFileOverIfNeeded(int i) throws IOException {
        if (this.eventStorage.canWorkingFileStore(i, getMaxByteSizePerFile())) {
            return;
        }
        CommonUtils.logControlled(this.context, 4, C0059ao.a(3622), String.format(Locale.US, C0059ao.a(3621), Integer.valueOf(this.eventStorage.getWorkingFileUsedSizeInBytes()), Integer.valueOf(i), Integer.valueOf(getMaxByteSizePerFile())));
        rollFileOver();
    }

    private void triggerRollOverOnListeners(String str) {
        for (EventsStorageListener eventsStorageListener : this.rollOverListeners) {
            try {
                eventsStorageListener.onRollOver(str);
            } catch (Exception e) {
                CommonUtils.logControlledError(this.context, C0059ao.a(3623), e);
            }
        }
    }

    public void deleteAllEventsFiles() {
        EventsStorage eventsStorage = this.eventStorage;
        eventsStorage.deleteFilesInRollOverDirectory(eventsStorage.getAllFilesInRollOverDirectory());
        this.eventStorage.deleteWorkingFile();
    }

    public void deleteOldestInRollOverIfOverMax() {
        List<File> allFilesInRollOverDirectory = this.eventStorage.getAllFilesInRollOverDirectory();
        int maxFilesToKeep = getMaxFilesToKeep();
        if (allFilesInRollOverDirectory.size() <= maxFilesToKeep) {
            return;
        }
        int size = allFilesInRollOverDirectory.size() - maxFilesToKeep;
        CommonUtils.logControlled(this.context, String.format(Locale.US, C0059ao.a(3624), Integer.valueOf(allFilesInRollOverDirectory.size()), Integer.valueOf(maxFilesToKeep), Integer.valueOf(size)));
        TreeSet treeSet = new TreeSet(new Comparator<FileWithTimestamp>() { // from class: io.fabric.sdk.android.services.events.EventsFilesManager.1
            @Override // java.util.Comparator
            public int compare(FileWithTimestamp fileWithTimestamp, FileWithTimestamp fileWithTimestamp2) {
                return (int) (fileWithTimestamp.timestamp - fileWithTimestamp2.timestamp);
            }
        });
        for (File file : allFilesInRollOverDirectory) {
            treeSet.add(new FileWithTimestamp(file, parseCreationTimestampFromFileName(file.getName())));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((FileWithTimestamp) it.next()).file);
            if (arrayList.size() == size) {
                break;
            }
        }
        this.eventStorage.deleteFilesInRollOverDirectory(arrayList);
    }

    public void deleteSentFiles(List<File> list) {
        this.eventStorage.deleteFilesInRollOverDirectory(list);
    }

    public abstract String generateUniqueRollOverFileName();

    public List<File> getBatchOfFilesToSend() {
        return this.eventStorage.getBatchOfFilesToSend(1);
    }

    public long getLastRollOverTime() {
        return this.lastRollOverTime;
    }

    public int getMaxByteSizePerFile() {
        return 8000;
    }

    public int getMaxFilesToKeep() {
        return this.defaultMaxFilesToKeep;
    }

    public long parseCreationTimestampFromFileName(String str) {
        String[] split = str.split(C0059ao.a(3625));
        if (split.length != 3) {
            return 0L;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public void registerRollOverListener(EventsStorageListener eventsStorageListener) {
        if (eventsStorageListener != null) {
            this.rollOverListeners.add(eventsStorageListener);
        }
    }

    public boolean rollFileOver() throws IOException {
        String str;
        boolean z = true;
        if (this.eventStorage.isWorkingFileEmpty()) {
            str = null;
            z = false;
        } else {
            str = generateUniqueRollOverFileName();
            this.eventStorage.rollOver(str);
            CommonUtils.logControlled(this.context, 4, C0059ao.a(3627), String.format(Locale.US, C0059ao.a(3626), str));
            this.lastRollOverTime = this.currentTimeProvider.getCurrentTimeMillis();
        }
        triggerRollOverOnListeners(str);
        return z;
    }

    public void writeEvent(T t) throws IOException {
        byte[] bytes = this.transform.toBytes(t);
        rollFileOverIfNeeded(bytes.length);
        this.eventStorage.add(bytes);
    }
}
