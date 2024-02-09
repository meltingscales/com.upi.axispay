package defpackage;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;

/* compiled from: AxisPay */
@Encodable
/* renamed from: iq  reason: default package */
/* loaded from: classes.dex */
public abstract class iq {
    public static final ProtobufEncoder a = ProtobufEncoder.builder().configureWith(xp.a).build();

    public static byte[] a(Object obj) {
        return a.encode(obj);
    }

    public abstract kr b();
}
