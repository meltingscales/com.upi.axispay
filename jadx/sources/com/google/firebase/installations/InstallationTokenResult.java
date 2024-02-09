package com.google.firebase.installations;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.AutoValue_InstallationTokenResult;

/* compiled from: AxisPay */
@AutoValue
/* loaded from: classes.dex */
public abstract class InstallationTokenResult {

    /* compiled from: AxisPay */
    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract InstallationTokenResult build();

        public abstract Builder setToken(String str);

        public abstract Builder setTokenCreationTimestamp(long j);

        public abstract Builder setTokenExpirationTimestamp(long j);
    }

    public static Builder builder() {
        return new AutoValue_InstallationTokenResult.Builder();
    }

    public abstract String getToken();

    public abstract long getTokenCreationTimestamp();

    public abstract long getTokenExpirationTimestamp();

    public abstract Builder toBuilder();
}
