package android.support.p010v4.p014d;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* renamed from: android.support.v4.d.w */
public abstract class C0476w extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f2049a = "android.support.content.wakelockid";

    /* renamed from: b */
    private static final SparseArray<PowerManager.WakeLock> f2050b = new SparseArray<>();

    /* renamed from: c */
    private static int f2051c = 1;

    /* renamed from: a */
    public static ComponentName m2519a(Context context, Intent intent) {
        synchronized (f2050b) {
            int i = f2051c;
            f2051c++;
            if (f2051c <= 0) {
                f2051c = 1;
            }
            intent.putExtra(f2049a, i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f2050b.put(i, newWakeLock);
            return startService;
        }
    }

    /* renamed from: a */
    public static boolean m2520a(Intent intent) {
        int intExtra = intent.getIntExtra(f2049a, 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f2050b) {
            PowerManager.WakeLock wakeLock = f2050b.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f2050b.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiver", "No active wake lock id #" + intExtra);
            return true;
        }
    }
}
