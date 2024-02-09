package org.apache.xml.security.utils.resolver.implementations;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.FileInputStream;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.resolver.ResourceResolverException;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.apache.xml.utils.URI;
import org.w3c.dom.Attr;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class ResolverLocalFilesystem extends ResourceResolverSpi {
    public static Log d;
    public static Class e;
    private static int f;

    static {
        Class cls = e;
        if (cls == null) {
            cls = c(C0059ao.a(8189));
            e = cls;
        }
        d = LogFactory.getLog(cls.getName());
        f = 6;
    }

    private static URI a(String str, String str2) {
        return (str2 == null || C0059ao.a(8190).equals(str2)) ? new URI(str) : new URI(new URI(str2), str);
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    private static String d(String str) {
        int indexOf;
        String substring = str.substring(f);
        String a = C0059ao.a(8191);
        if (substring.indexOf(a) > -1) {
            int i = 0;
            StringBuffer stringBuffer = new StringBuffer(substring.length());
            do {
                indexOf = substring.indexOf(a, i);
                if (indexOf == -1) {
                    stringBuffer.append(substring.substring(i));
                    continue;
                } else {
                    stringBuffer.append(substring.substring(i, indexOf));
                    stringBuffer.append(' ');
                    i = indexOf + 3;
                    continue;
                }
            } while (indexOf != -1);
            substring = stringBuffer.toString();
        }
        if (substring.charAt(1) == ':') {
            return substring;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(C0059ao.a(UserMetadata.MAX_INTERNAL_KEY_SIZE));
        stringBuffer2.append(substring);
        return stringBuffer2.toString();
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public XMLSignatureInput a(Attr attr, String str) {
        try {
            URI a = a(attr.getNodeValue(), str);
            URI uri = new URI(a);
            uri.setFragment((String) null);
            XMLSignatureInput xMLSignatureInput = new XMLSignatureInput(new FileInputStream(d(uri.toString())));
            xMLSignatureInput.b(a.toString());
            return xMLSignatureInput;
        } catch (Exception e2) {
            throw new ResourceResolverException(C0059ao.a(8193), e2, attr, str);
        }
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public boolean a() {
        return true;
    }

    @Override // org.apache.xml.security.utils.resolver.ResourceResolverSpi
    public boolean b(Attr attr, String str) {
        String a = C0059ao.a(8194);
        if (attr == null) {
            return false;
        }
        String nodeValue = attr.getNodeValue();
        if (!nodeValue.equals(C0059ao.a(8195)) && nodeValue.charAt(0) != '#' && !nodeValue.startsWith(C0059ao.a(8196))) {
            try {
                if (d.isDebugEnabled()) {
                    Log log = d;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(C0059ao.a(8197));
                    stringBuffer.append(nodeValue);
                    log.debug(stringBuffer.toString());
                }
                if (nodeValue.startsWith(a) || str.startsWith(a)) {
                    if (d.isDebugEnabled()) {
                        Log log2 = d;
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append(C0059ao.a(8198));
                        stringBuffer2.append(nodeValue);
                        log2.debug(stringBuffer2.toString());
                        return true;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            d.debug(C0059ao.a(8199));
        }
        return false;
    }
}
