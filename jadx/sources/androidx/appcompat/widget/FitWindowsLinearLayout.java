package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.x2;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements x2 {
    public x2.a b;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        x2.a aVar = this.b;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.x2
    public void setOnFitSystemWindowsListener(x2.a aVar) {
        this.b = aVar;
    }
}
