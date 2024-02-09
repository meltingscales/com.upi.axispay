package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.r5;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: o7  reason: default package */
/* loaded from: classes.dex */
public class o7 extends View {
    public int b;
    public View c;
    public int d;

    public void a(ConstraintLayout constraintLayout) {
        if (this.c == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.c.getLayoutParams();
        bVar2.t0.g1(0);
        r5.b y = bVar.t0.y();
        r5.b bVar3 = r5.b.FIXED;
        if (y != bVar3) {
            bVar.t0.h1(bVar2.t0.U());
        }
        if (bVar.t0.R() != bVar3) {
            bVar.t0.I0(bVar2.t0.v());
        }
        bVar2.t0.g1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.b == -1 && !isInEditMode()) {
            setVisibility(this.d);
        }
        View findViewById = constraintLayout.findViewById(this.b);
        this.c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).h0 = true;
            this.c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.c;
    }

    public int getEmptyVisibility() {
        return this.d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            String a = C0059ao.a(13157);
            paint.getTextBounds(a, 0, 1, rect);
            canvas.drawText(a, ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.b == i) {
            return;
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.c.getLayoutParams()).h0 = false;
            this.c = null;
        }
        this.b = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.d = i;
    }
}
