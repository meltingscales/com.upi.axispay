package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: tl0  reason: default package */
/* loaded from: classes.dex */
public final class tl0 implements wm0<Object>, sl0 {
    public static final Map<Class<? extends Object<?>>, Integer> c;
    public static final HashMap<String, String> d;
    public static final HashMap<String, String> e;
    public static final HashMap<String, String> f;
    public final Class<?> b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        List h = aj0.h(sk0.class, dl0.class, hl0.class, il0.class, jl0.class, kl0.class, ll0.class, ml0.class, nl0.class, ol0.class, tk0.class, uk0.class, vk0.class, wk0.class, xk0.class, yk0.class, zk0.class, al0.class, bl0.class, cl0.class, el0.class, fl0.class, gl0.class);
        ArrayList arrayList = new ArrayList(bj0.o(h, 10));
        for (Object obj : h) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(li0.a((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                aj0.n();
                throw null;
            }
        }
        c = qj0.g(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        String a = C0059ao.a(4861);
        String a2 = C0059ao.a(4862);
        hashMap.put(a, a2);
        String a3 = C0059ao.a(4863);
        String a4 = C0059ao.a(4864);
        hashMap.put(a3, a4);
        String a5 = C0059ao.a(4865);
        String a6 = C0059ao.a(4866);
        hashMap.put(a5, a6);
        String a7 = C0059ao.a(4867);
        String a8 = C0059ao.a(4868);
        hashMap.put(a7, a8);
        String a9 = C0059ao.a(4869);
        String a10 = C0059ao.a(4870);
        hashMap.put(a9, a10);
        String a11 = C0059ao.a(4871);
        String a12 = C0059ao.a(4872);
        hashMap.put(a11, a12);
        String a13 = C0059ao.a(4873);
        String a14 = C0059ao.a(4874);
        hashMap.put(a13, a14);
        String a15 = C0059ao.a(4875);
        String a16 = C0059ao.a(4876);
        hashMap.put(a15, a16);
        d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put(C0059ao.a(4877), a2);
        hashMap2.put(C0059ao.a(4878), a4);
        hashMap2.put(C0059ao.a(4879), a6);
        hashMap2.put(C0059ao.a(4880), a8);
        hashMap2.put(C0059ao.a(4881), a10);
        hashMap2.put(C0059ao.a(4882), a12);
        hashMap2.put(C0059ao.a(4883), a14);
        hashMap2.put(C0059ao.a(4884), a16);
        e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put(C0059ao.a(4885), C0059ao.a(4886));
        hashMap3.put(C0059ao.a(4887), C0059ao.a(4888));
        hashMap3.put(C0059ao.a(4889), C0059ao.a(4890));
        hashMap3.put(C0059ao.a(4891), C0059ao.a(4892));
        hashMap3.put(C0059ao.a(4893), C0059ao.a(4894));
        hashMap3.put(C0059ao.a(4895), C0059ao.a(4896));
        hashMap3.put(C0059ao.a(4897), C0059ao.a(4898));
        hashMap3.put(C0059ao.a(4899), C0059ao.a(4900));
        hashMap3.put(C0059ao.a(4901), C0059ao.a(4902));
        hashMap3.put(C0059ao.a(4903), C0059ao.a(4904));
        hashMap3.put(C0059ao.a(4905), C0059ao.a(4906));
        hashMap3.put(C0059ao.a(4907), C0059ao.a(4908));
        hashMap3.put(C0059ao.a(4909), C0059ao.a(4910));
        hashMap3.put(C0059ao.a(4911), C0059ao.a(4912));
        hashMap3.put(C0059ao.a(4913), C0059ao.a(4914));
        hashMap3.put(C0059ao.a(4915), C0059ao.a(4916));
        hashMap3.put(C0059ao.a(4917), C0059ao.a(4918));
        hashMap3.put(C0059ao.a(4919), C0059ao.a(4920));
        hashMap3.put(C0059ao.a(4921), C0059ao.a(4922));
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        yl0.d(values, C0059ao.a(4923));
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(4924));
            yl0.d(str, C0059ao.a(4925));
            sb.append(co0.o0(str, '.', null, 2, null));
            sb.append(C0059ao.a(4926));
            gi0 a17 = li0.a(sb.toString(), yl0.l(str, C0059ao.a(4927)));
            hashMap3.put(a17.c(), a17.d());
        }
        for (Map.Entry<Class<? extends Object<?>>, Integer> entry : c.entrySet()) {
            hashMap3.put(entry.getKey().getName(), yl0.l(C0059ao.a(4928), Integer.valueOf(entry.getValue().intValue())));
        }
        f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(pj0.a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), co0.o0((String) entry2.getValue(), '.', null, 2, null));
        }
    }

    public tl0(Class<?> cls) {
        yl0.e(cls, C0059ao.a(4929));
        this.b = cls;
    }

    @Override // defpackage.sl0
    public Class<?> a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof tl0) && yl0.a(qk0.a(this), qk0.a((wm0) obj));
    }

    public int hashCode() {
        return qk0.a(this).hashCode();
    }

    public String toString() {
        return yl0.l(a().toString(), C0059ao.a(4930));
    }
}
