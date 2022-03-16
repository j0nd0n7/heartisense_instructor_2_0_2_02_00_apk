package com.p048a.p049a.p053d.p063d.p068e;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Gravity;
import com.p048a.p049a.p051b.C1884a;
import com.p048a.p049a.p051b.C1887c;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p063d.p066c.C2097b;
import com.p048a.p049a.p053d.p063d.p068e.C2113f;

/* renamed from: com.a.a.d.d.e.b */
public class C2108b extends C2097b implements C2113f.C2116b {

    /* renamed from: c */
    private final Paint f7018c;

    /* renamed from: d */
    private final Rect f7019d;

    /* renamed from: e */
    private final C2109a f7020e;

    /* renamed from: f */
    private final C1884a f7021f;

    /* renamed from: g */
    private final C2113f f7022g;

    /* renamed from: h */
    private boolean f7023h;

    /* renamed from: i */
    private boolean f7024i;

    /* renamed from: j */
    private boolean f7025j;

    /* renamed from: k */
    private boolean f7026k;

    /* renamed from: l */
    private int f7027l;

    /* renamed from: m */
    private int f7028m;

    /* renamed from: n */
    private boolean f7029n;

    /* renamed from: com.a.a.d.d.e.b$a */
    static class C2109a extends Drawable.ConstantState {

        /* renamed from: j */
        private static final int f7030j = 119;

        /* renamed from: a */
        C1887c f7031a;

        /* renamed from: b */
        byte[] f7032b;

        /* renamed from: c */
        Context f7033c;

        /* renamed from: d */
        C2146g<Bitmap> f7034d;

        /* renamed from: e */
        int f7035e;

        /* renamed from: f */
        int f7036f;

        /* renamed from: g */
        C1884a.C1885a f7037g;

        /* renamed from: h */
        C1921c f7038h;

        /* renamed from: i */
        Bitmap f7039i;

        public C2109a(C1887c cVar, byte[] bArr, Context context, C2146g<Bitmap> gVar, int i, int i2, C1884a.C1885a aVar, C1921c cVar2, Bitmap bitmap) {
            if (bitmap == null) {
                throw new NullPointerException("The first frame of the GIF must not be null");
            }
            this.f7031a = cVar;
            this.f7032b = bArr;
            this.f7038h = cVar2;
            this.f7039i = bitmap;
            this.f7033c = context.getApplicationContext();
            this.f7034d = gVar;
            this.f7035e = i;
            this.f7036f = i2;
            this.f7037g = aVar;
        }

