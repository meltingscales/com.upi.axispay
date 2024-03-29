package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BallPulseSyncIndicator extends Indicator {
    public float[] translateYFloats = new float[3];

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = (getWidth() - 8.0f) / 6.0f;
        float f = 2.0f * width;
        float width2 = (getWidth() / 2) - (f + 4.0f);
        for (int i = 0; i < 3; i++) {
            canvas.save();
            float f2 = i;
            canvas.translate((f * f2) + width2 + (f2 * 4.0f), this.translateYFloats[i]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = (getWidth() - 8.0f) / 6.0f;
        int[] iArr = {70, 140, 210};
        for (final int i = 0; i < 3; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getHeight() / 2, (getHeight() / 2) - (2.0f * width), getHeight() / 2);
            ofFloat.setDuration(600L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(iArr[i]);
            addUpdateListener(ofFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallPulseSyncIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallPulseSyncIndicator.this.translateYFloats[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallPulseSyncIndicator.this.postInvalidate();
                }
            });
            arrayList.add(ofFloat);
        }
        return arrayList;
    }
}
