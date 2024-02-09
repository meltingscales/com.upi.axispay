package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.uh;
import defpackage.yh;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ch  reason: default package */
/* loaded from: classes.dex */
public class ch extends c0 {
    public static final boolean R = Log.isLoggable(C0059ao.a(3041), 3);
    public ImageButton A;
    public Button B;
    public ImageView C;
    public View D;
    public ImageView E;
    public TextView F;
    public TextView G;
    public String H;
    public MediaControllerCompat I;
    public e J;
    public MediaDescriptionCompat K;
    public d L;
    public Bitmap M;
    public Uri N;
    public boolean O;
    public Bitmap P;
    public int Q;
    public final yh d;
    public final g e;
    public xh f;
    public yh.i g;
    public final List<yh.i> h;
    public final List<yh.i> i;
    public final List<yh.i> j;
    public final List<yh.i> k;
    public Context l;
    public boolean m;
    public boolean n;
    public long o;
    public final Handler p;
    public RecyclerView q;
    public h r;
    public j s;
    public Map<String, f> t;
    public yh.i u;
    public Map<String, Integer> v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: AxisPay */
    /* renamed from: ch$a */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                ch.this.v();
            } else if (i != 2) {
            } else {
                ch chVar = ch.this;
                if (chVar.u != null) {
                    chVar.u = null;
                    chVar.w();
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ch$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ch.this.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ch$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ch.this.g.B()) {
                ch.this.d.r(2);
            }
            ch.this.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ch$d */
    /* loaded from: classes.dex */
    public class d extends AsyncTask<Void, Void, Bitmap> {
        public final Bitmap a;
        public final Uri b;
        public int c;

        public d() {
            MediaDescriptionCompat mediaDescriptionCompat = ch.this.K;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            if (ch.h(iconBitmap)) {
                Log.w(C0059ao.a(1606), C0059ao.a(1607));
                iconBitmap = null;
            }
            this.a = iconBitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = ch.this.K;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r10) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ch.d.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        public Bitmap b() {
            return this.a;
        }

        public Uri c() {
            return this.b;
        }

        @Override // android.os.AsyncTask
        /* renamed from: d */
        public void onPostExecute(Bitmap bitmap) {
            ch chVar = ch.this;
            chVar.L = null;
            if (ya.a(chVar.M, this.a) && ya.a(ch.this.N, this.b)) {
                return;
            }
            ch chVar2 = ch.this;
            chVar2.M = this.a;
            chVar2.P = bitmap;
            chVar2.N = this.b;
            chVar2.Q = this.c;
            chVar2.O = true;
            chVar2.s();
        }

        public final InputStream e(Uri uri) throws IOException {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if (!C0059ao.a(1611).equals(lowerCase) && !C0059ao.a(1612).equals(lowerCase) && !C0059ao.a(1613).equals(lowerCase)) {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(30000);
                openConnection.setReadTimeout(30000);
                openInputStream = openConnection.getInputStream();
            } else {
                openInputStream = ch.this.l.getContentResolver().openInputStream(uri);
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            ch.this.f();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ch$e */
    /* loaded from: classes.dex */
    public final class e extends MediaControllerCompat.Callback {
        public e() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            ch.this.K = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            ch.this.m();
            ch.this.s();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            ch chVar = ch.this;
            MediaControllerCompat mediaControllerCompat = chVar.I;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(chVar.J);
                ch.this.I = null;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ch$f */
    /* loaded from: classes.dex */
    public abstract class f extends RecyclerView.d0 {
        public yh.i v;
        public final ImageButton w;
        public final MediaRouteVolumeSlider x;

        /* compiled from: AxisPay */
        /* renamed from: ch$f$a */
        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ch chVar = ch.this;
                if (chVar.u != null) {
                    chVar.p.removeMessages(2);
                }
                f fVar = f.this;
                ch.this.u = fVar.v;
                boolean z = !view.isActivated();
                int P = z ? 0 : f.this.P();
                f.this.Q(z);
                f.this.x.setProgress(P);
                f.this.v.F(P);
                ch.this.p.sendEmptyMessageDelayed(2, 500L);
            }
        }

        public f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            this.w = imageButton;
            this.x = mediaRouteVolumeSlider;
            imageButton.setImageDrawable(dh.k(ch.this.l));
            dh.v(ch.this.l, mediaRouteVolumeSlider);
        }

        public void O(yh.i iVar) {
            this.v = iVar;
            int r = iVar.r();
            this.w.setActivated(r == 0);
            this.w.setOnClickListener(new a());
            this.x.setTag(this.v);
            this.x.setMax(iVar.t());
            this.x.setProgress(r);
            this.x.setOnSeekBarChangeListener(ch.this.s);
        }

        public int P() {
            Integer num = ch.this.v.get(this.v.j());
            if (num == null) {
                return 1;
            }
            return Math.max(1, num.intValue());
        }

        public void Q(boolean z) {
            if (this.w.isActivated() == z) {
                return;
            }
            this.w.setActivated(z);
            if (z) {
                ch.this.v.put(this.v.j(), Integer.valueOf(this.x.getProgress()));
            } else {
                ch.this.v.remove(this.v.j());
            }
        }

        public void R() {
            int r = this.v.r();
            Q(r == 0);
            this.x.setProgress(r);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ch$g */
    /* loaded from: classes.dex */
    public final class g extends yh.b {
        public g() {
        }

        @Override // defpackage.yh.b
        public void d(yh yhVar, yh.i iVar) {
            ch.this.v();
        }

        @Override // defpackage.yh.b
        public void e(yh yhVar, yh.i iVar) {
            boolean z;
            yh.i.a h;
            if (iVar == ch.this.g && iVar.g() != null) {
                for (yh.i iVar2 : iVar.p().f()) {
                    if (!ch.this.g.k().contains(iVar2) && (h = ch.this.g.h(iVar2)) != null && h.b() && !ch.this.i.contains(iVar2)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                ch.this.w();
                ch.this.t();
                return;
            }
            ch.this.v();
        }

        @Override // defpackage.yh.b
        public void g(yh yhVar, yh.i iVar) {
            ch.this.v();
        }

        @Override // defpackage.yh.b
        public void h(yh yhVar, yh.i iVar) {
            ch chVar = ch.this;
            chVar.g = iVar;
            chVar.w = false;
            chVar.w();
            ch.this.t();
        }

        @Override // defpackage.yh.b
        public void k(yh yhVar, yh.i iVar) {
            ch.this.v();
        }

        @Override // defpackage.yh.b
        public void m(yh yhVar, yh.i iVar) {
            f fVar;
            int r = iVar.r();
            if (ch.R) {
                String str = C0059ao.a(1699) + r;
            }
            ch chVar = ch.this;
            if (chVar.u == iVar || (fVar = chVar.t.get(iVar.j())) == null) {
                return;
            }
            fVar.R();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ch$h */
    /* loaded from: classes.dex */
    public final class h extends RecyclerView.h<RecyclerView.d0> {
        public final LayoutInflater e;
        public final Drawable f;
        public final Drawable g;
        public final Drawable h;
        public final Drawable i;
        public f j;
        public final int k;
        public final ArrayList<f> d = new ArrayList<>();
        public final Interpolator l = new AccelerateDecelerateInterpolator();

        /* compiled from: AxisPay */
        /* renamed from: ch$h$a */
        /* loaded from: classes.dex */
        public class a extends Animation {
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ View d;

            public a(h hVar, int i, int i2, View view) {
                this.b = i;
                this.c = i2;
                this.d = view;
            }

            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                int i = this.b;
                int i2 = this.c;
                ch.n(this.d, i2 + ((int) ((i - i2) * f)));
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: ch$h$b */
        /* loaded from: classes.dex */
        public class b implements Animation.AnimationListener {
            public b() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ch chVar = ch.this;
                chVar.x = false;
                chVar.w();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                ch.this.x = true;
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: ch$h$c */
        /* loaded from: classes.dex */
        public class c extends RecyclerView.d0 {
            public yh.i A;
            public final View v;
            public final ImageView w;
            public final ProgressBar x;
            public final TextView y;
            public final float z;

            /* compiled from: AxisPay */
            /* renamed from: ch$h$c$a */
            /* loaded from: classes.dex */
            public class a implements View.OnClickListener {
                public a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    c cVar = c.this;
                    ch.this.d.q(cVar.A);
                    c.this.w.setVisibility(4);
                    c.this.x.setVisibility(0);
                }
            }

            public c(View view) {
                super(view);
                this.v = view;
                this.w = (ImageView) view.findViewById(ng.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(ng.mr_cast_group_progress_bar);
                this.x = progressBar;
                this.y = (TextView) view.findViewById(ng.mr_cast_group_name);
                this.z = dh.h(ch.this.l);
                dh.t(ch.this.l, progressBar);
            }

            public void O(f fVar) {
                yh.i iVar = (yh.i) fVar.a();
                this.A = iVar;
                this.w.setVisibility(0);
                this.x.setVisibility(4);
                this.v.setAlpha(P(iVar) ? 1.0f : this.z);
                this.v.setOnClickListener(new a());
                this.w.setImageDrawable(h.this.y(iVar));
                this.y.setText(iVar.l());
            }

            public final boolean P(yh.i iVar) {
                List<yh.i> k = ch.this.g.k();
                return (k.size() == 1 && k.get(0) == iVar) ? false : true;
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: ch$h$d */
        /* loaded from: classes.dex */
        public class d extends f {
            public final int A;
            public final TextView z;

            public d(View view) {
                super(view, (ImageButton) view.findViewById(ng.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(ng.mr_cast_volume_slider));
                this.z = (TextView) view.findViewById(ng.mr_group_volume_route_name);
                Resources resources = ch.this.l.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(lg.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.A = (int) typedValue.getDimension(displayMetrics);
            }

            public void S(f fVar) {
                ch.n(this.b, h.this.A() ? this.A : 0);
                yh.i iVar = (yh.i) fVar.a();
                super.O(iVar);
                this.z.setText(iVar.l());
            }

            public int T() {
                return this.A;
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: ch$h$e */
        /* loaded from: classes.dex */
        public class e extends RecyclerView.d0 {
            public final TextView v;

            public e(h hVar, View view) {
                super(view);
                this.v = (TextView) view.findViewById(ng.mr_cast_header_name);
            }

            public void O(f fVar) {
                this.v.setText(fVar.a().toString());
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: ch$h$f */
        /* loaded from: classes.dex */
        public class f {
            public final Object a;
            public final int b;

            public f(h hVar, Object obj, int i) {
                this.a = obj;
                this.b = i;
            }

            public Object a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: ch$h$g */
        /* loaded from: classes.dex */
        public class g extends f {
            public final ImageView A;
            public final ProgressBar B;
            public final TextView C;
            public final RelativeLayout D;
            public final CheckBox E;
            public final float F;
            public final int G;
            public final int H;
            public final View.OnClickListener I;
            public final View z;

            /* compiled from: AxisPay */
            /* renamed from: ch$h$g$a */
            /* loaded from: classes.dex */
            public class a implements View.OnClickListener {
                public a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    g gVar = g.this;
                    boolean z = !gVar.U(gVar.v);
                    boolean x = g.this.v.x();
                    if (z) {
                        g gVar2 = g.this;
                        ch.this.d.c(gVar2.v);
                    } else {
                        g gVar3 = g.this;
                        ch.this.d.p(gVar3.v);
                    }
                    g.this.V(z, !x);
                    if (x) {
                        List<yh.i> k = ch.this.g.k();
                        for (yh.i iVar : g.this.v.k()) {
                            if (k.contains(iVar) != z) {
                                f fVar = ch.this.t.get(iVar.j());
                                if (fVar instanceof g) {
                                    ((g) fVar).V(z, true);
                                }
                            }
                        }
                    }
                    g gVar4 = g.this;
                    h.this.B(gVar4.v, z);
                }
            }

            public g(View view) {
                super(view, (ImageButton) view.findViewById(ng.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(ng.mr_cast_volume_slider));
                this.I = new a();
                this.z = view;
                this.A = (ImageView) view.findViewById(ng.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(ng.mr_cast_route_progress_bar);
                this.B = progressBar;
                this.C = (TextView) view.findViewById(ng.mr_cast_route_name);
                this.D = (RelativeLayout) view.findViewById(ng.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(ng.mr_cast_checkbox);
                this.E = checkBox;
                checkBox.setButtonDrawable(dh.e(ch.this.l));
                dh.t(ch.this.l, progressBar);
                this.F = dh.h(ch.this.l);
                Resources resources = ch.this.l.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(lg.mr_dynamic_dialog_row_height, typedValue, true);
                this.G = (int) typedValue.getDimension(displayMetrics);
                this.H = 0;
            }

            public void S(f fVar) {
                yh.i iVar = (yh.i) fVar.a();
                if (iVar == ch.this.g && iVar.k().size() > 0) {
                    Iterator<yh.i> it = iVar.k().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        yh.i next = it.next();
                        if (!ch.this.i.contains(next)) {
                            iVar = next;
                            break;
                        }
                    }
                }
                O(iVar);
                this.A.setImageDrawable(h.this.y(iVar));
                this.C.setText(iVar.l());
                boolean z = false;
                this.E.setVisibility(0);
                boolean U = U(iVar);
                boolean T = T(iVar);
                this.E.setChecked(U);
                this.B.setVisibility(4);
                this.A.setVisibility(0);
                this.z.setEnabled(T);
                this.E.setEnabled(T);
                this.w.setEnabled(T || U);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
                if (T || U) {
                    z = true;
                }
                mediaRouteVolumeSlider.setEnabled(z);
                this.z.setOnClickListener(this.I);
                this.E.setOnClickListener(this.I);
                ch.n(this.D, (!U || this.v.x()) ? this.H : this.G);
                float f = 1.0f;
                this.z.setAlpha((T || U) ? 1.0f : this.F);
                CheckBox checkBox = this.E;
                if (!T && U) {
                    f = this.F;
                }
                checkBox.setAlpha(f);
            }

            public final boolean T(yh.i iVar) {
                if (ch.this.k.contains(iVar)) {
                    return false;
                }
                if (!U(iVar) || ch.this.g.k().size() >= 2) {
                    if (U(iVar)) {
                        yh.i.a h = ch.this.g.h(iVar);
                        return h != null && h.d();
                    }
                    return true;
                }
                return false;
            }

            public boolean U(yh.i iVar) {
                if (iVar.B()) {
                    return true;
                }
                yh.i.a h = ch.this.g.h(iVar);
                return h != null && h.a() == 3;
            }

            public void V(boolean z, boolean z2) {
                this.E.setEnabled(false);
                this.z.setEnabled(false);
                this.E.setChecked(z);
                if (z) {
                    this.A.setVisibility(4);
                    this.B.setVisibility(0);
                }
                if (z2) {
                    h.this.w(this.D, z ? this.G : this.H);
                }
            }
        }

        public h() {
            this.e = LayoutInflater.from(ch.this.l);
            this.f = dh.g(ch.this.l);
            this.g = dh.q(ch.this.l);
            this.h = dh.m(ch.this.l);
            this.i = dh.n(ch.this.l);
            this.k = ch.this.l.getResources().getInteger(og.mr_cast_volume_slider_layout_animation_duration_ms);
            D();
        }

        public boolean A() {
            return ch.this.g.k().size() > 1;
        }

        public void B(yh.i iVar, boolean z) {
            List<yh.i> k = ch.this.g.k();
            int max = Math.max(1, k.size());
            if (iVar.x()) {
                for (yh.i iVar2 : iVar.k()) {
                    if (k.contains(iVar2) != z) {
                        max += z ? 1 : -1;
                    }
                }
            } else {
                max += z ? 1 : -1;
            }
            boolean A = A();
            boolean z2 = max >= 2;
            if (A != z2) {
                RecyclerView.d0 findViewHolderForAdapterPosition = ch.this.q.findViewHolderForAdapterPosition(0);
                if (findViewHolderForAdapterPosition instanceof d) {
                    d dVar = (d) findViewHolderForAdapterPosition;
                    w(dVar.b, z2 ? dVar.T() : 0);
                }
            }
        }

        public void C() {
            ch.this.k.clear();
            ch chVar = ch.this;
            chVar.k.addAll(ah.g(chVar.i, chVar.g()));
            j();
        }

        public void D() {
            this.d.clear();
            ch chVar = ch.this;
            this.j = new f(this, chVar.g, 1);
            if (!chVar.h.isEmpty()) {
                for (yh.i iVar : ch.this.h) {
                    this.d.add(new f(this, iVar, 3));
                }
            } else {
                this.d.add(new f(this, ch.this.g, 3));
            }
            boolean z = false;
            if (!ch.this.i.isEmpty()) {
                boolean z2 = false;
                for (yh.i iVar2 : ch.this.i) {
                    if (!ch.this.h.contains(iVar2)) {
                        if (!z2) {
                            uh.b g2 = ch.this.g.g();
                            String j = g2 != null ? g2.j() : null;
                            if (TextUtils.isEmpty(j)) {
                                j = ch.this.l.getString(rg.mr_dialog_groupable_header);
                            }
                            this.d.add(new f(this, j, 2));
                            z2 = true;
                        }
                        this.d.add(new f(this, iVar2, 3));
                    }
                }
            }
            if (!ch.this.j.isEmpty()) {
                for (yh.i iVar3 : ch.this.j) {
                    yh.i iVar4 = ch.this.g;
                    if (iVar4 != iVar3) {
                        if (!z) {
                            uh.b g3 = iVar4.g();
                            String k = g3 != null ? g3.k() : null;
                            if (TextUtils.isEmpty(k)) {
                                k = ch.this.l.getString(rg.mr_dialog_transferable_header);
                            }
                            this.d.add(new f(this, k, 2));
                            z = true;
                        }
                        this.d.add(new f(this, iVar3, 4));
                    }
                }
            }
            C();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int e() {
            return this.d.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int g(int i) {
            return z(i).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void l(RecyclerView.d0 d0Var, int i) {
            int g2 = g(i);
            f z = z(i);
            if (g2 == 1) {
                ch.this.t.put(((yh.i) z.a()).j(), (f) d0Var);
                ((d) d0Var).S(z);
            } else if (g2 == 2) {
                ((e) d0Var).O(z);
            } else if (g2 == 3) {
                ch.this.t.put(((yh.i) z.a()).j(), (f) d0Var);
                ((g) d0Var).S(z);
            } else if (g2 != 4) {
                Log.w(C0059ao.a(1705), C0059ao.a(1706));
            } else {
                ((c) d0Var).O(z);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.d0 n(ViewGroup viewGroup, int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            Log.w(C0059ao.a(1707), C0059ao.a(1708));
                            return null;
                        }
                        return new c(this.e.inflate(qg.mr_cast_group_item, viewGroup, false));
                    }
                    return new g(this.e.inflate(qg.mr_cast_route_item, viewGroup, false));
                }
                return new e(this, this.e.inflate(qg.mr_cast_header_item, viewGroup, false));
            }
            return new d(this.e.inflate(qg.mr_cast_group_volume_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void s(RecyclerView.d0 d0Var) {
            super.s(d0Var);
            ch.this.t.values().remove(d0Var);
        }

        public void w(View view, int i) {
            a aVar = new a(this, i, view.getLayoutParams().height, view);
            aVar.setAnimationListener(new b());
            aVar.setDuration(this.k);
            aVar.setInterpolator(this.l);
            view.startAnimation(aVar);
        }

        public final Drawable x(yh.i iVar) {
            int f2 = iVar.f();
            if (f2 != 1) {
                if (f2 != 2) {
                    if (iVar.x()) {
                        return this.i;
                    }
                    return this.f;
                }
                return this.h;
            }
            return this.g;
        }

        public Drawable y(yh.i iVar) {
            Uri i = iVar.i();
            if (i != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(ch.this.l.getContentResolver().openInputStream(i), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e2) {
                    Log.w(C0059ao.a(1710), C0059ao.a(1709) + i, e2);
                }
            }
            return x(iVar);
        }

        public f z(int i) {
            if (i == 0) {
                return this.j;
            }
            return this.d.get(i - 1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ch$i */
    /* loaded from: classes.dex */
    public static final class i implements Comparator<yh.i> {
        public static final i b = new i();

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(yh.i iVar, yh.i iVar2) {
            return iVar.l().compareToIgnoreCase(iVar2.l());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ch$j */
    /* loaded from: classes.dex */
    public class j implements SeekBar.OnSeekBarChangeListener {
        public j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                yh.i iVar = (yh.i) seekBar.getTag();
                f fVar = ch.this.t.get(iVar.j());
                if (fVar != null) {
                    fVar.Q(i == 0);
                }
                iVar.F(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ch chVar = ch.this;
            if (chVar.u != null) {
                chVar.p.removeMessages(2);
            }
            ch.this.u = (yh.i) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ch.this.p.sendEmptyMessageDelayed(2, 500L);
        }
    }

    public ch(Context context) {
        this(context, 0);
    }

    public static Bitmap e(Bitmap bitmap, float f2, Context context) {
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(f2);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        createTyped.copyTo(copy);
        createFromBitmap.destroy();
        createTyped.destroy();
        create2.destroy();
        create.destroy();
        return copy;
    }

    public static boolean h(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    public static void n(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public void f() {
        this.O = false;
        this.P = null;
        this.Q = 0;
    }

    public List<yh.i> g() {
        ArrayList arrayList = new ArrayList();
        for (yh.i iVar : this.g.p().f()) {
            yh.i.a h2 = this.g.h(iVar);
            if (h2 != null && h2.b()) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public boolean j(yh.i iVar) {
        return !iVar.v() && iVar.w() && iVar.D(this.f) && this.g != iVar;
    }

    public void k(List<yh.i> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!j(list.get(size))) {
                list.remove(size);
            }
        }
    }

    public void m() {
        MediaDescriptionCompat mediaDescriptionCompat = this.K;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.K;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        d dVar = this.L;
        Bitmap b2 = dVar == null ? this.M : dVar.b();
        d dVar2 = this.L;
        Uri c2 = dVar2 == null ? this.N : dVar2.c();
        if (b2 != iconBitmap || (b2 == null && !ya.a(c2, iconUri))) {
            d dVar3 = this.L;
            if (dVar3 != null) {
                dVar3.cancel(true);
            }
            d dVar4 = new d();
            this.L = dVar4;
            dVar4.execute(new Void[0]);
        }
    }

    public final void o(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.I;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.J);
            this.I = null;
        }
        if (token != null && this.n) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.l, token);
            this.I = mediaControllerCompat2;
            mediaControllerCompat2.registerCallback(this.J);
            MediaMetadataCompat metadata = this.I.getMetadata();
            this.K = metadata != null ? metadata.getDescription() : null;
            m();
            s();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        this.d.b(this.f, this.e, 1);
        t();
        o(this.d.h());
    }

    @Override // defpackage.c0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(qg.mr_cast_dialog);
        dh.s(this.l, this);
        ImageButton imageButton = (ImageButton) findViewById(ng.mr_cast_close_button);
        this.A = imageButton;
        imageButton.setColorFilter(-1);
        this.A.setOnClickListener(new b());
        Button button = (Button) findViewById(ng.mr_cast_stop_button);
        this.B = button;
        button.setTextColor(-1);
        this.B.setOnClickListener(new c());
        this.r = new h();
        RecyclerView recyclerView = (RecyclerView) findViewById(ng.mr_cast_list);
        this.q = recyclerView;
        recyclerView.setAdapter(this.r);
        this.q.setLayoutManager(new LinearLayoutManager(this.l));
        this.s = new j();
        this.t = new HashMap();
        this.v = new HashMap();
        this.C = (ImageView) findViewById(ng.mr_cast_meta_background);
        this.D = findViewById(ng.mr_cast_meta_black_scrim);
        this.E = (ImageView) findViewById(ng.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(ng.mr_cast_meta_title);
        this.F = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(ng.mr_cast_meta_subtitle);
        this.G = textView2;
        textView2.setTextColor(-1);
        this.H = this.l.getResources().getString(rg.mr_cast_dialog_title_view_placeholder);
        this.m = true;
        r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        this.d.o(this.e);
        this.p.removeCallbacksAndMessages(null);
        o(null);
    }

    public void p(xh xhVar) {
        if (xhVar != null) {
            if (this.f.equals(xhVar)) {
                return;
            }
            this.f = xhVar;
            if (this.n) {
                this.d.o(this.e);
                this.d.b(xhVar, this.e, 1);
                t();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(3042));
    }

    public final boolean q() {
        if (this.u != null || this.w || this.x) {
            return true;
        }
        return !this.m;
    }

    public void r() {
        getWindow().setLayout(ah.c(this.l), ah.a(this.l));
        this.M = null;
        this.N = null;
        m();
        s();
        v();
    }

    public void s() {
        if (q()) {
            this.z = true;
            return;
        }
        this.z = false;
        if (!this.g.B() || this.g.v()) {
            dismiss();
        }
        if (this.O && !h(this.P) && this.P != null) {
            this.E.setVisibility(0);
            this.E.setImageBitmap(this.P);
            this.E.setBackgroundColor(this.Q);
            this.D.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 17) {
                this.C.setImageBitmap(e(this.P, 10.0f, this.l));
            } else {
                this.C.setImageBitmap(Bitmap.createBitmap(this.P));
            }
        } else {
            if (h(this.P)) {
                Log.w(C0059ao.a(3044), C0059ao.a(3043) + this.P);
            }
            this.E.setVisibility(8);
            this.D.setVisibility(8);
            this.C.setImageBitmap(null);
        }
        f();
        MediaDescriptionCompat mediaDescriptionCompat = this.K;
        CharSequence title = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getTitle();
        boolean z = !TextUtils.isEmpty(title);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.K;
        CharSequence subtitle = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getSubtitle() : null;
        boolean isEmpty = true ^ TextUtils.isEmpty(subtitle);
        if (z) {
            this.F.setText(title);
        } else {
            this.F.setText(this.H);
        }
        if (isEmpty) {
            this.G.setText(subtitle);
            this.G.setVisibility(0);
            return;
        }
        this.G.setVisibility(8);
    }

    public void t() {
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.h.addAll(this.g.k());
        for (yh.i iVar : this.g.p().f()) {
            yh.i.a h2 = this.g.h(iVar);
            if (h2 != null) {
                if (h2.b()) {
                    this.i.add(iVar);
                }
                if (h2.c()) {
                    this.j.add(iVar);
                }
            }
        }
        k(this.i);
        k(this.j);
        List<yh.i> list = this.h;
        i iVar2 = i.b;
        Collections.sort(list, iVar2);
        Collections.sort(this.i, iVar2);
        Collections.sort(this.j, iVar2);
        this.r.D();
    }

    public void v() {
        if (this.n) {
            if (SystemClock.uptimeMillis() - this.o >= 300) {
                if (q()) {
                    this.y = true;
                    return;
                }
                this.y = false;
                if (!this.g.B() || this.g.v()) {
                    dismiss();
                }
                this.o = SystemClock.uptimeMillis();
                this.r.C();
                return;
            }
            this.p.removeMessages(1);
            this.p.sendEmptyMessageAtTime(1, this.o + 300);
        }
    }

    public void w() {
        if (this.y) {
            v();
        }
        if (this.z) {
            s();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ch(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = defpackage.dh.b(r2, r3, r0)
            int r3 = defpackage.dh.c(r2)
            r1.<init>(r2, r3)
            xh r2 = defpackage.xh.c
            r1.f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.h = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.j = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.k = r2
            ch$a r2 = new ch$a
            r2.<init>()
            r1.p = r2
            android.content.Context r2 = r1.getContext()
            r1.l = r2
            yh r2 = defpackage.yh.g(r2)
            r1.d = r2
            ch$g r3 = new ch$g
            r3.<init>()
            r1.e = r3
            yh$i r3 = r2.k()
            r1.g = r3
            ch$e r3 = new ch$e
            r3.<init>()
            r1.J = r3
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.h()
            r1.o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch.<init>(android.content.Context, int):void");
    }
}
