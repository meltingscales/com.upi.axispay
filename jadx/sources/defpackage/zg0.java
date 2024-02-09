package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: zg0  reason: default package */
/* loaded from: classes.dex */
public class zg0 {
    public static /* synthetic */ void a(CheckBox checkBox, Dialog dialog, View view) {
        if (checkBox.isChecked()) {
            n70.f.a().y(C0059ao.a(14992), String.valueOf(true));
            dialog.dismiss();
        }
    }

    public static void b(Context context) {
        final Dialog dialog = new Dialog(context, R.style.Theme_Dialog);
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(R.layout.terms_conditions);
        dialog.getWindow().setLayout(-1, -2);
        ((TextView) dialog.findViewById(R.id.text_conditions)).setText(Html.fromHtml(context.getString(R.string.tnc_html_text)));
        final CheckBox checkBox = (CheckBox) dialog.findViewById(R.id.check_tc);
        dialog.setCancelable(true);
        dialog.show();
        ((Button) dialog.findViewById(R.id.submit_btn)).setOnClickListener(new View.OnClickListener() { // from class: ug0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zg0.a(checkBox, dialog, view);
            }
        });
    }
}
