package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import myunmn.C0059ao;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: li  reason: default package */
/* loaded from: classes.dex */
public final class li implements Closeable {
    public final File b;
    public final long c;
    public final File d;
    public final RandomAccessFile e;
    public final FileChannel f;
    public final FileLock g;

    /* compiled from: AxisPay */
    /* renamed from: li$a */
    /* loaded from: classes.dex */
    public class a implements FileFilter {
        static {
            C0095z.a();
        }

        public a(li liVar) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals(C0059ao.a(110));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: li$b */
    /* loaded from: classes.dex */
    public static class b extends File {
        public long b;

        static {
            C0095z.a();
        }

        public b(File file, String str) {
            super(file, str);
            this.b = -1L;
        }
    }

    static {
        C0095z.a();
    }

    public li(File file, File file2) throws IOException {
        StringBuilder sb = new StringBuilder();
        char[] cArr = {(char) (cArr[13] ^ '.'), (char) (cArr[10] ^ 1), (char) (26736 ^ 26652), (char) (cArr[9] ^ '\f'), (char) (cArr[0] ^ '$'), (char) (cArr[15] ^ '+'), (char) (cArr[11] ^ 23), (char) (cArr[13] ^ 27), (char) (cArr[5] ^ 1), (char) (cArr[16] ^ '\n'), (char) (cArr[16] ^ 6), (char) (cArr[2] ^ 30), (char) (cArr[14] ^ 21), (char) (cArr[2] ^ 15), (char) (cArr[2] ^ 24), (char) (cArr[4] ^ 6), (char) (cArr[2] ^ 30), (char) (cArr[8] ^ 'm')};
        sb.append(new String(cArr).intern());
        sb.append(file.getPath());
        char[] cArr2 = {(char) (31623 ^ 31659), (char) (cArr2[0] ^ '\f')};
        sb.append(new String(cArr2).intern());
        sb.append(file2.getPath());
        sb.append(new String(new char[]{(char) (9394 ^ 9371)}).intern());
        String sb2 = sb.toString();
        char[] cArr3 = {(char) (cArr3[7] ^ '5'), (char) (cArr3[0] ^ '8'), (char) (cArr3[0] ^ '!'), (char) (cArr3[7] ^ '\f'), (char) (cArr3[5] ^ '-'), (char) (cArr3[7] ^ '<'), (char) (cArr3[7] ^ 29), (char) ((-3219) ^ (-3307))};
        String intern = new String(cArr3).intern();
        Log.i(intern, sb2);
        this.b = file;
        this.d = file2;
        this.c = w(file);
        File file3 = new File(file2, new String(r((4 - 1259065246) ^ (-267515107))).intern());
        char[] cArr4 = {(char) ((-5472) ^ (-5422)), (char) (cArr4[0] ^ 5)};
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, new String(cArr4).intern());
        this.e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f = channel;
            try {
                StringBuilder sb3 = new StringBuilder();
                char[] cArr5 = {(char) (cArr5[10] ^ ','), (char) (cArr5[0] ^ '.'), (char) (cArr5[9] ^ 0), (char) (cArr5[7] ^ 4), (char) (cArr5[9] ^ 4), (char) (cArr5[11] ^ 'I'), (char) (cArr5[9] ^ 1), (char) (cArr5[12] ^ 11), (char) (cArr5[11] ^ 0), (char) (13137 ^ 13118), (char) (cArr5[14] ^ '\r'), (char) (cArr5[9] ^ 'O'), (char) (cArr5[11] ^ 'L'), (char) (cArr5[1] ^ 3), (char) (cArr5[16] ^ 'C'), (char) (cArr5[5] ^ 2), (char) (cArr5[3] ^ 'C')};
                sb3.append(new String(cArr5).intern());
                sb3.append(file3.getPath());
                Log.i(intern, sb3.toString());
                this.g = channel.lock();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(file3.getPath());
                char[] cArr6 = {(char) (cArr6[1] ^ 'L'), (char) (cArr6[5] ^ '\t'), (char) (cArr6[5] ^ '\n'), (char) (cArr6[5] ^ 6), (char) (cArr6[6] ^ 15), (char) ((-18751) ^ (-18780)), (char) (cArr6[2] ^ 11)};
                sb4.append(new String(cArr6).intern());
                Log.i(intern, sb4.toString());
            } catch (IOException e) {
                e = e;
                j(this.f);
                throw e;
            } catch (Error e2) {
                e = e2;
                j(this.f);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                j(this.f);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            j(this.e);
            throw e4;
        }
    }

    private char[] A(int i) {
        char[] cArr = {(char) (cArr[1] ^ 29), (char) (cArr[3] ^ 'V'), (char) (cArr[5] ^ 'N'), (char) (7981 ^ i), (char) (cArr[5] ^ 11), (char) (cArr[1] ^ 'T'), (char) (cArr[0] ^ '@'), (char) (cArr[9] ^ 'T'), (char) (cArr[6] ^ 15), (char) (cArr[2] ^ 0)};
        return cArr;
    }

    private char[] B(int i) {
        char[] cArr = {(char) ((-15952) ^ i), (char) (cArr[3] ^ 22), (char) (cArr[8] ^ 7), (char) (cArr[8] ^ 7), (char) (cArr[8] ^ 1), (char) (cArr[4] ^ 0), (char) (cArr[2] ^ 7), (char) (cArr[0] ^ 22), (char) (cArr[0] ^ 23)};
        return cArr;
    }

    private static char[] C(int i) {
        char[] cArr = {(char) (cArr[2] ^ '!'), (char) (cArr[6] ^ 16), (char) (cArr[6] ^ '\t'), (char) (cArr[2] ^ 24), (char) (cArr[1] ^ 28), (char) (cArr[1] ^ '1'), (char) (10921 ^ i), (char) (cArr[3] ^ '\f')};
        return cArr;
    }

    private char[] D(int i) {
        char[] cArr = {(char) (cArr[3] ^ '7'), (char) (cArr[10] ^ 'X'), (char) (cArr[7] ^ 29), (char) (cArr[4] ^ 19), (char) (cArr[2] ^ 21), (char) (cArr[2] ^ 23), (char) (cArr[7] ^ 29), (char) (16897 ^ i), (char) (cArr[5] ^ '\f'), (char) (cArr[1] ^ 22), (char) (cArr[6] ^ 'T')};
        return cArr;
    }

    private char[] E(int i) {
        char[] cArr = {(char) (cArr[1] ^ '\r'), (char) (14951 ^ i), (char) (cArr[6] ^ 26), (char) (cArr[5] ^ 0), (char) (cArr[0] ^ 'R'), (char) (cArr[4] ^ 17), (char) (cArr[0] ^ 26), (char) (cArr[1] ^ '\r')};
        return cArr;
    }

    private static char[] F(int i) {
        char[] cArr = {(char) (cArr[5] ^ 0), (char) (cArr[3] ^ 'M'), (char) (cArr[5] ^ 'K'), (char) (cArr[2] ^ 14), (char) (cArr[3] ^ 28), (char) (28400 ^ i), (char) (cArr[4] ^ '[')};
        return cArr;
    }

    private static char[] G(int i) {
        char[] cArr = {(char) (cArr[7] ^ 'O'), (char) (cArr[3] ^ 'I'), (char) (cArr[6] ^ 'F'), (char) (cArr[8] ^ 27), (char) (cArr[2] ^ '\n'), (char) (cArr[3] ^ '\f'), (char) (cArr[9] ^ 'C'), (char) (cArr[5] ^ 6), (char) (cArr[9] ^ 17), (char) ((-27649) ^ i), (char) (cArr[11] ^ 26), (char) (cArr[9] ^ 'C')};
        return cArr;
    }

