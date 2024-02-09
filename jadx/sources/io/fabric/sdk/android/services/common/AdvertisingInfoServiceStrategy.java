package io.fabric.sdk.android.services.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import io.fabric.sdk.android.Fabric;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AdvertisingInfoServiceStrategy implements AdvertisingInfoStrategy {
    public static final String GOOGLE_PLAY_SERVICES_INTENT = null;
    public static final String GOOGLE_PLAY_SERVICES_INTENT_PACKAGE_NAME = null;
    private static final String GOOGLE_PLAY_SERVICE_PACKAGE_NAME = null;
    private final Context context;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class AdvertisingConnection implements ServiceConnection {
        private static final int QUEUE_TIMEOUT_IN_MS = 0;
        private final LinkedBlockingQueue<IBinder> queue;
        private boolean retrieved;

        static {
            C0059ao.a(AdvertisingConnection.class, 272);
        }

        private AdvertisingConnection() {
            this.retrieved = false;
            this.queue = new LinkedBlockingQueue<>(1);
        }

        public IBinder getBinder() {
            if (this.retrieved) {
                Fabric.getLogger().e(C0059ao.a(14359), C0059ao.a(14360));
            }
            this.retrieved = true;
            try {
                return this.queue.poll(200L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return null;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.queue.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.queue.clear();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class AdvertisingInterface implements IInterface {
        public static final String ADVERTISING_ID_SERVICE_INTERFACE_TOKEN = null;
        private static final int AD_TRANSACTION_CODE_ID = 0;
        private static final int AD_TRANSACTION_CODE_LIMIT_AD_TRACKING = 0;
        private static final int FLAGS_NONE = 0;
        private final IBinder binder;

        static {
            C0059ao.a(AdvertisingInterface.class, 158);
        }

        public AdvertisingInterface(IBinder iBinder) {
            this.binder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.binder;
        }

        public String getId() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                try {
                    obtain.writeInterfaceToken(C0059ao.a(4033));
                    this.binder.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (Exception unused) {
                    Fabric.getLogger().d(C0059ao.a(4034), C0059ao.a(4035));
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                }
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean isLimitAdTrackingEnabled() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            boolean z = false;
            try {
                try {
                    obtain.writeInterfaceToken(C0059ao.a(4036));
                    obtain.writeInt(1);
                    this.binder.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                } catch (Exception unused) {
                    Fabric.getLogger().d(C0059ao.a(4037), C0059ao.a(4038));
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    static {
        C0059ao.a(AdvertisingInfoServiceStrategy.class, 316);
    }

    public AdvertisingInfoServiceStrategy(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // io.fabric.sdk.android.services.common.AdvertisingInfoStrategy
    public AdvertisingInfo getAdvertisingInfo() {
        String a = C0059ao.a(5743);
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        String a2 = C0059ao.a(5744);
        if (myLooper == mainLooper) {
            Fabric.getLogger().d(a2, C0059ao.a(5745));
            return null;
        }
        try {
            this.context.getPackageManager().getPackageInfo(C0059ao.a(5746), 0);
            AdvertisingConnection advertisingConnection = new AdvertisingConnection();
            Intent intent = new Intent(C0059ao.a(5747));
            intent.setPackage(C0059ao.a(5748));
            try {
                if (this.context.bindService(intent, advertisingConnection, 1)) {
                    try {
                        AdvertisingInterface advertisingInterface = new AdvertisingInterface(advertisingConnection.getBinder());
                        AdvertisingInfo advertisingInfo = new AdvertisingInfo(advertisingInterface.getId(), advertisingInterface.isLimitAdTrackingEnabled());
                        this.context.unbindService(advertisingConnection);
                        return advertisingInfo;
                    } catch (Exception e) {
                        Fabric.getLogger().w(a2, C0059ao.a(5749), e);
                        this.context.unbindService(advertisingConnection);
                    }
                } else {
                    Fabric.getLogger().d(a2, a);
                }
            } catch (Throwable th) {
                Fabric.getLogger().d(a2, a, th);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Fabric.getLogger().d(a2, C0059ao.a(5751));
            return null;
        } catch (Exception e2) {
            Fabric.getLogger().d(a2, C0059ao.a(5750), e2);
            return null;
        }
    }
}
