package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: s9  reason: default package */
/* loaded from: classes.dex */
public class s9 extends r9 {
    public static Method i;

    public s9(Drawable drawable) {
        super(drawable);
        g();
    }

    @Override // defpackage.r9
    public boolean c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.g;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    public final void g() {
        if (i == null) {
            try {
                i = Drawable.class.getDeclaredMethod(C0059ao.a(690), new Class[0]);
            } catch (Exception e) {
                Log.w(C0059ao.a(691), C0059ao.a(692), e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.g;
        if (drawable != null && (method = i) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w(C0059ao.a(693), C0059ao.a(694), e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.g.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.g.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // defpackage.r9, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // defpackage.r9, android.graphics.drawable.Drawable, defpackage.p9
    public void setTint(int i2) {
        if (c()) {
            super.setTint(i2);
        } else {
            this.g.setTint(i2);
        }
    }

    @Override // defpackage.r9, android.graphics.drawable.Drawable, defpackage.p9
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.g.setTintList(colorStateList);
        }
    }

    @Override // defpackage.r9, android.graphics.drawable.Drawable, defpackage.p9
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.g.setTintMode(mode);
        }
    }

    public s9(t9 t9Var, Resources resources) {
        super(t9Var, resources);
        g();
    }
}
