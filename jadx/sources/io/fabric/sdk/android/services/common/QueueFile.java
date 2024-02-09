package io.fabric.sdk.android.services.common;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.vision.barcode.Barcode;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class QueueFile implements Closeable {
    public static final int HEADER_LENGTH = 0;
    private static final int INITIAL_LENGTH = 0;
    private static final Logger LOGGER;
    private final byte[] buffer;
    private int elementCount;
    public int fileLength;
    private Element first;
    private Element last;
    private final RandomAccessFile raf;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Element {
        public static final int HEADER_LENGTH = 0;
        public static final Element NULL;
        public final int length;
        public final int position;

        static {
            C0059ao.a(Element.class, 324);
            NULL = new Element(0, 0);
        }

        public Element(int i, int i2) {
            this.position = i;
            this.length = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + C0059ao.a(5396) + this.position + C0059ao.a(5397) + this.length + C0059ao.a(5398);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class ElementInputStream extends InputStream {
        private int position;
        private int remaining;

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            QueueFile.nonNull(bArr, C0059ao.a(1037));
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.remaining;
                if (i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    QueueFile.this.ringRead(this.position, bArr, i, i2);
                    this.position = QueueFile.this.wrapPosition(this.position + i2);
                    this.remaining -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private ElementInputStream(Element element) {
            this.position = QueueFile.this.wrapPosition(element.position + 4);
            this.remaining = element.length;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.remaining == 0) {
                return -1;
            }
            QueueFile.this.raf.seek(this.position);
            int read = QueueFile.this.raf.read();
            this.position = QueueFile.this.wrapPosition(this.position + 1);
            this.remaining--;
            return read;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    static {
        C0059ao.a(QueueFile.class, 271);
        LOGGER = Logger.getLogger(QueueFile.class.getName());
    }

    public QueueFile(File file) throws IOException {
        this.buffer = new byte[16];
        if (!file.exists()) {
            initialize(file);
        }
        this.raf = open(file);
        readHeader();
    }

    private void expandIfNecessary(int i) throws IOException {
        int i2 = i + 4;
        int remainingBytes = remainingBytes();
        if (remainingBytes >= i2) {
            return;
        }
        int i3 = this.fileLength;
        do {
            remainingBytes += i3;
            i3 <<= 1;
        } while (remainingBytes < i2);
        setLength(i3);
        Element element = this.last;
        int wrapPosition = wrapPosition(element.position + 4 + element.length);
        if (wrapPosition < this.first.position) {
            FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            long j = wrapPosition - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError(C0059ao.a(14078));
            }
        }
        int i4 = this.last.position;
        int i5 = this.first.position;
        if (i4 < i5) {
            int i6 = (this.fileLength + i4) - 16;
            writeHeader(i3, this.elementCount, i5, i6);
            this.last = new Element(i6, this.last.length);
        } else {
            writeHeader(i3, this.elementCount, i5, i4);
        }
        this.fileLength = i3;
    }

    private static void initialize(File file) throws IOException {
        File file2 = new File(file.getPath() + C0059ao.a(14079));
        RandomAccessFile open = open(file2);
        try {
            open.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            open.seek(0L);
            byte[] bArr = new byte[16];
            writeInts(bArr, Barcode.AZTEC, 0, 0, 0);
            open.write(bArr);
            open.close();
            if (!file2.renameTo(file)) {
                throw new IOException(C0059ao.a(14080));
            }
        } catch (Throwable th) {
            open.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T nonNull(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    private static RandomAccessFile open(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, C0059ao.a(14081));
    }

    private Element readElement(int i) throws IOException {
        if (i == 0) {
            return Element.NULL;
        }
        this.raf.seek(i);
        return new Element(i, this.raf.readInt());
    }

    private void readHeader() throws IOException {
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        int readInt = readInt(this.buffer, 0);
        this.fileLength = readInt;
        if (readInt <= this.raf.length()) {
            this.elementCount = readInt(this.buffer, 4);
            int readInt2 = readInt(this.buffer, 8);
            int readInt3 = readInt(this.buffer, 12);
            this.first = readElement(readInt2);
            this.last = readElement(readInt3);
            return;
        }
        throw new IOException(C0059ao.a(14082) + this.fileLength + C0059ao.a(14083) + this.raf.length());
    }

    private static int readInt(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private int remainingBytes() {
        return this.fileLength - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ringRead(int i, byte[] bArr, int i2, int i3) throws IOException {
        int wrapPosition = wrapPosition(i);
        int i4 = wrapPosition + i3;
        int i5 = this.fileLength;
        if (i4 <= i5) {
            this.raf.seek(wrapPosition);
            this.raf.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - wrapPosition;
        this.raf.seek(wrapPosition);
        this.raf.readFully(bArr, i2, i6);
        this.raf.seek(16L);
        this.raf.readFully(bArr, i2 + i6, i3 - i6);
    }

    private void ringWrite(int i, byte[] bArr, int i2, int i3) throws IOException {
        int wrapPosition = wrapPosition(i);
        int i4 = wrapPosition + i3;
        int i5 = this.fileLength;
        if (i4 <= i5) {
            this.raf.seek(wrapPosition);
            this.raf.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - wrapPosition;
        this.raf.seek(wrapPosition);
        this.raf.write(bArr, i2, i6);
        this.raf.seek(16L);
        this.raf.write(bArr, i2 + i6, i3 - i6);
    }

    private void setLength(int i) throws IOException {
        this.raf.setLength(i);
        this.raf.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int wrapPosition(int i) {
        int i2 = this.fileLength;
        return i < i2 ? i : (i + 16) - i2;
    }

    private void writeHeader(int i, int i2, int i3, int i4) throws IOException {
        writeInts(this.buffer, i, i2, i3, i4);
        this.raf.seek(0L);
        this.raf.write(this.buffer);
    }

    private static void writeInt(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void writeInts(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            writeInt(bArr, i, i2);
            i += 4;
        }
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public synchronized void clear() throws IOException {
        writeHeader(Barcode.AZTEC, 0, 0, 0);
        this.elementCount = 0;
        Element element = Element.NULL;
        this.first = element;
        this.last = element;
        if (this.fileLength > 4096) {
            setLength(Barcode.AZTEC);
        }
        this.fileLength = Barcode.AZTEC;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.raf.close();
    }

    public synchronized void forEach(ElementReader elementReader) throws IOException {
        int i = this.first.position;
        for (int i2 = 0; i2 < this.elementCount; i2++) {
            Element readElement = readElement(i);
            elementReader.read(new ElementInputStream(readElement), readElement.length);
            i = wrapPosition(readElement.position + 4 + readElement.length);
        }
    }

    public boolean hasSpaceFor(int i, int i2) {
        return (usedBytes() + 4) + i <= i2;
    }

    public synchronized boolean isEmpty() {
        return this.elementCount == 0;
    }

    public synchronized byte[] peek() throws IOException {
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i = element.length;
        byte[] bArr = new byte[i];
        ringRead(element.position + 4, bArr, 0, i);
        return bArr;
    }

    public synchronized void remove() throws IOException {
        if (!isEmpty()) {
            if (this.elementCount == 1) {
                clear();
            } else {
                Element element = this.first;
                int wrapPosition = wrapPosition(element.position + 4 + element.length);
                ringRead(wrapPosition, this.buffer, 0, 4);
                int readInt = readInt(this.buffer, 0);
                writeHeader(this.fileLength, this.elementCount - 1, wrapPosition, this.last.position);
                this.elementCount--;
                this.first = new Element(wrapPosition, readInt);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public synchronized int size() {
        return this.elementCount;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(C0059ao.a(14085));
        sb.append(this.fileLength);
        sb.append(C0059ao.a(14086));
        sb.append(this.elementCount);
        sb.append(C0059ao.a(14087));
        sb.append(this.first);
        sb.append(C0059ao.a(14088));
        sb.append(this.last);
        sb.append(C0059ao.a(14089));
        try {
            forEach(new ElementReader() { // from class: io.fabric.sdk.android.services.common.QueueFile.1
                public boolean first = true;

                @Override // io.fabric.sdk.android.services.common.QueueFile.ElementReader
                public void read(InputStream inputStream, int i) throws IOException {
                    if (this.first) {
                        this.first = false;
                    } else {
                        sb.append(C0059ao.a(9893));
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, C0059ao.a(14090), (Throwable) e);
        }
        sb.append(C0059ao.a(14091));
        return sb.toString();
    }

    public int usedBytes() {
        if (this.elementCount == 0) {
            return 16;
        }
        Element element = this.last;
        int i = element.position;
        int i2 = this.first.position;
        if (i >= i2) {
            return (i - i2) + 4 + element.length + 16;
        }
        return (((i + 4) + element.length) + this.fileLength) - i2;
    }

    public synchronized void add(byte[] bArr, int i, int i2) throws IOException {
        int wrapPosition;
        nonNull(bArr, C0059ao.a(14084));
        if ((i | i2) >= 0 && i2 <= bArr.length - i) {
            expandIfNecessary(i2);
            boolean isEmpty = isEmpty();
            if (isEmpty) {
                wrapPosition = 16;
            } else {
                Element element = this.last;
                wrapPosition = wrapPosition(element.position + 4 + element.length);
            }
            Element element2 = new Element(wrapPosition, i2);
            writeInt(this.buffer, 0, i2);
            ringWrite(element2.position, this.buffer, 0, 4);
            ringWrite(element2.position + 4, bArr, i, i2);
            writeHeader(this.fileLength, this.elementCount + 1, isEmpty ? element2.position : this.first.position, element2.position);
            this.last = element2;
            this.elementCount++;
            if (isEmpty) {
                this.first = element2;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public QueueFile(RandomAccessFile randomAccessFile) throws IOException {
        this.buffer = new byte[16];
        this.raf = randomAccessFile;
        readHeader();
    }

    public synchronized void peek(ElementReader elementReader) throws IOException {
        if (this.elementCount > 0) {
            elementReader.read(new ElementInputStream(this.first), this.first.length);
        }
    }
}
