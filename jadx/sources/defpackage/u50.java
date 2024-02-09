package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: u50  reason: default package */
/* loaded from: classes.dex */
public abstract class u50 implements t50 {
    public static final Bitmap.CompressFormat a = Bitmap.CompressFormat.PNG;

    public u50(File file, File file2, a60 a60Var) {
        if (file == null) {
            throw new IllegalArgumentException(C0059ao.a(13002));
        }
        if (a60Var == null) {
            throw new IllegalArgumentException(C0059ao.a(13001));
        }
    }
}
