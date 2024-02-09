package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.vision.barcode.Barcode;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Settings {
    public static final int COUNT = 0;
    public static final Companion Companion;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 0;
    public static final int ENABLE_PUSH = 0;
    public static final int HEADER_TABLE_SIZE = 0;
    public static final int INITIAL_WINDOW_SIZE = 0;
    public static final int MAX_CONCURRENT_STREAMS = 0;
    public static final int MAX_FRAME_SIZE = 0;
    public static final int MAX_HEADER_LIST_SIZE = 0;
    private int set;
    private final int[] values = new int[10];

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
        C0059ao.a(Settings.class, 209);
        Companion = new Companion(null);
    }

    public final void clear() {
        this.set = 0;
        wi0.i(this.values, 0, 0, 0, 6, null);
    }

    public final int get(int i) {
        return this.values[i];
    }

    public final boolean getEnablePush(boolean z) {
        return (this.set & 4) != 0 ? this.values[2] == 1 : z;
    }

    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        if ((this.set & Barcode.ITF) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    public final int getMaxConcurrentStreams() {
        return (this.set & 16) != 0 ? this.values[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final int getMaxFrameSize(int i) {
        return (this.set & 32) != 0 ? this.values[5] : i;
    }

    public final int getMaxHeaderListSize(int i) {
        return (this.set & 64) != 0 ? this.values[6] : i;
    }

    public final boolean isSet(int i) {
        return ((1 << i) & this.set) != 0;
    }

    public final void merge(Settings settings) {
        yl0.e(settings, C0059ao.a(1196));
        for (int i = 0; i < 10; i++) {
            if (settings.isSet(i)) {
                set(i, settings.get(i));
            }
        }
    }

    public final Settings set(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.values;
            if (i < iArr.length) {
                this.set = (1 << i) | this.set;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}
