package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.vision.barcode.Barcode;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: cr  reason: default package */
/* loaded from: classes.dex */
public class cr implements wq {
    public final a a;
    public final ar b;
    public final Map<String, er> c;

    /* compiled from: AxisPay */
    /* renamed from: cr$a */
    /* loaded from: classes.dex */
    public static class a {
        public final Context a;
        public Map<String, String> b = null;

        public a(Context context) {
            this.a = context;
        }

        public static Bundle d(Context context) {
            String a = C0059ao.a(3063);
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(a, C0059ao.a(3064));
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), Barcode.ITF);
                if (serviceInfo == null) {
                    Log.w(a, C0059ao.a(3065));
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(a, C0059ao.a(3066));
                return null;
            }
        }

        public final Map<String, String> a(Context context) {
            Bundle d = d(context);
            if (d == null) {
                Log.w(C0059ao.a(3067), C0059ao.a(3068));
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith(C0059ao.a(3069))) {
                    for (String str2 : ((String) obj).split(C0059ao.a(3070), -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        public vq b(String str) {
            String a = C0059ao.a(3071);
            String a2 = C0059ao.a(3072);
            String a3 = C0059ao.a(3073);
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (vq) Class.forName(str2).asSubclass(vq.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w(a3, String.format(C0059ao.a(3074), str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w(a3, String.format(a2, str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w(a3, String.format(a2, str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w(a3, String.format(a, str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w(a3, String.format(a, str2), e5);
                return null;
            }
        }

        public final Map<String, String> c() {
            if (this.b == null) {
                this.b = a(this.a);
            }
            return this.b;
        }
    }

    public cr(Context context, ar arVar) {
        this(new a(context), arVar);
    }

    @Override // defpackage.wq
    public synchronized er a(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        vq b = this.a.b(str);
        if (b == null) {
            return null;
        }
        er create = b.create(this.b.a(str));
        this.c.put(str, create);
        return create;
    }

    public cr(a aVar, ar arVar) {
        this.c = new HashMap();
        this.a = aVar;
        this.b = arVar;
    }
}
