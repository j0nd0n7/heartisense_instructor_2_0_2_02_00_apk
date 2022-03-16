package android.support.p036v7.widget.p047b;

import android.support.p036v7.p045g.C1513f;
import android.support.p036v7.widget.C1732az;

/* renamed from: android.support.v7.widget.b.a */
public abstract class C1776a<T2> extends C1513f.C1515b<T2> {

    /* renamed from: a */
    final C1732az.C1739a f5942a;

    public C1776a(C1732az.C1739a aVar) {
        this.f5942a = aVar;
    }

    /* renamed from: a */
    public void mo5063a(int i, int i2) {
        this.f5942a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: b */
    public void mo5065b(int i, int i2) {
        this.f5942a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: c */
    public void mo5066c(int i, int i2) {
        this.f5942a.notifyItemMoved(i, i2);
    }

    /* renamed from: d */
    public void mo5104d(int i, int i2) {
        this.f5942a.notifyItemRangeChanged(i, i2);
    }
}
