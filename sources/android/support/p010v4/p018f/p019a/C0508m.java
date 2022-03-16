package android.support.p010v4.p018f.p019a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import android.util.DisplayMetrics;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.f.a.m */
public abstract class C0508m extends Drawable {

    /* renamed from: c */
    private static final int f2070c = 3;

    /* renamed from: a */
    final Bitmap f2071a;

    /* renamed from: b */
    final Rect f2072b = new Rect();

    /* renamed from: d */
    private int f2073d = 160;

    /* renamed from: e */
    private int f2074e = 119;

    /* renamed from: f */
    private final Paint f2075f = new Paint(3);

    /* renamed from: g */
    private final BitmapShader f2076g;

    /* renamed from: h */
    private final Matrix f2077h = new Matrix();

    /* renamed from: i */
    private float f2078i;

    /* renamed from: j */
    private final RectF f2079j = new RectF();

    /* renamed from: k */
    private boolean f2080k = true;

    /* renamed from: l */
    private boolean f2081l;

    /* renamed from: m */
    private int f2082m;

    /* renamed from: n */
    private int f2083n;

    C0508m(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f2073d = resources.getDisplayMetrics().densityDpi;
        }
        this.f2071a = bitmap;
        if (this.f2071a != null) {
            m2652i();
            this.f2076g = new BitmapShader(this.f2071a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            return;
        }
        this.f2083n = -1;
        this.f2082m = -1;
        this.f2076g = null;
    }

    /* renamed from: b */
    private static boolean m2651b(float f) {
        return f > 0.05f;
    }

    /* renamed from: i */
    private void m2652i() {
        this.f2082m = this.f2071a.getScaledWidth(this.f2073d);
        this.f2083n = this.f2071a.getScaledHeight(this.f2073d);
    }

    /* renamed from: j */
    private void m2653j() {
        this.f2078i = (float) (Math.min(this.f2083n, this.f2082m) / 2);
    }

    /* renamed from: a */
    public final Paint mo1872a() {
        return this.f2075f;
    }

    /* renamed from: a */
    public void mo1873a(float f) {
        if (this.f2078i != f) {
            this.f2081l = false;
            if (m2651b(f)) {
                this.f2075f.setShader(this.f2076g);
            } else {
                this.f2075f.setShader((Shader) null);
            }
            this.f2078i = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo1874a(int i) {
        if (this.f2073d != i) {
            if (i == 0) {
                i = 160;
            }
            this.f2073d = i;
            if (this.f2071a != null) {
                m2652i();
            }
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1875a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo1876a(Canvas canvas) {
        mo1874a(canvas.getDensity());
    }

    /* renamed from: a */
    public void mo1877a(DisplayMetrics displayMetrics) {
        mo1874a(displayMetrics.densityDpi);
    }

    /* renamed from: a */
    public void mo1878a(boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Bitmap mo1879b() {
        return this.f2071a;
    }

    /* renamed from: b */
    public void mo1880b(int i) {
        if (this.f2074e != i) {
            this.f2074e = i;
            this.f2080k = true;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo1881b(boolean z) {
        this.f2075f.setAntiAlias(z);
        invalidateSelf();
    }

    /* renamed from: c */
    public int mo1882c() {
        return this.f2074e;
    }

    /* renamed from: c */
    public void mo1883c(boolean z) {
        this.f2081l = z;
        this.f2080k = true;
        if (z) {
            m2653j();
            this.f2075f.setShader(this.f2076g);
            invalidateSelf();
            return;
        }
        mo1873a(0.0f);
    }

    /* renamed from: d */
    public boolean mo1884d() {
        throw new UnsupportedOperationException();
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f2071a;
        if (bitmap != null) {
            mo1887f();
            if (this.f2075f.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f2072b, this.f2075f);
            } else {
                canvas.drawRoundRect(this.f2079j, this.f2078i, this.f2078i, this.f2075f);
            }
        }
    }

    /* renamed from: e */
    public boolean mo1886e() {
        return this.f2075f.isAntiAlias();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1887f() {
        if (this.f2080k) {
            if (this.f2081l) {
                int min = Math.min(this.f2082m, this.f2083n);
                mo1875a(this.f2074e, min, min, getBounds(), this.f2072b);
                int min2 = Math.min(this.f2072b.width(), this.f2072b.height());
                this.f2072b.inset(Math.max(0, (this.f2072b.width() - min2) / 2), Math.max(0, (this.f2072b.height() - min2) / 2));
                this.f2078i = ((float) min2) * 0.5f;
            } else {
                mo1875a(this.f2074e, this.f2082m, this.f2083n, getBounds(), this.f2072b);
            }
            this.f2079j.set(this.f2072b);
            if (this.f2076g != null) {
                this.f2077h.setTranslate(this.f2079j.left, this.f2079j.top);
                this.f2077h.preScale(this.f2079j.width() / ((float) this.f2071a.getWidth()), this.f2079j.height() / ((float) this.f2071a.getHeight()));
                this.f2076g.setLocalMatrix(this.f2077h);
                this.f2075f.setShader(this.f2076g);
            }
            this.f2080k = false;
        }
    }

    /* renamed from: g */
    public boolean mo1888g() {
        return this.f2081l;
    }

    public int getAlpha() {
        return this.f2075f.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f2075f.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f2083n;
    }

    public int getIntrinsicWidth() {
        return this.f2082m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r1 = r3.f2071a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getOpacity() {
        /*
            r3 = this;
            r0 = -3
            int r1 = r3.f2074e
            r2 = 119(0x77, float:1.67E-43)
            if (r1 != r2) goto L_0x000b
            boolean r1 = r3.f2081l
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            return r0
        L_0x000c:
            android.graphics.Bitmap r1 = r3.f2071a
            if (r1 == 0) goto L_0x000b
            boolean r1 = r1.hasAlpha()
            if (r1 != 0) goto L_0x000b
            android.graphics.Paint r1 = r3.f2075f
            int r1 = r1.getAlpha()
            r2 = 255(0xff, float:3.57E-43)
            if (r1 < r2) goto L_0x000b
            float r1 = r3.f2078i
            boolean r1 = m2651b((float) r1)
            if (r1 != 0) goto L_0x000b
            r0 = -1
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p018f.p019a.C0508m.getOpacity():int");
    }

    /* renamed from: h */
    public float mo1894h() {
        return this.f2078i;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f2081l) {
            m2653j();
        }
        this.f2080k = true;
    }

    public void setAlpha(int i) {
        if (i != this.f2075f.getAlpha()) {
            this.f2075f.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2075f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f2075f.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f2075f.setFilterBitmap(z);
        invalidateSelf();
    }
}
