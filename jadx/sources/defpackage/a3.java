package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: a3  reason: default package */
/* loaded from: classes.dex */
public class a3 implements r1 {
    public static Method G;
    public static Method H;
    public static Method I;
    public final b A;
    public final Handler B;
    public final Rect C;
    public Rect D;
    public boolean E;
    public PopupWindow F;
    public Context b;
    public ListAdapter c;
    public w2 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public int p;
    public View q;
    public int r;
    public DataSetObserver s;
    public View t;
    public Drawable u;
    public AdapterView.OnItemClickListener v;
    public AdapterView.OnItemSelectedListener w;
    public final f x;
    public final e y;
    public final d z;

    /* compiled from: AxisPay */
    /* renamed from: a3$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            w2 w2Var;
            if (i == -1 || (w2Var = a3.this.d) == null) {
                return;
            }
            w2Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: a3$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a3.this.r();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: a3$c */
    /* loaded from: classes.dex */
    public class c extends DataSetObserver {
        public c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (a3.this.c()) {
                a3.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a3.this.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: a3$d */
    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {
        public d() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || a3.this.A() || a3.this.F.getContentView() == null) {
                return;
            }
            a3 a3Var = a3.this;
            a3Var.B.removeCallbacks(a3Var.x);
            a3.this.x.run();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: a3$e */
    /* loaded from: classes.dex */
    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = a3.this.F) != null && popupWindow.isShowing() && x >= 0 && x < a3.this.F.getWidth() && y >= 0 && y < a3.this.F.getHeight()) {
                a3 a3Var = a3.this;
                a3Var.B.postDelayed(a3Var.x, 250L);
                return false;
            } else if (action == 1) {
                a3 a3Var2 = a3.this;
                a3Var2.B.removeCallbacks(a3Var2.x);
                return false;
            } else {
                return false;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: a3$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w2 w2Var = a3.this.d;
            if (w2Var == null || !ac.U(w2Var) || a3.this.d.getCount() <= a3.this.d.getChildCount()) {
                return;
            }
            int childCount = a3.this.d.getChildCount();
            a3 a3Var = a3.this;
            if (childCount <= a3Var.p) {
                a3Var.F.setInputMethodMode(2);
                a3.this.a();
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        String a2 = C0059ao.a(15529);
        if (i <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod(C0059ao.a(15530), Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(a2, C0059ao.a(15531));
            }
            try {
                I = PopupWindow.class.getDeclaredMethod(C0059ao.a(15532), Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(a2, C0059ao.a(15533));
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod(C0059ao.a(15534), View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i(a2, C0059ao.a(15535));
            }
        }
    }

    public a3(Context context) {
        this(context, null, l.listPopupWindowStyle);
    }

    public boolean A() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.E;
    }

    public final void C() {
        View view = this.q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.q);
            }
        }
    }

    public void D(View view) {
        this.t = view;
    }

    public void E(int i) {
        this.F.setAnimationStyle(i);
    }

    public void F(int i) {
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            this.f = rect.left + rect.right + i;
            return;
        }
        Q(i);
    }

    public void G(int i) {
        this.m = i;
    }

    public void H(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void I(int i) {
        this.F.setInputMethodMode(i);
    }

    public void J(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void M(boolean z) {
        this.l = true;
        this.k = z;
    }

    public final void N(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = G;
            if (method != null) {
                try {
                    method.invoke(this.F, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i(C0059ao.a(15536), C0059ao.a(15537));
                    return;
                }
            }
            return;
        }
        this.F.setIsClippedToScreen(z);
    }

    public void O(int i) {
        this.r = i;
    }

    public void P(int i) {
        w2 w2Var = this.d;
        if (!c() || w2Var == null) {
            return;
        }
        w2Var.setListSelectionHidden(false);
        w2Var.setSelection(i);
        if (w2Var.getChoiceMode() != 0) {
            w2Var.setItemChecked(i, true);
        }
    }

    public void Q(int i) {
        this.f = i;
    }

    @Override // defpackage.r1
    public void a() {
        int q = q();
        boolean A = A();
        zc.b(this.F, this.i);
        boolean z = true;
        if (this.F.isShowing()) {
            if (ac.U(t())) {
                int i = this.f;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = t().getWidth();
                }
                int i2 = this.e;
                if (i2 == -1) {
                    if (!A) {
                        q = -1;
                    }
                    if (A) {
                        this.F.setWidth(this.f == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    q = i2;
                }
                PopupWindow popupWindow = this.F;
                if (this.o || this.n) {
                    z = false;
                }
                popupWindow.setOutsideTouchable(z);
                this.F.update(t(), this.g, this.h, i < 0 ? -1 : i, q < 0 ? -1 : q);
                return;
            }
            return;
        }
        int i3 = this.f;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = t().getWidth();
        }
        int i4 = this.e;
        if (i4 == -1) {
            q = -1;
        } else if (i4 != -2) {
            q = i4;
        }
        this.F.setWidth(i3);
        this.F.setHeight(q);
        N(true);
        this.F.setOutsideTouchable((this.o || this.n) ? false : true);
        this.F.setTouchInterceptor(this.y);
        if (this.l) {
            zc.a(this.F, this.k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e2) {
                    Log.e(C0059ao.a(15538), C0059ao.a(15539), e2);
                }
            }
        } else {
            this.F.setEpicenterBounds(this.D);
        }
        zc.c(this.F, t(), this.g, this.h, this.m);
        this.d.setSelection(-1);
        if (!this.E || this.d.isInTouchMode()) {
            r();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.A);
    }

    public void b(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.r1
    public boolean c() {
        return this.F.isShowing();
    }

    public int d() {
        return this.g;
    }

    @Override // defpackage.r1
    public void dismiss() {
        this.F.dismiss();
        C();
        this.F.setContentView(null);
        this.d = null;
        this.B.removeCallbacks(this.x);
    }

    public Drawable g() {
        return this.F.getBackground();
    }

    @Override // defpackage.r1
    public ListView h() {
        return this.d;
    }

    public void j(int i) {
        this.h = i;
        this.j = true;
    }

    public void l(int i) {
        this.g = i;
    }

    public int n() {
        if (this.j) {
            return this.h;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new c();
        } else {
            ListAdapter listAdapter2 = this.c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        w2 w2Var = this.d;
        if (w2Var != null) {
            w2Var.setAdapter(this.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int q() {
        int i;
        int i2;
        int makeMeasureSpec;
        int i3;
        if (this.d == null) {
            Context context = this.b;
            w2 s = s(context, !this.E);
            this.d = s;
            Drawable drawable = this.u;
            if (drawable != null) {
                s.setSelector(drawable);
            }
            this.d.setAdapter(this.c);
            this.d.setOnItemClickListener(this.v);
            this.d.setFocusable(true);
            this.d.setFocusableInTouchMode(true);
            this.d.setOnItemSelectedListener(new a());
            this.d.setOnScrollListener(this.z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.w;
            if (onItemSelectedListener != null) {
                this.d.setOnItemSelectedListener(onItemSelectedListener);
            }
            w2 w2Var = this.d;
            View view = this.q;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.r;
                if (i4 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(w2Var, layoutParams);
                } else if (i4 != 1) {
                    Log.e(C0059ao.a(15541), C0059ao.a(15540) + this.r);
                } else {
                    linearLayout.addView(w2Var, layoutParams);
                    linearLayout.addView(view);
                }
                int i5 = this.f;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                w2Var = linearLayout;
            } else {
                i = 0;
            }
            this.F.setContentView(w2Var);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.F.getContentView();
            View view2 = this.q;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.j) {
                this.h = -i6;
            }
        } else {
            this.C.setEmpty();
            i2 = 0;
        }
        int u = u(t(), this.h, this.F.getInputMethodMode() == 2);
        if (this.n || this.e == -1) {
            return u + i2;
        }
        int i7 = this.f;
        if (i7 == -2) {
            int i8 = this.b.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), RecyclerView.UNDEFINED_DURATION);
        } else if (i7 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, CommonUtils.BYTES_IN_A_GIGABYTE);
        } else {
            int i9 = this.b.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), CommonUtils.BYTES_IN_A_GIGABYTE);
        }
        int d2 = this.d.d(makeMeasureSpec, 0, -1, u - i, -1);
        if (d2 > 0) {
            i += i2 + this.d.getPaddingTop() + this.d.getPaddingBottom();
        }
        return d2 + i;
    }

    public void r() {
        w2 w2Var = this.d;
        if (w2Var != null) {
            w2Var.setListSelectionHidden(true);
            w2Var.requestLayout();
        }
    }

    public w2 s(Context context, boolean z) {
        return new w2(context, z);
    }

    public View t() {
        return this.t;
    }

    public final int u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = H;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.F, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i(C0059ao.a(15542), C0059ao.a(15543));
                }
            }
            return this.F.getMaxAvailableHeight(view, i);
        }
        return this.F.getMaxAvailableHeight(view, i, z);
    }

    public Object v() {
        if (c()) {
            return this.d.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (c()) {
            return this.d.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (c()) {
            return this.d.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (c()) {
            return this.d.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f;
    }

    public a3(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public a3(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = -2;
        this.f = -2;
        this.i = 1002;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.r = 0;
        this.x = new f();
        this.y = new e();
        this.z = new d();
        this.A = new b();
        this.C = new Rect();
        this.b = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.ListPopupWindow, i, i2);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(u.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(u.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        obtainStyledAttributes.recycle();
        i2 i2Var = new i2(context, attributeSet, i, i2);
        this.F = i2Var;
        i2Var.setInputMethodMode(1);
    }
}
