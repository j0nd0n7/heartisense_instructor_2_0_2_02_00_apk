package android.support.p010v4.p025i;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0011ag;
import android.support.p010v4.p025i.C0732k;
import android.support.p010v4.p033o.C0876a;
import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* renamed from: android.support.v4.i.n */
public final class C0739n implements Parcelable {

    /* renamed from: A */
    public static final String f2746A = "android.media.metadata.MEDIA_ID";

    /* renamed from: B */
    public static final String f2747B = "android.media.metadata.MEDIA_URI";

    /* renamed from: C */
    public static final String f2748C = "android.media.metadata.BT_FOLDER_TYPE";
    public static final Parcelable.Creator<C0739n> CREATOR = new Parcelable.Creator<C0739n>() {
        /* renamed from: a */
        public C0739n createFromParcel(Parcel parcel) {
            return new C0739n(parcel);
        }

        /* renamed from: a */
        public C0739n[] newArray(int i) {
            return new C0739n[i];
        }
    };

    /* renamed from: D */
    public static final String f2749D = "android.media.metadata.ADVERTISEMENT";

    /* renamed from: E */
    static final int f2750E = 0;

    /* renamed from: F */
    static final int f2751F = 1;

    /* renamed from: G */
    static final int f2752G = 2;

    /* renamed from: H */
    static final int f2753H = 3;

    /* renamed from: I */
    static final C0876a<String, Integer> f2754I = new C0876a<>();

    /* renamed from: K */
    private static final String f2755K = "MediaMetadata";

    /* renamed from: L */
    private static final String[] f2756L = {f2759a, f2760b, f2762d, f2773o, f2764f, f2763e, f2765g};

    /* renamed from: M */
    private static final String[] f2757M = {f2783y, f2774p, f2776r};

    /* renamed from: N */
    private static final String[] f2758N = {f2784z, f2775q, f2777s};

    /* renamed from: a */
    public static final String f2759a = "android.media.metadata.TITLE";

    /* renamed from: b */
    public static final String f2760b = "android.media.metadata.ARTIST";

    /* renamed from: c */
    public static final String f2761c = "android.media.metadata.DURATION";

    /* renamed from: d */
    public static final String f2762d = "android.media.metadata.ALBUM";

    /* renamed from: e */
    public static final String f2763e = "android.media.metadata.AUTHOR";

    /* renamed from: f */
    public static final String f2764f = "android.media.metadata.WRITER";

    /* renamed from: g */
    public static final String f2765g = "android.media.metadata.COMPOSER";

    /* renamed from: h */
    public static final String f2766h = "android.media.metadata.COMPILATION";

    /* renamed from: i */
    public static final String f2767i = "android.media.metadata.DATE";

    /* renamed from: j */
    public static final String f2768j = "android.media.metadata.YEAR";

    /* renamed from: k */
    public static final String f2769k = "android.media.metadata.GENRE";

    /* renamed from: l */
    public static final String f2770l = "android.media.metadata.TRACK_NUMBER";

    /* renamed from: m */
    public static final String f2771m = "android.media.metadata.NUM_TRACKS";

    /* renamed from: n */
    public static final String f2772n = "android.media.metadata.DISC_NUMBER";

    /* renamed from: o */
    public static final String f2773o = "android.media.metadata.ALBUM_ARTIST";

    /* renamed from: p */
    public static final String f2774p = "android.media.metadata.ART";

    /* renamed from: q */
    public static final String f2775q = "android.media.metadata.ART_URI";

    /* renamed from: r */
    public static final String f2776r = "android.media.metadata.ALBUM_ART";

    /* renamed from: s */
    public static final String f2777s = "android.media.metadata.ALBUM_ART_URI";

    /* renamed from: t */
    public static final String f2778t = "android.media.metadata.USER_RATING";

    /* renamed from: u */
    public static final String f2779u = "android.media.metadata.RATING";

    /* renamed from: v */
    public static final String f2780v = "android.media.metadata.DISPLAY_TITLE";

    /* renamed from: w */
    public static final String f2781w = "android.media.metadata.DISPLAY_SUBTITLE";

    /* renamed from: x */
    public static final String f2782x = "android.media.metadata.DISPLAY_DESCRIPTION";

    /* renamed from: y */
    public static final String f2783y = "android.media.metadata.DISPLAY_ICON";

