package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.i1;
import defpackage.p1;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements p1.a, View.OnClickListener, ActionMenuView.a {
    public k1 b;
    public CharSequence c;
    public Drawable d;
    public i1.b e;
    public y2 f;
    public b g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends y2 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // defpackage.y2
        public r1 b() {
            b bVar = ActionMenuItemView.this.g;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // defpackage.y2
        public boolean c() {
            r1 b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            i1.b bVar = actionMenuItemView.e;
            return bVar != null && bVar.a(actionMenuItemView.b) && (b = b()) != null && b.c();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract r1 a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return c() && this.b.getIcon() == null;
    }

    public boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.p1.a
    public boolean d() {
        return true;
    }

    @Override // defpackage.p1.a
    public void e(k1 k1Var, int i) {
        this.b = k1Var;
        setIcon(k1Var.getIcon());
        setTitle(k1Var.i(this));
        setId(k1Var.getItemId());
        setVisibility(k1Var.isVisible() ? 0 : 8);
        setEnabled(k1Var.isEnabled());
        if (k1Var.hasSubMenu() && this.f == null) {
            this.f = new a();
        }
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.c);
        if (this.d != null && (!this.b.B() || (!this.h && !this.i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.c : null);
        CharSequence contentDescription = this.b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.b.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            q3.a(this, z3 ? null : this.b.getTitle());
        } else {
            q3.a(this, tooltipText);
        }
    }

    @Override // defpackage.p1.a
    public k1 getItemData() {
        return this.b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        i1.b bVar = this.e;
        if (bVar != null) {
            bVar.a(this.b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = f();
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean c = c();
        if (c && (i4 = this.k) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.j);
        } else {
            i3 = this.j;
        }
        if (mode != 1073741824 && this.j > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, CommonUtils.BYTES_IN_A_GIGABYTE), i2);
        }
        if (c || this.d == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        y2 y2Var;
        if (this.b.hasSubMenu() && (y2Var = this.f) != null && y2Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.i != z) {
            this.i = z;
            k1 k1Var = this.b;
            if (k1Var != null) {
                k1Var.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.d = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.l;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(i1.b bVar) {
        this.e = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.g = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.c = charSequence;
        g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.h = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.ActionMenuItemView, i, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(u.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.k = -1;
        setSaveEnabled(false);
    }
}
