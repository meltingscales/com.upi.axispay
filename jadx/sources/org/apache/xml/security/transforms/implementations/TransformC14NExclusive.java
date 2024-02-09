package org.apache.xml.security.transforms.implementations;

import java.io.OutputStream;
import myunmn.C0059ao;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.params.InclusiveNamespaces;
import org.apache.xml.security.utils.XMLUtils;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class TransformC14NExclusive extends TransformSpi {
    @Override // org.apache.xml.security.transforms.TransformSpi
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream, Transform transform) {
        String a = C0059ao.a(6395);
        String a2 = C0059ao.a(6396);
        try {
            String a3 = transform.c(a2, a) == 1 ? new InclusiveNamespaces(XMLUtils.a(transform.k().getFirstChild(), a2, a, 0), transform.l()).a() : null;
            Canonicalizer20010315ExclOmitComments canonicalizer20010315ExclOmitComments = new Canonicalizer20010315ExclOmitComments();
            if (outputStream != null) {
                canonicalizer20010315ExclOmitComments.a(outputStream);
            }
            XMLSignatureInput xMLSignatureInput2 = new XMLSignatureInput(canonicalizer20010315ExclOmitComments.a(xMLSignatureInput, a3));
            if (outputStream != null) {
                xMLSignatureInput2.b(outputStream);
            }
            return xMLSignatureInput2;
        } catch (XMLSecurityException e) {
            throw new CanonicalizationException(C0059ao.a(6397), e);
        }
    }

    @Override // org.apache.xml.security.transforms.TransformSpi
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        return a(xMLSignatureInput, null, transform);
    }
}
