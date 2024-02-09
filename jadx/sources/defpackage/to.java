package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AxisPay */
/* renamed from: to  reason: default package */
/* loaded from: classes.dex */
public final class to {
    static {
        to.class.getClassLoader();
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
