package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.i.l */
class C0735l {

    /* renamed from: android.support.v4.i.l$a */
    static class C0736a {
        C0736a() {
        }

        /* renamed from: a */
        public static Object m3854a() {
            return new MediaDescription.Builder();
        }

        /* renamed from: a */
        public static Object m3855a(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        /* renamed from: a */
        public static void m3856a(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m3857a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m3858a(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static void m3859a(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }

        /* renamed from: a */
        public static void m3860a(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* renamed from: b */
        public static void m3861b(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m3862c(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }
    }

    C0735l() {
    }

    /* renamed from: a */
    public static Object m3845a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static String m3846a(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: a */
    public static void m3847a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: b */
    public static CharSequence m3848b(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: c */
    public static CharSequence m3849c(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: d */
    public static CharSequence m3850d(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: e */
    public static Bitmap m3851e(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m3852f(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: g */
    public static Bundle m3853g(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }
}
