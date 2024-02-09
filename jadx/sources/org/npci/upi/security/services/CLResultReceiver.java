package org.npci.upi.security.services;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public interface CLResultReceiver extends IInterface {

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements CLResultReceiver {

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public static class Proxy implements CLResultReceiver {
            public IBinder a;

            public Proxy(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // org.npci.upi.security.services.CLResultReceiver
            public void a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0059ao.a(12983));
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public Stub() {
            attachInterface(this, C0059ao.a(2106));
        }

        public static CLResultReceiver j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0059ao.a(2107));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof CLResultReceiver)) ? new Proxy(iBinder) : (CLResultReceiver) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String a = C0059ao.a(2108);
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(a);
                return true;
            }
            parcel.enforceInterface(a);
            a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void a(Bundle bundle);
}
