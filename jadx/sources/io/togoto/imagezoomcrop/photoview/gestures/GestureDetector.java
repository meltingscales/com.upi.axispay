package io.togoto.imagezoomcrop.photoview.gestures;

import android.view.MotionEvent;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface GestureDetector {
    boolean isScaling();

    boolean onTouchEvent(MotionEvent motionEvent);

    void setOnGestureListener(OnGestureListener onGestureListener);
}
