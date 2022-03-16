package android.support.p010v4.p025i.p026a;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.SystemClock;
import android.support.annotation.C0007ae;
import android.util.Log;

@C0007ae(mo1a = 18)
@TargetApi(18)
/* renamed from: android.support.v4.i.a.j */
class C0643j {

    /* renamed from: a */
    private static final String f2486a = "MediaSessionCompatApi18";

    /* renamed from: b */
    private static final long f2487b = 256;

    /* renamed from: c */
    private static boolean f2488c = true;

    /* renamed from: android.support.v4.i.a.j$a */
    interface C0644a {
        /* renamed from: b */
        void mo2273b(long j);
    }

    /* renamed from: android.support.v4.i.a.j$b */
    static class C0645b<T extends C0644a> implements RemoteControlClient.OnPlaybackPositionUpdateListener {

        /* renamed from: a */
        protected final T f2489a;

        public C0645b(T t) {
            this.f2489a = t;
        }

        public void onPlaybackPositionUpdate(long j) {
            this.f2489a.mo2273b(j);
        }
    }

    C0643j() {
    }

    /* renamed from: a */
    static int m3578a(long j) {
        int a = C0642i.m3570a(j);
        return (256 & j) != 0 ? a | 256 : a;
    }

    /* renamed from: a */
    public static Object m3579a(C0644a aVar) {
        return new C0645b(aVar);
    }

    /* renamed from: a */
    public static void m3580a(Context context, PendingIntent pendingIntent, ComponentName componentName) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (f2488c) {
            try {
                audioManager.registerMediaButtonEventReceiver(pendingIntent);
            } catch (NullPointerException e) {
                Log.w(f2486a, "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                f2488c = false;
            }
        }
        if (!f2488c) {
            audioManager.registerMediaButtonEventReceiver(componentName);
        }
    }

    /* renamed from: a */
    public static void m3581a(Object obj, int i, long j, float f, long j2) {
        long j3 = 0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i == 3 && j > 0) {
            if (j2 > 0) {
                j3 = elapsedRealtime - j2;
                if (f > 0.0f && f != 1.0f) {
                    j3 = (long) (((float) j3) * f);
                }
            }
            j += j3;
        }
        ((RemoteControlClient) obj).setPlaybackState(C0642i.m3569a(i), j, f);
    }

    /* renamed from: a */
    public static void m3582a(Object obj, long j) {
        ((RemoteControlClient) obj).setTransportControlFlags(m3578a(j));
    }

    /* renamed from: a */
    public static void m3583a(Object obj, Object obj2) {
        ((RemoteControlClient) obj).setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) obj2);
    }

    /* renamed from: b */
    public static void m3584b(Context context, PendingIntent pendingIntent, ComponentName componentName) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (f2488c) {
            audioManager.unregisterMediaButtonEventReceiver(pendingIntent);
        } else {
            audioManager.unregisterMediaButtonEventReceiver(componentName);
        }
    }
}
