package in.org.npci.commonlibrary;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import myunmn.C0059ao;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class h extends DefaultHandler {
    public static List<g> a = new ArrayList();
    public static g b = null;
    public static String c = null;

    public h() {
    }

    public h(String str) {
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(new InputSource(new StringReader(str)), this);
        } catch (IOException | ParserConfigurationException | SAXException unused) {
            throw new c(d.PARSER_MISCONFIG);
        }
    }

    public List<g> a() {
        return a;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        c = String.copyValueOf(cArr, i, i2).trim();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        str3.hashCode();
        if (str3.equals(C0059ao.a(6255))) {
            a.add(b);
        } else if (str3.equals(C0059ao.a(6256))) {
            b.f(c);
        }
    }

    public void finalize() {
        System.out.println(C0059ao.a(6257));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        str3.hashCode();
        if (str3.equals(C0059ao.a(6258))) {
            g gVar = new g();
            b = gVar;
            gVar.b(attributes.getValue(C0059ao.a(6259)));
            b.d(attributes.getValue(C0059ao.a(6260)));
        }
    }
}
