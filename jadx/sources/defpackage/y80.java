package defpackage;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.upi.axispay.R;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: y80  reason: default package */
/* loaded from: classes.dex */
public final class y80 {
    public static y80 c;
    public final Map<b, Tracker> a = new HashMap();
    public final Context b;

    /* compiled from: AxisPay */
    /* renamed from: y80$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: y80$b */
    /* loaded from: classes.dex */
    public enum b {
        APP
    }

    public y80(Context context) {
        this.b = context.getApplicationContext();
    }

    public static synchronized y80 b() {
        y80 y80Var;
        synchronized (y80.class) {
            y80Var = c;
            if (y80Var == null) {
                throw new IllegalStateException(C0059ao.a(5567));
            }
        }
        return y80Var;
    }

    public static synchronized void c(Context context) {
        synchronized (y80.class) {
            if (c == null) {
                c = new y80(context);
            } else {
                throw new IllegalStateException(C0059ao.a(5568));
            }
        }
    }

    public synchronized Tracker a(b bVar) {
        if (!this.a.containsKey(bVar)) {
            if (a.a[bVar.ordinal()] == 1) {
                this.a.put(bVar, GoogleAnalytics.getInstance(this.b).newTracker(R.xml.app_tracker_live));
            } else {
                throw new IllegalArgumentException(C0059ao.a(5569) + bVar);
            }
        }
        return this.a.get(bVar);
    }
}
