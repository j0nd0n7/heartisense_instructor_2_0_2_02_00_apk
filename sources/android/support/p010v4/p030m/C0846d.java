package android.support.p010v4.p030m;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: android.support.v4.m.d */
class C0846d extends C0843a {

    /* renamed from: b */
    private File f2954b;

    C0846d(C0843a aVar, File file) {
        super(aVar);
        this.f2954b = file;
    }

    /* renamed from: b */
    private static boolean m4220b(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= m4220b(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r2.substring(r0 + 1).toLowerCase());
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m4221d(java.lang.String r2) {
        /*
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            if (r0 < 0) goto L_0x001d
            int r0 = r0 + 1
            java.lang.String r0 = r2.substring(r0)
            java.lang.String r0 = r0.toLowerCase()
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = r1.getMimeTypeFromExtension(r0)
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            return r0
        L_0x001d:
            java.lang.String r0 = "application/octet-stream"
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p030m.C0846d.m4221d(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public Uri mo2739a() {
        return Uri.fromFile(this.f2954b);
    }

    /* renamed from: a */
    public C0843a mo2740a(String str) {
        File file = new File(this.f2954b, str);
        if (file.isDirectory() || file.mkdir()) {
            return new C0846d(this, file);
        }
        return null;
    }

    /* renamed from: a */
    public C0843a mo2741a(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f2954b, str2);
        try {
            file.createNewFile();
            return new C0846d(this, file);
        } catch (IOException e) {
            Log.w("DocumentFile", "Failed to createFile: " + e);
            return null;
        }
    }

    /* renamed from: b */
    public String mo2743b() {
        return this.f2954b.getName();
    }

    /* renamed from: c */
    public String mo2744c() {
        if (this.f2954b.isDirectory()) {
            return null;
        }
        return m4221d(this.f2954b.getName());
    }

    /* renamed from: c */
    public boolean mo2745c(String str) {
        File file = new File(this.f2954b.getParentFile(), str);
        if (!this.f2954b.renameTo(file)) {
            return false;
        }
        this.f2954b = file;
        return true;
    }

    /* renamed from: e */
    public boolean mo2747e() {
        return this.f2954b.isDirectory();
    }

    /* renamed from: f */
    public boolean mo2748f() {
        return this.f2954b.isFile();
    }

    /* renamed from: g */
    public boolean mo2749g() {
        return false;
    }

    /* renamed from: h */
    public long mo2750h() {
        return this.f2954b.lastModified();
    }

    /* renamed from: i */
    public long mo2751i() {
        return this.f2954b.length();
    }

    /* renamed from: j */
    public boolean mo2752j() {
        return this.f2954b.canRead();
    }

    /* renamed from: k */
    public boolean mo2753k() {
        return this.f2954b.canWrite();
    }

    /* renamed from: l */
    public boolean mo2754l() {
        m4220b(this.f2954b);
        return this.f2954b.delete();
    }

    /* renamed from: m */
    public boolean mo2755m() {
        return this.f2954b.exists();
    }

    /* renamed from: n */
    public C0843a[] mo2756n() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f2954b.listFiles();
        if (listFiles != null) {
            for (File dVar : listFiles) {
                arrayList.add(new C0846d(this, dVar));
            }
        }
        return (C0843a[]) arrayList.toArray(new C0843a[arrayList.size()]);
    }
}
