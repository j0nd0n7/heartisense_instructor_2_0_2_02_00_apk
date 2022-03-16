package com.p048a.p049a.p074h.p076b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.p048a.p049a.p053d.p063d.p066c.C2097b;

/* renamed from: com.a.a.h.b.g */
public class C2206g {
    /* renamed from: a */
    public <Z> C2213m<Z> mo8218a(ImageView imageView, Class<Z> cls) {
        if (C2097b.class.isAssignableFrom(cls)) {
            return new C2204e(imageView);
        }
        if (Bitmap.class.equals(cls)) {
            return new C2202c(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C2203d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
