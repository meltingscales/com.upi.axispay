package org.apache.xml.security;

import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.xml.parsers.DocumentBuilderFactory;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.SignatureAlgorithm;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.keys.KeyInfo;
import org.apache.xml.security.keys.keyresolver.KeyResolver;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.utils.ElementProxy;
import org.apache.xml.security.utils.I18n;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.resolver.ResourceResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Init {
    public static Log a;
    public static Class b;
    private static boolean c;

    static {
        Class cls = b;
        if (cls == null) {
            cls = a(C0059ao.a(337));
            b = cls;
        }
        a = LogFactory.getLog(cls.getName());
        c = false;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static final boolean a() {
        return c;
    }

    public static synchronized void b() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        Element[] elementArr;
        Element[] elementArr2;
        Element[] elementArr3;
        Element[] elementArr4;
        Element[] elementArr5;
        synchronized (Init.class) {
            if (c) {
                return;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                long currentTimeMillis2 = System.currentTimeMillis();
                long currentTimeMillis3 = System.currentTimeMillis();
                long currentTimeMillis4 = System.currentTimeMillis();
                DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
                newInstance.setNamespaceAware(true);
                newInstance.setValidating(false);
                Document parse = newInstance.newDocumentBuilder().parse((InputStream) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.xml.security.Init.1
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        String property = System.getProperty(C0059ao.a(5165));
                        Class<?> cls = getClass();
                        if (property == null) {
                            property = C0059ao.a(5166);
                        }
                        return cls.getResourceAsStream(property);
                    }
                }));
                long currentTimeMillis5 = System.currentTimeMillis();
                long currentTimeMillis6 = System.currentTimeMillis();
                try {
                    KeyInfo.a();
                    long currentTimeMillis7 = System.currentTimeMillis();
                    Node firstChild = parse.getFirstChild();
                    while (firstChild != null && !C0059ao.a(338).equals(firstChild.getLocalName())) {
                        firstChild = firstChild.getNextSibling();
                    }
                    Node firstChild2 = firstChild.getFirstChild();
                    long j5 = 0;
                    long j6 = 0;
                    long j7 = 0;
                    long j8 = 0;
                    long j9 = 0;
                    long j10 = 0;
                    long j11 = 0;
                    long j12 = 0;
                    long j13 = 0;
                    long j14 = 0;
                    long j15 = 0;
                    long j16 = 0;
                    long j17 = 0;
                    long j18 = 0;
                    long j19 = 0;
                    long j20 = 0;
                    while (firstChild2 != null) {
                        if (firstChild2 != null) {
                            j4 = currentTimeMillis6;
                            j2 = j5;
                            if (1 != firstChild2.getNodeType()) {
                                j = currentTimeMillis4;
                                j3 = currentTimeMillis5;
                            } else {
                                String localName = firstChild2.getLocalName();
                                if (localName.equals(C0059ao.a(339))) {
                                    j6 = System.currentTimeMillis();
                                    Element element = (Element) firstChild2;
                                    Attr attributeNode = element.getAttributeNode(C0059ao.a(340));
                                    j = currentTimeMillis4;
                                    Attr attributeNode2 = element.getAttributeNode(C0059ao.a(341));
                                    I18n.a(attributeNode == null ? null : attributeNode.getNodeValue(), attributeNode2 == null ? null : attributeNode2.getNodeValue());
                                    j2 = System.currentTimeMillis();
                                } else {
                                    j = currentTimeMillis4;
                                }
                                if (localName.equals(C0059ao.a(342))) {
                                    j8 = System.currentTimeMillis();
                                    Canonicalizer.a();
                                    Element[] a2 = XMLUtils.a(firstChild2.getFirstChild(), C0059ao.a(343), C0059ao.a(344));
                                    int i2 = 0;
                                    while (i2 < a2.length) {
                                        long j21 = currentTimeMillis5;
                                        String attributeNS = a2[i2].getAttributeNS(null, C0059ao.a(345));
                                        String attributeNS2 = a2[i2].getAttributeNS(null, C0059ao.a(346));
                                        try {
                                            Class.forName(attributeNS2);
                                            if (a.isDebugEnabled()) {
                                                Log log = a;
                                                StringBuffer stringBuffer = new StringBuffer();
                                                elementArr5 = a2;
                                                try {
                                                    stringBuffer.append(C0059ao.a(347));
                                                    stringBuffer.append(attributeNS);
                                                    stringBuffer.append(C0059ao.a(348));
                                                    stringBuffer.append(attributeNS2);
                                                    stringBuffer.append(C0059ao.a(349));
                                                    log.debug(stringBuffer.toString());
                                                } catch (ClassNotFoundException unused) {
                                                    a.fatal(I18n.a(C0059ao.a(350), new Object[]{attributeNS, attributeNS2}));
                                                    i2++;
                                                    a2 = elementArr5;
                                                    currentTimeMillis5 = j21;
                                                }
                                            } else {
                                                elementArr5 = a2;
                                            }
                                            Canonicalizer.a(attributeNS, attributeNS2);
                                        } catch (ClassNotFoundException unused2) {
                                            elementArr5 = a2;
                                        }
                                        i2++;
                                        a2 = elementArr5;
                                        currentTimeMillis5 = j21;
                                    }
                                    j3 = currentTimeMillis5;
                                    j7 = System.currentTimeMillis();
                                } else {
                                    j3 = currentTimeMillis5;
                                }
                                if (localName.equals(C0059ao.a(351))) {
                                    j20 = System.currentTimeMillis();
                                    Transform.a();
                                    int i3 = 0;
                                    for (Element[] a3 = XMLUtils.a(firstChild2.getFirstChild(), C0059ao.a(352), C0059ao.a(353)); i3 < a3.length; a3 = elementArr4) {
                                        String attributeNS3 = a3[i3].getAttributeNS(null, C0059ao.a(354));
                                        String attributeNS4 = a3[i3].getAttributeNS(null, C0059ao.a(355));
                                        try {
                                            Class.forName(attributeNS4);
                                            if (a.isDebugEnabled()) {
                                                Log log2 = a;
                                                StringBuffer stringBuffer2 = new StringBuffer();
                                                elementArr4 = a3;
                                                try {
                                                    stringBuffer2.append(C0059ao.a(356));
                                                    stringBuffer2.append(attributeNS3);
                                                    stringBuffer2.append(C0059ao.a(357));
                                                    stringBuffer2.append(attributeNS4);
                                                    stringBuffer2.append(C0059ao.a(358));
                                                    log2.debug(stringBuffer2.toString());
                                                } catch (ClassNotFoundException unused3) {
                                                    a.fatal(I18n.a(C0059ao.a(360), new Object[]{attributeNS3, attributeNS4}));
                                                    i3++;
                                                } catch (NoClassDefFoundError unused4) {
                                                    a.warn(C0059ao.a(359));
                                                    i3++;
                                                }
                                            } else {
                                                elementArr4 = a3;
                                            }
                                            Transform.a(attributeNS3, attributeNS4);
                                        } catch (ClassNotFoundException unused5) {
                                            elementArr4 = a3;
                                        } catch (NoClassDefFoundError unused6) {
                                            elementArr4 = a3;
                                        }
                                        i3++;
                                    }
                                    j19 = System.currentTimeMillis();
                                }
                                if (C0059ao.a(361).equals(localName)) {
                                    j10 = System.currentTimeMillis();
                                    JCEMapper.a((Element) firstChild2);
                                    j9 = System.currentTimeMillis();
                                }
                                if (localName.equals(C0059ao.a(362))) {
                                    j18 = System.currentTimeMillis();
                                    SignatureAlgorithm.h();
                                    int i4 = 0;
                                    for (Element[] a4 = XMLUtils.a(firstChild2.getFirstChild(), C0059ao.a(363), C0059ao.a(364)); i4 < a4.length; a4 = elementArr3) {
                                        String attributeNS5 = a4[i4].getAttributeNS(null, C0059ao.a(365));
                                        String attributeNS6 = a4[i4].getAttributeNS(null, C0059ao.a(366));
                                        try {
                                            Class.forName(attributeNS6);
                                            if (a.isDebugEnabled()) {
                                                Log log3 = a;
                                                StringBuffer stringBuffer3 = new StringBuffer();
                                                elementArr3 = a4;
                                                try {
                                                    stringBuffer3.append(C0059ao.a(367));
                                                    stringBuffer3.append(attributeNS5);
                                                    stringBuffer3.append(C0059ao.a(368));
                                                    stringBuffer3.append(attributeNS6);
                                                    stringBuffer3.append(C0059ao.a(369));
                                                    log3.debug(stringBuffer3.toString());
                                                } catch (ClassNotFoundException unused7) {
                                                    a.fatal(I18n.a(C0059ao.a(370), new Object[]{attributeNS5, attributeNS6}));
                                                    i4++;
                                                }
                                            } else {
                                                elementArr3 = a4;
                                            }
                                            SignatureAlgorithm.a(attributeNS5, attributeNS6);
                                        } catch (ClassNotFoundException unused8) {
                                            elementArr3 = a4;
                                        }
                                        i4++;
                                    }
                                    i = 0;
                                    j17 = System.currentTimeMillis();
                                } else {
                                    i = 0;
                                }
                                if (localName.equals(C0059ao.a(371))) {
                                    j16 = System.currentTimeMillis();
                                    ResourceResolver.a();
                                    int i5 = i;
                                    for (Element[] a5 = XMLUtils.a(firstChild2.getFirstChild(), C0059ao.a(372), C0059ao.a(373)); i5 < a5.length; a5 = elementArr2) {
                                        String attributeNS7 = a5[i5].getAttributeNS(null, C0059ao.a(374));
                                        String attributeNS8 = a5[i5].getAttributeNS(null, C0059ao.a(375));
                                        if (attributeNS8 == null || attributeNS8.length() <= 0) {
                                            elementArr2 = a5;
                                            if (a.isDebugEnabled()) {
                                                Log log4 = a;
                                                StringBuffer stringBuffer4 = new StringBuffer();
                                                stringBuffer4.append(C0059ao.a(378));
                                                stringBuffer4.append(attributeNS7);
                                                stringBuffer4.append(C0059ao.a(379));
                                                log4.debug(stringBuffer4.toString());
                                            }
                                        } else if (a.isDebugEnabled()) {
                                            Log log5 = a;
                                            StringBuffer stringBuffer5 = new StringBuffer();
                                            elementArr2 = a5;
                                            stringBuffer5.append(C0059ao.a(376));
                                            stringBuffer5.append(attributeNS7);
                                            stringBuffer5.append(C0059ao.a(377));
                                            stringBuffer5.append(attributeNS8);
                                            log5.debug(stringBuffer5.toString());
                                        } else {
                                            elementArr2 = a5;
                                        }
                                        try {
                                            ResourceResolver.a(attributeNS7);
                                        } catch (Throwable th) {
                                            Log log6 = a;
                                            StringBuffer stringBuffer6 = new StringBuffer();
                                            stringBuffer6.append(C0059ao.a(380));
                                            stringBuffer6.append(attributeNS7);
                                            stringBuffer6.append(C0059ao.a(381));
                                            log6.warn(stringBuffer6.toString(), th);
                                        }
                                        j15 = System.currentTimeMillis();
                                        i5++;
                                    }
                                }
                                if (localName.equals(C0059ao.a(382))) {
                                    j12 = System.currentTimeMillis();
                                    KeyResolver.a();
                                    Element[] a6 = XMLUtils.a(firstChild2.getFirstChild(), C0059ao.a(383), C0059ao.a(384));
                                    int i6 = 0;
                                    while (i6 < a6.length) {
                                        String attributeNS9 = a6[i6].getAttributeNS(null, C0059ao.a(385));
                                        String attributeNS10 = a6[i6].getAttributeNS(null, C0059ao.a(386));
                                        if (attributeNS10 == null || attributeNS10.length() <= 0) {
                                            elementArr = a6;
                                            if (a.isDebugEnabled()) {
                                                Log log7 = a;
                                                StringBuffer stringBuffer7 = new StringBuffer();
                                                stringBuffer7.append(C0059ao.a(389));
                                                stringBuffer7.append(attributeNS9);
                                                stringBuffer7.append(C0059ao.a(390));
                                                log7.debug(stringBuffer7.toString());
                                            }
                                        } else if (a.isDebugEnabled()) {
                                            Log log8 = a;
                                            StringBuffer stringBuffer8 = new StringBuffer();
                                            elementArr = a6;
                                            stringBuffer8.append(C0059ao.a(387));
                                            stringBuffer8.append(attributeNS9);
                                            stringBuffer8.append(C0059ao.a(388));
                                            stringBuffer8.append(attributeNS10);
                                            log8.debug(stringBuffer8.toString());
                                        } else {
                                            elementArr = a6;
                                        }
                                        KeyResolver.a(attributeNS9);
                                        i6++;
                                        a6 = elementArr;
                                    }
                                    j11 = System.currentTimeMillis();
                                }
                                if (localName.equals(C0059ao.a(391))) {
                                    long currentTimeMillis8 = System.currentTimeMillis();
                                    if (a.isDebugEnabled()) {
                                        a.debug(C0059ao.a(392));
                                    }
                                    Element[] a7 = XMLUtils.a(firstChild2.getFirstChild(), C0059ao.a(393), C0059ao.a(394));
                                    int i7 = 0;
                                    while (i7 < a7.length) {
                                        String attributeNS11 = a7[i7].getAttributeNS(null, C0059ao.a(395));
                                        long j22 = currentTimeMillis8;
                                        String attributeNS12 = a7[i7].getAttributeNS(null, C0059ao.a(396));
                                        if (a.isDebugEnabled()) {
                                            Log log9 = a;
                                            StringBuffer stringBuffer9 = new StringBuffer();
                                            stringBuffer9.append(C0059ao.a(397));
                                            stringBuffer9.append(attributeNS12);
                                            stringBuffer9.append(C0059ao.a(398));
                                            stringBuffer9.append(attributeNS11);
                                            log9.debug(stringBuffer9.toString());
                                        }
                                        ElementProxy.d(attributeNS11, attributeNS12);
                                        i7++;
                                        currentTimeMillis8 = j22;
                                    }
                                    j14 = currentTimeMillis8;
                                    j5 = j2;
                                    j13 = System.currentTimeMillis();
                                    firstChild2 = firstChild2.getNextSibling();
                                    currentTimeMillis6 = j4;
                                    currentTimeMillis4 = j;
                                    currentTimeMillis5 = j3;
                                }
                            }
                        } else {
                            j = currentTimeMillis4;
                            j2 = j5;
                            j3 = currentTimeMillis5;
                            j4 = currentTimeMillis6;
                        }
                        j5 = j2;
                        firstChild2 = firstChild2.getNextSibling();
                        currentTimeMillis6 = j4;
                        currentTimeMillis4 = j;
                        currentTimeMillis5 = j3;
                    }
                    long j23 = currentTimeMillis4;
                    long j24 = j5;
                    long j25 = currentTimeMillis5;
                    long j26 = currentTimeMillis6;
                    long currentTimeMillis9 = System.currentTimeMillis();
                    if (a.isDebugEnabled()) {
                        Log log10 = a;
                        StringBuffer stringBuffer10 = new StringBuffer();
                        stringBuffer10.append(C0059ao.a(399));
                        stringBuffer10.append((int) (currentTimeMillis9 - currentTimeMillis));
                        stringBuffer10.append(C0059ao.a(400));
                        log10.debug(stringBuffer10.toString());
                        Log log11 = a;
                        StringBuffer stringBuffer11 = new StringBuffer();
                        stringBuffer11.append(C0059ao.a(401));
                        stringBuffer11.append((int) (currentTimeMillis3 - currentTimeMillis2));
                        stringBuffer11.append(C0059ao.a(402));
                        log11.debug(stringBuffer11.toString());
                        Log log12 = a;
                        StringBuffer stringBuffer12 = new StringBuffer();
                        stringBuffer12.append(C0059ao.a(403));
                        stringBuffer12.append((int) (j25 - j23));
                        stringBuffer12.append(C0059ao.a(404));
                        log12.debug(stringBuffer12.toString());
                        Log log13 = a;
                        StringBuffer stringBuffer13 = new StringBuffer();
                        stringBuffer13.append(C0059ao.a(405));
                        stringBuffer13.append((int) (j24 - j6));
                        stringBuffer13.append(C0059ao.a(406));
                        log13.debug(stringBuffer13.toString());
                        Log log14 = a;
                        StringBuffer stringBuffer14 = new StringBuffer();
                        stringBuffer14.append(C0059ao.a(407));
                        stringBuffer14.append((int) (j7 - j8));
                        stringBuffer14.append(C0059ao.a(408));
                        log14.debug(stringBuffer14.toString());
                        Log log15 = a;
                        StringBuffer stringBuffer15 = new StringBuffer();
                        stringBuffer15.append(C0059ao.a(409));
                        stringBuffer15.append((int) (j9 - j10));
                        stringBuffer15.append(C0059ao.a(410));
                        log15.debug(stringBuffer15.toString());
                        Log log16 = a;
                        StringBuffer stringBuffer16 = new StringBuffer();
                        stringBuffer16.append(C0059ao.a(411));
                        stringBuffer16.append((int) (currentTimeMillis7 - j26));
                        stringBuffer16.append(C0059ao.a(412));
                        log16.debug(stringBuffer16.toString());
                        Log log17 = a;
                        StringBuffer stringBuffer17 = new StringBuffer();
                        stringBuffer17.append(C0059ao.a(413));
                        stringBuffer17.append((int) (j11 - j12));
                        stringBuffer17.append(C0059ao.a(414));
                        log17.debug(stringBuffer17.toString());
                        Log log18 = a;
                        StringBuffer stringBuffer18 = new StringBuffer();
                        stringBuffer18.append(C0059ao.a(415));
                        stringBuffer18.append((int) (j13 - j14));
                        stringBuffer18.append(C0059ao.a(416));
                        log18.debug(stringBuffer18.toString());
                        Log log19 = a;
                        StringBuffer stringBuffer19 = new StringBuffer();
                        stringBuffer19.append(C0059ao.a(417));
                        stringBuffer19.append((int) (j15 - j16));
                        stringBuffer19.append(C0059ao.a(418));
                        log19.debug(stringBuffer19.toString());
                        Log log20 = a;
                        StringBuffer stringBuffer20 = new StringBuffer();
                        stringBuffer20.append(C0059ao.a(419));
                        stringBuffer20.append((int) (j17 - j18));
                        stringBuffer20.append(C0059ao.a(420));
                        log20.debug(stringBuffer20.toString());
                        Log log21 = a;
                        StringBuffer stringBuffer21 = new StringBuffer();
                        stringBuffer21.append(C0059ao.a(421));
                        stringBuffer21.append((int) (j19 - j20));
                        stringBuffer21.append(C0059ao.a(422));
                        log21.debug(stringBuffer21.toString());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    throw e;
                }
            } catch (Exception e2) {
                a.fatal(C0059ao.a(423), e2);
                e2.printStackTrace();
            }
            c = true;
        }
    }
}
