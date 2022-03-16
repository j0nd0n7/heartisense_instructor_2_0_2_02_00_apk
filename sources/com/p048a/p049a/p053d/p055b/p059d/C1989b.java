package com.p048a.p049a.p053d.p055b.p059d;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.p048a.p049a.p053d.C1894a;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p055b.p057b.C1962i;
import com.p048a.p049a.p053d.p055b.p059d.C1991d;
import com.p048a.p049a.p078j.C2238i;
import java.util.HashMap;

/* renamed from: com.a.a.d.b.d.b */
public final class C1989b {

    /* renamed from: a */
    private final C1962i f6779a;

    /* renamed from: b */
    private final C1921c f6780b;

    /* renamed from: c */
    private final C1894a f6781c;

    /* renamed from: d */
    private final Handler f6782d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private C1985a f6783e;

    public C1989b(C1962i iVar, C1921c cVar, C1894a aVar) {
        this.f6779a = iVar;
        this.f6780b = cVar;
        this.f6781c = aVar;
    }

    /* renamed from: a */
    private static int m11786a(C1991d dVar) {
        return C2238i.m12722a(dVar.mo7859a(), dVar.mo7860b(), dVar.mo7861c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1990c mo7854a(C1991d[] dVarArr) {
        int b = (this.f6779a.mo7821b() - this.f6779a.mo7819a()) + this.f6780b.mo7763a();
        int i = 0;
        for (C1991d d : dVarArr) {
            i += d.mo7862d();
        }
        float f = ((float) b) / ((float) i);
        HashMap hashMap = new HashMap();
        for (C1991d dVar : dVarArr) {
            hashMap.put(dVar, Integer.valueOf(Math.round(((float) dVar.mo7862d()) * f) / m11786a(dVar)));
        }
        return new C1990c(hashMap);
    }

    /* renamed from: a */
    public void mo7855a(C1991d.C1992a... aVarArr) {
        if (this.f6783e != null) {
            this.f6783e.mo7850a();
        }
        C1991d[] dVarArr = new C1991d[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            C1991d.C1992a aVar = aVarArr[i];
            if (aVar.mo7866a() == null) {
                aVar.mo7868a((this.f6781c == C1894a.ALWAYS_ARGB_8888 || this.f6781c == C1894a.PREFER_ARGB_8888) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            dVarArr[i] = aVar.mo7869b();
        }
        this.f6783e = new C1985a(this.f6780b, this.f6779a, mo7854a(dVarArr));
        this.f6782d.post(this.f6783e);
    }
}
