package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* compiled from: AxisPay */
/* renamed from: l2  reason: default package */
/* loaded from: classes.dex */
public class l2 extends RatingBar {
    public final j2 b;

    public l2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.b.b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public l2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j3.a(this, getContext());
        j2 j2Var = new j2(this);
        this.b = j2Var;
        j2Var.c(attributeSet, i);
    }
}
