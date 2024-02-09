package okhttp3;

import com.google.android.gms.vision.barcode.Barcode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final ByteString boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(null, 1, null);
        }

        public Builder(String str) {
            yl0.e(str, C0059ao.a(9608));
            this.boundary = ByteString.Companion.encodeUtf8(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public final Builder addFormDataPart(String str, String str2) {
            yl0.e(str, C0059ao.a(9610));
            yl0.e(str2, C0059ao.a(9611));
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            yl0.e(requestBody, C0059ao.a(9616));
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException(C0059ao.a(9617).toString());
        }

        public final Builder setType(MediaType mediaType) {
            yl0.e(mediaType, C0059ao.a(9618));
            if (yl0.a(mediaType.type(), C0059ao.a(9619))) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException((C0059ao.a(9620) + mediaType).toString());
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            yl0.e(str, C0059ao.a(9612));
            yl0.e(requestBody, C0059ao.a(9613));
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            yl0.e(requestBody, C0059ao.a(9614));
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            yl0.e(part, C0059ao.a(9615));
            this.parts.add(part);
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ Builder(java.lang.String r1, int r2, defpackage.vl0 r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L16
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                r2 = 9609(0x2589, float:1.3465E-41)
                java.lang.String r2 = myunmn.C0059ao.a(r2)
                defpackage.yl0.d(r1, r2)
            L16:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, vl0):void");
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            yl0.e(sb, C0059ao.a(172));
            yl0.e(str, C0059ao.a(173));
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    sb.append(C0059ao.a(176));
                } else if (charAt == '\r') {
                    sb.append(C0059ao.a(175));
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    sb.append(C0059ao.a(174));
                }
            }
            sb.append('\"');
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public final Part create(RequestBody requestBody) {
                yl0.e(requestBody, C0059ao.a(6658));
                return create(null, requestBody);
            }

            public final Part createFormData(String str, String str2) {
                yl0.e(str, C0059ao.a(6659));
                yl0.e(str2, C0059ao.a(6660));
                return createFormData(str, null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            public /* synthetic */ Companion(vl0 vl0Var) {
                this();
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                yl0.e(requestBody, C0059ao.a(6653));
                if ((headers != null ? headers.get(C0059ao.a(6654)) : null) == null) {
                    if ((headers != null ? headers.get(C0059ao.a(6655)) : null) == null) {
                        return new Part(headers, requestBody, null);
                    }
                    throw new IllegalArgumentException(C0059ao.a(6656).toString());
                }
                throw new IllegalArgumentException(C0059ao.a(6657).toString());
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                yl0.e(str, C0059ao.a(6661));
                yl0.e(requestBody, C0059ao.a(6662));
                StringBuilder sb = new StringBuilder();
                sb.append(C0059ao.a(6663));
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, str);
                if (str2 != null) {
                    sb.append(C0059ao.a(6664));
                    companion.appendQuotedString$okhttp(sb, str2);
                }
                String sb2 = sb.toString();
                yl0.d(sb2, C0059ao.a(6665));
                return create(new Headers.Builder().addUnsafeNonAscii(C0059ao.a(6666), sb2).build(), requestBody);
            }
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        /* renamed from: -deprecated_body  reason: not valid java name */
        public final RequestBody m323deprecated_body() {
            return this.body;
        }

        /* renamed from: -deprecated_headers  reason: not valid java name */
        public final Headers m324deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, vl0 vl0Var) {
            this(headers, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get(C0059ao.a(121));
        ALTERNATIVE = companion.get(C0059ao.a(122));
        DIGEST = companion.get(C0059ao.a(123));
        PARALLEL = companion.get(C0059ao.a(124));
        FORM = companion.get(C0059ao.a(125));
        COLONSPACE = new byte[]{(byte) 58, (byte) 32};
        CRLF = new byte[]{(byte) 13, (byte) 10};
        byte b = (byte) 45;
        DASHDASH = new byte[]{b, b};
    }

    public MultipartBody(ByteString byteString, MediaType mediaType, List<Part> list) {
        yl0.e(byteString, C0059ao.a(126));
        yl0.e(mediaType, C0059ao.a(127));
        yl0.e(list, C0059ao.a(Barcode.ITF));
        this.boundaryByteString = byteString;
        this.type = mediaType;
        this.parts = list;
        MediaType.Companion companion = MediaType.Companion;
        this.contentType = companion.get(mediaType + C0059ao.a(129) + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(BufferedSink bufferedSink, boolean z) throws IOException {
        Buffer buffer;
        if (z) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers();
            RequestBody body = part.body();
            yl0.c(bufferedSink);
            bufferedSink.write(DASHDASH);
            bufferedSink.write(this.boundaryByteString);
            bufferedSink.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bufferedSink.writeUtf8(headers.name(i2)).write(COLONSPACE).writeUtf8(headers.value(i2)).write(CRLF);
                }
            }
            MediaType contentType = body.contentType();
            if (contentType != null) {
                bufferedSink.writeUtf8(C0059ao.a(130)).writeUtf8(contentType.toString()).write(CRLF);
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                bufferedSink.writeUtf8(C0059ao.a(131)).writeDecimalLong(contentLength).write(CRLF);
            } else if (z) {
                yl0.c(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = CRLF;
            bufferedSink.write(bArr);
            if (z) {
                j += contentLength;
            } else {
                body.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        yl0.c(bufferedSink);
        byte[] bArr2 = DASHDASH;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.boundaryByteString);
        bufferedSink.write(bArr2);
        bufferedSink.write(CRLF);
        if (z) {
            yl0.c(buffer);
            long size3 = j + buffer.size();
            buffer.clear();
            return size3;
        }
        return j;
    }

    /* renamed from: -deprecated_boundary  reason: not valid java name */
    public final String m319deprecated_boundary() {
        return boundary();
    }

    /* renamed from: -deprecated_parts  reason: not valid java name */
    public final List<Part> m320deprecated_parts() {
        return this.parts;
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m321deprecated_size() {
        return size();
    }

    /* renamed from: -deprecated_type  reason: not valid java name */
    public final MediaType m322deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.utf8();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j == -1) {
            long writeOrCountBytes = writeOrCountBytes(null, true);
            this.contentLength = writeOrCountBytes;
            return writeOrCountBytes;
        }
        return j;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i) {
        return this.parts.get(i);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        yl0.e(bufferedSink, C0059ao.a(132));
        writeOrCountBytes(bufferedSink, false);
    }
}
