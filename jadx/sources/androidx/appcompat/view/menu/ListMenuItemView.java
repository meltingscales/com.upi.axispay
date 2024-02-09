package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.p1;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements p1.a, AbsListView.SelectionBoundsAdjuster {
    public k1 b;
    public ImageView c;
    public RadioButton d;
    public TextView e;
    public CheckBox f;
    public TextView g;
    public ImageView h;
    public ImageView i;
    public LinearLayout j;
    public Drawable k;
    public int l;
    public Context m;
    public boolean n;
    public Drawable o;
    public boolean p;
    public LayoutInflater q;
    public boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        rect.top += this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i) {
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public final void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(r.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f = checkBox;
        a(checkBox);
    }

    @Override // defpackage.p1.a
    public boolean d() {
        return false;
    }

    @Override // defpackage.p1.a
    public void e(k1 k1Var, int i) {
        this.b = k1Var;
        setVisibility(k1Var.isVisible() ? 0 : 8);
        setTitle(k1Var.i(this));
        setCheckable(k1Var.isCheckable());
        h(k1Var.A(), k1Var.g());
        setIcon(k1Var.getIcon());
        setEnabled(k1Var.isEnabled());
        setSubMenuArrowVisible(k1Var.hasSubMenu());
        setContentDescription(k1Var.getContentDescription());
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(r.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.c = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(r.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.d = radioButton;
        a(radioButton);
    }

    @Override // defpackage.p1.a
    public k1 getItemData() {
        return this.b;
    }

    public void h(boolean z, char c) {
        int i = (z && this.b.A()) ? 0 : 8;
        if (i == 0) {
            this.g.setText(this.b.h());
        }
        if (this.g.getVisibility() != i) {
            this.g.setVisibility(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ac.u0(this, this.k);
        TextView textView = (TextView) findViewById(q.title);
        this.e = textView;
        int i = this.l;
        if (i != -1) {
            textView.setTextAppearance(this.m, i);
        }
        this.g = (TextView) findViewById(q.shortcut);
        ImageView imageView = (ImageView) findViewById(q.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(q.group_divider);
        this.j = (LinearLayout) findViewById(q.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.d == null && this.f == null) {
            return;
        }
        if (this.b.m()) {
            if (this.d == null) {
                g();
            }
            compoundButton = this.d;
            compoundButton2 = this.f;
        } else {
            if (this.f == null) {
                c();
            }
            compoundButton = this.f;
            compoundButton2 = this.d;
        }
        if (z) {
            compoundButton.setChecked(this.b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.b.m()) {
            if (this.d == null) {
                g();
            }
            compoundButton = this.d;
        } else {
            if (this.f == null) {
                c();
            }
            compoundButton = this.f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.b.z() || this.r;
        if (z || this.n) {
            ImageView imageView = this.c;
            if (imageView == null && drawable == null && !this.n) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.n) {
                this.c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.c;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.c.getVisibility() != 0) {
                this.c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.e.setText(charSequence);
            if (this.e.getVisibility() != 0) {
                this.e.setVisibility(0);
            }
        } else if (this.e.getVisibility() != 8) {
            this.e.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        o3 v = o3.v(getContext(), attributeSet, u.MenuView, i, 0);
        this.k = v.g(u.MenuView_android_itemBackground);
        this.l = v.n(u.MenuView_android_itemTextAppearance, -1);
        this.n = v.a(u.MenuView_preserveIconSpacing, false);
        this.m = context;
        this.o = v.g(u.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, l.dropDownListViewStyle, 0);
        this.p = obtainStyledAttributes.hasValue(0);
        v.w();
        obtainStyledAttributes.recycle();
    }
}
