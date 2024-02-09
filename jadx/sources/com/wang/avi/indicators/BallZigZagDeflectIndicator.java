package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BallZigZagDeflectIndicator extends BallZigZagIndicator {
    @Override // com.wang.avi.indicators.BallZigZagIndicator, com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = getWidth() / 6;
        float width2 = getWidth() / 6;
        for (final int i = 0; i < 2; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(width, getWidth() - width, width, getWidth() - width, width);
            if (i == 1) {
                ofFloat = ValueAnimator.ofFloat(getWidth() - width, width, getWidth() - width, width, getWidth() - width);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(width2, width2, getHeight() - width2, getHeight() - width2, width2);
            if (i == 1) {
                ofFloat2 = ValueAnimator.ofFloat(getHeight() - width2, getHeight() - width2, width2, width2, getHeight() - width2);
            }
            ofFloat.setDuration(2000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(-1);
            addUpdateListener(ofFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallZigZagDeflectIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallZigZagDeflectIndicator.this.translateX[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallZigZagDeflectIndicator.this.postInvalidate();
                }
            });
            ofFloat2.setDuration(2000L);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setRepeatCount(-1);
            addUpdateListener(ofFloat2, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallZigZagDeflectIndicator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallZigZagDeflectIndicator.this.translateY[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallZigZagDeflectIndicator.this.postInvalidate();
                }
            });
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
        }
        return arrayList;
    }
}
