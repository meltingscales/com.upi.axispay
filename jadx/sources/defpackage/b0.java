package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.Toolbar;
import defpackage.w;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: b0  reason: default package */
/* loaded from: classes.dex */
public abstract class b0 {
    public static int b;
    public static final p4<WeakReference<b0>> c;
    public static final Object d;

    static {
        C0059ao.a(b0.class, 397);
        c = new p4<>();
        d = new Object();
    }

    public static void c(b0 b0Var) {
        synchronized (d) {
            z(b0Var);
            c.add(new WeakReference<>(b0Var));
        }
    }

    public static b0 g(Activity activity, a0 a0Var) {
        return new AppCompatDelegateImpl(activity, a0Var);
    }

    public static b0 h(Dialog dialog, a0 a0Var) {
        return new AppCompatDelegateImpl(dialog, a0Var);
    }

    public static int j() {
        return b;
    }

    public static void y(b0 b0Var) {
        synchronized (d) {
            z(b0Var);
        }
    }

    public static void z(b0 b0Var) {
        synchronized (d) {
            Iterator<WeakReference<b0>> it = c.iterator();
            while (it.hasNext()) {
                b0 b0Var2 = it.next().get();
                if (b0Var2 == b0Var || b0Var2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract boolean A(int i);

    public abstract void B(int i);

    public abstract void C(View view);

    public abstract void D(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void E(Toolbar toolbar);

    public void F(int i) {
    }

    public abstract void G(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void e(Context context) {
    }

    public Context f(Context context) {
        e(context);
        return context;
    }

    public abstract <T extends View> T i(int i);

    public abstract w.b k();

    public int l() {
        return -100;
    }

    public abstract MenuInflater m();

    public abstract v n();

    public abstract void o();

    public abstract void p();

    public abstract void q(Configuration configuration);

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x();
}
