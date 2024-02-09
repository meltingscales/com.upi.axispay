package org.apache.xml.security.utils.resolver.implementations;

import com.google.android.gms.vision.barcode.Barcode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.utils.resolver.ResourceResolverException;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.apache.xml.utils.URI;
import org.w3c.dom.Attr;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class ResolverDirectHTTP extends ResourceResolverSpi {
    public static Log d;
    public static Class e;
    private static final String[] f;

    static {
        Class cls = e;
        if (cls == null) {
            cls = c(C0059ao.a(15460));
            e = cls;
        }
        d = LogFactory.getLog(cls.getName());
        f = new String[]{C0059ao.a(15461), C0059ao.a(15462), C0059ao.a(15463), C0059ao.a(15464), C0059ao.a(15465), C0059ao.a(15466)};
    }

    private URI a(String str, String str2) {
        return (str2 == null || C0059ao.a(15467).equals(str2)) ? new URI(str) : new URI(new URI(str2), str);
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public XMLSignatureInput a(Attr attr, String str) {
        String str2;
        String str3;
        String str4;
        Attr attr2;
        String str5;
        String str6;
        String str7;
        String a = C0059ao.a(15468);
        try {
            try {
                String[] strArr = f;
                try {
                    String a2 = a(strArr[0]);
                    String a3 = a(strArr[1]);
                    boolean z = (a2 == null || a3 == null) ? false : true;
                    String a4 = C0059ao.a(15469);
                    String a5 = C0059ao.a(15470);
                    String a6 = C0059ao.a(15471);
                    String a7 = C0059ao.a(15472);
                    if (z) {
                        if (d.isDebugEnabled()) {
                            Log log = d;
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append(C0059ao.a(15473));
                            stringBuffer.append(a2);
                            stringBuffer.append(a4);
                            stringBuffer.append(a3);
                            log.debug(stringBuffer.toString());
                        }
                        str5 = System.getProperty(a7);
                        str6 = System.getProperty(a6);
                        str7 = System.getProperty(a5);
                        System.setProperty(a7, C0059ao.a(15474));
                        System.setProperty(a6, a2);
                        System.setProperty(a5, a3);
                    } else {
                        str5 = null;
                        str6 = null;
                        str7 = null;
                    }
                    boolean z2 = (str5 == null || str6 == null || str7 == null) ? false : true;
                    URI a8 = a(attr.getNodeValue(), str);
                    URI uri = new URI(a8);
                    uri.setFragment((String) null);
                    URL url = new URL(uri.toString());
                    URLConnection openConnection = url.openConnection();
                    String a9 = a(strArr[2]);
                    String a10 = a(strArr[3]);
                    if (a9 == null || a10 == null) {
                        str2 = a;
                    } else {
                        str2 = a;
                        try {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append(a9);
                            stringBuffer2.append(a4);
                            stringBuffer2.append(a10);
                            openConnection.setRequestProperty(C0059ao.a(15475), Base64.b(stringBuffer2.toString().getBytes()));
                        } catch (MalformedURLException e2) {
                            e = e2;
                            attr2 = attr;
                            str4 = str;
                            str3 = str2;
                            throw new ResourceResolverException(str3, e, attr2, str4);
                        } catch (IOException e3) {
                            e = e3;
                            throw new ResourceResolverException(str2, e, attr, str);
                        }
                    }
                    String headerField = openConnection.getHeaderField(C0059ao.a(15476));
                    if (headerField != null && headerField.startsWith(C0059ao.a(15477))) {
                        String a11 = a(strArr[4]);
                        String a12 = a(strArr[5]);
                        if (a11 != null && a12 != null) {
                            openConnection = url.openConnection();
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append(a11);
                            stringBuffer3.append(a4);
                            stringBuffer3.append(a12);
                            String b = Base64.b(stringBuffer3.toString().getBytes());
                            String a13 = C0059ao.a(15478);
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append(C0059ao.a(15479));
                            stringBuffer4.append(b);
                            openConnection.setRequestProperty(a13, stringBuffer4.toString());
                        }
                    }
                    String headerField2 = openConnection.getHeaderField(C0059ao.a(15480));
                    InputStream inputStream = openConnection.getInputStream();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[Barcode.AZTEC];
                    int i = 0;
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                        i += read;
                    }
                    Log log2 = d;
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append(C0059ao.a(15481));
                    stringBuffer5.append(i);
                    stringBuffer5.append(C0059ao.a(15482));
                    stringBuffer5.append(a8.toString());
                    log2.debug(stringBuffer5.toString());
                    XMLSignatureInput xMLSignatureInput = new XMLSignatureInput(byteArrayOutputStream.toByteArray());
                    xMLSignatureInput.b(a8.toString());
                    xMLSignatureInput.a(headerField2);
                    if (z && z2) {
                        System.setProperty(a7, str5);
                        System.setProperty(a6, str6);
                        System.setProperty(a5, str7);
                    }
                    return xMLSignatureInput;
                } catch (MalformedURLException e4) {
                    e = e4;
                    attr2 = attr;
                    str3 = a;
                    str4 = str;
                }
            } catch (IOException e5) {
                e = e5;
                str2 = a;
            }
        } catch (MalformedURLException e6) {
            e = e6;
            str3 = a;
            str4 = str;
            attr2 = attr;
        }
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public boolean a() {
        return true;
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public boolean b(Attr attr, String str) {
        Log log;
        String a;
        if (attr == null) {
            log = d;
            a = C0059ao.a(15483);
        } else {
            String nodeValue = attr.getNodeValue();
            if (!nodeValue.equals(C0059ao.a(15484)) && nodeValue.charAt(0) != '#') {
                if (d.isDebugEnabled()) {
                    Log log2 = d;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(C0059ao.a(15485));
                    stringBuffer.append(nodeValue);
                    log2.debug(stringBuffer.toString());
                }
                String a2 = C0059ao.a(15486);
                if (!nodeValue.startsWith(a2) && (str == null || !str.startsWith(a2))) {
                    if (d.isDebugEnabled()) {
                        Log log3 = d;
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append(C0059ao.a(15487));
                        stringBuffer2.append(nodeValue);
                        log3.debug(stringBuffer2.toString());
                    }
                    return false;
                } else if (d.isDebugEnabled()) {
                    Log log4 = d;
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(C0059ao.a(15488));
                    stringBuffer3.append(nodeValue);
                    log4.debug(stringBuffer3.toString());
                    return true;
                } else {
                    return true;
                }
            }
            log = d;
            a = C0059ao.a(15489);
        }
        log.debug(a);
        return false;
    }
}
