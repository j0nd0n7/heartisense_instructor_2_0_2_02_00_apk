package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.annotation.C0007ae;
import android.view.View;
import java.util.List;
import java.util.Map;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.c.e */
class C0376e {

    /* renamed from: android.support.v4.c.e$a */
    public static abstract class C0377a {
        /* renamed from: a */
        public abstract Parcelable mo1640a(View view, Matrix matrix, RectF rectF);

        /* renamed from: a */
        public abstract View mo1641a(Context context, Parcelable parcelable);

        /* renamed from: a */
        public abstract void mo1642a(List<View> list);

        /* renamed from: a */
        public abstract void mo1643a(List<String> list, List<View> list2, List<View> list3);

        /* renamed from: a */
        public abstract void mo1644a(List<String> list, Map<String, View> map);

        /* renamed from: b */
        public abstract void mo1645b(List<String> list, List<View> list2, List<View> list3);
    }

    /* renamed from: android.support.v4.c.e$b */
    private static class C0378b extends SharedElementCallback {

        /* renamed from: a */
        private C0377a f1865a;

        public C0378b(C0377a aVar) {
            this.f1865a = aVar;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f1865a.mo1640a(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f1865a.mo1641a(context, parcelable);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f1865a.mo1644a(list, map);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f1865a.mo1642a(list);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f1865a.mo1645b(list, list2, list3);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f1865a.mo1643a(list, list2, list3);
        }
    }

    C0376e() {
    }

    /* renamed from: a */
    private static SharedElementCallback m2139a(C0377a aVar) {
        if (aVar != null) {
            return new C0378b(aVar);
        }
        return null;
    }

    /* renamed from: a */
    public static void m2140a(Activity activity) {
        activity.finishAfterTransition();
    }

    /* renamed from: a */
    public static void m2141a(Activity activity, C0377a aVar) {
        activity.setEnterSharedElementCallback(m2139a(aVar));
    }

    /* renamed from: b */
    public static void m2142b(Activity activity) {
        activity.postponeEnterTransition();
    }

    /* renamed from: b */
    public static void m2143b(Activity activity, C0377a aVar) {
        activity.setExitSharedElementCallback(m2139a(aVar));
    }

    /* renamed from: c */
    public static void m2144c(Activity activity) {
        activity.startPostponedEnterTransition();
    }
}
