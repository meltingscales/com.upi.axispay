package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: AxisPay */
/* renamed from: n2  reason: default package */
/* loaded from: classes.dex */
public class n2 extends SeekBar {
    public final o2 b;

    public n2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.b.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.b.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.b.g(canvas);
    }

    public n2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j3.a(this, getContext());
        o2 o2Var = new o2(this);
        this.b = o2Var;
        o2Var.c(attributeSet, i);
    }
}
