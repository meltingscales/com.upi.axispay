package defpackage;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import defpackage.cm;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import myunmn.C0059ao;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: bl  reason: default package */
/* loaded from: classes.dex */
public abstract class bl {
    @Deprecated
    public volatile bm a;
    public Executor b;
    public cm c;
    public final tk d;
    public boolean e;
    @Deprecated
    public List<b> f;
    public Map<Class<? extends jl>, jl> g;
    public ik i;
    public final Map<Class<?>, Object> k;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> j = new ThreadLocal<>();

    /* compiled from: AxisPay */
    /* renamed from: bl$a */
    /* loaded from: classes.dex */
    public static class a<T extends bl> {
        public final Class<T> a;
        public final String b;
        public final Context c;
        public ArrayList<b> d;
        public e e;
        public f f;
        public Executor g;
        public List<Object> h;
        public List<jl> i;
        public Executor j;
        public Executor k;
        public cm.c l;
        public boolean m;
        public Intent o;
        public boolean q;
        public TimeUnit s;
        public Set<Integer> u;
        public Set<Integer> v;
        public String w;
        public File x;
        public Callable<InputStream> y;
        public long r = -1;
        public c n = c.AUTOMATIC;
        public boolean p = true;
        public final d t = new d();

        static {
            C0095z.a();
        }

        public a(Context context, Class<T> cls, String str) {
            this.c = context;
            this.a = cls;
            this.b = str;
        }

        private char[] a(int i) {
            char[] cArr = {(char) (cArr[28] ^ '>'), (char) (cArr[182] ^ 0), (char) (cArr[150] ^ 27), (char) (cArr[83] ^ 0), (char) (cArr[84] ^ 'R'), (char) (cArr[181] ^ 29), (char) (cArr[81] ^ 'H'), (char) (cArr[90] ^ '\r'), (char) (cArr[90] ^ 2), (char) (cArr[126] ^ 'E'), (char) (cArr[34] ^ 'C'), (char) (cArr[144] ^ 26), (char) (cArr[113] ^ 17), (char) (cArr[130] ^ 'N'), (char) (cArr[70] ^ '\n'), (char) (cArr[113] ^ 18), (char) (cArr[123] ^ 'B'), (char) (cArr[100] ^ 16), (char) (cArr[130] ^ 28), (char) (cArr[184] ^ 22), (char) (cArr[15] ^ 7), (char) (cArr[119] ^ 16), (char) (cArr[148] ^ 16), (char) (cArr[115] ^ '2'), (char) (cArr[28] ^ 1), (char) (cArr[182] ^ 0), (char) (cArr[8] ^ 3), (char) (cArr[79] ^ 'i'), (char) (cArr[90] ^ 31), (char) (cArr[124] ^ 18), (char) (cArr[123] ^ 7), (char) (cArr[147] ^ 'T'), (char) (cArr[158] ^ 'G'), (char) (cArr[181] ^ '@'), (char) (cArr[161] ^ 'X'), (char) (cArr[33] ^ '\t'), (char) (cArr[168] ^ 6), (char) (cArr[154] ^ 29), (char) (cArr[28] ^ 22), (char) (cArr[119] ^ 5), (char) (cArr[8] ^ 26), (char) (cArr[113] ^ 17), (char) (cArr[45] ^ '+'), (char) (cArr[181] ^ 27), (char) (cArr[18] ^ 29), (char) (cArr[164] ^ 'M'), (char) (cArr[122] ^ '('), (char) (cArr[182] ^ 1), (char) (cArr[89] ^ 28), (char) (cArr[23] ^ '3'), (char) (cArr[106] ^ 16), (char) (cArr[169] ^ '6'), (char) (cArr[129] ^ 21), (char) (cArr[164] ^ 'R'), (char) (cArr[147] ^ 'E'), (char) (cArr[123] ^ 3), (char) (cArr[41] ^ '\b'), (char) (cArr[54] ^ 'M'), (char) (cArr[159] ^ 'O'), (char) (cArr[151] ^ 'B'), (char) (cArr[16] ^ 0), (char) (cArr[146] ^ 5), (char) (cArr[60] ^ 'N'), (char) (cArr[176] ^ 3), (char) (cArr[104] ^ 'I'), (char) (cArr[106] ^ 7), (char) (cArr[155] ^ 28), (char) (cArr[181] ^ '\f'), (char) (cArr[164] ^ 'A'), (char) (cArr[115] ^ 0), (char) (cArr[146] ^ 1), (char) (cArr[142] ^ '#'), (char) (cArr[81] ^ 'R'), (char) (cArr[60] ^ 'O'), (char) (cArr[164] ^ 'M'), (char) (cArr[33] ^ 'o'), (char) (cArr[38] ^ '\f'), (char) (cArr[132] ^ 3), (char) (cArr[76] ^ '\f'), (char) (cArr[74] ^ 'E'), (char) (cArr[78] ^ 'L'), (char) (cArr[109] ^ '\f'), (char) (cArr[38] ^ 18), (char) (cArr[57] ^ 'M'), (char) (cArr[27] ^ '3'), (char) (cArr[181] ^ '\f'), (char) (cArr[111] ^ 'B'), (char) (cArr[158] ^ '\f'), (char) (cArr[65] ^ 2), (char) (cArr[16] ^ 'L'), (char) (cArr[161] ^ 24), (char) (cArr[146] ^ 1), (char) (cArr[79] ^ 'L'), (char) (cArr[90] ^ 'L'), (char) (cArr[129] ^ 14), (char) (cArr[75] ^ '('), (char) (cArr[3] ^ 'E'), (char) (cArr[106] ^ 16), (char) (cArr[163] ^ '\r'), (char) (cArr[79] ^ 'A'), (char) (cArr[34] ^ '_'), (char) (cArr[149] ^ 'S'), (char) (cArr[47] ^ ','), (char) (cArr[164] ^ 'U'), (char) (cArr[23] ^ '/'), (char) (cArr[10] ^ 3), (char) (cArr[147] ^ 'D'), (char) (cArr[146] ^ 1), (char) (cArr[116] ^ 26), (char) (cArr[11] ^ 'B'), (char) (cArr[184] ^ 'S'), (char) (cArr[166] ^ '\n'), (char) (cArr[97] ^ 1), (char) (cArr[115] ^ 0), (char) (cArr[124] ^ 'A'), (char) (cArr[74] ^ 25), (char) (cArr[181] ^ 1), (char) (cArr[112] ^ 16), (char) (cArr[146] ^ 'D'), (char) (cArr[33] ^ 'M'), (char) (cArr[15] ^ 7), (char) (cArr[71] ^ '2'), (char) (cArr[78] ^ 4), (char) ((-20240) ^ i), (char) (cArr[109] ^ 'M'), (char) (cArr[178] ^ 1), (char) (cArr[7] ^ 4), (char) (cArr[169] ^ 'E'), (char) (cArr[78] ^ 6), (char) (cArr[45] ^ '\f'), (char) (cArr[45] ^ 3), (char) (cArr[154] ^ 'O'), (char) (cArr[5] ^ 27), (char) (cArr[0] ^ '#'), (char) (cArr[74] ^ 1), (char) (cArr[180] ^ '\r'), (char) (cArr[27] ^ 'a'), (char) (cArr[179] ^ 3), (char) (cArr[28] ^ 22), (char) (cArr[28] ^ 'S'), (char) (cArr[43] ^ 17), (char) (cArr[42] ^ '4'), (char) (cArr[16] ^ 'E'), (char) (cArr[92] ^ 5), (char) (cArr[8] ^ 26), (char) (cArr[69] ^ 17), (char) (cArr[28] ^ 23), (char) (cArr[75] ^ 'f'), (char) (cArr[153] ^ 'U'), (char) (cArr[164] ^ 'S'), (char) (cArr[84] ^ 27), (char) (cArr[164] ^ 'N'), (char) (cArr[132] ^ '\b'), (char) (cArr[53] ^ 'R'), (char) (cArr[162] ^ 7), (char) (cArr[38] ^ 11), (char) (cArr[45] ^ '\b'), (char) (cArr[48] ^ 'P'), (char) (cArr[33] ^ 'F'), (char) (cArr[139] ^ 'F'), (char) (cArr[140] ^ 'C'), (char) (cArr[164] ^ 'T'), (char) (cArr[43] ^ 26), (char) (cArr[74] ^ '\b'), (char) (cArr[123] ^ 'B'), (char) (cArr[18] ^ 6), (char) (cArr[123] ^ '\n'), (char) (cArr[76] ^ 27), (char) (cArr[129] ^ 4), (char) (cArr[74] ^ '\b'), (char) (cArr[79] ^ '\b'), (char) (cArr[154] ^ '\f'), (char) (cArr[36] ^ '\f'), (char) (cArr[18] ^ 28), (char) (cArr[161] ^ 18), (char) (cArr[89] ^ 5), (char) (cArr[72] ^ 21), (char) (cArr[112] ^ 0), (char) (cArr[146] ^ 22), (char) (cArr[101] ^ 'A'), (char) (cArr[90] ^ 24), (char) (cArr[130] ^ 7), (char) (cArr[28] ^ 28), (char) (cArr[92] ^ '\n'), (char) (cArr[140] ^ 16), (char) (cArr[106] ^ 'J')};
            return cArr;
        }

