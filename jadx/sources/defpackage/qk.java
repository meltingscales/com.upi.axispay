package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.pk;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qk  reason: default package */
/* loaded from: classes.dex */
public interface qk extends IInterface {

    /* compiled from: AxisPay */
    /* renamed from: qk$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements qk {

        /* compiled from: AxisPay */
        /* renamed from: qk$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0036a implements qk {
            public static qk b;
            public IBinder a;

            public C0036a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.qk
            public int e(pk pkVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0059ao.a(4931));
                    obtain.writeStrongBinder(pkVar != null ? pkVar.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.a.transact(1, obtain, obtain2, 0) && a.k() != null) {
                        return a.k().e(pkVar, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.qk
            public void g(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0059ao.a(4932));
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    if (this.a.transact(3, obtain, null, 1) || a.k() == null) {
                        return;
                    }
                    a.k().g(i, strArr);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, C0059ao.a(11851));
        }

        public static qk j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0059ao.a(11852));
            if (queryLocalInterface != null && (queryLocalInterface instanceof qk)) {
                return (qk) queryLocalInterface;
            }
            return new C0036a(iBinder);
        }

        public static qk k() {
            return C0036a.b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String a = C0059ao.a(11853);
            if (i == 1) {
                parcel.enforceInterface(a);
                int e = e(pk.a.j(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(e);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(a);
                i(pk.a.j(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(a);
                g(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(a);
                return true;
            }
        }
    }

    int e(pk pkVar, String str) throws RemoteException;

    void g(int i, String[] strArr) throws RemoteException;

    void i(pk pkVar, int i) throws RemoteException;
}
