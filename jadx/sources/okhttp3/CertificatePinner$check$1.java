package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import myunmn.C0059ao;
import okhttp3.internal.tls.CertificateChainCleaner;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class CertificatePinner$check$1 extends zl0 implements sk0<List<? extends X509Certificate>> {
    public final /* synthetic */ String $hostname;
    public final /* synthetic */ List $peerCertificates;
    public final /* synthetic */ CertificatePinner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.this$0 = certificatePinner;
        this.$peerCertificates = list;
        this.$hostname = str;
    }

    @Override // defpackage.sk0
    public final List<? extends X509Certificate> invoke() {
        List<Certificate> list;
        CertificateChainCleaner certificateChainCleaner$okhttp = this.this$0.getCertificateChainCleaner$okhttp();
        if (certificateChainCleaner$okhttp == null || (list = certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname)) == null) {
            list = this.$peerCertificates;
        }
        ArrayList arrayList = new ArrayList(bj0.o(list, 10));
        for (Certificate certificate : list) {
            Objects.requireNonNull(certificate, C0059ao.a(1371));
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
