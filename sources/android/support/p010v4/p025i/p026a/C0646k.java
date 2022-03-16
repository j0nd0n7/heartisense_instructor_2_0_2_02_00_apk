package android.support.p010v4.p025i.p026a;

import android.annotation.TargetApi;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.p010v4.p025i.p026a.C0643j;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.i.a.k */
class C0646k {

    /* renamed from: a */
    private static final long f2490a = 128;

    /* renamed from: b */
    private static final String f2491b = "android.media.metadata.USER_RATING";

    /* renamed from: c */
    private static final String f2492c = "android.media.metadata.RATING";

    /* renamed from: d */
    private static final String f2493d = "android.media.metadata.YEAR";

    /* renamed from: android.support.v4.i.a.k$a */
    interface C0647a extends C0643j.C0644a {
        /* renamed from: a */
        void mo2268a(Object obj);
    }

    /* renamed from: android.support.v4.i.a.k$b */
    static class C0648b<T extends C0647a> implements RemoteControlClient.OnMetadataUpdateListener {

        /* renamed from: a */
        protected final T f2494a;

        public C0648b(T t) {
            this.f2494a = t;
        }

        public void onMetadataUpdate(int i, Object obj) {
            if (i == 268435457 && (obj instanceof Rating)) {
                this.f2494a.mo2268a(obj);
            }
        }
    }

    C0646k() {
    }

    /* renamed from: a */
    static int m3586a(long j) {
        int a = C0643j.m3578a(j);
        return (128 & j) != 0 ? a | 512 : a;
    }

    /* renamed from: a */
    public static Object m3587a(C0647a aVar) {
        return new C0648b(aVar);
    }

    /* renamed from: a */
    static void m3588a(Bundle bundle, RemoteControlClient.MetadataEditor metadataEditor) {
        if (bundle != null) {
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                metadataEditor.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                metadataEditor.putObject(101, bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                metadataEditor.putObject(268435457, bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
        }
    }

    /* renamed from: a */
    public static void m3589a(Object obj, long j) {
        ((RemoteControlClient) obj).setTransportControlFlags(m3586a(j));
    }

    /* renamed from: a */
    public static void m3590a(Object obj, Bundle bundle, long j) {
        RemoteControlClient.MetadataEditor editMetadata = ((RemoteControlClient) obj).editMetadata(true);
        C0642i.m3573a(bundle, editMetadata);
        m3588a(bundle, editMetadata);
        if ((128 & j) != 0) {
            editMetadata.addEditableKey(268435457);
        }
        editMetadata.apply();
    }

    /* renamed from: a */
    public static void m3591a(Object obj, Object obj2) {
        ((RemoteControlClient) obj).setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) obj2);
    }
}
