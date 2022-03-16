package com.p048a.p049a.p078j;

import android.view.View;
import com.p048a.p049a.C2247n;
import com.p048a.p049a.p074h.p075a.C2185c;
import com.p048a.p049a.p074h.p076b.C2210k;
import com.p048a.p049a.p074h.p076b.C2214n;
import java.util.Arrays;

/* renamed from: com.a.a.j.j */
public class C2240j<T> implements C2210k, C2247n.C2251b<T> {

    /* renamed from: a */
    private int[] f7338a;

    /* renamed from: b */
    private C2241a f7339b;

    /* renamed from: com.a.a.j.j$a */
    private static final class C2241a extends C2214n<View, Object> {
        public C2241a(View view, C2210k kVar) {
            super(view);
            mo8220a(kVar);
        }

        /* renamed from: a */
        public void mo8051a(Object obj, C2185c cVar) {
        }
    }

    public C2240j() {
    }

    public C2240j(View view) {
        mo8350a(view);
    }

    /* renamed from: a */
    public void mo8196a(int i, int i2) {
        this.f7338a = new int[]{i, i2};
        this.f7339b = null;
    }

    /* renamed from: a */
    public void mo8350a(View view) {
        if (this.f7338a == null && this.f7339b == null) {
            this.f7339b = new C2241a(view, this);
        }
    }

    /* renamed from: a */
    public int[] mo8330a(T t, int i, int i2) {
        if (this.f7338a == null) {
            return null;
        }
        return Arrays.copyOf(this.f7338a, this.f7338a.length);
    }
}
