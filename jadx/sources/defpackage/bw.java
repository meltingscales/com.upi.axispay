package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bw  reason: default package */
/* loaded from: classes.dex */
public class bw {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public bw(long j, long j2) {
        this.a = 0L;
        this.b = 300L;
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
    }

    public static bw b(ValueAnimator valueAnimator) {
        bw bwVar = new bw(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        bwVar.d = valueAnimator.getRepeatCount();
        bwVar.e = valueAnimator.getRepeatMode();
        return bwVar;
    }

    public static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return tv.c;
            }
            return interpolator instanceof DecelerateInterpolator ? tv.d : interpolator;
        }
        return tv.b;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : tv.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bw) {
            bw bwVar = (bw) obj;
            if (c() == bwVar.c() && d() == bwVar.d() && g() == bwVar.g() && h() == bwVar.h()) {
                return e().getClass().equals(bwVar.e().getClass());
            }
            return false;
        }
        return false;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + bw.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + C0059ao.a(2592) + c() + C0059ao.a(2593) + d() + C0059ao.a(2594) + e().getClass() + C0059ao.a(2595) + g() + C0059ao.a(2596) + h() + C0059ao.a(2597);
    }

    public bw(long j, long j2, TimeInterpolator timeInterpolator) {
        this.a = 0L;
        this.b = 300L;
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}
