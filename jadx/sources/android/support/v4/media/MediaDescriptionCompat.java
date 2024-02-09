package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: AxisPay */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final String TAG = "MediaDescriptionCompat";
    private final CharSequence mDescription;
    private MediaDescription mDescriptionFwk;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static MediaDescription build(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder createBuilder() {
            return new MediaDescription.Builder();
        }

        public static CharSequence getDescription(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle getExtras(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap getIconBitmap(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri getIconUri(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String getMediaId(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence getSubtitle(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence getTitle(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void setDescription(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void setExtras(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void setIconBitmap(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void setIconUri(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void setMediaId(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void setSubtitle(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void setTitle(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Uri getMediaUri(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void setMediaUri(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Builder {
        private CharSequence mDescription;
        private Bundle mExtras;
        private Bitmap mIcon;
        private Uri mIconUri;
        private String mMediaId;
        private Uri mMediaUri;
        private CharSequence mSubtitle;
        private CharSequence mTitle;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.mMediaId, this.mTitle, this.mSubtitle, this.mDescription, this.mIcon, this.mIconUri, this.mExtras, this.mMediaUri);
        }

        public Builder setDescription(CharSequence charSequence) {
            this.mDescription = charSequence;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public Builder setIconBitmap(Bitmap bitmap) {
            this.mIcon = bitmap;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.mIconUri = uri;
            return this;
        }

        public Builder setMediaId(String str) {
            this.mMediaId = str;
            return this;
        }

        public Builder setMediaUri(Uri uri) {
            this.mMediaUri = uri;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            this.mSubtitle = charSequence;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.mTitle = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat fromMediaDescription(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L83
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L83
            android.support.v4.media.MediaDescriptionCompat$Builder r2 = new android.support.v4.media.MediaDescriptionCompat$Builder
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getMediaId(r9)
            r2.setMediaId(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getTitle(r9)
            r2.setTitle(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getSubtitle(r9)
            r2.setSubtitle(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getDescription(r9)
            r2.setDescription(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconBitmap(r9)
            r2.setIconBitmap(r3)
            android.net.Uri r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconUri(r9)
            r2.setIconUri(r3)
            android.os.Bundle r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getExtras(r9)
            if (r3 == 0) goto L44
            android.os.Bundle r3 = android.support.v4.media.session.MediaSessionCompat.unparcelWithClassLoader(r3)
        L44:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4f
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L50
        L4f:
            r5 = r0
        L50:
            if (r5 == 0) goto L68
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L62
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L62
            goto L69
        L62:
            r3.remove(r4)
            r3.remove(r6)
        L68:
            r0 = r3
        L69:
            r2.setExtras(r0)
            if (r5 == 0) goto L72
            r2.setMediaUri(r5)
            goto L7d
        L72:
            r0 = 23
            if (r1 < r0) goto L7d
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.Api23Impl.getMediaUri(r9)
            r2.setMediaUri(r0)
        L7d:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.build()
            r0.mDescriptionFwk = r9
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.fromMediaDescription(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CharSequence getDescription() {
        return this.mDescription;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public Bitmap getIconBitmap() {
        return this.mIcon;
    }

    public Uri getIconUri() {
        return this.mIconUri;
    }

    public Object getMediaDescription() {
        int i;
        MediaDescription mediaDescription = this.mDescriptionFwk;
        if (mediaDescription != null || (i = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder createBuilder = Api21Impl.createBuilder();
        Api21Impl.setMediaId(createBuilder, this.mMediaId);
        Api21Impl.setTitle(createBuilder, this.mTitle);
        Api21Impl.setSubtitle(createBuilder, this.mSubtitle);
        Api21Impl.setDescription(createBuilder, this.mDescription);
        Api21Impl.setIconBitmap(createBuilder, this.mIcon);
        Api21Impl.setIconUri(createBuilder, this.mIconUri);
        Bundle bundle = this.mExtras;
        if (i < 23 && this.mMediaUri != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean(DESCRIPTION_KEY_NULL_BUNDLE_FLAG, true);
            }
            bundle.putParcelable(DESCRIPTION_KEY_MEDIA_URI, this.mMediaUri);
        }
        Api21Impl.setExtras(createBuilder, bundle);
        if (i >= 23) {
            Api23Impl.setMediaUri(createBuilder, this.mMediaUri);
        }
        MediaDescription build = Api21Impl.build(createBuilder);
        this.mDescriptionFwk = build;
        return build;
    }

    public String getMediaId() {
        return this.mMediaId;
    }

    public Uri getMediaUri() {
        return this.mMediaUri;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public String toString() {
        return ((Object) this.mTitle) + ", " + ((Object) this.mSubtitle) + ", " + ((Object) this.mDescription);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.mMediaId);
            TextUtils.writeToParcel(this.mTitle, parcel, i);
            TextUtils.writeToParcel(this.mSubtitle, parcel, i);
            TextUtils.writeToParcel(this.mDescription, parcel, i);
            parcel.writeParcelable(this.mIcon, i);
            parcel.writeParcelable(this.mIconUri, i);
            parcel.writeBundle(this.mExtras);
            parcel.writeParcelable(this.mMediaUri, i);
            return;
        }
        ((MediaDescription) getMediaDescription()).writeToParcel(parcel, i);
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.mMediaId = parcel.readString();
        this.mTitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSubtitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mDescription = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.mIcon = (Bitmap) parcel.readParcelable(classLoader);
        this.mIconUri = (Uri) parcel.readParcelable(classLoader);
        this.mExtras = parcel.readBundle(classLoader);
        this.mMediaUri = (Uri) parcel.readParcelable(classLoader);
    }
}
