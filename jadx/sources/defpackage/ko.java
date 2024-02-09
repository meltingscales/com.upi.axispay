package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ko  reason: default package */
/* loaded from: classes.dex */
public class ko {
    public static <T extends mo> T a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException(C0059ao.a(11316));
    }

    public static <T extends mo> T b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(ko.class.getClassLoader());
            return (T) a(bundle2.getParcelable(C0059ao.a(11317)));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void c(Bundle bundle, String str, mo moVar) {
        if (moVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(C0059ao.a(11318), d(moVar));
        bundle.putParcelable(str, bundle2);
    }

    public static Parcelable d(mo moVar) {
        return new ParcelImpl(moVar);
    }
}
