package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.util.Pair;
import android.view.View;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.c.n */
class C0396n {

    /* renamed from: a */
    private final ActivityOptions f1876a;

    private C0396n(ActivityOptions activityOptions) {
        this.f1876a = activityOptions;
    }

    /* renamed from: a */
    public static C0396n m2201a() {
        return new C0396n(ActivityOptions.makeTaskLaunchBehind());
    }

    /* renamed from: a */
    public static C0396n m2202a(Activity activity, View view, String str) {
        return new C0396n(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    /* renamed from: a */
    public static C0396n m2203a(Activity activity, View[] viewArr, String[] strArr) {
        Pair[] pairArr = null;
        if (viewArr != null) {
            Pair[] pairArr2 = new Pair[viewArr.length];
            for (int i = 0; i < pairArr2.length; i++) {
                pairArr2[i] = Pair.create(viewArr[i], strArr[i]);
            }
            pairArr = pairArr2;
        }
        return new C0396n(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    /* renamed from: a */
    public static C0396n m2204a(Context context, int i, int i2) {
        return new C0396n(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    /* renamed from: a */
    public static C0396n m2205a(View view, int i, int i2, int i3, int i4) {
        return new C0396n(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    /* renamed from: a */
    public static C0396n m2206a(View view, Bitmap bitmap, int i, int i2) {
        return new C0396n(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    /* renamed from: b */
    public static C0396n m2207b() {
        return new C0396n(ActivityOptions.makeBasic());
    }

    /* renamed from: b */
    public static C0396n m2208b(View view, int i, int i2, int i3, int i4) {
        return new C0396n(ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4));
    }

    /* renamed from: a */
    public void mo1668a(PendingIntent pendingIntent) {
        this.f1876a.requestUsageTimeReport(pendingIntent);
    }

    /* renamed from: a */
    public void mo1669a(C0396n nVar) {
        this.f1876a.update(nVar.f1876a);
    }

    /* renamed from: c */
    public Bundle mo1670c() {
        return this.f1876a.toBundle();
    }
}
