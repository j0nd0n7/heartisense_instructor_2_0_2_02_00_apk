package com.p048a.p049a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p055b.C1969c;
import com.p048a.p049a.p053d.p063d.p064a.C2068e;
import com.p048a.p049a.p053d.p063d.p068e.C2108b;
import com.p048a.p049a.p053d.p063d.p068e.C2112e;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import com.p048a.p049a.p073g.C2177f;
import com.p048a.p049a.p074h.C2221f;
import com.p048a.p049a.p074h.p075a.C2182a;
import com.p048a.p049a.p074h.p075a.C2195h;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.a.a.j */
public class C2229j<ModelType> extends C2178h<ModelType, InputStream, C2108b, C2108b> implements C1874a, C2147e {
    C2229j(C2177f<ModelType, InputStream, C2108b, C2108b> fVar, Class<C2108b> cls, C2178h<ModelType, ?, ?, ?> hVar) {
        super(fVar, cls, hVar);
    }

    /* renamed from: d */
    private C2112e[] m12617d(C2146g<Bitmap>[] gVarArr) {
        C2112e[] eVarArr = new C2112e[gVarArr.length];
        for (int i = 0; i < gVarArr.length; i++) {
            eVarArr[i] = new C2112e(gVarArr[i], this.f7165c.mo8360c());
        }
        return eVarArr;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7631d(float f) {
        super.mo7631d(f);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo8082c(int i, int i2) {
        super.mo8180a(new C2182a(this.f7164b, i, i2));
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7639f(Drawable drawable) {
        super.mo7639f(drawable);
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public C2229j<ModelType> mo7609b(Animation animation) {
        super.mo7609b(animation);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7610b(C1969c cVar) {
        super.mo7610b(cVar);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7611b(C1915b<InputStream> bVar) {
        super.mo7611b(bVar);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7612b(C2010c cVar) {
        super.mo7612b(cVar);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7613b(C2141f<C2108b, C2108b> fVar) {
        super.mo7613b(fVar);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7640f(C2144e<InputStream, C2108b> eVar) {
        super.mo7640f(eVar);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7614b(C2145f<C2108b> fVar) {
        super.mo7614b(fVar);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7615b(C2195h.C2196a aVar) {
        super.mo7615b(aVar);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7616b(C2221f<? super ModelType, C2108b> fVar) {
        super.mo7616b(fVar);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7617b(C2178h<?, ?, ?, C2108b> hVar) {
        super.mo7617b(hVar);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo8287a(C2229j<?> jVar) {
        super.mo7617b(jVar);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7618b(C2255p pVar) {
        super.mo7618b(pVar);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7619b(ModelType modeltype) {
        super.mo7619b(modeltype);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo7620b(boolean z) {
        super.mo7620b(z);
        return this;
    }

    /* renamed from: a */
    public C2229j<ModelType> mo8291a(C2068e... eVarArr) {
        return mo7621b((C2146g<C2108b>[]) m12617d((C2146g<Bitmap>[]) eVarArr));
    }

    /* renamed from: a */
    public C2229j<ModelType> mo8292a(C2146g<Bitmap>... gVarArr) {
        return mo7621b((C2146g<C2108b>[]) m12617d(gVarArr));
    }

    /* renamed from: b */
    public C2229j<ModelType> mo7626c(float f) {
        super.mo7626c(f);
        return this;
    }

    /* renamed from: b */
    public C2229j<ModelType> mo8079a(int i) {
        super.mo8180a(new C2182a(i));
        return this;
    }

    /* renamed from: b */
    public C2229j<ModelType> mo7635e(Drawable drawable) {
        super.mo7635e(drawable);
        return this;
    }

    @Deprecated
    /* renamed from: b */
    public C2229j<ModelType> mo8080a(Animation animation, int i) {
        super.mo8180a(new C2182a(animation, i));
        return this;
    }

    /* renamed from: b */
    public C2229j<ModelType> mo7636e(C2144e<File, C2108b> eVar) {
        super.mo7636e(eVar);
        return this;
    }

    /* renamed from: c */
    public C2229j<ModelType> mo7644h(int i) {
        super.mo7644h(i);
        return this;
    }

    /* renamed from: c */
    public C2229j<ModelType> mo7632d(Drawable drawable) {
        super.mo7632d(drawable);
        return this;
    }

    /* renamed from: c */
    public C2229j<ModelType> mo7621b(C2146g<C2108b>... gVarArr) {
        super.mo7621b((C2146g<ResourceType>[]) gVarArr);
        return this;
    }

    /* renamed from: d */
    public C2229j<ModelType> mo7551b() {
        return mo8291a(this.f7165c.mo8363e());
    }

    /* renamed from: d */
    public C2229j<ModelType> mo7642g(int i) {
        super.mo7642g(i);
        return this;
    }

    /* renamed from: d */
    public C2229j<ModelType> mo7608b(int i, int i2) {
        super.mo7608b(i, i2);
        return this;
    }

    /* renamed from: e */
    public C2229j<ModelType> mo7550a() {
        return mo8291a(this.f7165c.mo8364f());
    }

    /* renamed from: f */
    public C2229j<ModelType> mo8081c() {
        super.mo8180a(new C2182a());
        return this;
    }

    /* renamed from: g */
    public C2229j<ModelType> mo7650n() {
        super.mo7650n();
        return this;
    }

    /* renamed from: h */
    public C2229j<ModelType> mo7651o() {
        super.mo7651o();
        return this;
    }

    /* renamed from: i */
    public C2229j<ModelType> mo7649m() {
        return (C2229j) super.clone();
    }

    /* renamed from: i */
    public C2229j<ModelType> mo7638f(int i) {
        super.mo7638f(i);
        return this;
    }

    /* renamed from: j */
    public C2229j<ModelType> mo7634e(int i) {
        super.mo7634e(i);
        return this;
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