    private char[] H(int i) {
        char[] cArr = {(char) (cArr[37] ^ '\"'), (char) (cArr[40] ^ 'A'), (char) (cArr[40] ^ 'I'), (char) (cArr[15] ^ '\t'), (char) (cArr[38] ^ 0), (char) (cArr[6] ^ 'D'), (char) (cArr[11] ^ 'E'), (char) (cArr[11] ^ 17), (char) (cArr[7] ^ 27), (char) (cArr[35] ^ 'Y'), (char) (cArr[2] ^ '\r'), (char) (cArr[38] ^ 0), (char) (cArr[27] ^ 31), (char) (cArr[37] ^ 1), (char) (cArr[18] ^ 27), (char) (cArr[4] ^ 0), (char) (cArr[11] ^ 'E'), (char) (cArr[29] ^ 0), (char) (cArr[16] ^ 'O'), (char) (cArr[30] ^ 29), (char) (cArr[40] ^ 'R'), (char) (cArr[38] ^ 16), (char) (cArr[32] ^ 20), (char) (cArr[15] ^ 17), (char) (cArr[7] ^ 17), (char) (cArr[34] ^ 22), (char) (cArr[4] ^ 'E'), (char) (cArr[7] ^ 7), (char) (cArr[22] ^ 21), (char) (cArr[10] ^ 7), (char) (cArr[31] ^ 1), (char) (cArr[15] ^ 11), (char) (cArr[40] ^ 'D'), (char) (cArr[36] ^ 'A'), (char) (cArr[36] ^ 'R'), (char) (cArr[38] ^ 28), (char) (cArr[4] ^ 'E'), (char) (cArr[11] ^ 1), (char) ((-19283) ^ i), (char) (cArr[15] ^ 29), (char) (cArr[15] ^ 'E'), (char) (cArr[38] ^ 'B')};
        return cArr;
    }

    private static char[] I(int i) {
        char[] cArr = {(char) (cArr[1] ^ 1), (char) (7386 ^ i), (char) (cArr[6] ^ 21), (char) (cArr[4] ^ '@'), (char) (cArr[1] ^ 11), (char) (cArr[9] ^ 7), (char) (cArr[9] ^ 31), (char) (cArr[0] ^ 6), (char) (cArr[9] ^ 23), (char) (cArr[1] ^ 23)};
        return cArr;
    }

    private char[] J(int i) {
        char[] cArr = {(char) (cArr[7] ^ '5'), (char) (cArr[7] ^ '\r'), (char) (cArr[6] ^ '\t'), (char) (cArr[4] ^ 29), (char) (cArr[1] ^ 28), (char) (cArr[1] ^ '1'), (char) (cArr[7] ^ 29), (char) (30745 ^ i)};
        return cArr;
    }

    private char[] K(int i) {
        char[] cArr = {(char) (cArr[1] ^ 'F'), (char) (cArr[19] ^ 'N'), (char) (cArr[16] ^ '\n'), (char) (cArr[11] ^ 19), (char) (cArr[17] ^ 'X'), (char) (cArr[4] ^ 'S'), (char) (cArr[10] ^ 1), (char) (cArr[4] ^ 'C'), (char) (cArr[16] ^ '\n'), (char) (cArr[4] ^ 'N'), (char) (cArr[7] ^ 7), (char) (cArr[14] ^ 'A'), (char) (cArr[4] ^ 'R'), (char) (cArr[9] ^ 23), (char) (cArr[12] ^ 'R'), (char) (cArr[19] ^ 'L'), (char) (cArr[17] ^ 29), (char) (3033 ^ i), (char) (cArr[6] ^ 'E'), (char) (cArr[17] ^ 'P')};
        return cArr;
    }

    private static char[] L(int i) {
        char[] cArr = {(char) (cArr[3] ^ 'C'), (char) (cArr[5] ^ 'I'), (char) (cArr[0] ^ 'A'), (char) (cArr[6] ^ '\t'), (char) (cArr[1] ^ 'D'), (char) (6409 ^ i), (char) (cArr[10] ^ 18), (char) (cArr[0] ^ 'E'), (char) (cArr[5] ^ '\n'), (char) (cArr[3] ^ 14), (char) (cArr[5] ^ 29), (char) (cArr[10] ^ 29), (char) (cArr[10] ^ 27), (char) (cArr[9] ^ 15), (char) (cArr[18] ^ 'E'), (char) (cArr[11] ^ 29), (char) (cArr[12] ^ 6), (char) (cArr[3] ^ 2), (char) (cArr[4] ^ 1), (char) (cArr[0] ^ 22), (char) (cArr[14] ^ 0)};
        return cArr;
    }

    public static void P(Context context, String str, long j, long j2, List<b> list) {
        SharedPreferences.Editor edit = m(context).edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        char[] cArr = {(char) (cArr[5] ^ 0), (char) (cArr[8] ^ 25), (char) (cArr[8] ^ 29), (char) (9638 ^ 9667), (char) (cArr[5] ^ 7), (char) (cArr[3] ^ 17), (char) (cArr[8] ^ 17), (char) (cArr[1] ^ 4), (char) (cArr[3] ^ 21)};
        sb.append(new String(cArr).intern());
        edit.putLong(sb.toString(), j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        char[] cArr2 = {(char) (cArr2[1] ^ 17), (char) (13258 ^ 13240), (char) (cArr2[0] ^ 0)};
        sb2.append(new String(cArr2).intern());
        edit.putLong(sb2.toString(), j2);
        edit.putInt(str + new String(f((477410069 ^ 1071017101) - 72)).intern(), list.size() + 1);
        int i = 2;
        for (b bVar : list) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            char[] cArr3 = {(char) (cArr3[2] ^ 28), (char) (8962 ^ 9063), (char) (cArr3[1] ^ 29), (char) (cArr3[1] ^ 'K'), (char) (cArr3[2] ^ 27), (char) (cArr3[0] ^ 22), (char) (cArr3[2] ^ 27), (char) (cArr3[2] ^ 'V')};
            sb3.append(new String(cArr3).intern());
            sb3.append(i);
            edit.putLong(sb3.toString(), bVar.b);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            char[] cArr4 = {(char) (cArr4[8] ^ 'J'), (char) (cArr4[5] ^ '\f'), (char) (cArr4[5] ^ 17), (char) (cArr4[4] ^ 'Z'), (char) (cArr4[8] ^ 'Z'), (char) (cArr4[6] ^ 4), (char) ((-4555) ^ (-4520)), (char) (cArr4[6] ^ '\b'), (char) (cArr4[6] ^ 'C')};
            sb4.append(new String(cArr4).intern());
            sb4.append(i);
            edit.putLong(sb4.toString(), bVar.lastModified());
            i++;
        }
        edit.commit();
    }

    private static char[] a(int i) {
        char[] cArr = {(char) (cArr[4] ^ '\\'), (char) (cArr[6] ^ 'C'), (char) (cArr[9] ^ 1), (char) (cArr[13] ^ 27), (char) (cArr[14] ^ 'J'), (char) (cArr[3] ^ 29), (char) (cArr[13] ^ 0), (char) (cArr[2] ^ 17), (char) (cArr[11] ^ 6), (char) (cArr[13] ^ 7), (char) (cArr[13] ^ 'C'), (char) (cArr[13] ^ 0), (char) (cArr[10] ^ 'R'), (char) ((-15622) ^ i), (char) (cArr[3] ^ 'B'), (char) (cArr[11] ^ 'C')};
        return cArr;
    }

    private static char[] b(int i) {
        char[] cArr = {(char) (cArr[9] ^ '1'), (char) (cArr[5] ^ 7), (char) (cArr[5] ^ 31), (char) (cArr[18] ^ 5), (char) (cArr[6] ^ '\b'), (char) (17182 ^ i), (char) (cArr[16] ^ 0), (char) (cArr[12] ^ 'A'), (char) (cArr[21] ^ '_'), (char) (cArr[5] ^ 17), (char) (cArr[18] ^ 16), (char) (cArr[5] ^ 27), (char) (cArr[21] ^ '['), (char) (cArr[22] ^ 'C'), (char) (cArr[11] ^ 6), (char) (cArr[18] ^ 1), (char) (cArr[1] ^ '\n'), (char) (cArr[9] ^ 'X'), (char) (cArr[5] ^ '\r'), (char) (cArr[0] ^ ','), (char) (cArr[2] ^ 14), (char) (cArr[16] ^ '^'), (char) (cArr[7] ^ 0)};
        return cArr;
    }

