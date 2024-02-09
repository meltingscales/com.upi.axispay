package com.upi.axispay.activity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.olive.upi.transport.OliveRequest;
import com.upi.axispay.R;
import java.util.Arrays;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SplashActivity extends c90 implements m70, fh0 {
    public LinearLayout D;
    public LinearLayout E;
    public boolean F;
    public boolean G;
    public Animation H;
    public n70 I;
    public gh0 J;
    public String K = C0059ao.a(9076);
    public List<String> L = Arrays.asList(C0059ao.a(9077), C0059ao.a(9078), C0059ao.a(9079), C0059ao.a(9080), C0059ao.a(9081));

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            SplashActivity.this.F = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SplashActivity splashActivity = SplashActivity.this;
            splashActivity.F = false;
            splashActivity.G = true;
            splashActivity.f0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SplashActivity splashActivity = SplashActivity.this;
            splashActivity.F = true;
            splashActivity.D.setVisibility(0);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b(SplashActivity splashActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 16) {
                SplashActivity.this.E.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                SplashActivity.this.E.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            SplashActivity.this.g0();
        }
    }

    @Override // defpackage.fh0
    public void d(boolean z) {
        if (z) {
            String join = TextUtils.join(C0059ao.a(9082), this.L);
            this.K = join;
            eg0.l(this, C0059ao.a(9083), join, new b(this));
            return;
        }
        hh0.a.b(this.J);
        h0();
    }

    public final void f0() {
        if (this.G) {
            if (n70.f.a().e(C0059ao.a(9084))) {
                startActivity(new Intent(this, LoginActivity.class));
            } else {
                startActivity(new Intent(this, LanguageActivity.class));
            }
            finish();
        }
    }

    public final void g0() {
        int left = (this.E.getLeft() + this.E.getRight()) / 2;
        int top = (this.E.getTop() + this.E.getBottom()) / 2;
        int max = Math.max(this.E.getWidth(), this.E.getHeight());
        if (Build.VERSION.SDK_INT >= 21) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.D, left, top, 0, max);
            createCircularReveal.setStartDelay(700L);
            createCircularReveal.setDuration(700L);
            createCircularReveal.addListener(new a());
            createCircularReveal.start();
            return;
        }
        f0();
    }

    @Override // defpackage.fh0
    public void h(boolean z) {
    }

    public final void h0() {
        this.E.getViewTreeObserver().addOnGlobalLayoutListener(new c());
        ch0 a2 = ch0.e.a();
        n70 a3 = n70.f.a();
        this.I = a3;
        a3.C(this);
        this.I.r(a2.g());
        this.I.p(this);
        ua0.e(this).q(new OliveRequest(86, 80, Boolean.FALSE, true));
    }

    @Override // defpackage.fh0
    public void k(boolean z) {
    }

    @Override // defpackage.m70
    public void n(int i) {
        if (i != 1) {
            d70.e(this).a();
            n70.f.a().c(C0059ao.a(9085));
        }
        f0();
    }

    @Override // defpackage.c90, defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        ImageView imageView = (ImageView) findViewById(R.id.splash_icon);
        this.D = (LinearLayout) findViewById(R.id.logo_layout);
        this.E = (LinearLayout) findViewById(R.id.outer_layout);
        gh0 gh0Var = new gh0(this);
        this.J = gh0Var;
        hh0.a.a(this, gh0Var);
    }

    @Override // defpackage.c90, defpackage.z, defpackage.sd, android.app.Activity
    public void onDestroy() {
        Animation animation;
        super.onDestroy();
        if (!this.F || (animation = this.H) == null) {
            return;
        }
        animation.cancel();
    }

    @Override // defpackage.fh0
    public void q(boolean z) {
    }

    @Override // defpackage.fh0
    public void v(boolean z) {
    }
}
