package android.support.p010v4.view.p034a;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.p010v4.view.p034a.C0986s;
import android.support.p010v4.view.p034a.C0989t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.a.r */
public class C0979r {

    /* renamed from: a */
    public static final int f3354a = -1;

    /* renamed from: b */
    private static final C0980a f3355b;

    /* renamed from: c */
    private final Object f3356c;

    /* renamed from: android.support.v4.view.a.r$a */
    interface C0980a {
        /* renamed from: a */
        Object mo3412a(C0979r rVar);
    }

    /* renamed from: android.support.v4.view.a.r$b */
    private static class C0981b extends C0985d {
        C0981b() {
        }

        /* renamed from: a */
        public Object mo3412a(final C0979r rVar) {
            return C0986s.m5446a(new C0986s.C0988a() {
                /* renamed from: a */
                public Object mo3413a(int i) {
                    C0949h a = rVar.mo3407a(i);
                    if (a == null) {
                        return null;
                    }
                    return a.mo3155a();
                }

                /* renamed from: a */
                public List<Object> mo3414a(String str, int i) {
                    List<C0949h> a = rVar.mo3409a(str, i);
                    if (a == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(a.get(i2).mo3155a());
                    }
                    return arrayList;
                }

                /* renamed from: a */
                public boolean mo3415a(int i, int i2, Bundle bundle) {
                    return rVar.mo3410a(i, i2, bundle);
                }
            });
        }
    }

    /* renamed from: android.support.v4.view.a.r$c */
    private static class C0983c extends C0985d {
        C0983c() {
        }

        /* renamed from: a */
        public Object mo3412a(final C0979r rVar) {
            return C0989t.m5450a(new C0989t.C0991a() {
                /* renamed from: a */
                public Object mo3416a(int i) {
                    C0949h a = rVar.mo3407a(i);
                    if (a == null) {
                        return null;
                    }
                    return a.mo3155a();
                }

                /* renamed from: a */
                public List<Object> mo3417a(String str, int i) {
                    List<C0949h> a = rVar.mo3409a(str, i);
                    if (a == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(a.get(i2).mo3155a());
                    }
                    return arrayList;
                }

                /* renamed from: a */
                public boolean mo3418a(int i, int i2, Bundle bundle) {
                    return rVar.mo3410a(i, i2, bundle);
                }

                /* renamed from: b */
                public Object mo3419b(int i) {
                    C0949h b = rVar.mo3411b(i);
                    if (b == null) {
                        return null;
                    }
                    return b.mo3155a();
                }
            });
        }
    }

    /* renamed from: android.support.v4.view.a.r$d */
    static class C0985d implements C0980a {
        C0985d() {
        }

        /* renamed from: a */
        public Object mo3412a(C0979r rVar) {
            return null;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f3355b = new C0983c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f3355b = new C0981b();
        } else {
            f3355b = new C0985d();
        }
    }

    public C0979r() {
        this.f3356c = f3355b.mo3412a(this);
    }

    public C0979r(Object obj) {
        this.f3356c = obj;
    }

    @C0003aa
    /* renamed from: a */
    public C0949h mo3407a(int i) {
        return null;
    }

    /* renamed from: a */
    public Object mo3408a() {
        return this.f3356c;
    }

    @C0003aa
    /* renamed from: a */
    public List<C0949h> mo3409a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo3410a(int i, int i2, Bundle bundle) {
        return false;
    }

    @C0003aa
    /* renamed from: b */
    public C0949h mo3411b(int i) {
        return null;
    }
}
