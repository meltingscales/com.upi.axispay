package com.appsflyer.internal.model.event;

import android.content.Context;
import com.appsflyer.AFEvent;
import com.appsflyer.AFHelper;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class BackgroundEvent extends AFEvent {

    /* renamed from: ȷ  reason: contains not printable characters */
    private final boolean f292;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final boolean f293;

    /* renamed from: ɪ  reason: contains not printable characters */
    private boolean f294;

    public BackgroundEvent() {
        this(null, null, null, null, null);
    }

    public String body() {
        return AFHelper.toJsonObject(params()).toString();
    }

    public boolean proxyMode() {
        return this.f292;
    }

    public boolean readResponse() {
        return this.f293;
    }

    public BackgroundEvent trackingStopped(boolean z) {
        this.f294 = z;
        return this;
    }

    public BackgroundEvent(String str, Boolean bool, Boolean bool2, Boolean bool3, Context context) {
        super(str, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        this.f293 = bool != null ? bool.booleanValue() : true;
        this.f292 = bool2 != null ? bool2.booleanValue() : true;
    }

    public boolean trackingStopped() {
        return this.f294;
    }
}
