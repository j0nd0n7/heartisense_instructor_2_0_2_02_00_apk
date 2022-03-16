package android.support.p036v7.p045g;

import android.os.Handler;
import android.os.Looper;
import android.support.p010v4.p014d.C0470t;
import android.support.p036v7.p045g.C1516g;
import android.support.p036v7.p045g.C1519h;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.support.v7.g.e */
class C1506e<T> implements C1516g<T> {

    /* renamed from: android.support.v7.g.e$a */
    static class C1511a {

        /* renamed from: a */
        private C1512b f4710a;

        C1511a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C1512b mo5081a() {
            C1512b bVar;
            if (this.f4710a == null) {
                bVar = null;
            } else {
                bVar = this.f4710a;
                this.f4710a = this.f4710a.f4720j;
            }
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo5082a(int i) {
            while (this.f4710a != null && this.f4710a.f4713a == i) {
                C1512b bVar = this.f4710a;
                this.f4710a = this.f4710a.f4720j;
                bVar.mo5085a();
            }
            if (this.f4710a != null) {
                C1512b bVar2 = this.f4710a;
                C1512b a = bVar2.f4720j;
                while (a != null) {
                    C1512b a2 = a.f4720j;
                    if (a.f4713a == i) {
                        C1512b unused = bVar2.f4720j = a2;
                        a.mo5085a();
                    } else {
                        bVar2 = a;
                    }
                    a = a2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo5083a(C1512b bVar) {
            C1512b unused = bVar.f4720j = this.f4710a;
            this.f4710a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo5084b(C1512b bVar) {
            if (this.f4710a == null) {
                this.f4710a = bVar;
            } else {
                C1512b bVar2 = this.f4710a;
                while (bVar2.f4720j != null) {
                    bVar2 = bVar2.f4720j;
                }
                C1512b unused = bVar2.f4720j = bVar;
            }
        }
    }

    /* renamed from: android.support.v7.g.e$b */
    static class C1512b {

        /* renamed from: h */
        private static C1512b f4711h;

        /* renamed from: i */
        private static final Object f4712i = new Object();

        /* renamed from: a */
        public int f4713a;

        /* renamed from: b */
        public int f4714b;

        /* renamed from: c */
        public int f4715c;

        /* renamed from: d */
        public int f4716d;

        /* renamed from: e */
        public int f4717e;

        /* renamed from: f */
        public int f4718f;

        /* renamed from: g */
        public Object f4719g;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C1512b f4720j;

        C1512b() {
        }

        /* renamed from: a */
        static C1512b m8811a(int i, int i2, int i3) {
            return m8812a(i, i2, i3, 0, 0, 0, (Object) null);
        }

        /* renamed from: a */
        static C1512b m8812a(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            C1512b bVar;
            synchronized (f4712i) {
                if (f4711h == null) {
                    bVar = new C1512b();
                } else {
                    bVar = f4711h;
                    f4711h = f4711h.f4720j;
                    bVar.f4720j = null;
                }
                bVar.f4713a = i;
                bVar.f4714b = i2;
                bVar.f4715c = i3;
                bVar.f4716d = i4;
                bVar.f4717e = i5;
                bVar.f4718f = i6;
                bVar.f4719g = obj;
            }
            return bVar;
        }

        /* renamed from: a */
        static C1512b m8813a(int i, int i2, Object obj) {
            return m8812a(i, i2, 0, 0, 0, 0, obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5085a() {
            this.f4720j = null;
            this.f4718f = 0;
            this.f4717e = 0;
            this.f4716d = 0;
            this.f4715c = 0;
            this.f4714b = 0;
            this.f4713a = 0;
            this.f4719g = null;
            synchronized (f4712i) {
                if (f4711h != null) {
                    this.f4720j = f4711h;
                }
                f4711h = this;
            }
        }
    }

    C1506e() {
    }

    /* renamed from: a */
    public C1516g.C1517a<T> mo5077a(final C1516g.C1517a<T> aVar) {
        return new C1516g.C1517a<T>() {

            /* renamed from: c */
            static final int f4699c = 1;

            /* renamed from: d */
            static final int f4700d = 2;

            /* renamed from: e */
            static final int f4701e = 3;

            /* renamed from: f */
            static final int f4702f = 4;

            /* renamed from: a */
            final C1511a f4703a = new C1511a();

            /* renamed from: b */
            AtomicBoolean f4704b = new AtomicBoolean(false);

            /* renamed from: i */
            private final Executor f4707i = C0470t.m2511a();

            /* renamed from: j */
            private Runnable f4708j = new Runnable() {
                public void run() {
                    while (true) {
                        C1512b a = C15092.this.f4703a.mo5081a();
                        if (a != null) {
                            switch (a.f4713a) {
                                case 1:
                                    C15092.this.f4703a.mo5082a(1);
                                    aVar.mo5050a(a.f4714b);
                                    break;
                                case 2:
                                    C15092.this.f4703a.mo5082a(2);
                                    C15092.this.f4703a.mo5082a(3);
                                    aVar.mo5052a(a.f4714b, a.f4715c, a.f4716d, a.f4717e, a.f4718f);
                                    break;
                                case 3:
                                    aVar.mo5051a(a.f4714b, a.f4715c);
                                    break;
                                case 4:
                                    aVar.mo5053a((C1519h.C1520a) a.f4719g);
                                    break;
                                default:
                                    Log.e("ThreadUtil", "Unsupported message, what=" + a.f4713a);
                                    break;
                            }
                        } else {
                            C15092.this.f4704b.set(false);
                            return;
                        }
                    }
                }
            };

            /* renamed from: a */
            private void m8800a() {
                if (this.f4704b.compareAndSet(false, true)) {
                    this.f4707i.execute(this.f4708j);
                }
            }

            /* renamed from: a */
            private void m8801a(C1512b bVar) {
                this.f4703a.mo5084b(bVar);
                m8800a();
            }

            /* renamed from: b */
            private void m8802b(C1512b bVar) {
                this.f4703a.mo5083a(bVar);
                m8800a();
            }

            /* renamed from: a */
            public void mo5050a(int i) {
                m8802b(C1512b.m8813a(1, i, (Object) null));
            }

            /* renamed from: a */
            public void mo5051a(int i, int i2) {
                m8801a(C1512b.m8811a(3, i, i2));
            }

            /* renamed from: a */
            public void mo5052a(int i, int i2, int i3, int i4, int i5) {
                m8802b(C1512b.m8812a(2, i, i2, i3, i4, i5, (Object) null));
            }

            /* renamed from: a */
            public void mo5053a(C1519h.C1520a<T> aVar) {
                m8801a(C1512b.m8813a(4, 0, (Object) aVar));
            }
        };
    }

    /* renamed from: a */
    public C1516g.C1518b<T> mo5078a(final C1516g.C1518b<T> bVar) {
        return new C1516g.C1518b<T>() {

            /* renamed from: b */
            static final int f4690b = 1;

            /* renamed from: c */
            static final int f4691c = 2;

            /* renamed from: d */
            static final int f4692d = 3;

            /* renamed from: a */
            final C1511a f4693a = new C1511a();

            /* renamed from: g */
            private final Handler f4696g = new Handler(Looper.getMainLooper());

            /* renamed from: h */
            private Runnable f4697h = new Runnable() {
                public void run() {
                    C1512b a = C15071.this.f4693a.mo5081a();
                    while (a != null) {
                        switch (a.f4713a) {
                            case 1:
                                bVar.mo5047a(a.f4714b, a.f4715c);
                                break;
                            case 2:
                                bVar.mo5048a(a.f4714b, (C1519h.C1520a) a.f4719g);
                                break;
                            case 3:
                                bVar.mo5049b(a.f4714b, a.f4715c);
                                break;
                            default:
                                Log.e("ThreadUtil", "Unsupported message, what=" + a.f4713a);
                                break;
                        }
                        a = C15071.this.f4693a.mo5081a();
                    }
                }
            };

            /* renamed from: a */
            private void m8796a(C1512b bVar) {
                this.f4693a.mo5084b(bVar);
                this.f4696g.post(this.f4697h);
            }

            /* renamed from: a */
            public void mo5047a(int i, int i2) {
                m8796a(C1512b.m8811a(1, i, i2));
            }

            /* renamed from: a */
            public void mo5048a(int i, C1519h.C1520a<T> aVar) {
                m8796a(C1512b.m8813a(2, i, (Object) aVar));
            }

            /* renamed from: b */
            public void mo5049b(int i, int i2) {
                m8796a(C1512b.m8811a(3, i, i2));
            }
        };
    }
}
