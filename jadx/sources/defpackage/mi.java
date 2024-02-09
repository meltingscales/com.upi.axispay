package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: mi  reason: default package */
/* loaded from: classes.dex */
public final class mi {

    /* compiled from: AxisPay */
    /* renamed from: mi$a */
    /* loaded from: classes.dex */
    public static class a {
        public long a;
        public long b;

        static {
            C0095z.a();
        }
    }

    static {
        C0095z.a();
    }

    public static long a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = aVar.b;
        randomAccessFile.seek(aVar.a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min((long) PlaybackStateCompat.ACTION_PREPARE, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min((long) PlaybackStateCompat.ACTION_PREPARE, j));
        }
        return crc32.getValue();
    }

    public static a b(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        if (length >= 0) {
            long j = length - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            long j2 = j >= 0 ? j : 0L;
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    a aVar = new a();
                    aVar.b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    aVar.a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j2);
            char[] cArr = {(char) (cArr[2] ^ '!'), (char) (cArr[18] ^ 11), (char) (cArr[29] ^ 5), (char) (cArr[6] ^ 0), (char) (cArr[21] ^ ' '), (char) (cArr[17] ^ 20), (char) (cArr[39] ^ 'F'), (char) (cArr[9] ^ '-'), (char) (cArr[17] ^ 23), (char) (cArr[21] ^ 1), (char) (cArr[18] ^ 17), (char) (cArr[42] ^ 28), (char) (cArr[39] ^ 7), (char) (cArr[4] ^ '#'), (char) (cArr[38] ^ 0), (char) (cArr[38] ^ 'd'), (char) (cArr[41] ^ 28), (char) (cArr[41] ^ 7), (char) (cArr[32] ^ 23), (char) (cArr[38] ^ 'C'), (char) (cArr[18] ^ 17), (char) (cArr[37] ^ 27), (char) (cArr[18] ^ 23), (char) (cArr[16] ^ 16), (char) (cArr[9] ^ 'N'), (char) (cArr[35] ^ 29), (char) (cArr[6] ^ 'I'), (char) (cArr[18] ^ 2), (char) (cArr[29] ^ 15), (char) (cArr[39] ^ 7), (char) (cArr[41] ^ 1), (char) (cArr[38] ^ 'U'), (char) (cArr[41] ^ 7), (char) (cArr[19] ^ 6), (char) (cArr[18] ^ 'E'), (char) (cArr[41] ^ 27), (char) (cArr[14] ^ 'O'), (char) (cArr[17] ^ 6), (char) (cArr[18] ^ 'E'), (char) (cArr[41] ^ 19), (char) (cArr[12] ^ 14), (char) (566 ^ 579), (char) (cArr[17] ^ 28), (char) (cArr[5] ^ 2)};
            throw new ZipException(new String(cArr).intern());
        }
        StringBuilder sb = new StringBuilder();
        char[] cArr2 = {(char) (cArr2[14] ^ 'f'), (char) (cArr2[28] ^ 0), (char) (cArr2[13] ^ 24), (char) (cArr2[28] ^ '\f'), (char) (cArr2[28] ^ 'I'), (char) (cArr2[14] ^ 'T'), (char) (cArr2[1] ^ 6), (char) (cArr2[18] ^ '\r'), (char) (cArr2[27] ^ 'F'), (char) (cArr2[26] ^ 'S'), (char) (cArr2[15] ^ 28), (char) (cArr2[3] ^ '\n'), (char) (cArr2[19] ^ 23), (char) (cArr2[7] ^ 27), (char) (cArr2[28] ^ 'I'), (char) (cArr2[27] ^ 18), (char) (cArr2[23] ^ 21), (char) (cArr2[3] ^ 'E'), (char) (cArr2[31] ^ 'X'), (char) (5041 ^ 5076), (char) (cArr2[13] ^ 'T'), (char) (cArr2[27] ^ 7), (char) (cArr2[1] ^ 'I'), (char) (cArr2[18] ^ 24), (char) (cArr2[12] ^ 27), (char) (cArr2[23] ^ '\n'), (char) (cArr2[21] ^ 'A'), (char) (cArr2[31] ^ '\\'), (char) (cArr2[31] ^ 'S'), (char) (cArr2[13] ^ 24), (char) (cArr2[3] ^ 0), (char) (cArr2[19] ^ '_'), (char) (cArr2[13] ^ 'T')};
        sb.append(new String(cArr2).intern());
        sb.append(randomAccessFile.length());
        throw new ZipException(sb.toString());
    }

    public static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, new String(new char[]{(char) (23940 ^ 24054)}).intern());
        try {
            return a(randomAccessFile, b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
