package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: y8  reason: default package */
/* loaded from: classes.dex */
public class y8 {

    /* compiled from: AxisPay */
    /* renamed from: y8$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: AxisPay */
    /* renamed from: y8$b */
    /* loaded from: classes.dex */
    public static final class b implements a {
        public final c[] a;

        public b(c[] cVarArr) {
            this.a = cVarArr;
        }

        public c[] a() {
            return this.a;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: y8$c */
    /* loaded from: classes.dex */
    public static final class c {
        public final String a;
        public int b;
        public boolean c;
        public String d;
        public int e;
        public int f;

        public c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: y8$d */
    /* loaded from: classes.dex */
    public static final class d implements a {
        public final ma a;
        public final int b;
        public final int c;
        public final String d;

        public d(ma maVar, int i, int i2, String str) {
            this.a = maVar;
            this.c = i;
            this.b = i2;
            this.d = str;
        }

        public int a() {
            return this.c;
        }

        public ma b() {
            return this.a;
        }

        public String c() {
            return this.d;
        }

        public int d() {
            return this.b;
        }
    }

    public static int a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException(C0059ao.a(6201));
    }

    public static List<List<byte[]>> c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        String a2 = C0059ao.a(6202);
        xmlPullParser.require(2, null, a2);
        if (xmlPullParser.getName().equals(a2)) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c8.FontFamily);
        String string = obtainAttributes.getString(c8.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(c8.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(c8.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(c8.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(c8.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(c8.FontFamily_fontProviderFetchTimeout, FirebaseCrashlytics.APP_EXCEPTION_CALLBACK_TIMEOUT_MS);
        String string4 = obtainAttributes.getString(c8.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new ma(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(C0059ao.a(6203))) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    public static c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c8.FontFamilyFont);
        int i = c8.FontFamilyFont_fontWeight;
        if (!obtainAttributes.hasValue(i)) {
            i = c8.FontFamilyFont_android_fontWeight;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = c8.FontFamilyFont_fontStyle;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = c8.FontFamilyFont_android_fontStyle;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = c8.FontFamilyFont_ttcIndex;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = c8.FontFamilyFont_android_ttcIndex;
        }
        int i5 = c8.FontFamilyFont_fontVariationSettings;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = c8.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = c8.FontFamilyFont_font;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = c8.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new c(string2, i2, z, string, i6, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
