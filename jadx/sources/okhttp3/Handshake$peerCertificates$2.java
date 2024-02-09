package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Handshake$peerCertificates$2 extends zl0 implements sk0<List<? extends Certificate>> {
    public final /* synthetic */ sk0 $peerCertificatesFn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(sk0 sk0Var) {
        super(0);
        this.$peerCertificatesFn = sk0Var;
    }

    @Override // defpackage.sk0
    public final List<? extends Certificate> invoke() {
        try {
            return (List) this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return aj0.f();
        }
    }
}
