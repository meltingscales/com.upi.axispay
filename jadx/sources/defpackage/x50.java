package defpackage;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.IOException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: x50  reason: default package */
/* loaded from: classes.dex */
public class x50 implements t50 {
    public static final Bitmap.CompressFormat b = Bitmap.CompressFormat.PNG;
    public w50 a;

    public x50(File file, File file2, a60 a60Var, long j, int i) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException(C0059ao.a(5812));
        }
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException(C0059ao.a(5811));
        }
        if (i < 0) {
            throw new IllegalArgumentException(C0059ao.a(5810));
        }
        if (a60Var != null) {
            a(file, file2, i2 == 0 ? RecyclerView.FOREVER_NS : j, i == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i);
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(5809));
    }

    public final void a(File file, File file2, long j, int i) throws IOException {
        try {
            this.a = w50.T(file, 1, 1, j, i);
        } catch (IOException e) {
            y60.b(e);
            if (file2 != null) {
                a(file2, null, j, i);
            }
            if (this.a == null) {
                throw e;
            }
        }
    }
}
