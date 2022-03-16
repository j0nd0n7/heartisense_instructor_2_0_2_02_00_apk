package android.support.p010v4.p025i.p026a;

import android.annotation.TargetApi;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import java.util.Iterator;
import java.util.List;

@C0007ae(mo1a = 22)
@TargetApi(22)
/* renamed from: android.support.v4.i.a.s */
class C0675s {
    C0675s() {
    }

    /* renamed from: a */
    public static Bundle m3692a(Object obj) {
        return ((PlaybackState) obj).getExtras();
    }

    /* renamed from: a */
    public static Object m3693a(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5, Bundle bundle) {
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
        builder.setExtras(bundle);
        return builder.build();
    }
}
