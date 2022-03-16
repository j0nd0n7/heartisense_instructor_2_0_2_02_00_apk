package android.support.p010v4.p013c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.c.al */
final class C0215al implements Parcelable {
    public static final Parcelable.Creator<C0215al> CREATOR = new Parcelable.Creator<C0215al>() {
        /* renamed from: a */
        public C0215al createFromParcel(Parcel parcel) {
            return new C0215al(parcel);
        }

        /* renamed from: a */
        public C0215al[] newArray(int i) {
            return new C0215al[i];
        }
    };

    /* renamed from: a */
    C0218an[] f1287a;

    /* renamed from: b */
    int[] f1288b;

    /* renamed from: c */
    C0406u[] f1289c;

    public C0215al() {
    }

    public C0215al(Parcel parcel) {
        this.f1287a = (C0218an[]) parcel.createTypedArray(C0218an.CREATOR);
        this.f1288b = parcel.createIntArray();
        this.f1289c = (C0406u[]) parcel.createTypedArray(C0406u.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f1287a, i);
        parcel.writeIntArray(this.f1288b);
        parcel.writeTypedArray(this.f1289c, i);
    }
}
