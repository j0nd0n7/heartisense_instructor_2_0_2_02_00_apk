package com.p048a.p049a.p053d.p063d.p064a;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.p060c.C2046g;
import java.io.InputStream;

/* renamed from: com.a.a.d.d.a.n */
public class C2084n implements C2144e<C2046g, Bitmap> {

    /* renamed from: a */
    private static final String f6974a = "ImageVideoDecoder";

    /* renamed from: b */
    private final C2144e<InputStream, Bitmap> f6975b;

    /* renamed from: c */
    private final C2144e<ParcelFileDescriptor, Bitmap> f6976c;

    public C2084n(C2144e<InputStream, Bitmap> eVar, C2144e<ParcelFileDescriptor, Bitmap> eVar2) {
        this.f6975b = eVar;
        this.f6976c = eVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r1 = r5.mo7922b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p048a.p049a.p053d.p055b.C2006l<android.graphics.Bitmap> mo7949a(com.p048a.p049a.p053d.p060c.C2046g r5, int r6, int r7) {
        /*
            r4 = this;
            r1 = 0
            java.io.InputStream r0 = r5.mo7921a()
            if (r0 == 0) goto L_0x002d
            com.a.a.d.e<java.io.InputStream, android.graphics.Bitmap> r2 = r4.f6975b     // Catch:{ IOException -> 0x001c }
            com.a.a.d.b.l r0 = r2.mo7949a(r0, r6, r7)     // Catch:{ IOException -> 0x001c }
        L_0x000d:
            if (r0 != 0) goto L_0x001b
            android.os.ParcelFileDescriptor r1 = r5.mo7922b()
            if (r1 == 0) goto L_0x001b
            com.a.a.d.e<android.os.ParcelFileDescriptor, android.graphics.Bitmap> r0 = r4.f6976c
            com.a.a.d.b.l r0 = r0.mo7949a(r1, r6, r7)
        L_0x001b:
            return r0
        L_0x001c:
            r0 = move-exception
            java.lang.String r2 = "ImageVideoDecoder"
            r3 = 2
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x002d
            java.lang.String r2 = "ImageVideoDecoder"
            java.lang.String r3 = "Failed to load image from stream, trying FileDescriptor"
            android.util.Log.v(r2, r3, r0)
        L_0x002d:
            r0 = r1
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.p053d.p063d.p064a.C2084n.mo7949a(com.a.a.d.c.g, int, int):com.a.a.d.b.l");
    }

    /* renamed from: a */
    public String mo7950a() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
