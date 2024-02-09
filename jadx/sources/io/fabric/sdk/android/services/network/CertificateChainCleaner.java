package io.fabric.sdk.android.services.network;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class CertificateChainCleaner {
    private CertificateChainCleaner() {
    }

    public static X509Certificate[] getCleanChain(X509Certificate[] x509CertificateArr, SystemKeyStore systemKeyStore) throws CertificateException {
        LinkedList linkedList = new LinkedList();
        boolean isTrustRoot = systemKeyStore.isTrustRoot(x509CertificateArr[0]);
        linkedList.add(x509CertificateArr[0]);
        boolean z = true;
        int i = 1;
        while (i < x509CertificateArr.length) {
            if (systemKeyStore.isTrustRoot(x509CertificateArr[i])) {
                isTrustRoot = true;
            }
            if (!isValidLink(x509CertificateArr[i], x509CertificateArr[i - 1])) {
                break;
            }
            linkedList.add(x509CertificateArr[i]);
            i++;
        }
        X509Certificate trustRootFor = systemKeyStore.getTrustRootFor(x509CertificateArr[i - 1]);
        if (trustRootFor != null) {
            linkedList.add(trustRootFor);
        } else {
            z = isTrustRoot;
        }
        if (z) {
            return (X509Certificate[]) linkedList.toArray(new X509Certificate[linkedList.size()]);
        }
        throw new CertificateException(C0059ao.a(1171));
    }

    private static boolean isValidLink(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal())) {
            try {
                x509Certificate2.verify(x509Certificate.getPublicKey());
                return true;
            } catch (GeneralSecurityException unused) {
                return false;
            }
        }
        return false;
    }
}
