package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import defpackage.na;
import defpackage.oa;

/* compiled from: AxisPay */
/* renamed from: ja  reason: default package */
/* loaded from: classes.dex */
public class ja {
    public final oa.c a;
    public final Handler b;

    /* compiled from: AxisPay */
    /* renamed from: ja$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ oa.c b;
        public final /* synthetic */ Typeface c;

        public a(ja jaVar, oa.c cVar, Typeface typeface) {
            this.b = cVar;
            this.c = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.b(this.c);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ja$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ oa.c b;
        public final /* synthetic */ int c;

        public b(ja jaVar, oa.c cVar, int i) {
            this.b = cVar;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.a(this.c);
        }
    }

    public ja(oa.c cVar, Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    public final void a(int i) {
        this.b.post(new b(this, this.a, i));
    }

    public void b(na.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }

    public final void c(Typeface typeface) {
        this.b.post(new a(this, this.a, typeface));
    }
}
