package org.apache.commons.codec.language;

import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Caverphone2 extends AbstractCaverphone {
    private static final String TEN_1 = null;

    static {
        C0059ao.a(Caverphone2.class, 338);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        String a = C0059ao.a(8759);
        if (str == null || str.length() == 0) {
            return a;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        String a2 = C0059ao.a(8760);
        String a3 = C0059ao.a(8761);
        String replaceAll = lowerCase.replaceAll(a2, a3).replaceAll(C0059ao.a(8762), a3).replaceAll(C0059ao.a(8763), C0059ao.a(8764)).replaceAll(C0059ao.a(8765), C0059ao.a(8766)).replaceAll(C0059ao.a(8767), C0059ao.a(8768)).replaceAll(C0059ao.a(8769), C0059ao.a(8770)).replaceAll(C0059ao.a(8771), C0059ao.a(8772)).replaceAll(C0059ao.a(8773), C0059ao.a(8774)).replaceAll(C0059ao.a(8775), C0059ao.a(8776)).replaceAll(C0059ao.a(8777), C0059ao.a(8778)).replaceAll(C0059ao.a(8779), C0059ao.a(8780)).replaceAll(C0059ao.a(8781), C0059ao.a(8782)).replaceAll(C0059ao.a(8783), C0059ao.a(8784)).replaceAll(C0059ao.a(8785), C0059ao.a(8786));
        String a4 = C0059ao.a(8787);
        String a5 = C0059ao.a(8788);
        String replaceAll2 = replaceAll.replaceAll(a4, a5).replaceAll(C0059ao.a(8789), a5).replaceAll(C0059ao.a(8790), a5).replaceAll(C0059ao.a(8791), C0059ao.a(8792)).replaceAll(C0059ao.a(8793), C0059ao.a(8794)).replaceAll(C0059ao.a(8795), C0059ao.a(8796)).replaceAll(C0059ao.a(8797), C0059ao.a(8798)).replaceAll(C0059ao.a(8799), C0059ao.a(8800)).replaceAll(C0059ao.a(8801), C0059ao.a(8802)).replaceAll(C0059ao.a(8803), C0059ao.a(8804)).replaceAll(C0059ao.a(8805), C0059ao.a(8806)).replaceAll(C0059ao.a(8807), C0059ao.a(8808));
        String a6 = C0059ao.a(8809);
        String a7 = C0059ao.a(8810);
        String replaceAll3 = replaceAll2.replaceAll(a6, a7);
        String a8 = C0059ao.a(8811);
        String a9 = C0059ao.a(8812);
        String replaceAll4 = replaceAll3.replaceAll(a8, a9);
        String a10 = C0059ao.a(8813);
        String a11 = C0059ao.a(8814);
        String replaceAll5 = replaceAll4.replaceAll(a10, a11).replaceAll(C0059ao.a(8815), C0059ao.a(8816)).replaceAll(C0059ao.a(8817), a7).replaceAll(a11, a9).replaceAll(C0059ao.a(8818), C0059ao.a(8819)).replaceAll(C0059ao.a(8820), C0059ao.a(8821)).replaceAll(C0059ao.a(8822), a5).replaceAll(C0059ao.a(8823), C0059ao.a(8824)).replaceAll(C0059ao.a(8825), C0059ao.a(8826)).replaceAll(C0059ao.a(8827), C0059ao.a(8828)).replaceAll(C0059ao.a(8829), C0059ao.a(8830)).replaceAll(C0059ao.a(8831), C0059ao.a(8832)).replaceAll(C0059ao.a(8833), C0059ao.a(8834)).replaceAll(C0059ao.a(8835), C0059ao.a(8836)).replaceAll(C0059ao.a(8837), C0059ao.a(8838)).replaceAll(C0059ao.a(8839), C0059ao.a(8840)).replaceAll(C0059ao.a(8841), a9);
        String a12 = C0059ao.a(8842);
        String a13 = C0059ao.a(8843);
        String replaceAll6 = replaceAll5.replaceAll(a12, a13).replaceAll(C0059ao.a(8844), a7).replaceAll(C0059ao.a(8845), a13).replaceAll(C0059ao.a(8846), C0059ao.a(8847)).replaceAll(C0059ao.a(8848), a9).replaceAll(C0059ao.a(8849), a13).replaceAll(C0059ao.a(8850), C0059ao.a(8851)).replaceAll(C0059ao.a(8852), a9).replaceAll(C0059ao.a(8853), a13).replaceAll(a13, a3).replaceAll(C0059ao.a(8854), a7).replaceAll(a9, a3);
        return (replaceAll6 + a).substring(0, 10);
    }
}
