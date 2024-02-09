package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class p implements SensorEventListener {

    /* renamed from: ı  reason: contains not printable characters */
    public double f303;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final String f304;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f305;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Executor f307;

    /* renamed from: Ι  reason: contains not printable characters */
    public long f308;

    /* renamed from: І  reason: contains not printable characters */
    private final String f310;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final int f311;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final float[][] f306 = new float[2];

    /* renamed from: ι  reason: contains not printable characters */
    public final long[] f309 = new long[2];

    public p(Sensor sensor, Executor executor) {
        this.f307 = executor;
        int type = sensor.getType();
        this.f305 = type;
        String name = sensor.getName();
        String a = C0059ao.a(12293);
        name = name == null ? a : name;
        this.f304 = name;
        String vendor = sensor.getVendor();
        a = vendor != null ? vendor : a;
        this.f310 = a;
        this.f311 = ((((type + 31) * 31) + name.hashCode()) * 31) + a.hashCode();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static List<Float> m207(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static double m209(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m211(Sensor sensor) {
        return (sensor == null || sensor.getName() == null || sensor.getVendor() == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return m213(pVar.f305, pVar.f304, pVar.f310);
        }
        return false;
    }

    public final int hashCode() {
        return this.f311;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        this.f307.execute(new Runnable() { // from class: com.appsflyer.internal.p.5
            @Override // java.lang.Runnable
            public final void run() {
                SensorEvent sensorEvent2 = sensorEvent;
                if (sensorEvent2 == null || sensorEvent2.values == null || !p.m211(sensorEvent2.sensor)) {
                    return;
                }
                p pVar = p.this;
                int type = sensorEvent.sensor.getType();
                String name = sensorEvent.sensor.getName();
                String vendor = sensorEvent.sensor.getVendor();
                SensorEvent sensorEvent3 = sensorEvent;
                long j = sensorEvent3.timestamp;
                float[] fArr = sensorEvent3.values;
                if (pVar.m213(type, name, vendor)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    float[][] fArr2 = pVar.f306;
                    float[] fArr3 = fArr2[0];
                    if (fArr3 == null) {
                        fArr2[0] = Arrays.copyOf(fArr, fArr.length);
                        pVar.f309[0] = currentTimeMillis;
                        return;
                    }
                    float[] fArr4 = fArr2[1];
                    if (fArr4 == null) {
                        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                        pVar.f306[1] = copyOf;
                        pVar.f309[1] = currentTimeMillis;
                        pVar.f303 = p.m209(fArr3, copyOf);
                    } else if (50000000 <= j - pVar.f308) {
                        pVar.f308 = j;
                        if (Arrays.equals(fArr4, fArr)) {
                            pVar.f309[1] = currentTimeMillis;
                            return;
                        }
                        double m209 = p.m209(fArr3, fArr);
                        if (m209 > pVar.f303) {
                            pVar.f306[1] = Arrays.copyOf(fArr, fArr.length);
                            pVar.f309[1] = currentTimeMillis;
                            pVar.f303 = m209;
                        }
                    }
                }
            }
        });
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m212(Map<p, Map<String, Object>> map, boolean z) {
        if (m208()) {
            map.put(this, m210());
            if (z) {
                int length = this.f306.length;
                for (int i = 0; i < length; i++) {
                    this.f306[i] = null;
                }
                int length2 = this.f309.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.f309[i2] = 0;
                }
                this.f303 = 0.0d;
                this.f308 = 0L;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, m210());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m208() {
        return this.f306[0] != null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m213(int i, String str, String str2) {
        return this.f305 == i && this.f304.equals(str) && this.f310.equals(str2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private Map<String, Object> m210() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put(C0059ao.a(12294), Integer.valueOf(this.f305));
        concurrentHashMap.put(C0059ao.a(12295), this.f304);
        concurrentHashMap.put(C0059ao.a(12296), this.f310);
        float[] fArr = this.f306[0];
        if (fArr != null) {
            concurrentHashMap.put(C0059ao.a(12297), m207(fArr));
        }
        float[] fArr2 = this.f306[1];
        if (fArr2 != null) {
            concurrentHashMap.put(C0059ao.a(12298), m207(fArr2));
        }
        return concurrentHashMap;
    }
}
