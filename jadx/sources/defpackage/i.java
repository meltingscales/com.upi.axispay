package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* compiled from: AxisPay */
/* renamed from: i  reason: default package */
/* loaded from: classes.dex */
public abstract class i<I, O> {

    /* compiled from: AxisPay */
    /* renamed from: i$a */
    /* loaded from: classes.dex */
    public static final class a<T> {
        @SuppressLint({"UnknownNullness"})
        public final T a;

        public a(@SuppressLint({"UnknownNullness"}) T t) {
            this.a = t;
        }

        @SuppressLint({"UnknownNullness"})
        public T a() {
            return this.a;
        }
    }

    public abstract Intent a(Context context, @SuppressLint({"UnknownNullness"}) I i);

    public a<O> b(Context context, @SuppressLint({"UnknownNullness"}) I i) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O c(int i, Intent intent);
}
