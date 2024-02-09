package org.apache.xml.security.transforms;

import java.io.OutputStream;
import myunmn.C0059ao;
import org.apache.xml.security.signature.XMLSignatureInput;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public abstract class TransformSpi {
    public Transform a = null;

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput) {
        throw new UnsupportedOperationException();
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        return a(xMLSignatureInput, transform);
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        String a = C0059ao.a(5865);
        try {
            TransformSpi transformSpi = (TransformSpi) getClass().newInstance();
            transformSpi.a(transform);
            return transformSpi.a(xMLSignatureInput);
        } catch (IllegalAccessException e) {
            throw new TransformationException(a, e);
        } catch (InstantiationException e2) {
            throw new TransformationException(a, e2);
        }
    }

    public void a(Transform transform) {
        this.a = transform;
    }
}
