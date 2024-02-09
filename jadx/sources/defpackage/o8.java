package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.m8;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: o8  reason: default package */
/* loaded from: classes.dex */
public class o8 {
    public static final Object a = new Object();
    public static Field b;
    public static boolean c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle b(m8.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat e = aVar.e();
        bundle2.putInt(C0059ao.a(13105), e != null ? e.f() : 0);
        bundle2.putCharSequence(C0059ao.a(13106), aVar.i());
        bundle2.putParcelable(C0059ao.a(13107), aVar.a());
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(C0059ao.a(13108), aVar.b());
        bundle2.putBundle(C0059ao.a(13109), bundle);
        bundle2.putParcelableArray(C0059ao.a(13110), e(aVar.f()));
        bundle2.putBoolean(C0059ao.a(13111), aVar.h());
        bundle2.putInt(C0059ao.a(13112), aVar.g());
        return bundle2;
    }

    public static Bundle c(Notification notification) {
        synchronized (a) {
            if (c) {
                return null;
            }
            try {
                try {
                    if (b == null) {
                        Field declaredField = Notification.class.getDeclaredField(C0059ao.a(13113));
                        if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                            Log.e(C0059ao.a(13114), C0059ao.a(13115));
                            c = true;
                            return null;
                        }
                        declaredField.setAccessible(true);
                        b = declaredField;
                    }
                    Bundle bundle = (Bundle) b.get(notification);
                    if (bundle == null) {
                        bundle = new Bundle();
                        b.set(notification, bundle);
                    }
                    return bundle;
                } catch (IllegalAccessException e) {
                    Log.e(C0059ao.a(13118), C0059ao.a(13119), e);
                    c = true;
                    return null;
                }
            } catch (NoSuchFieldException e2) {
                Log.e(C0059ao.a(13116), C0059ao.a(13117), e2);
                c = true;
                return null;
            }
        }
    }

    public static Bundle d(q8 q8Var) {
        Bundle bundle = new Bundle();
        bundle.putString(C0059ao.a(13120), q8Var.i());
        bundle.putCharSequence(C0059ao.a(13121), q8Var.h());
        bundle.putCharSequenceArray(C0059ao.a(13122), q8Var.e());
        bundle.putBoolean(C0059ao.a(13123), q8Var.c());
        bundle.putBundle(C0059ao.a(13124), q8Var.g());
        Set<String> d = q8Var.d();
        if (d != null && !d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d.size());
            for (String str : d) {
                arrayList.add(str);
            }
            bundle.putStringArrayList(C0059ao.a(13125), arrayList);
        }
        return bundle;
    }

    public static Bundle[] e(q8[] q8VarArr) {
        if (q8VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[q8VarArr.length];
        for (int i = 0; i < q8VarArr.length; i++) {
            bundleArr[i] = d(q8VarArr[i]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, m8.a aVar) {
        IconCompat e = aVar.e();
        builder.addAction(e != null ? e.f() : 0, aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray(C0059ao.a(13126), e(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray(C0059ao.a(13127), e(aVar.c()));
        }
        bundle.putBoolean(C0059ao.a(13128), aVar.b());
        return bundle;
    }
}
