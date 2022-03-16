package android.support.p010v4.p014d;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.d.m */
public class C0443m extends ContentProvider {

    /* renamed from: a */
    private static final String[] f1967a = {"_display_name", "_size"};

    /* renamed from: b */
    private static final String f1968b = "android.support.FILE_PROVIDER_PATHS";

    /* renamed from: c */
    private static final String f1969c = "root-path";

    /* renamed from: d */
    private static final String f1970d = "files-path";

    /* renamed from: e */
    private static final String f1971e = "cache-path";

    /* renamed from: f */
    private static final String f1972f = "external-path";

    /* renamed from: g */
    private static final String f1973g = "external-files-path";

    /* renamed from: h */
    private static final String f1974h = "external-cache-path";

    /* renamed from: i */
    private static final String f1975i = "name";

    /* renamed from: j */
    private static final String f1976j = "path";

    /* renamed from: k */
    private static final File f1977k = new File("/");

    /* renamed from: l */
    private static HashMap<String, C0444a> f1978l = new HashMap<>();

    /* renamed from: m */
    private C0444a f1979m;

    /* renamed from: android.support.v4.d.m$a */
    interface C0444a {
        /* renamed from: a */
        Uri mo1753a(File file);

        /* renamed from: a */
        File mo1754a(Uri uri);
    }

    /* renamed from: android.support.v4.d.m$b */
    static class C0445b implements C0444a {

        /* renamed from: a */
        private final String f1980a;

        /* renamed from: b */
        private final HashMap<String, File> f1981b = new HashMap<>();

        public C0445b(String str) {
            this.f1980a = str;
        }

        /* renamed from: a */
        public Uri mo1753a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry next : this.f1981b.entrySet()) {
                    String path = ((File) next.getValue()).getPath();
                    if (!canonicalPath.startsWith(path) || (entry != null && path.length() <= ((File) entry.getValue()).getPath().length())) {
                        next = entry;
                    }
                    entry = next;
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme("content").authority(this.f1980a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* renamed from: a */
        public File mo1754a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f1981b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        /* renamed from: a */
        public void mo1755a(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f1981b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }
    }

    /* renamed from: a */
    private static int m2424a(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: a */
    public static Uri m2425a(Context context, String str, File file) {
        return m2426a(context, str).mo1753a(file);
    }

    /* renamed from: a */
    private static C0444a m2426a(Context context, String str) {
        C0444a aVar;
        synchronized (f1978l) {
            aVar = f1978l.get(str);
            if (aVar == null) {
                try {
                    aVar = m2430b(context, str);
                    f1978l.put(str, aVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static File m2427a(File file, String... strArr) {
        int length = strArr.length;
        int i = 0;
        File file2 = file;
        while (i < length) {
            String str = strArr[i];
            i++;
            file2 = str != null ? new File(file2, str) : file2;
        }
        return file2;
    }

    /* renamed from: a */
    private static Object[] m2428a(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: a */
    private static String[] m2429a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: b */
    private static C0444a m2430b(Context context, String str) {
        File file;
        C0445b bVar = new C0445b(str);
        XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(str, 128).loadXmlMetaData(context.getPackageManager(), f1968b);
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                String attributeValue = loadXmlMetaData.getAttributeValue((String) null, f1975i);
                String attributeValue2 = loadXmlMetaData.getAttributeValue((String) null, f1976j);
                if (f1969c.equals(name)) {
                    file = f1977k;
                } else if (f1970d.equals(name)) {
                    file = context.getFilesDir();
                } else if (f1971e.equals(name)) {
                    file = context.getCacheDir();
                } else if (f1972f.equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else {
                    if (f1973g.equals(name)) {
                        File[] a = C0434d.m2377a(context, (String) null);
                        if (a.length > 0) {
                            file = a[0];
                        }
                    } else if (f1974h.equals(name)) {
                        File[] c = C0434d.m2382c(context);
                        if (c.length > 0) {
                            file = c[0];
                        }
                    }
                    file = null;
                }
                if (file != null) {
                    bVar.mo1755a(attributeValue, m2427a(file, attributeValue2));
                }
            }
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        } else {
            this.f1979m = m2426a(context, providerInfo.authority);
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f1979m.mo1754a(uri).delete() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r0.getName().substring(r1 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r4) {
        /*
            r3 = this;
            android.support.v4.d.m$a r0 = r3.f1979m
            java.io.File r0 = r0.mo1754a((android.net.Uri) r4)
            java.lang.String r1 = r0.getName()
            r2 = 46
            int r1 = r1.lastIndexOf(r2)
            if (r1 < 0) goto L_0x0027
            java.lang.String r0 = r0.getName()
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = r1.getMimeTypeFromExtension(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            return r0
        L_0x0027:
            java.lang.String r0 = "application/octet-stream"
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p014d.C0443m.getType(android.net.Uri):java.lang.String");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.f1979m.mo1754a(uri), m2424a(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a = this.f1979m.mo1754a(uri);
        if (strArr == null) {
            strArr = f1967a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str3 = strArr[i2];
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i = i3 + 1;
                objArr[i3] = a.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i = i3 + 1;
                objArr[i3] = Long.valueOf(a.length());
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        String[] a2 = m2429a(strArr3, i3);
        Object[] a3 = m2428a(objArr, i3);
        MatrixCursor matrixCursor = new MatrixCursor(a2, 1);
        matrixCursor.addRow(a3);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
