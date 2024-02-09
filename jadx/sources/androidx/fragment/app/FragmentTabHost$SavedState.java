package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FragmentTabHost$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<FragmentTabHost$SavedState> CREATOR = new a();
    public String b;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<FragmentTabHost$SavedState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentTabHost$SavedState createFromParcel(Parcel parcel) {
            return new FragmentTabHost$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentTabHost$SavedState[] newArray(int i) {
            return new FragmentTabHost$SavedState[i];
        }
    }

    public FragmentTabHost$SavedState(Parcel parcel) {
        super(parcel);
        this.b = parcel.readString();
    }

    public String toString() {
        return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.b + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
    }
}