    /* renamed from: z */
    public static final String f2784z = "android.media.metadata.DISPLAY_ICON_URI";

    /* renamed from: J */
    final Bundle f2785J;

    /* renamed from: O */
    private Object f2786O;

    /* renamed from: P */
    private C0732k f2787P;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.n$a */
    public @interface C0741a {
    }

    /* renamed from: android.support.v4.i.n$b */
    public static final class C0742b {

        /* renamed from: a */
        private final Bundle f2788a;

        public C0742b() {
            this.f2788a = new Bundle();
        }

        public C0742b(C0739n nVar) {
            this.f2788a = new Bundle(nVar.f2785J);
        }

        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        public C0742b(C0739n nVar, int i) {
            this(nVar);
            for (String str : this.f2788a.keySet()) {
                Object obj = this.f2788a.get(str);
                if (obj != null && (obj instanceof Bitmap)) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        mo2552a(str, m3879a(bitmap, i));
                    } else if (Build.VERSION.SDK_INT >= 14 && (str.equals(C0739n.f2774p) || str.equals(C0739n.f2776r))) {
                        mo2552a(str, bitmap.copy(bitmap.getConfig(), false));
                    }
                }
            }
        }

        /* renamed from: a */
        private Bitmap m3879a(Bitmap bitmap, int i) {
            float f = (float) i;
            float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (min * ((float) bitmap.getWidth())), (int) (((float) bitmap.getHeight()) * min), true);
        }

        /* renamed from: a */
        public C0742b mo2551a(String str, long j) {
            if (!C0739n.f2754I.containsKey(str) || C0739n.f2754I.get(str).intValue() == 0) {
                this.f2788a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        /* renamed from: a */
        public C0742b mo2552a(String str, Bitmap bitmap) {
            if (!C0739n.f2754I.containsKey(str) || C0739n.f2754I.get(str).intValue() == 2) {
                this.f2788a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        /* renamed from: a */
        public C0742b mo2553a(String str, C0749q qVar) {
            if (!C0739n.f2754I.containsKey(str) || C0739n.f2754I.get(str).intValue() == 3) {
                if (Build.VERSION.SDK_INT >= 19) {
                    this.f2788a.putParcelable(str, (Parcelable) qVar.mo2564g());
                } else {
                    this.f2788a.putParcelable(str, qVar);
                }
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        /* renamed from: a */
        public C0742b mo2554a(String str, CharSequence charSequence) {
            if (!C0739n.f2754I.containsKey(str) || C0739n.f2754I.get(str).intValue() == 1) {
                this.f2788a.putCharSequence(str, charSequence);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
        }

        /* renamed from: a */
        public C0742b mo2555a(String str, String str2) {
            if (!C0739n.f2754I.containsKey(str) || C0739n.f2754I.get(str).intValue() == 1) {
                this.f2788a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        /* renamed from: a */
        public C0739n mo2556a() {
            return new C0739n(this.f2788a);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.n$c */
    public @interface C0743c {
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.n$d */
    public @interface C0744d {
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.n$e */
    public @interface C0745e {
    }

    static {
        f2754I.put(f2759a, 1);
        f2754I.put(f2760b, 1);
        f2754I.put(f2761c, 0);
        f2754I.put(f2762d, 1);
        f2754I.put(f2763e, 1);
        f2754I.put(f2764f, 1);
        f2754I.put(f2765g, 1);
        f2754I.put(f2766h, 1);
        f2754I.put(f2767i, 1);
        f2754I.put(f2768j, 0);
        f2754I.put(f2769k, 1);
        f2754I.put(f2770l, 0);
        f2754I.put(f2771m, 0);
        f2754I.put(f2772n, 0);
        f2754I.put(f2773o, 1);
        f2754I.put(f2774p, 2);
        f2754I.put(f2775q, 1);
        f2754I.put(f2776r, 2);
        f2754I.put(f2777s, 1);
        f2754I.put(f2778t, 3);
        f2754I.put(f2779u, 3);
        f2754I.put(f2780v, 1);
        f2754I.put(f2781w, 1);
        f2754I.put(f2782x, 1);
        f2754I.put(f2783y, 2);
        f2754I.put(f2784z, 1);
        f2754I.put(f2746A, 1);
        f2754I.put(f2748C, 0);
        f2754I.put(f2747B, 1);
        f2754I.put(f2749D, 0);
    }

    C0739n(Bundle bundle) {
        this.f2785J = new Bundle(bundle);
    }

    C0739n(Parcel parcel) {
        this.f2785J = parcel.readBundle();
    }

    /* renamed from: a */
    public static C0739n m3865a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0746o.m3889a(obj, obtain, 0);
        obtain.setDataPosition(0);
        C0739n createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f2786O = obj;
        return createFromParcel;
    }

    /* renamed from: a */
    public C0732k mo2534a() {
        int i;
        Bitmap bitmap;
        Uri uri;
        Uri uri2 = null;
        if (this.f2787P != null) {
            return this.f2787P;
        }
        String c = mo2538c(f2746A);
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence b = mo2537b(f2780v);
        if (!TextUtils.isEmpty(b)) {
            charSequenceArr[0] = b;
            charSequenceArr[1] = mo2537b(f2781w);
            charSequenceArr[2] = mo2537b(f2782x);
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i3 < charSequenceArr.length && i2 < f2756L.length) {
                int i4 = i2 + 1;
                CharSequence b2 = mo2537b(f2756L[i2]);
                if (!TextUtils.isEmpty(b2)) {
                    i = i3 + 1;
                    charSequenceArr[i3] = b2;
                } else {
                    i = i3;
                }
                i3 = i;
                i2 = i4;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= f2757M.length) {
                bitmap = null;
                break;
            }
            Bitmap f = mo2545f(f2757M[i5]);
            if (f != null) {
                bitmap = f;
                break;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            if (i6 >= f2758N.length) {
                uri = null;
                break;
            }
            String c2 = mo2538c(f2758N[i6]);
            if (!TextUtils.isEmpty(c2)) {
                uri = Uri.parse(c2);
                break;
            }
            i6++;
        }
        String c3 = mo2538c(f2747B);
        if (!TextUtils.isEmpty(c3)) {
            uri2 = Uri.parse(c3);
        }
        C0732k.C0734a aVar = new C0732k.C0734a();
        aVar.mo2529a(c);
        aVar.mo2528a(charSequenceArr[0]);
        aVar.mo2532b(charSequenceArr[1]);
        aVar.mo2533c(charSequenceArr[2]);
        aVar.mo2525a(bitmap);
        aVar.mo2526a(uri);
        aVar.mo2531b(uri2);
        if (this.f2785J.containsKey(f2748C)) {
            Bundle bundle = new Bundle();
            bundle.putLong(C0732k.f2719a, mo2540d(f2748C));
            aVar.mo2527a(bundle);
        }
        this.f2787P = aVar.mo2530a();
        return this.f2787P;
    }

    /* renamed from: a */
    public boolean mo2535a(String str) {
        return this.f2785J.containsKey(str);
    }

    /* renamed from: b */
    public int mo2536b() {
        return this.f2785J.size();
    }

    /* renamed from: b */
    public CharSequence mo2537b(String str) {
        return this.f2785J.getCharSequence(str);
    }

    /* renamed from: c */
    public String mo2538c(String str) {
        CharSequence charSequence = this.f2785J.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: c */
    public Set<String> mo2539c() {
        return this.f2785J.keySet();
    }

    /* renamed from: d */
    public long mo2540d(String str) {
        return this.f2785J.getLong(str, 0);
    }

    /* renamed from: d */
    public Bundle mo2541d() {
        return this.f2785J;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C0749q mo2543e(String str) {
        try {
            return Build.VERSION.SDK_INT >= 19 ? C0749q.m3904a((Object) this.f2785J.getParcelable(str)) : (C0749q) this.f2785J.getParcelable(str);
        } catch (Exception e) {
            Log.w(f2755K, "Failed to retrieve a key as Rating.", e);
            return null;
        }
    }

    /* renamed from: e */
    public Object mo2544e() {
        if (this.f2786O != null || Build.VERSION.SDK_INT < 21) {
            return this.f2786O;
        }
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        this.f2786O = C0746o.m3887a(obtain);
        obtain.recycle();
        return this.f2786O;
    }

    /* renamed from: f */
    public Bitmap mo2545f(String str) {
        try {
            return (Bitmap) this.f2785J.getParcelable(str);
        } catch (Exception e) {
            Log.w(f2755K, "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f2785J);
    }
}
