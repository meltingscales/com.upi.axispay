package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.jy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BadgeDrawable extends Drawable implements jy.b {
    public static final int r = rv.Widget_MaterialComponents_Badge;
    public static final int s = iv.badgeStyle;
    public final WeakReference<Context> b;
    public final hz c;
    public final jy d;
    public final Rect e;
    public final float f;
    public final float g;
    public final float h;
    public final SavedState i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public float o;
    public WeakReference<View> p;
    public WeakReference<FrameLayout> q;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ FrameLayout c;

        public a(View view, FrameLayout frameLayout) {
            this.b = view;
            this.c = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            BadgeDrawable.this.y(this.b, this.c);
        }
    }

    public BadgeDrawable(Context context) {
        this.b = new WeakReference<>(context);
        ly.c(context);
        Resources resources = context.getResources();
        this.e = new Rect();
        this.c = new hz();
        this.f = resources.getDimensionPixelSize(kv.mtrl_badge_radius);
        this.h = resources.getDimensionPixelSize(kv.mtrl_badge_long_text_horizontal_padding);
        this.g = resources.getDimensionPixelSize(kv.mtrl_badge_with_text_radius);
        jy jyVar = new jy(this);
        this.d = jyVar;
        jyVar.e().setTextAlign(Paint.Align.CENTER);
        this.i = new SavedState(context);
        u(rv.TextAppearance_MaterialComponents_Badge);
    }

    public static BadgeDrawable c(Context context) {
        return d(context, null, s, r);
    }

    public static BadgeDrawable d(Context context, AttributeSet attributeSet, int i, int i2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.l(context, attributeSet, i, i2);
        return badgeDrawable;
    }

    public static int m(Context context, TypedArray typedArray, int i) {
        return ty.a(context, typedArray, i).getDefaultColor();
    }

    public static void x(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    public final void A() {
        this.l = ((int) Math.pow(10.0d, i() - 1.0d)) - 1;
    }

    @Override // defpackage.jy.b
    public void a() {
        invalidateSelf();
    }

    public final void b(Context context, Rect rect, View view) {
        int i = this.i.m + this.i.o;
        int i2 = this.i.j;
        if (i2 != 8388691 && i2 != 8388693) {
            this.k = rect.top + i;
        } else {
            this.k = rect.bottom - i;
        }
        if (j() <= 9) {
            float f = !k() ? this.f : this.g;
            this.m = f;
            this.o = f;
            this.n = f;
        } else {
            float f2 = this.g;
            this.m = f2;
            this.o = f2;
            this.n = (this.d.f(f()) / 2.0f) + this.h;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(k() ? kv.mtrl_badge_text_horizontal_edge_offset : kv.mtrl_badge_horizontal_edge_offset);
        int i3 = this.i.l + this.i.n;
        int i4 = this.i.j;
        if (i4 != 8388659 && i4 != 8388691) {
            this.j = ac.C(view) == 0 ? ((rect.right + this.n) - dimensionPixelSize) - i3 : (rect.left - this.n) + dimensionPixelSize + i3;
        } else {
            this.j = ac.C(view) == 0 ? (rect.left - this.n) + dimensionPixelSize + i3 : ((rect.right + this.n) - dimensionPixelSize) - i3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.c.draw(canvas);
        if (k()) {
            e(canvas);
        }
    }

    public final void e(Canvas canvas) {
        Rect rect = new Rect();
        String f = f();
        this.d.e().getTextBounds(f, 0, f.length(), rect);
        canvas.drawText(f, this.j, this.k + (rect.height() / 2), this.d.e());
    }

    public final String f() {
        if (j() <= this.l) {
            return NumberFormat.getInstance().format(j());
        }
        Context context = this.b.get();
        return context == null ? "" : context.getString(qv.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.l), "+");
    }

    public CharSequence g() {
        Context context;
        if (isVisible()) {
            if (k()) {
                if (this.i.h <= 0 || (context = this.b.get()) == null) {
                    return null;
                }
                if (j() <= this.l) {
                    return context.getResources().getQuantityString(this.i.h, j(), Integer.valueOf(j()));
                }
                return context.getString(this.i.i, Integer.valueOf(this.l));
            }
            return this.i.g;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.i.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public FrameLayout h() {
        WeakReference<FrameLayout> weakReference = this.q;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int i() {
        return this.i.f;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public int j() {
        if (k()) {
            return this.i.e;
        }
        return 0;
    }

    public boolean k() {
        return this.i.e != -1;
    }

    public final void l(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray h = ly.h(context, attributeSet, sv.Badge, i, i2, new int[0]);
        r(h.getInt(sv.Badge_maxCharacterCount, 4));
        int i3 = sv.Badge_number;
        if (h.hasValue(i3)) {
            s(h.getInt(i3, 0));
        }
        n(m(context, h, sv.Badge_backgroundColor));
        int i4 = sv.Badge_badgeTextColor;
        if (h.hasValue(i4)) {
            p(m(context, h, i4));
        }
        o(h.getInt(sv.Badge_badgeGravity, 8388661));
        q(h.getDimensionPixelOffset(sv.Badge_horizontalOffset, 0));
        v(h.getDimensionPixelOffset(sv.Badge_verticalOffset, 0));
        h.recycle();
    }

    public void n(int i) {
        this.i.b = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.c.x() != valueOf) {
            this.c.X(valueOf);
            invalidateSelf();
        }
    }

    public void o(int i) {
        if (this.i.j != i) {
            this.i.j = i;
            WeakReference<View> weakReference = this.p;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.p.get();
            WeakReference<FrameLayout> weakReference2 = this.q;
            y(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.jy.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p(int i) {
        this.i.c = i;
        if (this.d.e().getColor() != i) {
            this.d.e().setColor(i);
            invalidateSelf();
        }
    }

    public void q(int i) {
        this.i.l = i;
        z();
    }

    public void r(int i) {
        if (this.i.f != i) {
            this.i.f = i;
            A();
            this.d.i(true);
            z();
            invalidateSelf();
        }
    }

    public void s(int i) {
        int max = Math.max(0, i);
        if (this.i.e != max) {
            this.i.e = max;
            this.d.i(true);
            z();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.i.d = i;
        this.d.e().setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void t(uy uyVar) {
        Context context;
        if (this.d.d() == uyVar || (context = this.b.get()) == null) {
            return;
        }
        this.d.h(uyVar, context);
        z();
    }

    public final void u(int i) {
        Context context = this.b.get();
        if (context == null) {
            return;
        }
        t(new uy(context, i));
    }

    public void v(int i) {
        this.i.m = i;
        z();
    }

    public final void w(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != mv.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.q;
            if (weakReference == null || weakReference.get() != viewGroup) {
                x(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(mv.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.q = new WeakReference<>(frameLayout);
                frameLayout.post(new a(view, frameLayout));
            }
        }
    }

    public void y(View view, FrameLayout frameLayout) {
        this.p = new WeakReference<>(view);
        boolean z = jw.a;
        if (z && frameLayout == null) {
            w(view);
        } else {
            this.q = new WeakReference<>(frameLayout);
        }
        if (!z) {
            x(view);
        }
        z();
        invalidateSelf();
    }

    public final void z() {
        Context context = this.b.get();
        WeakReference<View> weakReference = this.p;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.e);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.q;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || jw.a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        jw.d(this.e, this.j, this.k, this.n, this.o);
        this.c.U(this.m);
        if (rect.equals(this.e)) {
            return;
        }
        this.c.setBounds(this.e);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public CharSequence g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Context context) {
            this.d = 255;
            this.e = -1;
            this.c = new uy(context, rv.TextAppearance_MaterialComponents_Badge).a.getDefaultColor();
            this.g = context.getString(qv.mtrl_badge_numberless_content_description);
            this.h = pv.mtrl_badge_content_description;
            this.i = qv.mtrl_exceed_max_badge_number_content_description;
            this.k = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeString(this.g.toString());
            parcel.writeInt(this.h);
            parcel.writeInt(this.j);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.k ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.d = 255;
            this.e = -1;
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readString();
            this.h = parcel.readInt();
            this.j = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readInt();
            this.n = parcel.readInt();
            this.o = parcel.readInt();
            this.k = parcel.readInt() != 0;
        }
    }
}
