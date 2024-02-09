package com.google.android.gms.internal.measurement;

import com.google.android.gms.vision.barcode.Barcode;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzeg extends zzdo {
    private static final Logger logger = Logger.getLogger(zzeg.class.getName());
    private static final boolean zzacv = zzhw.zzou();
    public zzei zzacw;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class zza extends zzeg {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        public zza(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) >= 0) {
                this.buffer = bArr;
                this.offset = i;
                this.position = i;
                this.limit = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public void flush() {
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, long j) throws IOException {
            zzb(i, 0);
            zzaq(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzaf(int i) throws IOException {
            if (i >= 0) {
                zzag(i);
            } else {
                zzaq(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzag(int i) throws IOException {
            if (zzeg.zzacv && zzlj() >= 10) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    zzhw.zza(bArr, i2, (byte) ((i & 127) | Barcode.ITF));
                    i >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                zzhw.zza(bArr2, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i4 = this.position;
                    this.position = i4 + 1;
                    bArr3[i4] = (byte) ((i & 127) | Barcode.ITF);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            bArr4[i5] = (byte) i;
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzai(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.position = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.position = i5;
                bArr[i4] = (byte) (i >> 16);
                this.position = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzaq(long j) throws IOException {
            if (zzeg.zzacv && zzlj() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    zzhw.zza(bArr, i, (byte) ((((int) j) & 127) | Barcode.ITF));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                zzhw.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | Barcode.ITF);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzas(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = (byte) j;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i3 + 1;
                this.position = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i4 + 1;
                this.position = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i5 + 1;
                this.position = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i6 + 1;
                this.position = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i7 + 1;
                this.position = i8;
                bArr[i7] = (byte) (j >> 48);
                this.position = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, int i2) throws IOException {
            zzag((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzc(int i, int i2) throws IOException {
            zzb(i, 0);
            zzaf(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzco(String str) throws IOException {
            int i = this.position;
            try {
                int zzal = zzeg.zzal(str.length() * 3);
                int zzal2 = zzeg.zzal(str.length());
                if (zzal2 == zzal) {
                    int i2 = i + zzal2;
                    this.position = i2;
                    int zza = zzhy.zza(str, this.buffer, i2, zzlj());
                    this.position = i;
                    zzag((zza - i) - zzal2);
                    this.position = zza;
                    return;
                }
                zzag(zzhy.zza(str));
                this.position = zzhy.zza(str, this.buffer, this.position, zzlj());
            } catch (zzic e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzd(int i, int i2) throws IOException {
            zzb(i, 0);
            zzag(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zze(byte[] bArr, int i, int i2) throws IOException {
            zzag(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzf(int i, int i2) throws IOException {
            zzb(i, 5);
            zzai(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final int zzlj() {
            return this.limit - this.position;
        }

        public final int zzlm() {
            return this.position - this.offset;
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, boolean z) throws IOException {
            zzb(i, 0);
            zzc(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, zzdp zzdpVar) throws IOException {
            zzb(i, 2);
            zza(zzdpVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzc(int i, long j) throws IOException {
            zzb(i, 1);
            zzas(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, String str) throws IOException {
            zzb(i, 2);
            zzco(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(zzdp zzdpVar) throws IOException {
            zzag(zzdpVar.size());
            zzdpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzc(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, zzgh zzghVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzghVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, zzgh zzghVar) throws IOException {
            zzb(i, 2);
            zzb(zzghVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, zzgh zzghVar, zzgy zzgyVar) throws IOException {
            zzb(i, 2);
            zzdg zzdgVar = (zzdg) zzghVar;
            int zzjw = zzdgVar.zzjw();
            if (zzjw == -1) {
                zzjw = zzgyVar.zzs(zzdgVar);
                zzdgVar.zzn(zzjw);
            }
            zzag(zzjw);
            zzgyVar.zza(zzghVar, this.zzacw);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, zzdp zzdpVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdpVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(zzgh zzghVar) throws IOException {
            zzag(zzghVar.zzly());
            zzghVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(zzgh zzghVar, zzgy zzgyVar) throws IOException {
            zzdg zzdgVar = (zzdg) zzghVar;
            int zzjw = zzdgVar.zzjw();
            if (zzjw == -1) {
                zzjw = zzgyVar.zzs(zzdgVar);
                zzdgVar.zzn(zzjw);
            }
            zzag(zzjw);
            zzgyVar.zza(zzghVar, this.zzacw);
        }

        @Override // com.google.android.gms.internal.measurement.zzdo
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class zzb extends zza {
        private final ByteBuffer zzacx;
        private int zzacy;

        public zzb(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.zzacx = byteBuffer;
            this.zzacy = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.measurement.zzeg.zza, com.google.android.gms.internal.measurement.zzeg
        public final void flush() {
            this.zzacx.position(this.zzacy + zzlm());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class zzc extends IOException {
        public zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public zzc(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzeg.zzc.<init>(java.lang.String):void");
        }

        public zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public zzc(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzeg.zzc.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class zzd extends zzeg {
        private final int zzacy;
        private final ByteBuffer zzacz;
        private final ByteBuffer zzada;

        public zzd(ByteBuffer byteBuffer) {
            super();
            this.zzacz = byteBuffer;
            this.zzada = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzacy = byteBuffer.position();
        }

        private final void zzcq(String str) throws IOException {
            try {
                zzhy.zza(str, this.zzada);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void flush() {
            this.zzacz.position(this.zzada.position());
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.zzada.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, long j) throws IOException {
            zzb(i, 0);
            zzaq(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzaf(int i) throws IOException {
            if (i >= 0) {
                zzag(i);
            } else {
                zzaq(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzag(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    this.zzada.put((byte) ((i & 127) | Barcode.ITF));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzc(e);
                }
            }
            this.zzada.put((byte) i);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzai(int i) throws IOException {
            try {
                this.zzada.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzaq(long j) throws IOException {
            while (((-128) & j) != 0) {
                try {
                    this.zzada.put((byte) ((((int) j) & 127) | Barcode.ITF));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzc(e);
                }
            }
            this.zzada.put((byte) j);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzas(long j) throws IOException {
            try {
                this.zzada.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, int i2) throws IOException {
            zzag((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzc(int i, int i2) throws IOException {
            zzb(i, 0);
            zzaf(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzco(String str) throws IOException {
            int position = this.zzada.position();
            try {
                int zzal = zzeg.zzal(str.length() * 3);
                int zzal2 = zzeg.zzal(str.length());
                if (zzal2 == zzal) {
                    int position2 = this.zzada.position() + zzal2;
                    this.zzada.position(position2);
                    zzcq(str);
                    int position3 = this.zzada.position();
                    this.zzada.position(position);
                    zzag(position3 - position2);
                    this.zzada.position(position3);
                    return;
                }
                zzag(zzhy.zza(str));
                zzcq(str);
            } catch (zzic e) {
                this.zzada.position(position);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzd(int i, int i2) throws IOException {
            zzb(i, 0);
            zzag(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zze(byte[] bArr, int i, int i2) throws IOException {
            zzag(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzf(int i, int i2) throws IOException {
            zzb(i, 5);
            zzai(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final int zzlj() {
            return this.zzada.remaining();
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, boolean z) throws IOException {
            zzb(i, 0);
            zzc(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, zzdp zzdpVar) throws IOException {
            zzb(i, 2);
            zza(zzdpVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzc(int i, long j) throws IOException {
            zzb(i, 1);
            zzas(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, String str) throws IOException {
            zzb(i, 2);
            zzco(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, zzgh zzghVar) throws IOException {
            zzb(i, 2);
            zzb(zzghVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzc(byte b) throws IOException {
            try {
                this.zzada.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, zzgh zzghVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzghVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, zzgh zzghVar, zzgy zzgyVar) throws IOException {
            zzb(i, 2);
            zza(zzghVar, zzgyVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(zzgh zzghVar, zzgy zzgyVar) throws IOException {
            zzdg zzdgVar = (zzdg) zzghVar;
            int zzjw = zzdgVar.zzjw();
            if (zzjw == -1) {
                zzjw = zzgyVar.zzs(zzdgVar);
                zzdgVar.zzn(zzjw);
            }
            zzag(zzjw);
            zzgyVar.zza(zzghVar, this.zzacw);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, zzdp zzdpVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdpVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(zzgh zzghVar) throws IOException {
            zzag(zzghVar.zzly());
            zzghVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(zzdp zzdpVar) throws IOException {
            zzag(zzdpVar.size());
            zzdpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzdo
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class zze extends zzeg {
        private final ByteBuffer zzacz;
        private final ByteBuffer zzada;
        private final long zzadb;
        private final long zzadc;
        private final long zzadd;
        private final long zzade;
        private long zzadf;

        public zze(ByteBuffer byteBuffer) {
            super();
            this.zzacz = byteBuffer;
            this.zzada = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long zzb = zzhw.zzb(byteBuffer);
            this.zzadb = zzb;
            long position = byteBuffer.position() + zzb;
            this.zzadc = position;
            long limit = zzb + byteBuffer.limit();
            this.zzadd = limit;
            this.zzade = limit - 10;
            this.zzadf = position;
        }

        private final void zzaz(long j) {
            this.zzada.position((int) (j - this.zzadb));
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void flush() {
            this.zzacz.position((int) (this.zzadf - this.zzadb));
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.zzadf;
                if (this.zzadd - j >= j2) {
                    zzhw.zza(bArr, i, j2, j);
                    this.zzadf += j;
                    return;
                }
            }
            Objects.requireNonNull(bArr, "value");
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzadf), Long.valueOf(this.zzadd), Integer.valueOf(i2)));
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, long j) throws IOException {
            zzb(i, 0);
            zzaq(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzaf(int i) throws IOException {
            if (i >= 0) {
                zzag(i);
            } else {
                zzaq(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzag(int i) throws IOException {
            if (this.zzadf <= this.zzade) {
                while ((i & (-128)) != 0) {
                    long j = this.zzadf;
                    this.zzadf = j + 1;
                    zzhw.zza(j, (byte) ((i & 127) | Barcode.ITF));
                    i >>>= 7;
                }
                long j2 = this.zzadf;
                this.zzadf = 1 + j2;
                zzhw.zza(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.zzadf;
                if (j3 >= this.zzadd) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzadf), Long.valueOf(this.zzadd), 1));
                }
                if ((i & (-128)) == 0) {
                    this.zzadf = 1 + j3;
                    zzhw.zza(j3, (byte) i);
                    return;
                }
                this.zzadf = j3 + 1;
                zzhw.zza(j3, (byte) ((i & 127) | Barcode.ITF));
                i >>>= 7;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzai(int i) throws IOException {
            this.zzada.putInt((int) (this.zzadf - this.zzadb), i);
            this.zzadf += 4;
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzaq(long j) throws IOException {
            if (this.zzadf <= this.zzade) {
                while ((j & (-128)) != 0) {
                    long j2 = this.zzadf;
                    this.zzadf = j2 + 1;
                    zzhw.zza(j2, (byte) ((((int) j) & 127) | Barcode.ITF));
                    j >>>= 7;
                }
                long j3 = this.zzadf;
                this.zzadf = 1 + j3;
                zzhw.zza(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.zzadf;
                if (j4 >= this.zzadd) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzadf), Long.valueOf(this.zzadd), 1));
                }
                if ((j & (-128)) == 0) {
                    this.zzadf = 1 + j4;
                    zzhw.zza(j4, (byte) j);
                    return;
                }
                this.zzadf = j4 + 1;
                zzhw.zza(j4, (byte) ((((int) j) & 127) | Barcode.ITF));
                j >>>= 7;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzas(long j) throws IOException {
            this.zzada.putLong((int) (this.zzadf - this.zzadb), j);
            this.zzadf += 8;
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, int i2) throws IOException {
            zzag((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzc(int i, int i2) throws IOException {
            zzb(i, 0);
            zzaf(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzco(String str) throws IOException {
            long j = this.zzadf;
            try {
                int zzal = zzeg.zzal(str.length() * 3);
                int zzal2 = zzeg.zzal(str.length());
                if (zzal2 == zzal) {
                    int i = ((int) (this.zzadf - this.zzadb)) + zzal2;
                    this.zzada.position(i);
                    zzhy.zza(str, this.zzada);
                    int position = this.zzada.position() - i;
                    zzag(position);
                    this.zzadf += position;
                    return;
                }
                int zza = zzhy.zza(str);
                zzag(zza);
                zzaz(this.zzadf);
                zzhy.zza(str, this.zzada);
                this.zzadf += zza;
            } catch (zzic e) {
                this.zzadf = j;
                zzaz(j);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzd(int i, int i2) throws IOException {
            zzb(i, 0);
            zzag(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zze(byte[] bArr, int i, int i2) throws IOException {
            zzag(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzf(int i, int i2) throws IOException {
            zzb(i, 5);
            zzai(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final int zzlj() {
            return (int) (this.zzadd - this.zzadf);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, boolean z) throws IOException {
            zzb(i, 0);
            zzc(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, zzdp zzdpVar) throws IOException {
            zzb(i, 2);
            zza(zzdpVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzc(int i, long j) throws IOException {
            zzb(i, 1);
            zzas(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, String str) throws IOException {
            zzb(i, 2);
            zzco(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, zzgh zzghVar) throws IOException {
            zzb(i, 2);
            zzb(zzghVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzc(byte b) throws IOException {
            long j = this.zzadf;
            if (j < this.zzadd) {
                this.zzadf = 1 + j;
                zzhw.zza(j, b);
                return;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzadf), Long.valueOf(this.zzadd), 1));
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, zzgh zzghVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzghVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(int i, zzgh zzghVar, zzgy zzgyVar) throws IOException {
            zzb(i, 2);
            zza(zzghVar, zzgyVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(zzgh zzghVar, zzgy zzgyVar) throws IOException {
            zzdg zzdgVar = (zzdg) zzghVar;
            int zzjw = zzdgVar.zzjw();
            if (zzjw == -1) {
                zzjw = zzgyVar.zzs(zzdgVar);
                zzdgVar.zzn(zzjw);
            }
            zzag(zzjw);
            zzgyVar.zza(zzghVar, this.zzacw);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(int i, zzdp zzdpVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdpVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zzb(zzgh zzghVar) throws IOException {
            zzag(zzghVar.zzly());
            zzghVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzeg
        public final void zza(zzdp zzdpVar) throws IOException {
            zzag(zzdpVar.size());
            zzdpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzdo
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }
    }

    private zzeg() {
    }

    public static zzeg zza(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new zzb(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (zzhw.zzov()) {
                return new zze(byteBuffer);
            }
            return new zzd(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    public static int zzaj(int i) {
        return zzal(i << 3);
    }

    public static int zzak(int i) {
        if (i >= 0) {
            return zzal(i);
        }
        return 10;
    }

    public static int zzal(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzam(int i) {
        return zzal(zzaq(i));
    }

    public static int zzan(int i) {
        return 4;
    }

    public static int zzao(int i) {
        return 4;
    }

    public static int zzap(int i) {
        return zzak(i);
    }

    private static int zzaq(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int zzat(long j) {
        return zzau(j);
    }

    public static int zzau(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzav(long j) {
        return zzau(zzay(j));
    }

    public static int zzaw(long j) {
        return 8;
    }

    public static int zzax(long j) {
        return 8;
    }

    private static long zzay(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzc(int i, boolean z) {
        return zzaj(i) + 1;
    }

    public static int zzcp(String str) {
        int length;
        try {
            length = zzhy.zza(str);
        } catch (zzic unused) {
            length = str.getBytes(zzfb.UTF_8).length;
        }
        return zzal(length) + length;
    }

    public static int zze(double d) {
        return 8;
    }

    public static int zzf(int i, long j) {
        return zzaj(i) + zzau(zzay(j));
    }

    public static int zzg(int i, int i2) {
        return zzaj(i) + zzak(i2);
    }

    public static zzeg zzh(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzi(int i, int i2) {
        return zzaj(i) + zzal(zzaq(i2));
    }

    public static int zzj(int i, int i2) {
        return zzaj(i) + 4;
    }

    public static int zzk(int i, int i2) {
        return zzaj(i) + 4;
    }

    public static int zzl(int i, int i2) {
        return zzaj(i) + zzak(i2);
    }

    public static int zzn(boolean z) {
        return 1;
    }

    public abstract void flush() throws IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzdp zzdpVar) throws IOException;

    public abstract void zza(int i, zzgh zzghVar) throws IOException;

    public abstract void zza(int i, zzgh zzghVar, zzgy zzgyVar) throws IOException;

    public abstract void zza(zzdp zzdpVar) throws IOException;

    public abstract void zza(zzgh zzghVar, zzgy zzgyVar) throws IOException;

    public abstract void zzaf(int i) throws IOException;

    public abstract void zzag(int i) throws IOException;

    public final void zzah(int i) throws IOException {
        zzag(zzaq(i));
    }

    public abstract void zzai(int i) throws IOException;

    public abstract void zzaq(long j) throws IOException;

    public final void zzar(long j) throws IOException {
        zzaq(zzay(j));
    }

    public abstract void zzas(long j) throws IOException;

    public abstract void zzb(int i, int i2) throws IOException;

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzay(j));
    }

    public abstract void zzb(int i, zzdp zzdpVar) throws IOException;

    public abstract void zzb(int i, zzgh zzghVar) throws IOException;

    public abstract void zzb(int i, String str) throws IOException;

    public abstract void zzb(int i, boolean z) throws IOException;

    public abstract void zzb(zzgh zzghVar) throws IOException;

    public abstract void zzc(byte b) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzco(String str) throws IOException;

    public final void zzd(double d) throws IOException {
        zzas(Double.doubleToRawLongBits(d));
    }

    public abstract void zzd(int i, int i2) throws IOException;

    public final void zze(int i, int i2) throws IOException {
        zzd(i, zzaq(i2));
    }

    public abstract void zze(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract int zzlj();

    public final void zzlk() {
        if (zzlj() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzm(boolean z) throws IOException {
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Deprecated
    public static int zzar(int i) {
        return zzal(i);
    }

    public static int zzb(int i, float f) {
        return zzaj(i) + 4;
    }

    public static int zzc(int i, String str) {
        return zzaj(i) + zzcp(str);
    }

    public static int zzd(int i, long j) {
        return zzaj(i) + zzau(j);
    }

    public static int zze(int i, long j) {
        return zzaj(i) + zzau(j);
    }

    public static int zzg(int i, long j) {
        return zzaj(i) + 8;
    }

    public static int zzb(int i, double d) {
        return zzaj(i) + 8;
    }

    public static int zzc(int i, zzdp zzdpVar) {
        int zzaj = zzaj(i);
        int size = zzdpVar.size();
        return zzaj + zzal(size) + size;
    }

    public static int zzh(int i, int i2) {
        return zzaj(i) + zzal(i2);
    }

    public static int zzi(byte[] bArr) {
        int length = bArr.length;
        return zzal(length) + length;
    }

    public static int zzb(int i, zzgh zzghVar, zzgy zzgyVar) {
        return zzaj(i) + zzb(zzghVar, zzgyVar);
    }

    public static int zzd(int i, zzgh zzghVar) {
        return (zzaj(1) << 1) + zzh(2, i) + zzc(3, zzghVar);
    }

    public static int zzh(int i, long j) {
        return zzaj(i) + 8;
    }

    public static int zzb(int i, zzfo zzfoVar) {
        return (zzaj(1) << 1) + zzh(2, i) + zza(3, zzfoVar);
    }

    public static int zzc(int i, zzgh zzghVar) {
        return zzaj(i) + zzc(zzghVar);
    }

    public static int zzc(zzgh zzghVar) {
        int zzly = zzghVar.zzly();
        return zzal(zzly) + zzly;
    }

    public static int zzd(int i, zzdp zzdpVar) {
        return (zzaj(1) << 1) + zzh(2, i) + zzc(3, zzdpVar);
    }

    public static int zzb(zzdp zzdpVar) {
        int size = zzdpVar.size();
        return zzal(size) + size;
    }

    public final void zza(int i, float f) throws IOException {
        zzf(i, Float.floatToRawIntBits(f));
    }

    @Deprecated
    public static int zzc(int i, zzgh zzghVar, zzgy zzgyVar) {
        int zzaj = zzaj(i) << 1;
        zzdg zzdgVar = (zzdg) zzghVar;
        int zzjw = zzdgVar.zzjw();
        if (zzjw == -1) {
            zzjw = zzgyVar.zzs(zzdgVar);
            zzdgVar.zzn(zzjw);
        }
        return zzaj + zzjw;
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public static int zzb(zzgh zzghVar, zzgy zzgyVar) {
        zzdg zzdgVar = (zzdg) zzghVar;
        int zzjw = zzdgVar.zzjw();
        if (zzjw == -1) {
            zzjw = zzgyVar.zzs(zzdgVar);
            zzdgVar.zzn(zzjw);
        }
        return zzal(zzjw) + zzjw;
    }

    @Deprecated
    public static int zzd(zzgh zzghVar) {
        return zzghVar.zzly();
    }

    public final void zza(float f) throws IOException {
        zzai(Float.floatToRawIntBits(f));
    }

    public static int zza(int i, zzfo zzfoVar) {
        int zzaj = zzaj(i);
        int zzly = zzfoVar.zzly();
        return zzaj + zzal(zzly) + zzly;
    }

    public static int zza(zzfo zzfoVar) {
        int zzly = zzfoVar.zzly();
        return zzal(zzly) + zzly;
    }

    public final void zza(String str, zzic zzicVar) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzicVar);
        byte[] bytes = str.getBytes(zzfb.UTF_8);
        try {
            zzag(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzc e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzc(e2);
        }
    }
}
