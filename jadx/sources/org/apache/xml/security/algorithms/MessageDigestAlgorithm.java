package org.apache.xml.security.algorithms;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;
import org.apache.xml.security.signature.XMLSignatureException;
import org.w3c.dom.Document;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class MessageDigestAlgorithm extends Algorithm {
    public static ThreadLocal b = new ThreadLocal() { // from class: org.apache.xml.security.algorithms.MessageDigestAlgorithm.1
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new HashMap();
        }
    };
    public MessageDigest a;

    private MessageDigestAlgorithm(Document document, MessageDigest messageDigest, String str) {
        super(document, str);
        this.a = null;
        this.a = messageDigest;
    }

    public static MessageDigestAlgorithm a(Document document, String str) {
        return new MessageDigestAlgorithm(document, b(str), str);
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        return MessageDigest.isEqual(bArr, bArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.security.MessageDigest, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object[]] */
    private static MessageDigest b(String str) {
        MessageDigest messageDigest = (MessageDigest) ((Map) b.get()).get(str);
        if (messageDigest != null) {
            return messageDigest;
        }
        ?? a = JCEMapper.a(str);
        ?? r2 = 0;
        r2 = 0;
        if (a != 0) {
            String a2 = JCEMapper.a();
            String a3 = C0059ao.a(5915);
            try {
                a = a2 == null ? MessageDigest.getInstance(a) : MessageDigest.getInstance((String) a, a2);
                r2 = (Map) b.get();
                r2.put(str, a);
                return a;
            } catch (NoSuchAlgorithmException e) {
                ?? r4 = new Object[2];
                r4[r2] = a;
                r4[1] = e.getLocalizedMessage();
                throw new XMLSignatureException(a3, (Object[]) r4);
            } catch (NoSuchProviderException e2) {
                ?? r42 = new Object[2];
                r42[r2] = a;
                r42[1] = e2.getLocalizedMessage();
                throw new XMLSignatureException(a3, (Object[]) r42);
            }
        }
        throw new XMLSignatureException(C0059ao.a(5916), new Object[]{str});
    }

    public void a(byte b2) {
        this.a.update(b2);
    }

    public void a(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }

    public byte[] b() {
        return this.a.digest();
    }

    public void c() {
        this.a.reset();
    }

    @Override // org.apache.xml.security.utils.SignatureElementProxy, org.apache.xml.security.utils.ElementProxy
    public String d() {
        return C0059ao.a(5917);
    }

    @Override // org.apache.xml.security.utils.ElementProxy
    public String e() {
        return C0059ao.a(5918);
    }
}
