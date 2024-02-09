package defpackage;

import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.util.List;

/* compiled from: AxisPay */
@AutoValue
@Encodable
/* renamed from: qp  reason: default package */
/* loaded from: classes.dex */
public abstract class qp {
    public static qp a(List<tp> list) {
        return new kp(list);
    }

    public static DataEncoder b() {
        return new JsonDataEncoderBuilder().configureWith(ip.a).ignoreNullValues(true).build();
    }

    @Encodable.Field(name = "logRequest")
    public abstract List<tp> c();
}
