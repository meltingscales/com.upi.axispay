package com.crashlytics.android.core;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.EventLogger;
import com.crashlytics.android.core.CrashPromptDialog;
import com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler;
import com.crashlytics.android.core.LogFileManager;
import com.crashlytics.android.core.ReportUploader;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.Crash;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStore;
import io.fabric.sdk.android.services.settings.AppSettingsData;
import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.PromptSettingsData;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import myunmn.C0059ao;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CrashlyticsController {
    private static final int ANALYZER_VERSION = 0;
    private static final String COLLECT_CUSTOM_KEYS = null;
    private static final String CRASHLYTICS_API_ENDPOINT = null;
    private static final String EVENT_TYPE_CRASH = null;
    private static final String EVENT_TYPE_LOGGED = null;
    public static final String FATAL_SESSION_DIR = null;
    public static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = null;
    public static final String FIREBASE_APPLICATION_EXCEPTION = null;
    public static final String FIREBASE_CRASH_TYPE = null;
    public static final int FIREBASE_CRASH_TYPE_FATAL = 0;
    public static final String FIREBASE_REALTIME = null;
    public static final String FIREBASE_TIMESTAMP = null;
    private static final String GENERATOR_FORMAT = null;
    private static final String[] INITIAL_SESSION_PART_TAGS;
    public static final String INVALID_CLS_CACHE_DIR = null;
    public static final Comparator<File> LARGEST_FILE_NAME_FIRST;
    public static final int MAX_INVALID_SESSIONS = 0;
    private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 0;
    public static final int MAX_OPEN_SESSIONS = 0;
    public static final int MAX_STACK_SIZE = 0;
    public static final String NONFATAL_SESSION_DIR = null;
    public static final int NUM_STACK_REPETITIONS_ALLOWED = 0;
    private static final Map<String, String> SEND_AT_CRASHTIME_HEADER;
    public static final String SESSION_APP_TAG = null;
    public static final FilenameFilter SESSION_BEGIN_FILE_FILTER;
    public static final String SESSION_BEGIN_TAG = null;
    public static final String SESSION_DEVICE_TAG = null;
    public static final FileFilter SESSION_DIRECTORY_FILTER;
    public static final String SESSION_EVENT_MISSING_BINARY_IMGS_TAG = null;
    public static final String SESSION_FATAL_TAG = null;
    public static final FilenameFilter SESSION_FILE_FILTER;
    private static final Pattern SESSION_FILE_PATTERN;
    private static final int SESSION_ID_LENGTH = 0;
    public static final String SESSION_JSON_SUFFIX = null;
    public static final String SESSION_NON_FATAL_TAG = null;
    public static final String SESSION_OS_TAG = null;
    public static final String SESSION_USER_TAG = null;
    private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
    public static final Comparator<File> SMALLEST_FILE_NAME_FIRST;
    private final AppData appData;
    private final AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    private final CrashlyticsCore crashlyticsCore;
    private final DevicePowerStateListener devicePowerStateListener;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final FileStore fileStore;
    private final EventLogger firebaseAnalyticsLogger;
    private final ReportUploader.HandlingExceptionCheck handlingExceptionCheck;
    private final HttpRequestFactory httpRequestFactory;
    private final IdManager idManager;
    private final LogFileDirectoryProvider logFileDirectoryProvider;
    private final LogFileManager logFileManager;
    private final PreferenceManager preferenceManager;
    private final ReportUploader.ReportFilesProvider reportFilesProvider;
    private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy;
    private final String unityVersion;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class AnySessionPartFileFilter implements FilenameFilter {
        private AnySessionPartFileFilter() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return !CrashlyticsController.SESSION_FILE_FILTER.accept(file, str) && CrashlyticsController.SESSION_FILE_PATTERN.matcher(str).matches();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface CodedOutputStreamWriteAction {
        void writeTo(CodedOutputStream codedOutputStream) throws Exception;
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class DefaultSettingsDataProvider implements CrashlyticsUncaughtExceptionHandler.SettingsDataProvider {
        private DefaultSettingsDataProvider() {
        }

        @Override // com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.SettingsDataProvider
        public SettingsData getSettingsData() {
            return Settings.getInstance().awaitSettingsData();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class FileNameContainsFilter implements FilenameFilter {
        private final String string;

        public FileNameContainsFilter(String str) {
            this.string = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.contains(this.string) && !str.endsWith(C0059ao.a(14478));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface FileOutputStreamWriteAction {
        void writeTo(FileOutputStream fileOutputStream) throws Exception;
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class InvalidPartFileFilter implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return ClsFileOutputStream.TEMP_FILENAME_FILTER.accept(file, str) || str.contains(C0059ao.a(13173));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class LogFileDirectoryProvider implements LogFileManager.DirectoryProvider {
        private static final String LOG_FILES_DIR = null;
        private final FileStore rootFileStore;

        static {
            C0059ao.a(LogFileDirectoryProvider.class, 340);
        }

        public LogFileDirectoryProvider(FileStore fileStore) {
            this.rootFileStore = fileStore;
        }

        @Override // com.crashlytics.android.core.LogFileManager.DirectoryProvider
        public File getLogFileDir() {
            File file = new File(this.rootFileStore.getFilesDir(), C0059ao.a(11375));
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class PrivacyDialogCheck implements ReportUploader.SendCheck {
        private final Kit kit;
        private final PreferenceManager preferenceManager;
        private final PromptSettingsData promptData;

        public PrivacyDialogCheck(Kit kit, PreferenceManager preferenceManager, PromptSettingsData promptSettingsData) {
            this.kit = kit;
            this.preferenceManager = preferenceManager;
            this.promptData = promptSettingsData;
        }

        @Override // com.crashlytics.android.core.ReportUploader.SendCheck
        public boolean canSendReports() {
            Activity currentActivity = this.kit.getFabric().getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                return true;
            }
            final CrashPromptDialog create = CrashPromptDialog.create(currentActivity, this.promptData, new CrashPromptDialog.AlwaysSendCallback() { // from class: com.crashlytics.android.core.CrashlyticsController.PrivacyDialogCheck.1
                @Override // com.crashlytics.android.core.CrashPromptDialog.AlwaysSendCallback
                public void sendUserReportsWithoutPrompting(boolean z) {
                    PrivacyDialogCheck.this.preferenceManager.setShouldAlwaysSendReports(z);
                }
            });
            currentActivity.runOnUiThread(new Runnable() { // from class: com.crashlytics.android.core.CrashlyticsController.PrivacyDialogCheck.2
                @Override // java.lang.Runnable
                public void run() {
                    create.show();
                }
            });
            Fabric.getLogger().d(C0059ao.a(3119), C0059ao.a(3120));
            create.await();
            return create.getOptIn();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class ReportUploaderFilesProvider implements ReportUploader.ReportFilesProvider {
        private ReportUploaderFilesProvider() {
        }

        @Override // com.crashlytics.android.core.ReportUploader.ReportFilesProvider
        public File[] getCompleteSessionFiles() {
            return CrashlyticsController.this.listCompleteSessionFiles();
        }

        @Override // com.crashlytics.android.core.ReportUploader.ReportFilesProvider
        public File[] getInvalidSessionFiles() {
            return CrashlyticsController.this.getInvalidFilesDir().listFiles();
        }

        @Override // com.crashlytics.android.core.ReportUploader.ReportFilesProvider
        public File[] getNativeReportFiles() {
            return CrashlyticsController.this.listNativeSessionFileDirectories();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class ReportUploaderHandlingExceptionCheck implements ReportUploader.HandlingExceptionCheck {
        private ReportUploaderHandlingExceptionCheck() {
        }

        @Override // com.crashlytics.android.core.ReportUploader.HandlingExceptionCheck
        public boolean isHandlingException() {
            return CrashlyticsController.this.isHandlingException();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class SendReportRunnable implements Runnable {
        private final Context context;
        private final Report report;
        private final ReportUploader reportUploader;

        public SendReportRunnable(Context context, Report report, ReportUploader reportUploader) {
            this.context = context;
            this.report = report;
            this.reportUploader = reportUploader;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CommonUtils.canTryConnection(this.context)) {
                Fabric.getLogger().d(C0059ao.a(4092), C0059ao.a(4093));
                this.reportUploader.forceUpload(this.report);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SessionPartFileFilter implements FilenameFilter {
        private final String sessionId;

        public SessionPartFileFilter(String str) {
            this.sessionId = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.sessionId);
            sb.append(C0059ao.a(13682));
            return (str.equals(sb.toString()) || !str.contains(this.sessionId) || str.endsWith(C0059ao.a(13683))) ? false : true;
        }
    }

    static {
        C0059ao.a(CrashlyticsController.class, 117);
        SESSION_BEGIN_FILE_FILTER = new FileNameContainsFilter(C0059ao.a(11159)) { // from class: com.crashlytics.android.core.CrashlyticsController.1
            @Override // com.crashlytics.android.core.CrashlyticsController.FileNameContainsFilter, java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return super.accept(file, str) && str.endsWith(C0059ao.a(8943));
            }
        };
        SESSION_FILE_FILTER = new FilenameFilter() { // from class: com.crashlytics.android.core.CrashlyticsController.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.length() == 39 && str.endsWith(C0059ao.a(8926));
            }
        };
        SESSION_DIRECTORY_FILTER = new FileFilter() { // from class: com.crashlytics.android.core.CrashlyticsController.3
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return file.isDirectory() && file.getName().length() == 35;
            }
        };
        LARGEST_FILE_NAME_FIRST = new Comparator<File>() { // from class: com.crashlytics.android.core.CrashlyticsController.4
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return file2.getName().compareTo(file.getName());
            }
        };
        SMALLEST_FILE_NAME_FIRST = new Comparator<File>() { // from class: com.crashlytics.android.core.CrashlyticsController.5
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return file.getName().compareTo(file2.getName());
            }
        };
        SESSION_FILE_PATTERN = Pattern.compile(C0059ao.a(11160));
        SEND_AT_CRASHTIME_HEADER = Collections.singletonMap(C0059ao.a(11161), C0059ao.a(11162));
        INITIAL_SESSION_PART_TAGS = new String[]{C0059ao.a(11163), C0059ao.a(11164), C0059ao.a(11165), C0059ao.a(11166)};
    }

    public CrashlyticsController(CrashlyticsCore crashlyticsCore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, HttpRequestFactory httpRequestFactory, IdManager idManager, PreferenceManager preferenceManager, FileStore fileStore, AppData appData, UnityVersionProvider unityVersionProvider, AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar, EventLogger eventLogger) {
        this.crashlyticsCore = crashlyticsCore;
        this.backgroundWorker = crashlyticsBackgroundWorker;
        this.httpRequestFactory = httpRequestFactory;
        this.idManager = idManager;
        this.preferenceManager = preferenceManager;
        this.fileStore = fileStore;
        this.appData = appData;
        this.unityVersion = unityVersionProvider.getUnityVersion();
        this.appMeasurementEventListenerRegistrar = appMeasurementEventListenerRegistrar;
        this.firebaseAnalyticsLogger = eventLogger;
        Context context = crashlyticsCore.getContext();
        LogFileDirectoryProvider logFileDirectoryProvider = new LogFileDirectoryProvider(fileStore);
        this.logFileDirectoryProvider = logFileDirectoryProvider;
        this.logFileManager = new LogFileManager(context, logFileDirectoryProvider);
        this.reportFilesProvider = new ReportUploaderFilesProvider();
        this.handlingExceptionCheck = new ReportUploaderHandlingExceptionCheck();
        this.devicePowerStateListener = new DevicePowerStateListener(context);
        this.stackTraceTrimmingStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
    }

    private void closeOpenSessions(File[] fileArr, int i, int i2) {
        Logger logger = Fabric.getLogger();
        String a = C0059ao.a(11167);
        logger.d(a, C0059ao.a(11168));
        while (i < fileArr.length) {
            File file = fileArr[i];
            String sessionIdFromSessionFile = getSessionIdFromSessionFile(file);
            Logger logger2 = Fabric.getLogger();
            logger2.d(a, C0059ao.a(11169) + sessionIdFromSessionFile);
            writeSessionPartsToSessionFile(file, sessionIdFromSessionFile, i2);
            i++;
        }
    }

    private void closeWithoutRenamingOrLog(ClsFileOutputStream clsFileOutputStream) {
        if (clsFileOutputStream == null) {
            return;
        }
        try {
            clsFileOutputStream.closeInProgressStream();
        } catch (IOException e) {
            Fabric.getLogger().e(C0059ao.a(11170), C0059ao.a(11171), e);
        }
    }

    private static void copyToCodedOutputStream(InputStream inputStream, CodedOutputStream codedOutputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        codedOutputStream.writeRawBytes(bArr);
    }

    private void deleteSessionPartFilesFor(String str) {
        for (File file : listSessionPartFilesFor(str)) {
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOpenSession() throws Exception {
        Date date = new Date();
        String clsuuid = new CLSUUID(this.idManager).toString();
        Logger logger = Fabric.getLogger();
        logger.d(C0059ao.a(11176), C0059ao.a(11175) + clsuuid);
        writeBeginSession(clsuuid, date);
        writeSessionApp(clsuuid);
        writeSessionOS(clsuuid);
        writeSessionDevice(clsuuid);
        this.logFileManager.setCurrentSession(clsuuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doWriteNonFatal(Date date, Thread thread, Throwable th) {
        ClsFileOutputStream clsFileOutputStream;
        String a = C0059ao.a(11177);
        String a2 = C0059ao.a(11178);
        String currentSessionId = getCurrentSessionId();
        CodedOutputStream codedOutputStream = null;
        String a3 = C0059ao.a(11179);
        if (currentSessionId == null) {
            Fabric.getLogger().e(a3, C0059ao.a(11180), null);
            return;
        }
        recordLoggedExceptionAnswersEvent(currentSessionId, th.getClass().getName());
        try {
            Fabric.getLogger().d(a3, C0059ao.a(11181) + th + C0059ao.a(11182) + thread.getName());
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), currentSessionId + C0059ao.a(11183) + CommonUtils.padWithZerosToMaxIntWidth(this.eventCounter.getAndIncrement()));
            try {
                try {
                    CodedOutputStream newInstance = CodedOutputStream.newInstance(clsFileOutputStream);
                    try {
                        writeSessionEvent(newInstance, date, thread, th, C0059ao.a(11184), false);
                        CommonUtils.flushOrLog(newInstance, a2);
                    } catch (Exception e) {
                        e = e;
                        codedOutputStream = newInstance;
                        Fabric.getLogger().e(a3, C0059ao.a(11185), e);
                        CommonUtils.flushOrLog(codedOutputStream, a2);
                        CommonUtils.closeOrLog(clsFileOutputStream, a);
                        trimSessionEventFiles(currentSessionId, 64);
                    } catch (Throwable th2) {
                        th = th2;
                        codedOutputStream = newInstance;
                        CommonUtils.flushOrLog(codedOutputStream, a2);
                        CommonUtils.closeOrLog(clsFileOutputStream, a);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            clsFileOutputStream = null;
        }
        CommonUtils.closeOrLog(clsFileOutputStream, a);
        try {
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Exception e4) {
            Fabric.getLogger().e(a3, C0059ao.a(11186), e4);
        }
    }

    private File[] ensureFileArrayNotNull(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finalizeMostRecentNativeCrash(Context context, File file, String str) throws IOException {
        byte[] minidumpFromDirectory = NativeFileUtils.minidumpFromDirectory(file);
        byte[] metadataJsonFromDirectory = NativeFileUtils.metadataJsonFromDirectory(file);
        byte[] binaryImagesJsonFromDirectory = NativeFileUtils.binaryImagesJsonFromDirectory(file, context);
        String a = C0059ao.a(11187);
        if (minidumpFromDirectory != null && minidumpFromDirectory.length != 0) {
            recordFatalExceptionAnswersEvent(str, C0059ao.a(11188));
            byte[] readFile = readFile(str, C0059ao.a(11189));
            byte[] readFile2 = readFile(str, C0059ao.a(11190));
            byte[] readFile3 = readFile(str, C0059ao.a(11191));
            byte[] readFile4 = readFile(str, C0059ao.a(11192));
            byte[] readFile5 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getUserDataFileForSession(str));
            LogFileManager logFileManager = new LogFileManager(this.crashlyticsCore.getContext(), this.logFileDirectoryProvider, str);
            byte[] bytesForLog = logFileManager.getBytesForLog();
            logFileManager.clearLog();
            byte[] readFile6 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getKeysFileForSession(str));
            File file2 = new File(this.fileStore.getFilesDir(), str);
            if (!file2.mkdir()) {
                Fabric.getLogger().d(a, C0059ao.a(11193));
                return;
            }
            gzipIfNotEmpty(minidumpFromDirectory, new File(file2, C0059ao.a(11194)));
            gzipIfNotEmpty(metadataJsonFromDirectory, new File(file2, C0059ao.a(11195)));
            gzipIfNotEmpty(binaryImagesJsonFromDirectory, new File(file2, C0059ao.a(11196)));
            gzipIfNotEmpty(readFile, new File(file2, C0059ao.a(11197)));
            gzipIfNotEmpty(readFile2, new File(file2, C0059ao.a(11198)));
            gzipIfNotEmpty(readFile3, new File(file2, C0059ao.a(11199)));
            gzipIfNotEmpty(readFile4, new File(file2, C0059ao.a(11200)));
            gzipIfNotEmpty(readFile5, new File(file2, C0059ao.a(11201)));
            gzipIfNotEmpty(bytesForLog, new File(file2, C0059ao.a(11202)));
            gzipIfNotEmpty(readFile6, new File(file2, C0059ao.a(11203)));
            return;
        }
        Logger logger = Fabric.getLogger();
        logger.w(a, C0059ao.a(11204) + file);
    }

    private boolean firebaseCrashExists() {
        try {
            Class.forName(C0059ao.a(11205));
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private CreateReportSpiCall getCreateReportSpiCall(String str, String str2) {
        String stringsFileValue = CommonUtils.getStringsFileValue(this.crashlyticsCore.getContext(), C0059ao.a(11206));
        return new CompositeCreateReportSpiCall(new DefaultCreateReportSpiCall(this.crashlyticsCore, stringsFileValue, str, this.httpRequestFactory), new NativeCreateReportSpiCall(this.crashlyticsCore, stringsFileValue, str2, this.httpRequestFactory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCurrentSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 0) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[0]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPreviousSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 1) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[1]);
        }
        return null;
    }

    public static String getSessionIdFromSessionFile(File file) {
        return file.getName().substring(0, 35);
    }

    private File[] getTrimmedNonFatalFiles(String str, File[] fileArr, int i) {
        if (fileArr.length > i) {
            Fabric.getLogger().d(C0059ao.a(11208), String.format(Locale.US, C0059ao.a(11207), Integer.valueOf(i)));
            trimSessionEventFiles(str, i);
            return listFilesMatching(new FileNameContainsFilter(str + C0059ao.a(11209)));
        }
        return fileArr;
    }

    private UserMetaData getUserMetaData(String str) {
        if (isHandlingException()) {
            return new UserMetaData(this.crashlyticsCore.getUserIdentifier(), this.crashlyticsCore.getUserName(), this.crashlyticsCore.getUserEmail());
        }
        return new MetaDataStore(getFilesDir()).readUserData(str);
    }

    private void gzip(byte[] bArr, File file) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            CommonUtils.closeQuietly(gZIPOutputStream);
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            CommonUtils.closeQuietly(gZIPOutputStream2);
            throw th;
        }
    }

    private void gzipIfNotEmpty(byte[] bArr, File file) throws IOException {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        gzip(bArr, file);
    }

    private File[] listFiles(File file) {
        return ensureFileArrayNotNull(file.listFiles());
    }

    private File[] listFilesMatching(FileFilter fileFilter) {
        return ensureFileArrayNotNull(getFilesDir().listFiles(fileFilter));
    }

    private File[] listSessionPartFilesFor(String str) {
        return listFilesMatching(new SessionPartFileFilter(str));
    }

    private File[] listSortedSessionBeginFiles() {
        File[] listSessionBeginFiles = listSessionBeginFiles();
        Arrays.sort(listSessionBeginFiles, LARGEST_FILE_NAME_FIRST);
        return listSessionBeginFiles;
    }

    private byte[] readFile(String str, String str2) {
        File filesDir = getFilesDir();
        return NativeFileUtils.readFile(new File(filesDir, str + str2));
    }

    private static void recordFatalExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) Fabric.getKit(Answers.class);
        if (answers == null) {
            Fabric.getLogger().d(C0059ao.a(11210), C0059ao.a(11211));
        } else {
            answers.onException(new Crash.FatalException(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordFatalFirebaseEvent(long j) {
        boolean firebaseCrashExists = firebaseCrashExists();
        String a = C0059ao.a(11212);
        if (firebaseCrashExists) {
            Fabric.getLogger().d(a, C0059ao.a(11213));
        } else if (this.firebaseAnalyticsLogger != null) {
            Fabric.getLogger().d(a, C0059ao.a(11214));
            Bundle bundle = new Bundle();
            bundle.putInt(C0059ao.a(11215), 1);
            bundle.putInt(C0059ao.a(11216), 1);
            bundle.putLong(C0059ao.a(11217), j);
            this.firebaseAnalyticsLogger.logEvent(C0059ao.a(11218), C0059ao.a(11219), bundle);
        } else {
            Fabric.getLogger().d(a, C0059ao.a(11220));
        }
    }

    private static void recordLoggedExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) Fabric.getKit(Answers.class);
        if (answers == null) {
            Fabric.getLogger().d(C0059ao.a(11221), C0059ao.a(11222));
        } else {
            answers.onException(new Crash.LoggedException(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recursiveDelete(Set<File> set) {
        for (File file : set) {
            recursiveDelete(file);
        }
    }

    private void retainSessions(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(name);
            boolean matches = matcher.matches();
            String a = C0059ao.a(11223);
            if (!matches) {
                Fabric.getLogger().d(a, C0059ao.a(11224) + name);
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                Fabric.getLogger().d(a, C0059ao.a(11225) + name);
                file.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSessionReports(SettingsData settingsData) {
        if (settingsData == null) {
            Fabric.getLogger().w(C0059ao.a(11226), C0059ao.a(11227));
            return;
        }
        Context context = this.crashlyticsCore.getContext();
        AppSettingsData appSettingsData = settingsData.appData;
        ReportUploader reportUploader = new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(appSettingsData.reportsUrl, appSettingsData.ndkReportsUrl), this.reportFilesProvider, this.handlingExceptionCheck);
        for (File file : listCompleteSessionFiles()) {
            this.backgroundWorker.submit(new SendReportRunnable(context, new SessionReport(file, SEND_AT_CRASHTIME_HEADER), reportUploader));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldPromptUserBeforeSendingCrashReports(SettingsData settingsData) {
        return (settingsData == null || !settingsData.featuresData.promptEnabled || this.preferenceManager.shouldAlwaysSendReports()) ? false : true;
    }

    private void synthesizeSessionFile(File file, String str, File[] fileArr, File file2) {
        ClsFileOutputStream clsFileOutputStream;
        String a = C0059ao.a(11228);
        String a2 = C0059ao.a(11229);
        String a3 = C0059ao.a(11230);
        boolean z = file2 != null;
        File fatalSessionFilesDir = z ? getFatalSessionFilesDir() : getNonFatalSessionFilesDir();
        if (!fatalSessionFilesDir.exists()) {
            fatalSessionFilesDir.mkdirs();
        }
        CodedOutputStream codedOutputStream = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(fatalSessionFilesDir, str);
        } catch (Exception e) {
            e = e;
            clsFileOutputStream = null;
        } catch (Throwable th) {
            th = th;
            clsFileOutputStream = null;
            CommonUtils.flushOrLog(codedOutputStream, a3);
            CommonUtils.closeOrLog(clsFileOutputStream, a);
            throw th;
        }
        try {
            try {
                codedOutputStream = CodedOutputStream.newInstance(clsFileOutputStream);
                Fabric.getLogger().d(a2, C0059ao.a(11231) + str);
                writeToCosFromFile(codedOutputStream, file);
                codedOutputStream.writeUInt64(4, new Date().getTime() / 1000);
                codedOutputStream.writeBool(5, z);
                codedOutputStream.writeUInt32(11, 1);
                codedOutputStream.writeEnum(12, 3);
                writeInitialPartsTo(codedOutputStream, str);
                writeNonFatalEventsTo(codedOutputStream, fileArr, str);
                if (z) {
                    writeToCosFromFile(codedOutputStream, file2);
                }
                CommonUtils.flushOrLog(codedOutputStream, a3);
                CommonUtils.closeOrLog(clsFileOutputStream, a);
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.flushOrLog(codedOutputStream, a3);
                CommonUtils.closeOrLog(clsFileOutputStream, a);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Fabric.getLogger().e(a2, C0059ao.a(11232) + str, e);
            CommonUtils.flushOrLog(codedOutputStream, a3);
            closeWithoutRenamingOrLog(clsFileOutputStream);
        }
    }

    private void trimInvalidSessionFiles() {
        File invalidFilesDir = getInvalidFilesDir();
        if (invalidFilesDir.exists()) {
            File[] listFilesMatching = listFilesMatching(invalidFilesDir, new InvalidPartFileFilter());
            Arrays.sort(listFilesMatching, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i = 0; i < listFilesMatching.length && hashSet.size() < 4; i++) {
                hashSet.add(getSessionIdFromSessionFile(listFilesMatching[i]));
            }
            retainSessions(listFiles(invalidFilesDir), hashSet);
        }
    }

    private void trimOpenSessions(int i) {
        HashSet hashSet = new HashSet();
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        int min = Math.min(i, listSortedSessionBeginFiles.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(getSessionIdFromSessionFile(listSortedSessionBeginFiles[i2]));
        }
        this.logFileManager.discardOldLogFiles(hashSet);
        retainSessions(listFilesMatching(new AnySessionPartFileFilter()), hashSet);
    }

    private void trimSessionEventFiles(String str, int i) {
        File filesDir = getFilesDir();
        Utils.capFileCount(filesDir, new FileNameContainsFilter(str + C0059ao.a(11233)), i, SMALLEST_FILE_NAME_FIRST);
    }

    private void writeBeginSession(final String str, Date date) throws Exception {
        final String format = String.format(Locale.US, C0059ao.a(11234), this.crashlyticsCore.getVersion());
        final long time = date.getTime() / 1000;
        writeSessionPartFile(str, C0059ao.a(11235), new CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.17
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeBeginSession(codedOutputStream, str, format, time);
            }
        });
        writeFile(str, C0059ao.a(11236), new FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.18
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.18.1
                    {
                        put(C0059ao.a(4119), str);
                        put(C0059ao.a(4120), format);
                        put(C0059ao.a(4121), Long.valueOf(time));
                    }
                }).toString().getBytes());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeFatal(Date date, Thread thread, Throwable th) {
        ClsFileOutputStream clsFileOutputStream;
        String currentSessionId;
        String a = C0059ao.a(11237);
        String a2 = C0059ao.a(11238);
        String a3 = C0059ao.a(11239);
        CodedOutputStream codedOutputStream = null;
        try {
            try {
                currentSessionId = getCurrentSessionId();
            } catch (Exception e) {
                e = e;
                clsFileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                clsFileOutputStream = null;
                CommonUtils.flushOrLog(codedOutputStream, a3);
                CommonUtils.closeOrLog(clsFileOutputStream, a2);
                throw th;
            }
            if (currentSessionId == null) {
                Fabric.getLogger().e(a, C0059ao.a(11240), null);
                CommonUtils.flushOrLog(null, a3);
                CommonUtils.closeOrLog(null, a2);
                return;
            }
            recordFatalExceptionAnswersEvent(currentSessionId, th.getClass().getName());
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), currentSessionId + C0059ao.a(11241));
            try {
                codedOutputStream = CodedOutputStream.newInstance(clsFileOutputStream);
                writeSessionEvent(codedOutputStream, date, thread, th, C0059ao.a(11242), true);
            } catch (Exception e2) {
                e = e2;
                Fabric.getLogger().e(a, C0059ao.a(11243), e);
                CommonUtils.flushOrLog(codedOutputStream, a3);
                CommonUtils.closeOrLog(clsFileOutputStream, a2);
            }
            CommonUtils.flushOrLog(codedOutputStream, a3);
            CommonUtils.closeOrLog(clsFileOutputStream, a2);
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.flushOrLog(codedOutputStream, a3);
            CommonUtils.closeOrLog(clsFileOutputStream, a2);
            throw th;
        }
    }

    private void writeFile(String str, String str2, FileOutputStreamWriteAction fileOutputStreamWriteAction) throws Exception {
        FileOutputStream fileOutputStream;
        String a = C0059ao.a(11244);
        String a2 = C0059ao.a(11245);
        FileOutputStream fileOutputStream2 = null;
        try {
            File filesDir = getFilesDir();
            fileOutputStream = new FileOutputStream(new File(filesDir, str + str2));
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStreamWriteAction.writeTo(fileOutputStream);
            CommonUtils.closeOrLog(fileOutputStream, a2 + str2 + a);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            CommonUtils.closeOrLog(fileOutputStream2, a2 + str2 + a);
            throw th;
        }
    }

    private void writeInitialPartsTo(CodedOutputStream codedOutputStream, String str) throws IOException {
        String[] strArr;
        for (String str2 : INITIAL_SESSION_PART_TAGS) {
            File[] listFilesMatching = listFilesMatching(new FileNameContainsFilter(str + str2 + C0059ao.a(11246)));
            int length = listFilesMatching.length;
            String a = C0059ao.a(11247);
            String a2 = C0059ao.a(11248);
            if (length == 0) {
                Fabric.getLogger().e(a2, C0059ao.a(11249) + str2 + a + str, null);
            } else {
                Fabric.getLogger().d(a2, C0059ao.a(11250) + str2 + a + str);
                writeToCosFromFile(codedOutputStream, listFilesMatching[0]);
            }
        }
    }

    private static void writeNonFatalEventsTo(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        String a = C0059ao.a(11251);
        Arrays.sort(fileArr, CommonUtils.FILE_MODIFIED_COMPARATOR);
        for (File file : fileArr) {
            try {
                Fabric.getLogger().d(a, String.format(Locale.US, C0059ao.a(11252), str, file.getName()));
                writeToCosFromFile(codedOutputStream, file);
            } catch (Exception e) {
                Fabric.getLogger().e(a, C0059ao.a(11253), e);
            }
        }
    }

    private void writeSessionApp(String str) throws Exception {
        final String appIdentifier = this.idManager.getAppIdentifier();
        AppData appData = this.appData;
        final String str2 = appData.versionCode;
        final String str3 = appData.versionName;
        final String appInstallIdentifier = this.idManager.getAppInstallIdentifier();
        final int id = DeliveryMechanism.determineFrom(this.appData.installerPackageName).getId();
        writeSessionPartFile(str, C0059ao.a(11254), new CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.19
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionApp(codedOutputStream, appIdentifier, CrashlyticsController.this.appData.apiKey, str2, str3, appInstallIdentifier, id, CrashlyticsController.this.unityVersion);
            }
        });
        writeFile(str, C0059ao.a(11255), new FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.20
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.20.1
                    {
                        put(C0059ao.a(9697), appIdentifier);
                        put(C0059ao.a(9698), CrashlyticsController.this.appData.apiKey);
                        put(C0059ao.a(9699), str2);
                        put(C0059ao.a(9700), str3);
                        put(C0059ao.a(9701), appInstallIdentifier);
                        put(C0059ao.a(9702), Integer.valueOf(id));
                        put(C0059ao.a(9704), TextUtils.isEmpty(CrashlyticsController.this.unityVersion) ? C0059ao.a(9703) : CrashlyticsController.this.unityVersion);
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionDevice(String str) throws Exception {
        Context context = this.crashlyticsCore.getContext();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        final int cpuArchitectureInt = CommonUtils.getCpuArchitectureInt();
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        final long totalRamInBytes = CommonUtils.getTotalRamInBytes();
        final long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        final boolean isEmulator = CommonUtils.isEmulator(context);
        final Map<IdManager.DeviceIdentifierType, String> deviceIdentifiers = this.idManager.getDeviceIdentifiers();
        final int deviceState = CommonUtils.getDeviceState(context);
        writeSessionPartFile(str, C0059ao.a(11256), new CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.23
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionDevice(codedOutputStream, cpuArchitectureInt, Build.MODEL, availableProcessors, totalRamInBytes, blockCount, isEmulator, deviceIdentifiers, deviceState, Build.MANUFACTURER, Build.PRODUCT);
            }
        });
        writeFile(str, C0059ao.a(11257), new FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.24
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.24.1
                    {
                        put(C0059ao.a(6510), Integer.valueOf(cpuArchitectureInt));
                        put(C0059ao.a(6511), Build.MODEL);
                        put(C0059ao.a(6512), Integer.valueOf(availableProcessors));
                        put(C0059ao.a(6513), Long.valueOf(totalRamInBytes));
                        put(C0059ao.a(6514), Long.valueOf(blockCount));
                        put(C0059ao.a(6515), Boolean.valueOf(isEmulator));
                        put(C0059ao.a(6516), deviceIdentifiers);
                        put(C0059ao.a(6517), Integer.valueOf(deviceState));
                        put(C0059ao.a(6518), Build.MANUFACTURER);
                        put(C0059ao.a(6519), Build.PRODUCT);
                    }
                }).toString().getBytes());
            }
        });
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    private void writeSessionEvent(CodedOutputStream codedOutputStream, Date date, Thread thread, Throwable th, String str, boolean z) throws Exception {
        ?? r6;
        Thread[] threadArr;
        Map<String, String> attributes;
        TreeMap treeMap;
        TrimmedThrowableData trimmedThrowableData = new TrimmedThrowableData(th, this.stackTraceTrimmingStrategy);
        Context context = this.crashlyticsCore.getContext();
        long time = date.getTime() / 1000;
        Float batteryLevel = CommonUtils.getBatteryLevel(context);
        int batteryVelocity = CommonUtils.getBatteryVelocity(context, this.devicePowerStateListener.isPowerConnected());
        boolean proximitySensorEnabled = CommonUtils.getProximitySensorEnabled(context);
        int i = context.getResources().getConfiguration().orientation;
        long totalRamInBytes = CommonUtils.getTotalRamInBytes() - CommonUtils.calculateFreeRamInBytes(context);
        long calculateUsedDiskSpaceInBytes = CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath());
        ActivityManager.RunningAppProcessInfo appProcessInfo = CommonUtils.getAppProcessInfo(context.getPackageName(), context);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.stacktrace;
        String str2 = this.appData.buildId;
        String appIdentifier = this.idManager.getAppIdentifier();
        int i2 = 0;
        if (z) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                threadArr2[i2] = entry.getKey();
                linkedList.add(this.stackTraceTrimmingStrategy.getTrimmedStackTrace(entry.getValue()));
                i2++;
            }
            r6 = 1;
            threadArr = threadArr2;
        } else {
            r6 = 1;
            threadArr = new Thread[0];
        }
        if (!CommonUtils.getBooleanResourceValue(context, C0059ao.a(11258), r6)) {
            attributes = new TreeMap<>();
        } else {
            attributes = this.crashlyticsCore.getAttributes();
            if (attributes != null && attributes.size() > r6) {
                treeMap = new TreeMap(attributes);
                SessionProtobufHelper.writeSessionEvent(codedOutputStream, time, str, trimmedThrowableData, thread, stackTraceElementArr, threadArr, linkedList, treeMap, this.logFileManager, appProcessInfo, i, appIdentifier, str2, batteryLevel, batteryVelocity, proximitySensorEnabled, totalRamInBytes, calculateUsedDiskSpaceInBytes);
            }
        }
        treeMap = attributes;
        SessionProtobufHelper.writeSessionEvent(codedOutputStream, time, str, trimmedThrowableData, thread, stackTraceElementArr, threadArr, linkedList, treeMap, this.logFileManager, appProcessInfo, i, appIdentifier, str2, batteryLevel, batteryVelocity, proximitySensorEnabled, totalRamInBytes, calculateUsedDiskSpaceInBytes);
    }

    private void writeSessionOS(String str) throws Exception {
        final boolean isRooted = CommonUtils.isRooted(this.crashlyticsCore.getContext());
        writeSessionPartFile(str, C0059ao.a(11259), new CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.21
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionOS(codedOutputStream, Build.VERSION.RELEASE, Build.VERSION.CODENAME, isRooted);
            }
        });
        writeFile(str, C0059ao.a(11260), new FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.22
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.22.1
                    {
                        put(C0059ao.a(12996), Build.VERSION.RELEASE);
                        put(C0059ao.a(12997), Build.VERSION.CODENAME);
                        put(C0059ao.a(12998), Boolean.valueOf(isRooted));
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionPartFile(String str, String str2, CodedOutputStreamWriteAction codedOutputStreamWriteAction) throws Exception {
        ClsFileOutputStream clsFileOutputStream;
        String a = C0059ao.a(11261);
        String a2 = C0059ao.a(11262);
        String a3 = C0059ao.a(11263);
        CodedOutputStream codedOutputStream = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), str + str2);
        } catch (Throwable th) {
            th = th;
            clsFileOutputStream = null;
        }
        try {
            codedOutputStream = CodedOutputStream.newInstance(clsFileOutputStream);
            codedOutputStreamWriteAction.writeTo(codedOutputStream);
            CommonUtils.flushOrLog(codedOutputStream, a2 + str2 + a3);
            CommonUtils.closeOrLog(clsFileOutputStream, a + str2 + a3);
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.flushOrLog(codedOutputStream, a2 + str2 + a3);
            CommonUtils.closeOrLog(clsFileOutputStream, a + str2 + a3);
            throw th;
        }
    }

    private void writeSessionPartsToSessionFile(File file, String str, int i) {
        String a = C0059ao.a(11265);
        Fabric.getLogger().d(a, C0059ao.a(11264) + str);
        File[] listFilesMatching = listFilesMatching(new FileNameContainsFilter(str + C0059ao.a(11266)));
        boolean z = listFilesMatching != null && listFilesMatching.length > 0;
        Logger logger = Fabric.getLogger();
        Locale locale = Locale.US;
        logger.d(a, String.format(locale, C0059ao.a(11267), str, Boolean.valueOf(z)));
        File[] listFilesMatching2 = listFilesMatching(new FileNameContainsFilter(str + C0059ao.a(11268)));
        boolean z2 = listFilesMatching2 != null && listFilesMatching2.length > 0;
        Fabric.getLogger().d(a, String.format(locale, C0059ao.a(11269), str, Boolean.valueOf(z2)));
        if (!z && !z2) {
            Fabric.getLogger().d(a, C0059ao.a(11270) + str);
        } else {
            synthesizeSessionFile(file, str, getTrimmedNonFatalFiles(str, listFilesMatching2, i), z ? listFilesMatching[0] : null);
        }
        Fabric.getLogger().d(a, C0059ao.a(11271) + str);
        deleteSessionPartFilesFor(str);
    }

    private void writeSessionUser(String str) throws Exception {
        final UserMetaData userMetaData = getUserMetaData(str);
        writeSessionPartFile(str, C0059ao.a(11272), new CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.25
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                UserMetaData userMetaData2 = userMetaData;
                SessionProtobufHelper.writeSessionUser(codedOutputStream, userMetaData2.id, userMetaData2.name, userMetaData2.email);
            }
        });
    }

    private static void writeToCosFromFile(CodedOutputStream codedOutputStream, File file) throws IOException {
        FileInputStream fileInputStream;
        String a = C0059ao.a(11273);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            Logger logger = Fabric.getLogger();
            logger.e(C0059ao.a(11275), C0059ao.a(11274) + file.getName(), null);
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            copyToCodedOutputStream(fileInputStream, codedOutputStream, (int) file.length());
            CommonUtils.closeOrLog(fileInputStream, a);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            CommonUtils.closeOrLog(fileInputStream2, a);
            throw th;
        }
    }

    public void cacheKeyData(final Map<String, String> map) {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.11
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeKeyData(CrashlyticsController.this.getCurrentSessionId(), map);
                return null;
            }
        });
    }

    public void cacheUserData(final String str, final String str2, final String str3) {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.10
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeUserData(CrashlyticsController.this.getCurrentSessionId(), new UserMetaData(str, str2, str3));
                return null;
            }
        });
    }

    public void cleanInvalidTempFiles() {
        this.backgroundWorker.submit(new Runnable() { // from class: com.crashlytics.android.core.CrashlyticsController.14
            @Override // java.lang.Runnable
            public void run() {
                CrashlyticsController crashlyticsController = CrashlyticsController.this;
                crashlyticsController.doCleanInvalidTempFiles(crashlyticsController.listFilesMatching(new InvalidPartFileFilter()));
            }
        });
    }

    public void doCleanInvalidTempFiles(File[] fileArr) {
        String a;
        File[] listFilesMatching;
        final HashSet hashSet = new HashSet();
        int length = fileArr.length;
        int i = 0;
        while (true) {
            a = C0059ao.a(11276);
            if (i >= length) {
                break;
            }
            File file = fileArr[i];
            Fabric.getLogger().d(a, C0059ao.a(11277) + file);
            hashSet.add(getSessionIdFromSessionFile(file));
            i++;
        }
        if (hashSet.isEmpty()) {
            return;
        }
        File invalidFilesDir = getInvalidFilesDir();
        if (!invalidFilesDir.exists()) {
            invalidFilesDir.mkdir();
        }
        for (File file2 : listFilesMatching(new FilenameFilter() { // from class: com.crashlytics.android.core.CrashlyticsController.15
            @Override // java.io.FilenameFilter
            public boolean accept(File file3, String str) {
                if (str.length() < 35) {
                    return false;
                }
                return hashSet.contains(str.substring(0, 35));
            }
        })) {
            Fabric.getLogger().d(a, C0059ao.a(11278) + file2);
            if (!file2.renameTo(new File(invalidFilesDir, file2.getName()))) {
                Fabric.getLogger().d(a, C0059ao.a(11279) + file2);
                file2.delete();
            }
        }
        trimInvalidSessionFiles();
    }

    public void doCloseSessions(SessionSettingsData sessionSettingsData) throws Exception {
        doCloseSessions(sessionSettingsData, false);
    }

    public void enableExceptionHandling(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        openSession();
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() { // from class: com.crashlytics.android.core.CrashlyticsController.6
            @Override // com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.CrashListener
            public void onUncaughtException(CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z2) {
                CrashlyticsController.this.handleUncaughtException(settingsDataProvider, thread, th, z2);
            }
        }, new DefaultSettingsDataProvider(), z, uncaughtExceptionHandler);
        this.crashHandler = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    public boolean finalizeNativeReport(final CrashlyticsNdkData crashlyticsNdkData) {
        if (crashlyticsNdkData == null) {
            return true;
        }
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() { // from class: com.crashlytics.android.core.CrashlyticsController.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                File first;
                TreeSet<File> treeSet = crashlyticsNdkData.timestampedDirectories;
                String previousSessionId = CrashlyticsController.this.getPreviousSessionId();
                if (previousSessionId != null && !treeSet.isEmpty() && (first = treeSet.first()) != null) {
                    CrashlyticsController crashlyticsController = CrashlyticsController.this;
                    crashlyticsController.finalizeMostRecentNativeCrash(crashlyticsController.crashlyticsCore.getContext(), first, previousSessionId);
                }
                CrashlyticsController.this.recursiveDelete(treeSet);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    public boolean finalizeSessions(final SessionSettingsData sessionSettingsData) {
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() { // from class: com.crashlytics.android.core.CrashlyticsController.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                boolean isHandlingException = CrashlyticsController.this.isHandlingException();
                String a = C0059ao.a(6317);
                if (isHandlingException) {
                    Fabric.getLogger().d(a, C0059ao.a(6318));
                    return Boolean.FALSE;
                }
                Fabric.getLogger().d(a, C0059ao.a(6319));
                CrashlyticsController.this.doCloseSessions(sessionSettingsData, true);
                Fabric.getLogger().d(a, C0059ao.a(6320));
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    public File getFatalSessionFilesDir() {
        return new File(getFilesDir(), C0059ao.a(11280));
    }

    public File getFilesDir() {
        return this.fileStore.getFilesDir();
    }

    public File getInvalidFilesDir() {
        return new File(getFilesDir(), C0059ao.a(11281));
    }

    public File getNonFatalSessionFilesDir() {
        return new File(getFilesDir(), C0059ao.a(11282));
    }

    public synchronized void handleUncaughtException(final CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, final Thread thread, final Throwable th, final boolean z) {
        Logger logger = Fabric.getLogger();
        String a = C0059ao.a(11283);
        logger.d(a, C0059ao.a(11284) + th + C0059ao.a(11285) + thread.getName());
        this.devicePowerStateListener.dispose();
        final Date date = new Date();
        this.backgroundWorker.submitAndWait(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.7
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                SessionSettingsData sessionSettingsData;
                FeaturesSettingsData featuresSettingsData;
                CrashlyticsController.this.crashlyticsCore.createCrashMarker();
                CrashlyticsController.this.writeFatal(date, thread, th);
                SettingsData settingsData = settingsDataProvider.getSettingsData();
                if (settingsData != null) {
                    sessionSettingsData = settingsData.sessionData;
                    featuresSettingsData = settingsData.featuresData;
                } else {
                    sessionSettingsData = null;
                    featuresSettingsData = null;
                }
                if ((featuresSettingsData == null || featuresSettingsData.firebaseCrashlyticsEnabled) || z) {
                    CrashlyticsController.this.recordFatalFirebaseEvent(date.getTime());
                }
                CrashlyticsController.this.doCloseSessions(sessionSettingsData);
                CrashlyticsController.this.doOpenSession();
                if (sessionSettingsData != null) {
                    CrashlyticsController.this.trimSessionFiles(sessionSettingsData.maxCompleteSessionsCount);
                }
                if (!CrashlyticsController.this.shouldPromptUserBeforeSendingCrashReports(settingsData)) {
                    CrashlyticsController.this.sendSessionReports(settingsData);
                }
                return null;
            }
        });
    }

    public boolean hasOpenSession() {
        return listSessionBeginFiles().length > 0;
    }

    public boolean isHandlingException() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.crashHandler;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.isHandlingException();
    }

    public File[] listCompleteSessionFiles() {
        LinkedList linkedList = new LinkedList();
        File fatalSessionFilesDir = getFatalSessionFilesDir();
        FilenameFilter filenameFilter = SESSION_FILE_FILTER;
        Collections.addAll(linkedList, listFilesMatching(fatalSessionFilesDir, filenameFilter));
        Collections.addAll(linkedList, listFilesMatching(getNonFatalSessionFilesDir(), filenameFilter));
        Collections.addAll(linkedList, listFilesMatching(getFilesDir(), filenameFilter));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    public File[] listNativeSessionFileDirectories() {
        return listFilesMatching(SESSION_DIRECTORY_FILTER);
    }

    public File[] listSessionBeginFiles() {
        return listFilesMatching(SESSION_BEGIN_FILE_FILTER);
    }

    public void openSession() {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.12
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                CrashlyticsController.this.doOpenSession();
                return null;
            }
        });
    }

    public void registerAnalyticsEventListener(SettingsData settingsData) {
        if (settingsData.featuresData.firebaseCrashlyticsEnabled && this.appMeasurementEventListenerRegistrar.register()) {
            Fabric.getLogger().d(C0059ao.a(11286), C0059ao.a(11287));
        }
    }

    public void registerDevicePowerStateListener() {
        this.devicePowerStateListener.initialize();
    }

    public void submitAllReports(float f, SettingsData settingsData) {
        if (settingsData == null) {
            Fabric.getLogger().w(C0059ao.a(11288), C0059ao.a(11289));
            return;
        }
        AppSettingsData appSettingsData = settingsData.appData;
        new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(appSettingsData.reportsUrl, appSettingsData.ndkReportsUrl), this.reportFilesProvider, this.handlingExceptionCheck).uploadReports(f, shouldPromptUserBeforeSendingCrashReports(settingsData) ? new PrivacyDialogCheck(this.crashlyticsCore, this.preferenceManager, settingsData.promptData) : new ReportUploader.AlwaysSendCheck());
    }

    public void trimSessionFiles(int i) {
        File fatalSessionFilesDir = getFatalSessionFilesDir();
        Comparator<File> comparator = SMALLEST_FILE_NAME_FIRST;
        int capFileCount = i - Utils.capFileCount(fatalSessionFilesDir, i, comparator);
        Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, capFileCount - Utils.capFileCount(getNonFatalSessionFilesDir(), capFileCount, comparator), comparator);
    }

    public void writeNonFatalException(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.backgroundWorker.submit(new Runnable() { // from class: com.crashlytics.android.core.CrashlyticsController.9
            @Override // java.lang.Runnable
            public void run() {
                if (CrashlyticsController.this.isHandlingException()) {
                    return;
                }
                CrashlyticsController.this.doWriteNonFatal(date, thread, th);
            }
        });
    }

    public void writeToLog(final long j, final String str) {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.8
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                if (CrashlyticsController.this.isHandlingException()) {
                    return null;
                }
                CrashlyticsController.this.logFileManager.writeToLog(j, str);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void doCloseSessions(SessionSettingsData sessionSettingsData, boolean z) throws Exception {
        trimOpenSessions((z ? 1 : 0) + 8);
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        int length = listSortedSessionBeginFiles.length;
        String a = C0059ao.a(11172);
        if (length <= z) {
            Fabric.getLogger().d(a, C0059ao.a(11173));
            return;
        }
        writeSessionUser(getSessionIdFromSessionFile(listSortedSessionBeginFiles[z ? 1 : 0]));
        if (sessionSettingsData == null) {
            Fabric.getLogger().d(a, C0059ao.a(11174));
            return;
        }
        closeOpenSessions(listSortedSessionBeginFiles, z ? 1 : 0, sessionSettingsData.maxCustomExceptionEvents);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File[] listFilesMatching(FilenameFilter filenameFilter) {
        return listFilesMatching(getFilesDir(), filenameFilter);
    }

    private File[] listFilesMatching(File file, FilenameFilter filenameFilter) {
        return ensureFileArrayNotNull(file.listFiles(filenameFilter));
    }

    private void recursiveDelete(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }
}
