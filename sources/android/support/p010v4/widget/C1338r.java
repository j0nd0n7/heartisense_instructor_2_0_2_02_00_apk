package android.support.p010v4.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v4.widget.r */
public final class C1338r {

    /* renamed from: a */
    static final C1341c f4121a;

    /* renamed from: android.support.v4.widget.r$a */
    static class C1339a implements C1341c {
        C1339a() {
        }

        /* renamed from: a */
        public View.OnTouchListener mo4514a(Object obj, View view) {
            return null;
        }
    }

    /* renamed from: android.support.v4.widget.r$b */
    static class C1340b extends C1339a {
        C1340b() {
        }

        /* renamed from: a */
        public View.OnTouchListener mo4514a(Object obj, View view) {
            return C1342s.m7876a(obj, view);
        }
    }

    /* renamed from: android.support.v4.widget.r$c */
    interface C1341c {
        /* renamed from: a */
        View.OnTouchListener mo4514a(Object obj, View view);
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f4121a = new C1340b();
        } else {
            f4121a = new C1339a();
        }
    }

    private C1338r() {
    }

    /* renamed from: a */
    public static View.OnTouchListener m7872a(Object obj, View view) {
        return f4121a.mo4514a(obj, view);
    }
}
