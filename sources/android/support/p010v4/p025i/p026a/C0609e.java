package android.support.p010v4.p025i.p026a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.annotation.C0007ae;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.i.a.e */
class C0609e {

    /* renamed from: android.support.v4.i.a.e$a */
    public interface C0610a {
        /* renamed from: a */
        void mo2142a();

        /* renamed from: a */
        void mo2143a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo2144a(Bundle bundle);

        /* renamed from: a */
        void mo2145a(CharSequence charSequence);

        /* renamed from: a */
        void mo2146a(Object obj);

        /* renamed from: a */
        void mo2147a(String str, Bundle bundle);

        /* renamed from: a */
        void mo2148a(List<?> list);

        /* renamed from: b */
        void mo2149b(Object obj);
    }

    /* renamed from: android.support.v4.i.a.e$b */
    static class C0611b<T extends C0610a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f2332a;

        public C0611b(T t) {
            this.f2332a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f2332a.mo2143a(playbackInfo.getPlaybackType(), C0612c.m3272c(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            this.f2332a.mo2144a(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f2332a.mo2149b(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f2332a.mo2146a((Object) playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f2332a.mo2148a((List<?>) list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f2332a.mo2145a(charSequence);
        }

        public void onSessionDestroyed() {
            this.f2332a.mo2142a();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            this.f2332a.mo2147a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.i.a.e$c */
    public static class C0612c {

        /* renamed from: a */
        private static final int f2333a = 4;

        /* renamed from: b */
        private static final int f2334b = 6;

        /* renamed from: c */
        private static final int f2335c = 7;

        /* renamed from: a */
        private static int m3269a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }

        /* renamed from: a */
        public static int m3270a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getPlaybackType();
        }

        /* renamed from: b */
        public static AudioAttributes m3271b(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: c */
        public static int m3272c(Object obj) {
            return m3269a(m3271b(obj));
        }

        /* renamed from: d */
        public static int m3273d(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getVolumeControl();
        }

        /* renamed from: e */
        public static int m3274e(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getMaxVolume();
        }

        /* renamed from: f */
        public static int m3275f(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getCurrentVolume();
        }
    }

    /* renamed from: android.support.v4.i.a.e$d */
    public static class C0613d {
        /* renamed from: a */
        public static void m3276a(Object obj) {
            ((MediaController.TransportControls) obj).play();
        }

        /* renamed from: a */
        public static void m3277a(Object obj, long j) {
            ((MediaController.TransportControls) obj).seekTo(j);
        }

        /* renamed from: a */
        public static void m3278a(Object obj, Object obj2) {
            ((MediaController.TransportControls) obj).setRating((Rating) obj2);
        }

        /* renamed from: a */
        public static void m3279a(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromMediaId(str, bundle);
        }

        /* renamed from: b */
        public static void m3280b(Object obj) {
            ((MediaController.TransportControls) obj).pause();
        }

        /* renamed from: b */
        public static void m3281b(Object obj, long j) {
            ((MediaController.TransportControls) obj).skipToQueueItem(j);
        }

        /* renamed from: b */
        public static void m3282b(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromSearch(str, bundle);
        }

        /* renamed from: c */
        public static void m3283c(Object obj) {
            ((MediaController.TransportControls) obj).stop();
        }

        /* renamed from: c */
        public static void m3284c(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).sendCustomAction(str, bundle);
        }

        /* renamed from: d */
        public static void m3285d(Object obj) {
            ((MediaController.TransportControls) obj).fastForward();
        }

        /* renamed from: e */
        public static void m3286e(Object obj) {
            ((MediaController.TransportControls) obj).rewind();
        }

        /* renamed from: f */
        public static void m3287f(Object obj) {
            ((MediaController.TransportControls) obj).skipToNext();
        }

        /* renamed from: g */
        public static void m3288g(Object obj) {
            ((MediaController.TransportControls) obj).skipToPrevious();
        }
    }

    C0609e() {
    }

    /* renamed from: a */
    public static Object m3239a(Activity activity) {
        return activity.getMediaController();
    }

    /* renamed from: a */
    public static Object m3240a(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    /* renamed from: a */
    public static Object m3241a(C0610a aVar) {
        return new C0611b(aVar);
    }

    /* renamed from: a */
    public static Object m3242a(Object obj) {
        return ((MediaController) obj).getSessionToken();
    }

    /* renamed from: a */
    public static void m3243a(Activity activity, Object obj) {
        activity.setMediaController((MediaController) obj);
    }

    /* renamed from: a */
    public static void m3244a(Object obj, int i, int i2) {
        ((MediaController) obj).setVolumeTo(i, i2);
    }

    /* renamed from: a */
    public static void m3245a(Object obj, Object obj2) {
        ((MediaController) obj).unregisterCallback((MediaController.Callback) obj2);
    }

    /* renamed from: a */
    public static void m3246a(Object obj, Object obj2, Handler handler) {
        ((MediaController) obj).registerCallback((MediaController.Callback) obj2, handler);
    }

    /* renamed from: a */
    public static void m3247a(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }

    /* renamed from: a */
    public static boolean m3248a(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: b */
    public static Object m3249b(Object obj) {
        return ((MediaController) obj).getTransportControls();
    }

    /* renamed from: b */
    public static void m3250b(Object obj, int i, int i2) {
        ((MediaController) obj).adjustVolume(i, i2);
    }

    /* renamed from: c */
    public static Object m3251c(Object obj) {
        return ((MediaController) obj).getPlaybackState();
    }

    /* renamed from: d */
    public static Object m3252d(Object obj) {
        return ((MediaController) obj).getMetadata();
    }

    /* renamed from: e */
    public static List<Object> m3253e(Object obj) {
        List<MediaSession.QueueItem> queue = ((MediaController) obj).getQueue();
        if (queue == null) {
            return null;
        }
        return new ArrayList(queue);
    }

    /* renamed from: f */
    public static CharSequence m3254f(Object obj) {
        return ((MediaController) obj).getQueueTitle();
    }

    /* renamed from: g */
    public static Bundle m3255g(Object obj) {
        return ((MediaController) obj).getExtras();
    }

    /* renamed from: h */
    public static int m3256h(Object obj) {
        return ((MediaController) obj).getRatingType();
    }

    /* renamed from: i */
    public static long m3257i(Object obj) {
        return ((MediaController) obj).getFlags();
    }

    /* renamed from: j */
    public static Object m3258j(Object obj) {
        return ((MediaController) obj).getPlaybackInfo();
    }

    /* renamed from: k */
    public static PendingIntent m3259k(Object obj) {
        return ((MediaController) obj).getSessionActivity();
    }

    /* renamed from: l */
    public static String m3260l(Object obj) {
        return ((MediaController) obj).getPackageName();
    }
}
