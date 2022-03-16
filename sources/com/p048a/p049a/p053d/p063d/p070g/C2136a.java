package com.p048a.p049a.p053d.p063d.p070g;

import android.graphics.Bitmap;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p063d.p065b.C2094a;
import java.io.ByteArrayOutputStream;

/* renamed from: com.a.a.d.d.g.a */
public class C2136a implements C2141f<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f7101a;

    /* renamed from: b */
    private final int f7102b;

    public C2136a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C2136a(Bitmap.CompressFormat compressFormat, int i) {
        this.f7101a = compressFormat;
        this.f7102b = i;
    }

    /* renamed from: a */
    public C2006l<byte[]> mo8075a(C2006l<Bitmap> lVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        lVar.mo7887b().compress(this.f7101a, this.f7102b, byteArrayOutputStream);
        lVar.mo7889d();
        return new C2094a(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: a */
    public String mo8076a() {
        return "BitmapBytesTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
