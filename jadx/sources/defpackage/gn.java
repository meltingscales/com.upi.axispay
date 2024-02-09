package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* compiled from: AxisPay */
/* renamed from: gn  reason: default package */
/* loaded from: classes.dex */
public class gn {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 19;
        b = i >= 18;
        c = i >= 28;
    }

    public static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        rn.i(view, matrix);
        rn.j(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b2 = b(view, matrix, rectF, viewGroup);
        if (b2 != null) {
            imageView.setImageBitmap(b2);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec(round4 - round2, CommonUtils.BYTES_IN_A_GIGABYTE));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    public static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z;
        boolean z2;
        int i;
        ViewGroup viewGroup2;
        if (a) {
            z = !view.isAttachedToWindow();
            z2 = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z = false;
            z2 = false;
        }
        boolean z3 = b;
        Bitmap bitmap = null;
        if (!z3 || !z) {
            i = 0;
            viewGroup2 = null;
        } else if (!z2) {
            return null;
        } else {
            viewGroup2 = (ViewGroup) view.getParent();
            i = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int round3 = Math.round(round * min);
            int round4 = Math.round(round2 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (c) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z3 && z) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        return bitmap;
    }

    public static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
