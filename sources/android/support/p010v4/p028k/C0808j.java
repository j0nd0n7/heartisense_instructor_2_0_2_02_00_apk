package android.support.p010v4.p028k;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.k.j */
public final class C0808j {

    /* renamed from: android.support.v4.k.j$a */
    static class C0809a<T> implements Parcelable.Creator<T> {

        /* renamed from: a */
        final C0810k<T> f2881a;

        public C0809a(C0810k<T> kVar) {
            this.f2881a = kVar;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f2881a.mo2679a(parcel, (ClassLoader) null);
        }

        public T[] newArray(int i) {
            return this.f2881a.mo2680a(i);
        }
    }

    private C0808j() {
    }

    /* renamed from: a */
    public static <T> Parcelable.Creator<T> m4090a(C0810k<T> kVar) {
        return Build.VERSION.SDK_INT >= 13 ? C0812m.m4093a(kVar) : new C0809a(kVar);
    }
}
