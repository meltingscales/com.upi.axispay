package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* compiled from: AxisPay */
/* renamed from: m0  reason: default package */
/* loaded from: classes.dex */
public class m0 extends Drawable implements Drawable.Callback {
    public d b;
    public Rect c;
    public Drawable d;
    public Drawable e;
    public boolean g;
    public boolean i;
    public Runnable j;
    public long k;
    public long l;
    public c m;
    public int f = 255;
    public int h = -1;

    /* compiled from: AxisPay */
    /* renamed from: m0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.a(true);
            m0.this.invalidateSelf();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: m0$b */
    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: m0$c */
    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {
        public Drawable.Callback b;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.b;
            this.b = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.b = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: m0$d */
    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;
        public final m0 a;
        public Resources b;
        public int c;
        public int d;
        public int e;
        public SparseArray<Drawable.ConstantState> f;
        public Drawable[] g;
        public int h;
        public boolean i;
        public boolean j;
        public Rect k;
        public boolean l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        public d(d dVar, m0 m0Var, Resources resources) {
            Resources resources2;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = m0Var;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = dVar != null ? dVar.b : null;
            }
            this.b = resources2;
            int f = m0.f(resources, dVar != null ? dVar.c : 0);
            this.c = f;
            if (dVar != null) {
                this.d = dVar.d;
                this.e = dVar.e;
                this.v = true;
                this.w = true;
                this.i = dVar.i;
                this.l = dVar.l;
                this.x = dVar.x;
                this.y = dVar.y;
                this.z = dVar.z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.c == f) {
                    if (dVar.j) {
                        this.k = dVar.k != null ? new Rect(dVar.k) : null;
                        this.j = true;
                    }
                    if (dVar.m) {
                        this.n = dVar.n;
                        this.o = dVar.o;
                        this.p = dVar.p;
                        this.q = dVar.q;
                        this.m = true;
                    }
                }
                if (dVar.r) {
                    this.s = dVar.s;
                    this.r = true;
                }
                if (dVar.t) {
                    this.u = dVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = dVar.g;
                this.g = new Drawable[drawableArr.length];
                this.h = dVar.h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f;
                if (sparseArray != null) {
                    this.f = sparseArray.clone();
                } else {
                    this.f = new SparseArray<>(this.h);
                }
                int i = this.h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f.put(i2, constantState);
                        } else {
                            this.g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.g = new Drawable[10];
            this.h = 0;
        }

        public final int a(Drawable drawable) {
            int i = this.h;
            if (i >= this.g.length) {
                o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.g[i] = drawable;
            this.h++;
            this.e = drawable.getChangingConfigurations() | this.e;
            p();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return i;
        }

        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i = this.h;
                Drawable[] drawableArr = this.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && o9.b(drawableArr[i2])) {
                        o9.a(drawableArr[i2], theme);
                        this.e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                y(b.c(theme));
            }
        }

