package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import defpackage.gi;
import defpackage.uh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hi  reason: default package */
/* loaded from: classes.dex */
public final class hi {
    public final Context a;
    public final c b;
    public final PackageManager d;
    public boolean f;
    public final ArrayList<gi> e = new ArrayList<>();
    public final BroadcastReceiver g = new a();
    public final Runnable h = new b();
    public final Handler c = new Handler();

    /* compiled from: AxisPay */
    /* renamed from: hi$a */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            hi.this.g();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: hi$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            hi.this.g();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: hi$c */
    /* loaded from: classes.dex */
    public interface c {
        void a(uh uhVar);

        void c(gi giVar, uh.e eVar);

        void d(uh uhVar);
    }

    public hi(Context context, c cVar) {
        this.a = context;
        this.b = cVar;
        this.d = context.getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e(gi giVar, uh.e eVar) {
        this.b.c(giVar, eVar);
    }

    public static boolean f(List<ServiceInfo> list, ServiceInfo serviceInfo) {
        if (serviceInfo != null && list != null && !list.isEmpty()) {
            for (ServiceInfo serviceInfo2 : list) {
                if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int a(String str, String str2) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (this.e.get(i).H(str, str2)) {
                return i;
            }
        }
        return -1;
    }

    public List<ServiceInfo> b() {
        return (List) this.d.queryIntentServices(new Intent(C0059ao.a(7981)), 0).stream().map(new Function() { // from class: jh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ServiceInfo serviceInfo;
                serviceInfo = ((ResolveInfo) obj).serviceInfo;
                return serviceInfo;
            }
        }).collect(Collectors.toList());
    }

    public void g() {
        int i;
        if (this.f) {
            List<ServiceInfo> arrayList = new ArrayList<>();
            if (Build.VERSION.SDK_INT >= 30) {
                arrayList = b();
            }
            int i2 = 0;
            for (ResolveInfo resolveInfo : this.d.queryIntentServices(new Intent(C0059ao.a(7982)), 0)) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && (!yh.l() || !f(arrayList, serviceInfo))) {
                    int a2 = a(serviceInfo.packageName, serviceInfo.name);
                    if (a2 < 0) {
                        final gi giVar = new gi(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        giVar.Q(new gi.b() { // from class: kh
                            @Override // defpackage.gi.b
                            public final void a(uh.e eVar) {
                                hi.this.e(giVar, eVar);
                            }
                        });
                        giVar.S();
                        i = i2 + 1;
                        this.e.add(i2, giVar);
                        this.b.a(giVar);
                    } else if (a2 >= i2) {
                        gi giVar2 = this.e.get(a2);
                        giVar2.S();
                        giVar2.P();
                        i = i2 + 1;
                        Collections.swap(this.e, a2, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < this.e.size()) {
                for (int size = this.e.size() - 1; size >= i2; size--) {
                    gi giVar3 = this.e.get(size);
                    this.b.d(giVar3);
                    this.e.remove(giVar3);
                    giVar3.Q(null);
                    giVar3.T();
                }
            }
        }
    }

    public void h() {
        if (this.f) {
            return;
        }
        this.f = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C0059ao.a(7983));
        intentFilter.addAction(C0059ao.a(7984));
        intentFilter.addAction(C0059ao.a(7985));
        intentFilter.addAction(C0059ao.a(7986));
        intentFilter.addAction(C0059ao.a(7987));
        intentFilter.addDataScheme(C0059ao.a(7988));
        this.a.registerReceiver(this.g, intentFilter, null, this.c);
        this.c.post(this.h);
    }
}
