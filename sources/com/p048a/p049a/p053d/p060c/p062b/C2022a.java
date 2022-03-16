package com.p048a.p049a.p053d.p060c.p062b;

import android.content.Context;
import android.text.TextUtils;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.p054a.C1897c;
import com.p048a.p049a.p053d.p060c.C2041d;
import com.p048a.p049a.p053d.p060c.C2042e;
import com.p048a.p049a.p053d.p060c.C2052k;
import com.p048a.p049a.p053d.p060c.C2055l;
import java.io.InputStream;

/* renamed from: com.a.a.d.c.b.a */
public abstract class C2022a<T> implements C2030f<T> {

    /* renamed from: a */
    private final C2055l<C2041d, InputStream> f6856a;

    /* renamed from: b */
    private final C2052k<T, C2041d> f6857b;

    public C2022a(Context context) {
        this(context, (C2052k) null);
    }

    public C2022a(Context context, C2052k<T, C2041d> kVar) {
        this((C2055l<C2041d, InputStream>) C2243l.m12745a(C2041d.class, InputStream.class, context), kVar);
    }

    public C2022a(C2055l<C2041d, InputStream> lVar) {
        this(lVar, (C2052k) null);
    }

    public C2022a(C2055l<C2041d, InputStream> lVar, C2052k<T, C2041d> kVar) {
        this.f6856a = lVar;
        this.f6857b = kVar;
    }

    /* renamed from: a */
    public C1897c<InputStream> mo7901a(T t, int i, int i2) {
        C2041d a = this.f6857b != null ? this.f6857b.mo7936a(t, i, i2) : null;
        if (a == null) {
            String b = mo7902b(t, i, i2);
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            a = new C2041d(b, mo7903c(t, i, i2));
            if (this.f6857b != null) {
                this.f6857b.mo7937a(t, i, i2, a);
            }
        }
        return this.f6856a.mo7901a(a, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo7902b(T t, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C2042e mo7903c(T t, int i, int i2) {
        return C2042e.f6874b;
    }
}
