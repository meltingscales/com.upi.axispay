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
public class DoubleButtonDialog extends DialogFragment {
    public static DoubleButtonDialog doubleButtonDialog;
    public ImageView action_close;
    public Button button_cancel;
    public Button button_ok;
    public String cancelBtnText;
    public View.OnClickListener cancelListner;
    public RelativeLayout dialogLayout;
    public boolean hideImage;
    public String message;
    public String message2;
    public TextView messageView;
    public String okBtnText;
    public View.OnClickListener okListner;
    public String title;
    public TextView titleView;

    public static DoubleButtonDialog newInstance() {
        if (doubleButtonDialog == null) {
            doubleButtonDialog = new DoubleButtonDialog();
        }
        return doubleButtonDialog;
    }

    public void imageHide(boolean z) {
        this.hideImage = z;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        y.a aVar = new y.a(getActivity(), R.style.Button_Dialog);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(getActivity()).inflate(R.layout.dialog_show_msg_two_buttons, (ViewGroup) null);
        this.dialogLayout = relativeLayout;
        this.button_ok = (Button) relativeLayout.findViewById(R.id.button_yes);
        this.button_cancel = (Button) this.dialogLayout.findViewById(R.id.button_no);
        this.titleView = (TextView) this.dialogLayout.findViewById(R.id.dialog_title);
        this.action_close = (ImageView) this.dialogLayout.findViewById(R.id.dialog_close);
        this.titleView.setText(this.title);
        this.titleView.setTypeface(null, 1);
        this.titleView.setTextColor(t8.d(getActivity(), R.color.grey_dark));
        TextView textView = (TextView) this.dialogLayout.findViewById(R.id.dialog_message);
        this.messageView = textView;
        textView.setText(this.message);
        aVar.k(this.dialogLayout);
        this.button_ok.setText(this.okBtnText);
        this.button_cancel.setText(this.cancelBtnText);
        this.action_close.setVisibility(this.hideImage ? 4 : 0);
        this.button_ok.setOnClickListener(this.okListner);
        this.button_cancel.setOnClickListener(this.cancelListner);
        aVar.d(false);
        this.action_close.setOnClickListener(new View.OnClickListener() { // from class: com.upi.axispay.custom.DoubleButtonDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DoubleButtonDialog.this.dismiss();
            }
        });
        y a = aVar.a();
        if (a != null && a.getWindow() != null) {
            a.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        }
        return a;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.titleView.setText(this.title);
        this.messageView.setText(this.message);
        this.button_ok.setText(this.okBtnText);
        this.button_cancel.setText(this.cancelBtnText);
        this.button_ok.setOnClickListener(this.okListner);
        this.button_cancel.setOnClickListener(this.cancelListner);
    }

    public void setCancelBtnText(String str) {
        this.cancelBtnText = str;
    }

    public void setCancelListner(View.OnClickListener onClickListener) {
        this.cancelListner = onClickListener;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMessage2(String str) {
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
