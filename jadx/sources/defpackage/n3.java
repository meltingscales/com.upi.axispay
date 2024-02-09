package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: AxisPay */
/* renamed from: n3  reason: default package */
/* loaded from: classes.dex */
public class n3 extends f3 {
    public final WeakReference<Context> b;

    public n3(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    @Override // defpackage.f3, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.b.get();
        if (drawable != null && context != null) {
            e3.h().x(context, i, drawable);
        }
        return drawable;
    }
}
