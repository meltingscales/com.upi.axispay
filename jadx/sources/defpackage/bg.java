package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bg  reason: default package */
/* loaded from: classes.dex */
public final class bg {
    public cg a;

    public bg(String str, int i, int i2) {
        Objects.requireNonNull(str, C0059ao.a(2025));
        if (!TextUtils.isEmpty(str)) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.a = new dg(str, i, i2);
                return;
            } else {
                this.a = new eg(str, i, i2);
                return;
            }
        }
        throw new IllegalArgumentException(C0059ao.a(2026));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bg) {
            return this.a.equals(((bg) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public bg(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String a = dg.a(remoteUserInfo);
        Objects.requireNonNull(a, C0059ao.a(2023));
        if (!TextUtils.isEmpty(a)) {
            this.a = new dg(remoteUserInfo);
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(2024));
    }
}
