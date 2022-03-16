package com.p048a.p049a.p074h.p076b;

import android.widget.ImageView;
import com.p048a.p049a.p053d.p063d.p066c.C2097b;
import com.p048a.p049a.p074h.p075a.C2185c;

/* renamed from: com.a.a.h.b.e */
public class C2204e extends C2205f<C2097b> {

    /* renamed from: c */
    private static final float f7258c = 0.05f;

    /* renamed from: d */
    private int f7259d;

    /* renamed from: e */
    private C2097b f7260e;

    public C2204e(ImageView imageView) {
        this(imageView, -1);
    }

    public C2204e(ImageView imageView, int i) {
        super(imageView);
        this.f7259d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8214a(C2097b bVar) {
        ((ImageView) this.f7277b).setImageDrawable(bVar);
    }

    /* renamed from: a */
    public void mo8051a(C2097b bVar, C2185c<? super C2097b> cVar) {
        if (!bVar.mo7965a()) {
            float width = ((float) ((ImageView) this.f7277b).getWidth()) / ((float) ((ImageView) this.f7277b).getHeight());
            float intrinsicWidth = ((float) bVar.getIntrinsicWidth()) / ((float) bVar.getIntrinsicHeight());
            if (Math.abs(width - 1.0f) <= f7258c && Math.abs(intrinsicWidth - 1.0f) <= f7258c) {
                bVar = new C2211l(bVar, ((ImageView) this.f7277b).getWidth());
            }
        }
        super.mo8051a(bVar, cVar);
        this.f7260e = bVar;
        bVar.mo7964a(this.f7259d);
        bVar.start();
    }

    /* renamed from: g */
    public void mo8089g() {
        if (this.f7260e != null) {
            this.f7260e.start();
        }
    }

    /* renamed from: h */
    public void mo8090h() {
        if (this.f7260e != null) {
            this.f7260e.stop();
        }
    }
}
