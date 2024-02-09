package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AxisPay */
/* renamed from: p2  reason: default package */
/* loaded from: classes.dex */
public final class p2 {
    public TextView a;
    public TextClassifier b;

    public p2(TextView textView) {
        db.e(textView);
        this.a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }
}
