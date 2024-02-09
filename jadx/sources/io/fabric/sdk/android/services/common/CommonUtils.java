package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import javax.crypto.Cipher;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CommonUtils {
    public static final int BYTES_IN_A_GIGABYTE = 0;
    public static final int BYTES_IN_A_KILOBYTE = 0;
    public static final int BYTES_IN_A_MEGABYTE = 0;
    private static final String CLS_SHARED_PREFERENCES_NAME = null;
    public static final boolean CLS_TRACE_DEFAULT = false;
    public static final String CLS_TRACE_PREFERENCE_NAME = null;
    public static final String CRASHLYTICS_BUILD_ID = null;
    public static final int DEVICE_STATE_BETAOS = 0;
    public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 0;
    public static final int DEVICE_STATE_DEBUGGERATTACHED = 0;
    public static final int DEVICE_STATE_ISSIMULATOR = 0;
    public static final int DEVICE_STATE_JAILBROKEN = 0;
    public static final int DEVICE_STATE_VENDORINTERNAL = 0;
    public static final String FABRIC_BUILD_ID = null;
    public static final Comparator<File> FILE_MODIFIED_COMPARATOR;
    public static final String GOOGLE_SDK = null;
    private static final char[] HEX_VALUES;
    private static final String LOG_PRIORITY_NAME_ASSERT = null;
    private static final String LOG_PRIORITY_NAME_DEBUG = null;
    private static final String LOG_PRIORITY_NAME_ERROR = null;
    private static final String LOG_PRIORITY_NAME_INFO = null;
    private static final String LOG_PRIORITY_NAME_UNKNOWN = null;
    private static final String LOG_PRIORITY_NAME_VERBOSE = null;
    private static final String LOG_PRIORITY_NAME_WARN = null;
    public static final String SDK = null;
    public static final String SHA1_INSTANCE = null;
    public static final String SHA256_INSTANCE = null;
    private static final long UNCALCULATED_TOTAL_RAM = 0;
    private static Boolean clsTrace;
    private static long totalRamInBytes;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, Architecture> matcher;

        static {
            Architecture architecture = X86_32;
            Architecture architecture2 = ARMV6;
            Architecture architecture3 = ARMV7;
            Architecture architecture4 = ARM64;
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }

        public static Architecture getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                Fabric.getLogger().d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = matcher.get(str.toLowerCase(Locale.US));
            return architecture == null ? UNKNOWN : architecture;
        }
    }

    static {
        C0059ao.a(CommonUtils.class, 134);
        HEX_VALUES = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        totalRamInBytes = -1L;
        FILE_MODIFIED_COMPARATOR = new Comparator<File>() { // from class: io.fabric.sdk.android.services.common.CommonUtils.1
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return (int) (file.lastModified() - file2.lastModified());
            }
        };
    }

    public static long calculateFreeRamInBytes(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(C0059ao.a(12211))).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long calculateUsedDiskSpaceInBytes(String str) {
        StatFs statFs;
        long blockSize = new StatFs(str).getBlockSize();
        return (statFs.getBlockCount() * blockSize) - (blockSize * statFs.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    public static boolean canTryConnection(Context context) {
        if (checkPermission(context, C0059ao.a(12212))) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(C0059ao.a(12213))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }
        return true;
    }

    public static boolean checkPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void closeOrLog(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Fabric.getLogger().e(C0059ao.a(12214), str, e);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long convertMemInfoToBytes(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * i;
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    @Deprecated
    public static Cipher createCipher(int i, String str) throws InvalidKeyException {
        throw new InvalidKeyException(C0059ao.a(12215));
    }

    public static String createInstanceIdFrom(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace(C0059ao.a(12216), C0059ao.a(12217)).toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            sb.append(str2);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return sha1(sb2);
        }
        return null;
    }

    public static byte[] dehexify(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        r3 = r4[1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String extractFieldFromSystemFile(java.io.File r8, java.lang.String r9) {
        /*
            r0 = 12218(0x2fba, float:1.7121E-41)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            boolean r2 = r8.exists()
            r3 = 0
            if (r2 == 0) goto L75
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r5 = 1024(0x400, float:1.435E-42)
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
        L1a:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L6f
            if (r4 == 0) goto L40
            r0 = 12219(0x2fbb, float:1.7122E-41)
            java.lang.String r5 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L6f
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L6f
            r6 = 2
            java.lang.String[] r4 = r5.split(r4, r6)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L6f
            int r5 = r4.length     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L6f
            r6 = 1
            if (r5 <= r6) goto L1a
            r5 = 0
            r5 = r4[r5]     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L6f
            boolean r5 = r5.equals(r9)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L6f
            if (r5 == 0) goto L1a
            r8 = r4[r6]     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L6f
            r3 = r8
        L40:
            closeOrLog(r2, r1)
            goto L75
        L44:
            r9 = move-exception
            goto L4a
        L46:
            r8 = move-exception
            goto L71
        L48:
            r9 = move-exception
            r2 = r3
        L4a:
            io.fabric.sdk.android.Logger r4 = io.fabric.sdk.android.Fabric.getLogger()     // Catch: java.lang.Throwable -> L6f
            r0 = 12220(0x2fbc, float:1.7124E-41)
            java.lang.String r5 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r6.<init>()     // Catch: java.lang.Throwable -> L6f
            r0 = 12221(0x2fbd, float:1.7125E-41)
            java.lang.String r7 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> L6f
            r6.append(r7)     // Catch: java.lang.Throwable -> L6f
            r6.append(r8)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L6f
            r4.e(r5, r8, r9)     // Catch: java.lang.Throwable -> L6f
            goto L40
        L6f:
            r8 = move-exception
            r3 = r2
        L71:
            closeOrLog(r3, r1)
            throw r8
        L75:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.common.CommonUtils.extractFieldFromSystemFile(java.io.File, java.lang.String):java.lang.String");
    }

    @TargetApi(16)
    public static void finishAffinity(Context context, int i) {
        if (context instanceof Activity) {
            finishAffinity((Activity) context, i);
        }
    }

    public static void flushOrLog(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                Fabric.getLogger().e(C0059ao.a(12222), str, e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    public static String getAppIconHashOrNull(Context context) {
        Throwable th;
        InputStream inputStream;
        String a = C0059ao.a(12223);
        try {
            try {
                inputStream = context.getResources().openRawResource(getAppIconResourceId(context));
            } catch (Exception e) {
                e = e;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                context = 0;
                closeOrLog(context, a);
                throw th;
            }
            try {
                String sha1 = sha1(inputStream);
                String str = isNullOrEmpty(sha1) ? null : sha1;
                closeOrLog(inputStream, a);
                return str;
            } catch (Exception e2) {
                e = e2;
                Fabric.getLogger().e(C0059ao.a(12224), C0059ao.a(12225), e);
                closeOrLog(inputStream, a);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeOrLog(context, a);
            throw th;
        }
    }

    public static int getAppIconResourceId(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static ActivityManager.RunningAppProcessInfo getAppProcessInfo(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C0059ao.a(12226))).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static Float getBatteryLevel(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter(C0059ao.a(12227)));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(registerReceiver.getIntExtra(C0059ao.a(12228), -1) / registerReceiver.getIntExtra(C0059ao.a(12229), -1));
    }

    public static int getBatteryVelocity(Context context, boolean z) {
        Float batteryLevel = getBatteryLevel(context);
        if (!z || batteryLevel == null) {
            return 1;
        }
        if (batteryLevel.floatValue() >= 99.0d) {
            return 3;
        }
        return ((double) batteryLevel.floatValue()) < 99.0d ? 2 : 0;
    }

    public static boolean getBooleanResourceValue(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int resourcesIdentifier = getResourcesIdentifier(context, str, C0059ao.a(12230));
            if (resourcesIdentifier > 0) {
                return resources.getBoolean(resourcesIdentifier);
            }
            int resourcesIdentifier2 = getResourcesIdentifier(context, str, C0059ao.a(12231));
            if (resourcesIdentifier2 > 0) {
                return Boolean.parseBoolean(context.getString(resourcesIdentifier2));
            }
        }
        return z;
    }

    public static int getCpuArchitectureInt() {
        return Architecture.getValue().ordinal();
    }

    public static int getDeviceState(Context context) {
        int i = isEmulator(context) ? 1 : 0;
        if (isRooted(context)) {
            i |= 2;
        }
        return isDebuggerAttached() ? i | 4 : i;
    }

    public static boolean getProximitySensorEnabled(Context context) {
        return (isEmulator(context) || ((SensorManager) context.getSystemService(C0059ao.a(12232))).getDefaultSensor(8) == null) ? false : true;
    }

    public static String getResourcePackageName(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            return context.getResources().getResourcePackageName(i);
        }
        return context.getPackageName();
    }

    public static int getResourcesIdentifier(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, getResourcePackageName(context));
    }

    public static SharedPreferences getSharedPrefs(Context context) {
        return context.getSharedPreferences(C0059ao.a(12233), 0);
    }

    public static String getStringsFileValue(Context context, String str) {
        int resourcesIdentifier = getResourcesIdentifier(context, str, C0059ao.a(12234));
        return resourcesIdentifier > 0 ? context.getString(resourcesIdentifier) : C0059ao.a(12235);
    }

    public static synchronized long getTotalRamInBytes() {
        long j;
        synchronized (CommonUtils.class) {
            if (totalRamInBytes == -1) {
                long j2 = 0;
                String extractFieldFromSystemFile = extractFieldFromSystemFile(new File(C0059ao.a(12236)), C0059ao.a(12237));
                if (!TextUtils.isEmpty(extractFieldFromSystemFile)) {
                    String upperCase = extractFieldFromSystemFile.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith(C0059ao.a(12238))) {
                            j2 = convertMemInfoToBytes(upperCase, C0059ao.a(12239), 1024);
                        } else if (upperCase.endsWith(C0059ao.a(12240))) {
                            j2 = convertMemInfoToBytes(upperCase, C0059ao.a(12241), com.google.firebase.crashlytics.internal.common.CommonUtils.BYTES_IN_A_MEGABYTE);
                        } else if (upperCase.endsWith(C0059ao.a(12242))) {
                            j2 = convertMemInfoToBytes(upperCase, C0059ao.a(12243), com.google.firebase.crashlytics.internal.common.CommonUtils.BYTES_IN_A_GIGABYTE);
                        } else {
                            Logger logger = Fabric.getLogger();
                            String a = C0059ao.a(12244);
                            logger.d(a, C0059ao.a(12245) + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        Logger logger2 = Fabric.getLogger();
                        String a2 = C0059ao.a(12246);
                        logger2.e(a2, C0059ao.a(12247) + upperCase, e);
                    }
                }
                totalRamInBytes = j2;
            }
            j = totalRamInBytes;
        }
        return j;
    }

    private static String hash(String str, String str2) {
        return hash(str.getBytes(), str2);
    }

    public static String hexify(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = HEX_VALUES;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static void hideKeyboard(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(C0059ao.a(12255));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean isAppDebuggable(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean isClsTrace(Context context) {
        if (clsTrace == null) {
            clsTrace = Boolean.valueOf(getBooleanResourceValue(context, C0059ao.a(12256), false));
        }
        return clsTrace.booleanValue();
    }

    public static boolean isDebuggerAttached() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean isEmulator(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), C0059ao.a(12257));
        String str = Build.PRODUCT;
        return C0059ao.a(12258).equals(str) || C0059ao.a(12259).equals(str) || string == null;
    }

    @Deprecated
    public static boolean isLoggingEnabled(Context context) {
        return false;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isRooted(Context context) {
        boolean isEmulator = isEmulator(context);
        String str = Build.TAGS;
        if ((isEmulator || str == null || !str.contains(C0059ao.a(12260))) && !new File(C0059ao.a(12261)).exists()) {
            return !isEmulator && new File(C0059ao.a(12262)).exists();
        }
        return true;
    }

    public static void logControlled(Context context, String str) {
        if (isClsTrace(context)) {
            Fabric.getLogger().d(C0059ao.a(12264), str);
        }
    }

    public static void logControlledError(Context context, String str, Throwable th) {
        if (isClsTrace(context)) {
            Fabric.getLogger().e(C0059ao.a(12265), str);
        }
    }

    public static void logOrThrowIllegalArgumentException(String str, String str2) {
        if (!Fabric.isDebuggable()) {
            Fabric.getLogger().w(str, str2);
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void logOrThrowIllegalStateException(String str, String str2) {
        if (!Fabric.isDebuggable()) {
            Fabric.getLogger().w(str, str2);
            return;
        }
        throw new IllegalStateException(str2);
    }

    public static String logPriorityToString(int i) {
        switch (i) {
            case 2:
                return C0059ao.a(12272);
            case 3:
                return C0059ao.a(12271);
            case 4:
                return C0059ao.a(12270);
            case 5:
                return C0059ao.a(12269);
            case 6:
                return C0059ao.a(12268);
            case 7:
                return C0059ao.a(12267);
            default:
                return C0059ao.a(12266);
        }
    }

    public static void openKeyboard(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(C0059ao.a(12273));
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInputFromInputMethod(view.getWindowToken(), 0);
        }
    }

    public static String padWithZerosToMaxIntWidth(int i) {
        if (i >= 0) {
            return String.format(Locale.US, C0059ao.a(12274), Integer.valueOf(i)).replace(' ', '0');
        }
        throw new IllegalArgumentException(C0059ao.a(12275));
    }

    public static String resolveBuildId(Context context) {
        String a = C0059ao.a(12276);
        String a2 = C0059ao.a(12277);
        int resourcesIdentifier = getResourcesIdentifier(context, a, a2);
        if (resourcesIdentifier == 0) {
            resourcesIdentifier = getResourcesIdentifier(context, C0059ao.a(12278), a2);
        }
        if (resourcesIdentifier != 0) {
            String string = context.getResources().getString(resourcesIdentifier);
            Logger logger = Fabric.getLogger();
            logger.d(C0059ao.a(12280), C0059ao.a(12279) + string);
            return string;
        }
        return null;
    }

    public static String sha1(String str) {
        return hash(str, C0059ao.a(12282));
    }

    public static String sha256(String str) {
        return hash(str, C0059ao.a(12283));
    }

    public static String streamToString(InputStream inputStream) throws IOException {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter(C0059ao.a(12284));
        return useDelimiter.hasNext() ? useDelimiter.next() : C0059ao.a(12285);
    }

    public static boolean stringsEqualIncludingNull(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        return false;
    }

    private static String hash(InputStream inputStream, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    return hexify(messageDigest.digest());
                }
            }
        } catch (Exception e) {
            Fabric.getLogger().e(C0059ao.a(12248), C0059ao.a(12249), e);
            return C0059ao.a(12250);
        }
    }

    public static String sha1(InputStream inputStream) {
        return hash(inputStream, C0059ao.a(12281));
    }

    @TargetApi(16)
    public static void finishAffinity(Activity activity, int i) {
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
            return;
        }
        activity.setResult(i);
        activity.finish();
    }

    public static void logControlled(Context context, int i, String str, String str2) {
        if (isClsTrace(context)) {
            Fabric.getLogger().log(i, C0059ao.a(12263), str2);
        }
    }

    private static String hash(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return hexify(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Logger logger = Fabric.getLogger();
            logger.e(C0059ao.a(12253), C0059ao.a(12251) + str + C0059ao.a(12252), e);
            return C0059ao.a(12254);
        }
    }
}
