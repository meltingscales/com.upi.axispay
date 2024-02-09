package com.upi.axispay.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.TransportManager;
import com.upi.axispay.R;
import com.upi.axispay.custom.CustomViewPagerr;
import com.viewpagerindicator.CirclePageIndicator;
import defpackage.y;
import java.util.Timer;
import java.util.TimerTask;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TutorialActivity extends z implements mg0, View.OnClickListener {
    public static int z;
    public TextView q;
    public TextView r;
    public TextView s;
    public CirclePageIndicator t;
    public int u;
    public CustomViewPagerr v;
    public Timer w;
    public Handler x;
    public Runnable y;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements ViewPager.j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            int unused = TutorialActivity.z = i;
            TutorialActivity.this.f0(TutorialActivity.z);
            if (TutorialActivity.z == 1) {
                TutorialActivity.this.v.setCurrentItem(TutorialActivity.z + 1, true);
                TutorialActivity.Z();
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TutorialActivity.z > TutorialActivity.this.v.getChildCount()) {
                int unused = TutorialActivity.z = 0;
            }
            TutorialActivity.this.v.setCurrentItem(TutorialActivity.z, true);
            TutorialActivity.Z();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            TutorialActivity tutorialActivity = TutorialActivity.this;
            tutorialActivity.x.post(tutorialActivity.y);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TutorialActivity.this.d0();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e implements DialogInterface.OnClickListener {
        public final /* synthetic */ d70 b;
        public final /* synthetic */ String[] c;

        public e(TutorialActivity tutorialActivity, d70 d70Var, String[] strArr) {
            this.b = d70Var;
            this.c = strArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.b.h(this.c[i]);
            TransportConstants.API_BASE_URL = this.c[i];
            TransportManager.getInstance().resetUpiService();
            dialogInterface.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f extends ee {
        public mg0 h;

        public f(FragmentManager fragmentManager, mg0 mg0Var) {
            super(fragmentManager);
            this.h = mg0Var;
        }

        @Override // defpackage.no
        public int d() {
            return 2;
        }

        @Override // defpackage.no
        public CharSequence f(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return C0059ao.a(4030);
            }
            return C0059ao.a(4031);
        }

        @Override // defpackage.ee
        public Fragment t(int i) {
            zf0 l = zf0.l(i + 1, TutorialActivity.this.u);
            l.b = this.h;
            return l;
        }
    }

    public static /* synthetic */ int Z() {
        int i = z;
        z = i + 1;
        return i;
    }

    @Override // defpackage.z, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(qh0.b(context));
    }

    public final void d0() {
        y.a aVar = new y.a(this);
        String[] stringArray = getResources().getStringArray(R.array.urls);
        d70 e2 = d70.e(this);
        String c2 = e2.c();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= stringArray.length) {
                break;
            } else if (stringArray[i2].equals(c2)) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        aVar.i(stringArray, i, new e(this, e2, stringArray));
        aVar.a().show();
    }

    public void e0(int i) {
        if (i == 1) {
            t(3, null);
        } else if (i != 2) {
        } else {
            t(2, null);
        }
    }

    public final void f0(int i) {
        String a2 = C0059ao.a(12471);
        String a3 = C0059ao.a(12472);
        if (i == 0) {
            this.q.setTextColor(t8.d(getApplicationContext(), R.color.white));
            this.r.setTextColor(t8.d(getApplicationContext(), R.color.white));
            this.s.setTextColor(t8.d(getApplicationContext(), R.color.white));
            if (this.u == 106) {
                this.s.setText(R.string.mandate_tutorial_title1);
                this.q.setText(a3);
                this.r.setText(a2);
                return;
            }
            this.s.setText(R.string.tutorial_title1);
        } else if (i != 1) {
        } else {
            this.q.setTextColor(t8.d(getApplicationContext(), R.color.white));
            this.r.setTextColor(t8.d(getApplicationContext(), R.color.white));
            if (this.u == 106) {
                this.s.setText(Html.fromHtml(getString(R.string.mandate_tutorial_title2)));
                this.q.setText(a3);
                this.r.setText(a2);
                return;
            }
            this.s.setText(R.string.tutorial_title2);
        }
    }

    @Override // defpackage.mg0
    public void m(int i, String str) {
    }

    @Override // defpackage.mg0
    public void o(int i, Object obj) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.next) {
            e0(2);
        } else if (id != R.id.skip) {
        } else {
            e0(1);
        }
    }

    @Override // defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xg0.b(this);
        setContentView(R.layout.activity_tutorial);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.u = extras.getInt(C0059ao.a(12473));
        f fVar = new f(D(), this);
        this.q = (TextView) findViewById(R.id.skip);
        this.r = (TextView) findViewById(R.id.next);
        this.s = (TextView) findViewById(R.id.tut_text);
        this.t = (CirclePageIndicator) findViewById(R.id.dots);
        CustomViewPagerr customViewPagerr = (CustomViewPagerr) findViewById(R.id.container);
        this.v = customViewPagerr;
        customViewPagerr.setAdapter(fVar);
        this.v.setScrollDurationFactor(2.0d);
        this.v.addOnPageChangeListener(new a());
        this.w = new Timer();
        this.x = new Handler();
        this.y = new b();
        this.w.schedule(new c(), 3000L, 3000L);
        this.t.setViewPager(this.v);
        f0(z);
        this.q.setOnClickListener(this);
        this.r.setOnClickListener(this);
        ((Button) findViewById(R.id.config)).setOnClickListener(new d());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // defpackage.z, defpackage.sd, android.app.Activity
    public void onDestroy() {
        this.w.cancel();
        this.x.removeCallbacks(this.y);
        this.w = null;
        this.x = null;
        this.y = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getItemId();
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.mg0
    public void t(int i, Object obj) {
        if (i == 3) {
            if (this.u == 106) {
                finish();
            } else if (n70.f.a().e(C0059ao.a(12474))) {
                Intent intent = new Intent(this, LoginActivity.class);
                intent.setFlags(268468224);
                startActivity(intent);
            } else {
                Intent intent2 = new Intent(this, LoginActivity.class);
                intent2.putExtra(C0059ao.a(12475), 22);
                intent2.setFlags(268468224);
                startActivity(intent2);
            }
        } else if (z <= 1) {
            this.v.setCurrentItem(i + 1, true);
        } else {
            t(3, null);
        }
    }
}
