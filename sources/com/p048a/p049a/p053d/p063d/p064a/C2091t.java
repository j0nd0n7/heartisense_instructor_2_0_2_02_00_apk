package com.p048a.p049a.p053d.p063d.p064a;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.p048a.p049a.p053d.C1894a;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;

/* renamed from: com.a.a.d.d.a.t */
public class C2091t implements C2064a<ParcelFileDescriptor> {

    /* renamed from: a */
    private static final C2092a f6999a = new C2092a();

    /* renamed from: b */
    private static final int f7000b = -1;

    /* renamed from: c */
    private C2092a f7001c;

    /* renamed from: d */
    private int f7002d;

    /* renamed from: com.a.a.d.d.a.t$a */
    static class C2092a {
        C2092a() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo8010a() {
            return new MediaMetadataRetriever();
        }
    }

    public C2091t() {
        this(f6999a, -1);
    }

    public C2091t(int i) {
        this(f6999a, m12052a(i));
    }

    C2091t(C2092a aVar) {
        this(aVar, -1);
    }

    C2091t(C2092a aVar, int i) {
        this.f7001c = aVar;
        this.f7002d = i;
    }

    /* renamed from: a */
    private static int m12052a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Requested frame must be non-negative");
    }

    /* renamed from: a */
    public Bitmap mo7951a(ParcelFileDescriptor parcelFileDescriptor, C1921c cVar, int i, int i2, C1894a aVar) {
        MediaMetadataRetriever a = this.f7001c.mo8010a();
        a.setDataSource(parcelFileDescriptor.getFileDescriptor());
        Bitmap frameAtTime = this.f7002d >= 0 ? a.getFrameAtTime((long) this.f7002d) : a.getFrameAtTime();
        a.release();
        parcelFileDescriptor.close();
        return frameAtTime;
    }

    /* renamed from: a */
    public String mo7952a() {
        return "VideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
