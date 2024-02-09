package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.yh;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xg  reason: default package */
/* loaded from: classes.dex */
public class xg extends y {
    public static final boolean q0 = Log.isLoggable(C0059ao.a(6491), 3);
    public static final int r0 = (int) TimeUnit.SECONDS.toMillis(30);
    public LinearLayout A;
    public RelativeLayout B;
    public LinearLayout C;
    public View D;
    public OverlayListView E;
    public r F;
    public List<yh.i> G;
    public Set<yh.i> H;
    public Set<yh.i> I;
    public Set<yh.i> J;
    public SeekBar K;
    public q L;
    public yh.i M;
    public int N;
    public int O;
    public int P;
    public final int Q;
    public Map<yh.i, SeekBar> R;
    public MediaControllerCompat S;
    public o T;
    public PlaybackStateCompat U;
    public MediaDescriptionCompat V;
    public n W;
    public Bitmap X;
    public Uri Y;
    public boolean Z;
    public Bitmap a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public final yh e;
    public boolean e0;
    public final p f;
    public boolean f0;
    public final yh.i g;
    public boolean g0;
    public Context h;
    public int h0;
    public boolean i;
    public int i0;
    public boolean j;
    public int j0;
    public int k;
    public Interpolator k0;
    public View l;
    public Interpolator l0;
    public Button m;
    public Interpolator m0;
    public Button n;
    public Interpolator n0;
    public ImageButton o;
    public final AccessibilityManager o0;
    public ImageButton p;
    public Runnable p0;
    public MediaRouteExpandCollapseButton q;
    public FrameLayout r;
    public LinearLayout s;
    public FrameLayout t;
    public FrameLayout u;
    public ImageView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public boolean z;

    /* compiled from: AxisPay */
    /* renamed from: xg$a */
    /* loaded from: classes.dex */
    public class a implements OverlayListView.a.InterfaceC0001a {
        public final /* synthetic */ yh.i a;

        public a(yh.i iVar) {
            this.a = iVar;
        }

