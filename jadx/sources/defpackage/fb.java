package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fb  reason: default package */
/* loaded from: classes.dex */
public abstract class fb {
    public final Context a;
    public b b;

    /* compiled from: AxisPay */
    /* renamed from: fb$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: AxisPay */
    /* renamed from: fb$b */
    /* loaded from: classes.dex */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public fb(Context context) {
        this.a = context;
    }

    public Context a() {
        return this.a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public abstract View d();

    public View e(MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.b == null || !h()) {
            return;
        }
        this.b.onActionProviderVisibilityChanged(c());
    }

    public void j() {
        this.b = null;
    }

    public void k(a aVar) {
    }

    public void l(b bVar) {
        if (this.b != null && bVar != null) {
            Log.w(C0059ao.a(5575), C0059ao.a(5573) + getClass().getSimpleName() + C0059ao.a(5574));
        }
        this.b = bVar;
    }
}
