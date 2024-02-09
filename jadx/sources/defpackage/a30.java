package defpackage;

import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: a30  reason: default package */
/* loaded from: classes.dex */
public final class a30 implements c30 {

    /* compiled from: AxisPay */
    /* renamed from: a30$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[w20.values().length];
            a = iArr;
            try {
                iArr[w20.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[w20.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[w20.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[w20.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[w20.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[w20.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[w20.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[w20.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[w20.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[w20.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[w20.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[w20.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[w20.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // defpackage.c30
    public n30 a(String str, w20 w20Var, int i, int i2, Map<y20, ?> map) throws d30 {
        c30 r40Var;
        switch (a.a[w20Var.ordinal()]) {
            case 1:
                r40Var = new r40();
                break;
            case 2:
                r40Var = new z40();
                break;
            case 3:
                r40Var = new q40();
                break;
            case 4:
                r40Var = new v40();
                break;
            case 5:
                r40Var = new i50();
                break;
            case 6:
                r40Var = new m40();
                break;
            case 7:
                r40Var = new o40();
                break;
            case 8:
                r40Var = new k40();
                break;
            case 9:
                r40Var = new s40();
                break;
            case 10:
                r40Var = new a50();
                break;
            case 11:
                r40Var = new i40();
                break;
            case 12:
                r40Var = new s30();
                break;
            case 13:
                r40Var = new e30();
                break;
            default:
                throw new IllegalArgumentException(C0059ao.a(4687).concat(String.valueOf(w20Var)));
        }
        return r40Var.a(str, w20Var, i, i2, map);
    }
}
