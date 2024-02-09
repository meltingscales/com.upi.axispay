package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vl  reason: default package */
/* loaded from: classes.dex */
public final class vl implements em {
    public final String b;
    public final Object[] c;

    public vl(String str, Object[] objArr) {
        this.b = str;
        this.c = objArr;
    }

    public static void a(dm dmVar, int i, Object obj) {
        if (obj == null) {
            dmVar.q(i);
        } else if (obj instanceof byte[]) {
            dmVar.H(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            dmVar.s(i, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dmVar.s(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dmVar.C(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dmVar.C(i, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dmVar.C(i, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dmVar.C(i, ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dmVar.a(i, (String) obj);
        } else if (obj instanceof Boolean) {
            dmVar.C(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
        } else {
            throw new IllegalArgumentException(C0059ao.a(4810) + obj + C0059ao.a(4811) + i + C0059ao.a(4812));
        }
    }

    public static void c(dm dmVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            a(dmVar, i, obj);
        }
    }

    @Override // defpackage.em
    public String b() {
        return this.b;
    }

    @Override // defpackage.em
    public void j(dm dmVar) {
        c(dmVar, this.c);
    }

    public vl(String str) {
        this(str, null);
    }
}
