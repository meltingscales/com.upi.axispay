package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import myunmn.C0059ao;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Relay {
    public static final Companion Companion;
    private static final long FILE_HEADER_SIZE = 0;
    public static final ByteString PREFIX_CLEAN;
    public static final ByteString PREFIX_DIRTY;
    private static final int SOURCE_FILE = 0;
    private static final int SOURCE_UPSTREAM = 0;
    private final Buffer buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final ByteString metadata;
    private int sourceCount;
    private Source upstream;
    private final Buffer upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Relay edit(File file, Source source, ByteString byteString, long j) throws IOException {
            yl0.e(file, C0059ao.a(9846));
            yl0.e(source, C0059ao.a(9847));
            yl0.e(byteString, C0059ao.a(9848));
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, C0059ao.a(9849));
            Relay relay = new Relay(randomAccessFile, source, 0L, byteString, j, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            yl0.e(file, C0059ao.a(9850));
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, C0059ao.a(9851));
            FileChannel channel = randomAccessFile.getChannel();
            yl0.d(channel, C0059ao.a(9852));
            FileOperator fileOperator = new FileOperator(channel);
            Buffer buffer = new Buffer();
            fileOperator.read(0L, buffer, 32L);
            ByteString byteString = Relay.PREFIX_CLEAN;
            if (!(!yl0.a(buffer.readByteString(byteString.size()), byteString))) {
                long readLong = buffer.readLong();
                long readLong2 = buffer.readLong();
                Buffer buffer2 = new Buffer();
                fileOperator.read(readLong + 32, buffer2, readLong2);
                return new Relay(randomAccessFile, null, readLong, buffer2.readByteString(), 0L, null);
            }
            throw new IOException(C0059ao.a(9853));
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class RelaySource implements Source {
        private FileOperator fileOperator;
        private long sourcePos;
        private final Timeout timeout = new Timeout();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            yl0.c(file);
            FileChannel channel = file.getChannel();
            yl0.d(channel, C0059ao.a(2226));
            this.fileOperator = new FileOperator(channel);
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (Relay.this) {
                Relay relay = Relay.this;
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (Relay.this.getSourceCount() == 0) {
                    RandomAccessFile file = Relay.this.getFile();
                    Relay.this.setFile(null);
                    randomAccessFile = file;
                }
                pi0 pi0Var = pi0.a;
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
            if (r4 != true) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
            r8 = java.lang.Math.min(r22, r20.this$0.getUpstreamPos() - r20.sourcePos);
            r2 = r20.fileOperator;
            defpackage.yl0.c(r2);
            r2.read(r20.sourcePos + 32, r21, r8);
            r20.sourcePos += r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
            r0 = r20.this$0.getUpstream();
            defpackage.yl0.c(r0);
            r14 = r0.read(r20.this$0.getUpstreamBuffer(), r20.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
            if (r14 != (-1)) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
            r0 = r20.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
            r2 = r20.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
            r20.this$0.setUpstreamReader(null);
            r0 = r20.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
            if (r0 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
            r0.notifyAll();
            r0 = defpackage.pi0.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ec, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
            throw new java.lang.NullPointerException(myunmn.C0059ao.a(2228));
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
            r9 = java.lang.Math.min(r14, r22);
            r20.this$0.getUpstreamBuffer().copyTo(r21, 0, r9);
            r20.sourcePos += r9;
            r13 = r20.fileOperator;
            defpackage.yl0.c(r13);
            r13.write(r20.this$0.getUpstreamPos() + 32, r20.this$0.getUpstreamBuffer().clone(), r14);
            r2 = r20.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0135, code lost:
            r20.this$0.getBuffer().write(r20.this$0.getUpstreamBuffer(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0156, code lost:
            if (r20.this$0.getBuffer().size() <= r20.this$0.getBufferMaxSize()) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0158, code lost:
            r20.this$0.getBuffer().skip(r20.this$0.getBuffer().size() - r20.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0172, code lost:
            r0 = r20.this$0;
            r0.setUpstreamPos(r0.getUpstreamPos() + r14);
            r0 = defpackage.pi0.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x017e, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x017f, code lost:
            r2 = r20.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0181, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0182, code lost:
            r20.this$0.setUpstreamReader(null);
            r0 = r20.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0189, code lost:
            if (r0 == null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x018b, code lost:
            r0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x018e, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x018f, code lost:
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x019c, code lost:
            throw new java.lang.NullPointerException(myunmn.C0059ao.a(2229));
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x01a6, code lost:
            monitor-enter(r20.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x01a7, code lost:
            r20.this$0.setUpstreamReader(null);
            r3 = r20.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x01ae, code lost:
            if (r3 == null) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x01bc, code lost:
            throw new java.lang.NullPointerException(myunmn.C0059ao.a(2230));
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x01bd, code lost:
            r3.notifyAll();
            r3 = defpackage.pi0.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x01c3, code lost:
            throw r0;
         */
        @Override // okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(okio.Buffer r21, long r22) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 475
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(okio.Buffer, long):long");
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    static {
        C0059ao.a(Relay.class, 257);
        Companion = new Companion(null);
        ByteString.Companion companion = ByteString.Companion;
        PREFIX_CLEAN = companion.encodeUtf8(C0059ao.a(1440));
        PREFIX_DIRTY = companion.encodeUtf8(C0059ao.a(1441));
    }

    private Relay(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.upstreamPos = j;
        this.metadata = byteString;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new Buffer();
        this.complete = this.upstream == null;
        this.buffer = new Buffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(ByteString byteString, long j, long j2) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        buffer.writeLong(j);
        buffer.writeLong(j2);
        if (buffer.size() == 32) {
            RandomAccessFile randomAccessFile = this.file;
            yl0.c(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            yl0.d(channel, C0059ao.a(1442));
            new FileOperator(channel).write(0L, buffer, 32L);
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(1443).toString());
    }

    private final void writeMetadata(long j) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        yl0.c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        yl0.d(channel, C0059ao.a(1444));
        new FileOperator(channel).write(32 + j, buffer, this.metadata.size());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        yl0.c(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        yl0.c(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            pi0 pi0Var = pi0.a;
        }
        Source source = this.upstream;
        if (source != null) {
            Util.closeQuietly(source);
        }
        this.upstream = null;
    }

    public final Buffer getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final Source getUpstream() {
        return this.upstream;
    }

    public final Buffer getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final ByteString metadata() {
        return this.metadata;
    }

    public final Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(Source source) {
        this.upstream = source;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2, vl0 vl0Var) {
        this(randomAccessFile, source, j, byteString, j2);
    }
}
