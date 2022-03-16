package com.p048a.p049a.p053d.p063d.p064a;

import android.graphics.Bitmap;
import android.util.Log;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p078j.C2234e;
import com.p048a.p049a.p078j.C2238i;
import java.io.OutputStream;

/* renamed from: com.a.a.d.d.a.c */
public class C2066c implements C2145f<Bitmap> {

    /* renamed from: a */
    private static final String f6916a = "BitmapEncoder";

    /* renamed from: b */
    private static final int f6917b = 90;

    /* renamed from: c */
    private Bitmap.CompressFormat f6918c;

    /* renamed from: d */
    private int f6919d;

    public C2066c() {
        this((Bitmap.CompressFormat) null, 90);
    }

    public C2066c(Bitmap.CompressFormat compressFormat, int i) {
        this.f6918c = compressFormat;
        this.f6919d = i;
    }

    /* renamed from: a */
    private Bitmap.CompressFormat m11956a(Bitmap bitmap) {
        return this.f6918c != null ? this.f6918c : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    /* renamed from: a */
    public String mo7743a() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }

    /* renamed from: a */
    public boolean mo7744a(C2006l<Bitmap> lVar, OutputStream outputStream) {
        Bitmap b = lVar.mo7887b();
        long a = C2234e.m12706a();
        Bitmap.CompressFormat a2 = m11956a(b);
        b.compress(a2, this.f6919d, outputStream);
        if (!Log.isLoggable(f6916a, 2)) {
            return true;
        }
        Log.v(f6916a, "Compressed with type: " + a2 + " of size " + C2238i.m12731b(b) + " in " + C2234e.m12705a(a));
        return true;
    }
}
