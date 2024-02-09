package com.olive.upi.transport;

import android.content.Context;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ConnectivityInterceptor implements Interceptor {
    private Context mContext;

    public ConnectivityInterceptor(Context context) {
        this.mContext = context;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        if (c70.n(this.mContext)) {
            return chain.proceed(chain.request().newBuilder().build());
        }
        throw new NoConnectivityException();
    }
}
