package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.bf;
import defpackage.je;
import java.util.ArrayList;

/* compiled from: AxisPay */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();
    public final int[] b;
    public final ArrayList<String> c;
    public final int[] d;
    public final int[] e;
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final CharSequence j;
    public final int k;
    public final CharSequence l;
    public final ArrayList<String> m;
    public final ArrayList<String> n;
    public final boolean o;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(pd pdVar) {
        int size = pdVar.a.size();
        this.b = new int[size * 5];
        if (pdVar.g) {
            this.c = new ArrayList<>(size);
            this.d = new int[size];
            this.e = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                je.a aVar = pdVar.a.get(i);
                int i3 = i2 + 1;
                this.b[i2] = aVar.a;
                ArrayList<String> arrayList = this.c;
                Fragment fragment = aVar.b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.b;
                int i4 = i3 + 1;
                iArr[i3] = aVar.c;
                int i5 = i4 + 1;
                iArr[i4] = aVar.d;
                int i6 = i5 + 1;
                iArr[i5] = aVar.e;
                iArr[i6] = aVar.f;
                this.d[i] = aVar.g.ordinal();
                this.e[i] = aVar.h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f = pdVar.f;
            this.g = pdVar.i;
            this.h = pdVar.t;
            this.i = pdVar.j;
            this.j = pdVar.k;
            this.k = pdVar.l;
            this.l = pdVar.m;
            this.m = pdVar.n;
            this.n = pdVar.o;
            this.o = pdVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public pd a(FragmentManager fragmentManager) {
        pd pdVar = new pd(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                je.a aVar = new je.a();
                int i3 = i + 1;
                aVar.a = iArr[i];
                if (FragmentManager.I0(2)) {
                    String str = "Instantiate " + pdVar + " op #" + i2 + " base fragment #" + this.b[i3];
                }
                String str2 = this.c.get(i2);
                if (str2 != null) {
                    aVar.b = fragmentManager.h0(str2);
                } else {
                    aVar.b = null;
                }
                aVar.g = bf.c.values()[this.d[i2]];
                aVar.h = bf.c.values()[this.e[i2]];
                int[] iArr2 = this.b;
                int i4 = i3 + 1;
                int i5 = iArr2[i3];
                aVar.c = i5;
                int i6 = i4 + 1;
                int i7 = iArr2[i4];
                aVar.d = i7;
                int i8 = i6 + 1;
                int i9 = iArr2[i6];
                aVar.e = i9;
                int i10 = iArr2[i8];
                aVar.f = i10;
                pdVar.b = i5;
                pdVar.c = i7;
                pdVar.d = i9;
                pdVar.e = i10;
                pdVar.g(aVar);
                i2++;
                i = i8 + 1;
            } else {
                pdVar.f = this.f;
                pdVar.i = this.g;
                pdVar.t = this.h;
                pdVar.g = true;
                pdVar.j = this.i;
                pdVar.k = this.j;
                pdVar.l = this.k;
                pdVar.m = this.l;
                pdVar.n = this.m;
                pdVar.o = this.n;
                pdVar.p = this.o;
                pdVar.v(1);
                return pdVar;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.b);
        parcel.writeStringList(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.b = parcel.createIntArray();
        this.c = parcel.createStringArrayList();
        this.d = parcel.createIntArray();
        this.e = parcel.createIntArray();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }
}
