package com.p048a.p049a.p053d.p060c;

import android.os.ParcelFileDescriptor;
import com.p048a.p049a.p053d.p054a.C1897c;
import java.io.InputStream;

/* renamed from: com.a.a.d.c.f */
public class C2044f<A> implements C2055l<A, C2046g> {

    /* renamed from: a */
    private static final String f6875a = "IVML";

    /* renamed from: b */
    private final C2055l<A, InputStream> f6876b;

    /* renamed from: c */
    private final C2055l<A, ParcelFileDescriptor> f6877c;

    /* renamed from: com.a.a.d.c.f$a */
    static class C2045a implements C1897c<C2046g> {

        /* renamed from: a */
        private final C1897c<InputStream> f6878a;

        /* renamed from: b */
        private final C1897c<ParcelFileDescriptor> f6879b;

        public C2045a(C1897c<InputStream> cVar, C1897c<ParcelFileDescriptor> cVar2) {
            this.f6878a = cVar;
            this.f6879b = cVar2;
        }

        /* renamed from: a */
        public void mo7712a() {
            if (this.f6878a != null) {
                this.f6878a.mo7712a();
            }
            if (this.f6879b != null) {
                this.f6879b.mo7712a();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[SYNTHETIC, Splitter:B:7:0x0013] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p048a.p049a.p053d.p060c.C2046g mo7711a(com.p048a.p049a.C2255p r6) {
            /*
                r5 = this;
                r2 = 0
                r4 = 2
                com.a.a.d.a.c<java.io.InputStream> r0 = r5.f6878a
                if (r0 == 0) goto L_0x004a
                com.a.a.d.a.c<java.io.InputStream> r0 = r5.f6878a     // Catch:{ Exception -> 0x0022 }
                java.lang.Object r0 = r0.mo7711a(r6)     // Catch:{ Exception -> 0x0022 }
                java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x0022 }
                r1 = r0
            L_0x000f:
                com.a.a.d.a.c<android.os.ParcelFileDescriptor> r0 = r5.f6879b
                if (r0 == 0) goto L_0x001c
                com.a.a.d.a.c<android.os.ParcelFileDescriptor> r0 = r5.f6879b     // Catch:{ Exception -> 0x0037 }
                java.lang.Object r0 = r0.mo7711a(r6)     // Catch:{ Exception -> 0x0037 }
                android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0     // Catch:{ Exception -> 0x0037 }
                r2 = r0
            L_0x001c:
                com.a.a.d.c.g r0 = new com.a.a.d.c.g
                r0.<init>(r1, r2)
                return r0
            L_0x0022:
                r0 = move-exception
                java.lang.String r1 = "IVML"
                boolean r1 = android.util.Log.isLoggable(r1, r4)
                if (r1 == 0) goto L_0x0032
                java.lang.String r1 = "IVML"
                java.lang.String r3 = "Exception fetching input stream, trying ParcelFileDescriptor"
                android.util.Log.v(r1, r3, r0)
            L_0x0032:
                com.a.a.d.a.c<android.os.ParcelFileDescriptor> r1 = r5.f6879b
                if (r1 != 0) goto L_0x004a
                throw r0
            L_0x0037:
                r0 = move-exception
                java.lang.String r3 = "IVML"
                boolean r3 = android.util.Log.isLoggable(r3, r4)
                if (r3 == 0) goto L_0x0047
                java.lang.String r3 = "IVML"
                java.lang.String r4 = "Exception fetching ParcelFileDescriptor"
                android.util.Log.v(r3, r4, r0)
            L_0x0047:
                if (r1 != 0) goto L_0x001c
                throw r0
            L_0x004a:
                r1 = r2
                goto L_0x000f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.p053d.p060c.C2044f.C2045a.mo7711a(com.a.a.p):com.a.a.d.c.g");
        }

        /* renamed from: b */
        public String mo7714b() {
            return this.f6878a != null ? this.f6878a.mo7714b() : this.f6879b.mo7714b();
        }

        /* renamed from: c */
        public void mo7715c() {
            if (this.f6878a != null) {
                this.f6878a.mo7715c();
            }
            if (this.f6879b != null) {
                this.f6879b.mo7715c();
            }
        }
    }

    public C2044f(C2055l<A, InputStream> lVar, C2055l<A, ParcelFileDescriptor> lVar2) {
        if (lVar == null && lVar2 == null) {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.f6876b = lVar;
        this.f6877c = lVar2;
    }

    /* renamed from: a */
    public C1897c<C2046g> mo7901a(A a, int i, int i2) {
        C1897c<InputStream> a2 = this.f6876b != null ? this.f6876b.mo7901a(a, i, i2) : null;
        C1897c<ParcelFileDescriptor> a3 = this.f6877c != null ? this.f6877c.mo7901a(a, i, i2) : null;
        if (a2 == null && a3 == null) {
            return null;
        }
        return new C2045a(a2, a3);
    }
}
