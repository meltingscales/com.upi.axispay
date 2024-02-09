package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: f0  reason: default package */
/* loaded from: classes.dex */
public class f0 {
    public static Field a;
    public static boolean b;
    public static Class<?> c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;

    public static void a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            d(resources);
        } else if (i >= 23) {
            c(resources);
        } else if (i >= 21) {
            b(resources);
        }
    }

    public static void b(Resources resources) {
        boolean z = b;
        String a2 = C0059ao.a(4042);
        if (!z) {
            try {
                Field declaredField = Resources.class.getDeclaredField(C0059ao.a(4043));
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(a2, C0059ao.a(4044), e2);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(a2, C0059ao.a(4045), e3);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    public static void c(Resources resources) {
        boolean z = b;
        String a2 = C0059ao.a(4046);
        if (!z) {
            try {
                Field declaredField = Resources.class.getDeclaredField(C0059ao.a(4047));
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(a2, C0059ao.a(4048), e2);
            }
            b = true;
        }
        Object obj = null;
        Field field = a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(a2, C0059ao.a(4049), e3);
            }
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    public static void d(Resources resources) {
        Object obj;
        boolean z = h;
        String a2 = C0059ao.a(4050);
        if (!z) {
            try {
                Field declaredField = Resources.class.getDeclaredField(C0059ao.a(4051));
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(a2, C0059ao.a(4052), e2);
            }
            h = true;
        }
        Field field = g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e(a2, C0059ao.a(4053), e3);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField(C0059ao.a(4054));
                a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e(a2, C0059ao.a(4055), e4);
            }
            b = true;
        }
        Field field2 = a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e(a2, C0059ao.a(4056), e5);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    public static void e(Object obj) {
        boolean z = d;
        String a2 = C0059ao.a(4057);
        if (!z) {
            try {
                c = Class.forName(C0059ao.a(4058));
            } catch (ClassNotFoundException e2) {
                Log.e(a2, C0059ao.a(4059), e2);
            }
            d = true;
        }
        Class<?> cls = c;
        if (cls == null) {
            return;
        }
        if (!f) {
            try {
                Field declaredField = cls.getDeclaredField(C0059ao.a(4060));
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e(a2, C0059ao.a(4061), e3);
            }
            f = true;
        }
        Field field = e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e(a2, C0059ao.a(4062), e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
