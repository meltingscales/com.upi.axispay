package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final List<a> b;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a {
        public BitmapDrawable a;
        public Rect c;
        public Interpolator d;
        public long e;
        public Rect f;
        public int g;
        public long j;
        public boolean k;
        public boolean l;
        public InterfaceC0001a m;
        public float b = 1.0f;
        public float h = 1.0f;
        public float i = 1.0f;

        /* compiled from: AxisPay */
        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0001a {
            void a();
        }

        public a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.a = bitmapDrawable;
            this.f = rect;
            Rect rect2 = new Rect(rect);
            this.c = rect2;
            BitmapDrawable bitmapDrawable2 = this.a;
            if (bitmapDrawable2 == null || rect2 == null) {
                return;
            }
            bitmapDrawable2.setAlpha((int) (this.b * 255.0f));
            this.a.setBounds(this.c);
        }

        public BitmapDrawable a() {
            return this.a;
        }

        public boolean b() {
            return this.k;
        }

        public a c(float f, float f2) {
            this.h = f;
            this.i = f2;
            return this;
        }

        public a d(InterfaceC0001a interfaceC0001a) {
            this.m = interfaceC0001a;
            return this;
        }

        public a e(long j) {
            this.e = j;
            return this;
        }

        public a f(Interpolator interpolator) {
            this.d = interpolator;
            return this;
        }

        public a g(int i) {
            this.g = i;
            return this;
        }

        public void h(long j) {
            this.j = j;
            this.k = true;
        }

        public void i() {
            this.k = true;
            this.l = true;
            InterfaceC0001a interfaceC0001a = this.m;
            if (interfaceC0001a != null) {
                interfaceC0001a.a();
            }
        }

        public boolean j(long j) {
            if (this.l) {
                return false;
            }
            float max = this.k ? Math.max(0.0f, Math.min(1.0f, ((float) (j - this.j)) / ((float) this.e))) : 0.0f;
            Interpolator interpolator = this.d;
            float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
            int i = (int) (this.g * interpolation);
            Rect rect = this.c;
            Rect rect2 = this.f;
            rect.top = rect2.top + i;
            rect.bottom = rect2.bottom + i;
            float f = this.h;
            float f2 = f + ((this.i - f) * interpolation);
            this.b = f2;
            BitmapDrawable bitmapDrawable = this.a;
            if (bitmapDrawable != null && rect != null) {
                bitmapDrawable.setAlpha((int) (f2 * 255.0f));
                this.a.setBounds(this.c);
            }
            if (this.k && max >= 1.0f) {
                this.l = true;
                InterfaceC0001a interfaceC0001a = this.m;
                if (interfaceC0001a != null) {
                    interfaceC0001a.a();
                }
            }
            return !this.l;
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
    }

    public void a(a aVar) {
        this.b.add(aVar);
    }

    public void b() {
        for (a aVar : this.b) {
            if (!aVar.b()) {
                aVar.h(getDrawingTime());
            }
        }
    }

    public void c() {
        for (a aVar : this.b) {
            aVar.i();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b.size() > 0) {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                BitmapDrawable a2 = next.a();
                if (a2 != null) {
                    a2.draw(canvas);
                }
                if (!next.j(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }
}
