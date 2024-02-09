package okhttp3;

import java.security.cert.Certificate;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Handshake$Companion$get$1 extends zl0 implements sk0<List<? extends Certificate>> {
    public final /* synthetic */ List $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Handshake$Companion$get$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // defpackage.sk0
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
