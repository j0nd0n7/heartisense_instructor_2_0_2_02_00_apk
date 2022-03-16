package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.annotation.C0047z;
import android.support.p036v7.app.C1417h;
import java.lang.ref.WeakReference;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.br */
public class C1811br extends Resources {

    /* renamed from: a */
    public static final int f6134a = 20;

    /* renamed from: b */
    private final WeakReference<Context> f6135b;

    public C1811br(@C0047z Context context, @C0047z Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f6135b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m11020a() {
        return C1417h.m8342m() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo7319a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f6135b.get();
        return context != null ? C1849m.m11201a().mo7453a(context, this, i) : super.getDrawable(i);
    }
}
