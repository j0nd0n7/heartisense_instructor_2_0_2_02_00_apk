package android.support.p010v4.p025i.p026a;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.p010v4.p025i.p026a.C0673r;
import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.i.a.q */
public final class C0662q implements Parcelable {

    /* renamed from: A */
    public static final int f2502A = 6;

    /* renamed from: B */
    public static final int f2503B = 7;

    /* renamed from: C */
    public static final int f2504C = 8;
    public static final Parcelable.Creator<C0662q> CREATOR = new Parcelable.Creator<C0662q>() {
        /* renamed from: a */
        public C0662q createFromParcel(Parcel parcel) {
            return new C0662q(parcel);
        }

        /* renamed from: a */
        public C0662q[] newArray(int i) {
            return new C0662q[i];
        }
    };

    /* renamed from: D */
    public static final int f2505D = 9;

    /* renamed from: E */
    public static final int f2506E = 10;

    /* renamed from: F */
    public static final int f2507F = 11;

    /* renamed from: G */
    public static final long f2508G = -1;

    /* renamed from: H */
    public static final int f2509H = 0;

    /* renamed from: I */
    public static final int f2510I = 1;

    /* renamed from: J */
    public static final int f2511J = 2;

    /* renamed from: K */
    public static final int f2512K = 3;

    /* renamed from: L */
    public static final int f2513L = 4;

    /* renamed from: M */
    public static final int f2514M = 5;

    /* renamed from: N */
    public static final int f2515N = 6;

    /* renamed from: O */
    public static final int f2516O = 7;

    /* renamed from: P */
    public static final int f2517P = 8;

    /* renamed from: Q */
    public static final int f2518Q = 9;

    /* renamed from: R */
    public static final int f2519R = 10;

    /* renamed from: S */
    public static final int f2520S = 11;

    /* renamed from: T */
    public static final int f2521T = 0;

    /* renamed from: U */
    public static final int f2522U = 1;

    /* renamed from: V */
    public static final int f2523V = 2;

    /* renamed from: a */
    public static final long f2524a = 1;

    /* renamed from: ah */
    private static final int f2525ah = 127;

    /* renamed from: ai */
    private static final int f2526ai = 126;

    /* renamed from: b */
    public static final long f2527b = 2;

    /* renamed from: c */
    public static final long f2528c = 4;

    /* renamed from: d */
    public static final long f2529d = 8;

    /* renamed from: e */
    public static final long f2530e = 16;

    /* renamed from: f */
    public static final long f2531f = 32;

    /* renamed from: g */
    public static final long f2532g = 64;

    /* renamed from: h */
    public static final long f2533h = 128;

    /* renamed from: i */
    public static final long f2534i = 256;

    /* renamed from: j */
    public static final long f2535j = 512;

    /* renamed from: k */
    public static final long f2536k = 1024;

    /* renamed from: l */
    public static final long f2537l = 2048;

    /* renamed from: m */
    public static final long f2538m = 4096;

    /* renamed from: n */
    public static final long f2539n = 8192;

    /* renamed from: o */
    public static final long f2540o = 16384;

    /* renamed from: p */
    public static final long f2541p = 32768;

    /* renamed from: q */
    public static final long f2542q = 65536;

    /* renamed from: r */
    public static final long f2543r = 131072;

    /* renamed from: s */
    public static final long f2544s = 262144;

    /* renamed from: t */
    public static final long f2545t = 524288;

    /* renamed from: u */
    public static final int f2546u = 0;

    /* renamed from: v */
    public static final int f2547v = 1;

    /* renamed from: w */
    public static final int f2548w = 2;

    /* renamed from: x */
    public static final int f2549x = 3;

    /* renamed from: y */
    public static final int f2550y = 4;

    /* renamed from: z */
    public static final int f2551z = 5;

    /* renamed from: W */
    final int f2552W;

    /* renamed from: X */
    final long f2553X;

    /* renamed from: Y */
    final long f2554Y;

    /* renamed from: Z */
    final float f2555Z;

