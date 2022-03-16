package com.p048a.p049a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.ParcelFileDescriptor;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.p048a.p049a.p053d.C1894a;
import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p055b.C1969c;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p060c.C2046g;
import com.p048a.p049a.p053d.p063d.p064a.C2068e;
import com.p048a.p049a.p053d.p063d.p064a.C2070g;
import com.p048a.p049a.p053d.p063d.p064a.C2075i;
import com.p048a.p049a.p053d.p063d.p064a.C2084n;
import com.p048a.p049a.p053d.p063d.p064a.C2089r;
import com.p048a.p049a.p053d.p063d.p064a.C2091t;
import com.p048a.p049a.p053d.p063d.p067d.C2101c;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import com.p048a.p049a.p073g.C2177f;
import com.p048a.p049a.p074h.C2221f;
import com.p048a.p049a.p074h.p075a.C2195h;
import com.p048a.p049a.p074h.p076b.C2213m;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.a.a.b */
public class C1883b<ModelType, TranscodeType> extends C2178h<ModelType, C2046g, Bitmap, TranscodeType> implements C1874a {

    /* renamed from: g */
    private final C1921c f6423g;

    /* renamed from: h */
    private C2070g f6424h = C2070g.f6923a;

    /* renamed from: i */
    private C1894a f6425i;

    /* renamed from: j */
    private C2144e<InputStream, Bitmap> f6426j;

    /* renamed from: k */
    private C2144e<ParcelFileDescriptor, Bitmap> f6427k;

    C1883b(C2177f<ModelType, C2046g, Bitmap, TranscodeType> fVar, Class<TranscodeType> cls, C2178h<ModelType, ?, ?, ?> hVar) {
        super(fVar, cls, hVar);
        this.f6423g = hVar.f7165c.mo8360c();
        this.f6425i = hVar.f7165c.mo8368j();
        this.f6426j = new C2089r(this.f6423g, this.f6425i);
        this.f6427k = new C2075i(this.f6423g, this.f6425i);
    }

    /* renamed from: a */
    private C1883b<ModelType, TranscodeType> m11341a(C2070g gVar) {
        this.f6424h = gVar;
        this.f6426j = new C2089r(gVar, this.f6423g, this.f6425i);
        super.mo7640f(new C2084n(this.f6426j, this.f6427k));
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7631d(float f) {
        super.mo7631d(f);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7644h(int i) {
        super.mo7644h(i);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7608b(int i, int i2) {
        super.mo7608b(i, i2);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7639f(Drawable drawable) {
        super.mo7639f(drawable);
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7609b(Animation animation) {
        super.mo7609b(animation);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7587a(C1883b<?, TranscodeType> bVar) {
        super.mo7617b(bVar);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7588a(C1894a aVar) {
        this.f6425i = aVar;
        this.f6426j = new C2089r(this.f6424h, this.f6423g, aVar);
        this.f6427k = new C2075i(new C2091t(), this.f6423g, aVar);
        super.mo7636e(new C2101c(new C2089r(this.f6424h, this.f6423g, aVar)));
        super.mo7640f(new C2084n(this.f6426j, this.f6427k));
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7610b(C1969c cVar) {
        super.mo7610b(cVar);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7611b(C1915b<C2046g> bVar) {
        super.mo7611b(bVar);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7612b(C2010c cVar) {
        super.mo7612b(cVar);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7613b(C2141f<Bitmap, TranscodeType> fVar) {
        super.mo7613b(fVar);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7640f(C2144e<C2046g, Bitmap> eVar) {
        super.mo7640f(eVar);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7614b(C2145f<Bitmap> fVar) {
        super.mo7614b(fVar);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7615b(C2195h.C2196a aVar) {
        super.mo7615b(aVar);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7616b(C2221f<? super ModelType, TranscodeType> fVar) {
        super.mo7616b(fVar);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7617b(C2178h<?, ?, ?, TranscodeType> hVar) {
        super.mo7617b(hVar);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7618b(C2255p pVar) {
        super.mo7618b(pVar);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7619b(ModelType modeltype) {
        super.mo7619b(modeltype);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7620b(boolean z) {
        super.mo7620b(z);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7601a(C2068e... eVarArr) {
        super.mo7621b((C2146g<ResourceType>[]) eVarArr);
        return this;
    }

    /* renamed from: a */
    public C1883b<ModelType, TranscodeType> mo7621b(C2146g<Bitmap>... gVarArr) {
        super.mo7621b((C2146g<ResourceType>[]) gVarArr);
        return this;
    }

    /* renamed from: a */
    public C2213m<TranscodeType> mo7603a(ImageView imageView) {
        return super.mo7603a(imageView);
    }

    /* renamed from: b */
    public C1883b<ModelType, TranscodeType> mo7626c(float f) {
        super.mo7626c(f);
        return this;
    }

    /* renamed from: b */
    public C1883b<ModelType, TranscodeType> mo7642g(int i) {
        super.mo7642g(i);
        return this;
    }

    /* renamed from: b */
    public C1883b<ModelType, TranscodeType> mo7635e(Drawable drawable) {
        super.mo7635e(drawable);
        return this;
    }

    /* renamed from: b */
    public C1883b<ModelType, TranscodeType> mo7636e(C2144e<File, Bitmap> eVar) {
        super.mo7636e(eVar);
        return this;
    }

    /* renamed from: c */
    public C1883b<ModelType, TranscodeType> mo7622c() {
        return m11341a(C2070g.f6923a);
    }

    /* renamed from: c */
    public C1883b<ModelType, TranscodeType> mo7638f(int i) {
        super.mo7638f(i);
        return this;
    }

    /* renamed from: c */
    public C1883b<ModelType, TranscodeType> mo7632d(Drawable drawable) {
        super.mo7632d(drawable);
        return this;
    }

    /* renamed from: c */
    public C1883b<ModelType, TranscodeType> mo7625c(C2144e<InputStream, Bitmap> eVar) {
        this.f6426j = eVar;
        super.mo7640f(new C2084n(eVar, this.f6427k));
        return this;
    }

    /* renamed from: d */
    public C1883b<ModelType, TranscodeType> mo7628d() {
        return m11341a(C2070g.f6925c);
    }

    /* renamed from: d */
    public C1883b<ModelType, TranscodeType> mo7634e(int i) {
        super.mo7634e(i);
        return this;
    }

    /* renamed from: d */
    public C1883b<ModelType, TranscodeType> mo7630d(C2144e<ParcelFileDescriptor, Bitmap> eVar) {
        this.f6427k = eVar;
        super.mo7640f(new C2084n(this.f6426j, eVar));
        return this;
    }

    /* renamed from: e */
    public C1883b<ModelType, TranscodeType> mo7633e() {
        return m11341a(C2070g.f6924b);
    }

    /* renamed from: f */
    public C1883b<ModelType, TranscodeType> mo7551b() {
        return mo7601a(this.f7165c.mo8363e());
    }

    /* renamed from: g */
    public C1883b<ModelType, TranscodeType> mo7550a() {
        return mo7601a(this.f7165c.mo8364f());
    }

    /* renamed from: h */
    public C1883b<ModelType, TranscodeType> mo7650n() {
        super.mo7650n();
        return this;
    }

    /* renamed from: i */
    public C1883b<ModelType, TranscodeType> mo7651o() {
        super.mo7651o();
        return this;
    }

    /* renamed from: j */
    public C1883b<ModelType, TranscodeType> mo7649m() {
        return (C1883b) super.clone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo7647k() {
        mo7550a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo7648l() {
        mo7551b();
    }
}
