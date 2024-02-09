package okhttp3.internal;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Sink;
import okio.Source;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS;
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final Options UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final sn0 VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = null;

    static {
        C0059ao.a(Util.class, 407);
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_HEADERS = Headers.Companion.of(new String[0]);
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        Options.Companion companion = Options.Companion;
        ByteString.Companion companion2 = ByteString.Companion;
        UNICODE_BOMS = companion.of(companion2.decodeHex(C0059ao.a(3651)), companion2.decodeHex(C0059ao.a(3652)), companion2.decodeHex(C0059ao.a(3653)), companion2.decodeHex(C0059ao.a(3654)), companion2.decodeHex(C0059ao.a(3655)));
        TimeZone timeZone = TimeZone.getTimeZone(C0059ao.a(3656));
        yl0.c(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new sn0(C0059ao.a(3657));
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        yl0.d(name, C0059ao.a(3658));
        okHttpName = co0.b0(co0.a0(name, C0059ao.a(3659)), C0059ao.a(3660));
    }

    public static final <E> void addIfAbsent(List<E> list, E e) {
        yl0.e(list, C0059ao.a(3661));
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final long and(int i, long j) {
        return i & j;
    }

    public static final EventListener.Factory asFactory(final EventListener eventListener) {
        yl0.e(eventListener, C0059ao.a(3662));
        return new EventListener.Factory() { // from class: okhttp3.internal.Util$asFactory$1
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                yl0.e(call, C0059ao.a(15259));
                return EventListener.this;
            }
        };
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        yl0.e(obj, C0059ao.a(3663));
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(3664));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(3665));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(3666));
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        yl0.e(obj, C0059ao.a(3667));
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(3668));
        Thread currentThread = Thread.currentThread();
        yl0.d(currentThread, C0059ao.a(3669));
        sb.append(currentThread.getName());
        sb.append(C0059ao.a(3670));
        sb.append(obj);
        throw new AssertionError(sb.toString());
    }

    public static final boolean canParseAsIpAddress(String str) {
        yl0.e(str, C0059ao.a(3671));
        return VERIFY_AS_IP_ADDRESS.a(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        yl0.e(httpUrl, C0059ao.a(3672));
        yl0.e(httpUrl2, C0059ao.a(3673));
        return yl0.a(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && yl0.a(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        yl0.e(str, C0059ao.a(3674));
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z = true;
        if (!(i >= 0)) {
            throw new IllegalStateException((str + C0059ao.a(3678)).toString());
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (!(millis <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
                throw new IllegalArgumentException((str + C0059ao.a(3676)).toString());
            }
            if (millis == 0 && i > 0) {
                z = false;
            }
            if (z) {
                return (int) millis;
            }
            throw new IllegalArgumentException((str + C0059ao.a(3675)).toString());
        }
        throw new IllegalStateException(C0059ao.a(3677).toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        yl0.e(closeable, C0059ao.a(3679));
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        yl0.e(strArr, C0059ao.a(3683));
        yl0.e(str, C0059ao.a(3684));
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        yl0.d(copyOf, C0059ao.a(3685));
        String[] strArr2 = (String[]) copyOf;
        strArr2[xi0.o(strArr2)] = str;
        Objects.requireNonNull(strArr2, C0059ao.a(3686));
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        yl0.e(str, C0059ao.a(3688));
        yl0.e(str2, C0059ao.a(3689));
        while (i < i2) {
            if (co0.A(str2, str.charAt(i), false, 2, null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(Source source, int i, TimeUnit timeUnit) {
        yl0.e(source, C0059ao.a(3690));
        yl0.e(timeUnit, C0059ao.a(3691));
        try {
            return skipAll(source, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, dl0<? super T, Boolean> dl0Var) {
        yl0.e(iterable, C0059ao.a(3692));
        yl0.e(dl0Var, C0059ao.a(3693));
        List<T> f = aj0.f();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (dl0Var.invoke(obj).booleanValue()) {
                if (f.isEmpty()) {
                    f = new ArrayList<>();
                }
                Objects.requireNonNull(f, C0059ao.a(3694));
                nm0.a(f).add(obj);
            }
        }
        return f;
    }

    public static final String format(String str, Object... objArr) {
        yl0.e(str, C0059ao.a(3695));
        yl0.e(objArr, C0059ao.a(3696));
        mm0 mm0Var = mm0.a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        yl0.d(format, C0059ao.a(3697));
        return format;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        yl0.e(strArr, C0059ao.a(3698));
        yl0.e(comparator, C0059ao.a(3699));
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        yl0.e(response, C0059ao.a(3700));
        String str = response.headers().get(C0059ao.a(3701));
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(sk0<pi0> sk0Var) {
        yl0.e(sk0Var, C0059ao.a(3702));
        try {
            sk0Var.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        yl0.e(tArr, C0059ao.a(3703));
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(aj0.h(Arrays.copyOf(objArr, objArr.length)));
        yl0.d(unmodifiableList, C0059ao.a(3704));
        return unmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        yl0.e(strArr, C0059ao.a(3705));
        yl0.e(str, C0059ao.a(3706));
        yl0.e(comparator, C0059ao.a(3707));
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        yl0.e(str, C0059ao.a(3708));
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (yl0.g(charAt, 31) <= 0 || yl0.g(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        yl0.e(str, C0059ao.a(3709));
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        yl0.e(str, C0059ao.a(3710));
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        yl0.e(str, C0059ao.a(3711));
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        yl0.e(strArr, C0059ao.a(3712));
        yl0.e(strArr2, C0059ao.a(3713));
        yl0.e(comparator, C0059ao.a(3714));
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, C0059ao.a(3715));
        return (String[]) array;
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        yl0.e(fileSystem, C0059ao.a(3716));
        yl0.e(file, C0059ao.a(3717));
        Sink sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                pk0.a(sink, null);
                return true;
            } catch (IOException unused) {
                pi0 pi0Var = pi0.a;
                pk0.a(sink, null);
                fileSystem.delete(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pk0.a(sink, th);
                throw th2;
            }
        }
    }

    public static final boolean isHealthy(Socket socket, BufferedSource bufferedSource) {
        yl0.e(socket, C0059ao.a(3718));
        yl0.e(bufferedSource, C0059ao.a(3719));
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !bufferedSource.exhausted();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final void notify(Object obj) {
        yl0.e(obj, C0059ao.a(3720));
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        yl0.e(obj, C0059ao.a(3721));
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static final String peerName(Socket socket) {
        yl0.e(socket, C0059ao.a(3722));
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            yl0.d(hostName, C0059ao.a(3723));
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    public static final Charset readBomAsCharset(BufferedSource bufferedSource, Charset charset) throws IOException {
        yl0.e(bufferedSource, C0059ao.a(3724));
        yl0.e(charset, C0059ao.a(3725));
        int select = bufferedSource.select(UNICODE_BOMS);
        if (select != -1) {
            if (select == 0) {
                Charset charset2 = StandardCharsets.UTF_8;
                yl0.d(charset2, C0059ao.a(3728));
                return charset2;
            } else if (select == 1) {
                Charset charset3 = StandardCharsets.UTF_16BE;
                yl0.d(charset3, C0059ao.a(3727));
                return charset3;
            } else if (select == 2) {
                Charset charset4 = StandardCharsets.UTF_16LE;
                yl0.d(charset4, C0059ao.a(3726));
                return charset4;
            } else if (select != 3) {
                if (select == 4) {
                    return qn0.a.b();
                }
                throw new AssertionError();
            } else {
                return qn0.a.a();
            }
        }
        return charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T readFieldOrNull(java.lang.Object r7, java.lang.Class<T> r8, java.lang.String r9) {
        /*
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0 = 3729(0xe91, float:5.225E-42)
            java.lang.String r2 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r7, r2)
            r0 = 3730(0xe92, float:5.227E-42)
            java.lang.String r2 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r8, r2)
            r0 = 3731(0xe93, float:5.228E-42)
            java.lang.String r2 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r9, r2)
            java.lang.Class r2 = r7.getClass()
        L24:
            boolean r3 = defpackage.yl0.a(r2, r1)
            r4 = 1
            r3 = r3 ^ r4
            r5 = 0
            if (r3 == 0) goto L5d
            java.lang.reflect.Field r3 = r2.getDeclaredField(r9)     // Catch: java.lang.NoSuchFieldException -> L4e
            r0 = 3732(0xe94, float:5.23E-42)
            java.lang.String r6 = myunmn.C0059ao.a(r0)     // Catch: java.lang.NoSuchFieldException -> L4e
            defpackage.yl0.d(r3, r6)     // Catch: java.lang.NoSuchFieldException -> L4e
            r3.setAccessible(r4)     // Catch: java.lang.NoSuchFieldException -> L4e
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.NoSuchFieldException -> L4e
            boolean r4 = r8.isInstance(r3)     // Catch: java.lang.NoSuchFieldException -> L4e
            if (r4 != 0) goto L49
            goto L4d
        L49:
            java.lang.Object r5 = r8.cast(r3)     // Catch: java.lang.NoSuchFieldException -> L4e
        L4d:
            return r5
        L4e:
            java.lang.Class r2 = r2.getSuperclass()
            r0 = 3733(0xe95, float:5.231E-42)
            java.lang.String r3 = myunmn.C0059ao.a(r0)
            defpackage.yl0.d(r2, r3)
            goto L24
        L5d:
            r0 = 3734(0xe96, float:5.232E-42)
            java.lang.String r2 = myunmn.C0059ao.a(r0)
            boolean r3 = defpackage.yl0.a(r9, r2)
            r3 = r3 ^ r4
            if (r3 == 0) goto L76
            java.lang.Object r7 = readFieldOrNull(r7, r1, r2)
            if (r7 == 0) goto L76
            java.lang.Object r7 = readFieldOrNull(r7, r8, r9)
            return r7
        L76:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.readFieldOrNull(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }

    public static final int readMedium(BufferedSource bufferedSource) throws IOException {
        yl0.e(bufferedSource, C0059ao.a(3735));
        return and(bufferedSource.readByte(), 255) | (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
        if (r6 == androidx.recyclerview.widget.RecyclerView.FOREVER_NS) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        r12.timeout().clearDeadline();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        r12.timeout().deadlineNanoTime(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r6 != androidx.recyclerview.widget.RecyclerView.FOREVER_NS) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean skipAll(okio.Source r12, int r13, java.util.concurrent.TimeUnit r14) throws java.io.IOException {
        /*
            r0 = 3737(0xe99, float:5.237E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r12, r1)
            r0 = 3738(0xe9a, float:5.238E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r14, r1)
            long r1 = java.lang.System.nanoTime()
            okio.Timeout r3 = r12.timeout()
            boolean r3 = r3.hasDeadline()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L31
            okio.Timeout r3 = r12.timeout()
            long r6 = r3.deadlineNanoTime()
            long r6 = r6 - r1
            goto L32
        L31:
            r6 = r4
        L32:
            okio.Timeout r3 = r12.timeout()
            long r8 = (long) r13
            long r13 = r14.toNanos(r8)
            long r13 = java.lang.Math.min(r6, r13)
            long r13 = r13 + r1
            r3.deadlineNanoTime(r13)
            okio.Buffer r13 = new okio.Buffer     // Catch: java.lang.Throwable -> L6e java.io.InterruptedIOException -> L84
            r13.<init>()     // Catch: java.lang.Throwable -> L6e java.io.InterruptedIOException -> L84
        L48:
            r8 = 8192(0x2000, double:4.0474E-320)
            long r8 = r12.read(r13, r8)     // Catch: java.lang.Throwable -> L6e java.io.InterruptedIOException -> L84
            r10 = -1
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 == 0) goto L58
            r13.clear()     // Catch: java.lang.Throwable -> L6e java.io.InterruptedIOException -> L84
            goto L48
        L58:
            r13 = 1
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 != 0) goto L65
        L5d:
            okio.Timeout r12 = r12.timeout()
            r12.clearDeadline()
            goto L8a
        L65:
            okio.Timeout r12 = r12.timeout()
            long r1 = r1 + r6
            r12.deadlineNanoTime(r1)
            goto L8a
        L6e:
            r13 = move-exception
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 != 0) goto L7b
            okio.Timeout r12 = r12.timeout()
            r12.clearDeadline()
            goto L83
        L7b:
            okio.Timeout r12 = r12.timeout()
            long r1 = r1 + r6
            r12.deadlineNanoTime(r1)
        L83:
            throw r13
        L84:
            r13 = 0
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 != 0) goto L65
            goto L5d
        L8a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.skipAll(okio.Source, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z) {
        yl0.e(str, C0059ao.a(3739));
        return new ThreadFactory() { // from class: okhttp3.internal.Util$threadFactory$1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static final void threadName(String str, sk0<pi0> sk0Var) {
        yl0.e(str, C0059ao.a(3740));
        yl0.e(sk0Var, C0059ao.a(3741));
        Thread currentThread = Thread.currentThread();
        yl0.d(currentThread, C0059ao.a(3742));
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            sk0Var.invoke();
        } finally {
            xl0.b(1);
            currentThread.setName(name);
            xl0.a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        yl0.e(headers, C0059ao.a(3743));
        rm0 h = tm0.h(0, headers.size());
        ArrayList arrayList = new ArrayList(bj0.o(h, 10));
        Iterator<Integer> it = h.iterator();
        while (it.hasNext()) {
            int a = ((nj0) it).a();
            arrayList.add(new Header(headers.name(a), headers.value(a)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        yl0.e(list, C0059ao.a(3744));
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        yl0.d(hexString, C0059ao.a(3746));
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String host;
        yl0.e(httpUrl, C0059ao.a(3747));
        if (co0.B(httpUrl.host(), C0059ao.a(3748), false, 2, null)) {
            host = '[' + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (z || httpUrl.port() != HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host + ':' + httpUrl.port();
        }
        return host;
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        yl0.e(list, C0059ao.a(3749));
        List<T> unmodifiableList = Collections.unmodifiableList(ij0.K(list));
        yl0.d(unmodifiableList, C0059ao.a(3750));
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        yl0.e(map, C0059ao.a(3751));
        if (map.isEmpty()) {
            return qj0.d();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        yl0.d(unmodifiableMap, C0059ao.a(3752));
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j) {
        yl0.e(str, C0059ao.a(3753));
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String trimSubstring(String str, int i, int i2) {
        yl0.e(str, C0059ao.a(3754));
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        yl0.d(substring, C0059ao.a(3755));
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(Object obj) {
        yl0.e(obj, C0059ao.a(3756));
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        yl0.e(exc, C0059ao.a(3757));
        yl0.e(list, C0059ao.a(3758));
        for (Exception exc2 : list) {
            xh0.a(exc, exc2);
        }
        return exc;
    }

    public static final void writeMedium(BufferedSink bufferedSink, int i) throws IOException {
        yl0.e(bufferedSink, C0059ao.a(3759));
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        yl0.e(str, C0059ao.a(3687));
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        yl0.d(hexString, C0059ao.a(3745));
        return hexString;
    }

    public static final void closeQuietly(Socket socket) {
        yl0.e(socket, C0059ao.a(3681));
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!yl0.a(e2.getMessage(), C0059ao.a(3682))) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        yl0.e(serverSocket, C0059ao.a(3680));
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(Buffer buffer, byte b) {
        yl0.e(buffer, C0059ao.a(3736));
        int i = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b) {
            i++;
            buffer.readByte();
        }
        return i;
    }
}