        private char[] b(int i) {
            char[] cArr = {(char) (cArr[1] ^ 22), (char) (cArr[3] ^ '9'), (char) (cArr[3] ^ 29), (char) ((-25450) ^ i), (char) (cArr[3] ^ 28)};
            return cArr;
        }

        private char[] c(int i) {
            char[] cArr = {(char) (cArr[29] ^ '*'), (char) (cArr[21] ^ 18), (char) (cArr[22] ^ 11), (char) (cArr[37] ^ 15), (char) (cArr[49] ^ 'O'), (char) (cArr[11] ^ 0), (char) (cArr[4] ^ 'O'), (char) (cArr[12] ^ 6), (char) (cArr[47] ^ 0), (char) (cArr[38] ^ 11), (char) (cArr[23] ^ 21), (char) (cArr[33] ^ 18), (char) (cArr[38] ^ 11), (char) (cArr[49] ^ 0), (char) (cArr[12] ^ 3), (char) (cArr[54] ^ 16), (char) (cArr[9] ^ '\n'), (char) (cArr[8] ^ 31), (char) (cArr[9] ^ 'E'), (char) (cArr[20] ^ 18), (char) (cArr[47] ^ 1), (char) (cArr[32] ^ 'S'), (char) (cArr[39] ^ 'E'), (char) (cArr[38] ^ 26), (char) (cArr[33] ^ 'F'), (char) (cArr[30] ^ 3), (char) (cArr[6] ^ 'R'), (char) (cArr[31] ^ 'E'), (char) (cArr[58] ^ 'H'), (char) (cArr[33] ^ 15), (char) (cArr[45] ^ 1), (char) (cArr[49] ^ 'E'), (char) (cArr[47] ^ 'R'), (char) ((-9540) ^ i), (char) (cArr[19] ^ 14), (char) (cArr[25] ^ 29), (char) (cArr[12] ^ 'E'), (char) (cArr[38] ^ 15), (char) (cArr[33] ^ '\b'), (char) (cArr[54] ^ 'B'), (char) (cArr[5] ^ 29), (char) (cArr[32] ^ 'N'), (char) (cArr[31] ^ 'H'), (char) (cArr[13] ^ 'M'), (char) (cArr[53] ^ 4), (char) (cArr[11] ^ 25), (char) (cArr[3] ^ 1), (char) (cArr[33] ^ 20), (char) (cArr[55] ^ 24), (char) (cArr[47] ^ 'R'), (char) (cArr[11] ^ 16), (char) (cArr[27] ^ 'A'), (char) (cArr[38] ^ 26), (char) (cArr[29] ^ '\b'), (char) (cArr[24] ^ 'B'), (char) (cArr[32] ^ 'A'), (char) (cArr[45] ^ 30), (char) (cArr[18] ^ 'E'), (char) (cArr[29] ^ 'G')};
            return cArr;
        }

