package org.apache.xml.security.utils.resolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.w3c.dom.Attr;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class ResourceResolver {
    public static Log a;
    public static boolean b;
    public static List c;
    public static boolean d;
    public static Class f;
    public ResourceResolverSpi e;

    static {
        Class cls = f;
        if (cls == null) {
            cls = b(C0059ao.a(3598));
            f = cls;
        }
        a = LogFactory.getLog(cls.getName());
        b = false;
        c = null;
        d = true;
    }

    private ResourceResolver(String str) {
        this.e = null;
        this.e = (ResourceResolverSpi) Class.forName(str).newInstance();
    }

    public ResourceResolver(ResourceResolverSpi resourceResolverSpi) {
        this.e = null;
        this.e = resourceResolverSpi;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final org.apache.xml.security.utils.resolver.ResourceResolver a(org.w3c.dom.Attr r10, java.lang.String r11) {
        /*
            r0 = 3599(0xe0f, float:5.043E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            java.util.List r2 = org.apache.xml.security.utils.resolver.ResourceResolver.c
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r2) goto L94
            java.util.List r5 = org.apache.xml.security.utils.resolver.ResourceResolver.c
            java.lang.Object r5 = r5.get(r4)
            org.apache.xml.security.utils.resolver.ResourceResolver r5 = (org.apache.xml.security.utils.resolver.ResourceResolver) r5
            boolean r6 = org.apache.xml.security.utils.resolver.ResourceResolver.d     // Catch: java.lang.IllegalAccessException -> L86 java.lang.InstantiationException -> L8d
            if (r6 != 0) goto L38
            org.apache.xml.security.utils.resolver.ResourceResolverSpi r6 = r5.e     // Catch: java.lang.IllegalAccessException -> L86 java.lang.InstantiationException -> L8d
            boolean r6 = r6.a()     // Catch: java.lang.IllegalAccessException -> L86 java.lang.InstantiationException -> L8d
            if (r6 == 0) goto L26
            goto L38
        L26:
            org.apache.xml.security.utils.resolver.ResourceResolver r6 = new org.apache.xml.security.utils.resolver.ResourceResolver     // Catch: java.lang.IllegalAccessException -> L86 java.lang.InstantiationException -> L8d
            org.apache.xml.security.utils.resolver.ResourceResolverSpi r7 = r5.e     // Catch: java.lang.IllegalAccessException -> L86 java.lang.InstantiationException -> L8d
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.IllegalAccessException -> L86 java.lang.InstantiationException -> L8d
            java.lang.Object r7 = r7.newInstance()     // Catch: java.lang.IllegalAccessException -> L86 java.lang.InstantiationException -> L8d
            org.apache.xml.security.utils.resolver.ResourceResolverSpi r7 = (org.apache.xml.security.utils.resolver.ResourceResolverSpi) r7     // Catch: java.lang.IllegalAccessException -> L86 java.lang.InstantiationException -> L8d
            r6.<init>(r7)     // Catch: java.lang.IllegalAccessException -> L86 java.lang.InstantiationException -> L8d
            goto L39
        L38:
            r6 = r5
        L39:
            org.apache.commons.logging.Log r7 = org.apache.xml.security.utils.resolver.ResourceResolver.a
            boolean r7 = r7.isDebugEnabled()
            if (r7 == 0) goto L66
            org.apache.commons.logging.Log r7 = org.apache.xml.security.utils.resolver.ResourceResolver.a
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            r0 = 3600(0xe10, float:5.045E-42)
            java.lang.String r9 = myunmn.C0059ao.a(r0)
            r8.append(r9)
            org.apache.xml.security.utils.resolver.ResourceResolverSpi r9 = r5.e
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.debug(r8)
        L66:
            if (r5 == 0) goto L83
            boolean r7 = r6.c(r10, r11)
            if (r7 == 0) goto L83
            if (r4 == 0) goto L82
            java.util.List r10 = org.apache.xml.security.utils.resolver.ResourceResolver.c
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.clone()
            java.util.List r10 = (java.util.List) r10
            r10.remove(r4)
            r10.add(r3, r5)
            org.apache.xml.security.utils.resolver.ResourceResolver.c = r10
        L82:
            return r6
        L83:
            int r4 = r4 + 1
            goto Lf
        L86:
            r2 = move-exception
            org.apache.xml.security.utils.resolver.ResourceResolverException r3 = new org.apache.xml.security.utils.resolver.ResourceResolverException
            r3.<init>(r1, r2, r10, r11)
            throw r3
        L8d:
            r2 = move-exception
            org.apache.xml.security.utils.resolver.ResourceResolverException r3 = new org.apache.xml.security.utils.resolver.ResourceResolverException
            r3.<init>(r1, r2, r10, r11)
            throw r3
        L94:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            if (r10 == 0) goto L9e
            java.lang.String r2 = r10.getNodeValue()
            goto La5
        L9e:
            r0 = 3601(0xe11, float:5.046E-42)
            java.lang.String r2 = myunmn.C0059ao.a(r0)
        La5:
            r1[r3] = r2
            r2 = 1
            r1[r2] = r11
            org.apache.xml.security.utils.resolver.ResourceResolverException r2 = new org.apache.xml.security.utils.resolver.ResourceResolverException
            r0 = 3602(0xe12, float:5.047E-42)
            java.lang.String r3 = myunmn.C0059ao.a(r0)
            r2.<init>(r3, r1, r10, r11)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.resolver.ResourceResolver.a(org.w3c.dom.Attr, java.lang.String):org.apache.xml.security.utils.resolver.ResourceResolver");
    }

    public static final ResourceResolver a(Attr attr, String str, List list) {
        int size;
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(3603));
            stringBuffer.append(list == null ? 0 : list.size());
            log.debug(stringBuffer.toString());
            Log log2 = a;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(C0059ao.a(3604));
            stringBuffer2.append(c.size());
            stringBuffer2.append(C0059ao.a(3605));
            log2.debug(stringBuffer2.toString());
        }
        if (list != null && (size = list.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ResourceResolver resourceResolver = (ResourceResolver) list.get(i);
                if (resourceResolver != null) {
                    String name = resourceResolver.e.getClass().getName();
                    if (a.isDebugEnabled()) {
                        Log log3 = a;
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append(C0059ao.a(3606));
                        stringBuffer3.append(name);
                        log3.debug(stringBuffer3.toString());
                    }
                    if (resourceResolver.c(attr, str)) {
                        return resourceResolver;
                    }
                }
            }
        }
        return a(attr, str);
    }

    public static void a() {
        if (b) {
            return;
        }
        c = new ArrayList(10);
        b = true;
    }

    public static void a(String str) {
        a(str, false);
    }

    private static void a(String str, boolean z) {
        Log log;
        StringBuffer stringBuffer;
        String a2 = C0059ao.a(3607);
        String a3 = C0059ao.a(3608);
        try {
            ResourceResolver resourceResolver = new ResourceResolver(str);
            if (z) {
                c.add(0, resourceResolver);
                a.debug(C0059ao.a(3609));
            } else {
                c.add(resourceResolver);
            }
            if (resourceResolver.e.a()) {
                return;
            }
            d = false;
        } catch (Exception unused) {
            log = a;
            stringBuffer = new StringBuffer();
            stringBuffer.append(a3);
            stringBuffer.append(str);
            stringBuffer.append(a2);
            log.warn(stringBuffer.toString());
        } catch (NoClassDefFoundError unused2) {
            log = a;
            stringBuffer = new StringBuffer();
            stringBuffer.append(a3);
            stringBuffer.append(str);
            stringBuffer.append(a2);
            log.warn(stringBuffer.toString());
        }
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    private boolean c(Attr attr, String str) {
        return this.e.b(attr, str);
    }

    public void a(Map map) {
        this.e.a(map);
    }

    public XMLSignatureInput b(Attr attr, String str) {
        return this.e.a(attr, str);
    }
}
