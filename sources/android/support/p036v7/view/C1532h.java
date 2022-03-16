package android.support.p036v7.view;

import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1112bo;
import android.support.p010v4.view.C1130bu;
import android.support.p010v4.view.C1131bv;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.h */
public class C1532h {

    /* renamed from: a */
    final ArrayList<C1112bo> f4812a = new ArrayList<>();

    /* renamed from: b */
    C1130bu f4813b;

    /* renamed from: c */
    private long f4814c = -1;

    /* renamed from: d */
    private Interpolator f4815d;

    /* renamed from: e */
    private boolean f4816e;

    /* renamed from: f */
    private final C1131bv f4817f = new C1131bv() {

        /* renamed from: b */
        private boolean f4819b = false;

        /* renamed from: c */
        private int f4820c = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5170a() {
            this.f4820c = 0;
            this.f4819b = false;
            C1532h.this.mo5168b();
        }

        /* renamed from: a */
        public void mo3893a(View view) {
            if (!this.f4819b) {
                this.f4819b = true;
                if (C1532h.this.f4813b != null) {
                    C1532h.this.f4813b.mo3893a((View) null);
                }
            }
        }

        /* renamed from: b */
        public void mo3894b(View view) {
            int i = this.f4820c + 1;
            this.f4820c = i;
            if (i == C1532h.this.f4812a.size()) {
                if (C1532h.this.f4813b != null) {
                    C1532h.this.f4813b.mo3894b((View) null);
                }
                mo5170a();
            }
        }
    };

    /* renamed from: a */
    public C1532h mo5162a(long j) {
        if (!this.f4816e) {
            this.f4814c = j;
        }
        return this;
    }

    /* renamed from: a */
    public C1532h mo5163a(C1112bo boVar) {
        if (!this.f4816e) {
            this.f4812a.add(boVar);
        }
        return this;
    }

    /* renamed from: a */
    public C1532h mo5164a(C1112bo boVar, C1112bo boVar2) {
        this.f4812a.add(boVar);
        boVar2.mo3825b(boVar.mo3817a());
        this.f4812a.add(boVar2);
        return this;
    }

    /* renamed from: a */
    public C1532h mo5165a(C1130bu buVar) {
        if (!this.f4816e) {
            this.f4813b = buVar;
        }
        return this;
    }

    /* renamed from: a */
    public C1532h mo5166a(Interpolator interpolator) {
        if (!this.f4816e) {
            this.f4815d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public void mo5167a() {
        if (!this.f4816e) {
            Iterator<C1112bo> it = this.f4812a.iterator();
            while (it.hasNext()) {
                C1112bo next = it.next();
                if (this.f4814c >= 0) {
                    next.mo3819a(this.f4814c);
                }
                if (this.f4815d != null) {
                    next.mo3822a(this.f4815d);
                }
                if (this.f4813b != null) {
                    next.mo3820a((C1130bu) this.f4817f);
                }
                next.mo3833e();
            }
            this.f4816e = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5168b() {
        this.f4816e = false;
    }

    /* renamed from: c */
    public void mo5169c() {
        if (this.f4816e) {
            Iterator<C1112bo> it = this.f4812a.iterator();
            while (it.hasNext()) {
                it.next().mo3831d();
            }
            this.f4816e = false;
        }
    }
}
