package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: j7  reason: default package */
/* loaded from: classes.dex */
public abstract class j7 extends View {
    public int[] b;
    public int c;
    public Context d;
    public u5 e;
    public boolean f;
    public String g;
    public String h;
    public View[] i;
    public HashMap<Integer, String> j;

    public j7(Context context) {
        super(context);
        this.b = new int[32];
        this.f = false;
        this.i = null;
        this.j = new HashMap<>();
        this.d = context;
        m(null);
    }

    public final void d(String str) {
        if (str == null || str.length() == 0 || this.d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int k = k(trim);
        if (k != 0) {
            this.j.put(Integer.valueOf(k), trim);
            e(k);
            return;
        }
        Log.w(C0059ao.a(8440), C0059ao.a(8438) + trim + C0059ao.a(8439));
    }

    public final void e(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.c + 1;
        int[] iArr = this.b;
        if (i2 > iArr.length) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        iArr2[i3] = i;
        this.c = i3 + 1;
    }

    public final void f(String str) {
        if (str == null || str.length() == 0 || this.d == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        String a = C0059ao.a(8441);
        if (constraintLayout == null) {
            Log.w(a, C0059ao.a(8442));
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).a0)) {
                if (childAt.getId() == -1) {
                    Log.w(a, C0059ao.a(8443) + childAt.getClass().getSimpleName() + C0059ao.a(8444));
                } else {
                    e(childAt.getId());
                }
            }
        }
    }

    public void g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.b, this.c);
    }

    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.c; i++) {
            View l = constraintLayout.l(this.b[i]);
            if (l != null) {
                l.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    l.setTranslationZ(l.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public final int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object g = constraintLayout.g(0, str);
            if (g instanceof Integer) {
                i = ((Integer) g).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = j(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = p7.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            return this.d.getResources().getIdentifier(str, C0059ao.a(8445), this.d.getPackageName());
        }
        return i;
    }

    public View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.i;
        if (viewArr == null || viewArr.length != this.c) {
            this.i = new View[this.c];
        }
        for (int i = 0; i < this.c; i++) {
            this.i[i] = constraintLayout.l(this.b[i]);
        }
        return this.i;
    }

    public void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q7.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == q7.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.g = string;
                    setIds(string);
                } else if (index == q7.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.h = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void n(r5 r5Var, boolean z) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
        String str;
        int j;
        if (isInEditMode()) {
            setIds(this.g);
        }
        u5 u5Var = this.e;
        if (u5Var == null) {
            return;
        }
        u5Var.b();
        for (int i = 0; i < this.c; i++) {
            int i2 = this.b[i];
            View l = constraintLayout.l(i2);
            if (l == null && (j = j(constraintLayout, (str = this.j.get(Integer.valueOf(i2))))) != 0) {
                this.b[i] = j;
                this.j.put(Integer.valueOf(j), str);
                l = constraintLayout.l(j);
            }
            if (l != null) {
                this.e.c(constraintLayout.p(l));
            }
        }
        this.e.a(constraintLayout.d);
    }

    public void s() {
        if (this.e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).t0 = (r5) this.e;
        }
    }

    public void setIds(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                d(str.substring(i));
                return;
            } else {
                d(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.h = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                f(str.substring(i));
                return;
            } else {
                f(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.g = null;
        this.c = 0;
        for (int i : iArr) {
            e(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.g == null) {
            e(i);
        }
    }

    public j7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new int[32];
        this.f = false;
        this.i = null;
        this.j = new HashMap<>();
        this.d = context;
        m(attributeSet);
    }
}
