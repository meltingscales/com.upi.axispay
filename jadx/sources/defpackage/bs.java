package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: AxisPay */
/* renamed from: bs  reason: default package */
/* loaded from: classes.dex */
public abstract class bs {
    public static bt a(Context context, lu luVar, ws wsVar, zu zuVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new vs(context, luVar, wsVar);
        }
        return new ss(context, luVar, zuVar, wsVar);
    }
}
