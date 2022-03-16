package android.support.p010v4.p025i.p026a;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.annotation.C0007ae;
import android.support.p010v4.p025i.p026a.C0646k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.i.a.l */
class C0649l {

    /* renamed from: android.support.v4.i.a.l$a */
    interface C0650a extends C0646k.C0647a {
        /* renamed from: a */
        void mo2266a();

        /* renamed from: a */
        void mo2267a(long j);

        /* renamed from: a */
        void mo2269a(String str, Bundle bundle);

        /* renamed from: a */
        void mo2270a(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: a */
        boolean mo2271a(Intent intent);

        /* renamed from: b */
        void mo2272b();

        /* renamed from: b */
        void mo2274b(String str, Bundle bundle);

        /* renamed from: c */
        void mo2275c();

        /* renamed from: c */
        void mo2276c(String str, Bundle bundle);

        /* renamed from: d */
        void mo2277d();

        /* renamed from: e */
        void mo2278e();

        /* renamed from: f */
        void mo2279f();

        /* renamed from: g */
        void mo2280g();
    }

    /* renamed from: android.support.v4.i.a.l$b */
    static class C0651b<T extends C0650a> extends MediaSession.Callback {

        /* renamed from: a */
        protected final T f2495a;

        public C0651b(T t) {
            this.f2495a = t;
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f2495a.mo2270a(str, bundle, resultReceiver);
        }

        public void onCustomAction(String str, Bundle bundle) {
            this.f2495a.mo2276c(str, bundle);
        }

        public void onFastForward() {
            this.f2495a.mo2278e();
        }

        public boolean onMediaButtonEvent(Intent intent) {
            return this.f2495a.mo2271a(intent) || super.onMediaButtonEvent(intent);
        }

        public void onPause() {
            this.f2495a.mo2272b();
        }

        public void onPlay() {
            this.f2495a.mo2266a();
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            this.f2495a.mo2269a(str, bundle);
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
            this.f2495a.mo2274b(str, bundle);
        }

        public void onRewind() {
            this.f2495a.mo2279f();
        }

        public void onSeekTo(long j) {
            this.f2495a.mo2273b(j);
        }

        public void onSetRating(Rating rating) {
            this.f2495a.mo2268a(rating);
        }

        public void onSkipToNext() {
            this.f2495a.mo2275c();
        }

        public void onSkipToPrevious() {
            this.f2495a.mo2277d();
        }

        public void onSkipToQueueItem(long j) {
            this.f2495a.mo2267a(j);
        }

        public void onStop() {
            this.f2495a.mo2280g();
        }
    }

    /* renamed from: android.support.v4.i.a.l$c */
    static class C0652c {
        C0652c() {
        }

        /* renamed from: a */
        public static Object m3626a(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        /* renamed from: a */
        public static Object m3627a(Object obj, long j) {
            return new MediaSession.QueueItem((MediaDescription) obj, j);
        }

        /* renamed from: b */
        public static long m3628b(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }

    C0649l() {
    }

    /* renamed from: a */
    public static Object m3593a(Context context, String str) {
        return new MediaSession(context, str);
    }

    /* renamed from: a */
    public static Object m3594a(C0650a aVar) {
        return new C0651b(aVar);
    }

    /* renamed from: a */
    public static Object m3595a(Object obj) {
        if (obj instanceof MediaSession) {
            return obj;
        }
        throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
    }

    /* renamed from: a */
    public static void m3596a(Object obj, int i) {
        ((MediaSession) obj).setFlags(i);
    }

    /* renamed from: a */
    public static void m3597a(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setSessionActivity(pendingIntent);
    }

    /* renamed from: a */
    public static void m3598a(Object obj, Bundle bundle) {
        ((MediaSession) obj).setExtras(bundle);
    }

    /* renamed from: a */
    public static void m3599a(Object obj, CharSequence charSequence) {
        ((MediaSession) obj).setQueueTitle(charSequence);
    }

    /* renamed from: a */
    public static void m3600a(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackToRemote((VolumeProvider) obj2);
    }

    /* renamed from: a */
    public static void m3601a(Object obj, Object obj2, Handler handler) {
        ((MediaSession) obj).setCallback((MediaSession.Callback) obj2, handler);
    }

    /* renamed from: a */
    public static void m3602a(Object obj, String str, Bundle bundle) {
        ((MediaSession) obj).sendSessionEvent(str, bundle);
    }

    /* renamed from: a */
    public static void m3603a(Object obj, List<Object> list) {
        if (list == null) {
            ((MediaSession) obj).setQueue((List) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MediaSession.QueueItem) it.next());
        }
        ((MediaSession) obj).setQueue(arrayList);
    }

    /* renamed from: a */
    public static void m3604a(Object obj, boolean z) {
        ((MediaSession) obj).setActive(z);
    }

    /* renamed from: b */
    public static Object m3605b(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    /* renamed from: b */
    public static void m3606b(Object obj, int i) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        ((MediaSession) obj).setPlaybackToLocal(builder.build());
    }

    /* renamed from: b */
    public static void m3607b(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
    }

    /* renamed from: b */
    public static void m3608b(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackState((PlaybackState) obj2);
    }

    /* renamed from: c */
    public static void m3609c(Object obj, Object obj2) {
        ((MediaSession) obj).setMetadata((MediaMetadata) obj2);
    }

    /* renamed from: c */
    public static boolean m3610c(Object obj) {
        return ((MediaSession) obj).isActive();
    }

    /* renamed from: d */
    public static void m3611d(Object obj) {
        ((MediaSession) obj).release();
    }

    /* renamed from: e */
    public static Parcelable m3612e(Object obj) {
        return ((MediaSession) obj).getSessionToken();
    }
}
