package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: AxisPay */
/* renamed from: o30  reason: default package */
/* loaded from: classes.dex */
public enum o30 {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");
    
    public static final Map<Integer, o30> E = new HashMap();
    public static final Map<String, o30> F = new HashMap();
    public final int[] b;
    public final String[] c;

    static {
        o30[] values;
        for (o30 o30Var : values()) {
            for (int i : o30Var.b) {
                E.put(Integer.valueOf(i), o30Var);
            }
            F.put(o30Var.name(), o30Var);
            for (String str : o30Var.c) {
                F.put(str, o30Var);
            }
        }
    }

    o30(int i) {
        this(new int[]{i}, new String[0]);
    }

    public static o30 a(String str) {
        return F.get(str);
    }

    public int b() {
        return this.b[0];
    }

    o30(int i, String... strArr) {
        this.b = new int[]{i};
        this.c = strArr;
    }

    o30(int[] iArr, String... strArr) {
        this.b = iArr;
        this.c = strArr;
    }
}
