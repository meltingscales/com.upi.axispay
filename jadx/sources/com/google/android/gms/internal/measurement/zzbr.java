package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzez;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbr {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class zza extends zzez<zza, C0015zza> implements zzgj {
        private static volatile zzgs<zza> zztq;
        private static final zza zzuo;
        private int zztj;
        private String zzum = "";
        private String zzun = "";

        /* compiled from: AxisPay */
        /* renamed from: com.google.android.gms.internal.measurement.zzbr$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0015zza extends zzez.zza<zza, C0015zza> implements zzgj {
            private C0015zza() {
                super(zza.zzuo);
            }

            public /* synthetic */ C0015zza(zzbs zzbsVar) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzuo = zzaVar;
            zzez.zza(zza.class, zzaVar);
        }

        private zza() {
        }

        public static zzgs<zza> zzgs() {
            return (zzgs) zzuo.zza(zzez.zze.zzaha, (Object) null, (Object) null);
        }

        public final String getKey() {
            return this.zzum;
        }

        public final String getValue() {
            return this.zzun;
        }

        @Override // com.google.android.gms.internal.measurement.zzez
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbs.zzti[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0015zza(null);
                case 3:
                    return zzez.zza(zzuo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zztj", "zzum", "zzun"});
                case 4:
                    return zzuo;
                case 5:
                    zzgs<zza> zzgsVar = zztq;
                    if (zzgsVar == null) {
                        synchronized (zza.class) {
                            zzgsVar = zztq;
                            if (zzgsVar == null) {
                                zzgsVar = new zzez.zzb<>(zzuo);
                                zztq = zzgsVar;
                            }
                        }
                    }
                    return zzgsVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
