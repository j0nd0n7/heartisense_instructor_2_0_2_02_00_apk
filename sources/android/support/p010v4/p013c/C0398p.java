package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.view.View;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.c.p */
class C0398p {

    /* renamed from: a */
    private final ActivityOptions f1878a;

    private C0398p(ActivityOptions activityOptions) {
        this.f1878a = activityOptions;
    }

    /* renamed from: a */
    public static C0398p m2225a(Context context, int i, int i2) {
        return new C0398p(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    /* renamed from: a */
    public static C0398p m2226a(View view, int i, int i2, int i3, int i4) {
        return new C0398p(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    /* renamed from: a */
    public static C0398p m2227a(View view, Bitmap bitmap, int i, int i2) {
        return new C0398p(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    /* renamed from: a */
    public Bundle mo1676a() {
        return this.f1878a.toBundle();
    }

    /* renamed from: a */
    public void mo1677a(C0398p pVar) {
        this.f1878a.update(pVar.f1878a);
    }
}
