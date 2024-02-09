package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: gb  reason: default package */
/* loaded from: classes.dex */
public final class gb {
    public final ClipData a;
    public final int b;
    public final int c;
    public final Uri d;
    public final Bundle e;

    /* compiled from: AxisPay */
    /* renamed from: gb$a */
    /* loaded from: classes.dex */
    public static final class a {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        public a(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        public gb a() {
            return new gb(this);
        }

        public a b(Bundle bundle) {
            this.e = bundle;
            return this;
        }

        public a c(int i) {
            this.c = i;
            return this;
        }

        public a d(Uri uri) {
            this.d = uri;
            return this;
        }
    }

    public gb(a aVar) {
        ClipData clipData = aVar.a;
        db.e(clipData);
        this.a = clipData;
        int i = aVar.b;
        db.b(i, 0, 3, C0059ao.a(6398));
        this.b = i;
        int i2 = aVar.c;
        db.d(i2, 1);
        this.c = i2;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    public static String a(int i) {
        return (i & 1) != 0 ? C0059ao.a(6399) : String.valueOf(i);
    }

    public static String e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? String.valueOf(i) : C0059ao.a(6400) : C0059ao.a(6401) : C0059ao.a(6402) : C0059ao.a(6403);
    }

    public ClipData b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.b;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(6404));
        sb.append(this.a.getDescription());
        sb.append(C0059ao.a(6405));
        sb.append(e(this.b));
        sb.append(C0059ao.a(6406));
        sb.append(a(this.c));
        Uri uri = this.d;
        String a2 = C0059ao.a(6407);
        if (uri == null) {
            str = a2;
        } else {
            str = C0059ao.a(6408) + this.d.toString().length() + C0059ao.a(6409);
        }
        sb.append(str);
        if (this.e != null) {
            a2 = C0059ao.a(6410);
        }
        sb.append(a2);
        sb.append(C0059ao.a(6411));
        return sb.toString();
    }
}
