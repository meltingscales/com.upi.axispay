package okio;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final class PeekSource implements Source {
    private final Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private Segment expectedSegment;
    private long pos;
    private final BufferedSource upstream;

    public PeekSource(BufferedSource bufferedSource) {
        yl0.e(bufferedSource, C0059ao.a(9738));
        this.upstream = bufferedSource;
        Buffer buffer = bufferedSource.getBuffer();
        this.buffer = buffer;
        Segment segment = buffer.head;
        this.expectedSegment = segment;
        this.expectedPos = segment != null ? segment.pos : -1;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r5 == r6.pos) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long read(okio.Buffer r9, long r10) {
        /*
            r8 = this;
            r0 = 9739(0x260b, float:1.3647E-41)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L14
            r5 = r4
            goto L15
        L14:
            r5 = r3
        L15:
            if (r5 == 0) goto L96
            boolean r5 = r8.closed
            r5 = r5 ^ r4
            if (r5 == 0) goto L85
            okio.Segment r5 = r8.expectedSegment
            if (r5 == 0) goto L2f
            okio.Buffer r6 = r8.buffer
            okio.Segment r6 = r6.head
            if (r5 != r6) goto L30
            int r5 = r8.expectedPos
            defpackage.yl0.c(r6)
            int r6 = r6.pos
            if (r5 != r6) goto L30
        L2f:
            r3 = r4
        L30:
            if (r3 == 0) goto L74
            if (r2 != 0) goto L35
            return r0
        L35:
            okio.BufferedSource r0 = r8.upstream
            long r1 = r8.pos
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L45
            r9 = -1
            return r9
        L45:
            okio.Segment r0 = r8.expectedSegment
            if (r0 != 0) goto L58
            okio.Buffer r0 = r8.buffer
            okio.Segment r0 = r0.head
            if (r0 == 0) goto L58
            r8.expectedSegment = r0
            defpackage.yl0.c(r0)
            int r0 = r0.pos
            r8.expectedPos = r0
        L58:
            okio.Buffer r0 = r8.buffer
            long r0 = r0.size()
            long r2 = r8.pos
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.buffer
            long r4 = r8.pos
            r3 = r9
            r6 = r10
            r2.copyTo(r3, r4, r6)
            long r0 = r8.pos
            long r0 = r0 + r10
            r8.pos = r0
            return r10
        L74:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r10 = 9740(0x260c, float:1.3649E-41)
            java.lang.String r10 = myunmn.C0059ao.a(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L85:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r10 = 9741(0x260d, float:1.365E-41)
            java.lang.String r10 = myunmn.C0059ao.a(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L96:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r0 = 9742(0x260e, float:1.3651E-41)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.PeekSource.read(okio.Buffer, long):long");
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.upstream.timeout();
    }
}
