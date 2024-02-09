package okhttp3.internal.publicsuffix;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final /* synthetic */ class PublicSuffixDatabase$findMatchingRule$1 extends bm0 {
    public PublicSuffixDatabase$findMatchingRule$1(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase, PublicSuffixDatabase.class, C0059ao.a(6309), C0059ao.a(6310), 0);
    }

    @Override // defpackage.bm0, defpackage.bn0
    public Object get() {
        return PublicSuffixDatabase.access$getPublicSuffixListBytes$p((PublicSuffixDatabase) this.receiver);
    }

    @Override // defpackage.bm0
    public void set(Object obj) {
        ((PublicSuffixDatabase) this.receiver).publicSuffixListBytes = (byte[]) obj;
    }
}
