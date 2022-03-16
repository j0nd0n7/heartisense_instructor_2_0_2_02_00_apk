package android.support.p010v4.p013c;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.p010v4.p013c.C0241at;

/* renamed from: android.support.v4.c.bn */
public abstract class C0311bn extends Service {

    /* renamed from: android.support.v4.c.bn$a */
    private class C0312a extends C0241at.C0242a {
        C0312a() {
        }

        /* renamed from: a */
        public void mo1270a(String str) {
            C0311bn.this.mo1525a(getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                C0311bn.this.mo1526a(str);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: a */
        public void mo1271a(String str, int i, String str2) {
            C0311bn.this.mo1525a(getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                C0311bn.this.mo1527a(str, i, str2);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: a */
        public void mo1272a(String str, int i, String str2, Notification notification) {
            C0311bn.this.mo1525a(getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                C0311bn.this.mo1528a(str, i, str2, notification);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1525a(int i, String str) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        int i2 = 0;
        while (i2 < length) {
            if (!packagesForUid[i2].equals(str)) {
                i2++;
            } else {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }

    /* renamed from: a */
    public abstract void mo1526a(String str);

    /* renamed from: a */
    public abstract void mo1527a(String str, int i, String str2);

    /* renamed from: a */
    public abstract void mo1528a(String str, int i, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        if (!intent.getAction().equals(C0313bo.f1750b) || Build.VERSION.SDK_INT > 19) {
            return null;
        }
        return new C0312a();
    }
}
