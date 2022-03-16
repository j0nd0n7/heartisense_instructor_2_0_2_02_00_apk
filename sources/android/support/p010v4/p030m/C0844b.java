package android.support.p010v4.p030m;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.support.annotation.C0007ae;
import android.text.TextUtils;
import android.util.Log;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.m.b */
class C0844b {

    /* renamed from: a */
    private static final String f2951a = "DocumentFile";

    /* renamed from: b */
    private static final int f2952b = 512;

    C0844b() {
    }

    /* renamed from: a */
    private static int m4196a(Context context, Uri uri, String str, int i) {
        return (int) m4197a(context, uri, str, (long) i);
    }

    /* renamed from: a */
    private static long m4197a(Context context, Uri uri, String str, long j) {
        Cursor cursor;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            try {
                if (!cursor.moveToFirst() || cursor.isNull(0)) {
                    m4199a(cursor);
                    return j;
                }
                j = cursor.getLong(0);
                m4199a(cursor);
                return j;
            } catch (Exception e) {
                e = e;
                try {
                    Log.w(f2951a, "Failed query: " + e);
                    m4199a(cursor);
                    return j;
                } catch (Throwable th) {
                    th = th;
                    m4199a(cursor);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            m4199a(cursor);
            throw th;
        }
    }

    /* renamed from: a */
    private static String m4198a(Context context, Uri uri, String str, String str2) {
        Cursor cursor;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            try {
                if (!cursor.moveToFirst() || cursor.isNull(0)) {
                    m4199a(cursor);
                    return str2;
                }
                str2 = cursor.getString(0);
                m4199a(cursor);
                return str2;
            } catch (Exception e) {
                e = e;
                try {
                    Log.w(f2951a, "Failed query: " + e);
                    m4199a(cursor);
                    return str2;
                } catch (Throwable th) {
                    th = th;
                    m4199a(cursor);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            m4199a(cursor);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m4199a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m4200a(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    /* renamed from: b */
    public static boolean m4201b(Context context, Uri uri) {
        return m4200a(context, uri) && (m4204e(context, uri) & 512) != 0;
    }

    /* renamed from: c */
    public static String m4202c(Context context, Uri uri) {
        return m4198a(context, uri, "_display_name", (String) null);
    }

    /* renamed from: d */
    public static String m4203d(Context context, Uri uri) {
        String n = m4213n(context, uri);
        if ("vnd.android.document/directory".equals(n)) {
            return null;
        }
        return n;
    }

    /* renamed from: e */
    public static long m4204e(Context context, Uri uri) {
        return m4197a(context, uri, "flags", 0);
    }

    /* renamed from: f */
    public static boolean m4205f(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(m4213n(context, uri));
    }

    /* renamed from: g */
    public static boolean m4206g(Context context, Uri uri) {
        String n = m4213n(context, uri);
        return !"vnd.android.document/directory".equals(n) && !TextUtils.isEmpty(n);
    }

    /* renamed from: h */
    public static long m4207h(Context context, Uri uri) {
        return m4197a(context, uri, "last_modified", 0);
    }

    /* renamed from: i */
    public static long m4208i(Context context, Uri uri) {
        return m4197a(context, uri, "_size", 0);
    }

    /* renamed from: j */
    public static boolean m4209j(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m4213n(context, uri));
    }

    /* renamed from: k */
    public static boolean m4210k(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String n = m4213n(context, uri);
        int a = m4196a(context, uri, "flags", 0);
        if (TextUtils.isEmpty(n)) {
            return false;
        }
        if ((a & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(n) || (a & 8) == 0) {
            return !TextUtils.isEmpty(n) && (a & 2) != 0;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m4211l(Context context, Uri uri) {
        return DocumentsContract.deleteDocument(context.getContentResolver(), uri);
    }

    /* renamed from: m */
    public static boolean m4212m(Context context, Uri uri) {
        Cursor cursor;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            try {
                boolean z = cursor.getCount() > 0;
                m4199a(cursor);
                return z;
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th) {
            th = th;
            cursor = null;
            m4199a(cursor);
            throw th;
        }
        try {
            Log.w(f2951a, "Failed query: " + e);
            m4199a(cursor);
            return false;
        } catch (Throwable th2) {
            th = th2;
            m4199a(cursor);
            throw th;
        }
    }

    /* renamed from: n */
    private static String m4213n(Context context, Uri uri) {
        return m4198a(context, uri, "mime_type", (String) null);
    }
}
