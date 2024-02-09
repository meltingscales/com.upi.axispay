package defpackage;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: m8  reason: default package */
/* loaded from: classes.dex */
public class m8 {

    /* compiled from: AxisPay */
    /* renamed from: m8$a */
    /* loaded from: classes.dex */
    public static class a {
        public final Bundle a;
        public IconCompat b;
        public final q8[] c;
        public final q8[] d;
        public boolean e;
        public boolean f;
        public final int g;
        public final boolean h;
        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.d(null, C0059ao.a(7733), i) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public q8[] c() {
            return this.d;
        }

        public Bundle d() {
            return this.a;
        }

        public IconCompat e() {
            int i;
            if (this.b == null && (i = this.i) != 0) {
                this.b = IconCompat.d(null, C0059ao.a(7734), i);
            }
            return this.b;
        }

        public q8[] f() {
            return this.c;
        }

        public int g() {
            return this.g;
        }

        public boolean h() {
            return this.f;
        }

        public CharSequence i() {
            return this.j;
        }

        public boolean j() {
            return this.h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q8[] q8VarArr, q8[] q8VarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.j() == 2) {
                this.i = iconCompat.f();
            }
            this.j = e.d(charSequence);
            this.k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = q8VarArr;
            this.d = q8VarArr2;
            this.e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: m8$b */
    /* loaded from: classes.dex */
    public static class b extends f {
        public Bitmap e;
        public IconCompat f;
        public boolean g;

        /* compiled from: AxisPay */
        /* renamed from: m8$b$a */
        /* loaded from: classes.dex */
        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: m8$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0031b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @Override // defpackage.m8.f
        public void b(l8 l8Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(l8Var.a()).setBigContentTitle(this.b).bigPicture(this.e);
                if (this.g) {
                    IconCompat iconCompat = this.f;
                    if (iconCompat == null) {
                        a.a(bigPicture, null);
                    } else if (i >= 23) {
                        C0031b.a(bigPicture, this.f.r(l8Var instanceof n8 ? ((n8) l8Var).f() : null));
                    } else if (iconCompat.j() == 1) {
                        a.a(bigPicture, this.f.e());
                    } else {
                        a.a(bigPicture, null);
                    }
                }
                if (this.d) {
                    a.b(bigPicture, this.c);
                }
            }
        }

        @Override // defpackage.m8.f
        public String c() {
            return C0059ao.a(7758);
        }

        public b h(Bitmap bitmap) {
            this.f = bitmap == null ? null : IconCompat.c(bitmap);
            this.g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: m8$c */
    /* loaded from: classes.dex */
    public static class c extends f {
        public CharSequence e;

        @Override // defpackage.m8.f
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence(C0059ao.a(7678), this.e);
            }
        }

        @Override // defpackage.m8.f
        public void b(l8 l8Var) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(l8Var.a()).setBigContentTitle(this.b).bigText(this.e);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                }
            }
        }

        @Override // defpackage.m8.f
        public String c() {
            return C0059ao.a(7679);
        }

        public c h(CharSequence charSequence) {
            this.e = e.d(charSequence);
            return this;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: m8$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* compiled from: AxisPay */
        /* renamed from: m8$d$a */
        /* loaded from: classes.dex */
        public static class a {
            public static Notification.BubbleMetadata a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                dVar.a();
                throw null;
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: m8$d$b */
        /* loaded from: classes.dex */
        public static class b {
            public static Notification.BubbleMetadata a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                dVar.b();
                throw null;
            }
        }

        public static Notification.BubbleMetadata c(d dVar) {
            if (dVar == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return b.a(dVar);
            }
            if (i == 29) {
                return a.a(dVar);
            }
            return null;
        }

        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent a() {
            throw null;
        }

        public String b() {
            throw null;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: m8$f */
    /* loaded from: classes.dex */
    public static abstract class f {
        public e a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence(C0059ao.a(7652), this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence(C0059ao.a(7653), charSequence);
            }
            String c = c();
            if (c != null) {
                bundle.putString(C0059ao.a(7654), c);
            }
        }

        public abstract void b(l8 l8Var);

        public abstract String c();

        public RemoteViews d(l8 l8Var) {
            return null;
        }

        public RemoteViews e(l8 l8Var) {
            return null;
        }

        public RemoteViews f(l8 l8Var) {
            return null;
        }

        public void g(e eVar) {
            if (this.a != eVar) {
                this.a = eVar;
                if (eVar != null) {
                    eVar.s(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return o8.c(notification);
        }
        return null;
    }

    /* compiled from: AxisPay */
    /* renamed from: m8$e */
    /* loaded from: classes.dex */
    public static class e {
        public boolean A;
        public boolean B;
        public String C;
        public Bundle D;
        public int E;
        public int F;
        public Notification G;
        public RemoteViews H;
        public RemoteViews I;
        public RemoteViews J;
        public String K;
        public int L;
        public String M;
        public u8 N;
        public long O;
        public int P;
        public boolean Q;
        public d R;
        public Notification S;
        public boolean T;
        public Icon U;
        @Deprecated
        public ArrayList<String> V;
        public Context a;
        public ArrayList<a> b;
        public ArrayList<p8> c;
        public ArrayList<a> d;
        public CharSequence e;
        public CharSequence f;
        public PendingIntent g;
        public PendingIntent h;
        public RemoteViews i;
        public Bitmap j;
        public CharSequence k;
        public int l;
        public int m;
        public boolean n;
        public boolean o;
        public f p;
        public CharSequence q;
        public CharSequence r;
        public CharSequence[] s;
        public int t;
        public int u;
        public boolean v;
        public String w;
        public boolean x;
        public String y;
        public boolean z;

        public e(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.d = new ArrayList<>();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.m = 0;
            this.V = new ArrayList<>();
            this.Q = true;
        }

        public static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new n8(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public final Bitmap e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a8.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a8.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        public e f(boolean z) {
            m(16, z);
            return this;
        }

        public e g(String str) {
            this.K = str;
            return this;
        }

        public e h(int i) {
            this.E = i;
            return this;
        }

        public e i(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f = d(charSequence);
            return this;
        }

        public e k(CharSequence charSequence) {
            this.e = d(charSequence);
            return this;
        }

        public e l(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public final void m(int i, boolean z) {
            if (z) {
                Notification notification = this.S;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.S;
            notification2.flags = (~i) & notification2.flags;
        }

        public e n(Bitmap bitmap) {
            this.j = e(bitmap);
            return this;
        }

        public e o(boolean z) {
            this.z = z;
            return this;
        }

        public e p(int i) {
            this.m = i;
            return this;
        }

        public e q(int i) {
            this.S.icon = i;
            return this;
        }

        public e r(Uri uri) {
            Notification notification = this.S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e s(f fVar) {
            if (this.p != fVar) {
                this.p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e t(CharSequence charSequence) {
            this.S.tickerText = d(charSequence);
            return this;
        }

        public e u(long j) {
            this.S.when = j;
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}
