package okio;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class Segment {
    public static final Companion Companion;
    public static final int SHARE_MINIMUM = 0;
    public static final int SIZE = 0;
    public final byte[] data;
    public int limit;
    public Segment next;
    public boolean owner;
    public int pos;
    public Segment prev;
    public boolean shared;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        C0059ao.a(Segment.class, 241);
        Companion = new Companion(null);
    }

    public Segment() {
        this.data = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        Segment segment = this.prev;
        int i = 0;
        if (segment != this) {
            yl0.c(segment);
            if (segment.owner) {
                int i2 = this.limit - this.pos;
                Segment segment2 = this.prev;
                yl0.c(segment2);
                int i3 = 8192 - segment2.limit;
                Segment segment3 = this.prev;
                yl0.c(segment3);
                if (!segment3.shared) {
                    Segment segment4 = this.prev;
                    yl0.c(segment4);
                    i = segment4.pos;
                }
                if (i2 > i3 + i) {
                    return;
                }
                Segment segment5 = this.prev;
                yl0.c(segment5);
                writeTo(segment5, i2);
                pop();
                SegmentPool.recycle(this);
                return;
            }
            return;
        }
        throw new IllegalStateException(C0059ao.a(7736).toString());
    }

    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        yl0.c(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        yl0.c(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        yl0.e(segment, C0059ao.a(7737));
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        yl0.c(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final Segment split(int i) {
        Segment take;
        if (i > 0 && i <= this.limit - this.pos) {
            if (i >= 1024) {
                take = sharedCopy();
            } else {
                take = SegmentPool.take();
                byte[] bArr = this.data;
                byte[] bArr2 = take.data;
                int i2 = this.pos;
                wi0.d(bArr, bArr2, 0, i2, i2 + i, 2, null);
            }
            take.limit = take.pos + i;
            this.pos += i;
            Segment segment = this.prev;
            yl0.c(segment);
            segment.push(take);
            return take;
        }
        throw new IllegalArgumentException(C0059ao.a(7738).toString());
    }

    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        yl0.d(copyOf, C0059ao.a(7739));
        return new Segment(copyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(Segment segment, int i) {
        yl0.e(segment, C0059ao.a(7740));
        if (segment.owner) {
            int i2 = segment.limit;
            if (i2 + i > 8192) {
                if (!segment.shared) {
                    int i3 = segment.pos;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = segment.data;
                        wi0.d(bArr, bArr, 0, i3, i2, 2, null);
                        segment.limit -= segment.pos;
                        segment.pos = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.data;
            byte[] bArr3 = segment.data;
            int i4 = segment.limit;
            int i5 = this.pos;
            wi0.c(bArr2, bArr3, i4, i5, i5 + i);
            segment.limit += i;
            this.pos += i;
            return;
        }
        throw new IllegalStateException(C0059ao.a(7741).toString());
    }

    public Segment(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        yl0.e(bArr, C0059ao.a(7735));
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }
}
