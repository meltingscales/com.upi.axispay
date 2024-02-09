package com.appsflyer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.internal.p;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class AFSensorManager {
    public static volatile AFSensorManager sInstance;

    /* renamed from: ɪ  reason: contains not printable characters */
    private static final Handler f40;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final BitSet f41;

    /* renamed from: ı  reason: contains not printable characters */
    public final Runnable f42;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public int f43;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Handler f44;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final Map<p, p> f45;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final Map<p, Map<String, Object>> f46;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object f47 = new Object();

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Runnable f48;

    /* renamed from: ɾ  reason: contains not printable characters */
    private boolean f49;

    /* renamed from: Ι  reason: contains not printable characters */
    public final Runnable f50;

    /* renamed from: ι  reason: contains not printable characters */
    public boolean f51;

    /* renamed from: І  reason: contains not printable characters */
    public final Executor f52;

    /* renamed from: г  reason: contains not printable characters */
    private final Runnable f53;

    /* renamed from: і  reason: contains not printable characters */
    public long f54;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final SensorManager f55;

    /* compiled from: AxisPay */
    /* renamed from: com.appsflyer.AFSensorManager$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements Runnable {
        public AnonymousClass6() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!AFSensorManager.this.f45.isEmpty()) {
                    for (p pVar : AFSensorManager.this.f45.values()) {
                        AFSensorManager.this.f55.unregisterListener(pVar);
                        pVar.m212(AFSensorManager.this.f46, true);
                    }
                }
            } catch (Throwable unused) {
            }
            AFSensorManager.this.f43 = 0;
            AFSensorManager.this.f49 = false;
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        f41 = bitSet;
        f40 = new Handler(Looper.getMainLooper());
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFSensorManager(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = f41;
        this.f45 = new HashMap(bitSet.size());
        this.f46 = new ConcurrentHashMap(bitSet.size());
        this.f50 = new Runnable() { // from class: com.appsflyer.AFSensorManager.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFSensorManager.this.f47) {
                    final AFSensorManager aFSensorManager = AFSensorManager.this;
                    aFSensorManager.f52.execute(new Runnable() { // from class: com.appsflyer.AFSensorManager.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : AFSensorManager.this.f55.getSensorList(-1)) {
                                    if (AFSensorManager.m26(sensor.getType())) {
                                        p pVar = new p(sensor, AFSensorManager.this.f52);
                                        if (!AFSensorManager.this.f45.containsKey(pVar)) {
                                            AFSensorManager.this.f45.put(pVar, pVar);
                                        }
                                        AFSensorManager.this.f55.registerListener((SensorEventListener) AFSensorManager.this.f45.get(pVar), sensor, 0);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            AFSensorManager.this.f49 = true;
                        }
                    });
                    AFSensorManager aFSensorManager2 = AFSensorManager.this;
                    aFSensorManager2.f44.postDelayed(aFSensorManager2.f53, 100L);
                    AFSensorManager.this.f51 = true;
                }
            }
        };
        this.f42 = new Runnable() { // from class: com.appsflyer.AFSensorManager.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFSensorManager.this.f47) {
                    AFSensorManager aFSensorManager = AFSensorManager.this;
                    aFSensorManager.f52.execute(new AnonymousClass6());
                }
            }
        };
        this.f48 = new Runnable() { // from class: com.appsflyer.AFSensorManager.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFSensorManager.this.f47) {
                    AFSensorManager aFSensorManager = AFSensorManager.this;
                    if (aFSensorManager.f51) {
                        aFSensorManager.f44.removeCallbacks(aFSensorManager.f50);
                        AFSensorManager aFSensorManager2 = AFSensorManager.this;
                        aFSensorManager2.f44.removeCallbacks(aFSensorManager2.f42);
                        AFSensorManager aFSensorManager3 = AFSensorManager.this;
                        aFSensorManager3.f52.execute(new AnonymousClass6());
                        AFSensorManager.this.f51 = false;
                    }
                }
            }
        };
        this.f43 = 1;
        this.f54 = 0L;
        this.f53 = new Runnable() { // from class: com.appsflyer.AFSensorManager.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFSensorManager.this.f47) {
                    if (AFSensorManager.this.f43 == 0) {
                        AFSensorManager.this.f43 = 1;
                    }
                    AFSensorManager aFSensorManager = AFSensorManager.this;
                    aFSensorManager.f44.postDelayed(aFSensorManager.f42, aFSensorManager.f43 * 500);
                }
            }
        };
        this.f52 = Executors.newSingleThreadExecutor();
        this.f55 = sensorManager;
        this.f44 = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m26(int i) {
        return i >= 0 && f41.get(i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static AFSensorManager m32(Context context) {
        if (sInstance != null) {
            return sInstance;
        }
        return m33((SensorManager) context.getApplicationContext().getSystemService(C0059ao.a(4808)), f40);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final List<Map<String, Object>> m37() {
        synchronized (this.f47) {
            if (!this.f45.isEmpty() && this.f49) {
                for (p pVar : this.f45.values()) {
                    pVar.m212(this.f46, false);
                }
            }
            if (this.f46.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.f46.values());
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final List<Map<String, Object>> m38() {
        for (p pVar : this.f45.values()) {
            pVar.m212(this.f46, true);
        }
        Map<p, Map<String, Object>> map = this.f46;
        if (map != null && !map.isEmpty()) {
            return new CopyOnWriteArrayList(this.f46.values());
        }
        return new CopyOnWriteArrayList(Collections.emptyList());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static AFSensorManager m33(SensorManager sensorManager, Handler handler) {
        if (sInstance == null) {
            synchronized (AFSensorManager.class) {
                if (sInstance == null) {
                    sInstance = new AFSensorManager(sensorManager, handler);
                }
            }
        }
        return sInstance;
    }
}
