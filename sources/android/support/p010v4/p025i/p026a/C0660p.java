package android.support.p010v4.p025i.p026a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.i.a.p */
public class C0660p implements Parcelable {
    public static final Parcelable.Creator<C0660p> CREATOR = new Parcelable.Creator<C0660p>() {
        /* renamed from: a */
        public C0660p createFromParcel(Parcel parcel) {
            return new C0660p(parcel);
        }

        /* renamed from: a */
        public C0660p[] newArray(int i) {
            return new C0660p[i];
        }
    };

    /* renamed from: a */
    public int f2497a;

    /* renamed from: b */
    public int f2498b;

    /* renamed from: c */
    public int f2499c;

    /* renamed from: d */
    public int f2500d;

    /* renamed from: e */
    public int f2501e;

    public C0660p(int i, int i2, int i3, int i4, int i5) {
        this.f2497a = i;
        this.f2498b = i2;
        this.f2499c = i3;
        this.f2500d = i4;
        this.f2501e = i5;
    }

    public C0660p(Parcel parcel) {
        this.f2497a = parcel.readInt();
        this.f2499c = parcel.readInt();
        this.f2500d = parcel.readInt();
        this.f2501e = parcel.readInt();
        this.f2498b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2497a);
        parcel.writeInt(this.f2499c);
        parcel.writeInt(this.f2500d);
        parcel.writeInt(this.f2501e);
        parcel.writeInt(this.f2498b);
    }
}
