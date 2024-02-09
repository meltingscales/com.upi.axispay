package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ep  reason: default package */
/* loaded from: classes.dex */
public final class ep implements dq {
    public static final String c = gp.a(C0059ao.a(5059), C0059ao.a(5060));
    public static final String d = gp.a(C0059ao.a(5061), C0059ao.a(5062));
    public static final String e = gp.a(C0059ao.a(5063), C0059ao.a(5064));
    public static final Set<vo> f = Collections.unmodifiableSet(new HashSet(Arrays.asList(vo.b(C0059ao.a(5065)), vo.b(C0059ao.a(5066)))));
    public final String a;
    public final String b;

    public ep(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static ep d(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C0059ao.a(5067)));
        if (str.startsWith(C0059ao.a(5068))) {
            String[] split = str.substring(2).split(Pattern.quote(C0059ao.a(5069)), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new ep(str2, str3);
                }
                throw new IllegalArgumentException(C0059ao.a(5070));
            }
            throw new IllegalArgumentException(C0059ao.a(5071));
        }
        throw new IllegalArgumentException(C0059ao.a(5072));
    }

    @Override // defpackage.cq
    public String a() {
        return C0059ao.a(5073);
    }

    @Override // defpackage.dq
    public Set<vo> b() {
        return f;
    }

    public byte[] c() {
        String str = this.b;
        if (str == null && this.a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = C0059ao.a(5074);
        objArr[1] = this.a;
        objArr[2] = C0059ao.a(5075);
        if (str == null) {
            str = C0059ao.a(5076);
        }
        objArr[3] = str;
        return String.format(C0059ao.a(5077), objArr).getBytes(Charset.forName(C0059ao.a(5078)));
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.a;
    }

    @Override // defpackage.cq
    public byte[] getExtras() {
        return c();
    }
}
