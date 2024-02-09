package com.crashlytics.android.core;

import android.os.AsyncTask;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CrashTest {
    private void privateMethodThatThrowsException(String str) {
        throw new RuntimeException(str);
    }

    public void crashAsyncTask(final long j) {
        new AsyncTask<Void, Void, Void>() { // from class: com.crashlytics.android.core.CrashTest.1
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                try {
                    Thread.sleep(j);
                } catch (InterruptedException unused) {
                }
                CrashTest.this.throwRuntimeException(C0059ao.a(14880));
                return null;
            }
        }.execute(null);
    }

    public void indexOutOfBounds() {
        int i = new int[2][10];
        Logger logger = Fabric.getLogger();
        logger.d(C0059ao.a(4760), C0059ao.a(4759) + i);
    }

    public int stackOverflow() {
        return stackOverflow() + ((int) Math.random());
    }

    public void throwFiveChainedExceptions() {
        try {
            privateMethodThatThrowsException(C0059ao.a(4761));
        } catch (Exception e) {
            try {
                throw new RuntimeException(C0059ao.a(4762), e);
            } catch (Exception e2) {
                try {
                    throw new RuntimeException(C0059ao.a(4763), e2);
                } catch (Exception e3) {
                    try {
                        throw new RuntimeException(C0059ao.a(4764), e3);
                    } catch (Exception e4) {
                        throw new RuntimeException(C0059ao.a(4765), e4);
                    }
                }
            }
        }
    }

    public void throwRuntimeException(String str) {
        throw new RuntimeException(str);
    }
}
