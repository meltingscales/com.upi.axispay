package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;

/* compiled from: AxisPay */
/* renamed from: fw  reason: default package */
/* loaded from: classes.dex */
public abstract class fw extends gw<View> {
    public final Rect d;
    public final Rect e;
    public int f;
    public int g;

    public fw() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    public static int N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // defpackage.gw
    public void F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View H = H(coordinatorLayout.r(view));
        if (H != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, H.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            ic lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ac.z(coordinatorLayout) && !ac.z(view)) {
                rect.left += lastWindowInsets.j();
                rect.right -= lastWindowInsets.k();
            }
            Rect rect2 = this.e;
            ib.a(N(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f = rect2.top - H.getBottom();
            return;
        }
        super.F(coordinatorLayout, view, i);
        this.f = 0;
    }

    public abstract View H(List<View> list);

    public final int I(View view) {
        if (this.g == 0) {
            return 0;
        }
        float J = J(view);
        int i = this.g;
        return y9.b((int) (J * i), 0, i);
    }

    public abstract float J(View view);

    public final int K() {
        return this.g;
    }

    public int L(View view) {
        return view.getMeasuredHeight();
    }

    public final int M() {
        return this.f;
    }

    public final void O(int i) {
        this.g = i;
    }

    public boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        ic lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (H = H(coordinatorLayout.r(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (ac.z(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.l() + lastWindowInsets.i();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int L = size + L(H);
            int measuredHeight = H.getMeasuredHeight();
            if (P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                L -= measuredHeight;
            }
            coordinatorLayout.J(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5 == -1 ? CommonUtils.BYTES_IN_A_GIGABYTE : RecyclerView.UNDEFINED_DURATION), i4);
            return true;
        }
        return false;
    }

    public fw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
}
