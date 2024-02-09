package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bd  reason: default package */
/* loaded from: classes.dex */
public final class bd implements vb {

    /* compiled from: AxisPay */
    /* renamed from: bd$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static CharSequence a(Context context, ClipData.Item item, int i) {
            if ((i & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bd$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static CharSequence a(Context context, ClipData.Item item, int i) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    public static CharSequence b(Context context, ClipData.Item item, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            return a.a(context, item, i);
        }
        return b.a(context, item, i);
    }

    public static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // defpackage.vb
    public gb a(View view, gb gbVar) {
        if (Log.isLoggable(C0059ao.a(1796), 3)) {
            String str = C0059ao.a(1797) + gbVar;
        }
        if (gbVar.d() == 2) {
            return gbVar;
        }
        ClipData b2 = gbVar.b();
        int c = gbVar.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < b2.getItemCount(); i++) {
            CharSequence b3 = b(context, b2.getItemAt(i), c);
            if (b3 != null) {
                if (!z) {
                    c(editable, b3);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), C0059ao.a(1798));
                    editable.insert(Selection.getSelectionEnd(editable), b3);
                }
            }
        }
        return null;
    }
}
