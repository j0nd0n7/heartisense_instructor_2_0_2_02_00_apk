package android.support.p010v4.p025i;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.p010v4.p025i.C0735l;
import android.support.p010v4.p025i.C0737m;
import android.text.TextUtils;

/* renamed from: android.support.v4.i.k */
public final class C0732k implements Parcelable {
    public static final Parcelable.Creator<C0732k> CREATOR = new Parcelable.Creator<C0732k>() {
        /* renamed from: a */
        public C0732k createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new C0732k(parcel) : C0732k.m3824a(C0735l.m3845a(parcel));
        }

        /* renamed from: a */
        public C0732k[] newArray(int i) {
            return new C0732k[i];
        }
    };

    /* renamed from: a */
    public static final String f2719a = "android.media.extra.BT_FOLDER_TYPE";

    /* renamed from: b */
    public static final long f2720b = 0;

    /* renamed from: c */
    public static final long f2721c = 1;

    /* renamed from: d */
    public static final long f2722d = 2;

    /* renamed from: e */
    public static final long f2723e = 3;

    /* renamed from: f */
    public static final long f2724f = 4;

    /* renamed from: g */
    public static final long f2725g = 5;

    /* renamed from: h */
    public static final long f2726h = 6;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: i */
    public static final String f2727i = "android.support.v4.media.description.MEDIA_URI";
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: j */
    public static final String f2728j = "android.support.v4.media.description.NULL_BUNDLE_FLAG";

    /* renamed from: k */
    private final String f2729k;

    /* renamed from: l */
    private final CharSequence f2730l;

    /* renamed from: m */
    private final CharSequence f2731m;

    /* renamed from: n */
    private final CharSequence f2732n;

    /* renamed from: o */
    private final Bitmap f2733o;

    /* renamed from: p */
    private final Uri f2734p;

    /* renamed from: q */
    private final Bundle f2735q;

    /* renamed from: r */
    private final Uri f2736r;

    /* renamed from: s */
    private Object f2737s;

    /* renamed from: android.support.v4.i.k$a */
    public static final class C0734a {

        /* renamed from: a */
        private String f2738a;

        /* renamed from: b */
        private CharSequence f2739b;

        /* renamed from: c */
        private CharSequence f2740c;

        /* renamed from: d */
        private CharSequence f2741d;

        /* renamed from: e */
        private Bitmap f2742e;

        /* renamed from: f */
        private Uri f2743f;

        /* renamed from: g */
        private Bundle f2744g;

        /* renamed from: h */
        private Uri f2745h;

        /* renamed from: a */
        public C0734a mo2525a(@C0003aa Bitmap bitmap) {
            this.f2742e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0734a mo2526a(@C0003aa Uri uri) {
            this.f2743f = uri;
            return this;
        }

        /* renamed from: a */
        public C0734a mo2527a(@C0003aa Bundle bundle) {
            this.f2744g = bundle;
            return this;
        }

        /* renamed from: a */
        public C0734a mo2528a(@C0003aa CharSequence charSequence) {
            this.f2739b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0734a mo2529a(@C0003aa String str) {
            this.f2738a = str;
            return this;
        }

        /* renamed from: a */
        public C0732k mo2530a() {
            return new C0732k(this.f2738a, this.f2739b, this.f2740c, this.f2741d, this.f2742e, this.f2743f, this.f2744g, this.f2745h);
        }

        /* renamed from: b */
        public C0734a mo2531b(@C0003aa Uri uri) {
            this.f2745h = uri;
            return this;
        }

        /* renamed from: b */
        public C0734a mo2532b(@C0003aa CharSequence charSequence) {
            this.f2740c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0734a mo2533c(@C0003aa CharSequence charSequence) {
            this.f2741d = charSequence;
            return this;
        }
    }

    C0732k(Parcel parcel) {
        this.f2729k = parcel.readString();
        this.f2730l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2731m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2732n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2733o = (Bitmap) parcel.readParcelable((ClassLoader) null);
        this.f2734p = (Uri) parcel.readParcelable((ClassLoader) null);
        this.f2735q = parcel.readBundle();
        this.f2736r = (Uri) parcel.readParcelable((ClassLoader) null);
    }

    C0732k(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f2729k = str;
        this.f2730l = charSequence;
        this.f2731m = charSequence2;
        this.f2732n = charSequence3;
        this.f2733o = bitmap;
        this.f2734p = uri;
        this.f2735q = bundle;
        this.f2736r = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p010v4.p025i.C0732k m3824a(java.lang.Object r6) {
        /*
            r1 = 0
            if (r6 == 0) goto L_0x0009
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 >= r2) goto L_0x000a
        L_0x0009:
            return r1
        L_0x000a:
            android.support.v4.i.k$a r4 = new android.support.v4.i.k$a
            r4.<init>()
            java.lang.String r0 = android.support.p010v4.p025i.C0735l.m3846a((java.lang.Object) r6)
            r4.mo2529a((java.lang.String) r0)
            java.lang.CharSequence r0 = android.support.p010v4.p025i.C0735l.m3848b(r6)
            r4.mo2528a((java.lang.CharSequence) r0)
            java.lang.CharSequence r0 = android.support.p010v4.p025i.C0735l.m3849c(r6)
            r4.mo2532b((java.lang.CharSequence) r0)
            java.lang.CharSequence r0 = android.support.p010v4.p025i.C0735l.m3850d(r6)
            r4.mo2533c(r0)
            android.graphics.Bitmap r0 = android.support.p010v4.p025i.C0735l.m3851e(r6)
            r4.mo2525a((android.graphics.Bitmap) r0)
            android.net.Uri r0 = android.support.p010v4.p025i.C0735l.m3852f(r6)
            r4.mo2526a((android.net.Uri) r0)
            android.os.Bundle r2 = android.support.p010v4.p025i.C0735l.m3853g(r6)
            if (r2 != 0) goto L_0x0061
            r3 = r1
        L_0x0040:
            if (r3 == 0) goto L_0x0075
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x006b
            int r0 = r2.size()
            r5 = 2
            if (r0 != r5) goto L_0x006b
            r0 = r1
        L_0x0052:
            r4.mo2527a((android.os.Bundle) r0)
            if (r3 == 0) goto L_0x0077
            r4.mo2531b((android.net.Uri) r3)
        L_0x005a:
            android.support.v4.i.k r1 = r4.mo2530a()
            r1.f2737s = r6
            goto L_0x0009
        L_0x0061:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r3 = r0
            goto L_0x0040
        L_0x006b:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            r2.remove(r0)
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r2.remove(r0)
        L_0x0075:
            r0 = r2
            goto L_0x0052
        L_0x0077:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x005a
            android.net.Uri r0 = android.support.p010v4.p025i.C0737m.m3863h(r6)
            r4.mo2531b((android.net.Uri) r0)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p025i.C0732k.m3824a(java.lang.Object):android.support.v4.i.k");
    }

    @C0003aa
    /* renamed from: a */
    public String mo2509a() {
        return this.f2729k;
    }

    @C0003aa
    /* renamed from: b */
    public CharSequence mo2510b() {
        return this.f2730l;
    }

    @C0003aa
    /* renamed from: c */
    public CharSequence mo2511c() {
        return this.f2731m;
    }

    @C0003aa
    /* renamed from: d */
    public CharSequence mo2512d() {
        return this.f2732n;
    }

    public int describeContents() {
        return 0;
    }

    @C0003aa
    /* renamed from: e */
    public Bitmap mo2514e() {
        return this.f2733o;
    }

    @C0003aa
    /* renamed from: f */
    public Uri mo2515f() {
        return this.f2734p;
    }

    @C0003aa
    /* renamed from: g */
    public Bundle mo2516g() {
        return this.f2735q;
    }

    @C0003aa
    /* renamed from: h */
    public Uri mo2517h() {
        return this.f2736r;
    }

    /* renamed from: i */
    public Object mo2518i() {
        if (this.f2737s != null || Build.VERSION.SDK_INT < 21) {
            return this.f2737s;
        }
        Object a = C0735l.C0736a.m3854a();
        C0735l.C0736a.m3860a(a, this.f2729k);
        C0735l.C0736a.m3859a(a, this.f2730l);
        C0735l.C0736a.m3861b(a, this.f2731m);
        C0735l.C0736a.m3862c(a, this.f2732n);
        C0735l.C0736a.m3856a(a, this.f2733o);
        C0735l.C0736a.m3857a(a, this.f2734p);
        Bundle bundle = this.f2735q;
        if (Build.VERSION.SDK_INT < 23 && this.f2736r != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean(f2728j, true);
            }
            bundle.putParcelable(f2727i, this.f2736r);
        }
        C0735l.C0736a.m3858a(a, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0737m.C0738a.m3864b(a, this.f2736r);
        }
        this.f2737s = C0735l.C0736a.m3855a(a);
        return this.f2737s;
    }

    public String toString() {
        return this.f2730l + ", " + this.f2731m + ", " + this.f2732n;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f2729k);
            TextUtils.writeToParcel(this.f2730l, parcel, i);
            TextUtils.writeToParcel(this.f2731m, parcel, i);
            TextUtils.writeToParcel(this.f2732n, parcel, i);
            parcel.writeParcelable(this.f2733o, i);
            parcel.writeParcelable(this.f2734p, i);
            parcel.writeBundle(this.f2735q);
            parcel.writeParcelable(this.f2736r, i);
            return;
        }
        C0735l.m3847a(mo2518i(), parcel, i);
    }
}
