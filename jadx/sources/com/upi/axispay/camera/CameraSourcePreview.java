package com.upi.axispay.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CameraSourcePreview extends ViewGroup {
    public Context b;
    public SurfaceView c;
    public boolean d;
    public boolean e;
    public ra0 f;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements SurfaceHolder.Callback {
        public b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            CameraSourcePreview.this.e = true;
            try {
                CameraSourcePreview.this.d();
            } catch (IOException | SecurityException unused) {
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraSourcePreview.this.e = false;
        }
    }

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
        this.d = false;
        this.e = false;
        SurfaceView surfaceView = new SurfaceView(context);
        this.c = surfaceView;
        surfaceView.getHolder().addCallback(new b());
        addView(this.c);
    }

    public final boolean c() {
        int i = this.b.getResources().getConfiguration().orientation;
        return i != 2 && i == 1;
    }

    public final void d() throws IOException, SecurityException {
        if (this.d && this.e) {
            this.f.b(this.c.getHolder());
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        ra0 ra0Var = this.f;
        if (ra0Var == null) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (c()) {
                height = width;
                width = height;
            }
            float f = width;
            float f2 = height;
            int i7 = (int) ((i5 / f) * f2);
            if (c()) {
                i5 = (int) ((i6 / f2) * f);
            } else {
                i6 = i7;
            }
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                getChildAt(i8).layout(0, 0, i5, i6);
            }
            try {
                d();
                return;
            } catch (IOException | SecurityException unused) {
                return;
            }
        }
        ra0Var.a();
        throw null;
    }
}
