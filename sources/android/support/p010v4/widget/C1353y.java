package android.support.p010v4.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v4.widget.y */
public final class C1353y {

    /* renamed from: a */
    static final C1356c f4186a;

    /* renamed from: android.support.v4.widget.y$a */
    static class C1354a implements C1356c {
        C1354a() {
        }

        /* renamed from: a */
        public View.OnTouchListener mo4574a(Object obj) {
            return null;
        }
    }

    /* renamed from: android.support.v4.widget.y$b */
    static class C1355b extends C1354a {
        C1355b() {
        }

        /* renamed from: a */
        public View.OnTouchListener mo4574a(Object obj) {
            return C1357z.m7936a(obj);
        }
    }

    /* renamed from: android.support.v4.widget.y$c */
    interface C1356c {
        /* renamed from: a */
        View.OnTouchListener mo4574a(Object obj);
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f4186a = new C1355b();
        } else {
            f4186a = new C1354a();
        }
    }

    private C1353y() {
    }

    /* renamed from: a */
    public static View.OnTouchListener m7932a(Object obj) {
        return f4186a.mo4574a(obj);
    }
}
