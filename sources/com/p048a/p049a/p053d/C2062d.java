package com.p048a.p049a.p053d;

import com.p048a.p049a.p053d.p055b.C2006l;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.a.a.d.d */
public class C2062d<T> implements C2146g<T> {

    /* renamed from: a */
    private final Collection<? extends C2146g<T>> f6912a;

    /* renamed from: b */
    private String f6913b;

    public C2062d(Collection<? extends C2146g<T>> collection) {
        if (collection.size() < 1) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f6912a = collection;
    }

    @SafeVarargs
    public C2062d(C2146g<T>... gVarArr) {
        if (gVarArr.length < 1) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f6912a = Arrays.asList(gVarArr);
    }

    /* renamed from: a */
    public C2006l<T> mo7947a(C2006l<T> lVar, int i, int i2) {
        C2006l<T> lVar2 = lVar;
        for (C2146g a : this.f6912a) {
            C2006l<T> a2 = a.mo7947a(lVar2, i, i2);
            if (lVar2 != null && !lVar2.equals(lVar) && !lVar2.equals(a2)) {
                lVar2.mo7889d();
            }
            lVar2 = a2;
        }
        return lVar2;
    }

    /* renamed from: a */
    public String mo7948a() {
        if (this.f6913b == null) {
            StringBuilder sb = new StringBuilder();
            for (C2146g a : this.f6912a) {
                sb.append(a.mo7948a());
            }
            this.f6913b = sb.toString();
        }
        return this.f6913b;
    }
}
