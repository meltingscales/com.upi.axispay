package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LogFileManager {
    private static final String COLLECT_CUSTOM_LOGS = null;
    private static final String LOGFILE_EXT = null;
    private static final String LOGFILE_PREFIX = null;
    public static final int MAX_LOG_SIZE = 0;
    private static final NoopLogStore NOOP_LOG_STORE;
    private final Context context;
    private FileLogStore currentLog;
    private final DirectoryProvider directoryProvider;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface DirectoryProvider {
        File getLogFileDir();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class NoopLogStore implements FileLogStore {
        private NoopLogStore() {
        }

        @Override // com.crashlytics.android.core.FileLogStore
        public void closeLogFile() {
        }

        @Override // com.crashlytics.android.core.FileLogStore
        public void deleteLogFile() {
        }

        @Override // com.crashlytics.android.core.FileLogStore
        public ByteString getLogAsByteString() {
            return null;
        }

        @Override // com.crashlytics.android.core.FileLogStore
        public byte[] getLogAsBytes() {
            return null;
        }

        @Override // com.crashlytics.android.core.FileLogStore
        public void writeToLog(long j, String str) {
        }
    }

    static {
        C0059ao.a(LogFileManager.class, 286);
        NOOP_LOG_STORE = new NoopLogStore();
    }

    public LogFileManager(Context context, DirectoryProvider directoryProvider) {
        this(context, directoryProvider, null);
    }

    private String getSessionIdForFile(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(C0059ao.a(4944));
        return lastIndexOf == -1 ? name : name.substring(20, lastIndexOf);
    }

    private File getWorkingFileForSession(String str) {
        return new File(this.directoryProvider.getLogFileDir(), C0059ao.a(4945) + str + C0059ao.a(4946));
    }

    public void clearLog() {
        this.currentLog.deleteLogFile();
    }

    public void discardOldLogFiles(Set<String> set) {
        File[] listFiles = this.directoryProvider.getLogFileDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(getSessionIdForFile(file))) {
                    file.delete();
                }
            }
        }
    }

    public ByteString getByteStringForLog() {
        return this.currentLog.getLogAsByteString();
    }

    public byte[] getBytesForLog() {
        return this.currentLog.getLogAsBytes();
    }

    public final void setCurrentSession(String str) {
        this.currentLog.closeLogFile();
        this.currentLog = NOOP_LOG_STORE;
        if (str == null) {
            return;
        }
        if (!CommonUtils.getBooleanResourceValue(this.context, C0059ao.a(4947), true)) {
            Fabric.getLogger().d(C0059ao.a(4948), C0059ao.a(4949));
        } else {
            setLogFile(getWorkingFileForSession(str), com.google.firebase.crashlytics.internal.metadata.LogFileManager.MAX_LOG_SIZE);
        }
    }

    public void setLogFile(File file, int i) {
        this.currentLog = new QueueFileLogStore(file, i);
    }

    public void writeToLog(long j, String str) {
        this.currentLog.writeToLog(j, str);
    }

    public LogFileManager(Context context, DirectoryProvider directoryProvider, String str) {
        this.context = context;
        this.directoryProvider = directoryProvider;
        this.currentLog = NOOP_LOG_STORE;
        setCurrentSession(str);
    }
}
