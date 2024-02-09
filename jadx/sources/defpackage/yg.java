package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: yg  reason: default package */
/* loaded from: classes.dex */
public class yg extends rd {
    public boolean b = false;
    public Dialog c;
    public xh d;

    public yg() {
        setCancelable(true);
    }

    public final void j() {
        if (this.d == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.d = xh.d(arguments.getBundle(C0059ao.a(7761)));
            }
            if (this.d == null) {
                this.d = xh.c;
            }
        }
    }

    public xg k(Context context, Bundle bundle) {
        return new xg(context);
    }

    public ch l(Context context) {
        return new ch(context);
    }

    public void m(xh xhVar) {
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
            arguments.putBundle(C0059ao.a(7762), xhVar.a());
            setArguments(arguments);
            Dialog dialog = this.c;
            if (dialog == null || !this.b) {
                return;
            }
            ((ch) dialog).p(xhVar);
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(7763));
    }

    public void n(boolean z) {
        if (this.c == null) {
            this.b = z;
            return;
        }
        throw new IllegalStateException(C0059ao.a(7764));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.c;
        if (dialog != null) {
            if (this.b) {
                ((ch) dialog).r();
            } else {
                ((xg) dialog).J();
            }
        }
    }

    @Override // defpackage.rd
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.b) {
            ch l = l(getContext());
            this.c = l;
            l.p(this.d);
        } else {
            this.c = k(getContext(), bundle);
        }
        return this.c;
    }

    @Override // defpackage.rd, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.c;
        if (dialog == null || this.b) {
            return;
        }
        ((xg) dialog).m(false);
    }
}
