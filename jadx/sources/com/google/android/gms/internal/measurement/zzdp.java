package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzdp implements Serializable, Iterable<Byte> {
    public static final zzdp zzaby = new zzdz(zzfb.zzahk);
    private static final zzdv zzabz;
    private static final Comparator<zzdp> zzacb;
    private int zzaca = 0;

    static {
        zzabz = zzdk.zzkb() ? new zzea(null) : new zzdt(null);
        zzacb = new zzdr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zza(byte b) {
        return b & 255;
    }

    public static zzdp zzb(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new zzdz(zzabz.zzc(bArr, i, i2));
    }

    public static zzdp zzcn(String str) {
        return new zzdz(str.getBytes(zzfb.UTF_8));
    }

    public static zzdp zzg(byte[] bArr) {
        return new zzdz(bArr);
    }

    public static zzdx zzt(int i) {
        return new zzdx(i, null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzaca;
        if (i == 0) {
            int size = size();
            i = zza(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzaca = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzdq(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int zza(int i, int i2, int i3);

    public abstract zzdp zza(int i, int i2);

    public abstract String zza(Charset charset);

    public abstract void zza(zzdo zzdoVar) throws IOException;

    public final String zzkd() {
        return size() == 0 ? "" : zza(zzfb.UTF_8);
    }

    public abstract boolean zzke();

    public final int zzkf() {
        return this.zzaca;
    }

    public abstract byte zzr(int i);

    public abstract byte zzs(int i);

    public static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }
}
