package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: yd  reason: default package */
/* loaded from: classes.dex */
public abstract class yd<E> extends ud {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final FragmentManager e;

    public yd(sd sdVar) {
        this(sdVar, sdVar, new Handler(), 0);
    }

    @Override // defpackage.ud
    public View d(int i) {
        return null;
    }

    @Override // defpackage.ud
    public boolean e() {
        return true;
    }

    public Activity f() {
        return this.b;
    }

    public Context g() {
        return this.c;
    }

    public Handler h() {
        return this.d;
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E j();

    public LayoutInflater k() {
        return LayoutInflater.from(this.c);
    }

    @Deprecated
    public void l(Fragment fragment, String[] strArr, int i) {
    }

    public boolean m(Fragment fragment) {
        return true;
    }

    public boolean n(String str) {
        return false;
    }

    public void o(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            t8.l(this.c, intent, bundle);
            return;
        }
        throw new IllegalStateException(C0059ao.a(7755));
    }

    @Deprecated
    public void q(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            d8.r(this.b, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException(C0059ao.a(7756));
    }

    public void r() {
    }

    public yd(Activity activity, Context context, Handler handler, int i) {
        this.e = new be();
        this.b = activity;
        db.f(context, C0059ao.a(7753));
        this.c = context;
        db.f(handler, C0059ao.a(7754));
        this.d = handler;
    }
}
