package android.support.p010v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.widget.CompoundButton;

/* renamed from: android.support.v4.widget.c */
public final class C1291c {

    /* renamed from: a */
    private static final C1294c f3994a;

    /* renamed from: android.support.v4.widget.c$a */
    static class C1292a extends C1295d {
        C1292a() {
        }

        /* renamed from: a */
        public Drawable mo4352a(CompoundButton compoundButton) {
            return C1296d.m7621a(compoundButton);
        }
    }

    /* renamed from: android.support.v4.widget.c$b */
    static class C1293b implements C1294c {
        C1293b() {
        }

        /* renamed from: a */
        public Drawable mo4352a(CompoundButton compoundButton) {
            return C1297e.m7626c(compoundButton);
        }

        /* renamed from: a */
        public void mo4353a(CompoundButton compoundButton, ColorStateList colorStateList) {
            C1297e.m7623a(compoundButton, colorStateList);
        }

        /* renamed from: a */
        public void mo4354a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            C1297e.m7624a(compoundButton, mode);
        }

        /* renamed from: b */
        public ColorStateList mo4355b(CompoundButton compoundButton) {
            return C1297e.m7622a(compoundButton);
        }

        /* renamed from: c */
        public PorterDuff.Mode mo4356c(CompoundButton compoundButton) {
            return C1297e.m7625b(compoundButton);
        }
    }

    /* renamed from: android.support.v4.widget.c$c */
    interface C1294c {
        /* renamed from: a */
        Drawable mo4352a(CompoundButton compoundButton);

        /* renamed from: a */
        void mo4353a(CompoundButton compoundButton, ColorStateList colorStateList);

        /* renamed from: a */
        void mo4354a(CompoundButton compoundButton, PorterDuff.Mode mode);

        /* renamed from: b */
        ColorStateList mo4355b(CompoundButton compoundButton);

        /* renamed from: c */
        PorterDuff.Mode mo4356c(CompoundButton compoundButton);
    }

    /* renamed from: android.support.v4.widget.c$d */
    static class C1295d extends C1293b {
        C1295d() {
        }

        /* renamed from: a */
        public void mo4353a(CompoundButton compoundButton, ColorStateList colorStateList) {
            C1298f.m7628a(compoundButton, colorStateList);
        }

        /* renamed from: a */
        public void mo4354a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            C1298f.m7629a(compoundButton, mode);
        }

        /* renamed from: b */
        public ColorStateList mo4355b(CompoundButton compoundButton) {
            return C1298f.m7627a(compoundButton);
        }

        /* renamed from: c */
        public PorterDuff.Mode mo4356c(CompoundButton compoundButton) {
            return C1298f.m7630b(compoundButton);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f3994a = new C1292a();
        } else if (i >= 21) {
            f3994a = new C1295d();
        } else {
            f3994a = new C1293b();
        }
    }

    private C1291c() {
    }

    @C0003aa
    /* renamed from: a */
    public static ColorStateList m7601a(@C0047z CompoundButton compoundButton) {
        return f3994a.mo4355b(compoundButton);
    }

    /* renamed from: a */
    public static void m7602a(@C0047z CompoundButton compoundButton, @C0003aa ColorStateList colorStateList) {
        f3994a.mo4353a(compoundButton, colorStateList);
    }

    /* renamed from: a */
    public static void m7603a(@C0047z CompoundButton compoundButton, @C0003aa PorterDuff.Mode mode) {
        f3994a.mo4354a(compoundButton, mode);
    }

    @C0003aa
    /* renamed from: b */
    public static PorterDuff.Mode m7604b(@C0047z CompoundButton compoundButton) {
        return f3994a.mo4356c(compoundButton);
    }

    @C0003aa
    /* renamed from: c */
    public static Drawable m7605c(@C0047z CompoundButton compoundButton) {
        return f3994a.mo4352a(compoundButton);
    }
}
