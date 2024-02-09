package org.apache.xml.security.c14n.implementations;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class SymbMap implements Cloneable {
    public int a = 23;
    public NameSpaceSymbEntry[] b = new NameSpaceSymbEntry[23];
    public String[] c = new String[23];

    public int a(Object obj) {
        String str;
        String[] strArr = this.c;
        int length = strArr.length;
        int hashCode = (obj.hashCode() & Api.BaseClientBuilder.API_PRIORITY_OTHER) % length;
        String str2 = strArr[hashCode];
        if (str2 != null && !str2.equals(obj)) {
            int i = length - 1;
            do {
                hashCode = hashCode == i ? 0 : hashCode + 1;
                str = strArr[hashCode];
                if (str == null) {
                    break;
                }
            } while (!str.equals(obj));
        }
        return hashCode;
    }

    public List a() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            NameSpaceSymbEntry[] nameSpaceSymbEntryArr = this.b;
            if (i >= nameSpaceSymbEntryArr.length) {
                return arrayList;
            }
            if (nameSpaceSymbEntryArr[i] != null) {
                if (!C0059ao.a(7757).equals(nameSpaceSymbEntryArr[i].c)) {
                    arrayList.add(this.b[i]);
                }
            }
            i++;
        }
    }

    public NameSpaceSymbEntry a(String str) {
        return this.b[a((Object) str)];
    }

    public void a(int i) {
        String[] strArr = this.c;
        int length = strArr.length;
        NameSpaceSymbEntry[] nameSpaceSymbEntryArr = this.b;
        this.c = new String[i];
        this.b = new NameSpaceSymbEntry[i];
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return;
            }
            if (strArr[i2] != null) {
                String str = strArr[i2];
                int a = a((Object) str);
                this.c[a] = str;
                this.b[a] = nameSpaceSymbEntryArr[i2];
            }
            length = i2;
        }
    }

    public void a(String str, NameSpaceSymbEntry nameSpaceSymbEntry) {
        int a = a((Object) str);
        String[] strArr = this.c;
        String str2 = strArr[a];
        strArr[a] = str;
        this.b[a] = nameSpaceSymbEntry;
        if (str2 == null || !str2.equals(str)) {
            int i = this.a - 1;
            this.a = i;
            if (i == 0) {
                int length = this.b.length;
                this.a = length;
                a(length << 2);
            }
        }
    }

    public Object clone() {
        try {
            SymbMap symbMap = (SymbMap) super.clone();
            NameSpaceSymbEntry[] nameSpaceSymbEntryArr = new NameSpaceSymbEntry[this.b.length];
            symbMap.b = nameSpaceSymbEntryArr;
            NameSpaceSymbEntry[] nameSpaceSymbEntryArr2 = this.b;
            System.arraycopy(nameSpaceSymbEntryArr2, 0, nameSpaceSymbEntryArr, 0, nameSpaceSymbEntryArr2.length);
            String[] strArr = new String[this.c.length];
            symbMap.c = strArr;
            String[] strArr2 = this.c;
            System.arraycopy(strArr2, 0, strArr, 0, strArr2.length);
            return symbMap;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
