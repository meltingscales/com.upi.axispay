package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.fj;
import defpackage.jj;
import defpackage.kj;
import defpackage.lc;
import defpackage.vi;
import defpackage.wi;
import defpackage.zi;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ob {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    public static final boolean ALLOW_THREAD_GAP_WORK;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator;
    public fj mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public h mAdapter;
    public vi mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private k mChildDrawingOrderCallback;
    public wi mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private l mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public zi mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private t mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public m mItemAnimator;
    private m.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList<o> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    public p mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<r> mOnChildAttachStateListeners;
    private s mOnFlingListener;
    private final ArrayList<t> mOnItemTouchListeners;
    public final List<d0> mPendingAccessibilityImportanceChange;
    public SavedState mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public zi.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final w mRecycler;
    public x mRecyclerListener;
    public final List<x> mRecyclerListeners;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private u mScrollListener;
    private List<u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private pb mScrollingChildHelper;
    public final a0 mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final c0 mViewFlinger;
    private final kj.b mViewInfoProcessCallback;
    public final kj mViewInfoStore;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a0 {
        public SparseArray<Object> b;
        public int m;
        public long n;
        public int o;
        public int p;
        public int q;
        public int a = -1;
        public int c = 0;
        public int d = 0;
        public int e = 1;
        public int f = 0;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public boolean l = false;

        public void a(int i) {
            if ((this.e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.e));
        }

        public int b() {
            if (this.h) {
                return this.c - this.d;
            }
            return this.f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.h;
        }

        public void f(h hVar) {
            this.e = 1;
            this.f = hVar.e();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.mItemAnimator;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class b0 {
        public abstract View a(w wVar, int i, int i2);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c0 implements Runnable {
        public int b;
        public int c;
        public OverScroller d;
        public Interpolator e;
        public boolean f;
        public boolean g;

        public c0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.e = interpolator;
            this.f = false;
            this.g = false;
            this.d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i, int i2) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), (int) RecyclerView.MAX_SCROLL_DURATION);
        }

        public void b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.c = 0;
            this.b = 0;
            Interpolator interpolator = this.e;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.e = interpolator2;
                this.d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.d.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            ac.i0(RecyclerView.this, this);
        }

        public void d() {
            if (this.f) {
                this.g = true;
            } else {
                c();
            }
        }

        public void e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.e != interpolator) {
                this.e = interpolator;
                this.d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.c = 0;
            this.b = 0;
            RecyclerView.this.setScrollState(2);
            this.d.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.d.computeScrollOffset();
            }
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                f();
                return;
            }
            this.g = false;
            this.f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.b;
                int i4 = currY - this.c;
                this.b = currX;
                this.c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    z zVar = recyclerView4.mLayout.g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int b = RecyclerView.this.mState.b();
                        if (b == 0) {
                            zVar.r();
                        } else if (zVar.f() >= b) {
                            zVar.p(b - 1);
                            zVar.j(i2, i);
                        } else {
                            zVar.j(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                z zVar2 = RecyclerView.this.mLayout.g;
                if (!(zVar2 != null && zVar2.g()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    zi ziVar = recyclerView7.mGapWorker;
                    if (ziVar != null) {
                        ziVar.f(recyclerView7, i2, i);
                    }
                }
            }
            z zVar3 = RecyclerView.this.mLayout.g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f = false;
            if (this.g) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements kj.b {
        public d() {
        }

        @Override // defpackage.kj.b
        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.m1(d0Var.b, recyclerView.mRecycler);
        }

        @Override // defpackage.kj.b
        public void b(d0 d0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.animateAppearance(d0Var, cVar, cVar2);
        }

        @Override // defpackage.kj.b
        public void c(d0 d0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.mRecycler.J(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, cVar, cVar2);
        }

        @Override // defpackage.kj.b
        public void d(d0 d0Var, m.c cVar, m.c cVar2) {
            d0Var.I(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.b(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.d(d0Var, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class d0 {
        public static final List<Object> u = Collections.emptyList();
        public final View b;
        public WeakReference<RecyclerView> c;
        public int k;
        public RecyclerView s;
        public h<? extends d0> t;
        public int d = -1;
        public int e = -1;
        public long f = -1;
        public int g = -1;
        public int h = -1;
        public d0 i = null;
        public d0 j = null;
        public List<Object> l = null;
        public List<Object> m = null;
        public int n = 0;
        public w o = null;
        public boolean p = false;
        public int q = 0;
        public int r = -1;

        public d0(View view) {
            if (view != null) {
                this.b = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public boolean A() {
            return (this.k & 2) != 0;
        }

        public boolean B() {
            return (this.k & 2) != 0;
        }

        public void C(int i, boolean z) {
            if (this.e == -1) {
                this.e = this.d;
            }
            if (this.h == -1) {
                this.h = this.d;
            }
            if (z) {
                this.h += i;
            }
            this.d += i;
            if (this.b.getLayoutParams() != null) {
                ((q) this.b.getLayoutParams()).c = true;
            }
        }

        public void D(RecyclerView recyclerView) {
            int i = this.r;
            if (i != -1) {
                this.q = i;
            } else {
                this.q = ac.A(this.b);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void E(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.q);
            this.q = 0;
        }

        public void F() {
            this.k = 0;
            this.d = -1;
            this.e = -1;
            this.f = -1L;
            this.h = -1;
            this.n = 0;
            this.i = null;
            this.j = null;
            d();
            this.q = 0;
            this.r = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void G() {
            if (this.e == -1) {
                this.e = this.d;
            }
        }

        public void H(int i, int i2) {
            this.k = (i & i2) | (this.k & (~i2));
        }

        public final void I(boolean z) {
            int i = this.n;
            int i2 = z ? i - 1 : i + 1;
            this.n = i2;
            if (i2 < 0) {
                this.n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.k |= 16;
            } else if (z && i2 == 0) {
                this.k &= -17;
            }
        }

        public void J(w wVar, boolean z) {
            this.o = wVar;
            this.p = z;
        }

        public boolean K() {
            return (this.k & 16) != 0;
        }

        public boolean L() {
            return (this.k & Barcode.ITF) != 0;
        }

        public void M() {
            this.o.J(this);
        }

        public boolean N() {
            return (this.k & 32) != 0;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.k) == 0) {
                g();
                this.l.add(obj);
            }
        }

        public void b(int i) {
            this.k = i | this.k;
        }

        public void c() {
            this.e = -1;
            this.h = -1;
        }

        public void d() {
            List<Object> list = this.l;
            if (list != null) {
                list.clear();
            }
            this.k &= -1025;
        }

        public void e() {
            this.k &= -33;
        }

        public void f() {
            this.k &= -257;
        }

        public final void g() {
            if (this.l == null) {
                ArrayList arrayList = new ArrayList();
                this.l = arrayList;
                this.m = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean h() {
            return (this.k & 16) == 0 && ac.S(this.b);
        }

        public void i(int i, int i2, boolean z) {
            b(8);
            C(i2, z);
            this.d = i;
        }

        public final int j() {
            RecyclerView recyclerView = this.s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int k() {
            return l();
        }

        public final int l() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.t == null || (recyclerView = this.s) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.s.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.d(this.t, this, adapterPositionInRecyclerView);
        }

        public final long m() {
            return this.f;
        }

        public final int n() {
            return this.g;
        }

        public final int o() {
            int i = this.h;
            return i == -1 ? this.d : i;
        }

        public final int p() {
            return this.e;
        }

        public List<Object> q() {
            if ((this.k & 1024) == 0) {
                List<Object> list = this.l;
                if (list != null && list.size() != 0) {
                    return this.m;
                }
                return u;
            }
            return u;
        }

        public boolean r(int i) {
            return (i & this.k) != 0;
        }

        public boolean s() {
            return (this.k & Barcode.UPC_A) != 0 || v();
        }

        public boolean t() {
            return (this.b.getParent() == null || this.b.getParent() == this.s) ? false : true;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.d + " id=" + this.f + ", oldPos=" + this.e + ", pLpos:" + this.h);
            if (y()) {
                sb.append(" scrap ");
                sb.append(this.p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (v()) {
                sb.append(" invalid");
            }
            if (!u()) {
                sb.append(" unbound");
            }
            if (B()) {
                sb.append(" update");
            }
            if (x()) {
                sb.append(" removed");
            }
            if (L()) {
                sb.append(" ignored");
            }
            if (z()) {
                sb.append(" tmpDetached");
            }
            if (!w()) {
                sb.append(" not recyclable(" + this.n + ")");
            }
            if (s()) {
                sb.append(" undefined adapter position");
            }
            if (this.b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u() {
            return (this.k & 1) != 0;
        }

        public boolean v() {
            return (this.k & 4) != 0;
        }

        public final boolean w() {
            return (this.k & 16) == 0 && !ac.S(this.b);
        }

        public boolean x() {
            return (this.k & 8) != 0;
        }

        public boolean y() {
            return this.o != null;
        }

        public boolean z() {
            return (this.k & Barcode.QR_CODE) != 0;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e implements wi.b {
        public e() {
        }

        @Override // defpackage.wi.b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // defpackage.wi.b
        public void b(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.D(RecyclerView.this);
            }
        }

        @Override // defpackage.wi.b
        public d0 c(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // defpackage.wi.b
        public void d(int i) {
            d0 childViewHolderInt;
            View a = a(i);
            if (a != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(a)) != null) {
                if (childViewHolderInt.z() && !childViewHolderInt.L()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.b(Barcode.QR_CODE);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // defpackage.wi.b
        public void e(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.E(RecyclerView.this);
            }
        }

        @Override // defpackage.wi.b
        public void f(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // defpackage.wi.b
        public int g() {
            return RecyclerView.this.getChildCount();
        }

        @Override // defpackage.wi.b
        public void h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // defpackage.wi.b
        public void i() {
            int g = g();
            for (int i = 0; i < g; i++) {
                View a = a(i);
                RecyclerView.this.dispatchChildDetached(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // defpackage.wi.b
        public void j(View view, int i, ViewGroup.LayoutParams layoutParams) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.z() && !childViewHolderInt.L()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.f();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // defpackage.wi.b
        public int k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f implements vi.a {
        public f() {
        }

        @Override // defpackage.vi.a
        public void a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // defpackage.vi.a
        public void b(vi.b bVar) {
            i(bVar);
        }

        @Override // defpackage.vi.a
        public d0 c(int i) {
            d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition == null || RecyclerView.this.mChildHelper.n(findViewHolderForPosition.b)) {
                return null;
            }
            return findViewHolderForPosition;
        }

        @Override // defpackage.vi.a
        public void d(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // defpackage.vi.a
        public void e(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // defpackage.vi.a
        public void f(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.d += i2;
        }

        @Override // defpackage.vi.a
        public void g(vi.b bVar) {
            i(bVar);
        }

        @Override // defpackage.vi.a
        public void h(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        public void i(vi.b bVar) {
            int i = bVar.a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.R0(recyclerView, bVar.b, bVar.d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.U0(recyclerView2, bVar.b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.W0(recyclerView3, bVar.b, bVar.d, bVar.c);
            } else if (i != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.T0(recyclerView4, bVar.b, bVar.d, 1);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.a.values().length];
            a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class h<VH extends d0> {
        public final i a = new i();
        public boolean b = false;
        public a c = a.ALLOW;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void a(VH vh, int i) {
            boolean z = vh.t == null;
            if (z) {
                vh.d = i;
                if (i()) {
                    vh.f = f(i);
                }
                vh.H(1, 519);
                ha.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.t = this;
            m(vh, i, vh.q());
            if (z) {
                vh.d();
                ViewGroup.LayoutParams layoutParams = vh.b.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).c = true;
                }
                ha.b();
            }
        }

        public boolean b() {
            int i = g.a[this.c.ordinal()];
            if (i != 1) {
                return i != 2 || e() > 0;
            }
            return false;
        }

        public final VH c(ViewGroup viewGroup, int i) {
            try {
                ha.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH n = n(viewGroup, i);
                if (n.b.getParent() == null) {
                    n.g = i;
                    return n;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                ha.b();
            }
        }

        public int d(h<? extends d0> hVar, d0 d0Var, int i) {
            if (hVar == this) {
                return i;
            }
            return -1;
        }

        public abstract int e();

        public long f(int i) {
            return -1L;
        }

        public int g(int i) {
            return 0;
        }

        public final boolean h() {
            return this.a.a();
        }

        public final boolean i() {
            return this.b;
        }

        public final void j() {
            this.a.b();
        }

        public void k(RecyclerView recyclerView) {
        }

        public abstract void l(VH vh, int i);

        public void m(VH vh, int i, List<Object> list) {
            l(vh, i);
        }

        public abstract VH n(ViewGroup viewGroup, int i);

        public void o(RecyclerView recyclerView) {
        }

        public boolean p(VH vh) {
            return false;
        }

        public void q(VH vh) {
        }

        public void r(VH vh) {
        }

        public void s(VH vh) {
        }

        public void t(j jVar) {
            this.a.registerObserver(jVar);
        }

        public void u(boolean z) {
            if (!h()) {
                this.b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void v(j jVar) {
            this.a.unregisterObserver(jVar);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class i extends Observable<j> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class j {
        public void a() {
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface k {
        int a(int i, int i2);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class l {
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class m {
        public b a = null;
        public ArrayList<a> b = new ArrayList<>();
        public long c = 120;
        public long d = 120;
        public long e = 250;
        public long f = 250;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public interface b {
            void a(d0 d0Var);
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static class c {
            public int a;
            public int b;

            public c a(d0 d0Var) {
                b(d0Var, 0);
                return this;
            }

            public c b(d0 d0Var, int i) {
                View view = d0Var.b;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        public static int e(d0 d0Var) {
            int i = d0Var.k & 14;
            if (d0Var.v()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int p = d0Var.p();
                int j = d0Var.j();
                return (p == -1 || j == -1 || p == j) ? i : i | Barcode.PDF417;
            }
            return i;
        }

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean d(d0 d0Var, c cVar, c cVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List<Object> list) {
            return f(d0Var);
        }

        public final void h(d0 d0Var) {
            r(d0Var);
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).a();
            }
            this.b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f;
        }

        public long n() {
            return this.e;
        }

        public long o() {
            return this.d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(d0 d0Var) {
        }

        public c s(a0 a0Var, d0 d0Var) {
            c q = q();
            q.a(d0Var);
            return q;
        }

        public c t(a0 a0Var, d0 d0Var, int i, List<Object> list) {
            c q = q();
            q.a(d0Var);
            return q;
        }

        public abstract void u();

        public void v(b bVar) {
            this.a = bVar;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class n implements m.b {
        public n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(d0 d0Var) {
            d0Var.I(true);
            if (d0Var.i != null && d0Var.j == null) {
                d0Var.i = null;
            }
            d0Var.j = null;
            if (d0Var.K() || RecyclerView.this.removeAnimatingView(d0Var.b) || !d0Var.z()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d0Var.b, false);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class p {
        public wi a;
        public RecyclerView b;
        public final jj.b c;
        public final jj.b d;
        public jj e;
        public jj f;
        public z g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public int m;
        public boolean n;
        public int o;
        public int p;
        public int q;
        public int r;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements jj.b {
            public a() {
            }

            @Override // defpackage.jj.b
            public View a(int i) {
                return p.this.I(i);
            }

            @Override // defpackage.jj.b
            public int b() {
                return p.this.o0() - p.this.f0();
            }

            @Override // defpackage.jj.b
            public int c(View view) {
                return p.this.Q(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // defpackage.jj.b
            public int d() {
                return p.this.e0();
            }

            @Override // defpackage.jj.b
            public int e(View view) {
                return p.this.T(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class b implements jj.b {
            public b() {
            }

            @Override // defpackage.jj.b
            public View a(int i) {
                return p.this.I(i);
            }

            @Override // defpackage.jj.b
            public int b() {
                return p.this.W() - p.this.d0();
            }

            @Override // defpackage.jj.b
            public int c(View view) {
                return p.this.U(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // defpackage.jj.b
            public int d() {
                return p.this.g0();
            }

            @Override // defpackage.jj.b
            public int e(View view) {
                return p.this.O(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public interface c {
            void a(int i, int i2);
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public p() {
            a aVar = new a();
            this.c = aVar;
            b bVar = new b();
            this.d = bVar;
            this.e = new jj(aVar);
            this.f = new jj(bVar);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.K(int, int, int, int, boolean):int");
        }

        public static d i0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ui.RecyclerView, i, i2);
            dVar.a = obtainStyledAttributes.getInt(ui.RecyclerView_android_orientation, 1);
            dVar.b = obtainStyledAttributes.getInt(ui.RecyclerView_spanCount, 1);
            dVar.c = obtainStyledAttributes.getBoolean(ui.RecyclerView_reverseLayout, false);
            dVar.d = obtainStyledAttributes.getBoolean(ui.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public static boolean w0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        public void A(RecyclerView recyclerView, w wVar) {
            this.i = false;
            I0(recyclerView, wVar);
        }

        public void A0(View view, int i, int i2) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.b.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int K = K(o0(), p0(), e0() + f0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) qVar).width, k());
            int K2 = K(W(), X(), g0() + d0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) qVar).height, l());
            if (G1(view, K, K2, qVar)) {
                view.measure(K, K2);
            }
        }

        public void A1(RecyclerView recyclerView) {
            B1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), CommonUtils.BYTES_IN_A_GIGABYTE));
        }

        public View B(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.a.n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public void B0(int i, int i2) {
            View I = I(i);
            if (I != null) {
                x(i);
                h(I, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.b.toString());
        }

        public void B1(int i, int i2) {
            this.q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.p = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.r = 0;
        }

        public View C(int i) {
            int J = J();
            for (int i2 = 0; i2 < J; i2++) {
                View I = I(i2);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(I);
                if (childViewHolderInt != null && childViewHolderInt.o() == i && !childViewHolderInt.L() && (this.b.mState.e() || !childViewHolderInt.x())) {
                    return I;
                }
            }
            return null;
        }

        public void C0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void C1(int i, int i2) {
            this.b.setMeasuredDimension(i, i2);
        }

        public abstract q D();

        public void D0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void D1(Rect rect, int i, int i2) {
            C1(n(i, rect.width() + e0() + f0(), c0()), n(i2, rect.height() + g0() + d0(), b0()));
        }

        public q E(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void E0(h hVar, h hVar2) {
        }

        public void E1(int i, int i2) {
            int J = J();
            if (J == 0) {
                this.b.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = RecyclerView.UNDEFINED_DURATION;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < J; i7++) {
                View I = I(i7);
                Rect rect = this.b.mTempRect;
                P(I, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.b.mTempRect.set(i4, i5, i3, i6);
            D1(this.b.mTempRect, i, i2);
        }

        public q F(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new q(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public void F1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.mChildHelper;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.o = CommonUtils.BYTES_IN_A_GIGABYTE;
            this.p = CommonUtils.BYTES_IN_A_GIGABYTE;
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        public boolean G1(View view, int i, int i2, q qVar) {
            return (!view.isLayoutRequested() && this.k && w0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && w0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int H(View view) {
            return ((q) view.getLayoutParams()).b.bottom;
        }

        @Deprecated
        public void H0(RecyclerView recyclerView) {
        }

        public boolean H1() {
            return false;
        }

        public View I(int i) {
            wi wiVar = this.a;
            if (wiVar != null) {
                return wiVar.f(i);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, w wVar) {
            H0(recyclerView);
        }

        public boolean I1(View view, int i, int i2, q qVar) {
            return (this.k && w0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && w0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int J() {
            wi wiVar = this.a;
            if (wiVar != null) {
                return wiVar.g();
            }
            return 0;
        }

        public View J0(View view, int i, w wVar, a0 a0Var) {
            return null;
        }

        public void J1(RecyclerView recyclerView, a0 a0Var, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            L0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void K1(z zVar) {
            z zVar2 = this.g;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.g.r();
            }
            this.g = zVar;
            zVar.q(this.b, this);
        }

        public final int[] L(View view, Rect rect) {
            int[] iArr = new int[2];
            int e0 = e0();
            int g0 = g0();
            int o0 = o0() - f0();
            int W = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - e0;
            int min = Math.min(0, i);
            int i2 = top - g0;
            int min2 = Math.min(0, i2);
            int i3 = width - o0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - W);
            if (Z() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public void L0(w wVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            h hVar = this.b.mAdapter;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.e());
            }
        }

        public void L1() {
            z zVar = this.g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public boolean M() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public void M0(lc lcVar) {
            RecyclerView recyclerView = this.b;
            N0(recyclerView.mRecycler, recyclerView.mState, lcVar);
        }

        public boolean M1() {
            return false;
        }

        public int N(w wVar, a0 a0Var) {
            return -1;
        }

        public void N0(w wVar, a0 a0Var, lc lcVar) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                lcVar.a(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                lcVar.u0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                lcVar.a(Barcode.AZTEC);
                lcVar.u0(true);
            }
            lcVar.c0(lc.b.b(k0(wVar, a0Var), N(wVar, a0Var), v0(wVar, a0Var), l0(wVar, a0Var)));
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        public void O0(View view, lc lcVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.x() || this.a.n(childViewHolderInt.b)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            P0(recyclerView.mRecycler, recyclerView.mState, view, lcVar);
        }

        public void P(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public void P0(w wVar, a0 a0Var, View view, lc lcVar) {
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i, int i2) {
        }

        public int S(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i, int i2) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i, int i2) {
        }

        public int W() {
            return this.r;
        }

        public void W0(RecyclerView recyclerView, int i, int i2, Object obj) {
            V0(recyclerView, i, i2);
        }

        public int X() {
            return this.p;
        }

        public void X0(w wVar, a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int Y() {
            RecyclerView recyclerView = this.b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public void Y0(a0 a0Var) {
        }

        public int Z() {
            return ac.C(this.b);
        }

        public void Z0(w wVar, a0 a0Var, int i, int i2) {
            this.b.defaultOnMeasure(i, i2);
        }

        public int a0(View view) {
            return ((q) view.getLayoutParams()).b.left;
        }

        @Deprecated
        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            return x0() || recyclerView.isComputingLayout();
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return ac.D(this.b);
        }

        public boolean b1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i) {
            f(view, i, true);
        }

        public int c0() {
            return ac.E(this.b);
        }

        public void c1(Parcelable parcelable) {
        }

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable d1() {
            return null;
        }

        public void e(View view, int i) {
            f(view, i, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i) {
        }

        public final void f(View view, int i, boolean z) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z && !childViewHolderInt.x()) {
                this.b.mViewInfoStore.p(childViewHolderInt);
            } else {
                this.b.mViewInfoStore.b(childViewHolderInt);
            }
            q qVar = (q) view.getLayoutParams();
            if (!childViewHolderInt.N() && !childViewHolderInt.y()) {
                if (view.getParent() == this.b) {
                    int m = this.a.m(view);
                    if (i == -1) {
                        i = this.a.g();
                    }
                    if (m == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.exceptionLabel());
                    } else if (m != i) {
                        this.b.mLayout.B0(m, i);
                    }
                } else {
                    this.a.a(view, i, false);
                    qVar.c = true;
                    z zVar = this.g;
                    if (zVar != null && zVar.h()) {
                        this.g.k(view);
                    }
                }
            } else {
                if (childViewHolderInt.y()) {
                    childViewHolderInt.M();
                } else {
                    childViewHolderInt.e();
                }
                this.a.c(view, i, view.getLayoutParams(), false);
            }
            if (qVar.d) {
                childViewHolderInt.b.invalidate();
                qVar.d = false;
            }
        }

        public int f0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void f1(z zVar) {
            if (this.g == zVar) {
                this.g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean g1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return h1(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public void h(View view, int i) {
            i(view, i, (q) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean h1(w wVar, a0 a0Var, int i, Bundle bundle) {
            int W;
            int o0;
            int i2;
            int i3;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                W = recyclerView.canScrollVertically(1) ? (W() - g0()) - d0() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    o0 = (o0() - e0()) - f0();
                    i2 = W;
                    i3 = o0;
                }
                i2 = W;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                W = recyclerView.canScrollVertically(-1) ? -((W() - g0()) - d0()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    o0 = -((o0() - e0()) - f0());
                    i2 = W;
                    i3 = o0;
                }
                i2 = W;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.b.smoothScrollBy(i3, i2, null, RecyclerView.UNDEFINED_DURATION, true);
            return true;
        }

        public void i(View view, int i, q qVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.x()) {
                this.b.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.b.mViewInfoStore.p(childViewHolderInt);
            }
            this.a.c(view, i, qVar, childViewHolderInt.x());
        }

        public boolean i1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return j1(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public int j0(View view) {
            return ((q) view.getLayoutParams()).b.right;
        }

        public boolean j1(w wVar, a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        public boolean k() {
            return false;
        }

        public int k0(w wVar, a0 a0Var) {
            return -1;
        }

        public void k1(w wVar) {
            for (int J = J() - 1; J >= 0; J--) {
                if (!RecyclerView.getChildViewHolderInt(I(J)).L()) {
                    n1(J, wVar);
                }
            }
        }

        public boolean l() {
            return false;
        }

        public int l0(w wVar, a0 a0Var) {
            return 0;
        }

        public void l1(w wVar) {
            int j = wVar.j();
            for (int i = j - 1; i >= 0; i--) {
                View n = wVar.n(i);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(n);
                if (!childViewHolderInt.L()) {
                    childViewHolderInt.I(false);
                    if (childViewHolderInt.z()) {
                        this.b.removeDetachedView(n, false);
                    }
                    m mVar = this.b.mItemAnimator;
                    if (mVar != null) {
                        mVar.j(childViewHolderInt);
                    }
                    childViewHolderInt.I(true);
                    wVar.y(n);
                }
            }
            wVar.e();
            if (j > 0) {
                this.b.invalidate();
            }
        }

        public boolean m(q qVar) {
            return qVar != null;
        }

        public int m0(View view) {
            return ((q) view.getLayoutParams()).b.top;
        }

        public void m1(View view, w wVar) {
            p1(view);
            wVar.B(view);
        }

        public void n0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((q) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i, w wVar) {
            View I = I(i);
            q1(i);
            wVar.B(I);
        }

        public void o(int i, int i2, a0 a0Var, c cVar) {
        }

        public int o0() {
            return this.q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i, c cVar) {
        }

        public int p0() {
            return this.o;
        }

        public void p1(View view) {
            this.a.p(view);
        }

        public int q(a0 a0Var) {
            return 0;
        }

        public boolean q0() {
            int J = J();
            for (int i = 0; i < J; i++) {
                ViewGroup.LayoutParams layoutParams = I(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i) {
            if (I(i) != null) {
                this.a.q(i);
            }
        }

        public int r(a0 a0Var) {
            return 0;
        }

        public boolean r0() {
            return this.i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return s1(recyclerView, view, rect, z, false);
        }

        public int s(a0 a0Var) {
            return 0;
        }

        public boolean s0() {
            return this.j;
        }

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] L = L(view, rect);
            int i = L[0];
            int i2 = L[1];
            if ((!z2 || t0(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.smoothScrollBy(i, i2);
                }
                return true;
            }
            return false;
        }

        public int t(a0 a0Var) {
            return 0;
        }

        public final boolean t0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e0 = e0();
            int g0 = g0();
            int o0 = o0() - f0();
            int W = W() - d0();
            Rect rect = this.b.mTempRect;
            P(focusedChild, rect);
            return rect.left - i < o0 && rect.right - i > e0 && rect.top - i2 < W && rect.bottom - i2 > g0;
        }

        public void t1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int u(a0 a0Var) {
            return 0;
        }

        public final boolean u0() {
            return this.l;
        }

        public void u1() {
            this.h = true;
        }

        public int v(a0 a0Var) {
            return 0;
        }

        public boolean v0(w wVar, a0 a0Var) {
            return false;
        }

        public final void v1(w wVar, int i, View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.L()) {
                return;
            }
            if (childViewHolderInt.v() && !childViewHolderInt.x() && !this.b.mAdapter.i()) {
                q1(i);
                wVar.C(childViewHolderInt);
                return;
            }
            x(i);
            wVar.D(view);
            this.b.mViewInfoStore.k(childViewHolderInt);
        }

        public void w(w wVar) {
            for (int J = J() - 1; J >= 0; J--) {
                v1(wVar, J, I(J));
            }
        }

        public int w1(int i, w wVar, a0 a0Var) {
            return 0;
        }

        public void x(int i) {
            y(i, I(i));
        }

        public boolean x0() {
            z zVar = this.g;
            return zVar != null && zVar.h();
        }

        public void x1(int i) {
        }

        public final void y(int i, View view) {
            this.a.d(i);
        }

        public boolean y0(View view, boolean z, boolean z2) {
            boolean z3 = this.e.b(view, 24579) && this.f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public int y1(int i, w wVar, a0 a0Var) {
            return 0;
        }

        public void z(RecyclerView recyclerView) {
            this.i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i, int i2, int i3, int i4) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        @Deprecated
        public void z1(boolean z) {
            this.j = z;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface r {
        void a(View view);

        void b(View view);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class s {
        public abstract boolean a(int i, int i2);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface t {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class u {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class v {
        public SparseArray<a> a = new SparseArray<>();
        public int b = 0;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static class a {
            public final ArrayList<d0> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public void a() {
            this.b++;
        }

        public void b() {
            for (int i = 0; i < this.a.size(); i++) {
                this.a.valueAt(i).a.clear();
            }
        }

        public void c() {
            this.b--;
        }

        public void d(int i, long j) {
            a g = g(i);
            g.d = j(g.d, j);
        }

        public void e(int i, long j) {
            a g = g(i);
            g.c = j(g.c, j);
        }

        public d0 f(int i) {
            a aVar = this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).t()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public final a g(int i) {
            a aVar = this.a.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                this.a.put(i, aVar2);
                return aVar2;
            }
            return aVar;
        }

        public void h(h hVar, h hVar2, boolean z) {
            if (hVar != null) {
                c();
            }
            if (!z && this.b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int n = d0Var.n();
            ArrayList<d0> arrayList = g(n).a;
            if (this.a.get(n).b <= arrayList.size()) {
                return;
            }
            d0Var.F();
            arrayList.add(d0Var);
        }

        public long j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public boolean k(int i, long j, long j2) {
            long j3 = g(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        public boolean l(int i, long j, long j2) {
            long j3 = g(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class w {
        public final ArrayList<d0> a;
        public ArrayList<d0> b;
        public final ArrayList<d0> c;
        public final List<d0> d;
        public int e;
        public int f;
        public v g;
        public b0 h;

        public w() {
            ArrayList<d0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public void A(int i) {
            a(this.c.get(i), true);
            this.c.remove(i);
        }

        public void B(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.z()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.y()) {
                childViewHolderInt.M();
            } else if (childViewHolderInt.N()) {
                childViewHolderInt.e();
            }
            C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.w()) {
                return;
            }
            RecyclerView.this.mItemAnimator.j(childViewHolderInt);
        }

        public void C(d0 d0Var) {
            boolean z;
            boolean z2 = true;
            if (!d0Var.y() && d0Var.b.getParent() == null) {
                if (!d0Var.z()) {
                    if (!d0Var.L()) {
                        boolean h = d0Var.h();
                        h hVar = RecyclerView.this.mAdapter;
                        if ((hVar != null && h && hVar.p(d0Var)) || d0Var.w()) {
                            if (this.f <= 0 || d0Var.r(526)) {
                                z = false;
                            } else {
                                int size = this.c.size();
                                if (size >= this.f && size > 0) {
                                    A(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(d0Var.d)) {
                                    int i = size - 1;
                                    while (i >= 0) {
                                        if (!RecyclerView.this.mPrefetchRegistry.d(this.c.get(i).d)) {
                                            break;
                                        }
                                        i--;
                                    }
                                    size = i + 1;
                                }
                                this.c.add(size, d0Var);
                                z = true;
                            }
                            if (z) {
                                z2 = false;
                            } else {
                                a(d0Var, true);
                            }
                            r1 = z;
                        } else {
                            z2 = false;
                        }
                        RecyclerView.this.mViewInfoStore.q(d0Var);
                        if (r1 || z2 || !h) {
                            return;
                        }
                        d0Var.t = null;
                        d0Var.s = null;
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.exceptionLabel());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(d0Var.y());
            sb.append(" isAttached:");
            sb.append(d0Var.b.getParent() != null);
            sb.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }

        public void D(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.r(12) && childViewHolderInt.A() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                childViewHolderInt.J(this, true);
                this.b.add(childViewHolderInt);
            } else if (childViewHolderInt.v() && !childViewHolderInt.x() && !RecyclerView.this.mAdapter.i()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            } else {
                childViewHolderInt.J(this, false);
                this.a.add(childViewHolderInt);
            }
        }

        public void E(v vVar) {
            v vVar2 = this.g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.g.a();
        }

        public void F(b0 b0Var) {
        }

        public void G(int i) {
            this.e = i;
            K();
        }

        public final boolean H(d0 d0Var, int i, int i2, long j) {
            d0Var.t = null;
            d0Var.s = RecyclerView.this;
            int n = d0Var.n();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j == RecyclerView.FOREVER_NS || this.g.k(n, nanoTime, j)) {
                RecyclerView.this.mAdapter.a(d0Var, i);
                this.g.d(d0Var.n(), RecyclerView.this.getNanoTime() - nanoTime);
                b(d0Var);
                if (RecyclerView.this.mState.e()) {
                    d0Var.h = i2;
                    return true;
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0228 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 615
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        public void J(d0 d0Var) {
            if (d0Var.p) {
                this.b.remove(d0Var);
            } else {
                this.a.remove(d0Var);
            }
            d0Var.o = null;
            d0Var.p = false;
            d0Var.e();
        }

        public void K() {
            p pVar = RecyclerView.this.mLayout;
            this.f = this.e + (pVar != null ? pVar.m : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                A(size);
            }
        }

        public boolean L(d0 d0Var) {
            if (d0Var.x()) {
                return RecyclerView.this.mState.e();
            }
            int i = d0Var.d;
            if (i >= 0 && i < RecyclerView.this.mAdapter.e()) {
                if (RecyclerView.this.mState.e() || RecyclerView.this.mAdapter.g(d0Var.d) == d0Var.n()) {
                    return !RecyclerView.this.mAdapter.i() || d0Var.m() == RecyclerView.this.mAdapter.f(d0Var.d);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.exceptionLabel());
        }

        public void M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.c.get(size);
                if (d0Var != null && (i3 = d0Var.d) >= i && i3 < i4) {
                    d0Var.b(2);
                    A(size);
                }
            }
        }

        public void a(d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.b;
            fj fjVar = RecyclerView.this.mAccessibilityDelegate;
            if (fjVar != null) {
                eb n = fjVar.n();
                ac.q0(view, n instanceof fj.a ? ((fj.a) n).n(view) : null);
            }
            if (z) {
                g(d0Var);
            }
            d0Var.t = null;
            d0Var.s = null;
            i().i(d0Var);
        }

        public final void b(d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.b;
                if (ac.A(view) == 0) {
                    ac.B0(view, 1);
                }
                fj fjVar = RecyclerView.this.mAccessibilityDelegate;
                if (fjVar == null) {
                    return;
                }
                eb n = fjVar.n();
                if (n instanceof fj.a) {
                    ((fj.a) n).o(view);
                }
                ac.q0(view, n);
            }
        }

        public void c() {
            this.a.clear();
            z();
        }

        public void d() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                this.c.get(i).c();
            }
            int size2 = this.a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.a.get(i2).c();
            }
            ArrayList<d0> arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.b.get(i3).c();
                }
            }
        }

        public void e() {
            this.a.clear();
            ArrayList<d0> arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.b()) {
                return !RecyclerView.this.mState.e() ? i : RecyclerView.this.mAdapterHelper.m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
        }

        public void g(d0 d0Var) {
            x xVar = RecyclerView.this.mRecyclerListener;
            if (xVar != null) {
                xVar.a(d0Var);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.mRecyclerListeners.get(i).a(d0Var);
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar != null) {
                hVar.s(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(d0Var);
            }
        }

        public d0 h(int i) {
            int size;
            int m;
            ArrayList<d0> arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    d0 d0Var = this.b.get(i2);
                    if (!d0Var.N() && d0Var.o() == i) {
                        d0Var.b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.i() && (m = RecyclerView.this.mAdapterHelper.m(i)) > 0 && m < RecyclerView.this.mAdapter.e()) {
                    long f = RecyclerView.this.mAdapter.f(m);
                    for (int i3 = 0; i3 < size; i3++) {
                        d0 d0Var2 = this.b.get(i3);
                        if (!d0Var2.N() && d0Var2.m() == f) {
                            d0Var2.b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public v i() {
            if (this.g == null) {
                this.g = new v();
            }
            return this.g;
        }

        public int j() {
            return this.a.size();
        }

        public List<d0> k() {
            return this.d;
        }

        public d0 l(long j, int i, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.a.get(size);
                if (d0Var.m() == j && !d0Var.N()) {
                    if (i == d0Var.n()) {
                        d0Var.b(32);
                        if (d0Var.x() && !RecyclerView.this.mState.e()) {
                            d0Var.H(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.b, false);
                        y(d0Var.b);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = this.c.get(size2);
                if (d0Var2.m() == j && !d0Var2.t()) {
                    if (i == d0Var2.n()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public d0 m(int i, boolean z) {
            View e;
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                d0 d0Var = this.a.get(i2);
                if (!d0Var.N() && d0Var.o() == i && !d0Var.v() && (RecyclerView.this.mState.h || !d0Var.x())) {
                    d0Var.b(32);
                    return d0Var;
                }
            }
            if (!z && (e = RecyclerView.this.mChildHelper.e(i)) != null) {
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e);
                RecyclerView.this.mChildHelper.s(e);
                int m = RecyclerView.this.mChildHelper.m(e);
                if (m != -1) {
                    RecyclerView.this.mChildHelper.d(m);
                    D(e);
                    childViewHolderInt.b(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                d0 d0Var2 = this.c.get(i3);
                if (!d0Var2.v() && d0Var2.o() == i && !d0Var2.t()) {
                    if (!z) {
                        this.c.remove(i3);
                    }
                    return d0Var2;
                }
            }
            return null;
        }

        public View n(int i) {
            return this.a.get(i).b;
        }

        public View o(int i) {
            return p(i, false);
        }

        public View p(int i, boolean z) {
            return I(i, z, RecyclerView.FOREVER_NS).b;
        }

        public final void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public final void r(d0 d0Var) {
            View view = d0Var.b;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                q qVar = (q) this.c.get(i).b.getLayoutParams();
                if (qVar != null) {
                    qVar.c = true;
                }
            }
        }

        public void t() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                d0 d0Var = this.c.get(i);
                if (d0Var != null) {
                    d0Var.b(6);
                    d0Var.a(null);
                }
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar == null || !hVar.i()) {
                z();
            }
        }

        public void u(int i, int i2) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                d0 d0Var = this.c.get(i3);
                if (d0Var != null && d0Var.d >= i) {
                    d0Var.C(i2, false);
                }
            }
        }

        public void v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.c.size();
            for (int i7 = 0; i7 < size; i7++) {
                d0 d0Var = this.c.get(i7);
                if (d0Var != null && (i6 = d0Var.d) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        d0Var.C(i2 - i, false);
                    } else {
                        d0Var.C(i3, false);
                    }
                }
            }
        }

        public void w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.d;
                    if (i4 >= i3) {
                        d0Var.C(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        public void x(h hVar, h hVar2, boolean z) {
            c();
            i().h(hVar, hVar2, z);
        }

        public void y(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.o = null;
            childViewHolderInt.p = false;
            childViewHolderInt.e();
            C(childViewHolderInt);
        }

        public void z() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface x {
        void a(d0 d0Var);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class y extends j {
        public y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class z {
        public RecyclerView b;
        public p c;
        public boolean d;
        public boolean e;
        public View f;
        public boolean h;
        public int a = -1;
        public final a g = new a(0, 0);

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static class a {
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public a(int i, int i2) {
                this(i, i2, RecyclerView.UNDEFINED_DURATION, null);
            }

            public boolean a() {
                return this.d >= 0;
            }

            public void b(int i) {
                this.d = i;
            }

            public void c(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f = false;
                } else if (this.f) {
                    e();
                    recyclerView.mViewFlinger.e(this.a, this.b, this.c, this.e);
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                } else {
                    this.g = 0;
                }
            }

            public void d(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }

            public final void e() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
            }
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i);
        }

        public PointF a(int i) {
            p e = e();
            if (e instanceof b) {
                return ((b) e).a(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i) {
            return this.b.mLayout.C(i);
        }

        public int c() {
            return this.b.mLayout.J();
        }

        public int d(View view) {
            return this.b.getChildLayoutPosition(view);
        }

        public p e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public boolean g() {
            return this.d;
        }

        public boolean h() {
            return this.e;
        }

        public void i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void j(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                r();
            }
            if (this.d && this.f == null && this.c != null && (a2 = a(this.a)) != null) {
                float f = a2.x;
                if (f != 0.0f || a2.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(a2.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (d(view) == this.a) {
                    o(this.f, recyclerView.mState, this.g);
                    this.g.c(recyclerView);
                    r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                l(i, i2, recyclerView.mState, this.g);
                boolean a3 = this.g.a();
                this.g.c(recyclerView);
                if (a3 && this.e) {
                    this.d = true;
                    recyclerView.mViewFlinger.d();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f = view;
            }
        }

        public abstract void l(int i, int i2, a0 a0Var, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i) {
            this.a = i;
        }

        public void q(RecyclerView recyclerView, p pVar) {
            recyclerView.mViewFlinger.f();
            if (this.h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.b = recyclerView;
            this.c = pVar;
            int i = this.a;
            if (i != -1) {
                recyclerView.mState.a = i;
                this.e = true;
                this.d = true;
                this.f = b(f());
                m();
                this.b.mViewFlinger.d();
                this.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void r() {
            if (this.e) {
                this.e = false;
                n();
                this.b.mState.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.c.f1(this);
                this.c = null;
                this.b = null;
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i2 == 18 || i2 == 19 || i2 == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i2 >= 23;
        POST_UPDATES_ON_ANIMATION = i2 >= 16;
        ALLOW_THREAD_GAP_WORK = i2 >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = i2 <= 15;
        IGNORE_DETACHED_FOCUSED_CHILD = i2 <= 15;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(d0 d0Var) {
        View view = d0Var.b;
        boolean z2 = view.getParent() == this;
        this.mRecycler.J(getChildViewHolder(view));
        if (d0Var.z()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.mChildHelper.b(view, true);
        } else {
            this.mChildHelper.k(view);
        }
    }

    private void animateChange(d0 d0Var, d0 d0Var2, m.c cVar, m.c cVar2, boolean z2, boolean z3) {
        d0Var.I(false);
        if (z2) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z3) {
                addAnimatingView(d0Var2);
            }
            d0Var.i = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.J(d0Var);
            d0Var2.I(false);
            d0Var2.j = d0Var;
        }
        if (this.mItemAnimator.b(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.c;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == d0Var.b) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            d0Var.c = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(p.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e8);
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(Barcode.PDF417);
        kc.b(obtain, i2);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        boolean z2 = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        a0 a0Var = this.mState;
        a0Var.i = (a0Var.k && this.mItemsChanged) ? false : false;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0Var.h = a0Var.l;
        a0Var.f = this.mAdapter.e();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.k) {
            int g2 = this.mChildHelper.g();
            for (int i2 = 0; i2 < g2; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
                if (!childViewHolderInt.L() && (!childViewHolderInt.v() || this.mAdapter.i())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.t(this.mState, childViewHolderInt, m.e(childViewHolderInt), childViewHolderInt.q()));
                    if (this.mState.i && childViewHolderInt.A() && !childViewHolderInt.x() && !childViewHolderInt.L() && !childViewHolderInt.v()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.l) {
            saveOldPositions();
            a0 a0Var2 = this.mState;
            boolean z3 = a0Var2.g;
            a0Var2.g = false;
            this.mLayout.X0(this.mRecycler, a0Var2);
            this.mState.g = z3;
            for (int i3 = 0; i3 < this.mChildHelper.g(); i3++) {
                d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i3));
                if (!childViewHolderInt2.L() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int e2 = m.e(childViewHolderInt2);
                    boolean r2 = childViewHolderInt2.r(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                    if (!r2) {
                        e2 |= Barcode.AZTEC;
                    }
                    m.c t2 = this.mItemAnimator.t(this.mState, childViewHolderInt2, e2, childViewHolderInt2.q());
                    if (r2) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, t2);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, t2);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.j();
        this.mState.f = this.mAdapter.e();
        this.mState.d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.b()) {
            Parcelable parcelable = this.mPendingSavedState.d;
            if (parcelable != null) {
                this.mLayout.c1(parcelable);
            }
            this.mPendingSavedState = null;
        }
        a0 a0Var = this.mState;
        a0Var.h = false;
        this.mLayout.X0(this.mRecycler, a0Var);
        a0 a0Var2 = this.mState;
        a0Var2.g = false;
        a0Var2.k = a0Var2.k && this.mItemAnimator != null;
        a0Var2.e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a0 a0Var = this.mState;
        a0Var.e = 1;
        if (a0Var.k) {
            for (int g2 = this.mChildHelper.g() - 1; g2 >= 0; g2--) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(g2));
                if (!childViewHolderInt.L()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    m.c s2 = this.mItemAnimator.s(this.mState, childViewHolderInt);
                    d0 g3 = this.mViewInfoStore.g(changedHolderKey);
                    if (g3 != null && !g3.L()) {
                        boolean h2 = this.mViewInfoStore.h(g3);
                        boolean h3 = this.mViewInfoStore.h(childViewHolderInt);
                        if (h2 && g3 == childViewHolderInt) {
                            this.mViewInfoStore.d(childViewHolderInt, s2);
                        } else {
                            m.c n2 = this.mViewInfoStore.n(g3);
                            this.mViewInfoStore.d(childViewHolderInt, s2);
                            m.c m2 = this.mViewInfoStore.m(childViewHolderInt);
                            if (n2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g3);
                            } else {
                                animateChange(g3, childViewHolderInt, n2, m2, h2, h3);
                            }
                        }
                    } else {
                        this.mViewInfoStore.d(childViewHolderInt, s2);
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.l1(this.mRecycler);
        a0 a0Var2 = this.mState;
        a0Var2.c = a0Var2.f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.k = false;
        a0Var2.l = false;
        this.mLayout.h = false;
        ArrayList<d0> arrayList = this.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.mLayout;
        if (pVar.n) {
            pVar.m = 0;
            pVar.n = false;
            this.mRecycler.K();
        }
        this.mLayout.Y0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        t tVar = this.mInterceptingOnItemTouchListener;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        tVar.b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = this.mOnItemTouchListeners.get(i2);
            if (tVar.a(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = tVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g2 = this.mChildHelper.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i3 = UNDEFINED_DURATION;
        for (int i4 = 0; i4 < g2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i4));
            if (!childViewHolderInt.L()) {
                int o2 = childViewHolderInt.o();
                if (o2 < i2) {
                    i2 = o2;
                }
                if (o2 > i3) {
                    i3 = o2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
                if (findNestedRecyclerView != null) {
                    return findNestedRecyclerView;
                }
            }
            return null;
        }
        return null;
    }

    private View findNextViewToFocus() {
        d0 findViewHolderForAdapterPosition;
        a0 a0Var = this.mState;
        int i2 = a0Var.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = a0Var.b();
        for (int i3 = i2; i3 < b2; i3++) {
            d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.b.hasFocusable()) {
                return findViewHolderForAdapterPosition2.b;
            }
        }
        int min = Math.min(b2, i2);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.b.hasFocusable()) {
                return findViewHolderForAdapterPosition.b;
            }
        }
    }

    public static d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private pb getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new pb(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, d0 d0Var, d0 d0Var2) {
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                h hVar = this.mAdapter;
                if (hVar != null && hVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
            if (childViewHolderInt != null && !childViewHolderInt.L() && childViewHolderInt.A()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (ac.B(this) == 0) {
            ac.C0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new wi(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i4 = this.mLayout.Z() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 < 0);
        } else if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 > 0);
        } else if (i2 == 17) {
            return i3 < 0;
        } else if (i2 == 33) {
            return c2 < 0;
        } else if (i2 == 66) {
            return i3 > 0;
        } else if (i2 == 130) {
            return c2 > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i2 + exceptionLabel());
        }
    }

    private void nestedScrollByInternal(int i2, int i3, MotionEvent motionEvent, int i4) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean k2 = pVar.k();
            boolean l2 = this.mLayout.l();
            int i5 = k2 ? 1 : 0;
            if (l2) {
                i5 |= 2;
            }
            startNestedScroll(i5, i4);
            if (dispatchNestedPreScroll(k2 ? i2 : 0, l2 ? i3 : 0, this.mReusableIntPair, this.mScrollOffset, i4)) {
                int[] iArr2 = this.mReusableIntPair;
                i2 -= iArr2[0];
                i3 -= iArr2[1];
            }
            scrollByInternal(k2 ? i2 : 0, l2 ? i3 : 0, motionEvent, i4);
            zi ziVar = this.mGapWorker;
            if (ziVar != null && (i2 != 0 || i3 != 0)) {
                ziVar.f(this, i2, i3);
            }
            stopNestedScroll(i4);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.M1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z2;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.u();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.S0(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.s();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z3 = false;
        boolean z4 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z2 = this.mDataSetHasChangedAfterLayout) || z4 || this.mLayout.h) && (!z2 || this.mAdapter.i());
        a0 a0Var = this.mState;
        if (a0Var.k && z4 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z3 = true;
        }
        a0Var.l = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            defpackage.vc.a(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            defpackage.vc.a(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            defpackage.vc.a(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            defpackage.vc.a(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            defpackage.ac.h0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.mChildHelper.g() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.mChildHelper.n(focusedChild)) {
                return;
            }
        }
        View view = null;
        d0 findViewHolderForItemId = (this.mState.n == -1 || !this.mAdapter.i()) ? null : findViewHolderForItemId(this.mState.n);
        if (findViewHolderForItemId != null && !this.mChildHelper.n(findViewHolderForItemId.b) && findViewHolderForItemId.b.hasFocusable()) {
            view = findViewHolderForItemId.b;
        } else if (this.mChildHelper.g() > 0) {
            view = findNextViewToFocus();
        }
        if (view != null) {
            int i2 = this.mState.o;
            if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            ac.h0(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.c) {
                Rect rect = qVar.b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.s1(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        a0 a0Var = this.mState;
        a0Var.n = -1L;
        a0Var.m = -1;
        a0Var.o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int j2;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        d0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.n = this.mAdapter.i() ? findContainingViewHolder.m() : -1L;
        a0 a0Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            j2 = -1;
        } else {
            j2 = findContainingViewHolder.x() ? findContainingViewHolder.e : findContainingViewHolder.j();
        }
        a0Var.m = j2;
        this.mState.o = getDeepestFocusedViewWithId(findContainingViewHolder.b);
    }

    private void setAdapterInternal(h hVar, boolean z2, boolean z3) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.v(this.mObserver);
            this.mAdapter.o(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.u();
        h hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.t(this.mObserver);
            hVar.k(this);
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.E0(hVar3, this.mAdapter);
        }
        this.mRecycler.x(hVar3, this.mAdapter, z2);
        this.mState.g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.f();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.L1();
        }
    }

    public void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        ac.h0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.F0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addItemDecoration(o oVar, int i2) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(oVar);
        } else {
            this.mItemDecorations.add(i2, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(uVar);
    }

    public void addRecyclerListener(x xVar) {
        db.a(xVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(xVar);
    }

    public void animateAppearance(d0 d0Var, m.c cVar, m.c cVar2) {
        d0Var.I(false);
        if (this.mItemAnimator.a(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(d0 d0Var, m.c cVar, m.c cVar2) {
        addAnimatingView(d0Var);
        d0Var.I(false);
        if (this.mItemAnimator.c(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    public boolean canReuseUpdatedViewHolder(d0 d0Var) {
        m mVar = this.mItemAnimator;
        return mVar == null || mVar.g(d0Var, d0Var.q());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.mLayout.m((q) layoutParams);
    }

    public void clearOldPositions() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (!childViewHolderInt.L()) {
                childViewHolderInt.c();
            }
        }
        this.mRecycler.d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.k()) {
            return this.mLayout.q(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.k()) {
            return this.mLayout.r(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.k()) {
            return this.mLayout.s(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.l()) {
            return this.mLayout.t(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.l()) {
            return this.mLayout.u(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.l()) {
            return this.mLayout.v(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            ac.h0(this);
        }
    }

    public void consumePendingUpdateOperations() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (this.mAdapterHelper.p()) {
                if (this.mAdapterHelper.o(4) && !this.mAdapterHelper.o(11)) {
                    ha.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.s();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.i();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    ha.b();
                    return;
                } else if (this.mAdapterHelper.p()) {
                    ha.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    ha.b();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        ha.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        ha.b();
    }

    public void defaultOnMeasure(int i2, int i3) {
        setMeasuredDimension(p.n(i2, getPaddingLeft() + getPaddingRight(), ac.E(this)), p.n(i3, getPaddingTop() + getPaddingBottom(), ac.D(this)));
    }

    public void dispatchChildAttached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.q(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.r(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            this.mState.j = false;
            boolean z2 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
            this.mLastAutoMeasureNonExactMeasuredWidth = 0;
            this.mLastAutoMeasureNonExactMeasuredHeight = 0;
            this.mLastAutoMeasureSkippedDueToExact = false;
            if (this.mState.e == 1) {
                dispatchLayoutStep1();
                this.mLayout.A1(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.q() && !z2 && this.mLayout.o0() == getWidth() && this.mLayout.W() == getHeight()) {
                this.mLayout.A1(this);
            } else {
                this.mLayout.A1(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    public void dispatchOnScrollStateChanged(int i2) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.e1(i2);
        }
        onScrollStateChanged(i2);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.a(this, i2);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i2);
            }
        }
    }

    public void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.b(this, i2, i3);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.b.getParent() == this && !d0Var.L() && (i2 = d0Var.r) != -1) {
                ac.B0(d0Var.b, i2);
                d0Var.r = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.p()) {
            z4 = z2;
        }
        if (z4) {
            ac.h0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.d;
            a0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.p = 0;
        a0Var.q = 0;
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int g2 = this.mChildHelper.g() - 1; g2 >= 0; g2--) {
            View f4 = this.mChildHelper.f(g2);
            float translationX = f4.getTranslationX();
            float translationY = f4.getTranslationY();
            if (f2 >= f4.getLeft() + translationX && f2 <= f4.getRight() + translationX && f3 >= f4.getTop() + translationY && f3 <= f4.getBottom() + translationY) {
                return f4;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public d0 findViewHolderForAdapterPosition(int i2) {
        d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j2 = this.mChildHelper.j();
        for (int i3 = 0; i3 < j2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.x() && getAdapterPositionInRecyclerView(childViewHolderInt) == i2) {
                if (!this.mChildHelper.n(childViewHolderInt.b)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForItemId(long j2) {
        h hVar = this.mAdapter;
        d0 d0Var = null;
        if (hVar != null && hVar.i()) {
            int j3 = this.mChildHelper.j();
            for (int i2 = 0; i2 < j3; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
                if (childViewHolderInt != null && !childViewHolderInt.x() && childViewHolderInt.m() == j2) {
                    if (!this.mChildHelper.n(childViewHolderInt.b)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    public d0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    public boolean fling(int i2, int i3) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean k2 = pVar.k();
            boolean l2 = this.mLayout.l();
            if (!k2 || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (!l2 || Math.abs(i3) < this.mMinFlingVelocity) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            float f2 = i2;
            float f3 = i3;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z2 = k2 || l2;
                dispatchNestedFling(f2, f3, z2);
                s sVar = this.mOnFlingListener;
                if (sVar != null && sVar.a(i2, i3)) {
                    return true;
                }
                if (z2) {
                    int i4 = k2 ? 1 : 0;
                    if (l2) {
                        i4 |= 2;
                    }
                    startNestedScroll(i4, 1);
                    int i5 = this.mMaxFlingVelocity;
                    int max = Math.max(-i5, Math.min(i2, i5));
                    int i6 = this.mMaxFlingVelocity;
                    this.mViewFlinger.b(max, Math.max(-i6, Math.min(i3, i6)));
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View Q0 = this.mLayout.Q0(view, i2);
        if (Q0 != null) {
            return Q0;
        }
        boolean z3 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.mLayout.l()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.k()) {
                int i4 = (this.mLayout.Z() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.J0(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z3) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.J0(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(d0 d0Var) {
        if (d0Var.r(524) || !d0Var.u()) {
            return -1;
        }
        return this.mAdapterHelper.e(d0Var.d);
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.G();
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(d0 d0Var) {
        return this.mAdapter.i() ? d0Var.m() : d0Var.d;
    }

    public int getChildAdapterPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.j();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        k kVar = this.mChildDrawingOrderCallback;
        if (kVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return kVar.a(i2, i3);
    }

    public long getChildItemId(View view) {
        d0 childViewHolderInt;
        h hVar = this.mAdapter;
        if (hVar == null || !hVar.i() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.m();
    }

    public int getChildLayoutPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.o();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public fj getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.c) {
            return qVar.b;
        }
        if (this.mState.e() && (qVar.b() || qVar.d())) {
            return qVar.b;
        }
        Rect rect = qVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.c = false;
        return rect;
    }

    public o getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public v getRecycledViewPool() {
        return this.mRecycler.i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.p();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new vi(new f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new yi(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(ti.fastscroll_default_thickness), resources.getDimensionPixelSize(ti.fastscroll_minimum_range), resources.getDimensionPixelOffset(ti.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.g("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        return mVar != null && mVar.p();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, defpackage.ob
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    public void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.x1(i2);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((q) this.mChildHelper.i(i2).getLayoutParams()).c = true;
        }
        this.mRecycler.s();
    }

    public void markKnownViewsInvalid() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.L()) {
                childViewHolderInt.b(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.t();
    }

    public void nestedScrollBy(int i2, int i3) {
        nestedScrollByInternal(i2, i3, null, 1);
    }

    public void offsetChildrenHorizontal(int i2) {
        int g2 = this.mChildHelper.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.mChildHelper.f(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int g2 = this.mChildHelper.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.mChildHelper.f(i3).offsetTopAndBottom(i2);
        }
    }

    public void offsetPositionRecordsForInsert(int i2, int i3) {
        int j2 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.L() && childViewHolderInt.d >= i2) {
                childViewHolderInt.C(i3, false);
                this.mState.g = true;
            }
        }
        this.mRecycler.u(i2, i3);
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.mChildHelper.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i8));
            if (childViewHolderInt != null && (i7 = childViewHolderInt.d) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    childViewHolderInt.C(i3 - i2, false);
                } else {
                    childViewHolderInt.C(i6, false);
                }
                this.mState.g = true;
            }
        }
        this.mRecycler.v(i2, i3);
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.mChildHelper.j();
        for (int i5 = 0; i5 < j2; i5++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i5));
            if (childViewHolderInt != null && !childViewHolderInt.L()) {
                int i6 = childViewHolderInt.d;
                if (i6 >= i4) {
                    childViewHolderInt.C(-i3, z2);
                    this.mState.g = true;
                } else if (i6 >= i2) {
                    childViewHolderInt.i(i2 - 1, -i3, z2);
                    this.mState.g = true;
                }
            }
        }
        this.mRecycler.w(i2, i3, z2);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z2 = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z2 = false;
        }
        this.mFirstLayoutComplete = z2;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.z(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<zi> threadLocal = zi.f;
            zi ziVar = threadLocal.get();
            this.mGapWorker = ziVar;
            if (ziVar == null) {
                this.mGapWorker = new zi();
                Display v2 = ac.v(this);
                float f2 = 60.0f;
                if (!isInEditMode() && v2 != null) {
                    float refreshRate = v2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                zi ziVar2 = this.mGapWorker;
                ziVar2.d = 1.0E9f / f2;
                threadLocal.set(ziVar2);
            }
            this.mGapWorker.a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        zi ziVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.k();
        }
        stopScroll();
        this.mIsAttached = false;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.A(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        if (!ALLOW_THREAD_GAP_WORK || (ziVar = this.mGapWorker) == null) {
            return;
        }
        ziVar.j(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            boolean r0 = r0.l()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.k()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.l()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.k()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean k2 = pVar.k();
        boolean l2 = this.mLayout.l();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = k2;
            if (l2) {
                i2 = (k2 ? 1 : 0) | 2;
            }
            startNestedScroll(i2, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i3 = x3 - this.mInitialTouchX;
                int i4 = y3 - this.mInitialTouchY;
                if (!k2 || Math.abs(i3) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    this.mLastTouchX = x3;
                    z2 = true;
                }
                if (l2 && Math.abs(i4) > this.mTouchSlop) {
                    this.mLastTouchY = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ha.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        ha.b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        p pVar = this.mLayout;
        if (pVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (pVar.s0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.Z0(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z2;
            if (z2 || this.mAdapter == null) {
                return;
            }
            if (this.mState.e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.B1(i2, i3);
            this.mState.j = true;
            dispatchLayoutStep2();
            this.mLayout.E1(i2, i3);
            if (this.mLayout.H1()) {
                this.mLayout.B1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), CommonUtils.BYTES_IN_A_GIGABYTE));
                this.mState.j = true;
                dispatchLayoutStep2();
                this.mLayout.E1(i2, i3);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
        } else if (this.mHasFixedSize) {
            this.mLayout.Z0(this.mRecycler, this.mState, i2, i3);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                a0 a0Var = this.mState;
                if (a0Var.l) {
                    a0Var.h = true;
                } else {
                    this.mAdapterHelper.j();
                    this.mState.h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            h hVar = this.mAdapter;
            if (hVar != null) {
                this.mState.f = hVar.e();
            } else {
                this.mState.f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.Z0(this.mRecycler, this.mState, i2, i3);
            stopInterceptRequestLayout(false);
            this.mState.h = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.c(savedState2);
        } else {
            p pVar = this.mLayout;
            if (pVar != null) {
                savedState.d = pVar.d1();
            } else {
                savedState.d = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        ac.i0(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(d0 d0Var, m.c cVar) {
        d0Var.H(0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (this.mState.i && d0Var.A() && !d0Var.x() && !d0Var.L()) {
            this.mViewInfoStore.c(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.e(d0Var, cVar);
    }

    public void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.k1(this.mRecycler);
            this.mLayout.l1(this.mRecycler);
        }
        this.mRecycler.c();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r2 = this.mChildHelper.r(view);
        if (r2) {
            d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.J(childViewHolderInt);
            this.mRecycler.C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!r2);
        return r2;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.z()) {
                childViewHolderInt.f();
            } else if (!childViewHolderInt.L()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(o oVar) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(r rVar) {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.remove(tVar);
        if (this.mInterceptingOnItemTouchListener == tVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void removeRecyclerListener(x xVar) {
        this.mRecyclerListeners.remove(xVar);
    }

    public void repositionShadowingViews() {
        d0 d0Var;
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.mChildHelper.f(i2);
            d0 childViewHolder = getChildViewHolder(f2);
            if (childViewHolder != null && (d0Var = childViewHolder.j) != null) {
                View view = d0Var.b;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.b1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.r1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    public void saveOldPositions() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (!childViewHolderInt.L()) {
                childViewHolderInt.G();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            boolean k2 = pVar.k();
            boolean l2 = this.mLayout.l();
            if (k2 || l2) {
                if (!k2) {
                    i2 = 0;
                }
                if (!l2) {
                    i3 = 0;
                }
                scrollByInternal(i2, i3, null, 0);
            }
        }
    }

    public boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i5 = i10;
            i6 = i9;
            i7 = i2 - i9;
            i8 = i3 - i10;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i6, i5, i7, i8, this.mScrollOffset, i4, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = i7 - iArr4[0];
        int i12 = i8 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i13 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !nb.e(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i12);
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (i6 != 0 || i5 != 0) {
            dispatchOnScrolled(i6, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i6 == 0 && i5 == 0) ? false : true;
    }

    public void scrollStep(int i2, int i3, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        ha.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int w1 = i2 != 0 ? this.mLayout.w1(i2, this.mRecycler, this.mState) : 0;
        int y1 = i3 != 0 ? this.mLayout.y1(i3, this.mRecycler, this.mState) : 0;
        ha.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = w1;
            iArr[1] = y1;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        pVar.x1(i2);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(fj fjVar) {
        this.mAccessibilityDelegate = fjVar;
        ac.q0(this, fjVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    public boolean setChildImportantForAccessibilityInternal(d0 d0Var, int i2) {
        if (isComputingLayout()) {
            d0Var.r = i2;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        ac.B0(d0Var.b, i2);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        db.e(lVar);
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.k();
            this.mItemAnimator.v(null);
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.v(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.mRecycler.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.k();
            }
            this.mLayout.k1(this.mRecycler);
            this.mLayout.l1(this.mRecycler);
            this.mRecycler.c();
            if (this.mIsAttached) {
                this.mLayout.A(this, this.mRecycler);
            }
            this.mLayout.F1(null);
            this.mLayout = null;
        } else {
            this.mRecycler.c();
        }
        this.mChildHelper.o();
        this.mLayout = pVar;
        if (pVar != null) {
            if (pVar.b == null) {
                pVar.F1(this);
                if (this.mIsAttached) {
                    this.mLayout.z(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.b.exceptionLabel());
            }
        }
        this.mRecycler.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().n(z2);
    }

    public void setOnFlingListener(s sVar) {
        this.mOnFlingListener = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.mScrollListener = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(v vVar) {
        this.mRecycler.E(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.mRecyclerListener = xVar;
    }

    public void setScrollState(int i2) {
        if (i2 == this.mScrollState) {
            return;
        }
        this.mScrollState = i2;
        if (i2 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.mRecycler.F(b0Var);
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (isComputingLayout()) {
            int a2 = accessibilityEvent != null ? kc.a(accessibilityEvent) : 0;
            this.mEatenAccessibilityChangeFlags |= a2 != 0 ? a2 : 0;
            return true;
        }
        return false;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public void smoothScrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.J1(this, this.mState, i2);
        }
    }

    public void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().p(i2);
    }

    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, defpackage.ob
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(h hVar, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.mChildHelper.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.mChildHelper.i(i6);
            d0 childViewHolderInt = getChildViewHolderInt(i7);
            if (childViewHolderInt != null && !childViewHolderInt.L() && (i4 = childViewHolderInt.d) >= i2 && i4 < i5) {
                childViewHolderInt.b(2);
                childViewHolderInt.a(obj);
                ((q) i7.getLayoutParams()).c = true;
            }
        }
        this.mRecycler.M(i2, i3);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, si.recyclerViewStyle);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().g(i2, i3, i4, i5, iArr, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.d0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            wi r0 = r5.mChildHelper
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            wi r3 = r5.mChildHelper
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.x()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.d
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.o()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            wi r1 = r5.mChildHelper
            android.view.View r4 = r3.b
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().l(i2);
    }

    public void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, UNDEFINED_DURATION);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().q(i2, i3);
    }

    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().s(i2);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Parcelable d;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.d = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        public void c(SavedState savedState) {
            this.d = savedState.d;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.d, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new kj();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new l();
        this.mItemAnimator = new xi();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z2 = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new zi.b() : null;
        this.mState = new a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = bc.b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = bc.e(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.v(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (ac.A(this) == 0) {
            ac.B0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new fj(this));
        int[] iArr = ui.RecyclerView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        ac.o0(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        String string = obtainStyledAttributes.getString(ui.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(ui.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(ui.RecyclerView_android_clipToPadding, true);
        boolean z3 = obtainStyledAttributes.getBoolean(ui.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z3;
        if (z3) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(ui.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(ui.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(ui.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(ui.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            ac.o0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class q extends ViewGroup.MarginLayoutParams {
        public d0 a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int a() {
            return this.a.o();
        }

        public boolean b() {
            return this.a.A();
        }

        public boolean c() {
            return this.a.x();
        }

        public boolean d() {
            return this.a.v();
        }

        public q(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            if (!pVar.k()) {
                i2 = 0;
            }
            if (!this.mLayout.l()) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return;
            }
            if (i4 == Integer.MIN_VALUE || i4 > 0) {
                if (z2) {
                    int i5 = i2 != 0 ? 1 : 0;
                    if (i3 != 0) {
                        i5 |= 2;
                    }
                    startNestedScroll(i5, 1);
                }
                this.mViewFlinger.e(i2, i3, i4, interpolator);
                return;
            }
            scrollBy(i2, i3);
        }
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }
}
