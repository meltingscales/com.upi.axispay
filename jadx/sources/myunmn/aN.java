package myunmn;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class aN extends Binder implements InterfaceC0053ai {
    private static final String b = InterfaceC0053ai.class.getName();

    public aN() {
        attachInterface(this, b);
    }

    public static native InterfaceC0053ai a(IBinder iBinder);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public native boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2);
}
