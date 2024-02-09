package com.upi.axispay.custom;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.upi.axispay.R;
import defpackage.y;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SingleButtonImageDialog extends DialogFragment {
    public static SingleButtonImageDialog singleButtonDialog;
    public boolean iconRequired;
    public String message;
    public String okBtnText;
    public View.OnClickListener okListner;
    public String title;

    public static SingleButtonImageDialog newInstance() {
        SingleButtonImageDialog singleButtonImageDialog = new SingleButtonImageDialog();
        singleButtonDialog = singleButtonImageDialog;
        return singleButtonImageDialog;
    }

    public boolean isIconRequired() {
        return this.iconRequired;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        y.a aVar = new y.a(getActivity());
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getActivity()).inflate(R.layout.fragment_single_button_image_dialog, (ViewGroup) null);
        Button button = (Button) linearLayout.findViewById(R.id.button_ok);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.dialog_close);
        ImageView imageView2 = (ImageView) linearLayout.findViewById(R.id.dialog_icon);
        ((TextView) linearLayout.findViewById(R.id.dialog_title)).setText(this.title);
        imageView2.setVisibility(isIconRequired() ? 0 : 8);
        ((TextView) linearLayout.findViewById(R.id.dialog_message)).setText(this.message);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.upi.axispay.custom.SingleButtonImageDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SingleButtonImageDialog.this.dismiss();
            }
        });
        aVar.k(linearLayout);
        aVar.d(false);
        button.setText(this.okBtnText);
        button.setOnClickListener(this.okListner);
        y a = aVar.a();
        if (a != null && a.getWindow() != null) {
            a.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
            a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        return a;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_single_button_image_dialog, viewGroup, false);
    }

    public void setIconRequired(boolean z) {
        this.iconRequired = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setOkBtnText(String str) {
        this.okBtnText = str;
    }

    public void setOkListner(View.OnClickListener onClickListener) {
        this.okListner = onClickListener;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
