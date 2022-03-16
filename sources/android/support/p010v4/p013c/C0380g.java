package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.annotation.C0007ae;
import android.support.p010v4.p013c.C0376e;
import android.view.View;
import java.util.List;
import java.util.Map;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.c.g */
class C0380g {

    /* renamed from: android.support.v4.c.g$a */
    public interface C0381a {
        /* renamed from: a */
        void mo1653a();
    }

    /* renamed from: android.support.v4.c.g$b */
    public interface C0382b {
        /* renamed from: a */
        void mo938a(int i);
    }

    /* renamed from: android.support.v4.c.g$c */
    public static abstract class C0383c extends C0376e.C0377a {
        /* renamed from: a */
        public abstract void mo1646a(List<String> list, List<View> list2, C0381a aVar);
    }

    /* renamed from: android.support.v4.c.g$d */
    private static class C0384d extends SharedElementCallback {

        /* renamed from: a */
        private C0383c f1866a;

        public C0384d(C0383c cVar) {
            this.f1866a = cVar;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f1866a.mo1640a(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f1866a.mo1641a(context, parcelable);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f1866a.mo1644a(list, map);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f1866a.mo1642a(list);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f1866a.mo1645b(list, list2, list3);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f1866a.mo1643a(list, list2, list3);
        }

        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f1866a.mo1646a(list, list2, new C0381a() {
                /* renamed from: a */
                public void mo1653a() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            });
        }
    }

    C0380g() {
    }

    /* renamed from: a */
    private static SharedElementCallback m2152a(C0383c cVar) {
        if (cVar != null) {
            return new C0384d(cVar);
        }
        return null;
    }

    /* renamed from: a */
    public static void m2153a(Activity activity, C0383c cVar) {
        activity.setEnterSharedElementCallback(m2152a(cVar));
    }

    /* renamed from: a */
    public static void m2154a(Activity activity, String[] strArr, int i) {
        if (activity instanceof C0382b) {
            ((C0382b) activity).mo938a(i);
        }
        activity.requestPermissions(strArr, i);
    }

    /* renamed from: a */
    public static boolean m2155a(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: b */
    public static void m2156b(Activity activity, C0383c cVar) {
        activity.setExitSharedElementCallback(m2152a(cVar));
    }
}
