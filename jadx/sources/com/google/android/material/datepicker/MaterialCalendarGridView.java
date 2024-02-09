package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {
    public final Calendar b;
    public final boolean c;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends eb {
        public a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // defpackage.eb
        public void g(View view, lc lcVar) {
            super.g(view, lcVar);
            lcVar.c0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    public static boolean d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    public final void a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter2().i());
        } else if (i == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public gx getAdapter2() {
        return (gx) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a2;
        int c;
        int a3;
        int c2;
        int width;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        gx adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.c;
        yw ywVar = adapter2.e;
        Long item = adapter2.getItem(adapter2.b());
        Long item2 = adapter2.getItem(adapter2.i());
        for (za<Long, Long> zaVar : dateSelector.k()) {
            Long l = zaVar.a;
            if (l != null) {
                if (zaVar.b != null) {
                    long longValue = l.longValue();
                    long longValue2 = zaVar.b.longValue();
                    if (!d(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean d = ny.d(this);
                        if (longValue < item.longValue()) {
                            a2 = adapter2.b();
                            if (adapter2.f(a2)) {
                                c = 0;
                            } else if (!d) {
                                c = materialCalendarGridView.getChildAt(a2 - 1).getRight();
                            } else {
                                c = materialCalendarGridView.getChildAt(a2 - 1).getLeft();
                            }
                        } else {
                            materialCalendarGridView.b.setTimeInMillis(longValue);
                            a2 = adapter2.a(materialCalendarGridView.b.get(5));
                            c = c(materialCalendarGridView.getChildAt(a2));
                        }
                        if (longValue2 > item2.longValue()) {
                            a3 = Math.min(adapter2.i(), getChildCount() - 1);
                            if (adapter2.g(a3)) {
                                c2 = getWidth();
                            } else if (!d) {
                                c2 = materialCalendarGridView.getChildAt(a3).getRight();
                            } else {
                                c2 = materialCalendarGridView.getChildAt(a3).getLeft();
                            }
                        } else {
                            materialCalendarGridView.b.setTimeInMillis(longValue2);
                            a3 = adapter2.a(materialCalendarGridView.b.get(5));
                            c2 = c(materialCalendarGridView.getChildAt(a3));
                        }
                        int itemId = (int) adapter2.getItemId(a2);
                        int itemId2 = (int) adapter2.getItemId(a3);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + ywVar.a.c();
                            int bottom = childAt.getBottom() - ywVar.a.b();
                            if (!d) {
                                i = numColumns > a2 ? 0 : c;
                                width = a3 > numColumns2 ? getWidth() : c2;
                            } else {
                                int i2 = a3 > numColumns2 ? 0 : c2;
                                width = numColumns > a2 ? getWidth() : c;
                                i = i2;
                            }
                            canvas.drawRect(i, top, width, bottom, ywVar.h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter2 = adapter2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.c) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, RecyclerView.UNDEFINED_DURATION));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = mx.q();
        if (dx.z(getContext())) {
            setNextFocusLeftId(mv.cancel_button);
            setNextFocusRightId(mv.confirm_button);
        }
        this.c = dx.A(getContext());
        ac.q0(this, new a(this));
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof gx) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), gx.class.getCanonicalName()));
    }
}
