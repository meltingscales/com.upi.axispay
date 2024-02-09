package com.olive.upi.database;

import android.content.Context;
import defpackage.bl;
import myunmn.C0059ao;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class AppDatabase extends bl {
    public static final b l;
    public static volatile AppDatabase m;
    public static final kl n;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class a extends kl {
        static {
            C0095z.a();
        }

        public a() {
            super(1, 2);
        }

        @Override // defpackage.kl
        public void a(bm bmVar) {
            yl0.e(bmVar, C0059ao.a(9100));
            bmVar.i(C0059ao.a(9101));
            bmVar.i(C0059ao.a(9102));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class b {

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class a extends bl.b {
            static {
                C0095z.a();
            }

            @Override // defpackage.bl.b
            public void a(bm bmVar) {
                yl0.e(bmVar, C0059ao.a(8588));
                super.a(bmVar);
            }
        }

        static {
            C0095z.a();
        }

        public b() {
        }

        public /* synthetic */ b(vl0 vl0Var) {
            this();
        }

        public final AppDatabase a(Context context) {
            char[] cArr = {(char) (cArr[6] ^ '='), (char) (cArr[10] ^ 3), (char) (cArr[5] ^ '*'), (char) (cArr[1] ^ 26), (char) (cArr[9] ^ 17), (char) (cArr[10] ^ ','), (char) (cArr[1] ^ 30), (char) (cArr[8] ^ '\t'), (char) (cArr[4] ^ 21), (char) ((-24473) ^ (-24557)), (char) (cArr[9] ^ 27)};
            bl.a a2 = al.a(context, AppDatabase.class, new String(cArr).intern());
            a2.a(new a());
            a2.b(c());
            a2.c();
            bl d = a2.d();
            char[] cArr2 = {(char) (cArr2[35] ^ 'D'), (char) (cArr2[46] ^ '\r'), (char) (cArr2[37] ^ 'T'), (char) (cArr2[12] ^ 5), (char) (cArr2[22] ^ 22), (char) (cArr2[16] ^ 2), (char) (cArr2[18] ^ 29), (char) (cArr2[33] ^ 'E'), (char) (cArr2[5] ^ '#'), (char) (cArr2[44] ^ 0), (char) (cArr2[47] ^ '\r'), (char) (cArr2[38] ^ 'L'), (char) (cArr2[22] ^ 16), (char) (cArr2[23] ^ 'I'), (char) (cArr2[34] ^ 'R'), (char) (cArr2[37] ^ '\b'), (char) (cArr2[21] ^ 27), (char) (cArr2[6] ^ 28), (char) (cArr2[22] ^ 26), (char) (cArr2[11] ^ 24), (char) (cArr2[30] ^ 'E'), (char) (cArr2[45] ^ 17), (char) (10038 ^ 10050), (char) (cArr2[12] ^ 'H'), (char) (cArr2[5] ^ 8263), (char) (cArr2[31] ^ 0), (char) (cArr2[41] ^ 0), (char) (cArr2[33] ^ 0), (char) (cArr2[37] ^ 0), (char) (cArr2[4] ^ 'B'), (char) (cArr2[5] ^ 'A'), (char) (cArr2[16] ^ 'C'), (char) (cArr2[25] ^ 0), (char) (cArr2[18] ^ 'N'), (char) (cArr2[12] ^ 'D'), (char) (cArr2[18] ^ 'N'), (char) (cArr2[35] ^ 0), (char) (cArr2[21] ^ 'X'), (char) (cArr2[22] ^ 'T'), (char) (cArr2[40] ^ 0), (char) (cArr2[30] ^ 0), (char) (cArr2[14] ^ 'R'), (char) (cArr2[38] ^ 14), (char) (cArr2[24] ^ 8260), (char) (cArr2[22] ^ 1), (char) (cArr2[18] ^ 7), (char) (cArr2[41] ^ 'L'), (char) (cArr2[34] ^ 'D'), (char) (cArr2[17] ^ 'G'), (char) (cArr2[30] ^ '\t')};
            yl0.d(d, new String(cArr2).intern());
            return (AppDatabase) d;
        }

        public final AppDatabase b(Context context) {
            char[] cArr = {(char) (20905 ^ 20938), (char) (cArr[0] ^ '\f'), (char) (cArr[4] ^ 11), (char) (cArr[1] ^ 27), (char) (cArr[0] ^ 6), (char) (cArr[6] ^ '\f'), (char) (cArr[0] ^ 23)};
            yl0.e(context, new String(cArr).intern());
            AppDatabase appDatabase = AppDatabase.m;
            if (appDatabase == null) {
                synchronized (this) {
                    appDatabase = AppDatabase.m;
                    if (appDatabase == null) {
                        AppDatabase a2 = AppDatabase.l.a(context);
                        AppDatabase.m = a2;
                        appDatabase = a2;
                    }
                }
            }
            return appDatabase;
        }

        public final kl c() {
            return AppDatabase.n;
        }
    }

    static {
        C0095z.a();
        l = new b(null);
        n = new a();
    }

    public abstract k70 F();

    public abstract p70 G();
}