package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: AxisPay */
/* renamed from: jy  reason: default package */
/* loaded from: classes.dex */
public class jy {
    public float c;
    public uy f;
    public final TextPaint a = new TextPaint(1);
    public final wy b = new a();
    public boolean d = true;
    public WeakReference<b> e = new WeakReference<>(null);

    /* compiled from: AxisPay */
    /* renamed from: jy$a */
    /* loaded from: classes.dex */
    public class a extends wy {
        public a() {
        }

        @Override // defpackage.wy
        public void a(int i) {
            jy.this.d = true;
            b bVar = (b) jy.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // defpackage.wy
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            jy.this.d = true;
            b bVar = (b) jy.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: jy$b */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public jy(b bVar) {
        g(bVar);
    }

    public final float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    public uy d() {
        return this.f;
    }

    public TextPaint e() {
        return this.a;
    }

    public float f(String str) {
        if (!this.d) {
            return this.c;
        }
        float c = c(str);
        this.c = c;
        this.d = false;
        return c;
    }

    public void g(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void h(uy uyVar, Context context) {
        if (this.f != uyVar) {
            this.f = uyVar;
            if (uyVar != null) {
                uyVar.k(context, this.a, this.b);
                b bVar = this.e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                uyVar.j(context, this.a, this.b);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.d = z;
    }

    public void j(Context context) {
        this.f.j(context, this.a, this.b);
    }
}
