package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;
import defpackage.n80;
import defpackage.q80;
import java.util.concurrent.atomic.AtomicInteger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: r80  reason: default package */
/* loaded from: classes.dex */
public class r80 {
    public static final AtomicInteger m = new AtomicInteger();
    public final n80 a;
    public final q80.b b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public Object l;

    public r80(n80 n80Var, Uri uri, int i) {
        if (!n80Var.o) {
            this.a = n80Var;
            this.b = new q80.b(uri, i, n80Var.l);
            return;
        }
        throw new IllegalStateException(C0059ao.a(8156));
    }

    public r80 a() {
        this.l = null;
        return this;
    }

    public final q80 b(long j) {
        int andIncrement = m.getAndIncrement();
        q80 a = this.b.a();
        a.a = andIncrement;
        a.b = j;
        boolean z = this.a.n;
        String a2 = C0059ao.a(8157);
        if (z) {
            x80.t(a2, C0059ao.a(8158), a.g(), a.toString());
        }
        this.a.n(a);
        if (a != a) {
            a.a = andIncrement;
            a.b = j;
            if (z) {
                String d = a.d();
                x80.t(a2, C0059ao.a(8160), d, C0059ao.a(8159) + a);
            }
        }
        return a;
    }

    public r80 c(int i) {
        if (i != 0) {
            if (this.k == null) {
                this.g = i;
                return this;
            }
            throw new IllegalStateException(C0059ao.a(8161));
        }
        throw new IllegalArgumentException(C0059ao.a(8162));
    }

    public final Drawable d() {
        int i = this.f;
        if (i != 0) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                return this.a.e.getDrawable(i);
            }
            if (i2 >= 16) {
                return this.a.e.getResources().getDrawable(this.f);
            }
            TypedValue typedValue = new TypedValue();
            this.a.e.getResources().getValue(this.f, typedValue, true);
            return this.a.e.getResources().getDrawable(typedValue.resourceId);
        }
        return this.j;
    }

    public void e(ImageView imageView) {
        f(imageView, null);
    }

    public void f(ImageView imageView, y70 y70Var) {
        Bitmap k;
        long nanoTime = System.nanoTime();
        x80.c();
        if (imageView != null) {
            if (!this.b.b()) {
                this.a.b(imageView);
                if (this.e) {
                    o80.d(imageView, d());
                    return;
                }
                return;
            }
            if (this.d) {
                if (!this.b.c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.b.d(width, height);
                    } else {
                        if (this.e) {
                            o80.d(imageView, d());
                        }
                        this.a.d(imageView, new b80(this, imageView, y70Var));
                        return;
                    }
                } else {
                    throw new IllegalStateException(C0059ao.a(8163));
                }
            }
            q80 b = b(nanoTime);
            String f = x80.f(b);
            if (j80.a(this.h) && (k = this.a.k(f)) != null) {
                this.a.b(imageView);
                n80 n80Var = this.a;
                Context context = n80Var.e;
                n80.e eVar = n80.e.MEMORY;
                o80.c(imageView, context, k, eVar, this.c, n80Var.m);
                if (this.a.n) {
                    String g = b.g();
                    x80.t(C0059ao.a(8165), C0059ao.a(8166), g, C0059ao.a(8164) + eVar);
                }
                if (y70Var != null) {
                    y70Var.onSuccess();
                    return;
                }
                return;
            }
            if (this.e) {
                o80.d(imageView, d());
            }
            this.a.f(new f80(this.a, imageView, b, this.h, this.i, this.g, this.k, f, this.l, y70Var, this.c));
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(8167));
    }

    public r80 g(int i) {
        if (this.e) {
            if (i != 0) {
                if (this.j == null) {
                    this.f = i;
                    return this;
                }
                throw new IllegalStateException(C0059ao.a(8168));
            }
            throw new IllegalArgumentException(C0059ao.a(8169));
        }
        throw new IllegalStateException(C0059ao.a(8170));
    }

    public r80 h(int i, int i2) {
        this.b.d(i, i2);
        return this;
    }

    public r80 i() {
        this.d = false;
        return this;
    }
}
