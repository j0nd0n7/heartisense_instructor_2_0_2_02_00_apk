package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.media.VolumeProvider;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.i.z */
class C0772z {

    /* renamed from: android.support.v4.i.z$a */
    public interface C0774a {
        /* renamed from: a */
        void mo2635a(int i);

        /* renamed from: b */
        void mo2636b(int i);
    }

    C0772z() {
    }

    /* renamed from: a */
    public static Object m4003a(int i, int i2, int i3, final C0774a aVar) {
        return new VolumeProvider(i, i2, i3) {
            public void onAdjustVolume(int i) {
                aVar.mo2636b(i);
            }

            public void onSetVolumeTo(int i) {
                aVar.mo2635a(i);
            }
        };
    }

    /* renamed from: a */
    public static void m4004a(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}
