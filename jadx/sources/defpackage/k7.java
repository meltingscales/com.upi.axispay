package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: k7  reason: default package */
/* loaded from: classes.dex */
public class k7 {
    public final ConstraintLayout a;
    public l7 b;
    public int c = -1;
    public int d = -1;
    public SparseArray<a> e = new SparseArray<>();
    public SparseArray<l7> f = new SparseArray<>();
    public n7 g;

    /* compiled from: AxisPay */
    /* renamed from: k7$a */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public ArrayList<b> b = new ArrayList<>();
        public int c;
        public l7 d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), q7.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == q7.State_android_id) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == q7.State_constraints) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if (C0059ao.a(12912).equals(resourceTypeName)) {
                        l7 l7Var = new l7();
                        this.d = l7Var;
                        l7Var.f(context, this.c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.b.add(bVar);
        }

        public int b(float f, float f2) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: k7$b */
    /* loaded from: classes.dex */
    public static class b {
        public float a;
        public float b;
        public float c;
        public float d;
        public int e;
        public l7 f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), q7.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == q7.Variant_constraints) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if (C0059ao.a(12973).equals(resourceTypeName)) {
                        l7 l7Var = new l7();
                        this.f = l7Var;
                        l7Var.f(context, this.e);
                    }
                } else if (index == q7.Variant_region_heightLessThan) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == q7.Variant_region_heightMoreThan) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else if (index == q7.Variant_region_widthLessThan) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == q7.Variant_region_widthMoreThan) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f, float f2) {
            if (Float.isNaN(this.a) || f >= this.a) {
                if (Float.isNaN(this.b) || f2 >= this.b) {
                    if (Float.isNaN(this.c) || f <= this.c) {
                        return Float.isNaN(this.d) || f2 <= this.d;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public k7(Context context, ConstraintLayout constraintLayout, int i) {
        this.a = constraintLayout;
        a(context, i);
    }

    public final void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        a aVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                boolean z = true;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals(C0059ao.a(9475))) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 80204913:
                            if (name.equals(C0059ao.a(9474))) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 1382829617:
                            if (name.equals(C0059ao.a(9473))) {
                                break;
                            }
                            z = true;
                            break;
                        case 1657696882:
                            if (name.equals(C0059ao.a(9472))) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        case 1901439077:
                            if (name.equals(C0059ao.a(9471))) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        default:
                            z = true;
                            break;
                    }
                    if (z) {
                        aVar = new a(context, xml);
                        this.e.put(aVar.a, aVar);
                        continue;
                    } else if (z) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                            continue;
                        } else {
                            continue;
                        }
                    } else if (!z) {
                        continue;
                    } else {
                        b(context, xml);
                        continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        l7 l7Var = new l7();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null) {
                String a2 = C0059ao.a(9476);
                if (a2.equals(attributeName)) {
                    int identifier = attributeValue.contains(C0059ao.a(9477)) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), a2, context.getPackageName()) : -1;
                    if (identifier == -1) {
                        if (attributeValue.length() > 1) {
                            identifier = Integer.parseInt(attributeValue.substring(1));
                        } else {
                            Log.e(C0059ao.a(9478), C0059ao.a(9479));
                        }
                    }
                    l7Var.n(context, xmlPullParser);
                    this.f.put(identifier, l7Var);
                    return;
                }
            }
        }
    }

    public void c(n7 n7Var) {
    }

    public void d(int i, float f, float f2) {
        l7 l7Var;
        int i2;
        a aVar;
        int b2;
        l7 l7Var2;
        int i3;
        int i4 = this.c;
        if (i4 == i) {
            if (i == -1) {
                aVar = this.e.valueAt(0);
            } else {
                aVar = this.e.get(i4);
            }
            int i5 = this.d;
            if ((i5 == -1 || !aVar.b.get(i5).a(f, f2)) && this.d != (b2 = aVar.b(f, f2))) {
                if (b2 == -1) {
                    l7Var2 = this.b;
                } else {
                    l7Var2 = aVar.b.get(b2).f;
                }
                if (b2 == -1) {
                    i3 = aVar.c;
                } else {
                    i3 = aVar.b.get(b2).e;
                }
                if (l7Var2 == null) {
                    return;
                }
                this.d = b2;
                n7 n7Var = this.g;
                if (n7Var != null) {
                    n7Var.b(-1, i3);
                }
                l7Var2.c(this.a);
                n7 n7Var2 = this.g;
                if (n7Var2 != null) {
                    n7Var2.a(-1, i3);
                    return;
                }
                return;
            }
            return;
        }
        this.c = i;
        a aVar2 = this.e.get(i);
        int b3 = aVar2.b(f, f2);
        if (b3 == -1) {
            l7Var = aVar2.d;
        } else {
            l7Var = aVar2.b.get(b3).f;
        }
        if (b3 == -1) {
            i2 = aVar2.c;
        } else {
            i2 = aVar2.b.get(b3).e;
        }
        if (l7Var == null) {
            String str = C0059ao.a(9480) + i + C0059ao.a(9481) + f + C0059ao.a(9482) + f2;
            return;
        }
        this.d = b3;
        n7 n7Var3 = this.g;
        if (n7Var3 != null) {
            n7Var3.b(i, i2);
        }
        l7Var.c(this.a);
        n7 n7Var4 = this.g;
        if (n7Var4 != null) {
            n7Var4.a(i, i2);
        }
    }
}
