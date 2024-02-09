package com.crashlytics.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DevicePowerStateListener {
    private static final IntentFilter FILTER_BATTERY_CHANGED = new IntentFilter(C0059ao.a(6144));
    private static final IntentFilter FILTER_POWER_CONNECTED = new IntentFilter(C0059ao.a(6145));
    private static final IntentFilter FILTER_POWER_DISCONNECTED = new IntentFilter(C0059ao.a(6146));
    private final Context context;
    private boolean isPowerConnected;
    private final BroadcastReceiver powerConnectedReceiver = new BroadcastReceiver() { // from class: com.crashlytics.android.core.DevicePowerStateListener.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DevicePowerStateListener.this.isPowerConnected = true;
        }
    };
    private final BroadcastReceiver powerDisconnectedReceiver = new BroadcastReceiver() { // from class: com.crashlytics.android.core.DevicePowerStateListener.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DevicePowerStateListener.this.isPowerConnected = false;
        }
    };
    private final AtomicBoolean receiversRegistered = new AtomicBoolean(false);

    public DevicePowerStateListener(Context context) {
        this.context = context;
    }

    public void dispose() {
        if (this.receiversRegistered.getAndSet(false)) {
            this.context.unregisterReceiver(this.powerConnectedReceiver);
            this.context.unregisterReceiver(this.powerDisconnectedReceiver);
        }
    }

    public void initialize() {
        boolean z = true;
        if (this.receiversRegistered.getAndSet(true)) {
            return;
        }
        Intent registerReceiver = this.context.registerReceiver(null, FILTER_BATTERY_CHANGED);
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(C0059ao.a(6147), -1) : -1;
        if (intExtra != 2 && intExtra != 5) {
            z = false;
        }
        this.isPowerConnected = z;
        this.context.registerReceiver(this.powerConnectedReceiver, FILTER_POWER_CONNECTED);
        this.context.registerReceiver(this.powerDisconnectedReceiver, FILTER_POWER_DISCONNECTED);
    }

    public boolean isPowerConnected() {
        return this.isPowerConnected;
    }
}
