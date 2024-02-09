package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AxisPay */
/* renamed from: y  reason: default package */
/* loaded from: classes.dex */
public class y extends c0 implements DialogInterface {
    public final AlertController d;

    /* compiled from: AxisPay */
    /* renamed from: y$a */
    /* loaded from: classes.dex */
    public static class a {
        public final AlertController.f a;
        public final int b;

        public a(Context context) {
            this(context, y.f(context, 0));
        }

        public y a() {
            y yVar = new y(this.a.a, this.b);
            this.a.a(yVar.d);
            yVar.setCancelable(this.a.r);
            if (this.a.r) {
                yVar.setCanceledOnTouchOutside(true);
            }
            yVar.setOnCancelListener(this.a.s);
            yVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                yVar.setOnKeyListener(onKeyListener);
            }
            return yVar;
        }

        public Context b() {
            return this.a.a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(boolean z) {
            this.a.r = z;
            return this;
        }

        public a e(View view) {
            this.a.g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public a g(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a h(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a i(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a j(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public a k(View view) {
            AlertController.f fVar = this.a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, y.f(context, i)));
            this.b = i;
        }
    }

    public y(Context context, int i) {
        super(context, f(context, i));
        this.d = new AlertController(getContext(), this, getWindow());
    }

    public static int f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(l.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.d.d();
    }

    @Override // defpackage.c0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.d.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.d.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.c0, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.d.q(charSequence);
    }
}
