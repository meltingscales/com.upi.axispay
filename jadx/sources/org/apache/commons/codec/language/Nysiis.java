package org.apache.commons.codec.language;

import java.util.regex.Pattern;
import myunmn.C0059ao;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Nysiis implements StringEncoder {
    private static final char[] CHARS_A;
    private static final char[] CHARS_AF;
    private static final char[] CHARS_C;
    private static final char[] CHARS_FF;
    private static final char[] CHARS_G;
    private static final char[] CHARS_N;
    private static final char[] CHARS_NN;
    private static final char[] CHARS_S;
    private static final char[] CHARS_SSS;
    private static final Pattern PAT_DT_ETC;
    private static final Pattern PAT_EE_IE;
    private static final Pattern PAT_K;
    private static final Pattern PAT_KN;
    private static final Pattern PAT_MAC;
    private static final Pattern PAT_PH_PF;
    private static final Pattern PAT_SCH;
    private static final char SPACE = 0;
    private static final int TRUE_LENGTH = 0;
    private final boolean strict;

    static {
        C0059ao.a(Nysiis.class, 360);
        CHARS_A = new char[]{'A'};
        CHARS_AF = new char[]{'A', 'F'};
        CHARS_C = new char[]{'C'};
        CHARS_FF = new char[]{'F', 'F'};
        CHARS_G = new char[]{'G'};
        CHARS_N = new char[]{'N'};
        CHARS_NN = new char[]{'N', 'N'};
        CHARS_S = new char[]{'S'};
        CHARS_SSS = new char[]{'S', 'S', 'S'};
        PAT_MAC = Pattern.compile(C0059ao.a(6338));
        PAT_KN = Pattern.compile(C0059ao.a(6339));
        PAT_K = Pattern.compile(C0059ao.a(6340));
        PAT_PH_PF = Pattern.compile(C0059ao.a(6341));
        PAT_SCH = Pattern.compile(C0059ao.a(6342));
        PAT_EE_IE = Pattern.compile(C0059ao.a(6343));
        PAT_DT_ETC = Pattern.compile(C0059ao.a(6344));
    }

    public Nysiis() {
        this(true);
    }

    private static boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    private static char[] transcodeRemaining(char c, char c2, char c3, char c4) {
        if (c2 == 'E' && c3 == 'V') {
            return CHARS_AF;
        }
        if (isVowel(c2)) {
            return CHARS_A;
        }
        if (c2 == 'Q') {
            return CHARS_G;
        }
        if (c2 == 'Z') {
            return CHARS_S;
        }
        if (c2 == 'M') {
            return CHARS_N;
        }
        if (c2 == 'K') {
            if (c3 == 'N') {
                return CHARS_NN;
            }
            return CHARS_C;
        } else if (c2 == 'S' && c3 == 'C' && c4 == 'H') {
            return CHARS_SSS;
        } else {
            if (c2 == 'P' && c3 == 'H') {
                return CHARS_FF;
            }
            return (c2 != 'H' || (isVowel(c) && isVowel(c3))) ? (c2 == 'W' && isVowel(c)) ? new char[]{c} : new char[]{c2} : new char[]{c};
        }
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return nysiis((String) obj);
        }
        throw new EncoderException(C0059ao.a(6345));
    }

    public boolean isStrict() {
        return this.strict;
    }

    public String nysiis(String str) {
        if (str == null) {
            return null;
        }
        String clean = SoundexUtils.clean(str);
        if (clean.length() == 0) {
            return clean;
        }
        String replaceFirst = PAT_DT_ETC.matcher(PAT_EE_IE.matcher(PAT_SCH.matcher(PAT_PH_PF.matcher(PAT_K.matcher(PAT_KN.matcher(PAT_MAC.matcher(clean).replaceFirst(C0059ao.a(6346))).replaceFirst(C0059ao.a(6347))).replaceFirst(C0059ao.a(6348))).replaceFirst(C0059ao.a(6349))).replaceFirst(C0059ao.a(6350))).replaceFirst(C0059ao.a(6351))).replaceFirst(C0059ao.a(6352));
        StringBuilder sb = new StringBuilder(replaceFirst.length());
        sb.append(replaceFirst.charAt(0));
        char[] charArray = replaceFirst.toCharArray();
        int length = charArray.length;
        int i = 1;
        while (i < length) {
            int i2 = i - 1;
            char[] transcodeRemaining = transcodeRemaining(charArray[i2], charArray[i], i < length + (-1) ? charArray[i + 1] : ' ', i < length + (-2) ? charArray[i + 2] : ' ');
            System.arraycopy(transcodeRemaining, 0, charArray, i, transcodeRemaining.length);
            if (charArray[i] != charArray[i2]) {
                sb.append(charArray[i]);
            }
            i++;
        }
        if (sb.length() > 1) {
            char charAt = sb.charAt(sb.length() - 1);
            if (charAt == 'S') {
                sb.deleteCharAt(sb.length() - 1);
                charAt = sb.charAt(sb.length() - 1);
            }
            if (sb.length() > 2 && sb.charAt(sb.length() - 2) == 'A' && charAt == 'Y') {
                sb.deleteCharAt(sb.length() - 2);
            }
            if (charAt == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        String sb2 = sb.toString();
        return isStrict() ? sb2.substring(0, Math.min(6, sb2.length())) : sb2;
    }

    public Nysiis(boolean z) {
        this.strict = z;
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return nysiis(str);
    }
}
