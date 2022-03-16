package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.media.Rating;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.i.r */
class C0753r {
    C0753r() {
    }

    /* renamed from: a */
    public static Object m3916a(float f) {
        return Rating.newPercentageRating(f);
    }

    /* renamed from: a */
    public static Object m3917a(int i) {
        return Rating.newUnratedRating(i);
    }

    /* renamed from: a */
    public static Object m3918a(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    /* renamed from: a */
    public static Object m3919a(boolean z) {
        return Rating.newHeartRating(z);
    }

    /* renamed from: a */
    public static boolean m3920a(Object obj) {
        return ((Rating) obj).isRated();
    }

    /* renamed from: b */
    public static int m3921b(Object obj) {
        return ((Rating) obj).getRatingStyle();
    }

    /* renamed from: b */
    public static Object m3922b(boolean z) {
        return Rating.newThumbRating(z);
    }

    /* renamed from: c */
    public static boolean m3923c(Object obj) {
        return ((Rating) obj).hasHeart();
    }

    /* renamed from: d */
    public static boolean m3924d(Object obj) {
        return ((Rating) obj).isThumbUp();
    }

    /* renamed from: e */
    public static float m3925e(Object obj) {
        return ((Rating) obj).getStarRating();
    }

    /* renamed from: f */
    public static float m3926f(Object obj) {
        return ((Rating) obj).getPercentRating();
    }
}
