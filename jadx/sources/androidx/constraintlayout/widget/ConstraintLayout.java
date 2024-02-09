package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.v4.media.session.IMediaSession;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.a6;
import defpackage.q5;
import defpackage.r5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static r7 u;
    public SparseArray<View> b;
    public ArrayList<j7> c;
    public s5 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public l7 k;
    public k7 l;
    public int m;
    public HashMap<String, Integer> n;
    public int o;
    public int p;
    public SparseArray<r5> q;
    public c r;
    public int s;
    public int t;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r5.b.values().length];
            a = iArr;
            try {
                iArr[r5.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[r5.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[r5.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[r5.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements a6.b {
        public ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        @Override // defpackage.a6.b
        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.a.getChildAt(i);
                if (childAt instanceof o7) {
                    ((o7) childAt).a(this.a);
                }
            }
            int size = this.a.c.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((j7) this.a.c.get(i2)).p(this.a);
                }
            }
        }

        @Override // defpackage.a6.b
        @SuppressLint({"WrongCall"})
        public final void b(r5 r5Var, a6.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i;
            int i2;
            int i3;
            if (r5Var == null) {
                return;
            }
            if (r5Var.T() == 8 && !r5Var.h0()) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
            } else if (r5Var.I() == null) {
            } else {
                r5.b bVar = aVar.a;
                r5.b bVar2 = aVar.b;
                int i4 = aVar.c;
                int i5 = aVar.d;
                int i6 = this.b + this.c;
                int i7 = this.d;
                View view = (View) r5Var.q();
                int[] iArr = a.a;
                int i8 = iArr[bVar.ordinal()];
                if (i8 == 1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, CommonUtils.BYTES_IN_A_GIGABYTE);
                } else if (i8 == 2) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
                } else if (i8 == 3) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7 + r5Var.z(), -1);
                } else if (i8 != 4) {
                    makeMeasureSpec = 0;
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
                    boolean z = r5Var.t == 1;
                    int i9 = aVar.j;
                    if (i9 == a6.a.l || i9 == a6.a.m) {
                        if (aVar.j == a6.a.m || !z || (z && (view.getMeasuredHeight() == r5Var.v())) || (view instanceof o7) || r5Var.l0()) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r5Var.U(), CommonUtils.BYTES_IN_A_GIGABYTE);
                        }
                    }
                }
                int i10 = iArr[bVar2.ordinal()];
                if (i10 == 1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, CommonUtils.BYTES_IN_A_GIGABYTE);
                } else if (i10 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
                } else if (i10 == 3) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6 + r5Var.S(), -1);
                } else if (i10 != 4) {
                    makeMeasureSpec2 = 0;
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
                    boolean z2 = r5Var.u == 1;
                    int i11 = aVar.j;
                    if (i11 == a6.a.l || i11 == a6.a.m) {
                        if (aVar.j == a6.a.m || !z2 || (z2 && (view.getMeasuredWidth() == r5Var.U())) || (view instanceof o7) || r5Var.m0()) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(r5Var.v(), CommonUtils.BYTES_IN_A_GIGABYTE);
                        }
                    }
                }
                s5 s5Var = (s5) r5Var.I();
                if (s5Var != null && w5.b(ConstraintLayout.this.j, Barcode.QR_CODE) && view.getMeasuredWidth() == r5Var.U() && view.getMeasuredWidth() < s5Var.U() && view.getMeasuredHeight() == r5Var.v() && view.getMeasuredHeight() < s5Var.v() && view.getBaseline() == r5Var.n() && !r5Var.k0()) {
                    if (d(r5Var.A(), makeMeasureSpec, r5Var.U()) && d(r5Var.B(), makeMeasureSpec2, r5Var.v())) {
                        aVar.e = r5Var.U();
                        aVar.f = r5Var.v();
                        aVar.g = r5Var.n();
                        return;
                    }
                }
                r5.b bVar3 = r5.b.MATCH_CONSTRAINT;
                boolean z3 = bVar == bVar3;
                boolean z4 = bVar2 == bVar3;
                r5.b bVar4 = r5.b.MATCH_PARENT;
                boolean z5 = bVar2 == bVar4 || bVar2 == r5.b.FIXED;
                boolean z6 = bVar == bVar4 || bVar == r5.b.FIXED;
                boolean z7 = z3 && r5Var.a0 > 0.0f;
                boolean z8 = z4 && r5Var.a0 > 0.0f;
                if (view == null) {
                    return;
                }
                b bVar5 = (b) view.getLayoutParams();
                int i12 = aVar.j;
                if (i12 != a6.a.l && i12 != a6.a.m && z3 && r5Var.t == 0 && z4 && r5Var.u == 0) {
                    i3 = -1;
                    i2 = 0;
                    baseline = 0;
                    max = 0;
                } else {
                    if ((view instanceof t7) && (r5Var instanceof x5)) {
                        ((t7) view).t((x5) r5Var, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    r5Var.S0(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i13 = r5Var.w;
                    max = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                    int i14 = r5Var.x;
                    if (i14 > 0) {
                        max = Math.min(i14, max);
                    }
                    int i15 = r5Var.z;
                    if (i15 > 0) {
                        i2 = Math.max(i15, measuredHeight);
                        i = makeMeasureSpec;
                    } else {
                        i = makeMeasureSpec;
                        i2 = measuredHeight;
                    }
                    int i16 = r5Var.A;
                    if (i16 > 0) {
                        i2 = Math.min(i16, i2);
                    }
                    if (!w5.b(ConstraintLayout.this.j, 1)) {
                        if (z7 && z5) {
                            max = (int) ((i2 * r5Var.a0) + 0.5f);
                        } else if (z8 && z6) {
                            i2 = (int) ((max / r5Var.a0) + 0.5f);
                        }
                    }
                    if (measuredWidth != max || measuredHeight != i2) {
                        int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, CommonUtils.BYTES_IN_A_GIGABYTE) : i;
                        if (measuredHeight != i2) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, CommonUtils.BYTES_IN_A_GIGABYTE);
                        }
                        view.measure(makeMeasureSpec3, makeMeasureSpec2);
                        r5Var.S0(makeMeasureSpec3, makeMeasureSpec2);
                        max = view.getMeasuredWidth();
                        i2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i3 = -1;
                }
                boolean z9 = baseline != i3;
                aVar.i = (max == aVar.c && i2 == aVar.d) ? false : true;
                if (bVar5.e0) {
                    z9 = true;
                }
                if (z9 && baseline != -1 && r5Var.n() != baseline) {
                    aVar.i = true;
                }
                aVar.e = max;
                aVar.f = i2;
                aVar.h = z9;
                aVar.g = baseline;
            }
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }

        public final boolean d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new SparseArray<>();
        this.c = new ArrayList<>(4);
        this.d = new s5();
        this.e = 0;
        this.f = 0;
        this.g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.i = true;
        this.j = 257;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = new HashMap<>();
        this.o = -1;
        this.p = -1;
        this.q = new SparseArray<>();
        this.r = new c(this);
        this.s = 0;
        this.t = 0;
        q(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return max2 > 0 ? max2 : max;
    }

    public static r7 getSharedValues() {
        if (u == null) {
            u = new r7();
        }
        return u;
    }

    public final boolean A() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            w();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public void d(boolean z, View view, r5 r5Var, b bVar, SparseArray<r5> sparseArray) {
        int i;
        float f;
        int i2;
        int i3;
        r5 r5Var2;
        r5 r5Var3;
        r5 r5Var4;
        r5 r5Var5;
        int i4;
        bVar.a();
        bVar.u0 = false;
        r5Var.g1(view.getVisibility());
        if (bVar.h0) {
            r5Var.Q0(true);
            r5Var.g1(8);
        }
        r5Var.y0(view);
        if (view instanceof j7) {
            ((j7) view).n(r5Var, this.d.L1());
        }
        if (bVar.f0) {
            t5 t5Var = (t5) r5Var;
            int i5 = bVar.q0;
            int i6 = bVar.r0;
            float f2 = bVar.s0;
            if (Build.VERSION.SDK_INT < 17) {
                i5 = bVar.a;
                i6 = bVar.b;
                f2 = bVar.c;
            }
            if (f2 != -1.0f) {
                t5Var.w1(f2);
                return;
            } else if (i5 != -1) {
                t5Var.u1(i5);
                return;
            } else if (i6 != -1) {
                t5Var.v1(i6);
                return;
            } else {
                return;
            }
        }
        int i7 = bVar.j0;
        int i8 = bVar.k0;
        int i9 = bVar.l0;
        int i10 = bVar.m0;
        int i11 = bVar.n0;
        int i12 = bVar.o0;
        float f3 = bVar.p0;
        if (Build.VERSION.SDK_INT < 17) {
            i7 = bVar.e;
            int i13 = bVar.f;
            int i14 = bVar.g;
            int i15 = bVar.h;
            int i16 = bVar.w;
            int i17 = bVar.y;
            float f4 = bVar.E;
            if (i7 == -1 && i13 == -1) {
                int i18 = bVar.t;
                if (i18 != -1) {
                    i7 = i18;
                } else {
                    int i19 = bVar.s;
                    if (i19 != -1) {
                        i13 = i19;
                    }
                }
            }
            if (i14 == -1 && i15 == -1) {
                i2 = bVar.u;
                if (i2 == -1) {
                    int i20 = bVar.v;
                    if (i20 != -1) {
                        i = i17;
                        f = f4;
                        i11 = i16;
                        i3 = i20;
                        i8 = i13;
                        i2 = i14;
                    }
                }
                i = i17;
                f = f4;
                i11 = i16;
                i3 = i15;
                i8 = i13;
            }
            i2 = i14;
            i = i17;
            f = f4;
            i11 = i16;
            i3 = i15;
            i8 = i13;
        } else {
            i = i12;
            f = f3;
            i2 = i9;
            i3 = i10;
        }
        int i21 = bVar.p;
        if (i21 != -1) {
            r5 r5Var6 = sparseArray.get(i21);
            if (r5Var6 != null) {
                r5Var.j(r5Var6, bVar.r, bVar.q);
            }
        } else {
            if (i7 != -1) {
                r5 r5Var7 = sparseArray.get(i7);
                if (r5Var7 != null) {
                    q5.b bVar2 = q5.b.LEFT;
                    r5Var.c0(bVar2, r5Var7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i11);
                }
            } else if (i8 != -1 && (r5Var2 = sparseArray.get(i8)) != null) {
                r5Var.c0(q5.b.LEFT, r5Var2, q5.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i11);
            }
            if (i2 != -1) {
                r5 r5Var8 = sparseArray.get(i2);
                if (r5Var8 != null) {
                    r5Var.c0(q5.b.RIGHT, r5Var8, q5.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i);
                }
            } else if (i3 != -1 && (r5Var3 = sparseArray.get(i3)) != null) {
                q5.b bVar3 = q5.b.RIGHT;
                r5Var.c0(bVar3, r5Var3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i);
            }
            int i22 = bVar.i;
            if (i22 != -1) {
                r5 r5Var9 = sparseArray.get(i22);
                if (r5Var9 != null) {
                    q5.b bVar4 = q5.b.TOP;
                    r5Var.c0(bVar4, r5Var9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            } else {
                int i23 = bVar.j;
                if (i23 != -1 && (r5Var4 = sparseArray.get(i23)) != null) {
                    r5Var.c0(q5.b.TOP, r5Var4, q5.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            }
            int i24 = bVar.k;
            if (i24 != -1) {
                r5 r5Var10 = sparseArray.get(i24);
                if (r5Var10 != null) {
                    r5Var.c0(q5.b.BOTTOM, r5Var10, q5.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            } else {
                int i25 = bVar.l;
                if (i25 != -1 && (r5Var5 = sparseArray.get(i25)) != null) {
                    q5.b bVar5 = q5.b.BOTTOM;
                    r5Var.c0(bVar5, r5Var5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            }
            int i26 = bVar.m;
            if (i26 != -1) {
                z(r5Var, bVar, sparseArray, i26, q5.b.BASELINE);
            } else {
                int i27 = bVar.n;
                if (i27 != -1) {
                    z(r5Var, bVar, sparseArray, i27, q5.b.TOP);
                } else {
                    int i28 = bVar.o;
                    if (i28 != -1) {
                        z(r5Var, bVar, sparseArray, i28, q5.b.BOTTOM);
                    }
                }
            }
            if (f >= 0.0f) {
                r5Var.J0(f);
            }
            float f5 = bVar.F;
            if (f5 >= 0.0f) {
                r5Var.a1(f5);
            }
        }
        if (z && ((i4 = bVar.V) != -1 || bVar.W != -1)) {
            r5Var.Y0(i4, bVar.W);
        }
        if (!bVar.c0) {
            if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                if (bVar.Y) {
                    r5Var.M0(r5.b.MATCH_CONSTRAINT);
                } else {
                    r5Var.M0(r5.b.MATCH_PARENT);
                }
                r5Var.m(q5.b.LEFT).g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                r5Var.m(q5.b.RIGHT).g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            } else {
                r5Var.M0(r5.b.MATCH_CONSTRAINT);
                r5Var.h1(0);
            }
        } else {
            r5Var.M0(r5.b.FIXED);
            r5Var.h1(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                r5Var.M0(r5.b.WRAP_CONTENT);
            }
        }
        if (!bVar.d0) {
            if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
                if (bVar.Z) {
                    r5Var.d1(r5.b.MATCH_CONSTRAINT);
                } else {
                    r5Var.d1(r5.b.MATCH_PARENT);
                }
                r5Var.m(q5.b.TOP).g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                r5Var.m(q5.b.BOTTOM).g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            } else {
                r5Var.d1(r5.b.MATCH_CONSTRAINT);
                r5Var.I0(0);
            }
        } else {
            r5Var.d1(r5.b.FIXED);
            r5Var.I0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                r5Var.d1(r5.b.WRAP_CONTENT);
            }
        }
        r5Var.A0(bVar.G);
        r5Var.O0(bVar.J);
        r5Var.f1(bVar.K);
        r5Var.K0(bVar.L);
        r5Var.b1(bVar.M);
        r5Var.i1(bVar.b0);
        r5Var.N0(bVar.N, bVar.P, bVar.R, bVar.T);
        r5Var.e1(bVar.O, bVar.Q, bVar.S, bVar.U);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<j7> arrayList = this.c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.c.get(i).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        s();
        super.forceLayout();
    }

    public Object g(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.n;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.n.get(str);
        }
        return null;
    }

    public int getMaxHeight() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.g;
    }

    public int getMinHeight() {
        return this.f;
    }

    public int getMinWidth() {
        return this.e;
    }

    public int getOptimizationLevel() {
        return this.d.G1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.d.l == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.d.l = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.d.l = "parent";
            }
        }
        if (this.d.r() == null) {
            s5 s5Var = this.d;
            s5Var.z0(s5Var.l);
            String str = " setDebugName " + this.d.r();
        }
        Iterator<r5> it = this.d.o1().iterator();
        while (it.hasNext()) {
            r5 next = it.next();
            View view = (View) next.q();
            if (view != null) {
                if (next.l == null && (id = view.getId()) != -1) {
                    next.l = getContext().getResources().getResourceEntryName(id);
                }
                if (next.r() == null) {
                    next.z0(next.l);
                    String str2 = " setDebugName " + next.r();
                }
            }
        }
        this.d.M(sb);
        return sb.toString();
    }

    public final r5 k(int i) {
        if (i == 0) {
            return this.d;
        }
        View view = this.b.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.d;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).t0;
    }

    public View l(int i) {
        return this.b.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            r5 r5Var = bVar.t0;
            if ((childAt.getVisibility() != 8 || bVar.f0 || bVar.g0 || bVar.i0 || isInEditMode) && !bVar.h0) {
                int V = r5Var.V();
                int W = r5Var.W();
                int U = r5Var.U() + V;
                int v = r5Var.v() + W;
                childAt.layout(V, W, U, v);
                if ((childAt instanceof o7) && (content = ((o7) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(V, W, U, v);
                }
            }
        }
        int size = this.c.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.c.get(i6).o(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.s == i) {
            int i3 = this.t;
        }
        if (!this.i) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.i = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        boolean z = this.i;
        this.s = i;
        this.t = i2;
        this.d.U1(r());
        if (this.i) {
            this.i = false;
            if (A()) {
                this.d.W1();
            }
        }
        v(this.d, this.j, i, i2);
        u(i, i2, this.d.U(), this.d.v(), this.d.M1(), this.d.K1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        r5 p = p(view);
        if ((view instanceof Guideline) && !(p instanceof t5)) {
            b bVar = (b) view.getLayoutParams();
            t5 t5Var = new t5();
            bVar.t0 = t5Var;
            bVar.f0 = true;
            t5Var.x1(bVar.X);
        }
        if (view instanceof j7) {
            j7 j7Var = (j7) view;
            j7Var.s();
            ((b) view.getLayoutParams()).g0 = true;
            if (!this.c.contains(j7Var)) {
                this.c.add(j7Var);
            }
        }
        this.b.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.b.remove(view.getId());
        this.d.q1(p(view));
        this.c.remove(view);
        this.i = true;
    }

    public final r5 p(View view) {
        if (view == this) {
            return this.d;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).t0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).t0;
            }
            return null;
        }
        return null;
    }

    public final void q(AttributeSet attributeSet, int i, int i2) {
        this.d.y0(this);
        this.d.R1(this.r);
        this.b.put(getId(), this);
        this.k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q7.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == q7.ConstraintLayout_Layout_android_minWidth) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == q7.ConstraintLayout_Layout_android_minHeight) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == q7.ConstraintLayout_Layout_android_maxWidth) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == q7.ConstraintLayout_Layout_android_maxHeight) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == q7.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.j = obtainStyledAttributes.getInt(index, this.j);
                } else if (index == q7.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.l = null;
                        }
                    }
                } else if (index == q7.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        l7 l7Var = new l7();
                        this.k = l7Var;
                        l7Var.m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.k = null;
                    }
                    this.m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d.S1(this.j);
    }

    public boolean r() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        s();
        super.requestLayout();
    }

    public final void s() {
        this.i = true;
        this.o = -1;
        this.p = -1;
    }

    public void setConstraintSet(l7 l7Var) {
        this.k = l7Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.b.remove(getId());
        super.setId(i);
        this.b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(n7 n7Var) {
        k7 k7Var = this.l;
        if (k7Var != null) {
            k7Var.c(n7Var);
        }
    }

    public void setOptimizationLevel(int i) {
        this.j = i;
        this.d.S1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(int i) {
        this.l = new k7(getContext(), this, i);
    }

    public void u(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.r;
        int i5 = cVar.e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + cVar.d, i, 0);
        int min = Math.min(this.g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.h, ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.o = min;
        this.p = min2;
    }

    public void v(s5 s5Var, int i, int i2, int i3) {
        int max;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i4 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        this.r.c(i2, i3, max2, max3, paddingWidth, i4);
        if (Build.VERSION.SDK_INT >= 17) {
            int max4 = Math.max(0, getPaddingStart());
            int max5 = Math.max(0, getPaddingEnd());
            if (max4 <= 0 && max5 <= 0) {
                max4 = Math.max(0, getPaddingLeft());
            } else if (r()) {
                max4 = max5;
            }
            max = max4;
        } else {
            max = Math.max(0, getPaddingLeft());
        }
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        y(s5Var, mode, i5, mode2, i6);
        s5Var.N1(i, mode, i5, mode2, i6, this.o, this.p, max, max2);
    }

    public final void w() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            r5 p = p(getChildAt(i));
            if (p != null) {
                p.r0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    k(childAt.getId()).z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.m != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.m && (childAt2 instanceof m7)) {
                    this.k = ((m7) childAt2).getConstraintSet();
                }
            }
        }
        l7 l7Var = this.k;
        if (l7Var != null) {
            l7Var.d(this, true);
        }
        this.d.r1();
        int size = this.c.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.c.get(i4).r(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof o7) {
                ((o7) childAt3).b(this);
            }
        }
        this.q.clear();
        this.q.put(0, this.d);
        this.q.put(getId(), this.d);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.q.put(childAt4.getId(), p(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            r5 p2 = p(childAt5);
            if (p2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.d.c(p2);
                d(isInEditMode, childAt5, p2, bVar, this.q);
            }
        }
    }

    public void x(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.n == null) {
                this.n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void y(s5 s5Var, int i, int i2, int i3, int i4) {
        r5.b bVar;
        c cVar = this.r;
        int i5 = cVar.e;
        int i6 = cVar.d;
        r5.b bVar2 = r5.b.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            bVar = r5.b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.e);
            }
        } else if (i == 0) {
            bVar = r5.b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.e);
            }
            i2 = 0;
        } else if (i != 1073741824) {
            bVar = bVar2;
            i2 = 0;
        } else {
            i2 = Math.min(this.g - i6, i2);
            bVar = bVar2;
        }
        if (i3 == Integer.MIN_VALUE) {
            bVar2 = r5.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f);
            }
        } else if (i3 != 0) {
            if (i3 == 1073741824) {
                i4 = Math.min(this.h - i5, i4);
            }
            i4 = 0;
        } else {
            bVar2 = r5.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f);
            }
            i4 = 0;
        }
        if (i2 != s5Var.U() || i4 != s5Var.v()) {
            s5Var.J1();
        }
        s5Var.j1(0);
        s5Var.k1(0);
        s5Var.U0(this.g - i6);
        s5Var.T0(this.h - i5);
        s5Var.X0(0);
        s5Var.W0(0);
        s5Var.M0(bVar);
        s5Var.h1(i2);
        s5Var.d1(bVar2);
        s5Var.I0(i4);
        s5Var.X0(this.e - i6);
        s5Var.W0(this.f - i5);
    }

    public final void z(r5 r5Var, b bVar, SparseArray<r5> sparseArray, int i, q5.b bVar2) {
        View view = this.b.get(i);
        r5 r5Var2 = sparseArray.get(i);
        if (r5Var2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.e0 = true;
        q5.b bVar3 = q5.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.e0 = true;
            bVar4.t0.H0(true);
        }
        r5Var.m(bVar3).a(r5Var2.m(bVar2), bVar.D, bVar.C, true);
        r5Var.H0(true);
        r5Var.m(q5.b.TOP).p();
        r5Var.m(q5.b.BOTTOM).p();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new SparseArray<>();
        this.c = new ArrayList<>(4);
        this.d = new s5();
        this.e = 0;
        this.f = 0;
        this.g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.i = true;
        this.j = 257;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = new HashMap<>();
        this.o = -1;
        this.p = -1;
        this.q = new SparseArray<>();
        this.r = new c(this);
        this.s = 0;
        this.t = 0;
        q(attributeSet, i, 0);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public int I;
        public float J;
        public float K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public float T;
        public float U;
        public int V;
        public int W;
        public int X;
        public boolean Y;
        public boolean Z;
        public int a;
        public String a0;
        public int b;
        public int b0;
        public float c;
        public boolean c0;
        public boolean d;
        public boolean d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public boolean g0;
        public int h;
        public boolean h0;
        public int i;
        public boolean i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public int m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public int q0;
        public float r;
        public int r0;
        public int s;
        public float s0;
        public int t;
        public r5 t0;
        public int u;
        public boolean u0;
        public int v;
        public int w;
        public int x;
        public int y;
        public int z;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(q7.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(q7.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(q7.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                SparseIntArray sparseIntArray2 = a;
                sparseIntArray2.append(q7.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray2.append(q7.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray2.append(q7.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray2.append(q7.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray2.append(q7.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray2.append(q7.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray2.append(q7.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray2.append(q7.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray2.append(q7.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = RecyclerView.UNDEFINED_DURATION;
            this.x = RecyclerView.UNDEFINED_DURATION;
            this.y = RecyclerView.UNDEFINED_DURATION;
            this.z = RecyclerView.UNDEFINED_DURATION;
            this.A = RecyclerView.UNDEFINED_DURATION;
            this.B = RecyclerView.UNDEFINED_DURATION;
            this.C = RecyclerView.UNDEFINED_DURATION;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 1.0f;
            this.U = 1.0f;
            this.V = -1;
            this.W = -1;
            this.X = -1;
            this.Y = false;
            this.Z = false;
            this.a0 = null;
            this.b0 = 0;
            this.c0 = true;
            this.d0 = true;
            this.e0 = false;
            this.f0 = false;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = -1;
            this.k0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = RecyclerView.UNDEFINED_DURATION;
            this.o0 = RecyclerView.UNDEFINED_DURATION;
            this.p0 = 0.5f;
            this.t0 = new r5();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q7.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = a.a.get(index);
                switch (i2) {
                    case 1:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                        this.Y = obtainStyledAttributes.getBoolean(index, this.Y);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                        this.Z = obtainStyledAttributes.getBoolean(index, this.Z);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.N = i3;
                        if (i3 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.O = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                        this.T = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.T));
                        this.N = 2;
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                        this.U = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.U));
                        this.O = 2;
                        break;
                    default:
                        switch (i2) {
                            case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                                l7.r(this, obtainStyledAttributes.getString(index));
                                continue;
                            case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                                this.J = obtainStyledAttributes.getFloat(index, this.J);
                                continue;
                            case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                                this.K = obtainStyledAttributes.getFloat(index, this.K);
                                continue;
                            case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                                this.L = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                                this.M = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                                this.V = obtainStyledAttributes.getDimensionPixelOffset(index, this.V);
                                continue;
                            case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                                this.W = obtainStyledAttributes.getDimensionPixelOffset(index, this.W);
                                continue;
                            case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                                this.a0 = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i2) {
                                    case 64:
                                        l7.p(this, obtainStyledAttributes, index, 0);
                                        continue;
                                    case 65:
                                        l7.p(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.b0 = obtainStyledAttributes.getInt(index, this.b0);
                                        continue;
                                    case 67:
                                        this.d = obtainStyledAttributes.getBoolean(index, this.d);
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f0 = false;
            this.c0 = true;
            this.d0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.Y) {
                this.c0 = false;
                if (this.N == 0) {
                    this.N = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.Z) {
                this.d0 = false;
                if (this.O == 0) {
                    this.O = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.c0 = false;
                if (i == 0 && this.N == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.Y = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.d0 = false;
                if (i2 == 0 && this.O == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.Z = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.f0 = true;
            this.c0 = true;
            this.d0 = true;
            if (!(this.t0 instanceof t5)) {
                this.t0 = new t5();
            }
            ((t5) this.t0).x1(this.X);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = RecyclerView.UNDEFINED_DURATION;
            this.x = RecyclerView.UNDEFINED_DURATION;
            this.y = RecyclerView.UNDEFINED_DURATION;
            this.z = RecyclerView.UNDEFINED_DURATION;
            this.A = RecyclerView.UNDEFINED_DURATION;
            this.B = RecyclerView.UNDEFINED_DURATION;
            this.C = RecyclerView.UNDEFINED_DURATION;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 1.0f;
            this.U = 1.0f;
            this.V = -1;
            this.W = -1;
            this.X = -1;
            this.Y = false;
            this.Z = false;
            this.a0 = null;
            this.b0 = 0;
            this.c0 = true;
            this.d0 = true;
            this.e0 = false;
            this.f0 = false;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = -1;
            this.k0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = RecyclerView.UNDEFINED_DURATION;
            this.o0 = RecyclerView.UNDEFINED_DURATION;
            this.p0 = 0.5f;
            this.t0 = new r5();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = RecyclerView.UNDEFINED_DURATION;
            this.x = RecyclerView.UNDEFINED_DURATION;
            this.y = RecyclerView.UNDEFINED_DURATION;
            this.z = RecyclerView.UNDEFINED_DURATION;
            this.A = RecyclerView.UNDEFINED_DURATION;
            this.B = RecyclerView.UNDEFINED_DURATION;
            this.C = RecyclerView.UNDEFINED_DURATION;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 1.0f;
            this.U = 1.0f;
            this.V = -1;
            this.W = -1;
            this.X = -1;
            this.Y = false;
            this.Z = false;
            this.a0 = null;
            this.b0 = 0;
            this.c0 = true;
            this.d0 = true;
            this.e0 = false;
            this.f0 = false;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = -1;
            this.k0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = RecyclerView.UNDEFINED_DURATION;
            this.o0 = RecyclerView.UNDEFINED_DURATION;
            this.p0 = 0.5f;
            this.t0 = new r5();
        }
    }
}
