package org.apache.xml.security.transforms.implementations;

import java.util.Iterator;
import java.util.Set;
import org.apache.xml.security.signature.NodeFilter;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Node;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class XPath2NodeFilter implements NodeFilter {
    public boolean a;
    public boolean b;
    public boolean c;
    public Set d;
    public Set e;
    public Set f;
    public int g = -1;
    public int h = -1;
    public int i = -1;

    public XPath2NodeFilter(Set set, Set set2, Set set3) {
        this.d = set;
        this.a = !set.isEmpty();
        this.e = set2;
        this.b = !set2.isEmpty();
        this.f = set3;
        this.c = !set3.isEmpty();
    }

    public static boolean a(Node node, Set set) {
        if (set.contains(node)) {
            return true;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (XMLUtils.a((Node) it.next(), node)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Node node, Set set) {
        return set.contains(node);
    }

    @Override // org.apache.xml.security.signature.NodeFilter
    public int a(Node node) {
        int i = (this.b && a(node, this.e)) ? -1 : (!this.c || a(node, this.f)) ? 1 : 0;
        if (i == 1) {
            return 1;
        }
        return this.a ? a(node, this.d) ? 1 : 0 : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    @Override // org.apache.xml.security.signature.NodeFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(org.w3c.dom.Node r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.b
            r1 = 1
            r2 = -1
            if (r0 == 0) goto L1f
            int r0 = r5.g
            if (r0 == r2) goto Lc
            if (r7 > r0) goto L19
        Lc:
            java.util.Set r0 = r5.e
            boolean r0 = b(r6, r0)
            if (r0 == 0) goto L17
            r5.g = r7
            goto L19
        L17:
            r5.g = r2
        L19:
            int r0 = r5.g
            if (r0 == r2) goto L1f
            r0 = r2
            goto L20
        L1f:
            r0 = r1
        L20:
            r3 = 0
            if (r0 == r2) goto L3b
            boolean r4 = r5.c
            if (r4 == 0) goto L3b
            int r4 = r5.h
            if (r4 == r2) goto L2d
            if (r7 > r4) goto L3b
        L2d:
            java.util.Set r4 = r5.f
            boolean r4 = b(r6, r4)
            if (r4 != 0) goto L39
            r5.h = r2
            r0 = r3
            goto L3b
        L39:
            r5.h = r7
        L3b:
            int r4 = r5.i
            if (r7 > r4) goto L41
            r5.i = r2
        L41:
            if (r0 != r1) goto L44
            return r1
        L44:
            boolean r4 = r5.a
            if (r4 == 0) goto L5b
            int r0 = r5.i
            if (r0 != r2) goto L56
            java.util.Set r0 = r5.d
            boolean r6 = b(r6, r0)
            if (r6 == 0) goto L56
            r5.i = r7
        L56:
            int r6 = r5.i
            if (r6 == r2) goto L5c
            return r1
        L5b:
            r3 = r0
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.transforms.implementations.XPath2NodeFilter.a(org.w3c.dom.Node, int):int");
    }
}
