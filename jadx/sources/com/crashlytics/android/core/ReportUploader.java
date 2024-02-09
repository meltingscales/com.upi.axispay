package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.BackgroundPriorityRunnable;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ReportUploader {
    public static final Map<String, String> HEADER_INVALID_CLS_FILE = Collections.singletonMap(C0059ao.a(10058), C0059ao.a(10059));
    private static final short[] RETRY_INTERVALS = {10, 20, 30, 60, 120, 300};
    private final String apiKey;
    private final CreateReportSpiCall createReportCall;
    private final Object fileAccessLock = new Object();
    private final HandlingExceptionCheck handlingExceptionCheck;
    private final ReportFilesProvider reportFilesProvider;
    private Thread uploadThread;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class AlwaysSendCheck implements SendCheck {
        @Override // com.crashlytics.android.core.ReportUploader.SendCheck
        public boolean canSendReports() {
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface HandlingExceptionCheck {
        boolean isHandlingException();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface ReportFilesProvider {
        File[] getCompleteSessionFiles();

        File[] getInvalidSessionFiles();

        File[] getNativeReportFiles();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface SendCheck {
        boolean canSendReports();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class Worker extends BackgroundPriorityRunnable {
        private final float delay;
        private final SendCheck sendCheck;

        public Worker(float f, SendCheck sendCheck) {
            this.delay = f;
            this.sendCheck = sendCheck;
        }

        private void attemptUploadWithRetry() {
            float f;
            String a = C0059ao.a(14735);
            Fabric.getLogger().d(a, C0059ao.a(14733) + this.delay + C0059ao.a(14734));
            if (this.delay > 0.0f) {
                try {
                    Thread.sleep(f * 1000.0f);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<Report> findReports = ReportUploader.this.findReports();
            if (ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                return;
            }
            if (!findReports.isEmpty() && !this.sendCheck.canSendReports()) {
                Fabric.getLogger().d(a, C0059ao.a(14736) + findReports.size() + C0059ao.a(14737));
                for (Report report : findReports) {
                    report.remove();
                }
                return;
            }
            int i = 0;
            while (!findReports.isEmpty() && !ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                Fabric.getLogger().d(a, C0059ao.a(14738) + findReports.size() + C0059ao.a(14739));
                for (Report report2 : findReports) {
                    ReportUploader.this.forceUpload(report2);
                }
                findReports = ReportUploader.this.findReports();
                if (!findReports.isEmpty()) {
                    int i2 = i + 1;
                    long j = ReportUploader.RETRY_INTERVALS[Math.min(i, ReportUploader.RETRY_INTERVALS.length - 1)];
                    Fabric.getLogger().d(a, C0059ao.a(14740) + j + C0059ao.a(14741));
                    try {
                        Thread.sleep(j * 1000);
                        i = i2;
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }

        @Override // io.fabric.sdk.android.services.common.BackgroundPriorityRunnable
        public void onRun() {
            try {
                attemptUploadWithRetry();
            } catch (Exception e) {
                Fabric.getLogger().e(C0059ao.a(14742), C0059ao.a(14743), e);
            }
            ReportUploader.this.uploadThread = null;
        }
    }

    public ReportUploader(String str, CreateReportSpiCall createReportSpiCall, ReportFilesProvider reportFilesProvider, HandlingExceptionCheck handlingExceptionCheck) {
        if (createReportSpiCall != null) {
            this.createReportCall = createReportSpiCall;
            this.apiKey = str;
            this.reportFilesProvider = reportFilesProvider;
            this.handlingExceptionCheck = handlingExceptionCheck;
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(10060));
    }

    public List<Report> findReports() {
        File[] completeSessionFiles;
        File[] invalidSessionFiles;
        File[] nativeReportFiles;
        Fabric.getLogger().d(C0059ao.a(10061), C0059ao.a(10062));
        synchronized (this.fileAccessLock) {
            completeSessionFiles = this.reportFilesProvider.getCompleteSessionFiles();
            invalidSessionFiles = this.reportFilesProvider.getInvalidSessionFiles();
            nativeReportFiles = this.reportFilesProvider.getNativeReportFiles();
        }
        LinkedList linkedList = new LinkedList();
        if (completeSessionFiles != null) {
            for (File file : completeSessionFiles) {
                Fabric.getLogger().d(C0059ao.a(10063), C0059ao.a(10064) + file.getPath());
                linkedList.add(new SessionReport(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (invalidSessionFiles != null) {
            for (File file2 : invalidSessionFiles) {
                String sessionIdFromSessionFile = CrashlyticsController.getSessionIdFromSessionFile(file2);
                if (!hashMap.containsKey(sessionIdFromSessionFile)) {
                    hashMap.put(sessionIdFromSessionFile, new LinkedList());
                }
                ((List) hashMap.get(sessionIdFromSessionFile)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            Fabric.getLogger().d(C0059ao.a(10065), C0059ao.a(10066) + str);
            List list = (List) hashMap.get(str);
            linkedList.add(new InvalidSessionReport(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (nativeReportFiles != null) {
            for (File file3 : nativeReportFiles) {
                linkedList.add(new NativeSessionReport(file3));
            }
        }
        if (linkedList.isEmpty()) {
            Fabric.getLogger().d(C0059ao.a(10067), C0059ao.a(10068));
        }
        return linkedList;
    }

    public boolean forceUpload(Report report) {
        boolean z;
        synchronized (this.fileAccessLock) {
            z = false;
            try {
                boolean invoke = this.createReportCall.invoke(new CreateReportRequest(this.apiKey, report));
                Logger logger = Fabric.getLogger();
                String a = C0059ao.a(10069);
                StringBuilder sb = new StringBuilder();
                sb.append(C0059ao.a(10070));
                sb.append(invoke ? C0059ao.a(10071) : C0059ao.a(10072));
                sb.append(report.getIdentifier());
                logger.i(a, sb.toString());
                if (invoke) {
                    report.remove();
                    z = true;
                }
            } catch (Exception e) {
                Fabric.getLogger().e(C0059ao.a(10073), C0059ao.a(10074) + report, e);
            }
        }
        return z;
    }

    public boolean isUploading() {
        return this.uploadThread != null;
    }

    public synchronized void uploadReports(float f, SendCheck sendCheck) {
        if (this.uploadThread != null) {
            Fabric.getLogger().d(C0059ao.a(10075), C0059ao.a(10076));
            return;
        }
        Thread thread = new Thread(new Worker(f, sendCheck), C0059ao.a(10077));
        this.uploadThread = thread;
        thread.start();
    }
}
