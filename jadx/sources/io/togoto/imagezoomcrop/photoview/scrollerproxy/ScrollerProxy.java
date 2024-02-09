package io.togoto.imagezoomcrop.photoview.scrollerproxy;

import android.content.Context;
import android.os.Build;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class ScrollerProxy {
    public static ScrollerProxy getScroller(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 9) {
            return new PreGingerScroller(context);
        }
        if (i < 14) {
            return new GingerScroller(context);
        }
        return new IcsScroller(context);
    }

    public abstract boolean computeScrollOffset();

    public abstract void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public abstract void forceFinished(boolean z);

    public abstract int getCurrX();

    public abstract int getCurrY();

    public abstract boolean isFinished();
}
