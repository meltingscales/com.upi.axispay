package defpackage;

import android.content.Context;
import defpackage.bl;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: al  reason: default package */
/* loaded from: classes.dex */
public class al {
    static {
        C0095z.a();
    }

    public static <T extends bl> bl.a<T> a(Context context, Class<T> cls, String str) {
        if (str != null && str.trim().length() != 0) {
            return new bl.a<>(context, cls, str);
        }
        char[] cArr = {(char) (cArr[44] ^ '\"'), (char) (cArr[97] ^ 4), (char) (cArr[90] ^ '\n'), (char) (cArr[119] ^ 26), (char) (cArr[72] ^ '\n'), (char) (cArr[65] ^ 19), (char) (cArr[42] ^ 0), (char) (cArr[126] ^ 23), (char) (cArr[85] ^ 24), (char) (cArr[101] ^ 26), (char) (cArr[68] ^ 3), (char) (cArr[115] ^ 22), (char) (cArr[73] ^ 'A'), (char) (cArr[11] ^ 5), (char) (cArr[120] ^ 'A'), (char) (cArr[130] ^ 1), (char) (cArr[68] ^ 14), (char) (cArr[129] ^ 16), (char) (cArr[19] ^ 3), (char) (cArr[120] ^ 3), (char) (cArr[101] ^ 18), (char) (cArr[28] ^ 'S'), (char) (cArr[16] ^ 4), (char) (cArr[74] ^ 'T'), (char) (cArr[80] ^ 30), (char) (cArr[116] ^ 16), (char) (cArr[85] ^ 25), (char) (cArr[3] ^ 6), (char) (cArr[129] ^ 'D'), (char) (cArr[62] ^ 23), (char) (cArr[20] ^ 20), (char) (cArr[129] ^ '\b'), (char) (cArr[128] ^ 0), (char) (cArr[71] ^ 'R'), (char) (cArr[49] ^ '&'), (char) (cArr[77] ^ 19), (char) (cArr[63] ^ 'I'), (char) (cArr[129] ^ 1), (char) (cArr[27] ^ 5), (char) (cArr[80] ^ 25), (char) (cArr[125] ^ '6'), (char) (cArr[107] ^ 20), (char) (cArr[85] ^ 'M'), (char) (cArr[72] ^ 11), (char) (cArr[42] ^ 'A'), (char) (cArr[28] ^ 'M'), (char) (cArr[115] ^ 23), (char) (cArr[120] ^ 'O'), (char) (20482 ^ 20514), (char) (cArr[79] ^ 'i'), (char) (cArr[65] ^ 1), (char) (cArr[16] ^ 'A'), (char) (cArr[59] ^ 'Y'), (char) (cArr[51] ^ 'O'), (char) (cArr[120] ^ 20), (char) (cArr[9] ^ 'I'), (char) (cArr[124] ^ 4), (char) (cArr[85] ^ 31), (char) (cArr[16] ^ 4), (char) (cArr[28] ^ 0), (char) (cArr[75] ^ 17), (char) (cArr[97] ^ 23), (char) (cArr[79] ^ 'Y'), (char) (cArr[17] ^ 29), (char) (cArr[121] ^ '\f'), (char) (cArr[101] ^ 20), (char) (cArr[50] ^ 'F'), (char) (cArr[93] ^ 21), (char) (cArr[124] ^ '\n'), (char) (cArr[48] ^ 0), (char) (cArr[65] ^ 4), (char) (cArr[97] ^ 23), (char) (cArr[14] ^ 'E'), (char) (cArr[67] ^ 21), (char) (cArr[22] ^ 17), (char) (cArr[97] ^ 0), (char) (cArr[19] ^ 'B'), (char) (cArr[131] ^ 19), (char) (cArr[112] ^ 11), (char) (cArr[131] ^ 'R'), (char) (cArr[17] ^ 29), (char) (cArr[43] ^ 0), (char) (cArr[31] ^ 'L'), (char) (cArr[71] ^ 31), (char) (cArr[92] ^ 17), (char) (cArr[69] ^ 'M'), (char) (cArr[65] ^ '\b'), (char) (cArr[115] ^ 0), (char) (cArr[119] ^ '\r'), (char) (cArr[36] ^ 0), (char) (cArr[59] ^ 'D'), (char) (cArr[14] ^ 'A'), (char) (cArr[5] ^ 0), (char) (cArr[120] ^ 0), (char) (cArr[67] ^ 22), (char) (cArr[52] ^ 24), (char) (cArr[76] ^ 'S'), (char) (cArr[131] ^ 23), (char) (cArr[62] ^ 'U'), (char) (cArr[72] ^ 'E'), (char) (cArr[15] ^ 17), (char) (cArr[48] ^ 'S'), (char) (cArr[54] ^ 16), (char) (cArr[42] ^ 0), (char) (cArr[57] ^ ' '), (char) (cArr[39] ^ 31), (char) (cArr[29] ^ 1), (char) (cArr[79] ^ 'M'), (char) (cArr[93] ^ 'O'), (char) (cArr[20] ^ '\b'), (char) (cArr[17] ^ 26), (char) (cArr[18] ^ ','), (char) (cArr[93] ^ 4), (char) (cArr[61] ^ 31), (char) (cArr[20] ^ 14), (char) (cArr[20] ^ 19), (char) (cArr[117] ^ '='), (char) (cArr[5] ^ '0'), (char) (cArr[24] ^ 22), (char) (cArr[129] ^ 16), (char) (cArr[124] ^ 4), (char) (cArr[69] ^ 'B'), (char) (cArr[0] ^ '\"'), (char) (cArr[76] ^ 'S'), (char) (cArr[129] ^ 1), (char) (cArr[90] ^ '&'), (char) (cArr[51] ^ 'U'), (char) (cArr[79] ^ 'I'), (char) (cArr[121] ^ 14), (char) (cArr[69] ^ 'D'), (char) (cArr[129] ^ 1), (char) (cArr[101] ^ 1)};
        throw new IllegalArgumentException(new String(cArr).intern());
    }

