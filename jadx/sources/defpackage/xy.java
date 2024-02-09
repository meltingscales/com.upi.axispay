package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: AxisPay */
/* renamed from: xy  reason: default package */
/* loaded from: classes.dex */
public class xy extends Drawable implements oz, p9 {
    public b b;

    public xy a() {
        this.b = new b(this.b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.b;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.b.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable mutate() {
        a();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.b.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = yy.e(iArr);
        b bVar = this.b;
        if (bVar.b != e) {
            bVar.b = e;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.a.setColorFilter(colorFilter);
    }

    @Override // defpackage.oz
    public void setShapeAppearanceModel(lz lzVar) {
        this.b.a.setShapeAppearanceModel(lzVar);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTint(int i) {
        this.b.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTintList(ColorStateList colorStateList) {
        this.b.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTintMode(PorterDuff.Mode mode) {
        this.b.a.setTintMode(mode);
    }

    public xy(lz lzVar) {
        this(new b(new hz(lzVar)));
    }

    /* compiled from: AxisPay */
    /* renamed from: xy$b */
    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {
        public hz a;
        public boolean b;

        public b(hz hzVar) {
            this.a = hzVar;
            this.b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public xy newDrawable() {
            return new xy(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.a = (hz) bVar.a.getConstantState().newDrawable();
            this.b = bVar.b;
        }
    }

    public xy(b bVar) {
        this.b = bVar;
    }
}
