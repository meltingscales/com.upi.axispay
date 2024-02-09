package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xb  reason: default package */
/* loaded from: classes.dex */
public final class xb implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View b;
    public ViewTreeObserver c;
    public final Runnable d;

    public xb(View view, Runnable runnable) {
        this.b = view;
        this.c = view.getViewTreeObserver();
        this.d = runnable;
    }

    public static xb a(View view, Runnable runnable) {
        Objects.requireNonNull(view, C0059ao.a(6421));
        Objects.requireNonNull(runnable, C0059ao.a(6422));
        xb xbVar = new xb(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(xbVar);
        view.addOnAttachStateChangeListener(xbVar);
        return xbVar;
    }

    public void b() {
        if (this.c.isAlive()) {
            this.c.removeOnPreDrawListener(this);
        } else {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
