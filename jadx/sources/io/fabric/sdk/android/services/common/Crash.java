package io.fabric.sdk.android.services.common;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class Crash {
    private static final String UNKNOWN_EXCEPTION = null;
    private final String exceptionName;
    private final String sessionId;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class FatalException extends Crash {
        public FatalException(String str) {
            super(str);
        }

        public FatalException(String str, String str2) {
            super(str, str2);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class LoggedException extends Crash {
        public LoggedException(String str) {
            super(str);
        }

        public LoggedException(String str, String str2) {
            super(str, str2);
        }
    }

    static {
        C0059ao.a(Crash.class, 201);
    }

    public Crash(String str) {
        this(str, C0059ao.a(12972));
    }

    public String getExceptionName() {
        return this.exceptionName;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public Crash(String str, String str2) {
        this.sessionId = str;
        this.exceptionName = str2;
    }
}
