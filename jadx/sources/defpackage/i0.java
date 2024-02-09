package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: i0  reason: default package */
/* loaded from: classes.dex */
public class i0 {
    public static i0 d;
    public final Context a;
    public final LocationManager b;
    public final a c = new a();

    /* compiled from: AxisPay */
    /* renamed from: i0$a */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
    }

    public i0(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    public static i0 a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new i0(applicationContext, (LocationManager) applicationContext.getSystemService(C0059ao.a(6730)));
        }
        return d;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location c = v8.c(this.a, C0059ao.a(6731)) == 0 ? c(C0059ao.a(6732)) : null;
        Location c2 = v8.c(this.a, C0059ao.a(6733)) == 0 ? c(C0059ao.a(6734)) : null;
        return (c2 == null || c == null) ? c2 != null ? c2 : c : c2.getTime() > c.getTime() ? c2 : c;
    }

    public final Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location b = b();
        if (b != null) {
            f(b);
            return aVar.a;
        }
        Log.i(C0059ao.a(6735), C0059ao.a(6736));
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    public final boolean e() {
        return this.c.f > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j;
        a aVar = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        h0 b = h0.b();
        b.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b.a;
        b.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.c == 1;
        long j3 = b.b;
        long j4 = b.a;
        b.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = b.b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.a = z;
        aVar.b = j2;
        aVar.c = j3;
        aVar.d = j4;
        aVar.e = j5;
        aVar.f = j;
    }
}
