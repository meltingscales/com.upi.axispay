package defpackage;

import defpackage.yu;
import java.util.concurrent.Executor;

/* compiled from: AxisPay */
/* renamed from: zs  reason: default package */
/* loaded from: classes.dex */
public class zs {
    public final Executor a;
    public final lu b;
    public final bt c;
    public final yu d;

    public zs(Executor executor, lu luVar, bt btVar, yu yuVar) {
        this.a = executor;
        this.b = luVar;
        this.c = btVar;
        this.d = yuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Object c() {
        for (lq lqVar : this.b.y()) {
            this.c.a(lqVar, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e() {
        this.d.b(new yu.a() { // from class: ps
            @Override // defpackage.yu.a
            public final Object execute() {
                return zs.this.c();
            }
        });
    }

    public void a() {
        this.a.execute(new Runnable() { // from class: qs
            @Override // java.lang.Runnable
            public final void run() {
                zs.this.e();
            }
        });
    }
}
