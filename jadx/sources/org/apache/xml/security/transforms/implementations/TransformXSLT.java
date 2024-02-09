package org.apache.xml.security.transforms.implementations;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import myunmn.C0059ao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class TransformXSLT extends TransformSpi {
    public static Log b;
    public static Class c;
    public static Class d;
    private static Class e;

    static {
        try {
            e = Class.forName(C0059ao.a(13383));
        } catch (Exception unused) {
        }
        Class cls = c;
        if (cls == null) {
            cls = a(C0059ao.a(13384));
            c = cls;
        }
        b = LogFactory.getLog(cls.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError().initCause(e2);
        }
    }

    @Override // org.apache.xml.security.transforms.TransformSpi
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        Class cls = e;
        String a = C0059ao.a(13385);
        if (cls != null) {
            try {
                Element a2 = XMLUtils.a(transform.k().getFirstChild(), C0059ao.a(13386), C0059ao.a(13387), 0);
                if (a2 != null) {
                    TransformerFactory newInstance = TransformerFactory.newInstance();
                    Class<?> cls2 = newInstance.getClass();
                    String a3 = C0059ao.a(13388);
                    Class<?>[] clsArr = new Class[2];
                    Class<?> cls3 = d;
                    if (cls3 == null) {
                        cls3 = a(C0059ao.a(13389));
                        d = cls3;
                    }
                    clsArr[0] = cls3;
                    clsArr[1] = Boolean.TYPE;
                    cls2.getMethod(a3, clsArr).invoke(newInstance, C0059ao.a(13390), Boolean.TRUE);
                    StreamSource streamSource = new StreamSource(new ByteArrayInputStream(xMLSignatureInput.e()));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    newInstance.newTransformer().transform(new DOMSource(a2), new StreamResult(byteArrayOutputStream));
                    Transformer newTransformer = newInstance.newTransformer(new StreamSource(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())));
                    try {
                        newTransformer.setOutputProperty(C0059ao.a(13391), C0059ao.a(13392));
                    } catch (Exception e2) {
                        Log log = b;
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(C0059ao.a(13393));
                        stringBuffer.append(e2.getMessage());
                        log.warn(stringBuffer.toString());
                    }
                    if (outputStream == null) {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        newTransformer.transform(streamSource, new StreamResult(byteArrayOutputStream2));
                        return new XMLSignatureInput(byteArrayOutputStream2.toByteArray());
                    }
                    newTransformer.transform(streamSource, new StreamResult(outputStream));
                    XMLSignatureInput xMLSignatureInput2 = new XMLSignatureInput((byte[]) null);
                    xMLSignatureInput2.b(outputStream);
                    return xMLSignatureInput2;
                }
                throw new TransformationException(C0059ao.a(13396), new Object[]{C0059ao.a(13394), C0059ao.a(13395)});
            } catch (IllegalAccessException e3) {
                throw new TransformationException(a, new Object[]{e3.getMessage()}, e3);
            } catch (NoSuchMethodException e4) {
                throw new TransformationException(a, new Object[]{e4.getMessage()}, e4);
            } catch (InvocationTargetException e5) {
                throw new TransformationException(a, new Object[]{e5.getMessage()}, e5);
            } catch (TransformerConfigurationException e6) {
                throw new TransformationException(a, new Object[]{e6.getMessage()}, e6);
            } catch (TransformerException e7) {
                throw new TransformationException(a, new Object[]{e7.getMessage()}, e7);
            } catch (XMLSecurityException e8) {
                throw new TransformationException(a, new Object[]{e8.getMessage()}, e8);
            }
        }
        throw new TransformationException(a, new Object[]{C0059ao.a(13397)});
    }

    @Override // org.apache.xml.security.transforms.TransformSpi
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        return a(xMLSignatureInput, null, transform);
    }
}
