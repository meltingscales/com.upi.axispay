package com.nineoldandroids.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.nineoldandroids.animation.Animator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ValueAnimator extends Animator {
    public static final int ANIMATION_FRAME = 0;
    public static final int ANIMATION_START = 0;
    private static final long DEFAULT_FRAME_DELAY = 0;
    public static final int INFINITE = 0;
    public static final int RESTART = 0;
    public static final int REVERSE = 0;
    public static final int RUNNING = 0;
    public static final int SEEKED = 0;
    public static final int STOPPED = 0;
    private static ThreadLocal<AnimationHandler> sAnimationHandler;
    private static final ThreadLocal<ArrayList<ValueAnimator>> sAnimations;
    private static final Interpolator sDefaultInterpolator;
    private static final ThreadLocal<ArrayList<ValueAnimator>> sDelayedAnims;
    private static final ThreadLocal<ArrayList<ValueAnimator>> sEndingAnims;
    private static final TypeEvaluator sFloatEvaluator;
    private static long sFrameDelay;
    private static final TypeEvaluator sIntEvaluator;
    private static final ThreadLocal<ArrayList<ValueAnimator>> sPendingAnimations;
    private static final ThreadLocal<ArrayList<ValueAnimator>> sReadyAnims;
    private long mDelayStartTime;
    public long mStartTime;
    public PropertyValuesHolder[] mValues;
    public HashMap<String, PropertyValuesHolder> mValuesMap;
    public long mSeekTime = -1;
    private boolean mPlayingBackwards = false;
    private int mCurrentIteration = 0;
    private float mCurrentFraction = 0.0f;
    private boolean mStartedDelay = false;
    public int mPlayingState = 0;
    private boolean mRunning = false;
    private boolean mStarted = false;
    public boolean mInitialized = false;
    private long mDuration = 300;
    private long mStartDelay = 0;
    private int mRepeatCount = 0;
    private int mRepeatMode = 1;
    private Interpolator mInterpolator = sDefaultInterpolator;
    private ArrayList<AnimatorUpdateListener> mUpdateListeners = null;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class AnimationHandler extends Handler {
        private AnimationHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z;
            ArrayList arrayList = (ArrayList) ValueAnimator.sAnimations.get();
            ArrayList arrayList2 = (ArrayList) ValueAnimator.sDelayedAnims.get();
            int i = message.what;
            if (i == 0) {
                ArrayList arrayList3 = (ArrayList) ValueAnimator.sPendingAnimations.get();
                z = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ValueAnimator valueAnimator = (ValueAnimator) arrayList4.get(i2);
                        if (valueAnimator.mStartDelay == 0) {
                            valueAnimator.startAnimation();
                        } else {
                            arrayList2.add(valueAnimator);
                        }
                    }
                }
            } else if (i != 1) {
                return;
            } else {
                z = true;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            ArrayList arrayList5 = (ArrayList) ValueAnimator.sReadyAnims.get();
            ArrayList arrayList6 = (ArrayList) ValueAnimator.sEndingAnims.get();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ValueAnimator valueAnimator2 = (ValueAnimator) arrayList2.get(i3);
                if (valueAnimator2.delayedAnimationFrame(currentAnimationTimeMillis)) {
                    arrayList5.add(valueAnimator2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i4 = 0; i4 < size3; i4++) {
                    ValueAnimator valueAnimator3 = (ValueAnimator) arrayList5.get(i4);
                    valueAnimator3.startAnimation();
                    valueAnimator3.mRunning = true;
                    arrayList2.remove(valueAnimator3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i5 = 0;
            while (i5 < size4) {
                ValueAnimator valueAnimator4 = (ValueAnimator) arrayList.get(i5);
                if (valueAnimator4.animationFrame(currentAnimationTimeMillis)) {
                    arrayList6.add(valueAnimator4);
                }
                if (arrayList.size() == size4) {
                    i5++;
                } else {
                    size4--;
                    arrayList6.remove(valueAnimator4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                    ((ValueAnimator) arrayList6.get(i6)).endAnimation();
                }
                arrayList6.clear();
            }
            if (z) {
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                sendEmptyMessageDelayed(1, Math.max(0L, ValueAnimator.sFrameDelay - (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface AnimatorUpdateListener {
        void onAnimationUpdate(ValueAnimator valueAnimator);
    }

    static {
        C0059ao.a(ValueAnimator.class, 104);
        sAnimationHandler = new ThreadLocal<>();
        sAnimations = new ThreadLocal<ArrayList<ValueAnimator>>() { // from class: com.nineoldandroids.animation.ValueAnimator.1
            @Override // java.lang.ThreadLocal
            public ArrayList<ValueAnimator> initialValue() {
                return new ArrayList<>();
            }
        };
        sPendingAnimations = new ThreadLocal<ArrayList<ValueAnimator>>() { // from class: com.nineoldandroids.animation.ValueAnimator.2
            @Override // java.lang.ThreadLocal
            public ArrayList<ValueAnimator> initialValue() {
                return new ArrayList<>();
            }
        };
        sDelayedAnims = new ThreadLocal<ArrayList<ValueAnimator>>() { // from class: com.nineoldandroids.animation.ValueAnimator.3
            @Override // java.lang.ThreadLocal
            public ArrayList<ValueAnimator> initialValue() {
                return new ArrayList<>();
            }
        };
        sEndingAnims = new ThreadLocal<ArrayList<ValueAnimator>>() { // from class: com.nineoldandroids.animation.ValueAnimator.4
            @Override // java.lang.ThreadLocal
            public ArrayList<ValueAnimator> initialValue() {
                return new ArrayList<>();
            }
        };
        sReadyAnims = new ThreadLocal<ArrayList<ValueAnimator>>() { // from class: com.nineoldandroids.animation.ValueAnimator.5
            @Override // java.lang.ThreadLocal
            public ArrayList<ValueAnimator> initialValue() {
                return new ArrayList<>();
            }
        };
        sDefaultInterpolator = new AccelerateDecelerateInterpolator();
        sIntEvaluator = new IntEvaluator();
        sFloatEvaluator = new FloatEvaluator();
        sFrameDelay = 10L;
    }

    public static void clearAllAnimations() {
        sAnimations.get().clear();
        sPendingAnimations.get().clear();
        sDelayedAnims.get().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean delayedAnimationFrame(long j) {
        if (!this.mStartedDelay) {
            this.mStartedDelay = true;
            this.mDelayStartTime = j;
            return false;
        }
        long j2 = j - this.mDelayStartTime;
        long j3 = this.mStartDelay;
        if (j2 > j3) {
            this.mStartTime = j - (j2 - j3);
            this.mPlayingState = 1;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endAnimation() {
        ArrayList<Animator.AnimatorListener> arrayList;
        sAnimations.get().remove(this);
        sPendingAnimations.get().remove(this);
        sDelayedAnims.get().remove(this);
        this.mPlayingState = 0;
        if (this.mRunning && (arrayList = this.mListeners) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((Animator.AnimatorListener) arrayList2.get(i)).onAnimationEnd(this);
            }
        }
        this.mRunning = false;
        this.mStarted = false;
    }

    public static int getCurrentAnimationsCount() {
        return sAnimations.get().size();
    }

    public static long getFrameDelay() {
        return sFrameDelay;
    }

    public static ValueAnimator ofFloat(float... fArr) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(fArr);
        return valueAnimator;
    }

    public static ValueAnimator ofInt(int... iArr) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iArr);
        return valueAnimator;
    }

    public static ValueAnimator ofObject(TypeEvaluator typeEvaluator, Object... objArr) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setObjectValues(objArr);
        valueAnimator.setEvaluator(typeEvaluator);
        return valueAnimator;
    }

    public static ValueAnimator ofPropertyValuesHolder(PropertyValuesHolder... propertyValuesHolderArr) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(propertyValuesHolderArr);
        return valueAnimator;
    }

    public static void setFrameDelay(long j) {
        sFrameDelay = j;
    }

    private void start(boolean z) {
        if (Looper.myLooper() != null) {
            this.mPlayingBackwards = z;
            this.mCurrentIteration = 0;
            this.mPlayingState = 0;
            this.mStarted = true;
            this.mStartedDelay = false;
            sPendingAnimations.get().add(this);
            if (this.mStartDelay == 0) {
                setCurrentPlayTime(getCurrentPlayTime());
                this.mPlayingState = 0;
                this.mRunning = true;
                ArrayList<Animator.AnimatorListener> arrayList = this.mListeners;
                if (arrayList != null) {
                    ArrayList arrayList2 = (ArrayList) arrayList.clone();
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        ((Animator.AnimatorListener) arrayList2.get(i)).onAnimationStart(this);
                    }
                }
            }
            AnimationHandler animationHandler = sAnimationHandler.get();
            if (animationHandler == null) {
                animationHandler = new AnimationHandler();
                sAnimationHandler.set(animationHandler);
            }
            animationHandler.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException(C0059ao.a(14458));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAnimation() {
        ArrayList<Animator.AnimatorListener> arrayList;
        initAnimation();
        sAnimations.get().add(this);
        if (this.mStartDelay <= 0 || (arrayList = this.mListeners) == null) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((Animator.AnimatorListener) arrayList2.get(i)).onAnimationStart(this);
        }
    }

    public void addUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        if (this.mUpdateListeners == null) {
            this.mUpdateListeners = new ArrayList<>();
        }
        this.mUpdateListeners.add(animatorUpdateListener);
    }

    public void animateValue(float f) {
        float interpolation = this.mInterpolator.getInterpolation(f);
        this.mCurrentFraction = interpolation;
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].calculateValue(interpolation);
        }
        ArrayList<AnimatorUpdateListener> arrayList = this.mUpdateListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mUpdateListeners.get(i2).onAnimationUpdate(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean animationFrame(long r11) {
        /*
            r10 = this;
            int r0 = r10.mPlayingState
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L1a
            r10.mPlayingState = r3
            long r4 = r10.mSeekTime
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L12
            r10.mStartTime = r11
            goto L1a
        L12:
            long r4 = r11 - r4
            r10.mStartTime = r4
            r4 = -1
            r10.mSeekTime = r4
        L1a:
            int r0 = r10.mPlayingState
            r4 = 2
            r5 = 0
            if (r0 == r3) goto L23
            if (r0 == r4) goto L23
            goto L81
        L23:
            long r6 = r10.mDuration
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L32
            long r8 = r10.mStartTime
            long r11 = r11 - r8
            float r11 = (float) r11
            float r12 = (float) r6
            float r11 = r11 / r12
            goto L33
        L32:
            r11 = r1
        L33:
            int r12 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r12 < 0) goto L76
            int r12 = r10.mCurrentIteration
            int r0 = r10.mRepeatCount
            if (r12 < r0) goto L46
            r12 = -1
            if (r0 != r12) goto L41
            goto L46
        L41:
            float r11 = java.lang.Math.min(r11, r1)
            goto L77
        L46:
            java.util.ArrayList<com.nineoldandroids.animation.Animator$AnimatorListener> r12 = r10.mListeners
            if (r12 == 0) goto L5f
            int r12 = r12.size()
            r0 = r5
        L4f:
            if (r0 >= r12) goto L5f
            java.util.ArrayList<com.nineoldandroids.animation.Animator$AnimatorListener> r2 = r10.mListeners
            java.lang.Object r2 = r2.get(r0)
            com.nineoldandroids.animation.Animator$AnimatorListener r2 = (com.nineoldandroids.animation.Animator.AnimatorListener) r2
            r2.onAnimationRepeat(r10)
            int r0 = r0 + 1
            goto L4f
        L5f:
            int r12 = r10.mRepeatMode
            if (r12 != r4) goto L68
            boolean r12 = r10.mPlayingBackwards
            r12 = r12 ^ r3
            r10.mPlayingBackwards = r12
        L68:
            int r12 = r10.mCurrentIteration
            int r0 = (int) r11
            int r12 = r12 + r0
            r10.mCurrentIteration = r12
            float r11 = r11 % r1
            long r2 = r10.mStartTime
            long r6 = r10.mDuration
            long r2 = r2 + r6
            r10.mStartTime = r2
        L76:
            r3 = r5
        L77:
            boolean r12 = r10.mPlayingBackwards
            if (r12 == 0) goto L7d
            float r11 = r1 - r11
        L7d:
            r10.animateValue(r11)
            r5 = r3
        L81:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nineoldandroids.animation.ValueAnimator.animationFrame(long):boolean");
    }

    @Override // com.nineoldandroids.animation.Animator
    public void cancel() {
        ArrayList<Animator.AnimatorListener> arrayList;
        if (this.mPlayingState != 0 || sPendingAnimations.get().contains(this) || sDelayedAnims.get().contains(this)) {
            if (this.mRunning && (arrayList = this.mListeners) != null) {
                Iterator it = ((ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
                }
            }
            endAnimation();
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public void end() {
        if (!sAnimations.get().contains(this) && !sPendingAnimations.get().contains(this)) {
            this.mStartedDelay = false;
            startAnimation();
        } else if (!this.mInitialized) {
            initAnimation();
        }
        int i = this.mRepeatCount;
        if (i > 0 && (i & 1) == 1) {
            animateValue(0.0f);
        } else {
            animateValue(1.0f);
        }
        endAnimation();
    }

    public float getAnimatedFraction() {
        return this.mCurrentFraction;
    }

    public Object getAnimatedValue() {
        PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr == null || propertyValuesHolderArr.length <= 0) {
            return null;
        }
        return propertyValuesHolderArr[0].getAnimatedValue();
    }

    public long getCurrentPlayTime() {
        if (!this.mInitialized || this.mPlayingState == 0) {
            return 0L;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.mStartTime;
    }

    @Override // com.nineoldandroids.animation.Animator
    public long getDuration() {
        return this.mDuration;
    }

    public Interpolator getInterpolator() {
        return this.mInterpolator;
    }

    public int getRepeatCount() {
        return this.mRepeatCount;
    }

    public int getRepeatMode() {
        return this.mRepeatMode;
    }

    @Override // com.nineoldandroids.animation.Animator
    public long getStartDelay() {
        return this.mStartDelay;
    }

    public PropertyValuesHolder[] getValues() {
        return this.mValues;
    }

    public void initAnimation() {
        if (this.mInitialized) {
            return;
        }
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].init();
        }
        this.mInitialized = true;
    }

    @Override // com.nineoldandroids.animation.Animator
    public boolean isRunning() {
        return this.mPlayingState == 1 || this.mRunning;
    }

    @Override // com.nineoldandroids.animation.Animator
    public boolean isStarted() {
        return this.mStarted;
    }

    public void removeAllUpdateListeners() {
        ArrayList<AnimatorUpdateListener> arrayList = this.mUpdateListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        this.mUpdateListeners = null;
    }

    public void removeUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        ArrayList<AnimatorUpdateListener> arrayList = this.mUpdateListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorUpdateListener);
        if (this.mUpdateListeners.size() == 0) {
            this.mUpdateListeners = null;
        }
    }

    public void reverse() {
        this.mPlayingBackwards = !this.mPlayingBackwards;
        if (this.mPlayingState == 1) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mStartTime = currentAnimationTimeMillis - (this.mDuration - (currentAnimationTimeMillis - this.mStartTime));
            return;
        }
        start(true);
    }

    public void setCurrentPlayTime(long j) {
        initAnimation();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.mPlayingState != 1) {
            this.mSeekTime = j;
            this.mPlayingState = 2;
        }
        this.mStartTime = currentAnimationTimeMillis - j;
        animationFrame(currentAnimationTimeMillis);
    }

    public void setEvaluator(TypeEvaluator typeEvaluator) {
        PropertyValuesHolder[] propertyValuesHolderArr;
        if (typeEvaluator == null || (propertyValuesHolderArr = this.mValues) == null || propertyValuesHolderArr.length <= 0) {
            return;
        }
        propertyValuesHolderArr[0].setEvaluator(typeEvaluator);
    }

    public void setFloatValues(float... fArr) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr == null || propertyValuesHolderArr.length == 0) {
            setValues(PropertyValuesHolder.ofFloat(C0059ao.a(14460), fArr));
        } else {
            propertyValuesHolderArr[0].setFloatValues(fArr);
        }
        this.mInitialized = false;
    }

    public void setIntValues(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr == null || propertyValuesHolderArr.length == 0) {
            setValues(PropertyValuesHolder.ofInt(C0059ao.a(14461), iArr));
        } else {
            propertyValuesHolderArr[0].setIntValues(iArr);
        }
        this.mInitialized = false;
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setInterpolator(Interpolator interpolator) {
        if (interpolator != null) {
            this.mInterpolator = interpolator;
        } else {
            this.mInterpolator = new LinearInterpolator();
        }
    }

    public void setObjectValues(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr == null || propertyValuesHolderArr.length == 0) {
            setValues(PropertyValuesHolder.ofObject(C0059ao.a(14462), (TypeEvaluator) null, objArr));
        } else {
            propertyValuesHolderArr[0].setObjectValues(objArr);
        }
        this.mInitialized = false;
    }

    public void setRepeatCount(int i) {
        this.mRepeatCount = i;
    }

    public void setRepeatMode(int i) {
        this.mRepeatMode = i;
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setStartDelay(long j) {
        this.mStartDelay = j;
    }

    public void setValues(PropertyValuesHolder... propertyValuesHolderArr) {
        int length = propertyValuesHolderArr.length;
        this.mValues = propertyValuesHolderArr;
        this.mValuesMap = new HashMap<>(length);
        for (PropertyValuesHolder propertyValuesHolder : propertyValuesHolderArr) {
            this.mValuesMap.put(propertyValuesHolder.getPropertyName(), propertyValuesHolder);
        }
        this.mInitialized = false;
    }

    public String toString() {
        String str = C0059ao.a(14463) + Integer.toHexString(hashCode());
        if (this.mValues != null) {
            for (int i = 0; i < this.mValues.length; i++) {
                str = str + C0059ao.a(14464) + this.mValues[i].toString();
            }
        }
        return str;
    }

    @Override // com.nineoldandroids.animation.Animator
    public ValueAnimator setDuration(long j) {
        if (j >= 0) {
            this.mDuration = j;
            return this;
        }
        throw new IllegalArgumentException(C0059ao.a(14459) + j);
    }

    @Override // com.nineoldandroids.animation.Animator
    /* renamed from: clone */
    public ValueAnimator mo236clone() {
        ValueAnimator valueAnimator = (ValueAnimator) super.mo236clone();
        ArrayList<AnimatorUpdateListener> arrayList = this.mUpdateListeners;
        if (arrayList != null) {
            valueAnimator.mUpdateListeners = new ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                valueAnimator.mUpdateListeners.add(arrayList.get(i));
            }
        }
        valueAnimator.mSeekTime = -1L;
        valueAnimator.mPlayingBackwards = false;
        valueAnimator.mCurrentIteration = 0;
        valueAnimator.mInitialized = false;
        valueAnimator.mPlayingState = 0;
        valueAnimator.mStartedDelay = false;
        PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr != null) {
            int length = propertyValuesHolderArr.length;
            valueAnimator.mValues = new PropertyValuesHolder[length];
            valueAnimator.mValuesMap = new HashMap<>(length);
            for (int i2 = 0; i2 < length; i2++) {
                PropertyValuesHolder mo240clone = propertyValuesHolderArr[i2].mo240clone();
                valueAnimator.mValues[i2] = mo240clone;
                valueAnimator.mValuesMap.put(mo240clone.getPropertyName(), mo240clone);
            }
        }
        return valueAnimator;
    }

    public Object getAnimatedValue(String str) {
        PropertyValuesHolder propertyValuesHolder = this.mValuesMap.get(str);
        if (propertyValuesHolder != null) {
            return propertyValuesHolder.getAnimatedValue();
        }
        return null;
    }

    @Override // com.nineoldandroids.animation.Animator
    public void start() {
        start(false);
    }
}
