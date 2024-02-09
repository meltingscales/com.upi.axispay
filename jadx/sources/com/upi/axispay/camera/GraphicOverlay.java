package com.upi.axispay.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.upi.axispay.camera.GraphicOverlay.a;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class GraphicOverlay<T extends a> extends View {
    public final Object b;
    public int c;
    public float d;
    public int e;
    public float f;
    public Set<T> g;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract void a(Canvas canvas);
    }

    public GraphicOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Object();
        this.d = 1.0f;
        this.f = 1.0f;
        this.g = new HashSet();
    }

    public List<T> getGraphics() {
        Vector vector;
        synchronized (this.b) {
            vector = new Vector(this.g);
        }
        return vector;
    }

    public float getHeightScaleFactor() {
        return this.f;
    }

    public float getWidthScaleFactor() {
        return this.d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.b) {
            if (this.c != 0 && this.e != 0) {
                this.d = canvas.getWidth() / this.c;
                this.f = canvas.getHeight() / this.e;
            }
            for (T t : this.g) {
                t.a(canvas);
            }
        }
    }
}
