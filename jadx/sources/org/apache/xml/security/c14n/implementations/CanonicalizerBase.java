package org.apache.xml.security.c14n.implementations;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import myunmn.C0059ao;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.CanonicalizerSpi;
import org.apache.xml.security.c14n.helper.AttrCompare;
import org.apache.xml.security.signature.NodeFilter;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.UnsyncByteArrayOutputStream;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.SAXException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class CanonicalizerBase extends CanonicalizerSpi {
    public static final Attr i;
    public List j;
    public boolean k;
    public Set l = null;
    public Node m = null;
    public OutputStream n = new UnsyncByteArrayOutputStream();
    private static final byte[] b = {63, 62};
    private static final byte[] c = {60, 63};
    private static final byte[] d = {45, 45, 62};
    private static final byte[] e = {60, 33, 45, 45};
    private static final byte[] f = {38, 35, 120, 65, 59};
    private static final byte[] o = {38, 35, 120, 57, 59};
    private static final byte[] p = {38, 113, 117, 111, 116, 59};
    private static final byte[] q = {38, 35, 120, 68, 59};
    private static final byte[] r = {38, 103, 116, 59};
    private static final byte[] s = {38, 108, 116, 59};
    private static final byte[] t = {60, 47};
    private static final byte[] u = {38, 97, 109, 112, 59};
    public static final AttrCompare g = new AttrCompare();
    public static final byte[] h = {61, 34};

    static {
        try {
            Attr createAttributeNS = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().createAttributeNS(C0059ao.a(5868), C0059ao.a(5869));
            i = createAttributeNS;
            createAttributeNS.setValue(C0059ao.a(5870));
        } catch (Exception e2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(5871));
            stringBuffer.append(e2);
            throw new RuntimeException(stringBuffer.toString());
        }
    }

    public CanonicalizerBase(boolean z) {
        this.k = z;
    }

    public static final void a(String str, OutputStream outputStream) {
        byte[] bArr;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\r') {
                bArr = q;
            } else if (charAt == '&') {
                bArr = u;
            } else if (charAt == '<') {
                bArr = s;
            } else if (charAt != '>') {
                if (charAt < 128) {
                    outputStream.write(charAt);
                } else {
                    UtfHelpper.a(charAt, outputStream);
                }
            } else {
                bArr = r;
            }
            outputStream.write(bArr);
        }
    }

    public static final void a(String str, String str2, OutputStream outputStream, Map map) {
        byte[] bArr;
        outputStream.write(32);
        UtfHelpper.a(str, outputStream, map);
        outputStream.write(h);
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str2.charAt(i2);
            if (charAt == '\t') {
                bArr = o;
            } else if (charAt == '\n') {
                bArr = f;
            } else if (charAt == '\r') {
                bArr = q;
            } else if (charAt == '\"') {
                bArr = p;
            } else if (charAt == '&') {
                bArr = u;
            } else if (charAt != '<') {
                if (charAt < 128) {
                    outputStream.write(charAt);
                } else {
                    UtfHelpper.a(charAt, outputStream);
                }
                i2 = i3;
            } else {
                bArr = s;
            }
            outputStream.write(bArr);
            i2 = i3;
        }
        outputStream.write(34);
    }

    public static final void a(Comment comment, OutputStream outputStream, int i2) {
        if (i2 == 1) {
            outputStream.write(10);
        }
        outputStream.write(e);
        String data = comment.getData();
        int length = data.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = data.charAt(i3);
            if (charAt == '\r') {
                outputStream.write(q);
            } else if (charAt < 128) {
                outputStream.write(charAt);
            } else {
                UtfHelpper.a(charAt, outputStream);
            }
        }
        outputStream.write(d);
        if (i2 == -1) {
            outputStream.write(10);
        }
    }

    public static final void a(ProcessingInstruction processingInstruction, OutputStream outputStream, int i2) {
        if (i2 == 1) {
            outputStream.write(10);
        }
        outputStream.write(c);
        String target = processingInstruction.getTarget();
        int length = target.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = target.charAt(i3);
            if (charAt == '\r') {
                outputStream.write(q);
            } else if (charAt < 128) {
                outputStream.write(charAt);
            } else {
                UtfHelpper.a(charAt, outputStream);
            }
        }
        String data = processingInstruction.getData();
        int length2 = data.length();
        if (length2 > 0) {
            outputStream.write(32);
            for (int i4 = 0; i4 < length2; i4++) {
                char charAt2 = data.charAt(i4);
                if (charAt2 == '\r') {
                    outputStream.write(q);
                } else {
                    UtfHelpper.a(charAt2, outputStream);
                }
            }
        }
        outputStream.write(b);
        if (i2 == -1) {
            outputStream.write(10);
        }
    }

    private byte[] d(Node node) {
        String a = C0059ao.a(5872);
        try {
            b(node, node);
            this.n.close();
            OutputStream outputStream = this.n;
            if (outputStream instanceof ByteArrayOutputStream) {
                byte[] byteArray = ((ByteArrayOutputStream) outputStream).toByteArray();
                if (this.a) {
                    ((ByteArrayOutputStream) this.n).reset();
                }
                return byteArray;
            } else if (outputStream instanceof UnsyncByteArrayOutputStream) {
                byte[] a2 = ((UnsyncByteArrayOutputStream) outputStream).a();
                if (this.a) {
                    ((UnsyncByteArrayOutputStream) this.n).b();
                }
                return a2;
            } else {
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            throw new CanonicalizationException(a, e2);
        } catch (IOException e3) {
            throw new CanonicalizationException(a, e3);
        }
    }

    public int a(Node node, int i2) {
        List<NodeFilter> list = this.j;
        if (list != null) {
            for (NodeFilter nodeFilter : list) {
                int a = nodeFilter.a(node, i2);
                if (a != 1) {
                    return a;
                }
            }
        }
        Set set = this.l;
        return (set == null || set.contains(node)) ? 1 : 0;
    }

    public abstract Iterator a(Element element, NameSpaceSymbTable nameSpaceSymbTable);

    @Override // org.apache.xml.security.c14n.CanonicalizerSpi
    public void a(OutputStream outputStream) {
        this.n = outputStream;
    }

    public abstract void a(XMLSignatureInput xMLSignatureInput);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(Node node, NameSpaceSymbTable nameSpaceSymbTable, Node node2, int i2) {
        if (b(node) == -1) {
            return;
        }
        OutputStream outputStream = this.n;
        Node node3 = this.m;
        boolean z = this.k;
        HashMap hashMap = new HashMap();
        Node node4 = node;
        int i3 = i2;
        Element element = null;
        Node node5 = null;
        while (true) {
            switch (node4.getNodeType()) {
                case 1:
                    i3 = 0;
                    if (node4 != node3) {
                        Element element2 = (Element) node4;
                        nameSpaceSymbTable.a();
                        outputStream.write(60);
                        String tagName = element2.getTagName();
                        UtfHelpper.a(tagName, outputStream, hashMap);
                        Iterator a = a(element2, nameSpaceSymbTable);
                        if (a != null) {
                            while (a.hasNext()) {
                                Attr attr = (Attr) a.next();
                                a(attr.getNodeName(), attr.getNodeValue(), outputStream, hashMap);
                            }
                        }
                        outputStream.write(62);
                        Node firstChild = node4.getFirstChild();
                        if (firstChild != null) {
                            node4 = firstChild;
                            element = element2;
                            break;
                        } else {
                            outputStream.write(t);
                            UtfHelpper.a(tagName, outputStream);
                            outputStream.write(62);
                            nameSpaceSymbTable.b();
                            if (element != null) {
                                firstChild = node4.getNextSibling();
                            }
                            node4 = firstChild;
                            break;
                        }
                    }
                    node4 = node5;
                    break;
                case 2:
                case 6:
                case 12:
                    throw new CanonicalizationException(C0059ao.a(5873));
                case 3:
                case 4:
                    a(node4.getNodeValue(), outputStream);
                    node4 = node5;
                    break;
                case 5:
                case 10:
                default:
                    node4 = node5;
                    break;
                case 7:
                    a((ProcessingInstruction) node4, outputStream, i3);
                    node4 = node5;
                    break;
                case 8:
                    if (z) {
                        a((Comment) node4, outputStream, i3);
                    }
                    node4 = node5;
                    break;
                case 9:
                case 11:
                    nameSpaceSymbTable.a();
                    node4 = node4.getFirstChild();
                    break;
            }
            while (node4 == null && element != null) {
                outputStream.write(t);
                UtfHelpper.a(element.getTagName(), outputStream, hashMap);
                outputStream.write(62);
                nameSpaceSymbTable.b();
                if (element == node2) {
                    return;
                }
                node4 = element.getNextSibling();
                element = element.getParentNode();
                if (element == null || 1 != element.getNodeType()) {
                    i3 = 1;
                    element = null;
                }
            }
            if (node4 == null) {
                return;
            }
            node5 = node4.getNextSibling();
        }
    }

    public byte[] a(Set set) {
        this.l = set;
        return d(XMLUtils.a(set));
    }

    @Override // org.apache.xml.security.c14n.CanonicalizerSpi
    public byte[] a(Node node) {
        return a(node, (Node) null);
    }

    public byte[] a(Node node, Node node2) {
        String a = C0059ao.a(5874);
        this.m = node2;
        try {
            NameSpaceSymbTable nameSpaceSymbTable = new NameSpaceSymbTable();
            int i2 = -1;
            if (node != null && 1 == node.getNodeType()) {
                d((Element) node, nameSpaceSymbTable);
                i2 = 0;
            }
            a(node, nameSpaceSymbTable, node, i2);
            this.n.close();
            OutputStream outputStream = this.n;
            if (outputStream instanceof ByteArrayOutputStream) {
                byte[] byteArray = ((ByteArrayOutputStream) outputStream).toByteArray();
                if (this.a) {
                    ((ByteArrayOutputStream) this.n).reset();
                }
                return byteArray;
            } else if (outputStream instanceof UnsyncByteArrayOutputStream) {
                byte[] a2 = ((UnsyncByteArrayOutputStream) outputStream).a();
                if (this.a) {
                    ((UnsyncByteArrayOutputStream) this.n).b();
                }
                return a2;
            } else {
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            throw new CanonicalizationException(a, e2);
        } catch (IOException e3) {
            throw new CanonicalizationException(a, e3);
        }
    }

    public int b(Node node) {
        List<NodeFilter> list = this.j;
        if (list != null) {
            for (NodeFilter nodeFilter : list) {
                int a = nodeFilter.a(node);
                if (a != 1) {
                    return a;
                }
            }
        }
        Set set = this.l;
        return (set == null || set.contains(node)) ? 1 : 0;
    }

    public abstract Iterator b(Element element, NameSpaceSymbTable nameSpaceSymbTable);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(Node node, Node node2) {
        String str;
        int i2 = -1;
        if (b(node) == -1) {
            return;
        }
        NameSpaceSymbTable nameSpaceSymbTable = new NameSpaceSymbTable();
        if (node != null && 1 == node.getNodeType()) {
            d((Element) node, nameSpaceSymbTable);
        }
        OutputStream outputStream = this.n;
        HashMap hashMap = new HashMap();
        Node node3 = node;
        int i3 = -1;
        Element element = null;
        Node node4 = null;
        while (true) {
            switch (node3.getNodeType()) {
                case 1:
                    Element element2 = (Element) node3;
                    int a = a(node3, nameSpaceSymbTable.f());
                    if (a == i2) {
                        node3 = node3.getNextSibling();
                    } else {
                        boolean z = a == 1;
                        if (z) {
                            nameSpaceSymbTable.a();
                            outputStream.write(60);
                            str = element2.getTagName();
                            UtfHelpper.a(str, outputStream, hashMap);
                        } else {
                            nameSpaceSymbTable.c();
                            str = null;
                        }
                        Iterator b2 = b(element2, nameSpaceSymbTable);
                        if (b2 != null) {
                            while (b2.hasNext()) {
                                Attr attr = (Attr) b2.next();
                                a(attr.getNodeName(), attr.getNodeValue(), outputStream, hashMap);
                            }
                        }
                        if (z) {
                            outputStream.write(62);
                        }
                        Node firstChild = node3.getFirstChild();
                        if (firstChild == null) {
                            if (z) {
                                outputStream.write(t);
                                UtfHelpper.a(str, outputStream, hashMap);
                                outputStream.write(62);
                                nameSpaceSymbTable.b();
                            } else {
                                nameSpaceSymbTable.d();
                            }
                            if (element != null) {
                                firstChild = node3.getNextSibling();
                            }
                            node3 = firstChild;
                        } else {
                            node3 = firstChild;
                            element = element2;
                        }
                    }
                    i3 = 0;
                    break;
                case 2:
                case 6:
                case 12:
                    throw new CanonicalizationException(C0059ao.a(5875));
                case 3:
                case 4:
                    if (c(node3)) {
                        a(node3.getNodeValue(), outputStream);
                        while (true) {
                            node3 = node3.getNextSibling();
                            if (node3 != null && (node3.getNodeType() == 3 || node3.getNodeType() == 4)) {
                                a(node3.getNodeValue(), outputStream);
                                node4 = node3.getNextSibling();
                            }
                        }
                    }
                    node3 = node4;
                    break;
                case 5:
                case 10:
                default:
                    node3 = node4;
                    break;
                case 7:
                    if (c(node3)) {
                        a((ProcessingInstruction) node3, outputStream, i3);
                    }
                    node3 = node4;
                    break;
                case 8:
                    if (this.k && a(node3, nameSpaceSymbTable.f()) == 1) {
                        a((Comment) node3, outputStream, i3);
                    }
                    node3 = node4;
                    break;
                case 9:
                case 11:
                    nameSpaceSymbTable.a();
                    node3 = node3.getFirstChild();
                    break;
            }
            while (node3 == null && element != null) {
                if (c(element)) {
                    outputStream.write(t);
                    UtfHelpper.a(element.getTagName(), outputStream, hashMap);
                    outputStream.write(62);
                    nameSpaceSymbTable.b();
                } else {
                    nameSpaceSymbTable.d();
                }
                if (element == node2) {
                    return;
                }
                node3 = element.getNextSibling();
                element = element.getParentNode();
                if (element == null || 1 != element.getNodeType()) {
                    i3 = 1;
                    element = null;
                }
            }
            if (node3 == null) {
                return;
            }
            node4 = node3.getNextSibling();
            i2 = -1;
        }
    }

    public byte[] b(XMLSignatureInput xMLSignatureInput) {
        String a = C0059ao.a(5876);
        try {
            if (xMLSignatureInput.n()) {
                this.k = false;
            }
            if (xMLSignatureInput.h()) {
                return a(xMLSignatureInput.e());
            }
            if (xMLSignatureInput.g()) {
                return a(xMLSignatureInput.m(), xMLSignatureInput.l());
            }
            if (xMLSignatureInput.f()) {
                this.j = xMLSignatureInput.p();
                a(xMLSignatureInput);
                return xMLSignatureInput.m() != null ? d(xMLSignatureInput.m()) : a(xMLSignatureInput.b());
            }
            return null;
        } catch (IOException e2) {
            throw new CanonicalizationException(a, e2);
        } catch (ParserConfigurationException e3) {
            throw new CanonicalizationException(a, e3);
        } catch (CanonicalizationException e4) {
            throw new CanonicalizationException(a, e4);
        } catch (SAXException e5) {
            throw new CanonicalizationException(a, e5);
        }
    }

    public void c(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        if (element.hasAttributes()) {
            NamedNodeMap attributes = element.getAttributes();
            int length = attributes.getLength();
            for (int i2 = 0; i2 < length; i2++) {
                Attr attr = (Attr) attributes.item(i2);
                if (C0059ao.a(5877).equals(attr.getNamespaceURI())) {
                    String localName = attr.getLocalName();
                    String nodeValue = attr.getNodeValue();
                    if (!C0059ao.a(5878).equals(localName) || !C0059ao.a(5879).equals(nodeValue)) {
                        nameSpaceSymbTable.a(localName, nodeValue, attr);
                    }
                }
            }
        }
    }

    public boolean c(Node node) {
        List<NodeFilter> list = this.j;
        if (list != null) {
            for (NodeFilter nodeFilter : list) {
                if (nodeFilter.a(node) != 1) {
                    return false;
                }
            }
        }
        Set set = this.l;
        return set == null || set.contains(node);
    }

    public final void d(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        ArrayList arrayList = new ArrayList(10);
        Node parentNode = element.getParentNode();
        if (parentNode == null || 1 != parentNode.getNodeType()) {
            return;
        }
        do {
            Element element2 = (Element) parentNode;
            if (element2 == null) {
                break;
            }
            arrayList.add(element2);
            parentNode = element2.getParentNode();
            if (parentNode == null) {
                break;
            }
        } while (1 == parentNode.getNodeType());
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            c((Element) listIterator.previous(), nameSpaceSymbTable);
        }
        String a = C0059ao.a(5880);
        Attr b2 = nameSpaceSymbTable.b(a);
        if (b2 != null) {
            String value = b2.getValue();
            String a2 = C0059ao.a(5881);
            if (a2.equals(value)) {
                nameSpaceSymbTable.b(a, a2, i);
            }
        }
    }
}
