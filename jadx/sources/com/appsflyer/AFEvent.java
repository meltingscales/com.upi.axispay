package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class AFEvent {

    /* renamed from: ı  reason: contains not printable characters */
    public Map<String, Object> f7;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public String f8;

    /* renamed from: ǃ  reason: contains not printable characters */
    public Intent f9;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final boolean f10;

    /* renamed from: ɨ  reason: contains not printable characters */
    private Map<String, Object> f11;

    /* renamed from: ɩ  reason: contains not printable characters */
    public WeakReference<Context> f12;

    /* renamed from: ɪ  reason: contains not printable characters */
    private AppsFlyerRequestListener f13;

    /* renamed from: ɹ  reason: contains not printable characters */
    public String f14;

    /* renamed from: ɾ  reason: contains not printable characters */
    public boolean f15;

    /* renamed from: ʟ  reason: contains not printable characters */
    private String f16;

    /* renamed from: Ι  reason: contains not printable characters */
    public AppsFlyerTrackingRequestListener f17;

    /* renamed from: ι  reason: contains not printable characters */
    public Context f18;

    /* renamed from: І  reason: contains not printable characters */
    public String f19;

    /* renamed from: г  reason: contains not printable characters */
    private byte[] f20;

    /* renamed from: і  reason: contains not printable characters */
    public String f21;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public String f22;

    /* renamed from: ӏ  reason: contains not printable characters */
    public int f23;

    public AFEvent() {
        this(null, null, null);
    }

    public String addChannel(String str) {
        String configuredChannel = AppsFlyerLibCore.getInstance().getConfiguredChannel(context());
        return configuredChannel != null ? Uri.parse(str).buildUpon().appendQueryParameter(C0059ao.a(3899), configuredChannel).build().toString() : str;
    }

    public AFEvent context(Context context) {
        this.f18 = context;
        return this;
    }

    public AppsFlyerRequestListener getRequestListener() {
        return this.f13;
    }

    public Intent intent() {
        return this.f9;
    }

    public boolean isEncrypt() {
        return this.f10;
    }

    public AFEvent key(String str) {
        this.f16 = str;
        return this;
    }

    public AFEvent params(Map<String, ?> map) {
        this.f11 = map;
        return this;
    }

    public AFEvent post(byte[] bArr) {
        this.f20 = bArr;
        return this;
    }

    public AFEvent requestListener(AppsFlyerRequestListener appsFlyerRequestListener) {
        this.f13 = appsFlyerRequestListener;
        return this;
    }

    public AFEvent urlString(String str) {
        this.f8 = str;
        return this;
    }

    public AFEvent weakContext() {
        this.f12 = new WeakReference<>(this.f18);
        this.f18 = null;
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final byte[] m7() {
        return this.f20;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final AFEvent m8() {
        if (context() != null) {
            this.f18 = context().getApplicationContext();
        }
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m9() {
        return this.f15;
    }

    public AFEvent(String str, Boolean bool, Context context) {
        this.f21 = str;
        this.f10 = bool != null ? bool.booleanValue() : true;
        this.f18 = context;
    }

    public Context context() {
        Context context = this.f18;
        if (context != null) {
            return context;
        }
        WeakReference<Context> weakReference = this.f12;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public String key() {
        return this.f16;
    }

    public Map<String, Object> params() {
        return this.f11;
    }

    public String urlString() {
        return this.f8;
    }
}
