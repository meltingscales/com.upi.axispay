package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* compiled from: AxisPay */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();
    public ArrayList<FragmentState> b;
    public ArrayList<String> c;
    public BackStackState[] d;
    public int e;
    public String f;
    public ArrayList<String> g;
    public ArrayList<Bundle> h;
    public ArrayList<FragmentManager.LaunchedFragmentInfo> i;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.f = null;
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        parcel.writeStringList(this.c);
        parcel.writeTypedArray(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeStringList(this.g);
        parcel.writeTypedList(this.h);
        parcel.writeTypedList(this.i);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f = null;
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.b = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.c = parcel.createStringArrayList();
        this.d = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.i = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