    private char[] c(int i) {
        char[] cArr = {(char) (cArr[19] ^ '3'), (char) (cArr[22] ^ 6), (char) (cArr[20] ^ 'U'), (char) (cArr[1] ^ 3), (char) (cArr[21] ^ 2), (char) (cArr[25] ^ 0), (char) (cArr[20] ^ 'N'), (char) (cArr[20] ^ 'O'), (char) (cArr[11] ^ 6), (char) (cArr[19] ^ 'P'), (char) (cArr[22] ^ '\n'), (char) (cArr[20] ^ 'R'), (char) (cArr[11] ^ 23), (char) (cArr[23] ^ '\r'), (char) (cArr[2] ^ 1), (char) (cArr[22] ^ '\f'), (char) (cArr[24] ^ 'E'), (char) (cArr[11] ^ '\b'), (char) (cArr[21] ^ 15), (char) (cArr[21] ^ 22), (char) (7385 ^ i), (char) (cArr[20] ^ 'F'), (char) (cArr[20] ^ 'I'), (char) (cArr[21] ^ '\n'), (char) (cArr[0] ^ '&'), (char) (cArr[20] ^ 0)};
        return cArr;
    }

    private static char[] d(int i) {
        char[] cArr = {(char) (cArr[4] ^ ']'), (char) (cArr[5] ^ 16), (char) (cArr[4] ^ 31), (char) (cArr[5] ^ 18), (char) ((-16178) ^ i), (char) (cArr[2] ^ 31), (char) (cArr[1] ^ 6), (char) (cArr[5] ^ 0)};
        return cArr;
    }

    private static char[] e(int i) {
        char[] cArr = {(char) (cArr[12] ^ 30), (char) (cArr[9] ^ 3), (char) (cArr[6] ^ '\t'), (char) ((-20752) ^ i), (char) (cArr[9] ^ 31), (char) (cArr[1] ^ 17), (char) (cArr[3] ^ 17), (char) (cArr[1] ^ '\r'), (char) (cArr[12] ^ ']'), (char) (cArr[11] ^ 4), (char) (cArr[13] ^ '\f'), (char) (cArr[3] ^ 6), (char) (cArr[5] ^ 23), (char) (cArr[11] ^ 27), (char) (cArr[11] ^ 29), (char) (cArr[13] ^ 7)};
        return cArr;
    }

    private static char[] f(int i) {
        char[] cArr = {(char) (cArr[9] ^ 22), (char) (cArr[9] ^ 23), (char) (cArr[7] ^ 26), (char) (cArr[2] ^ 'V'), (char) (cArr[0] ^ '\n'), (char) (cArr[1] ^ 16), (char) (cArr[9] ^ 31), (char) (cArr[9] ^ 16), (char) (cArr[6] ^ '\b'), (char) ((-8414) ^ i)};
        return cArr;
    }

    private char[] g(int i) {
        char[] cArr = {(char) (cArr[2] ^ 'B'), (char) (cArr[4] ^ 16), (char) ((-14252) ^ i), (char) (cArr[7] ^ 18), (char) (cArr[0] ^ ']'), (char) (cArr[0] ^ ']'), (char) (cArr[2] ^ '\t'), (char) (cArr[0] ^ ']')};
        return cArr;
    }

    private static char[] h(int i) {
        char[] cArr = {(char) (cArr[6] ^ 7), (char) (cArr[7] ^ 'K'), (char) (cArr[5] ^ '\n'), (char) (cArr[5] ^ '\\'), (char) (cArr[2] ^ 27), (char) ((-702) ^ i), (char) (cArr[2] ^ 27), (char) (cArr[5] ^ '\\')};
        return cArr;
    }

    private static char[] i(int i) {
        return new char[]{(char) (27782 ^ i)};
    }

