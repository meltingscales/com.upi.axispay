package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.oc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: lc  reason: default package */
/* loaded from: classes.dex */
public class lc {
    public static int d;
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    /* compiled from: AxisPay */
    /* renamed from: lc$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final a e = new a(1, null);
        public static final a f = new a(2, null);
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public final Object a;
        public final int b;
        public final Class<? extends oc.a> c;
        public final oc d;

        static {
            new a(4, null);
            new a(8, null);
            g = new a(16, null);
            new a(32, null);
            new a(64, null);
            new a(Barcode.ITF, null);
            new a((int) Barcode.QR_CODE, (CharSequence) null, oc.b.class);
            new a((int) Barcode.UPC_A, (CharSequence) null, oc.b.class);
            new a(1024, (CharSequence) null, oc.c.class);
            new a((int) Barcode.PDF417, (CharSequence) null, oc.c.class);
            h = new a(Barcode.AZTEC, null);
            i = new a(UserMetadata.MAX_INTERNAL_KEY_SIZE, null);
            new a(16384, null);
            new a(32768, null);
            new a(LogFileManager.MAX_LOG_SIZE, null);
            new a(131072, (CharSequence) null, oc.g.class);
            j = new a(262144, null);
            k = new a(524288, null);
            l = new a(CommonUtils.BYTES_IN_A_MEGABYTE, null);
            new a(2097152, (CharSequence) null, oc.h.class);
            int i2 = Build.VERSION.SDK_INT;
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, oc.e.class);
            m = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            n = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, oc.f.class);
            new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, oc.d.class);
            new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a a(CharSequence charSequence, oc ocVar) {
            return new a(null, this.b, charSequence, ocVar, this.c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
            }
            return null;
        }

        public boolean d(View view, Bundle bundle) {
            if (this.d != null) {
                oc.a aVar = null;
                Class<? extends oc.a> cls = this.c;
                if (cls != null) {
                    try {
                        oc.a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            newInstance.a(bundle);
                            aVar = newInstance;
                        } catch (Exception e2) {
                            e = e2;
                            aVar = newInstance;
                            Class<? extends oc.a> cls2 = this.c;
                            String a = cls2 == null ? C0059ao.a(2621) : cls2.getName();
                            Log.e(C0059ao.a(2623), C0059ao.a(2622) + a, e);
                            return this.d.a(view, aVar);
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                return this.d.a(view, aVar);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                Object obj2 = this.a;
                return obj2 == null ? aVar.a == null : obj2.equals(aVar.a);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i2, CharSequence charSequence, oc ocVar) {
            this(null, i2, charSequence, ocVar, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i2, CharSequence charSequence, Class<? extends oc.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        public a(Object obj, int i2, CharSequence charSequence, oc ocVar, Class<? extends oc.a> cls) {
            this.b = i2;
            this.d = ocVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.a = obj;
            }
            this.c = cls;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: lc$b */
    /* loaded from: classes.dex */
    public static class b {
        public final Object a;

        public b(Object obj) {
            this.a = obj;
        }

        public static b a(int i, int i2, boolean z) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new b(null);
        }

