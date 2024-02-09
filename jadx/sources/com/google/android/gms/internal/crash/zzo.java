package com.google.android.gms.internal.crash;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzo {
    private static zzo zzam;
    private Context zzf;

    private zzo() {
    }

    public static synchronized zzo zzl() {
        zzo zzoVar;
        synchronized (zzo.class) {
            if (zzam == null) {
                zzam = new zzo();
            }
            zzoVar = zzam;
        }
        return zzoVar;
    }

    public final void init(Context context) {
        this.zzf = context;
    }

    public final zzm zzm() throws zzp {
        try {
            DynamiteModule load = DynamiteModule.load(this.zzf, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, "com.google.android.gms.crash");
            Preconditions.checkNotNull(load);
            IBinder instantiate = load.instantiate("com.google.firebase.crash.internal.api.FirebaseCrashApiImpl");
            if (instantiate == null) {
                return null;
            }
            IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.firebase.crash.internal.IFirebaseCrashApi");
            if (queryLocalInterface instanceof zzm) {
                return (zzm) queryLocalInterface;
            }
            return new zzn(instantiate);
        } catch (DynamiteModule.LoadingException e) {
            CrashUtils.addDynamiteErrorToDropBox(this.zzf, e);
            throw new zzp(e);
        }
    }
}
