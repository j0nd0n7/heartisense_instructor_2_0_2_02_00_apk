package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.util.Pair;
import android.view.View;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.c.m */
class C0395m {

    /* renamed from: a */
    private final ActivityOptions f1875a;

    private C0395m(ActivityOptions activityOptions) {
        this.f1875a = activityOptions;
    }

    /* renamed from: a */
    public static C0395m m2193a() {
        return new C0395m(ActivityOptions.makeTaskLaunchBehind());
    }

    /* renamed from: a */
    public static C0395m m2194a(Activity activity, View view, String str) {
        return new C0395m(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    /* renamed from: a */
    public static C0395m m2195a(Activity activity, View[] viewArr, String[] strArr) {
        Pair[] pairArr = null;
        if (viewArr != null) {
            Pair[] pairArr2 = new Pair[viewArr.length];
            for (int i = 0; i < pairArr2.length; i++) {
                pairArr2[i] = Pair.create(viewArr[i], strArr[i]);
            }
            pairArr = pairArr2;
        }
        return new C0395m(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    /* renamed from: a */
    public static C0395m m2196a(Context context, int i, int i2) {
        return new C0395m(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    /* renamed from: a */
    public static C0395m m2197a(View view, int i, int i2, int i3, int i4) {
        return new C0395m(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    /* renamed from: a */
    public static C0395m m2198a(View view, Bitmap bitmap, int i, int i2) {
        return new C0395m(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    /* renamed from: a */
    public void mo1666a(C0395m mVar) {
        this.f1875a.update(mVar.f1875a);
    }

    /* renamed from: b */
    public Bundle mo1667b() {
        return this.f1875a.toBundle();
    }
}
