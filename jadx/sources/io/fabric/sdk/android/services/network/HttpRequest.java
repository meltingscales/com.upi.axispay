package io.fabric.sdk.android.services.network;

import com.google.android.gms.identity.intents.AddressConstants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class HttpRequest {
    private static final String BOUNDARY = null;
    public static final String CHARSET_UTF8 = null;
    private static ConnectionFactory CONNECTION_FACTORY;
    public static final String CONTENT_TYPE_FORM = null;
    public static final String CONTENT_TYPE_JSON = null;
    private static final String CONTENT_TYPE_MULTIPART = null;
    private static final String CRLF = null;
    private static final String[] EMPTY_STRINGS;
    public static final String ENCODING_GZIP = null;
    public static final String HEADER_ACCEPT = null;
    public static final String HEADER_ACCEPT_CHARSET = null;
    public static final String HEADER_ACCEPT_ENCODING = null;
    public static final String HEADER_AUTHORIZATION = null;
    public static final String HEADER_CACHE_CONTROL = null;
    public static final String HEADER_CONTENT_ENCODING = null;
    public static final String HEADER_CONTENT_LENGTH = null;
    public static final String HEADER_CONTENT_TYPE = null;
    public static final String HEADER_DATE = null;
    public static final String HEADER_ETAG = null;
    public static final String HEADER_EXPIRES = null;
    public static final String HEADER_IF_NONE_MATCH = null;
    public static final String HEADER_LAST_MODIFIED = null;
    public static final String HEADER_LOCATION = null;
    public static final String HEADER_PROXY_AUTHORIZATION = null;
    public static final String HEADER_REFERER = null;
    public static final String HEADER_SERVER = null;
    public static final String HEADER_USER_AGENT = null;
    public static final String METHOD_DELETE = null;
    public static final String METHOD_GET = null;
    public static final String METHOD_HEAD = null;
    public static final String METHOD_OPTIONS = null;
    public static final String METHOD_POST = null;
    public static final String METHOD_PUT = null;
    public static final String METHOD_TRACE = null;
    public static final String PARAM_CHARSET = null;
    private boolean form;
    private String httpProxyHost;
    private int httpProxyPort;
    private boolean multipart;
    private RequestOutputStream output;
    private final String requestMethod;
    public final URL url;
    private HttpURLConnection connection = null;
    private boolean ignoreCloseExceptions = true;
    private boolean uncompress = false;
    private int bufferSize = UserMetadata.MAX_INTERNAL_KEY_SIZE;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Base64 {
        private static final byte EQUALS_SIGN = 0;
        private static final String PREFERRED_ENCODING = null;
        private static final byte[] _STANDARD_ALPHABET;

        static {
            C0059ao.a(Base64.class, 395);
            _STANDARD_ALPHABET = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        }

        private Base64() {
        }

        public static String encode(String str) {
            byte[] bytes;
            try {
                bytes = str.getBytes(C0059ao.a(9705));
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            return encodeBytes(bytes);
        }

        private static byte[] encode3to4(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            byte[] bArr3 = _STANDARD_ALPHABET;
            int i4 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
            if (i2 == 1) {
                bArr2[i3] = bArr3[i4 >>> 18];
                bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
                bArr2[i3 + 2] = 61;
                bArr2[i3 + 3] = 61;
                return bArr2;
            } else if (i2 == 2) {
                bArr2[i3] = bArr3[i4 >>> 18];
                bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
                bArr2[i3 + 3] = 61;
                return bArr2;
            } else if (i2 != 3) {
                return bArr2;
            } else {
                bArr2[i3] = bArr3[i4 >>> 18];
                bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
                bArr2[i3 + 3] = bArr3[i4 & 63];
                return bArr2;
            }
        }

        public static String encodeBytes(byte[] bArr) {
            return encodeBytes(bArr, 0, bArr.length);
        }

        public static byte[] encodeBytesToBytes(byte[] bArr, int i, int i2) {
            Objects.requireNonNull(bArr, C0059ao.a(9707));
            if (i < 0) {
                throw new IllegalArgumentException(C0059ao.a(9710) + i);
            } else if (i2 >= 0) {
                if (i + i2 <= bArr.length) {
                    int i3 = ((i2 / 3) * 4) + (i2 % 3 <= 0 ? 0 : 4);
                    byte[] bArr2 = new byte[i3];
                    int i4 = i2 - 2;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < i4) {
                        encode3to4(bArr, i5 + i, 3, bArr2, i6);
                        i5 += 3;
                        i6 += 4;
                    }
                    if (i5 < i2) {
                        encode3to4(bArr, i + i5, i2 - i5, bArr2, i6);
                        i6 += 4;
                    }
                    if (i6 <= i3 - 1) {
                        byte[] bArr3 = new byte[i6];
                        System.arraycopy(bArr2, 0, bArr3, 0, i6);
                        return bArr3;
                    }
                    return bArr2;
                }
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, C0059ao.a(9708), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
            } else {
                throw new IllegalArgumentException(C0059ao.a(9709) + i2);
            }
        }

        public static String encodeBytes(byte[] bArr, int i, int i2) {
            byte[] encodeBytesToBytes = encodeBytesToBytes(bArr, i, i2);
            try {
                return new String(encodeBytesToBytes, C0059ao.a(9706));
            } catch (UnsupportedEncodingException unused) {
                return new String(encodeBytesToBytes);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class CloseOperation<V> extends Operation<V> {
        private final Closeable closeable;
        private final boolean ignoreCloseExceptions;

        public CloseOperation(Closeable closeable, boolean z) {
            this.closeable = closeable;
            this.ignoreCloseExceptions = z;
        }

        @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
        public void done() throws IOException {
            Closeable closeable = this.closeable;
            if (closeable instanceof Flushable) {
                ((Flushable) closeable).flush();
            }
            if (this.ignoreCloseExceptions) {
                try {
                    this.closeable.close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
            this.closeable.close();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface ConnectionFactory {
        public static final ConnectionFactory DEFAULT = new ConnectionFactory() { // from class: io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory.1
            @Override // io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory
            public HttpURLConnection create(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }

            @Override // io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory
            public HttpURLConnection create(URL url, Proxy proxy) throws IOException {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        HttpURLConnection create(URL url) throws IOException;

        HttpURLConnection create(URL url, Proxy proxy) throws IOException;
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class FlushOperation<V> extends Operation<V> {
        private final Flushable flushable;

        public FlushOperation(Flushable flushable) {
            this.flushable = flushable;
        }

        @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
        public void done() throws IOException {
            this.flushable.flush();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class HttpRequestException extends RuntimeException {
        private static final long serialVersionUID = 0;

        static {
            C0059ao.a(HttpRequestException.class, 281);
        }

        public HttpRequestException(IOException iOException) {
            super(iOException);
        }

        @Override // java.lang.Throwable
        public IOException getCause() {
            return (IOException) super.getCause();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class Operation<V> implements Callable<V> {
        @Override // java.util.concurrent.Callable
        public V call() throws HttpRequestException {
            boolean z;
            try {
                try {
                    V run = run();
                    try {
                        done();
                        return run;
                    } catch (IOException e) {
                        throw new HttpRequestException(e);
                    }
                } catch (HttpRequestException e2) {
                    throw e2;
                } catch (IOException e3) {
                    throw new HttpRequestException(e3);
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    try {
                        done();
                    } catch (IOException e4) {
                        if (!z) {
                            throw new HttpRequestException(e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                z = true;
                th = th2;
                done();
                throw th;
            }
        }

        public abstract void done() throws IOException;

        public abstract V run() throws HttpRequestException, IOException;
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class RequestOutputStream extends BufferedOutputStream {
        private final CharsetEncoder encoder;

        public RequestOutputStream(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.encoder = Charset.forName(HttpRequest.getValidCharset(str)).newEncoder();
        }

        public RequestOutputStream write(String str) throws IOException {
            ByteBuffer encode = this.encoder.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    static {
        C0059ao.a(HttpRequest.class, 56);
        EMPTY_STRINGS = new String[0];
        CONNECTION_FACTORY = ConnectionFactory.DEFAULT;
    }

    public HttpRequest(CharSequence charSequence, String str) throws HttpRequestException {
        try {
            this.url = new URL(charSequence.toString());
            this.requestMethod = str;
        } catch (MalformedURLException e) {
            throw new HttpRequestException(e);
        }
    }

    private static StringBuilder addParamPrefix(String str, StringBuilder sb) {
        int indexOf = str.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && str.charAt(length) != '&') {
            sb.append('&');
        }
        return sb;
    }

    private static StringBuilder addPathSeparator(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    public static String append(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        addPathSeparator(charSequence2, sb);
        addParamPrefix(charSequence2, sb);
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        Map.Entry<?, ?> next = it.next();
        sb.append(next.getKey().toString());
        sb.append('=');
        Object value = next.getValue();
        if (value != null) {
            sb.append(value);
        }
        while (it.hasNext()) {
            sb.append('&');
            Map.Entry<?, ?> next2 = it.next();
            sb.append(next2.getKey().toString());
            sb.append('=');
            Object value2 = next2.getValue();
            if (value2 != null) {
                sb.append(value2);
            }
        }
        return sb.toString();
    }

    private HttpURLConnection createConnection() {
        HttpURLConnection create;
        try {
            if (this.httpProxyHost != null) {
                create = CONNECTION_FACTORY.create(this.url, createProxy());
            } else {
                create = CONNECTION_FACTORY.create(this.url);
            }
            create.setRequestMethod(this.requestMethod);
            return create;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    private Proxy createProxy() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.httpProxyHost, this.httpProxyPort));
    }

    public static HttpRequest delete(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, C0059ao.a(525));
    }

    public static String encode(CharSequence charSequence) throws HttpRequestException {
        int port;
        int i;
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            if (url.getPort() != -1) {
                host = host + ':' + Integer.toString(port);
            }
            try {
                String aSCIIString = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), null).toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0 || (i = indexOf + 1) >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, i) + aSCIIString.substring(i).replace(C0059ao.a(527), C0059ao.a(528));
            } catch (URISyntaxException e) {
                IOException iOException = new IOException(C0059ao.a(529));
                iOException.initCause(e);
                throw new HttpRequestException(iOException);
            }
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public static HttpRequest get(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, C0059ao.a(530));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getValidCharset(String str) {
        return (str == null || str.length() <= 0) ? C0059ao.a(532) : str;
    }

    public static HttpRequest head(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, C0059ao.a(533));
    }

    public static void keepAlive(boolean z) {
        setProperty(C0059ao.a(535), Boolean.toString(z));
    }

    public static void nonProxyHosts(String... strArr) {
        String a = C0059ao.a(536);
        if (strArr != null && strArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            int length = strArr.length - 1;
            for (int i = 0; i < length; i++) {
                sb.append(strArr[i]);
                sb.append('|');
            }
            sb.append(strArr[length]);
            setProperty(a, sb.toString());
            return;
        }
        setProperty(a, null);
    }

    public static HttpRequest options(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, C0059ao.a(537));
    }

    public static HttpRequest post(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, C0059ao.a(539));
    }

    public static void proxyHost(String str) {
        setProperty(C0059ao.a(541), str);
        setProperty(C0059ao.a(542), str);
    }

    public static void proxyPort(int i) {
        String num = Integer.toString(i);
        setProperty(C0059ao.a(543), num);
        setProperty(C0059ao.a(544), num);
    }

    public static HttpRequest put(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, C0059ao.a(545));
    }

    public static void setConnectionFactory(ConnectionFactory connectionFactory) {
        if (connectionFactory == null) {
            CONNECTION_FACTORY = ConnectionFactory.DEFAULT;
        } else {
            CONNECTION_FACTORY = connectionFactory;
        }
    }

    private static String setProperty(final String str, final String str2) {
        PrivilegedAction<String> privilegedAction;
        if (str2 != null) {
            privilegedAction = new PrivilegedAction<String>() { // from class: io.fabric.sdk.android.services.network.HttpRequest.1
                @Override // java.security.PrivilegedAction
                public String run() {
                    return System.setProperty(str, str2);
                }
            };
        } else {
            privilegedAction = new PrivilegedAction<String>() { // from class: io.fabric.sdk.android.services.network.HttpRequest.2
                @Override // java.security.PrivilegedAction
                public String run() {
                    return System.clearProperty(str);
                }
            };
        }
        return (String) AccessController.doPrivileged(privilegedAction);
    }

    public static HttpRequest trace(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, C0059ao.a(547));
    }

    public HttpRequest accept(String str) {
        return header(C0059ao.a(549), str);
    }

    public HttpRequest acceptCharset(String str) {
        return header(C0059ao.a(550), str);
    }

    public HttpRequest acceptEncoding(String str) {
        return header(C0059ao.a(551), str);
    }

    public HttpRequest acceptGzipEncoding() {
        return acceptEncoding(C0059ao.a(552));
    }

    public HttpRequest acceptJson() {
        return accept(C0059ao.a(553));
    }

    public HttpRequest authorization(String str) {
        return header(C0059ao.a(554), str);
    }

    public boolean badRequest() throws HttpRequestException {
        return 400 == code();
    }

    public HttpRequest basic(String str, String str2) {
        return authorization(C0059ao.a(AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES) + Base64.encode(str + ':' + str2));
    }

    public String body(String str) throws HttpRequestException {
        ByteArrayOutputStream byteStream = byteStream();
        try {
            copy(buffer(), byteStream);
            return byteStream.toString(getValidCharset(str));
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public BufferedInputStream buffer() throws HttpRequestException {
        return new BufferedInputStream(stream(), this.bufferSize);
    }

    public HttpRequest bufferSize(int i) {
        if (i >= 1) {
            this.bufferSize = i;
            return this;
        }
        throw new IllegalArgumentException(C0059ao.a(556));
    }

    public BufferedReader bufferedReader(String str) throws HttpRequestException {
        return new BufferedReader(reader(str), this.bufferSize);
    }

    public ByteArrayOutputStream byteStream() {
        int contentLength = contentLength();
        if (contentLength > 0) {
            return new ByteArrayOutputStream(contentLength);
        }
        return new ByteArrayOutputStream();
    }

    public byte[] bytes() throws HttpRequestException {
        ByteArrayOutputStream byteStream = byteStream();
        try {
            copy(buffer(), byteStream);
            return byteStream.toByteArray();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public String cacheControl() {
        return header(C0059ao.a(557));
    }

    public String charset() {
        return parameter(C0059ao.a(558), C0059ao.a(559));
    }

    public HttpRequest chunk(int i) {
        getConnection().setChunkedStreamingMode(i);
        return this;
    }

    public HttpRequest closeOutput() throws IOException {
        RequestOutputStream requestOutputStream = this.output;
        if (requestOutputStream == null) {
            return this;
        }
        if (this.multipart) {
            requestOutputStream.write(C0059ao.a(560));
        }
        if (this.ignoreCloseExceptions) {
            try {
                this.output.close();
            } catch (IOException unused) {
            }
        } else {
            this.output.close();
        }
        this.output = null;
        return this;
    }

    public HttpRequest closeOutputQuietly() throws HttpRequestException {
        try {
            return closeOutput();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public int code() throws HttpRequestException {
        try {
            closeOutput();
            return getConnection().getResponseCode();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest connectTimeout(int i) {
        getConnection().setConnectTimeout(i);
        return this;
    }

    public String contentEncoding() {
        return header(C0059ao.a(561));
    }

    public int contentLength() {
        return intHeader(C0059ao.a(562));
    }

    public HttpRequest contentType(String str) {
        return contentType(str, null);
    }

    public HttpRequest copy(final InputStream inputStream, final OutputStream outputStream) throws IOException {
        return new CloseOperation<HttpRequest>(inputStream, this.ignoreCloseExceptions) { // from class: io.fabric.sdk.android.services.network.HttpRequest.6
            @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
            public HttpRequest run() throws IOException {
                byte[] bArr = new byte[HttpRequest.this.bufferSize];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        return HttpRequest.this;
                    }
                }
            }
        }.call();
    }

    public boolean created() throws HttpRequestException {
        return 201 == code();
    }

    public long date() {
        return dateHeader(C0059ao.a(566));
    }

    public long dateHeader(String str) throws HttpRequestException {
        return dateHeader(str, -1L);
    }

    public HttpRequest disconnect() {
        getConnection().disconnect();
        return this;
    }

    public String eTag() {
        return header(C0059ao.a(567));
    }

    public long expires() {
        return dateHeader(C0059ao.a(568));
    }

    public HttpRequest followRedirects(boolean z) {
        getConnection().setInstanceFollowRedirects(z);
        return this;
    }

    public HttpRequest form(Map<?, ?> map) throws HttpRequestException {
        return form(map, C0059ao.a(572));
    }

    public HttpURLConnection getConnection() {
        if (this.connection == null) {
            this.connection = createConnection();
        }
        return this.connection;
    }

    public String getParam(String str, String str2) {
        String trim;
        int length;
        if (str != null && str.length() != 0) {
            int length2 = str.length();
            int indexOf = str.indexOf(59) + 1;
            if (indexOf != 0 && indexOf != length2) {
                int indexOf2 = str.indexOf(59, indexOf);
                if (indexOf2 == -1) {
                    indexOf2 = length2;
                }
                while (indexOf < indexOf2) {
                    int indexOf3 = str.indexOf(61, indexOf);
                    if (indexOf3 != -1 && indexOf3 < indexOf2 && str2.equals(str.substring(indexOf, indexOf3).trim()) && (length = (trim = str.substring(indexOf3 + 1, indexOf2).trim()).length()) != 0) {
                        if (length > 2 && '\"' == trim.charAt(0)) {
                            int i = length - 1;
                            if ('\"' == trim.charAt(i)) {
                                return trim.substring(1, i);
                            }
                        }
                        return trim;
                    }
                    indexOf = indexOf2 + 1;
                    indexOf2 = str.indexOf(59, indexOf);
                    if (indexOf2 == -1) {
                        indexOf2 = length2;
                    }
                }
            }
        }
        return null;
    }

    public Map<String, String> getParams(String str) {
        String trim;
        int length;
        if (str != null && str.length() != 0) {
            int length2 = str.length();
            int indexOf = str.indexOf(59) + 1;
            if (indexOf != 0 && indexOf != length2) {
                int indexOf2 = str.indexOf(59, indexOf);
                if (indexOf2 == -1) {
                    indexOf2 = length2;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (indexOf < indexOf2) {
                    int indexOf3 = str.indexOf(61, indexOf);
                    if (indexOf3 != -1 && indexOf3 < indexOf2) {
                        String trim2 = str.substring(indexOf, indexOf3).trim();
                        if (trim2.length() > 0 && (length = (trim = str.substring(indexOf3 + 1, indexOf2).trim()).length()) != 0) {
                            if (length > 2 && '\"' == trim.charAt(0)) {
                                int i = length - 1;
                                if ('\"' == trim.charAt(i)) {
                                    linkedHashMap.put(trim2, trim.substring(1, i));
                                }
                            }
                            linkedHashMap.put(trim2, trim);
                        }
                    }
                    indexOf = indexOf2 + 1;
                    indexOf2 = str.indexOf(59, indexOf);
                    if (indexOf2 == -1) {
                        indexOf2 = length2;
                    }
                }
                return linkedHashMap;
            }
            return Collections.emptyMap();
        }
        return Collections.emptyMap();
    }

    public HttpRequest header(String str, String str2) {
        getConnection().setRequestProperty(str, str2);
        return this;
    }

    public HttpRequest headers(Map<String, String> map) {
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                header(entry);
            }
        }
        return this;
    }

    public HttpRequest ifModifiedSince(long j) {
        getConnection().setIfModifiedSince(j);
        return this;
    }

    public HttpRequest ifNoneMatch(String str) {
        return header(C0059ao.a(573), str);
    }

    public HttpRequest ignoreCloseExceptions(boolean z) {
        this.ignoreCloseExceptions = z;
        return this;
    }

    public int intHeader(String str) throws HttpRequestException {
        return intHeader(str, -1);
    }

    public boolean isBodyEmpty() throws HttpRequestException {
        return contentLength() == 0;
    }

    public long lastModified() {
        return dateHeader(C0059ao.a(574));
    }

    public String location() {
        return header(C0059ao.a(575));
    }

    public String message() throws HttpRequestException {
        try {
            closeOutput();
            return getConnection().getResponseMessage();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public String method() {
        return getConnection().getRequestMethod();
    }

    public boolean notFound() throws HttpRequestException {
        return 404 == code();
    }

    public boolean notModified() throws HttpRequestException {
        return 304 == code();
    }

    public boolean ok() throws HttpRequestException {
        return 200 == code();
    }

    public HttpRequest openOutput() throws IOException {
        if (this.output != null) {
            return this;
        }
        getConnection().setDoOutput(true);
        this.output = new RequestOutputStream(getConnection().getOutputStream(), getParam(getConnection().getRequestProperty(C0059ao.a(576)), C0059ao.a(577)), this.bufferSize);
        return this;
    }

    public String parameter(String str, String str2) {
        return getParam(header(str), str2);
    }

    public Map<String, String> parameters(String str) {
        return getParams(header(str));
    }

    public HttpRequest part(String str, String str2) {
        return part(str, (String) null, str2);
    }

    public HttpRequest partHeader(String str, String str2) throws HttpRequestException {
        return send(str).send(C0059ao.a(578)).send(str2).send(C0059ao.a(579));
    }

    public HttpRequest proxyAuthorization(String str) {
        return header(C0059ao.a(580), str);
    }

    public HttpRequest proxyBasic(String str, String str2) {
        return proxyAuthorization(C0059ao.a(581) + Base64.encode(str + ':' + str2));
    }

    public HttpRequest readTimeout(int i) {
        getConnection().setReadTimeout(i);
        return this;
    }

    public InputStreamReader reader(String str) throws HttpRequestException {
        try {
            return new InputStreamReader(stream(), getValidCharset(str));
        } catch (UnsupportedEncodingException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest receive(File file) throws HttpRequestException {
        try {
            final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.bufferSize);
            return new CloseOperation<HttpRequest>(bufferedOutputStream, this.ignoreCloseExceptions) { // from class: io.fabric.sdk.android.services.network.HttpRequest.3
                @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
                public HttpRequest run() throws HttpRequestException, IOException {
                    return HttpRequest.this.receive(bufferedOutputStream);
                }
            }.call();
        } catch (FileNotFoundException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest referer(String str) {
        return header(C0059ao.a(582), str);
    }

    public HttpRequest send(File file) throws HttpRequestException {
        try {
            return send(new BufferedInputStream(new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            throw new HttpRequestException(e);
        }
    }

    public String server() {
        return header(C0059ao.a(583));
    }

    public boolean serverError() throws HttpRequestException {
        return 500 == code();
    }

    public HttpRequest startPart() throws IOException {
        if (!this.multipart) {
            this.multipart = true;
            contentType(C0059ao.a(584)).openOutput();
            this.output.write(C0059ao.a(585));
        } else {
            this.output.write(C0059ao.a(586));
        }
        return this;
    }

    public InputStream stream() throws HttpRequestException {
        InputStream inputStream;
        if (code() < 400) {
            try {
                inputStream = getConnection().getInputStream();
            } catch (IOException e) {
                throw new HttpRequestException(e);
            }
        } else {
            inputStream = getConnection().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = getConnection().getInputStream();
                } catch (IOException e2) {
                    throw new HttpRequestException(e2);
                }
            }
        }
        if (this.uncompress) {
            if (C0059ao.a(587).equals(contentEncoding())) {
                try {
                    return new GZIPInputStream(inputStream);
                } catch (IOException e3) {
                    throw new HttpRequestException(e3);
                }
            }
        }
        return inputStream;
    }

    public String toString() {
        return method() + ' ' + url();
    }

    public HttpRequest trustAllCerts() throws HttpRequestException {
        return this;
    }

    public HttpRequest trustAllHosts() {
        return this;
    }

    public HttpRequest uncompress(boolean z) {
        this.uncompress = z;
        return this;
    }

    public URL url() {
        return getConnection().getURL();
    }

    public HttpRequest useCaches(boolean z) {
        getConnection().setUseCaches(z);
        return this;
    }

    public HttpRequest useProxy(String str, int i) {
        if (this.connection == null) {
            this.httpProxyHost = str;
            this.httpProxyPort = i;
            return this;
        }
        throw new IllegalStateException(C0059ao.a(588));
    }

    public HttpRequest userAgent(String str) {
        return header(C0059ao.a(589), str);
    }

    public HttpRequest writePartHeader(String str, String str2) throws IOException {
        return writePartHeader(str, str2, null);
    }

    public OutputStreamWriter writer() throws HttpRequestException {
        try {
            openOutput();
            RequestOutputStream requestOutputStream = this.output;
            return new OutputStreamWriter(requestOutputStream, requestOutputStream.encoder.charset());
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public static HttpRequest delete(URL url) throws HttpRequestException {
        return new HttpRequest(url, C0059ao.a(526));
    }

    public static HttpRequest get(URL url) throws HttpRequestException {
        return new HttpRequest(url, C0059ao.a(531));
    }

    public static HttpRequest head(URL url) throws HttpRequestException {
        return new HttpRequest(url, C0059ao.a(534));
    }

    public static HttpRequest options(URL url) throws HttpRequestException {
        return new HttpRequest(url, C0059ao.a(538));
    }

    public static HttpRequest post(URL url) throws HttpRequestException {
        return new HttpRequest(url, C0059ao.a(540));
    }

    public static HttpRequest put(URL url) throws HttpRequestException {
        return new HttpRequest(url, C0059ao.a(546));
    }

    public static HttpRequest trace(URL url) throws HttpRequestException {
        return new HttpRequest(url, C0059ao.a(548));
    }

    public BufferedReader bufferedReader() throws HttpRequestException {
        return bufferedReader(charset());
    }

    public HttpRequest contentLength(String str) {
        return contentLength(Integer.parseInt(str));
    }

    public HttpRequest contentType(String str, String str2) {
        String a = C0059ao.a(563);
        if (str2 != null && str2.length() > 0) {
            return header(a, str + C0059ao.a(564) + str2);
        }
        return header(a, str);
    }

    public long dateHeader(String str, long j) throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFieldDate(str, j);
    }

    public HttpRequest form(Map.Entry<?, ?> entry) throws HttpRequestException {
        return form(entry, C0059ao.a(571));
    }

    public HttpRequest header(String str, Number number) {
        return header(str, number != null ? number.toString() : null);
    }

    public boolean ignoreCloseExceptions() {
        return this.ignoreCloseExceptions;
    }

    public int intHeader(String str, int i) throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFieldInt(str, i);
    }

    public HttpRequest part(String str, String str2, String str3) throws HttpRequestException {
        return part(str, str2, (String) null, str3);
    }

    public HttpRequest writePartHeader(String str, String str2, String str3) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(590));
        sb.append(str);
        if (str2 != null) {
            sb.append(C0059ao.a(591));
            sb.append(str2);
        }
        sb.append('\"');
        partHeader(C0059ao.a(592), sb.toString());
        if (str3 != null) {
            partHeader(C0059ao.a(593), str3);
        }
        return send(C0059ao.a(594));
    }

    public static HttpRequest delete(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return delete(append);
    }

    public static HttpRequest get(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return get(append);
    }

    public static HttpRequest head(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return head(append);
    }

    public static HttpRequest post(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return post(append);
    }

    public static HttpRequest put(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return put(append);
    }

    public int bufferSize() {
        return this.bufferSize;
    }

    public HttpRequest contentLength(int i) {
        getConnection().setFixedLengthStreamingMode(i);
        return this;
    }

    public HttpRequest copy(final Reader reader, final Writer writer) throws IOException {
        return new CloseOperation<HttpRequest>(reader, this.ignoreCloseExceptions) { // from class: io.fabric.sdk.android.services.network.HttpRequest.7
            @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
            public HttpRequest run() throws IOException {
                char[] cArr = new char[HttpRequest.this.bufferSize];
                while (true) {
                    int read = reader.read(cArr);
                    if (read != -1) {
                        writer.write(cArr, 0, read);
                    } else {
                        return HttpRequest.this;
                    }
                }
            }
        }.call();
    }

    public HttpRequest form(Map.Entry<?, ?> entry, String str) throws HttpRequestException {
        return form(entry.getKey(), entry.getValue(), str);
    }

    public HttpRequest header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }

    public HttpRequest part(String str, String str2, String str3, String str4) throws HttpRequestException {
        try {
            startPart();
            writePartHeader(str, str2, str3);
            this.output.write(str4);
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public InputStreamReader reader() throws HttpRequestException {
        return reader(charset());
    }

    public HttpRequest code(AtomicInteger atomicInteger) throws HttpRequestException {
        atomicInteger.set(code());
        return this;
    }

    public HttpRequest form(Object obj, Object obj2) throws HttpRequestException {
        return form(obj, obj2, C0059ao.a(569));
    }

    public String header(String str) throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderField(str);
    }

    public Map<String, List<String>> headers() throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFields();
    }

    public HttpRequest send(byte[] bArr) throws HttpRequestException {
        return send(new ByteArrayInputStream(bArr));
    }

    public static HttpRequest delete(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return delete(append);
    }

    public static HttpRequest get(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return get(append);
    }

    public static HttpRequest head(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return head(append);
    }

    public static HttpRequest post(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return post(append);
    }

    public static HttpRequest put(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return put(append);
    }

    public String body() throws HttpRequestException {
        return body(charset());
    }

    public String contentType() {
        return header(C0059ao.a(565));
    }

    public HttpRequest form(Object obj, Object obj2, String str) throws HttpRequestException {
        boolean z = !this.form;
        if (z) {
            contentType(C0059ao.a(570), str);
            this.form = true;
        }
        String validCharset = getValidCharset(str);
        try {
            openOutput();
            if (!z) {
                this.output.write(38);
            }
            this.output.write(URLEncoder.encode(obj.toString(), validCharset));
            this.output.write(61);
            if (obj2 != null) {
                this.output.write(URLEncoder.encode(obj2.toString(), validCharset));
            }
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest receive(OutputStream outputStream) throws HttpRequestException {
        try {
            return copy(buffer(), outputStream);
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest send(InputStream inputStream) throws HttpRequestException {
        try {
            openOutput();
            copy(inputStream, this.output);
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest body(AtomicReference<String> atomicReference) throws HttpRequestException {
        atomicReference.set(body());
        return this;
    }

    public String[] headers(String str) {
        Map<String, List<String>> headers = headers();
        if (headers != null && !headers.isEmpty()) {
            List<String> list = headers.get(str);
            if (list != null && !list.isEmpty()) {
                return (String[]) list.toArray(new String[list.size()]);
            }
            return EMPTY_STRINGS;
        }
        return EMPTY_STRINGS;
    }

    public HttpRequest body(AtomicReference<String> atomicReference, String str) throws HttpRequestException {
        atomicReference.set(body(str));
        return this;
    }

    public HttpRequest part(String str, Number number) throws HttpRequestException {
        return part(str, (String) null, number);
    }

    public HttpRequest receive(PrintStream printStream) throws HttpRequestException {
        return receive((OutputStream) printStream);
    }

    public HttpRequest part(String str, String str2, Number number) throws HttpRequestException {
        return part(str, str2, number != null ? number.toString() : null);
    }

    public HttpRequest receive(final Appendable appendable) throws HttpRequestException {
        final BufferedReader bufferedReader = bufferedReader();
        return new CloseOperation<HttpRequest>(bufferedReader, this.ignoreCloseExceptions) { // from class: io.fabric.sdk.android.services.network.HttpRequest.4
            @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
            public HttpRequest run() throws IOException {
                CharBuffer allocate = CharBuffer.allocate(HttpRequest.this.bufferSize);
                while (true) {
                    int read = bufferedReader.read(allocate);
                    if (read != -1) {
                        allocate.rewind();
                        appendable.append(allocate, 0, read);
                        allocate.rewind();
                    } else {
                        return HttpRequest.this;
                    }
                }
            }
        }.call();
    }

    public HttpRequest send(final Reader reader) throws HttpRequestException {
        try {
            openOutput();
            RequestOutputStream requestOutputStream = this.output;
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(requestOutputStream, requestOutputStream.encoder.charset());
            return new FlushOperation<HttpRequest>(outputStreamWriter) { // from class: io.fabric.sdk.android.services.network.HttpRequest.8
                @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
                public HttpRequest run() throws IOException {
                    return HttpRequest.this.copy(reader, outputStreamWriter);
                }
            }.call();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest(URL url, String str) throws HttpRequestException {
        this.url = url;
        this.requestMethod = str;
    }

    public HttpRequest part(String str, File file) throws HttpRequestException {
        return part(str, (String) null, file);
    }

    public HttpRequest part(String str, String str2, File file) throws HttpRequestException {
        return part(str, str2, (String) null, file);
    }

    public HttpRequest part(String str, String str2, String str3, File file) throws HttpRequestException {
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    HttpRequest part = part(str, str2, str3, bufferedInputStream2);
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return part;
                } catch (IOException e) {
                    e = e;
                    throw new HttpRequestException(e);
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public HttpRequest receive(final Writer writer) throws HttpRequestException {
        final BufferedReader bufferedReader = bufferedReader();
        return new CloseOperation<HttpRequest>(bufferedReader, this.ignoreCloseExceptions) { // from class: io.fabric.sdk.android.services.network.HttpRequest.5
            @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
            public HttpRequest run() throws IOException {
                return HttpRequest.this.copy(bufferedReader, writer);
            }
        }.call();
    }

    public HttpRequest send(CharSequence charSequence) throws HttpRequestException {
        try {
            openOutput();
            this.output.write(charSequence.toString());
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest form(Map<?, ?> map, String str) throws HttpRequestException {
        if (!map.isEmpty()) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                form(entry, str);
            }
        }
        return this;
    }

    public HttpRequest part(String str, InputStream inputStream) throws HttpRequestException {
        return part(str, (String) null, (String) null, inputStream);
    }

    public HttpRequest part(String str, String str2, String str3, InputStream inputStream) throws HttpRequestException {
        try {
            startPart();
            writePartHeader(str, str2, str3);
            copy(inputStream, this.output);
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public static String append(CharSequence charSequence, Object... objArr) {
        String charSequence2 = charSequence.toString();
        if (objArr == null || objArr.length == 0) {
            return charSequence2;
        }
        if (objArr.length % 2 == 0) {
            StringBuilder sb = new StringBuilder(charSequence2);
            addPathSeparator(charSequence2, sb);
            addParamPrefix(charSequence2, sb);
            sb.append(objArr[0]);
            sb.append('=');
            Object obj = objArr[1];
            if (obj != null) {
                sb.append(obj);
            }
            for (int i = 2; i < objArr.length; i += 2) {
                sb.append('&');
                sb.append(objArr[i]);
                sb.append('=');
                Object obj2 = objArr[i + 1];
                if (obj2 != null) {
                    sb.append(obj2);
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException(C0059ao.a(524));
    }
}
