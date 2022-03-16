package android.support.p036v7.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p010v4.p014d.p016b.C0420a;
import android.support.p010v4.view.C1086bd;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.view.ViewConfiguration;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.a */
public class C1521a {

    /* renamed from: a */
    private Context f4745a;

    private C1521a(Context context) {
        this.f4745a = context;
    }

    /* renamed from: a */
    public static C1521a m8870a(Context context) {
        return new C1521a(context);
    }

    /* renamed from: a */
    public int mo5113a() {
        Resources resources = this.f4745a.getResources();
        int b = C0420a.m2328b(resources);
        int a = C0420a.m2327a(resources);
        if (C0420a.m2329c(resources) > 600 || b > 600 || ((b > 960 && a > 720) || (b > 720 && a > 960))) {
            return 5;
        }
        if (b >= 500 || ((b > 640 && a > 480) || (b > 480 && a > 640))) {
            return 4;
        }
        return b >= 360 ? 3 : 2;
    }

    /* renamed from: b */
    public boolean mo5114b() {
        return Build.VERSION.SDK_INT >= 19 || !C1086bd.m6526b(ViewConfiguration.get(this.f4745a));
    }

    /* renamed from: c */
    public int mo5115c() {
        return this.f4745a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public boolean mo5116d() {
        return this.f4745a.getResources().getBoolean(C1359b.C1362c.abc_action_bar_embed_tabs);
    }

    /* renamed from: e */
    public int mo5117e() {
        TypedArray obtainStyledAttributes = this.f4745a.obtainStyledAttributes((AttributeSet) null, C1359b.C1371l.ActionBar, C1359b.C1361b.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C1359b.C1371l.ActionBar_height, 0);
        Resources resources = this.f4745a.getResources();
        if (!mo5116d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C1359b.C1364e.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo5118f() {
        return this.f4745a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public int mo5119g() {
        return this.f4745a.getResources().getDimensionPixelSize(C1359b.C1364e.abc_action_bar_stacked_tab_max_width);
    }
}
