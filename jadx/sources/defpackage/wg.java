package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: wg  reason: default package */
/* loaded from: classes.dex */
public class wg extends rd {
    public boolean b = false;
    public Dialog c;
    public xh d;

    public wg() {
        setCancelable(true);
    }

    public final void j() {
        if (this.d == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.d = xh.d(arguments.getBundle(C0059ao.a(5813)));
            }
            if (this.d == null) {
                this.d = xh.c;
            }
        }
    }

    public xh k() {
        j();
        return this.d;
    }

    public vg l(Context context, Bundle bundle) {
        return new vg(context);
    }

    public bh m(Context context) {
        return new bh(context);
    }

    public void n(xh xhVar) {
        if (xhVar != null) {
            j();
            if (this.d.equals(xhVar)) {
                return;
            }
            this.d = xhVar;
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putBundle(C0059ao.a(5814), xhVar.a());
            setArguments(arguments);
            Dialog dialog = this.c;
            if (dialog != null) {
                if (this.b) {
                    ((bh) dialog).h(xhVar);
                    return;
                } else {
                    ((vg) dialog).h(xhVar);
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(5815));
    }

    public void o(boolean z) {
        if (this.c == null) {
            this.b = z;
            return;
        }
        throw new IllegalStateException(C0059ao.a(5816));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.c;
        if (dialog == null) {
            return;
        }
        if (this.b) {
            ((bh) dialog).j();
        } else {
            ((vg) dialog).j();
        }
    }

    @Override // defpackage.rd
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.b) {
            bh m = m(getContext());
            this.c = m;
            m.h(k());
        } else {
            vg l = l(getContext(), bundle);
            this.c = l;
            l.h(k());
        }
        return this.c;
    }
}
