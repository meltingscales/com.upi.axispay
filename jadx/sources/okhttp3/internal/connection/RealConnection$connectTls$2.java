package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import myunmn.C0059ao;
import okhttp3.Handshake;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class RealConnection$connectTls$2 extends zl0 implements sk0<List<? extends X509Certificate>> {
    public final /* synthetic */ RealConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    @Override // defpackage.sk0
    public final List<? extends X509Certificate> invoke() {
        Handshake handshake;
        handshake = this.this$0.handshake;
        yl0.c(handshake);
        List<Certificate> peerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(bj0.o(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            Objects.requireNonNull(certificate, C0059ao.a(246));
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
