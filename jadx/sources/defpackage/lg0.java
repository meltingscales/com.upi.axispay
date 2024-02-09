package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: lg0  reason: default package */
/* loaded from: classes.dex */
public class lg0 extends DialogFragment {
    public String[] b = {C0059ao.a(7912), C0059ao.a(7913)};
    public String[] c = {C0059ao.a(7914), C0059ao.a(7915)};
    public b d;

    /* compiled from: AxisPay */
    /* renamed from: lg0$a */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (lg0.this.d != null) {
                lg0.this.d.a((TextUtils.isEmpty(this.b) || this.b.equalsIgnoreCase(C0059ao.a(9751))) ? lg0.this.b[i] : lg0.this.c[i]);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: lg0$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    public void d(b bVar) {
        this.d = bVar;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        String m = n70.f.a().m(C0059ao.a(7916));
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getString(R.string.select_mode)).setItems((TextUtils.isEmpty(m) || m.equalsIgnoreCase(C0059ao.a(7917))) ? this.b : this.c, new a(m));
        return builder.create();
    }
}
