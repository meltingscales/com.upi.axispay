package okhttp3.internal.http1;

import myunmn.C0059ao;
import okhttp3.Headers;
import okio.BufferedSource;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class HeadersReader {
    public static final Companion Companion;
    private static final int HEADER_LIMIT = 0;
    private long headerLimit;
    private final BufferedSource source;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        C0059ao.a(HeadersReader.class, 355);
        Companion = new Companion(null);
    }

    public HeadersReader(BufferedSource bufferedSource) {
        yl0.e(bufferedSource, C0059ao.a(9721));
        this.source = bufferedSource;
        this.headerLimit = 262144;
    }

    public final BufferedSource getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    public final String readLine() {
        String readUtf8LineStrict = this.source.readUtf8LineStrict(this.headerLimit);
        this.headerLimit -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }
}
