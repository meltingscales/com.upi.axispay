package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.Fragment;
import defpackage.aa;
import defpackage.ke;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: td  reason: default package */
/* loaded from: classes.dex */
public class td {

    /* compiled from: AxisPay */
    /* renamed from: td$a */
    /* loaded from: classes.dex */
    public class a implements aa.a {
        public final /* synthetic */ Fragment a;

        public a(Fragment fragment) {
            this.a = fragment;
        }

        @Override // defpackage.aa.a
        public void a() {
            if (this.a.getAnimatingAway() != null) {
                View animatingAway = this.a.getAnimatingAway();
                this.a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.a.setAnimator(null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td$b */
    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ Fragment b;
        public final /* synthetic */ ke.g c;
        public final /* synthetic */ aa d;

        /* compiled from: AxisPay */
        /* renamed from: td$b$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b.getAnimatingAway() != null) {
                    b.this.b.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.c.a(bVar.b, bVar.d);
                }
            }
        }

        public b(ViewGroup viewGroup, Fragment fragment, ke.g gVar, aa aaVar) {
            this.a = viewGroup;
            this.b = fragment;
            this.c = gVar;
            this.d = aaVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Fragment c;
        public final /* synthetic */ ke.g d;
        public final /* synthetic */ aa e;

        public c(ViewGroup viewGroup, View view, Fragment fragment, ke.g gVar, aa aaVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
            this.d = gVar;
            this.e = aaVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            Animator animator2 = this.c.getAnimator();
            this.c.setAnimator(null);
            if (animator2 == null || this.a.indexOfChild(this.b) >= 0) {
                return;
            }
            this.d.a(this.c, this.e);
        }
    }

    public static void a(Fragment fragment, d dVar, ke.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        aa aaVar = new aa();
        aaVar.c(new a(fragment));
        gVar.b(fragment, aaVar);
        if (dVar.a != null) {
            e eVar = new e(dVar.a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, aaVar));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, aaVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    public static int b(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    public static d c(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int b2 = b(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = nd.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, b2);
            if (onCreateAnimation != null) {
                return new d(onCreateAnimation);
            }
            Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, b2);
            if (onCreateAnimator != null) {
                return new d(onCreateAnimator);
            }
            if (b2 == 0 && nextTransition != 0) {
                b2 = d(nextTransition, z);
            }
            if (b2 != 0) {
                boolean equals = C0059ao.a(2894).equals(context.getResources().getResourceTypeName(b2));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, b2);
                        if (loadAnimation != null) {
                            return new d(loadAnimation);
                        }
                        z3 = true;
                    } catch (Resources.NotFoundException e2) {
                        throw e2;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z3) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, b2);
                        if (loadAnimator != null) {
                            return new d(loadAnimator);
                        }
                    } catch (RuntimeException e3) {
                        if (!equals) {
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b2);
                            if (loadAnimation2 != null) {
                                return new d(loadAnimation2);
                            }
                        } else {
                            throw e3;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static int d(int i, boolean z) {
        if (i == 4097) {
            return z ? md.fragment_open_enter : md.fragment_open_exit;
        } else if (i == 4099) {
            return z ? md.fragment_fade_enter : md.fragment_fade_exit;
        } else if (i != 8194) {
            return -1;
        } else {
            return z ? md.fragment_close_enter : md.fragment_close_exit;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td$d */
    /* loaded from: classes.dex */
    public static class d {
        public final Animation a;
        public final Animator b;

        public d(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException(C0059ao.a(13984));
            }
        }

        public d(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException(C0059ao.a(13983));
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: td$e */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {
        public final ViewGroup b;
        public final View c;
        public boolean d;
        public boolean e;
        public boolean f;

        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f = true;
            this.b = viewGroup;
            this.c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.d = true;
                xb.a(this.b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.d && this.f) {
                this.f = false;
                this.b.post(this);
                return;
            }
            this.b.endViewTransition(this.c);
            this.e = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.d = true;
                xb.a(this.b, this);
            }
            return true;
        }
    }
}
