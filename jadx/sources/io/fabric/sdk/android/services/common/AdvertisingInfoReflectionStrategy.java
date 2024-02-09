package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AdvertisingInfoReflectionStrategy implements AdvertisingInfoStrategy {
    private static final String CLASS_NAME_ADVERTISING_ID_CLIENT = null;
    private static final String CLASS_NAME_ADVERTISING_ID_CLIENT_INFO = null;
    private static final String CLASS_NAME_GOOGLE_PLAY_SERVICES_UTILS = null;
    private static final int GOOGLE_PLAY_SERVICES_SUCCESS_CODE = 0;
    private static final String METHOD_NAME_GET_ADVERTISING_ID_INFO = null;
    private static final String METHOD_NAME_GET_ID = null;
    private static final String METHOD_NAME_IS_GOOGLE_PLAY_SERVICES_AVAILABLE = null;
    private static final String METHOD_NAME_IS_LIMITED_AD_TRACKING_ENABLED = null;
    private final Context context;

    static {
        C0059ao.a(AdvertisingInfoReflectionStrategy.class, 137);
    }

    public AdvertisingInfoReflectionStrategy(Context context) {
        this.context = context.getApplicationContext();
    }

    private String getAdvertisingId() {
        try {
            return (String) Class.forName(C0059ao.a(9878)).getMethod(C0059ao.a(9879), new Class[0]).invoke(getInfo(), new Object[0]);
        } catch (Exception unused) {
            Fabric.getLogger().w(C0059ao.a(9880), C0059ao.a(9881));
            return null;
        }
    }

    private Object getInfo() {
        try {
            return Class.forName(C0059ao.a(9882)).getMethod(C0059ao.a(9883), Context.class).invoke(null, this.context);
        } catch (Exception unused) {
            Fabric.getLogger().w(C0059ao.a(9884), C0059ao.a(9885));
            return null;
        }
    }

    private boolean isLimitAdTrackingEnabled() {
        try {
            return ((Boolean) Class.forName(C0059ao.a(9886)).getMethod(C0059ao.a(9887), new Class[0]).invoke(getInfo(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            Fabric.getLogger().w(C0059ao.a(9888), C0059ao.a(9889));
            return false;
        }
    }

    @Override // io.fabric.sdk.android.services.common.AdvertisingInfoStrategy
    public AdvertisingInfo getAdvertisingInfo() {
        if (isGooglePlayServiceAvailable(this.context)) {
            return new AdvertisingInfo(getAdvertisingId(), isLimitAdTrackingEnabled());
        }
        return null;
    }

    public boolean isGooglePlayServiceAvailable(Context context) {
        try {
            return ((Integer) Class.forName(C0059ao.a(9890)).getMethod(C0059ao.a(9891), Context.class).invoke(null, context)).intValue() == 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
