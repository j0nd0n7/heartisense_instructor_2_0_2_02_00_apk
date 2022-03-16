package android.support.p010v4.p030m;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.support.annotation.C0007ae;
import android.util.Log;
import java.util.ArrayList;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.m.c */
class C0845c {

    /* renamed from: a */
    private static final String f2953a = "DocumentFile";

    C0845c() {
    }

    /* renamed from: a */
    public static Uri m4214a(Context context, Uri uri, String str) {
        return m4215a(context, uri, "vnd.android.document/directory", str);
    }

    /* renamed from: a */
    public static Uri m4215a(Context context, Uri uri, String str, String str2) {
        return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
    }

    /* renamed from: a */
    public static Uri m4216a(Uri uri) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
    }

    /* renamed from: a */
    private static void m4217a(AutoCloseable autoCloseable) {
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
    public static Uri[] m4218a(Context context, Uri uri) {
        Cursor cursor;
        ContentResolver contentResolver = context.getContentResolver();
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        try {
            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            while (cursor.moveToNext()) {
                try {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursor.getString(0)));
                } catch (Exception e) {
                    e = e;
                    try {
                        Log.w(f2953a, "Failed query: " + e);
                        m4217a((AutoCloseable) cursor);
                        return (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                    } catch (Throwable th) {
                        th = th;
                        m4217a((AutoCloseable) cursor);
                        throw th;
                    }
                }
            }
            m4217a((AutoCloseable) cursor);
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            m4217a((AutoCloseable) cursor);
            throw th;
        }
        return (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
    }

    /* renamed from: b */
    public static Uri m4219b(Context context, Uri uri, String str) {
        return DocumentsContract.renameDocument(context.getContentResolver(), uri, str);
    }
}
