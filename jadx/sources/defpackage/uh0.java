package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: uh0  reason: default package */
/* loaded from: classes.dex */
public final class uh0 implements kh0 {
    public static final Class<? extends Object>[] a = {Context.class};
    public static final Class<? extends Object>[] b = {Context.class, AttributeSet.class};

    @Override // defpackage.kh0
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Constructor constructor;
        Object[] objArr;
        yl0.f(str, C0059ao.a(12968));
        yl0.f(context, C0059ao.a(12969));
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(View.class);
            try {
                Class<? extends Object>[] clsArr = b;
                constructor = asSubclass.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                yl0.b(constructor, C0059ao.a(12970));
                objArr = new Object[]{context, attributeSet};
            } catch (NoSuchMethodException unused) {
                Class<? extends Object>[] clsArr2 = a;
                constructor = asSubclass.getConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                yl0.b(constructor, C0059ao.a(12971));
                objArr = new Context[]{context};
            }
            constructor.setAccessible(true);
            return (View) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (Exception e) {
            if (e instanceof ClassNotFoundException) {
                e.printStackTrace();
                return null;
            } else if (e instanceof NoSuchMethodException) {
                e.printStackTrace();
                return null;
            } else if (e instanceof IllegalAccessException) {
                e.printStackTrace();
                return null;
            } else if (e instanceof InstantiationException) {
                e.printStackTrace();
                return null;
            } else if (e instanceof InvocationTargetException) {
                e.printStackTrace();
                return null;
            } else {
                throw e;
            }
        }
    }
}