    public static void j(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            char[] cArr = {(char) (cArr[6] ^ '('), (char) (cArr[5] ^ '1'), (char) (cArr[6] ^ '\t'), (char) (cArr[6] ^ 17), (char) (cArr[3] ^ 29), (char) (cArr[0] ^ '\t'), (char) ((-13314) ^ (-13413)), (char) (cArr[2] ^ 20)};
            String intern = new String(cArr).intern();
            char[] cArr2 = {(char) (cArr2[16] ^ '4'), (char) (cArr2[11] ^ '\r'), (char) (cArr2[5] ^ '\r'), (char) (cArr2[14] ^ '\t'), (char) (cArr2[14] ^ 0), (char) (cArr2[14] ^ 1), (char) (cArr2[10] ^ 'C'), (char) (cArr2[13] ^ 7), (char) (cArr2[15] ^ 'O'), (char) (cArr2[1] ^ 'A'), (char) (cArr2[14] ^ 6), (char) ((-11137) ^ (-11245)), (char) (cArr2[11] ^ 3), (char) (cArr2[17] ^ 22), (char) (cArr2[11] ^ '\t'), (char) (cArr2[6] ^ 0), (char) (cArr2[2] ^ 27), (char) (cArr2[5] ^ 1), (char) (cArr2[20] ^ 6), (char) (cArr2[11] ^ 3), (char) (cArr2[22] ^ 22), (char) (cArr2[11] ^ 30), (char) (cArr2[14] ^ 6), (char) (cArr2[9] ^ 'E')};
            Log.w(intern, new String(cArr2).intern(), e);
        }
    }

    private char[] j(int i) {
        char[] cArr = {(char) (cArr[2] ^ 'K'), (char) (cArr[2] ^ 1), (char) ((-29520) ^ i), (char) (cArr[2] ^ 29)};
        return cArr;
    }

    public static void k(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        StringBuilder sb = new StringBuilder();
        char[] cArr = {(char) (cArr[1] ^ 25), (char) ((-6312) ^ (-6347)), (char) (cArr[0] ^ 4), (char) (cArr[1] ^ '@')};
        sb.append(new String(cArr).intern());
        sb.append(str);
        String sb2 = sb.toString();
        File parentFile = file.getParentFile();
        char[] cArr2 = {(char) (cArr2[2] ^ 'G'), (char) (21121 ^ 21243), (char) (cArr2[1] ^ 19), (char) (cArr2[1] ^ '\n')};
        File createTempFile = File.createTempFile(sb2, new String(cArr2).intern(), parentFile);
        StringBuilder sb3 = new StringBuilder();
        char[] cArr3 = {(char) (cArr3[8] ^ '+'), (char) (cArr3[10] ^ 'X'), (char) (cArr3[9] ^ 19), (char) (cArr3[0] ^ '7'), (char) (cArr3[7] ^ '\b'), (char) (cArr3[9] ^ 4), (char) (cArr3[2] ^ 0), (char) ((-18678) ^ (-18589)), (char) (cArr3[4] ^ 15), (char) (cArr3[4] ^ 6), (char) (cArr3[2] ^ 'T')};
        sb3.append(new String(cArr3).intern());
        sb3.append(createTempFile.getPath());
        String sb4 = sb3.toString();
        char[] cArr4 = {(char) ((-9241) ^ (-9302)), (char) (cArr4[5] ^ '1'), (char) (cArr4[7] ^ 20), (char) (cArr4[0] ^ '9'), (char) (cArr4[0] ^ '$'), (char) (cArr4[0] ^ '\t'), (char) (cArr4[1] ^ 16), (char) (cArr4[5] ^ '<')};
        String intern = new String(cArr4).intern();
        Log.i(intern, sb4);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry(new String(n((838218183 ^ 343233981) + 97)).intern());
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                StringBuilder sb5 = new StringBuilder();
                char[] cArr5 = {(char) (cArr5[5] ^ ';'), (char) (cArr5[3] ^ 4), (char) (cArr5[10] ^ 1), (char) ((-21054) ^ (-21085)), (char) (cArr5[3] ^ '\f'), (char) (cArr5[1] ^ '\f'), (char) (cArr5[11] ^ 'N'), (char) (cArr5[3] ^ 6), (char) (cArr5[11] ^ 0), (char) (cArr5[7] ^ 19), (char) (cArr5[0] ^ '='), (char) (cArr5[1] ^ 'E')};
                sb5.append(new String(cArr5).intern());
                sb5.append(file.getPath());
                Log.i(intern, sb5.toString());
                if (createTempFile.renameTo(file)) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder();
                char[] cArr6 = {(char) (cArr6[9] ^ 'f'), (char) (cArr6[16] ^ 'A'), (char) (cArr6[13] ^ '\b'), (char) (cArr6[4] ^ '\t'), (char) ((-4214) ^ (-4113)), (char) (cArr6[0] ^ '\"'), (char) (cArr6[5] ^ 'D'), (char) (cArr6[5] ^ 16), (char) (cArr6[9] ^ 'O'), (char) (cArr6[2] ^ 'I'), (char) (cArr6[2] ^ 27), (char) (cArr6[13] ^ 4), (char) (cArr6[13] ^ 15), (char) (cArr6[4] ^ 4), (char) (cArr6[9] ^ 'M'), (char) (cArr6[14] ^ '\b'), (char) (cArr6[11] ^ 'E'), (char) (cArr6[15] ^ 'G')};
                sb6.append(new String(cArr6).intern());
                sb6.append(createTempFile.getAbsolutePath());
                char[] cArr7 = {(char) ((-14949) ^ (-14919)), (char) (cArr7[0] ^ 2), (char) (cArr7[4] ^ 'T'), (char) (cArr7[5] ^ 'M'), (char) (cArr7[0] ^ 2), (char) (cArr7[0] ^ 0)};
                sb6.append(new String(cArr7).intern());
                sb6.append(file.getAbsolutePath());
                sb6.append(new String(new char[]{(char) ((-31984) ^ (-31950))}).intern());
                throw new IOException(sb6.toString());
            }
            StringBuilder sb7 = new StringBuilder();
            char[] cArr8 = {(char) (cArr8[17] ^ '\''), (char) (cArr8[19] ^ 14), (char) (cArr8[1] ^ '\b'), (char) (cArr8[12] ^ 30), (char) (cArr8[17] ^ 4), (char) (cArr8[17] ^ 5), (char) (cArr8[7] ^ 'T'), (char) ((-30421) ^ (-30369)), (char) (cArr8[15] ^ 29), (char) (cArr8[7] ^ 'T'), (char) (cArr8[9] ^ 'M'), (char) (cArr8[7] ^ 21), (char) (cArr8[19] ^ 29), (char) (cArr8[8] ^ 4), (char) (cArr8[6] ^ 0), (char) (cArr8[6] ^ 'R'), (char) (cArr8[7] ^ 17), (char) (cArr8[7] ^ 21), (char) (cArr8[15] ^ 22), (char) (cArr8[7] ^ 27), (char) (cArr8[19] ^ 1), (char) (cArr8[12] ^ 30), (char) (cArr8[1] ^ 24), (char) (cArr8[6] ^ 0), (char) (cArr8[7] ^ 'V')};
            sb7.append(new String(cArr8).intern());
            sb7.append(createTempFile.getAbsolutePath());
            char[] cArr9 = {(char) (cArr9[9] ^ 2), (char) (cArr9[6] ^ 0), (char) ((-1915) ^ (-1875)), (char) (cArr9[7] ^ 27), (char) (cArr9[6] ^ 'M'), (char) (cArr9[8] ^ 22), (char) (cArr9[9] ^ 0), (char) (cArr9[9] ^ 'O'), (char) (cArr9[2] ^ 'N'), (char) (cArr9[2] ^ '\b'), (char) (cArr9[2] ^ '\n')};
            sb7.append(new String(cArr9).intern());
            sb7.append(file.getAbsolutePath());
            char[] cArr10 = {(char) ((-23495) ^ (-23525)), (char) (cArr10[0] ^ 11)};
            sb7.append(new String(cArr10).intern());
            throw new IOException(sb7.toString());
        } finally {
            j(inputStream);
            createTempFile.delete();
        }
    }

    private char[] k(int i) {
        char[] cArr = {(char) (cArr[4] ^ 3), (char) (cArr[2] ^ '\b'), (char) (cArr[0] ^ 15), (char) (14567 ^ i), (char) (cArr[5] ^ 1), (char) (cArr[3] ^ '\b')};
        return cArr;
    }

    private char[] l(int i) {
        char[] cArr = {(char) (cArr[2] ^ 'G'), (char) (cArr[2] ^ 19), (char) (13006 ^ i), (char) (cArr[2] ^ 25)};
        return cArr;
    }

    public static SharedPreferences m(Context context) {
        return context.getSharedPreferences(new String(e((648204008 - 191897806) + 106)).intern(), Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private char[] m(int i) {
        char[] cArr = {(char) (cArr[1] ^ 7), (char) ((-22015) ^ i)};
        return cArr;
    }

    private static char[] n(int i) {
        char[] cArr = {(char) (cArr[2] ^ 2), (char) (cArr[6] ^ 31), (char) (cArr[4] ^ 18), (char) (cArr[2] ^ 18), (char) (25768 ^ i), (char) (cArr[4] ^ 22), (char) (cArr[3] ^ 0), (char) (cArr[4] ^ ']'), (char) (cArr[6] ^ 23), (char) (cArr[8] ^ 1), (char) (cArr[5] ^ 29)};
        return cArr;
    }

    private char[] o(int i) {
        return new char[]{(char) (4498 ^ i)};
    }

    private char[] p(int i) {
        char[] cArr = {(char) (cArr[2] ^ '1'), (char) (cArr[26] ^ 17), (char) (cArr[3] ^ 6), (char) (cArr[19] ^ 22), (char) (cArr[15] ^ 4), (char) (cArr[10] ^ 'C'), (char) (cArr[21] ^ 18), (char) (cArr[16] ^ '\f'), (char) (cArr[6] ^ 27), (char) (cArr[16] ^ 11), (char) (cArr[17] ^ 'D'), (char) (cArr[27] ^ 5), (char) (cArr[19] ^ 23), (char) (cArr[0] ^ 'e'), (char) (cArr[9] ^ 0), (char) (cArr[1] ^ 29), (char) (cArr[2] ^ 17), (char) (cArr[2] ^ 16), (char) (cArr[26] ^ '\f'), (char) ((-13522) ^ i), (char) (cArr[26] ^ 'I'), (char) (cArr[2] ^ 18), (char) (cArr[2] ^ 27), (char) (cArr[0] ^ '7'), (char) (cArr[3] ^ 'R'), (char) (cArr[2] ^ 18), (char) (cArr[19] ^ '\r'), (char) (cArr[26] ^ 5), (char) (cArr[17] ^ 1), (char) (cArr[2] ^ 'T')};
        return cArr;
    }

    private static char[] q(int i) {
        char[] cArr = {(char) ((-21613) ^ i), (char) (cArr[3] ^ '\n'), (char) (cArr[0] ^ 'G'), (char) (cArr[2] ^ 25)};
        return cArr;
    }

    public static long r(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static char[] r(int i) {
        char[] cArr = {(char) (15158 ^ i), (char) (cArr[12] ^ 30), (char) (cArr[8] ^ 'B'), (char) (cArr[5] ^ '0'), (char) (cArr[3] ^ 29), (char) (cArr[0] ^ '\t'), (char) (cArr[4] ^ '\f'), (char) (cArr[6] ^ 29), (char) (cArr[0] ^ 'c'), (char) (cArr[8] ^ 'B'), (char) (cArr[8] ^ 'A'), (char) (cArr[0] ^ '.'), (char) (cArr[5] ^ '/')};
        return cArr;
    }

    private static char[] s(int i) {
        char[] cArr = {(char) (cArr[3] ^ 'J'), (char) (cArr[2] ^ 29), (char) (cArr[0] ^ 28), (char) (15320 ^ i), (char) (cArr[8] ^ 'Z'), (char) (cArr[1] ^ '\f'), (char) (cArr[1] ^ '\b'), (char) (cArr[0] ^ 1), (char) (cArr[3] ^ 0)};
        return cArr;
    }

    private char[] t(int i) {
        char[] cArr = {(char) (cArr[10] ^ '4'), (char) (cArr[0] ^ '\''), (char) (cArr[15] ^ '\n'), (char) (cArr[13] ^ '\b'), (char) (cArr[10] ^ 23), (char) (cArr[23] ^ 'D'), (char) (cArr[10] ^ 'R'), (char) (cArr[2] ^ 29), (char) (cArr[5] ^ 11), (char) (cArr[21] ^ 'O'), (char) ((-22971) ^ i), (char) (cArr[10] ^ 23), (char) (cArr[11] ^ 4), (char) (cArr[10] ^ 22), (char) (cArr[4] ^ 'E'), (char) (cArr[17] ^ 0), (char) (cArr[13] ^ 22), (char) (cArr[0] ^ '%'), (char) (cArr[0] ^ 'f'), (char) (cArr[11] ^ 3), (char) (cArr[12] ^ 19), (char) (cArr[23] ^ 'O'), (char) (cArr[21] ^ 2), (char) (cArr[10] ^ 'R')};
        return cArr;
    }

    private char[] u(int i) {
        char[] cArr = {(char) (cArr[10] ^ '%'), (char) (cArr[3] ^ '\r'), (char) (cArr[9] ^ 'I'), (char) (16686 ^ i), (char) (cArr[22] ^ 6), (char) (cArr[22] ^ 7), (char) (cArr[22] ^ 'C'), (char) (cArr[0] ^ '2'), (char) (cArr[14] ^ '\n'), (char) (cArr[3] ^ 'L'), (char) (cArr[1] ^ 2), (char) (cArr[14] ^ '\t'), (char) (cArr[9] ^ 'O'), (char) (cArr[1] ^ 18), (char) (cArr[3] ^ '\t'), (char) (cArr[7] ^ 'T'), (char) (cArr[22] ^ 17), (char) (cArr[23] ^ 0), (char) (cArr[3] ^ 31), (char) (cArr[14] ^ '\n'), (char) (cArr[8] ^ 26), (char) (cArr[7] ^ 6), (char) (cArr[10] ^ 0), (char) (cArr[2] ^ '\f')};
        return cArr;
    }

    private static char[] v(int i) {
        char[] cArr = {(char) (cArr[23] ^ 'M'), (char) (cArr[16] ^ '@'), (char) (cArr[20] ^ 'M'), (char) (cArr[12] ^ 0), (char) (cArr[20] ^ 4), (char) (cArr[21] ^ '\f'), (char) (cArr[18] ^ 25), (char) (cArr[18] ^ '\f'), (char) (13456 ^ i), (char) (cArr[7] ^ 17), (char) (cArr[28] ^ '\b'), (char) (cArr[20] ^ 5), (char) (cArr[8] ^ 'C'), (char) (cArr[16] ^ 4), (char) (cArr[7] ^ '\n'), (char) (cArr[31] ^ 'D'), (char) (cArr[8] ^ '\n'), (char) (cArr[16] ^ 15), (char) (cArr[16] ^ 0), (char) (cArr[27] ^ '\n'), (char) (cArr[16] ^ '\b'), (char) (cArr[7] ^ 17), (char) (cArr[7] ^ '\f'), (char) (cArr[8] ^ '\f'), (char) (cArr[11] ^ '\n'), (char) (cArr[27] ^ 'I'), (char) (cArr[8] ^ 23), (char) (cArr[4] ^ '\f'), (char) (cArr[27] ^ 4), (char) (cArr[8] ^ 6), (char) (cArr[9] ^ 'N'), (char) (cArr[25] ^ 0)};
        return cArr;
    }

    public static long w(File file) throws IOException {
        long c = mi.c(file);
        return c == -1 ? c - 1 : c;
    }

    private static char[] w(int i) {
        char[] cArr = {(char) (cArr[20] ^ '.'), (char) (cArr[35] ^ '\f'), (char) (cArr[13] ^ 16), (char) (cArr[29] ^ 22), (char) (cArr[35] ^ '\f'), (char) (cArr[0] ^ '#'), (char) (cArr[19] ^ 2), (char) (cArr[31] ^ 0), (char) (cArr[33] ^ '\f'), (char) (cArr[30] ^ 0), (char) (cArr[17] ^ 'T'), (char) (cArr[14] ^ 6), (char) (cArr[14] ^ 21), (char) (cArr[11] ^ 17), (char) (cArr[19] ^ 17), (char) (cArr[9] ^ 29), (char) (cArr[28] ^ 0), (char) (cArr[19] ^ 'E'), (char) (cArr[30] ^ 11), (char) ((-18711) ^ i), (char) (cArr[19] ^ 6), (char) (cArr[11] ^ 29), (char) (cArr[15] ^ 11), (char) (cArr[28] ^ 0), (char) (cArr[28] ^ 5), (char) (cArr[35] ^ 23), (char) (cArr[10] ^ '\r'), (char) (cArr[15] ^ 'E'), (char) (cArr[35] ^ 1), (char) (cArr[5] ^ 11), (char) (cArr[19] ^ 29), (char) (cArr[10] ^ 'T'), (char) (cArr[16] ^ 2), (char) (cArr[18] ^ 26), (char) (cArr[11] ^ 30), (char) (cArr[30] ^ 29), (char) (cArr[9] ^ 'X'), (char) (cArr[34] ^ 'K')};
        return cArr;
    }

    private static char[] x(int i) {
        char[] cArr = {(char) (cArr[23] ^ '\r'), (char) (cArr[16] ^ 'O'), (char) (cArr[15] ^ 6), (char) (cArr[10] ^ '\r'), (char) (cArr[3] ^ '\r'), (char) (cArr[16] ^ 'N'), (char) (cArr[31] ^ 1), (char) (cArr[3] ^ 'D'), (char) (cArr[18] ^ 0), (char) (cArr[11] ^ 11), (char) (17613 ^ i), (char) (cArr[10] ^ 26), (char) (cArr[27] ^ 16), (char) (cArr[15] ^ 14), (char) (cArr[17] ^ 29), (char) (cArr[10] ^ 14), (char) (cArr[3] ^ 'D'), (char) (cArr[26] ^ 'S'), (char) (cArr[26] ^ 'E'), (char) (cArr[10] ^ '\n'), (char) (cArr[29] ^ 23), (char) (cArr[32] ^ 7), (char) (cArr[6] ^ 3), (char) (cArr[13] ^ '\b'), (char) (cArr[27] ^ 22), (char) (cArr[29] ^ 1), (char) (cArr[19] ^ 'C'), (char) (cArr[11] ^ 23), (char) (cArr[18] ^ 0), (char) (cArr[18] ^ 29), (char) (cArr[24] ^ 'R'), (char) (cArr[17] ^ 21), (char) (cArr[9] ^ 17), (char) (cArr[19] ^ 15), (char) (cArr[27] ^ 1), (char) (cArr[4] ^ 26)};
        return cArr;
    }

    private char[] y(int i) {
        char[] cArr = {(char) (cArr[3] ^ 16), (char) (cArr[3] ^ 31), (char) (cArr[5] ^ 4), (char) (cArr[5] ^ 22), (char) (cArr[5] ^ 22), (char) (9391 ^ i), (char) (cArr[5] ^ 22)};
        return cArr;
    }

    public static boolean z(Context context, File file, long j, String str) {
        SharedPreferences m = m(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        char[] cArr = {(char) (cArr[2] ^ 25), (char) (cArr[0] ^ 29), (char) ((-25724) ^ (-25623)), (char) (cArr[4] ^ 22), (char) (cArr[2] ^ 30), (char) (cArr[0] ^ 0), (char) (cArr[0] ^ 21), (char) (cArr[4] ^ 30), (char) (cArr[7] ^ 29)};
        sb.append(new String(cArr).intern());
        if (m.getLong(sb.toString(), -1L) == r(file)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            char[] cArr2 = {(char) ((-19517) ^ (-19552)), (char) (cArr2[0] ^ 17), (char) (cArr2[0] ^ 0)};
            sb2.append(new String(cArr2).intern());
            if (m.getLong(sb2.toString(), -1L) == j) {
                return false;
            }
        }
        return true;
    }

    private char[] z(int i) {
        return new char[]{(char) (23429 ^ i)};
    }

    public List<? extends File> J(Context context, String str, boolean z) throws IOException {
        List<b> O;
        List<b> list;
        StringBuilder sb = new StringBuilder();
        char[] cArr = {(char) (cArr[1] ^ '8'), (char) ((-24666) ^ (-24621)), (char) (cArr[17] ^ 'B'), (char) (cArr[1] ^ 1), (char) (cArr[1] ^ 28), (char) (cArr[18] ^ '('), (char) (cArr[3] ^ 17), (char) (cArr[0] ^ '5'), (char) (cArr[19] ^ '*'), (char) (cArr[1] ^ '\r'), (char) (cArr[16] ^ 6), (char) (cArr[1] ^ 7), (char) (cArr[17] ^ 'O'), (char) (cArr[16] ^ 17), (char) (cArr[22] ^ '\\'), (char) (cArr[1] ^ 26), (char) (cArr[6] ^ 23), (char) (cArr[16] ^ '\\'), (char) (cArr[13] ^ 15), (char) (cArr[11] ^ 29), (char) (cArr[8] ^ '$'), (char) (cArr[0] ^ ')'), (char) (cArr[16] ^ 'Z')};
        sb.append(new String(cArr).intern());
        sb.append(this.b.getPath());
        char[] cArr2 = {(char) (23108 ^ 23144), (char) (cArr2[0] ^ '\f')};
        String intern = new String(cArr2).intern();
        sb.append(intern);
        sb.append(z);
        sb.append(intern);
        sb.append(str);
        sb.append(new String(new char[]{(char) ((-20733) ^ (-20694))}).intern());
        String sb2 = sb.toString();
        char[] cArr3 = {(char) (cArr3[6] ^ '('), (char) (cArr3[5] ^ '1'), (char) (cArr3[3] ^ 24), (char) (cArr3[4] ^ 29), (char) (cArr3[6] ^ '\f'), (char) (cArr3[6] ^ '!'), (char) ((-918) ^ (-1009)), (char) (cArr3[1] ^ '\r')};
        String intern2 = new String(cArr3).intern();
        Log.i(intern2, sb2);
        if (this.g.isValid()) {
            if (!z && !z(context, this.b, this.c, str)) {
                try {
                    list = M(context, str);
                } catch (IOException e) {
                    char[] cArr4 = {(char) (cArr4[11] ^ '#'), (char) (cArr4[67] ^ 2), (char) (cArr4[31] ^ '\n'), (char) (cArr4[57] ^ '\n'), (char) (cArr4[59] ^ '\t'), (char) (cArr4[42] ^ 5), (char) (cArr4[11] ^ 'E'), (char) (cArr4[35] ^ 'T'), (char) (cArr4[30] ^ 14), (char) (cArr4[5] ^ 'D'), (char) (cArr4[32] ^ 6), (char) (cArr4[45] ^ 'E'), (char) (cArr4[8] ^ 3), (char) (cArr4[59] ^ 3), (char) (cArr4[76] ^ 18), (char) (cArr4[59] ^ '\b'), (char) ((-10300) ^ (-10268)), (char) (cArr4[41] ^ 1), (char) (cArr4[5] ^ 28), (char) (cArr4[0] ^ '/'), (char) (cArr4[42] ^ 18), (char) (cArr4[30] ^ 21), (char) (cArr4[73] ^ 15), (char) (cArr4[72] ^ 'N'), (char) (cArr4[41] ^ 3), (char) (cArr4[26] ^ 'E'), (char) (cArr4[71] ^ '\n'), (char) (cArr4[71] ^ 23), (char) (cArr4[41] ^ 16), (char) (cArr4[16] ^ 'R'), (char) (cArr4[29] ^ 19), (char) (cArr4[30] ^ 2), (char) (cArr4[13] ^ 27), (char) (cArr4[0] ^ '#'), (char) (cArr4[11] ^ 1), (char) (cArr4[61] ^ 'I'), (char) (cArr4[51] ^ 26), (char) (cArr4[67] ^ 6), (char) (cArr4[61] ^ '\n'), (char) (cArr4[16] ^ 'O'), (char) (cArr4[20] ^ 29), (char) (cArr4[47] ^ 1), (char) (cArr4[16] ^ 'A'), (char) (cArr4[41] ^ 22), (char) (cArr4[41] ^ 29), (char) (cArr4[51] ^ 'I'), (char) (cArr4[53] ^ 1), (char) (cArr4[16] ^ 'E'), (char) (cArr4[0] ^ '>'), (char) (cArr4[81] ^ 'T'), (char) (cArr4[66] ^ 7), (char) (cArr4[47] ^ '\f'), (char) (cArr4[55] ^ '@'), (char) (cArr4[67] ^ 6), (char) (cArr4[71] ^ 28), (char) (cArr4[41] ^ 'H'), (char) (cArr4[65] ^ 'B'), (char) (cArr4[73] ^ 0), (char) (cArr4[37] ^ 4), (char) (cArr4[29] ^ 30), (char) (cArr4[29] ^ 30), (char) (cArr4[16] ^ 'I'), (char) (cArr4[87] ^ 1), (char) (cArr4[45] ^ 'G'), (char) (cArr4[60] ^ 'L'), (char) (cArr4[37] ^ 7), (char) (cArr4[63] ^ 6), (char) (cArr4[42] ^ 2), (char) (cArr4[51] ^ 2), (char) (cArr4[15] ^ 'D'), (char) (cArr4[42] ^ 21), (char) (cArr4[51] ^ 6), (char) (cArr4[81] ^ 'T'), (char) (cArr4[20] ^ 21), (char) (cArr4[0] ^ '4'), (char) (cArr4[31] ^ 6), (char) (cArr4[42] ^ 18), (char) (cArr4[28] ^ 28), (char) (cArr4[41] ^ 'D'), (char) (cArr4[51] ^ '\f'), (char) (cArr4[44] ^ 1), (char) (cArr4[42] ^ 21), (char) (cArr4[40] ^ 28), (char) (cArr4[2] ^ '\b'), (char) (cArr4[77] ^ 11), (char) (cArr4[59] ^ 24), (char) (cArr4[66] ^ '\b'), (char) (cArr4[5] ^ 11), (char) (cArr4[14] ^ 15)};
                    Log.w(intern2, new String(cArr4).intern(), e);
                    O = O();
                    P(context, str, r(this.b), this.c, O);
                }
                StringBuilder sb3 = new StringBuilder();
                char[] cArr5 = {(char) (cArr5[3] ^ '\b'), (char) (cArr5[2] ^ 14), (char) (cArr5[3] ^ 5), (char) (cArr5[6] ^ 11), (char) (cArr5[6] ^ 'O'), (char) (cArr5[8] ^ '\b'), (char) (cArr5[7] ^ 26), (char) (28550 ^ 28659), (char) (cArr5[6] ^ 1), (char) (cArr5[10] ^ 'D'), (char) (cArr5[8] ^ 'N')};
                sb3.append(new String(cArr5).intern());
                sb3.append(list.size());
                char[] cArr6 = {(char) (cArr6[8] ^ 'R'), (char) (cArr6[15] ^ 21), (char) (cArr6[17] ^ '\t'), (char) (cArr6[8] ^ 17), (char) (cArr6[15] ^ '\t'), (char) (cArr6[15] ^ '\b'), (char) (cArr6[8] ^ 22), (char) (cArr6[5] ^ 15), (char) (cArr6[15] ^ 20), (char) (cArr6[5] ^ 23), (char) (cArr6[0] ^ 0), (char) (cArr6[10] ^ 'D'), (char) (cArr6[15] ^ 3), (char) (cArr6[14] ^ 'X'), (char) (cArr6[8] ^ 'R'), (char) ((-12772) ^ (-12678)), (char) (cArr6[8] ^ 27), (char) (cArr6[5] ^ 2), (char) (cArr6[15] ^ 3), (char) (cArr6[8] ^ 1)};
                sb3.append(new String(cArr6).intern());
                Log.i(intern2, sb3.toString());
                return list;
            }
            if (z) {
                char[] cArr7 = {(char) (cArr7[16] ^ '('), (char) (cArr7[9] ^ 27), (char) (cArr7[7] ^ 23), (char) (cArr7[35] ^ 'M'), (char) (cArr7[14] ^ '\f'), (char) (cArr7[35] ^ 'J'), (char) (cArr7[12] ^ 'C'), (char) (cArr7[20] ^ 22), (char) (cArr7[21] ^ '\f'), (char) (cArr7[35] ^ 'Z'), (char) (cArr7[27] ^ 23), (char) (cArr7[6] ^ 'A'), (char) (cArr7[7] ^ 6), (char) (cArr7[26] ^ 4), (char) (cArr7[7] ^ '\f'), (char) (cArr7[12] ^ '\f'), (char) (cArr7[9] ^ 26), (char) (cArr7[26] ^ 'P'), (char) (cArr7[13] ^ 25), (char) (cArr7[27] ^ 16), (char) (cArr7[34] ^ 23), (char) (cArr7[13] ^ 0), (char) (cArr7[17] ^ 0), (char) (cArr7[27] ^ 7), (char) (cArr7[27] ^ 0), (char) (cArr7[26] ^ 'P'), (char) (cArr7[20] ^ 3), (char) (2857 ^ 2892), (char) (cArr7[9] ^ 6), (char) (cArr7[15] ^ '\t'), (char) (cArr7[8] ^ 23), (char) (cArr7[27] ^ 23), (char) (cArr7[19] ^ 24), (char) (cArr7[31] ^ 23), (char) (cArr7[27] ^ 1), (char) (cArr7[6] ^ 14)};
                Log.i(intern2, new String(cArr7).intern());
            } else {
                char[] cArr8 = {(char) (cArr8[38] ^ '6'), (char) (cArr8[27] ^ 22), (char) (cArr8[16] ^ 0), (char) (cArr8[38] ^ 23), (char) (cArr8[11] ^ 2), (char) (cArr8[27] ^ 7), (char) (cArr8[26] ^ 16), (char) (cArr8[9] ^ 16), (char) (cArr8[16] ^ 'T'), (char) (cArr8[5] ^ 0), (char) (28219 ^ 28243), (char) (cArr8[10] ^ '\t'), (char) (cArr8[37] ^ 27), (char) (cArr8[42] ^ 14), (char) (cArr8[27] ^ 22), (char) (cArr8[16] ^ '\f'), (char) (cArr8[14] ^ 17), (char) (cArr8[19] ^ 17), (char) (cArr8[23] ^ 15), (char) (cArr8[11] ^ 2), (char) (cArr8[32] ^ 'T'), (char) (cArr8[3] ^ '\f'), (char) (cArr8[14] ^ '\n'), (char) (cArr8[10] ^ 6), (char) (cArr8[5] ^ 'T'), (char) (cArr8[23] ^ 3), (char) (cArr8[28] ^ 1), (char) (cArr8[10] ^ 27), (char) (cArr8[27] ^ 7), (char) (cArr8[32] ^ 0), (char) (cArr8[19] ^ 1), (char) (cArr8[37] ^ '\n'), (char) (cArr8[5] ^ 'T'), (char) (cArr8[15] ^ '\b'), (char) (cArr8[9] ^ 17), (char) (cArr8[23] ^ 28), (char) (cArr8[35] ^ 20), (char) (cArr8[23] ^ 1), (char) (cArr8[14] ^ 23), (char) (cArr8[11] ^ '\f'), (char) (cArr8[37] ^ '\n'), (char) (cArr8[11] ^ 5), (char) (cArr8[16] ^ 'Z')};
                Log.i(intern2, new String(cArr8).intern());
            }
            O = O();
            P(context, str, r(this.b), this.c, O);
            list = O;
            StringBuilder sb32 = new StringBuilder();
            char[] cArr52 = {(char) (cArr52[3] ^ '\b'), (char) (cArr52[2] ^ 14), (char) (cArr52[3] ^ 5), (char) (cArr52[6] ^ 11), (char) (cArr52[6] ^ 'O'), (char) (cArr52[8] ^ '\b'), (char) (cArr52[7] ^ 26), (char) (28550 ^ 28659), (char) (cArr52[6] ^ 1), (char) (cArr52[10] ^ 'D'), (char) (cArr52[8] ^ 'N')};
            sb32.append(new String(cArr52).intern());
            sb32.append(list.size());
            char[] cArr62 = {(char) (cArr62[8] ^ 'R'), (char) (cArr62[15] ^ 21), (char) (cArr62[17] ^ '\t'), (char) (cArr62[8] ^ 17), (char) (cArr62[15] ^ '\t'), (char) (cArr62[15] ^ '\b'), (char) (cArr62[8] ^ 22), (char) (cArr62[5] ^ 15), (char) (cArr62[15] ^ 20), (char) (cArr62[5] ^ 23), (char) (cArr62[0] ^ 0), (char) (cArr62[10] ^ 'D'), (char) (cArr62[15] ^ 3), (char) (cArr62[14] ^ 'X'), (char) (cArr62[8] ^ 'R'), (char) ((-12772) ^ (-12678)), (char) (cArr62[8] ^ 27), (char) (cArr62[5] ^ 2), (char) (cArr62[15] ^ 3), (char) (cArr62[8] ^ 1)};
            sb32.append(new String(cArr62).intern());
            Log.i(intern2, sb32.toString());
            return list;
        }
        char[] cArr9 = {(char) (cArr9[16] ^ '?'), (char) (cArr9[27] ^ 17), (char) (cArr9[16] ^ 30), (char) (cArr9[25] ^ 7), (char) (cArr9[18] ^ 30), (char) (cArr9[23] ^ '('), (char) (cArr9[26] ^ 0), (char) (cArr9[19] ^ 25), (char) (cArr9[16] ^ '7'), (char) (cArr9[21] ^ 'X'), (char) (cArr9[26] ^ 17), (char) (cArr9[16] ^ 0), (char) (cArr9[19] ^ 0), (char) (cArr9[2] ^ 15), (char) (cArr9[16] ^ 6), (char) (cArr9[0] ^ '\"'), (char) (cArr9[27] ^ 22), (char) (cArr9[19] ^ 'A'), (char) (cArr9[21] ^ 'W'), (char) (cArr9[21] ^ 'A'), (char) (cArr9[8] ^ '6'), (char) (cArr9[16] ^ 'R'), (char) (cArr9[25] ^ 16), (char) (cArr9[8] ^ ')'), (char) (cArr9[15] ^ 0), (char) (cArr9[8] ^ '6'), (char) (cArr9[18] ^ 18), (char) ((-3275) ^ (-3247))};
        throw new IllegalStateException(new String(cArr9).intern());
    }

    public final List<b> M(Context context, String str) throws IOException {
        Log.i(new String(C((1215179178 - (-630128901)) + 29)).intern(), new String(x((488591169 - (-1319105858)) + 33)).intern());
        String str2 = this.b.getName() + new String(d((763661308 ^ 98257779) + 46)).intern();
        SharedPreferences m = m(context);
        int i = m.getInt(str + new String(I((723302886 ^ 510567623) - 98)).intern(), 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            b bVar = new b(this.d, str2 + i2 + new String(q((1860623040 - 413216537) + 22)).intern());
            if (bVar.isFile()) {
                bVar.b = w(bVar);
                long j = m.getLong(str + new String(h((445999527 ^ 509580426) + 3)).intern() + i2, -1L);
                long j2 = m.getLong(str + new String(s((54 - 471847011) ^ (-1362488283))).intern() + i2, -1L);
                long lastModified = bVar.lastModified();
                if (j2 == lastModified) {
                    String str3 = str2;
                    SharedPreferences sharedPreferences = m;
                    if (j == bVar.b) {
                        arrayList.add(bVar);
                        i2++;
                        m = sharedPreferences;
                        str2 = str3;
                    }
                }
                throw new IOException(new String(b((520147680 - (-372666467)) + 52)).intern() + bVar + new String(F((1987376349 - 211846742) + 73)).intern() + str + new String(v((1187979659 - 3140702) - 58)).intern() + j2 + new String(L((2001304077 - 1145397358) - 63)).intern() + lastModified + new String(a((1530055756 - 244648335) - 36)).intern() + j + new String(G((1263844698 ^ 178073140) + 46)).intern() + bVar.b);
            }
            throw new IOException(new String(w(((-86) - 1369425021) ^ (-1911190111))).intern() + bVar.getPath() + new String(i((779601438 - 404969761) - 92)).intern());
        }
        return arrayList;
    }

    public final List<b> O() throws IOException {
        boolean z;
        String intern = new String(j((1688854177 ^ 956060358) + 110)).intern();
        String intern2 = new String(u((1303736333 - 798371488) - 43)).intern();
        String intern3 = new String(y((518056157 - (-1431452657)) - 4)).intern();
        String intern4 = new String(J((1631505468 - 1158173613) - 46)).intern();
        String str = this.b.getName() + new String(g((1039694662 + 355945768) - 54)).intern();
        b();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.b);
        try {
            ZipEntry entry = zipFile.getEntry(intern3 + 2 + intern);
            int i = 2;
            while (entry != null) {
                b bVar = new b(this.d, str + i + new String(l((2121096284 ^ 1935830866) - 103)).intern());
                arrayList.add(bVar);
                Log.i(intern4, new String(p((1427985634 - 203196949) + 125)).intern() + bVar);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    k(zipFile, entry, bVar, str);
                    try {
                        bVar.b = w(bVar);
                        z = true;
                    } catch (IOException e) {
                        Log.w(intern4, new String(t((71330096 - (-1516256471)) + 48)).intern() + bVar.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(new String(D((229879849 ^ 253424250) + 21)).intern());
                    sb.append(z ? new String(B(((-88) - 1098181467) ^ (-1183066738))).intern() : new String(k((792826710 ^ 2143922963) + 70)).intern());
                    sb.append(new String(m((407285153 + 1168243929) - 84)).intern());
                    sb.append(bVar.getAbsolutePath());
                    sb.append(new String(A((1586755505 - 64935992) - 56)).intern());
                    sb.append(bVar.length());
                    sb.append(new String(E((111 - 461107787) ^ (-1887095698))).intern());
                    sb.append(bVar.b);
                    Log.i(intern4, sb.toString());
                    if (!z) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w(intern4, new String(H((927440391 ^ 1818241656) + 73)).intern() + bVar.getPath() + new String(o((2036902037 ^ 260552961) + 33)).intern());
                        }
                    }
                    z2 = z;
                    i2 = i3;
                }
                if (z2) {
                    i++;
                    entry = zipFile.getEntry(intern3 + i + intern);
                } else {
                    throw new IOException(new String(c((3428898 - (-307678033)) - 122)).intern() + bVar.getAbsolutePath() + new String(K(((-123) - 2083938958) ^ (-748185770))).intern() + i + new String(z(679796958 + 696089293 + 1)).intern());
                }
            }
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w(intern4, intern2, e2);
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w(intern4, intern2, e3);
            }
            throw th;
        }
    }

    public final void b() {
        File[] listFiles = this.d.listFiles(new a(this));
        char[] cArr = {(char) (5056 ^ 5005), (char) (cArr[0] ^ '8'), (char) (cArr[1] ^ 25), (char) (cArr[0] ^ '9'), (char) (cArr[3] ^ 29), (char) (cArr[0] ^ '\t'), (char) (cArr[3] ^ 17), (char) (cArr[5] ^ '<')};
        String intern = new String(cArr).intern();
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder();
            char[] cArr2 = {(char) (cArr2[35] ^ '('), (char) (cArr2[20] ^ 5), (char) (cArr2[4] ^ '\f'), (char) (cArr2[17] ^ 15), (char) (cArr2[35] ^ 11), (char) (cArr2[12] ^ 23), (char) (cArr2[9] ^ 0), (char) (cArr2[32] ^ 'T'), (char) (cArr2[29] ^ 11), (char) (cArr2[22] ^ 'R'), (char) (cArr2[39] ^ 24), (char) (cArr2[3] ^ 5), (char) (cArr2[40] ^ 'S'), (char) (cArr2[2] ^ 29), (char) (cArr2[36] ^ 'T'), (char) (cArr2[33] ^ 16), (char) (cArr2[12] ^ 22), (char) (cArr2[40] ^ 'C'), (char) (cArr2[9] ^ 'O'), (char) (cArr2[36] ^ 26), (char) (cArr2[22] ^ 22), (char) (cArr2[8] ^ 14), (char) (cArr2[12] ^ 1), (char) (cArr2[4] ^ 28), (char) (cArr2[1] ^ 'A'), (char) (cArr2[21] ^ 5), (char) (cArr2[22] ^ 23), (char) (cArr2[28] ^ 'X'), (char) (cArr2[22] ^ 'R'), (char) (cArr2[40] ^ 'D'), (char) (cArr2[0] ^ '/'), (char) (cArr2[37] ^ 23), (char) (cArr2[22] ^ 'R'), (char) (cArr2[17] ^ 0), (char) (cArr2[35] ^ 1), (char) (cArr2[29] ^ '\n'), (char) (cArr2[12] ^ 7), (char) (cArr2[29] ^ 1), (char) (cArr2[8] ^ 1), (char) (cArr2[29] ^ 16), (char) (31339 ^ 31307), (char) (cArr2[31] ^ 'Z')};
            sb.append(new String(cArr2).intern());
            sb.append(this.d.getPath());
            char[] cArr3 = {(char) (cArr3[1] ^ 7), (char) ((-20849) ^ (-20831))};
            sb.append(new String(cArr3).intern());
            Log.w(intern, sb.toString());
            return;
        }
        for (File file : listFiles) {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr4 = {(char) (cArr4[2] ^ '-'), (char) (cArr4[15] ^ 23), (char) (cArr4[6] ^ 'Y'), (char) (cArr4[20] ^ 'I'), (char) (cArr4[12] ^ 2), (char) (cArr4[3] ^ 14), (char) (23488 ^ 23520), (char) (cArr4[12] ^ 24), (char) (cArr4[12] ^ 3), (char) (cArr4[20] ^ 0), (char) (cArr4[2] ^ 29), (char) (cArr4[8] ^ '\n'), (char) (cArr4[2] ^ 21), (char) (cArr4[7] ^ 17), (char) (cArr4[10] ^ 16), (char) (cArr4[21] ^ 3), (char) (cArr4[1] ^ 'R'), (char) (cArr4[23] ^ 3), (char) (cArr4[25] ^ 'L'), (char) (cArr4[10] ^ 0), (char) (cArr4[6] ^ 0), (char) (cArr4[0] ^ '2'), (char) (cArr4[17] ^ 6), (char) (cArr4[6] ^ 'L'), (char) (cArr4[2] ^ 28), (char) (cArr4[12] ^ 'L')};
            sb2.append(new String(cArr4).intern());
            sb2.append(file.getPath());
            char[] cArr5 = {(char) (cArr5[6] ^ 'Z'), (char) (cArr5[8] ^ 'O'), (char) (cArr5[6] ^ 28), (char) (cArr5[5] ^ 'I'), (char) (cArr5[5] ^ 26), (char) (cArr5[6] ^ 19), (char) (cArr5[8] ^ 'Z'), (char) (cArr5[1] ^ '\n'), (char) ((-19399) ^ (-19431))};
            sb2.append(new String(cArr5).intern());
            sb2.append(file.length());
            Log.i(intern, sb2.toString());
            if (!file.delete()) {
                StringBuilder sb3 = new StringBuilder();
                char[] cArr6 = {(char) (25446 ^ 25376), (char) (cArr6[23] ^ '\r'), (char) (cArr6[5] ^ '\r'), (char) (cArr6[5] ^ '\b'), (char) (cArr6[0] ^ '#'), (char) (cArr6[15] ^ 1), (char) (cArr6[18] ^ 'L'), (char) (cArr6[19] ^ 16), (char) (cArr6[23] ^ 3), (char) (cArr6[11] ^ 'E'), (char) (cArr6[20] ^ 'D'), (char) (cArr6[0] ^ '#'), (char) (cArr6[22] ^ 5), (char) (cArr6[8] ^ '\n'), (char) (cArr6[20] ^ 'T'), (char) (cArr6[0] ^ '#'), (char) (cArr6[17] ^ 'O'), (char) (cArr6[6] ^ 'O'), (char) (cArr6[23] ^ 0), (char) (cArr6[0] ^ '\"'), (char) (cArr6[15] ^ 'E'), (char) (cArr6[15] ^ 3), (char) (cArr6[1] ^ '\b'), (char) (cArr6[15] ^ '\t'), (char) (cArr6[7] ^ 17), (char) (cArr6[10] ^ 'D')};
                sb3.append(new String(cArr6).intern());
                sb3.append(file.getPath());
                Log.w(intern, sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder();
                char[] cArr7 = {(char) (cArr7[10] ^ ' '), (char) (cArr7[11] ^ 'E'), (char) (cArr7[8] ^ 3), (char) (cArr7[4] ^ 17), (char) (cArr7[10] ^ 16), (char) (cArr7[1] ^ 0), (char) (cArr7[8] ^ 11), (char) (cArr7[10] ^ 'D'), (char) (cArr7[13] ^ 6), (char) (cArr7[8] ^ 3), (char) (cArr7[8] ^ 11), (char) (cArr7[4] ^ 'T'), (char) (cArr7[14] ^ '\n'), (char) ((-20833) ^ (-20746)), (char) (cArr7[8] ^ 3), (char) (cArr7[1] ^ 0), (char) (cArr7[9] ^ 'L')};
                sb4.append(new String(cArr7).intern());
                sb4.append(file.getPath());
                Log.i(intern, sb4.toString());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.g.release();
        this.f.close();
        this.e.close();
    }
}
