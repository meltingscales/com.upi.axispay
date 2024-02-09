package myunmn;

import android.content.Context;

/* loaded from: classes.dex */
public final class T {
    public static InterfaceC0075f a;

    public static void a() {
        InterfaceC0075f interfaceC0075f = a;
        if (interfaceC0075f != null) {
            a(interfaceC0075f);
            a = null;
        }
    }

    public static native void a(Context context, InterfaceC0075f interfaceC0075f);

    public static native void a(InterfaceC0075f interfaceC0075f);

    public static void b(Context context, InterfaceC0075f interfaceC0075f) {
        a();
        a = interfaceC0075f;
        a(context, interfaceC0075f);
    }
}