        private char[] d(int i) {
            char[] cArr = {(char) (cArr[9] ^ ','), (char) (cArr[100] ^ 'N'), (char) (cArr[208] ^ 17), (char) (cArr[224] ^ '\n'), (char) (cArr[166] ^ 5), (char) (cArr[115] ^ 22), (char) (cArr[14] ^ '\r'), (char) (cArr[55] ^ '>'), (char) (cArr[226] ^ 7), (char) (cArr[42] ^ 21), (char) (cArr[62] ^ 1), (char) (cArr[222] ^ 'C'), (char) (cArr[116] ^ 11), (char) (cArr[108] ^ 'R'), (char) (cArr[24] ^ '%'), (char) (cArr[117] ^ 22), (char) (cArr[7] ^ 7), (char) (cArr[144] ^ '\n'), (char) (cArr[161] ^ 15), (char) (cArr[43] ^ 4), (char) (cArr[197] ^ 'K'), (char) (cArr[20] ^ 1), (char) (cArr[118] ^ 'G'), (char) (cArr[145] ^ 'N'), (char) (cArr[108] ^ '3'), (char) (cArr[143] ^ 'I'), (char) (cArr[78] ^ ' '), (char) (cArr[45] ^ 0), (char) (cArr[24] ^ '&'), (char) (cArr[51] ^ 'R'), (char) (cArr[102] ^ 21), (char) (cArr[204] ^ 6), (char) (cArr[149] ^ 25), (char) (cArr[167] ^ ';'), (char) (cArr[100] ^ 'N'), (char) (cArr[36] ^ 'W'), (char) (cArr[188] ^ 25), (char) (cArr[116] ^ 19), (char) (cArr[134] ^ 7), (char) (cArr[43] ^ 'P'), (char) (cArr[105] ^ 7), (char) (cArr[215] ^ '['), (char) (cArr[188] ^ 30), (char) (cArr[99] ^ 17), (char) (cArr[121] ^ 'L'), (char) (cArr[129] ^ 6), (char) (cArr[23] ^ 'E'), (char) (cArr[156] ^ 16), (char) (cArr[43] ^ 'P'), (char) (cArr[159] ^ 18), (char) (cArr[55] ^ '\"'), (char) (cArr[172] ^ 'T'), (char) (cArr[102] ^ 21), (char) (cArr[162] ^ '\b'), (char) (cArr[216] ^ 'D'), (char) (cArr[169] ^ '\t'), (char) (cArr[162] ^ 5), (char) (cArr[53] ^ 3), (char) (cArr[105] ^ 6), (char) (cArr[97] ^ 18), (char) (cArr[114] ^ 2), (char) (cArr[139] ^ 31), (char) (cArr[160] ^ 14), (char) (cArr[74] ^ '@'), (char) (cArr[43] ^ 'X'), (char) (cArr[57] ^ '*'), (char) (cArr[33] ^ 6), (char) (cArr[115] ^ 2), (char) (cArr[39] ^ 'R'), (char) (cArr[47] ^ 5), (char) (cArr[103] ^ 21), (char) (cArr[78] ^ 4), (char) (cArr[229] ^ 1), (char) (cArr[60] ^ 26), (char) (cArr[36] ^ 'Y'), (char) (cArr[80] ^ 'I'), (char) (cArr[42] ^ '^'), (char) (cArr[108] ^ 'R'), (char) (cArr[99] ^ '\f'), (char) (cArr[132] ^ 'I'), (char) (cArr[125] ^ 6), (char) (cArr[22] ^ '\\'), (char) (cArr[80] ^ 6), (char) (cArr[209] ^ 7), (char) (cArr[72] ^ 6), (char) (cArr[192] ^ 2), (char) (cArr[91] ^ 6), (char) (cArr[155] ^ 'S'), (char) (cArr[135] ^ 'H'), (char) (cArr[171] ^ 'S'), (char) (cArr[13] ^ 'T'), (char) (cArr[195] ^ 6), (char) (cArr[209] ^ 18), (char) (cArr[108] ^ 6), (char) (cArr[108] ^ 'R'), (char) (cArr[146] ^ 'H'), (char) (cArr[216] ^ 'A'), (char) (cArr[208] ^ 1), (char) (cArr[156] ^ 'T'), (char) (cArr[108] ^ 19), (char) (cArr[188] ^ 'N'), (char) (cArr[108] ^ 1), (char) (cArr[78] ^ 25), (char) (cArr[105] ^ 21), (char) (cArr[55] ^ '?'), (char) (cArr[9] ^ 17), (char) (cArr[118] ^ 'I'), (char) (cArr[158] ^ 'O'), (char) (11898 ^ i), (char) (cArr[148] ^ 'U'), (char) (cArr[154] ^ 1), (char) (cArr[99] ^ 15), (char) (cArr[37] ^ 5), (char) (cArr[61] ^ 'I'), (char) (cArr[37] ^ 23), (char) (cArr[103] ^ 4), (char) (cArr[43] ^ 2), (char) (cArr[216] ^ 'S'), (char) (cArr[13] ^ 'I'), (char) (cArr[162] ^ 3), (char) (cArr[64] ^ 'F'), (char) (cArr[54] ^ 'D'), (char) (cArr[164] ^ 4), (char) (cArr[185] ^ 5), (char) (cArr[107] ^ 26), (char) (cArr[206] ^ '7'), (char) (cArr[68] ^ 30), (char) (cArr[137] ^ 'T'), (char) (cArr[64] ^ '\\'), (char) (cArr[61] ^ 6), (char) (cArr[211] ^ 'O'), (char) (cArr[106] ^ 'A'), (char) (cArr[105] ^ 'T'), (char) (cArr[93] ^ 7), (char) (cArr[108] ^ 6), (char) (cArr[19] ^ 21), (char) (cArr[223] ^ 4), (char) (cArr[125] ^ 21), (char) (cArr[76] ^ 14), (char) (cArr[143] ^ 31), (char) (cArr[204] ^ 23), (char) (cArr[48] ^ 'R'), (char) (cArr[181] ^ 26), (char) (cArr[188] ^ 7), (char) (cArr[42] ^ 31), (char) (cArr[43] ^ 30), (char) (cArr[6] ^ 'I'), (char) (cArr[149] ^ 3), (char) (cArr[50] ^ 26), (char) (cArr[51] ^ 'P'), (char) (cArr[153] ^ 21), (char) (cArr[195] ^ 2), (char) (cArr[44] ^ 5), (char) (cArr[154] ^ 1), (char) (cArr[40] ^ 23), (char) (cArr[97] ^ 'S'), (char) (cArr[139] ^ 2), (char) (cArr[71] ^ 6), (char) (cArr[164] ^ 'A'), (char) (cArr[39] ^ 'F'), (char) (cArr[78] ^ '\f'), (char) (cArr[125] ^ '\r'), (char) (cArr[143] ^ 5), (char) (cArr[70] ^ 22), (char) (cArr[125] ^ 0), (char) (cArr[143] ^ '\n'), (char) (cArr[82] ^ '\n'), (char) (cArr[143] ^ '='), (char) (cArr[33] ^ 0), (char) (cArr[139] ^ '2'), (char) (cArr[177] ^ '\f'), (char) (cArr[48] ^ 'S'), (char) (cArr[167] ^ ' '), (char) (cArr[169] ^ '6'), (char) (cArr[88] ^ '\\'), (char) (cArr[127] ^ 'C'), (char) (cArr[102] ^ 0), (char) (cArr[13] ^ 'I'), (char) (cArr[204] ^ 4), (char) (cArr[105] ^ 17), (char) (cArr[145] ^ '#'), (char) (cArr[139] ^ 31), (char) (cArr[212] ^ '\t'), (char) (cArr[139] ^ 4), (char) (cArr[51] ^ 'A'), (char) (cArr[188] ^ 26), (char) (cArr[188] ^ 7), (char) (cArr[218] ^ 27), (char) (cArr[108] ^ 28), (char) (cArr[94] ^ 'f'), (char) (cArr[183] ^ 0), (char) (cArr[159] ^ '\t'), (char) (cArr[66] ^ 4), (char) (cArr[92] ^ 'I'), (char) (cArr[103] ^ '\b'), (char) (cArr[183] ^ 28), (char) (cArr[183] ^ 6), (char) (cArr[108] ^ '\\'), (char) (cArr[186] ^ 'G'), (char) (cArr[13] ^ 14), (char) (cArr[25] ^ 0), (char) (cArr[6] ^ 26), (char) (cArr[107] ^ 27), (char) (cArr[197] ^ 'O'), (char) (cArr[64] ^ 'Z'), (char) (cArr[127] ^ 'T'), (char) (cArr[197] ^ 'x'), (char) (cArr[195] ^ 11), (char) (cArr[23] ^ 'R'), (char) (cArr[64] ^ '['), (char) (cArr[111] ^ 7), (char) (cArr[217] ^ '<'), (char) (cArr[88] ^ 'G'), (char) (cArr[99] ^ 18), (char) (cArr[78] ^ 'D'), (char) (cArr[220] ^ '\\'), (char) (cArr[172] ^ 'T'), (char) (cArr[218] ^ '\''), (char) (cArr[180] ^ '9'), (char) (cArr[167] ^ '5'), (char) (cArr[47] ^ 22), (char) (cArr[48] ^ 'T'), (char) (cArr[139] ^ 'V'), (char) (cArr[209] ^ 5), (char) (cArr[185] ^ 17), (char) (cArr[80] ^ 21), (char) (cArr[43] ^ 3), (char) (cArr[185] ^ 29), (char) (cArr[24] ^ '.'), (char) (cArr[76] ^ '@'), (char) (cArr[212] ^ 'T'), (char) (cArr[120] ^ 'N')};
            return cArr;
        }

