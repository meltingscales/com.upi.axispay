package okhttp3;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface Callback {
    void onFailure(Call call, IOException iOException);

    void onResponse(Call call, Response response) throws IOException;
}
