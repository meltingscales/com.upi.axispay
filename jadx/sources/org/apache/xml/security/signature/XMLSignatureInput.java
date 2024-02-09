package org.apache.xml.security.signature;

import com.google.android.gms.vision.barcode.Barcode;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.implementations.Canonicalizer11_OmitComments;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments;
import org.apache.xml.security.c14n.implementations.CanonicalizerBase;
import org.apache.xml.security.exceptions.XMLSecurityRuntimeException;
import org.apache.xml.security.utils.IgnoreAllErrorHandler;
import org.apache.xml.security.utils.JavaUtils;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class XMLSignatureInput implements Cloneable {
    public static Log a;
    public static Class l;
    public InputStream b;
    public Set c;
    public Node d;
    public Node e;
    public boolean f;
    public boolean g;
    public byte[] h;
    public List i;
    public boolean j;
    public OutputStream k;
    private String m;
    private String n;

    static {
        Class cls = l;
        if (cls == null) {
            cls = c(C0059ao.a(11429));
            l = cls;
        }
        a = LogFactory.getLog(cls.getName());
    }

    public XMLSignatureInput(InputStream inputStream) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.h = null;
        this.m = null;
        this.n = null;
        this.i = new ArrayList();
        this.j = false;
        this.k = null;
        this.b = inputStream;
    }

    public XMLSignatureInput(Node node) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.h = null;
        this.m = null;
        this.n = null;
        this.i = new ArrayList();
        this.j = false;
        this.k = null;
        this.d = node;
    }

    public XMLSignatureInput(byte[] bArr) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.h = null;
        this.m = null;
        this.n = null;
        this.i = new ArrayList();
        this.j = false;
        this.k = null;
        this.h = bArr;
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public void a(OutputStream outputStream) {
        a(outputStream, false);
    }

    public void a(OutputStream outputStream, boolean z) {
        if (outputStream == this.k) {
            return;
        }
        byte[] bArr = this.h;
        if (bArr != null) {
            outputStream.write(bArr);
            return;
        }
        InputStream inputStream = this.b;
        if (inputStream == null) {
            CanonicalizerBase canonicalizer11_OmitComments = z ? new Canonicalizer11_OmitComments() : new Canonicalizer20010315OmitComments();
            canonicalizer11_OmitComments.a(outputStream);
            canonicalizer11_OmitComments.b(this);
        } else if (inputStream instanceof FileInputStream) {
            byte[] bArr2 = new byte[Barcode.AZTEC];
            while (true) {
                int read = this.b.read(bArr2);
                if (read == -1) {
                    return;
                }
                outputStream.write(bArr2, 0, read);
            }
        } else {
            InputStream o = o();
            byte[] bArr3 = this.h;
            if (bArr3 != null) {
                outputStream.write(bArr3, 0, bArr3.length);
                return;
            }
            o.reset();
            byte[] bArr4 = new byte[1024];
            while (true) {
                int read2 = o.read(bArr4);
                if (read2 <= 0) {
                    return;
                }
                outputStream.write(bArr4, 0, read2);
            }
        }
    }

    public void a(String str) {
        this.m = str;
    }

    public void a(NodeFilter nodeFilter) {
        if (h()) {
            try {
                q();
            } catch (Exception e) {
                throw new XMLSecurityRuntimeException(C0059ao.a(11430), e);
            }
        }
        this.i.add(nodeFilter);
    }

    public void a(Node node) {
        this.e = node;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public boolean a() {
        return this.j;
    }

    public Set b() {
        return b(false);
    }

    public Set b(boolean z) {
        Node node;
        Set set = this.c;
        if (set != null) {
            return set;
        }
        if (this.b != null || (node = this.d) == null) {
            if (h()) {
                q();
                HashSet hashSet = new HashSet();
                XMLUtils.a(this.d, (Set) hashSet, (Node) null, false);
                return hashSet;
            }
            throw new RuntimeException(C0059ao.a(11431));
        }
        if (z) {
            XMLUtils.a(XMLUtils.b(node));
        }
        HashSet hashSet2 = new HashSet();
        this.c = hashSet2;
        XMLUtils.a(this.d, hashSet2, this.e, this.f);
        return this.c;
    }

    public void b(OutputStream outputStream) {
        this.k = outputStream;
    }

    public void b(String str) {
        this.n = str;
    }

    public InputStream c() {
        InputStream inputStream = this.b;
        return inputStream instanceof FileInputStream ? inputStream : o();
    }

    public void c(boolean z) {
        this.f = z;
    }

    public InputStream d() {
        return this.b;
    }

    public void d(boolean z) {
        this.g = z;
    }

    public byte[] e() {
        byte[] bArr = this.h;
        if (bArr != null) {
            return bArr;
        }
        InputStream o = o();
        if (o == null) {
            byte[] b = new Canonicalizer20010315OmitComments().b(this);
            this.h = b;
            return b;
        }
        if (this.h == null) {
            o.reset();
            this.h = JavaUtils.a(o);
        }
        return this.h;
    }

    public boolean f() {
        return (this.b == null && this.c != null) || this.g;
    }

    public boolean g() {
        return this.b == null && this.d != null && this.c == null && !this.g;
    }

    public boolean h() {
        return !(this.b == null && this.h == null) && this.c == null && this.d == null;
    }

    public boolean i() {
        return this.k != null;
    }

    public boolean j() {
        return this.h != null && this.c == null && this.d == null;
    }

    public String k() {
        return this.n;
    }

    public Node l() {
        return this.e;
    }

    public Node m() {
        return this.d;
    }

    public boolean n() {
        return this.f;
    }

    public InputStream o() {
        ByteArrayInputStream byteArrayInputStream;
        InputStream inputStream = this.b;
        if (inputStream instanceof ByteArrayInputStream) {
            if (inputStream.markSupported()) {
                return this.b;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(11432));
            stringBuffer.append(this.b);
            throw new RuntimeException(stringBuffer.toString());
        }
        if (this.h != null) {
            byteArrayInputStream = new ByteArrayInputStream(this.h);
        } else if (inputStream == null) {
            return null;
        } else {
            if (inputStream.markSupported()) {
                a.info(C0059ao.a(11433));
            }
            this.h = JavaUtils.a(this.b);
            this.b.close();
            byteArrayInputStream = new ByteArrayInputStream(this.h);
        }
        this.b = byteArrayInputStream;
        return byteArrayInputStream;
    }

    public List p() {
        return this.i;
    }

    public void q() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setValidating(false);
        newInstance.setNamespaceAware(true);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        try {
            newDocumentBuilder.setErrorHandler(new IgnoreAllErrorHandler());
            this.d = newDocumentBuilder.parse(c());
        } catch (SAXException unused) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(C0059ao.a(11434).getBytes());
            byteArrayOutputStream.write(e());
            byteArrayOutputStream.write(C0059ao.a(11435).getBytes());
            this.d = newDocumentBuilder.parse(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).getDocumentElement().getFirstChild().getFirstChild();
        }
        this.b = null;
        this.h = null;
    }

    public String toString() {
        String a2 = C0059ao.a(11436);
        if (f()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0059ao.a(11437));
            stringBuffer.append(this.c.size());
            stringBuffer.append(C0059ao.a(11438));
            stringBuffer.append(k());
            return stringBuffer.toString();
        } else if (g()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(C0059ao.a(11439));
            stringBuffer2.append(this.d);
            stringBuffer2.append(C0059ao.a(11440));
            stringBuffer2.append(this.e);
            stringBuffer2.append(C0059ao.a(11441));
            stringBuffer2.append(this.f);
            stringBuffer2.append(C0059ao.a(11442));
            stringBuffer2.append(k());
            return stringBuffer2.toString();
        } else {
            try {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(C0059ao.a(11443));
                stringBuffer3.append(e().length);
                stringBuffer3.append(C0059ao.a(11444));
                stringBuffer3.append(k());
                return stringBuffer3.toString();
            } catch (IOException unused) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(a2);
                stringBuffer4.append(k());
                return stringBuffer4.toString();
            } catch (CanonicalizationException unused2) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(a2);
                stringBuffer5.append(k());
                return stringBuffer5.toString();
            }
        }
    }
}