    public static <T, C> T b(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + new String(new char[]{(char) (16512 ^ 16558)}).intern() + str3;
            }
            return (T) Class.forName(str2, true, cls.getClassLoader()).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            char[] cArr = {(char) (cArr[13] ^ 14), (char) (cArr[25] ^ 15), (char) (cArr[29] ^ 28), (char) (cArr[0] ^ '\r'), (char) (cArr[21] ^ 14), (char) (cArr[8] ^ 29), (char) (cArr[29] ^ 'R'), (char) (cArr[6] ^ 'F'), (char) (cArr[13] ^ 4), (char) (cArr[22] ^ 26), (char) (cArr[3] ^ '\n'), (char) (cArr[6] ^ 0), (char) (cArr[26] ^ 'I'), (char) (cArr[29] ^ 31), (char) (cArr[20] ^ 4), (char) (cArr[26] ^ 'L'), (char) (cArr[12] ^ '\f'), (char) (cArr[29] ^ 31), (char) (cArr[2] ^ 11), (char) (cArr[18] ^ 11), (char) (cArr[29] ^ 6), (char) (cArr[22] ^ 21), (char) (cArr[13] ^ 25), (char) (cArr[13] ^ 4), (char) (cArr[1] ^ 14), (char) (cArr[26] ^ 'N'), (char) (cArr[29] ^ 'R'), (char) (cArr[15] ^ '\n'), (char) (cArr[29] ^ 29), (char) ((-12884) ^ (-12834)), (char) (cArr[29] ^ 'R')};
            sb.append(new String(cArr).intern());
            sb.append(cls.getCanonicalName());
            char[] cArr2 = {(char) (2423 ^ 2393), (char) (cArr2[0] ^ 14)};
            sb.append(new String(cArr2).intern());
            sb.append(str3);
            char[] cArr3 = {(char) (cArr3[7] ^ 'O'), (char) (cArr3[7] ^ 11), (char) (cArr3[7] ^ 0), (char) (cArr3[7] ^ '\n'), (char) (cArr3[5] ^ 'S'), (char) (cArr3[7] ^ 'O'), (char) (cArr3[10] ^ 11), (char) (25731 ^ 25836), (char) (cArr3[10] ^ 17), (char) (cArr3[4] ^ 'S'), (char) (cArr3[7] ^ '\n'), (char) (cArr3[7] ^ 23), (char) (cArr3[7] ^ 6), (char) (cArr3[5] ^ 'S'), (char) (cArr3[5] ^ 'T')};
            sb.append(new String(cArr3).intern());
            throw new RuntimeException(sb.toString());
        } catch (IllegalAccessException unused2) {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr4 = {(char) (cArr4[22] ^ '7'), (char) (cArr4[4] ^ 14), (char) (cArr4[12] ^ 29), (char) (cArr4[14] ^ 26), (char) (cArr4[24] ^ 26), (char) (cArr4[14] ^ 0), (char) ((-30991) ^ (-31023)), (char) (cArr4[24] ^ 20), (char) (cArr4[21] ^ 16), (char) (cArr4[22] ^ 23), (char) (cArr4[15] ^ '\r'), (char) (cArr4[4] ^ 28), (char) (cArr4[0] ^ '0'), (char) (cArr4[6] ^ 0), (char) (cArr4[7] ^ 21), (char) (cArr4[14] ^ 28), (char) (cArr4[13] ^ 'E'), (char) (cArr4[6] ^ 0), (char) (cArr4[14] ^ 23), (char) (cArr4[5] ^ 27), (char) (cArr4[18] ^ '\r'), (char) (cArr4[24] ^ 6), (char) (cArr4[4] ^ 27), (char) (cArr4[21] ^ 1), (char) (cArr4[6] ^ 'U'), (char) (cArr4[3] ^ '\r'), (char) (cArr4[28] ^ 6), (char) (cArr4[14] ^ 27), (char) (cArr4[4] ^ 29)};
            sb2.append(new String(cArr4).intern());
            sb2.append(cls.getCanonicalName());
            throw new RuntimeException(sb2.toString());
        } catch (InstantiationException unused3) {
            StringBuilder sb3 = new StringBuilder();
            char[] cArr5 = {(char) (cArr5[18] ^ '('), (char) (cArr5[30] ^ 7), (char) (cArr5[11] ^ 27), (char) (cArr5[11] ^ 30), (char) (cArr5[11] ^ 23), (char) (cArr5[31] ^ 'D'), (char) (cArr5[18] ^ 'N'), (char) (cArr5[11] ^ 6), (char) (cArr5[20] ^ 6), (char) (cArr5[0] ^ 'f'), (char) (cArr5[30] ^ 5), (char) (cArr5[20] ^ 27), (char) (cArr5[30] ^ 3), (char) (cArr5[31] ^ 'A'), (char) (cArr5[27] ^ 17), (char) (cArr5[21] ^ 11), (char) (cArr5[28] ^ 0), (char) (cArr5[31] ^ 'A'), (char) (cArr5[24] ^ 15), (char) (cArr5[24] ^ 'A'), (char) (cArr5[24] ^ '\b'), (char) (cArr5[26] ^ '\r'), (char) (cArr5[5] ^ 23), (char) (cArr5[13] ^ 21), (char) (cArr5[5] ^ 5), (char) (cArr5[1] ^ 15), (char) (cArr5[18] ^ '\r'), (char) (cArr5[1] ^ 4), (char) (cArr5[5] ^ 'D'), (char) (cArr5[24] ^ 14), (char) (cArr5[31] ^ 'F'), (char) (26756 ^ 26788)};
            sb3.append(new String(cArr5).intern());
            sb3.append(cls.getCanonicalName());
            throw new RuntimeException(sb3.toString());
        }
    }
}
