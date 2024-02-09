package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: AxisPay */
/* renamed from: m80  reason: default package */
/* loaded from: classes.dex */
public final class m80 implements d80 {
    public final Call.Factory a;

    public m80(Context context) {
        this(x80.e(context));
    }

    @Override // defpackage.d80
    public Response a(Request request) throws IOException {
        return this.a.newCall(request).execute();
    }

    public m80(File file) {
        this(file, x80.a(file));
    }

    public m80(File file, long j) {
        this(new OkHttpClient.Builder().cache(new Cache(file, j)).build());
    }

    public m80(OkHttpClient okHttpClient) {
        this.a = okHttpClient;
        okHttpClient.cache();
    }
}
