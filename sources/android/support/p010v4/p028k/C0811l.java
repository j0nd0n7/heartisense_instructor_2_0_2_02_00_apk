package android.support.p010v4.p028k;

import android.annotation.TargetApi;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 13)
@TargetApi(13)
/* renamed from: android.support.v4.k.l */
class C0811l<T> implements Parcelable.ClassLoaderCreator<T> {

    /* renamed from: a */
    private final C0810k<T> f2882a;

    public C0811l(C0810k<T> kVar) {
        this.f2882a = kVar;
    }

    public T createFromParcel(Parcel parcel) {
        return this.f2882a.mo2679a(parcel, (ClassLoader) null);
    }

    public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f2882a.mo2679a(parcel, classLoader);
    }

    public T[] newArray(int i) {
        return this.f2882a.mo2680a(i);
    }
}
