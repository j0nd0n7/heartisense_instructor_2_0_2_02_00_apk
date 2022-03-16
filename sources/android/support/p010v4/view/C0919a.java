package android.support.p010v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p010v4.p028k.C0808j;
import android.support.p010v4.p028k.C0810k;

/* renamed from: android.support.v4.view.a */
public abstract class C0919a implements Parcelable {
    public static final Parcelable.Creator<C0919a> CREATOR = C0808j.m4090a(new C0810k<C0919a>() {
        /* renamed from: b */
        public C0919a mo2679a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C0919a.f3233a;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: b */
        public C0919a[] mo2680a(int i) {
            return new C0919a[i];
        }
    });

    /* renamed from: a */
    public static final C0919a f3233a = new C0919a() {
    };

    /* renamed from: b */
    private final Parcelable f3234b;

    private C0919a() {
        this.f3234b = null;
    }

    protected C0919a(Parcel parcel) {
        this(parcel, (ClassLoader) null);
    }

    protected C0919a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3234b = readParcelable == null ? f3233a : readParcelable;
    }

    protected C0919a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f3234b = parcelable == f3233a ? null : parcelable;
    }

    /* renamed from: a */
    public final Parcelable mo3092a() {
        return this.f3234b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3234b, i);
    }
}
