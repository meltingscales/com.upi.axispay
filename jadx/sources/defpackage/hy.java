package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: hy  reason: default package */
/* loaded from: classes.dex */
public final class hy {
    public final ArrayList<b> a = new ArrayList<>();
    public b b = null;
    public ValueAnimator c = null;
    public final Animator.AnimatorListener d = new a();

    /* compiled from: AxisPay */
    /* renamed from: hy$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            hy hyVar = hy.this;
            if (hyVar.c == animator) {
                hyVar.c = null;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: hy$b */
    /* loaded from: classes.dex */
    public static class b {
        public final int[] a;
        public final ValueAnimator b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(bVar);
    }

    public final void b() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
    }

    public void c() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.a.get(i);
            if (StateSet.stateSetMatches(bVar.a, iArr)) {
                break;
            }
            i++;
        }
        b bVar2 = this.b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }

    public final void e(b bVar) {
        ValueAnimator valueAnimator = bVar.b;
        this.c = valueAnimator;
        valueAnimator.start();
    }
}
