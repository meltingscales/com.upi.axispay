package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import defpackage.m0;
import defpackage.p0;
import java.io.IOException;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
@SuppressLint({"RestrictedAPI"})
/* renamed from: l0  reason: default package */
/* loaded from: classes.dex */
public class l0 extends p0 implements p9 {
    public c p;
    public g q;
    public int r;
    public int s;
    public boolean t;

    /* compiled from: AxisPay */
    /* renamed from: l0$b */
    /* loaded from: classes.dex */
    public static class b extends g {
        public final Animatable a;

        public b(Animatable animatable) {
            super();
            this.a = animatable;
        }

        @Override // defpackage.l0.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.l0.g
        public void d() {
            this.a.stop();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l0$c */
    /* loaded from: classes.dex */
    public static class c extends p0.a {
        public r4<Long> K;
        public v4<Integer> L;

        public c(c cVar, l0 l0Var, Resources resources) {
            super(cVar, l0Var, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new r4<>();
            this.L = new v4<>();
        }

        public static long D(int i, int i2) {
            return i2 | (i << 32);
        }

        public int B(int[] iArr, Drawable drawable, int i) {
            int z = super.z(iArr, drawable);
            this.L.i(z, Integer.valueOf(i));
            return z;
        }

        public int C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.a(drawable);
            long D = D(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = a;
            this.K.a(D, Long.valueOf(j2 | j));
            if (z) {
                this.K.a(D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        public int E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.f(i, 0).intValue();
        }

        public int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        public int G(int i, int i2) {
            return (int) this.K.f(D(i, i2), -1L).longValue();
        }

        public boolean H(int i, int i2) {
            return (this.K.f(D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        public boolean I(int i, int i2) {
            return (this.K.f(D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // defpackage.p0.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new l0(this, null);
        }

        @Override // defpackage.p0.a, defpackage.m0.d
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // defpackage.p0.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new l0(this, resources);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l0$d */
    /* loaded from: classes.dex */
    public static class d extends g {
        public final Cdo a;

        public d(Cdo cdo) {
            super();
            this.a = cdo;
        }

        @Override // defpackage.l0.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.l0.g
        public void d() {
            this.a.stop();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l0$e */
    /* loaded from: classes.dex */
    public static class e extends g {
        public final ObjectAnimator a;
        public final boolean b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, C0059ao.a(6011), i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        @Override // defpackage.l0.g
        public boolean a() {
            return this.b;
        }

        @Override // defpackage.l0.g
        public void b() {
            this.a.reverse();
        }

        @Override // defpackage.l0.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.l0.g
        public void d() {
            this.a.cancel();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l0$f */
    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {
        public int[] a;
        public int b;
        public int c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        public int a() {
            return this.c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.c) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.c : 0.0f);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l0$g */
    /* loaded from: classes.dex */
    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public l0() {
        this(null, null);
    }

    public static l0 m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals(C0059ao.a(9967))) {
            l0 l0Var = new l0();
            l0Var.n(context, resources, xmlPullParser, attributeSet, theme);
            return l0Var;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C0059ao.a(9968) + name);
    }

    @Override // defpackage.p0, defpackage.m0
    public void h(m0.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.p = (c) dVar;
        }
    }

    @Override // defpackage.p0, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.m0, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.q;
        if (gVar != null) {
            gVar.d();
            this.q = null;
            g(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override // defpackage.p0
    /* renamed from: l */
    public c j() {
        return new c(this.p, this, null);
    }

    @Override // defpackage.p0, defpackage.m0, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.r();
                this.t = true;
            }
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray k = c9.k(resources, theme, attributeSet, r0.AnimatedStateListDrawableCompat);
        setVisible(k.getBoolean(r0.AnimatedStateListDrawableCompat_android_visible, true), true);
        t(k);
        i(resources);
        k.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    public final void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals(C0059ao.a(9969))) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(C0059ao.a(9970))) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    @Override // defpackage.p0, defpackage.m0, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int F = this.p.F(iArr);
        boolean z = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public final void p() {
        onStateChange(getState());
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = c9.k(resources, theme, attributeSet, r0.AnimatedStateListDrawableItem);
        int resourceId = k.getResourceId(r0.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = k.getResourceId(r0.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable j = resourceId2 > 0 ? e3.h().j(context, resourceId2) : null;
        k.recycle();
        int[] k2 = k(attributeSet);
        String a2 = C0059ao.a(9971);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals(C0059ao.a(9972))) {
                    j = jo.c(resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                } else {
                    j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + a2);
            }
        }
        if (j != null) {
            return this.p.B(k2, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + a2);
    }

    public final int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = c9.k(resources, theme, attributeSet, r0.AnimatedStateListDrawableTransition);
        int resourceId = k.getResourceId(r0.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = k.getResourceId(r0.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = k.getResourceId(r0.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable j = resourceId3 > 0 ? e3.h().j(context, resourceId3) : null;
        boolean z = k.getBoolean(r0.AnimatedStateListDrawableTransition_android_reversible, false);
        k.recycle();
        String a2 = C0059ao.a(9973);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals(C0059ao.a(9974))) {
                    j = Cdo.a(context, resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                } else {
                    j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + a2);
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + a2);
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.p.C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C0059ao.a(9975));
        }
    }

    public final boolean s(int i) {
        int c2;
        int G;
        g bVar;
        g gVar = this.q;
        if (gVar != null) {
            if (i == this.r) {
                return true;
            }
            if (i == this.s && gVar.a()) {
                gVar.b();
                this.r = this.s;
                this.s = i;
                return true;
            }
            c2 = this.r;
            gVar.d();
        } else {
            c2 = c();
        }
        this.q = null;
        this.s = -1;
        this.r = -1;
        c cVar = this.p;
        int E = cVar.E(c2);
        int E2 = cVar.E(i);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof Cdo) {
            bVar = new d((Cdo) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.c();
        this.q = bVar;
        this.s = c2;
        this.r = i;
        return true;
    }

    @Override // defpackage.m0, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.q;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public final void t(TypedArray typedArray) {
        c cVar = this.p;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.d |= typedArray.getChangingConfigurations();
        }
        cVar.x(typedArray.getBoolean(r0.AnimatedStateListDrawableCompat_android_variablePadding, cVar.i));
        cVar.t(typedArray.getBoolean(r0.AnimatedStateListDrawableCompat_android_constantSize, cVar.l));
        cVar.u(typedArray.getInt(r0.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.v(typedArray.getInt(r0.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(r0.AnimatedStateListDrawableCompat_android_dither, cVar.x));
    }

    public l0(c cVar, Resources resources) {
        super(null);
        this.r = -1;
        this.s = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
