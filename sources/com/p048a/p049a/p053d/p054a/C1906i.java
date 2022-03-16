package com.p048a.p049a.p053d.p054a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.p048a.p049a.C2255p;
import com.p048a.p049a.p053d.p063d.p064a.C2080m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.a.a.d.a.i */
public class C1906i implements C1897c<InputStream> {

    /* renamed from: a */
    private static final String f6607a = "MediaStoreThumbFetcher";

    /* renamed from: b */
    private static final int f6608b = 512;

    /* renamed from: c */
    private static final int f6609c = 384;

    /* renamed from: d */
    private static final C1911e f6610d = new C1911e();

    /* renamed from: e */
    private final Context f6611e;

    /* renamed from: f */
    private final Uri f6612f;

    /* renamed from: g */
    private final C1897c<InputStream> f6613g;

    /* renamed from: h */
    private final int f6614h;

    /* renamed from: i */
    private final int f6615i;

    /* renamed from: j */
    private final C1911e f6616j;

    /* renamed from: k */
    private InputStream f6617k;

    /* renamed from: com.a.a.d.a.i$a */
    static class C1907a {
        C1907a() {
        }

        /* renamed from: a */
        public File mo7732a(String str) {
            return new File(str);
        }

        /* renamed from: a */
        public boolean mo7733a(File file) {
            return file.exists();
        }

        /* renamed from: b */
        public long mo7734b(File file) {
            return file.length();
        }
    }

    /* renamed from: com.a.a.d.a.i$b */
    static class C1908b implements C1909c {

        /* renamed from: a */
        private static final String[] f6618a = {"_data"};

        /* renamed from: b */
        private static final String f6619b = "kind = 1 AND image_id = ?";

        C1908b() {
        }

        /* renamed from: a */
        public Cursor mo7735a(Context context, Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return context.getContentResolver().query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f6618a, f6619b, new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: com.a.a.d.a.i$c */
    interface C1909c {
        /* renamed from: a */
        Cursor mo7735a(Context context, Uri uri);
    }

    /* renamed from: com.a.a.d.a.i$d */
    static class C1910d {

        /* renamed from: a */
        private static final C1907a f6620a = new C1907a();

        /* renamed from: b */
        private final C1907a f6621b;

        /* renamed from: c */
        private C1909c f6622c;

        public C1910d(C1907a aVar, C1909c cVar) {
            this.f6621b = aVar;
            this.f6622c = cVar;
        }

        public C1910d(C1909c cVar) {
            this(f6620a, cVar);
        }

        /* renamed from: a */
        private Uri m11558a(Cursor cursor) {
            String string = cursor.getString(0);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            File a = this.f6621b.mo7732a(string);
            if (!this.f6621b.mo7733a(a) || this.f6621b.mo7734b(a) <= 0) {
                return null;
            }
            return Uri.fromFile(a);
        }

        /* renamed from: a */
        public int mo7736a(Context context, Uri uri) {
            int i = -1;
            InputStream inputStream = null;
            try {
                inputStream = context.getContentResolver().openInputStream(uri);
                i = new C2080m(inputStream).mo7987c();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                    }
                }
            } catch (IOException e2) {
                if (Log.isLoggable(C1906i.f6607a, 3)) {
                    Log.d(C1906i.f6607a, "Failed to open uri: " + uri, e2);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
            return i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.InputStream mo7737b(android.content.Context r4, android.net.Uri r5) {
            /*
                r3 = this;
                r0 = 0
                com.a.a.d.a.i$c r1 = r3.f6622c
                android.database.Cursor r2 = r1.mo7735a(r4, r5)
                if (r2 == 0) goto L_0x002a
                boolean r1 = r2.moveToFirst()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x002a
                android.net.Uri r1 = r3.m11558a(r2)     // Catch:{ all -> 0x0023 }
            L_0x0013:
                if (r2 == 0) goto L_0x0018
                r2.close()
            L_0x0018:
                if (r1 == 0) goto L_0x0022
                android.content.ContentResolver r0 = r4.getContentResolver()
                java.io.InputStream r0 = r0.openInputStream(r1)
            L_0x0022:
                return r0
            L_0x0023:
                r0 = move-exception
                if (r2 == 0) goto L_0x0029
                r2.close()
            L_0x0029:
                throw r0
            L_0x002a:
                r1 = r0
                goto L_0x0013
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.p053d.p054a.C1906i.C1910d.mo7737b(android.content.Context, android.net.Uri):java.io.InputStream");
        }
    }

    /* renamed from: com.a.a.d.a.i$e */
    static class C1911e {
        C1911e() {
        }

        /* renamed from: a */
        public C1910d mo7738a(Uri uri, int i, int i2) {
            if (!C1906i.m11546c(uri) || i > 512 || i2 > C1906i.f6609c) {
                return null;
            }
            return C1906i.m11547d(uri) ? new C1910d(new C1912f()) : new C1910d(new C1908b());
        }
    }

    /* renamed from: com.a.a.d.a.i$f */
    static class C1912f implements C1909c {

        /* renamed from: a */
        private static final String[] f6623a = {"_data"};

        /* renamed from: b */
        private static final String f6624b = "kind = 1 AND video_id = ?";

        C1912f() {
        }

        /* renamed from: a */
        public Cursor mo7735a(Context context, Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return context.getContentResolver().query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f6623a, f6624b, new String[]{lastPathSegment}, (String) null);
        }
    }

    public C1906i(Context context, Uri uri, C1897c<InputStream> cVar, int i, int i2) {
        this(context, uri, cVar, i, i2, f6610d);
    }

    C1906i(Context context, Uri uri, C1897c<InputStream> cVar, int i, int i2, C1911e eVar) {
        this.f6611e = context;
        this.f6612f = uri;
        this.f6613g = cVar;
        this.f6614h = i;
        this.f6615i = i2;
        this.f6616j = eVar;
    }

    /* renamed from: a */
    private InputStream m11543a(C1910d dVar) {
        InputStream inputStream = null;
        try {
            inputStream = dVar.mo7737b(this.f6611e, this.f6612f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable(f6607a, 3)) {
                Log.d(f6607a, "Failed to find thumbnail file", e);
            }
        }
        int a = inputStream != null ? dVar.mo7736a(this.f6611e, this.f6612f) : -1;
        return a != -1 ? new C1898d(inputStream, a) : inputStream;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m11546c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m11547d(Uri uri) {
        return m11546c(uri) && uri.getPathSegments().contains("video");
    }

    /* renamed from: a */
    public void mo7712a() {
        if (this.f6617k != null) {
            try {
                this.f6617k.close();
            } catch (IOException e) {
            }
        }
        this.f6613g.mo7712a();
    }

    /* renamed from: b */
    public InputStream mo7711a(C2255p pVar) {
        C1910d a = this.f6616j.mo7738a(this.f6612f, this.f6614h, this.f6615i);
        if (a != null) {
            this.f6617k = m11543a(a);
        }
        if (this.f6617k == null) {
            this.f6617k = this.f6613g.mo7711a(pVar);
        }
        return this.f6617k;
    }

    /* renamed from: b */
    public String mo7714b() {
        return this.f6612f.toString();
    }

    /* renamed from: c */
    public void mo7715c() {
    }
}
