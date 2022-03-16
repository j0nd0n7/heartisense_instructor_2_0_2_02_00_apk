package com.p048a.p049a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.support.p010v4.p013c.C0186ad;
import android.support.p010v4.p013c.C0194ae;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.p048a.p049a.p053d.C1894a;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p055b.C1979d;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p055b.p057b.C1944a;
import com.p048a.p049a.p053d.p055b.p057b.C1962i;
import com.p048a.p049a.p053d.p055b.p059d.C1989b;
import com.p048a.p049a.p053d.p055b.p059d.C1991d;
import com.p048a.p049a.p053d.p060c.C2039c;
import com.p048a.p049a.p053d.p060c.C2041d;
import com.p048a.p049a.p053d.p060c.C2046g;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.C2056m;
import com.p048a.p049a.p053d.p060c.p061a.C2012a;
import com.p048a.p049a.p053d.p060c.p061a.C2015c;
import com.p048a.p049a.p053d.p060c.p061a.C2017d;
import com.p048a.p049a.p053d.p060c.p061a.C2019e;
import com.p048a.p049a.p053d.p060c.p062b.C2023b;
import com.p048a.p049a.p053d.p060c.p062b.C2026d;
import com.p048a.p049a.p053d.p060c.p062b.C2028e;
import com.p048a.p049a.p053d.p060c.p062b.C2031g;
import com.p048a.p049a.p053d.p060c.p062b.C2033h;
import com.p048a.p049a.p053d.p060c.p062b.C2035i;
import com.p048a.p049a.p053d.p060c.p062b.C2037j;
import com.p048a.p049a.p053d.p063d.p064a.C2069f;
import com.p048a.p049a.p053d.p063d.p064a.C2074h;
import com.p048a.p049a.p053d.p063d.p064a.C2076j;
import com.p048a.p049a.p053d.p063d.p064a.C2077k;
import com.p048a.p049a.p053d.p063d.p064a.C2085o;
import com.p048a.p049a.p053d.p063d.p064a.C2088q;
import com.p048a.p049a.p053d.p063d.p066c.C2097b;
import com.p048a.p049a.p053d.p063d.p067d.C2103d;
import com.p048a.p049a.p053d.p063d.p068e.C2108b;
import com.p048a.p049a.p053d.p063d.p068e.C2110c;
import com.p048a.p049a.p053d.p063d.p069f.C2127a;
import com.p048a.p049a.p053d.p063d.p069f.C2134f;
import com.p048a.p049a.p053d.p063d.p069f.C2135g;
import com.p048a.p049a.p053d.p063d.p070g.C2138c;
import com.p048a.p049a.p053d.p063d.p070g.C2140e;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import com.p048a.p049a.p053d.p063d.p070g.C2142g;
import com.p048a.p049a.p071e.C2162k;
import com.p048a.p049a.p072f.C2169a;
import com.p048a.p049a.p072f.C2170b;
import com.p048a.p049a.p073g.C2173b;
import com.p048a.p049a.p073g.C2174c;
import com.p048a.p049a.p074h.C2181a;
import com.p048a.p049a.p074h.C2217c;
import com.p048a.p049a.p074h.p075a.C2185c;
import com.p048a.p049a.p074h.p076b.C2206g;
import com.p048a.p049a.p074h.p076b.C2213m;
import com.p048a.p049a.p074h.p076b.C2214n;
import com.p048a.p049a.p078j.C2238i;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/* renamed from: com.a.a.l */
public class C2243l {

    /* renamed from: a */
    private static final String f7342a = "Glide";

    /* renamed from: b */
    private static volatile C2243l f7343b;

    /* renamed from: c */
    private final C2039c f7344c;

    /* renamed from: d */
    private final C1979d f7345d;

    /* renamed from: e */
    private final C1921c f7346e;

    /* renamed from: f */
    private final C1962i f7347f;

    /* renamed from: g */
    private final C1894a f7348g;

    /* renamed from: h */
    private final C2206g f7349h = new C2206g();

    /* renamed from: i */
    private final C2142g f7350i = new C2142g();

    /* renamed from: j */
    private final C2174c f7351j;

    /* renamed from: k */
    private final C2069f f7352k;

    /* renamed from: l */
    private final C2134f f7353l;

    /* renamed from: m */
    private final C2076j f7354m;

    /* renamed from: n */
    private final C2134f f7355n;

    /* renamed from: o */
    private final Handler f7356o;

    /* renamed from: p */
    private final C1989b f7357p;

    /* renamed from: com.a.a.l$a */
    private static class C2244a extends C2214n<View, Object> {
        public C2244a(View view) {
            super(view);
        }

        /* renamed from: a */
        public void mo8208a(Drawable drawable) {
        }

        /* renamed from: a */
        public void mo8210a(Exception exc, Drawable drawable) {
        }

