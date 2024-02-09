package org.apache.xml.security.utils;

import org.apache.xpath.CachedXPathAPI;
import org.w3c.dom.Document;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class CachedXPathAPIHolder {
    public static ThreadLocal a = new ThreadLocal();
    public static ThreadLocal b = new ThreadLocal();

    public static CachedXPathAPI a() {
        CachedXPathAPI cachedXPathAPI = (CachedXPathAPI) a.get();
        if (cachedXPathAPI == null) {
            CachedXPathAPI cachedXPathAPI2 = new CachedXPathAPI();
            a.set(cachedXPathAPI2);
            b.set(null);
            return cachedXPathAPI2;
        }
        return cachedXPathAPI;
    }

    public static void a(Document document) {
        if (b.get() != document) {
            CachedXPathAPI cachedXPathAPI = (CachedXPathAPI) a.get();
            if (cachedXPathAPI != null) {
                cachedXPathAPI.getXPathContext().reset();
                b.set(document);
                return;
            }
            a.set(new CachedXPathAPI());
            b.set(document);
        }
    }
}
