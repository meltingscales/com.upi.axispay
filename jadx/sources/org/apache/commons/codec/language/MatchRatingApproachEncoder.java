package org.apache.commons.codec.language;

import java.util.Locale;
import myunmn.C0059ao;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class MatchRatingApproachEncoder implements StringEncoder {
    private static final String[] DOUBLE_CONSONANT;
    private static final int ELEVEN = 0;
    private static final String EMPTY = null;
    private static final int FIVE = 0;
    private static final int FOUR = 0;
    private static final int ONE = 0;
    private static final String PLAIN_ASCII = null;
    private static final int SEVEN = 0;
    private static final int SIX = 0;
    private static final String SPACE = null;
    private static final int THREE = 0;
    private static final int TWELVE = 0;
    private static final int TWO = 0;
    private static final String UNICODE = null;

    static {
        C0059ao.a(MatchRatingApproachEncoder.class, 81);
        DOUBLE_CONSONANT = new String[]{C0059ao.a(9545), C0059ao.a(9546), C0059ao.a(9547), C0059ao.a(9548), C0059ao.a(9549), C0059ao.a(9550), C0059ao.a(9551), C0059ao.a(9552), C0059ao.a(9553), C0059ao.a(9554), C0059ao.a(9555), C0059ao.a(9556), C0059ao.a(9557), C0059ao.a(9558), C0059ao.a(9559), C0059ao.a(9560), C0059ao.a(9561), C0059ao.a(9562), C0059ao.a(9563), C0059ao.a(9564), C0059ao.a(9565)};
    }

    public String cleanName(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        String[] strArr = {C0059ao.a(9566), C0059ao.a(9567), C0059ao.a(9568), C0059ao.a(9569), C0059ao.a(9570)};
        int i = 0;
        while (true) {
            String a = C0059ao.a(9571);
            if (i < 5) {
                upperCase = upperCase.replaceAll(strArr[i], a);
                i++;
            } else {
                return removeAccents(upperCase).replaceAll(C0059ao.a(9572), a);
            }
        }
    }

    @Override // org.apache.commons.codec.Encoder
    public final Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException(C0059ao.a(9573));
    }

    public String getFirst3Last3(String str) {
        int length = str.length();
        if (length > 6) {
            String substring = str.substring(0, 3);
            String substring2 = str.substring(length - 3, length);
            return substring + substring2;
        }
        return str;
    }

    public int getMinRating(int i) {
        if (i <= 4) {
            return 5;
        }
        if (i <= 7) {
            return 4;
        }
        if (i <= 11) {
            return 3;
        }
        return i == 12 ? 2 : 1;
    }

    public boolean isEncodeEquals(String str, String str2) {
        if (str != null) {
            String a = C0059ao.a(9576);
            if (a.equalsIgnoreCase(str)) {
                return false;
            }
            String a2 = C0059ao.a(9577);
            if (a2.equalsIgnoreCase(str) || str2 == null || a.equalsIgnoreCase(str2) || a2.equalsIgnoreCase(str2) || str.length() == 1 || str2.length() == 1) {
                return false;
            }
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
            String cleanName = cleanName(str);
            String cleanName2 = cleanName(str2);
            String removeVowels = removeVowels(cleanName);
            String removeVowels2 = removeVowels(cleanName2);
            String removeDoubleConsonants = removeDoubleConsonants(removeVowels);
            String removeDoubleConsonants2 = removeDoubleConsonants(removeVowels2);
            String first3Last3 = getFirst3Last3(removeDoubleConsonants);
            String first3Last32 = getFirst3Last3(removeDoubleConsonants2);
            if (Math.abs(first3Last3.length() - first3Last32.length()) >= 3) {
                return false;
            }
            return leftToRightThenRightToLeftProcessing(first3Last3, first3Last32) >= getMinRating(Math.abs(first3Last3.length() + first3Last32.length()));
        }
        return false;
    }

    public boolean isVowel(String str) {
        return str.equalsIgnoreCase(C0059ao.a(9578)) || str.equalsIgnoreCase(C0059ao.a(9579)) || str.equalsIgnoreCase(C0059ao.a(9580)) || str.equalsIgnoreCase(C0059ao.a(9581)) || str.equalsIgnoreCase(C0059ao.a(9582));
    }

    public int leftToRightThenRightToLeftProcessing(String str, String str2) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        int i = 0;
        while (i < charArray.length && i <= length2) {
            int i2 = i + 1;
            String substring = str.substring(i, i2);
            int i3 = length - i;
            String substring2 = str.substring(i3, i3 + 1);
            String substring3 = str2.substring(i, i2);
            int i4 = length2 - i;
            String substring4 = str2.substring(i4, i4 + 1);
            if (substring.equals(substring3)) {
                charArray[i] = ' ';
                charArray2[i] = ' ';
            }
            if (substring2.equals(substring4)) {
                charArray[i3] = ' ';
                charArray2[i4] = ' ';
            }
            i = i2;
        }
        String str3 = new String(charArray);
        String a = C0059ao.a(9583);
        String a2 = C0059ao.a(9584);
        String replaceAll = str3.replaceAll(a, a2);
        String replaceAll2 = new String(charArray2).replaceAll(a, a2);
        if (replaceAll.length() > replaceAll2.length()) {
            return Math.abs(6 - replaceAll.length());
        }
        return Math.abs(6 - replaceAll2.length());
    }

    public String removeAccents(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int indexOf = C0059ao.a(9585).indexOf(charAt);
            if (indexOf > -1) {
                sb.append(C0059ao.a(9586).charAt(indexOf));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public String removeDoubleConsonants(String str) {
        String[] strArr;
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        for (String str2 : DOUBLE_CONSONANT) {
            if (upperCase.contains(str2)) {
                upperCase = upperCase.replace(str2, str2.substring(0, 1));
            }
        }
        return upperCase;
    }

    public String removeVowels(String str) {
        String substring = str.substring(0, 1);
        String a = C0059ao.a(9587);
        String a2 = C0059ao.a(9588);
        String replaceAll = str.replaceAll(a, a2).replaceAll(C0059ao.a(9589), a2).replaceAll(C0059ao.a(9590), a2).replaceAll(C0059ao.a(9591), a2).replaceAll(C0059ao.a(9592), a2).replaceAll(C0059ao.a(9593), C0059ao.a(9594));
        if (isVowel(substring)) {
            return substring + replaceAll;
        }
        return replaceAll;
    }

    @Override // org.apache.commons.codec.StringEncoder
    public final String encode(String str) {
        String a = C0059ao.a(9574);
        return (str == null || a.equalsIgnoreCase(str) || C0059ao.a(9575).equalsIgnoreCase(str) || str.length() == 1) ? a : getFirst3Last3(removeDoubleConsonants(removeVowels(cleanName(str))));
    }
}
