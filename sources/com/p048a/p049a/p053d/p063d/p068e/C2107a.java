package com.p048a.p049a.p053d.p063d.p068e;

import android.graphics.Bitmap;
import com.p048a.p049a.p051b.C1884a;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;

/* renamed from: com.a.a.d.d.e.a */
class C2107a implements C1884a.C1885a {

    /* renamed from: a */
    private final C1921c f7017a;

    public C2107a(C1921c cVar) {
        this.f7017a = cVar;
    }

    /* renamed from: a */
    public Bitmap mo7668a(int i, int i2, Bitmap.Config config) {
        return this.f7017a.mo7768b(i, i2, config);
    }

    /* renamed from: a */
    public void mo7669a(Bitmap bitmap) {
        if (!this.f7017a.mo7767a(bitmap)) {
            bitmap.recycle();
        }
    }
}
