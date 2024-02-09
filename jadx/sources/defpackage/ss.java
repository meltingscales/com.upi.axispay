package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ss  reason: default package */
/* loaded from: classes.dex */
public class ss implements bt {
    public final Context a;
    public final lu b;
    public AlarmManager c;
    public final ws d;
    public final zu e;

    public ss(Context context, lu luVar, zu zuVar, ws wsVar) {
        this(context, luVar, (AlarmManager) context.getSystemService(C0059ao.a(2543)), zuVar, wsVar);
    }

    @Override // defpackage.bt
    public void a(lq lqVar, int i) {
        b(lqVar, i, false);
    }

    @Override // defpackage.bt
    public void b(lq lqVar, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter(C0059ao.a(2544), lqVar.b());
        builder.appendQueryParameter(C0059ao.a(2545), String.valueOf(fv.a(lqVar.d())));
        if (lqVar.c() != null) {
            builder.appendQueryParameter(C0059ao.a(2546), Base64.encodeToString(lqVar.c(), 0));
        }
        Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra(C0059ao.a(2547), i);
        String a = C0059ao.a(2548);
        if (!z && c(intent)) {
            qr.a(a, C0059ao.a(2549), lqVar);
            return;
        }
        long A = this.b.A(lqVar);
        long g = this.d.g(lqVar.d(), A, i);
        qr.b(a, C0059ao.a(2550), lqVar, Long.valueOf(g), Long.valueOf(A), Integer.valueOf(i));
        this.c.set(3, this.e.a() + g, PendingIntent.getBroadcast(this.a, 0, intent, 0));
    }

    public boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null;
    }

    public ss(Context context, lu luVar, AlarmManager alarmManager, zu zuVar, ws wsVar) {
        this.a = context;
        this.b = luVar;
        this.c = alarmManager;
        this.e = zuVar;
        this.d = wsVar;
    }
}
