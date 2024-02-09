package com.crashlytics.android.answers;

import android.os.Bundle;
import com.crashlytics.android.answers.SessionEvent;
import io.fabric.sdk.android.Fabric;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FirebaseAnalyticsEventMapper {
    private static final Set<String> EVENT_NAMES;
    private static final String FIREBASE_LEVEL_NAME = null;
    private static final String FIREBASE_METHOD = null;
    private static final String FIREBASE_RATING = null;
    private static final String FIREBASE_SUCCESS = null;

    static {
        C0059ao.a(FirebaseAnalyticsEventMapper.class, 98);
        EVENT_NAMES = new HashSet(Arrays.asList(C0059ao.a(11950), C0059ao.a(11951), C0059ao.a(11952), C0059ao.a(11953), C0059ao.a(11954), C0059ao.a(11955), C0059ao.a(11956), C0059ao.a(11957), C0059ao.a(11958), C0059ao.a(11959), C0059ao.a(11960), C0059ao.a(11961), C0059ao.a(11962), C0059ao.a(11963), C0059ao.a(11964), C0059ao.a(11965), C0059ao.a(11966), C0059ao.a(11967), C0059ao.a(11968), C0059ao.a(11969), C0059ao.a(11970), C0059ao.a(11971), C0059ao.a(11972), C0059ao.a(11973), C0059ao.a(11974), C0059ao.a(11975)));
    }

    private String mapAttribute(String str) {
        if (str == null || str.length() == 0) {
            return C0059ao.a(11982);
        }
        String replaceAll = str.replaceAll(C0059ao.a(11976), C0059ao.a(11977));
        if (replaceAll.startsWith(C0059ao.a(11978)) || replaceAll.startsWith(C0059ao.a(11979)) || replaceAll.startsWith(C0059ao.a(11980)) || !Character.isLetter(replaceAll.charAt(0))) {
            replaceAll = C0059ao.a(11981) + replaceAll;
        }
        return replaceAll.length() > 40 ? replaceAll.substring(0, 40) : replaceAll;
    }

    private Integer mapBooleanValue(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(str.equals(C0059ao.a(11983)) ? 1 : 0);
    }

    private void mapCustomEventAttributes(Bundle bundle, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String mapAttribute = mapAttribute(entry.getKey());
            if (value instanceof String) {
                bundle.putString(mapAttribute, entry.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(mapAttribute, ((Double) entry.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(mapAttribute, ((Long) entry.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(mapAttribute, ((Integer) entry.getValue()).intValue());
            }
        }
    }

    private String mapCustomEventName(String str) {
        if (str == null || str.length() == 0) {
            return C0059ao.a(11990);
        }
        boolean contains = EVENT_NAMES.contains(str);
        String a = C0059ao.a(11984);
        if (contains) {
            return a + str;
        }
        String replaceAll = str.replaceAll(C0059ao.a(11985), C0059ao.a(11986));
        if (replaceAll.startsWith(C0059ao.a(11987)) || replaceAll.startsWith(C0059ao.a(11988)) || replaceAll.startsWith(C0059ao.a(11989)) || !Character.isLetter(replaceAll.charAt(0))) {
            replaceAll = a + replaceAll;
        }
        return replaceAll.length() > 40 ? replaceAll.substring(0, 40) : replaceAll;
    }

    private Double mapDouble(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf == null) {
            return null;
        }
        return Double.valueOf(valueOf);
    }

    private Bundle mapPredefinedEvent(SessionEvent sessionEvent) {
        Bundle bundle = new Bundle();
        boolean equals = C0059ao.a(11991).equals(sessionEvent.predefinedType);
        String a = C0059ao.a(11992);
        String a2 = C0059ao.a(11993);
        String a3 = C0059ao.a(11994);
        String a4 = C0059ao.a(11995);
        String a5 = C0059ao.a(11996);
        String a6 = C0059ao.a(11997);
        String a7 = C0059ao.a(11998);
        String a8 = C0059ao.a(11999);
        String a9 = C0059ao.a(12000);
        if (equals) {
            putString(bundle, a8, (String) sessionEvent.predefinedAttributes.get(a4));
            putString(bundle, a7, (String) sessionEvent.predefinedAttributes.get(a3));
            putString(bundle, a2, (String) sessionEvent.predefinedAttributes.get(a));
            putDouble(bundle, a6, mapPriceValue(sessionEvent.predefinedAttributes.get(a5)));
            putString(bundle, a9, (String) sessionEvent.predefinedAttributes.get(a9));
        } else {
            boolean equals2 = C0059ao.a(12001).equals(sessionEvent.predefinedType);
            String a10 = C0059ao.a(12002);
            if (equals2) {
                putString(bundle, a8, (String) sessionEvent.predefinedAttributes.get(a4));
                putString(bundle, a7, (String) sessionEvent.predefinedAttributes.get(a3));
                putString(bundle, a2, (String) sessionEvent.predefinedAttributes.get(a));
                putDouble(bundle, C0059ao.a(12003), mapPriceValue(sessionEvent.predefinedAttributes.get(a5)));
                putDouble(bundle, a6, mapPriceValue(sessionEvent.predefinedAttributes.get(a5)));
                putString(bundle, a9, (String) sessionEvent.predefinedAttributes.get(a9));
                bundle.putLong(a10, 1L);
            } else {
                if (C0059ao.a(12004).equals(sessionEvent.predefinedType)) {
                    putLong(bundle, a10, Long.valueOf(((Integer) sessionEvent.predefinedAttributes.get(C0059ao.a(12005))).intValue()));
                    putDouble(bundle, a6, mapPriceValue(sessionEvent.predefinedAttributes.get(C0059ao.a(12006))));
                    putString(bundle, a9, (String) sessionEvent.predefinedAttributes.get(a9));
                } else {
                    boolean equals3 = C0059ao.a(12007).equals(sessionEvent.predefinedType);
                    String a11 = C0059ao.a(12008);
                    String a12 = C0059ao.a(12009);
                    String a13 = C0059ao.a(12010);
                    String a14 = C0059ao.a(12011);
                    if (equals3) {
                        putString(bundle, a14, (String) sessionEvent.predefinedAttributes.get(a13));
                        putString(bundle, a8, (String) sessionEvent.predefinedAttributes.get(a12));
                        putString(bundle, a7, (String) sessionEvent.predefinedAttributes.get(a11));
                    } else {
                        if (C0059ao.a(12012).equals(sessionEvent.predefinedType)) {
                            putString(bundle, C0059ao.a(12014), (String) sessionEvent.predefinedAttributes.get(C0059ao.a(12013)));
                        } else {
                            boolean equals4 = C0059ao.a(12015).equals(sessionEvent.predefinedType);
                            String a15 = C0059ao.a(12016);
                            if (equals4) {
                                putString(bundle, a15, (String) sessionEvent.predefinedAttributes.get(a15));
                                putString(bundle, a14, (String) sessionEvent.predefinedAttributes.get(a13));
                                putString(bundle, a8, (String) sessionEvent.predefinedAttributes.get(a12));
                                putString(bundle, a7, (String) sessionEvent.predefinedAttributes.get(a11));
                            } else {
                                String str = sessionEvent.predefinedType;
                                String a16 = C0059ao.a(12017);
                                if (a16.equals(str)) {
                                    putString(bundle, a16, String.valueOf(sessionEvent.predefinedAttributes.get(a16)));
                                    putString(bundle, a14, (String) sessionEvent.predefinedAttributes.get(a13));
                                    putString(bundle, a8, (String) sessionEvent.predefinedAttributes.get(a12));
                                    putString(bundle, a7, (String) sessionEvent.predefinedAttributes.get(a11));
                                } else {
                                    if (C0059ao.a(12018).equals(sessionEvent.predefinedType)) {
                                        putString(bundle, a15, (String) sessionEvent.predefinedAttributes.get(a15));
                                    } else {
                                        if (C0059ao.a(12019).equals(sessionEvent.predefinedType)) {
                                            putString(bundle, a15, (String) sessionEvent.predefinedAttributes.get(a15));
                                        } else {
                                            if (C0059ao.a(12020).equals(sessionEvent.predefinedType)) {
                                                putString(bundle, a15, (String) sessionEvent.predefinedAttributes.get(a15));
                                            } else {
                                                boolean equals5 = C0059ao.a(12021).equals(sessionEvent.predefinedType);
                                                String a17 = C0059ao.a(12022);
                                                String a18 = C0059ao.a(12023);
                                                if (equals5) {
                                                    putString(bundle, a18, (String) sessionEvent.predefinedAttributes.get(a17));
                                                } else {
                                                    if (C0059ao.a(12024).equals(sessionEvent.predefinedType)) {
                                                        Map<String, Object> map = sessionEvent.predefinedAttributes;
                                                        String a19 = C0059ao.a(12025);
                                                        putDouble(bundle, a19, mapDouble(map.get(a19)));
                                                        putString(bundle, a18, (String) sessionEvent.predefinedAttributes.get(a17));
                                                        Map<String, Object> map2 = sessionEvent.predefinedAttributes;
                                                        String a20 = C0059ao.a(12026);
                                                        putInt(bundle, a20, mapBooleanValue((String) map2.get(a20)));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        mapCustomEventAttributes(bundle, sessionEvent.customAttributes);
        return bundle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fe, code lost:
        if (r11.equals(myunmn.C0059ao.a(12040)) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String mapPredefinedEventName(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.answers.FirebaseAnalyticsEventMapper.mapPredefinedEventName(java.lang.String, boolean):java.lang.String");
    }

    private Double mapPriceValue(Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return null;
        }
        return Double.valueOf(new BigDecimal(l.longValue()).divide(AddToCartEvent.MICRO_CONSTANT).doubleValue());
    }

    private void putDouble(Bundle bundle, String str, Double d) {
        Double mapDouble = mapDouble(d);
        if (mapDouble == null) {
            return;
        }
        bundle.putDouble(str, mapDouble.doubleValue());
    }

    private void putInt(Bundle bundle, String str, Integer num) {
        if (num == null) {
            return;
        }
        bundle.putInt(str, num.intValue());
    }

    private void putLong(Bundle bundle, String str, Long l) {
        if (l == null) {
            return;
        }
        bundle.putLong(str, l.longValue());
    }

    private void putString(Bundle bundle, String str, String str2) {
        if (str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public FirebaseAnalyticsEvent mapEvent(SessionEvent sessionEvent) {
        Bundle bundle;
        String mapCustomEventName;
        boolean z = true;
        boolean z2 = SessionEvent.Type.CUSTOM.equals(sessionEvent.type) && sessionEvent.customType != null;
        boolean z3 = SessionEvent.Type.PREDEFINED.equals(sessionEvent.type) && sessionEvent.predefinedType != null;
        if (z2 || z3) {
            if (z3) {
                bundle = mapPredefinedEvent(sessionEvent);
            } else {
                bundle = new Bundle();
                Map<String, Object> map = sessionEvent.customAttributes;
                if (map != null) {
                    mapCustomEventAttributes(bundle, map);
                }
            }
            if (z3) {
                String str = (String) sessionEvent.predefinedAttributes.get(C0059ao.a(12050));
                if (str == null || Boolean.parseBoolean(str)) {
                    z = false;
                }
                mapCustomEventName = mapPredefinedEventName(sessionEvent.predefinedType, z);
            } else {
                mapCustomEventName = mapCustomEventName(sessionEvent.customType);
            }
            Fabric.getLogger().d(C0059ao.a(12051), C0059ao.a(12052));
            return new FirebaseAnalyticsEvent(mapCustomEventName, bundle);
        }
        return null;
    }
}
