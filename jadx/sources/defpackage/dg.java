package defpackage;

import android.media.session.MediaSessionManager;

/* compiled from: AxisPay */
/* renamed from: dg  reason: default package */
/* loaded from: classes.dex */
public final class dg extends eg {
    public dg(String str, int i, int i2) {
        super(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public static String a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }

    public dg(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }
}
