package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: kb  reason: default package */
/* loaded from: classes.dex */
public final class kb {
    public static Field a;
    public static boolean b;

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        boolean z = b;
        String a2 = C0059ao.a(10875);
        String a3 = C0059ao.a(10876);
        if (!z) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField(C0059ao.a(10877));
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(a3, C0059ao.a(10878) + LayoutInflater.class.getName() + a2, e);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e(a3, C0059ao.a(10879) + layoutInflater + a2, e2);
            }
        }
    }

    public static void b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                a(layoutInflater, factory2);
            }
        }
    }
}
