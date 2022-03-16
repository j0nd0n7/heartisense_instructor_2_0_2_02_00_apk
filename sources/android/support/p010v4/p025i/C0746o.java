package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Parcel;
import android.support.annotation.C0007ae;
import java.util.Set;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.i.o */
class C0746o {

    /* renamed from: android.support.v4.i.o$a */
    public static class C0747a {
        /* renamed from: a */
        public static Object m3893a() {
            return new MediaMetadata.Builder();
        }

        /* renamed from: a */
        public static Object m3894a(Object obj) {
            return ((MediaMetadata.Builder) obj).build();
        }

        /* renamed from: a */
        public static void m3895a(Object obj, String str, long j) {
            ((MediaMetadata.Builder) obj).putLong(str, j);
        }

        /* renamed from: a */
        public static void m3896a(Object obj, String str, Bitmap bitmap) {
            ((MediaMetadata.Builder) obj).putBitmap(str, bitmap);
        }

        /* renamed from: a */
        public static void m3897a(Object obj, String str, CharSequence charSequence) {
            ((MediaMetadata.Builder) obj).putText(str, charSequence);
        }

        /* renamed from: a */
        public static void m3898a(Object obj, String str, Object obj2) {
            ((MediaMetadata.Builder) obj).putRating(str, (Rating) obj2);
        }

        /* renamed from: a */
        public static void m3899a(Object obj, String str, String str2) {
            ((MediaMetadata.Builder) obj).putString(str, str2);
        }
    }

    C0746o() {
    }

    /* renamed from: a */
    public static Bitmap m3886a(Object obj, String str) {
        return ((MediaMetadata) obj).getBitmap(str);
    }

    /* renamed from: a */
    public static Object m3887a(Parcel parcel) {
        return MediaMetadata.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static Set<String> m3888a(Object obj) {
        return ((MediaMetadata) obj).keySet();
    }

    /* renamed from: a */
    public static void m3889a(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }

    /* renamed from: b */
    public static long m3890b(Object obj, String str) {
        return ((MediaMetadata) obj).getLong(str);
    }

    /* renamed from: c */
    public static Object m3891c(Object obj, String str) {
        return ((MediaMetadata) obj).getRating(str);
    }

    /* renamed from: d */
    public static CharSequence m3892d(Object obj, String str) {
        return ((MediaMetadata) obj).getText(str);
    }
}
