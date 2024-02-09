package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: AxisPay */
/* renamed from: f2  reason: default package */
/* loaded from: classes.dex */
public class f2 extends ImageButton implements zb, ed {
    public final y1 b;
    public final g2 c;

    public f2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.b();
        }
        g2 g2Var = this.c;
        if (g2Var != null) {
            g2Var.b();
        }
    }

    @Override // defpackage.zb
    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.b;
        if (y1Var != null) {
            return y1Var.c();
        }
        return null;
    }

    @Override // defpackage.zb
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.b;
        if (y1Var != null) {
            return y1Var.d();
        }
        return null;
    }

    @Override // defpackage.ed
    public ColorStateList getSupportImageTintList() {
        g2 g2Var = this.c;
        if (g2Var != null) {
            return g2Var.c();
        }
        return null;
    }

    @Override // defpackage.ed
    public PorterDuff.Mode getSupportImageTintMode() {
        g2 g2Var = this.c;
        if (g2Var != null) {
            return g2Var.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.c.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        g2 g2Var = this.c;
        if (g2Var != null) {
            g2Var.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        g2 g2Var = this.c;
        if (g2Var != null) {
            g2Var.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.c.g(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        g2 g2Var = this.c;
        if (g2Var != null) {
            g2Var.b();
        }
    }

    @Override // defpackage.zb
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.i(colorStateList);
        }
    }

    @Override // defpackage.zb
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.j(mode);
        }
    }

    @Override // defpackage.ed
    public void setSupportImageTintList(ColorStateList colorStateList) {
        g2 g2Var = this.c;
        if (g2Var != null) {
            g2Var.h(colorStateList);
        }
    }

    @Override // defpackage.ed
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        g2 g2Var = this.c;
        if (g2Var != null) {
            g2Var.i(mode);
        }
    }

    public f2(Context context, AttributeSet attributeSet, int i) {
        super(l3.b(context), attributeSet, i);
        j3.a(this, getContext());
        y1 y1Var = new y1(this);
        this.b = y1Var;
        y1Var.e(attributeSet, i);
        g2 g2Var = new g2(this);
        this.c = g2Var;
        g2Var.f(attributeSet, i);
    }
}
