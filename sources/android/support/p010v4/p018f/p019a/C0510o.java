package android.support.p010v4.p018f.p019a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.support.p010v4.p018f.C0478a;
import android.support.p010v4.view.C1161h;
import android.util.Log;
import java.io.InputStream;

/* renamed from: android.support.v4.f.a.o */
public final class C0510o {

    /* renamed from: a */
    private static final String f2084a = "RoundedBitmapDrawableFactory";

    /* renamed from: android.support.v4.f.a.o$a */
    private static class C0511a extends C0508m {
        C0511a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1875a(int i, int i2, int i3, Rect rect, Rect rect2) {
            C1161h.m6978a(i, i2, i3, rect, rect2, 0);
        }

        /* renamed from: a */
        public void mo1878a(boolean z) {
            if (this.f2071a != null) {
                C0478a.m2523a(this.f2071a, z);
                invalidateSelf();
            }
        }

        /* renamed from: d */
        public boolean mo1884d() {
            return this.f2071a != null && C0478a.m2524a(this.f2071a);
        }
    }

    private C0510o() {
    }

    /* renamed from: a */
    public static C0508m m2674a(Resources resources, Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 21 ? new C0509n(resources, bitmap) : new C0511a(resources, bitmap);
    }

    /* renamed from: a */
    public static C0508m m2675a(Resources resources, InputStream inputStream) {
        C0508m a = m2674a(resources, BitmapFactory.decodeStream(inputStream));
        if (a.mo1879b() == null) {
            Log.w(f2084a, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return a;
    }

    /* renamed from: a */
    public static C0508m m2676a(Resources resources, String str) {
        C0508m a = m2674a(resources, BitmapFactory.decodeFile(str));
        if (a.mo1879b() == null) {
            Log.w(f2084a, "RoundedBitmapDrawable cannot decode " + str);
        }
        return a;
    }
}
