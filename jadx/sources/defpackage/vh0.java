package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AxisPay */
/* renamed from: vh0  reason: default package */
/* loaded from: classes.dex */
public final class vh0 extends LayoutInflater {
    public final boolean a;
    public final kh0 b;
    public final kh0 c;
    public boolean d;
    public boolean e;
    public static final b h = new b(null);
    public static final Set<String> f = sj0.d(C0059ao.a(12412), C0059ao.a(12413));
    public static final ci0 g = di0.b(a.b);

    /* compiled from: AxisPay */
    /* renamed from: vh0$a */
    /* loaded from: classes.dex */
    public static final class a extends zl0 implements sk0<Field> {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // defpackage.sk0
        /* renamed from: b */
        public final Field invoke() {
            Field declaredField = LayoutInflater.class.getDeclaredField(C0059ao.a(8658));
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return declaredField;
            }
            throw new IllegalArgumentException(C0059ao.a(8659).toString());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vh0$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static final /* synthetic */ an0[] a;

        static {
            fm0 fm0Var = new fm0(km0.a(b.class), C0059ao.a(8570), C0059ao.a(8571));
            km0.d(fm0Var);
            a = new an0[]{fm0Var};
        }

        public b() {
        }

        public final Field b() {
            ci0 ci0Var = vh0.g;
            b bVar = vh0.h;
            an0 an0Var = a[0];
            return (Field) ci0Var.getValue();
        }

