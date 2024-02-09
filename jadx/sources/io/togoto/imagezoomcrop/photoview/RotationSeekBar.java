package io.togoto.imagezoomcrop.photoview;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RotationSeekBar extends SeekBar {
    private static final int DEFAULT_MAX = 0;
    private static final int DEFAULT_PROGRESS = 0;
    private OnRotationSeekBarChangeListener mRotationListener;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class OnRotationSeekBarChangeListener implements SeekBar.OnSeekBarChangeListener {
        private float mPreviousProgress;

        public OnRotationSeekBarChangeListener(RotationSeekBar rotationSeekBar) {
            this.mPreviousProgress = rotationSeekBar.getProgress();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            float fromProgressToDegrees = RotationSeekBar.fromProgressToDegrees(i);
            float f = i;
            onRotationProgressChanged((RotationSeekBar) seekBar, fromProgressToDegrees, (f - this.mPreviousProgress) / 10.0f, z);
            this.mPreviousProgress = f;
        }

        public abstract void onRotationProgressChanged(RotationSeekBar rotationSeekBar, float f, float f2, boolean z);

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        public void resetPreviousProgress() {
            this.mPreviousProgress = 1800.0f;
        }
    }

    static {
        C0059ao.a(RotationSeekBar.class, 194);
    }

    public RotationSeekBar(Context context) {
        super(context);
        init();
    }

    private static int fromDegreesToProgress(float f) {
        return (int) ((f + 180.0f) * 10.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float fromProgressToDegrees(int i) {
        return (i - 1800) / 10.0f;
    }

    private void init() {
        setMax(SettingsJsonConstants.SETTINGS_CACHE_DURATION_DEFAULT);
        setProgress(1800);
    }

    public float getRotationProgress() {
        return fromProgressToDegrees(getProgress());
    }

    public void reset() {
        init();
        this.mRotationListener.resetPreviousProgress();
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (onSeekBarChangeListener != null && !(onSeekBarChangeListener instanceof OnRotationSeekBarChangeListener)) {
            throw new IllegalArgumentException(C0059ao.a(1776));
        }
        this.mRotationListener = (OnRotationSeekBarChangeListener) onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setRotationProgress(float f) {
        if (f < -180.0f || f > 180.0f) {
            throw new IllegalArgumentException(C0059ao.a(1777));
        }
        if (f == 0.0f) {
            reset();
        } else {
            setProgress(fromDegreesToProgress(f));
        }
    }

    public RotationSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public RotationSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @TargetApi(21)
    public RotationSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }
}
