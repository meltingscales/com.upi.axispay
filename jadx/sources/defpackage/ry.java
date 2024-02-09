package defpackage;

import android.graphics.Typeface;

/* compiled from: AxisPay */
/* renamed from: ry  reason: default package */
/* loaded from: classes.dex */
public final class ry extends wy {
    public final Typeface a;
    public final a b;
    public boolean c;

    /* compiled from: AxisPay */
    /* renamed from: ry$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(Typeface typeface);
    }

    public ry(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    @Override // defpackage.wy
    public void a(int i) {
        d(this.a);
    }

    @Override // defpackage.wy
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }

    public final void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }
}
