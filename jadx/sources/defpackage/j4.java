package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import defpackage.n4;

/* compiled from: AxisPay */
/* renamed from: j4  reason: default package */
/* loaded from: classes.dex */
public class j4 implements l4 {
    public final RectF a = new RectF();

    /* compiled from: AxisPay */
    /* renamed from: j4$a */
    /* loaded from: classes.dex */
    public class a implements n4.a {
        public a() {
        }

        @Override // defpackage.n4.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                j4.this.a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(j4.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(j4.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(j4.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(j4.this.a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    @Override // defpackage.l4
    public float a(k4 k4Var) {
        return p(k4Var).i();
    }

    @Override // defpackage.l4
    public ColorStateList b(k4 k4Var) {
        return p(k4Var).f();
    }

    @Override // defpackage.l4
    public void c(k4 k4Var, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        n4 o = o(context, colorStateList, f, f2, f3);
        o.m(k4Var.e());
        k4Var.d(o);
        q(k4Var);
    }

    @Override // defpackage.l4
    public void d(k4 k4Var, float f) {
        p(k4Var).p(f);
        q(k4Var);
    }

    @Override // defpackage.l4
    public float e(k4 k4Var) {
        return p(k4Var).l();
    }

    @Override // defpackage.l4
    public void f() {
        n4.r = new a();
    }

    @Override // defpackage.l4
    public float g(k4 k4Var) {
        return p(k4Var).g();
    }

    @Override // defpackage.l4
    public float h(k4 k4Var) {
        return p(k4Var).j();
    }

    @Override // defpackage.l4
    public float i(k4 k4Var) {
        return p(k4Var).k();
    }

    @Override // defpackage.l4
    public void j(k4 k4Var) {
    }

    @Override // defpackage.l4
    public void k(k4 k4Var, float f) {
        p(k4Var).r(f);
    }

    @Override // defpackage.l4
    public void l(k4 k4Var) {
        p(k4Var).m(k4Var.e());
        q(k4Var);
    }

    @Override // defpackage.l4
    public void m(k4 k4Var, ColorStateList colorStateList) {
        p(k4Var).o(colorStateList);
    }

    @Override // defpackage.l4
    public void n(k4 k4Var, float f) {
        p(k4Var).q(f);
        q(k4Var);
    }

    public final n4 o(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new n4(context.getResources(), colorStateList, f, f2, f3);
    }

    public final n4 p(k4 k4Var) {
        return (n4) k4Var.g();
    }

    public void q(k4 k4Var) {
        Rect rect = new Rect();
        p(k4Var).h(rect);
        k4Var.c((int) Math.ceil(i(k4Var)), (int) Math.ceil(h(k4Var)));
        k4Var.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
