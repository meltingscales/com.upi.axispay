package defpackage;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import defpackage.o1;
import defpackage.y;

/* compiled from: AxisPay */
/* renamed from: j1  reason: default package */
/* loaded from: classes.dex */
public class j1 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, o1.a {
    public i1 b;
    public y c;
    public g1 d;
    public o1.a e;

    public j1(i1 i1Var) {
        this.b = i1Var;
    }

    public void a() {
        y yVar = this.c;
        if (yVar != null) {
            yVar.dismiss();
        }
    }

    @Override // defpackage.o1.a
    public void b(i1 i1Var, boolean z) {
        if (z || i1Var == this.b) {
            a();
        }
        o1.a aVar = this.e;
        if (aVar != null) {
            aVar.b(i1Var, z);
        }
    }

    @Override // defpackage.o1.a
    public boolean c(i1 i1Var) {
        o1.a aVar = this.e;
        if (aVar != null) {
            return aVar.c(i1Var);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        i1 i1Var = this.b;
        y.a aVar = new y.a(i1Var.w());
        g1 g1Var = new g1(aVar.b(), r.abc_list_menu_item_layout);
        this.d = g1Var;
        g1Var.m(this);
        this.b.b(this.d);
        aVar.c(this.d.a(), this);
        View A = i1Var.A();
        if (A != null) {
            aVar.e(A);
        } else {
            aVar.f(i1Var.y());
            aVar.j(i1Var.z());
        }
        aVar.g(this);
        y a = aVar.a();
        this.c = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.N((k1) this.d.a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.d.b(this.b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.b.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.b.performShortcut(i, keyEvent, 0);
    }
}
