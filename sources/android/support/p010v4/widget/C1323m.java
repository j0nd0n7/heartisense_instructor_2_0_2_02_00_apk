package android.support.p010v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;

/* renamed from: android.support.v4.widget.m */
public final class C1323m {

    /* renamed from: b */
    private static final C1326c f4098b;

    /* renamed from: a */
    private Object f4099a;

    /* renamed from: android.support.v4.widget.m$a */
    static class C1324a implements C1326c {
        C1324a() {
        }

        /* renamed from: a */
        public Object mo4476a(Context context) {
            return null;
        }

        /* renamed from: a */
        public void mo4477a(Object obj, int i, int i2) {
        }

        /* renamed from: a */
        public boolean mo4478a(Object obj) {
            return true;
        }

        /* renamed from: a */
        public boolean mo4479a(Object obj, float f) {
            return false;
        }

        /* renamed from: a */
        public boolean mo4480a(Object obj, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo4481a(Object obj, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo4482a(Object obj, Canvas canvas) {
            return false;
        }

        /* renamed from: b */
        public void mo4483b(Object obj) {
        }

        /* renamed from: c */
        public boolean mo4484c(Object obj) {
            return false;
        }
    }

    /* renamed from: android.support.v4.widget.m$b */
    static class C1325b implements C1326c {
        C1325b() {
        }

        /* renamed from: a */
        public Object mo4476a(Context context) {
            return C1328n.m7792a(context);
        }

        /* renamed from: a */
        public void mo4477a(Object obj, int i, int i2) {
            C1328n.m7793a(obj, i, i2);
        }

        /* renamed from: a */
        public boolean mo4478a(Object obj) {
            return C1328n.m7794a(obj);
        }

        /* renamed from: a */
        public boolean mo4479a(Object obj, float f) {
            return C1328n.m7795a(obj, f);
        }

        /* renamed from: a */
        public boolean mo4480a(Object obj, float f, float f2) {
            return C1328n.m7795a(obj, f);
        }

        /* renamed from: a */
        public boolean mo4481a(Object obj, int i) {
            return C1328n.m7796a(obj, i);
        }

        /* renamed from: a */
        public boolean mo4482a(Object obj, Canvas canvas) {
            return C1328n.m7797a(obj, canvas);
        }

        /* renamed from: b */
        public void mo4483b(Object obj) {
            C1328n.m7798b(obj);
        }

        /* renamed from: c */
        public boolean mo4484c(Object obj) {
            return C1328n.m7799c(obj);
        }
    }

    /* renamed from: android.support.v4.widget.m$c */
    interface C1326c {
        /* renamed from: a */
        Object mo4476a(Context context);

        /* renamed from: a */
        void mo4477a(Object obj, int i, int i2);

        /* renamed from: a */
        boolean mo4478a(Object obj);

        /* renamed from: a */
        boolean mo4479a(Object obj, float f);

        /* renamed from: a */
        boolean mo4480a(Object obj, float f, float f2);

        /* renamed from: a */
        boolean mo4481a(Object obj, int i);

        /* renamed from: a */
        boolean mo4482a(Object obj, Canvas canvas);

        /* renamed from: b */
        void mo4483b(Object obj);

        /* renamed from: c */
        boolean mo4484c(Object obj);
    }

    /* renamed from: android.support.v4.widget.m$d */
    static class C1327d extends C1325b {
        C1327d() {
        }

        /* renamed from: a */
        public boolean mo4480a(Object obj, float f, float f2) {
            return C1329o.m7800a(obj, f, f2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f4098b = new C1327d();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f4098b = new C1325b();
        } else {
            f4098b = new C1324a();
        }
    }

    public C1323m(Context context) {
        this.f4099a = f4098b.mo4476a(context);
    }

    /* renamed from: a */
    public void mo4468a(int i, int i2) {
        f4098b.mo4477a(this.f4099a, i, i2);
    }

    /* renamed from: a */
    public boolean mo4469a() {
        return f4098b.mo4478a(this.f4099a);
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo4470a(float f) {
        return f4098b.mo4479a(this.f4099a, f);
    }

    /* renamed from: a */
    public boolean mo4471a(float f, float f2) {
        return f4098b.mo4480a(this.f4099a, f, f2);
    }

    /* renamed from: a */
    public boolean mo4472a(int i) {
        return f4098b.mo4481a(this.f4099a, i);
    }

    /* renamed from: a */
    public boolean mo4473a(Canvas canvas) {
        return f4098b.mo4482a(this.f4099a, canvas);
    }

    /* renamed from: b */
    public void mo4474b() {
        f4098b.mo4483b(this.f4099a);
    }

    /* renamed from: c */
    public boolean mo4475c() {
        return f4098b.mo4484c(this.f4099a);
    }
}
