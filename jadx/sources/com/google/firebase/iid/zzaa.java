package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import java.security.KeyPair;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzaa {
    private final KeyPair zzby;
    private final long zzbz;

    @VisibleForTesting
    public zzaa(KeyPair keyPair, long j) {
        this.zzby = keyPair;
        this.zzbz = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzv() {
        return Base64.encodeToString(this.zzby.getPublic().getEncoded(), 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzw() {
        return Base64.encodeToString(this.zzby.getPrivate().getEncoded(), 11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaa) {
            zzaa zzaaVar = (zzaa) obj;
            return this.zzbz == zzaaVar.zzbz && this.zzby.getPublic().equals(zzaaVar.zzby.getPublic()) && this.zzby.getPrivate().equals(zzaaVar.zzby.getPrivate());
        }
        return false;
    }

    public final long getCreationTime() {
        return this.zzbz;
    }

    public final KeyPair getKeyPair() {
        return this.zzby;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzby.getPublic(), this.zzby.getPrivate(), Long.valueOf(this.zzbz));
    }
}
