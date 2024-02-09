package io.togoto.imagezoomcrop.cropoverlay.utils;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ImageViewUtil {
    public static Rect getBitmapRectCenterInside(Bitmap bitmap, View view) {
        return getBitmapRectCenterInsideHelper(bitmap.getWidth(), bitmap.getHeight(), view.getWidth(), view.getHeight());
    }

    private static Rect getBitmapRectCenterInsideHelper(int i, int i2, int i3, int i4) {
        double d;
        double d2;
        long round;
        int i5;
        double d3 = i3 < i ? i3 / i : Double.POSITIVE_INFINITY;
        double d4 = i4 < i2 ? i4 / i2 : Double.POSITIVE_INFINITY;
        if (d3 == Double.POSITIVE_INFINITY && d4 == Double.POSITIVE_INFINITY) {
            d = i2;
            d2 = i;
        } else if (d3 <= d4) {
            double d5 = i3;
            double d6 = (i2 * d5) / i;
            d2 = d5;
            d = d6;
        } else {
            d = i4;
            d2 = (i * d) / i2;
        }
        double d7 = i3;
        int i6 = 0;
        if (d2 == d7) {
            round = Math.round((i4 - d) / 2.0d);
        } else {
            double d8 = i4;
            if (d == d8) {
                i6 = (int) Math.round((d7 - d2) / 2.0d);
                i5 = 0;
                return new Rect(i6, i5, ((int) Math.ceil(d2)) + i6, ((int) Math.ceil(d)) + i5);
            }
            i6 = (int) Math.round((d7 - d2) / 2.0d);
            round = Math.round((d8 - d) / 2.0d);
        }
        i5 = (int) round;
        return new Rect(i6, i5, ((int) Math.ceil(d2)) + i6, ((int) Math.ceil(d)) + i5);
    }

    public static Rect getBitmapRectCenterInside(int i, int i2, int i3, int i4) {
        return getBitmapRectCenterInsideHelper(i, i2, i3, i4);
    }
}
