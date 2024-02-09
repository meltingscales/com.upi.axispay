package defpackage;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* compiled from: AxisPay */
/* renamed from: xm  reason: default package */
/* loaded from: classes.dex */
public class xm {
    public static PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
        return PropertyValuesHolder.ofFloat(new wm(property, path), 0.0f, 1.0f);
    }
}
