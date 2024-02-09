package io.togoto.imagezoomcrop.cropoverlay.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PaintUtil {
    private static final String DEFAULT_BACKGROUND_COLOR_ID = null;
    private static final int DEFAULT_CORNER_COLOR = 0;
    private static final float DEFAULT_CORNER_THICKNESS_DP = 0.0f;
    private static final float DEFAULT_GUIDELINE_THICKNESS_PX = 0.0f;
    private static final float DEFAULT_LINE_THICKNESS_DP = 0.0f;
    private static final String SEMI_TRANSPARENT = null;

    static {
        C0059ao.a(PaintUtil.class, 260);
    }

    public static float getCornerThickness() {
        return 5.0f;
    }

    public static float getLineThickness() {
        return 1.0f;
    }

    public static Paint newBackgroundPaint(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor(C0059ao.a(1311)));
        return paint;
    }

    public static Paint newBorderPaint(Context context) {
        float applyDimension = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor(C0059ao.a(1312)));
        paint.setStrokeWidth(applyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    public static Paint newCornerPaint(Context context) {
        float applyDimension = TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStrokeWidth(applyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    public static Paint newGuidelinePaint() {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor(C0059ao.a(1313)));
        paint.setStrokeWidth(2.0f);
        return paint;
    }
}
