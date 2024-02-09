package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import defpackage.gb;
import defpackage.qc;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: m2  reason: default package */
/* loaded from: classes.dex */
public final class m2 {

    /* compiled from: AxisPay */
    /* renamed from: m2$a */
    /* loaded from: classes.dex */
    public class a implements qc.c {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // defpackage.qc.c
        public boolean a(rc rcVar, int i, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
                try {
                    rcVar.d();
                    InputContentInfo inputContentInfo = (InputContentInfo) rcVar.e();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable(C0059ao.a(6148), inputContentInfo);
                } catch (Exception e) {
                    Log.w(C0059ao.a(6149), C0059ao.a(6150), e);
                    return false;
                }
            }
            gb.a aVar = new gb.a(new ClipData(rcVar.b(), new ClipData.Item(rcVar.a())), 2);
            aVar.d(rcVar.c());
            aVar.b(bundle);
            return ac.g0(this.a, aVar.a()) == null;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: m2$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ac.g0(textView, new gb.a(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        public static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            ac.g0(view, new gb.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    public static qc.c a(View view) {
        return new a(view);
    }

    public static boolean b(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && ac.F(view) != null) {
            Activity d = d(view);
            if (d == null) {
                Log.i(C0059ao.a(11303), C0059ao.a(11302) + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return b.a(dragEvent, (TextView) view, d);
                    }
                    return b.b(dragEvent, view, d);
                }
            }
        }
        return false;
    }

    public static boolean c(TextView textView, int i) {
        if ((i == 16908322 || i == 16908337) && ac.F(textView) != null) {
            ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService(C0059ao.a(11304));
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                gb.a aVar = new gb.a(primaryClip, 1);
                aVar.c(i != 16908322 ? 1 : 0);
                ac.g0(textView, aVar.a());
            }
            return true;
        }
        return false;
    }

    public static Activity d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
