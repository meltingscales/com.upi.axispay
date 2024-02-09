package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import myunmn.C0059ao;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {
    public static final Companion Companion = new Companion(null);
    private final Class<?> paramClass;
    private final Class<? super SSLSocketFactory> sslSocketFactoryClass;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ SocketAdapter buildIfSupported$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = C0059ao.a(8040);
            }
            return companion.buildIfSupported(str);
        }

        public final SocketAdapter buildIfSupported(String str) {
            yl0.e(str, C0059ao.a(8041));
            try {
                Class<?> cls = Class.forName(str + C0059ao.a(8042));
                if (cls != null) {
                    Class<?> cls2 = Class.forName(str + C0059ao.a(8043));
                    if (cls2 != null) {
                        Class<?> cls3 = Class.forName(str + C0059ao.a(8044));
                        yl0.d(cls3, C0059ao.a(8045));
                        return new StandardAndroidSocketAdapter(cls, cls2, cls3);
                    }
                    throw new NullPointerException(C0059ao.a(8046));
                }
                throw new NullPointerException(C0059ao.a(8047));
            } catch (Exception e) {
                Platform.Companion.get().log(C0059ao.a(8048), 5, e);
                return null;
            }
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        yl0.e(cls, C0059ao.a(7854));
        yl0.e(cls2, C0059ao.a(7855));
        yl0.e(cls3, C0059ao.a(7856));
        this.sslSocketFactoryClass = cls2;
        this.paramClass = cls3;
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        yl0.e(sSLSocketFactory, C0059ao.a(7857));
        return this.sslSocketFactoryClass.isInstance(sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        yl0.e(sSLSocketFactory, C0059ao.a(7858));
        Object readFieldOrNull = Util.readFieldOrNull(sSLSocketFactory, this.paramClass, C0059ao.a(7859));
        yl0.c(readFieldOrNull);
        X509TrustManager x509TrustManager = (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, X509TrustManager.class, C0059ao.a(7860));
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, X509TrustManager.class, C0059ao.a(7861));
    }
}
