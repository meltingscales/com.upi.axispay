package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.gms.vision.barcode.Barcode;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ld  reason: default package */
/* loaded from: classes.dex */
public class ld {
    public static final c[] A;
    public static final c[] B;
    public static final c C;
    public static final c[] D;
    public static final c[] E;
    public static final c[] F;
    public static final c[] G;
    public static final c[][] H;
    public static final c[] I;
    public static final HashMap<Integer, c>[] J;
    public static final HashMap<String, c>[] K;
    public static final HashSet<String> L;
    public static final HashMap<Integer, Integer> M;
    public static final Charset N;
    public static final byte[] O;
    public static SimpleDateFormat t;
    public static final c[] x;
    public static final c[] y;
    public static final c[] z;
    public final String a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap<String, b>[] d;
    public Set<Integer> e;
    public ByteOrder f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public static final List<Integer> m = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> n = Arrays.asList(2, 7, 4, 5);
    public static final int[] o = {8, 8, 8};
    public static final int[] p = {8};
    public static final byte[] q = {-1, -40, -1};
    public static final byte[] r = {79, 76, 89, 77, 80, 0};
    public static final byte[] s = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final String[] u = {C0059ao.a(11522), C0059ao.a(11523), C0059ao.a(11524), C0059ao.a(11525), C0059ao.a(11526), C0059ao.a(11527), C0059ao.a(11528), C0059ao.a(11529), C0059ao.a(11530), C0059ao.a(11531), C0059ao.a(11532), C0059ao.a(11533), C0059ao.a(11534)};
    public static final int[] v = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] w = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: AxisPay */
    /* renamed from: ld$b */
    /* loaded from: classes.dex */
    public static class b {
        public final int a;
        public final int b;
        public final byte[] c;

        public b(int i, int i2, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
        }

        public static b a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(ld.N);
            return new b(2, bytes.length, bytes);
        }

        public static b b(long j, ByteOrder byteOrder) {
            return c(new long[]{j}, byteOrder);
        }

        public static b c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ld.v[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new b(4, jArr.length, wrap.array());
        }

        public static b d(d dVar, ByteOrder byteOrder) {
            return e(new d[]{dVar}, byteOrder);
        }

        public static b e(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ld.v[5] * dVarArr.length]);
            wrap.order(byteOrder);
            for (d dVar : dVarArr) {
                wrap.putInt((int) dVar.a);
                wrap.putInt((int) dVar.b);
            }
            return new b(5, dVarArr.length, wrap.array());
        }

        public static b f(int i, ByteOrder byteOrder) {
            return g(new int[]{i}, byteOrder);
        }

        public static b g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ld.v[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new b(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k != null) {
                if (k instanceof String) {
                    return Double.parseDouble((String) k);
                }
                boolean z = k instanceof long[];
                String a = C0059ao.a(1221);
                if (z) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException(a);
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException(a);
                } else if (k instanceof double[]) {
                    double[] dArr = (double[]) k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException(a);
                } else if (k instanceof d[]) {
                    d[] dVarArr = (d[]) k;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].a();
                    }
                    throw new NumberFormatException(a);
                } else {
                    throw new NumberFormatException(C0059ao.a(1222));
                }
            }
            throw new NumberFormatException(C0059ao.a(1223));
        }

        public int i(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k != null) {
                if (k instanceof String) {
                    return Integer.parseInt((String) k);
                }
                boolean z = k instanceof long[];
                String a = C0059ao.a(1224);
                if (z) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException(a);
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException(a);
                } else {
                    throw new NumberFormatException(C0059ao.a(1225));
                }
            }
            throw new NumberFormatException(C0059ao.a(1226));
        }

        public String j(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            boolean z = k instanceof long[];
            String a = C0059ao.a(1227);
            int i = 0;
            if (z) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(a);
                    }
                }
                return sb.toString();
            } else if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(a);
                    }
                }
                return sb.toString();
            } else if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(a);
                    }
                }
                return sb.toString();
            } else if (k instanceof d[]) {
                d[] dVarArr = (d[]) k;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].a);
                    sb.append('/');
                    sb.append(dVarArr[i].b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(a);
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 4, insn: 0x01af: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:152:0x01af */
        /* JADX WARN: Removed duplicated region for block: B:163:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object k(java.nio.ByteOrder r12) {
            /*
                Method dump skipped, instructions count: 472
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.b.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return C0059ao.a(1231) + ld.u[this.a] + C0059ao.a(1232) + this.c.length + C0059ao.a(1233);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ld$d */
    /* loaded from: classes.dex */
    public static class d {
        public final long a;
        public final long b;

        public d(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = j;
            this.b = j2;
        }

        public double a() {
            return this.a / this.b;
        }

        public String toString() {
            return this.a + C0059ao.a(1195) + this.b;
        }
    }

    static {
        c[] cVarArr;
        c[] cVarArr2 = {new c(C0059ao.a(11535), 254, 4), new c(C0059ao.a(11536), 255, 4), new c(C0059ao.a(11537), Barcode.QR_CODE, 3, 4), new c(C0059ao.a(11538), 257, 3, 4), new c(C0059ao.a(11539), 258, 3), new c(C0059ao.a(11540), 259, 3), new c(C0059ao.a(11541), 262, 3), new c(C0059ao.a(11542), 270, 2), new c(C0059ao.a(11543), 271, 2), new c(C0059ao.a(11544), 272, 2), new c(C0059ao.a(11545), 273, 3, 4), new c(C0059ao.a(11546), 274, 3), new c(C0059ao.a(11547), 277, 3), new c(C0059ao.a(11548), 278, 3, 4), new c(C0059ao.a(11549), 279, 3, 4), new c(C0059ao.a(11550), 282, 5), new c(C0059ao.a(11551), 283, 5), new c(C0059ao.a(11552), 284, 3), new c(C0059ao.a(11553), 296, 3), new c(C0059ao.a(11554), 301, 3), new c(C0059ao.a(11555), 305, 2), new c(C0059ao.a(11556), 306, 2), new c(C0059ao.a(11557), 315, 2), new c(C0059ao.a(11558), 318, 5), new c(C0059ao.a(11559), 319, 5), new c(C0059ao.a(11560), 330, 4), new c(C0059ao.a(11561), 513, 4), new c(C0059ao.a(11562), 514, 4), new c(C0059ao.a(11563), 529, 5), new c(C0059ao.a(11564), 530, 3), new c(C0059ao.a(11565), 531, 3), new c(C0059ao.a(11566), 532, 5), new c(C0059ao.a(11567), 33432, 2), new c(C0059ao.a(11568), 34665, 4), new c(C0059ao.a(11569), 34853, 4), new c(C0059ao.a(11570), 4, 4), new c(C0059ao.a(11571), 5, 4), new c(C0059ao.a(11572), 6, 4), new c(C0059ao.a(11573), 7, 4), new c(C0059ao.a(11574), 23, 3), new c(C0059ao.a(11575), 46, 7)};
        x = cVarArr2;
        c[] cVarArr3 = {new c(C0059ao.a(11576), 33434, 5), new c(C0059ao.a(11577), 33437, 5), new c(C0059ao.a(11578), 34850, 3), new c(C0059ao.a(11579), 34852, 2), new c(C0059ao.a(11580), 34855, 3), new c(C0059ao.a(11581), 34856, 7), new c(C0059ao.a(11582), 36864, 2), new c(C0059ao.a(11583), 36867, 2), new c(C0059ao.a(11584), 36868, 2), new c(C0059ao.a(11585), 37121, 7), new c(C0059ao.a(11586), 37122, 5), new c(C0059ao.a(11587), 37377, 10), new c(C0059ao.a(11588), 37378, 5), new c(C0059ao.a(11589), 37379, 10), new c(C0059ao.a(11590), 37380, 10), new c(C0059ao.a(11591), 37381, 5), new c(C0059ao.a(11592), 37382, 5), new c(C0059ao.a(11593), 37383, 3), new c(C0059ao.a(11594), 37384, 3), new c(C0059ao.a(11595), 37385, 3), new c(C0059ao.a(11596), 37386, 5), new c(C0059ao.a(11597), 37396, 3), new c(C0059ao.a(11598), 37500, 7), new c(C0059ao.a(11599), 37510, 7), new c(C0059ao.a(11600), 37520, 2), new c(C0059ao.a(11601), 37521, 2), new c(C0059ao.a(11602), 37522, 2), new c(C0059ao.a(11603), 40960, 7), new c(C0059ao.a(11604), 40961, 3), new c(C0059ao.a(11605), 40962, 3, 4), new c(C0059ao.a(11606), 40963, 3, 4), new c(C0059ao.a(11607), 40964, 2), new c(C0059ao.a(11608), 40965, 4), new c(C0059ao.a(11609), 41483, 5), new c(C0059ao.a(11610), 41484, 7), new c(C0059ao.a(11611), 41486, 5), new c(C0059ao.a(11612), 41487, 5), new c(C0059ao.a(11613), 41488, 3), new c(C0059ao.a(11614), 41492, 3), new c(C0059ao.a(11615), 41493, 5), new c(C0059ao.a(11616), 41495, 3), new c(C0059ao.a(11617), 41728, 7), new c(C0059ao.a(11618), 41729, 7), new c(C0059ao.a(11619), 41730, 7), new c(C0059ao.a(11620), 41985, 3), new c(C0059ao.a(11621), 41986, 3), new c(C0059ao.a(11622), 41987, 3), new c(C0059ao.a(11623), 41988, 5), new c(C0059ao.a(11624), 41989, 3), new c(C0059ao.a(11625), 41990, 3), new c(C0059ao.a(11626), 41991, 3), new c(C0059ao.a(11627), 41992, 3), new c(C0059ao.a(11628), 41993, 3), new c(C0059ao.a(11629), 41994, 3), new c(C0059ao.a(11630), 41995, 7), new c(C0059ao.a(11631), 41996, 3), new c(C0059ao.a(11632), 42016, 2), new c(C0059ao.a(11633), 50706, 1), new c(C0059ao.a(11634), 50720, 3, 4)};
        y = cVarArr3;
        c[] cVarArr4 = {new c(C0059ao.a(11635), 0, 1), new c(C0059ao.a(11636), 1, 2), new c(C0059ao.a(11637), 2, 5), new c(C0059ao.a(11638), 3, 2), new c(C0059ao.a(11639), 4, 5), new c(C0059ao.a(11640), 5, 1), new c(C0059ao.a(11641), 6, 5), new c(C0059ao.a(11642), 7, 5), new c(C0059ao.a(11643), 8, 2), new c(C0059ao.a(11644), 9, 2), new c(C0059ao.a(11645), 10, 2), new c(C0059ao.a(11646), 11, 5), new c(C0059ao.a(11647), 12, 2), new c(C0059ao.a(11648), 13, 5), new c(C0059ao.a(11649), 14, 2), new c(C0059ao.a(11650), 15, 5), new c(C0059ao.a(11651), 16, 2), new c(C0059ao.a(11652), 17, 5), new c(C0059ao.a(11653), 18, 2), new c(C0059ao.a(11654), 19, 2), new c(C0059ao.a(11655), 20, 5), new c(C0059ao.a(11656), 21, 2), new c(C0059ao.a(11657), 22, 5), new c(C0059ao.a(11658), 23, 2), new c(C0059ao.a(11659), 24, 5), new c(C0059ao.a(11660), 25, 2), new c(C0059ao.a(11661), 26, 5), new c(C0059ao.a(11662), 27, 7), new c(C0059ao.a(11663), 28, 7), new c(C0059ao.a(11664), 29, 2), new c(C0059ao.a(11665), 30, 3)};
        z = cVarArr4;
        c[] cVarArr5 = {new c(C0059ao.a(11666), 1, 2)};
        A = cVarArr5;
        c[] cVarArr6 = {new c(C0059ao.a(11667), 254, 4), new c(C0059ao.a(11668), 255, 4), new c(C0059ao.a(11669), Barcode.QR_CODE, 3, 4), new c(C0059ao.a(11670), 257, 3, 4), new c(C0059ao.a(11671), 258, 3), new c(C0059ao.a(11672), 259, 3), new c(C0059ao.a(11673), 262, 3), new c(C0059ao.a(11674), 270, 2), new c(C0059ao.a(11675), 271, 2), new c(C0059ao.a(11676), 272, 2), new c(C0059ao.a(11677), 273, 3, 4), new c(C0059ao.a(11678), 274, 3), new c(C0059ao.a(11679), 277, 3), new c(C0059ao.a(11680), 278, 3, 4), new c(C0059ao.a(11681), 279, 3, 4), new c(C0059ao.a(11682), 282, 5), new c(C0059ao.a(11683), 283, 5), new c(C0059ao.a(11684), 284, 3), new c(C0059ao.a(11685), 296, 3), new c(C0059ao.a(11686), 301, 3), new c(C0059ao.a(11687), 305, 2), new c(C0059ao.a(11688), 306, 2), new c(C0059ao.a(11689), 315, 2), new c(C0059ao.a(11690), 318, 5), new c(C0059ao.a(11691), 319, 5), new c(C0059ao.a(11692), 330, 4), new c(C0059ao.a(11693), 513, 4), new c(C0059ao.a(11694), 514, 4), new c(C0059ao.a(11695), 529, 5), new c(C0059ao.a(11696), 530, 3), new c(C0059ao.a(11697), 531, 3), new c(C0059ao.a(11698), 532, 5), new c(C0059ao.a(11699), 33432, 2), new c(C0059ao.a(11700), 34665, 4), new c(C0059ao.a(11701), 34853, 4), new c(C0059ao.a(11702), 50706, 1), new c(C0059ao.a(11703), 50720, 3, 4)};
        B = cVarArr6;
        C = new c(C0059ao.a(11704), 273, 3);
        c[] cVarArr7 = {new c(C0059ao.a(11705), Barcode.QR_CODE, 7), new c(C0059ao.a(11706), 8224, 4), new c(C0059ao.a(11707), 8256, 4)};
        D = cVarArr7;
        c[] cVarArr8 = {new c(C0059ao.a(11708), 257, 4), new c(C0059ao.a(11709), 258, 4)};
        E = cVarArr8;
        c[] cVarArr9 = {new c(C0059ao.a(11710), 4371, 3)};
        F = cVarArr9;
        c[] cVarArr10 = {new c(C0059ao.a(11711), 55, 3)};
        G = cVarArr10;
        c[][] cVarArr11 = {cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr6, cVarArr2, cVarArr7, cVarArr8, cVarArr9, cVarArr10};
        H = cVarArr11;
        I = new c[]{new c(C0059ao.a(11712), 330, 4), new c(C0059ao.a(11713), 34665, 4), new c(C0059ao.a(11714), 34853, 4), new c(C0059ao.a(11715), 40965, 4), new c(C0059ao.a(11716), 8224, 1), new c(C0059ao.a(11717), 8256, 1)};
        J = new HashMap[cVarArr11.length];
        K = new HashMap[cVarArr11.length];
        L = new HashSet<>(Arrays.asList(C0059ao.a(11718), C0059ao.a(11719), C0059ao.a(11720), C0059ao.a(11721), C0059ao.a(11722)));
        M = new HashMap<>();
        Charset forName = Charset.forName(C0059ao.a(11723));
        N = forName;
        O = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0059ao.a(11724));
        t = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(C0059ao.a(11725)));
        int i = 0;
        while (true) {
            c[][] cVarArr12 = H;
            if (i < cVarArr12.length) {
                J[i] = new HashMap<>();
                K[i] = new HashMap<>();
                for (c cVar : cVarArr12[i]) {
                    J[i].put(Integer.valueOf(cVar.a), cVar);
                    K[i].put(cVar.b, cVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = M;
                c[] cVarArr13 = I;
                hashMap.put(Integer.valueOf(cVarArr13[0].a), 5);
                hashMap.put(Integer.valueOf(cVarArr13[1].a), 1);
                hashMap.put(Integer.valueOf(cVarArr13[2].a), 2);
                hashMap.put(Integer.valueOf(cVarArr13[3].a), 3);
                hashMap.put(Integer.valueOf(cVarArr13[4].a), 7);
                hashMap.put(Integer.valueOf(cVarArr13[5].a), 8);
                Pattern.compile(C0059ao.a(11726));
                Pattern.compile(C0059ao.a(11727));
                return;
            }
        }
    }

    public ld(String str) throws IOException {
        FileInputStream fileInputStream;
        c[][] cVarArr = H;
        this.d = new HashMap[cVarArr.length];
        this.e = new HashSet(cVarArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.b = null;
            this.a = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                u(fileInputStream);
                b(fileInputStream);
                return;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                b(fileInputStream2);
                throw th;
            }
        }
        throw new IllegalArgumentException(C0059ao.a(11728));
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] c(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public static boolean o(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = q;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public final void A(a aVar) throws IOException {
        HashMap<String, b> hashMap = this.d[4];
        b bVar = hashMap.get(C0059ao.a(11729));
        if (bVar != null) {
            int i = bVar.i(this.f);
            this.g = i;
            if (i != 1) {
                if (i == 6) {
                    m(aVar, hashMap);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            if (s(hashMap)) {
                n(aVar, hashMap);
                return;
            }
            return;
        }
        this.g = 6;
        m(aVar, hashMap);
    }

    public final void B(int i, int i2) throws IOException {
        if (this.d[i].isEmpty() || this.d[i2].isEmpty()) {
            return;
        }
        HashMap<String, b> hashMap = this.d[i];
        String a2 = C0059ao.a(11730);
        b bVar = hashMap.get(a2);
        HashMap<String, b> hashMap2 = this.d[i];
        String a3 = C0059ao.a(11731);
        b bVar2 = hashMap2.get(a3);
        b bVar3 = this.d[i2].get(a2);
        b bVar4 = this.d[i2].get(a3);
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int i3 = bVar.i(this.f);
        int i4 = bVar2.i(this.f);
        int i5 = bVar3.i(this.f);
        int i6 = bVar4.i(this.f);
        if (i3 >= i5 || i4 >= i6) {
            return;
        }
        HashMap<String, b>[] hashMapArr = this.d;
        HashMap<String, b> hashMap3 = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap3;
    }

    public final void C(a aVar, int i) throws IOException {
        b f;
        b f2;
        b bVar = this.d[i].get(C0059ao.a(11732));
        b bVar2 = this.d[i].get(C0059ao.a(11733));
        b bVar3 = this.d[i].get(C0059ao.a(11734));
        b bVar4 = this.d[i].get(C0059ao.a(11735));
        b bVar5 = this.d[i].get(C0059ao.a(11736));
        String a2 = C0059ao.a(11737);
        String a3 = C0059ao.a(11738);
        if (bVar == null) {
            if (bVar2 != null && bVar3 != null && bVar4 != null && bVar5 != null) {
                int i2 = bVar2.i(this.f);
                int i3 = bVar4.i(this.f);
                int i4 = bVar5.i(this.f);
                int i5 = bVar3.i(this.f);
                if (i3 <= i2 || i4 <= i5) {
                    return;
                }
                b f3 = b.f(i3 - i2, this.f);
                b f4 = b.f(i4 - i5, this.f);
                this.d[i].put(a2, f3);
                this.d[i].put(a3, f4);
                return;
            }
            z(aVar, i);
            return;
        }
        int i6 = bVar.a;
        String a4 = C0059ao.a(11739);
        String a5 = C0059ao.a(11740);
        if (i6 == 5) {
            d[] dVarArr = (d[]) bVar.k(this.f);
            if (dVarArr != null && dVarArr.length == 2) {
                f = b.d(dVarArr[0], this.f);
                f2 = b.d(dVarArr[1], this.f);
            } else {
                Log.w(a5, a4 + Arrays.toString(dVarArr));
                return;
            }
        } else {
            int[] iArr = (int[]) bVar.k(this.f);
            if (iArr != null && iArr.length == 2) {
                f = b.f(iArr[0], this.f);
                f2 = b.f(iArr[1], this.f);
            } else {
                Log.w(a5, a4 + Arrays.toString(iArr));
                return;
            }
        }
        this.d[i].put(a3, f);
        this.d[i].put(a2, f2);
    }

    public final void D(InputStream inputStream) throws IOException {
        B(0, 5);
        B(0, 4);
        B(5, 4);
        b bVar = this.d[1].get(C0059ao.a(11741));
        b bVar2 = this.d[1].get(C0059ao.a(11742));
        if (bVar != null && bVar2 != null) {
            this.d[0].put(C0059ao.a(11743), bVar);
            this.d[0].put(C0059ao.a(11744), bVar2);
        }
        if (this.d[4].isEmpty() && t(this.d[5])) {
            HashMap<String, b>[] hashMapArr = this.d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        t(this.d[4]);
    }

    public final void a() {
        String d2 = d(C0059ao.a(11745));
        if (d2 != null) {
            String a2 = C0059ao.a(11746);
            if (d(a2) == null) {
                this.d[0].put(a2, b.a(d2));
            }
        }
        String a3 = C0059ao.a(11747);
        if (d(a3) == null) {
            this.d[0].put(a3, b.b(0L, this.f));
        }
        String a4 = C0059ao.a(11748);
        if (d(a4) == null) {
            this.d[0].put(a4, b.b(0L, this.f));
        }
        String a5 = C0059ao.a(11749);
        if (d(a5) == null) {
            this.d[0].put(a5, b.b(0L, this.f));
        }
        String a6 = C0059ao.a(11750);
        if (d(a6) == null) {
            this.d[1].put(a6, b.b(0L, this.f));
        }
    }

    public String d(String str) {
        b f = f(str);
        if (f != null) {
            if (!L.contains(str)) {
                return f.j(this.f);
            }
            if (str.equals(C0059ao.a(11751))) {
                int i = f.a;
                String a2 = C0059ao.a(11752);
                if (i != 5 && i != 10) {
                    Log.w(a2, C0059ao.a(11753) + f.a);
                    return null;
                }
                d[] dVarArr = (d[]) f.k(this.f);
                if (dVarArr != null && dVarArr.length == 3) {
                    return String.format(C0059ao.a(11754), Integer.valueOf((int) (((float) dVarArr[0].a) / ((float) dVarArr[0].b))), Integer.valueOf((int) (((float) dVarArr[1].a) / ((float) dVarArr[1].b))), Integer.valueOf((int) (((float) dVarArr[2].a) / ((float) dVarArr[2].b))));
                }
                Log.w(a2, C0059ao.a(11755) + Arrays.toString(dVarArr));
                return null;
            }
            try {
                return Double.toString(f.h(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int e(String str, int i) {
        b f = f(str);
        if (f == null) {
            return i;
        }
        try {
            return f.i(this.f);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final b f(String str) {
        if (C0059ao.a(11756).equals(str)) {
            str = C0059ao.a(11757);
        }
        for (int i = 0; i < H.length; i++) {
            b bVar = this.d[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x013d, code lost:
        r10.m(r9.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.ld.a r10, int r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.g(ld$a, int, int):void");
    }

    public final int h(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (o(bArr)) {
            return 4;
        }
        if (q(bArr)) {
            return 9;
        }
        if (p(bArr)) {
            return 7;
        }
        return r(bArr) ? 10 : 0;
    }

    public final void i(a aVar) throws IOException {
        k(aVar);
        b bVar = this.d[1].get(C0059ao.a(11767));
        if (bVar != null) {
            a aVar2 = new a(bVar.c);
            aVar2.m(this.f);
            byte[] bArr = r;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.k(0L);
            byte[] bArr3 = s;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.k(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.k(12L);
            }
            y(aVar2, 6);
            b bVar2 = this.d[7].get(C0059ao.a(11768));
            b bVar3 = this.d[7].get(C0059ao.a(11769));
            if (bVar2 != null && bVar3 != null) {
                this.d[5].put(C0059ao.a(11770), bVar2);
                this.d[5].put(C0059ao.a(11771), bVar3);
            }
            b bVar4 = this.d[8].get(C0059ao.a(11772));
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.k(this.f);
                if (iArr != null && iArr.length == 4) {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    b f = b.f(i, this.f);
                    b f2 = b.f(i2, this.f);
                    this.d[0].put(C0059ao.a(11773), f);
                    this.d[0].put(C0059ao.a(11774), f2);
                    return;
                }
                Log.w(C0059ao.a(11776), C0059ao.a(11775) + Arrays.toString(iArr));
            }
        }
    }

    public final void j(a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        g(aVar, i, 5);
        aVar.k(i2);
        aVar.m(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == C.a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b f = b.f(readShort, this.f);
                b f2 = b.f(readShort2, this.f);
                this.d[0].put(C0059ao.a(11777), f);
                this.d[0].put(C0059ao.a(11778), f2);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void k(a aVar) throws IOException {
        b bVar;
        v(aVar, aVar.available());
        y(aVar, 0);
        C(aVar, 0);
        C(aVar, 5);
        C(aVar, 4);
        D(aVar);
        if (this.c != 8 || (bVar = this.d[1].get(C0059ao.a(11779))) == null) {
            return;
        }
        a aVar2 = new a(bVar.c);
        aVar2.m(this.f);
        aVar2.k(6L);
        y(aVar2, 9);
        HashMap<String, b> hashMap = this.d[9];
        String a2 = C0059ao.a(11780);
        b bVar2 = hashMap.get(a2);
        if (bVar2 != null) {
            this.d[1].put(a2, bVar2);
        }
    }

    public final void l(a aVar) throws IOException {
        k(aVar);
        if (this.d[0].get(C0059ao.a(11781)) != null) {
            g(aVar, this.l, 5);
        }
        b bVar = this.d[0].get(C0059ao.a(11782));
        HashMap<String, b> hashMap = this.d[1];
        String a2 = C0059ao.a(11783);
        b bVar2 = hashMap.get(a2);
        if (bVar == null || bVar2 != null) {
            return;
        }
        this.d[1].put(a2, bVar);
    }

    public final void m(a aVar, HashMap hashMap) throws IOException {
        int i;
        b bVar = (b) hashMap.get(C0059ao.a(11784));
        b bVar2 = (b) hashMap.get(C0059ao.a(11785));
        if (bVar == null || bVar2 == null) {
            return;
        }
        int i2 = bVar.i(this.f);
        int min = Math.min(bVar2.i(this.f), aVar.available() - i2);
        int i3 = this.c;
        if (i3 == 4 || i3 == 9 || i3 == 10) {
            i = this.h;
        } else {
            if (i3 == 7) {
                i = this.i;
            }
            if (i2 > 0 || min <= 0 || this.a != null || this.b != null) {
                return;
            }
            aVar.k(i2);
            aVar.readFully(new byte[min]);
            return;
        }
        i2 += i;
        if (i2 > 0) {
        }
    }

    public final void n(a aVar, HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get(C0059ao.a(11786));
        b bVar2 = (b) hashMap.get(C0059ao.a(11787));
        if (bVar == null || bVar2 == null) {
            return;
        }
        long[] c2 = c(bVar.k(this.f));
        long[] c3 = c(bVar2.k(this.f));
        String a2 = C0059ao.a(11788);
        if (c2 == null) {
            Log.w(a2, C0059ao.a(11789));
        } else if (c3 == null) {
            Log.w(a2, C0059ao.a(11790));
        } else {
            long j = 0;
            for (long j2 : c3) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < c2.length; i3++) {
                int i4 = (int) c3[i3];
                int i5 = ((int) c2[i3]) - i;
                aVar.k(i5);
                int i6 = i + i5;
                byte[] bArr2 = new byte[i4];
                aVar.read(bArr2);
                i = i6 + i4;
                System.arraycopy(bArr2, 0, bArr, i2, i4);
                i2 += i4;
            }
        }
    }

    public final boolean p(byte[] bArr) throws IOException {
        a aVar = new a(bArr);
        ByteOrder w2 = w(aVar);
        this.f = w2;
        aVar.m(w2);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    public final boolean q(byte[] bArr) throws IOException {
        byte[] bytes = C0059ao.a(11791).getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(byte[] bArr) throws IOException {
        a aVar = new a(bArr);
        ByteOrder w2 = w(aVar);
        this.f = w2;
        aVar.m(w2);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    public final boolean s(HashMap hashMap) throws IOException {
        b bVar;
        b bVar2 = (b) hashMap.get(C0059ao.a(11792));
        if (bVar2 != null) {
            int[] iArr = (int[]) bVar2.k(this.f);
            int[] iArr2 = o;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.c != 3 || (bVar = (b) hashMap.get(C0059ao.a(11793))) == null) {
                return false;
            }
            int i = bVar.i(this.f);
            return (i == 1 && Arrays.equals(iArr, p)) || (i == 6 && Arrays.equals(iArr, iArr2));
        }
        return false;
    }

    public final boolean t(HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get(C0059ao.a(11794));
        b bVar2 = (b) hashMap.get(C0059ao.a(11795));
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.i(this.f) <= 512 && bVar2.i(this.f) <= 512;
    }

    public final void u(InputStream inputStream) throws IOException {
        for (int i = 0; i < H.length; i++) {
            try {
                this.d[i] = new HashMap<>();
            } catch (IOException unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.c = h(bufferedInputStream);
        a aVar = new a(bufferedInputStream);
        switch (this.c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                k(aVar);
                break;
            case 4:
                g(aVar, 0, 0);
                break;
            case 7:
                i(aVar);
                break;
            case 9:
                j(aVar);
                break;
            case 10:
                l(aVar);
                break;
        }
        A(aVar);
        a();
    }

    public final void v(a aVar, int i) throws IOException {
        ByteOrder w2 = w(aVar);
        this.f = w2;
        aVar.m(w2);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.c;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException(C0059ao.a(11796) + Integer.toHexString(readUnsignedShort));
        }
        int readInt = aVar.readInt();
        if (readInt >= 8 && readInt < i) {
            int i3 = readInt - 8;
            if (i3 <= 0 || aVar.skipBytes(i3) == i3) {
                return;
            }
            throw new IOException(C0059ao.a(11797) + i3);
        }
        throw new IOException(C0059ao.a(11798) + readInt);
    }

    public final ByteOrder w(a aVar) throws IOException {
        short readShort = aVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException(C0059ao.a(11799) + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void x(byte[] bArr, int i) throws IOException {
        a aVar = new a(bArr);
        v(aVar, bArr.length);
        y(aVar, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x030a, code lost:
        r23.c = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0313, code lost:
        if (r24.b() == r13) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0315, code lost:
        r24.k(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e2, code lost:
        if (myunmn.C0059ao.a(11819).equals(r6.b) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02f5, code lost:
        if (r5.j(r23.f).contains(myunmn.C0059ao.a(11820)) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02fd, code lost:
        if (r9.equals(r6.b) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0308, code lost:
        if (r5.i(r23.f) != 65535) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(defpackage.ld.a r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.y(ld$a, int):void");
    }

    public final void z(a aVar, int i) throws IOException {
        b bVar;
        b bVar2 = this.d[i].get(C0059ao.a(11823));
        b bVar3 = this.d[i].get(C0059ao.a(11824));
        if ((bVar2 == null || bVar3 == null) && (bVar = this.d[i].get(C0059ao.a(11825))) != null) {
            g(aVar, bVar.i(this.f), i);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ld$a */
    /* loaded from: classes.dex */
    public static class a extends InputStream implements DataInput {
        public static final ByteOrder f = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder g = ByteOrder.BIG_ENDIAN;
        public DataInputStream b;
        public ByteOrder c;
        public final int d;
        public int e;

        public a(InputStream inputStream) throws IOException {
            this.c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.b = dataInputStream;
            int available = dataInputStream.available();
            this.d = available;
            this.e = 0;
            this.b.mark(available);
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.b.available();
        }

        public int b() {
            return this.e;
        }

        public long j() throws IOException {
            return readInt() & 4294967295L;
        }

        public void k(long j) throws IOException {
            int i = this.e;
            if (i > j) {
                this.e = 0;
                this.b.reset();
                this.b.mark(this.d);
            } else {
                j -= i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException(C0059ao.a(1206));
            }
        }

        public void m(ByteOrder byteOrder) {
            this.c = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.e++;
            return this.b.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.e++;
            return this.b.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i = this.e + 1;
            this.e = i;
            if (i <= this.d) {
                int read = this.b.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.e += 2;
            return this.b.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.e + i2;
            this.e = i3;
            if (i3 <= this.d) {
                if (this.b.read(bArr, i, i2) != i2) {
                    throw new IOException(C0059ao.a(1208));
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i = this.e + 4;
            this.e = i;
            if (i <= this.d) {
                int read = this.b.read();
                int read2 = this.b.read();
                int read3 = this.b.read();
                int read4 = this.b.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.c;
                    if (byteOrder == f) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == g) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException(C0059ao.a(1209) + this.c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i = this.e + 8;
            this.e = i;
            if (i <= this.d) {
                int read = this.b.read();
                int read2 = this.b.read();
                int read3 = this.b.read();
                int read4 = this.b.read();
                int read5 = this.b.read();
                int read6 = this.b.read();
                int read7 = this.b.read();
                int read8 = this.b.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.c;
                    if (byteOrder == f) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == g) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException(C0059ao.a(1210) + this.c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i = this.e + 2;
            this.e = i;
            if (i <= this.d) {
                int read = this.b.read();
                int read2 = this.b.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.c;
                    if (byteOrder == f) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == g) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException(C0059ao.a(1211) + this.c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.e += 2;
            return this.b.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.e++;
            return this.b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i = this.e + 2;
            this.e = i;
            if (i <= this.d) {
                int read = this.b.read();
                int read2 = this.b.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.c;
                    if (byteOrder == f) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == g) {
                        return (read << 8) + read2;
                    }
                    throw new IOException(C0059ao.a(1212) + this.c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.d - this.e);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.b.skipBytes(min - i2);
            }
            this.e += i2;
            return i2;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.b.read(bArr, i, i2);
            this.e += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.e + bArr.length;
            this.e = length;
            if (length <= this.d) {
                if (this.b.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException(C0059ao.a(1207));
                }
                return;
            }
            throw new EOFException();
        }

        public a(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ld$c */
    /* loaded from: classes.dex */
    public static class c {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public c(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        public boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        public c(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }
}
