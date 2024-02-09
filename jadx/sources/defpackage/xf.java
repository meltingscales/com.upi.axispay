package defpackage;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: AxisPay */
/* renamed from: xf  reason: default package */
/* loaded from: classes.dex */
public abstract class xf {
    public static <T extends ef & sf> xf b(T t) {
        return new yf(t, t.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
