package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.google.android.gms.vision.barcode.Barcode;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: ı  reason: contains not printable characters */
    private static long f233;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int f234;

    /* renamed from: Ι  reason: contains not printable characters */
    private static int f235;

    /* renamed from: ι  reason: contains not printable characters */
    private static char[] f236;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a extends HashMap<String, Object> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private static int f237;

        /* renamed from: ɩ  reason: contains not printable characters */
        private static char[] f238;

        /* renamed from: ι  reason: contains not printable characters */
        private static long f239;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private static int f240;

        /* renamed from: ı  reason: contains not printable characters */
        private final Context f241;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Map<String, Object> f242;

        /* compiled from: AxisPay */
        /* renamed from: com.appsflyer.internal.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0005a {

            /* renamed from: ǃ  reason: contains not printable characters */
            private long f243;

            /* renamed from: ɩ  reason: contains not printable characters */
            public String f244;

            /* renamed from: Ι  reason: contains not printable characters */
            private final Object f245;

            public C0005a() {
            }

            /* renamed from: ı  reason: contains not printable characters */
            public static String m193(byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                for (byte b : bArr) {
                    String hexString = Integer.toHexString(b);
                    if (hexString.length() == 1) {
                        hexString = C0059ao.a(3792).concat(String.valueOf(hexString));
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public static byte[] m194(byte[] bArr) throws Exception {
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                }
                return bArr;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public static C0005a m195(String str) {
                String a = C0059ao.a(3793);
                if (str == null) {
                    return new C0005a(0L, a);
                }
                String[] split = str.split(C0059ao.a(3794));
                if (split.length < 2) {
                    return new C0005a(0L, a);
                }
                return new C0005a(Long.parseLong(split[0]), split[1]);
            }

            /* renamed from: ι  reason: contains not printable characters */
            public static byte[] m198(String str) throws Exception {
                return str.getBytes();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f243);
                sb.append(C0059ao.a(3795));
                sb.append(this.f244);
                return sb.toString();
            }

            public C0005a(long j, String str) {
                this.f245 = new Object();
                this.f243 = 0L;
                this.f244 = C0059ao.a(3791);
                this.f243 = j;
                this.f244 = str;
            }

            /* renamed from: ι  reason: contains not printable characters */
            private boolean m197(long j, String str) {
                synchronized (this.f245) {
                    if (str != null) {
                        if (!str.equals(this.f244) && m196(j)) {
                            this.f243 = j;
                            this.f244 = str;
                            return true;
                        }
                    }
                    return false;
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final boolean m199(C0005a c0005a) {
                return m197(c0005a.f243, c0005a.f244);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            private boolean m196(long j) {
                return j - this.f243 > 2000;
            }
        }

        static {
            C0059ao.a(a.class, 296);
            f238 = new char[]{21118, 61061, 11192, 25759, 41350, 58014, 16274, 30856, 46475, 63138, 13226, 19643, 44815, 5091, 55028, 39415, 23801, 45582, 3827, 52199, 34038, 16866, 749, 57318, 39136, 60365, 22335, 37432, 36700, 13223, 63147, 47522, 31919, 16306, 58098, 42425, 26815, 11144, 61063, 37276, 21643, 6018, 55963, 40336, 16541, 934, 50921, 35307, 19692, 4022, 45817, 30203, 14563, 64390, 48853, 25031, 9438, 59358, 43666, 28123, 4290, 54053, 38439, 22846, 7230, 57151, 33341, 17712, 2144, 52038, 34263, 14629, 64546, 45937, 30325, 13673, 59501, 'f', 48277, 31114, 13959, 62340, 45216, 28041, 10897, 59278, 42175, 25008, 7824, 56241, 39096, 21933, 16220, 33723, 18085, 2483, 52399, 52015, 30604, 45721, 64984, 14552, 52962, 29209, 46869, 63516, 15633, 32268, 41804, 58375, 10497, 27190, 44857, 53282, 5429, 22076, 39717, 56366, 291, 16920, 34647, 51285, 3410, 19976, 62298, 13377, 31048, 47725, 65401, 8240, 25955, 42593, 60280, 11368, 20772, 37533, 55172, 6291, 23953, 40600, 50072, 1161, 18827, 35510, 53222, 28912, 3462, 45433, 29822, 15221, 65141, 48493, 24636, 10037, 59952, 43272, 27736, 4873, 54789, 38222, 22558, 7952, 49685, 33120, 55955, 26208, 41838, 60532, 10605, 27255, 46974, 61496, 15739, 32320, 47966, 50243, 332, 16970, 36628, 51287, 5457, 22074, 37667, 56361, 6444, 23152, 59160, 8215, 27910, 44602, 60207, 13364, 28987, 45601, 65337, 14398, 17715, 34496, 50125, 3267, 18886, 53951, 28242, 43870, 58447, 8542, 25173, 48962, 63579, 13662, 30309, 45942, 'x', 48324, 31182, 58553, 22611, 40284, 53837, 5973, 21588, 'b', 32695, 49941, 52625, 28984, 38401, 10923, 'f', 48332, 31113, 14020, 62337, 45277, 28056, 10965, 59280, 42222, 25066, 7863, 56248, 39096, 21929, 4777};
            f239 = 4451731269474565372L;
        }

        public a(Map<String, Object> map, Context context) {
            this.f242 = map;
            this.f241 = context;
            put(m189(), m191());
        }

        /* renamed from: ı  reason: contains not printable characters */
        private String m189() {
            int i = f237 + 89;
            f240 = i % Barcode.ITF;
            int i2 = i % 2;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.f242.get(m192(0, (char) 21023, 12).intern()).toString();
                String obj2 = this.f242.get(m192(12, (char) 44909, 5).intern()).toString();
                if ((obj2 == null ? (char) 6 : (char) 3) != 3) {
                    int i3 = f237 + 19;
                    f240 = i3 % Barcode.ITF;
                    int i4 = i3 % 2;
                    obj2 = m192(17, (char) 45632, 8).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder m190 = m190(num, obj2, sb.toString());
                int length = m190.length();
                if (length <= 4) {
                    while (true) {
                        if (!(length < 4)) {
                            break;
                        }
                        int i5 = f240 + 121;
                        f237 = i5 % Barcode.ITF;
                        int i6 = i5 % 2;
                        length++;
                        m190.append('1');
                    }
                } else {
                    m190.delete(4, length);
                }
                m190.insert(0, m192(25, (char) 60326, 3).intern());
                return m190.toString();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m192(28, (char) 36666, 42).intern());
                sb2.append(e);
                AFLogger.afRDLog(sb2.toString());
                return m192(70, (char) 34236, 7).intern();
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private static StringBuilder m190(String... strArr) throws Exception {
            ArrayList arrayList = new ArrayList();
            int i = f237 + 49;
            f240 = i % Barcode.ITF;
            int i2 = i % 2;
            int i3 = 0;
            while (true) {
                if (!(i3 < 3)) {
                    break;
                }
                arrayList.add(Integer.valueOf(strArr[i3].length()));
                i3++;
                int i4 = f240 + 83;
                f237 = i4 % Barcode.ITF;
                int i5 = i4 % 2;
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            for (int i6 = 0; i6 < intValue; i6++) {
                int i7 = f237 + 115;
                f240 = i7 % Barcode.ITF;
                int i8 = i7 % 2;
                Integer num = null;
                int i9 = 0;
                while (true) {
                    if (i9 >= 3) {
                        break;
                    }
                    int i10 = f240 + 79;
                    f237 = i10 % Barcode.ITF;
                    int i11 = i10 % 2;
                    int charAt = strArr[i9].charAt(i6);
                    if (num != null) {
                        charAt ^= num.intValue();
                    }
                    num = Integer.valueOf(charAt);
                    i9++;
                }
                sb.append(Integer.toHexString(num.intValue()));
            }
            return sb;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x01fb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: Ι  reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.String m191() {
            /*
                Method dump skipped, instructions count: 512
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.b.a.m191():java.lang.String");
        }

        /* renamed from: ι  reason: contains not printable characters */
        private static String m192(int i, char c, int i2) {
            char[] cArr = new char[i2];
            int i3 = 0;
            while (true) {
                if (!(i3 < i2)) {
                    break;
                }
                int i4 = f240 + 25;
                f237 = i4 % Barcode.ITF;
                int i5 = i4 % 2;
                cArr[i3] = (char) ((f238[i + i3] ^ (i3 * f239)) ^ c);
                i3++;
            }
            String str = new String(cArr);
            int i6 = f240 + 53;
            f237 = i6 % Barcode.ITF;
            if ((i6 % 2 != 0 ? 'R' : 'E') != 'E') {
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return str;
        }
    }

    static {
        C0059ao.a(b.class, 208);
        f236 = new char[]{'a', 7475, 15070, 22629, 29979, 37560, 45130, 52645, 60060, 2080, 9678, 17050, 24620, 32209, 39801, 47133, 54697, 62211, 4318, 11650, 19240, 26820, 34190, 41779, 49367, 56955, 64267, 6274, 13901, 21479, 28807, 36388, 43973, 51343, 58819, '0', 'y', 7460, 15043, 22638, 30041, 37532, 45155, 52646, 60044, 2081, 9725, 17079, 24596, 32212, 39803, 47104, 54691, 62327, 21471, 20097, 26981, 3023, 9896, 49417, 58275, 40451, 47468, 23452, 30250, 4465, 13184, 11878, 51346, 60413, 34393, 41206, 17155, 32319, 6349, 15225, 54903, 61654, 37729, 36241, 43262, 19220, 26019, 4, 9066, 56783, 59110, 64436, 56409, 48866, 37788, 29759, 22221, 11042, 3072, 61105, 49931, 42042, 34490, 39754, 32229, 24209, 13093, 5587, 63040, 51969, 44461, 36423, 25374, 17849, 9805, 22895, 17469, 25552, 363, 11285, 52150, 59716, 38059, 45966, 20778, 31966, 7061, 14629, 9430, 49770, 57624, 36080, 43632, 18913, 29831, 4665, 12736, 56450, 56109, 50815, 57746, 33577, 44631, 18932, 27398, 5865, 12747, 54138, 65216, 39410, 47971, 42636, 16436, 25436, 3784, 10240, 52149, 63168, 'a', 7475, 15070, 22629, 29979, 37560, 45130, 52645, 60038, 2080, 9686, 17105, 24585, 32203, 39807, 61791, 53786, 53045, 'j', 7484, 15052, 22646, 30042, 37560, 45121, 52645, 60060, 2088, 9682, 17051, 24629, 32203, 49450, 56379, 64478, 39281, 46105, 21425, 62495, 59718, 52900, 44154, 33078, 26314, 17463, 14740, 7923, 64605, 29111, 27841, 19243, 10624, 1259, 58198, 49583, 48146, 39769, 31177, 21557, 13166, 4568, 3129, 60043, 51688, 42058, 43436, 46294, 37689, 61841, 56571, 15199, 6628, 25621, 17261, 41359, 35887, 60272, 51650, 54387, 12959, 4600, 31833, 23215, 47365, 33837, 58078, 49450, 11360, 2777, 26994, 30600, 21233, 45393, 40878, 64067, 55657, 10193, 553, 24946, 20416, 43561, 34967, 38900, 62026, 53499, 16194, 43178, 46581, 37379, 61587, 56791, 14959, 6295, 25895, 16969, 41188, 36106, 59990, 51408, 54532, 13227, 4306, 32116, 23427, 47142, 34142, 58336, 49155, 11613, 3045, 40223, 32873, 42883, 50472, 59459, 4094, 11527, 20666, 30694, 38268, 47256, 57295, 64869, 57478, 1598, 9578, 18676, 28178, 36275, 45259, 54892, 62868, 6349, 15977, 'F', 7484, 15059, 22651, 29969, 37557, 45070, 52706, 60038, 2099, 9677, 17044, 24633, 32153, 39780, 47126, 54710, 62273, 4335, 11652, 19248, 26820, 34202, 41851, 49365, 56944, 64262, 6311, 13891, 21485, 28870, 36404, 43977, 51337, 58930, 919, 8561, 15881, 23469, 31054, 38648, 45969, 53547, 61168, 2962, 10595, 18070};
        f233 = 1905531472624098653L;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m181(String str, Long l) {
        if ((str != null ? 'F' : '&') != '&' && l != null && str.length() == 32) {
            StringBuilder sb = new StringBuilder(str);
            String obj = l.toString();
            long j = 0;
            int i = 0;
            int i2 = 0;
            while (i < obj.length()) {
                int i3 = f235 + 59;
                f234 = i3 % Barcode.ITF;
                if ((i3 % 2 != 0 ? 'H' : (char) 11) != 'H') {
                    i2 += Character.getNumericValue(obj.charAt(i));
                    i++;
                } else {
                    i2 /= Character.getNumericValue(obj.charAt(i));
                    i += 93;
                }
            }
            String hexString = Integer.toHexString(i2);
            sb.replace(7, hexString.length() + 7, hexString);
            int i4 = 0;
            while (true) {
                if (!(i4 < sb.length() ? true : true)) {
                    break;
                }
                int i5 = f235 + 95;
                f234 = i5 % Barcode.ITF;
                int i6 = i5 % 2;
                j += Character.getNumericValue(sb.charAt(i4));
                i4++;
            }
            while (j > 100) {
                j %= 100;
            }
            sb.insert(23, (int) j);
            if (j < 10) {
                int i7 = f235 + 7;
                f234 = i7 % Barcode.ITF;
                if (i7 % 2 != 0) {
                    sb.insert(44, m183(106, (char) 0, 1).intern());
                } else {
                    sb.insert(23, m183(35, (char) 0, 1).intern());
                }
            }
            return sb.toString();
        }
        return m183(54, (char) 21437, 32).intern();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m184(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i = f235 + 85;
            int i2 = i % Barcode.ITF;
            f234 = i2;
            int i3 = i % 2;
            int i4 = i2 + 83;
            f235 = i4 % Barcode.ITF;
            if ((i4 % 2 == 0 ? 'L' : '%') != 'L') {
                return str;
            }
            int i5 = 3 / 0;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static String m185(String str) {
        if (!str.contains(m183(169, (char) 61809, 1).intern())) {
            int i = f235 + 93;
            f234 = i % Barcode.ITF;
            int i2 = i % 2;
            return str;
        }
        String[] split = str.split(m183(170, (char) 53830, 2).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i3 = length - 1;
        sb.append(split[i3]);
        sb.append(m183(169, (char) 61809, 1).intern());
        int i4 = 1;
        while (true) {
            if ((i4 < i3 ? '0' : 'Y') != '0') {
                break;
            }
            sb.append(split[i4]);
            sb.append(m183(169, (char) 61809, 1).intern());
            i4++;
        }
        sb.append(split[0]);
        String obj = sb.toString();
        int i5 = f234 + 25;
        f235 = i5 % Barcode.ITF;
        if (!(i5 % 2 == 0)) {
            return obj;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bc  */
    /* renamed from: Ι  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m187(android.content.Context r15, long r16) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.b.m187(android.content.Context, long):java.lang.String");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m188(Context context, String str) {
        int i = f234 + 51;
        f235 = i % Barcode.ITF;
        int i2 = i % 2;
        Object[] objArr = null;
        try {
            Iterator it = ((List) PackageManager.class.getDeclaredMethod(m183(260, (char) 43213, 24).intern(), Integer.TYPE).invoke(context.getPackageManager(), 0)).iterator();
            while (true) {
                if (!(it.hasNext())) {
                    break;
                }
                int i3 = f234 + 89;
                f235 = i3 % Barcode.ITF;
                if (!(i3 % 2 == 0)) {
                    if ((((PackageItemInfo) ((ApplicationInfo) it.next())).packageName.equals(str) ? 'L' : '(') != '(') {
                        break;
                    }
                    int i4 = f235 + 53;
                    f234 = i4 % Barcode.ITF;
                    int i5 = i4 % 2;
                } else {
                    boolean equals = ((PackageItemInfo) ((ApplicationInfo) it.next())).packageName.equals(str);
                    int length = objArr.length;
                    if (equals) {
                        break;
                    }
                    int i42 = f235 + 53;
                    f234 = i42 % Barcode.ITF;
                    int i52 = i42 % 2;
                }
            }
            int i6 = f235 + 103;
            f234 = i6 % Barcode.ITF;
            if (i6 % 2 != 0) {
                String obj = Boolean.TRUE.toString();
                int length2 = objArr.length;
                return obj;
            }
            return Boolean.TRUE.toString();
        } catch (IllegalAccessException e) {
            ae m150 = ae.m150();
            String intern = m183(284, (char) 40284, 24).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m183(308, (char) 0, 47).intern());
            sb.append(e);
            m150.m160(null, intern, sb.toString());
        } catch (NoSuchMethodException e2) {
            ae m1502 = ae.m150();
            String intern2 = m183(284, (char) 40284, 24).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m183(308, (char) 0, 47).intern());
            sb2.append(e2);
            m1502.m160(null, intern2, sb2.toString());
        } catch (InvocationTargetException e3) {
            ae m1503 = ae.m150();
            String intern3 = m183(284, (char) 40284, 24).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m183(308, (char) 0, 47).intern());
            sb3.append(e3);
            m1503.m160(null, intern3, sb3.toString());
        }
        return Boolean.FALSE.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m183(int i, char c, int i2) {
        int i3 = f234 + 37;
        f235 = i3 % Barcode.ITF;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (true) {
            if (!(i5 >= i2)) {
                int i6 = f235 + 13;
                f234 = i6 % Barcode.ITF;
                int i7 = i6 % 2;
                cArr[i5] = (char) ((f236[i + i5] ^ (i5 * f233)) ^ c);
                i5++;
            } else {
                String str = new String(cArr);
                int i8 = f234 + 29;
                f235 = i8 % Barcode.ITF;
                int i9 = i8 % 2;
                return str;
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m182(String str) {
        boolean z;
        int i = f235 + 39;
        f234 = i % Barcode.ITF;
        try {
            if ((i % 2 != 0 ? (char) 6 : (char) 27) != 6) {
                Class.forName(str);
                z = true;
            } else {
                Class.forName(str);
                z = false;
            }
            int i2 = f234 + 19;
            f235 = i2 % Barcode.ITF;
            if (i2 % 2 != 0) {
                return z;
            }
            int i3 = 60 / 0;
            return z;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static String m186(Context context) {
        int i = f235 + 81;
        f234 = i % Barcode.ITF;
        if ((i % 2 != 0 ? 'J' : '+') != 'J') {
            if (!(System.getProperties().containsKey(m183(172, (char) 0, 14).intern()))) {
                return null;
            }
        } else if (!System.getProperties().containsKey(m183(22787, (char) 0, 97).intern())) {
            return null;
        }
        try {
            Matcher matcher = Pattern.compile(m183(192, (char) 62513, 10).intern()).matcher(context.getCacheDir().getPath().replace(m183(186, (char) 49413, 6).intern(), C0059ao.a(11404)));
            if (matcher.find()) {
                int i2 = f235 + 63;
                f234 = i2 % Barcode.ITF;
                int i3 = i2 % 2;
                String group = matcher.group(1);
                int i4 = f234 + 77;
                f235 = i4 % Barcode.ITF;
                int i5 = i4 % 2;
                return group;
            }
            return null;
        } catch (Exception e) {
            ae m150 = ae.m150();
            String intern = m183(202, (char) 29172, 17).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m183(219, (char) 43498, 41).intern());
            sb.append(e);
            m150.m160(null, intern, sb.toString());
            return null;
        }
    }
}
