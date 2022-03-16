package android.support.p010v4.p014d;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.support.p010v4.p028k.C0799d;
import android.support.p010v4.p028k.C0807i;

/* renamed from: android.support.v4.d.b */
public final class C0416b {

    /* renamed from: a */
    private static final C0417a f1952a;

    /* renamed from: android.support.v4.d.b$a */
    interface C0417a {
        /* renamed from: a */
        Cursor mo1723a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0799d dVar);
    }

    /* renamed from: android.support.v4.d.b$b */
    static class C0418b implements C0417a {
        C0418b() {
        }

        /* renamed from: a */
        public Cursor mo1723a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0799d dVar) {
            if (dVar != null) {
                dVar.mo2668b();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
    }

    /* renamed from: android.support.v4.d.b$c */
    static class C0419c extends C0418b {
        C0419c() {
        }

        /* renamed from: a */
        public Cursor mo1723a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0799d dVar) {
            Object obj;
            if (dVar != null) {
                try {
                    obj = dVar.mo2670d();
                } catch (Exception e) {
                    if (C0433c.m2369a(e)) {
                        throw new C0807i();
                    }
                    throw e;
                }
            } else {
                obj = null;
            }
            return C0433c.m2368a(contentResolver, uri, strArr, str, strArr2, str2, obj);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f1952a = new C0419c();
        } else {
            f1952a = new C0418b();
        }
    }

    private C0416b() {
    }

    /* renamed from: a */
    public static Cursor m2323a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0799d dVar) {
        return f1952a.mo1723a(contentResolver, uri, strArr, str, strArr2, str2, dVar);
    }
}
