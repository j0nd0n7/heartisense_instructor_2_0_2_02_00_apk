package com.imlabworld.HS_Instructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.imlabworld.HS_Instructor.a */
public class C2317a {

    /* renamed from: a */
    private static C2317a f7745a = null;

    /* renamed from: b */
    private ArrayList<C2426b> f7746b;

    private C2317a() {
        this.f7746b = null;
        this.f7746b = new ArrayList<>();
    }

    /* renamed from: a */
    public static C2317a m13152a() {
        if (f7745a == null) {
            f7745a = new C2317a();
        }
        return f7745a;
    }

    /* renamed from: a */
    public void mo8678a(C2426b bVar) {
        this.f7746b.add(bVar);
    }

    /* renamed from: b */
    public ArrayList<C2426b> mo8679b() {
        return this.f7746b;
    }

    /* renamed from: b */
    public boolean mo8680b(C2426b bVar) {
        return this.f7746b.remove(bVar);
    }

    /* renamed from: c */
    public void mo8681c() {
        Collections.reverse(this.f7746b);
        Iterator<C2426b> it = this.f7746b.iterator();
        while (it.hasNext()) {
            it.next().mo8931a();
        }
    }
}