        /* renamed from: a */
        public void mo8051a(Object obj, C2185c<? super Object> cVar) {
        }

        /* renamed from: b */
        public void mo8211b(Drawable drawable) {
        }
    }

    C2243l(C1979d dVar, C1962i iVar, C1921c cVar, Context context, C1894a aVar) {
        this.f7345d = dVar;
        this.f7346e = cVar;
        this.f7347f = iVar;
        this.f7348g = aVar;
        this.f7344c = new C2039c(context);
        this.f7356o = new Handler(Looper.getMainLooper());
        this.f7357p = new C1989b(iVar, cVar, aVar);
        this.f7351j = new C2174c();
        C2088q qVar = new C2088q(cVar, aVar);
        this.f7351j.mo8179a(InputStream.class, Bitmap.class, qVar);
        C2074h hVar = new C2074h(cVar, aVar);
        this.f7351j.mo8179a(ParcelFileDescriptor.class, Bitmap.class, hVar);
        C2085o oVar = new C2085o(qVar, hVar);
        this.f7351j.mo8179a(C2046g.class, Bitmap.class, oVar);
        C2110c cVar2 = new C2110c(context, cVar);
        this.f7351j.mo8179a(InputStream.class, C2108b.class, cVar2);
        this.f7351j.mo8179a(C2046g.class, C2127a.class, new C2135g(oVar, cVar2, cVar));
        this.f7351j.mo8179a(InputStream.class, File.class, new C2103d());
        mo8357a(File.class, ParcelFileDescriptor.class, new C2012a.C2013a());
        mo8357a(File.class, InputStream.class, new C2028e.C2029a());
        mo8357a(Integer.TYPE, ParcelFileDescriptor.class, new C2015c.C2016a());
        mo8357a(Integer.TYPE, InputStream.class, new C2031g.C2032a());
        mo8357a(Integer.class, ParcelFileDescriptor.class, new C2015c.C2016a());
        mo8357a(Integer.class, InputStream.class, new C2031g.C2032a());
        mo8357a(String.class, ParcelFileDescriptor.class, new C2017d.C2018a());
        mo8357a(String.class, InputStream.class, new C2033h.C2034a());
        mo8357a(Uri.class, ParcelFileDescriptor.class, new C2019e.C2020a());
        mo8357a(Uri.class, InputStream.class, new C2035i.C2036a());
        mo8357a(URL.class, InputStream.class, new C2037j.C2038a());
        mo8357a(C2041d.class, InputStream.class, new C2023b.C2024a());
        mo8357a(byte[].class, InputStream.class, new C2026d.C2027a());
        this.f7350i.mo8078a(Bitmap.class, C2077k.class, new C2140e(context.getResources(), cVar));
        this.f7350i.mo8078a(C2127a.class, C2097b.class, new C2138c(new C2140e(context.getResources(), cVar)));
        this.f7352k = new C2069f(cVar);
        this.f7353l = new C2134f(cVar, (C2146g<Bitmap>) this.f7352k);
        this.f7354m = new C2076j(cVar);
        this.f7355n = new C2134f(cVar, (C2146g<Bitmap>) this.f7354m);
    }

    /* renamed from: a */
    public static <T> C2055l<T, InputStream> m12744a(Class<T> cls, Context context) {
        return m12745a(cls, InputStream.class, context);
    }

    /* renamed from: a */
    public static <T, Y> C2055l<T, Y> m12745a(Class<T> cls, Class<Y> cls2, Context context) {
        if (cls != null) {
            return m12761b(context).m12764m().mo7910b(cls, cls2);
        }
        if (Log.isLoggable(f7342a, 3)) {
            Log.d(f7342a, "Unable to load null model, setting placeholder only");
        }
        return null;
    }

    /* renamed from: a */
    public static <T> C2055l<T, InputStream> m12746a(T t, Context context) {
        return m12747a(t, InputStream.class, context);
    }

    /* renamed from: a */
    public static <T, Y> C2055l<T, Y> m12747a(T t, Class<Y> cls, Context context) {
        return m12745a(t != null ? t.getClass() : null, cls, context);
    }

    /* renamed from: a */
    public static C2256q m12748a(Activity activity) {
        return C2162k.m12249a().mo8108a(activity);
    }

    @TargetApi(11)
    /* renamed from: a */
    public static C2256q m12749a(Fragment fragment) {
        return C2162k.m12249a().mo8109a(fragment);
    }

    /* renamed from: a */
    public static C2256q m12750a(C0186ad adVar) {
        return C2162k.m12249a().mo8113a(adVar);
    }

    /* renamed from: a */
    public static C2256q m12751a(C0194ae aeVar) {
        return C2162k.m12249a().mo8114a(aeVar);
    }

    /* renamed from: a */
    public static File m12752a(Context context) {
        return m12753a(context, C1944a.C1945a.f6690d);
    }

