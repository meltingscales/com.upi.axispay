package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: AxisPay */
@SuppressLint({"AppCompatCustomView"})
/* renamed from: oy  reason: default package */
/* loaded from: classes.dex */
public class oy extends ImageButton {
    public int b;

    public oy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        b(i, true);
    }

    public oy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = getVisibility();
    }
}
