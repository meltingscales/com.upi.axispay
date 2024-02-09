package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final CrashListener crashListener;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final boolean firebaseCrashlyticsClientFlag;
    private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
    private final SettingsDataProvider settingsDataProvider;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface CrashListener {
        void onUncaughtException(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface SettingsDataProvider {
        SettingsData getSettingsData();
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener, SettingsDataProvider settingsDataProvider, boolean z, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.crashListener = crashListener;
        this.settingsDataProvider = settingsDataProvider;
        this.firebaseCrashlyticsClientFlag = z;
        this.defaultHandler = uncaughtExceptionHandler;
    }

    public boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r4v3, types: [io.fabric.sdk.android.Logger] */
    /* JADX WARN: Type inference failed for: r5v1, types: [io.fabric.sdk.android.Logger] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ?? a = C0059ao.a(6099);
        String a2 = C0059ao.a(6100);
        this.isHandlingException.set(true);
        try {
            try {
                this.crashListener.onUncaughtException(this.settingsDataProvider, thread, th, this.firebaseCrashlyticsClientFlag);
            } catch (Exception e) {
                Fabric.getLogger().e(a2, C0059ao.a(6101), e);
            }
        } finally {
            Fabric.getLogger().d(a2, a);
            this.defaultHandler.uncaughtException(thread, th);
            this.isHandlingException.set(false);
        }
    }
}
