package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* compiled from: AxisPay */
/* renamed from: my  reason: default package */
/* loaded from: classes.dex */
public class my {
    public static TextView a(Toolbar toolbar) {
        return b(toolbar, toolbar.getSubtitle());
    }

    public static TextView b(Toolbar toolbar, CharSequence charSequence) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static TextView c(Toolbar toolbar) {
        return b(toolbar, toolbar.getTitle());
    }
}
