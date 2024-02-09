package com.upi.axispay.custom;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.upi.axispay.R;
import defpackage.y;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SingleButtonDialog extends DialogFragment {
    public static SingleButtonDialog singleButtonDialog;
    public View.OnClickListener cancelListner;
    public String message;
    public String okBtnText;
    public View.OnClickListener okListner;
    public String title;

    public static SingleButtonDialog newInstance() {
        SingleButtonDialog singleButtonDialog2 = new SingleButtonDialog();
        singleButtonDialog = singleButtonDialog2;
        return singleButtonDialog2;
    }

    public View.OnClickListener getCancelListner() {
        return this.cancelListner;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        y.a aVar = new y.a(getActivity(), R.style.Button_Dialog);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(getActivity()).inflate(R.layout.dialog_show_msg_one_button, (ViewGroup) null);
        Button button = (Button) relativeLayout.findViewById(R.id.button_yes);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.dialog_title);
        textView.setText(this.title);
        textView.setTypeface(null, 1);
        textView.setTextColor(t8.d(getActivity(), R.color.grey_dark));
        ((TextView) relativeLayout.findViewById(R.id.dialog_message)).setText(this.message);
        aVar.k(relativeLayout);
        aVar.d(false);
        button.setText(this.okBtnText);
        ((ImageView) relativeLayout.findViewById(R.id.dialog_close)).setOnClickListener(this.cancelListner);
        button.setOnClickListener(this.okListner);
        y a = aVar.a();
        if (a != null && a.getWindow() != null) {
            a.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        }
        return a;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.dialog_show_msg_one_button, viewGroup, false);
    }

    public void setCancelListner(View.OnClickListener onClickListener) {
        this.cancelListner = onClickListener;
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
