package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.util.Pair;
import android.view.View;

@C0007ae(mo1a = 24)
@TargetApi(24)
/* renamed from: android.support.v4.c.o */
class C0397o {

    /* renamed from: a */
    private final ActivityOptions f1877a;

    private C0397o(ActivityOptions activityOptions) {
        this.f1877a = activityOptions;
    }

    /* renamed from: a */
    public static C0397o m2212a() {
        return new C0397o(ActivityOptions.makeTaskLaunchBehind());
    }

    /* renamed from: a */
    public static C0397o m2213a(Activity activity, View view, String str) {
        return new C0397o(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    /* renamed from: a */
    public static C0397o m2214a(Activity activity, View[] viewArr, String[] strArr) {
        Pair[] pairArr = null;
        if (viewArr != null) {
            Pair[] pairArr2 = new Pair[viewArr.length];
            for (int i = 0; i < pairArr2.length; i++) {
                pairArr2[i] = Pair.create(viewArr[i], strArr[i]);
            }
            pairArr = pairArr2;
        }
        return new C0397o(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    /* renamed from: a */
    public static C0397o m2215a(Context context, int i, int i2) {
        return new C0397o(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    /* renamed from: a */
    public static C0397o m2216a(View view, int i, int i2, int i3, int i4) {
        return new C0397o(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    /* renamed from: a */
    public static C0397o m2217a(View view, Bitmap bitmap, int i, int i2) {
        return new C0397o(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    /* renamed from: b */
    public static C0397o m2218b() {
        return new C0397o(ActivityOptions.makeBasic());
    }

    /* renamed from: b */
    public static C0397o m2219b(View view, int i, int i2, int i3, int i4) {
        return new C0397o(ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4));
    }

    /* renamed from: a */
    public C0397o mo1671a(@C0003aa Rect rect) {
        return new C0397o(this.f1877a.setLaunchBounds(rect));
    }

    /* renamed from: a */
    public void mo1672a(PendingIntent pendingIntent) {
        this.f1877a.requestUsageTimeReport(pendingIntent);
    }

    /* renamed from: a */
    public void mo1673a(C0397o oVar) {
        this.f1877a.update(oVar.f1877a);
    }

    /* renamed from: c */
    public Rect mo1674c() {
        return this.f1877a.getLaunchBounds();
    }

    /* renamed from: d */
    public Bundle mo1675d() {
        return this.f1877a.toBundle();
    }
}
