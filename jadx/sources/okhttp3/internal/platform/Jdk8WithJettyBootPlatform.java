package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import myunmn.C0059ao;
import okhttp3.Protocol;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion Companion = new Companion(null);
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class AlpnProvider implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        public AlpnProvider(List<String> list) {
            yl0.e(list, C0059ao.a(14898));
            this.protocols = list;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            yl0.e(obj, C0059ao.a(14899));
            yl0.e(method, C0059ao.a(14900));
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (yl0.a(name, C0059ao.a(14901)) && yl0.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (yl0.a(name, C0059ao.a(14902)) && yl0.a(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (yl0.a(name, C0059ao.a(14903))) {
                if (objArr.length == 0) {
                    return this.protocols;
                }
            }
            boolean a = yl0.a(name, C0059ao.a(14904));
            String a2 = C0059ao.a(14905);
            if ((a || yl0.a(name, C0059ao.a(14906))) && yl0.a(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2, C0059ao.a(14907));
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        Objects.requireNonNull(obj3, a2);
                        String str = (String) obj3;
                        if (!this.protocols.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.selected = str;
                            return str;
                        }
                    }
                }
                String str2 = this.protocols.get(0);
                this.selected = str2;
                return str2;
            } else if ((yl0.a(name, C0059ao.a(14908)) || yl0.a(name, C0059ao.a(14909))) && objArr.length == 1) {
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4, a2);
                this.selected = (String) obj4;
                return null;
            } else {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void setSelected(String str) {
            this.selected = str;
        }

        public final void setUnsupported(boolean z) {
            this.unsupported = z;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Platform buildIfSupported() {
            String property = System.getProperty(C0059ao.a(14976), C0059ao.a(14977));
            try {
                yl0.d(property, C0059ao.a(14978));
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                String a = C0059ao.a(14979);
                Class<?> cls = Class.forName(C0059ao.a(14980), true, null);
                Class<?> cls2 = Class.forName(a + C0059ao.a(14981), true, null);
                Class<?> cls3 = Class.forName(a + C0059ao.a(14982), true, null);
                Class<?> cls4 = Class.forName(a + C0059ao.a(14983), true, null);
                Method method = cls.getMethod(C0059ao.a(14984), SSLSocket.class, cls2);
                Method method2 = cls.getMethod(C0059ao.a(14985), SSLSocket.class);
                Method method3 = cls.getMethod(C0059ao.a(14986), SSLSocket.class);
                yl0.d(method, C0059ao.a(14987));
                yl0.d(method2, C0059ao.a(14988));
                yl0.d(method3, C0059ao.a(14989));
                yl0.d(cls3, C0059ao.a(14990));
                yl0.d(cls4, C0059ao.a(14991));
                return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        yl0.e(method, C0059ao.a(10860));
        yl0.e(method2, C0059ao.a(10861));
        yl0.e(method3, C0059ao.a(10862));
        yl0.e(cls, C0059ao.a(10863));
        yl0.e(cls2, C0059ao.a(10864));
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(SSLSocket sSLSocket) {
        String a = C0059ao.a(10865);
        yl0.e(sSLSocket, C0059ao.a(10866));
        try {
            this.removeMethod.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError(a, e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(a, e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        String a = C0059ao.a(10867);
        yl0.e(sSLSocket, C0059ao.a(10868));
        yl0.e(list, C0059ao.a(10869));
        try {
            this.putMethod.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(Platform.Companion.alpnProtocolNames(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError(a, e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(a, e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        String a = C0059ao.a(10870);
        yl0.e(sSLSocket, C0059ao.a(10871));
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
                if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                    Platform.log$default(this, C0059ao.a(10872), 0, null, 6, null);
                    return null;
                } else if (alpnProvider.getUnsupported()) {
                    return null;
                } else {
                    return alpnProvider.getSelected();
                }
            }
            throw new NullPointerException(C0059ao.a(10873));
        } catch (IllegalAccessException e) {
            throw new AssertionError(a, e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(a, e2);
        }
    }
}
