package defpackage;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.vision.barcode.Barcode;
import defpackage.eb;
import defpackage.ic;
import defpackage.lc;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: ac  reason: default package */
/* loaded from: classes.dex */
public class ac {
    public static Field b;
    public static boolean c;
    public static Field d;
    public static boolean e;
    public static WeakHashMap<View, String> f;
    public static Field h;
    public static ThreadLocal<Rect> j;
    public static final AtomicInteger a = new AtomicInteger(1);
    public static WeakHashMap<View, ec> g = null;
    public static boolean i = false;
    public static final int[] k = {b8.accessibility_custom_action_0, b8.accessibility_custom_action_1, b8.accessibility_custom_action_2, b8.accessibility_custom_action_3, b8.accessibility_custom_action_4, b8.accessibility_custom_action_5, b8.accessibility_custom_action_6, b8.accessibility_custom_action_7, b8.accessibility_custom_action_8, b8.accessibility_custom_action_9, b8.accessibility_custom_action_10, b8.accessibility_custom_action_11, b8.accessibility_custom_action_12, b8.accessibility_custom_action_13, b8.accessibility_custom_action_14, b8.accessibility_custom_action_15, b8.accessibility_custom_action_16, b8.accessibility_custom_action_17, b8.accessibility_custom_action_18, b8.accessibility_custom_action_19, b8.accessibility_custom_action_20, b8.accessibility_custom_action_21, b8.accessibility_custom_action_22, b8.accessibility_custom_action_23, b8.accessibility_custom_action_24, b8.accessibility_custom_action_25, b8.accessibility_custom_action_26, b8.accessibility_custom_action_27, b8.accessibility_custom_action_28, b8.accessibility_custom_action_29, b8.accessibility_custom_action_30, b8.accessibility_custom_action_31};
    public static final wb l = new a();

