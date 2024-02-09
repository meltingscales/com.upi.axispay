package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: c3  reason: default package */
/* loaded from: classes.dex */
public class c3 extends a3 implements b3 {
    public static Method K;
    public b3 J;

    /* compiled from: AxisPay */
    /* renamed from: c3$a */
    /* loaded from: classes.dex */
    public static class a extends w2 {
        public final int p;
        public final int q;
        public b3 r;
        public MenuItem s;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.p = 21;
                this.q = 22;
                return;
            }
            this.p = 22;
            this.q = 21;
        }

        @Override // defpackage.w2, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            h1 h1Var;
            int pointToPosition;
            int i2;
            if (this.r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    h1Var = (h1) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    h1Var = (h1) adapter;
                }
                k1 k1Var = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < h1Var.getCount()) {
                    k1Var = h1Var.getItem(i2);
                }
                MenuItem menuItem = this.s;
                if (menuItem != k1Var) {
                    i1 b = h1Var.b();
                    if (menuItem != null) {
                        this.r.f(b, menuItem);
                    }
                    this.s = k1Var;
                    if (k1Var != null) {
                        this.r.e(b, k1Var);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            h1 h1Var;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.q) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    h1Var = (h1) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    h1Var = (h1) adapter;
                }
                h1Var.b().e(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        public void setHoverListener(b3 b3Var) {
            this.r = b3Var;
        }

        @Override // defpackage.w2, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                K = PopupWindow.class.getDeclaredMethod(C0059ao.a(1213), Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(C0059ao.a(1214), C0059ao.a(1215));
        }
    }

    public c3(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setEnterTransition((Transition) obj);
        }
    }

    public void S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setExitTransition((Transition) obj);
        }
    }

    public void T(b3 b3Var) {
        this.J = b3Var;
    }

    public void U(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = K;
            if (method != null) {
                try {
                    method.invoke(this.F, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i(C0059ao.a(1216), C0059ao.a(1217));
                    return;
                }
            }
            return;
        }
        this.F.setTouchModal(z);
    }

    @Override // defpackage.b3
    public void e(i1 i1Var, MenuItem menuItem) {
        b3 b3Var = this.J;
        if (b3Var != null) {
            b3Var.e(i1Var, menuItem);
        }
    }

    @Override // defpackage.b3
    public void f(i1 i1Var, MenuItem menuItem) {
        b3 b3Var = this.J;
        if (b3Var != null) {
            b3Var.f(i1Var, menuItem);
        }
    }

    @Override // defpackage.a3
    public w2 s(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
