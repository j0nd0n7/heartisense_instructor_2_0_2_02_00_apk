package android.support.p036v7.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v7.widget.bs */
class C1812bs {

    /* renamed from: a */
    static final int f6136a = 1;

    /* renamed from: b */
    static final int f6137b = 2;

    /* renamed from: c */
    static final int f6138c = 4;

    /* renamed from: d */
    static final int f6139d = 0;

    /* renamed from: e */
    static final int f6140e = 1;

    /* renamed from: f */
    static final int f6141f = 2;

    /* renamed from: g */
    static final int f6142g = 4;

    /* renamed from: h */
    static final int f6143h = 4;

    /* renamed from: i */
    static final int f6144i = 16;

    /* renamed from: j */
    static final int f6145j = 32;

    /* renamed from: k */
    static final int f6146k = 64;

    /* renamed from: l */
    static final int f6147l = 8;

    /* renamed from: m */
    static final int f6148m = 256;

    /* renamed from: n */
    static final int f6149n = 512;

    /* renamed from: o */
    static final int f6150o = 1024;

    /* renamed from: p */
    static final int f6151p = 12;

    /* renamed from: q */
    static final int f6152q = 4096;

    /* renamed from: r */
    static final int f6153r = 8192;

    /* renamed from: s */
    static final int f6154s = 16384;

    /* renamed from: t */
    static final int f6155t = 7;

    /* renamed from: u */
    final C1814b f6156u;

    /* renamed from: v */
    C1813a f6157v = new C1813a();

    /* renamed from: android.support.v7.widget.bs$a */
    static class C1813a {

        /* renamed from: a */
        int f6158a = 0;

        /* renamed from: b */
        int f6159b;

        /* renamed from: c */
        int f6160c;

        /* renamed from: d */
        int f6161d;

        /* renamed from: e */
        int f6162e;

        C1813a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7323a() {
            this.f6158a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7324a(int i) {
            this.f6158a |= i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7325a(int i, int i2) {
            this.f6158a = (this.f6158a & (i2 ^ -1)) | (i & i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7326a(int i, int i2, int i3, int i4) {
            this.f6159b = i;
            this.f6160c = i2;
            this.f6161d = i3;
            this.f6162e = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo7327b(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo7328b() {
            if ((this.f6158a & 7) != 0 && (this.f6158a & (mo7327b(this.f6161d, this.f6159b) << 0)) == 0) {
                return false;
            }
            if ((this.f6158a & 112) != 0 && (this.f6158a & (mo7327b(this.f6161d, this.f6160c) << 4)) == 0) {
                return false;
            }
            if ((this.f6158a & 1792) == 0 || (this.f6158a & (mo7327b(this.f6162e, this.f6159b) << 8)) != 0) {
                return (this.f6158a & 28672) == 0 || (this.f6158a & (mo7327b(this.f6162e, this.f6160c) << 12)) != 0;
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.bs$b */
    interface C1814b {
        /* renamed from: a */
        int mo6944a();

        /* renamed from: a */
        int mo6945a(View view);

        /* renamed from: a */
        View mo6946a(int i);

        /* renamed from: b */
        int mo6947b(View view);

        /* renamed from: b */
        View mo6948b();

        /* renamed from: c */
        int mo6949c();

        /* renamed from: d */
        int mo6950d();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v7.widget.bs$c */
    public @interface C1815c {
    }

    C1812bs(C1814b bVar) {
        this.f6156u = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo7321a(int i, int i2, int i3, int i4) {
        int c = this.f6156u.mo6949c();
        int d = this.f6156u.mo6950d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.f6156u.mo6946a(i);
            this.f6157v.mo7326a(c, d, this.f6156u.mo6945a(a), this.f6156u.mo6947b(a));
            if (i3 != 0) {
                this.f6157v.mo7323a();
                this.f6157v.mo7324a(i3);
                if (this.f6157v.mo7328b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f6157v.mo7323a();
                this.f6157v.mo7324a(i4);
                if (this.f6157v.mo7328b()) {
                    i += i5;
                    view = a;
                }
            }
            a = view;
            i += i5;
            view = a;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7322a(View view, int i) {
        this.f6157v.mo7326a(this.f6156u.mo6949c(), this.f6156u.mo6950d(), this.f6156u.mo6945a(view), this.f6156u.mo6947b(view));
        if (i == 0) {
            return false;
        }
        this.f6157v.mo7323a();
        this.f6157v.mo7324a(i);
        return this.f6157v.mo7328b();
    }
}
