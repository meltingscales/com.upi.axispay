package com.upi.axispay.custom;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.upi.axispay.R;
import defpackage.y;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class RateAppDialog extends DialogFragment {
    public static RateAppDialog rateAppDialog;
    public Button button_later;
    public Button button_rate;
    public LinearLayout dialogLayout;
    public View.OnClickListener rateNow;
    public View.OnClickListener remindLater;

    public static RateAppDialog newInstance() {
        return new RateAppDialog();
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        y.a aVar = new y.a(getActivity());
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getActivity()).inflate(R.layout.dialog_rating, (ViewGroup) null);
        this.dialogLayout = linearLayout;
        this.button_later = (Button) linearLayout.findViewById(R.id.button_later);
        this.button_rate = (Button) this.dialogLayout.findViewById(R.id.button_rate);
        aVar.k(this.dialogLayout);
        this.button_rate.setOnClickListener(this.rateNow);
        this.button_later.setOnClickListener(this.remindLater);
        aVar.d(false);
        return aVar.a();
    }

    public void setRateNow(View.OnClickListener onClickListener) {
        this.rateNow = onClickListener;
    }

    public void setRemindLater(View.OnClickListener onClickListener) {
        this.remindLater = onClickListener;
    }
}
