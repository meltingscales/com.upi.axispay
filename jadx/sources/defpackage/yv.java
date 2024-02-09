package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: yv  reason: default package */
/* loaded from: classes.dex */
public class yv extends Property<ImageView, Matrix> {
    public final Matrix a;

    public yv() {
        super(Matrix.class, C0059ao.a(8188));
        this.a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.a.set(imageView.getImageMatrix());
        return this.a;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