    /* renamed from: aa */
    final long f2556aa;

    /* renamed from: ab */
    final int f2557ab;

    /* renamed from: ac */
    final CharSequence f2558ac;

    /* renamed from: ad */
    final long f2559ad;

    /* renamed from: ae */
    List<C0666c> f2560ae;

    /* renamed from: af */
    final long f2561af;

    /* renamed from: ag */
    final Bundle f2562ag;

    /* renamed from: aj */
    private Object f2563aj;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.a.q$a */
    public @interface C0664a {
    }

    /* renamed from: android.support.v4.i.a.q$b */
    public static final class C0665b {

        /* renamed from: a */
        private final List<C0666c> f2564a = new ArrayList();

        /* renamed from: b */
        private int f2565b;

        /* renamed from: c */
        private long f2566c;

        /* renamed from: d */
        private long f2567d;

        /* renamed from: e */
        private float f2568e;

        /* renamed from: f */
        private long f2569f;

        /* renamed from: g */
        private int f2570g;

        /* renamed from: h */
        private CharSequence f2571h;

        /* renamed from: i */
        private long f2572i;

        /* renamed from: j */
        private long f2573j = -1;

        /* renamed from: k */
        private Bundle f2574k;

        public C0665b() {
        }

        public C0665b(C0662q qVar) {
            this.f2565b = qVar.f2552W;
            this.f2566c = qVar.f2553X;
            this.f2568e = qVar.f2555Z;
            this.f2572i = qVar.f2559ad;
            this.f2567d = qVar.f2554Y;
            this.f2569f = qVar.f2556aa;
            this.f2570g = qVar.f2557ab;
            this.f2571h = qVar.f2558ac;
            if (qVar.f2560ae != null) {
                this.f2564a.addAll(qVar.f2560ae);
            }
            this.f2573j = qVar.f2561af;
            this.f2574k = qVar.f2562ag;
        }

        /* renamed from: a */
        public C0665b mo2397a(int i, long j, float f) {
            return mo2398a(i, j, f, SystemClock.elapsedRealtime());
        }

        /* renamed from: a */
        public C0665b mo2398a(int i, long j, float f, long j2) {
            this.f2565b = i;
            this.f2566c = j;
            this.f2572i = j2;
            this.f2568e = f;
            return this;
        }

        /* renamed from: a */
        public C0665b mo2399a(int i, CharSequence charSequence) {
            this.f2570g = i;
            this.f2571h = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0665b mo2400a(long j) {
            this.f2567d = j;
            return this;
        }

        /* renamed from: a */
        public C0665b mo2401a(Bundle bundle) {
            this.f2574k = bundle;
            return this;
        }

        /* renamed from: a */
        public C0665b mo2402a(C0666c cVar) {
            if (cVar == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
            }
            this.f2564a.add(cVar);
            return this;
        }

        /* renamed from: a */
        public C0665b mo2403a(CharSequence charSequence) {
            this.f2571h = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0665b mo2404a(String str, String str2, int i) {
            return mo2402a(new C0666c(str, str2, i, (Bundle) null));
        }

        /* renamed from: a */
        public C0662q mo2405a() {
            return new C0662q(this.f2565b, this.f2566c, this.f2567d, this.f2568e, this.f2569f, this.f2570g, this.f2571h, this.f2572i, this.f2564a, this.f2573j, this.f2574k);
        }

        /* renamed from: b */
        public C0665b mo2406b(long j) {
            this.f2569f = j;
            return this;
        }

        /* renamed from: c */
        public C0665b mo2407c(long j) {
            this.f2573j = j;
            return this;
        }
    }

    /* renamed from: android.support.v4.i.a.q$c */
    public static final class C0666c implements Parcelable {
        public static final Parcelable.Creator<C0666c> CREATOR = new Parcelable.Creator<C0666c>() {
            /* renamed from: a */
            public C0666c createFromParcel(Parcel parcel) {
                return new C0666c(parcel);
            }

            /* renamed from: a */
            public C0666c[] newArray(int i) {
                return new C0666c[i];
            }
        };

        /* renamed from: a */
        private final String f2575a;

        /* renamed from: b */
        private final CharSequence f2576b;

        /* renamed from: c */
        private final int f2577c;

        /* renamed from: d */
        private final Bundle f2578d;

        /* renamed from: e */
        private Object f2579e;

        /* renamed from: android.support.v4.i.a.q$c$a */
        public static final class C0668a {

            /* renamed from: a */
            private final String f2580a;

            /* renamed from: b */
            private final CharSequence f2581b;

            /* renamed from: c */
            private final int f2582c;

            /* renamed from: d */
            private Bundle f2583d;

            public C0668a(String str, CharSequence charSequence, int i) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
                } else if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
                } else if (i == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
                } else {
                    this.f2580a = str;
                    this.f2581b = charSequence;
                    this.f2582c = i;
                }
            }

