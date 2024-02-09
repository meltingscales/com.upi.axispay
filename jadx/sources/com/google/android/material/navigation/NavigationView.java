package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.i1;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class NavigationView extends gy {
    public static final int[] n = {16842912};
    public static final int[] o = {-16842910};
    public static final int p = rv.Widget_Design_NavigationView;
    public final dy g;
    public final ey h;
    public c i;
    public final int j;
    public final int[] k;
    public MenuInflater l;
    public ViewTreeObserver.OnGlobalLayoutListener m;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements i1.a {
        public a() {
        }

        @Override // defpackage.i1.a
        public boolean a(i1 i1Var, MenuItem menuItem) {
            c cVar = NavigationView.this.i;
            return cVar != null && cVar.f(menuItem);
        }

        @Override // defpackage.i1.a
        public void b(i1 i1Var) {
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.k);
            boolean z = true;
            boolean z2 = NavigationView.this.k[1] == 0;
            NavigationView.this.h.x(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Activity a = yx.a(NavigationView.this.getContext());
            if (a == null || Build.VERSION.SDK_INT < 21) {
                return;
            }
            boolean z3 = a.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
            boolean z4 = Color.alpha(a.getWindow().getNavigationBarColor()) != 0;
            NavigationView navigationView2 = NavigationView.this;
            if (!z3 || !z4) {
                z = false;
            }
            navigationView2.setDrawBottomInsetForeground(z);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface c {
        boolean f(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.navigationViewStyle);
    }

    private MenuInflater getMenuInflater() {
        if (this.l == null) {
            this.l = new z0(getContext());
        }
        return this.l;
    }

    @Override // defpackage.gy
    public void a(ic icVar) {
        this.h.h(icVar);
    }

    public final ColorStateList d(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList c2 = k0.c(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(l.colorPrimary, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = c2.getDefaultColor();
                int[] iArr = o;
                return new ColorStateList(new int[][]{iArr, n, FrameLayout.EMPTY_STATE_SET}, new int[]{c2.getColorForState(iArr, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    public final Drawable e(o3 o3Var) {
        hz hzVar = new hz(lz.b(getContext(), o3Var.n(sv.NavigationView_itemShapeAppearance, 0), o3Var.n(sv.NavigationView_itemShapeAppearanceOverlay, 0)).m());
        hzVar.X(ty.b(getContext(), o3Var, sv.NavigationView_itemShapeFillColor));
        return new InsetDrawable((Drawable) hzVar, o3Var.f(sv.NavigationView_itemShapeInsetStart, 0), o3Var.f(sv.NavigationView_itemShapeInsetTop, 0), o3Var.f(sv.NavigationView_itemShapeInsetEnd, 0), o3Var.f(sv.NavigationView_itemShapeInsetBottom, 0));
    }

    public final boolean f(o3 o3Var) {
        return o3Var.s(sv.NavigationView_itemShapeAppearance) || o3Var.s(sv.NavigationView_itemShapeAppearanceOverlay);
    }

    public View g(int i) {
        return this.h.w(i);
    }

    public MenuItem getCheckedItem() {
        return this.h.n();
    }

    public int getHeaderCount() {
        return this.h.o();
    }

    public Drawable getItemBackground() {
        return this.h.p();
    }

    public int getItemHorizontalPadding() {
        return this.h.q();
    }

    public int getItemIconPadding() {
        return this.h.r();
    }

    public ColorStateList getItemIconTintList() {
        return this.h.u();
    }

    public int getItemMaxLines() {
        return this.h.s();
    }

    public ColorStateList getItemTextColor() {
        return this.h.t();
    }

    public Menu getMenu() {
        return this.g;
    }

    public void h(int i) {
        this.h.J(true);
        getMenuInflater().inflate(i, this.g);
        this.h.J(false);
        this.h.g(false);
    }

    public final void i() {
        this.m = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.m);
    }

    @Override // defpackage.gy, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        iz.e(this);
    }

    @Override // defpackage.gy, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.m);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.m);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.j), CommonUtils.BYTES_IN_A_GIGABYTE);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.j, CommonUtils.BYTES_IN_A_GIGABYTE);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.g.S(savedState.d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.d = bundle;
        this.g.U(bundle);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.g.findItem(i);
        if (findItem != null) {
            this.h.y((k1) findItem);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        iz.d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.h.A(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(t8.f(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.h.B(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.h.B(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.h.C(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.h.C(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.h.D(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.h.E(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.h.F(i);
    }

    public void setItemTextAppearance(int i) {
        this.h.G(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.h.H(colorStateList);
    }

    public void setNavigationItemSelectedListener(c cVar) {
        this.i = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        ey eyVar = this.h;
        if (eyVar != null) {
            eyVar.I(i);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Bundle d;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.g.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.h.y((k1) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
