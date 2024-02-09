package okhttp3;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import myunmn.C0059ao;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final BufferedSource source;

        public BomAwareReader(BufferedSource bufferedSource, Charset charset) {
            yl0.e(bufferedSource, C0059ao.a(8060));
            yl0.e(charset, C0059ao.a(8061));
            this.source = bufferedSource;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            yl0.e(cArr, C0059ao.a(8062));
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException(C0059ao.a(8063));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            yl0.e(str, C0059ao.a(13717));
            Charset charset = qn0.b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    MediaType.Companion companion = MediaType.Companion;
                    mediaType = companion.parse(mediaType + C0059ao.a(13718));
                } else {
                    charset = charset$default;
                }
            }
            Buffer writeString = new Buffer().writeString(str, charset);
            return create(writeString, mediaType, writeString.size());
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, BufferedSource bufferedSource, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(bufferedSource, mediaType, j);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            yl0.e(bArr, C0059ao.a(13725));
            return create(new Buffer().write(bArr), mediaType, bArr.length);
        }

        public final ResponseBody create(ByteString byteString, MediaType mediaType) {
            yl0.e(byteString, C0059ao.a(13724));
            return create(new Buffer().write(byteString), mediaType, byteString.size());
        }

        public final ResponseBody create(final BufferedSource bufferedSource, final MediaType mediaType, final long j) {
            yl0.e(bufferedSource, C0059ao.a(13723));
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                public BufferedSource source() {
                    return BufferedSource.this;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            yl0.e(str, C0059ao.a(13720));
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            yl0.e(bArr, C0059ao.a(13722));
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, ByteString byteString) {
            yl0.e(byteString, C0059ao.a(13721));
            return create(byteString, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, BufferedSource bufferedSource) {
            yl0.e(bufferedSource, C0059ao.a(13719));
            return create(bufferedSource, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        return (contentType == null || (charset = contentType.charset(qn0.b)) == null) ? qn0.b : charset;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(dl0<? super BufferedSource, ? extends T> dl0Var, dl0<? super T, Integer> dl0Var2) {
        long contentLength = contentLength();
        if (contentLength <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            BufferedSource source = source();
            try {
                T invoke = dl0Var.invoke(source);
                xl0.b(1);
                pk0.a(source, null);
                xl0.a(1);
                int intValue = dl0Var2.invoke(invoke).intValue();
                if (contentLength == -1 || contentLength == intValue) {
                    return invoke;
                }
                throw new IOException(C0059ao.a(9022) + contentLength + C0059ao.a(9023) + intValue + C0059ao.a(9024));
            } finally {
            }
        } else {
            throw new IOException(C0059ao.a(9025) + contentLength);
        }
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, BufferedSource bufferedSource) {
        return Companion.create(mediaType, j, bufferedSource);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(BufferedSource bufferedSource, MediaType mediaType, long j) {
        return Companion.create(bufferedSource, mediaType, j);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final ByteString byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            BufferedSource source = source();
            try {
                ByteString readByteString = source.readByteString();
                pk0.a(source, null);
                int size = readByteString.size();
                if (contentLength == -1 || contentLength == size) {
                    return readByteString;
                }
                throw new IOException(C0059ao.a(9026) + contentLength + C0059ao.a(9027) + size + C0059ao.a(9028));
            } finally {
            }
        } else {
            throw new IOException(C0059ao.a(9029) + contentLength);
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            BufferedSource source = source();
            try {
                byte[] readByteArray = source.readByteArray();
                pk0.a(source, null);
                int length = readByteArray.length;
                if (contentLength == -1 || contentLength == length) {
                    return readByteArray;
                }
                throw new IOException(C0059ao.a(9030) + contentLength + C0059ao.a(9031) + length + C0059ao.a(9032));
            } finally {
            }
        } else {
            throw new IOException(C0059ao.a(9033) + contentLength);
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource source = source();
        try {
            String readString = source.readString(Util.readBomAsCharset(source, charset()));
            pk0.a(source, null);
            return readString;
        } finally {
        }
    }
}
