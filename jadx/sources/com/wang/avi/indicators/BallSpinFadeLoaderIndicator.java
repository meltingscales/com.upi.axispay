package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class BallSpinFadeLoaderIndicator extends Indicator {
    public static final int ALPHA = 0;
    public static final float SCALE = 0.0f;
    public float[] scaleFloats = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    public int[] alphas = {255, 255, 255, 255, 255, 255, 255, 255};

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final class Point {
        public float x;
        public float y;

        public Point(float f, float f2) {
            this.x = f;
            this.y = f2;
        }
    }

    static {
        C0059ao.a(BallSpinFadeLoaderIndicator.class, 335);
    }

    public Point circleAt(int i, int i2, float f, double d) {
        double d2 = f;
        return new Point((float) ((i / 2) + (Math.cos(d) * d2)), (float) ((i2 / 2) + (d2 * Math.sin(d))));
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        for (int i = 0; i < 8; i++) {
            canvas.save();
            Point circleAt = circleAt(getWidth(), getHeight(), (getWidth() / 2) - width, 0.7853981633974483d * i);
            canvas.translate(circleAt.x, circleAt.y);
            float[] fArr = this.scaleFloats;
            canvas.scale(fArr[i], fArr[i]);
            paint.setAlpha(this.alphas[i]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {0, 120, 240, 360, 480, 600, 720, 780, 840};
        for (final int i = 0; i < 8; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.4f, 1.0f);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(iArr[i]);
            addUpdateListener(ofFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallSpinFadeLoaderIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallSpinFadeLoaderIndicator.this.scaleFloats[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallSpinFadeLoaderIndicator.this.postInvalidate();
                }
            });
            ValueAnimator ofInt = ValueAnimator.ofInt(255, 77, 255);
            ofInt.setDuration(1000L);
            ofInt.setRepeatCount(-1);
            ofInt.setStartDelay(iArr[i]);
            addUpdateListener(ofInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallSpinFadeLoaderIndicator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallSpinFadeLoaderIndicator.this.alphas[i] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    BallSpinFadeLoaderIndicator.this.postInvalidate();
                }
            });
            arrayList.add(ofFloat);
            arrayList.add(ofInt);
        }
        return arrayList;
    }
}
