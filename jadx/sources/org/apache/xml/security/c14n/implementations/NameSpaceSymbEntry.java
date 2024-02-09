package org.apache.xml.security.c14n.implementations;

import org.w3c.dom.Attr;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class NameSpaceSymbEntry implements Cloneable {
    public String b;
    public String c;
    public boolean e;
    public Attr f;
    public int a = 0;
    public String d = null;

    public NameSpaceSymbEntry(String str, Attr attr, boolean z, String str2) {
        this.e = false;
        this.c = str;
        this.e = z;
        this.f = attr;
        this.b = str2;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
