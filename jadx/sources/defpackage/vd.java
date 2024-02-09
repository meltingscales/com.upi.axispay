package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vd  reason: default package */
/* loaded from: classes.dex */
public final class vd extends FrameLayout {
    public ArrayList<View> b;
    public ArrayList<View> c;
    public View.OnApplyWindowInsetsListener d;
    public boolean e;

    public vd(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String a;
        this.e = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, od.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(od.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(od.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment i0 = fragmentManager.i0(id);
        if (classAttribute != null && i0 == null) {
            if (id <= 0) {
                if (string != null) {
                    a = C0059ao.a(4718) + string;
                } else {
                    a = C0059ao.a(4719);
                }
                throw new IllegalStateException(C0059ao.a(4720) + classAttribute + a);
            }
            Fragment a2 = fragmentManager.t0().a(context.getClassLoader(), classAttribute);
            a2.onInflate(context, attributeSet, (Bundle) null);
            je n = fragmentManager.n();
            n.u(true);
            n.e(this, a2, string);
            n.m();
        }
        fragmentManager.X0(this);
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.c;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.b.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.C0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(C0059ao.a(4721) + view + C0059ao.a(4722));
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.C0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException(C0059ao.a(4723) + view + C0059ao.a(4724));
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ic c0;
        ic w = ic.w(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
        if (onApplyWindowInsetsListener != null) {
            c0 = ic.w(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            c0 = ac.c0(this, w);
        }
        if (!c0.p()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ac.h(getChildAt(i), c0);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.e && this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                super.drawChild(canvas, this.b.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.e || (arrayList = this.b) == null || arrayList.size() <= 0 || !this.b.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.e = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.e = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException(C0059ao.a(4725));
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.c == null) {
                this.c = new ArrayList<>();
            }
            this.c.add(view);
        }
        super.startViewTransition(view);
    }
}
