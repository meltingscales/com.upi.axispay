package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class aa {

    /* renamed from: ι  reason: contains not printable characters */
    private static aa f175 = new aa();

    private aa() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static aa m135() {
        return f175;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static File m136(Context context) {
        return new File(context.getFilesDir(), C0059ao.a(13705));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static i m137(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
        } catch (Exception unused) {
            fileReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            char[] cArr = new char[(int) file.length()];
            fileReader.read(cArr);
            i iVar = new i(cArr);
            iVar.f291 = file.getName();
            try {
                fileReader.close();
            } catch (IOException e) {
                AFLogger.afErrorLog(e);
            }
            return iVar;
        } catch (Exception unused2) {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e2) {
                    AFLogger.afErrorLog(e2);
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileReader2 = fileReader;
            if (fileReader2 != null) {
                try {
                    fileReader2.close();
                } catch (IOException e3) {
                    AFLogger.afErrorLog(e3);
                }
            }
            throw th;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static List<i> m139(Context context) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), C0059ao.a(13710));
            if (!file.exists()) {
                file.mkdir();
            } else {
                for (File file2 : file.listFiles()) {
                    StringBuilder sb = new StringBuilder(C0059ao.a(13711));
                    sb.append(file2.getName());
                    AFLogger.afInfoLog(sb.toString());
                    arrayList.add(m137(file2));
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLog(C0059ao.a(13712), e);
        }
        return arrayList;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m138(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), C0059ao.a(13706)), str);
        StringBuilder sb = new StringBuilder(C0059ao.a(13707));
        sb.append(str);
        String a = C0059ao.a(13708);
        sb.append(a);
        AFLogger.afInfoLog(sb.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder(C0059ao.a(13709));
                sb2.append(str);
                sb2.append(a);
                AFLogger.afErrorLog(sb2.toString(), e);
            }
        }
    }
}
