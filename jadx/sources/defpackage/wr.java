package defpackage;

import defpackage.yu;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: wr  reason: default package */
/* loaded from: classes.dex */
public class wr implements yr {
    public static final Logger f = Logger.getLogger(pq.class.getName());
    public final bt a;
    public final Executor b;
    public final wq c;
    public final lu d;
    public final yu e;

    public wr(Executor executor, wq wqVar, bt btVar, lu luVar, yu yuVar) {
        this.b = executor;
        this.c = wqVar;
        this.a = btVar;
        this.d = luVar;
        this.e = yuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Object c(lq lqVar, fq fqVar) {
        this.d.x(lqVar, fqVar);
        this.a.a(lqVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e(final lq lqVar, bp bpVar, fq fqVar) {
        try {
            er a = this.c.a(lqVar.b());
            if (a == null) {
                String format = String.format(C0059ao.a(6079), lqVar.b());
                f.warning(format);
                bpVar.a(new IllegalArgumentException(format));
                return;
            }
            final fq a2 = a.a(fqVar);
            this.e.b(new yu.a() { // from class: vr
                @Override // defpackage.yu.a
                public final Object execute() {
                    return wr.this.c(lqVar, a2);
                }
            });
            bpVar.a(null);
        } catch (Exception e) {
            Logger logger = f;
            logger.warning(C0059ao.a(6080) + e.getMessage());
            bpVar.a(e);
        }
    }

    @Override // defpackage.yr
    public void a(final lq lqVar, final fq fqVar, final bp bpVar) {
        this.b.execute(new Runnable() { // from class: ur
            @Override // java.lang.Runnable
            public final void run() {
                wr.this.e(lqVar, bpVar, fqVar);
            }
        });
    }
}
