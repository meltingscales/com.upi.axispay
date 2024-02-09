package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* compiled from: AxisPay */
/* renamed from: ud  reason: default package */
/* loaded from: classes.dex */
public abstract class ud {
    @Deprecated
    public Fragment b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    public abstract View d(int i);

    public abstract boolean e();
}
