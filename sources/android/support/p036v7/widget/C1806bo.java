package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0047z;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.bo */
class C1806bo extends C1779bb {

    /* renamed from: a */
    private final WeakReference<Context> f6104a;

    public C1806bo(@C0047z Context context, @C0047z Resources resources) {
        super(resources);
        this.f6104a = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f6104a.get();
        if (!(drawable == null || context == null)) {
            C1849m.m11201a();
            C1849m.m11207a(context, i, drawable);
        }
        return drawable;
    }
}
