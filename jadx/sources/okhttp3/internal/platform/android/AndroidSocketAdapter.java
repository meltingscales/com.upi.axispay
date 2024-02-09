package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import myunmn.C0059ao;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AndroidSocketAdapter implements SocketAdapter {
    public static final Companion Companion;
    private static final DeferredSocketAdapter.Factory playProviderFactory;
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    private final Method setUseSessionTickets;
    private final Class<? super SSLSocket> sslSocketClass;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidSocketAdapter build(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!yl0.a(cls2.getSimpleName(), C0059ao.a(3812)))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError(C0059ao.a(3813) + cls);
                }
            }
            yl0.c(cls2);
            return new AndroidSocketAdapter(cls2);
        }

        public final DeferredSocketAdapter.Factory factory(final String str) {
            yl0.e(str, C0059ao.a(3814));
            return new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public SocketAdapter create(SSLSocket sSLSocket) {
                    AndroidSocketAdapter build;
                    yl0.e(sSLSocket, C0059ao.a(12401));
                    build = AndroidSocketAdapter.Companion.build(sSLSocket.getClass());
                    return build;
                }

                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public boolean matchesSocket(SSLSocket sSLSocket) {
                    yl0.e(sSLSocket, C0059ao.a(12402));
                    String name = sSLSocket.getClass().getName();
                    yl0.d(name, C0059ao.a(12403));
                    return bo0.w(name, str + '.', false, 2, null);
                }
            };
        }

        public final DeferredSocketAdapter.Factory getPlayProviderFactory() {
            return AndroidSocketAdapter.playProviderFactory;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        playProviderFactory = companion.factory(C0059ao.a(1395));
    }

    public AndroidSocketAdapter(Class<? super SSLSocket> cls) {
        yl0.e(cls, C0059ao.a(1396));
        this.sslSocketClass = cls;
        Method declaredMethod = cls.getDeclaredMethod(C0059ao.a(1397), Boolean.TYPE);
        yl0.d(declaredMethod, C0059ao.a(1398));
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = cls.getMethod(C0059ao.a(1399), String.class);
        this.getAlpnSelectedProtocol = cls.getMethod(C0059ao.a(1400), new Class[0]);
        this.setAlpnProtocols = cls.getMethod(C0059ao.a(1401), byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        yl0.e(sSLSocket, C0059ao.a(1402));
        yl0.e(list, C0059ao.a(1403));
        if (matchesSocket(sSLSocket)) {
            try {
                this.setUseSessionTickets.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.setHostname.invoke(sSLSocket, str);
                }
                this.setAlpnProtocols.invoke(sSLSocket, Platform.Companion.concatLengthPrefixed(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        yl0.e(sSLSocket, C0059ao.a(1404));
        if (matchesSocket(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sSLSocket, new Object[0]);
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    yl0.d(charset, C0059ao.a(1405));
                    return new String(bArr, charset);
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (NullPointerException e2) {
                if (yl0.a(e2.getMessage(), C0059ao.a(1406))) {
                    return null;
                }
                throw e2;
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return AndroidPlatform.Companion.isSupported();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(SSLSocket sSLSocket) {
        yl0.e(sSLSocket, C0059ao.a(1407));
        return this.sslSocketClass.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        yl0.e(sSLSocketFactory, C0059ao.a(1408));
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        yl0.e(sSLSocketFactory, C0059ao.a(1409));
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }
}
