package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;
import com.upi.axispay.R;
import com.upi.axispay.custom.DoubleButtonDialog;
import com.upi.axispay.custom.FooterCloseDialog;
import com.upi.axispay.custom.LoginPopupFragment;
import com.upi.axispay.custom.RateAppDialog;
import com.upi.axispay.custom.SingleButtonDialog;
import com.upi.axispay.custom.SingleButtonImageDialog;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: eg0  reason: default package */
/* loaded from: classes.dex */
public class eg0 {
    public static Dialog a;
    public static Dialog b;
    public static b70 c;
    public static DialogFragment d;
    public static DialogFragment e;
    public static LoginPopupFragment f;

    /* compiled from: AxisPay */
    /* renamed from: eg0$a */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: eg0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: eg0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: eg0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: eg0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: eg0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: eg0$g */
    /* loaded from: classes.dex */
    public class g implements DialogInterface.OnClickListener {
        public final /* synthetic */ View.OnClickListener b;

        public g(View.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            View.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(null);
            }
        }
    }

    public static void A(Context context, String str) {
        if (str == null || context == null) {
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.custom_toast, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        Toast toast = new Toast(context);
        toast.setDuration(0);
        toast.setView(inflate);
        toast.show();
    }

    public static void B() {
        b70 b70Var = c;
        if (b70Var != null) {
            try {
                b70Var.dismiss();
            } catch (Exception unused) {
            }
        }
        c = null;
    }

    public static void C(Activity activity, String str) {
        b70 b70Var;
        if (activity == null || activity.isFinishing() || (b70Var = c) == null) {
            return;
        }
        if (str == null) {
            str = activity.getString(R.string.please_wait);
        }
        b70Var.setMessage(str);
    }

    public static void a() {
        if (b != null) {
            b = null;
        }
    }

    public static void b() {
        Dialog dialog = b;
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    public static synchronized void c() {
        synchronized (eg0.class) {
            DialogFragment dialogFragment = d;
            if (dialogFragment != null && dialogFragment.isAdded()) {
                d.dismissAllowingStateLoss();
                d = null;
            }
            d = null;
        }
    }

    public static void d() {
        try {
            LoginPopupFragment loginPopupFragment = f;
            if (loginPopupFragment != null) {
                loginPopupFragment.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static void e() {
        DialogFragment dialogFragment = e;
        if (dialogFragment != null && dialogFragment.isAdded()) {
            e.dismissAllowingStateLoss();
        }
        e = null;
    }

    public static void f(Activity activity, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        Dialog dialog = a;
        if (dialog != null) {
            Context baseContext = ((ContextWrapper) dialog.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                if (!((Activity) baseContext).isFinishing()) {
                    a.dismiss();
                }
            } else {
                a.dismiss();
            }
        }
        B();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setCancelable(false);
        builder.setPositiveButton(str3, onClickListener);
        AlertDialog create = builder.create();
        a = create;
        create.show();
    }

    public static void g(Activity activity, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        Dialog dialog = a;
        if (dialog != null) {
            dialog.setCancelable(false);
            Context baseContext = ((ContextWrapper) a.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                if (!((Activity) baseContext).isFinishing() && a.isShowing()) {
                    a.dismiss();
                }
            } else {
                a.dismiss();
            }
        }
        B();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        builder.setMessage(str2);
        builder.setPositiveButton(str4, onClickListener2);
        builder.setNegativeButton(str3, onClickListener);
        AlertDialog create = builder.create();
        a = create;
        create.show();
    }

    public static void h(Activity activity, String str, String str2) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        B();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Dialog dialog = a;
        if (dialog != null) {
            Context baseContext = ((ContextWrapper) dialog.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                if (!((Activity) baseContext).isFinishing() && a.isShowing()) {
                    a.dismiss();
                }
            } else if (a.isShowing()) {
                a.dismiss();
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(R.string.ok_text, new a());
        AlertDialog create = builder.create();
        a = create;
        create.show();
    }

    public static void i(Activity activity) {
        if (activity != null) {
            j(activity, activity.getString(R.string.please_wait));
        }
    }

    public static void j(Activity activity, String str) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        b70 b70Var = c;
        if (b70Var == null) {
            b70 b70Var2 = new b70(activity);
            c = b70Var2;
            b70Var2.setCancelable(false);
            c.show();
            c.setMessage(str);
            return;
        }
        b70Var.setMessage(str);
    }

    public static synchronized void k(Activity activity, String str, View.OnClickListener onClickListener, String str2, View.OnClickListener onClickListener2) {
        synchronized (eg0.class) {
            if (activity == null) {
                return;
            }
            if (b != null) {
                return;
            }
            Dialog dialog = new Dialog(activity);
            b = dialog;
            dialog.setContentView(R.layout.unsecure_network_dialog);
            Button button = (Button) b.findViewById(R.id.exit_unsecure_btn);
            Button button2 = (Button) b.findViewById(R.id.continue_btn);
            button.setText(str);
            button2.setText(str2);
            button.setOnClickListener(onClickListener);
            button2.setOnClickListener(onClickListener2);
            b.setCancelable(false);
            b.show();
        }
    }

    public static void l(Context context, String str, String str2, View.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str).setMessage(str2).setPositiveButton(C0059ao.a(10057), new g(onClickListener));
        builder.create().show();
    }

    public static void m(Activity activity, String str) {
        if (activity == null) {
            return;
        }
        B();
        p(activity, activity.getString(R.string.alert), str, activity.getString(R.string.okay), new b(), new c());
    }

    public static void n(Activity activity, String str, View.OnClickListener onClickListener) {
        p(activity, activity.getString(R.string.alert), str, activity.getString(R.string.okay), onClickListener, new d());
    }

    public static void o(Activity activity, String str, String str2, String str3, View.OnClickListener onClickListener) {
        p(activity, str, str2, str3, onClickListener, new e());
    }

    public static synchronized void p(Activity activity, String str, String str2, String str3, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        synchronized (eg0.class) {
            if (activity == null) {
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (d != null) {
                return;
            }
            SingleButtonDialog newInstance = SingleButtonDialog.newInstance();
            newInstance.setTitle(str);
            newInstance.setMessage(str2);
            newInstance.setOkListner(onClickListener);
            newInstance.setOkBtnText(str3);
            newInstance.setCancelListner(onClickListener2);
            newInstance.setCancelable(false);
            newInstance.show(activity.getFragmentManager(), newInstance.getClass().getName());
            d = newInstance;
        }
    }

    public static void q(Activity activity, String str, String str2, String str3, View.OnClickListener onClickListener, boolean z) {
        if (z) {
            p(activity, str, str2, str3, onClickListener, onClickListener);
        } else {
            p(activity, str, str2, str3, onClickListener, new f());
        }
    }

    public static void r(Activity activity, String str, String str2, String str3, View.OnClickListener onClickListener, String str4, View.OnClickListener onClickListener2) {
        if (activity == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            c();
            if (d != null) {
                return;
            }
            DoubleButtonDialog newInstance = DoubleButtonDialog.newInstance();
            newInstance.setTitle(str);
            newInstance.setMessage(str2);
            newInstance.setOkListner(onClickListener);
            newInstance.setCancelListner(onClickListener2);
            newInstance.setOkBtnText(str3);
            newInstance.setCancelBtnText(str4);
            newInstance.setCancelable(false);
            newInstance.show(activity.getFragmentManager(), newInstance.getClass().getName());
            d = newInstance;
        } catch (Exception unused) {
        }
    }

    public static void s(Activity activity, String str, String str2, String str3, View.OnClickListener onClickListener, String str4, View.OnClickListener onClickListener2, boolean z) {
        if (activity == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            c();
            if (d != null) {
                return;
            }
            DoubleButtonDialog newInstance = DoubleButtonDialog.newInstance();
            newInstance.setTitle(str);
            newInstance.setMessage(str2);
            newInstance.setOkListner(onClickListener);
            newInstance.setCancelListner(onClickListener2);
            newInstance.setOkBtnText(str3);
            newInstance.setCancelBtnText(str4);
            newInstance.setCancelable(false);
            newInstance.imageHide(z);
            newInstance.show(activity.getFragmentManager(), newInstance.getClass().getName());
            d = newInstance;
        } catch (Exception unused) {
        }
    }

    public static void t(Activity activity, String str, String str2, String str3) {
        if (activity == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            FooterCloseDialog newInstance = FooterCloseDialog.newInstance();
            newInstance.setTitle(str);
            newInstance.setMessage(str2);
            newInstance.setFooter(str3);
            newInstance.setCancelable(false);
            newInstance.show(activity.getFragmentManager(), newInstance.getClass().getName());
            d = newInstance;
        } catch (Exception unused) {
        }
    }

    public static void u(Activity activity, String str, String str2, boolean z, String str3, View.OnClickListener onClickListener) {
        if (activity == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            SingleButtonImageDialog newInstance = SingleButtonImageDialog.newInstance();
            newInstance.setTitle(str);
            newInstance.setMessage(str2);
            newInstance.setIconRequired(z);
            newInstance.setOkBtnText(str3);
            newInstance.setOkListner(onClickListener);
            newInstance.setCancelable(false);
            newInstance.show(activity.getFragmentManager(), newInstance.getClass().getName());
            d = newInstance;
        } catch (Exception unused) {
        }
    }

    public static void v(Activity activity, int i, String str) {
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        } else if (activity.isFinishing()) {
            return;
        }
        try {
            c();
            LoginPopupFragment newInstance = LoginPopupFragment.newInstance(i);
            if (newInstance.isAdded()) {
                return;
            }
            newInstance.setMessage(str);
            newInstance.setCancelable(false);
            newInstance.show(activity.getFragmentManager(), newInstance.getClass().getName());
            f = newInstance;
        } catch (Exception unused) {
        }
    }

    public static void w(Activity activity, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (activity != null && e == null) {
            try {
                c();
                e();
                RateAppDialog newInstance = RateAppDialog.newInstance();
                if (newInstance.isAdded()) {
                    return;
                }
                newInstance.setRateNow(onClickListener);
                newInstance.setRemindLater(onClickListener2);
                newInstance.setCancelable(false);
                newInstance.show(activity.getFragmentManager(), newInstance.getClass().getName());
                e = newInstance;
            } catch (Exception unused) {
            }
        }
    }

    public static void x(View view, int i) {
        B();
        if (view == null) {
            return;
        }
        Snackbar X = Snackbar.X(view, i, 0);
        ((TextView) X.B().findViewById(R.id.snackbar_text)).setTextColor(-1);
        X.N();
    }

    public static void y(View view, String str) {
        B();
        if (view == null) {
            return;
        }
        Snackbar Y = Snackbar.Y(view, str, 0);
        ((TextView) Y.B().findViewById(R.id.snackbar_text)).setTextColor(-1);
        Y.N();
    }

    public static void z(Context context, int i) {
        if (context == null) {
            return;
        }
        Toast makeText = Toast.makeText(context, i, 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }
}
