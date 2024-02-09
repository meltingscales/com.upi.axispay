package org.npci.upi.security.services;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import myunmn.C0059ao;
import org.npci.upi.security.services.CLResultReceiver;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public interface CLRemoteService extends IInterface {

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements CLRemoteService {

        /* compiled from: AxisPay */
        /* loaded from: classes2.dex */
        public static class Proxy implements CLRemoteService {
            public IBinder a;

            public Proxy(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // org.npci.upi.security.services.CLRemoteService
            public void c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CLResultReceiver cLResultReceiver) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0059ao.a(754));
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    obtain.writeString(str6);
                    obtain.writeString(str7);
                    obtain.writeString(str8);
                    obtain.writeStrongBinder(cLResultReceiver != null ? cLResultReceiver.asBinder() : null);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.npci.upi.security.services.CLRemoteService
            public String d(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0059ao.a(755));
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.npci.upi.security.services.CLRemoteService
            public boolean h(String str, String str2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0059ao.a(756));
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, C0059ao.a(12859));
        }

        public static CLRemoteService j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0059ao.a(12860));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof CLRemoteService)) ? new Proxy(iBinder) : (CLRemoteService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String a = C0059ao.a(12861);
            if (i == 1) {
                parcel.enforceInterface(a);
                String d = d(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(a);
                boolean h = h(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(h ? 1 : 0);
                return true;
            } else if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(a);
                return true;
            } else {
                parcel.enforceInterface(a);
                c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), CLResultReceiver.Stub.j(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }
    }

    void c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CLResultReceiver cLResultReceiver);

    String d(String str, String str2);

    boolean h(String str, String str2, String str3, String str4);
}
