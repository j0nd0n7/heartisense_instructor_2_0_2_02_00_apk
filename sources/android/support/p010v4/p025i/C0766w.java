package android.support.p010v4.p025i;

import android.os.SystemClock;
import android.view.KeyEvent;

@Deprecated
/* renamed from: android.support.v4.i.w */
public abstract class C0766w {

    /* renamed from: a */
    static final int f2848a = 1;

    /* renamed from: b */
    static final int f2849b = 2;

    /* renamed from: c */
    static final int f2850c = 3;

    /* renamed from: d */
    static final int f2851d = -1;

    /* renamed from: e */
    static final int f2852e = -2;

    /* renamed from: f */
    static final int f2853f = -3;

    @Deprecated
    /* renamed from: a */
    public abstract void mo2613a();

    @Deprecated
    /* renamed from: a */
    public void mo2614a(int i) {
        int i2 = 0;
        switch (i) {
            case -1:
                i2 = C0755t.f2803j;
                break;
        }
        if (i2 != 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            mo2616a(i2, new KeyEvent(uptimeMillis, uptimeMillis, 0, i2, 0));
            mo2618b(i2, new KeyEvent(uptimeMillis, uptimeMillis, 1, i2, 0));
        }
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo2615a(long j);

    @Deprecated
    /* renamed from: a */
    public boolean mo2616a(int i, KeyEvent keyEvent) {
        switch (i) {
            case 79:
            case 85:
                if (!mo2622f()) {
                    mo2613a();
                    break;
                } else {
                    mo2617b();
                    break;
                }
            case 86:
                mo2619c();
                break;
            case C0755t.f2802i /*126*/:
                mo2613a();
                break;
            case C0755t.f2803j /*127*/:
                mo2617b();
                break;
        }
        return true;
    }

    @Deprecated
    /* renamed from: b */
    public abstract void mo2617b();

    @Deprecated
    /* renamed from: b */
    public boolean mo2618b(int i, KeyEvent keyEvent) {
        return true;
    }

    @Deprecated
    /* renamed from: c */
    public abstract void mo2619c();

    @Deprecated
    /* renamed from: d */
    public abstract long mo2620d();

    @Deprecated
    /* renamed from: e */
    public abstract long mo2621e();

    @Deprecated
    /* renamed from: f */
    public abstract boolean mo2622f();

    @Deprecated
    /* renamed from: g */
    public int mo2623g() {
        return 100;
    }

    @Deprecated
    /* renamed from: h */
    public int mo2624h() {
        return 60;
    }
}
