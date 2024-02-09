package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class v {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: ı  reason: contains not printable characters */
        public final String f331;

        /* renamed from: Ι  reason: contains not printable characters */
        private final boolean f332;

        public b(String str, boolean z) {
            this.f331 = str;
            this.f332 = z;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m223() {
            return this.f332;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class e implements IInterface {

        /* renamed from: Ι  reason: contains not printable characters */
        private IBinder f335;

        public e(IBinder iBinder) {
            this.f335 = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f335;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m224() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(C0059ao.a(5806));
                obtain.writeInt(1);
                this.f335.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m225() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(C0059ao.a(5807));
                this.f335.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static b m222(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo(C0059ao.a(12146), 0);
                c cVar = new c((byte) 0);
                Intent intent = new Intent(C0059ao.a(12147));
                intent.setPackage(C0059ao.a(12148));
                try {
                    try {
                        if (context.bindService(intent, cVar, 1)) {
                            if (!cVar.f333) {
                                cVar.f333 = true;
                                e eVar = new e(cVar.f334.take());
                                return new b(eVar.m225(), eVar.m224());
                            }
                            throw new IllegalStateException();
                        }
                        if (context != null) {
                            context.unbindService(cVar);
                        }
                        throw new IOException(C0059ao.a(12149));
                    } catch (Exception e2) {
                        throw e2;
                    }
                } finally {
                    if (context != null) {
                        context.unbindService(cVar);
                    }
                }
            } catch (Exception e3) {
                throw e3;
            }
        }
        throw new IllegalStateException(C0059ao.a(12150));
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean f333;

        /* renamed from: Ι  reason: contains not printable characters */
        public final LinkedBlockingQueue<IBinder> f334;

        private c() {
            this.f334 = new LinkedBlockingQueue<>(1);
            this.f333 = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f334.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }
}
