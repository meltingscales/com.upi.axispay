package org.npci.upi.security.pinactivitycomponent;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class Keypad extends TableLayout {
    public int b;
    public int c;
    public int d;
    public float e;
    public a f;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public interface a {
        void a(View view, int i);
    }

    public Keypad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 61;
        d(attributeSet);
        c();
    }

    private TableRow.LayoutParams getItemParams() {
        return new TableRow.LayoutParams(0, a(this.b), 1.0f);
    }

    private void setClickFeedback(View view) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public final int a(float f) {
        return (int) (f * (getResources().getDisplayMetrics().densityDpi / 160));
    }

    public final void c() {
        setBackgroundColor(this.c);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-1, 0, 1.0f);
        final int i = 1;
        for (int i2 = 0; i2 < 3; i2++) {
            TableRow tableRow = new TableRow(getContext());
            tableRow.setLayoutParams(layoutParams);
            tableRow.setWeightSum(3.0f);
            for (int i3 = 0; i3 < 3; i3++) {
                TextView textView = new TextView(getContext());
                textView.setGravity(17);
                textView.setLayoutParams(getItemParams());
                textView.setTextColor(this.d);
                textView.setTextSize(2, this.e);
                textView.setText(String.valueOf(i));
                textView.setClickable(true);
                setClickFeedback(textView);
                textView.setOnClickListener(new View.OnClickListener() { // from class: org.npci.upi.security.pinactivitycomponent.Keypad.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (Keypad.this.f != null) {
                            Keypad.this.f.a(view, i + 7);
                        }
                    }
                });
                tableRow.addView(textView);
                i++;
            }
            addView(tableRow);
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ic_action_backspace);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setAdjustViewBounds(true);
        TableRow.LayoutParams itemParams = getItemParams();
        itemParams.height = (int) (a(this.b) * 1.2f);
        imageView.setLayoutParams(itemParams);
        imageView.setClickable(true);
        setClickFeedback(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.npci.upi.security.pinactivitycomponent.Keypad.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Keypad.this.f != null) {
                    Keypad.this.f.a(view, 67);
                }
            }
        });
        TextView textView2 = new TextView(getContext());
        textView2.setLayoutParams(getItemParams());
        textView2.setGravity(17);
        textView2.setText(String.valueOf(0));
        textView2.setTextColor(this.d);
        textView2.setTextSize(2, this.e);
        textView2.setClickable(true);
        setClickFeedback(textView2);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: org.npci.upi.security.pinactivitycomponent.Keypad.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Keypad.this.f != null) {
                    Keypad.this.f.a(view, 7);
                }
            }
        });
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.ic_action_submit);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setAdjustViewBounds(true);
        TableRow.LayoutParams itemParams2 = getItemParams();
        itemParams2.height = (int) (a(this.b) * 1.1f);
        imageView2.setLayoutParams(itemParams2);
        imageView2.setClickable(true);
        setClickFeedback(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: org.npci.upi.security.pinactivitycomponent.Keypad.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Keypad.this.f != null) {
                    Keypad.this.f.a(view, 66);
                }
            }
        });
        TableRow tableRow2 = new TableRow(getContext());
        tableRow2.setLayoutParams(layoutParams);
        tableRow2.setWeightSum(3.0f);
        tableRow2.addView(imageView);
        tableRow2.addView(textView2);
        tableRow2.addView(imageView2);
        addView(tableRow2);
    }

    public final void d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.Keypad, 0, 0);
        this.c = obtainStyledAttributes.getColor(R.styleable.Keypad_keypad_bg_color, t8.d(getContext(), R.color.npci_keypad_bg_color));
        this.d = obtainStyledAttributes.getColor(R.styleable.Keypad_key_digit_color, t8.d(getContext(), R.color.npci_key_digit_color));
        this.e = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Keypad_key_digit_size, 36);
        this.b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Keypad_key_digit_height, this.b);
        obtainStyledAttributes.recycle();
    }

    public void setOnKeyPressCallback(a aVar) {
        this.f = aVar;
    }
}
