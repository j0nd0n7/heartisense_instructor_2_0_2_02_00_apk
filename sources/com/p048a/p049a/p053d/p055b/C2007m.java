package com.p048a.p049a.p053d.p055b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p048a.p049a.p078j.C2238i;

/* renamed from: com.a.a.d.b.m */
class C2007m {

    /* renamed from: a */
    private boolean f6848a;

    /* renamed from: b */
    private final Handler f6849b = new Handler(Looper.getMainLooper(), new C2009a());

    /* renamed from: com.a.a.d.b.m$a */
    private static class C2009a implements Handler.Callback {

        /* renamed from: a */
        public static final int f6850a = 1;

        private C2009a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C2006l) message.obj).mo7889d();
            return true;
        }
    }

    C2007m() {
    }

    /* renamed from: a */
    public void mo7894a(C2006l<?> lVar) {
        C2238i.m12729a();
        if (this.f6848a) {
            this.f6849b.obtainMessage(1, lVar).sendToTarget();
            return;
        }
        this.f6848a = true;
        lVar.mo7889d();
        this.f6848a = false;
    }
}
