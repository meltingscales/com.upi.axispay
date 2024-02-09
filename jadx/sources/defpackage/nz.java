package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisPay */
/* renamed from: nz  reason: default package */
/* loaded from: classes.dex */
public class nz {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    public final List<f> g = new ArrayList();
    public final List<g> h = new ArrayList();
    public boolean i;

    /* compiled from: AxisPay */
    /* renamed from: nz$a */
    /* loaded from: classes.dex */
    public class a extends g {
        public final /* synthetic */ List b;
        public final /* synthetic */ Matrix c;

        public a(nz nzVar, List list, Matrix matrix) {
            this.b = list;
            this.c = matrix;
        }

        @Override // defpackage.nz.g
        public void a(Matrix matrix, zy zyVar, int i, Canvas canvas) {
            for (g gVar : this.b) {
                gVar.a(this.c, zyVar, i, canvas);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: nz$b */
    /* loaded from: classes.dex */
    public static class b extends g {
        public final d b;

        public b(d dVar) {
            this.b = dVar;
        }

        @Override // defpackage.nz.g
        public void a(Matrix matrix, zy zyVar, int i, Canvas canvas) {
            zyVar.a(canvas, matrix, new RectF(this.b.k(), this.b.o(), this.b.l(), this.b.j()), i, this.b.m(), this.b.n());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: nz$c */
    /* loaded from: classes.dex */
    public static class c extends g {
        public final e b;
        public final float c;
        public final float d;

        public c(e eVar, float f, float f2) {
            this.b = eVar;
            this.c = f;
            this.d = f2;
        }

        @Override // defpackage.nz.g
        public void a(Matrix matrix, zy zyVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.b.c - this.d, this.b.b - this.c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.d);
            matrix2.preRotate(c());
            zyVar.b(canvas, matrix2, rectF, i);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.b.c - this.d) / (this.b.b - this.c)));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: nz$d */
    /* loaded from: classes.dex */
    public static class d extends f {
        public static final RectF h = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public d(float f, float f2, float f3, float f4) {
            q(f);
            u(f2);
            r(f3);
            p(f4);
        }

        @Override // defpackage.nz.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.e;
        }

        public final float k() {
            return this.b;
        }

        public final float l() {
            return this.d;
        }

        public final float m() {
            return this.f;
        }

        public final float n() {
            return this.g;
        }

        public final float o() {
            return this.c;
        }

        public final void p(float f) {
            this.e = f;
        }

        public final void q(float f) {
            this.b = f;
        }

        public final void r(float f) {
            this.d = f;
        }

        public final void s(float f) {
            this.f = f;
        }

        public final void t(float f) {
            this.g = f;
        }

        public final void u(float f) {
            this.c = f;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: nz$e */
    /* loaded from: classes.dex */
    public static class e extends f {
        public float b;
        public float c;

        @Override // defpackage.nz.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: nz$f */
    /* loaded from: classes.dex */
    public static abstract class f {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: AxisPay */
    /* renamed from: nz$g */
    /* loaded from: classes.dex */
    public static abstract class g {
        public static final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, zy zyVar, int i, Canvas canvas);

        public final void b(zy zyVar, int i, Canvas canvas) {
            a(a, zyVar, i, canvas);
        }
    }

    public nz() {
        n(0.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public final void b(float f2) {
        if (g() == f2) {
            return;
        }
        float g2 = ((f2 - g()) + 360.0f) % 360.0f;
        if (g2 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g2);
        this.h.add(new b(dVar));
        p(f2);
    }

    public final void c(g gVar, float f2, float f3) {
        b(f2);
        this.h.add(gVar);
        p(f3);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    public boolean e() {
        return this.i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(this, new ArrayList(this.h), new Matrix(matrix));
    }

    public final float g() {
        return this.e;
    }

    public final float h() {
        return this.f;
    }

    public float i() {
        return this.c;
    }

    public float j() {
        return this.d;
    }

    public float k() {
        return this.a;
    }

    public float l() {
        return this.b;
    }

    public void m(float f2, float f3) {
        e eVar = new e();
        eVar.b = f2;
        eVar.c = f3;
        this.g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f2);
        s(f3);
    }

    public void n(float f2, float f3) {
        o(f2, f3, 270.0f, 0.0f);
    }

    public void o(float f2, float f3, float f4, float f5) {
        t(f2);
        u(f3);
        r(f2);
        s(f3);
        p(f4);
        q((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }

    public final void p(float f2) {
        this.e = f2;
    }

    public final void q(float f2) {
        this.f = f2;
    }

    public final void r(float f2) {
        this.c = f2;
    }

    public final void s(float f2) {
        this.d = f2;
    }

    public final void t(float f2) {
        this.a = f2;
    }

    public final void u(float f2) {
        this.b = f2;
    }
}
