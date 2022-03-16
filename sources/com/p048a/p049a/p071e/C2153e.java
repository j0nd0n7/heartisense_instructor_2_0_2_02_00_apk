package com.p048a.p049a.p071e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p048a.p049a.p071e.C2150c;

/* renamed from: com.a.a.e.e */
class C2153e implements C2150c {

    /* renamed from: a */
    private final Context f7113a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2150c.C2151a f7114b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f7115c;

    /* renamed from: d */
    private boolean f7116d;

    /* renamed from: e */
    private final BroadcastReceiver f7117e = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            boolean a = C2153e.this.f7115c;
            boolean unused = C2153e.this.f7115c = C2153e.this.m12223a(context);
            if (a != C2153e.this.f7115c) {
                C2153e.this.f7114b.mo8087a(C2153e.this.f7115c);
            }
        }
    };

    public C2153e(Context context, C2150c.C2151a aVar) {
        this.f7113a = context.getApplicationContext();
        this.f7114b = aVar;
    }

    /* renamed from: a */
    private void m12222a() {
        if (!this.f7116d) {
            this.f7115c = m12223a(this.f7113a);
            this.f7113a.registerReceiver(this.f7117e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f7116d = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12223a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: b */
    private void m12228b() {
        if (this.f7116d) {
            this.f7113a.unregisterReceiver(this.f7117e);
            this.f7116d = false;
        }
    }

    /* renamed from: g */
    public void mo8089g() {
        m12222a();
    }

    /* renamed from: h */
    public void mo8090h() {
        m12228b();
    }

    /* renamed from: i */
    public void mo8091i() {
    }
}
