package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

/* compiled from: AxisPay */
/* renamed from: b70  reason: default package */
/* loaded from: classes.dex */
public class b70 extends ProgressDialog {
    public TextView b;

    public b70(Context context) {
        super(context, h70.Theme_AppCompat_Light_NoActionBar_FullScreen);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(f70.custom_progress_bar);
        this.b = (TextView) findViewById(e70.progressText);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -1);
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public void setMessage(CharSequence charSequence) {
        TextView textView;
        if (charSequence == null || (textView = this.b) == null) {
            return;
        }
        textView.setText(charSequence);
    }
}