    /* compiled from: AxisPay */
    /* renamed from: ac$a */
    /* loaded from: classes.dex */
    public class a implements wb {
        @Override // defpackage.wb
        public gb onReceiveContent(gb gbVar) {
            return gbVar;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ac$b */
    /* loaded from: classes.dex */
    public class b extends g<Boolean> {
        public b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // defpackage.ac.g
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        @Override // defpackage.ac.g
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        @Override // defpackage.ac.g
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ac$c */
    /* loaded from: classes.dex */
    public class c extends g<CharSequence> {
        public c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // defpackage.ac.g
        /* renamed from: i */
        public CharSequence d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @Override // defpackage.ac.g
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @Override // defpackage.ac.g
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ac$d */
    /* loaded from: classes.dex */
    public class d extends g<CharSequence> {
        public d(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // defpackage.ac.g
        /* renamed from: i */
        public CharSequence d(View view) {
            return view.getStateDescription();
        }

        @Override // defpackage.ac.g
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        @Override // defpackage.ac.g
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ac$e */
    /* loaded from: classes.dex */
    public class e extends g<Boolean> {
        public e(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // defpackage.ac.g
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        @Override // defpackage.ac.g
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        @Override // defpackage.ac.g
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ac$f */
    /* loaded from: classes.dex */
    public static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public WeakHashMap<View, Boolean> b = new WeakHashMap<>();

        public final void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                ac.Z(view, z2 ? 16 : 32);
                this.b.put(view, Boolean.valueOf(z2));
            }
        }

        public final void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.b.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ac$g */
    /* loaded from: classes.dex */
    public static abstract class g<T> {
        public final int a;
        public final Class<T> b;
        public final int c;
        public final int d;

        public g(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        public abstract T d(View view);

        public abstract void e(View view, T t);

        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (b()) {
                T t = (T) view.getTag(this.a);
                if (this.b.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        public void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                ac.G(view);
                view.setTag(this.a, t);
                ac.Z(view, this.d);
            }
        }

        public abstract boolean h(T t, T t2);

        public g(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ac$h */
    /* loaded from: classes.dex */
    public static class h {

        /* compiled from: AxisPay */
        /* renamed from: ac$h$a */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            public ic a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ ub c;

            public a(View view, ub ubVar) {
                this.b = view;
                this.c = ubVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                ic x = ic.x(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    h.a(windowInsets, this.b);
                    if (x.equals(this.a)) {
                        return this.c.a(view, x).v();
                    }
                }
                this.a = x;
                ic a = this.c.a(view, x);
                if (i >= 30) {
                    return a.v();
                }
                ac.n0(view);
                return a.v();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(b8.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static ic b(View view, ic icVar, Rect rect) {
            WindowInsets v = icVar.v();
            if (v != null) {
                return ic.x(view.computeSystemWindowInsets(v, rect), view);
            }
            rect.setEmpty();
            return icVar;
        }

        public static ic c(View view) {
            return ic.a.a(view);
        }

        public static void d(View view, ub ubVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(b8.tag_on_apply_window_listener, ubVar);
            }
            if (ubVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(b8.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, ubVar));
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ac$i */
    /* loaded from: classes.dex */
    public static class i {
        public static ic a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            ic w = ic.w(rootWindowInsets);
            w.t(w);
            w.d(view.getRootView());
            return w;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ac$j */
    /* loaded from: classes.dex */
    public static class j {
        public static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ac$k */
    /* loaded from: classes.dex */
    public interface k {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* compiled from: AxisPay */
    /* renamed from: ac$l */
    /* loaded from: classes.dex */
    public static class l {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        public WeakHashMap<View, Boolean> a = null;
        public SparseArray<WeakReference<View>> b = null;
        public WeakReference<KeyEvent> c = null;

        public static l a(View view) {
            int i = b8.tag_unhandled_key_event_manager;
            l lVar = (l) view.getTag(i);
            if (lVar == null) {
                l lVar2 = new l();
                view.setTag(i, lVar2);
                return lVar2;
            }
            return lVar;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c));
                }
            }
            return c != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            return this.b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(b8.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((k) arrayList.get(size)).a(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> d2 = d();
                if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = d2.valueAt(indexOfKey);
                    d2.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = d2.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && ac.U(view)) {
                        e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.a == null) {
                    this.a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    static {
        new f();
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void A0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int B(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void B0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19) {
            view.setImportantForAccessibility(i2);
        } else if (i3 >= 16) {
            if (i2 == 4) {
                i2 = 2;
            }
            view.setImportantForAccessibility(i2);
        }
    }

    public static int C(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static void C0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    public static int D(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!e) {
            try {
                Field declaredField = View.class.getDeclaredField(C0059ao.a(976));
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static void D0(View view, ub ubVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            h.d(view, ubVar);
        }
    }

    public static int E(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!c) {
            try {
                Field declaredField = View.class.getDeclaredField(C0059ao.a(977));
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static void E0(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    public static String[] F(View view) {
        return (String[]) view.getTag(b8.tag_on_receive_content_mime_types);
    }

    public static void F0(View view, yb ybVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (ybVar != null ? ybVar.a() : null));
        }
    }

    public static eb G(View view) {
        eb l2 = l(view);
        if (l2 == null) {
            l2 = new eb();
        }
        q0(view, l2);
        return l2;
    }

    public static void G0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static int H(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static void H0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            L0().g(view, charSequence);
        }
    }

    public static int I(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static void I0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f == null) {
            f = new WeakHashMap<>();
        }
        f.put(view, str);
    }

    public static ViewParent J(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    public static void J0(View view) {
        if (A(view) == 0) {
            B0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (A((View) parent) == 4) {
                B0(view, 2);
                return;
            }
        }
    }

    public static ic K(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return i.a(view);
        }
        if (i2 >= 21) {
            return h.c(view);
        }
        return null;
    }

    @Deprecated
    public static void K0(View view, float f2) {
        view.setX(f2);
    }

    public static final CharSequence L(View view) {
        return L0().f(view);
    }

    public static g<CharSequence> L0() {
        return new d(b8.tag_state_description, CharSequence.class, 64, 30);
    }

    public static String M(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static void M0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof ob) {
            ((ob) view).stopNestedScroll();
        }
    }

    public static int N(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static void N0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @Deprecated
    public static float O(View view) {
        return view.getY();
    }

    public static float P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean Q(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean R(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean S(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static boolean T(View view) {
        Boolean f2 = a().f(view);
        if (f2 == null) {
            return false;
        }
        return f2.booleanValue();
    }

    public static boolean U(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean V(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean W(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof ob) {
            return ((ob) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean X(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean Y(View view) {
        Boolean f2 = p0().f(view);
        if (f2 == null) {
            return false;
        }
        return f2.booleanValue();
    }

    public static void Z(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(C0059ao.a(978));
        if (accessibilityManager.isEnabled()) {
            boolean z = p(view) != null && view.getVisibility() == 0;
            if (o(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : Barcode.PDF417);
                obtain.setContentChangeTypes(i2);
                if (z) {
                    obtain.getText().add(p(view));
                    J0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e(C0059ao.a(980), view.getParent().getClass().getSimpleName() + C0059ao.a(979), e2);
                }
            }
        }
    }

    public static g<Boolean> a() {
        return new e(b8.tag_accessibility_heading, Boolean.class, 28);
    }

    public static void a0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 >= 21) {
            Rect x = x();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            e(view, i2);
            if (z && x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(x);
            }
        } else {
            e(view, i2);
        }
    }

    public static int b(View view, CharSequence charSequence, oc ocVar) {
        int r = r(view, charSequence);
        if (r != -1) {
            c(view, new lc.a(r, charSequence, ocVar));
        }
        return r;
    }

    public static void b0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 >= 21) {
            Rect x = x();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            f(view, i2);
            if (z && x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(x);
            }
        } else {
            f(view, i2);
        }
    }

    public static void c(View view, lc.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            G(view);
            l0(aVar.b(), view);
            q(view).add(aVar);
            Z(view, 0);
        }
    }

    public static ic c0(View view, ic icVar) {
        WindowInsets v;
        if (Build.VERSION.SDK_INT >= 21 && (v = icVar.v()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(v);
            if (!onApplyWindowInsets.equals(v)) {
                return ic.x(onApplyWindowInsets, view);
            }
        }
        return icVar;
    }

    public static ec d(View view) {
        if (g == null) {
            g = new WeakHashMap<>();
        }
        ec ecVar = g.get(view);
        if (ecVar == null) {
            ec ecVar2 = new ec(view);
            g.put(view, ecVar2);
            return ecVar2;
        }
        return ecVar;
    }

    public static void d0(View view, lc lcVar) {
        view.onInitializeAccessibilityNodeInfo(lcVar.D0());
    }

    public static void e(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            N0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                N0((View) parent);
            }
        }
    }

    public static g<CharSequence> e0() {
        return new c(b8.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static void f(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            N0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                N0((View) parent);
            }
        }
    }

    public static boolean f0(View view, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    public static ic g(View view, ic icVar, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? h.b(view, icVar, rect) : icVar;
    }

    public static gb g0(View view, gb gbVar) {
        if (Log.isLoggable(C0059ao.a(981), 3)) {
            String str = C0059ao.a(982) + gbVar + C0059ao.a(983) + view.getClass().getSimpleName() + C0059ao.a(984) + view.getId() + C0059ao.a(985);
        }
        vb vbVar = (vb) view.getTag(b8.tag_on_receive_content_listener);
        if (vbVar != null) {
            gb a2 = vbVar.a(view, gbVar);
            if (a2 == null) {
                return null;
            }
            return y(view).onReceiveContent(a2);
        }
        return y(view).onReceiveContent(gbVar);
    }

    public static ic h(View view, ic icVar) {
        WindowInsets v;
        if (Build.VERSION.SDK_INT >= 21 && (v = icVar.v()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(v);
            if (!dispatchApplyWindowInsets.equals(v)) {
                return ic.x(dispatchApplyWindowInsets, view);
            }
        }
        return icVar;
    }

    public static void h0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.a(view).b(view, keyEvent);
    }

    public static void i0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.a(view).f(keyEvent);
    }

    public static void j0(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static int k() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = a;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    public static void k0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            l0(i2, view);
            Z(view, 0);
        }
    }

    public static eb l(View view) {
        View.AccessibilityDelegate m = m(view);
        if (m == null) {
            return null;
        }
        if (m instanceof eb.a) {
            return ((eb.a) m).a;
        }
        return new eb(m);
    }

    public static void l0(int i2, View view) {
        List<lc.a> q = q(view);
        for (int i3 = 0; i3 < q.size(); i3++) {
            if (q.get(i3).b() == i2) {
                q.remove(i3);
                return;
            }
        }
    }

    public static View.AccessibilityDelegate m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return n(view);
    }

    public static void m0(View view, lc.a aVar, CharSequence charSequence, oc ocVar) {
        if (ocVar == null && charSequence == null) {
            k0(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, ocVar));
        }
    }

    public static View.AccessibilityDelegate n(View view) {
        if (i) {
            return null;
        }
        if (h == null) {
            try {
                Field declaredField = View.class.getDeclaredField(C0059ao.a(986));
                h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                i = true;
                return null;
            }
        }
        try {
            Object obj = h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            i = true;
            return null;
        }
    }

    public static void n0(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static int o(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void o0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static CharSequence p(View view) {
        return e0().f(view);
    }

    public static g<Boolean> p0() {
        return new b(b8.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static List<lc.a> q(View view) {
        int i2 = b8.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void q0(View view, eb ebVar) {
        if (ebVar == null && (m(view) instanceof eb.a)) {
            ebVar = new eb();
        }
        view.setAccessibilityDelegate(ebVar == null ? null : ebVar.d());
    }

    public static int r(View view, CharSequence charSequence) {
        List<lc.a> q = q(view);
        for (int i2 = 0; i2 < q.size(); i2++) {
            if (TextUtils.equals(charSequence, q.get(i2).c())) {
                return q.get(i2).b();
            }
        }
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int[] iArr = k;
            if (i4 >= iArr.length || i3 != -1) {
                break;
            }
            int i5 = iArr[i4];
            boolean z = true;
            for (int i6 = 0; i6 < q.size(); i6++) {
                z &= q.get(i6).b() != i5;
            }
            if (z) {
                i3 = i5;
            }
            i4++;
        }
        return i3;
    }

    public static void r0(View view, boolean z) {
        a().g(view, Boolean.valueOf(z));
    }

    public static ColorStateList s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof zb) {
            return ((zb) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void s0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    public static PorterDuff.Mode t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof zb) {
            return ((zb) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    @Deprecated
    public static void t0(View view, float f2) {
        view.setAlpha(f2);
    }

    public static Rect u(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static void u0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static Display v(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (U(view)) {
            return ((WindowManager) view.getContext().getSystemService(C0059ao.a(987))).getDefaultDisplay();
        }
        return null;
    }

    public static void v0(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (i2 == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        } else if (view instanceof zb) {
            ((zb) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static float w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void w0(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            view.setBackgroundTintMode(mode);
            if (i2 == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        } else if (view instanceof zb) {
            ((zb) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static Rect x() {
        if (j == null) {
            j = new ThreadLocal<>();
        }
        Rect rect = j.get();
        if (rect == null) {
            rect = new Rect();
            j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void x0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static wb y(View view) {
        if (view instanceof wb) {
            return (wb) view;
        }
        return l;
    }

    public static void y0(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static boolean z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    @Deprecated
    public static void z0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }
}
