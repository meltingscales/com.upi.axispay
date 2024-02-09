package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AxisPay */
/* renamed from: i7  reason: default package */
/* loaded from: classes.dex */
public class i7 {
    public boolean a;
    public String b;
    public b c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    /* compiled from: AxisPay */
    /* renamed from: i7$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: i7$b */
    /* loaded from: classes.dex */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public i7(String str, b bVar, Object obj, boolean z) {
        this.a = false;
        this.b = str;
        this.c = bVar;
        this.a = z;
        f(obj);
    }

    public static HashMap<String, i7> a(HashMap<String, i7> hashMap, View view) {
        HashMap<String, i7> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            i7 i7Var = hashMap.get(str);
            try {
                if (str.equals(C0059ao.a(6901))) {
                    hashMap2.put(str, new i7(i7Var, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new i7(i7Var, cls.getMethod(C0059ao.a(6902) + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void d(Context context, XmlPullParser xmlPullParser, HashMap<String, i7> hashMap) {
        b bVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), q7.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == q7.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == q7.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == q7.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == q7.CustomAttribute_customColorValue) {
                    bVar = b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == q7.CustomAttribute_customColorDrawableValue) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == q7.CustomAttribute_customPixelDimension) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == q7.CustomAttribute_customDimension) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == q7.CustomAttribute_customFloatValue) {
                    bVar = b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == q7.CustomAttribute_customIntegerValue) {
                    bVar = b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == q7.CustomAttribute_customStringValue) {
                    bVar = b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == q7.CustomAttribute_customReference) {
                    bVar = b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new i7(str, bVar2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, i7> hashMap) {
        String a2 = C0059ao.a(6903);
        String a3 = C0059ao.a(6904);
        String a4 = C0059ao.a(6905);
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            i7 i7Var = hashMap.get(str);
            String str2 = i7Var.a ? str : C0059ao.a(6906) + str;
            try {
                switch (a.a[i7Var.c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(i7Var.d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(i7Var.g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, i7Var.f);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(i7Var.h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(i7Var.h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(i7Var.d));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(i7Var.e));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(i7Var.e));
                        break;
                }
            } catch (IllegalAccessException e) {
                Log.e(a4, a3 + str + a2 + cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e(a4, e2.getMessage());
                Log.e(a4, a3 + str + a2 + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(C0059ao.a(6907));
                sb.append(str2);
                Log.e(a4, sb.toString());
            } catch (InvocationTargetException e3) {
                Log.e(a4, a3 + str + a2 + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    public String b() {
        return this.b;
    }

    public b c() {
        return this.c;
    }

    public void f(Object obj) {
        switch (a.a[this.c.ordinal()]) {
            case 1:
            case 6:
                this.d = ((Integer) obj).intValue();
                return;
            case 2:
                this.g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f = (String) obj;
                return;
            case 4:
            case 5:
                this.h = ((Integer) obj).intValue();
                return;
            case 7:
                this.e = ((Float) obj).floatValue();
                return;
            case 8:
                this.e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public i7(i7 i7Var, Object obj) {
        this.a = false;
        this.b = i7Var.b;
        this.c = i7Var.c;
        f(obj);
    }
}
