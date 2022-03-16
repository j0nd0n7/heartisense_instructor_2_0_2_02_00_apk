package android.support.p010v4.p018f.p019a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;
import android.support.p010v4.p018f.p019a.C0499i;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.f.a.j */
class C0502j extends C0499i {

    /* renamed from: android.support.v4.f.a.j$a */
    private static class C0503a extends C0499i.C0500a {
        C0503a(@C0003aa C0499i.C0500a aVar, @C0003aa Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(@C0003aa Resources resources) {
            return new C0502j(this, resources);
        }
    }

    C0502j(Drawable drawable) {
        super(drawable);
    }

    C0502j(C0499i.C0500a aVar, Resources resources) {
        super(aVar, resources);
    }

    /* access modifiers changed from: package-private */
    @C0047z
    /* renamed from: b */
    public C0499i.C0500a mo1833b() {
        return new C0503a(this.f2060b, (Resources) null);
    }

    public void jumpToCurrentState() {
        this.f2061c.jumpToCurrentState();
    }
}
