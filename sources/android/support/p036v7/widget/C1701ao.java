package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.C0003aa;
import android.support.p036v7.widget.C1732az;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.v7.widget.ao */
public class C1701ao extends C1732az.C1768t {

    /* renamed from: a */
    public static final int f5714a = -1;

    /* renamed from: b */
    public static final int f5715b = 1;

    /* renamed from: c */
    public static final int f5716c = 0;

    /* renamed from: i */
    private static final String f5717i = "LinearSmoothScroller";

    /* renamed from: j */
    private static final boolean f5718j = false;

    /* renamed from: k */
    private static final float f5719k = 25.0f;

    /* renamed from: l */
    private static final int f5720l = 10000;

    /* renamed from: m */
    private static final float f5721m = 1.2f;

    /* renamed from: d */
    protected final LinearInterpolator f5722d = new LinearInterpolator();

    /* renamed from: e */
    protected final DecelerateInterpolator f5723e = new DecelerateInterpolator();

    /* renamed from: f */
    protected PointF f5724f;

    /* renamed from: g */
    protected int f5725g = 0;

    /* renamed from: h */
    protected int f5726h = 0;

    /* renamed from: n */
    private final float f5727n;

    public C1701ao(Context context) {
        this.f5727n = mo6435a(context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    private int m10166a(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo6435a(DisplayMetrics displayMetrics) {
        return f5719k / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6436a(int i) {
        return (int) Math.ceil(((double) mo6443b(i)) / 0.3356d);
    }

    /* renamed from: a */
    public int mo6437a(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case -1:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 > 0) {
                    return i6;
                }
                int i7 = i4 - i2;
                if (i7 >= 0) {
                    return 0;
                }
                return i7;
            case 1:
                return i4 - i2;
            default:
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: a */
    public int mo6438a(View view, int i) {
        C1732az.C1750h e = mo7023e();
        if (e == null || !e.mo5847h()) {
            return 0;
        }
        C1732az.C1755i iVar = (C1732az.C1755i) view.getLayoutParams();
        return mo6437a(e.mo6935p(view) - iVar.topMargin, e.mo6937r(view) + iVar.bottomMargin, e.mo6845N(), e.mo6843L() - e.mo6847P(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6439a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6440a(int i, int i2, C1732az.C1771u uVar, C1732az.C1768t.C1769a aVar) {
        if (mo7030j() == 0) {
            mo7025f();
            return;
        }
        this.f5725g = m10166a(this.f5725g, i);
        this.f5726h = m10166a(this.f5726h, i2);
        if (this.f5725g == 0 && this.f5726h == 0) {
            mo6441a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6441a(C1732az.C1768t.C1769a aVar) {
        PointF c = mo6447c(mo7029i());
        if (c == null || (c.x == 0.0f && c.y == 0.0f)) {
            aVar.mo7031a(mo7029i());
            mo7025f();
            return;
        }
        mo7019a(c);
        this.f5724f = c;
        this.f5725g = (int) (c.x * 10000.0f);
        this.f5726h = (int) (c.y * 10000.0f);
        aVar.mo7032a((int) (((float) this.f5725g) * f5721m), (int) (((float) this.f5726h) * f5721m), (int) (((float) mo6443b(f5720l)) * f5721m), this.f5722d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6442a(View view, C1732az.C1771u uVar, C1732az.C1768t.C1769a aVar) {
        int b = mo6444b(view, mo6446c());
        int a = mo6438a(view, mo6448d());
        int a2 = mo6436a((int) Math.sqrt((double) ((b * b) + (a * a))));
        if (a2 > 0) {
            aVar.mo7032a(-b, -a, a2, this.f5723e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo6443b(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.f5727n));
    }

    /* renamed from: b */
    public int mo6444b(View view, int i) {
        C1732az.C1750h e = mo7023e();
        if (e == null || !e.mo5845g()) {
            return 0;
        }
        C1732az.C1755i iVar = (C1732az.C1755i) view.getLayoutParams();
        return mo6437a(e.mo6934o(view) - iVar.leftMargin, e.mo6936q(view) + iVar.rightMargin, e.mo6844M(), e.mo6842K() - e.mo6846O(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6445b() {
        this.f5726h = 0;
        this.f5725g = 0;
        this.f5724f = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo6446c() {
        if (this.f5724f == null || this.f5724f.x == 0.0f) {
            return 0;
        }
        return this.f5724f.x > 0.0f ? 1 : -1;
    }

    @C0003aa
    /* renamed from: c */
    public PointF mo6447c(int i) {
        C1732az.C1750h e = mo7023e();
        if (e instanceof C1732az.C1768t.C1770b) {
            return ((C1732az.C1768t.C1770b) e).mo5835d(i);
        }
        Log.w(f5717i, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C1732az.C1768t.C1770b.class.getCanonicalName());
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo6448d() {
        if (this.f5724f == null || this.f5724f.y == 0.0f) {
            return 0;
        }
        return this.f5724f.y > 0.0f ? 1 : -1;
    }
}