    /* renamed from: a */
    public static File m12753a(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                return file;
            }
            return null;
        } else if (!Log.isLoggable(f7342a, 6)) {
            return null;
        } else {
            Log.e(f7342a, "default disk cache dir is null");
            return null;
        }
    }

    /* renamed from: a */
    public static void m12754a(View view) {
        m12756a((C2213m<?>) new C2244a(view));
    }

    /* renamed from: a */
    public static void m12755a(C2181a<?> aVar) {
        aVar.mo8186a();
    }

    /* renamed from: a */
    public static void m12756a(C2213m<?> mVar) {
        C2238i.m12729a();
        C2217c d_ = mVar.mo8212d_();
        if (d_ != null) {
            d_.mo8199d();
            mVar.mo8209a((C2217c) null);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m12757a(C2245m mVar) {
        if (m12758a()) {
            throw new IllegalArgumentException("Glide is already setup, check with isSetup() first");
        }
        f7343b = mVar.mo8371a();
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m12758a() {
        return f7343b != null;
    }

    /* renamed from: b */
    public static <T> C2055l<T, ParcelFileDescriptor> m12759b(Class<T> cls, Context context) {
        return m12745a(cls, ParcelFileDescriptor.class, context);
    }

    /* renamed from: b */
    public static <T> C2055l<T, ParcelFileDescriptor> m12760b(T t, Context context) {
        return m12747a(t, ParcelFileDescriptor.class, context);
    }

    /* renamed from: b */
    public static C2243l m12761b(Context context) {
        if (f7343b == null) {
            synchronized (C2243l.class) {
                if (f7343b == null) {
                    Context applicationContext = context.getApplicationContext();
                    List<C2169a> a = new C2170b(applicationContext).mo8166a();
                    C2245m mVar = new C2245m(applicationContext);
                    for (C2169a a2 : a) {
                        a2.mo8165a(applicationContext, mVar);
                    }
                    f7343b = mVar.mo8371a();
                    for (C2169a a3 : a) {
                        a3.mo8164a(applicationContext, f7343b);
                    }
                }
            }
        }
        return f7343b;
    }

    /* renamed from: b */
    static void m12762b() {
        f7343b = null;
    }

    /* renamed from: c */
    public static C2256q m12763c(Context context) {
        return C2162k.m12249a().mo8110a(context);
    }

    /* renamed from: m */
    private C2039c m12764m() {
        return this.f7344c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <Z, R> C2141f<Z, R> mo8353a(Class<Z> cls, Class<R> cls2) {
        return this.f7350i.mo8077a(cls, cls2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <R> C2213m<R> mo8354a(ImageView imageView, Class<R> cls) {
        return this.f7349h.mo8218a(imageView, cls);
    }

    /* renamed from: a */
    public void mo8355a(int i) {
        C2238i.m12729a();
        this.f7347f.mo7814a(i);
        this.f7346e.mo7766a(i);
    }

    /* renamed from: a */
    public void mo8356a(C2254o oVar) {
        C2238i.m12729a();
        this.f7347f.mo7820a(oVar.mo8388a());
        this.f7346e.mo7765a(oVar.mo8388a());
    }

    /* renamed from: a */
    public <T, Y> void mo8357a(Class<T> cls, Class<Y> cls2, C2056m<T, Y> mVar) {
        C2056m<T, Y> a = this.f7344c.mo7909a(cls, cls2, mVar);
        if (a != null) {
            a.mo7897a();
        }
    }

    /* renamed from: a */
    public void mo8358a(C1991d.C1992a... aVarArr) {
        this.f7357p.mo7855a(aVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T, Z> C2173b<T, Z> mo8359b(Class<T> cls, Class<Z> cls2) {
        return this.f7351j.mo8178a(cls, cls2);
    }

    /* renamed from: c */
    public C1921c mo8360c() {
        return this.f7346e;
    }

    @Deprecated
    /* renamed from: c */
    public <T, Y> void mo8361c(Class<T> cls, Class<Y> cls2) {
        C2056m<Y, Y> a = this.f7344c.mo7908a(cls, cls2);
        if (a != null) {
            a.mo7897a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1979d mo8362d() {
        return this.f7345d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C2069f mo8363e() {
        return this.f7352k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C2076j mo8364f() {
        return this.f7354m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2134f mo8365g() {
        return this.f7353l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2134f mo8366h() {
        return this.f7355n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Handler mo8367i() {
        return this.f7356o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C1894a mo8368j() {
        return this.f7348g;
    }

    /* renamed from: k */
    public void mo8369k() {
        C2238i.m12729a();
        this.f7347f.mo7822c();
        this.f7346e.mo7769b();
    }

    /* renamed from: l */
    public void mo8370l() {
        C2238i.m12733b();
        mo8362d().mo7842a();
    }
}
