package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hd  reason: default package */
/* loaded from: classes.dex */
public abstract class hd extends fd {
    public int j;
    public int k;
    public LayoutInflater l;

    @Deprecated
    public hd(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.k = i;
        this.j = i;
        this.l = (LayoutInflater) context.getSystemService(C0059ao.a(7752));
    }

    @Override // defpackage.fd
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.l.inflate(this.k, viewGroup, false);
    }

    @Override // defpackage.fd
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.l.inflate(this.j, viewGroup, false);
    }
}
