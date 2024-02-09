package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: aw  reason: default package */
/* loaded from: classes.dex */
public class aw {
    public final u4<String, bw> a = new u4<>();
    public final u4<String, PropertyValuesHolder[]> b = new u4<>();

    public static void a(aw awVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            awVar.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            awVar.i(objectAnimator.getPropertyName(), bw.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(1413) + animator);
    }

    public static aw b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static aw c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return d(arrayList);
            }
            return null;
        } catch (Exception e) {
            Log.w(C0059ao.a(1415), C0059ao.a(1414) + Integer.toHexString(i), e);
            return null;
        }
    }

    public static aw d(List<Animator> list) {
        aw awVar = new aw();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(awVar, list.get(i));
        }
        return awVar;
    }

    public bw e(String str) {
        if (g(str)) {
            return this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aw) {
            return this.a.equals(((aw) obj).a);
        }
        return false;
    }

    public long f() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            bw m = this.a.m(i);
            j = Math.max(j, m.c() + m.d());
        }
        return j;
    }

    public boolean g(String str) {
        return this.a.get(str) != null;
    }

    public void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(String str, bw bwVar) {
        this.a.put(str, bwVar);
    }

    public String toString() {
        return '\n' + aw.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + C0059ao.a(1416) + this.a + C0059ao.a(1417);
    }
}
