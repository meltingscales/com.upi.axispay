package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: gv  reason: default package */
/* loaded from: classes.dex */
public interface gv extends IInterface {

    /* compiled from: AxisPay */
    /* renamed from: gv$a */
    /* loaded from: classes.dex */
    public static abstract class a extends so implements gv {

        /* compiled from: AxisPay */
        /* renamed from: gv$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0024a extends ro implements gv {
            public C0024a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // defpackage.gv
            public final Bundle f(Bundle bundle) throws RemoteException {
                Parcel j = j();
                to.b(j, bundle);
                Parcel k = k(j);
                Bundle bundle2 = (Bundle) to.a(k, Bundle.CREATOR);
                k.recycle();
                return bundle2;
            }
        }

        public static gv j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0059ao.a(15043));
            if (queryLocalInterface instanceof gv) {
                return (gv) queryLocalInterface;
            }
            return new C0024a(iBinder);
        }
    }

    Bundle f(Bundle bundle) throws RemoteException;
}