        public boolean c() {
            if (this.v) {
                return this.w;
            }
            e();
            this.v = true;
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    if (o9.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f.get(i2);
                    if (constantState != null && b.a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void d() {
            this.m = true;
            e();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.g[this.f.keyAt(i)] = s(this.f.valueAt(i).newDrawable(this.b));
                }
                this.f = null;
            }
        }

        public final int f() {
            return this.g.length;
        }

        public final Drawable g(int i) {
            int indexOfKey;
            Drawable drawable = this.g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = s(this.f.valueAt(indexOfKey).newDrawable(this.b));
            this.g[i] = s;
            this.f.removeAt(indexOfKey);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final int h() {
            return this.h;
        }

        public final int i() {
            if (!this.m) {
                d();
            }
            return this.o;
        }

        public final int j() {
            if (!this.m) {
                d();
            }
            return this.q;
        }

        public final int k() {
            if (!this.m) {
                d();
            }
            return this.p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.i) {
                return null;
            }
            Rect rect2 = this.k;
            if (rect2 != null || this.j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.j = true;
            this.k = rect;
            return rect;
        }

        public final int m() {
            if (!this.m) {
                d();
            }
            return this.n;
        }

        public final int n() {
            if (this.r) {
                return this.s;
            }
            e();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        public void o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.g = drawableArr;
        }

        public void p() {
            this.r = false;
            this.t = false;
        }

        public final boolean q() {
            return this.l;
        }

        public abstract void r();

        public final Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                o9.m(drawable, this.z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.a);
            return mutate;
        }

        public final void t(boolean z) {
            this.l = z;
        }

        public final void u(int i) {
            this.A = i;
        }

        public final void v(int i) {
            this.B = i;
        }

        public final boolean w(int i, int i2) {
            int i3 = this.h;
            Drawable[] drawableArr = this.g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean m = Build.VERSION.SDK_INT >= 23 ? o9.m(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = m;
                    }
                }
            }
            this.z = i;
            return z;
        }

        public final void x(boolean z) {
            this.i = z;
        }

        public final void y(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int f = m0.f(resources, this.c);
                int i = this.c;
                this.c = f;
                if (i != f) {
                    this.m = false;
                    this.j = false;
                }
            }
        }
    }

    public static int f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f
            r3.setAlpha(r9)
            r13.k = r7
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            m0$d r10 = r13.b
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.k = r7
        L38:
            r3 = r6
        L39:
            android.graphics.drawable.Drawable r9 = r13.e
            if (r9 == 0) goto L61
            long r10 = r13.l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r6, r6)
            r0 = 0
            r13.e = r0
            r13.l = r7
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            m0$d r4 = r13.b
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.l = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.b.b(theme);
    }

    public d b() {
        throw null;
    }

    public int c() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.b.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.m == null) {
            this.m = new c();
        }
        c cVar = this.m;
        cVar.b(drawable.getCallback());
        drawable.setCallback(cVar);
        try {
            if (this.b.A <= 0 && this.g) {
                drawable.setAlpha(this.f);
            }
            d dVar = this.b;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    o9.o(drawable, dVar.F);
                }
                d dVar2 = this.b;
                if (dVar2.I) {
                    o9.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.b.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                o9.m(drawable, o9.f(this));
            }
            if (i >= 19) {
                o9.j(drawable, this.b.C);
            }
            Rect rect = this.c;
            if (i >= 21 && rect != null) {
                o9.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.m.a());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final boolean e() {
        return isAutoMirrored() && o9.f(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            m0$d r0 = r9.b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L29
            r9.e = r0
            m0$d r0 = r9.b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.l = r0
            goto L35
        L29:
            r9.e = r4
            r9.l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            m0$d r0 = r9.b
            int r1 = r0.h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.d = r0
            r9.h = r10
            if (r0 == 0) goto L5a
            m0$d r10 = r9.b
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.k = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.d = r4
            r10 = -1
            r9.h = r10
        L5a:
            long r0 = r9.k
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.l
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.j
            if (r10 != 0) goto L73
            m0$a r10 = new m0$a
            r10.<init>()
            r9.j = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.b.c()) {
            this.b.d = getChangingConfigurations();
            return this.b;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.b.q()) {
            return this.b.i();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.b.q()) {
            return this.b.m();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.b.q()) {
            return this.b.j();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.b.q()) {
            return this.b.k();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.b.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.d;
        if (drawable != null) {
            b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l = this.b.l();
        if (l != null) {
            rect.set(l);
            padding = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.d;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    public void h(d dVar) {
        this.b = dVar;
        int i = this.h;
        if (i >= 0) {
            Drawable g = dVar.g(i);
            this.d = g;
            if (g != null) {
                d(g);
            }
        }
        this.e = null;
    }

    public final void i(Resources resources) {
        this.b.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.b.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g) {
                this.d.setAlpha(this.f);
            }
        }
        if (this.l != 0) {
            this.l = 0L;
            z = true;
        }
        if (this.k != 0) {
            this.k = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            d b2 = b();
            b2.r();
            h(b2);
            this.i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.b.w(i, c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.g && this.f == i) {
            return;
        }
        this.g = true;
        this.f = i;
        Drawable drawable = this.d;
        if (drawable != null) {
            if (this.k == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        d dVar = this.b;
        if (dVar.C != z) {
            dVar.C = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                o9.j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.b;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        d dVar = this.b;
        if (dVar.x != z) {
            dVar.x = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            o9.k(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.c;
        if (rect == null) {
            this.c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            o9.l(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.b;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            o9.o(this.d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.b;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            o9.p(this.d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
