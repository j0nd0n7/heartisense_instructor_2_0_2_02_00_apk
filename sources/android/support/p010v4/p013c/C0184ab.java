package android.support.p010v4.p013c;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: android.support.v4.c.ab */
class C0184ab {
    C0184ab() {
    }

    /* renamed from: a */
    public static Bundle[] m881a(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }
}
