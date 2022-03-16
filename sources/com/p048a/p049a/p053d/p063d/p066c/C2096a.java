package com.p048a.p049a.p053d.p063d.p066c;

import android.graphics.drawable.Drawable;
import com.p048a.p049a.p053d.p055b.C2006l;

/* renamed from: com.a.a.d.d.c.a */
public abstract class C2096a<T extends Drawable> implements C2006l<T> {

    /* renamed from: a */
    protected final T f7006a;

    public C2096a(T t) {
        if (t == null) {
            throw new NullPointerException("Drawable must not be null!");
        }
        this.f7006a = t;
    }

    /* renamed from: a */
    public final T mo7887b() {
        return this.f7006a.getConstantState().newDrawable();
    }
}
