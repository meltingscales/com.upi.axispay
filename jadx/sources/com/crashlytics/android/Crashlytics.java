package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsListener;
import com.crashlytics.android.core.PinningInfoProvider;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.KitGroup;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Crashlytics extends Kit<Void> implements KitGroup {
    public static final String TAG = null;
    public final Answers answers;
    public final Beta beta;
    public final CrashlyticsCore core;
    public final Collection<? extends Kit> kits;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Builder {
        private Answers answers;
        private Beta beta;
        private CrashlyticsCore core;
        private CrashlyticsCore.Builder coreBuilder;

        private synchronized CrashlyticsCore.Builder getCoreBuilder() {
            if (this.coreBuilder == null) {
                this.coreBuilder = new CrashlyticsCore.Builder();
            }
            return this.coreBuilder;
        }

        public Builder answers(Answers answers) {
            Objects.requireNonNull(answers, C0059ao.a(4701));
            if (this.answers == null) {
                this.answers = answers;
                return this;
            }
            throw new IllegalStateException(C0059ao.a(4702));
        }

        public Builder beta(Beta beta) {
            Objects.requireNonNull(beta, C0059ao.a(4703));
            if (this.beta == null) {
                this.beta = beta;
                return this;
            }
            throw new IllegalStateException(C0059ao.a(4704));
        }

        public Crashlytics build() {
            CrashlyticsCore.Builder builder = this.coreBuilder;
            if (builder != null) {
                if (this.core == null) {
                    this.core = builder.build();
                } else {
                    throw new IllegalStateException(C0059ao.a(4705));
                }
            }
            if (this.answers == null) {
                this.answers = new Answers();
            }
            if (this.beta == null) {
                this.beta = new Beta();
            }
            if (this.core == null) {
                this.core = new CrashlyticsCore();
            }
            return new Crashlytics(this.answers, this.beta, this.core);
        }

        public Builder core(CrashlyticsCore crashlyticsCore) {
            Objects.requireNonNull(crashlyticsCore, C0059ao.a(4706));
            if (this.core == null) {
                this.core = crashlyticsCore;
                return this;
            }
            throw new IllegalStateException(C0059ao.a(4707));
        }

        @Deprecated
        public Builder delay(float f) {
            getCoreBuilder().delay(f);
            return this;
        }

        @Deprecated
        public Builder disabled(boolean z) {
            getCoreBuilder().disabled(z);
            return this;
        }

        @Deprecated
        public Builder listener(CrashlyticsListener crashlyticsListener) {
            getCoreBuilder().listener(crashlyticsListener);
            return this;
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider) {
            getCoreBuilder().pinningInfo(pinningInfoProvider);
            return this;
        }
    }

    static {
        C0059ao.a(Crashlytics.class, 398);
    }

    public Crashlytics() {
        this(new Answers(), new Beta(), new CrashlyticsCore());
    }

    private static void checkInitialized() {
        if (getInstance() == null) {
            throw new IllegalStateException(C0059ao.a(10078));
        }
    }

    public static Crashlytics getInstance() {
        return (Crashlytics) Fabric.getKit(Crashlytics.class);
    }

    public static PinningInfoProvider getPinningInfoProvider() {
        checkInitialized();
        return getInstance().core.getPinningInfoProvider();
    }

    public static void log(String str) {
        checkInitialized();
        getInstance().core.log(str);
    }

    public static void logException(Throwable th) {
        checkInitialized();
        getInstance().core.logException(th);
    }

    public static void setBool(String str, boolean z) {
        checkInitialized();
        getInstance().core.setBool(str, z);
    }

    public static void setDouble(String str, double d) {
        checkInitialized();
        getInstance().core.setDouble(str, d);
    }

    public static void setFloat(String str, float f) {
        checkInitialized();
        getInstance().core.setFloat(str, f);
    }

    public static void setInt(String str, int i) {
        checkInitialized();
        getInstance().core.setInt(str, i);
    }

    public static void setLong(String str, long j) {
        checkInitialized();
        getInstance().core.setLong(str, j);
    }

    @Deprecated
    public static void setPinningInfoProvider(PinningInfoProvider pinningInfoProvider) {
        Fabric.getLogger().w(C0059ao.a(10079), C0059ao.a(10080));
    }

    public static void setString(String str, String str2) {
        checkInitialized();
        getInstance().core.setString(str, str2);
    }

    public static void setUserEmail(String str) {
        checkInitialized();
        getInstance().core.setUserEmail(str);
    }

    public static void setUserIdentifier(String str) {
        checkInitialized();
        getInstance().core.setUserIdentifier(str);
    }

    public static void setUserName(String str) {
        checkInitialized();
        getInstance().core.setUserName(str);
    }

    public void crash() {
        this.core.crash();
    }

    @Override // io.fabric.sdk.android.Kit
    public Void doInBackground() {
        return null;
    }

    @Deprecated
    public boolean getDebugMode() {
        Fabric.getLogger().w(C0059ao.a(10081), C0059ao.a(10082));
        getFabric();
        return Fabric.isDebuggable();
    }

    @Override // io.fabric.sdk.android.Kit
    public String getIdentifier() {
        return C0059ao.a(10083);
    }

    @Override // io.fabric.sdk.android.KitGroup
    public Collection<? extends Kit> getKits() {
        return this.kits;
    }

    @Override // io.fabric.sdk.android.Kit
    public String getVersion() {
        return C0059ao.a(10084);
    }

    @Deprecated
    public void setDebugMode(boolean z) {
        Fabric.getLogger().w(C0059ao.a(10085), C0059ao.a(10086));
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        this.core.setListener(crashlyticsListener);
    }

    public boolean verifyPinning(URL url) {
        return this.core.verifyPinning(url);
    }

    public Crashlytics(Answers answers, Beta beta, CrashlyticsCore crashlyticsCore) {
        this.answers = answers;
        this.beta = beta;
        this.core = crashlyticsCore;
        this.kits = Collections.unmodifiableCollection(Arrays.asList(answers, beta, crashlyticsCore));
    }

    public static void log(int i, String str, String str2) {
        checkInitialized();
        getInstance().core.log(i, str, str2);
    }
}
