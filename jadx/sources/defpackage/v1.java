package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AxisPay */
/* renamed from: v1  reason: default package */
/* loaded from: classes.dex */
public abstract class v1 extends ViewGroup {
    public final a b;
    public final Context c;
    public ActionMenuView d;
    public ActionMenuPresenter e;
    public int f;
    public ec g;
    public boolean h;
    public boolean i;

    /* compiled from: AxisPay */
    /* renamed from: v1$a */
    /* loaded from: classes.dex */
    public class a implements fc {
        public boolean a = false;
        public int b;

        public a() {
        }

        @Override // defpackage.fc
        public void a(View view) {
            this.a = true;
        }

        @Override // defpackage.fc
        public void b(View view) {
            if (this.a) {
                return;
            }
            v1 v1Var = v1.this;
            v1Var.g = null;
            v1.super.setVisibility(this.b);
        }

        @Override // defpackage.fc
        public void c(View view) {
            v1.super.setVisibility(0);
            this.a = false;
        }

        public a d(ec ecVar, int i) {
            v1.this.g = ecVar;
            this.b = i;
            return this;
        }
    }

    public v1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public ec f(int i, long j) {
        ec ecVar = this.g;
        if (ecVar != null) {
            ecVar.b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ec d = ac.d(this);
            d.a(1.0f);
            d.f(j);
            a aVar = this.b;
            aVar.d(d, i);
            d.h(aVar);
            return d;
        }
        ec d2 = ac.d(this);
        d2.a(0.0f);
        d2.f(j);
        a aVar2 = this.b;
        aVar2.d(d2, i);
        d2.h(aVar2);
        return d2;
    }

    public int getAnimatedVisibility() {
        if (this.g != null) {
            return this.b.b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, u.ActionBar, l.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(u.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ec ecVar = this.g;
            if (ecVar != null) {
                ecVar.b();
            }
            super.setVisibility(i);
        }
    }

    public v1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(l.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.c = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.c = context;
        }
    }
}
