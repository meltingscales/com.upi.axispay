package in.org.npci.commonlibrary.a;

import java.io.StringReader;
import java.security.PublicKey;
import javax.xml.parsers.DocumentBuilderFactory;
import myunmn.C0059ao;
import org.apache.xml.security.signature.XMLSignature;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class a {
    public static Document a(String str) {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        return newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(str)));
    }

    public static boolean b(Document document, PublicKey publicKey) {
        NodeList elementsByTagNameNS = document.getElementsByTagNameNS(C0059ao.a(3235), C0059ao.a(3236));
        if (elementsByTagNameNS.getLength() != 0) {
            return new XMLSignature((Element) elementsByTagNameNS.item(0), C0059ao.a(3237)).a(publicKey);
        }
        throw new Exception(C0059ao.a(3238));
    }
}
