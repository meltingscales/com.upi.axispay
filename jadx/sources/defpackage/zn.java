package defpackage;

import android.os.IBinder;

/* compiled from: AxisPay */
/* renamed from: zn  reason: default package */
/* loaded from: classes.dex */
public class zn implements bo {
    public final IBinder a;

    public zn(IBinder iBinder) {
        this.a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof zn) && ((zn) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
