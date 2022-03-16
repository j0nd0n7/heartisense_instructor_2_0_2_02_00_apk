package android.support.p010v4.p018f.p019a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;
import android.support.p010v4.p018f.p019a.C0499i;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.f.a.k */
class C0504k extends C0502j {

    /* renamed from: android.support.v4.f.a.k$a */
    private static class C0505a extends C0499i.C0500a {
        C0505a(@C0003aa C0499i.C0500a aVar, @C0003aa Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(@C0003aa Resources resources) {
            return new C0504k(this, resources);
        }
    }

    C0504k(Drawable drawable) {
        super(drawable);
    }

    C0504k(C0499i.C0500a aVar, Resources resources) {
        super(aVar, resources);
    }

    /* access modifiers changed from: package-private */
    @C0047z
    /* renamed from: b */
    public C0499i.C0500a mo1833b() {
        return new C0505a(this.f2060b, (Resources) null);
    }

    public boolean isAutoMirrored() {
        return this.f2061c.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        this.f2061c.setAutoMirrored(z);
    }
}
