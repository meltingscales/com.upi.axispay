package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AxisPay */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();
    public final IntentSender b;
    public final Intent c;
    public final int d;
    public final int e;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class b {
        public IntentSender a;
        public Intent b;
        public int c;
        public int d;

        public b(IntentSender intentSender) {
            this.a = intentSender;
        }

        public IntentSenderRequest a() {
            return new IntentSenderRequest(this.a, this.b, this.c, this.d);
        }

        public b b(Intent intent) {
            this.b = intent;
            return this;
        }

        public b c(int i, int i2) {
            this.d = i;
            this.c = i2;
            return this;
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.b = intentSender;
        this.c = intent;
        this.d = i;
        this.e = i2;
    }

    public Intent a() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IntentSender e() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }

    public IntentSenderRequest(Parcel parcel) {
        this.b = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }
}
