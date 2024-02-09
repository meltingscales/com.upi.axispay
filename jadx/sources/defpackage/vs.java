package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vs  reason: default package */
/* loaded from: classes.dex */
public class vs implements bt {
    public final Context a;
    public final lu b;
    public final ws c;

    public vs(Context context, lu luVar, ws wsVar) {
        this.a = context;
        this.b = luVar;
        this.c = wsVar;
    }

    @Override // defpackage.bt
    public void a(lq lqVar, int i) {
        b(lqVar, i, false);
    }

    @Override // defpackage.bt
    public void b(lq lqVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService(C0059ao.a(5151));
        int c = c(lqVar);
        String a = C0059ao.a(5152);
        if (!z && d(jobScheduler, c, i)) {
            qr.a(a, C0059ao.a(5153), lqVar);
            return;
        }
        long A = this.b.A(lqVar);
        ws wsVar = this.c;
        JobInfo.Builder builder = new JobInfo.Builder(c, componentName);
        wsVar.c(builder, lqVar.d(), A, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt(C0059ao.a(5154), i);
        persistableBundle.putString(C0059ao.a(5155), lqVar.b());
        persistableBundle.putInt(C0059ao.a(5156), fv.a(lqVar.d()));
        if (lqVar.c() != null) {
            persistableBundle.putString(C0059ao.a(5157), Base64.encodeToString(lqVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        qr.b(a, C0059ao.a(5158), lqVar, Integer.valueOf(c), Long.valueOf(this.c.g(lqVar.d(), A, i)), Long.valueOf(A), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }

    public int c(lq lqVar) {
        Adler32 adler32 = new Adler32();
        String packageName = this.a.getPackageName();
        String a = C0059ao.a(5159);
        adler32.update(packageName.getBytes(Charset.forName(a)));
        adler32.update(lqVar.b().getBytes(Charset.forName(a)));
        adler32.update(ByteBuffer.allocate(4).putInt(fv.a(lqVar.d())).array());
        if (lqVar.c() != null) {
            adler32.update(lqVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt(C0059ao.a(5160));
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }
}
