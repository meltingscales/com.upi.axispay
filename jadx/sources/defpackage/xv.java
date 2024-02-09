package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xv  reason: default package */
/* loaded from: classes.dex */
public class xv extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> b = new xv();
    public final WeakHashMap<Drawable, Integer> a;

    public xv() {
        super(Integer.class, C0059ao.a(6872));
        this.a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.a.containsKey(drawable)) {
            return this.a.get(drawable);
        }
        return 255;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
