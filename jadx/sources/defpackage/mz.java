package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: AxisPay */
/* renamed from: mz  reason: default package */
/* loaded from: classes.dex */
public class mz {
    public final nz[] a = new nz[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final nz g = new nz();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public boolean l = true;

    /* compiled from: AxisPay */
    /* renamed from: mz$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final mz a = new mz();
    }

    /* compiled from: AxisPay */
    /* renamed from: mz$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(nz nzVar, Matrix matrix, int i);

        void b(nz nzVar, Matrix matrix, int i);
    }

    /* compiled from: AxisPay */
    /* renamed from: mz$c */
    /* loaded from: classes.dex */
    public static final class c {
        public final lz a;
        public final Path b;
        public final RectF c;
        public final b d;
        public final float e;

        public c(lz lzVar, float f, RectF rectF, b bVar, Path path) {
            this.d = bVar;
            this.a = lzVar;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    public mz() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new nz();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static mz k() {
        return a.a;
    }

    public final float a(int i) {
        return (i + 1) * 90;
    }

    public final void b(c cVar, int i) {
        this.h[0] = this.a[i].k();
        this.h[1] = this.a[i].l();
        this.b[i].mapPoints(this.h);
        if (i == 0) {
            Path path = cVar.b;
            float[] fArr = this.h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.b;
            float[] fArr2 = this.h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i].d(this.b[i], cVar.b);
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.b(this.a[i], this.b[i], i);
        }
    }

    public final void c(c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        this.i[0] = this.a[i2].k();
        this.i[1] = this.a[i2].l();
        this.b[i2].mapPoints(this.i);
        float[] fArr = this.h;
        float f = fArr[0];
        float[] fArr2 = this.i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float i3 = i(cVar.c, i);
        this.g.n(0.0f, 0.0f);
        gz j = j(i, cVar.a);
        j.b(max, i3, cVar.e, this.g);
        this.j.reset();
        this.g.d(this.c[i], this.j);
        if (this.l && Build.VERSION.SDK_INT >= 19 && (j.a() || l(this.j, i) || l(this.j, i2))) {
            Path path = this.j;
            path.op(path, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.k();
            this.h[1] = this.g.l();
            this.c[i].mapPoints(this.h);
            Path path2 = this.e;
            float[] fArr3 = this.h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.g.d(this.c[i], this.e);
        } else {
            this.g.d(this.c[i], cVar.b);
        }
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.a(this.g, this.c[i], i);
        }
    }

    public void d(lz lzVar, float f, RectF rectF, Path path) {
        e(lzVar, f, rectF, null, path);
    }

    public void e(lz lzVar, float f, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(lzVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m(cVar, i);
            n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(cVar, i2);
            c(cVar, i2);
        }
        path.close();
        this.e.close();
        if (Build.VERSION.SDK_INT < 19 || this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }

    public final void f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final dz g(int i, lz lzVar) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return lzVar.t();
                }
                return lzVar.r();
            }
            return lzVar.j();
        }
        return lzVar.l();
    }

    public final ez h(int i, lz lzVar) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return lzVar.s();
                }
                return lzVar.q();
            }
            return lzVar.i();
        }
        return lzVar.k();
    }

    public final float i(RectF rectF, int i) {
        float[] fArr = this.h;
        nz[] nzVarArr = this.a;
        fArr[0] = nzVarArr[i].c;
        fArr[1] = nzVarArr[i].d;
        this.b[i].mapPoints(fArr);
        if (i != 1 && i != 3) {
            return Math.abs(rectF.centerY() - this.h[1]);
        }
        return Math.abs(rectF.centerX() - this.h[0]);
    }

    public final gz j(int i, lz lzVar) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return lzVar.o();
                }
                return lzVar.p();
            }
            return lzVar.n();
        }
        return lzVar.h();
    }

    public final boolean l(Path path, int i) {
        this.k.reset();
        this.a[i].d(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public final void m(c cVar, int i) {
        h(i, cVar.a).b(this.a[i], 90.0f, cVar.e, cVar.c, g(i, cVar.a));
        float a2 = a(i);
        this.b[i].reset();
        f(i, cVar.c, this.d);
        Matrix matrix = this.b[i];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i].preRotate(a2);
    }

    public final void n(int i) {
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        float a2 = a(i);
        this.c[i].reset();
        Matrix matrix = this.c[i];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i].preRotate(a2);
    }
}
