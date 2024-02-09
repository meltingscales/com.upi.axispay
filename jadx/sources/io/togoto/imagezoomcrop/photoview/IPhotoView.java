package io.togoto.imagezoomcrop.photoview;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import io.togoto.imagezoomcrop.photoview.PhotoViewAttacher;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface IPhotoView {
    public static final float DEFAULT_MAX_SCALE = 0.0f;
    public static final float DEFAULT_MID_SCALE = 0.0f;
    public static final float DEFAULT_MIN_SCALE = 0.0f;
    public static final int DEFAULT_ROTATE_DURATION = 0;
    public static final int DEFAULT_ZOOM_DURATION = 0;

    static {
        C0059ao.a(IPhotoView.class, 66);
    }

    boolean canZoom();

    Bitmap getCroppedImage();

    Matrix getDisplayMatrix();

    RectF getDisplayRect();

    IPhotoView getIPhotoViewImplementation();

    @Deprecated
    float getMaxScale();

    float getMaximumScale();

    float getMediumScale();

    @Deprecated
    float getMidScale();

    @Deprecated
    float getMinScale();

    float getMinimumScale();

    PhotoViewAttacher.OnPhotoTapListener getOnPhotoTapListener();

    PhotoViewAttacher.OnViewTapListener getOnViewTapListener();

    float getScale();

    ImageView.ScaleType getScaleType();

    Bitmap getVisibleRectangleBitmap();

    void reset();

    void setAllowParentInterceptOnEdge(boolean z);

    boolean setDisplayMatrix(Matrix matrix);

    void setImageBoundsListener(IGetImageBounds iGetImageBounds);

    @Deprecated
    void setMaxScale(float f);

    void setMaximumScale(float f);

    void setMediumScale(float f);

    @Deprecated
    void setMidScale(float f);

    @Deprecated
    void setMinScale(float f);

    void setMinimumScale(float f);

    float setMinimumScaleToFit(Drawable drawable);

    void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener);

    void setOnLongClickListener(View.OnLongClickListener onLongClickListener);

    void setOnMatrixChangeListener(PhotoViewAttacher.OnMatrixChangedListener onMatrixChangedListener);

    void setOnPhotoTapListener(PhotoViewAttacher.OnPhotoTapListener onPhotoTapListener);

    void setOnViewTapListener(PhotoViewAttacher.OnViewTapListener onViewTapListener);

    void setPhotoViewRotation(float f);

    void setRotationBy(float f);

    void setRotationBy(float f, boolean z);

    void setRotationTo(float f);

    void setScale(float f);

    void setScale(float f, float f2, float f3, boolean z);

    void setScale(float f, boolean z);

    void setScaleType(ImageView.ScaleType scaleType);

    void setZoomTransitionDuration(int i);

    void setZoomable(boolean z);

    void update();
}
