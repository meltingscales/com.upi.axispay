package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: AxisPay */
/* renamed from: b80  reason: default package */
/* loaded from: classes.dex */
public class b80 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final r80 b;
    public final WeakReference<ImageView> c;
    public y70 d;

    public b80(r80 r80Var, ImageView imageView, y70 y70Var) {
        this.b = r80Var;
        this.c = new WeakReference<>(imageView);
        this.d = y70Var;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    public void a() {
        this.b.a();
        this.d = null;
        ImageView imageView = this.c.get();
        if (imageView == null) {
            return;
        }
        this.c.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.c.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width > 0 && height > 0) {
                imageView.removeOnAttachStateChangeListener(this);
                viewTreeObserver.removeOnPreDrawListener(this);
                this.c.clear();
                r80 r80Var = this.b;
                r80Var.i();
                r80Var.h(width, height);
                r80Var.f(imageView, this.d);
            }
            return true;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
