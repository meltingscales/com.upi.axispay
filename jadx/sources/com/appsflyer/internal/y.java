package com.appsflyer.internal;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: ı  reason: contains not printable characters */
    public String f337;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f338;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum e {
        GOOGLE(0),
        AMAZON(1);
        

        /* renamed from: ɩ  reason: contains not printable characters */
        private int f342;

        e(int i) {
            this.f342 = i;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return String.valueOf(this.f342);
        }
    }

    public y(String str, boolean z) {
        this.f337 = str;
        this.f338 = z;
    }

    public final String toString() {
        return String.format(C0059ao.a(12477), this.f337, Boolean.valueOf(this.f338));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m229() {
        return this.f338;
    }
}
