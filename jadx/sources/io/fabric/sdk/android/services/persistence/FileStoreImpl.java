package io.fabric.sdk.android.services.persistence;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import java.io.File;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FileStoreImpl implements FileStore {
    private final String contentPath;
    private final Context context;
    private final String legacySupport;

    public FileStoreImpl(Kit kit) {
        if (kit.getContext() != null) {
            Context context = kit.getContext();
            this.context = context;
            this.contentPath = kit.getPath();
            this.legacySupport = C0059ao.a(7628) + context.getPackageName();
            return;
        }
        throw new IllegalStateException(C0059ao.a(7629));
    }

    @Override // io.fabric.sdk.android.services.persistence.FileStore
    public File getCacheDir() {
        return prepare(this.context.getCacheDir());
    }

    @Override // io.fabric.sdk.android.services.persistence.FileStore
    public File getExternalCacheDir() {
        File file;
        if (!isExternalStorageAvailable()) {
            file = null;
        } else if (Build.VERSION.SDK_INT >= 8) {
            file = this.context.getExternalCacheDir();
        } else {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            file = new File(externalStorageDirectory, this.legacySupport + C0059ao.a(7630) + this.contentPath);
        }
        return prepare(file);
    }

    @Override // io.fabric.sdk.android.services.persistence.FileStore
    @TargetApi(8)
    public File getExternalFilesDir() {
        File file = null;
        if (isExternalStorageAvailable()) {
            if (Build.VERSION.SDK_INT >= 8) {
                file = this.context.getExternalFilesDir(null);
            } else {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                file = new File(externalStorageDirectory, this.legacySupport + C0059ao.a(7631) + this.contentPath);
            }
        }
        return prepare(file);
    }

    @Override // io.fabric.sdk.android.services.persistence.FileStore
    public File getFilesDir() {
        return prepare(this.context.getFilesDir());
    }

    public boolean isExternalStorageAvailable() {
        if (C0059ao.a(7632).equals(Environment.getExternalStorageState())) {
            return true;
        }
        Fabric.getLogger().w(C0059ao.a(7633), C0059ao.a(7634));
        return false;
    }

    public File prepare(File file) {
        String a = C0059ao.a(7635);
        if (file != null) {
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            Fabric.getLogger().w(a, C0059ao.a(7636));
            return null;
        }
        Fabric.getLogger().d(a, C0059ao.a(7637));
        return null;
    }
}
