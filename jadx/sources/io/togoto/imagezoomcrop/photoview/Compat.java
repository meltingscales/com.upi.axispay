package io.togoto.imagezoomcrop.photoview;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Compat {
    private static final int SIXTY_FPS_INTERVAL = 0;

    static {
        C0059ao.a(Compat.class, 229);
    }

    public static int getPointerIndex(int i) {
        if (Build.VERSION.SDK_INT >= 11) {
            return getPointerIndexHoneyComb(i);
        }
        return getPointerIndexEclair(i);
    }

    @TargetApi(5)
    private static int getPointerIndexEclair(int i) {
        return (i & 65280) >> 8;
    }

    @TargetApi(11)
    private static int getPointerIndexHoneyComb(int i) {
        return (i & 65280) >> 8;
    }

    public static void postOnAnimation(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            postOnAnimationJellyBean(view, runnable);
        } else {
            view.postDelayed(runnable, 16L);
        }
    }

    @TargetApi(16)
    private static void postOnAnimationJellyBean(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
