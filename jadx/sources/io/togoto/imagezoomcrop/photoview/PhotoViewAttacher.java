package io.togoto.imagezoomcrop.photoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import io.togoto.imagezoomcrop.cropoverlay.edge.Edge;
import io.togoto.imagezoomcrop.cropoverlay.utils.ImageViewUtil;
import io.togoto.imagezoomcrop.photoview.gestures.OnGestureListener;
import io.togoto.imagezoomcrop.photoview.gestures.VersionedGestureDetector;
import io.togoto.imagezoomcrop.photoview.scrollerproxy.ScrollerProxy;
import java.lang.ref.WeakReference;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class PhotoViewAttacher implements IPhotoView, View.OnTouchListener, OnGestureListener, ViewTreeObserver.OnGlobalLayoutListener {
    private static final boolean DEBUG;
    public static final int EDGE_BOTH = 0;
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_NONE = 0;
    public static final int EDGE_RIGHT = 0;
    private static final String LOG_TAG = null;
    public static final Interpolator sInterpolator;
    public IGetImageBounds mBoundsListener;
    private FlingRunnable mCurrentFlingRunnable;
    private GestureDetector mGestureDetector;
    private WeakReference<ImageView> mImageView;
    private int mIvBottom;
    private int mIvLeft;
    private int mIvRight;
    private int mIvTop;
    private View.OnLongClickListener mLongClickListener;
    private OnMatrixChangedListener mMatrixChangeListener;
    private OnPhotoTapListener mPhotoTapListener;
    private float mRotation;
    private io.togoto.imagezoomcrop.photoview.gestures.GestureDetector mScaleDragDetector;
    private OnViewTapListener mViewTapListener;
    private boolean mZoomEnabled;
    public int ZOOM_DURATION = 200;
    private float mMinScale = 1.0f;
    private float mMidScale = 1.75f;
    private float mMaxScale = 3.0f;
    private boolean mAllowParentInterceptOnEdge = true;
    private final Matrix mBaseMatrix = new Matrix();
    private final Matrix mDrawMatrix = new Matrix();
    private final Matrix mSuppMatrix = new Matrix();
    private final RectF mDisplayRect = new RectF();
    private final float[] mMatrixValues = new float[9];
    private int mScrollEdge = 2;
    private ImageView.ScaleType mScaleType = ImageView.ScaleType.FIT_CENTER;

    /* compiled from: AxisPay */
    /* renamed from: io.togoto.imagezoomcrop.photoview.PhotoViewAttacher$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class AnimatedRotateRunnable implements Runnable {
        private final float mFocalX;
        private final float mFocalY;
        private final float mRotationEnd;
        private float mRotationProgress;
        private final float mRotationStart;
        private final long mStartTime = System.currentTimeMillis();

        public AnimatedRotateRunnable(float f, float f2, float f3, float f4) {
            this.mRotationStart = f;
            this.mRotationEnd = f2;
            this.mFocalX = f3;
            this.mFocalY = f4;
        }

        private float interpolate() {
            return PhotoViewAttacher.sInterpolator.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.mStartTime)) * 1.0f) / 250.0f));
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView = PhotoViewAttacher.this.getImageView();
            if (imageView == null) {
                return;
            }
            float interpolate = interpolate();
            float f = (this.mRotationEnd - this.mRotationStart) * interpolate;
            float f2 = f - this.mRotationProgress;
            this.mRotationProgress = f;
            PhotoViewAttacher.this.mSuppMatrix.postRotate(f2, this.mFocalX, this.mFocalY);
            PhotoViewAttacher.this.checkAndDisplayMatrix();
            if (interpolate < 1.0f) {
                Compat.postOnAnimation(imageView, this);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class AnimatedZoomRunnable implements Runnable {
        private final float mFocalX;
        private final float mFocalY;
        private final long mStartTime = System.currentTimeMillis();
        private final float mZoomEnd;
        private final float mZoomStart;

        public AnimatedZoomRunnable(float f, float f2, float f3, float f4) {
            this.mFocalX = f3;
            this.mFocalY = f4;
            this.mZoomStart = f;
            this.mZoomEnd = f2;
        }

        private float interpolate() {
            return PhotoViewAttacher.sInterpolator.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.mStartTime)) * 1.0f) / PhotoViewAttacher.this.ZOOM_DURATION));
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView = PhotoViewAttacher.this.getImageView();
            if (imageView == null) {
                return;
            }
            float interpolate = interpolate();
            float f = this.mZoomStart;
            float scale = (f + ((this.mZoomEnd - f) * interpolate)) / PhotoViewAttacher.this.getScale();
            PhotoViewAttacher.this.mSuppMatrix.postScale(scale, scale, this.mFocalX, this.mFocalY);
            PhotoViewAttacher.this.checkAndDisplayMatrix();
            if (interpolate < 1.0f) {
                Compat.postOnAnimation(imageView, this);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class FlingRunnable implements Runnable {
        private int mCurrentX;
        private int mCurrentY;
        private final ScrollerProxy mScroller;

        public FlingRunnable(Context context) {
            this.mScroller = ScrollerProxy.getScroller(context);
        }

        public void cancelFling() {
            boolean unused = PhotoViewAttacher.DEBUG;
            this.mScroller.forceFinished(true);
        }

        public void fling(int i, int i2, int i3, int i4) {
            RectF displayRect = PhotoViewAttacher.this.getDisplayRect();
            if (displayRect == null) {
                return;
            }
            int round = Math.round(-displayRect.left);
            int round2 = Math.round(-displayRect.top);
            this.mCurrentX = round;
            this.mCurrentY = round2;
            if (PhotoViewAttacher.DEBUG) {
                String str = C0059ao.a(1551) + round + C0059ao.a(1552) + round2 + C0059ao.a(1553) + round + C0059ao.a(1554) + round2;
            }
            if (round == round && round2 == round2) {
                return;
            }
            this.mScroller.fling(round, round2, i3, i4, round, round, round2, round2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            if (this.mScroller.isFinished() || (imageView = PhotoViewAttacher.this.getImageView()) == null || !this.mScroller.computeScrollOffset()) {
                return;
            }
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (PhotoViewAttacher.DEBUG) {
                String str = C0059ao.a(1555) + this.mCurrentX + C0059ao.a(1556) + this.mCurrentY + C0059ao.a(1557) + currX + C0059ao.a(1558) + currY;
            }
            PhotoViewAttacher.this.mSuppMatrix.postTranslate(this.mCurrentX - currX, this.mCurrentY - currY);
            PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
            photoViewAttacher.setImageViewMatrix(photoViewAttacher.getDrawMatrix());
            this.mCurrentX = currX;
            this.mCurrentY = currY;
            Compat.postOnAnimation(imageView, this);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface OnMatrixChangedListener {
        void onMatrixChanged(RectF rectF);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface OnPhotoTapListener {
        void onPhotoTap(View view, float f, float f2);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface OnViewTapListener {
        void onViewTap(View view, float f, float f2);
    }

    static {
        C0059ao.a(PhotoViewAttacher.class, 192);
        DEBUG = Log.isLoggable(C0059ao.a(9621), 3);
        sInterpolator = new AccelerateDecelerateInterpolator();
    }

    public PhotoViewAttacher(ImageView imageView) {
        this.mImageView = new WeakReference<>(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        imageView.getViewTreeObserver();
        setImageViewScaleTypeMatrix(imageView);
        if (imageView.isInEditMode()) {
            return;
        }
        this.mScaleDragDetector = VersionedGestureDetector.newInstance(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: io.togoto.imagezoomcrop.photoview.PhotoViewAttacher.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                if (PhotoViewAttacher.this.mLongClickListener != null) {
                    PhotoViewAttacher.this.mLongClickListener.onLongClick(PhotoViewAttacher.this.getImageView());
                }
            }
        });
        this.mGestureDetector = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new DefaultOnDoubleTapListener(this));
        setZoomable(true);
    }

    private void cancelFling() {
        FlingRunnable flingRunnable = this.mCurrentFlingRunnable;
        if (flingRunnable != null) {
            flingRunnable.cancelFling();
            this.mCurrentFlingRunnable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndDisplayMatrix() {
        if (checkMatrixBounds()) {
            setImageViewMatrix(getDrawMatrix());
        }
    }

    private void checkImageViewScaleType() {
        ImageView imageView = getImageView();
        if (imageView != null && !(imageView instanceof IPhotoView) && !ImageView.ScaleType.MATRIX.equals(imageView.getScaleType())) {
            throw new IllegalStateException(C0059ao.a(9622));
        }
    }

    private boolean checkMatrixBounds() {
        RectF displayRect;
        float f;
        float f2;
        float f3;
        float f4;
        ImageView imageView = getImageView();
        if (imageView == null || (displayRect = getDisplayRect(getDrawMatrix())) == null) {
            return false;
        }
        float height = displayRect.height();
        float width = displayRect.width();
        Rect imageBounds = getImageBounds();
        int height2 = imageBounds.height();
        getImageViewHeight(imageView);
        float f5 = height2;
        float f6 = 0.0f;
        if (height <= f5) {
            int i = AnonymousClass2.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    f = (f5 - height) - displayRect.top;
                }
                f = 0.0f;
            } else {
                f2 = displayRect.top;
                f = -f2;
            }
        } else {
            float f7 = displayRect.top;
            int i2 = imageBounds.top;
            if (f7 > i2) {
                f2 = f7 - i2;
                f = -f2;
            } else {
                float f8 = displayRect.bottom;
                int i3 = imageBounds.bottom;
                if (f8 < i3) {
                    f = i3 - f8;
                }
                f = 0.0f;
            }
        }
        float width2 = imageBounds.width();
        if (width <= width2) {
            int i4 = AnonymousClass2.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i4 != 2) {
                if (i4 != 3) {
                    f3 = (width2 - width) / 2.0f;
                    f4 = displayRect.left;
                } else {
                    f3 = width2 - width;
                    f4 = displayRect.left;
                }
                f6 = f3 - f4;
            } else {
                f6 = -displayRect.left;
            }
            this.mScrollEdge = 2;
        } else {
            float f9 = displayRect.left;
            int i5 = imageBounds.left;
            if (f9 > i5) {
                this.mScrollEdge = 0;
                f6 = -(f9 - i5);
            } else {
                float f10 = displayRect.right;
                int i6 = imageBounds.right;
                if (f10 < i6) {
                    f6 = i6 - f10;
                    this.mScrollEdge = 1;
                } else {
                    this.mScrollEdge = -1;
                }
            }
        }
        this.mSuppMatrix.postTranslate(f6, f);
        return true;
    }

    private static void checkZoomLevels(float f, float f2, float f3) {
    }

    private int getImageViewHeight(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    private int getImageViewWidth(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private float getValue(Matrix matrix, int i) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i];
    }

    private static boolean hasDrawable(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    private static boolean isSupportedScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (AnonymousClass2.$SwitchMap$android$widget$ImageView$ScaleType[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + C0059ao.a(9623));
    }

    private void resetMatrix() {
        this.mRotation = 0.0f;
        this.mSuppMatrix.reset();
        setImageViewMatrix(getDrawMatrix());
        checkMatrixBounds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageViewMatrix(Matrix matrix) {
        RectF displayRect;
        ImageView imageView = getImageView();
        if (imageView != null) {
            checkImageViewScaleType();
            imageView.setImageMatrix(matrix);
            if (this.mMatrixChangeListener == null || (displayRect = getDisplayRect(matrix)) == null) {
                return;
            }
            this.mMatrixChangeListener.onMatrixChanged(displayRect);
        }
    }

    private static void setImageViewScaleTypeMatrix(ImageView imageView) {
        if (imageView == null || (imageView instanceof IPhotoView) || ImageView.ScaleType.MATRIX.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void updateBaseMatrix(Drawable drawable) {
        ImageView imageView = getImageView();
        if (imageView == null || drawable == null) {
            return;
        }
        float imageViewWidth = getImageViewWidth(imageView);
        float imageViewHeight = getImageViewHeight(imageView);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.mBaseMatrix.reset();
        float f = intrinsicWidth;
        float f2 = imageViewWidth / f;
        float f3 = intrinsicHeight;
        float f4 = imageViewHeight / f3;
        ImageView.ScaleType scaleType = this.mScaleType;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.mBaseMatrix.postTranslate((imageViewWidth - f) / 2.0f, (imageViewHeight - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f2, f4);
            this.mBaseMatrix.postScale(max, max);
            this.mBaseMatrix.postTranslate((imageViewWidth - (f * max)) / 2.0f, (imageViewHeight - (f3 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f2, f4));
            this.mBaseMatrix.postScale(min, min);
            this.mBaseMatrix.postTranslate((imageViewWidth - (f * min)) / 2.0f, (imageViewHeight - (f3 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, imageViewWidth, imageViewHeight);
            int i = AnonymousClass2.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i == 2) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 5) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        resetMatrix();
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public boolean canZoom() {
        return this.mZoomEnabled;
    }

    public void cleanup() {
        WeakReference<ImageView> weakReference = this.mImageView;
        if (weakReference == null) {
            return;
        }
        ImageView imageView = weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            cancelFling();
        }
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.mMatrixChangeListener = null;
        this.mPhotoTapListener = null;
        this.mViewTapListener = null;
        this.mImageView = null;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public Bitmap getCroppedImage() {
        Bitmap visibleRectangleBitmap = getVisibleRectangleBitmap();
        Rect bitmapRectCenterInside = ImageViewUtil.getBitmapRectCenterInside(visibleRectangleBitmap, getImageView());
        float width = visibleRectangleBitmap.getWidth() / bitmapRectCenterInside.width();
        float height = visibleRectangleBitmap.getHeight() / bitmapRectCenterInside.height();
        return Bitmap.createBitmap(visibleRectangleBitmap, (int) ((Edge.LEFT.getCoordinate() - bitmapRectCenterInside.left) * width), (int) ((Edge.TOP.getCoordinate() - bitmapRectCenterInside.top) * height), (int) (Edge.getWidth() * width), (int) (Edge.getHeight() * height));
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public Matrix getDisplayMatrix() {
        return new Matrix(getDrawMatrix());
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public RectF getDisplayRect() {
        checkMatrixBounds();
        return getDisplayRect(getDrawMatrix());
    }

    public Matrix getDrawMatrix() {
        this.mDrawMatrix.set(this.mBaseMatrix);
        this.mDrawMatrix.postConcat(this.mSuppMatrix);
        return this.mDrawMatrix;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public IPhotoView getIPhotoViewImplementation() {
        return this;
    }

    public Rect getImageBounds() {
        if (getImageView() == null) {
            return new Rect();
        }
        IGetImageBounds iGetImageBounds = this.mBoundsListener;
        if (iGetImageBounds != null) {
            return iGetImageBounds.getImageBounds();
        }
        return new Rect(getImageViewWidth(getImageView()), 0, 0, getImageViewHeight(getImageView()));
    }

    public ImageView getImageView() {
        WeakReference<ImageView> weakReference = this.mImageView;
        ImageView imageView = weakReference != null ? weakReference.get() : null;
        if (imageView == null) {
            cleanup();
        }
        return imageView;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    @Deprecated
    public float getMaxScale() {
        return getMaximumScale();
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public float getMaximumScale() {
        return this.mMaxScale;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public float getMediumScale() {
        return this.mMidScale;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    @Deprecated
    public float getMidScale() {
        return getMediumScale();
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    @Deprecated
    public float getMinScale() {
        return getMinimumScale();
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public float getMinimumScale() {
        return this.mMinScale;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public OnPhotoTapListener getOnPhotoTapListener() {
        return this.mPhotoTapListener;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public OnViewTapListener getOnViewTapListener() {
        return this.mViewTapListener;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public float getScale() {
        return (float) Math.sqrt(((float) Math.pow(getValue(this.mSuppMatrix, 0), 2.0d)) + ((float) Math.pow(getValue(this.mSuppMatrix, 3), 2.0d)));
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public Bitmap getVisibleRectangleBitmap() {
        ImageView imageView = getImageView();
        if (imageView == null) {
            return null;
        }
        Bitmap drawingCache = imageView.getDrawingCache();
        if (drawingCache == null) {
            Bitmap createBitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), Bitmap.Config.RGB_565);
            imageView.draw(new Canvas(createBitmap));
            return createBitmap;
        }
        return drawingCache;
    }

    @Override // io.togoto.imagezoomcrop.photoview.gestures.OnGestureListener
    public void onDrag(float f, float f2) {
        if (this.mScaleDragDetector.isScaling()) {
            return;
        }
        if (DEBUG) {
            String.format(C0059ao.a(9624), Float.valueOf(f), Float.valueOf(f2));
        }
        ImageView imageView = getImageView();
        this.mSuppMatrix.postTranslate(f, f2);
        checkAndDisplayMatrix();
        ViewParent parent = imageView.getParent();
        if (!this.mAllowParentInterceptOnEdge || this.mScaleDragDetector.isScaling()) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i = this.mScrollEdge;
        if ((i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // io.togoto.imagezoomcrop.photoview.gestures.OnGestureListener
    public void onFling(float f, float f2, float f3, float f4) {
        if (DEBUG) {
            String str = C0059ao.a(9625) + f + C0059ao.a(9626) + f2 + C0059ao.a(9627) + f3 + C0059ao.a(9628) + f4;
        }
        ImageView imageView = getImageView();
        FlingRunnable flingRunnable = new FlingRunnable(imageView.getContext());
        this.mCurrentFlingRunnable = flingRunnable;
        flingRunnable.fling(getImageViewWidth(imageView), getImageViewHeight(imageView), (int) f3, (int) f4);
        imageView.post(this.mCurrentFlingRunnable);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ImageView imageView = getImageView();
        if (imageView != null) {
            if (this.mZoomEnabled) {
                int top = imageView.getTop();
                int right = imageView.getRight();
                int bottom = imageView.getBottom();
                int left = imageView.getLeft();
                if (top == this.mIvTop && bottom == this.mIvBottom && left == this.mIvLeft && right == this.mIvRight) {
                    return;
                }
                updateBaseMatrix(imageView.getDrawable());
                this.mIvTop = top;
                this.mIvRight = right;
                this.mIvBottom = bottom;
                this.mIvLeft = left;
                return;
            }
            updateBaseMatrix(imageView.getDrawable());
        }
    }

    @Override // io.togoto.imagezoomcrop.photoview.gestures.OnGestureListener
    public void onScale(float f, float f2, float f3) {
        if (DEBUG) {
            String.format(C0059ao.a(9629), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
        }
        if (getScale() < this.mMaxScale || f < 1.0f) {
            this.mSuppMatrix.postScale(f, f, f2, f3);
            checkAndDisplayMatrix();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        RectF displayRect;
        boolean z = false;
        if (this.mZoomEnabled && hasDrawable((ImageView) view)) {
            ViewParent parent = view.getParent();
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action == 1 || action == 3) && getScale() < this.mMinScale && (displayRect = getDisplayRect()) != null) {
                    view.post(new AnimatedZoomRunnable(getScale(), this.mMinScale, displayRect.centerX(), displayRect.centerY()));
                    z = true;
                }
            } else {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                cancelFling();
            }
            io.togoto.imagezoomcrop.photoview.gestures.GestureDetector gestureDetector = this.mScaleDragDetector;
            if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
                z = true;
            }
            GestureDetector gestureDetector2 = this.mGestureDetector;
            if (gestureDetector2 != null && gestureDetector2.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return z;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void reset() {
        update();
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setAllowParentInterceptOnEdge(boolean z) {
        this.mAllowParentInterceptOnEdge = z;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public boolean setDisplayMatrix(Matrix matrix) {
        if (matrix != null) {
            ImageView imageView = getImageView();
            if (imageView == null || imageView.getDrawable() == null) {
                return false;
            }
            this.mSuppMatrix.set(matrix);
            setImageViewMatrix(getDrawMatrix());
            checkMatrixBounds();
            return true;
        }
        throw new IllegalArgumentException(C0059ao.a(9630));
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setImageBoundsListener(IGetImageBounds iGetImageBounds) {
        this.mBoundsListener = iGetImageBounds;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    @Deprecated
    public void setMaxScale(float f) {
        setMaximumScale(f);
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setMaximumScale(float f) {
        checkZoomLevels(this.mMinScale, this.mMidScale, f);
        this.mMaxScale = f;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setMediumScale(float f) {
        checkZoomLevels(this.mMinScale, f, this.mMaxScale);
        this.mMidScale = f;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    @Deprecated
    public void setMidScale(float f) {
        setMediumScale(f);
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    @Deprecated
    public void setMinScale(float f) {
        setMinimumScale(f);
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setMinimumScale(float f) {
        checkZoomLevels(f, this.mMidScale, this.mMaxScale);
        this.mMinScale = f;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public float setMinimumScaleToFit(Drawable drawable) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = Edge.getWidth();
        float height = Edge.getHeight();
        float f = 1.0f;
        if (intrinsicHeight <= intrinsicWidth) {
            f = (height + 1.0f) / intrinsicHeight;
        } else if (intrinsicWidth < intrinsicHeight) {
            f = (width + 1.0f) / intrinsicWidth;
        }
        setMinimumScale(f);
        return f;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.mGestureDetector.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.mGestureDetector.setOnDoubleTapListener(new DefaultOnDoubleTapListener(this));
        }
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mLongClickListener = onLongClickListener;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.mMatrixChangeListener = onMatrixChangedListener;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.mPhotoTapListener = onPhotoTapListener;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.mViewTapListener = onViewTapListener;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setPhotoViewRotation(float f) {
        setRotationTo(f);
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setRotationBy(float f) {
        setRotationBy(f, false);
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setRotationTo(float f) {
        Rect imageBounds = getImageBounds();
        this.mSuppMatrix.setRotate(f % 360.0f, imageBounds.centerX(), imageBounds.centerY());
        checkAndDisplayMatrix();
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setScale(float f) {
        setScale(f, false);
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!isSupportedScaleType(scaleType) || scaleType == this.mScaleType) {
            return;
        }
        this.mScaleType = scaleType;
        update();
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setZoomTransitionDuration(int i) {
        if (i < 0) {
            i = 200;
        }
        this.ZOOM_DURATION = i;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setZoomable(boolean z) {
        this.mZoomEnabled = z;
        update();
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void update() {
        ImageView imageView = getImageView();
        if (imageView != null) {
            if (this.mZoomEnabled) {
                setImageViewScaleTypeMatrix(imageView);
                updateBaseMatrix(imageView.getDrawable());
            } else {
                resetMatrix();
            }
            setScale(getMinimumScale());
        }
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setRotationBy(float f, boolean z) {
        ImageView imageView = getImageView();
        if (imageView == null) {
            return;
        }
        Rect imageBounds = getImageBounds();
        int centerX = imageBounds.centerX();
        int centerY = imageBounds.centerY();
        float f2 = this.mRotation;
        float f3 = f % 360.0f;
        if (f3 == 0.0f) {
            this.mRotation = 0.0f;
        } else {
            this.mRotation = (f2 + f3) % 360.0f;
        }
        if (z) {
            imageView.post(new AnimatedRotateRunnable(f2, f3, centerX, centerY));
            return;
        }
        this.mSuppMatrix.postRotate(f3, centerX, centerY);
        checkAndDisplayMatrix();
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setScale(float f, boolean z) {
        ImageView imageView = getImageView();
        if (imageView != null) {
            setScale(f, imageView.getRight() / 2, imageView.getBottom() / 2, z);
        }
    }

    private RectF getDisplayRect(Matrix matrix) {
        Drawable drawable;
        ImageView imageView = getImageView();
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return null;
        }
        this.mDisplayRect.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.mDisplayRect);
        return this.mDisplayRect;
    }

    @Override // io.togoto.imagezoomcrop.photoview.IPhotoView
    public void setScale(float f, float f2, float f3, boolean z) {
        ImageView imageView = getImageView();
        if (imageView == null || f < this.mMinScale || f > this.mMaxScale) {
            return;
        }
        if (z) {
            imageView.post(new AnimatedZoomRunnable(getScale(), f, f2, f3));
            return;
        }
        this.mSuppMatrix.setScale(f, f, f2, f3);
        checkAndDisplayMatrix();
    }
}
