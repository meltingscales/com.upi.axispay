package defpackage;

import android.view.View;
import android.view.WindowId;

/* compiled from: AxisPay */
/* renamed from: ao  reason: default package */
/* loaded from: classes.dex */
public class ao implements bo {
    public final WindowId a;

    public ao(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ao) && ((ao) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
