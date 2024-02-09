package defpackage;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.savedstate.SavedStateRegistry;
import defpackage.qf;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: of  reason: default package */
/* loaded from: classes.dex */
public final class of extends qf.c {
    public static final Class<?>[] f = {Application.class, nf.class};
    public static final Class<?>[] g = {nf.class};
    public final Application a;
    public final qf.b b;
    public final Bundle c;
    public final bf d;
    public final SavedStateRegistry e;

    @SuppressLint({"LambdaLast"})
    public of(Application application, tl tlVar, Bundle bundle) {
        qf.b b;
        this.e = tlVar.getSavedStateRegistry();
        this.d = tlVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            b = qf.a.c(application);
        } else {
            b = qf.d.b();
        }
        this.b = b;
    }

    public static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // defpackage.qf.c, defpackage.qf.b
    public <T extends pf> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException(C0059ao.a(14564));
    }

    @Override // defpackage.qf.e
    public void b(pf pfVar) {
        SavedStateHandleController.h(pfVar, this.e, this.d);
    }

    @Override // defpackage.qf.c
    public <T extends pf> T c(String str, Class<T> cls) {
        Constructor d;
        T t;
        boolean isAssignableFrom = xe.class.isAssignableFrom(cls);
        if (isAssignableFrom && this.a != null) {
            d = d(cls, f);
        } else {
            d = d(cls, g);
        }
        if (d == null) {
            return (T) this.b.a(cls);
        }
        SavedStateHandleController j = SavedStateHandleController.j(this.e, this.d, str, this.c);
        if (isAssignableFrom) {
            try {
                Application application = this.a;
                if (application != null) {
                    t = (T) d.newInstance(application, j.k());
                    t.e(C0059ao.a(14565), j);
                    return t;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(C0059ao.a(14569) + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(C0059ao.a(14567) + cls + C0059ao.a(14568), e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(C0059ao.a(14566) + cls, e3.getCause());
            }
        }
        t = (T) d.newInstance(j.k());
        t.e(C0059ao.a(14565), j);
        return t;
    }
}
