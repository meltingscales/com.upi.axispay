package org.apache.xml.security.c14n;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class CanonicalizerSpi {
    public boolean a = false;

    public abstract void a(OutputStream outputStream);

    public abstract byte[] a(Node node);

    public abstract byte[] a(Node node, String str);

    public byte[] a(byte[] bArr) {
        InputSource inputSource = new InputSource(new ByteArrayInputStream(bArr));
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        return a(newInstance.newDocumentBuilder().parse(inputSource));
    }
}
