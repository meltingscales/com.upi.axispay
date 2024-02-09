package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import defpackage.n4;

/* compiled from: AxisPay */
/* renamed from: h4  reason: default package */
/* loaded from: classes.dex */
public class h4 extends j4 {

    /* compiled from: AxisPay */
    /* renamed from: h4$a */
    /* loaded from: classes.dex */
    public class a implements n4.a {
        public a(h4 h4Var) {
        }

        @Override // defpackage.n4.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // defpackage.j4, defpackage.l4
    public void f() {
        n4.r = new a(this);
    }
}
