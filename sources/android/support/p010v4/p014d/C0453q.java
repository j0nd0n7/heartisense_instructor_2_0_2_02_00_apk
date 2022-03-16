package android.support.p010v4.p014d;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.support.p010v4.p033o.C0884g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.d.q */
public class C0453q<D> {

    /* renamed from: p */
    int f1991p;

    /* renamed from: q */
    C0456c<D> f1992q;

    /* renamed from: r */
    C0455b<D> f1993r;

    /* renamed from: s */
    Context f1994s;

    /* renamed from: t */
    boolean f1995t = false;

    /* renamed from: u */
    boolean f1996u = false;

    /* renamed from: v */
    boolean f1997v = true;

    /* renamed from: w */
    boolean f1998w = false;

    /* renamed from: x */
    boolean f1999x = false;

    /* renamed from: android.support.v4.d.q$a */
    public final class C0454a extends ContentObserver {
        public C0454a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C0453q.this.mo1766H();
        }
    }

    /* renamed from: android.support.v4.d.q$b */
    public interface C0455b<D> {
        /* renamed from: a */
        void mo1307a(C0453q<D> qVar);
    }

    /* renamed from: android.support.v4.d.q$c */
    public interface C0456c<D> {
        /* renamed from: a */
        void mo1308a(C0453q<D> qVar, D d);
    }

    public C0453q(Context context) {
        this.f1994s = context.getApplicationContext();
    }

    /* renamed from: A */
    public void mo1759A() {
        this.f1995t = false;
        mo1738k();
    }

    /* renamed from: B */
    public void mo1760B() {
        this.f1996u = true;
        mo1761C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo1761C() {
    }

    /* renamed from: D */
    public void mo1762D() {
        mo1739l();
        this.f1997v = true;
        this.f1995t = false;
        this.f1996u = false;
        this.f1998w = false;
        this.f1999x = false;
    }

    /* renamed from: E */
    public boolean mo1763E() {
        boolean z = this.f1998w;
        this.f1998w = false;
        this.f1999x |= z;
        return z;
    }

    /* renamed from: F */
    public void mo1764F() {
        this.f1999x = false;
    }

    /* renamed from: G */
    public void mo1765G() {
        if (this.f1999x) {
            mo1766H();
        }
    }

    /* renamed from: H */
    public void mo1766H() {
        if (this.f1995t) {
            mo1781z();
        } else {
            this.f1998w = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1704a() {
    }

    /* renamed from: a */
    public void mo1767a(int i, C0456c<D> cVar) {
        if (this.f1992q != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f1992q = cVar;
        this.f1991p = i;
    }

    /* renamed from: a */
    public void mo1768a(C0455b<D> bVar) {
        if (this.f1993r != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f1993r = bVar;
    }

    /* renamed from: a */
    public void mo1769a(C0456c<D> cVar) {
        if (this.f1992q == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1992q != cVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f1992q = null;
        }
    }

    /* renamed from: a */
    public void mo1708a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f1991p);
        printWriter.print(" mListener=");
        printWriter.println(this.f1992q);
        if (this.f1995t || this.f1998w || this.f1999x) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f1995t);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f1998w);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f1999x);
        }
        if (this.f1996u || this.f1997v) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f1996u);
            printWriter.print(" mReset=");
            printWriter.println(this.f1997v);
        }
    }

    /* renamed from: b */
    public void mo1770b(C0455b<D> bVar) {
        if (this.f1993r == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1993r != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f1993r = null;
        }
    }

    /* renamed from: b */
    public void mo1733b(D d) {
        if (this.f1992q != null) {
            this.f1992q.mo1308a(this, d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1710b() {
        return false;
    }

    /* renamed from: c */
    public String mo1771c(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0884g.m4428a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo1737j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo1738k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo1739l() {
    }

    /* renamed from: r */
    public void mo1772r() {
        if (this.f1993r != null) {
            this.f1993r.mo1307a(this);
        }
    }

    /* renamed from: s */
    public Context mo1773s() {
        return this.f1994s;
    }

    /* renamed from: t */
    public int mo1774t() {
        return this.f1991p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0884g.m4428a(this, sb);
        sb.append(" id=");
        sb.append(this.f1991p);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo1776u() {
        return this.f1995t;
    }

    /* renamed from: v */
    public boolean mo1777v() {
        return this.f1996u;
    }

    /* renamed from: w */
    public boolean mo1778w() {
        return this.f1997v;
    }

    /* renamed from: x */
    public final void mo1779x() {
        this.f1995t = true;
        this.f1997v = false;
        this.f1996u = false;
        mo1737j();
    }

    /* renamed from: y */
    public boolean mo1780y() {
        return mo1710b();
    }

    /* renamed from: z */
    public void mo1781z() {
        mo1704a();
    }
}
