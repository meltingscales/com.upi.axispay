package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: s8  reason: default package */
/* loaded from: classes.dex */
public final class s8 implements Iterable<Intent> {
    public final ArrayList<Intent> b = new ArrayList<>();
    public final Context c;

    /* compiled from: AxisPay */
    /* renamed from: s8$a */
    /* loaded from: classes.dex */
    public interface a {
        Intent r();
    }

    public s8(Context context) {
        this.c = context;
    }

    public static s8 d(Context context) {
        return new s8(context);
    }

    public s8 a(Intent intent) {
        this.b.add(intent);
        return this;
    }

    public s8 b(Activity activity) {
        Intent r = activity instanceof a ? ((a) activity).r() : null;
        if (r == null) {
            r = k8.a(activity);
        }
        if (r != null) {
            ComponentName component = r.getComponent();
            if (component == null) {
                component = r.resolveActivity(this.c.getPackageManager());
            }
            c(component);
            a(r);
        }
        return this;
    }

    public s8 c(ComponentName componentName) {
        int size = this.b.size();
        try {
            Intent b = k8.b(this.c, componentName);
            while (b != null) {
                this.b.add(size, b);
                b = k8.b(this.c, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(C0059ao.a(610), C0059ao.a(611));
            throw new IllegalArgumentException(e);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (!this.b.isEmpty()) {
            ArrayList<Intent> arrayList = this.b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (t8.k(this.c, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.c.startActivity(intent);
            return;
        }
        throw new IllegalStateException(C0059ao.a(612));
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.b.iterator();
    }
}
