package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: AxisPay */
/* renamed from: rc  reason: default package */
/* loaded from: classes.dex */
public final class rc {
    public final c a;

    /* compiled from: AxisPay */
    /* renamed from: rc$b */
    /* loaded from: classes.dex */
    public static final class b implements c {
        public final Uri a;
        public final ClipDescription b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // defpackage.rc.c
        public ClipDescription a() {
            return this.b;
        }

        @Override // defpackage.rc.c
        public Object b() {
            return null;
        }

        @Override // defpackage.rc.c
        public Uri c() {
            return this.a;
        }

        @Override // defpackage.rc.c
        public void d() {
        }

        @Override // defpackage.rc.c
        public Uri e() {
            return this.c;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rc$c */
    /* loaded from: classes.dex */
    public interface c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public rc(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    public static rc f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new rc(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.a.c();
    }

    public ClipDescription b() {
        return this.a.a();
    }

    public Uri c() {
        return this.a.e();
    }

    public void d() {
        this.a.d();
    }

    public Object e() {
        return this.a.b();
    }

    /* compiled from: AxisPay */
    /* renamed from: rc$a */
    /* loaded from: classes.dex */
    public static final class a implements c {
        public final InputContentInfo a;

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // defpackage.rc.c
        public ClipDescription a() {
            return this.a.getDescription();
        }

        @Override // defpackage.rc.c
        public Object b() {
            return this.a;
        }

        @Override // defpackage.rc.c
        public Uri c() {
            return this.a.getContentUri();
        }

        @Override // defpackage.rc.c
        public void d() {
            this.a.requestPermission();
        }

        @Override // defpackage.rc.c
        public Uri e() {
            return this.a.getLinkUri();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public rc(c cVar) {
        this.a = cVar;
    }
}
