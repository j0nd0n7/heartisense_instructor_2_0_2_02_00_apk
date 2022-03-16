package android.support.p010v4.p030m;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.File;

/* renamed from: android.support.v4.m.a */
public abstract class C0843a {

    /* renamed from: a */
    static final String f2949a = "DocumentFile";

    /* renamed from: b */
    private final C0843a f2950b;

    C0843a(C0843a aVar) {
        this.f2950b = aVar;
    }

    /* renamed from: a */
    public static C0843a m4174a(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C0847e((C0843a) null, context, uri);
        }
        return null;
    }

    /* renamed from: a */
    public static C0843a m4175a(File file) {
        return new C0846d((C0843a) null, file);
    }

    /* renamed from: b */
    public static C0843a m4176b(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0848f((C0843a) null, context, C0845c.m4216a(uri));
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m4177c(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0844b.m4200a(context, uri);
        }
        return false;
    }

    /* renamed from: a */
    public abstract Uri mo2739a();

    /* renamed from: a */
    public abstract C0843a mo2740a(String str);

    /* renamed from: a */
    public abstract C0843a mo2741a(String str, String str2);

    /* renamed from: b */
    public C0843a mo2742b(String str) {
        for (C0843a aVar : mo2756n()) {
            if (str.equals(aVar.mo2743b())) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public abstract String mo2743b();

    /* renamed from: c */
    public abstract String mo2744c();

    /* renamed from: c */
    public abstract boolean mo2745c(String str);

    /* renamed from: d */
    public C0843a mo2746d() {
        return this.f2950b;
    }

    /* renamed from: e */
    public abstract boolean mo2747e();

    /* renamed from: f */
    public abstract boolean mo2748f();

    /* renamed from: g */
    public abstract boolean mo2749g();

    /* renamed from: h */
    public abstract long mo2750h();

    /* renamed from: i */
    public abstract long mo2751i();

    /* renamed from: j */
    public abstract boolean mo2752j();

    /* renamed from: k */
    public abstract boolean mo2753k();

    /* renamed from: l */
    public abstract boolean mo2754l();

    /* renamed from: m */
    public abstract boolean mo2755m();

    /* renamed from: n */
    public abstract C0843a[] mo2756n();
}
