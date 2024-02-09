package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pk  reason: default package */
/* loaded from: classes.dex */
public interface pk extends IInterface {

    /* compiled from: AxisPay */
    /* renamed from: pk$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements pk {

        /* compiled from: AxisPay */
        /* renamed from: pk$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0035a implements pk {
            public static pk b;
            public IBinder a;

            public C0035a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.pk
            public void b(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0059ao.a(13759));
                    obtain.writeStringArray(strArr);
                    if (this.a.transact(1, obtain, null, 1) || a.k() == null) {
                        return;
                    }
                    a.k().b(strArr);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, C0059ao.a(1296));
        }

        public static pk j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0059ao.a(1297));
            if (queryLocalInterface != null && (queryLocalInterface instanceof pk)) {
                return (pk) queryLocalInterface;
            }
            return new C0035a(iBinder);
        }

        public static pk k() {
            return C0035a.b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String a = C0059ao.a(1298);
            if (i == 1) {
                parcel.enforceInterface(a);
                b(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(a);
                return true;
            }
        }
    }

    void b(String[] strArr) throws RemoteException;
}
