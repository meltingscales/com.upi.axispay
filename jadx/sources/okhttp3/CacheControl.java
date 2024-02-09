package okhttp3;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS).build();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            return j > ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) j;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            yl0.e(timeUnit, C0059ao.a(9088));
            if (i >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException((C0059ao.a(9089) + i).toString());
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
            yl0.e(timeUnit, C0059ao.a(9090));
            if (i >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException((C0059ao.a(9091) + i).toString());
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            yl0.e(timeUnit, C0059ao.a(9092));
            if (i >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException((C0059ao.a(9093) + i).toString());
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (co0.A(str2, str.charAt(i), false, 2, null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.CacheControl parse(okhttp3.Headers r33) {
            /*
                Method dump skipped, instructions count: 514
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    /* renamed from: -deprecated_immutable  reason: not valid java name */
    public final boolean m253deprecated_immutable() {
        return this.immutable;
    }

    /* renamed from: -deprecated_maxAgeSeconds  reason: not valid java name */
    public final int m254deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* renamed from: -deprecated_maxStaleSeconds  reason: not valid java name */
    public final int m255deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* renamed from: -deprecated_minFreshSeconds  reason: not valid java name */
    public final int m256deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* renamed from: -deprecated_mustRevalidate  reason: not valid java name */
    public final boolean m257deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: -deprecated_noCache  reason: not valid java name */
    public final boolean m258deprecated_noCache() {
        return this.noCache;
    }

    /* renamed from: -deprecated_noStore  reason: not valid java name */
    public final boolean m259deprecated_noStore() {
        return this.noStore;
    }

    /* renamed from: -deprecated_noTransform  reason: not valid java name */
    public final boolean m260deprecated_noTransform() {
        return this.noTransform;
    }

    /* renamed from: -deprecated_onlyIfCached  reason: not valid java name */
    public final boolean m261deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* renamed from: -deprecated_sMaxAgeSeconds  reason: not valid java name */
    public final int m262deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.noCache) {
                sb.append(C0059ao.a(6323));
            }
            if (this.noStore) {
                sb.append(C0059ao.a(6324));
            }
            int i = this.maxAgeSeconds;
            String a = C0059ao.a(6325);
            if (i != -1) {
                sb.append(C0059ao.a(6326));
                sb.append(this.maxAgeSeconds);
                sb.append(a);
            }
            if (this.sMaxAgeSeconds != -1) {
                sb.append(C0059ao.a(6327));
                sb.append(this.sMaxAgeSeconds);
                sb.append(a);
            }
            if (this.isPrivate) {
                sb.append(C0059ao.a(6328));
            }
            if (this.isPublic) {
                sb.append(C0059ao.a(6329));
            }
            if (this.mustRevalidate) {
                sb.append(C0059ao.a(6330));
            }
            if (this.maxStaleSeconds != -1) {
                sb.append(C0059ao.a(6331));
                sb.append(this.maxStaleSeconds);
                sb.append(a);
            }
            if (this.minFreshSeconds != -1) {
                sb.append(C0059ao.a(6332));
                sb.append(this.minFreshSeconds);
                sb.append(a);
            }
            if (this.onlyIfCached) {
                sb.append(C0059ao.a(6333));
            }
            if (this.noTransform) {
                sb.append(C0059ao.a(6334));
            }
            if (this.immutable) {
                sb.append(C0059ao.a(6335));
            }
            if (sb.length() == 0) {
                return C0059ao.a(6336);
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            yl0.d(sb2, C0059ao.a(6337));
            this.headerValue = sb2;
            return sb2;
        }
        return str;
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, vl0 vl0Var) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
