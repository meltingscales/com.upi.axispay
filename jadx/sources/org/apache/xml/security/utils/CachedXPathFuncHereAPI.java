package org.apache.xml.security.utils;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.SourceLocator;
import javax.xml.transform.TransformerException;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.dtm.DTMManager;
import org.apache.xml.security.transforms.implementations.FuncHereContext;
import org.apache.xml.utils.PrefixResolver;
import org.apache.xml.utils.PrefixResolverDefault;
import org.apache.xpath.CachedXPathAPI;
import org.apache.xpath.XPath;
import org.apache.xpath.XPathContext;
import org.apache.xpath.compiler.FunctionTable;
import org.apache.xpath.objects.XObject;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class CachedXPathFuncHereAPI {
    public static Log a;
    public static FunctionTable g;
    public static Class h;
    public static Class i;
    public static Class j;
    public static Class k;
    public static Class l;
    public static Class m;
    public static Class n;
    public static Class o;
    public static Class p;
    public static Class q;
    public FuncHereContext b;
    public DTMManager c;
    public XPathContext d;
    public String e;
    public XPath f;

    static {
        Class cls = h;
        if (cls == null) {
            cls = a(C0059ao.a(9816));
            h = cls;
        }
        a = LogFactory.getLog(cls.getName());
        g = null;
        a();
    }

    private CachedXPathFuncHereAPI() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public CachedXPathFuncHereAPI(CachedXPathAPI cachedXPathAPI) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.c = cachedXPathAPI.getXPathContext().getDTMManager();
        this.d = cachedXPathAPI.getXPathContext();
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static String a(Node node) {
        if (node.getNodeType() != 3) {
            if (node.getNodeType() == 2) {
                return ((Attr) node).getNodeValue();
            }
            if (node.getNodeType() == 7) {
                return ((ProcessingInstruction) node).getNodeValue();
            }
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Node firstChild = node.getParentNode().getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 3) {
                stringBuffer.append(((Text) firstChild).getData());
            }
        }
        return stringBuffer.toString();
    }

    private XPath a(String str, PrefixResolver prefixResolver) {
        Class<?>[] clsArr = new Class[6];
        Class<?> cls = i;
        if (cls == null) {
            cls = a(C0059ao.a(9817));
            i = cls;
        }
        clsArr[0] = cls;
        Class<?> cls2 = j;
        if (cls2 == null) {
            cls2 = a(C0059ao.a(9818));
            j = cls2;
        }
        clsArr[1] = cls2;
        Class<?> cls3 = k;
        if (cls3 == null) {
            cls3 = a(C0059ao.a(9819));
            k = cls3;
        }
        clsArr[2] = cls3;
        clsArr[3] = Integer.TYPE;
        Class<?> cls4 = l;
        if (cls4 == null) {
            cls4 = a(C0059ao.a(9820));
            l = cls4;
        }
        clsArr[4] = cls4;
        Class<?> cls5 = m;
        if (cls5 == null) {
            cls5 = a(C0059ao.a(9821));
            m = cls5;
        }
        clsArr[5] = cls5;
        XPath xPath = null;
        Object[] objArr = {str, null, prefixResolver, new Integer(0), null, g};
        try {
            Class cls6 = n;
            if (cls6 == null) {
                cls6 = a(C0059ao.a(9822));
                n = cls6;
            }
            xPath = (XPath) cls6.getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable unused) {
        }
        return xPath == null ? new XPath(str, (SourceLocator) null, prefixResolver, 0, (ErrorListener) null) : xPath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0101, code lost:
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0113, code lost:
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
        r3 = a(r9);
        org.apache.xml.security.utils.CachedXPathFuncHereAPI.q = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.CachedXPathFuncHereAPI.a():void");
    }

    public XObject a(Node node, Node node2, String str, PrefixResolver prefixResolver) {
        if (str != this.e) {
            if (str.indexOf(C0059ao.a(9835)) > 0) {
                this.d.reset();
                this.c = this.d.getDTMManager();
            }
            try {
                this.f = a(str, prefixResolver);
                this.e = str;
            } catch (TransformerException e) {
                Throwable cause = e.getCause();
                if (!(cause instanceof ClassNotFoundException) || cause.getMessage().indexOf(C0059ao.a(9836)) <= 0) {
                    throw e;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(I18n.a(C0059ao.a(9837)));
                stringBuffer.append(e);
                throw new RuntimeException(stringBuffer.toString());
            }
        }
        if (this.b == null) {
            this.b = new FuncHereContext(node2, this.c);
        }
        return this.f.execute(this.b, this.b.getDTMHandleFromNode(node), prefixResolver);
    }

    public NodeList a(Node node, Node node2, String str, Node node3) {
        return b(node, node2, str, node3).nodelist();
    }

    public XObject b(Node node, Node node2, String str, Node node3) {
        if (this.b == null) {
            this.b = new FuncHereContext(node2, this.c);
        }
        if (node3.getNodeType() == 9) {
            node3 = ((Document) node3).getDocumentElement();
        }
        PrefixResolverDefault prefixResolverDefault = new PrefixResolverDefault(node3);
        if (str != this.e) {
            if (str.indexOf(C0059ao.a(9838)) > 0) {
                this.d.reset();
                this.c = this.d.getDTMManager();
            }
            this.f = a(str, prefixResolverDefault);
            this.e = str;
        }
        return this.f.execute(this.b, this.b.getDTMHandleFromNode(node), prefixResolverDefault);
    }
}
