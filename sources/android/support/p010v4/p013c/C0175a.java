package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0015aj;
import android.support.annotation.C0036o;
import android.support.p010v4.p014d.C0434d;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1161h;
import android.support.p010v4.widget.C1307j;
import android.view.MenuItem;
import android.view.View;

@Deprecated
/* renamed from: android.support.v4.c.a */
public class C0175a implements C1307j.C1313f {

    /* renamed from: b */
    private static final C0176a f1074b;

    /* renamed from: c */
    private static final float f1075c = 0.33333334f;

    /* renamed from: d */
    private static final int f1076d = 16908332;

    /* renamed from: a */
    final Activity f1077a;

    /* renamed from: e */
    private final C0180e f1078e;

    /* renamed from: f */
    private final C1307j f1079f;

    /* renamed from: g */
    private boolean f1080g;

    /* renamed from: h */
    private boolean f1081h;

    /* renamed from: i */
    private Drawable f1082i;

    /* renamed from: j */
    private Drawable f1083j;

    /* renamed from: k */
    private C0182g f1084k;

    /* renamed from: l */
    private final int f1085l;

    /* renamed from: m */
    private final int f1086m;

    /* renamed from: n */
    private final int f1087n;

    /* renamed from: o */
    private Object f1088o;

    /* renamed from: android.support.v4.c.a$a */
    private interface C0176a {
        /* renamed from: a */
        Drawable mo752a(Activity activity);

        /* renamed from: a */
        Object mo753a(Object obj, Activity activity, int i);

        /* renamed from: a */
        Object mo754a(Object obj, Activity activity, Drawable drawable, int i);
    }

    /* renamed from: android.support.v4.c.a$b */
    private static class C0177b implements C0176a {
        C0177b() {
        }

        /* renamed from: a */
        public Drawable mo752a(Activity activity) {
            return null;
        }

        /* renamed from: a */
        public Object mo753a(Object obj, Activity activity, int i) {
            return obj;
        }

        /* renamed from: a */
        public Object mo754a(Object obj, Activity activity, Drawable drawable, int i) {
            return obj;
        }
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    /* renamed from: android.support.v4.c.a$c */
    private static class C0178c implements C0176a {
        C0178c() {
        }

        /* renamed from: a */
        public Drawable mo752a(Activity activity) {
            return C0257b.m1570a(activity);
        }

        /* renamed from: a */
        public Object mo753a(Object obj, Activity activity, int i) {
            return C0257b.m1571a(obj, activity, i);
        }

        /* renamed from: a */
        public Object mo754a(Object obj, Activity activity, Drawable drawable, int i) {
            return C0257b.m1572a(obj, activity, drawable, i);
        }
    }

    @C0007ae(mo1a = 18)
    @TargetApi(18)
    /* renamed from: android.support.v4.c.a$d */
    private static class C0179d implements C0176a {
        C0179d() {
        }

        /* renamed from: a */
        public Drawable mo752a(Activity activity) {
            return C0354c.m2073a(activity);
        }

        /* renamed from: a */
        public Object mo753a(Object obj, Activity activity, int i) {
            return C0354c.m2074a(obj, activity, i);
        }

        /* renamed from: a */
        public Object mo754a(Object obj, Activity activity, Drawable drawable, int i) {
            return C0354c.m2075a(obj, activity, drawable, i);
        }
    }

    /* renamed from: android.support.v4.c.a$e */
    public interface C0180e {
        @C0003aa
        /* renamed from: a */
        Drawable mo755a();

        /* renamed from: a */
        void mo756a(@C0015aj int i);

        /* renamed from: a */
        void mo757a(Drawable drawable, @C0015aj int i);
    }

    /* renamed from: android.support.v4.c.a$f */
    public interface C0181f {
        @C0003aa
        /* renamed from: a */
        C0180e mo758a();
    }

    /* renamed from: android.support.v4.c.a$g */
    private class C0182g extends InsetDrawable implements Drawable.Callback {

        /* renamed from: a */
        final /* synthetic */ C0175a f1089a;

        /* renamed from: b */
        private final boolean f1090b;

        /* renamed from: c */
        private final Rect f1091c;

        /* renamed from: d */
        private float f1092d;

        /* renamed from: e */
        private float f1093e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0182g(C0175a aVar, Drawable drawable) {
            super(drawable, 0);
            boolean z = false;
            this.f1089a = aVar;
            this.f1090b = Build.VERSION.SDK_INT > 18 ? true : z;
            this.f1091c = new Rect();
        }

        /* renamed from: a */
        public float mo759a() {
            return this.f1092d;
        }

        /* renamed from: a */
        public void mo760a(float f) {
            this.f1092d = f;
            invalidateSelf();
        }

        /* renamed from: b */
        public void mo761b(float f) {
            this.f1093e = f;
            invalidateSelf();
        }

