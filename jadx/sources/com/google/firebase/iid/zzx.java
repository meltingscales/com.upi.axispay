package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzx {
    public static void zza(Context context) {
        File[] listFiles;
        for (File file : zzb(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private final zzaa zzd(Context context, String str) throws zzz {
        zzaa zze;
        try {
            zze = zze(context, str);
        } catch (zzz e) {
            e = e;
        }
        if (zze != null) {
            zza(context, str, zze);
            return zze;
        }
        e = null;
        try {
            zzaa zza = zza(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (zza != null) {
                zza(context, str, zza, false);
                return zza;
            }
        } catch (zzz e2) {
            e = e2;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    private final zzaa zze(Context context, String str) throws zzz {
        File zzf = zzf(context, str);
        if (zzf.exists()) {
            try {
                return zza(zzf);
            } catch (zzz | IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                    sb.append("Failed to read key from file, retrying: ");
                    sb.append(valueOf);
                    sb.toString();
                }
                try {
                    return zza(zzf);
                } catch (IOException e2) {
                    String valueOf2 = String.valueOf(e2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                    sb2.append("IID file exists, but failed to read from it: ");
                    sb2.append(valueOf2);
                    Log.w("FirebaseInstanceId", sb2.toString());
                    throw new zzz(e2);
                }
            }
        }
        return null;
    }

    private static File zzf(Context context, String str) {
        String sb;
        if (TextUtils.isEmpty(str)) {
            sb = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb2 = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb2.append("com.google.InstanceId_");
                sb2.append(encodeToString);
                sb2.append(".properties");
                sb = sb2.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(zzb(context), sb);
    }

    public final zzaa zzb(Context context, String str) throws zzz {
        zzaa zzd = zzd(context, str);
        return zzd != null ? zzd : zzc(context, str);
    }

    public final zzaa zzc(Context context, String str) {
        zzaa zzaaVar = new zzaa(zza.zzc(), System.currentTimeMillis());
        zzaa zza = zza(context, str, zzaaVar, true);
        if (zza != null && !zza.equals(zzaaVar)) {
            Log.isLoggable("FirebaseInstanceId", 3);
            return zza;
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        zza(context, str, zzaaVar);
        return zzaaVar;
    }

    private static File zzb(Context context) {
        File j = t8.j(context);
        if (j == null || !j.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            return context.getFilesDir();
        }
        return j;
    }

    private final zzaa zza(Context context, String str, zzaa zzaaVar, boolean z) {
        String zzv;
        String zzw;
        long j;
        Log.isLoggable("FirebaseInstanceId", 3);
        Properties properties = new Properties();
        zzv = zzaaVar.zzv();
        properties.setProperty("pub", zzv);
        zzw = zzaaVar.zzw();
        properties.setProperty("pri", zzw);
        j = zzaaVar.zzbz;
        properties.setProperty("cre", String.valueOf(j));
        File zzf = zzf(context, str);
        try {
            zzf.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(zzf, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            channel.lock();
            if (z && channel.size() > 0) {
                try {
                    channel.position(0L);
                    zzaa zza = zza(channel);
                    if (channel != null) {
                        zza((Throwable) null, channel);
                    }
                    zza((Throwable) null, randomAccessFile);
                    return zza;
                } catch (zzz | IOException e) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
                        sb.append("Tried reading key pair before writing new one, but failed with: ");
                        sb.append(valueOf);
                        sb.toString();
                    }
                }
            }
            channel.position(0L);
            properties.store(Channels.newOutputStream(channel), (String) null);
            if (channel != null) {
                zza((Throwable) null, channel);
            }
            zza((Throwable) null, randomAccessFile);
            return zzaaVar;
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            sb2.append("Failed to write key: ");
            sb2.append(valueOf2);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    private static long zzb(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzax.zzd(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    private static KeyPair zzc(String str, String str2) throws zzz {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new zzz(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new zzz(e2);
        }
    }

    private final zzaa zza(File file) throws zzz, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            channel.lock(0L, RecyclerView.FOREVER_NS, true);
            zzaa zza = zza(channel);
            if (channel != null) {
                zza((Throwable) null, channel);
            }
            zza((Throwable) null, fileInputStream);
            return zza;
        } finally {
        }
    }

    private static zzaa zza(FileChannel fileChannel) throws zzz, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property != null && property2 != null) {
            try {
                return new zzaa(zzc(property, property2), Long.parseLong(properties.getProperty("cre")));
            } catch (NumberFormatException e) {
                throw new zzz(e);
            }
        }
        throw new zzz("Invalid properties file");
    }

    private static zzaa zza(SharedPreferences sharedPreferences, String str) throws zzz {
        String string = sharedPreferences.getString(zzax.zzd(str, "|P|"), null);
        String string2 = sharedPreferences.getString(zzax.zzd(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new zzaa(zzc(string, string2), zzb(sharedPreferences, str));
    }

    private final void zza(Context context, String str, zzaa zzaaVar) {
        String zzv;
        String zzw;
        long j;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (zzaaVar.equals(zza(sharedPreferences, str))) {
                return;
            }
        } catch (zzz unused) {
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String zzd = zzax.zzd(str, "|P|");
        zzv = zzaaVar.zzv();
        edit.putString(zzd, zzv);
        String zzd2 = zzax.zzd(str, "|K|");
        zzw = zzaaVar.zzw();
        edit.putString(zzd2, zzw);
        String zzd3 = zzax.zzd(str, "cre");
        j = zzaaVar.zzbz;
        edit.putString(zzd3, String.valueOf(j));
        edit.commit();
    }

    private static /* synthetic */ void zza(Throwable th, FileChannel fileChannel) {
        if (th == null) {
            fileChannel.close();
            return;
        }
        try {
            fileChannel.close();
        } catch (Throwable th2) {
            com.google.android.gms.internal.firebase_messaging.zzn.zza(th, th2);
        }
    }

    private static /* synthetic */ void zza(Throwable th, RandomAccessFile randomAccessFile) {
        if (th == null) {
            randomAccessFile.close();
            return;
        }
        try {
            randomAccessFile.close();
        } catch (Throwable th2) {
            com.google.android.gms.internal.firebase_messaging.zzn.zza(th, th2);
        }
    }

    private static /* synthetic */ void zza(Throwable th, FileInputStream fileInputStream) {
        if (th == null) {
            fileInputStream.close();
            return;
        }
        try {
            fileInputStream.close();
        } catch (Throwable th2) {
            com.google.android.gms.internal.firebase_messaging.zzn.zza(th, th2);
        }
    }
}
