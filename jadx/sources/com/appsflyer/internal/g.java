package com.appsflyer.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum a {
        NONE,
        FIRST,
        ALL
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum c {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");
        

        /* renamed from: ι  reason: contains not printable characters */
        public String f281;

        c(String str) {
            this.f281 = str;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum d {
        UNKNOWN,
        ACCELEROMETER,
        MAGNETOMETER,
        RESERVED,
        GYROSCOPE
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static List<BigDecimal> m203(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(0)).toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(1)).toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(2)).toString())));
        return arrayList2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static Map m204(List<Map<String, Object>> list) {
        a aVar;
        a aVar2;
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        for (Map<String, Object> map : list) {
            HashMap hashMap2 = new HashMap();
            String a2 = C0059ao.a(11484);
            boolean z = map.get(a2) != null;
            String a3 = C0059ao.a(11485);
            boolean z2 = map.get(a3) != null;
            if (z && z2) {
                aVar = a.ALL;
            } else if (z) {
                aVar = a.FIRST;
            } else {
                aVar = a.NONE;
            }
            a aVar3 = a.NONE;
            String a4 = C0059ao.a(11486);
            if (aVar != aVar3) {
                Integer num = (Integer) map.get(C0059ao.a(11487));
                String str = (String) map.get(C0059ao.a(11488));
                String a5 = C0059ao.a(11489);
                if (str != null) {
                    hashMap2.put(a5, str);
                } else {
                    hashMap2.put(a5, C0059ao.a(11490));
                }
                d dVar = d.values()[num.intValue()];
                ArrayList arrayList2 = new ArrayList(m203(map.get(a2)));
                if (aVar == a.ALL) {
                    arrayList2.addAll(m203(map.get(a3)));
                }
                d dVar2 = d.MAGNETOMETER;
                String a6 = C0059ao.a(11491);
                if (dVar == dVar2) {
                    ArrayList arrayList3 = new ArrayList();
                    aVar2 = aVar;
                    BigDecimal valueOf = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(1)).doubleValue(), ((BigDecimal) arrayList2.get(0)).doubleValue()) * 57.29577951308232d);
                    DecimalFormat decimalFormat = new DecimalFormat(a6);
                    decimalFormat.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat.format(valueOf))));
                    DecimalFormat decimalFormat2 = new DecimalFormat(a6);
                    decimalFormat2.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat2.format((BigDecimal) arrayList2.get(2)))));
                    ArrayList arrayList4 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(4)).doubleValue(), ((BigDecimal) arrayList2.get(3)).doubleValue()) * 57.29577951308232d).subtract(valueOf);
                        DecimalFormat decimalFormat3 = new DecimalFormat(a6);
                        decimalFormat3.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat3.format(subtract))));
                        BigDecimal subtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                        DecimalFormat decimalFormat4 = new DecimalFormat(a6);
                        decimalFormat4.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat4.format(subtract2))));
                    }
                    arrayList = new ArrayList();
                    arrayList.add(arrayList3);
                    arrayList.add(arrayList4);
                } else {
                    aVar2 = aVar;
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        BigDecimal subtract3 = ((BigDecimal) arrayList2.get(3)).subtract((BigDecimal) arrayList2.get(0));
                        DecimalFormat decimalFormat5 = new DecimalFormat(a6);
                        decimalFormat5.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat5.format(subtract3))));
                        BigDecimal subtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                        DecimalFormat decimalFormat6 = new DecimalFormat(a6);
                        decimalFormat6.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat6.format(subtract4))));
                        BigDecimal subtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                        DecimalFormat decimalFormat7 = new DecimalFormat(a6);
                        decimalFormat7.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat7.format(subtract5))));
                    }
                    ArrayList arrayList6 = new ArrayList();
                    DecimalFormat decimalFormat8 = new DecimalFormat(a6);
                    decimalFormat8.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat8.format((BigDecimal) arrayList2.get(0)))));
                    DecimalFormat decimalFormat9 = new DecimalFormat(a6);
                    decimalFormat9.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat9.format((BigDecimal) arrayList2.get(1)))));
                    DecimalFormat decimalFormat10 = new DecimalFormat(a6);
                    decimalFormat10.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat10.format((BigDecimal) arrayList2.get(2)))));
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(arrayList6);
                    arrayList7.add(arrayList5);
                    arrayList = arrayList7;
                }
                hashMap2.put(C0059ao.a(11492), arrayList);
                hashMap.put(c.values()[num.intValue()].f281, hashMap2);
                if (aVar2 == a.FIRST) {
                    hashMap.put(a4, C0059ao.a(11493));
                }
            } else {
                HashMap hashMap3 = new HashMap();
                hashMap3.put(a4, C0059ao.a(11494));
                return hashMap3;
            }
        }
        return hashMap;
    }
}
