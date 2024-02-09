package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.jb;
import defpackage.u0;

/* compiled from: AxisPay */
/* renamed from: c0  reason: default package */
/* loaded from: classes.dex */
public class c0 extends Dialog implements a0 {
    public b0 b;
    public final jb.a c;

    /* compiled from: AxisPay */
    /* renamed from: c0$a */
    /* loaded from: classes.dex */
    public class a implements jb.a {
        public a() {
        }

        @Override // defpackage.jb.a
        public boolean g(KeyEvent keyEvent) {
            return c0.this.c(keyEvent);
        }
    }

    public c0(Context context, int i) {
        super(context, b(context, i));
        this.c = new a();
        b0 a2 = a();
        a2.F(b(context, i));
        a2.r(null);
    }

    public static int b(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(l.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    public b0 a() {
        if (this.b == null) {
            this.b = b0.h(this, this);
        }
        return this.b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i) {
        return a().A(i);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return jb.e(this.c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().i(i);
    }

    @Override // defpackage.a0
    public void i(u0 u0Var) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().p();
    }

    @Override // defpackage.a0
    public void l(u0 u0Var) {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().o();
        super.onCreate(bundle);
        a().r(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().x();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().B(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().G(charSequence);
    }

    @Override // defpackage.a0
    public u0 u(u0.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().C(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().D(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().G(getContext().getString(i));
    }
}
