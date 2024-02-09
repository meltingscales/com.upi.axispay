package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: AxisPay */
/* renamed from: lz  reason: default package */
/* loaded from: classes.dex */
public class lz {
    public static final dz m = new jz(0.5f);
    public ez a;
    public ez b;
    public ez c;
    public ez d;
    public dz e;
    public dz f;
    public dz g;
    public dz h;
    public gz i;
    public gz j;
    public gz k;
    public gz l;

    /* compiled from: AxisPay */
    /* renamed from: lz$c */
    /* loaded from: classes.dex */
    public interface c {
        dz a(dz dzVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    public static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new bz(i3));
    }

    public static b d(Context context, int i, int i2, dz dzVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, sv.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(sv.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(sv.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(sv.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(sv.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(sv.ShapeAppearance_cornerFamilyBottomLeft, i3);
            dz m2 = m(obtainStyledAttributes, sv.ShapeAppearance_cornerSize, dzVar);
            dz m3 = m(obtainStyledAttributes, sv.ShapeAppearance_cornerSizeTopLeft, m2);
            dz m4 = m(obtainStyledAttributes, sv.ShapeAppearance_cornerSizeTopRight, m2);
            dz m5 = m(obtainStyledAttributes, sv.ShapeAppearance_cornerSizeBottomRight, m2);
            dz m6 = m(obtainStyledAttributes, sv.ShapeAppearance_cornerSizeBottomLeft, m2);
            b bVar = new b();
            bVar.y(i4, m3);
            bVar.C(i5, m4);
            bVar.u(i6, m5);
            bVar.q(i7, m6);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new bz(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, dz dzVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sv.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(sv.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(sv.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dzVar);
    }

    public static dz m(TypedArray typedArray, int i, dz dzVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return dzVar;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new bz(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new jz(peekValue.getFraction(1.0f, 1.0f)) : dzVar;
    }

    public gz h() {
        return this.k;
    }

    public ez i() {
        return this.d;
    }

    public dz j() {
        return this.h;
    }

    public ez k() {
        return this.c;
    }

    public dz l() {
        return this.g;
    }

    public gz n() {
        return this.l;
    }

    public gz o() {
        return this.j;
    }

    public gz p() {
        return this.i;
    }

    public ez q() {
        return this.a;
    }

    public dz r() {
        return this.e;
    }

    public ez s() {
        return this.b;
    }

    public dz t() {
        return this.f;
    }

    public boolean u(RectF rectF) {
        boolean z = this.l.getClass().equals(gz.class) && this.j.getClass().equals(gz.class) && this.i.getClass().equals(gz.class) && this.k.getClass().equals(gz.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof kz) && (this.a instanceof kz) && (this.c instanceof kz) && (this.d instanceof kz));
    }

    public b v() {
        return new b(this);
    }

    public lz w(float f) {
        b v = v();
        v.o(f);
        return v.m();
    }

    public lz x(dz dzVar) {
        b v = v();
        v.p(dzVar);
        return v.m();
    }

    public lz y(c cVar) {
        b v = v();
        v.B(cVar.a(r()));
        v.F(cVar.a(t()));
        v.t(cVar.a(j()));
        v.x(cVar.a(l()));
        return v.m();
    }

    public lz(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    /* compiled from: AxisPay */
    /* renamed from: lz$b */
    /* loaded from: classes.dex */
    public static final class b {
        public ez a;
        public ez b;
        public ez c;
        public ez d;
        public dz e;
        public dz f;
        public dz g;
        public dz h;
        public gz i;
        public gz j;
        public gz k;
        public gz l;

        public b() {
            this.a = iz.b();
            this.b = iz.b();
            this.c = iz.b();
            this.d = iz.b();
            this.e = new bz(0.0f);
            this.f = new bz(0.0f);
            this.g = new bz(0.0f);
            this.h = new bz(0.0f);
            this.i = iz.c();
            this.j = iz.c();
            this.k = iz.c();
            this.l = iz.c();
        }

        public static float n(ez ezVar) {
            if (ezVar instanceof kz) {
                return ((kz) ezVar).a;
            }
            if (ezVar instanceof fz) {
                return ((fz) ezVar).a;
            }
            return -1.0f;
        }

        public b A(float f) {
            this.e = new bz(f);
            return this;
        }

        public b B(dz dzVar) {
            this.e = dzVar;
            return this;
        }

        public b C(int i, dz dzVar) {
            D(iz.a(i));
            F(dzVar);
            return this;
        }

        public b D(ez ezVar) {
            this.b = ezVar;
            float n = n(ezVar);
            if (n != -1.0f) {
                E(n);
            }
            return this;
        }

        public b E(float f) {
            this.f = new bz(f);
            return this;
        }

        public b F(dz dzVar) {
            this.f = dzVar;
            return this;
        }

        public lz m() {
            return new lz(this);
        }

        public b o(float f) {
            A(f);
            E(f);
            w(f);
            s(f);
            return this;
        }

        public b p(dz dzVar) {
            B(dzVar);
            F(dzVar);
            x(dzVar);
            t(dzVar);
            return this;
        }

        public b q(int i, dz dzVar) {
            r(iz.a(i));
            t(dzVar);
            return this;
        }

        public b r(ez ezVar) {
            this.d = ezVar;
            float n = n(ezVar);
            if (n != -1.0f) {
                s(n);
            }
            return this;
        }

        public b s(float f) {
            this.h = new bz(f);
            return this;
        }

        public b t(dz dzVar) {
            this.h = dzVar;
            return this;
        }

        public b u(int i, dz dzVar) {
            v(iz.a(i));
            x(dzVar);
            return this;
        }

        public b v(ez ezVar) {
            this.c = ezVar;
            float n = n(ezVar);
            if (n != -1.0f) {
                w(n);
            }
            return this;
        }

        public b w(float f) {
            this.g = new bz(f);
            return this;
        }

        public b x(dz dzVar) {
            this.g = dzVar;
            return this;
        }

        public b y(int i, dz dzVar) {
            z(iz.a(i));
            B(dzVar);
            return this;
        }

        public b z(ez ezVar) {
            this.a = ezVar;
            float n = n(ezVar);
            if (n != -1.0f) {
                A(n);
            }
            return this;
        }

        public b(lz lzVar) {
            this.a = iz.b();
            this.b = iz.b();
            this.c = iz.b();
            this.d = iz.b();
            this.e = new bz(0.0f);
            this.f = new bz(0.0f);
            this.g = new bz(0.0f);
            this.h = new bz(0.0f);
            this.i = iz.c();
            this.j = iz.c();
            this.k = iz.c();
            this.l = iz.c();
            this.a = lzVar.a;
            this.b = lzVar.b;
            this.c = lzVar.c;
            this.d = lzVar.d;
            this.e = lzVar.e;
            this.f = lzVar.f;
            this.g = lzVar.g;
            this.h = lzVar.h;
            this.i = lzVar.i;
            this.j = lzVar.j;
            this.k = lzVar.k;
            this.l = lzVar.l;
        }
    }

    public lz() {
        this.a = iz.b();
        this.b = iz.b();
        this.c = iz.b();
        this.d = iz.b();
        this.e = new bz(0.0f);
        this.f = new bz(0.0f);
        this.g = new bz(0.0f);
        this.h = new bz(0.0f);
        this.i = iz.c();
        this.j = iz.c();
        this.k = iz.c();
        this.l = iz.c();
    }
}
