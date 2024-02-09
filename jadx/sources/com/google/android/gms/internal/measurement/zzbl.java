package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzez;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbl {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class zza extends zzez<zza, C0013zza> implements zzgj {
        private static final zza zztp;
        private static volatile zzgs<zza> zztq;
        private int zztj;
        private int zztk;
        private boolean zztl;
        private String zztm = "";
        private String zztn = "";
        private String zzto = "";

        /* compiled from: AxisPay */
        /* renamed from: com.google.android.gms.internal.measurement.zzbl$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0013zza extends zzez.zza<zza, C0013zza> implements zzgj {
            private C0013zza() {
                super(zza.zztp);
            }

            public /* synthetic */ C0013zza(zzbm zzbmVar) {
                this();
            }
        }

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public enum zzb implements zzfc {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            
            private static final zzfd<zzb> zztw = new zzbn();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzb zze(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return BETWEEN;
                            }
                            return EQUAL;
                        }
                        return GREATER_THAN;
                    }
                    return LESS_THAN;
                }
                return UNKNOWN_COMPARISON_TYPE;
            }

            public static zzfe zzgq() {
                return zzbo.zzty;
            }

            @Override // com.google.android.gms.internal.measurement.zzfc
            public final int zzgp() {
                return this.value;
            }
        }

        static {
            zza zzaVar = new zza();
            zztp = zzaVar;
            zzez.zza(zza.class, zzaVar);
        }

        private zza() {
        }

        @Override // com.google.android.gms.internal.measurement.zzez
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbm.zzti[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0013zza(null);
                case 3:
                    return zzez.zza(zztp, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zztj", "zztk", zzb.zzgq(), "zztl", "zztm", "zztn", "zzto"});
                case 4:
                    return zztp;
                case 5:
                    zzgs<zza> zzgsVar = zztq;
                    if (zzgsVar == null) {
                        synchronized (zza.class) {
                            zzgsVar = zztq;
                            if (zzgsVar == null) {
                                zzgsVar = new zzez.zzb<>(zztp);
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

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class zzb extends zzez<zzb, zza> implements zzgj {
        private static volatile zzgs<zzb> zztq;
        private static final zzb zzud;
        private int zztj;
        private int zztz;
        private boolean zzub;
        private String zzua = "";
        private zzfg<String> zzuc = zzez.zzmj();

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class zza extends zzez.zza<zzb, zza> implements zzgj {
            private zza() {
                super(zzb.zzud);
            }

            public /* synthetic */ zza(zzbm zzbmVar) {
                this();
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: com.google.android.gms.internal.measurement.zzbl$zzb$zzb  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0014zzb implements zzfc {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            
            private static final zzfd<EnumC0014zzb> zztw = new zzbp();
            private final int value;

            EnumC0014zzb(int i) {
                this.value = i;
            }

            public static EnumC0014zzb zzg(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static zzfe zzgq() {
                return zzbq.zzty;
            }

            @Override // com.google.android.gms.internal.measurement.zzfc
            public final int zzgp() {
                return this.value;
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzud = zzbVar;
            zzez.zza(zzb.class, zzbVar);
        }

        private zzb() {
        }

        @Override // com.google.android.gms.internal.measurement.zzez
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbm.zzti[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzez.zza(zzud, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zztj", "zztz", EnumC0014zzb.zzgq(), "zzua", "zzub", "zzuc"});
                case 4:
                    return zzud;
                case 5:
                    zzgs<zzb> zzgsVar = zztq;
                    if (zzgsVar == null) {
                        synchronized (zzb.class) {
                            zzgsVar = zztq;
                            if (zzgsVar == null) {
                                zzgsVar = new zzez.zzb<>(zzud);
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
