package android.support.p010v4.p025i;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0011ag;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.i.q */
public final class C0749q implements Parcelable {
    public static final Parcelable.Creator<C0749q> CREATOR = new Parcelable.Creator<C0749q>() {
        /* renamed from: a */
        public C0749q createFromParcel(Parcel parcel) {
            return new C0749q(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: a */
        public C0749q[] newArray(int i) {
            return new C0749q[i];
        }
    };

    /* renamed from: a */
    public static final int f2790a = 0;

    /* renamed from: b */
    public static final int f2791b = 1;

    /* renamed from: c */
    public static final int f2792c = 2;

    /* renamed from: d */
    public static final int f2793d = 3;

    /* renamed from: e */
    public static final int f2794e = 4;

    /* renamed from: f */
    public static final int f2795f = 5;

    /* renamed from: g */
    public static final int f2796g = 6;

    /* renamed from: h */
    private static final String f2797h = "Rating";

    /* renamed from: i */
    private static final float f2798i = -1.0f;

    /* renamed from: j */
    private final int f2799j;

    /* renamed from: k */
    private final float f2800k;

    /* renamed from: l */
    private Object f2801l;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.q$a */
    public @interface C0751a {
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.q$b */
    public @interface C0752b {
    }

    C0749q(int i, float f) {
        this.f2799j = i;
        this.f2800k = f;
    }

    /* renamed from: a */
    public static C0749q m3901a(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new C0749q(6, f);
        }
        Log.e(f2797h, "Invalid percentage-based rating value");
        return null;
    }

    /* renamed from: a */
    public static C0749q m3902a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new C0749q(i, f2798i);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static C0749q m3903a(int i, float f) {
        float f2;
        switch (i) {
            case 3:
                f2 = 3.0f;
                break;
            case 4:
                f2 = 4.0f;
                break;
            case 5:
                f2 = 5.0f;
                break;
            default:
                Log.e(f2797h, "Invalid rating style (" + i + ") for a star rating");
                return null;
        }
        if (f >= 0.0f && f <= f2) {
            return new C0749q(i, f);
        }
        Log.e(f2797h, "Trying to set out of range star-based rating");
        return null;
    }

    /* renamed from: a */
    public static C0749q m3904a(Object obj) {
        C0749q qVar = null;
        if (obj != null && Build.VERSION.SDK_INT >= 19) {
            int b = C0753r.m3921b(obj);
            if (C0753r.m3920a(obj)) {
                switch (b) {
                    case 1:
                        qVar = m3905a(C0753r.m3923c(obj));
                        break;
                    case 2:
                        qVar = m3906b(C0753r.m3924d(obj));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        qVar = m3903a(b, C0753r.m3925e(obj));
                        break;
                    case 6:
                        qVar = m3901a(C0753r.m3926f(obj));
                        break;
                }
            } else {
                qVar = m3902a(b);
            }
            qVar.f2801l = obj;
        }
        return qVar;
    }

    /* renamed from: a */
    public static C0749q m3905a(boolean z) {
        return new C0749q(1, z ? 1.0f : 0.0f);
    }

    /* renamed from: b */
    public static C0749q m3906b(boolean z) {
        return new C0749q(2, z ? 1.0f : 0.0f);
    }

    /* renamed from: a */
    public boolean mo2557a() {
        return this.f2800k >= 0.0f;
    }

    /* renamed from: b */
    public int mo2558b() {
        return this.f2799j;
    }

    /* renamed from: c */
    public boolean mo2559c() {
        boolean z = true;
        if (this.f2799j != 1) {
            return false;
        }
        if (this.f2800k != 1.0f) {
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo2560d() {
        return this.f2799j == 2 && this.f2800k == 1.0f;
    }

    public int describeContents() {
        return this.f2799j;
    }

    /* renamed from: e */
    public float mo2562e() {
        switch (this.f2799j) {
            case 3:
            case 4:
            case 5:
                if (mo2557a()) {
                    return this.f2800k;
                }
                break;
        }
        return f2798i;
    }

    /* renamed from: f */
    public float mo2563f() {
        return (this.f2799j != 6 || !mo2557a()) ? f2798i : this.f2800k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        return null;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo2564g() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2801l
            if (r0 != 0) goto L_0x000a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 >= r1) goto L_0x000d
        L_0x000a:
            java.lang.Object r0 = r2.f2801l
        L_0x000c:
            return r0
        L_0x000d:
            boolean r0 = r2.mo2557a()
            if (r0 == 0) goto L_0x004a
            int r0 = r2.f2799j
            switch(r0) {
                case 1: goto L_0x001a;
                case 2: goto L_0x0027;
                case 3: goto L_0x0032;
                case 4: goto L_0x0032;
                case 5: goto L_0x0032;
                case 6: goto L_0x003f;
                default: goto L_0x0018;
            }
        L_0x0018:
            r0 = 0
            goto L_0x000c
        L_0x001a:
            boolean r0 = r2.mo2559c()
            java.lang.Object r0 = android.support.p010v4.p025i.C0753r.m3919a((boolean) r0)
            r2.f2801l = r0
        L_0x0024:
            java.lang.Object r0 = r2.f2801l
            goto L_0x000c
        L_0x0027:
            boolean r0 = r2.mo2560d()
            java.lang.Object r0 = android.support.p010v4.p025i.C0753r.m3922b((boolean) r0)
            r2.f2801l = r0
            goto L_0x0024
        L_0x0032:
            int r0 = r2.f2799j
            float r1 = r2.mo2562e()
            java.lang.Object r0 = android.support.p010v4.p025i.C0753r.m3918a(r0, r1)
            r2.f2801l = r0
            goto L_0x0024
        L_0x003f:
            float r0 = r2.mo2563f()
            java.lang.Object r0 = android.support.p010v4.p025i.C0753r.m3916a((float) r0)
            r2.f2801l = r0
            goto L_0x0018
        L_0x004a:
            int r0 = r2.f2799j
            java.lang.Object r0 = android.support.p010v4.p025i.C0753r.m3917a((int) r0)
            r2.f2801l = r0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p025i.C0749q.mo2564g():java.lang.Object");
    }

    public String toString() {
        return "Rating:style=" + this.f2799j + " rating=" + (this.f2800k < 0.0f ? "unrated" : String.valueOf(this.f2800k));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2799j);
        parcel.writeFloat(this.f2800k);
    }
}
