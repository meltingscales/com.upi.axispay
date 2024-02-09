package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.Property;
import com.nineoldandroids.view.animation.AnimatorProxy;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class ObjectAnimator extends ValueAnimator {
    private static final boolean DBG = false;
    private static final Map<String, Property> PROXY_PROPERTIES;
    private Property mProperty;
    private String mPropertyName;
    private Object mTarget;

    static {
        C0059ao.a(ObjectAnimator.class, 132);
        HashMap hashMap = new HashMap();
        PROXY_PROPERTIES = hashMap;
        hashMap.put(C0059ao.a(5898), PreHoneycombCompat.ALPHA);
        hashMap.put(C0059ao.a(5899), PreHoneycombCompat.PIVOT_X);
        hashMap.put(C0059ao.a(5900), PreHoneycombCompat.PIVOT_Y);
        hashMap.put(C0059ao.a(5901), PreHoneycombCompat.TRANSLATION_X);
        hashMap.put(C0059ao.a(5902), PreHoneycombCompat.TRANSLATION_Y);
        hashMap.put(C0059ao.a(5903), PreHoneycombCompat.ROTATION);
        hashMap.put(C0059ao.a(5904), PreHoneycombCompat.ROTATION_X);
        hashMap.put(C0059ao.a(5905), PreHoneycombCompat.ROTATION_Y);
        hashMap.put(C0059ao.a(5906), PreHoneycombCompat.SCALE_X);
        hashMap.put(C0059ao.a(5907), PreHoneycombCompat.SCALE_Y);
        hashMap.put(C0059ao.a(5908), PreHoneycombCompat.SCROLL_X);
        hashMap.put(C0059ao.a(5909), PreHoneycombCompat.SCROLL_Y);
        hashMap.put(C0059ao.a(5910), PreHoneycombCompat.X);
        hashMap.put(C0059ao.a(5911), PreHoneycombCompat.Y);
    }

    public ObjectAnimator() {
    }

    public static ObjectAnimator ofFloat(Object obj, String str, float... fArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator(obj, str);
        objectAnimator.setFloatValues(fArr);
        return objectAnimator;
    }

    public static ObjectAnimator ofInt(Object obj, String str, int... iArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator(obj, str);
        objectAnimator.setIntValues(iArr);
        return objectAnimator;
    }

    public static ObjectAnimator ofObject(Object obj, String str, TypeEvaluator typeEvaluator, Object... objArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator(obj, str);
        objectAnimator.setObjectValues(objArr);
        objectAnimator.setEvaluator(typeEvaluator);
        return objectAnimator;
    }

    public static ObjectAnimator ofPropertyValuesHolder(Object obj, PropertyValuesHolder... propertyValuesHolderArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.mTarget = obj;
        objectAnimator.setValues(propertyValuesHolderArr);
        return objectAnimator;
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void animateValue(float f) {
        super.animateValue(f);
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].setAnimatedValue(this.mTarget);
        }
    }

    public String getPropertyName() {
        return this.mPropertyName;
    }

    public Object getTarget() {
        return this.mTarget;
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void initAnimation() {
        if (this.mInitialized) {
            return;
        }
        if (this.mProperty == null && AnimatorProxy.NEEDS_PROXY && (this.mTarget instanceof View)) {
            Map<String, Property> map = PROXY_PROPERTIES;
            if (map.containsKey(this.mPropertyName)) {
                setProperty(map.get(this.mPropertyName));
            }
        }
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].setupSetterAndGetter(this.mTarget);
        }
        super.initAnimation();
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void setFloatValues(float... fArr) {
        PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr != null && propertyValuesHolderArr.length != 0) {
            super.setFloatValues(fArr);
            return;
        }
        Property property = this.mProperty;
        if (property != null) {
            setValues(PropertyValuesHolder.ofFloat(property, fArr));
        } else {
            setValues(PropertyValuesHolder.ofFloat(this.mPropertyName, fArr));
        }
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void setIntValues(int... iArr) {
        PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr != null && propertyValuesHolderArr.length != 0) {
            super.setIntValues(iArr);
            return;
        }
        Property property = this.mProperty;
        if (property != null) {
            setValues(PropertyValuesHolder.ofInt(property, iArr));
        } else {
            setValues(PropertyValuesHolder.ofInt(this.mPropertyName, iArr));
        }
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void setObjectValues(Object... objArr) {
        PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr != null && propertyValuesHolderArr.length != 0) {
            super.setObjectValues(objArr);
            return;
        }
        Property property = this.mProperty;
        if (property != null) {
            setValues(PropertyValuesHolder.ofObject(property, (TypeEvaluator) null, objArr));
        } else {
            setValues(PropertyValuesHolder.ofObject(this.mPropertyName, (TypeEvaluator) null, objArr));
        }
    }

    public void setProperty(Property property) {
        PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr != null) {
            PropertyValuesHolder propertyValuesHolder = propertyValuesHolderArr[0];
            String propertyName = propertyValuesHolder.getPropertyName();
            propertyValuesHolder.setProperty(property);
            this.mValuesMap.remove(propertyName);
            this.mValuesMap.put(this.mPropertyName, propertyValuesHolder);
        }
        if (this.mProperty != null) {
            this.mPropertyName = property.getName();
        }
        this.mProperty = property;
        this.mInitialized = false;
    }

    public void setPropertyName(String str) {
        PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr != null) {
            PropertyValuesHolder propertyValuesHolder = propertyValuesHolderArr[0];
            String propertyName = propertyValuesHolder.getPropertyName();
            propertyValuesHolder.setPropertyName(str);
            this.mValuesMap.remove(propertyName);
            this.mValuesMap.put(str, propertyValuesHolder);
        }
        this.mPropertyName = str;
        this.mInitialized = false;
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setTarget(Object obj) {
        Object obj2 = this.mTarget;
        if (obj2 != obj) {
            this.mTarget = obj;
            if (obj2 == null || obj == null || obj2.getClass() != obj.getClass()) {
                this.mInitialized = false;
            }
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setupEndValues() {
        initAnimation();
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].setupEndValue(this.mTarget);
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setupStartValues() {
        initAnimation();
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].setupStartValue(this.mTarget);
        }
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    public void start() {
        super.start();
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public String toString() {
        String str = C0059ao.a(5912) + Integer.toHexString(hashCode()) + C0059ao.a(5913) + this.mTarget;
        if (this.mValues != null) {
            for (int i = 0; i < this.mValues.length; i++) {
                str = str + C0059ao.a(5914) + this.mValues[i].toString();
            }
        }
        return str;
    }

    private ObjectAnimator(Object obj, String str) {
        this.mTarget = obj;
        setPropertyName(str);
    }

    public static <T> ObjectAnimator ofFloat(T t, Property<T, Float> property, float... fArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator(t, property);
        objectAnimator.setFloatValues(fArr);
        return objectAnimator;
    }

    public static <T> ObjectAnimator ofInt(T t, Property<T, Integer> property, int... iArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator(t, property);
        objectAnimator.setIntValues(iArr);
        return objectAnimator;
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    public ObjectAnimator setDuration(long j) {
        super.setDuration(j);
        return this;
    }

    public static <T, V> ObjectAnimator ofObject(T t, Property<T, V> property, TypeEvaluator<V> typeEvaluator, V... vArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator(t, property);
        objectAnimator.setObjectValues(vArr);
        objectAnimator.setEvaluator(typeEvaluator);
        return objectAnimator;
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    /* renamed from: clone */
    public ObjectAnimator mo236clone() {
        return (ObjectAnimator) super.mo236clone();
    }

    private <T> ObjectAnimator(T t, Property<T, ?> property) {
        this.mTarget = t;
        setProperty(property);
    }
}
