package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: d0  reason: default package */
/* loaded from: classes.dex */
public class d0 {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};
    public static final String[] d = {C0059ao.a(2299), C0059ao.a(2300), C0059ao.a(2301)};
    public static final u4<String, Constructor<? extends View>> e = new u4<>();
    public final Object[] a = new Object[2];

    /* compiled from: AxisPay */
    /* renamed from: d0$a */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {
        public final View b;
        public final String c;
        public Method d;
        public Context e;

        public a(View view, String str) {
            this.b = view;
            this.c = str;
        }

        public final void a(Context context) {
            int id;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.c, View.class)) != null) {
                        this.d = method;
                        this.e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.b.getId() == -1) {
                str = C0059ao.a(9680);
            } else {
                str = C0059ao.a(9681) + this.b.getContext().getResources().getResourceEntryName(id) + C0059ao.a(9682);
            }
            throw new IllegalStateException(C0059ao.a(9683) + this.c + C0059ao.a(9684) + this.b.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.d == null) {
                a(this.b.getContext());
            }
            try {
                this.d.invoke(this.e, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException(C0059ao.a(9686), e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException(C0059ao.a(9685), e2);
            }
        }
    }

    public static Context t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(u.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(u.View_theme, 0)) != 0) {
            Log.i(C0059ao.a(2302), C0059ao.a(2303));
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof w0) && ((w0) context).c() == resourceId) ? context : new w0(context, resourceId) : context;
    }

    public final void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || ac.Q(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    public x1 b(Context context, AttributeSet attributeSet) {
        return new x1(context, attributeSet);
    }

    public AppCompatButton c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public z1 d(Context context, AttributeSet attributeSet) {
        return new z1(context, attributeSet);
    }

    public a2 e(Context context, AttributeSet attributeSet) {
        return new a2(context, attributeSet);
    }

    public d2 f(Context context, AttributeSet attributeSet) {
        return new d2(context, attributeSet);
    }

    public f2 g(Context context, AttributeSet attributeSet) {
        return new f2(context, attributeSet);
    }

    public AppCompatImageView h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public h2 i(Context context, AttributeSet attributeSet) {
        return new h2(context, attributeSet);
    }

    public k2 j(Context context, AttributeSet attributeSet) {
        return new k2(context, attributeSet);
    }

    public l2 k(Context context, AttributeSet attributeSet) {
        return new l2(context, attributeSet);
    }

    public n2 l(Context context, AttributeSet attributeSet) {
        return new n2(context, attributeSet);
    }

    public AppCompatSpinner m(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public AppCompatTextView n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public s2 o(Context context, AttributeSet attributeSet) {
        return new s2(context, attributeSet);
    }

    public View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View k;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = l3.b(context2);
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals(C0059ao.a(2317))) {
                    c2 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals(C0059ao.a(2316))) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals(C0059ao.a(2315))) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals(C0059ao.a(2314))) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals(C0059ao.a(2313))) {
                    c2 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals(C0059ao.a(2312))) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals(C0059ao.a(2311))) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals(C0059ao.a(2310))) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals(C0059ao.a(2309))) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals(C0059ao.a(2308))) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals(C0059ao.a(2307))) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals(C0059ao.a(2306))) {
                    c2 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals(C0059ao.a(2305))) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals(C0059ao.a(2304))) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                k = k(context2, attributeSet);
                u(k, str);
                break;
            case 1:
                k = e(context2, attributeSet);
                u(k, str);
                break;
            case 2:
                k = i(context2, attributeSet);
                u(k, str);
                break;
            case 3:
                k = n(context2, attributeSet);
                u(k, str);
                break;
            case 4:
                k = g(context2, attributeSet);
                u(k, str);
                break;
            case 5:
                k = l(context2, attributeSet);
                u(k, str);
                break;
            case 6:
                k = m(context2, attributeSet);
                u(k, str);
                break;
            case 7:
                k = j(context2, attributeSet);
                u(k, str);
                break;
            case '\b':
                k = o(context2, attributeSet);
                u(k, str);
                break;
            case '\t':
                k = h(context2, attributeSet);
                u(k, str);
                break;
            case '\n':
                k = b(context2, attributeSet);
                u(k, str);
                break;
            case 11:
                k = d(context2, attributeSet);
                u(k, str);
                break;
            case '\f':
                k = f(context2, attributeSet);
                u(k, str);
                break;
            case '\r':
                k = c(context2, attributeSet);
                u(k, str);
                break;
            default:
                k = p(context2, str, attributeSet);
                break;
        }
        if (k == null && context != context2) {
            k = s(context2, str, attributeSet);
        }
        if (k != null) {
            a(k, attributeSet);
        }
        return k;
    }

    public final View r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        u4<String, Constructor<? extends View>> u4Var = e;
        Constructor<? extends View> constructor = u4Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            u4Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.a);
    }

    public final View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(C0059ao.a(2318))) {
            str = attributeSet.getAttributeValue(null, C0059ao.a(2319));
        }
        try {
            Object[] objArr = this.a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = d;
                if (i >= strArr.length) {
                    return null;
                }
                View r = r(context, str, strArr[i]);
                if (r != null) {
                    return r;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + C0059ao.a(2320) + str + C0059ao.a(2321));
    }
}
