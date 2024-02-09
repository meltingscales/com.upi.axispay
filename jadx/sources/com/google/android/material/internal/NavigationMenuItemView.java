package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.vision.barcode.Barcode;
import defpackage.p1;
import defpackage.z2;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends by implements p1.a {
    public static final int[] G = {16842912};
    public FrameLayout A;
    public k1 B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final eb F;
    public int w;
    public boolean x;
    public boolean y;
    public final CheckedTextView z;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends eb {
        public a() {
        }

        @Override // defpackage.eb
        public void g(View view, lc lcVar) {
            super.g(view, lcVar);
            lcVar.Y(NavigationMenuItemView.this.y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(mv.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    public final void B() {
        if (E()) {
            this.z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                z2.a aVar = (z2.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.z.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            z2.a aVar2 = (z2.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.A.setLayoutParams(aVar2);
        }
    }

    public final StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(l.colorControlHighlight, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    public void D() {
        FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.z.setCompoundDrawables(null, null, null, null);
    }

    public final boolean E() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    @Override // defpackage.p1.a
    public boolean d() {
        return false;
    }

    @Override // defpackage.p1.a
    public void e(k1 k1Var, int i) {
        this.B = k1Var;
        if (k1Var.getItemId() > 0) {
            setId(k1Var.getItemId());
        }
        setVisibility(k1Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ac.u0(this, C());
        }
        setCheckable(k1Var.isCheckable());
        setChecked(k1Var.isChecked());
        setEnabled(k1Var.isEnabled());
        setTitle(k1Var.getTitle());
        setIcon(k1Var.getIcon());
        setActionView(k1Var.getActionView());
        setContentDescription(k1Var.getContentDescription());
        q3.a(this, k1Var.getTooltipText());
        B();
    }

    @Override // defpackage.p1.a
    public k1 getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        k1 k1Var = this.B;
        if (k1Var != null && k1Var.isCheckable() && this.B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.y != z) {
            this.y = z;
            this.F.l(this.z, Barcode.PDF417);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.z.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = o9.r(drawable).mutate();
                o9.o(drawable, this.C);
            }
            int i = this.w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.x) {
            if (this.E == null) {
                Drawable e = b9.e(getResources(), lv.navigation_empty_icon, getContext().getTheme());
                this.E = e;
                if (e != null) {
                    int i2 = this.w;
                    e.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.E;
        }
        ad.l(this.z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.w = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        k1 k1Var = this.B;
        if (k1Var != null) {
            setIcon(k1Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.x = z;
    }

    public void setTextAppearance(int i) {
        ad.q(this.z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a aVar = new a();
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(ov.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(kv.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(mv.design_menu_item_text);
        this.z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ac.q0(checkedTextView, aVar);
    }
}
