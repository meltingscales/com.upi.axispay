package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.n80;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: f80  reason: default package */
/* loaded from: classes.dex */
public class f80 extends u70<ImageView> {
    public y70 m;

    public f80(n80 n80Var, ImageView imageView, q80 q80Var, int i, int i2, int i3, Drawable drawable, String str, Object obj, y70 y70Var, boolean z) {
        super(n80Var, imageView, q80Var, i, i2, i3, drawable, str, obj, z);
        this.m = y70Var;
    }

    @Override // defpackage.u70
    public void a() {
        super.a();
        if (this.m != null) {
            this.m = null;
        }
    }

    @Override // defpackage.u70
    public void b(Bitmap bitmap, n80.e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.c.get();
            if (imageView == null) {
                return;
            }
            n80 n80Var = this.a;
            o80.c(imageView, n80Var.e, bitmap, eVar, this.d, n80Var.m);
            y70 y70Var = this.m;
            if (y70Var != null) {
                y70Var.onSuccess();
                return;
            }
            return;
        }
        throw new AssertionError(String.format(C0059ao.a(13283), this));
    }

    @Override // defpackage.u70
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i = this.g;
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        y70 y70Var = this.m;
        if (y70Var != null) {
            y70Var.a(exc);
        }
    }
}
