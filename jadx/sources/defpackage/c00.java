package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: c00  reason: default package */
/* loaded from: classes.dex */
public class c00 extends x1 {
    public final a3 e;
    public final AccessibilityManager f;
    public final Rect g;

    /* compiled from: AxisPay */
    /* renamed from: c00$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            c00.this.e(i < 0 ? c00.this.e.v() : c00.this.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = c00.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = c00.this.e.y();
                    i = c00.this.e.x();
                    j = c00.this.e.w();
                }
                onItemClickListener.onItemClick(c00.this.e.h(), view, i, j);
            }
            c00.this.e.dismiss();
        }
    }

    public c00(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.autoCompleteTextViewStyle);
    }

    public final TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c = c();
        int i = 0;
        if (adapter == null || c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.e.x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable g = this.e.g();
        if (g != null) {
            g.getPadding(this.g);
            Rect rect = this.g;
            i2 += rect.left + rect.right;
        }
        return i2 + c.getEndIconView().getMeasuredWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ListAdapter & Filterable> void e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout c = c();
        if (c != null && c.O()) {
            return c.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c = c();
        if (c != null && c.O() && super.getHint() == null && cy.c()) {
            setHint(C0059ao.a(12842));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.e.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.e.a();
        } else {
            super.showDropDown();
        }
    }

    public c00(Context context, AttributeSet attributeSet, int i) {
        super(f00.c(context, attributeSet, i, 0), attributeSet, i);
        this.g = new Rect();
        Context context2 = getContext();
        TypedArray h = ly.h(context2, attributeSet, sv.MaterialAutoCompleteTextView, i, rv.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = sv.MaterialAutoCompleteTextView_android_inputType;
        if (h.hasValue(i2) && h.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f = (AccessibilityManager) context2.getSystemService(C0059ao.a(12841));
        a3 a3Var = new a3(context2);
        this.e = a3Var;
        a3Var.J(true);
        a3Var.D(this);
        a3Var.I(2);
        a3Var.p(getAdapter());
        a3Var.L(new a());
        h.recycle();
    }
}
