package io.fabric.sdk.android.services.common;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AdvertisingInfo {
    public final String advertisingId;
    public final boolean limitAdTrackingEnabled;

    public AdvertisingInfo(String str, boolean z) {
        this.advertisingId = str;
        this.limitAdTrackingEnabled = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdvertisingInfo advertisingInfo = (AdvertisingInfo) obj;
        if (this.limitAdTrackingEnabled != advertisingInfo.limitAdTrackingEnabled) {
            return false;
        }
        String str = this.advertisingId;
        String str2 = advertisingInfo.advertisingId;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        String str = this.advertisingId;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.limitAdTrackingEnabled ? 1 : 0);
    }
}
