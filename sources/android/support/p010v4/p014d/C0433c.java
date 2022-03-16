package android.support.p010v4.p014d;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.d.c */
class C0433c {
    C0433c() {
    }

    /* renamed from: a */
    public static Cursor m2368a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }

    /* renamed from: a */
    static boolean m2369a(Exception exc) {
        return exc instanceof OperationCanceledException;
    }
}
