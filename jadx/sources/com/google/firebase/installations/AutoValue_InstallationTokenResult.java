package com.google.firebase.installations;

import com.google.firebase.installations.InstallationTokenResult;
import java.util.Objects;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class AutoValue_InstallationTokenResult extends InstallationTokenResult {
    private final String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Builder extends InstallationTokenResult.Builder {
        private String token;
        private Long tokenCreationTimestamp;
        private Long tokenExpirationTimestamp;

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult build() {
            String str = "";
            if (this.token == null) {
                str = " token";
            }
            if (this.tokenExpirationTimestamp == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.tokenCreationTimestamp == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_InstallationTokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.tokenCreationTimestamp.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setToken(String str) {
            Objects.requireNonNull(str, "Null token");
            this.token = str;
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenCreationTimestamp(long j) {
            this.tokenCreationTimestamp = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = Long.valueOf(j);
            return this;
        }

        public Builder() {
        }

        private Builder(InstallationTokenResult installationTokenResult) {
            this.token = installationTokenResult.getToken();
            this.tokenExpirationTimestamp = Long.valueOf(installationTokenResult.getTokenExpirationTimestamp());
            this.tokenCreationTimestamp = Long.valueOf(installationTokenResult.getTokenCreationTimestamp());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallationTokenResult) {
            InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
            return this.token.equals(installationTokenResult.getToken()) && this.tokenExpirationTimestamp == installationTokenResult.getTokenExpirationTimestamp() && this.tokenCreationTimestamp == installationTokenResult.getTokenCreationTimestamp();
        }
        return false;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        long j = this.tokenExpirationTimestamp;
        long j2 = this.tokenCreationTimestamp;
        return ((((this.token.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.token + ", tokenExpirationTimestamp=" + this.tokenExpirationTimestamp + ", tokenCreationTimestamp=" + this.tokenCreationTimestamp + "}";
    }

    private AutoValue_InstallationTokenResult(String str, long j, long j2) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.tokenCreationTimestamp = j2;
    }
}
