package android.support.p010v4.p018f.p019a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.support.annotation.C0007ae;
import android.view.Gravity;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.f.a.n */
class C0509n extends C0508m {
    protected C0509n(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1875a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    /* renamed from: a */
    public void mo1878a(boolean z) {
        if (this.f2071a != null) {
            this.f2071a.setHasMipMap(z);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public boolean mo1884d() {
        return this.f2071a != null && this.f2071a.hasMipMap();
    }

    public void getOutline(Outline outline) {
        mo1887f();
        outline.setRoundRect(this.f2072b, mo1894h());
    }
}
