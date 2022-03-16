package com.p048a.p049a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.C2062d;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p055b.C1969c;
import com.p048a.p049a.p053d.p063d.C2106e;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import com.p048a.p049a.p071e.C2156g;
import com.p048a.p049a.p071e.C2164m;
import com.p048a.p049a.p073g.C2172a;
import com.p048a.p049a.p073g.C2177f;
import com.p048a.p049a.p074h.C2181a;
import com.p048a.p049a.p074h.C2198b;
import com.p048a.p049a.p074h.C2217c;
import com.p048a.p049a.p074h.C2218d;
import com.p048a.p049a.p074h.C2219e;
import com.p048a.p049a.p074h.C2221f;
import com.p048a.p049a.p074h.C2223h;
import com.p048a.p049a.p074h.p075a.C2187d;
import com.p048a.p049a.p074h.p075a.C2188e;
import com.p048a.p049a.p074h.p075a.C2192g;
import com.p048a.p049a.p074h.p075a.C2195h;
import com.p048a.p049a.p074h.p075a.C2197i;
import com.p048a.p049a.p074h.p076b.C2208i;
import com.p048a.p049a.p074h.p076b.C2213m;
import com.p048a.p049a.p077i.C2226b;
import com.p048a.p049a.p078j.C2238i;
import java.io.File;

/* renamed from: com.a.a.h */
public class C2178h<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {

    /* renamed from: A */
    private boolean f7160A;

    /* renamed from: B */
    private Drawable f7161B;

    /* renamed from: C */
    private int f7162C;

    /* renamed from: a */
    protected final Class<ModelType> f7163a;

    /* renamed from: b */
    protected final Context f7164b;

    /* renamed from: c */
    protected final C2243l f7165c;

    /* renamed from: d */
    protected final Class<TranscodeType> f7166d;

    /* renamed from: e */
    protected final C2164m f7167e;

    /* renamed from: f */
    protected final C2156g f7168f;

    /* renamed from: g */
    private C2172a<ModelType, DataType, ResourceType, TranscodeType> f7169g;

    /* renamed from: h */
    private ModelType f7170h;

    /* renamed from: i */
    private C2010c f7171i;

    /* renamed from: j */
    private boolean f7172j;

    /* renamed from: k */
    private int f7173k;

    /* renamed from: l */
    private int f7174l;

    /* renamed from: m */
    private C2221f<? super ModelType, TranscodeType> f7175m;

    /* renamed from: n */
    private Float f7176n;

    /* renamed from: o */
    private C2178h<?, ?, ?, TranscodeType> f7177o;

    /* renamed from: p */
    private Float f7178p;

    /* renamed from: q */
    private Drawable f7179q;

    /* renamed from: r */
    private Drawable f7180r;

    /* renamed from: s */
    private C2255p f7181s;

    /* renamed from: t */
    private boolean f7182t;

    /* renamed from: u */
    private C2187d<TranscodeType> f7183u;

    /* renamed from: v */
    private int f7184v;

    /* renamed from: w */
    private int f7185w;

    /* renamed from: x */
    private C1969c f7186x;

    /* renamed from: y */
    private C2146g<ResourceType> f7187y;

    /* renamed from: z */
    private boolean f7188z;

