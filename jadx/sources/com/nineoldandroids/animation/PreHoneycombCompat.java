package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.FloatProperty;
import com.nineoldandroids.util.IntProperty;
import com.nineoldandroids.util.Property;
import com.nineoldandroids.view.animation.AnimatorProxy;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class PreHoneycombCompat {
    public static Property<View, Float> ALPHA = new FloatProperty<View>(C0059ao.a(15515)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.1
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getAlpha());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setAlpha(f);
        }
    };
    public static Property<View, Float> PIVOT_X = new FloatProperty<View>(C0059ao.a(15516)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.2
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getPivotX());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setPivotX(f);
        }
    };
    public static Property<View, Float> PIVOT_Y = new FloatProperty<View>(C0059ao.a(15517)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.3
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getPivotY());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setPivotY(f);
        }
    };
    public static Property<View, Float> TRANSLATION_X = new FloatProperty<View>(C0059ao.a(15518)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.4
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getTranslationX());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setTranslationX(f);
        }
    };
    public static Property<View, Float> TRANSLATION_Y = new FloatProperty<View>(C0059ao.a(15519)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.5
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getTranslationY());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setTranslationY(f);
        }
    };
    public static Property<View, Float> ROTATION = new FloatProperty<View>(C0059ao.a(15520)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.6
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotation());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setRotation(f);
        }
    };
    public static Property<View, Float> ROTATION_X = new FloatProperty<View>(C0059ao.a(15521)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.7
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotationX());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setRotationX(f);
        }
    };
    public static Property<View, Float> ROTATION_Y = new FloatProperty<View>(C0059ao.a(15522)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.8
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotationY());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setRotationY(f);
        }
    };
    public static Property<View, Float> SCALE_X = new FloatProperty<View>(C0059ao.a(15523)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.9
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getScaleX());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setScaleX(f);
        }
    };
    public static Property<View, Float> SCALE_Y = new FloatProperty<View>(C0059ao.a(15524)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.10
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getScaleY());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setScaleY(f);
        }
    };
    public static Property<View, Integer> SCROLL_X = new IntProperty<View>(C0059ao.a(15525)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.11
        @Override // com.nineoldandroids.util.Property
        public Integer get(View view) {
            return Integer.valueOf(AnimatorProxy.wrap(view).getScrollX());
        }

        @Override // com.nineoldandroids.util.IntProperty
        public void setValue(View view, int i) {
            AnimatorProxy.wrap(view).setScrollX(i);
        }
    };
    public static Property<View, Integer> SCROLL_Y = new IntProperty<View>(C0059ao.a(15526)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.12
        @Override // com.nineoldandroids.util.Property
        public Integer get(View view) {
            return Integer.valueOf(AnimatorProxy.wrap(view).getScrollY());
        }

        @Override // com.nineoldandroids.util.IntProperty
        public void setValue(View view, int i) {
            AnimatorProxy.wrap(view).setScrollY(i);
        }
    };
    public static Property<View, Float> X = new FloatProperty<View>(C0059ao.a(15527)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.13
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getX());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setX(f);
        }
    };
    public static Property<View, Float> Y = new FloatProperty<View>(C0059ao.a(15528)) { // from class: com.nineoldandroids.animation.PreHoneycombCompat.14
        @Override // com.nineoldandroids.util.Property
        public Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getY());
        }

        @Override // com.nineoldandroids.util.FloatProperty
        public void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setY(f);
        }
    };

    private PreHoneycombCompat() {
    }
}