        public /* synthetic */ b(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vh0$c */
    /* loaded from: classes.dex */
    public static final class c implements kh0 {
        public final vh0 a;

        public c(vh0 vh0Var) {
            yl0.f(vh0Var, C0059ao.a(8580));
            this.a = vh0Var;
        }

        @Override // defpackage.kh0
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            yl0.f(str, C0059ao.a(8581));
            yl0.f(context, C0059ao.a(8582));
            View view2 = null;
            for (String str2 : vh0.f) {
                try {
                    view2 = this.a.createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (view2 != null) {
                    break;
                }
            }
            return view2 == null ? this.a.j(str, attributeSet) : view2;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vh0$d */
    /* loaded from: classes.dex */
    public static final class d implements kh0 {
        public final vh0 a;

        public d(vh0 vh0Var) {
            yl0.f(vh0Var, C0059ao.a(8585));
            this.a = vh0Var;
        }

        @Override // defpackage.kh0
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            yl0.f(str, C0059ao.a(8586));
            yl0.f(context, C0059ao.a(8587));
            return this.a.i(view, str, attributeSet);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vh0$e */
    /* loaded from: classes.dex */
    public static final class e extends g {
        public final f c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LayoutInflater.Factory2 factory2, vh0 vh0Var) {
            super(factory2);
            yl0.f(factory2, C0059ao.a(8589));
            yl0.f(vh0Var, C0059ao.a(8590));
            this.c = new f(factory2, vh0Var);
        }

        @Override // defpackage.vh0.g, android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            yl0.f(str, C0059ao.a(8591));
            yl0.f(context, C0059ao.a(8592));
            return ph0.h.b().d(new lh0(str, context, attributeSet, view, this.c)).e();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vh0$f */
    /* loaded from: classes.dex */
    public static final class f extends h implements kh0 {
        public final vh0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LayoutInflater.Factory2 factory2, vh0 vh0Var) {
            super(factory2);
            yl0.f(factory2, C0059ao.a(8378));
            yl0.f(vh0Var, C0059ao.a(8379));
            this.b = vh0Var;
        }

        @Override // defpackage.vh0.h, defpackage.kh0
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            yl0.f(str, C0059ao.a(8380));
            yl0.f(context, C0059ao.a(8381));
            return this.b.f(a().onCreateView(view, str, context, attributeSet), str, context, attributeSet);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vh0$g */
    /* loaded from: classes.dex */
    public static class g implements LayoutInflater.Factory2 {
        public final h b;

        public g(LayoutInflater.Factory2 factory2) {
            yl0.f(factory2, C0059ao.a(8433));
            this.b = new h(factory2);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            yl0.f(str, C0059ao.a(8436));
            yl0.f(context, C0059ao.a(8437));
            return onCreateView(null, str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            yl0.f(str, C0059ao.a(8434));
            yl0.f(context, C0059ao.a(8435));
            return ph0.h.b().d(new lh0(str, context, attributeSet, view, this.b)).e();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vh0$h */
    /* loaded from: classes.dex */
    public static class h implements kh0 {
        public final LayoutInflater.Factory2 a;

        public h(LayoutInflater.Factory2 factory2) {
            yl0.f(factory2, C0059ao.a(8446));
            this.a = factory2;
        }

        public final LayoutInflater.Factory2 a() {
            return this.a;
        }

        @Override // defpackage.kh0
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            yl0.f(str, C0059ao.a(8447));
            yl0.f(context, C0059ao.a(8448));
            return this.a.onCreateView(view, str, context, attributeSet);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vh0$i */
    /* loaded from: classes.dex */
    public static final class i implements LayoutInflater.Factory {
        public final kh0 b;

        public i(LayoutInflater.Factory factory) {
            yl0.f(factory, C0059ao.a(8487));
            this.b = new j(factory);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            yl0.f(str, C0059ao.a(8488));
            yl0.f(context, C0059ao.a(8489));
            return ph0.h.b().d(new lh0(str, context, attributeSet, null, this.b, 8, null)).e();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vh0$j */
    /* loaded from: classes.dex */
    public static final class j implements kh0 {
        public final LayoutInflater.Factory a;

        public j(LayoutInflater.Factory factory) {
            yl0.f(factory, C0059ao.a(8138));
            this.a = factory;
        }

        @Override // defpackage.kh0
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            yl0.f(str, C0059ao.a(8139));
            yl0.f(context, C0059ao.a(8140));
            return this.a.onCreateView(str, context, attributeSet);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh0(LayoutInflater layoutInflater, Context context, boolean z) {
        super(layoutInflater, context);
        yl0.f(layoutInflater, C0059ao.a(12414));
        yl0.f(context, C0059ao.a(12415));
        this.a = Build.VERSION.SDK_INT > 28 || z9.b();
        this.b = new c(this);
        this.c = new d(this);
        this.e = ph0.h.b().h();
        h(z);
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context context) {
        yl0.f(context, C0059ao.a(12416));
        return new vh0(this, context, true);
    }

    public final View f(View view, String str, Context context, AttributeSet attributeSet) {
        Field b2;
        if (ph0.h.b().f() && view == null && co0.L(str, '.', 0, false, 6, null) > -1) {
            if (this.a) {
                return cloneInContext(context).createView(str, null, attributeSet);
            }
            b bVar = h;
            Object obj = bVar.b().get(this);
            if (obj != null) {
                Object[] objArr = (Object[]) obj;
                Object obj2 = objArr[0];
                objArr[0] = context;
                th0.c(bVar.b(), this, objArr);
                try {
                    view = createView(str, null, attributeSet);
                    objArr[0] = obj2;
                    b2 = bVar.b();
                } catch (ClassNotFoundException unused) {
                    objArr[0] = obj2;
                    b2 = h.b();
                } catch (Throwable th) {
                    objArr[0] = obj2;
                    th0.c(h.b(), this, objArr);
                    throw th;
                }
                th0.c(b2, this, objArr);
                return view;
            }
            throw new mi0(C0059ao.a(12417));
        }
        return view;
    }

    public final void g() {
        if (!this.d && ph0.h.b().g()) {
            if (!(getContext() instanceof LayoutInflater.Factory2)) {
                this.d = true;
                return;
            }
            Method a2 = th0.a(LayoutInflater.class, C0059ao.a(12418));
            Object[] objArr = new Object[1];
            Context context = getContext();
            if (context != null) {
                objArr[0] = new e((LayoutInflater.Factory2) context, this);
                th0.b(a2, this, objArr);
                this.d = true;
                return;
            }
            throw new mi0(C0059ao.a(12419));
        }
    }

    public final void h(boolean z) {
        if (z) {
            return;
        }
        if (getFactory2() != null && !(getFactory2() instanceof g)) {
            setFactory2(getFactory2());
        }
        if (getFactory() == null || (getFactory() instanceof i)) {
            return;
        }
        setFactory(getFactory());
    }

    public final View i(View view, String str, AttributeSet attributeSet) {
        try {
            return super.onCreateView(view, str, attributeSet);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // android.view.LayoutInflater
    public View inflate(int i2, ViewGroup viewGroup, boolean z) {
        View inflate = super.inflate(i2, viewGroup, z);
        if (inflate != null && this.e) {
            inflate.setTag(oh0.viewpump_layout_res, Integer.valueOf(i2));
        }
        return inflate;
    }

    public final View j(String str, AttributeSet attributeSet) {
        try {
            return super.onCreateView(str, attributeSet);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // android.view.LayoutInflater
    public View onCreateView(View view, String str, AttributeSet attributeSet) throws ClassNotFoundException {
        yl0.f(str, C0059ao.a(12422));
        ph0 b2 = ph0.h.b();
        Context context = getContext();
        yl0.b(context, C0059ao.a(12423));
        return b2.d(new lh0(str, context, attributeSet, view, this.c)).e();
    }

    @Override // android.view.LayoutInflater
    public void setFactory(LayoutInflater.Factory factory) {
        yl0.f(factory, C0059ao.a(12426));
        if (!(factory instanceof i)) {
            super.setFactory(new i(factory));
        } else {
            super.setFactory(factory);
        }
    }

    @Override // android.view.LayoutInflater
    public void setFactory2(LayoutInflater.Factory2 factory2) {
        yl0.f(factory2, C0059ao.a(12427));
        if (!(factory2 instanceof g)) {
            super.setFactory2(new g(factory2));
        } else {
            super.setFactory2(factory2);
        }
    }

    @Override // android.view.LayoutInflater
    public View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        yl0.f(xmlPullParser, C0059ao.a(12420));
        g();
        View inflate = super.inflate(xmlPullParser, viewGroup, z);
        yl0.b(inflate, C0059ao.a(12421));
        return inflate;
    }

    @Override // android.view.LayoutInflater
    public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        yl0.f(str, C0059ao.a(12424));
        ph0 b2 = ph0.h.b();
        Context context = getContext();
        yl0.b(context, C0059ao.a(12425));
        return b2.d(new lh0(str, context, attributeSet, null, this.b, 8, null)).e();
    }
}