        @Override // androidx.mediarouter.app.OverlayListView.a.InterfaceC0001a
        public void a() {
            xg.this.J.remove(this.a);
            xg.this.F.notifyDataSetChanged();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$b */
    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            xg.this.E.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            xg.this.G();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$c */
    /* loaded from: classes.dex */
    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            xg.this.p(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xg.this.F();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            xg.this.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f(xg xgVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PendingIntent sessionActivity;
            MediaControllerCompat mediaControllerCompat = xg.this.S;
            if (mediaControllerCompat == null || (sessionActivity = mediaControllerCompat.getSessionActivity()) == null) {
                return;
            }
            try {
                sessionActivity.send();
                xg.this.dismiss();
            } catch (PendingIntent.CanceledException unused) {
                Log.e(C0059ao.a(12881), sessionActivity + C0059ao.a(12880));
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$h */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            xg xgVar = xg.this;
            boolean z = !xgVar.e0;
            xgVar.e0 = z;
            if (z) {
                xgVar.E.setVisibility(0);
            }
            xg.this.A();
            xg.this.K(true);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$i */
    /* loaded from: classes.dex */
    public class i implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ boolean b;

        public i(boolean z) {
            this.b = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            xg.this.t.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            xg xgVar = xg.this;
            if (xgVar.f0) {
                xgVar.g0 = true;
            } else {
                xgVar.L(this.b);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$j */
    /* loaded from: classes.dex */
    public class j extends Animation {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ View d;

        public j(xg xgVar, int i, int i2, View view) {
            this.b = i;
            this.c = i2;
            this.d = view;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            int i = this.b;
            xg.D(this.d, i - ((int) ((i - this.c) * f)));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$k */
    /* loaded from: classes.dex */
    public class k implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ Map b;
        public final /* synthetic */ Map c;

        public k(Map map, Map map2) {
            this.b = map;
            this.c = map2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            xg.this.E.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            xg.this.h(this.b, this.c);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$l */
    /* loaded from: classes.dex */
    public class l implements Animation.AnimationListener {
        public l() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            xg.this.E.b();
            xg xgVar = xg.this;
            xgVar.E.postDelayed(xgVar.p0, xgVar.h0);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$m */
    /* loaded from: classes.dex */
    public final class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            int id = view.getId();
            if (id != 16908313 && id != 16908314) {
                if (id == ng.mr_control_playback_ctrl) {
                    xg xgVar = xg.this;
                    if (xgVar.S == null || (playbackStateCompat = xgVar.U) == null) {
                        return;
                    }
                    int i = 0;
                    int i2 = playbackStateCompat.getState() != 3 ? 0 : 1;
                    if (i2 != 0 && xg.this.w()) {
                        xg.this.S.getTransportControls().pause();
                        i = rg.mr_controller_pause;
                    } else if (i2 != 0 && xg.this.y()) {
                        xg.this.S.getTransportControls().stop();
                        i = rg.mr_controller_stop;
                    } else if (i2 == 0 && xg.this.x()) {
                        xg.this.S.getTransportControls().play();
                        i = rg.mr_controller_play;
                    }
                    AccessibilityManager accessibilityManager = xg.this.o0;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled() || i == 0) {
                        return;
                    }
                    AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                    obtain.setPackageName(xg.this.h.getPackageName());
                    obtain.setClassName(m.class.getName());
                    obtain.getText().add(xg.this.h.getString(i));
                    xg.this.o0.sendAccessibilityEvent(obtain);
                    return;
                } else if (id == ng.mr_close) {
                    xg.this.dismiss();
                    return;
                } else {
                    return;
                }
            }
            if (xg.this.g.B()) {
                xg.this.e.r(id == 16908313 ? 2 : 1);
            }
            xg.this.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$n */
    /* loaded from: classes.dex */
    public class n extends AsyncTask<Void, Void, Bitmap> {
        public final Bitmap a;
        public final Uri b;
        public int c;
        public long d;

        public n() {
            MediaDescriptionCompat mediaDescriptionCompat = xg.this.V;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            if (xg.t(iconBitmap)) {
                Log.w(C0059ao.a(13013), C0059ao.a(13014));
                iconBitmap = null;
            }
            this.a = iconBitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = xg.this.V;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r11) {
            /*
                Method dump skipped, instructions count: 298
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.n.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
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
            xg xgVar = xg.this;
            xgVar.W = null;
            if (ya.a(xgVar.X, this.a) && ya.a(xg.this.Y, this.b)) {
                return;
            }
            xg xgVar2 = xg.this;
            xgVar2.X = this.a;
            xgVar2.a0 = bitmap;
            xgVar2.Y = this.b;
            xgVar2.b0 = this.c;
            xgVar2.Z = true;
            xg.this.H(SystemClock.uptimeMillis() - this.d > 120);
        }

        public final InputStream e(Uri uri) throws IOException {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if (!C0059ao.a(13018).equals(lowerCase) && !C0059ao.a(13019).equals(lowerCase) && !C0059ao.a(13020).equals(lowerCase)) {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                int i = xg.r0;
                openConnection.setConnectTimeout(i);
                openConnection.setReadTimeout(i);
                openInputStream = openConnection.getInputStream();
            } else {
                openInputStream = xg.this.h.getContentResolver().openInputStream(uri);
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.d = SystemClock.uptimeMillis();
            xg.this.n();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$o */
    /* loaded from: classes.dex */
    public final class o extends MediaControllerCompat.Callback {
        public o() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            xg.this.V = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            xg.this.I();
            xg.this.H(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            xg xgVar = xg.this;
            xgVar.U = playbackStateCompat;
            xgVar.H(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            xg xgVar = xg.this;
            MediaControllerCompat mediaControllerCompat = xgVar.S;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(xgVar.T);
                xg.this.S = null;
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$p */
    /* loaded from: classes.dex */
    public final class p extends yh.b {
        public p() {
        }

        @Override // defpackage.yh.b
        public void e(yh yhVar, yh.i iVar) {
            xg.this.H(true);
        }

        @Override // defpackage.yh.b
        public void k(yh yhVar, yh.i iVar) {
            xg.this.H(false);
        }

        @Override // defpackage.yh.b
        public void m(yh yhVar, yh.i iVar) {
            SeekBar seekBar = xg.this.R.get(iVar);
            int r = iVar.r();
            if (xg.q0) {
                String str = C0059ao.a(12995) + r;
            }
            if (seekBar == null || xg.this.M == iVar) {
                return;
            }
            seekBar.setProgress(r);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$q */
    /* loaded from: classes.dex */
    public class q implements SeekBar.OnSeekBarChangeListener {
        public final Runnable a = new a();

        /* compiled from: AxisPay */
        /* renamed from: xg$q$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                xg xgVar = xg.this;
                if (xgVar.M != null) {
                    xgVar.M = null;
                    if (xgVar.c0) {
                        xgVar.H(xgVar.d0);
                    }
                }
            }
        }

        public q() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                yh.i iVar = (yh.i) seekBar.getTag();
                if (xg.q0) {
                    String str = C0059ao.a(12981) + i + C0059ao.a(12982);
                }
                iVar.F(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            xg xgVar = xg.this;
            if (xgVar.M != null) {
                xgVar.K.removeCallbacks(this.a);
            }
            xg.this.M = (yh.i) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            xg.this.K.postDelayed(this.a, 500L);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xg$r */
    /* loaded from: classes.dex */
    public class r extends ArrayAdapter<yh.i> {
        public final float b;

        public r(Context context, List<yh.i> list) {
            super(context, 0, list);
            this.b = dh.h(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(qg.mr_controller_volume_item, viewGroup, false);
            } else {
                xg.this.P(view);
            }
            yh.i item = getItem(i);
            if (item != null) {
                boolean w = item.w();
                TextView textView = (TextView) view.findViewById(ng.mr_name);
                textView.setEnabled(w);
                textView.setText(item.l());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(ng.mr_volume_slider);
                dh.w(viewGroup.getContext(), mediaRouteVolumeSlider, xg.this.E);
                mediaRouteVolumeSlider.setTag(item);
                xg.this.R.put(item, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.c(!w);
                mediaRouteVolumeSlider.setEnabled(w);
                if (w) {
                    if (xg.this.z(item)) {
                        mediaRouteVolumeSlider.setMax(item.t());
                        mediaRouteVolumeSlider.setProgress(item.r());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(xg.this.L);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(ng.mr_volume_item_icon)).setAlpha(w ? 255 : (int) (this.b * 255.0f));
                ((LinearLayout) view.findViewById(ng.volume_item_container)).setVisibility(xg.this.J.contains(item) ? 4 : 0);
                Set<yh.i> set = xg.this.H;
                if (set != null && set.contains(item)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return false;
        }
    }

    public xg(Context context) {
        this(context, 0);
    }

    public static void D(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static boolean Q(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    public static int r(View view) {
        return view.getLayoutParams().height;
    }

    public static boolean t(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    public void A() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.k0 = this.e0 ? this.l0 : this.m0;
        } else {
            this.k0 = this.n0;
        }
    }

    public View B(Bundle bundle) {
        return null;
    }

    public final void C(boolean z) {
        List<yh.i> k2 = this.g.k();
        if (k2.isEmpty()) {
            this.G.clear();
            this.F.notifyDataSetChanged();
        } else if (ah.i(this.G, k2)) {
            this.F.notifyDataSetChanged();
        } else {
            HashMap e2 = z ? ah.e(this.E, this.F) : null;
            HashMap d2 = z ? ah.d(this.h, this.E, this.F) : null;
            this.H = ah.f(this.G, k2);
            this.I = ah.g(this.G, k2);
            this.G.addAll(0, this.H);
            this.G.removeAll(this.I);
            this.F.notifyDataSetChanged();
            if (z && this.e0 && this.H.size() + this.I.size() > 0) {
                g(e2, d2);
                return;
            }
            this.H = null;
            this.I = null;
        }
    }

    public final void E(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.S;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.T);
            this.S = null;
        }
        if (token != null && this.j) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.h, token);
            this.S = mediaControllerCompat2;
            mediaControllerCompat2.registerCallback(this.T);
            MediaMetadataCompat metadata = this.S.getMetadata();
            this.V = metadata != null ? metadata.getDescription() : null;
            this.U = this.S.getPlaybackState();
            I();
            H(false);
        }
    }

    public void F() {
        m(true);
        this.E.requestLayout();
        this.E.getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    public void G() {
        Set<yh.i> set = this.H;
        if (set != null && set.size() != 0) {
            o();
        } else {
            p(true);
        }
    }

    public void H(boolean z) {
        if (this.M != null) {
            this.c0 = true;
            this.d0 = z | this.d0;
            return;
        }
        this.c0 = false;
        this.d0 = false;
        if (this.g.B() && !this.g.v()) {
            if (this.i) {
                this.y.setText(this.g.l());
                this.m.setVisibility(this.g.a() ? 0 : 8);
                if (this.l == null && this.Z) {
                    if (t(this.a0)) {
                        Log.w(C0059ao.a(6494), C0059ao.a(6493) + this.a0);
                    } else {
                        this.v.setImageBitmap(this.a0);
                        this.v.setBackgroundColor(this.b0);
                    }
                    n();
                }
                O();
                N();
                K(z);
                return;
            }
            return;
        }
        dismiss();
    }

    public void I() {
        if (this.l == null && v()) {
            n nVar = this.W;
            if (nVar != null) {
                nVar.cancel(true);
            }
            n nVar2 = new n();
            this.W = nVar2;
            nVar2.execute(new Void[0]);
        }
    }

    public void J() {
        int b2 = ah.b(this.h);
        getWindow().setLayout(b2, -2);
        View decorView = getWindow().getDecorView();
        this.k = (b2 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.h.getResources();
        this.N = resources.getDimensionPixelSize(lg.mr_controller_volume_group_list_item_icon_size);
        this.O = resources.getDimensionPixelSize(lg.mr_controller_volume_group_list_item_height);
        this.P = resources.getDimensionPixelSize(lg.mr_controller_volume_group_list_max_height);
        this.X = null;
        this.Y = null;
        I();
        H(false);
    }

    public void K(boolean z) {
        this.t.requestLayout();
        this.t.getViewTreeObserver().addOnGlobalLayoutListener(new i(z));
    }

    public void L(boolean z) {
        int i2;
        Bitmap bitmap;
        int r2 = r(this.A);
        D(this.A, -1);
        M(k());
        View decorView = getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, CommonUtils.BYTES_IN_A_GIGABYTE), 0);
        D(this.A, r2);
        if (this.l == null && (this.v.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) this.v.getDrawable()).getBitmap()) != null) {
            i2 = q(bitmap.getWidth(), bitmap.getHeight());
            this.v.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        } else {
            i2 = 0;
        }
        int s = s(k());
        int size = this.G.size();
        int size2 = this.g.x() ? this.O * this.g.k().size() : 0;
        if (size > 0) {
            size2 += this.Q;
        }
        int min = Math.min(size2, this.P);
        if (!this.e0) {
            min = 0;
        }
        int max = Math.max(i2, min) + s;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (this.s.getMeasuredHeight() - this.t.getMeasuredHeight());
        if (this.l == null && i2 > 0 && max <= height) {
            this.v.setVisibility(0);
            D(this.v, i2);
        } else {
            if (r(this.E) + this.A.getMeasuredHeight() >= this.t.getMeasuredHeight()) {
                this.v.setVisibility(8);
            }
            max = min + s;
            i2 = 0;
        }
        if (k() && max <= height) {
            this.B.setVisibility(0);
        } else {
            this.B.setVisibility(8);
        }
        M(this.B.getVisibility() == 0);
        int s2 = s(this.B.getVisibility() == 0);
        int max2 = Math.max(i2, min) + s2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        this.A.clearAnimation();
        this.E.clearAnimation();
        this.t.clearAnimation();
        if (z) {
            j(this.A, s2);
            j(this.E, min);
            j(this.t, height);
        } else {
            D(this.A, s2);
            D(this.E, min);
            D(this.t, height);
        }
        D(this.r, rect.height());
        C(z);
    }

    public final void M(boolean z) {
        int i2 = 0;
        this.D.setVisibility((this.C.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.A;
        if (this.C.getVisibility() == 8 && !z) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.N():void");
    }

    public final void O() {
        if (z(this.g)) {
            if (this.C.getVisibility() == 8) {
                this.C.setVisibility(0);
                this.K.setMax(this.g.t());
                this.K.setProgress(this.g.r());
                this.q.setVisibility(this.g.x() ? 0 : 8);
                return;
            }
            return;
        }
        this.C.setVisibility(8);
    }

    public void P(View view) {
        D((LinearLayout) view.findViewById(ng.volume_item_container), this.O);
        View findViewById = view.findViewById(ng.mr_volume_item_icon);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        int i2 = this.N;
        layoutParams.width = i2;
        layoutParams.height = i2;
        findViewById.setLayoutParams(layoutParams);
    }

    public final void g(Map<yh.i, Rect> map, Map<yh.i, BitmapDrawable> map2) {
        this.E.setEnabled(false);
        this.E.requestLayout();
        this.f0 = true;
        this.E.getViewTreeObserver().addOnGlobalLayoutListener(new k(map, map2));
    }

    public void h(Map<yh.i, Rect> map, Map<yh.i, BitmapDrawable> map2) {
        OverlayListView.a aVar;
        int i2;
        Set<yh.i> set = this.H;
        if (set == null || this.I == null) {
            return;
        }
        int size = set.size() - this.I.size();
        l lVar = new l();
        int firstVisiblePosition = this.E.getFirstVisiblePosition();
        boolean z = false;
        for (int i3 = 0; i3 < this.E.getChildCount(); i3++) {
            View childAt = this.E.getChildAt(i3);
            yh.i item = this.F.getItem(firstVisiblePosition + i3);
            Rect rect = map.get(item);
            int top = childAt.getTop();
            if (rect != null) {
                i2 = rect.top;
            } else {
                i2 = (this.O * size) + top;
            }
            AnimationSet animationSet = new AnimationSet(true);
            Set<yh.i> set2 = this.H;
            if (set2 != null && set2.contains(item)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(this.i0);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
            translateAnimation.setDuration(this.h0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(this.k0);
            if (!z) {
                animationSet.setAnimationListener(lVar);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(item);
            map2.remove(item);
        }
        for (Map.Entry<yh.i, BitmapDrawable> entry : map2.entrySet()) {
            yh.i key = entry.getKey();
            BitmapDrawable value = entry.getValue();
            Rect rect2 = map.get(key);
            if (this.I.contains(key)) {
                aVar = new OverlayListView.a(value, rect2);
                aVar.c(1.0f, 0.0f);
                aVar.e(this.j0);
                aVar.f(this.k0);
            } else {
                OverlayListView.a aVar2 = new OverlayListView.a(value, rect2);
                aVar2.g(this.O * size);
                aVar2.e(this.h0);
                aVar2.f(this.k0);
                aVar2.d(new a(key));
                this.J.add(key);
                aVar = aVar2;
            }
            this.E.a(aVar);
        }
    }

    public final void j(View view, int i2) {
        j jVar = new j(this, r(view), i2, view);
        jVar.setDuration(this.h0);
        if (Build.VERSION.SDK_INT >= 21) {
            jVar.setInterpolator(this.k0);
        }
        view.startAnimation(jVar);
    }

    public final boolean k() {
        return this.l == null && !(this.V == null && this.U == null);
    }

    public void m(boolean z) {
        Set<yh.i> set;
        int firstVisiblePosition = this.E.getFirstVisiblePosition();
        for (int i2 = 0; i2 < this.E.getChildCount(); i2++) {
            View childAt = this.E.getChildAt(i2);
            yh.i item = this.F.getItem(firstVisiblePosition + i2);
            if (!z || (set = this.H) == null || !set.contains(item)) {
                ((LinearLayout) childAt.findViewById(ng.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.E.c();
        if (z) {
            return;
        }
        p(false);
    }

    public void n() {
        this.Z = false;
        this.a0 = null;
        this.b0 = 0;
    }

    public final void o() {
        c cVar = new c();
        int firstVisiblePosition = this.E.getFirstVisiblePosition();
        boolean z = false;
        for (int i2 = 0; i2 < this.E.getChildCount(); i2++) {
            View childAt = this.E.getChildAt(i2);
            if (this.H.contains(this.F.getItem(firstVisiblePosition + i2))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(this.i0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(cVar);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = true;
        this.e.b(xh.c, this.f, 2);
        E(this.e.h());
    }

    @Override // defpackage.y, defpackage.c0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(qg.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        m mVar = new m();
        FrameLayout frameLayout = (FrameLayout) findViewById(ng.mr_expandable_area);
        this.r = frameLayout;
        frameLayout.setOnClickListener(new e());
        LinearLayout linearLayout = (LinearLayout) findViewById(ng.mr_dialog_area);
        this.s = linearLayout;
        linearLayout.setOnClickListener(new f(this));
        int d2 = dh.d(this.h);
        Button button = (Button) findViewById(16908314);
        this.m = button;
        button.setText(rg.mr_controller_disconnect);
        this.m.setTextColor(d2);
        this.m.setOnClickListener(mVar);
        Button button2 = (Button) findViewById(16908313);
        this.n = button2;
        button2.setText(rg.mr_controller_stop_casting);
        this.n.setTextColor(d2);
        this.n.setOnClickListener(mVar);
        this.y = (TextView) findViewById(ng.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(ng.mr_close);
        this.p = imageButton;
        imageButton.setOnClickListener(mVar);
        this.u = (FrameLayout) findViewById(ng.mr_custom_control);
        this.t = (FrameLayout) findViewById(ng.mr_default_control);
        g gVar = new g();
        ImageView imageView = (ImageView) findViewById(ng.mr_art);
        this.v = imageView;
        imageView.setOnClickListener(gVar);
        findViewById(ng.mr_control_title_container).setOnClickListener(gVar);
        this.A = (LinearLayout) findViewById(ng.mr_media_main_control);
        this.D = findViewById(ng.mr_control_divider);
        this.B = (RelativeLayout) findViewById(ng.mr_playback_control);
        this.w = (TextView) findViewById(ng.mr_control_title);
        this.x = (TextView) findViewById(ng.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(ng.mr_control_playback_ctrl);
        this.o = imageButton2;
        imageButton2.setOnClickListener(mVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(ng.mr_volume_control);
        this.C = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(ng.mr_volume_slider);
        this.K = seekBar;
        seekBar.setTag(this.g);
        q qVar = new q();
        this.L = qVar;
        this.K.setOnSeekBarChangeListener(qVar);
        this.E = (OverlayListView) findViewById(ng.mr_volume_group_list);
        this.G = new ArrayList();
        r rVar = new r(this.E.getContext(), this.G);
        this.F = rVar;
        this.E.setAdapter((ListAdapter) rVar);
        this.J = new HashSet();
        dh.u(this.h, this.A, this.E, this.g.x());
        dh.w(this.h, (MediaRouteVolumeSlider) this.K, this.A);
        HashMap hashMap = new HashMap();
        this.R = hashMap;
        hashMap.put(this.g, this.K);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(ng.mr_group_expand_collapse);
        this.q = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new h());
        A();
        this.h0 = this.h.getResources().getInteger(og.mr_controller_volume_group_list_animation_duration_ms);
        this.i0 = this.h.getResources().getInteger(og.mr_controller_volume_group_list_fade_in_duration_ms);
        this.j0 = this.h.getResources().getInteger(og.mr_controller_volume_group_list_fade_out_duration_ms);
        View B = B(bundle);
        this.l = B;
        if (B != null) {
            this.u.addView(B);
            this.u.setVisibility(0);
        }
        this.i = true;
        J();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.e.o(this.f);
        E(null);
        this.j = false;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.y, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.g.G(i2 == 25 ? -1 : 1);
        return true;
    }

    @Override // defpackage.y, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 25 || i2 == 24) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public void p(boolean z) {
        this.H = null;
        this.I = null;
        this.f0 = false;
        if (this.g0) {
            this.g0 = false;
            K(z);
        }
        this.E.setEnabled(true);
    }

    public int q(int i2, int i3) {
        if (i2 >= i3) {
            return (int) (((this.k * i3) / i2) + 0.5f);
        }
        return (int) (((this.k * 9.0f) / 16.0f) + 0.5f);
    }

    public final int s(boolean z) {
        if (z || this.C.getVisibility() == 0) {
            int paddingTop = 0 + this.A.getPaddingTop() + this.A.getPaddingBottom();
            if (z) {
                paddingTop += this.B.getMeasuredHeight();
            }
            if (this.C.getVisibility() == 0) {
                paddingTop += this.C.getMeasuredHeight();
            }
            return (z && this.C.getVisibility() == 0) ? paddingTop + this.D.getMeasuredHeight() : paddingTop;
        }
        return 0;
    }

    public final boolean v() {
        MediaDescriptionCompat mediaDescriptionCompat = this.V;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.V;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        n nVar = this.W;
        Bitmap b2 = nVar == null ? this.X : nVar.b();
        n nVar2 = this.W;
        Uri c2 = nVar2 == null ? this.Y : nVar2.c();
        if (b2 != iconBitmap) {
            return true;
        }
        return b2 == null && !Q(c2, iconUri);
    }

    public boolean w() {
        return (this.U.getActions() & 514) != 0;
    }

    public boolean x() {
        return (this.U.getActions() & 516) != 0;
    }

    public boolean y() {
        return (this.U.getActions() & 1) != 0;
    }

    public boolean z(yh.i iVar) {
        return this.z && iVar.s() == 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xg(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 1
            android.content.Context r2 = defpackage.dh.b(r2, r3, r0)
            int r3 = defpackage.dh.c(r2)
            r1.<init>(r2, r3)
            r1.z = r0
            xg$d r3 = new xg$d
            r3.<init>()
            r1.p0 = r3
            android.content.Context r3 = r1.getContext()
            r1.h = r3
            xg$o r3 = new xg$o
            r3.<init>()
            r1.T = r3
            android.content.Context r3 = r1.h
            yh r3 = defpackage.yh.g(r3)
            r1.e = r3
            xg$p r0 = new xg$p
            r0.<init>()
            r1.f = r0
            yh$i r0 = r3.k()
            r1.g = r0
            android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.h()
            r1.E(r3)
            android.content.Context r3 = r1.h
            android.content.res.Resources r3 = r3.getResources()
            int r0 = defpackage.lg.mr_controller_volume_group_list_padding_top
            int r3 = r3.getDimensionPixelSize(r0)
            r1.Q = r3
            android.content.Context r3 = r1.h
            r0 = 6492(0x195c, float:9.097E-42)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.o0 = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r3 < r0) goto L73
            int r3 = defpackage.pg.mr_linear_out_slow_in
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.l0 = r3
            int r3 = defpackage.pg.mr_fast_out_slow_in
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.m0 = r2
        L73:
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.n0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.<init>(android.content.Context, int):void");
    }
}
