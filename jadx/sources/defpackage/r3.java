package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.common.api.Api;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: r3  reason: default package */
/* loaded from: classes.dex */
public class r3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static r3 k;
    public static r3 l;
    public final View b;
    public final CharSequence c;
    public final int d;
    public final Runnable e = new a();
    public final Runnable f = new b();
    public int g;
    public int h;
    public s3 i;
    public boolean j;

    /* compiled from: AxisPay */
    /* renamed from: r3$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r3.this.g(false);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: r3$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r3.this.c();
        }
    }

    public r3(View view, CharSequence charSequence) {
        this.b = view;
        this.c = charSequence;
        this.d = bc.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void e(r3 r3Var) {
        r3 r3Var2 = k;
        if (r3Var2 != null) {
            r3Var2.a();
        }
        k = r3Var;
        if (r3Var != null) {
            r3Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        r3 r3Var = k;
        if (r3Var != null && r3Var.b == view) {
            e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            r3 r3Var2 = l;
            if (r3Var2 != null && r3Var2.b == view) {
                r3Var2.c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new r3(view, charSequence);
    }

    public final void a() {
        this.b.removeCallbacks(this.e);
    }

    public final void b() {
        this.g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public void c() {
        if (l == this) {
            l = null;
            s3 s3Var = this.i;
            if (s3Var != null) {
                s3Var.c();
                this.i = null;
                b();
                this.b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(C0059ao.a(15549), C0059ao.a(15550));
            }
        }
        if (k == this) {
            e(null);
        }
        this.b.removeCallbacks(this.f);
    }

    public final void d() {
        this.b.postDelayed(this.e, ViewConfiguration.getLongPressTimeout());
    }

    public void g(boolean z) {
        long j;
        int longPressTimeout;
        long j2;
        if (ac.U(this.b)) {
            e(null);
            r3 r3Var = l;
            if (r3Var != null) {
                r3Var.c();
            }
            l = this;
            this.j = z;
            s3 s3Var = new s3(this.b.getContext());
            this.i = s3Var;
            s3Var.e(this.b, this.g, this.h, this.j, this.c);
            this.b.addOnAttachStateChangeListener(this);
            if (this.j) {
                j2 = 2500;
            } else {
                if ((ac.N(this.b) & 1) == 1) {
                    j = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j - longPressTimeout;
            }
            this.b.removeCallbacks(this.f);
            this.b.postDelayed(this.f, j2);
        }
    }

    public final boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.g) > this.d || Math.abs(y - this.h) > this.d) {
            this.g = x;
            this.h = y;
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.i == null || !this.j) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.b.getContext().getSystemService(C0059ao.a(15551));
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    b();
                    c();
                }
            } else if (this.b.isEnabled() && this.i == null && h(motionEvent)) {
                e(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.g = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
