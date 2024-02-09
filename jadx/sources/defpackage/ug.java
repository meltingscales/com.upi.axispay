package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import defpackage.yh;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ug  reason: default package */
/* loaded from: classes.dex */
public class ug extends View {
    public static a r;
    public static final SparseArray<Drawable.ConstantState> s = new SparseArray<>(2);
    public static final int[] t = {16842912};
    public static final int[] u = {16842911};
    public final yh b;
    public final b c;
    public xh d;
    public zg e;
    public boolean f;
    public int g;
    public c h;
    public Drawable i;
    public int j;
    public int k;
    public int l;
    public ColorStateList m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;

    /* compiled from: AxisPay */
    /* renamed from: ug$a */
    /* loaded from: classes.dex */
    public static final class a extends BroadcastReceiver {
        public final Context a;
        public boolean b = true;
        public List<ug> c = new ArrayList();

        public a(Context context) {
            this.a = context;
        }

        public boolean a() {
            return this.b;
        }

        public void b(ug ugVar) {
            if (this.c.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(C0059ao.a(14828));
                this.a.registerReceiver(this, intentFilter);
            }
            this.c.add(ugVar);
        }

        public void c(ug ugVar) {
            this.c.remove(ugVar);
            if (this.c.size() == 0) {
                this.a.unregisterReceiver(this);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            if (!C0059ao.a(14829).equals(intent.getAction()) || this.b == (!intent.getBooleanExtra(C0059ao.a(14830), false))) {
                return;
            }
            this.b = z;
            for (ug ugVar : this.c) {
                ugVar.c();
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ug$b */
    /* loaded from: classes.dex */
    public final class b extends yh.b {
        public b() {
        }

        @Override // defpackage.yh.b
        public void a(yh yhVar, yh.h hVar) {
            ug.this.b();
        }

        @Override // defpackage.yh.b
        public void b(yh yhVar, yh.h hVar) {
            ug.this.b();
        }

        @Override // defpackage.yh.b
        public void c(yh yhVar, yh.h hVar) {
            ug.this.b();
        }

        @Override // defpackage.yh.b
        public void d(yh yhVar, yh.i iVar) {
            ug.this.b();
        }

        @Override // defpackage.yh.b
        public void e(yh yhVar, yh.i iVar) {
            ug.this.b();
        }

        @Override // defpackage.yh.b
        public void g(yh yhVar, yh.i iVar) {
            ug.this.b();
        }

        @Override // defpackage.yh.b
        public void h(yh yhVar, yh.i iVar) {
            ug.this.b();
        }

        @Override // defpackage.yh.b
        public void k(yh yhVar, yh.i iVar) {
            ug.this.b();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ug$c */
    /* loaded from: classes.dex */
    public final class c extends AsyncTask<Void, Void, Drawable> {
        public final int a;
        public final Context b;

        public c(int i, Context context) {
            this.a = i;
            this.b = context;
        }

        public final void a(Drawable drawable) {
            if (drawable != null) {
                ug.s.put(this.a, drawable.getConstantState());
            }
            ug.this.h = null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public Drawable doInBackground(Void... voidArr) {
            if (ug.s.get(this.a) == null) {
                return this.b.getResources().getDrawable(this.a);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onCancelled(Drawable drawable) {
            a(drawable);
        }

        @Override // android.os.AsyncTask
        /* renamed from: d */
        public void onPostExecute(Drawable drawable) {
            if (drawable != null) {
                a(drawable);
            } else {
                Drawable.ConstantState constantState = ug.s.get(this.a);
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                ug.this.h = null;
            }
            ug.this.setRemoteIndicatorDrawableInternal(drawable);
        }
    }

    public ug(Context context) {
        this(context, null);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private FragmentManager getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof sd) {
            return ((sd) activity).D();
        }
        return null;
    }

    public final void a() {
        if (this.j > 0) {
            c cVar = this.h;
            if (cVar != null) {
                cVar.cancel(false);
            }
            c cVar2 = new c(this.j, getContext());
            this.h = cVar2;
            this.j = 0;
            cVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public void b() {
        yh.i k = this.b.k();
        boolean z = true;
        boolean z2 = !k.v();
        int c2 = z2 ? k.c() : 0;
        if (this.l != c2) {
            this.l = c2;
            f();
            refreshDrawableState();
        }
        if (c2 == 1) {
            a();
        }
        if (this.f) {
            if (!this.p && !z2 && !this.b.m(this.d, 1)) {
                z = false;
            }
            setEnabled(z);
        }
    }

    public void c() {
        super.setVisibility((this.g != 0 || this.p || r.a()) ? this.g : 4);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public boolean d() {
        if (this.f) {
            ei i = this.b.i();
            if (i == null) {
                return e(1);
            }
            i.b();
            throw null;
        }
        return false;
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.i != null) {
            this.i.setState(getDrawableState());
            if (this.i.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.i.getCurrent();
                int i = this.l;
                if (i != 1 && this.k == i) {
                    if (i == 2 && !animationDrawable.isRunning()) {
                        animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                    }
                } else if (!animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            }
            invalidate();
        }
        this.k = this.l;
    }

    public final boolean e(int i) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            boolean v = this.b.k().v();
            String a2 = C0059ao.a(3876);
            if (v) {
                String a3 = C0059ao.a(3877);
                if (fragmentManager.j0(a3) != null) {
                    Log.w(a2, C0059ao.a(3878));
                    return false;
                }
                wg b2 = this.e.b();
                b2.n(this.d);
                if (i == 2) {
                    b2.o(true);
                }
                je n = fragmentManager.n();
                n.f(b2, a3);
                n.k();
            } else {
                String a4 = C0059ao.a(3879);
                if (fragmentManager.j0(a4) != null) {
                    Log.w(a2, C0059ao.a(3880));
                    return false;
                }
                yg c2 = this.e.c();
                c2.m(this.d);
                if (i == 2) {
                    c2.n(true);
                }
                je n2 = fragmentManager.n();
                n2.f(c2, a4);
                n2.k();
            }
            return true;
        }
        throw new IllegalStateException(C0059ao.a(3881));
    }

    public final void f() {
        int i;
        int i2 = this.l;
        if (i2 == 1) {
            i = rg.mr_cast_button_connecting;
        } else if (i2 != 2) {
            i = rg.mr_cast_button_disconnected;
        } else {
            i = rg.mr_cast_button_connected;
        }
        String string = getContext().getString(i);
        setContentDescription(string);
        q3.a(this, (!this.q || TextUtils.isEmpty(string)) ? null : null);
    }

    public zg getDialogFactory() {
        return this.e;
    }

    public xh getRouteSelector() {
        return this.d;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.f = true;
        if (!this.d.f()) {
            this.b.a(this.d, this.c);
        }
        b();
        r.b(this);
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        yh yhVar = this.b;
        if (yhVar == null) {
            return onCreateDrawableState;
        }
        ei i2 = yhVar.i();
        if (i2 == null) {
            int i3 = this.l;
            if (i3 == 1) {
                View.mergeDrawableStates(onCreateDrawableState, u);
            } else if (i3 == 2) {
                View.mergeDrawableStates(onCreateDrawableState, t);
            }
            return onCreateDrawableState;
        }
        i2.a();
        throw null;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f = false;
            if (!this.d.f()) {
                this.b.o(this.c);
            }
            r.c(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.i != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.i.getIntrinsicWidth();
            int intrinsicHeight = this.i.getIntrinsicHeight();
            int i = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i2 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.i.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.i.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.n;
        Drawable drawable = this.i;
        int max = Math.max(i3, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i4 = this.o;
        Drawable drawable2 = this.i;
        int max2 = Math.max(i4, drawable2 != null ? drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom() : 0);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        return d() || performClick;
    }

    public void setAlwaysVisible(boolean z) {
        if (z != this.p) {
            this.p = z;
            c();
            b();
        }
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.q) {
            this.q = z;
            f();
        }
    }

    public void setDialogFactory(zg zgVar) {
        if (zgVar != null) {
            this.e = zgVar;
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(3882));
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.j = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        c cVar = this.h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.i);
        }
        if (drawable != null) {
            if (this.m != null) {
                drawable = o9.r(drawable.mutate());
                o9.o(drawable, this.m);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.i = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(xh xhVar) {
        if (xhVar != null) {
            if (this.d.equals(xhVar)) {
                return;
            }
            if (this.f) {
                if (!this.d.f()) {
                    this.b.o(this.c);
                }
                if (!xhVar.f()) {
                    this.b.a(xhVar, this.c);
                }
            }
            this.d = xhVar;
            b();
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(3883));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.g = i;
        c();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i;
    }

    public ug(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ig.mediaRouteButtonStyle);
    }

    public ug(Context context, AttributeSet attributeSet, int i) {
        super(dh.a(context), attributeSet, i);
        Drawable.ConstantState constantState;
        this.d = xh.c;
        this.e = zg.a();
        this.g = 0;
        Context context2 = getContext();
        int[] iArr = tg.MediaRouteButton;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ac.o0(this, context2, iArr, attributeSet, obtainStyledAttributes, i, 0);
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.i = getResources().getDrawable(obtainStyledAttributes.getResourceId(tg.MediaRouteButton_externalRouteEnabledDrawableStatic, 0));
            return;
        }
        yh g = yh.g(context2);
        this.b = g;
        this.c = new b();
        yh.i k = g.k();
        int c2 = k.v() ^ true ? k.c() : 0;
        this.l = c2;
        this.k = c2;
        if (r == null) {
            r = new a(context2.getApplicationContext());
        }
        this.m = obtainStyledAttributes.getColorStateList(tg.MediaRouteButton_mediaRouteButtonTint);
        this.n = obtainStyledAttributes.getDimensionPixelSize(tg.MediaRouteButton_android_minWidth, 0);
        this.o = obtainStyledAttributes.getDimensionPixelSize(tg.MediaRouteButton_android_minHeight, 0);
        int resourceId = obtainStyledAttributes.getResourceId(tg.MediaRouteButton_externalRouteEnabledDrawableStatic, 0);
        this.j = obtainStyledAttributes.getResourceId(tg.MediaRouteButton_externalRouteEnabledDrawable, 0);
        obtainStyledAttributes.recycle();
        int i2 = this.j;
        if (i2 != 0 && (constantState = s.get(i2)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.i == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = s.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    c cVar = new c(resourceId, getContext());
                    this.h = cVar;
                    cVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        f();
        setClickable(true);
    }
}