            /* renamed from: a */
            public C0668a mo2420a(Bundle bundle) {
                this.f2583d = bundle;
                return this;
            }

            /* renamed from: a */
            public C0666c mo2421a() {
                return new C0666c(this.f2580a, this.f2581b, this.f2582c, this.f2583d);
            }
        }

        C0666c(Parcel parcel) {
            this.f2575a = parcel.readString();
            this.f2576b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f2577c = parcel.readInt();
            this.f2578d = parcel.readBundle();
        }

        C0666c(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f2575a = str;
            this.f2576b = charSequence;
            this.f2577c = i;
            this.f2578d = bundle;
        }

        /* renamed from: a */
        public static C0666c m3667a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            C0666c cVar = new C0666c(C0673r.C0674a.m3688a(obj), C0673r.C0674a.m3689b(obj), C0673r.C0674a.m3690c(obj), C0673r.C0674a.m3691d(obj));
            cVar.f2579e = obj;
            return cVar;
        }

        /* renamed from: a */
        public Object mo2408a() {
            if (this.f2579e != null || Build.VERSION.SDK_INT < 21) {
                return this.f2579e;
            }
            this.f2579e = C0673r.C0674a.m3687a(this.f2575a, this.f2576b, this.f2577c, this.f2578d);
            return this.f2579e;
        }

        /* renamed from: b */
        public String mo2409b() {
            return this.f2575a;
        }

        /* renamed from: c */
        public CharSequence mo2410c() {
            return this.f2576b;
        }

        /* renamed from: d */
        public int mo2411d() {
            return this.f2577c;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public Bundle mo2413e() {
            return this.f2578d;
        }

        public String toString() {
            return "Action:mName='" + this.f2576b + ", mIcon=" + this.f2577c + ", mExtras=" + this.f2578d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2575a);
            TextUtils.writeToParcel(this.f2576b, parcel, i);
            parcel.writeInt(this.f2577c);
            parcel.writeBundle(this.f2578d);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.a.q$d */
    public @interface C0669d {
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.a.q$e */
    public @interface C0670e {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.a.q$f */
    public @interface C0671f {
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.a.q$g */
    public @interface C0672g {
    }

    C0662q(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<C0666c> list, long j5, Bundle bundle) {
        this.f2552W = i;
        this.f2553X = j;
        this.f2554Y = j2;
        this.f2555Z = f;
        this.f2556aa = j3;
        this.f2557ab = i2;
        this.f2558ac = charSequence;
        this.f2559ad = j4;
        this.f2560ae = new ArrayList(list);
        this.f2561af = j5;
        this.f2562ag = bundle;
    }

    C0662q(Parcel parcel) {
        this.f2552W = parcel.readInt();
        this.f2553X = parcel.readLong();
        this.f2555Z = parcel.readFloat();
        this.f2559ad = parcel.readLong();
        this.f2554Y = parcel.readLong();
        this.f2556aa = parcel.readLong();
        this.f2558ac = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2560ae = parcel.createTypedArrayList(C0666c.CREATOR);
        this.f2561af = parcel.readLong();
        this.f2562ag = parcel.readBundle();
        this.f2557ab = parcel.readInt();
    }

    /* renamed from: a */
    public static int m3640a(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    /* renamed from: a */
    public static C0662q m3641a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> h = C0673r.m3685h(obj);
        ArrayList arrayList = null;
        if (h != null) {
            arrayList = new ArrayList(h.size());
            for (Object a : h) {
                arrayList.add(C0666c.m3667a(a));
            }
        }
        C0662q qVar = new C0662q(C0673r.m3677a(obj), C0673r.m3679b(obj), C0673r.m3680c(obj), C0673r.m3681d(obj), C0673r.m3682e(obj), 0, C0673r.m3683f(obj), C0673r.m3684g(obj), arrayList, C0673r.m3686i(obj), Build.VERSION.SDK_INT >= 22 ? C0675s.m3692a(obj) : null);
        qVar.f2563aj = obj;
        return qVar;
    }

    /* renamed from: a */
    public int mo2378a() {
        return this.f2552W;
    }

    /* renamed from: b */
    public long mo2379b() {
        return this.f2553X;
    }

    /* renamed from: c */
    public long mo2380c() {
        return this.f2554Y;
    }

    /* renamed from: d */
    public float mo2381d() {
        return this.f2555Z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long mo2383e() {
        return this.f2556aa;
    }

    /* renamed from: f */
    public List<C0666c> mo2384f() {
        return this.f2560ae;
    }

    /* renamed from: g */
    public int mo2385g() {
        return this.f2557ab;
    }

    /* renamed from: h */
    public CharSequence mo2386h() {
        return this.f2558ac;
    }

    /* renamed from: i */
    public long mo2387i() {
        return this.f2559ad;
    }

    /* renamed from: j */
    public long mo2388j() {
        return this.f2561af;
    }

    @C0003aa
    /* renamed from: k */
    public Bundle mo2389k() {
        return this.f2562ag;
    }

    /* renamed from: l */
    public Object mo2390l() {
        if (this.f2563aj != null || Build.VERSION.SDK_INT < 21) {
            return this.f2563aj;
        }
        ArrayList arrayList = null;
        if (this.f2560ae != null) {
            arrayList = new ArrayList(this.f2560ae.size());
            for (C0666c a : this.f2560ae) {
                arrayList.add(a.mo2408a());
            }
        }
        if (Build.VERSION.SDK_INT >= 22) {
            this.f2563aj = C0675s.m3693a(this.f2552W, this.f2553X, this.f2554Y, this.f2555Z, this.f2556aa, this.f2558ac, this.f2559ad, arrayList, this.f2561af, this.f2562ag);
        } else {
            this.f2563aj = C0673r.m3678a(this.f2552W, this.f2553X, this.f2554Y, this.f2555Z, this.f2556aa, this.f2558ac, this.f2559ad, arrayList, this.f2561af);
        }
        return this.f2563aj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=").append(this.f2552W);
        sb.append(", position=").append(this.f2553X);
        sb.append(", buffered position=").append(this.f2554Y);
        sb.append(", speed=").append(this.f2555Z);
        sb.append(", updated=").append(this.f2559ad);
        sb.append(", actions=").append(this.f2556aa);
        sb.append(", error code=").append(this.f2557ab);
        sb.append(", error message=").append(this.f2558ac);
        sb.append(", custom actions=").append(this.f2560ae);
        sb.append(", active item id=").append(this.f2561af);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2552W);
        parcel.writeLong(this.f2553X);
        parcel.writeFloat(this.f2555Z);
        parcel.writeLong(this.f2559ad);
        parcel.writeLong(this.f2554Y);
        parcel.writeLong(this.f2556aa);
        TextUtils.writeToParcel(this.f2558ac, parcel, i);
        parcel.writeTypedList(this.f2560ae);
        parcel.writeLong(this.f2561af);
        parcel.writeBundle(this.f2562ag);
        parcel.writeInt(this.f2557ab);
    }
}
