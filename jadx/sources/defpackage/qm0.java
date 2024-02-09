package defpackage;

import java.util.NoSuchElementException;

/* compiled from: AxisPay */
/* renamed from: qm0  reason: default package */
/* loaded from: classes.dex */
public final class qm0 extends nj0 {
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public qm0(int i, int i2, int i3) {
        this.b = i3;
        this.c = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.d = z;
        this.e = z ? i : i2;
    }

    @Override // defpackage.nj0
    public int a() {
        int i = this.e;
        if (i == this.c) {
            if (this.d) {
                this.d = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.e = this.b + i;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.d;
    }
}
