package org.apache.commons.codec.language;

import myunmn.C0059ao;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class RefinedSoundex implements StringEncoder {
    public static final RefinedSoundex US_ENGLISH;
    private static final char[] US_ENGLISH_MAPPING;
    public static final String US_ENGLISH_MAPPING_STRING = null;
    private final char[] soundexMapping;

    static {
        C0059ao.a(RefinedSoundex.class, 305);
        US_ENGLISH_MAPPING = C0059ao.a(6485).toCharArray();
        US_ENGLISH = new RefinedSoundex();
    }

    public RefinedSoundex() {
        this.soundexMapping = US_ENGLISH_MAPPING;
    }

    public int difference(String str, String str2) throws EncoderException {
        return SoundexUtils.difference(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return soundex((String) obj);
        }
        throw new EncoderException(C0059ao.a(6486));
    }

    public char getMappingCode(char c) {
        if (Character.isLetter(c)) {
            return this.soundexMapping[Character.toUpperCase(c) - 'A'];
        }
        return (char) 0;
    }

    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        String clean = SoundexUtils.clean(str);
        if (clean.length() == 0) {
            return clean;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(clean.charAt(0));
        char c = '*';
        for (int i = 0; i < clean.length(); i++) {
            char mappingCode = getMappingCode(clean.charAt(i));
            if (mappingCode != c) {
                if (mappingCode != 0) {
                    sb.append(mappingCode);
                }
                c = mappingCode;
            }
        }
        return sb.toString();
    }

    public RefinedSoundex(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        this.soundexMapping = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }

    public RefinedSoundex(String str) {
        this.soundexMapping = str.toCharArray();
    }
}
