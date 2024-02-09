package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzez;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzem {
    private static volatile boolean zzadj;
    private static volatile zzem zzadl;
    private final Map<zza, zzez.zzd<?, ?>> zzadn;
    private static final Class<?> zzadk = zzlr();
    public static final zzem zzadm = new zzem(true);

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class zza {
        private final int number;
        private final Object object;

        public zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                return this.object == zzaVar.object && this.number == zzaVar.number;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }
    }

    public zzem() {
        this.zzadn = new HashMap();
    }

    public static zzem zzlq() {
        return zzex.zza(zzem.class);
    }

    private static Class<?> zzlr() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzem zzls() {
        return zzel.zzlp();
    }

    public static zzem zzlt() {
        zzem zzemVar = zzadl;
        if (zzemVar == null) {
            synchronized (zzem.class) {
                zzemVar = zzadl;
                if (zzemVar == null) {
                    zzemVar = zzel.zzlq();
                    zzadl = zzemVar;
                }
            }
        }
        return zzemVar;
    }

    public final <ContainingType extends zzgh> zzez.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzez.zzd<ContainingType, ?>) this.zzadn.get(new zza(containingtype, i));
    }

    private zzem(boolean z) {
        this.zzadn = Collections.emptyMap();
    }
}
