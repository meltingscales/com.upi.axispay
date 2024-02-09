package org.apache.commons.codec.language;

import java.util.Locale;
import myunmn.C0059ao;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class ColognePhonetic implements StringEncoder {
    private static final char[] AEIJOUY;
    private static final char[] AHKLOQRUX;
    private static final char[] AHKOQUX;
    private static final char CHAR_IGNORE = 0;
    private static final char[] CKQ;
    private static final char[] CSZ;
    private static final char[] DTX;
    private static final char[] FPVW;
    private static final char[] GKQ;
    private static final char[] SZ;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public class CologneInputBuffer extends CologneBuffer {
        public CologneInputBuffer(char[] cArr) {
            super(cArr);
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i, int i2) {
            char[] cArr = new char[i2];
            char[] cArr2 = this.data;
            System.arraycopy(cArr2, (cArr2.length - this.length) + i, cArr, 0, i2);
            return cArr;
        }

        public char getNextChar() {
            return this.data[getNextPos()];
        }

        public int getNextPos() {
            return this.data.length - this.length;
        }

        public char removeNext() {
            this.length--;
            return getNextChar();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public class CologneOutputBuffer extends CologneBuffer {
        private char lastCode;

        public CologneOutputBuffer(int i) {
            super(i);
            this.lastCode = '/';
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i, int i2) {
            char[] cArr = new char[i2];
            System.arraycopy(this.data, i, cArr, 0, i2);
            return cArr;
        }

        public void put(char c) {
            if (c != '-' && this.lastCode != c && (c != '0' || this.length == 0)) {
                char[] cArr = this.data;
                int i = this.length;
                cArr[i] = c;
                this.length = i + 1;
            }
            this.lastCode = c;
        }
    }

    static {
        C0059ao.a(ColognePhonetic.class, 343);
        AEIJOUY = new char[]{'A', 'E', 'I', 'J', 'O', 'U', 'Y'};
        CSZ = new char[]{'C', 'S', 'Z'};
        FPVW = new char[]{'F', 'P', 'V', 'W'};
        GKQ = new char[]{'G', 'K', 'Q'};
        CKQ = new char[]{'C', 'K', 'Q'};
        AHKLOQRUX = new char[]{'A', 'H', 'K', 'L', 'O', 'Q', 'R', 'U', 'X'};
        SZ = new char[]{'S', 'Z'};
        AHKOQUX = new char[]{'A', 'H', 'K', 'O', 'Q', 'U', 'X'};
        DTX = new char[]{'D', 'T', 'X'};
    }

    private static boolean arrayContains(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    private char[] preprocess(String str) {
        char[] charArray = str.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == 196) {
                charArray[i] = 'A';
            } else if (c == 214) {
                charArray[i] = 'O';
            } else if (c == 220) {
                charArray[i] = 'U';
            }
        }
        return charArray;
    }

    public String colognePhonetic(String str) {
        if (str == null) {
            return null;
        }
        CologneInputBuffer cologneInputBuffer = new CologneInputBuffer(preprocess(str));
        CologneOutputBuffer cologneOutputBuffer = new CologneOutputBuffer(cologneInputBuffer.length() * 2);
        char c = '-';
        while (cologneInputBuffer.length() > 0) {
            char removeNext = cologneInputBuffer.removeNext();
            char nextChar = cologneInputBuffer.length() > 0 ? cologneInputBuffer.getNextChar() : '-';
            if (removeNext >= 'A' && removeNext <= 'Z') {
                if (arrayContains(AEIJOUY, removeNext)) {
                    cologneOutputBuffer.put('0');
                } else if (removeNext != 'B' && (removeNext != 'P' || nextChar == 'H')) {
                    if ((removeNext == 'D' || removeNext == 'T') && !arrayContains(CSZ, nextChar)) {
                        cologneOutputBuffer.put('2');
                    } else if (arrayContains(FPVW, removeNext)) {
                        cologneOutputBuffer.put('3');
                    } else if (arrayContains(GKQ, removeNext)) {
                        cologneOutputBuffer.put('4');
                    } else if (removeNext == 'X' && !arrayContains(CKQ, c)) {
                        cologneOutputBuffer.put('4');
                        cologneOutputBuffer.put('8');
                    } else if (removeNext == 'S' || removeNext == 'Z') {
                        cologneOutputBuffer.put('8');
                    } else if (removeNext == 'C') {
                        if (cologneOutputBuffer.length() == 0) {
                            if (arrayContains(AHKLOQRUX, nextChar)) {
                                cologneOutputBuffer.put('4');
                            } else {
                                cologneOutputBuffer.put('8');
                            }
                        } else if (!arrayContains(SZ, c) && arrayContains(AHKOQUX, nextChar)) {
                            cologneOutputBuffer.put('4');
                        } else {
                            cologneOutputBuffer.put('8');
                        }
                    } else if (arrayContains(DTX, removeNext)) {
                        cologneOutputBuffer.put('8');
                    } else if (removeNext == 'R') {
                        cologneOutputBuffer.put('7');
                    } else if (removeNext == 'L') {
                        cologneOutputBuffer.put('5');
                    } else if (removeNext == 'M' || removeNext == 'N') {
                        cologneOutputBuffer.put('6');
                    } else if (removeNext == 'H') {
                        cologneOutputBuffer.put('-');
                    }
                } else {
                    cologneOutputBuffer.put('1');
                }
                c = removeNext;
            }
        }
        return cologneOutputBuffer.toString();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException(C0059ao.a(15083) + String.class.getName() + C0059ao.a(15084) + obj.getClass().getName() + C0059ao.a(15085));
    }

    public boolean isEncodeEqual(String str, String str2) {
        return colognePhonetic(str).equals(colognePhonetic(str2));
    }

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public abstract class CologneBuffer {
        public final char[] data;
        public int length;

        public CologneBuffer(char[] cArr) {
            this.length = 0;
            this.data = cArr;
            this.length = cArr.length;
        }

        public abstract char[] copyData(int i, int i2);

        public int length() {
            return this.length;
        }

        public String toString() {
            return new String(copyData(0, this.length));
        }

        public CologneBuffer(int i) {
            this.length = 0;
            this.data = new char[i];
            this.length = 0;
        }
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return colognePhonetic(str);
    }
}
