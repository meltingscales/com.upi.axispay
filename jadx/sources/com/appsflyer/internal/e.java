package com.appsflyer.internal;

import com.google.android.gms.vision.barcode.Barcode;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class e {

    /* renamed from: ŀ  reason: contains not printable characters */
    public static byte[] f259;

    /* renamed from: ł  reason: contains not printable characters */
    private static Object f260;

    /* renamed from: ſ  reason: contains not printable characters */
    private static int f261;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private static int f262;

    /* renamed from: ƚ  reason: contains not printable characters */
    private static final byte[] f263 = null;

    /* renamed from: ȷ  reason: contains not printable characters */
    public static byte[] f264;

    /* renamed from: ɍ  reason: contains not printable characters */
    private static int f265;

    /* renamed from: ɺ  reason: contains not printable characters */
    private static int f266;

    /* renamed from: ɿ  reason: contains not printable characters */
    private static long f267;

    /* renamed from: ʅ  reason: contains not printable characters */
    private static byte[] f268;

    /* renamed from: ʟ  reason: contains not printable characters */
    private static int f269;

    /* renamed from: г  reason: contains not printable characters */
    private static Object f270;

    private static void $$a() {
        int i = f265;
        int i2 = (i & 75) + (i | 75);
        f266 = i2 % Barcode.ITF;
        int i3 = i2 % 2;
        byte[] bArr = new byte[912];
        System.arraycopy("\u001f^éIú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\tøøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000bú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ9Ã\u0003ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\tû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001ô\n\u0017í\b\t\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ9ÂL\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ8Ã\u0003ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006ú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes(C0059ao.a(11389)), 0, bArr, 0, 912);
        f263 = bArr;
        f262 = 155;
        int i4 = f266;
        int i5 = (i4 ^ 81) + ((i4 & 81) << 1);
        f265 = i5 % Barcode.ITF;
        if (!(i5 % 2 == 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    private static String $$c(short s, int i, short s2) {
        int i2 = f265;
        int i3 = (i2 & 105) + (i2 | 105);
        int i4 = i3 % Barcode.ITF;
        f266 = i4;
        int i5 = i3 % 2;
        int i6 = (921 - (~(-s2))) - 1;
        int i7 = (s ^ 50) + ((s & 50) << 1);
        int i8 = (i7 & (-49)) + (i7 | (-49));
        int i9 = -i;
        int i10 = (i9 ^ 893) + ((i9 & 893) << 1);
        byte[] bArr = f263;
        char[] cArr = new char[i8];
        int i11 = 0;
        int i12 = (i8 - 0) - 1;
        if ((bArr == null ? 'G' : 'T') != 'T') {
            int i13 = ((i4 | 67) << 1) - (i4 ^ 67);
            f265 = i13 % Barcode.ITF;
            if ((i13 % 2 != 0 ? '^' : (char) 30) == '^') {
                Object obj = null;
                super.hashCode();
            }
            int i14 = f266;
            int i15 = (i14 ^ 69) + ((i14 & 69) << 1);
            f265 = i15 % Barcode.ITF;
            int i16 = i15 % 2;
            int i17 = i10 + i12;
            int i18 = (i17 & (-3)) + (i17 | (-3));
            i10 = i10;
            i6 = i18;
            i12 = i12;
            bArr = bArr;
        }
        while (true) {
            cArr[i11] = (char) i6;
            int i19 = ((i11 | 1) << 1) - (i11 ^ 1);
            if (i11 == i12) {
                String str = new String(cArr);
                int i20 = f265 + 107;
                f266 = i20 % Barcode.ITF;
                int i21 = i20 % 2;
                return str;
            }
            int i22 = i10 + 1;
            byte b = bArr[i22];
            int i23 = f265;
            int i24 = ((i23 | 19) << 1) - (i23 ^ 19);
            f266 = i24 % Barcode.ITF;
            int i25 = i24 % 2;
            byte[] bArr2 = bArr;
            int i26 = i12;
            i11 = i19;
            int i27 = i6 + b;
            int i28 = (i27 & (-3)) + (i27 | (-3));
            i10 = i22;
            i6 = i28;
            i12 = i26;
            bArr = bArr2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:754|755|756|(1:18)(1:753)|(39:749|750|(0)(0)|(0)|747|(0)|28|29|(0)(0)|(0)(0)|35|(0)|(0)(0)|43|(0)|53|54|55|56|57|58|59|(0)(0)|62|(0)(0)|65|(0)(0)|68|69|(0)|718|76|77|78|(0)(0)|81|82|83|(3:(0)(0)|(0)(0)|96))|20|(0)(0)|(0)|747|(0)|28|29|(0)(0)|(0)(0)|35|(0)|(0)(0)|43|(0)|53|54|55|56|57|58|59|(0)(0)|62|(0)(0)|65|(0)(0)|68|69|(0)|718|76|77|78|(0)(0)|81|82|83|(3:(0)(0)|(0)(0)|96)) */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04b5, code lost:
        if (((java.lang.Boolean) r11.getMethod($$c(r3, (short) ((r26 ^ 5) + ((r26 & 5) << 1)), r8), null).invoke(r7, null)).booleanValue() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
        if ((r5 != null ? ')' : 15) != ')') goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x05c8, code lost:
        if (r10 == null) goto L671;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x05d3, code lost:
        if ((r10 != null) != true) goto L671;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x05d5, code lost:
        r3 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x05d7, code lost:
        if (r11 != null) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x05d9, code lost:
        r3 = r31 + 5;
        com.appsflyer.internal.e.f266 = r3 % com.google.android.gms.vision.barcode.Barcode.ITF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x05e1, code lost:
        if ((r3 % 2) != 0) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x05e3, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x05e5, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x05e7, code lost:
        if (r3 == true) goto L667;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x05e9, code lost:
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x05ec, code lost:
        if (r30 != null) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x05ee, code lost:
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05f0, code lost:
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0634, code lost:
        if (r24 != false) goto L611;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04c8 A[Catch: all -> 0x04ca, TryCatch #80 {all -> 0x04ca, blocks: (B:178:0x04c2, B:180:0x04c8, B:181:0x04c9), top: B:886:0x04c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04c9 A[Catch: all -> 0x04ca, TRY_LEAVE, TryCatch #80 {all -> 0x04ca, blocks: (B:178:0x04c2, B:180:0x04c8, B:181:0x04c9), top: B:886:0x04c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x12a8 A[Catch: all -> 0x0fa5, TRY_ENTER, TryCatch #57 {all -> 0x0fa5, blocks: (B:388:0x0b2c, B:651:0x12ac, B:654:0x1313, B:656:0x131b, B:664:0x1371, B:668:0x137c, B:669:0x1382, B:589:0x1060, B:610:0x10cc, B:612:0x10d2, B:613:0x10d3, B:629:0x115d, B:631:0x1163, B:632:0x1164, B:642:0x1287, B:649:0x12a8, B:621:0x1126, B:623:0x112c, B:624:0x112d, B:652:0x12fb), top: B:850:0x0b2c }] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x12ac A[Catch: all -> 0x0fa5, TRY_LEAVE, TryCatch #57 {all -> 0x0fa5, blocks: (B:388:0x0b2c, B:651:0x12ac, B:654:0x1313, B:656:0x131b, B:664:0x1371, B:668:0x137c, B:669:0x1382, B:589:0x1060, B:610:0x10cc, B:612:0x10d2, B:613:0x10d3, B:629:0x115d, B:631:0x1163, B:632:0x1164, B:642:0x1287, B:649:0x12a8, B:621:0x1126, B:623:0x112c, B:624:0x112d, B:652:0x12fb), top: B:850:0x0b2c }] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x1343 A[Catch: all -> 0x1573, TRY_ENTER, TRY_LEAVE, TryCatch #78 {all -> 0x1573, blocks: (B:672:0x1386, B:663:0x1343, B:636:0x1182, B:638:0x11fc, B:639:0x1204, B:646:0x129e, B:647:0x12a4), top: B:943:0x1386 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fa A[Catch: Exception -> 0x16d7, TRY_LEAVE, TryCatch #75 {Exception -> 0x16d7, blocks: (B:3:0x0027, B:9:0x004f, B:47:0x0166, B:74:0x01fa, B:100:0x029b, B:101:0x02ac, B:113:0x0336, B:115:0x03d0, B:120:0x040d, B:124:0x041a, B:128:0x0423, B:140:0x0444, B:146:0x0459, B:154:0x0468, B:812:0x1633, B:818:0x1648, B:831:0x16b7, B:819:0x164f, B:815:0x1639, B:56:0x0173, B:10:0x005f, B:77:0x023d, B:76:0x020c, B:821:0x1661, B:822:0x1693, B:112:0x0306, B:59:0x019e, B:60:0x01c3, B:103:0x02b9), top: B:949:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:812:0x1633 A[Catch: Exception -> 0x16d7, TRY_ENTER, TryCatch #75 {Exception -> 0x16d7, blocks: (B:3:0x0027, B:9:0x004f, B:47:0x0166, B:74:0x01fa, B:100:0x029b, B:101:0x02ac, B:113:0x0336, B:115:0x03d0, B:120:0x040d, B:124:0x041a, B:128:0x0423, B:140:0x0444, B:146:0x0459, B:154:0x0468, B:812:0x1633, B:818:0x1648, B:831:0x16b7, B:819:0x164f, B:815:0x1639, B:56:0x0173, B:10:0x005f, B:77:0x023d, B:76:0x020c, B:821:0x1661, B:822:0x1693, B:112:0x0306, B:59:0x019e, B:60:0x01c3, B:103:0x02b9), top: B:949:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:818:0x1648 A[Catch: Exception -> 0x16d7, TryCatch #75 {Exception -> 0x16d7, blocks: (B:3:0x0027, B:9:0x004f, B:47:0x0166, B:74:0x01fa, B:100:0x029b, B:101:0x02ac, B:113:0x0336, B:115:0x03d0, B:120:0x040d, B:124:0x041a, B:128:0x0423, B:140:0x0444, B:146:0x0459, B:154:0x0468, B:812:0x1633, B:818:0x1648, B:831:0x16b7, B:819:0x164f, B:815:0x1639, B:56:0x0173, B:10:0x005f, B:77:0x023d, B:76:0x020c, B:821:0x1661, B:822:0x1693, B:112:0x0306, B:59:0x019e, B:60:0x01c3, B:103:0x02b9), top: B:949:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:882:0x1287 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:902:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:935:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:943:0x1386 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:967:0x16cc A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:970:0x164f A[EDGE_INSN: B:970:0x164f->B:819:0x164f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:970:0x164f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:974:0x1645 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:976:0x14a9 A[SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 5864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.e.<clinit>():void");
    }

    private e() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m200(Object obj) {
        Object obj2;
        int i = f266 + 99;
        int i2 = i % Barcode.ITF;
        f265 = i2;
        Object[] objArr = null;
        if ((i % 2 != 0 ? '/' : (char) 3) != '/') {
            obj2 = f260;
        } else {
            obj2 = f260;
            int length = objArr.length;
        }
        int i3 = ((i2 | 95) << 1) - (i2 ^ 95);
        int i4 = i3 % Barcode.ITF;
        f266 = i4;
        int i5 = i3 % 2;
        int i6 = (i4 ^ 75) + ((i4 & 75) << 1);
        f265 = i6 % Barcode.ITF;
        int i7 = i6 % 2;
        try {
            Object[] objArr2 = {obj};
            byte[] bArr = f263;
            Class<?> cls = Class.forName($$c(bArr[213], (short) 463, (short) 822), true, (ClassLoader) f270);
            byte b = bArr[46];
            int intValue = ((Integer) cls.getMethod($$c(b, (short) ((b ^ 160) | (b & 160)), (short) 304), Object.class).invoke(obj2, objArr2)).intValue();
            int i8 = (f265 + 50) - 1;
            f266 = i8 % Barcode.ITF;
            if ((i8 % 2 == 0 ? ')' : '>') != '>') {
                int length2 = objArr.length;
                return intValue;
            }
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Object m201(int i, char c, int i2) {
        int i3 = f265 + 17;
        int i4 = i3 % Barcode.ITF;
        f266 = i4;
        int i5 = i3 % 2;
        Object obj = f260;
        int i6 = (i4 + 68) - 1;
        f265 = i6 % Barcode.ITF;
        int i7 = i6 % 2;
        int i8 = (i4 & 81) + (i4 | 81);
        f265 = i8 % Barcode.ITF;
        int i9 = i8 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i), Character.valueOf(c), Integer.valueOf(i2)};
            byte[] bArr = f263;
            Class<?> cls = Class.forName($$c(bArr[213], (short) 463, (short) 822), true, (ClassLoader) f270);
            byte b = bArr[46];
            String $$c = $$c(b, (short) ((b ^ 591) | (b & 591)), (short) 616);
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            int i10 = f266;
            int i11 = (i10 ^ 91) + ((i10 & 91) << 1);
            f265 = i11 % Barcode.ITF;
            if ((i11 % 2 != 0 ? '\'' : '(') != '(') {
                Object obj2 = null;
                super.hashCode();
                return invoke;
            }
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m202(int i) {
        int i2 = f266;
        int i3 = (i2 & 9) + (i2 | 9);
        int i4 = i3 % Barcode.ITF;
        f265 = i4;
        int i5 = i3 % 2;
        Object obj = f260;
        int i6 = i4 + 7;
        f266 = i6 % Barcode.ITF;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = f263;
            Class<?> cls = Class.forName($$c(bArr[213], (short) 463, (short) 822), true, (ClassLoader) f270);
            byte b = bArr[46];
            int intValue = ((Integer) cls.getMethod($$c(b, (short) ((b ^ 160) | (b & 160)), (short) 304), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i8 = (f266 + 100) - 1;
            f265 = i8 % Barcode.ITF;
            if ((i8 % 2 != 0 ? '7' : (char) 23) != '7') {
                return intValue;
            }
            Object obj2 = null;
            super.hashCode();
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
