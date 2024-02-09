package org.apache.commons.codec.language;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import java.util.Locale;
import myunmn.C0059ao;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class DoubleMetaphone implements StringEncoder {
    private static final String[] ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER;
    private static final String[] L_R_N_M_B_H_F_V_W_SPACE;
    private static final String[] L_T_K_S_N_M_B_Z;
    private static final String[] SILENT_START;
    private static final String VOWELS = null;
    private int maxCodeLen = 4;

    static {
        C0059ao.a(DoubleMetaphone.class, 366);
        SILENT_START = new String[]{C0059ao.a(10294), C0059ao.a(10295), C0059ao.a(10296), C0059ao.a(10297), C0059ao.a(10298)};
        L_R_N_M_B_H_F_V_W_SPACE = new String[]{C0059ao.a(10299), C0059ao.a(10300), C0059ao.a(10301), C0059ao.a(10302), C0059ao.a(10303), C0059ao.a(10304), C0059ao.a(10305), C0059ao.a(10306), C0059ao.a(10307), C0059ao.a(10308)};
        ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER = new String[]{C0059ao.a(10309), C0059ao.a(10310), C0059ao.a(10311), C0059ao.a(10312), C0059ao.a(10313), C0059ao.a(10314), C0059ao.a(10315), C0059ao.a(10316), C0059ao.a(10317), C0059ao.a(10318), C0059ao.a(10319)};
        L_T_K_S_N_M_B_Z = new String[]{C0059ao.a(10320), C0059ao.a(10321), C0059ao.a(10322), C0059ao.a(10323), C0059ao.a(10324), C0059ao.a(10325), C0059ao.a(10326), C0059ao.a(10327)};
    }

    private String cleanInput(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        return trim.toUpperCase(Locale.ENGLISH);
    }

    private boolean conditionC0(String str, int i) {
        if (contains(str, i, 4, C0059ao.a(10328))) {
            return true;
        }
        if (i <= 1) {
            return false;
        }
        int i2 = i - 2;
        if (!isVowel(charAt(str, i2)) && contains(str, i - 1, 3, C0059ao.a(10329))) {
            char charAt = charAt(str, i + 2);
            return !(charAt == 'I' || charAt == 'E') || contains(str, i2, 6, C0059ao.a(10330), C0059ao.a(10331));
        }
        return false;
    }

    private boolean conditionCH0(String str, int i) {
        if (i != 0) {
            return false;
        }
        int i2 = i + 1;
        return (contains(str, i2, 5, C0059ao.a(10332), C0059ao.a(10333)) || contains(str, i2, 3, C0059ao.a(10334), C0059ao.a(10335), C0059ao.a(10336), C0059ao.a(10337))) && !contains(str, 0, 5, C0059ao.a(10338));
    }

    private boolean conditionCH1(String str, int i) {
        if (!contains(str, 0, 4, C0059ao.a(10339), C0059ao.a(10340)) && !contains(str, 0, 3, C0059ao.a(10341)) && !contains(str, i - 2, 6, C0059ao.a(10342), C0059ao.a(10343), C0059ao.a(10344))) {
            int i2 = i + 2;
            if (!contains(str, i2, 1, C0059ao.a(10345), C0059ao.a(10346))) {
                if (!contains(str, i - 1, 1, C0059ao.a(10347), C0059ao.a(10348), C0059ao.a(10349), C0059ao.a(10350)) && i != 0) {
                    return false;
                }
                if (!contains(str, i2, 1, L_R_N_M_B_H_F_V_W_SPACE) && i + 1 != str.length() - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean conditionL0(String str, int i) {
        int length = str.length() - 3;
        String a = C0059ao.a(10351);
        if (i == length && contains(str, i - 1, 4, C0059ao.a(10352), C0059ao.a(10353), a)) {
            return true;
        }
        return (contains(str, str.length() - 2, 2, C0059ao.a(10354), C0059ao.a(10355)) || contains(str, str.length() - 1, 1, C0059ao.a(10356), C0059ao.a(10357))) && contains(str, i - 1, 4, a);
    }

    private boolean conditionM0(String str, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'M') {
            return true;
        }
        return contains(str, i + (-1), 3, C0059ao.a(10358)) && (i2 == str.length() - 1 || contains(str, i + 2, 2, C0059ao.a(10359)));
    }

    public static boolean contains(String str, int i, int i2, String... strArr) {
        int i3;
        if (i < 0 || (i3 = i2 + i) > str.length()) {
            return false;
        }
        String substring = str.substring(i, i3);
        for (String str2 : strArr) {
            if (substring.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private int handleAEIOUY(DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i == 0) {
            doubleMetaphoneResult.append('A');
        }
        return i + 1;
    }

    private int handleC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (conditionC0(str, i)) {
            doubleMetaphoneResult.append('K');
        } else if (i == 0 && contains(str, i, 6, C0059ao.a(10360))) {
            doubleMetaphoneResult.append('S');
        } else if (contains(str, i, 2, C0059ao.a(10361))) {
            return handleCH(str, doubleMetaphoneResult, i);
        } else {
            if (contains(str, i, 2, C0059ao.a(10362)) && !contains(str, i - 2, 4, C0059ao.a(10363))) {
                doubleMetaphoneResult.append('S', 'X');
            } else {
                int i2 = i + 1;
                String a = C0059ao.a(10364);
                if (contains(str, i2, 3, a)) {
                    doubleMetaphoneResult.append('X');
                } else if (contains(str, i, 2, C0059ao.a(10365)) && (i != 1 || charAt(str, 0) != 'M')) {
                    return handleCC(str, doubleMetaphoneResult, i);
                } else {
                    if (contains(str, i, 2, C0059ao.a(10366), C0059ao.a(10367), C0059ao.a(10368))) {
                        doubleMetaphoneResult.append('K');
                    } else {
                        String a2 = C0059ao.a(10369);
                        String a3 = C0059ao.a(10370);
                        if (contains(str, i, 2, a2, a3, C0059ao.a(10371))) {
                            if (contains(str, i, 3, C0059ao.a(10372), C0059ao.a(10373), a)) {
                                doubleMetaphoneResult.append('S', 'X');
                            } else {
                                doubleMetaphoneResult.append('S');
                            }
                        } else {
                            doubleMetaphoneResult.append('K');
                            if (!contains(str, i2, 2, C0059ao.a(10374), C0059ao.a(10375), C0059ao.a(10376))) {
                                if (!contains(str, i2, 1, C0059ao.a(10377), C0059ao.a(10378), C0059ao.a(10379)) || contains(str, i2, 2, a3, a2)) {
                                    return i2;
                                }
                            }
                        }
                    }
                }
                return i + 3;
            }
        }
        return i + 2;
    }

    private int handleCC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 2;
        if (contains(str, i2, 1, C0059ao.a(10380), C0059ao.a(10381), C0059ao.a(10382)) && !contains(str, i2, 2, C0059ao.a(10383))) {
            if ((i == 1 && charAt(str, i - 1) == 'A') || contains(str, i - 1, 5, C0059ao.a(10384), C0059ao.a(10385))) {
                doubleMetaphoneResult.append(C0059ao.a(10386));
            } else {
                doubleMetaphoneResult.append('X');
            }
            return i + 3;
        }
        doubleMetaphoneResult.append('K');
        return i2;
    }

    private int handleCH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i > 0 && contains(str, i, 4, C0059ao.a(10387))) {
            doubleMetaphoneResult.append('K', 'X');
        } else if (conditionCH0(str, i)) {
            doubleMetaphoneResult.append('K');
        } else if (!conditionCH1(str, i)) {
            if (i > 0) {
                if (contains(str, 0, 2, C0059ao.a(10388))) {
                    doubleMetaphoneResult.append('K');
                } else {
                    doubleMetaphoneResult.append('X', 'K');
                }
            } else {
                doubleMetaphoneResult.append('X');
            }
            return i + 2;
        } else {
            doubleMetaphoneResult.append('K');
        }
        return i + 2;
    }

    private int handleD(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (contains(str, i, 2, C0059ao.a(10389))) {
            int i2 = i + 2;
            if (contains(str, i2, 1, C0059ao.a(10390), C0059ao.a(10391), C0059ao.a(10392))) {
                doubleMetaphoneResult.append('J');
                return i + 3;
            }
            doubleMetaphoneResult.append(C0059ao.a(10393));
            return i2;
        } else if (contains(str, i, 2, C0059ao.a(10394), C0059ao.a(10395))) {
            doubleMetaphoneResult.append('T');
            return i + 2;
        } else {
            doubleMetaphoneResult.append('T');
            return i + 1;
        }
    }

    private int handleG(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            return handleGH(str, doubleMetaphoneResult, i);
        }
        if (charAt(str, i2) == 'N') {
            String a = C0059ao.a(10396);
            String a2 = C0059ao.a(10397);
            if (i == 1 && isVowel(charAt(str, 0)) && !z) {
                doubleMetaphoneResult.append(a2, a);
            } else if (!contains(str, i + 2, 2, C0059ao.a(10398)) && charAt(str, i2) != 'Y' && !z) {
                doubleMetaphoneResult.append(a, a2);
            } else {
                doubleMetaphoneResult.append(a2);
            }
        } else if (contains(str, i2, 2, C0059ao.a(10399)) && !z) {
            doubleMetaphoneResult.append(C0059ao.a(10400), C0059ao.a(10401));
        } else if (i == 0 && (charAt(str, i2) == 'Y' || contains(str, i2, 2, ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER))) {
            doubleMetaphoneResult.append('K', 'J');
        } else {
            boolean contains = contains(str, i2, 2, C0059ao.a(10402));
            String a3 = C0059ao.a(10403);
            String a4 = C0059ao.a(10404);
            if ((contains || charAt(str, i2) == 'Y') && !contains(str, 0, 6, C0059ao.a(10405), C0059ao.a(10406), C0059ao.a(10407))) {
                int i3 = i - 1;
                if (!contains(str, i3, 1, a4, a3) && !contains(str, i3, 3, C0059ao.a(10408), C0059ao.a(10409))) {
                    doubleMetaphoneResult.append('K', 'J');
                    return i + 2;
                }
            }
            if (!contains(str, i2, 1, a4, a3, C0059ao.a(10410)) && !contains(str, i - 1, 4, C0059ao.a(10411), C0059ao.a(10412))) {
                if (charAt(str, i2) == 'G') {
                    int i4 = i + 2;
                    doubleMetaphoneResult.append('K');
                    return i4;
                }
                doubleMetaphoneResult.append('K');
                return i2;
            }
            if (!contains(str, 0, 4, C0059ao.a(10413), C0059ao.a(10414)) && !contains(str, 0, 3, C0059ao.a(10415)) && !contains(str, i2, 2, C0059ao.a(10416))) {
                if (contains(str, i2, 3, C0059ao.a(10417))) {
                    doubleMetaphoneResult.append('J');
                } else {
                    doubleMetaphoneResult.append('J', 'K');
                }
            } else {
                doubleMetaphoneResult.append('K');
            }
            return i + 2;
        }
        return i + 2;
    }

    private int handleGH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i > 0 && !isVowel(charAt(str, i - 1))) {
            doubleMetaphoneResult.append('K');
        } else if (i == 0) {
            int i2 = i + 2;
            if (charAt(str, i2) == 'I') {
                doubleMetaphoneResult.append('J');
                return i2;
            }
            doubleMetaphoneResult.append('K');
            return i2;
        } else {
            String a = C0059ao.a(10418);
            String a2 = C0059ao.a(10419);
            String a3 = C0059ao.a(10420);
            if ((i <= 1 || !contains(str, i - 2, 1, a3, a2, a)) && ((i <= 2 || !contains(str, i - 3, 1, a3, a2, a)) && (i <= 3 || !contains(str, i - 4, 1, a3, a2)))) {
                if (i > 2 && charAt(str, i - 1) == 'U' && contains(str, i - 3, 1, C0059ao.a(10421), C0059ao.a(10422), C0059ao.a(10423), C0059ao.a(10424), C0059ao.a(10425))) {
                    doubleMetaphoneResult.append('F');
                } else if (i > 0 && charAt(str, i - 1) != 'I') {
                    doubleMetaphoneResult.append('K');
                }
            }
        }
        return i + 2;
    }

    private int handleH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if ((i == 0 || isVowel(charAt(str, i - 1))) && isVowel(charAt(str, i + 1))) {
            doubleMetaphoneResult.append('H');
            return i + 2;
        }
        return i + 1;
    }

    private int handleJ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        String a = C0059ao.a(10426);
        boolean contains = contains(str, i, 4, a);
        String a2 = C0059ao.a(10427);
        if (!contains && !contains(str, 0, 4, a2)) {
            if (i == 0 && !contains(str, i, 4, a)) {
                doubleMetaphoneResult.append('J', 'A');
            } else {
                int i2 = i - 1;
                if (isVowel(charAt(str, i2)) && !z) {
                    int i3 = i + 1;
                    if (charAt(str, i3) == 'A' || charAt(str, i3) == 'O') {
                        doubleMetaphoneResult.append('J', 'H');
                    }
                }
                if (i == str.length() - 1) {
                    doubleMetaphoneResult.append('J', ' ');
                } else if (!contains(str, i + 1, 1, L_T_K_S_N_M_B_Z) && !contains(str, i2, 1, C0059ao.a(10428), C0059ao.a(10429), C0059ao.a(10430))) {
                    doubleMetaphoneResult.append('J');
                }
            }
            int i4 = i + 1;
            return charAt(str, i4) == 'J' ? i + 2 : i4;
        }
        if ((i != 0 || charAt(str, i + 4) != ' ') && str.length() != 4 && !contains(str, 0, 4, a2)) {
            doubleMetaphoneResult.append('J', 'H');
        } else {
            doubleMetaphoneResult.append('H');
        }
        return i + 1;
    }

    private int handleL(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'L') {
            if (conditionL0(str, i)) {
                doubleMetaphoneResult.appendPrimary('L');
            } else {
                doubleMetaphoneResult.append('L');
            }
            return i + 2;
        }
        doubleMetaphoneResult.append('L');
        return i2;
    }

    private int handleP(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            doubleMetaphoneResult.append('F');
            return i + 2;
        }
        doubleMetaphoneResult.append('P');
        if (contains(str, i2, 1, C0059ao.a(10431), C0059ao.a(10432))) {
            i2 = i + 2;
        }
        return i2;
    }

    private int handleR(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        if (i == str.length() - 1 && !z && contains(str, i - 2, 2, C0059ao.a(10433)) && !contains(str, i - 4, 2, C0059ao.a(10434), C0059ao.a(10435))) {
            doubleMetaphoneResult.appendAlternate('R');
        } else {
            doubleMetaphoneResult.append('R');
        }
        int i2 = i + 1;
        return charAt(str, i2) == 'R' ? i + 2 : i2;
    }

    private int handleS(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        if (!contains(str, i - 1, 3, C0059ao.a(GooglePlayServicesUtilLight.GMS_AVAILABILITY_NOTIFICATION_ID), C0059ao.a(10437))) {
            if (i == 0 && contains(str, i, 5, C0059ao.a(10438))) {
                doubleMetaphoneResult.append('X', 'S');
            } else {
                if (contains(str, i, 2, C0059ao.a(10439))) {
                    if (contains(str, i + 1, 4, C0059ao.a(10440), C0059ao.a(10441), C0059ao.a(10442), C0059ao.a(10443))) {
                        doubleMetaphoneResult.append('S');
                    } else {
                        doubleMetaphoneResult.append('X');
                    }
                } else if (contains(str, i, 3, C0059ao.a(10444), C0059ao.a(10445)) || contains(str, i, 4, C0059ao.a(10446))) {
                    if (z) {
                        doubleMetaphoneResult.append('S');
                    } else {
                        doubleMetaphoneResult.append('S', 'X');
                    }
                    return i + 3;
                } else {
                    String a = C0059ao.a(10447);
                    if (i != 0 || !contains(str, i + 1, 1, C0059ao.a(10448), C0059ao.a(10449), C0059ao.a(10450), C0059ao.a(10451))) {
                        int i2 = i + 1;
                        if (!contains(str, i2, 1, a)) {
                            if (contains(str, i, 2, C0059ao.a(10452))) {
                                return handleSC(str, doubleMetaphoneResult, i);
                            }
                            if (i == str.length() - 1 && contains(str, i - 2, 2, C0059ao.a(10453), C0059ao.a(10454))) {
                                doubleMetaphoneResult.appendAlternate('S');
                            } else {
                                doubleMetaphoneResult.append('S');
                            }
                            if (!contains(str, i2, 1, C0059ao.a(10455), a)) {
                                return i2;
                            }
                        }
                    }
                    doubleMetaphoneResult.append('S', 'X');
                    int i3 = i + 1;
                    if (!contains(str, i3, 1, a)) {
                        return i3;
                    }
                }
                return i + 2;
            }
        }
        return i + 1;
    }

    private int handleSC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 2;
        char charAt = charAt(str, i2);
        String a = C0059ao.a(10456);
        if (charAt == 'H') {
            int i3 = i + 3;
            if (contains(str, i3, 2, C0059ao.a(10457), C0059ao.a(10458), C0059ao.a(10459), C0059ao.a(10460), C0059ao.a(10461), C0059ao.a(10462))) {
                if (contains(str, i3, 2, C0059ao.a(10463), C0059ao.a(10464))) {
                    doubleMetaphoneResult.append(C0059ao.a(10465), a);
                } else {
                    doubleMetaphoneResult.append(a);
                }
            } else if (i == 0 && !isVowel(charAt(str, 3)) && charAt(str, 3) != 'W') {
                doubleMetaphoneResult.append('X', 'S');
            } else {
                doubleMetaphoneResult.append('X');
            }
        } else if (contains(str, i2, 1, C0059ao.a(10466), C0059ao.a(10467), C0059ao.a(10468))) {
            doubleMetaphoneResult.append('S');
        } else {
            doubleMetaphoneResult.append(a);
        }
        return i + 3;
    }

    private int handleT(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (contains(str, i, 4, C0059ao.a(10469))) {
            doubleMetaphoneResult.append('X');
        } else if (contains(str, i, 3, C0059ao.a(10470), C0059ao.a(10471))) {
            doubleMetaphoneResult.append('X');
        } else if (!contains(str, i, 2, C0059ao.a(10472)) && !contains(str, i, 3, C0059ao.a(10473))) {
            doubleMetaphoneResult.append('T');
            int i2 = i + 1;
            return contains(str, i2, 1, C0059ao.a(10474), C0059ao.a(10475)) ? i + 2 : i2;
        } else {
            int i3 = i + 2;
            if (!contains(str, i3, 2, C0059ao.a(10476), C0059ao.a(10477)) && !contains(str, 0, 4, C0059ao.a(10478), C0059ao.a(10479)) && !contains(str, 0, 3, C0059ao.a(10480))) {
                doubleMetaphoneResult.append('0', 'T');
                return i3;
            }
            doubleMetaphoneResult.append('T');
            return i3;
        }
        return i + 3;
    }

    private int handleW(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = 2;
        if (contains(str, i, 2, C0059ao.a(10481))) {
            doubleMetaphoneResult.append('R');
        } else {
            if (i == 0) {
                int i3 = i + 1;
                if (isVowel(charAt(str, i3)) || contains(str, i, 2, C0059ao.a(10482))) {
                    if (isVowel(charAt(str, i3))) {
                        doubleMetaphoneResult.append('A', 'F');
                    } else {
                        doubleMetaphoneResult.append('A');
                    }
                    return i3;
                }
            }
            if ((i != str.length() - 1 || !isVowel(charAt(str, i - 1))) && !contains(str, i - 1, 5, C0059ao.a(10483), C0059ao.a(10484), C0059ao.a(10485), C0059ao.a(10486)) && !contains(str, 0, 3, C0059ao.a(10487))) {
                i2 = 4;
                if (contains(str, i, 4, C0059ao.a(10488), C0059ao.a(10489))) {
                    doubleMetaphoneResult.append(C0059ao.a(10490), C0059ao.a(10491));
                }
            } else {
                doubleMetaphoneResult.appendAlternate('F');
            }
            return i + 1;
        }
        return i + i2;
    }

    private int handleX(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i == 0) {
            doubleMetaphoneResult.append('S');
            return i + 1;
        }
        if (i != str.length() - 1 || (!contains(str, i - 3, 3, C0059ao.a(10492), C0059ao.a(10493)) && !contains(str, i - 2, 2, C0059ao.a(10494), C0059ao.a(10495)))) {
            doubleMetaphoneResult.append(C0059ao.a(10496));
        }
        int i2 = i + 1;
        return contains(str, i2, 1, C0059ao.a(10497), C0059ao.a(10498)) ? i + 2 : i2;
    }

    private int handleZ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            doubleMetaphoneResult.append('J');
            return i + 2;
        }
        if (!contains(str, i2, 2, C0059ao.a(10499), C0059ao.a(10500), C0059ao.a(10501)) && (!z || i <= 0 || charAt(str, i - 1) == 'T')) {
            doubleMetaphoneResult.append('S');
        } else {
            doubleMetaphoneResult.append(C0059ao.a(10502), C0059ao.a(10503));
        }
        if (charAt(str, i2) == 'Z') {
            i2 = i + 2;
        }
        return i2;
    }

    private boolean isSilentStart(String str) {
        for (String str2 : SILENT_START) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSlavoGermanic(String str) {
        return str.indexOf(87) > -1 || str.indexOf(75) > -1 || str.indexOf(C0059ao.a(10504)) > -1 || str.indexOf(C0059ao.a(10505)) > -1;
    }

    private boolean isVowel(char c) {
        return C0059ao.a(10506).indexOf(c) != -1;
    }

    public char charAt(String str, int i) {
        if (i < 0 || i >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i);
    }

    public String doubleMetaphone(String str) {
        return doubleMetaphone(str, false);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return doubleMetaphone((String) obj);
        }
        throw new EncoderException(C0059ao.a(10507));
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2) {
        return isDoubleMetaphoneEqual(str, str2, false);
    }

    public void setMaxCodeLen(int i) {
        this.maxCodeLen = i;
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public class DoubleMetaphoneResult {
        private final StringBuilder alternate;
        private final int maxLength;
        private final StringBuilder primary;

        public DoubleMetaphoneResult(int i) {
            this.primary = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.alternate = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.maxLength = i;
        }

        public void append(char c) {
            appendPrimary(c);
            appendAlternate(c);
        }

        public void appendAlternate(char c) {
            if (this.alternate.length() < this.maxLength) {
                this.alternate.append(c);
            }
        }

        public void appendPrimary(char c) {
            if (this.primary.length() < this.maxLength) {
                this.primary.append(c);
            }
        }

        public String getAlternate() {
            return this.alternate.toString();
        }

        public String getPrimary() {
            return this.primary.toString();
        }

        public boolean isComplete() {
            return this.primary.length() >= this.maxLength && this.alternate.length() >= this.maxLength;
        }

        public void append(char c, char c2) {
            appendPrimary(c);
            appendAlternate(c2);
        }

        public void appendAlternate(String str) {
            int length = this.maxLength - this.alternate.length();
            if (str.length() <= length) {
                this.alternate.append(str);
            } else {
                this.alternate.append(str.substring(0, length));
            }
        }

        public void appendPrimary(String str) {
            int length = this.maxLength - this.primary.length();
            if (str.length() <= length) {
                this.primary.append(str);
            } else {
                this.primary.append(str.substring(0, length));
            }
        }

        public void append(String str) {
            appendPrimary(str);
            appendAlternate(str);
        }

        public void append(String str, String str2) {
            appendPrimary(str);
            appendAlternate(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.apache.commons.codec.language.DoubleMetaphone] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    public String doubleMetaphone(String str, boolean z) {
        int i;
        ?? cleanInput = cleanInput(str);
        if (cleanInput == 0) {
            return null;
        }
        boolean isSlavoGermanic = isSlavoGermanic(cleanInput);
        ?? isSilentStart = isSilentStart(cleanInput);
        DoubleMetaphoneResult doubleMetaphoneResult = new DoubleMetaphoneResult(getMaxCodeLen());
        while (!doubleMetaphoneResult.isComplete() && isSilentStart <= cleanInput.length() - 1) {
            char charAt = cleanInput.charAt(isSilentStart);
            if (charAt == 199) {
                doubleMetaphoneResult.append('S');
            } else if (charAt != 209) {
                switch (charAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'Y':
                        isSilentStart = handleAEIOUY(doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'B':
                        doubleMetaphoneResult.append('P');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'B') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'C':
                        isSilentStart = handleC(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'D':
                        isSilentStart = handleD(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'F':
                        doubleMetaphoneResult.append('F');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'F') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'G':
                        isSilentStart = handleG(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'H':
                        isSilentStart = handleH(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'J':
                        isSilentStart = handleJ(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'K':
                        doubleMetaphoneResult.append('K');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'K') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'L':
                        isSilentStart = handleL(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'M':
                        doubleMetaphoneResult.append('M');
                        if (!conditionM0(cleanInput, isSilentStart)) {
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'N':
                        doubleMetaphoneResult.append('N');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'N') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'P':
                        isSilentStart = handleP(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'Q':
                        doubleMetaphoneResult.append('K');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'Q') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'R':
                        isSilentStart = handleR(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'S':
                        isSilentStart = handleS(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'T':
                        isSilentStart = handleT(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'V':
                        doubleMetaphoneResult.append('F');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'V') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'W':
                        isSilentStart = handleW(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'X':
                        isSilentStart = handleX(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'Z':
                        isSilentStart = handleZ(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                }
            } else {
                doubleMetaphoneResult.append('N');
            }
            isSilentStart++;
        }
        return z ? doubleMetaphoneResult.getAlternate() : doubleMetaphoneResult.getPrimary();
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2, boolean z) {
        return StringUtils.equals(doubleMetaphone(str, z), doubleMetaphone(str2, z));
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return doubleMetaphone(str);
    }
}
