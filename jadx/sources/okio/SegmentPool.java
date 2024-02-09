package okio;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.atomic.AtomicReference;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class SegmentPool {
    private static final int HASH_BUCKET_COUNT;
    private static final AtomicReference<Segment>[] hashBuckets;
    public static final SegmentPool INSTANCE = new SegmentPool();
    private static final int MAX_SIZE = LogFileManager.MAX_LOG_SIZE;
    private static final Segment LOCK = new Segment(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = highestOneBit;
        AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    private SegmentPool() {
    }

    private final AtomicReference<Segment> firstRef() {
        Thread currentThread = Thread.currentThread();
        yl0.d(currentThread, C0059ao.a(4698));
        return hashBuckets[(int) (currentThread.getId() & (HASH_BUCKET_COUNT - 1))];
    }

    public static final void recycle(Segment segment) {
        AtomicReference<Segment> firstRef;
        Segment segment2;
        yl0.e(segment, C0059ao.a(4699));
        if (segment.next == null && segment.prev == null) {
            if (segment.shared || (segment2 = (firstRef = INSTANCE.firstRef()).get()) == LOCK) {
                return;
            }
            int i = segment2 != null ? segment2.limit : 0;
            if (i >= MAX_SIZE) {
                return;
            }
            segment.next = segment2;
            segment.pos = 0;
            segment.limit = i + UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (firstRef.compareAndSet(segment2, segment)) {
                return;
            }
            segment.next = null;
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(4700).toString());
    }

    public static final Segment take() {
        AtomicReference<Segment> firstRef = INSTANCE.firstRef();
        Segment segment = LOCK;
        Segment andSet = firstRef.getAndSet(segment);
        if (andSet == segment) {
            return new Segment();
        }
        if (andSet == null) {
            firstRef.set(null);
            return new Segment();
        }
        firstRef.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    public final int getByteCount() {
        Segment segment = firstRef().get();
        if (segment != null) {
            return segment.limit;
        }
        return 0;
    }

    public final int getMAX_SIZE() {
        return MAX_SIZE;
    }
}
