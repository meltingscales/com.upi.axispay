package org.npci.upi.security.pinactivitycomponent;

import android.os.Process;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class g implements Thread.UncaughtExceptionHandler {
    public String a = C0059ao.a(2456);

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        Log.e(C0059ao.a(2460), C0059ao.a(2457) + C0059ao.a(2458) + this.a + C0059ao.a(2459) + stringWriter.toString() + this.a);
        Process.killProcess(Process.myPid());
    }
}
