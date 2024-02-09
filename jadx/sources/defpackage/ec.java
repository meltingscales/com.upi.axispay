package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: AxisPay */
/* renamed from: ec  reason: default package */
/* loaded from: classes.dex */
public final class ec {
    public WeakReference<View> a;
    public Runnable b = null;
    public Runnable c = null;
    public int d = -1;

    /* compiled from: AxisPay */
    /* renamed from: ec$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ fc a;
        public final /* synthetic */ View b;

        public a(ec ecVar, fc fcVar, View view) {
            this.a = fcVar;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ec$b */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ hc a;
        public final /* synthetic */ View b;

        public b(ec ecVar, hc hcVar, View view) {
            this.a = hcVar;
            this.b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a(this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ec$c */
    /* loaded from: classes.dex */
    public static class c implements fc {
        public ec a;
        public boolean b;

        public c(ec ecVar) {
            this.a = ecVar;
        }

        @Override // defpackage.fc
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            fc fcVar = tag instanceof fc ? (fc) tag : null;
            if (fcVar != null) {
                fcVar.a(view);
            }
        }

        @Override // defpackage.fc
        @SuppressLint({"WrongConstant"})
        public void b(View view) {
            int i = this.a.d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.a.d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.b) {
                ec ecVar = this.a;
                Runnable runnable = ecVar.c;
                if (runnable != null) {
                    ecVar.c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                fc fcVar = tag instanceof fc ? (fc) tag : null;
                if (fcVar != null) {
                    fcVar.b(view);
                }
                this.b = true;
            }
        }

        @Override // defpackage.fc
        public void c(View view) {
            this.b = false;
            if (this.a.d > -1) {
                view.setLayerType(2, null);
            }
            ec ecVar = this.a;
            Runnable runnable = ecVar.b;
            if (runnable != null) {
                ecVar.b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            fc fcVar = tag instanceof fc ? (fc) tag : null;
            if (fcVar != null) {
                fcVar.c(view);
            }
        }
    }

    public ec(View view) {
        this.a = new WeakReference<>(view);
    }

    public ec a(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public ec d(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public ec e(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public ec f(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public ec g(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public ec h(fc fcVar) {
        View view = this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                i(view, fcVar);
            } else {
                view.setTag(2113929216, fcVar);
                i(view, new c(this));
            }
        }
        return this;
    }

    public final void i(View view, fc fcVar) {
        if (fcVar != null) {
            view.animate().setListener(new a(this, fcVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public ec j(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public ec k(hc hcVar) {
        View view = this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(hcVar != null ? new b(this, hcVar, view) : null);
        }
        return this;
    }

    public void l() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public ec m(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