        public void draw(Canvas canvas) {
            int i = 1;
            copyBounds(this.f1091c);
            canvas.save();
            boolean z = C1040ar.m5947k(this.f1089a.f1077a.getWindow().getDecorView()) == 1;
            if (z) {
                i = -1;
            }
            int width = this.f1091c.width();
            canvas.translate(((float) i) * (-this.f1093e) * ((float) width) * this.f1092d, 0.0f);
            if (z && !this.f1090b) {
                canvas.translate((float) width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            f1074b = new C0179d();
        } else if (i >= 11) {
            f1074b = new C0178c();
        } else {
            f1074b = new C0177b();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0175a(Activity activity, C1307j jVar, @C0036o int i, @C0015aj int i2, @C0015aj int i3) {
        this(activity, jVar, !m845a((Context) activity), i, i2, i3);
    }

    public C0175a(Activity activity, C1307j jVar, boolean z, @C0036o int i, @C0015aj int i2, @C0015aj int i3) {
        this.f1080g = true;
        this.f1077a = activity;
        if (activity instanceof C0181f) {
            this.f1078e = ((C0181f) activity).mo758a();
        } else {
            this.f1078e = null;
        }
        this.f1079f = jVar;
        this.f1085l = i;
        this.f1086m = i2;
        this.f1087n = i3;
        this.f1082i = mo750c();
        this.f1083j = C0434d.m2370a((Context) activity, i);
        this.f1084k = new C0182g(this, this.f1083j);
        this.f1084k.mo761b(z ? f1075c : 0.0f);
    }

    /* renamed from: a */
    private static boolean m845a(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21 && Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    public void mo738a() {
        if (this.f1079f.mo4423g((int) C1161h.f3608c)) {
            this.f1084k.mo760a(1.0f);
        } else {
            this.f1084k.mo760a(0.0f);
        }
        if (this.f1080g) {
            mo742a((Drawable) this.f1084k, this.f1079f.mo4423g((int) C1161h.f3608c) ? this.f1087n : this.f1086m);
        }
    }

    /* renamed from: a */
    public void mo739a(int i) {
        Drawable drawable = null;
        if (i != 0) {
            drawable = C0434d.m2370a((Context) this.f1077a, i);
        }
        mo741a(drawable);
    }

    /* renamed from: a */
    public void mo740a(Configuration configuration) {
        if (!this.f1081h) {
            this.f1082i = mo750c();
        }
        this.f1083j = C0434d.m2370a((Context) this.f1077a, this.f1085l);
        mo738a();
    }

    /* renamed from: a */
    public void mo741a(Drawable drawable) {
        if (drawable == null) {
            this.f1082i = mo750c();
            this.f1081h = false;
        } else {
            this.f1082i = drawable;
            this.f1081h = true;
        }
        if (!this.f1080g) {
            mo742a(this.f1082i, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo742a(Drawable drawable, int i) {
        if (this.f1078e != null) {
            this.f1078e.mo757a(drawable, i);
        } else {
            this.f1088o = f1074b.mo754a(this.f1088o, this.f1077a, drawable, i);
        }
    }

    /* renamed from: a */
    public void mo743a(View view) {
        this.f1084k.mo760a(1.0f);
        if (this.f1080g) {
            mo751c(this.f1087n);
        }
    }

    /* renamed from: a */
    public void mo744a(View view, float f) {
        float a = this.f1084k.mo759a();
        this.f1084k.mo760a(f > 0.5f ? Math.max(a, Math.max(0.0f, f - 0.5f) * 2.0f) : Math.min(a, f * 2.0f));
    }

    /* renamed from: a */
    public void mo745a(boolean z) {
        if (z != this.f1080g) {
            if (z) {
                mo742a((Drawable) this.f1084k, this.f1079f.mo4423g((int) C1161h.f3608c) ? this.f1087n : this.f1086m);
            } else {
                mo742a(this.f1082i, 0);
            }
            this.f1080g = z;
        }
    }

    /* renamed from: a */
    public boolean mo746a(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != f1076d || !this.f1080g) {
            return false;
        }
        if (this.f1079f.mo4431h((int) C1161h.f3608c)) {
            this.f1079f.mo4421f((int) C1161h.f3608c);
        } else {
            this.f1079f.mo4420e((int) C1161h.f3608c);
        }
        return true;
    }

    /* renamed from: b */
    public void mo747b(int i) {
    }

    /* renamed from: b */
    public void mo748b(View view) {
        this.f1084k.mo760a(0.0f);
        if (this.f1080g) {
            mo751c(this.f1086m);
        }
    }

    /* renamed from: b */
    public boolean mo749b() {
        return this.f1080g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Drawable mo750c() {
        return this.f1078e != null ? this.f1078e.mo755a() : f1074b.mo752a(this.f1077a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo751c(int i) {
        if (this.f1078e != null) {
            this.f1078e.mo756a(i);
        } else {
            this.f1088o = f1074b.mo753a(this.f1088o, this.f1077a, i);
        }
    }
}
