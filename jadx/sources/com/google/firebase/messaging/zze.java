package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_messaging.zzj;
import com.google.android.gms.internal.firebase_messaging.zzk;
import com.google.android.gms.internal.firebase_messaging.zzn;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zze implements Closeable {
    private final URL url;
    private Task<Bitmap> zzef;
    private volatile InputStream zzeg;

    private zze(URL url) {
        this.url = url;
    }

    public static zze zzo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new zze(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzk.zza(this.zzeg);
    }

    public final Task<Bitmap> getTask() {
        return (Task) Preconditions.checkNotNull(this.zzef);
    }

    public final void zza(Executor executor) {
        this.zzef = Tasks.call(executor, new Callable(this) { // from class: com.google.firebase.messaging.zzd
            private final zze zzee;

            {
                this.zzee = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzee.zzat();
            }
        });
    }

    public final Bitmap zzat() throws IOException {
        String valueOf = String.valueOf(this.url);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        Log.i("FirebaseMessaging", sb.toString());
        try {
            InputStream inputStream = this.url.openConnection().getInputStream();
            InputStream zza = zzj.zza(inputStream, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            this.zzeg = inputStream;
            Bitmap decodeStream = BitmapFactory.decodeStream(zza);
            if (decodeStream != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String valueOf2 = String.valueOf(this.url);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                    sb2.append("Successfully downloaded image: ");
                    sb2.append(valueOf2);
                    sb2.toString();
                }
                zza(null, zza);
                if (inputStream != null) {
                    zza(null, inputStream);
                }
                return decodeStream;
            }
            String valueOf3 = String.valueOf(this.url);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
            sb3.append("Failed to decode image: ");
            sb3.append(valueOf3);
            String sb4 = sb3.toString();
            Log.w("FirebaseMessaging", sb4);
            throw new IOException(sb4);
        } catch (IOException e) {
            String valueOf4 = String.valueOf(this.url);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 26);
            sb5.append("Failed to download image: ");
            sb5.append(valueOf4);
            Log.w("FirebaseMessaging", sb5.toString());
            throw e;
        }
    }

    private static /* synthetic */ void zza(Throwable th, InputStream inputStream) {
        if (th == null) {
            inputStream.close();
            return;
        }
        try {
            inputStream.close();
        } catch (Throwable th2) {
            zzn.zza(th, th2);
        }
    }
}
