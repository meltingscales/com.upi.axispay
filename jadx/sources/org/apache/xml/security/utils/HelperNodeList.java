package org.apache.xml.security.utils;

import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class HelperNodeList implements NodeList {
    public ArrayList a;
    public boolean b;

    public HelperNodeList() {
        this(false);
    }

    public HelperNodeList(boolean z) {
        this.a = new ArrayList(20);
        this.b = false;
        this.b = z;
    }

    @Override // org.w3c.dom.NodeList
    public int getLength() {
        return this.a.size();
    }

    @Override // org.w3c.dom.NodeList
    public Node item(int i) {
        return (Node) this.a.get(i);
    }
}
