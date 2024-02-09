package androidx.viewpager2.widget;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ViewPager2$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<ViewPager2$SavedState> CREATOR = new a();
    public int b;
    public int c;
    public Parcelable d;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.ClassLoaderCreator<ViewPager2$SavedState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ViewPager2$SavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public ViewPager2$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return Build.VERSION.SDK_INT >= 24 ? new ViewPager2$SavedState(parcel, classLoader) : new ViewPager2$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public ViewPager2$SavedState[] newArray(int i) {
            return new ViewPager2$SavedState[i];
        }
    }

    public ViewPager2$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        a(parcel, classLoader);
    }

    public final void a(Parcel parcel, ClassLoader classLoader) {
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
    }

    public ViewPager2$SavedState(Parcel parcel) {
        super(parcel);
        a(parcel, null);
    }
}
