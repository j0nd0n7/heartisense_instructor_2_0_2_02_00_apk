package android.support.p010v4.p025i.p026a;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.p010v4.p025i.p026a.C0649l;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.i.a.n */
class C0654n {

    /* renamed from: android.support.v4.i.a.n$a */
    public interface C0655a extends C0649l.C0650a {
        /* renamed from: a */
        void mo2281a(Uri uri, Bundle bundle);
    }

    /* renamed from: android.support.v4.i.a.n$b */
    static class C0656b<T extends C0655a> extends C0649l.C0651b<T> {
        public C0656b(T t) {
            super(t);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            ((C0655a) this.f2495a).mo2281a(uri, bundle);
        }
    }

    C0654n() {
    }

    /* renamed from: a */
    public static Object m3630a(C0655a aVar) {
        return new C0656b(aVar);
    }
}
