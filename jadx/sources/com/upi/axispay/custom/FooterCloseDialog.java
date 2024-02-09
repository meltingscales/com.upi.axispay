package com.upi.axispay.custom;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.upi.axispay.R;
import defpackage.y;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FooterCloseDialog extends DialogFragment {
    public static FooterCloseDialog singleButtonDialog;
    public String footer;
    public String message;
    public String title;

    public static FooterCloseDialog newInstance() {
        FooterCloseDialog footerCloseDialog = new FooterCloseDialog();
        singleButtonDialog = footerCloseDialog;
        return footerCloseDialog;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        y.a aVar = new y.a(getActivity(), R.style.Button_Dialog);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(getActivity()).inflate(R.layout.fragment_footer_close_dialog, (ViewGroup) null);
        ((TextView) relativeLayout.findViewById(R.id.dialog_title)).setText(this.title);
        ((TextView) relativeLayout.findViewById(R.id.dialog_message)).setText(this.message);
        ((TextView) relativeLayout.findViewById(R.id.dialog_footer)).setText(this.footer);
        ((ImageView) relativeLayout.findViewById(R.id.dialog_close)).setOnClickListener(new View.OnClickListener() { // from class: com.upi.axispay.custom.FooterCloseDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FooterCloseDialog.this.dismiss();
            }
        });
        aVar.k(relativeLayout);
        aVar.d(false);
        y a = aVar.a();
        if (a != null && a.getWindow() != null) {
            a.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
            a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        return a;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_footer_close_dialog, viewGroup, false);
    }

    public void setFooter(String str) {
        this.footer = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
