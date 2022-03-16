package android.support.p010v4.p025i.p026a;

import android.annotation.TargetApi;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import java.util.Iterator;
import java.util.List;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.i.a.r */
class C0673r {

    /* renamed from: android.support.v4.i.a.r$a */
    static final class C0674a {
        C0674a() {
        }

        /* renamed from: a */
        public static Object m3687a(String str, CharSequence charSequence, int i, Bundle bundle) {
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(str, charSequence, i);
            builder.setExtras(bundle);
            return builder.build();
        }

        /* renamed from: a */
        public static String m3688a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static CharSequence m3689b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        /* renamed from: c */
        public static int m3690c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static Bundle m3691d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }
    }

    C0673r() {
    }

    /* renamed from: a */
    public static int m3677a(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    /* renamed from: a */
    public static Object m3678a(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i, j, f, j4);
        builder.setBufferedPosition(j2);
        builder.setActions(j3);
        builder.setErrorMessage(charSequence);
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j5);
        return builder.build();
    }

    /* renamed from: b */
    public static long m3679b(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: c */
    public static long m3680c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static float m3681d(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: e */
    public static long m3682e(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: f */
    public static CharSequence m3683f(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: g */
    public static long m3684g(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: h */
    public static List<Object> m3685h(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: i */
    public static long m3686i(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }
}
