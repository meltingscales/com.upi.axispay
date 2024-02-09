package myunmn;

import android.os.IBinder;

/* loaded from: classes.dex */
class W implements InterfaceC0053ai {
    private IBinder a;

    W(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // myunmn.InterfaceC0053ai
    public native boolean a();

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }

    @Override // myunmn.InterfaceC0053ai
    public native int b();

    @Override // myunmn.InterfaceC0053ai
    public native int c();

    @Override // myunmn.InterfaceC0053ai
    public native int d();
}
