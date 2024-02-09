package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import defpackage.qk;
import java.util.HashMap;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int b = 0;
    public final HashMap<Integer, String> c = new HashMap<>();
    public final RemoteCallbackList<pk> d = new a();
    public final qk.a e = new b();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends RemoteCallbackList<pk> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(pk pkVar, Object obj) {
            MultiInstanceInvalidationService.this.c.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends qk.a {
        public b() {
        }

        @Override // defpackage.qk
        public int e(pk pkVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.d) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.b + 1;
                multiInstanceInvalidationService.b = i;
                if (multiInstanceInvalidationService.d.register(pkVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.c.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.b--;
                return 0;
            }
        }

        @Override // defpackage.qk
        public void g(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.d) {
                String str = MultiInstanceInvalidationService.this.c.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.d.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.d.getBroadcastCookie(i2)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.c.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.d.getBroadcastItem(i2).b(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.d.finishBroadcast();
            }
        }

        @Override // defpackage.qk
        public void i(pk pkVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.d) {
                MultiInstanceInvalidationService.this.d.unregister(pkVar);
                MultiInstanceInvalidationService.this.c.remove(Integer.valueOf(i));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.e;
    }
}
