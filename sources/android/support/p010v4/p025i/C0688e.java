package android.support.p010v4.p025i;

import android.os.Bundle;
import android.support.annotation.C0011ag;
import android.support.p036v7.widget.ActivityChooserView;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v4.i.e */
public class C0688e {
    /* renamed from: a */
    public static boolean m3722a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt(C0541a.f2123c, -1) == -1 && bundle2.getInt(C0541a.f2124d, -1) == -1 : bundle2 == null ? bundle.getInt(C0541a.f2123c, -1) == -1 && bundle.getInt(C0541a.f2124d, -1) == -1 : bundle.getInt(C0541a.f2123c, -1) == bundle2.getInt(C0541a.f2123c, -1) && bundle.getInt(C0541a.f2124d, -1) == bundle2.getInt(C0541a.f2124d, -1);
    }

    /* renamed from: b */
    public static boolean m3723b(Bundle bundle, Bundle bundle2) {
        int i;
        int i2;
        int i3;
        int i4 = ActivityChooserView.C1593a.f5166a;
        int i5 = bundle == null ? -1 : bundle.getInt(C0541a.f2123c, -1);
        int i6 = bundle2 == null ? -1 : bundle2.getInt(C0541a.f2123c, -1);
        int i7 = bundle == null ? -1 : bundle.getInt(C0541a.f2124d, -1);
        int i8 = bundle2 == null ? -1 : bundle2.getInt(C0541a.f2124d, -1);
        if (i5 == -1 || i7 == -1) {
            i2 = Integer.MAX_VALUE;
            i = 0;
        } else {
            int i9 = i5 * i7;
            i = i9;
            i2 = (i9 + i7) - 1;
        }
        if (i6 == -1 || i8 == -1) {
            i3 = 0;
        } else {
            i3 = i8 * i6;
            i4 = (i3 + i8) - 1;
        }
        if (i > i3 || i3 > i2) {
            return i <= i4 && i4 <= i2;
        }
        return true;
    }
}
