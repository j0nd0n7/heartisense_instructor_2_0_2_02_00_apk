package android.support.p036v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0039r;
import android.support.annotation.C0044w;
import android.support.annotation.C0047z;
import android.support.p010v4.p028k.C0798c;
import android.support.p036v7.app.C1402c;
import android.support.p036v7.view.C1522b;
import android.support.p036v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v7.app.h */
public abstract class C1417h {

    /* renamed from: a */
    static final String f4416a = "AppCompatDelegate";

    /* renamed from: b */
    public static final int f4417b = 1;

    /* renamed from: c */
    public static final int f4418c = 2;

    /* renamed from: d */
    public static final int f4419d = 0;

    /* renamed from: e */
    public static final int f4420e = -1;

    /* renamed from: f */
    static final int f4421f = -100;

    /* renamed from: g */
    public static final int f4422g = 108;

    /* renamed from: h */
    public static final int f4423h = 109;

    /* renamed from: i */
    public static final int f4424i = 10;

    /* renamed from: j */
    private static int f4425j = -1;

    /* renamed from: k */
    private static boolean f4426k = false;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v7.app.h$a */
    public @interface C1418a {
    }

    C1417h() {
    }

    /* renamed from: a */
    public static C1417h m8336a(Activity activity, C1416g gVar) {
        return m8338a(activity, activity.getWindow(), gVar);
    }

    /* renamed from: a */
    public static C1417h m8337a(Dialog dialog, C1416g gVar) {
        return m8338a(dialog.getContext(), dialog.getWindow(), gVar);
    }

    /* renamed from: a */
    private static C1417h m8338a(Context context, Window window, C1416g gVar) {
        int i = Build.VERSION.SDK_INT;
        return C0798c.m4072a() ? new C1423j(context, window, gVar) : i >= 23 ? new C1430m(context, window, gVar) : i >= 14 ? new C1426l(context, window, gVar) : i >= 11 ? new C1425k(context, window, gVar) : new C1432n(context, window, gVar);
    }

    /* renamed from: b */
    public static void m8339b(boolean z) {
        f4426k = z;
    }

    /* renamed from: f */
    public static void m8340f(int i) {
        switch (i) {
            case -1:
            case 0:
            case 1:
            case 2:
                f4425j = i;
                return;
            default:
                Log.d(f4416a, "setDefaultNightMode() called with an unknown mode");
                return;
        }
    }

    /* renamed from: l */
    public static int m8341l() {
        return f4425j;
    }

    /* renamed from: m */
    public static boolean m8342m() {
        return f4426k;
    }

    @C0003aa
    /* renamed from: a */
    public abstract C1385a mo4849a();

    @C0003aa
    /* renamed from: a */
    public abstract C1522b mo4850a(@C0047z C1522b.C1523a aVar);

    @C0003aa
    /* renamed from: a */
    public abstract View mo4851a(@C0039r int i);

    /* renamed from: a */
    public abstract void mo4852a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo4853a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo4854a(@C0003aa Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo4855a(View view);

    /* renamed from: a */
    public abstract void mo4856a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo4857a(@C0003aa CharSequence charSequence);

    /* renamed from: a */
    public abstract void mo4858a(boolean z);

    /* renamed from: b */
    public abstract MenuInflater mo4859b();

    /* renamed from: b */
    public abstract View mo4860b(@C0003aa View view, String str, @C0047z Context context, @C0047z AttributeSet attributeSet);

    /* renamed from: b */
    public abstract void mo4861b(@C0044w int i);

    /* renamed from: b */
    public abstract void mo4862b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo4863b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo4864c();

    /* renamed from: c */
    public abstract void mo4865c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo4866c(int i);

    /* renamed from: d */
    public abstract void mo4867d();

    /* renamed from: d */
    public abstract boolean mo4868d(int i);

    /* renamed from: e */
    public abstract void mo4869e();

    /* renamed from: e */
    public abstract void mo4870e(int i);

    /* renamed from: f */
    public abstract void mo4871f();

    /* renamed from: g */
    public abstract void mo4872g();

    @C0003aa
    /* renamed from: h */
    public abstract C1402c.C1404a mo4873h();

    /* renamed from: i */
    public abstract void mo4874i();

    /* renamed from: j */
    public abstract boolean mo4875j();

    /* renamed from: k */
    public abstract boolean mo4876k();
}
