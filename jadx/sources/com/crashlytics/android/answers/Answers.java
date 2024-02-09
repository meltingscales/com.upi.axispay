package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.Crash;
import io.fabric.sdk.android.services.common.FirebaseInfo;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.File;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Answers extends Kit<Boolean> {
    public static final String CRASHLYTICS_API_ENDPOINT = null;
    public static final String TAG = null;
    public SessionAnalyticsManager analyticsManager;
    public boolean firebaseEnabled = false;

    static {
        C0059ao.a(Answers.class, 236);
    }

    public static Answers getInstance() {
        return (Answers) Fabric.getKit(Answers.class);
    }

    private void logFirebaseModeEnabledWarning(String str) {
        Logger logger = Fabric.getLogger();
        logger.w(C0059ao.a(2712), C0059ao.a(2710) + str + C0059ao.a(2711));
    }

    @Override // io.fabric.sdk.android.Kit
    public String getIdentifier() {
        return C0059ao.a(2718);
    }

    public String getOverridenSpiEndpoint() {
        return CommonUtils.getStringsFileValue(getContext(), C0059ao.a(2719));
    }

    @Override // io.fabric.sdk.android.Kit
    public String getVersion() {
        return C0059ao.a(2720);
    }

    public void logAddToCart(AddToCartEvent addToCartEvent) {
        Objects.requireNonNull(addToCartEvent, C0059ao.a(2721));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2722));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(addToCartEvent);
        }
    }

    public void logContentView(ContentViewEvent contentViewEvent) {
        Objects.requireNonNull(contentViewEvent, C0059ao.a(2723));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2724));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(contentViewEvent);
        }
    }

    public void logCustom(CustomEvent customEvent) {
        Objects.requireNonNull(customEvent, C0059ao.a(2725));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2726));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onCustom(customEvent);
        }
    }

    public void logInvite(InviteEvent inviteEvent) {
        Objects.requireNonNull(inviteEvent, C0059ao.a(2727));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2728));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(inviteEvent);
        }
    }

    public void logLevelEnd(LevelEndEvent levelEndEvent) {
        Objects.requireNonNull(levelEndEvent, C0059ao.a(2729));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2730));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(levelEndEvent);
        }
    }

    public void logLevelStart(LevelStartEvent levelStartEvent) {
        Objects.requireNonNull(levelStartEvent, C0059ao.a(2731));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2732));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(levelStartEvent);
        }
    }

    public void logLogin(LoginEvent loginEvent) {
        Objects.requireNonNull(loginEvent, C0059ao.a(2733));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2734));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(loginEvent);
        }
    }

    public void logPurchase(PurchaseEvent purchaseEvent) {
        Objects.requireNonNull(purchaseEvent, C0059ao.a(2735));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2736));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(purchaseEvent);
        }
    }

    public void logRating(RatingEvent ratingEvent) {
        Objects.requireNonNull(ratingEvent, C0059ao.a(2737));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2738));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(ratingEvent);
        }
    }

    public void logSearch(SearchEvent searchEvent) {
        Objects.requireNonNull(searchEvent, C0059ao.a(2739));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2740));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(searchEvent);
        }
    }

    public void logShare(ShareEvent shareEvent) {
        Objects.requireNonNull(shareEvent, C0059ao.a(2741));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2742));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(shareEvent);
        }
    }

    public void logSignUp(SignUpEvent signUpEvent) {
        Objects.requireNonNull(signUpEvent, C0059ao.a(2743));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2744));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(signUpEvent);
        }
    }

    public void logStartCheckout(StartCheckoutEvent startCheckoutEvent) {
        Objects.requireNonNull(startCheckoutEvent, C0059ao.a(2745));
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning(C0059ao.a(2746));
            return;
        }
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(startCheckoutEvent);
        }
    }

    public void onException(Crash.LoggedException loggedException) {
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onError(loggedException.getSessionId());
        }
    }

    @Override // io.fabric.sdk.android.Kit
    @SuppressLint({"NewApi"})
    public boolean onPreExecute() {
        long lastModified;
        try {
            Context context = getContext();
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str = packageInfo.versionName;
            if (str == null) {
                str = C0059ao.a(2747);
            }
            if (Build.VERSION.SDK_INT >= 9) {
                lastModified = packageInfo.firstInstallTime;
            } else {
                lastModified = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            SessionAnalyticsManager build = SessionAnalyticsManager.build(this, context, getIdManager(), num, str, lastModified);
            this.analyticsManager = build;
            build.enable();
            this.firebaseEnabled = new FirebaseInfo().isFirebaseCrashlyticsEnabled(context);
            return true;
        } catch (Exception e) {
            Fabric.getLogger().e(C0059ao.a(2748), C0059ao.a(2749), e);
            return false;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.fabric.sdk.android.Kit
    public Boolean doInBackground() {
        String a = C0059ao.a(2713);
        try {
            SettingsData awaitSettingsData = Settings.getInstance().awaitSettingsData();
            if (awaitSettingsData == null) {
                Fabric.getLogger().e(a, C0059ao.a(2714));
                return Boolean.FALSE;
            } else if (awaitSettingsData.featuresData.collectAnalytics) {
                Fabric.getLogger().d(a, C0059ao.a(2715));
                this.analyticsManager.setAnalyticsSettingsData(awaitSettingsData.analyticsSettingsData, getOverridenSpiEndpoint());
                return Boolean.TRUE;
            } else {
                Fabric.getLogger().d(a, C0059ao.a(2716));
                this.analyticsManager.disable();
                return Boolean.FALSE;
            }
        } catch (Exception e) {
            Fabric.getLogger().e(a, C0059ao.a(2717), e);
            return Boolean.FALSE;
        }
    }

    public void onException(Crash.FatalException fatalException) {
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onCrash(fatalException.getSessionId(), fatalException.getExceptionName());
        }
    }
}
