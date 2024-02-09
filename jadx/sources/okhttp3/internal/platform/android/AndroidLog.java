package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import myunmn.C0059ao;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

/* compiled from: AxisPay */
@SuppressSignatureCheck
/* loaded from: classes.dex */
public final class AndroidLog {
    public static final AndroidLog INSTANCE;
    private static final int MAX_LOG_LENGTH = 0;
    private static final CopyOnWriteArraySet<Logger> configuredLoggers;
    private static final Map<String, String> knownLoggers;

    static {
        C0059ao.a(AndroidLog.class, 224);
        INSTANCE = new AndroidLog();
        configuredLoggers = new CopyOnWriteArraySet<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = OkHttpClient.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, C0059ao.a(12844));
        }
        String name2 = OkHttpClient.class.getName();
        yl0.d(name2, C0059ao.a(12845));
        linkedHashMap.put(name2, C0059ao.a(12846));
        String name3 = Http2.class.getName();
        yl0.d(name3, C0059ao.a(12847));
        linkedHashMap.put(name3, C0059ao.a(12848));
        String name4 = TaskRunner.class.getName();
        yl0.d(name4, C0059ao.a(12849));
        linkedHashMap.put(name4, C0059ao.a(12850));
        linkedHashMap.put(C0059ao.a(12851), C0059ao.a(12852));
        knownLoggers = qj0.i(linkedHashMap);
    }

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            yl0.d(logger, C0059ao.a(12853));
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String str2 = knownLoggers.get(str);
        return str2 != null ? str2 : eo0.q0(str, 23);
    }

    public final void androidLog$okhttp(String str, int i, String str2, Throwable th) {
        int min;
        yl0.e(str, C0059ao.a(12854));
        yl0.e(str2, C0059ao.a(12855));
        String loggerTag = loggerTag(str);
        if (Log.isLoggable(loggerTag, i)) {
            if (th != null) {
                str2 = str2 + C0059ao.a(12856) + Log.getStackTraceString(th);
            }
            int i2 = 0;
            int length = str2.length();
            while (i2 < length) {
                int L = co0.L(str2, '\n', i2, false, 4, null);
                if (L == -1) {
                    L = length;
                }
                while (true) {
                    min = Math.min(L, i2 + 4000);
                    Objects.requireNonNull(str2, C0059ao.a(12857));
                    String substring = str2.substring(i2, min);
                    yl0.d(substring, C0059ao.a(12858));
                    Log.println(i, loggerTag, substring);
                    if (min >= L) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            enableLogging(entry.getKey(), entry.getValue());
        }
    }
}
