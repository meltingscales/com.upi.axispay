package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ny  reason: default package */
/* loaded from: classes.dex */
public class ny {

    /* compiled from: AxisPay */
    /* renamed from: ny$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final /* synthetic */ View b;

        public a(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.b.getContext().getSystemService(C0059ao.a(14876))).showSoftInput(this.b, 1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ny$b */
    /* loaded from: classes.dex */
    public static class b implements ub {
        public final /* synthetic */ d a;
        public final /* synthetic */ e b;

        public b(d dVar, e eVar) {
            this.a = dVar;
            this.b = eVar;
        }

        @Override // defpackage.ub
        public ic a(View view, ic icVar) {
            this.a.a(view, icVar, new e(this.b));
            return icVar;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ny$c */
    /* loaded from: classes.dex */
    public static class c implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            ac.n0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ny$d */
    /* loaded from: classes.dex */
    public interface d {
        ic a(View view, ic icVar, e eVar);
    }

    public static void a(View view, d dVar) {
        ac.D0(view, new b(dVar, new e(ac.I(view), view.getPaddingTop(), ac.H(view), view.getPaddingBottom())));
        f(view);
    }

    public static float b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static float c(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ac.w((View) parent);
        }
        return f;
    }

    public static boolean d(View view) {
        return ac.C(view) == 1;
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void f(View view) {
        if (ac.U(view)) {
            ac.n0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void g(View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    /* compiled from: AxisPay */
    /* renamed from: ny$e */
    /* loaded from: classes.dex */
    public static class e {
        public int a;
        public int b;
        public int c;
        public int d;

        public e(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public e(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
        }
    }
}