        private char[] e(int i) {
            char[] cArr = {(char) (cArr[6] ^ '?'), (char) (cArr[21] ^ 20), (char) (cArr[45] ^ 28), (char) (cArr[44] ^ '&'), (char) (cArr[39] ^ 'E'), (char) (cArr[2] ^ 3), (char) (cArr[5] ^ 2), (char) (cArr[40] ^ 1), (char) (cArr[29] ^ 5), (char) (cArr[34] ^ 29), (char) (cArr[1] ^ 17), (char) (cArr[40] ^ 11), (char) (cArr[14] ^ 'N'), (char) (cArr[39] ^ 4), (char) (cArr[21] ^ 15), (char) (cArr[28] ^ 'S'), (char) (cArr[48] ^ '%'), (char) (cArr[21] ^ 3), (char) (cArr[19] ^ 7), (char) (cArr[21] ^ 21), (char) (cArr[37] ^ '\n'), (char) (cArr[34] ^ 21), (char) (cArr[8] ^ 21), (char) (cArr[20] ^ 6), (char) (cArr[26] ^ 'L'), (char) (cArr[26] ^ 15), (char) (cArr[45] ^ 3), (char) (cArr[28] ^ 18), (char) (cArr[6] ^ 1), (char) (cArr[45] ^ 28), (char) (cArr[41] ^ 'D'), (char) (cArr[34] ^ 0), (char) (cArr[23] ^ 28), (char) (cArr[9] ^ '\b'), (char) (cArr[2] ^ 7), (char) (cArr[10] ^ 'D'), (char) (cArr[40] ^ 11), (char) (cArr[40] ^ 22), (char) (cArr[32] ^ 28), (char) (cArr[9] ^ '\f'), (char) ((-21926) ^ i), (char) (cArr[39] ^ 1), (char) (cArr[24] ^ 'S'), (char) (cArr[1] ^ 'U'), (char) (cArr[31] ^ '&'), (char) (cArr[11] ^ '\n'), (char) (cArr[40] ^ 1), (char) (cArr[29] ^ 30), (char) (cArr[45] ^ '+'), (char) (cArr[19] ^ 21), (char) (cArr[10] ^ 16), (char) (cArr[47] ^ '\f'), (char) (cArr[11] ^ 7), (char) (cArr[24] ^ 'A'), (char) (cArr[45] ^ 28), (char) (cArr[21] ^ 4)};
            return cArr;
        }

        private char[] f(int i) {
            char[] cArr = {(char) (cArr[24] ^ '-'), (char) (cArr[34] ^ 4), (char) (cArr[6] ^ 'N'), (char) (cArr[59] ^ 29), (char) (cArr[59] ^ 28), (char) (cArr[52] ^ 'T'), (char) (cArr[55] ^ 'T'), (char) (cArr[30] ^ 2), (char) (cArr[39] ^ 'R'), (char) (cArr[1] ^ 4), (char) (cArr[44] ^ 15), (char) (cArr[52] ^ 'T'), (char) (cArr[53] ^ 1), (char) (cArr[1] ^ 'A'), (char) (cArr[38] ^ 19), (char) (cArr[17] ^ 26), (char) (cArr[51] ^ '\r'), (char) (cArr[25] ^ '\b'), (char) (cArr[55] ^ 'Y'), (char) (cArr[26] ^ 'C'), (char) (cArr[40] ^ '\r'), (char) (cArr[1] ^ 14), (char) (cArr[60] ^ 22), (char) (cArr[24] ^ 7), (char) (cArr[60] ^ 11), (char) (cArr[21] ^ '\b'), (char) (cArr[27] ^ 'D'), (char) (cArr[34] ^ 1), (char) (cArr[4] ^ 14), (char) (cArr[46] ^ 25), (char) (cArr[1] ^ 0), (char) (cArr[54] ^ 3), (char) (cArr[4] ^ 14), (char) (cArr[4] ^ 28), (char) (cArr[38] ^ 23), (char) (cArr[18] ^ '\r'), (char) (cArr[38] ^ 20), (char) (cArr[34] ^ '\n'), (char) (14501 ^ i), (char) (cArr[59] ^ 'S'), (char) (cArr[27] ^ 5), (char) (cArr[42] ^ 'N'), (char) (cArr[4] ^ 'O'), (char) (cArr[0] ^ '*'), (char) (cArr[59] ^ 29), (char) (cArr[27] ^ 'I'), (char) (cArr[39] ^ 'M'), (char) (cArr[25] ^ 2), (char) (cArr[57] ^ 15), (char) (cArr[20] ^ 3), (char) (cArr[25] ^ 21), (char) (cArr[53] ^ 29), (char) (cArr[36] ^ 'F'), (char) (cArr[42] ^ 'D'), (char) (cArr[38] ^ 19), (char) (cArr[34] ^ 17), (char) (cArr[14] ^ 0), (char) (cArr[27] ^ 6), (char) (cArr[25] ^ 6), (char) (cArr[21] ^ 28), (char) (cArr[20] ^ '\t'), (char) (cArr[54] ^ 'O')};
            return cArr;
        }

        private char[] g(int i) {
            char[] cArr = {(char) (cArr[9] ^ ','), (char) (cArr[23] ^ 21), (char) (cArr[30] ^ 28), (char) (cArr[25] ^ 22), (char) (cArr[8] ^ 29), (char) (cArr[19] ^ 'T'), (char) (cArr[31] ^ 0), (char) (cArr[30] ^ 2), (char) (cArr[33] ^ 26), (char) (cArr[38] ^ 27), (char) (cArr[39] ^ 23), (char) (cArr[30] ^ 27), (char) (cArr[17] ^ '\b'), (char) (cArr[44] ^ 'K'), (char) (cArr[7] ^ 'P'), (char) (cArr[22] ^ 0), (char) (cArr[31] ^ 'U'), (char) (cArr[16] ^ 25), (char) (cArr[38] ^ 24), (char) (cArr[22] ^ 'N'), (char) (cArr[12] ^ 7), (char) (cArr[14] ^ 'O'), (char) (cArr[31] ^ 'N'), (char) (cArr[30] ^ 6), (char) (cArr[17] ^ '\t'), (char) (cArr[18] ^ 20), (char) (cArr[6] ^ 'T'), (char) (cArr[41] ^ 'A'), (char) (cArr[14] ^ 'F'), (char) (cArr[43] ^ '\n'), (char) ((-8584) ^ i), (char) (cArr[30] ^ 'R'), (char) (cArr[36] ^ 16), (char) (cArr[13] ^ '\r'), (char) (cArr[36] ^ 1), (char) (cArr[41] ^ 'A'), (char) (cArr[17] ^ '\b'), (char) (cArr[0] ^ '\"'), (char) (cArr[30] ^ 6), (char) (cArr[38] ^ 21), (char) (cArr[13] ^ 7), (char) (cArr[7] ^ 17), (char) (cArr[43] ^ 22), (char) (cArr[22] ^ 11), (char) (cArr[38] ^ 'Z')};
            return cArr;
        }

        public a<T> a(b bVar) {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            this.d.add(bVar);
            return this;
        }

        public a<T> b(kl... klVarArr) {
            if (this.v == null) {
                this.v = new HashSet();
            }
            for (kl klVar : klVarArr) {
                this.v.add(Integer.valueOf(klVar.a));
                this.v.add(Integer.valueOf(klVar.b));
            }
            this.t.b(klVarArr);
            return this;
        }

