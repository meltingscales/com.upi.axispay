package defpackage;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.v;
import defpackage.z2;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: h3  reason: default package */
/* loaded from: classes.dex */
public class h3 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public Runnable b;
    public c c;
    public z2 d;
    public Spinner e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* compiled from: AxisPay */
    /* renamed from: h3$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ View b;

        public a(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            h3.this.smoothScrollTo(this.b.getLeft() - ((h3.this.getWidth() - this.b.getWidth()) / 2), 0);
            h3.this.b = null;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: h3$b */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return h3.this.d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) h3.this.d.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return h3.this.c((v.c) getItem(i), true);
            }
            ((d) view).a((v.c) getItem(i));
            return view;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: h3$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = h3.this.d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = h3.this.d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: h3$d */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {
        public final int[] b;
        public v.c c;
        public TextView d;
        public ImageView e;
        public View f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.content.Context r6, defpackage.v.c r7, boolean r8) {
            /*
                r4 = this;
                defpackage.h3.this = r5
                int r5 = defpackage.l.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.b = r1
                r4.c = r7
                o3 r5 = defpackage.o3.v(r6, r0, r1, r5, r3)
                boolean r6 = r5.s(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.g(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.w()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.h3.d.<init>(h3, android.content.Context, v$c, boolean):void");
        }

        public void a(v.c cVar) {
            this.c = cVar;
            c();
        }

        public v.c b() {
            return this.c;
        }

        public void c() {
            v.c cVar = this.c;
            View b = cVar.b();
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f = b;
                TextView textView = this.d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f;
            if (view != null) {
                removeView(view);
                this.f = null;
            }
            Drawable c = cVar.c();
            CharSequence d = cVar.d();
            if (c != null) {
                if (this.e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.e = appCompatImageView;
                }
                this.e.setImageDrawable(c);
                this.e.setVisibility(0);
            } else {
                ImageView imageView2 = this.e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, l.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.d = appCompatTextView;
                }
                this.d.setText(d);
                this.d.setVisibility(0);
            } else {
                TextView textView2 = this.d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            q3.a(this, z ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0059ao.a(6219));
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0059ao.a(6220));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (h3.this.g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = h3.this.g;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, CommonUtils.BYTES_IN_A_GIGABYTE), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public void a(int i) {
        View childAt = this.d.getChildAt(i);
        Runnable runnable = this.b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.b = aVar;
        post(aVar);
    }

    public final Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, l.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new z2.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public d c(v.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.i));
        } else {
            dVar.setFocusable(true);
            if (this.c == null) {
                this.c = new c();
            }
            dVar.setOnClickListener(this.c);
        }
        return dVar;
    }

    public final boolean d() {
        Spinner spinner = this.e;
        return spinner != null && spinner.getParent() == this;
    }

    public final void e() {
        if (d()) {
            return;
        }
        if (this.e == null) {
            this.e = b();
        }
        removeView(this.d);
        addView(this.e, new ViewGroup.LayoutParams(-2, -1));
        if (this.e.getAdapter() == null) {
            this.e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.b = null;
        }
        this.e.setSelection(this.j);
    }

    public final boolean f() {
        if (d()) {
            removeView(this.e);
            addView(this.d, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.e.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t0 b2 = t0.b(getContext());
        setContentHeight(b2.f());
        this.h = b2.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.d.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.g = View.MeasureSpec.getSize(i) / 2;
            }
            this.g = Math.min(this.g, this.h);
        } else {
            this.g = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i, CommonUtils.BYTES_IN_A_GIGABYTE);
        if (z2 || !this.f) {
            z = false;
        }
        if (z) {
            this.d.measure(0, makeMeasureSpec);
            if (this.d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z2 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.j);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f = z;
    }

    public void setContentHeight(int i) {
        this.i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.j = i;
        int childCount = this.d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
            i2++;
        }
        Spinner spinner = this.e;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
