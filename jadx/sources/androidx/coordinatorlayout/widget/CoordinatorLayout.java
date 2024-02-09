package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements qb, rb {
    public static final String v;
    public static final Class<?>[] w;
    public static final ThreadLocal<Map<String, Constructor<c>>> x;
    public static final Comparator<View> y;
    public static final ab<Rect> z;
    public final List<View> b;
    public final x7<View> c;
    public final List<View> d;
    public final List<View> e;
    public Paint f;
    public final int[] g;
    public final int[] h;
    public boolean i;
    public boolean j;
    public int[] k;
    public View l;
    public View m;
    public g n;
    public boolean o;
    public ic p;
    public boolean q;
    public Drawable r;
    public ViewGroup.OnHierarchyChangeListener s;
    public ub t;
    public final tb u;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements ub {
        public a() {
        }

        @Override // defpackage.ub
        public ic a(View view, ic icVar) {
            CoordinatorLayout.this.W(icVar);
            return icVar;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                B(coordinatorLayout, v, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v) {
            return d(coordinatorLayout, v) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public ic f(CoordinatorLayout coordinatorLayout, V v, ic icVar) {
            return icVar;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                u(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    /* compiled from: AxisPay */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class h implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float P = ac.P(view);
            float P2 = ac.P(view2);
            if (P > P2) {
                return -1;
            }
            return P < P2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        v = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            y = new h();
        } else {
            y = null;
        }
        w = new Class[]{Context.class, AttributeSet.class};
        x = new ThreadLocal<>();
        z = new cb(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u7.coordinatorLayoutStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = v;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = x;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(w);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    public static void O(Rect rect) {
        rect.setEmpty();
        z.a(rect);
    }

    public static int R(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    public static int S(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    public static int T(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    public static Rect a() {
        Rect b2 = z.b();
        return b2 == null ? new Rect() : b2;
    }

    public static int c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public final boolean A(View view) {
        return this.c.j(view);
    }

    public boolean B(View view, int i, int i2) {
        Rect a2 = a();
        t(view, a2);
        try {
            return a2.contains(i, i2);
        } finally {
            O(a2);
        }
    }

    public final void C(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        Rect a2 = a();
        a2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.p != null && ac.z(this) && !ac.z(view)) {
            a2.left += this.p.j();
            a2.top += this.p.l();
            a2.right -= this.p.k();
            a2.bottom -= this.p.i();
        }
        Rect a3 = a();
        ib.a(S(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), a2, a3, i);
        view.layout(a3.left, a3.top, a3.right, a3.bottom);
        O(a2);
        O(a3);
    }

    public final void D(View view, View view2, int i) {
        Rect a2 = a();
        Rect a3 = a();
        try {
            t(view2, a2);
            u(view, i, a2, a3);
            view.layout(a3.left, a3.top, a3.right, a3.bottom);
        } finally {
            O(a2);
            O(a3);
        }
    }

    public final void E(View view, int i, int i2) {
        f fVar = (f) view.getLayoutParams();
        int b2 = ib.b(T(fVar.c), i2);
        int i3 = b2 & 7;
        int i4 = b2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int w2 = w(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            w2 += measuredWidth / 2;
        } else if (i3 == 5) {
            w2 += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(w2, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public final void F(View view, Rect rect, int i) {
        boolean z2;
        boolean z3;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (ac.V(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            Rect a2 = a();
            Rect a3 = a();
            a3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f2 != null && f2.b(this, view, a2)) {
                if (!a3.contains(a2)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a2.toShortString() + " | Bounds:" + a3.toShortString());
                }
            } else {
                a2.set(a3);
            }
            O(a3);
            if (a2.isEmpty()) {
                O(a2);
                return;
            }
            int b2 = ib.b(fVar.h, i);
            boolean z4 = true;
            if ((b2 & 48) != 48 || (i6 = (a2.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.j) >= (i7 = rect.top)) {
                z2 = false;
            } else {
                V(view, i7 - i6);
                z2 = true;
            }
            if ((b2 & 80) == 80 && (height = ((getHeight() - a2.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.j) < (i5 = rect.bottom)) {
                V(view, height - i5);
                z2 = true;
            }
            if (!z2) {
                V(view, 0);
            }
            if ((b2 & 3) != 3 || (i3 = (a2.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.i) >= (i4 = rect.left)) {
                z3 = false;
            } else {
                U(view, i4 - i3);
                z3 = true;
            }
            if ((b2 & 5) != 5 || (width = ((getWidth() - a2.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.i) >= (i2 = rect.right)) {
                z4 = z3;
            } else {
                U(view, width - i2);
            }
            if (!z4) {
                U(view, 0);
            }
            O(a2);
        }
    }

    public void G(View view, int i) {
        c f2;
        f fVar = (f) view.getLayoutParams();
        if (fVar.k != null) {
            Rect a2 = a();
            Rect a3 = a();
            Rect a4 = a();
            t(fVar.k, a2);
            boolean z2 = false;
            q(view, false, a3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i, a2, a4, fVar, measuredWidth, measuredHeight);
            z2 = (a4.left == a3.left && a4.top == a3.top) ? true : true;
            d(fVar, a4, measuredWidth, measuredHeight);
            int i2 = a4.left - a3.left;
            int i3 = a4.top - a3.top;
            if (i2 != 0) {
                ac.a0(view, i2);
            }
            if (i3 != 0) {
                ac.b0(view, i3);
            }
            if (z2 && (f2 = fVar.f()) != null) {
                f2.h(this, view, fVar.k);
            }
            O(a2);
            O(a3);
            O(a4);
        }
    }

    public final void H(int i) {
        boolean z2;
        int C = ac.C(this);
        int size = this.b.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.b.get(i2);
            f fVar = (f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (fVar.l == this.b.get(i3)) {
                        G(view, C);
                    }
                }
                q(view, true, a3);
                if (fVar.g != 0 && !a3.isEmpty()) {
                    int b2 = ib.b(fVar.g, C);
                    int i4 = b2 & 112;
                    if (i4 == 48) {
                        a2.top = Math.max(a2.top, a3.bottom);
                    } else if (i4 == 80) {
                        a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                    }
                    int i5 = b2 & 7;
                    if (i5 == 3) {
                        a2.left = Math.max(a2.left, a3.right);
                    } else if (i5 == 5) {
                        a2.right = Math.max(a2.right, getWidth() - a3.left);
                    }
                }
                if (fVar.h != 0 && view.getVisibility() == 0) {
                    F(view, a2, C);
                }
                if (i != 2) {
                    x(view, a4);
                    if (!a4.equals(a3)) {
                        N(view, a3);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.b.get(i6);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f2 = fVar2.f();
                    if (f2 != null && f2.e(this, view2, view)) {
                        if (i == 0 && fVar2.g()) {
                            fVar2.k();
                        } else {
                            if (i != 2) {
                                z2 = f2.h(this, view2, view);
                            } else {
                                f2.i(this, view2, view);
                                z2 = true;
                            }
                            if (i == 1) {
                                fVar2.p(z2);
                            }
                        }
                    }
                }
            }
        }
        O(a2);
        O(a3);
        O(a4);
    }

    public void I(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.k;
            if (view2 != null) {
                D(view, view2, i);
                return;
            }
            int i2 = fVar.e;
            if (i2 >= 0) {
                E(view, i2, i);
                return;
            } else {
                C(view, i);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void J(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final boolean L(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.d;
        z(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && f2 != null) {
                    if (i == 0) {
                        z2 = f2.k(this, view, motionEvent);
                    } else if (i == 1) {
                        z2 = f2.D(this, view, motionEvent);
                    }
                    if (z2) {
                        this.l = view;
                    }
                }
                boolean c2 = fVar.c();
                boolean i3 = fVar.i(this, view);
                z3 = i3 && !c2;
                if (i3 && !z3) {
                    break;
                }
            } else if (f2 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    f2.k(this, view, motionEvent2);
                } else if (i == 1) {
                    f2.D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z2;
    }

    public final void M() {
        this.b.clear();
        this.c.c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            f y2 = y(childAt);
            y2.d(this, childAt);
            this.c.b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (y2.b(this, childAt, childAt2)) {
                        if (!this.c.d(childAt2)) {
                            this.c.b(childAt2);
                        }
                        this.c.a(childAt2, childAt);
                    }
                }
            }
        }
        this.b.addAll(this.c.i());
        Collections.reverse(this.b);
    }

    public void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    public void P() {
        if (this.j && this.n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.n);
        }
        this.o = false;
    }

    public final void Q(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (f2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    f2.k(this, childAt, obtain);
                } else {
                    f2.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((f) getChildAt(i2).getLayoutParams()).m();
        }
        this.l = null;
        this.i = false;
    }

    public final void U(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i2 = fVar.i;
        if (i2 != i) {
            ac.a0(view, i - i2);
            fVar.i = i;
        }
    }

    public final void V(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i2 = fVar.j;
        if (i2 != i) {
            ac.b0(view, i - i2);
            fVar.j = i;
        }
    }

    public final ic W(ic icVar) {
        if (!ya.a(this.p, icVar)) {
            this.p = icVar;
            boolean z2 = true;
            boolean z3 = icVar != null && icVar.l() > 0;
            this.q = z3;
            if (z3 || getBackground() != null) {
                z2 = false;
            }
            setWillNotDraw(z2);
            e(icVar);
            requestLayout();
        }
        return icVar;
    }

    public final void X() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (ac.z(this)) {
            if (this.t == null) {
                this.t = new a();
            }
            ac.D0(this, this.t);
            setSystemUiVisibility(1280);
            return;
        }
        ac.D0(this, null);
    }

    public void b() {
        if (this.j) {
            if (this.n == null) {
                this.n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.n);
        }
        this.o = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float d2 = cVar.d(this, view);
            if (d2 > 0.0f) {
                if (this.f == null) {
                    this.f = new Paint();
                }
                this.f.setColor(fVar.a.c(this, view));
                this.f.setAlpha(c(Math.round(d2 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public final ic e(ic icVar) {
        c f2;
        if (icVar.p()) {
            return icVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ac.z(childAt) && (f2 = ((f) childAt.getLayoutParams()).f()) != null) {
                f2.f(this, childAt, icVar);
                if (icVar.p()) {
                    break;
                }
            }
        }
        return icVar;
    }

    public void f(View view) {
        List g2 = this.c.g(view);
        if (g2 == null || g2.isEmpty()) {
            return;
        }
        for (int i = 0; i < g2.size(); i++) {
            View view2 = (View) g2.get(i);
            c f2 = ((f) view2.getLayoutParams()).f();
            if (f2 != null) {
                f2.h(this, view2, view);
            }
        }
    }

    public void g() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (A(getChildAt(i))) {
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        if (z2 != this.o) {
            if (z2) {
                b();
            } else {
                P();
            }
        }
    }

    public final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.b);
    }

    public final ic getLastWindowInsets() {
        return this.p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.u.a();
    }

    public Drawable getStatusBarBackground() {
        return this.r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.qb
    public void h(View view, View view2, int i, int i2) {
        c f2;
        this.u.c(view, view2, i, i2);
        this.m = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i2) && (f2 = fVar.f()) != null) {
                f2.v(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // defpackage.qb
    public void i(View view, int i) {
        this.u.e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i)) {
                c f2 = fVar.f();
                if (f2 != null) {
                    f2.C(this, childAt, view, i);
                }
                fVar.l(i);
                fVar.k();
            }
        }
        this.m = null;
    }

    @Override // defpackage.qb
    public void j(View view, int i, int i2, int[] iArr, int i3) {
        c f2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i3) && (f2 = fVar.f()) != null) {
                    int[] iArr2 = this.g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.g;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.g;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: k */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // defpackage.rb
    public void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c f2;
        boolean z2;
        int min;
        int childCount = getChildCount();
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i5) && (f2 = fVar.f()) != null) {
                    int[] iArr2 = this.g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.g;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    if (i4 > 0) {
                        z2 = true;
                        min = Math.max(i7, this.g[1]);
                    } else {
                        z2 = true;
                        min = Math.min(i7, this.g[1]);
                    }
                    i7 = min;
                    z3 = z2;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z3) {
            H(1);
        }
    }

    @Override // defpackage.qb
    public void n(View view, int i, int i2, int i3, int i4, int i5) {
        m(view, i, i2, i3, i4, 0, this.h);
    }

    @Override // defpackage.qb
    public boolean o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f2 = fVar.f();
                if (f2 != null) {
                    boolean A = f2.A(this, childAt, view, view2, i, i2);
                    z2 |= A;
                    fVar.r(i2, A);
                } else {
                    fVar.r(i2, false);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.o) {
            if (this.n == null) {
                this.n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.n);
        }
        if (this.p == null && ac.z(this)) {
            ac.n0(this);
        }
        this.j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.o && this.n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.n);
        }
        View view = this.m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.j = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.q || this.r == null) {
            return;
        }
        ic icVar = this.p;
        int l = icVar != null ? icVar.l() : 0;
        if (l > 0) {
            this.r.setBounds(0, 0, getWidth(), l);
            this.r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean L = L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            Q(true);
        }
        return L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        c f2;
        int C = ac.C(this);
        int size = this.b.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.b.get(i5);
            if (view.getVisibility() != 8 && ((f2 = ((f) view.getLayoutParams()).f()) == null || !f2.l(this, view, C))) {
                I(view, C);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        c f4;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    z3 |= f4.n(this, childAt, view, f2, f3, z2);
                }
            }
        }
        if (z3) {
            H(1);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c f4;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    z2 |= f4.o(this, childAt, view, f2, f3);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        j(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        n(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public void onNestedScrollAccepted(View view, View view2, int i) {
        h(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            c f2 = y(childAt).f();
            if (id != -1 && f2 != null && (parcelable2 = sparseArray.get(id)) != null) {
                f2.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable y2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (id != -1 && f2 != null && (y2 = f2.y(this, childAt)) != null) {
                sparseArray.append(id, y2);
            }
        }
        savedState.d = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.sb
    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.l
            boolean r6 = r6.D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.l
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.Q(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: p */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public void q(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> r(View view) {
        List<View> h2 = this.c.h(view);
        this.e.clear();
        if (h2 != null) {
            this.e.addAll(h2);
        }
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c f2 = ((f) view.getLayoutParams()).f();
        if (f2 == null || !f2.w(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.i) {
            return;
        }
        Q(false);
        this.i = true;
    }

    public List<View> s(View view) {
        List g2 = this.c.g(view);
        this.e.clear();
        if (g2 != null) {
            this.e.addAll(g2);
        }
        return this.e;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.r = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.r.setState(getDrawableState());
                }
                o9.m(this.r, ac.C(this));
                this.r.setVisible(getVisibility() == 0, false);
                this.r.setCallback(this);
            }
            ac.h0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? t8.f(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.r;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.r.setVisible(z2, false);
    }

    public void t(View view, Rect rect) {
        y7.a(this, view, rect);
    }

    public void u(View view, int i, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    public final void v(View view, int i, Rect rect, Rect rect2, f fVar, int i2, int i3) {
        int width;
        int height;
        int b2 = ib.b(R(fVar.c), i);
        int b3 = ib.b(S(fVar.d), i);
        int i4 = b2 & 7;
        int i5 = b2 & 112;
        int i6 = b3 & 7;
        int i7 = b3 & 112;
        if (i6 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i6 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i7 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i7 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }

    public final int w(int i) {
        int[] iArr = this.k;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    public void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    public f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
                fVar.b = true;
            }
        }
        return fVar;
    }

    public final void z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = y;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.b = new ArrayList();
        this.c = new x7<>();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.g = new int[2];
        this.h = new int[2];
        this.u = new tb(this);
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w7.CoordinatorLayout, 0, v7.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w7.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, w7.CoordinatorLayout, attributeSet, obtainStyledAttributes, 0, v7.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, w7.CoordinatorLayout, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(w7.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.k = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.k.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.k;
                iArr[i2] = (int) (iArr[i2] * f2);
            }
        }
        this.r = obtainStyledAttributes.getDrawable(w7.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (ac.A(this) == 0) {
            ac.B0(this, 1);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public SparseArray<Parcelable> d;

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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.d = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.d.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.d.keyAt(i2);
                parcelableArr[i2] = this.d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q;

        public f(int i, int i2) {
            super(i, i2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public boolean a() {
            return this.k == null && this.f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.l || s(view2, ac.C(coordinatorLayout)) || ((cVar = this.a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        public boolean c() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.k;
        }

        public int e() {
            return this.f;
        }

        public c f() {
            return this.a;
        }

        public boolean g() {
            return this.p;
        }

        public Rect h() {
            return this.q;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            c cVar = this.a;
            boolean a = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z;
            this.m = a;
            return a;
        }

        public boolean j(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.o;
            }
            return this.n;
        }

        public void k() {
            this.p = false;
        }

        public void l(int i) {
            r(i, false);
        }

        public void m() {
            this.m = false;
        }

        public final void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f);
            this.k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + view);
            } else if (findViewById == coordinatorLayout) {
                if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                    return;
                }
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            } else {
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.l = null;
                            this.k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.l = findViewById;
            }
        }

        public void o(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.a = cVar;
                this.b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        public void p(boolean z) {
            this.p = z;
        }

        public void q(Rect rect) {
            this.q.set(rect);
        }

        public void r(int i, boolean z) {
            if (i == 0) {
                this.n = z;
            } else if (i != 1) {
            } else {
                this.o = z;
            }
        }

        public final boolean s(View view, int i) {
            int b = ib.b(((f) view.getLayoutParams()).g, i);
            return b != 0 && (ib.b(this.h, i) & b) == b;
        }

        public final boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.l = null;
                    this.k = null;
                    return false;
                }
            }
            this.l = view2;
            return true;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w7.CoordinatorLayout_Layout);
            this.c = obtainStyledAttributes.getInteger(w7.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f = obtainStyledAttributes.getResourceId(w7.CoordinatorLayout_Layout_layout_anchor, -1);
            this.d = obtainStyledAttributes.getInteger(w7.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.e = obtainStyledAttributes.getInteger(w7.CoordinatorLayout_Layout_layout_keyline, -1);
            this.g = obtainStyledAttributes.getInt(w7.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.h = obtainStyledAttributes.getInt(w7.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = w7.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.b = hasValue;
            if (hasValue) {
                this.a = CoordinatorLayout.K(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
    }
}