    /* renamed from: com.a.a.h$2 */
    static /* synthetic */ class C21802 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7191a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                f7191a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f7191a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f7191a[ImageView.ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f7191a[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    C2178h(Context context, Class<ModelType> cls, C2177f<ModelType, DataType, ResourceType, TranscodeType> fVar, Class<TranscodeType> cls2, C2243l lVar, C2164m mVar, C2156g gVar) {
        C2172a<ModelType, DataType, ResourceType, TranscodeType> aVar = null;
        this.f7171i = C2226b.m12613a();
        this.f7178p = Float.valueOf(1.0f);
        this.f7181s = null;
        this.f7182t = true;
        this.f7183u = C2188e.m12451a();
        this.f7184v = -1;
        this.f7185w = -1;
        this.f7186x = C1969c.RESULT;
        this.f7187y = C2106e.m12089b();
        this.f7164b = context;
        this.f7163a = cls;
        this.f7166d = cls2;
        this.f7165c = lVar;
        this.f7167e = mVar;
        this.f7168f = gVar;
        this.f7169g = fVar != null ? new C2172a<>(fVar) : aVar;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        } else if (cls != null && fVar == null) {
            throw new NullPointerException("LoadProvider must not be null");
        }
    }

    C2178h(C2177f<ModelType, DataType, ResourceType, TranscodeType> fVar, Class<TranscodeType> cls, C2178h<ModelType, ?, ?, ?> hVar) {
        this(hVar.f7164b, hVar.f7163a, fVar, cls, hVar.f7165c, hVar.f7167e, hVar.f7168f);
        this.f7170h = hVar.f7170h;
        this.f7172j = hVar.f7172j;
        this.f7171i = hVar.f7171i;
        this.f7186x = hVar.f7186x;
        this.f7182t = hVar.f7182t;
    }

    /* renamed from: a */
    private C2217c mo7709a(C2213m<TranscodeType> mVar) {
        if (this.f7181s == null) {
            this.f7181s = C2255p.NORMAL;
        }
        return m12401a(mVar, (C2223h) null);
    }

    /* renamed from: a */
    private C2217c m12400a(C2213m<TranscodeType> mVar, float f, C2255p pVar, C2218d dVar) {
        return C2198b.m12464a(this.f7169g, this.f7170h, this.f7171i, this.f7164b, pVar, mVar, f, this.f7179q, this.f7173k, this.f7180r, this.f7174l, this.f7161B, this.f7162C, this.f7175m, dVar, this.f7165c.mo8362d(), this.f7187y, this.f7166d, this.f7182t, this.f7183u, this.f7185w, this.f7184v, this.f7186x);
    }

    /* renamed from: a */
    private C2217c m12401a(C2213m<TranscodeType> mVar, C2223h hVar) {
        if (this.f7177o != null) {
            if (this.f7160A) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (this.f7177o.f7183u.equals(C2188e.m12451a())) {
                this.f7177o.f7183u = this.f7183u;
            }
            if (this.f7177o.f7181s == null) {
                this.f7177o.f7181s = mo7550a();
            }
            if (C2238i.m12730a(this.f7185w, this.f7184v) && !C2238i.m12730a(this.f7177o.f7185w, this.f7177o.f7184v)) {
                this.f7177o.mo7608b(this.f7185w, this.f7184v);
            }
            C2223h hVar2 = new C2223h(hVar);
            C2217c a = m12400a(mVar, this.f7178p.floatValue(), this.f7181s, hVar2);
            this.f7160A = true;
            C2217c a2 = this.f7177o.m12401a(mVar, hVar2);
            this.f7160A = false;
            hVar2.mo8271a(a, a2);
            return hVar2;
        } else if (this.f7176n == null) {
            return m12400a(mVar, this.f7178p.floatValue(), this.f7181s, hVar);
        } else {
            C2223h hVar3 = new C2223h(hVar);
            hVar3.mo8271a(m12400a(mVar, this.f7178p.floatValue(), this.f7181s, hVar3), m12400a(mVar, this.f7176n.floatValue(), mo7550a(), hVar3));
            return hVar3;
        }
    }

    /* renamed from: a */
    private C2255p mo7550a() {
        return this.f7181s == C2255p.LOW ? C2255p.NORMAL : this.f7181s == C2255p.NORMAL ? C2255p.HIGH : C2255p.IMMEDIATE;
    }

    /* renamed from: a */
    public C2213m<TranscodeType> mo7603a(ImageView imageView) {
        C2238i.m12729a();
        if (imageView == null) {
            throw new IllegalArgumentException("You must pass in a non null View");
        }
        if (!this.f7188z && imageView.getScaleType() != null) {
            switch (C21802.f7191a[imageView.getScaleType().ordinal()]) {
                case 1:
                    mo7648l();
                    break;
                case 2:
                case 3:
                case 4:
                    mo7647k();
                    break;
            }
        }
        return mo8181b(this.f7165c.mo8354a(imageView, this.f7166d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo8180a(C2187d<TranscodeType> dVar) {
        if (dVar == null) {
            throw new NullPointerException("Animation factory must not be null!");
        }
        this.f7183u = dVar;
        return this;
    }

    /* renamed from: b */
    public <Y extends C2213m<TranscodeType>> Y mo8181b(Y y) {
        C2238i.m12729a();
        if (y == null) {
            throw new IllegalArgumentException("You must pass in a non null Target");
        } else if (!this.f7172j) {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        } else {
            C2217c d_ = y.mo8212d_();
            if (d_ != null) {
                d_.mo8199d();
                this.f7167e.mo8121c(d_);
                d_.mo8195a();
            }
            C2217c a = mo7709a(y);
            y.mo8209a(a);
            this.f7168f.mo8084a(y);
            this.f7167e.mo8116a(a);
            return y;
        }
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7608b(int i, int i2) {
        if (!C2238i.m12730a(i, i2)) {
            throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
        }
        this.f7185w = i;
        this.f7184v = i2;
        return this;
    }

    @Deprecated
    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7609b(Animation animation) {
        return mo8180a(new C2192g(animation));
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7610b(C1969c cVar) {
        this.f7186x = cVar;
        return this;
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7611b(C1915b<DataType> bVar) {
        if (this.f7169g != null) {
            this.f7169g.mo8169a(bVar);
        }
        return this;
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7612b(C2010c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f7171i = cVar;
        return this;
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7613b(C2141f<ResourceType, TranscodeType> fVar) {
        if (this.f7169g != null) {
            this.f7169g.mo8170a(fVar);
        }
        return this;
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7614b(C2145f<ResourceType> fVar) {
        if (this.f7169g != null) {
            this.f7169g.mo8172a(fVar);
        }
        return this;
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7615b(C2195h.C2196a aVar) {
        return mo8180a(new C2197i(aVar));
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7616b(C2221f<? super ModelType, TranscodeType> fVar) {
        this.f7175m = fVar;
        return this;
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7617b(C2178h<?, ?, ?, TranscodeType> hVar) {
        if (equals(hVar)) {
            throw new IllegalArgumentException("You cannot set a request as a thumbnail for itself. Consider using clone() on the request you are passing to thumbnail()");
        }
        this.f7177o = hVar;
        return this;
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7618b(C2255p pVar) {
        this.f7181s = pVar;
        return this;
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7619b(ModelType modeltype) {
        this.f7170h = modeltype;
        this.f7172j = true;
        return this;
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7620b(boolean z) {
        this.f7182t = !z;
        return this;
    }

    /* renamed from: b */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7621b(C2146g<ResourceType>... gVarArr) {
        this.f7188z = true;
        if (gVarArr.length == 1) {
            this.f7187y = gVarArr[0];
        } else {
            this.f7187y = new C2062d((C2146g<T>[]) gVarArr);
        }
        return this;
    }

    /* renamed from: c */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7626c(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f7178p = Float.valueOf(f);
        return this;
    }

    /* renamed from: d */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7631d(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f7176n = Float.valueOf(f);
        return this;
    }

    /* renamed from: d */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7632d(Drawable drawable) {
        this.f7180r = drawable;
        return this;
    }

    /* renamed from: e */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7634e(int i) {
        this.f7174l = i;
        return this;
    }

    /* renamed from: e */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7635e(Drawable drawable) {
        this.f7161B = drawable;
        return this;
    }

    /* renamed from: e */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7636e(C2144e<File, ResourceType> eVar) {
        if (this.f7169g != null) {
            this.f7169g.mo8171a(eVar);
        }
        return this;
    }

    /* renamed from: f */
    public C2181a<TranscodeType> mo8182f(int i, int i2) {
        final C2219e eVar = new C2219e(this.f7165c.mo8367i(), i, i2);
        this.f7165c.mo8367i().post(new Runnable() {
            public void run() {
                if (!eVar.isCancelled()) {
                    C2178h.this.mo8181b(eVar);
                }
            }
        });
        return eVar;
    }

    /* renamed from: f */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7638f(int i) {
        this.f7162C = i;
        return this;
    }

    /* renamed from: f */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7639f(Drawable drawable) {
        this.f7179q = drawable;
        return this;
    }

    /* renamed from: f */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7640f(C2144e<DataType, ResourceType> eVar) {
        if (this.f7169g != null) {
            this.f7169g.mo8173b(eVar);
        }
        return this;
    }

    /* renamed from: g */
    public C2213m<TranscodeType> mo8183g(int i, int i2) {
        return mo8181b(C2208i.m12524a(i, i2));
    }

    /* renamed from: g */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7642g(int i) {
        this.f7173k = i;
        return this;
    }

    /* renamed from: h */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7644h(int i) {
        return mo8180a(new C2192g(this.f7164b, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo7647k() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo7648l() {
    }

    /* renamed from: m */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> clone() {
        try {
            C2178h<ModelType, DataType, ResourceType, TranscodeType> hVar = (C2178h) super.clone();
            hVar.f7169g = this.f7169g != null ? this.f7169g.clone() : null;
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7650n() {
        return mo8180a(C2188e.m12451a());
    }

    /* renamed from: o */
    public C2178h<ModelType, DataType, ResourceType, TranscodeType> mo7651o() {
        return mo7621b((C2146g<ResourceType>[]) new C2146g[]{C2106e.m12089b()});
    }

    /* renamed from: q */
    public C2213m<TranscodeType> mo8184q() {
        return mo8183g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
