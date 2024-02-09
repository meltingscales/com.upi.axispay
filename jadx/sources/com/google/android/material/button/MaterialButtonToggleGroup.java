package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import defpackage.lc;
import defpackage.lz;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final String l = MaterialButtonToggleGroup.class.getSimpleName();
    public static final int m = rv.Widget_MaterialComponents_MaterialButtonToggleGroup;
    public final List<d> b;
    public final c c;
    public final f d;
    public final LinkedHashSet<e> e;
    public final Comparator<MaterialButton> f;
    public Integer[] g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends eb {
        public b() {
        }

        @Override // defpackage.eb
        public void g(View view, lc lcVar) {
            super.g(view, lcVar);
            lcVar.d0(lc.c.a(0, 1, MaterialButtonToggleGroup.this.n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements MaterialButton.a {
        public c() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z) {
            if (MaterialButtonToggleGroup.this.h) {
                return;
            }
            if (MaterialButtonToggleGroup.this.i) {
                MaterialButtonToggleGroup.this.k = z ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.u(materialButton.getId(), z)) {
                MaterialButtonToggleGroup.this.l(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class d {
        public static final dz e = new bz(0.0f);
        public dz a;
        public dz b;
        public dz c;
        public dz d;

        public d(dz dzVar, dz dzVar2, dz dzVar3, dz dzVar4) {
            this.a = dzVar;
            this.b = dzVar3;
            this.c = dzVar4;
            this.d = dzVar2;
        }

        public static d a(d dVar) {
            dz dzVar = e;
            return new d(dzVar, dVar.d, dzVar, dVar.c);
        }

        public static d b(d dVar, View view) {
            return ny.d(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            dz dzVar = dVar.a;
            dz dzVar2 = dVar.d;
            dz dzVar3 = e;
            return new d(dzVar, dzVar2, dzVar3, dzVar3);
        }

        public static d d(d dVar) {
            dz dzVar = e;
            return new d(dzVar, dzVar, dVar.b, dVar.c);
        }

        public static d e(d dVar, View view) {
            return ny.d(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            dz dzVar = dVar.a;
            dz dzVar2 = e;
            return new d(dzVar, dzVar2, dVar.b, dzVar2);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f implements MaterialButton.b {
        public f() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.materialButtonToggleGroupStyle);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (p(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && p(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.k = i;
        l(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ac.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.a(this.c);
        materialButton.setOnPressedChangeListenerInternal(this.d);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public static void t(lz.b bVar, d dVar) {
        if (dVar == null) {
            bVar.o(0.0f);
            return;
        }
        bVar.B(dVar.a);
        bVar.t(dVar.d);
        bVar.F(dVar.b);
        bVar.x(dVar.c);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(l, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            u(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        lz shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.b.add(new d(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        ac.q0(materialButton, new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        v();
        super.dispatchDraw(canvas);
    }

    public void g(e eVar) {
        this.e.add(eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.i) {
            return this.k;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m2 = m(i);
            if (m2.isChecked()) {
                arrayList.add(Integer.valueOf(m2.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.g;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(l, "Child order wasn't updated");
        return i2;
    }

    public final void h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton m2 = m(i);
            int min = Math.min(m2.getStrokeWidth(), m(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams i2 = i(m2);
            if (getOrientation() == 0) {
                lb.d(i2, 0);
                lb.e(i2, -min);
                i2.topMargin = 0;
            } else {
                i2.bottomMargin = 0;
                i2.topMargin = -min;
                lb.e(i2, 0);
            }
            m2.setLayoutParams(i2);
        }
        r(firstVisibleChildIndex);
    }

    public final LinearLayout.LayoutParams i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public final void j(int i, boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(i);
        if (materialButton != null) {
            materialButton.setChecked(z);
        }
    }

    public void k() {
        this.h = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m2 = m(i);
            m2.setChecked(false);
            l(m2.getId(), false);
        }
        this.h = false;
        setCheckedId(-1);
    }

    public final void l(int i, boolean z) {
        Iterator<e> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(this, i, z);
        }
    }

    public final MaterialButton m(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final int n(View view) {
        if (view instanceof MaterialButton) {
            int i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) == view) {
                    return i;
                }
                if ((getChildAt(i2) instanceof MaterialButton) && p(i2)) {
                    i++;
                }
            }
            return -1;
        }
        return -1;
    }

    public final d o(int i, int i2, int i3) {
        d dVar = this.b.get(i);
        if (i2 == i3) {
            return dVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? d.e(dVar, this) : d.f(dVar);
        } else if (i == i3) {
            return z ? d.b(dVar, this) : d.a(dVar);
        } else {
            return null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.k;
        if (i != -1) {
            j(i, true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        lc.E0(accessibilityNodeInfo).c0(lc.b.b(1, getVisibleButtonCount(), false, q() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        w();
        h();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.h(this.c);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.b.remove(indexOfChild);
        }
        w();
        h();
    }

    public final boolean p(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public boolean q() {
        return this.i;
    }

    public final void r(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            return;
        }
        lb.d(layoutParams, 0);
        lb.e(layoutParams, 0);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    public final void s(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.h = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.h = false;
        }
    }

    public void setSelectionRequired(boolean z) {
        this.j = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.i != z) {
            this.i = z;
            k();
        }
    }

    public final boolean u(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.j && checkedButtonIds.isEmpty()) {
            s(i, true);
            this.k = i;
            return false;
        }
        if (z && this.i) {
            checkedButtonIds.remove(Integer.valueOf(i));
            for (Integer num : checkedButtonIds) {
                int intValue = num.intValue();
                s(intValue, false);
                l(intValue, false);
            }
        }
        return true;
    }

    public final void v() {
        TreeMap treeMap = new TreeMap(this.f);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m(i), Integer.valueOf(i));
        }
        this.g = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m2 = m(i);
            if (m2.getVisibility() != 8) {
                lz.b v = m2.getShapeAppearanceModel().v();
                t(v, o(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m2.setShapeAppearanceModel(v.m());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.m
            android.content.Context r7 = defpackage.f00.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.b = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.d = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.e = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f = r7
            r7 = 0
            r6.h = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = defpackage.sv.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = defpackage.ly.h(r0, r1, r2, r3, r4, r5)
            int r9 = defpackage.sv.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = defpackage.sv.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.k = r9
            int r9 = defpackage.sv.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.j = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            defpackage.ac.B0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
