package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: k40  reason: default package */
/* loaded from: classes.dex */
public final class k40 extends u40 {

    /* compiled from: AxisPay */
    /* renamed from: k40$a */
    /* loaded from: classes.dex */
    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public static int h(CharSequence charSequence, int i, int i2) {
        a i3;
        a i4;
        char charAt;
        a i5 = i(charSequence, i);
        a aVar = a.ONE_DIGIT;
        if (i5 == aVar) {
            return i2 == 101 ? 101 : 100;
        }
        a aVar2 = a.UNCODABLE;
        if (i5 == aVar2) {
            return (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) ? 100 : 101;
        } else if (i2 == 101 && i5 == a.FNC_1) {
            return 101;
        } else {
            if (i2 == 99) {
                return 99;
            }
            if (i2 == 100) {
                a aVar3 = a.FNC_1;
                if (i5 == aVar3 || (i3 = i(charSequence, i + 2)) == aVar2 || i3 == aVar) {
                    return 100;
                }
                if (i3 == aVar3) {
                    return i(charSequence, i + 3) == a.TWO_DIGITS ? 99 : 100;
                }
                int i6 = i + 4;
                while (true) {
                    i4 = i(charSequence, i6);
                    if (i4 != a.TWO_DIGITS) {
                        break;
                    }
                    i6 += 2;
                }
                return i4 == a.ONE_DIGIT ? 100 : 99;
            }
            if (i5 == a.FNC_1) {
                i5 = i(charSequence, i + 1);
            }
            return i5 == a.TWO_DIGITS ? 99 : 100;
        }
    }

    public static a i(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 >= '0' && charAt2 <= '9') {
            return a.TWO_DIGITS;
        }
        return a.ONE_DIGIT;
    }

    @Override // defpackage.u40
    public boolean[] d(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (charAt > 127) {
                            throw new IllegalArgumentException(C0059ao.a(9000).concat(String.valueOf(charAt)));
                        }
                        break;
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            while (true) {
                int i7 = 103;
                if (i3 < length) {
                    int h = h(str, i3, i5);
                    int i8 = 100;
                    if (h == i5) {
                        switch (str.charAt(i3)) {
                            case 241:
                                i8 = 102;
                                break;
                            case 242:
                                i8 = 97;
                                break;
                            case 243:
                                i8 = 96;
                                break;
                            case 244:
                                if (i5 == 101) {
                                    i8 = 101;
                                    break;
                                }
                                break;
                            default:
                                if (i5 != 100) {
                                    if (i5 == 101) {
                                        i8 = str.charAt(i3) - ' ';
                                        if (i8 < 0) {
                                            i8 += 96;
                                            break;
                                        }
                                    } else {
                                        i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                        i3++;
                                        break;
                                    }
                                } else {
                                    i8 = str.charAt(i3) - ' ';
                                    break;
                                }
                                break;
                        }
                        i3++;
                    } else {
                        if (i5 != 0) {
                            i7 = h;
                        } else if (h == 100) {
                            i7 = 104;
                        } else if (h != 101) {
                            i7 = 105;
                        }
                        i8 = i7;
                        i5 = h;
                    }
                    arrayList.add(j40.a[i8]);
                    i4 += i8 * i6;
                    if (i3 != 0) {
                        i6++;
                    }
                } else {
                    int[][] iArr = j40.a;
                    arrayList.add(iArr[i4 % 103]);
                    arrayList.add(iArr[106]);
                    int i9 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i10 : iArr2) {
                            i9 += i10;
                        }
                    }
                    boolean[] zArr = new boolean[i9];
                    for (int[] iArr3 : arrayList) {
                        i += u40.b(zArr, i, iArr3, true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException(C0059ao.a(9001).concat(String.valueOf(length)));
        }
    }

    @Override // defpackage.u40
    public Collection<w20> f() {
        return Collections.singleton(w20.CODE_128);
    }
}
