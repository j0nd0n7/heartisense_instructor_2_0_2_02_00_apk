package android.support.p010v4.p025i;

import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p010v4.p025i.C0772z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.i.y */
public abstract class C0768y {

    /* renamed from: a */
    public static final int f2854a = 0;

    /* renamed from: b */
    public static final int f2855b = 1;

    /* renamed from: c */
    public static final int f2856c = 2;

    /* renamed from: d */
    private final int f2857d;

    /* renamed from: e */
    private final int f2858e;

    /* renamed from: f */
    private int f2859f;

    /* renamed from: g */
    private C0770a f2860g;

    /* renamed from: h */
    private Object f2861h;

    /* renamed from: android.support.v4.i.y$a */
    public static abstract class C0770a {
        /* renamed from: a */
        public abstract void mo2318a(C0768y yVar);
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.y$b */
    public @interface C0771b {
    }

    public C0768y(int i, int i2, int i3) {
        this.f2857d = i;
        this.f2858e = i2;
        this.f2859f = i3;
    }

    /* renamed from: a */
    public final int mo2627a() {
        return this.f2859f;
    }

    /* renamed from: a */
    public final void mo2628a(int i) {
        this.f2859f = i;
        Object d = mo2634d();
        if (d != null) {
            C0772z.m4004a(d, i);
        }
        if (this.f2860g != null) {
            this.f2860g.mo2318a(this);
        }
    }

    /* renamed from: a */
    public void mo2629a(C0770a aVar) {
        this.f2860g = aVar;
    }

    /* renamed from: b */
    public final int mo2630b() {
        return this.f2857d;
    }

    /* renamed from: b */
    public void mo2631b(int i) {
    }

    /* renamed from: c */
    public final int mo2632c() {
        return this.f2858e;
    }

    /* renamed from: c */
    public void mo2633c(int i) {
    }

    /* renamed from: d */
    public Object mo2634d() {
        if (this.f2861h != null || Build.VERSION.SDK_INT < 21) {
            return this.f2861h;
        }
        this.f2861h = C0772z.m4003a(this.f2857d, this.f2858e, this.f2859f, new C0772z.C0774a() {
            /* renamed from: a */
            public void mo2635a(int i) {
                C0768y.this.mo2631b(i);
            }

            /* renamed from: b */
            public void mo2636b(int i) {
                C0768y.this.mo2633c(i);
            }
        });
        return this.f2861h;
    }
}