        public static b b(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new b(null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: lc$c */
    /* loaded from: classes.dex */
    public static class c {
        public final Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public static c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new c(null);
        }
    }

    public lc(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static lc E0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new lc(accessibilityNodeInfo);
    }

    public static lc N() {
        return E0(AccessibilityNodeInfo.obtain());
    }

    public static lc O(View view) {
        return E0(AccessibilityNodeInfo.obtain(view));
    }

    public static lc P(lc lcVar) {
        return E0(AccessibilityNodeInfo.obtain(lcVar.a));
    }

    public static String j(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return C0059ao.a(11904);
                    case 8:
                        return C0059ao.a(11903);
                    case 16:
                        return C0059ao.a(11902);
                    case 32:
                        return C0059ao.a(11901);
                    case 64:
                        return C0059ao.a(11900);
                    case Barcode.ITF /* 128 */:
                        return C0059ao.a(11899);
                    case Barcode.QR_CODE /* 256 */:
                        return C0059ao.a(11898);
                    case Barcode.UPC_A /* 512 */:
                        return C0059ao.a(11897);
                    case 1024:
                        return C0059ao.a(11896);
                    case Barcode.PDF417 /* 2048 */:
                        return C0059ao.a(11895);
                    case Barcode.AZTEC /* 4096 */:
                        return C0059ao.a(11894);
                    case UserMetadata.MAX_INTERNAL_KEY_SIZE /* 8192 */:
                        return C0059ao.a(11893);
                    case 16384:
                        return C0059ao.a(11892);
                    case 32768:
                        return C0059ao.a(11891);
                    case LogFileManager.MAX_LOG_SIZE /* 65536 */:
                        return C0059ao.a(11890);
                    case 131072:
                        return C0059ao.a(11889);
                    case 262144:
                        return C0059ao.a(11888);
                    case 524288:
                        return C0059ao.a(11887);
                    case 2097152:
                        return C0059ao.a(11886);
                    case 16908354:
                        return C0059ao.a(11885);
                    case 16908372:
                        return C0059ao.a(11884);
                    default:
                        switch (i) {
                            case 16908342:
                                return C0059ao.a(11883);
                            case 16908343:
                                return C0059ao.a(11882);
                            case 16908344:
                                return C0059ao.a(11881);
                            case 16908345:
                                return C0059ao.a(11880);
                            case 16908346:
                                return C0059ao.a(11879);
                            case 16908347:
                                return C0059ao.a(11878);
                            case 16908348:
                                return C0059ao.a(11877);
                            case 16908349:
                                return C0059ao.a(11876);
                            default:
                                switch (i) {
                                    case 16908356:
                                        return C0059ao.a(11875);
                                    case 16908357:
                                        return C0059ao.a(11874);
                                    case 16908358:
                                        return C0059ao.a(11873);
                                    case 16908359:
                                        return C0059ao.a(11872);
                                    case 16908360:
                                        return C0059ao.a(11871);
                                    case 16908361:
                                        return C0059ao.a(11870);
                                    case 16908362:
                                        return C0059ao.a(11869);
                                    default:
                                        return C0059ao.a(11868);
                                }
                        }
                }
            }
            return C0059ao.a(11905);
        }
        return C0059ao.a(11906);
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public boolean A() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.isAccessibilityFocused();
        }
        return false;
    }

    public void A0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean B() {
        return this.a.isCheckable();
    }

    public void B0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalAfter(view);
        }
    }

    public boolean C() {
        return this.a.isChecked();
    }

    public void C0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setVisibleToUser(z);
        }
    }

    public boolean D() {
        return this.a.isClickable();
    }

    public AccessibilityNodeInfo D0() {
        return this.a;
    }

    public boolean E() {
        return this.a.isEnabled();
    }

    public boolean F() {
        return this.a.isFocusable();
    }

    public boolean G() {
        return this.a.isFocused();
    }

    public boolean H() {
        return this.a.isLongClickable();
    }

    public boolean I() {
        return this.a.isPassword();
    }

    public boolean J() {
        return this.a.isScrollable();
    }

    public boolean K() {
        return this.a.isSelected();
    }

    public boolean L() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.isShowingHintText();
        }
        return l(4);
    }

    public boolean M() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.isVisibleToUser();
        }
        return false;
    }

    public boolean Q(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.performAction(i, bundle);
        }
        return false;
    }

    public void R() {
        this.a.recycle();
    }

    public boolean S(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
        }
        return false;
    }

    public final void T(View view) {
        SparseArray<WeakReference<ClickableSpan>> v = v(view);
        if (v != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < v.size(); i++) {
                if (v.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                v.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public void U(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setAccessibilityFocused(z);
        }
    }

    public final void V(int i, boolean z) {
        Bundle s = s();
        if (s != null) {
            String a2 = C0059ao.a(11907);
            int i2 = s.getInt(a2, 0) & (~i);
            if (!z) {
                i = 0;
            }
            s.putInt(a2, i | i2);
        }
    }

    @Deprecated
    public void W(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public void X(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public void Y(boolean z) {
        this.a.setCheckable(z);
    }

    public void Z(boolean z) {
        this.a.setChecked(z);
    }

    public void a(int i) {
        this.a.addAction(i);
    }

    public void a0(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
        }
    }

    public void b0(boolean z) {
        this.a.setClickable(z);
    }

    public void c(View view) {
        this.a.addChild(view);
    }

    public void c0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).a);
        }
    }

    public void d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.addChild(view, i);
        }
    }

    public void d0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).a);
        }
    }

    public final void e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        h(C0059ao.a(11908)).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h(C0059ao.a(11909)).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h(C0059ao.a(11910)).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h(C0059ao.a(11911)).add(Integer.valueOf(i));
    }

    public void e0(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof lc)) {
            lc lcVar = (lc) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            if (accessibilityNodeInfo == null) {
                if (lcVar.a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(lcVar.a)) {
                return false;
            }
            return this.c == lcVar.c && this.b == lcVar.b;
        }
        return false;
    }

    public void f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i < 19 || i >= 26) {
            return;
        }
        g();
        T(view);
        ClickableSpan[] q = q(charSequence);
        if (q == null || q.length <= 0) {
            return;
        }
        s().putInt(C0059ao.a(11912), b8.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> t = t(view);
        for (int i2 = 0; q != null && i2 < q.length; i2++) {
            int z = z(q[i2], t);
            t.put(z, new WeakReference<>(q[i2]));
            e(q[i2], (Spanned) charSequence, z);
        }
    }

    public void f0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setDismissable(z);
        }
    }

    public final void g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().remove(C0059ao.a(11913));
            this.a.getExtras().remove(C0059ao.a(11914));
            this.a.getExtras().remove(C0059ao.a(11915));
            this.a.getExtras().remove(C0059ao.a(11916));
        }
    }

    public void g0(boolean z) {
        this.a.setEnabled(z);
    }

    public final List<Integer> h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public void h0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setError(charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.a.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new a(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void i0(boolean z) {
        this.a.setFocusable(z);
    }

    public void j0(boolean z) {
        this.a.setFocused(z);
    }

    public int k() {
        return this.a.getActions();
    }

    public void k0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            V(2, z);
        }
    }

    public final boolean l(int i) {
        Bundle s = s();
        return s != null && (s.getInt(C0059ao.a(11917), 0) & i) == i;
    }

    public void l0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.a.setHintText(charSequence);
        } else if (i >= 19) {
            this.a.getExtras().putCharSequence(C0059ao.a(11918), charSequence);
        }
    }

    @Deprecated
    public void m(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void m0(boolean z) {
        this.a.setLongClickable(z);
    }

    public void n(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void n0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setMaxTextLength(i);
        }
    }

    public int o() {
        return this.a.getChildCount();
    }

    public void o0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public CharSequence p() {
        return this.a.getClassName();
    }

    public void p0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.a.getExtras().putCharSequence(C0059ao.a(11919), charSequence);
        }
    }

    public void q0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public CharSequence r() {
        return this.a.getContentDescription();
    }

    public void r0(View view, int i) {
        this.b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setParent(view, i);
        }
    }

    public Bundle s() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.a.getExtras();
        }
        return new Bundle();
    }

    public void s0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().putCharSequence(C0059ao.a(11920), charSequence);
        }
    }

    public final SparseArray<WeakReference<ClickableSpan>> t(View view) {
        SparseArray<WeakReference<ClickableSpan>> v = v(view);
        if (v == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(b8.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return v;
    }

    public void t0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            V(1, z);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb.append(C0059ao.a(11921) + rect);
        n(rect);
        sb.append(C0059ao.a(11922) + rect);
        sb.append(C0059ao.a(11923));
        sb.append(u());
        sb.append(C0059ao.a(11924));
        sb.append(p());
        sb.append(C0059ao.a(11925));
        sb.append(w());
        sb.append(C0059ao.a(11926));
        sb.append(r());
        sb.append(C0059ao.a(11927));
        sb.append(x());
        sb.append(C0059ao.a(11928));
        sb.append(B());
        sb.append(C0059ao.a(11929));
        sb.append(C());
        sb.append(C0059ao.a(11930));
        sb.append(F());
        sb.append(C0059ao.a(11931));
        sb.append(G());
        sb.append(C0059ao.a(11932));
        sb.append(K());
        sb.append(C0059ao.a(11933));
        sb.append(D());
        sb.append(C0059ao.a(11934));
        sb.append(H());
        sb.append(C0059ao.a(11935));
        sb.append(E());
        sb.append(C0059ao.a(11936));
        sb.append(I());
        sb.append(C0059ao.a(11937) + J());
        sb.append(C0059ao.a(11938));
        int i = Build.VERSION.SDK_INT;
        String a2 = C0059ao.a(11939);
        if (i >= 21) {
            List<a> i2 = i();
            for (int i3 = 0; i3 < i2.size(); i3++) {
                a aVar = i2.get(i3);
                String j = j(aVar.b());
                if (j.equals(C0059ao.a(11940)) && aVar.c() != null) {
                    j = aVar.c().toString();
                }
                sb.append(j);
                if (i3 != i2.size() - 1) {
                    sb.append(a2);
                }
            }
        } else {
            int k = k();
            while (k != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(k);
                k &= ~numberOfTrailingZeros;
                sb.append(j(numberOfTrailingZeros));
                if (k != 0) {
                    sb.append(a2);
                }
            }
        }
        sb.append(C0059ao.a(11941));
        return sb.toString();
    }

    public CharSequence u() {
        return this.a.getPackageName();
    }

    public void u0(boolean z) {
        this.a.setScrollable(z);
    }

    public final SparseArray<WeakReference<ClickableSpan>> v(View view) {
        return (SparseArray) view.getTag(b8.tag_accessibility_clickable_spans);
    }

    public void v0(boolean z) {
        this.a.setSelected(z);
    }

    public CharSequence w() {
        if (y()) {
            List<Integer> h = h(C0059ao.a(11942));
            List<Integer> h2 = h(C0059ao.a(11943));
            List<Integer> h3 = h(C0059ao.a(11944));
            List<Integer> h4 = h(C0059ao.a(11945));
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
            for (int i = 0; i < h.size(); i++) {
                spannableString.setSpan(new jc(h4.get(i).intValue(), this, s().getInt(C0059ao.a(11946))), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
            }
            return spannableString;
        }
        return this.a.getText();
    }

    public void w0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setShowingHintText(z);
        } else {
            V(4, z);
        }
    }

    public String x() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.a.getViewIdResourceName();
        }
        return null;
    }

    public void x0(View view) {
        this.c = -1;
        this.a.setSource(view);
    }

    public final boolean y() {
        return !h(C0059ao.a(11947)).isEmpty();
    }

    public void y0(View view, int i) {
        this.c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setSource(view, i);
        }
    }

    public final int z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    public void z0(CharSequence charSequence) {
        if (z9.c()) {
            this.a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().putCharSequence(C0059ao.a(11948), charSequence);
        }
    }
}
