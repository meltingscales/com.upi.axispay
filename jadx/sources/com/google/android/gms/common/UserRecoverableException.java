package com.google.android.gms.common;

import android.content.Intent;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class UserRecoverableException extends Exception {
    private final Intent zza;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.zza = intent;
    }

    public Intent getIntent() {
        return new Intent(this.zza);
    }
}
