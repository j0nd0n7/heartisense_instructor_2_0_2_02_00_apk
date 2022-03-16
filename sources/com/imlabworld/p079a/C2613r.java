package com.imlabworld.p079a;

import java.util.ArrayList;

/* renamed from: com.imlabworld.a.r */
public class C2613r {

    /* renamed from: a */
    final ArrayList<C2614s> f10670a = new ArrayList<>();

    /* renamed from: b */
    final ArrayList<C2615t> f10671b = new ArrayList<>();

    /* renamed from: c */
    private int f10672c = -1;

    /* renamed from: a */
    public int mo9972a() {
        return this.f10672c;
    }

    /* renamed from: a */
    public void mo9973a(int i) {
        this.f10672c = i;
    }

    /* renamed from: b */
    public ArrayList<C2614s> mo9974b() {
        return this.f10670a;
    }

    /* renamed from: b */
    public ArrayList<C2615t> mo9975b(int i) {
        ArrayList<C2615t> arrayList = new ArrayList<>();
        double d = 0.0d;
        int e = mo9978e();
        if (e > 0) {
            d = this.f10671b.get(e - 1).mo10000a();
            arrayList.add(this.f10671b.get(e - 1));
        }
        double d2 = d;
        for (int i2 = e - 2; i2 >= 0; i2--) {
            C2615t tVar = this.f10671b.get(i2);
            if (tVar.mo10000a() + ((double) (i * 1000)) >= d2) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public ArrayList<C2615t> mo9976c() {
        return this.f10671b;
    }

    /* renamed from: d */
    public int mo9977d() {
        if (this.f10670a == null) {
            return 0;
        }
        return this.f10670a.size();
    }

    /* renamed from: e */
    public int mo9978e() {
        if (this.f10671b == null) {
            return 0;
        }
        return this.f10671b.size();
    }
}
