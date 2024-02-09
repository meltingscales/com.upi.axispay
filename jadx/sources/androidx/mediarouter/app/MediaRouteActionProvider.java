package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.yh;
import java.lang.ref.WeakReference;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MediaRouteActionProvider extends fb {
    public final yh c;
    public xh d;
    public zg e;
    public ug f;
    public boolean g;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class a extends yh.b {
        public final WeakReference<MediaRouteActionProvider> a;

        public a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.a = new WeakReference<>(mediaRouteActionProvider);
        }

        @Override // defpackage.yh.b
        public void a(yh yhVar, yh.h hVar) {
            n(yhVar);
        }

        @Override // defpackage.yh.b
        public void b(yh yhVar, yh.h hVar) {
            n(yhVar);
        }

        @Override // defpackage.yh.b
        public void c(yh yhVar, yh.h hVar) {
            n(yhVar);
        }

        @Override // defpackage.yh.b
        public void d(yh yhVar, yh.i iVar) {
            n(yhVar);
        }

        @Override // defpackage.yh.b
        public void e(yh yhVar, yh.i iVar) {
            n(yhVar);
        }

        @Override // defpackage.yh.b
        public void g(yh yhVar, yh.i iVar) {
            n(yhVar);
        }

        public final void n(yh yhVar) {
            MediaRouteActionProvider mediaRouteActionProvider = this.a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.n();
            } else {
                yhVar.o(this);
            }
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.d = xh.c;
        this.e = zg.a();
        this.c = yh.g(context);
        new a(this);
    }

    @Override // defpackage.fb
    public boolean c() {
        return this.g || this.c.m(this.d, 1);
    }

    @Override // defpackage.fb
    public View d() {
        if (this.f != null) {
            Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        ug m = m();
        this.f = m;
        m.setCheatSheetEnabled(true);
        this.f.setRouteSelector(this.d);
        this.f.setAlwaysVisible(this.g);
        this.f.setDialogFactory(this.e);
        this.f.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.f;
    }

    @Override // defpackage.fb
    public boolean f() {
        ug ugVar = this.f;
        if (ugVar != null) {
            return ugVar.d();
        }
        return false;
    }

    @Override // defpackage.fb
    public boolean h() {
        return true;
    }

    public ug m() {
        return new ug(a());
    }

    public void n() {
        i();
    }
}
