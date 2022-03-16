package com.imlabworld.p079a;

import android.os.Handler;
import android.util.Log;

/* renamed from: com.imlabworld.a.u */
public class C2616u {

    /* renamed from: a */
    public static final int f10697a = 1;

    /* renamed from: b */
    public static final int f10698b = 2;

    /* renamed from: c */
    public static final int f10699c = 3;

    /* renamed from: d */
    private final String f10700d = "SH_Timer";

    /* renamed from: e */
    private final boolean f10701e = true;

    /* renamed from: f */
    private C2617a f10702f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Handler f10703g;

    /* renamed from: h */
    private final double f10704h;

    /* renamed from: i */
    private boolean f10705i;

    /* renamed from: j */
    private boolean f10706j;

    /* renamed from: k */
    private long f10707k;

    /* renamed from: com.imlabworld.a.u$a */
    private class C2617a extends Thread {

        /* renamed from: a */
        public long f10708a = System.currentTimeMillis();

        /* renamed from: b */
        public boolean f10709b = false;

        /* renamed from: d */
        private long f10711d = 1;

        /* renamed from: e */
        private boolean f10712e = false;

        /* renamed from: f */
        private final int f10713f;

        public C2617a(double d) {
            this.f10713f = (int) (1000.0d * d);
            Log.d("SH_Timer", this.f10713f + "");
        }

        /* renamed from: a */
        public void mo10025a() {
            this.f10712e = true;
        }

        public void run() {
            Log.i("SH_Timer", "BEGIN timerThread");
            while (!this.f10712e) {
                if (!this.f10709b) {
                    try {
                        if ((System.currentTimeMillis() - this.f10708a) / ((long) this.f10713f) >= this.f10711d) {
                            C2616u.this.f10703g.sendMessage(C2616u.this.f10703g.obtainMessage(3));
                            this.f10711d++;
                        }
                    } catch (Exception e) {
                        Log.e("SH_Timer", "disconnected", e);
                        C2616u.this.m14575f();
                        return;
                    }
                }
                try {
                    sleep(15);
                } catch (Exception e2) {
                }
            }
        }
    }

    public C2616u(Handler handler, double d) {
        this.f10703g = handler;
        this.f10704h = d;
        this.f10705i = false;
        this.f10706j = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m14575f() {
        this.f10703g.sendMessage(this.f10703g.obtainMessage(2));
        mo10021b();
    }

    /* renamed from: a */
    public synchronized void mo10019a(Handler handler) {
        this.f10703g = handler;
    }

    /* renamed from: a */
    public synchronized boolean mo10020a() {
        return this.f10705i;
    }

    /* renamed from: b */
    public synchronized void mo10021b() {
        if (this.f10702f != null) {
            this.f10702f.mo10025a();
            this.f10702f = null;
        }
        this.f10705i = true;
        this.f10706j = false;
        this.f10702f = new C2617a(this.f10704h);
        this.f10702f.start();
        this.f10703g.sendMessage(this.f10703g.obtainMessage(1));
    }

    /* renamed from: c */
    public synchronized void mo10022c() {
        if (this.f10702f != null) {
            this.f10702f.mo10025a();
            this.f10702f = null;
        }
        this.f10705i = false;
        this.f10706j = false;
    }

    /* renamed from: d */
    public synchronized void mo10023d() {
        if (!this.f10706j) {
            this.f10702f.f10709b = true;
            this.f10706j = true;
            this.f10707k = System.currentTimeMillis();
        }
    }

    /* renamed from: e */
    public synchronized void mo10024e() {
        if (this.f10706j) {
            this.f10702f.f10709b = false;
            this.f10706j = false;
            this.f10702f.f10708a += System.currentTimeMillis() - this.f10707k;
        }
    }
}
