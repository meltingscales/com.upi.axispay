package org.npci.upi.security.pinactivitycomponent.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.ArrayList;
import myunmn.C0059ao;
import org.npci.upi.security.pinactivitycomponent.R;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemView;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class FormItemPager extends FrameLayout implements a {
    public ArrayList<FormItemView> b;
    public int c;
    public int d;
    public Object e;

    public FormItemPager(Context context) {
        super(context);
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public void a(String str, Drawable drawable, View.OnClickListener onClickListener, int i, boolean z, boolean z2) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.get(i2).a(str, drawable, onClickListener, i, z, z2);
        }
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public boolean b() {
        String inputValue = this.b.get(this.c).getInputValue();
        if (this.b.get(this.c).getInputLength() != inputValue.length()) {
            this.b.get(this.c).requestFocus();
            return false;
        } else if (this.c != this.b.size() - 1) {
            if (this.b.get(this.c).getToggleCheckbox()) {
                return true;
            }
            this.b.get(this.c).setTextEntered(true);
            return !h();
        } else {
            this.b.get(this.c).requestFocus();
            for (int i = 0; i < this.b.size(); i++) {
                if (!this.b.get(i).getInputValue().equals(inputValue)) {
                    j();
                    this.b.get(i).getFormItemListener().f(this, getContext().getString(R.string.info_pin_not_match));
                    return false;
                }
            }
            return true;
        }
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public int c() {
        return getInputValue().length();
    }

    public final void c(View view) {
        if (Build.VERSION.SDK_INT >= 12) {
            view.animate().x(0.0f);
        } else {
            ac.K0(view, 0.0f);
        }
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public boolean d() {
        return this.b.get(this.c).d();
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public boolean e() {
        return this.b.get(this.c).getInputLength() == this.b.get(this.c).getInputValue().length();
    }

    public final void f(View view, boolean z) {
        int i = z ? this.d * (-1) : this.d;
        if (Build.VERSION.SDK_INT >= 12) {
            view.animate().x(i);
        } else {
            ac.K0(view, i);
        }
    }

    public void g(ArrayList<FormItemView> arrayList, FormItemView.a aVar) {
        this.b = arrayList;
        addView(arrayList.get(0));
        this.b.get(0).setFormItemListener(aVar);
        this.c = 0;
        this.d = getResources().getDisplayMetrics().widthPixels;
        for (int i = 1; i < this.b.size(); i++) {
            FormItemView formItemView = this.b.get(i);
            formItemView.setFormItemListener(aVar);
            ac.K0(formItemView, this.d);
            addView(formItemView);
        }
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public Object getFormDataTag() {
        Object obj = this.e;
        return obj == null ? this.b.get(0).getFormDataTag() : obj;
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public String getInputValue() {
        return this.b.get(0).getInputValue();
    }

    public boolean getTextEntered() {
        return this.b.get(this.c).getTextEntered();
    }

    public boolean getToggleCheckBox() {
        return this.b.get(this.c).getToggleCheckBox();
    }

    public boolean h() {
        if (this.c >= this.b.size() - 1) {
            return false;
        }
        Button button = (Button) this.b.get(this.c + 1).findViewById(R.id.form_item_button);
        button.setEnabled(false);
        button.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.drawable.ic_visibility_blue_24px), (Drawable) null, (Drawable) null, (Drawable) null);
        button.setText(R.string.action_show);
        this.b.get(this.c).setIsStateUnmasked(false);
        f(this.b.get(this.c), true);
        c(this.b.get(this.c + 1));
        int i = this.c + 1;
        this.c = i;
        this.b.get(i).requestFocus();
        return true;
    }

    public boolean i() {
        int i = this.c;
        if (i == 0) {
            return false;
        }
        Button button = (Button) this.b.get(i - 1).findViewById(R.id.form_item_button);
        button.setEnabled(false);
        button.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.drawable.ic_visibility_blue_24px), (Drawable) null, (Drawable) null, (Drawable) null);
        button.setText(R.string.action_show);
        this.b.get(this.c).setIsStateUnmasked(false);
        f(this.b.get(this.c), false);
        c(this.b.get(this.c - 1));
        int i2 = this.c - 1;
        this.c = i2;
        this.b.get(i2).requestFocus();
        return true;
    }

    public final void j() {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).setText(C0059ao.a(4726));
        }
        i();
    }

    public void setFormDataTag(Object obj) {
        this.e = obj;
    }

    @Override // org.npci.upi.security.pinactivitycomponent.widget.a
    public void setText(String str) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).setText(str);
        }
    }

    public void setTextEntered(boolean z) {
        this.b.get(this.c).setTextEntered(z);
    }

    public void setToggleCheckBox(boolean z) {
        this.b.get(this.c).setToggleCheckBox(z);
    }
}
