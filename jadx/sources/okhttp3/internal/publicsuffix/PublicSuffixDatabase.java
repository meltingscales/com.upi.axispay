package okhttp3.internal.publicsuffix;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import myunmn.C0059ao;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final Companion Companion;
    private static final char EXCEPTION_MARKER = 0;
    private static final List<String> PREVAILING_RULE;
    public static final String PUBLIC_SUFFIX_RESOURCE = null;
    private static final byte[] WILDCARD_LABEL;
    private static final PublicSuffixDatabase instance;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int and;
            int and2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != ((byte) 10)) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == ((byte) 10)) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        and = 46;
                        z = false;
                    } else {
                        z = z2;
                        and = Util.and(bArr2[i8][i9], 255);
                    }
                    and2 = and - Util.and(bArr[i5 + i10], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    } else if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else if (i8 == bArr2.length - 1) {
                        break;
                    } else {
                        i8++;
                        i9 = -1;
                        z2 = true;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                yl0.d(charset, C0059ao.a(5842));
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i5 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        C0059ao.a(PublicSuffixDatabase.class, 277);
        Companion = new Companion(null);
        WILDCARD_LABEL = new byte[]{(byte) 42};
        PREVAILING_RULE = zi0.b(C0059ao.a(1995));
        instance = new PublicSuffixDatabase();
    }

    public static final /* synthetic */ byte[] access$getPublicSuffixListBytes$p(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr != null) {
            return bArr;
        }
        yl0.t(C0059ao.a(1996));
        throw null;
    }

    private final List<String> findMatchingRule(List<String> list) {
        String a;
        String str;
        String str2;
        String str3;
        List<String> f;
        List<String> f2;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.publicSuffixListBytes != null) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                String str4 = list.get(i);
                Charset charset = StandardCharsets.UTF_8;
                yl0.d(charset, C0059ao.a(1997));
                Objects.requireNonNull(str4, C0059ao.a(1998));
                byte[] bytes = str4.getBytes(charset);
                yl0.d(bytes, C0059ao.a(1999));
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                a = C0059ao.a(RecyclerView.MAX_SCROLL_DURATION);
                str = null;
                if (i2 >= size) {
                    str2 = null;
                    break;
                }
                Companion companion = Companion;
                byte[] bArr2 = this.publicSuffixListBytes;
                if (bArr2 == null) {
                    yl0.t(a);
                    throw null;
                }
                str2 = companion.binarySearch(bArr2, bArr, i2);
                if (str2 != null) {
                    break;
                }
                i2++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    bArr3[i3] = WILDCARD_LABEL;
                    Companion companion2 = Companion;
                    byte[] bArr4 = this.publicSuffixListBytes;
                    if (bArr4 == null) {
                        yl0.t(a);
                        throw null;
                    }
                    String binarySearch = companion2.binarySearch(bArr4, bArr3, i3);
                    if (binarySearch != null) {
                        str3 = binarySearch;
                        break;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i4 = size - 1;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    Companion companion3 = Companion;
                    byte[] bArr5 = this.publicSuffixExceptionListBytes;
                    if (bArr5 == null) {
                        yl0.t(C0059ao.a(2001));
                        throw null;
                    }
                    String binarySearch2 = companion3.binarySearch(bArr5, bArr, i5);
                    if (binarySearch2 != null) {
                        str = binarySearch2;
                        break;
                    }
                    i5++;
                }
            }
            if (str != null) {
                return co0.h0('!' + str, new char[]{'.'}, false, 0, 6, null);
            } else if (str2 == null && str3 == null) {
                return PREVAILING_RULE;
            } else {
                if (str2 == null || (f = co0.h0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
                    f = aj0.f();
                }
                if (str3 == null || (f2 = co0.h0(str3, new char[]{'.'}, false, 0, 6, null)) == null) {
                    f2 = aj0.f();
                }
                return f.size() > f2.size() ? f : f2;
            }
        }
        throw new IllegalStateException(C0059ao.a(2002).toString());
    }

    private final void readTheList() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(C0059ao.a(2003));
        if (resourceAsStream == null) {
            return;
        }
        BufferedSource buffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
        try {
            byte[] readByteArray = buffer.readByteArray(buffer.readInt());
            byte[] readByteArray2 = buffer.readByteArray(buffer.readInt());
            pi0 pi0Var = pi0.a;
            pk0.a(buffer, null);
            synchronized (this) {
                yl0.c(readByteArray);
                this.publicSuffixListBytes = readByteArray;
                yl0.c(readByteArray2);
                this.publicSuffixExceptionListBytes = readByteArray2;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Platform.Companion.get().log(C0059ao.a(2004), 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> h0 = co0.h0(str, new char[]{'.'}, false, 0, 6, null);
        return yl0.a((String) ij0.B(h0), C0059ao.a(2005)) ? ij0.t(h0, 1) : h0;
    }

    public final String getEffectiveTldPlusOne(String str) {
        int size;
        int size2;
        yl0.e(str, C0059ao.a(2006));
        String unicode = IDN.toUnicode(str);
        yl0.d(unicode, C0059ao.a(2007));
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() != findMatchingRule.size() || findMatchingRule.get(0).charAt(0) == '!') {
            if (findMatchingRule.get(0).charAt(0) == '!') {
                size = splitDomain.size();
                size2 = findMatchingRule.size();
            } else {
                size = splitDomain.size();
                size2 = findMatchingRule.size() + 1;
            }
            return mn0.e(mn0.b(ij0.s(splitDomain(str)), size - size2), C0059ao.a(2008), null, null, 0, null, null, 62, null);
        }
        return null;
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        yl0.e(bArr, C0059ao.a(2009));
        yl0.e(bArr2, C0059ao.a(2010));
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
