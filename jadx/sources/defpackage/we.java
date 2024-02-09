package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@Deprecated
/* renamed from: we  reason: default package */
/* loaded from: classes.dex */
public abstract class we extends BroadcastReceiver {
    private static final String EXTRA_WAKE_LOCK_ID = null;
    private static int mNextId;
    private static final SparseArray<PowerManager.WakeLock> sActiveWakeLocks;

    static {
        C0059ao.a(we.class, 169);
        sActiveWakeLocks = new SparseArray<>();
        mNextId = 1;
    }

    public static boolean completeWakefulIntent(Intent intent) {
        int intExtra = intent.getIntExtra(C0059ao.a(5704), 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            String a = C0059ao.a(5705);
            Log.w(a, C0059ao.a(5706) + intExtra);
            return true;
        }
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            int i = mNextId;
            int i2 = i + 1;
            mNextId = i2;
            if (i2 <= 0) {
                mNextId = 1;
            }
            intent.putExtra(C0059ao.a(5707), i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService(C0059ao.a(5708))).newWakeLock(1, C0059ao.a(5709) + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000L);
            sparseArray.put(i, newWakeLock);
            return startService;
        }
    }
}
