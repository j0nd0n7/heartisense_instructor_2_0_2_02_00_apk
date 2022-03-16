package android.support.p010v4.p014d;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.p010v4.p014d.C0453q;
import android.support.p010v4.p028k.C0799d;
import android.support.p010v4.p028k.C0807i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: android.support.v4.d.k */
public class C0441k extends C0413a<Cursor> {

    /* renamed from: h */
    final C0453q<Cursor>.a f1959h = new C0453q.C0454a();

    /* renamed from: i */
    Uri f1960i;

    /* renamed from: j */
    String[] f1961j;

    /* renamed from: k */
    String f1962k;

    /* renamed from: l */
    String[] f1963l;

    /* renamed from: m */
    String f1964m;

    /* renamed from: n */
    Cursor f1965n;

    /* renamed from: o */
    C0799d f1966o;

    public C0441k(Context context) {
        super(context);
    }

    public C0441k(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f1960i = uri;
        this.f1961j = strArr;
        this.f1962k = str;
        this.f1963l = strArr2;
        this.f1964m = str2;
    }

    /* renamed from: a */
    public void mo1733b(Cursor cursor) {
        if (!mo1778w()) {
            Cursor cursor2 = this.f1965n;
            this.f1965n = cursor;
            if (mo1776u()) {
                super.mo1733b(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: a */
    public void mo1729a(Uri uri) {
        this.f1960i = uri;
    }

    /* renamed from: a */
    public void mo1730a(String str) {
        this.f1962k = str;
    }

    /* renamed from: a */
    public void mo1708a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo1708a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f1960i);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f1961j));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f1962k);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f1963l));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f1964m);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f1965n);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f1998w);
    }

    /* renamed from: a */
    public void mo1731a(String[] strArr) {
        this.f1961j = strArr;
    }

    /* renamed from: b */
    public void mo1707a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: b */
    public void mo1734b(String str) {
        this.f1964m = str;
    }

    /* renamed from: b */
    public void mo1735b(String[] strArr) {
        this.f1963l = strArr;
    }

    /* renamed from: f */
    public void mo1714f() {
        super.mo1714f();
        synchronized (this) {
            if (this.f1966o != null) {
                this.f1966o.mo2669c();
            }
        }
    }

    /* renamed from: i */
    public Cursor mo1712d() {
        Cursor a;
        synchronized (this) {
            if (mo1715g()) {
                throw new C0807i();
            }
            this.f1966o = new C0799d();
        }
        try {
            a = C0416b.m2323a(mo1773s().getContentResolver(), this.f1960i, this.f1961j, this.f1962k, this.f1963l, this.f1964m, this.f1966o);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f1959h);
            }
            synchronized (this) {
                this.f1966o = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.f1966o = null;
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo1737j() {
        if (this.f1965n != null) {
            mo1733b(this.f1965n);
        }
        if (mo1763E() || this.f1965n == null) {
            mo1781z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo1738k() {
        mo1780y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo1739l() {
        super.mo1739l();
        mo1738k();
        if (this.f1965n != null && !this.f1965n.isClosed()) {
            this.f1965n.close();
        }
        this.f1965n = null;
    }

    /* renamed from: m */
    public Uri mo1740m() {
        return this.f1960i;
    }

    /* renamed from: n */
    public String[] mo1741n() {
        return this.f1961j;
    }

    /* renamed from: o */
    public String mo1742o() {
        return this.f1962k;
    }

    /* renamed from: p */
    public String[] mo1743p() {
        return this.f1963l;
    }

    /* renamed from: q */
    public String mo1744q() {
        return this.f1964m;
    }
}
