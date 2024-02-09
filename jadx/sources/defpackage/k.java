package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* compiled from: AxisPay */
/* renamed from: k  reason: default package */
/* loaded from: classes.dex */
public final class k extends i<Intent, ActivityResult> {
    @Override // defpackage.i
    public /* bridge */ /* synthetic */ Intent a(Context context, Intent intent) {
        Intent intent2 = intent;
        d(context, intent2);
        return intent2;
    }

    public Intent d(Context context, Intent intent) {
        return intent;
    }

    @Override // defpackage.i
    /* renamed from: e */
    public ActivityResult c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