        public C2109a(C2109a aVar) {
            if (aVar != null) {
                this.f7031a = aVar.f7031a;
                this.f7032b = aVar.f7032b;
                this.f7033c = aVar.f7033c;
                this.f7034d = aVar.f7034d;
                this.f7035e = aVar.f7035e;
                this.f7036f = aVar.f7036f;
                this.f7037g = aVar.f7037g;
                this.f7038h = aVar.f7038h;
                this.f7039i = aVar.f7039i;
            }
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new C2108b(this);
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public C2108b(Context context, C1884a.C1885a aVar, C1921c cVar, C2146g<Bitmap> gVar, int i, int i2, C1887c cVar2, byte[] bArr, Bitmap bitmap) {
        this(new C2109a(cVar2, bArr, context, gVar, i, i2, aVar, cVar, bitmap));
    }

    C2108b(C1884a aVar, C2113f fVar, Bitmap bitmap, C1921c cVar, Paint paint) {
        this.f7019d = new Rect();
        this.f7026k = true;
        this.f7028m = -1;
        this.f7021f = aVar;
        this.f7022g = fVar;
        this.f7020e = new C2109a((C2109a) null);
        this.f7018c = paint;
        this.f7020e.f7038h = cVar;
        this.f7020e.f7039i = bitmap;
    }

    C2108b(C2109a aVar) {
        this.f7019d = new Rect();
        this.f7026k = true;
        this.f7028m = -1;
        if (aVar == null) {
            throw new NullPointerException("GifState must not be null");
        }
        this.f7020e = aVar;
        this.f7021f = new C1884a(aVar.f7037g);
        this.f7018c = new Paint();
        this.f7021f.mo7656a(aVar.f7031a, aVar.f7032b);
        this.f7022g = new C2113f(aVar.f7033c, this, this.f7021f, aVar.f7035e, aVar.f7036f);
        this.f7022g.mo8045a(aVar.f7034d);
    }

    public C2108b(C2108b bVar, Bitmap bitmap, C2146g<Bitmap> gVar) {
        this(new C2109a(bVar.f7020e.f7031a, bVar.f7020e.f7032b, bVar.f7020e.f7033c, gVar, bVar.f7020e.f7035e, bVar.f7020e.f7036f, bVar.f7020e.f7037g, bVar.f7020e.f7038h, bitmap));
    }

    /* renamed from: i */
    private void m12094i() {
        this.f7027l = 0;
    }

    /* renamed from: j */
    private void m12095j() {
        this.f7022g.mo8047c();
        invalidateSelf();
    }

    /* renamed from: k */
    private void m12096k() {
        if (this.f7021f.mo7662g() == 1) {
            invalidateSelf();
        } else if (!this.f7023h) {
            this.f7023h = true;
            this.f7022g.mo8043a();
            invalidateSelf();
        }
    }

    /* renamed from: l */
    private void m12097l() {
        this.f7023h = false;
        this.f7022g.mo8046b();
    }

    /* renamed from: a */
    public void mo7964a(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else if (i == 0) {
            this.f7028m = this.f7021f.mo7665j();
        } else {
            this.f7028m = i;
        }
    }

    /* renamed from: a */
    public void mo8018a(C2146g<Bitmap> gVar, Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("The first frame of the GIF must not be null");
        } else if (gVar == null) {
            throw new NullPointerException("The frame transformation must not be null");
        } else {
            this.f7020e.f7034d = gVar;
            this.f7020e.f7039i = bitmap;
            this.f7022g.mo8045a(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8019a(boolean z) {
        this.f7023h = z;
    }

    /* renamed from: a */
    public boolean mo7965a() {
        return true;
    }

    /* renamed from: b */
    public Bitmap mo8020b() {
        return this.f7020e.f7039i;
    }

    @TargetApi(11)
    /* renamed from: b */
    public void mo8021b(int i) {
        if (Build.VERSION.SDK_INT < 11 || getCallback() != null) {
            invalidateSelf();
            if (i == this.f7021f.mo7662g() - 1) {
                this.f7027l++;
            }
            if (this.f7028m != -1 && this.f7027l >= this.f7028m) {
                stop();
                return;
            }
            return;
        }
        stop();
        m12095j();
    }

    /* renamed from: c */
    public C1884a mo8022c() {
        return this.f7021f;
    }

    /* renamed from: d */
    public C2146g<Bitmap> mo8023d() {
        return this.f7020e.f7034d;
    }

    public void draw(Canvas canvas) {
        if (!this.f7025j) {
            if (this.f7029n) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f7019d);
                this.f7029n = false;
            }
            Bitmap d = this.f7022g.mo8048d();
            if (d == null) {
                d = this.f7020e.f7039i;
            }
            canvas.drawBitmap(d, (Rect) null, this.f7019d, this.f7018c);
        }
    }

    /* renamed from: e */
    public byte[] mo8025e() {
        return this.f7020e.f7032b;
    }

    /* renamed from: f */
    public int mo8026f() {
        return this.f7021f.mo7662g();
    }

    /* renamed from: g */
    public void mo8027g() {
        this.f7025j = true;
        this.f7020e.f7038h.mo7767a(this.f7020e.f7039i);
        this.f7022g.mo8047c();
        this.f7022g.mo8046b();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f7020e;
    }

    public int getIntrinsicHeight() {
        return this.f7020e.f7039i.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.f7020e.f7039i.getWidth();
    }

    public int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo8032h() {
        return this.f7025j;
    }

    public boolean isRunning() {
        return this.f7023h;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7029n = true;
    }

    public void setAlpha(int i) {
        this.f7018c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f7018c.setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        this.f7026k = z;
        if (!z) {
            m12097l();
        } else if (this.f7024i) {
            m12096k();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f7024i = true;
        m12094i();
        if (this.f7026k) {
            m12096k();
        }
    }

    public void stop() {
        this.f7024i = false;
        m12097l();
        if (Build.VERSION.SDK_INT < 11) {
            m12095j();
        }
    }
}