        public a<T> c() {
            this.m = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public T d() {
            Executor executor;
            if (this.c != null) {
                if (this.a != null) {
                    Executor executor2 = this.j;
                    if (executor2 == null && this.k == null) {
                        Executor c = w3.c();
                        this.k = c;
                        this.j = c;
                    } else if (executor2 != null && this.k == null) {
                        this.k = executor2;
                    } else if (executor2 == null && (executor = this.k) != null) {
                        this.j = executor;
                    }
                    Set<Integer> set = this.v;
                    if (set != null && this.u != null) {
                        for (Integer num : set) {
                            if (this.u.contains(num)) {
                                throw new IllegalArgumentException(new String(d((1269021016 ^ 1261081827) + 77)).intern() + num);
                            }
                        }
                    }
                    kk kkVar = this.l;
                    if (kkVar == null) {
                        kkVar = new im();
                    }
                    long j = this.r;
                    if (j > 0) {
                        if (this.b != null) {
                            kkVar = new kk(kkVar, new ik(j, this.s, this.k));
                        } else {
                            throw new IllegalArgumentException(new String(f(1203268464 + 844221685 + 114)).intern());
                        }
                    }
                    String str = this.w;
                    if (str != null || this.x != null || this.y != null) {
                        if (this.b != null) {
                            int i = str == null ? 0 : 1;
                            File file = this.x;
                            int i2 = i + (file == null ? 0 : 1);
                            Callable<InputStream> callable = this.y;
                            if (i2 + (callable != null ? 1 : 0) == 1) {
                                kkVar = new gl(str, file, callable, kkVar);
                            } else {
                                throw new IllegalArgumentException(new String(a((26685536 ^ 1099399236) + 110)).intern());
                            }
                        } else {
                            throw new IllegalArgumentException(new String(c((634124741 ^ 1856971631) + 48)).intern());
                        }
                    }
                    f fVar = this.f;
                    xk xkVar = fVar != null ? new xk(kkVar, fVar, this.g) : kkVar;
                    Context context = this.c;
                    lk lkVar = new lk(context, this.b, xkVar, this.t, this.d, this.m, this.n.b(context), this.j, this.k, this.o, this.p, this.q, this.u, this.w, this.x, this.y, this.e, this.h, this.i);
                    T t = (T) al.b(this.a, new String(b((741434570 - 326027168) - 68)).intern());
                    t.o(lkVar);
                    return t;
                }
                throw new IllegalArgumentException(new String(e((955706753 - (-315735327)) - 108)).intern());
            }
            throw new IllegalArgumentException(new String(g((1445015196 - 1244221641) + 55)).intern());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bl$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        static {
            C0095z.a();
        }

        public void a(bm bmVar) {
        }

        public void b(bm bmVar) {
        }

        public void c(bm bmVar) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bl$c */
    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        static {
            C0095z.a();
        }

        public static boolean a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return xl.b(activityManager);
            }
            return false;
        }

