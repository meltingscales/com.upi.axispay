package defpackage;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: p8  reason: default package */
/* loaded from: classes.dex */
public class p8 {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public IconCompat a() {
        return this.b;
    }

    public String b() {
        return this.d;
    }

    public CharSequence c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String g() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        if (this.a != null) {
            return C0059ao.a(14152) + ((Object) this.a);
        }
        return C0059ao.a(14153);
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().q() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}
