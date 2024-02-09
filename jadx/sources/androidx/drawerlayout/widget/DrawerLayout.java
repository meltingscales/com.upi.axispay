package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.kd;
import defpackage.lc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] L = {16843828};
    public static final int[] M = {16842931};
    public static final boolean N;
    public static final boolean O;
    public CharSequence A;
    public CharSequence B;
    public Object C;
    public boolean D;
    public Drawable E;
    public Drawable F;
    public Drawable G;
    public Drawable H;
    public final ArrayList<View> I;
    public Rect J;
    public Matrix K;
    public final c b;
    public float c;
    public int d;
    public int e;
    public float f;
    public Paint g;
    public final kd h;
    public final kd i;
    public final f j;
    public final f k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public d t;
    public List<d> u;
    public float v;
    public float w;
    public Drawable x;
    public Drawable y;
    public Drawable z;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements View.OnApplyWindowInsetsListener {
        public a(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends eb {
        public final Rect d = new Rect();

        public b() {
        }

        @Override // defpackage.eb
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View p = DrawerLayout.this.p();
                if (p != null) {
                    CharSequence s = DrawerLayout.this.s(DrawerLayout.this.t(p));
                    if (s != null) {
                        text.add(s);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // defpackage.eb
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // defpackage.eb
        public void g(View view, lc lcVar) {
            if (DrawerLayout.N) {
                super.g(view, lcVar);
            } else {
                lc P = lc.P(lcVar);
                super.g(view, P);
                lcVar.x0(view);
                ViewParent J = ac.J(view);
                if (J instanceof View) {
                    lcVar.q0((View) J);
                }
                o(lcVar, P);
                P.R();
                n(lcVar, (ViewGroup) view);
            }
            lcVar.a0(DrawerLayout.class.getName());
            lcVar.i0(false);
            lcVar.j0(false);
            lcVar.S(lc.a.e);
            lcVar.S(lc.a.f);
        }

        @Override // defpackage.eb
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.N || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public final void n(lc lcVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.A(childAt)) {
                    lcVar.c(childAt);
                }
            }
        }

        public final void o(lc lcVar, lc lcVar2) {
            Rect rect = this.d;
            lcVar2.m(rect);
            lcVar.W(rect);
            lcVar2.n(rect);
            lcVar.X(rect);
            lcVar.C0(lcVar2.M());
            lcVar.o0(lcVar2.u());
            lcVar.a0(lcVar2.p());
            lcVar.e0(lcVar2.r());
            lcVar.g0(lcVar2.E());
            lcVar.b0(lcVar2.D());
            lcVar.i0(lcVar2.F());
            lcVar.j0(lcVar2.G());
            lcVar.U(lcVar2.A());
            lcVar.v0(lcVar2.K());
            lcVar.m0(lcVar2.H());
            lcVar.a(lcVar2.k());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class c extends eb {
        @Override // defpackage.eb
        public void g(View view, lc lcVar) {
            super.g(view, lcVar);
            if (DrawerLayout.A(view)) {
                return;
            }
            lcVar.q0(null);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface d {
        void a(int i);

        void b(View view, float f);

        void c(View view);

        void d(View view);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f extends kd.c {
        public final int a;
        public kd b;
        public final Runnable c = new a();

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.o();
            }
        }

        public f(int i) {
            this.a = i;
        }

        @Override // defpackage.kd.c
        public int a(View view, int i, int i2) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // defpackage.kd.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // defpackage.kd.c
        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // defpackage.kd.c
        public void f(int i, int i2) {
            View n;
            if ((i & 1) == 1) {
                n = DrawerLayout.this.n(3);
            } else {
                n = DrawerLayout.this.n(5);
            }
            if (n == null || DrawerLayout.this.r(n) != 0) {
                return;
            }
            this.b.b(n, i2);
        }

        @Override // defpackage.kd.c
        public boolean g(int i) {
            return false;
        }

        @Override // defpackage.kd.c
        public void h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }

        @Override // defpackage.kd.c
        public void i(View view, int i) {
            ((e) view.getLayoutParams()).c = false;
            n();
        }

        @Override // defpackage.kd.c
        public void j(int i) {
            DrawerLayout.this.W(this.a, i, this.b.v());
        }

        @Override // defpackage.kd.c
        public void k(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.c(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.U(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // defpackage.kd.c
        public void l(View view, float f, float f2) {
            int i;
            float u = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && u > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.M(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // defpackage.kd.c
        public boolean m(View view, int i) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.a) && DrawerLayout.this.r(view) == 0;
        }

        public final void n() {
            View n = DrawerLayout.this.n(this.a == 3 ? 5 : 3);
            if (n != null) {
                DrawerLayout.this.f(n);
            }
        }

        public void o() {
            View n;
            int width;
            int w = this.b.w();
            boolean z = this.a == 3;
            if (z) {
                n = DrawerLayout.this.n(3);
                width = (n != null ? -n.getWidth() : 0) + w;
            } else {
                n = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - w;
            }
            if (n != null) {
                if (((!z || n.getLeft() >= width) && (z || n.getLeft() <= width)) || DrawerLayout.this.r(n) != 0) {
                    return;
                }
                this.b.O(n, width, n.getTop());
                ((e) n.getLayoutParams()).c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.c);
        }

        public void q(kd kdVar) {
            this.b = kdVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        N = i >= 19;
        O = i >= 21;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean A(View view) {
        return (ac.A(view) == 4 || ac.A(view) == 2) ? false : true;
    }

    public static String w(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public boolean B(View view) {
        return ((e) view.getLayoutParams()).a == 0;
    }

    public boolean C(int i) {
        View n = n(i);
        if (n != null) {
            return D(n);
        }
        return false;
    }

    public boolean D(View view) {
        if (E(view)) {
            return (((e) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean E(View view) {
        int b2 = ib.b(((e) view.getLayoutParams()).a, ac.C(view));
        return ((b2 & 3) == 0 && (b2 & 5) == 0) ? false : true;
    }

    public boolean F(int i) {
        View n = n(i);
        if (n != null) {
            return G(n);
        }
        return false;
    }

    public boolean G(View view) {
        if (E(view)) {
            return ((e) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean H(float f2, float f3, View view) {
        if (this.J == null) {
            this.J = new Rect();
        }
        view.getHitRect(this.J);
        return this.J.contains((int) f2, (int) f3);
    }

    public final boolean I(Drawable drawable, int i) {
        if (drawable == null || !o9.h(drawable)) {
            return false;
        }
        o9.m(drawable, i);
        return true;
    }

    public void J(View view, float f2) {
        float u = u(view);
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (u * width));
        if (!c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        U(view, f2);
    }

    public void K(int i) {
        L(i, true);
    }

    public void L(int i, boolean z) {
        View n = n(i);
        if (n != null) {
            N(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i));
    }

    public void M(View view) {
        N(view, true);
    }

    public void N(View view, boolean z) {
        if (E(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.n) {
                eVar.b = 1.0f;
                eVar.d = 1;
                V(view, true);
            } else if (z) {
                eVar.d |= 2;
                if (c(view, 3)) {
                    this.h.O(view, 0, view.getTop());
                } else {
                    this.i.O(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                J(view, 1.0f);
                W(eVar.a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void O(d dVar) {
        List<d> list;
        if (dVar == null || (list = this.u) == null) {
            return;
        }
        list.remove(dVar);
    }

    public final Drawable P() {
        int C = ac.C(this);
        if (C == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                I(drawable, C);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                I(drawable2, C);
                return this.F;
            }
        }
        return this.G;
    }

    public final Drawable Q() {
        int C = ac.C(this);
        if (C == 0) {
            Drawable drawable = this.F;
            if (drawable != null) {
                I(drawable, C);
                return this.F;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                I(drawable2, C);
                return this.E;
            }
        }
        return this.H;
    }

    public final void R() {
        if (O) {
            return;
        }
        this.y = P();
        this.z = Q();
    }

    public void S(Object obj, boolean z) {
        this.C = obj;
        this.D = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void T(int i, int i2) {
        View n;
        int b2 = ib.b(i2, ac.C(this));
        if (i2 == 3) {
            this.o = i;
        } else if (i2 == 5) {
            this.p = i;
        } else if (i2 == 8388611) {
            this.q = i;
        } else if (i2 == 8388613) {
            this.r = i;
        }
        if (i != 0) {
            (b2 == 3 ? this.h : this.i).a();
        }
        if (i != 1) {
            if (i == 2 && (n = n(b2)) != null) {
                M(n);
                return;
            }
            return;
        }
        View n2 = n(b2);
        if (n2 != null) {
            f(n2);
        }
    }

    public void U(View view, float f2) {
        e eVar = (e) view.getLayoutParams();
        if (f2 == eVar.b) {
            return;
        }
        eVar.b = f2;
        l(view, f2);
    }

    public final void V(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !E(childAt)) || (z && childAt == view)) {
                ac.B0(childAt, 1);
            } else {
                ac.B0(childAt, 4);
            }
        }
    }

    public void W(int i, int i2, View view) {
        int z = this.h.z();
        int z2 = this.i.z();
        int i3 = 2;
        if (z == 1 || z2 == 1) {
            i3 = 1;
        } else if (z != 2 && z2 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f2 = ((e) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                j(view);
            } else if (f2 == 1.0f) {
                k(view);
            }
        }
        if (i3 != this.l) {
            this.l = i3;
            List<d> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).a(i3);
                }
            }
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (E(childAt)) {
                if (D(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.I.add(childAt);
            }
        }
        if (!z) {
            int size = this.I.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.I.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.I.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (o() == null && !E(view)) {
            ac.B0(view, 1);
        } else {
            ac.B0(view, 4);
        }
        if (N) {
            return;
        }
        ac.q0(view, this.b);
    }

    public void b() {
        if (this.s) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.s = true;
    }

    public boolean c(View view, int i) {
        return (t(view) & i) == i;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((e) getChildAt(i).getLayoutParams()).b);
        }
        this.f = f2;
        boolean m = this.h.m(true);
        boolean m2 = this.i.m(true);
        if (m || m2) {
            ac.h0(this);
        }
    }

    public void d(int i) {
        e(i, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i = childCount - 1; i >= 0; i--) {
                    View childAt = getChildAt(i);
                    if (H(x, y, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean B = B(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (B) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.f;
        if (f2 > 0.0f && B) {
            this.g.setColor((this.e & 16777215) | (((int) ((((-16777216) & i) >>> 24) * f2)) << 24));
            canvas.drawRect(i2, 0.0f, width, getHeight(), this.g);
        } else if (this.y != null && c(view, 3)) {
            int intrinsicWidth = this.y.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.h.w(), 1.0f));
            this.y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.y.setAlpha((int) (max * 255.0f));
            this.y.draw(canvas);
        } else if (this.z != null && c(view, 5)) {
            int intrinsicWidth2 = this.z.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.i.w(), 1.0f));
            this.z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.z.setAlpha((int) (max2 * 255.0f));
            this.z.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i, boolean z) {
        View n = n(i);
        if (n != null) {
            g(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z) {
        if (E(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.n) {
                eVar.b = 0.0f;
                eVar.d = 0;
            } else if (z) {
                eVar.d |= 4;
                if (c(view, 3)) {
                    this.h.O(view, -view.getWidth(), view.getTop());
                } else {
                    this.i.O(view, getWidth(), view.getTop());
                }
            } else {
                J(view, 0.0f);
                W(eVar.a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (O) {
            return this.c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.x;
    }

    public void h() {
        i(false);
    }

    public void i(boolean z) {
        boolean O2;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            if (E(childAt) && (!z || eVar.c)) {
                int width = childAt.getWidth();
                if (c(childAt, 3)) {
                    O2 = this.h.O(childAt, -width, childAt.getTop());
                } else {
                    O2 = this.i.O(childAt, getWidth(), childAt.getTop());
                }
                z2 |= O2;
                eVar.c = false;
            }
        }
        this.j.p();
        this.k.p();
        if (z2) {
            invalidate();
        }
    }

    public void j(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.d & 1) == 1) {
            eVar.d = 0;
            List<d> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).d(view);
                }
            }
            V(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void k(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.d & 1) == 0) {
            eVar.d = 1;
            List<d> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).c(view);
                }
            }
            V(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void l(View view, float f2) {
        List<d> list = this.u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u.get(size).b(view, f2);
            }
        }
    }

    public final boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v);
            v.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    public View n(int i) {
        int b2 = ib.b(i, ac.C(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((t(childAt) & 7) == b2) {
                return childAt;
            }
        }
        return null;
    }

    public View o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((e) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.D || this.x == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.C) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.x.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            kd r1 = r6.h
            boolean r1 = r1.N(r7)
            kd r2 = r6.i
            boolean r2 = r2.N(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            kd r7 = r6.h
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.j
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.k
            r7.p()
            goto L36
        L31:
            r6.i(r2)
            r6.s = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.v = r0
            r6.w = r7
            float r4 = r6.f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            kd r4 = r6.h
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.s = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.y()
            if (r7 != 0) goto L70
            boolean r7 = r6.s
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View p = p();
            if (p != null && r(p) == 0) {
                h();
            }
            return p != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f2;
        int i6;
        boolean z2 = true;
        this.m = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i9, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f3 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (eVar.b * f3));
                        f2 = (measuredWidth + i6) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i7 - i5) / f4;
                        i6 = i7 - ((int) (eVar.b * f4));
                    }
                    boolean z3 = f2 != eVar.b ? z2 : false;
                    int i10 = eVar.a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        childAt.layout(i6, i16, measuredWidth + i6, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i6, (i17 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i17 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    }
                    if (z3) {
                        U(childAt, f2);
                    }
                    int i18 = eVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i8++;
            z2 = true;
        }
        this.m = false;
        this.n = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int t;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.C != null && ac.z(this);
        int C = ac.C(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z) {
                    int b2 = ib.b(eVar.a, C);
                    if (ac.z(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.C;
                            if (b2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (b2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.C;
                        if (b2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, CommonUtils.BYTES_IN_A_GIGABYTE));
                } else if (E(childAt)) {
                    if (O) {
                        float w = ac.w(childAt);
                        float f2 = this.c;
                        if (w != f2) {
                            ac.y0(childAt, f2);
                        }
                    }
                    int i5 = (t(childAt) & 7) == 3 ? 1 : i3;
                    if ((i5 != 0 && z2) || (i5 == 0 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.d + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                    i4++;
                    i3 = 0;
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i4++;
            i3 = 0;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View n;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i = savedState.d;
        if (i != 0 && (n = n(i)) != null) {
            M(n);
        }
        int i2 = savedState.e;
        if (i2 != 3) {
            T(i2, 3);
        }
        int i3 = savedState.f;
        if (i3 != 3) {
            T(i3, 5);
        }
        int i4 = savedState.g;
        if (i4 != 3) {
            T(i4, 8388611);
        }
        int i5 = savedState.h;
        if (i5 != 3) {
            T(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        R();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            e eVar = (e) getChildAt(i).getLayoutParams();
            int i2 = eVar.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.d = eVar.a;
                break;
            }
        }
        savedState.e = this.o;
        savedState.f = this.p;
        savedState.g = this.q;
        savedState.h = this.r;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            kd r0 = r6.h
            r0.E(r7)
            kd r0 = r6.i
            r0.E(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.i(r2)
            r6.s = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            kd r3 = r6.h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.v
            float r0 = r0 - r3
            float r3 = r6.w
            float r7 = r7 - r3
            kd r3 = r6.h
            int r3 = r3.y()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5a
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.i(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.v = r0
            r6.w = r7
            r6.s = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public View p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i) {
        int C = ac.C(this);
        if (i == 3) {
            int i2 = this.o;
            if (i2 != 3) {
                return i2;
            }
            int i3 = C == 0 ? this.q : this.r;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.p;
            if (i4 != 3) {
                return i4;
            }
            int i5 = C == 0 ? this.r : this.q;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = C == 0 ? this.o : this.p;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.r;
            if (i8 != 3) {
                return i8;
            }
            int i9 = C == 0 ? this.p : this.o;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    public int r(View view) {
        if (E(view)) {
            return q(((e) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.m) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i) {
        int b2 = ib.b(i, ac.C(this));
        if (b2 == 3) {
            return this.A;
        }
        if (b2 == 5) {
            return this.B;
        }
        return null;
    }

    public void setDrawerElevation(float f2) {
        this.c = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (E(childAt)) {
                ac.y0(childAt, this.c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.t;
        if (dVar2 != null) {
            O(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.t = dVar;
    }

    public void setDrawerLockMode(int i) {
        T(i, 3);
        T(i, 5);
    }

    public void setScrimColor(int i) {
        this.e = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.x = new ColorDrawable(i);
        invalidate();
    }

    public int t(View view) {
        return ib.b(((e) view.getLayoutParams()).a, ac.C(this));
    }

    public float u(View view) {
        return ((e) view.getLayoutParams()).b;
    }

    public final MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.K == null) {
                this.K = new Matrix();
            }
            matrix.invert(this.K);
            obtain.transform(this.K);
        }
        return obtain;
    }

    public final boolean y() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((e) getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        return p() != null;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new c();
        this.e = -1728053248;
        this.g = new Paint();
        this.n = true;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.r = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.d = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        f fVar = new f(3);
        this.j = fVar;
        f fVar2 = new f(5);
        this.k = fVar2;
        kd n = kd.n(this, 1.0f, fVar);
        this.h = n;
        n.K(1);
        n.L(f3);
        fVar.q(n);
        kd n2 = kd.n(this, 1.0f, fVar2);
        this.i = n2;
        n2.K(2);
        n2.L(f3);
        fVar2.q(n2);
        setFocusableInTouchMode(true);
        ac.B0(this, 1);
        ac.q0(this, new b());
        setMotionEventSplittingEnabled(false);
        if (ac.z(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(L);
                try {
                    this.x = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.x = null;
            }
        }
        this.c = f2 * 10.0f;
        this.I = new ArrayList<>();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setStatusBarBackground(int i) {
        this.x = i != 0 ? t8.f(getContext(), i) : null;
        invalidate();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public int a;
        public float b;
        public boolean c;
        public int d;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.M);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(int i, int i2) {
            super(i, i2);
            this.a = 0;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.a = 0;
            this.a = eVar.a;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

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
            this.d = 0;
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.d = 0;
        }
    }
}
