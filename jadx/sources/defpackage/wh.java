package defpackage;

import android.os.Messenger;

/* compiled from: AxisPay */
/* renamed from: wh  reason: default package */
/* loaded from: classes.dex */
public abstract class wh {
    public static boolean a(Messenger messenger) {
        if (messenger != null) {
            try {
                return messenger.getBinder() != null;
            } catch (NullPointerException unused) {
                return false;
            }
        }
        return false;
    }
}
