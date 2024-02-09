package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qc  reason: default package */
/* loaded from: classes.dex */
public final class qc {

    /* compiled from: AxisPay */
    /* renamed from: qc$a */
    /* loaded from: classes.dex */
    public class a extends InputConnectionWrapper {
        public final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z, c cVar) {
            super(inputConnection, z);
            this.a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.a.a(rc.f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qc$b */
    /* loaded from: classes.dex */
    public class b extends InputConnectionWrapper {
        public final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InputConnection inputConnection, boolean z, c cVar) {
            super(inputConnection, z);
            this.a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (qc.b(str, bundle, this.a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qc$c */
    /* loaded from: classes.dex */
    public interface c {
        boolean a(rc rcVar, int i, Bundle bundle);
    }

    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        if (inputConnection != null) {
            if (editorInfo != null) {
                if (cVar != null) {
                    if (Build.VERSION.SDK_INT >= 25) {
                        return new a(inputConnection, false, cVar);
                    }
                    return pc.a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, cVar);
                }
                throw new IllegalArgumentException(C0059ao.a(153));
            }
            throw new IllegalArgumentException(C0059ao.a(154));
        }
        throw new IllegalArgumentException(C0059ao.a(155));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static boolean b(String str, Bundle bundle, c cVar) {
        boolean z;
        ResultReceiver resultReceiver;
        ?? r1 = 0;
        r1 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(C0059ao.a(156), str)) {
            z = false;
        } else if (!TextUtils.equals(C0059ao.a(157), str)) {
            return false;
        } else {
            z = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z ? C0059ao.a(158) : C0059ao.a(159));
        } catch (Throwable th) {
            th = th;
            resultReceiver = 0;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(z ? C0059ao.a(160) : C0059ao.a(161));
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? C0059ao.a(162) : C0059ao.a(163));
            Uri uri2 = (Uri) bundle.getParcelable(z ? C0059ao.a(164) : C0059ao.a(165));
            int i = bundle.getInt(z ? C0059ao.a(166) : C0059ao.a(167));
            Bundle bundle2 = (Bundle) bundle.getParcelable(z ? C0059ao.a(168) : C0059ao.a(169));
            if (uri != null && clipDescription != null) {
                r1 = cVar.a(new rc(uri, clipDescription, uri2), i, bundle2);
            }
            if (resultReceiver != 0) {
                resultReceiver.send(r1, null);
            }
            return r1;
        } catch (Throwable th2) {
            th = th2;
            if (resultReceiver != 0) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }
}
