package org.apache.xml.security.c14n;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.w3c.dom.Node;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Canonicalizer {
    public static boolean a;
    public static Map b;
    public CanonicalizerSpi c;

    static {
        C0059ao.a(Canonicalizer.class, 334);
    }

    private Canonicalizer(String str) {
        this.c = null;
        try {
            CanonicalizerSpi canonicalizerSpi = (CanonicalizerSpi) b(str).newInstance();
            this.c = canonicalizerSpi;
            canonicalizerSpi.a = true;
        } catch (Exception unused) {
            throw new InvalidCanonicalizerException(C0059ao.a(0), new Object[]{str});
        }
    }

    public static final Canonicalizer a(String str) {
        return new Canonicalizer(str);
    }

    public static void a() {
        if (a) {
            return;
        }
        b = new HashMap(10);
        a = true;
    }

    public static void a(String str, String str2) {
        Class b2 = b(str);
        if (b2 != null) {
            throw new AlgorithmAlreadyRegisteredException(C0059ao.a(2), new Object[]{str, b2});
        }
        try {
            b.put(str, Class.forName(str2));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(C0059ao.a(1));
        }
    }

    private static Class b(String str) {
        return (Class) b.get(str);
    }

    public void a(OutputStream outputStream) {
        this.c.a(outputStream);
    }

    public byte[] a(Node node) {
        return this.c.a(node);
    }

    public byte[] a(Node node, String str) {
        return this.c.a(node, str);
    }
}
