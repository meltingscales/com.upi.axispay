package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: r2  reason: default package */
/* loaded from: classes.dex */
public class r2 {
    public static final RectF l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<>();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final c k;

    /* compiled from: AxisPay */
    /* renamed from: r2$a */
    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // defpackage.r2.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) r2.r(textView, C0059ao.a(6745), TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: r2$b */
    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // defpackage.r2.a, defpackage.r2.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // defpackage.r2.c
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: r2$c */
    /* loaded from: classes.dex */
    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) r2.r(textView, C0059ao.a(6752), Boolean.FALSE)).booleanValue();
        }
    }

    public r2(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.k = new b();
        } else if (i >= 23) {
            this.k = new a();
        } else {
            this.k = new c();
        }
    }

    public static <T> T a(Object obj, String str, T t) {
        try {
            Field o = o(str);
            return o == null ? t : (T) o.get(obj);
        } catch (IllegalAccessException e) {
            Log.w(C0059ao.a(15406), C0059ao.a(15404) + str + C0059ao.a(15405), e);
            return t;
        }
    }

    public static Field o(String str) {
        try {
            Field field = n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w(C0059ao.a(15409), C0059ao.a(15407) + str + C0059ao.a(15408), e);
            return null;
        }
    }

    public static Method p(String str) {
        try {
            Method method = m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w(C0059ao.a(15412), C0059ao.a(15410) + str + C0059ao.a(15411), e);
            return null;
        }
    }

    public static <T> T r(Object obj, String str, T t) {
        try {
            return (T) p(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            String a2 = C0059ao.a(15413);
            Log.w(a2, C0059ao.a(15414) + str + C0059ao.a(15415), e);
            return t;
        }
    }

    public final void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f = c(iArr);
            B();
        }
    }

    public final boolean B() {
        int[] iArr = this.f;
        int length = iArr.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = iArr[0];
            this.e = iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean C(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.i.getMaxLines() : -1;
        q(i);
        StaticLayout e = e(text, (Layout.Alignment) r(this.i, C0059ao.a(15416), Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e.getLineCount() <= maxLines && e.getLineEnd(e.getLineCount() - 1) == text.length())) && ((float) e.getHeight()) <= rectF.bottom;
    }

    public final boolean D() {
        return !(this.i instanceof d2);
    }

    public final void E(float f, float f2, float f3) throws IllegalArgumentException {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        String a2 = C0059ao.a(15417);
        if (i <= 0) {
            throw new IllegalArgumentException(C0059ao.a(15422) + f + a2);
        } else if (f2 <= f) {
            throw new IllegalArgumentException(C0059ao.a(15419) + f2 + C0059ao.a(15420) + f + C0059ao.a(15421));
        } else if (f3 > 0.0f) {
            this.a = 1;
            this.d = f;
            this.e = f2;
            this.c = f3;
            this.g = false;
        } else {
            throw new IllegalArgumentException(C0059ao.a(15418) + f3 + a2);
        }
    }

    public void b() {
        if (s()) {
            if (this.b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.i) ? CommonUtils.BYTES_IN_A_MEGABYTE : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float i = i(rectF);
                    if (i != this.i.getTextSize()) {
                        y(0, i);
                    }
                }
            }
            this.b = true;
        }
    }

    public final int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public final void d() {
        this.a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.c = -1.0f;
        this.f = new int[0];
        this.b = false;
    }

    public StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            return f(charSequence, alignment, i, i2);
        }
        if (i3 >= 16) {
            return h(charSequence, alignment, i);
        }
        return g(charSequence, alignment, i);
    }

    public final StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.k.a(obtain, this.i);
        } catch (ClassCastException unused) {
            Log.w(C0059ao.a(15423), C0059ao.a(15424));
        }
        return obtain.build();
    }

    public final StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.h, i, alignment, ((Float) a(this.i, C0059ao.a(15425), Float.valueOf(1.0f))).floatValue(), ((Float) a(this.i, C0059ao.a(15426), Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.i, C0059ao.a(15427), Boolean.TRUE)).booleanValue());
    }

    public final StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.h, i, alignment, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
    }

    public final int i(RectF rectF) {
        int i;
        int length = this.f.length;
        if (length == 0) {
            throw new IllegalStateException(C0059ao.a(15428));
        }
        int i2 = 0;
        int i3 = 1;
        int i4 = length - 1;
        while (true) {
            int i5 = i3;
            int i6 = i2;
            i2 = i5;
            while (i2 <= i4) {
                i = (i2 + i4) / 2;
                if (C(this.f[i], rectF)) {
                    break;
                }
                i6 = i - 1;
                i4 = i6;
            }
            return this.f[i6];
            i3 = i + 1;
        }
    }

    public int j() {
        return Math.round(this.e);
    }

    public int k() {
        return Math.round(this.d);
    }

    public int l() {
        return Math.round(this.c);
    }

    public int[] m() {
        return this.f;
    }

    public int n() {
        return this.a;
    }

    public void q(int i) {
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize(i);
    }

    public boolean s() {
        return D() && this.a != 0;
    }

    public void t(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.j;
        int[] iArr = u.AppCompatTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.i;
        ac.o0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = u.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = u.AppCompatTextView_autoSizeStepGranularity;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = u.AppCompatTextView_autoSizeMinTextSize;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = u.AppCompatTextView_autoSizeMaxTextSize;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = u.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (D()) {
            if (this.a == 1) {
                if (!this.g) {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    E(dimension2, dimension3, dimension);
                }
                z();
                return;
            }
            return;
        }
        this.a = 0;
    }

    public void u(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (D()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    public void v(int[] iArr, int i) throws IllegalArgumentException {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f = c(iArr2);
                if (!B()) {
                    throw new IllegalArgumentException(C0059ao.a(15429) + Arrays.toString(iArr));
                }
            } else {
                this.g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    public void w(int i) {
        if (D()) {
            if (i == 0) {
                d();
            } else if (i == 1) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (z()) {
                    b();
                }
            } else {
                throw new IllegalArgumentException(C0059ao.a(15430) + i);
            }
        }
    }

    public final void x(float f) {
        if (f != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.i.isInLayout() : false;
            if (this.i.getLayout() != null) {
                this.b = false;
                try {
                    Method p = p(C0059ao.a(15431));
                    if (p != null) {
                        p.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w(C0059ao.a(15432), C0059ao.a(15433), e);
                }
                if (!isInLayout) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }

    public void y(int i, float f) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        x(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    public final boolean z() {
        if (D() && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.e - this.d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.d + (i * this.c));
                }
                this.f = c(iArr);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }
}
