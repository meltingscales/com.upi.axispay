package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.Fabric;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PinningTrustManager implements X509TrustManager {
    private static final X509Certificate[] NO_ISSUERS;
    private static final long PIN_FRESHNESS_DURATION_MILLIS = 0;
    private final long pinCreationTimeMillis;
    private final SystemKeyStore systemKeyStore;
    private final TrustManager[] systemTrustManagers;
    private final List<byte[]> pins = new LinkedList();
    private final Set<X509Certificate> cache = Collections.synchronizedSet(new HashSet());

    static {
        C0059ao.a(PinningTrustManager.class, 193);
        NO_ISSUERS = new X509Certificate[0];
    }

    public PinningTrustManager(SystemKeyStore systemKeyStore, PinningInfoProvider pinningInfoProvider) {
        this.systemTrustManagers = initializeSystemTrustManagers(systemKeyStore);
        this.systemKeyStore = systemKeyStore;
        this.pinCreationTimeMillis = pinningInfoProvider.getPinCreationTimeInMillis();
        for (String str : pinningInfoProvider.getPins()) {
            this.pins.add(hexStringToByteArray(str));
        }
    }

    private void checkPinTrust(X509Certificate[] x509CertificateArr) throws CertificateException {
        if (this.pinCreationTimeMillis != -1 && System.currentTimeMillis() - this.pinCreationTimeMillis > 15552000000L) {
            Fabric.getLogger().w(C0059ao.a(7717), C0059ao.a(7714) + (System.currentTimeMillis() - this.pinCreationTimeMillis) + C0059ao.a(7715) + 15552000000L + C0059ao.a(7716));
            return;
        }
        for (X509Certificate x509Certificate : CertificateChainCleaner.getCleanChain(x509CertificateArr, this.systemKeyStore)) {
            if (isValidPin(x509Certificate)) {
                return;
            }
        }
        throw new CertificateException(C0059ao.a(7718));
    }

    private void checkSystemTrust(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        for (TrustManager trustManager : this.systemTrustManagers) {
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
    }

    private byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    private TrustManager[] initializeSystemTrustManagers(SystemKeyStore systemKeyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(C0059ao.a(7719));
            trustManagerFactory.init(systemKeyStore.trustStore);
            return trustManagerFactory.getTrustManagers();
        } catch (KeyStoreException e) {
            throw new AssertionError(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    private boolean isValidPin(X509Certificate x509Certificate) throws CertificateException {
        try {
            byte[] digest = MessageDigest.getInstance(C0059ao.a(7720)).digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] bArr : this.pins) {
                if (Arrays.equals(bArr, digest)) {
                    return true;
                }
            }
            return false;
        } catch (NoSuchAlgorithmException e) {
            throw new CertificateException(e);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException(C0059ao.a(7721));
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (this.cache.contains(x509CertificateArr[0])) {
            return;
        }
        checkSystemTrust(x509CertificateArr, str);
        checkPinTrust(x509CertificateArr);
        this.cache.add(x509CertificateArr[0]);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return NO_ISSUERS;
    }
}
