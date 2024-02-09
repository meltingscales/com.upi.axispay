package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: AxisPay */
/* renamed from: uz  reason: default package */
/* loaded from: classes.dex */
public class uz {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.y() && (view instanceof TabLayout.i)) {
            return b((TabLayout.i) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static RectF b(TabLayout.i iVar, int i) {
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int b = (int) ny.b(iVar.getContext(), i);
        if (contentWidth < b) {
            contentWidth = b;
        }
        int left = (iVar.getLeft() + iVar.getRight()) / 2;
        int top = (iVar.getTop() + iVar.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    public void c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = a(tabLayout, view);
        RectF a2 = a(tabLayout, view2);
        drawable.setBounds(tv.c((int) a.left, (int) a2.left, f), drawable.getBounds().top, tv.c((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }

    public void d(TabLayout tabLayout, View view, Drawable drawable) {
        RectF a = a(tabLayout, view);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }
}