        public c b(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT >= 16 && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && !a(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bl$d */
    /* loaded from: classes.dex */
    public static class d {
        public HashMap<Integer, TreeMap<Integer, kl>> a = new HashMap<>();

        static {
            C0095z.a();
        }

        public final void a(kl klVar) {
            int i = klVar.a;
            int i2 = klVar.b;
            TreeMap<Integer, kl> treeMap = this.a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.a.put(Integer.valueOf(i), treeMap);
            }
            kl klVar2 = treeMap.get(Integer.valueOf(i2));
            if (klVar2 != null) {
                StringBuilder sb = new StringBuilder();
                char[] cArr = {(char) (cArr[1] ^ '9'), (char) (cArr[12] ^ 31), (char) (cArr[3] ^ 23), (char) (cArr[8] ^ 28), (char) (cArr[15] ^ 19), (char) (cArr[2] ^ '\f'), (char) (cArr[10] ^ 'D'), (char) (cArr[15] ^ '\b'), (char) (cArr[9] ^ '\t'), (char) (cArr[6] ^ 3), (char) (cArr[7] ^ 'I'), (char) (cArr[18] ^ 2), (char) (cArr[10] ^ 'I'), (char) (cArr[10] ^ 'G'), (char) (cArr[17] ^ 27), (char) ((-4239) ^ (-4336)), (char) (cArr[8] ^ 26), (char) (cArr[7] ^ 0), (char) (cArr[7] ^ 6), (char) (cArr[8] ^ 0), (char) (cArr[7] ^ 'I')};
                sb.append(new String(cArr).intern());
                sb.append(klVar2);
                char[] cArr2 = {(char) (cArr2[2] ^ 'I'), (char) (cArr2[3] ^ 3), (char) (cArr2[5] ^ 'I'), (char) (cArr2[5] ^ 'T'), (char) (cArr2[3] ^ 28), (char) (16796 ^ 16828)};
                sb.append(new String(cArr2).intern());
                sb.append(klVar);
                String sb2 = sb.toString();
                char[] cArr3 = {(char) (cArr3[2] ^ 29), (char) (14366 ^ 14417), (char) (cArr3[1] ^ 0), (char) (cArr3[1] ^ 2)};
                Log.w(new String(cArr3).intern(), sb2);
            }
            treeMap.put(Integer.valueOf(i2), klVar);
        }

        public void b(kl... klVarArr) {
            for (kl klVar : klVarArr) {
                a(klVar);
            }
        }

        public List<kl> c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i2 > i, i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<defpackage.kl> d(java.util.List<defpackage.kl> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L5a
                goto L7
            L5:
                if (r9 <= r10) goto L5a
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, kl>> r0 = r6.a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L56
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = r4
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                kl r9 = (defpackage.kl) r9
                r7.add(r9)
                r9 = r3
                goto L57
            L56:
                r4 = r5
            L57:
                if (r4 != 0) goto L0
                return r1
            L5a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public Map<Integer, Map<Integer, kl>> e() {
            return Collections.unmodifiableMap(this.a);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bl$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract void a(bm bmVar);
    }

    /* compiled from: AxisPay */
    /* renamed from: bl$f */
    /* loaded from: classes.dex */
    public interface f {
        void a(String str, List<Object> list);
    }

    static {
        C0095z.a();
    }

    public bl() {
        Collections.synchronizedMap(new HashMap());
        this.d = e();
        this.k = new HashMap();
        this.g = new HashMap();
    }

    public static boolean s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Object v(bm bmVar) {
        p();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ Object x(bm bmVar) {
        q();
        return null;
    }

    @Deprecated
    public void A() {
        this.c.K().D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T B(Class<T> cls, cm cmVar) {
        if (cls.isInstance(cmVar)) {
            return cmVar;
        }
        if (cmVar instanceof mk) {
            return (T) B(cls, ((mk) cmVar).getDelegate());
        }
        return null;
    }

    public void a() {
        if (!this.e && s()) {
            throw new IllegalStateException(C0059ao.a(2243));
        }
    }

    public void b() {
        if (!n() && this.j.get() != null) {
            throw new IllegalStateException(C0059ao.a(2244));
        }
    }

    @Deprecated
    public void c() {
        a();
        ik ikVar = this.i;
        if (ikVar == null) {
            p();
        } else {
            ikVar.c(new b4() { // from class: ck
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return bl.this.v((bm) obj);
                }
            });
        }
    }

    public fm d(String str) {
        a();
        b();
        return this.c.K().n(str);
    }

    public abstract tk e();

    public abstract cm f(lk lkVar);

    @Deprecated
    public void g() {
        ik ikVar = this.i;
        if (ikVar == null) {
            q();
        } else {
            ikVar.c(new b4() { // from class: dk
                @Override // defpackage.b4
                public final Object apply(Object obj) {
                    return bl.this.x((bm) obj);
                }
            });
        }
    }

    public List<kl> h(Map<Class<? extends jl>, jl> map) {
        return Collections.emptyList();
    }

    public Lock i() {
        return this.h.readLock();
    }

    public cm j() {
        return this.c;
    }

    public Executor k() {
        return this.b;
    }

    public Set<Class<? extends jl>> l() {
        return Collections.emptySet();
    }

    public Map<Class<?>, List<Class<?>>> m() {
        return Collections.emptyMap();
    }

    public boolean n() {
        return this.c.K().v();
    }

    public void o(lk lkVar) {
        this.c = f(lkVar);
        Set<Class<? extends jl>> l = l();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends jl>> it = l.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class<? extends jl> next = it.next();
                int size = lkVar.h.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (next.isAssignableFrom(lkVar.h.get(size).getClass())) {
                        bitSet.set(size);
                        i = size;
                        break;
                    } else {
                        size--;
                    }
                }
                if (i >= 0) {
                    this.g.put(next, lkVar.h.get(i));
                } else {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = {(char) (cArr[15] ^ 'a'), (char) (cArr[10] ^ 0), (char) (cArr[11] ^ 19), (char) (29378 ^ 29351), (char) (cArr[8] ^ 20), (char) (cArr[9] ^ 17), (char) (cArr[28] ^ '\f'), (char) (cArr[26] ^ 1), (char) (cArr[13] ^ 17), (char) (cArr[3] ^ 1), (char) (cArr[15] ^ 0), (char) (cArr[9] ^ 5), (char) (cArr[14] ^ 26), (char) (cArr[9] ^ 16), (char) (cArr[5] ^ 26), (char) (cArr[3] ^ 'E'), (char) (cArr[11] ^ '\f'), (char) (cArr[9] ^ '\r'), (char) (cArr[29] ^ 4), (char) (cArr[24] ^ 28), (char) (cArr[31] ^ 'I'), (char) (cArr[20] ^ 21), (char) (cArr[2] ^ 27), (char) (cArr[25] ^ 'O'), (char) (cArr[31] ^ 'F'), (char) (cArr[13] ^ 'T'), (char) (cArr[24] ^ 29), (char) (cArr[16] ^ 29), (char) (cArr[26] ^ 22), (char) (cArr[23] ^ '\f'), (char) (cArr[10] ^ 0), (char) (cArr[3] ^ 'M')};
                    sb.append(new String(cArr).intern());
                    sb.append(next.getCanonicalName());
                    char[] cArr2 = {(char) (cArr2[11] ^ 'N'), (char) (cArr2[3] ^ 'S'), (char) (cArr2[11] ^ 14), (char) (cArr2[30] ^ 28), (char) (cArr2[20] ^ 'D'), (char) (cArr2[1] ^ 'M'), (char) (cArr2[10] ^ 7), (char) (cArr2[22] ^ 7), (char) (cArr2[24] ^ 17), (char) (cArr2[11] ^ 14), (char) (cArr2[24] ^ '\f'), (char) ((-3150) ^ (-3115)), (char) (cArr2[2] ^ 'I'), (char) (cArr2[2] ^ 0), (char) (cArr2[39] ^ 7), (char) (cArr2[32] ^ 'F'), (char) (cArr2[12] ^ 'T'), (char) (cArr2[3] ^ 27), (char) (cArr2[11] ^ 2), (char) (cArr2[39] ^ 'I'), (char) (cArr2[30] ^ 11), (char) (cArr2[35] ^ 20), (char) (cArr2[0] ^ ']'), (char) (cArr2[31] ^ 15), (char) (cArr2[39] ^ 11), (char) (cArr2[1] ^ 'A'), (char) (cArr2[24] ^ 17), (char) (cArr2[0] ^ 'L'), (char) (cArr2[29] ^ 'C'), (char) (cArr2[10] ^ '\r'), (char) (cArr2[2] ^ 6), (char) (cArr2[11] ^ '\t'), (char) (cArr2[30] ^ '\t'), (char) (cArr2[39] ^ 0), (char) (cArr2[1] ^ 'G'), (char) (cArr2[20] ^ 17), (char) (cArr2[6] ^ 27), (char) (cArr2[42] ^ 'O'), (char) (cArr2[3] ^ 7), (char) (cArr2[11] ^ 14), (char) (cArr2[17] ^ 7), (char) (cArr2[21] ^ 15), (char) (cArr2[24] ^ 'L')};
                    sb.append(new String(cArr2).intern());
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                for (int size2 = lkVar.h.size() - 1; size2 >= 0; size2--) {
                    if (!bitSet.get(size2)) {
                        char[] cArr3 = {(char) (cArr3[145] ^ '\''), (char) (cArr3[3] ^ 22), (char) (cArr3[93] ^ 0), (char) (cArr3[91] ^ 17), (char) (cArr3[24] ^ 30), (char) (cArr3[151] ^ 0), (char) (cArr3[116] ^ '\f'), (char) (cArr3[76] ^ 0), (char) (cArr3[124] ^ '\n'), (char) (cArr3[81] ^ 19), (char) (cArr3[108] ^ 's'), (char) (cArr3[151] ^ 4), (char) (cArr3[109] ^ 5), (char) (cArr3[26] ^ 7), (char) (cArr3[152] ^ 'O'), (char) (cArr3[116] ^ 'O'), (char) (cArr3[159] ^ 31), (char) (cArr3[42] ^ 6), (char) (cArr3[109] ^ 23), (char) (cArr3[132] ^ 23), (char) (cArr3[142] ^ 2), (char) (cArr3[127] ^ 6), (char) (cArr3[3] ^ 17), (char) (cArr3[114] ^ 1), (char) (cArr3[79] ^ 0), (char) (cArr3[11] ^ 'A'), (char) (cArr3[112] ^ 'S'), (char) (cArr3[15] ^ 'P'), (char) (cArr3[73] ^ 11), (char) (cArr3[74] ^ 23), (char) (cArr3[14] ^ 28), (char) (cArr3[41] ^ 'N'), (char) (cArr3[147] ^ 11), (char) (cArr3[88] ^ 29), (char) (cArr3[138] ^ 'U'), (char) (cArr3[152] ^ 'N'), (char) (cArr3[135] ^ '\f'), (char) (cArr3[5] ^ 'K'), (char) (cArr3[157] ^ 'D'), (char) (cArr3[114] ^ '/'), (char) (cArr3[152] ^ 'N'), (char) (cArr3[116] ^ 1), (char) (cArr3[138] ^ 'O'), (char) (cArr3[6] ^ 23), (char) (cArr3[57] ^ 21), (char) (cArr3[60] ^ 26), (char) (cArr3[116] ^ '\n'), (char) (cArr3[131] ^ 'V'), (char) (cArr3[62] ^ '1'), (char) (cArr3[106] ^ 26), (char) (cArr3[43] ^ 0), (char) (cArr3[147] ^ 2), (char) (cArr3[51] ^ '\"'), (char) (cArr3[110] ^ '\f'), (char) (cArr3[61] ^ '4'), (char) (cArr3[34] ^ 7), (char) (cArr3[40] ^ 15), (char) (cArr3[3] ^ '\f'), (char) (cArr3[14] ^ 6), (char) (cArr3[152] ^ 'O'), (char) (cArr3[91] ^ 7), (char) (cArr3[155] ^ ':'), (char) (cArr3[59] ^ 31), (char) (cArr3[86] ^ '%'), (char) (cArr3[107] ^ '\r'), (char) (cArr3[83] ^ 'T'), (char) (cArr3[74] ^ 29), (char) (cArr3[73] ^ 3), (char) (cArr3[26] ^ 3), (char) (cArr3[15] ^ 'L'), (char) (cArr3[111] ^ 6), (char) (cArr3[107] ^ 3), (char) (cArr3[35] ^ 11), (char) (cArr3[86] ^ '.'), (char) (cArr3[109] ^ 4), (char) (cArr3[32] ^ 7), (char) (cArr3[116] ^ 27), (char) (cArr3[132] ^ '\f'), (char) (cArr3[141] ^ '\n'), (char) (cArr3[92] ^ '\n'), (char) (cArr3[43] ^ 'T'), (char) (cArr3[69] ^ 27), (char) (cArr3[11] ^ '\b'), (char) (cArr3[121] ^ 27), (char) (cArr3[38] ^ 'H'), (char) (cArr3[24] ^ 'N'), (char) (cArr3[88] ^ '2'), (char) (cArr3[68] ^ ' '), (char) (cArr3[14] ^ 29), (char) (cArr3[58] ^ 6), (char) (cArr3[74] ^ 2), (char) (cArr3[40] ^ 7), (char) (cArr3[152] ^ 'D'), (char) (cArr3[138] ^ 'E'), (char) (cArr3[116] ^ 11), (char) (cArr3[111] ^ '\"'), (char) (cArr3[147] ^ 24), (char) (cArr3[152] ^ 'T'), (char) (cArr3[79] ^ 1), (char) (cArr3[60] ^ '#'), (char) (cArr3[43] ^ 29), (char) (cArr3[114] ^ '\t'), (char) (cArr3[59] ^ 29), (char) (cArr3[35] ^ 15), (char) (cArr3[34] ^ 1), (char) (cArr3[96] ^ 28), (char) (cArr3[62] ^ 31), (char) (cArr3[147] ^ 3), (char) (cArr3[97] ^ '\''), (char) (cArr3[40] ^ 30), (char) (cArr3[121] ^ '\n'), (char) (cArr3[116] ^ '\f'), (char) (cArr3[15] ^ 0), (char) (cArr3[147] ^ '\f'), (char) (cArr3[105] ^ 7), (char) (cArr3[59] ^ 1), (char) (cArr3[147] ^ 2), (char) (cArr3[3] ^ '\f'), (char) (cArr3[76] ^ 21), (char) (cArr3[113] ^ 21), (char) (cArr3[36] ^ '\r'), (char) (cArr3[59] ^ 0), (char) (cArr3[147] ^ 3), (char) (cArr3[157] ^ 'D'), (char) (cArr3[15] ^ 'O'), (char) (cArr3[41] ^ 28), (char) (cArr3[92] ^ 'D'), (char) (cArr3[65] ^ 'R'), (char) (cArr3[58] ^ '\f'), (char) (cArr3[97] ^ 25), (char) (cArr3[68] ^ 31), (char) (cArr3[20] ^ 23), (char) (cArr3[135] ^ '\r'), (char) (cArr3[33] ^ 'O'), (char) (cArr3[48] ^ '5'), (char) (cArr3[155] ^ 1), (char) (cArr3[40] ^ 7), (char) (cArr3[97] ^ 7), (char) (cArr3[124] ^ 'O'), (char) (cArr3[130] ^ 28), (char) (cArr3[36] ^ 20), (char) (cArr3[152] ^ 'E'), (char) (cArr3[125] ^ 17), (char) (cArr3[36] ^ 'D'), (char) (cArr3[28] ^ 3), (char) (cArr3[124] ^ 29), (char) (cArr3[86] ^ '/'), (char) (cArr3[97] ^ 25), (char) (cArr3[51] ^ 'O'), (char) (cArr3[142] ^ 23), (char) (cArr3[79] ^ 6), (char) (cArr3[129] ^ '\b'), (char) (23419 ^ 23387), (char) (cArr3[35] ^ '\f'), (char) (cArr3[34] ^ 0), (char) (cArr3[92] ^ '\r'), (char) (cArr3[40] ^ 2), (char) (cArr3[138] ^ 'D'), (char) (cArr3[105] ^ '\f'), (char) (cArr3[112] ^ 'R'), (char) (cArr3[24] ^ '@')};
                        throw new IllegalArgumentException(new String(cArr3).intern());
                    }
                }
                Iterator<kl> it2 = h(this.g).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    kl next2 = it2.next();
                    if (!lkVar.d.e().containsKey(Integer.valueOf(next2.a))) {
                        lkVar.d.b(next2);
                    }
                }
                fl flVar = (fl) B(fl.class, this.c);
                if (flVar != null) {
                    flVar.m(lkVar);
                }
                jk jkVar = (jk) B(jk.class, this.c);
                if (jkVar != null) {
                    ik b2 = jkVar.b();
                    this.i = b2;
                    this.d.k(b2);
                }
                if (Build.VERSION.SDK_INT >= 16) {
                    this.c.setWriteAheadLoggingEnabled(lkVar.j == c.WRITE_AHEAD_LOGGING);
                }
                this.f = lkVar.e;
                this.b = lkVar.k;
                new il(lkVar.l);
                this.e = lkVar.i;
                Intent intent = lkVar.n;
                if (intent != null) {
                    this.d.l(lkVar.b, lkVar.c, intent);
                }
                Map<Class<?>, List<Class<?>>> m = m();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : m.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = lkVar.g.size() - 1;
                        while (true) {
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            } else if (cls.isAssignableFrom(lkVar.g.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                size3--;
                            }
                        }
                        if (size3 >= 0) {
                            this.k.put(cls, lkVar.g.get(size3));
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            char[] cArr4 = {(char) (cArr4[22] ^ '5'), (char) (cArr4[17] ^ 'O'), (char) (cArr4[19] ^ 4), (char) (cArr4[11] ^ 17), (char) (cArr4[8] ^ 20), (char) (cArr4[25] ^ 'U'), (char) (cArr4[16] ^ '\n'), (char) (cArr4[2] ^ 0), (char) (cArr4[25] ^ 'E'), (char) (cArr4[8] ^ 1), (char) (cArr4[7] ^ 'R'), (char) (cArr4[2] ^ 6), (char) (cArr4[25] ^ 'Y'), (char) (cArr4[11] ^ 4), (char) (cArr4[24] ^ 23), (char) (cArr4[16] ^ 'C'), (char) (22212 ^ 22183), (char) (cArr4[22] ^ 27), (char) (cArr4[3] ^ 11), (char) (cArr4[16] ^ 21), (char) (cArr4[19] ^ 19), (char) (cArr4[2] ^ 0), (char) (cArr4[15] ^ 'T'), (char) (cArr4[24] ^ 23), (char) (cArr4[20] ^ 23), (char) (cArr4[7] ^ 'R'), (char) (cArr4[21] ^ 'Z')};
                            sb2.append(new String(cArr4).intern());
                            sb2.append(cls);
                            char[] cArr5 = {(char) (cArr5[2] ^ 'O'), (char) (cArr5[3] ^ 'O'), (char) (5087 ^ 5049), (char) (cArr5[2] ^ '\t'), (char) (cArr5[2] ^ 20), (char) (cArr5[2] ^ 'F')};
                            sb2.append(new String(cArr5).intern());
                            sb2.append(key.getCanonicalName());
                            char[] cArr6 = {(char) (7160 ^ 7128), (char) (cArr6[27] ^ 'I'), (char) (cArr6[34] ^ 6), (char) (cArr6[16] ^ 'H'), (char) (cArr6[16] ^ 5), (char) (cArr6[36] ^ '\b'), (char) (cArr6[16] ^ 27), (char) (cArr6[40] ^ 29), (char) (cArr6[35] ^ 27), (char) (cArr6[20] ^ 15), (char) (cArr6[25] ^ 20), (char) (cArr6[3] ^ 0), (char) (cArr6[16] ^ 1), (char) (cArr6[28] ^ '\r'), (char) (cArr6[11] ^ 0), (char) (cArr6[20] ^ 21), (char) (cArr6[28] ^ 11), (char) (cArr6[12] ^ '\f'), (char) (cArr6[16] ^ 'H'), (char) (cArr6[25] ^ 23), (char) (cArr6[27] ^ 'A'), (char) (cArr6[28] ^ 23), (char) (cArr6[7] ^ 18), (char) (cArr6[6] ^ 17), (char) (cArr6[6] ^ 18), (char) (cArr6[0] ^ 'S'), (char) (cArr6[17] ^ 0), (char) (cArr6[0] ^ 0), (char) (cArr6[0] ^ 'C'), (char) (cArr6[12] ^ 6), (char) (cArr6[17] ^ 11), (char) (cArr6[35] ^ 20), (char) (cArr6[25] ^ 26), (char) (cArr6[30] ^ '\t'), (char) (cArr6[27] ^ 'U'), (char) (cArr6[17] ^ 23), (char) (cArr6[6] ^ 18), (char) (cArr6[28] ^ 23), (char) (cArr6[30] ^ 7), (char) (cArr6[0] ^ 'O'), (char) (cArr6[17] ^ 11), (char) (cArr6[36] ^ 'O')};
                            sb2.append(new String(cArr6).intern());
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                }
                for (int size4 = lkVar.g.size() - 1; size4 >= 0; size4--) {
                    if (!bitSet2.get(size4)) {
                        Object obj = lkVar.g.get(size4);
                        StringBuilder sb3 = new StringBuilder();
                        char[] cArr7 = {(char) (cArr7[4] ^ '%'), (char) (cArr7[4] ^ 30), (char) (cArr7[7] ^ 17), (char) (cArr7[8] ^ 29), (char) (25096 ^ 25208), (char) (cArr7[18] ^ 11), (char) (cArr7[5] ^ 6), (char) (cArr7[4] ^ 4), (char) (cArr7[4] ^ 21), (char) (cArr7[24] ^ 22), (char) (cArr7[5] ^ 'E'), (char) (cArr7[24] ^ 6), (char) (cArr7[19] ^ 15), (char) (cArr7[20] ^ 21), (char) (cArr7[9] ^ 1), (char) (cArr7[20] ^ 'E'), (char) (cArr7[4] ^ 19), (char) (cArr7[5] ^ '\n'), (char) (cArr7[4] ^ 30), (char) (cArr7[13] ^ 6), (char) (cArr7[8] ^ 0), (char) (cArr7[16] ^ 17), (char) (cArr7[20] ^ 17), (char) (cArr7[2] ^ 0), (char) (cArr7[16] ^ 17), (char) (cArr7[4] ^ 'P')};
                        sb3.append(new String(cArr7).intern());
                        sb3.append(obj);
                        char[] cArr8 = {(char) (cArr8[102] ^ 'K'), (char) (cArr8[17] ^ 'N'), (char) (cArr8[19] ^ '$'), (char) (cArr8[109] ^ 11), (char) (cArr8[50] ^ 1), (char) (cArr8[15] ^ ','), (char) (cArr8[2] ^ '5'), (char) (cArr8[2] ^ ' '), (char) (cArr8[69] ^ 'T'), (char) (cArr8[8] ^ 17), (char) (cArr8[109] ^ 'E'), (char) (cArr8[62] ^ ';'), (char) (cArr8[77] ^ 15), (char) (cArr8[18] ^ 6), (char) (cArr8[63] ^ 17), (char) (cArr8[40] ^ '5'), (char) (cArr8[67] ^ 0), (char) (cArr8[24] ^ 'N'), (char) (cArr8[19] ^ 19), (char) (cArr8[24] ^ 'E'), (char) (cArr8[30] ^ 'R'), (char) (cArr8[81] ^ 28), (char) (cArr8[97] ^ '\n'), (char) (cArr8[96] ^ 0), (char) ((-10871) ^ (-10839)), (char) (cArr8[6] ^ 23), (char) (cArr8[17] ^ 2), (char) (cArr8[34] ^ '\t'), (char) (cArr8[17] ^ 29), (char) (cArr8[54] ^ 1), (char) (cArr8[96] ^ 'R'), (char) (cArr8[48] ^ 18), (char) (cArr8[39] ^ 6), (char) (cArr8[10] ^ 'T'), (char) (cArr8[78] ^ '\r'), (char) (cArr8[87] ^ 'N'), (char) (cArr8[72] ^ '`'), (char) (cArr8[107] ^ '<'), (char) (cArr8[59] ^ 19), (char) (cArr8[69] ^ 'O'), (char) (cArr8[20] ^ 4), (char) (cArr8[0] ^ 'G'), (char) (cArr8[96] ^ 22), (char) (cArr8[60] ^ 11), (char) (cArr8[106] ^ '\r'), (char) (cArr8[2] ^ 21), (char) (cArr8[90] ^ 11), (char) (cArr8[70] ^ 31), (char) (cArr8[19] ^ 0), (char) (cArr8[60] ^ '-'), (char) (cArr8[36] ^ '/'), (char) (cArr8[43] ^ 11), (char) (cArr8[82] ^ 31), (char) (cArr8[48] ^ 0), (char) (cArr8[31] ^ 5), (char) (cArr8[24] ^ 'T'), (char) (cArr8[16] ^ '\n'), (char) (cArr8[58] ^ 'R'), (char) (cArr8[20] ^ 'R'), (char) (cArr8[60] ^ 15), (char) (cArr8[8] ^ 26), (char) (cArr8[13] ^ 30), (char) (cArr8[75] ^ 2), (char) (cArr8[70] ^ 27), (char) (cArr8[17] ^ 15), (char) (cArr8[89] ^ 17), (char) (cArr8[19] ^ '\f'), (char) (cArr8[102] ^ '\n'), (char) (cArr8[80] ^ 26), (char) (cArr8[24] ^ 0), (char) (cArr8[19] ^ '\n'), (char) (cArr8[31] ^ 5), (char) (cArr8[48] ^ 'E'), (char) (cArr8[62] ^ 29), (char) (cArr8[69] ^ 'E'), (char) (cArr8[76] ^ 2), (char) (cArr8[8] ^ 27), (char) (cArr8[106] ^ 31), (char) (cArr8[66] ^ '\f'), (char) (cArr8[70] ^ 'O'), (char) (cArr8[8] ^ 0), (char) (cArr8[8] ^ 28), (char) (cArr8[17] ^ 7), (char) (cArr8[106] ^ 26), (char) (cArr8[79] ^ 0), (char) (cArr8[31] ^ 20), (char) (cArr8[75] ^ 2), (char) (cArr8[13] ^ 30), (char) (cArr8[23] ^ 4), (char) (cArr8[8] ^ 17), (char) (cArr8[74] ^ 23), (char) (cArr8[97] ^ 27), (char) (cArr8[18] ^ 19), (char) (cArr8[107] ^ 30), (char) (cArr8[72] ^ 0), (char) (cArr8[90] ^ 20), (char) (cArr8[69] ^ 'R'), (char) (cArr8[101] ^ 7), (char) (cArr8[51] ^ 3), (char) (cArr8[79] ^ 0), (char) (cArr8[102] ^ 17), (char) (cArr8[70] ^ 7), (char) (cArr8[92] ^ 0), (char) (cArr8[0] ^ 14), (char) (cArr8[63] ^ 22), (char) (cArr8[96] ^ 7), (char) (cArr8[105] ^ 28), (char) (cArr8[89] ^ '\t'), (char) (cArr8[71] ^ 22), (char) (cArr8[13] ^ 21), (char) (cArr8[48] ^ 23), (char) (cArr8[96] ^ '\\')};
                        sb3.append(new String(cArr8).intern());
                        throw new IllegalArgumentException(sb3.toString());
                    }
                }
                return;
            }
        }
    }

    public final void p() {
        a();
        bm K = this.c.K();
        this.d.p(K);
        if (Build.VERSION.SDK_INT >= 16 && K.B()) {
            K.F();
        } else {
            K.d();
        }
    }

    public final void q() {
        this.c.K().c();
        if (n()) {
            return;
        }
        this.d.h();
    }

    public void r(bm bmVar) {
        this.d.e(bmVar);
    }

    public boolean t() {
        ik ikVar = this.i;
        if (ikVar != null) {
            return ikVar.g();
        }
        bm bmVar = this.a;
        return bmVar != null && bmVar.isOpen();
    }

    public Cursor y(em emVar) {
        return z(emVar, null);
    }

    public Cursor z(em emVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal != null && Build.VERSION.SDK_INT >= 16) {
            return this.c.K().u(emVar, cancellationSignal);
        }
        return this.c.K().p(emVar);
    }
}
