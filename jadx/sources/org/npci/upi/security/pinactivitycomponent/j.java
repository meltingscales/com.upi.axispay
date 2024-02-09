package org.npci.upi.security.pinactivitycomponent;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class j {
    public static String a(Object obj) {
        StringBuilder sb = new StringBuilder();
        b(obj, sb);
        return sb.toString();
    }

    public static void b(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append(C0059ao.a(2245));
            return;
        }
        Class<?> cls = obj.getClass();
        boolean isArray = cls.isArray();
        String a = C0059ao.a(2246);
        int i = 0;
        if (isArray) {
            sb.append(C0059ao.a(2247));
            while (i < Array.getLength(obj)) {
                b(Array.get(obj, i), sb);
                sb.append(a);
                i++;
            }
            sb.replace(sb.length() - 1, sb.length(), C0059ao.a(2248));
            return;
        }
        boolean equals = cls.equals(String.class);
        String a2 = C0059ao.a(2249);
        if (equals) {
            sb.append(a2);
            sb.append(obj);
            sb.append(a2);
        } else if (cls.isPrimitive() || cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Short.class) || cls.equals(Double.class) || cls.equals(Float.class) || cls.equals(BigDecimal.class)) {
            sb.append(String.valueOf(obj));
        } else {
            try {
                sb.append(C0059ao.a(2250));
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                while (i < length) {
                    Field field = declaredFields[i];
                    if (!Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        sb.append(a2);
                        sb.append(field.getName());
                        sb.append(a2);
                        sb.append(C0059ao.a(2251));
                        b(field.get(obj), sb);
                        sb.append(a);
                    }
                    i++;
                }
                sb.replace(sb.length() - 1, sb.length(), C0059ao.a(2252));
            } catch (Exception e) {
                l.b(C0059ao.a(2254), C0059ao.a(2253) + e.getLocalizedMessage());
            }
        }
    }
}
