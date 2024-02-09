package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzhw {
    private static final Logger logger = Logger.getLogger(zzhw.class.getName());
    private static final Class<?> zzabq;
    private static final boolean zzacv;
    private static final Unsafe zzaiz;
    private static final boolean zzakw;
    private static final boolean zzakx;
    private static final zzd zzaky;
    private static final boolean zzakz;
    private static final long zzala;
    private static final long zzalb;
    private static final long zzalc;
    private static final long zzald;
    private static final long zzale;
    private static final long zzalf;
    private static final long zzalg;
    private static final long zzalh;
    private static final long zzali;
    private static final long zzalj;
    private static final long zzalk;
    private static final long zzall;
    private static final long zzalm;
    private static final long zzaln;
    private static final boolean zzalo;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class zza extends zzd {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(long j, byte b) {
            Memory.pokeByte((int) (j & (-1)), b);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zze(Object obj, long j, byte b) {
            if (!zzhw.zzalo) {
                zzhw.zzb(obj, j, b);
            } else {
                zzhw.zza(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final boolean zzm(Object obj, long j) {
            return zzhw.zzalo ? zzhw.zzs(obj, j) : zzhw.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final byte zzy(Object obj, long j) {
            return zzhw.zzalo ? zzhw.zzq(obj, j) : zzhw.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (!zzhw.zzalo) {
                zzhw.zzc(obj, j, z);
            } else {
                zzhw.zzb(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & (-1)), bArr, (int) j, (int) j3);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class zzb extends zzd {
        public zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zze(Object obj, long j, byte b) {
            if (!zzhw.zzalo) {
                zzhw.zzb(obj, j, b);
            } else {
                zzhw.zza(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final boolean zzm(Object obj, long j) {
            return zzhw.zzalo ? zzhw.zzs(obj, j) : zzhw.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final byte zzy(Object obj, long j) {
            return zzhw.zzalo ? zzhw.zzq(obj, j) : zzhw.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (!zzhw.zzalo) {
                zzhw.zzc(obj, j, z);
            } else {
                zzhw.zzb(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class zzc extends zzd {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(long j, byte b) {
            this.zzalp.putByte(j, b);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zze(Object obj, long j, byte b) {
            this.zzalp.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final boolean zzm(Object obj, long j) {
            return this.zzalp.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final float zzn(Object obj, long j) {
            return this.zzalp.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final double zzo(Object obj, long j) {
            return this.zzalp.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final byte zzy(Object obj, long j) {
            return this.zzalp.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(Object obj, long j, boolean z) {
            this.zzalp.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(Object obj, long j, float f) {
            this.zzalp.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(Object obj, long j, double d) {
            this.zzalp.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.measurement.zzhw.zzd
        public final void zza(byte[] bArr, long j, long j2, long j3) {
            this.zzalp.copyMemory(bArr, zzhw.zzala + j, (Object) null, j2, j3);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class zzd {
        public Unsafe zzalp;

        public zzd(Unsafe unsafe) {
            this.zzalp = unsafe;
        }

        public abstract void zza(long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public final void zza(Object obj, long j, long j2) {
            this.zzalp.putLong(obj, j, j2);
        }

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zza(byte[] bArr, long j, long j2, long j3);

        public final void zzb(Object obj, long j, int i) {
            this.zzalp.putInt(obj, j, i);
        }

        public abstract void zze(Object obj, long j, byte b);

        public final int zzk(Object obj, long j) {
            return this.zzalp.getInt(obj, j);
        }

        public final long zzl(Object obj, long j) {
            return this.zzalp.getLong(obj, j);
        }

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);
    }

    static {
        Unsafe zzow = zzow();
        zzaiz = zzow;
        zzabq = zzdk.zzkc();
        boolean zzk = zzk(Long.TYPE);
        zzakw = zzk;
        boolean zzk2 = zzk(Integer.TYPE);
        zzakx = zzk2;
        zzd zzdVar = null;
        if (zzow != null) {
            if (!zzdk.zzkb()) {
                zzdVar = new zzc(zzow);
            } else if (zzk) {
                zzdVar = new zzb(zzow);
            } else if (zzk2) {
                zzdVar = new zza(zzow);
            }
        }
        zzaky = zzdVar;
        zzakz = zzoy();
        zzacv = zzox();
        zzala = zzi(byte[].class);
        zzalb = zzi(boolean[].class);
        zzalc = zzj(boolean[].class);
        zzald = zzi(int[].class);
        zzale = zzj(int[].class);
        zzalf = zzi(long[].class);
        zzalg = zzj(long[].class);
        zzalh = zzi(float[].class);
        zzali = zzj(float[].class);
        zzalj = zzi(double[].class);
        zzalk = zzj(double[].class);
        zzall = zzi(Object[].class);
        zzalm = zzj(Object[].class);
        Field zzoz = zzoz();
        zzaln = (zzoz == null || zzdVar == null) ? -1L : zzdVar.zzalp.objectFieldOffset(zzoz);
        zzalo = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhw() {
    }

    public static void zza(Object obj, long j, long j2) {
        zzaky.zza(obj, j, j2);
    }

    public static void zzb(Object obj, long j, int i) {
        zzaky.zzb(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static <T> T zzh(Class<T> cls) {
        try {
            return (T) zzaiz.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzi(Class<?> cls) {
        if (zzacv) {
            return zzaky.zzalp.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(Class<?> cls) {
        if (zzacv) {
            return zzaky.zzalp.arrayIndexScale(cls);
        }
        return -1;
    }

    public static int zzk(Object obj, long j) {
        return zzaky.zzk(obj, j);
    }

    public static long zzl(Object obj, long j) {
        return zzaky.zzl(obj, j);
    }

    public static boolean zzm(Object obj, long j) {
        return zzaky.zzm(obj, j);
    }

    public static float zzn(Object obj, long j) {
        return zzaky.zzn(obj, j);
    }

    public static double zzo(Object obj, long j) {
        return zzaky.zzo(obj, j);
    }

    public static boolean zzou() {
        return zzacv;
    }

    public static boolean zzov() {
        return zzakz;
    }

    public static Unsafe zzow() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhx());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzox() {
        Unsafe unsafe = zzaiz;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (zzdk.zzkb()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzoy() {
        Unsafe unsafe = zzaiz;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (zzoz() == null) {
                return false;
            }
            if (zzdk.zzkb()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field zzoz() {
        Field zzb2;
        if (!zzdk.zzkb() || (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) == null) {
            Field zzb3 = zzb(Buffer.class, "address");
            if (zzb3 == null || zzb3.getType() != Long.TYPE) {
                return null;
            }
            return zzb3;
        }
        return zzb2;
    }

    public static Object zzp(Object obj, long j) {
        return zzaky.zzalp.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    public static void zza(Object obj, long j, boolean z) {
        zzaky.zza(obj, j, z);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        return zzaky.zzl(byteBuffer, zzaln);
    }

    private static boolean zzk(Class<?> cls) {
        if (zzdk.zzkb()) {
            try {
                Class<?> cls2 = zzabq;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static void zza(Object obj, long j, float f) {
        zzaky.zza(obj, j, f);
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zza(Object obj, long j, double d) {
        zzaky.zza(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & (~(255 << i))));
    }

    public static void zza(Object obj, long j, Object obj2) {
        zzaky.zzalp.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static byte zza(byte[] bArr, long j) {
        return zzaky.zzy(bArr, zzala + j);
    }

    public static void zza(byte[] bArr, long j, byte b) {
        zzaky.zze(bArr, zzala + j, b);
    }

    public static void zza(byte[] bArr, long j, long j2, long j3) {
        zzaky.zza(bArr, j, j2, j3);
    }

    public static void zza(long j, byte b) {
        zzaky.zza(j, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int zzk = zzk(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk & (~(255 << i))));
    }
}
