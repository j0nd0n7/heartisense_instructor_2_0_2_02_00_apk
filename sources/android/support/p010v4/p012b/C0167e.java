package android.support.p010v4.p012b;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.b.e */
class C0167e implements C0165c {

    /* renamed from: android.support.v4.b.e$a */
    private static class C0168a implements C0174g {

        /* renamed from: a */
        List<C0164b> f1058a = new ArrayList();

        /* renamed from: b */
        List<C0166d> f1059b = new ArrayList();

        /* renamed from: c */
        View f1060c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f1061d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f1062e = 200;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public float f1063f = 0.0f;

        /* renamed from: g */
        private boolean f1064g = false;

        /* renamed from: h */
        private boolean f1065h = false;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public Runnable f1066i = new Runnable() {
            public void run() {
                float a = (((float) (C0168a.this.m816e() - C0168a.this.f1061d)) * 1.0f) / ((float) C0168a.this.f1062e);
                if (a > 1.0f || C0168a.this.f1060c.getParent() == null) {
                    a = 1.0f;
                }
                float unused = C0168a.this.f1063f = a;
                C0168a.this.m813d();
                if (C0168a.this.f1063f >= 1.0f) {
                    C0168a.this.m820g();
                } else {
                    C0168a.this.f1060c.postDelayed(C0168a.this.f1066i, 16);
                }
            }
        };

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m813d() {
            for (int size = this.f1059b.size() - 1; size >= 0; size--) {
                this.f1059b.get(size).mo724a(this);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public long m816e() {
            return this.f1060c.getDrawingTime();
        }

        /* renamed from: f */
        private void m817f() {
            for (int size = this.f1058a.size() - 1; size >= 0; size--) {
                this.f1058a.get(size).mo718a(this);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m820g() {
            for (int size = this.f1058a.size() - 1; size >= 0; size--) {
                this.f1058a.get(size).mo719b(this);
            }
        }

        /* renamed from: h */
        private void m821h() {
            for (int size = this.f1058a.size() - 1; size >= 0; size--) {
                this.f1058a.get(size).mo720c(this);
            }
        }

        /* renamed from: a */
        public void mo725a() {
            if (!this.f1064g) {
                this.f1064g = true;
                m817f();
                this.f1063f = 0.0f;
                this.f1061d = m816e();
                this.f1060c.postDelayed(this.f1066i, 16);
            }
        }

        /* renamed from: a */
        public void mo726a(long j) {
            if (!this.f1064g) {
                this.f1062e = j;
            }
        }

        /* renamed from: a */
        public void mo727a(C0164b bVar) {
            this.f1058a.add(bVar);
        }

        /* renamed from: a */
        public void mo728a(C0166d dVar) {
            this.f1059b.add(dVar);
        }

        /* renamed from: a */
        public void mo729a(View view) {
            this.f1060c = view;
        }

        /* renamed from: b */
        public void mo730b() {
            if (!this.f1065h) {
                this.f1065h = true;
                if (this.f1064g) {
                    m821h();
                }
                m820g();
            }
        }

        /* renamed from: c */
        public float mo731c() {
            return this.f1063f;
        }
    }

    C0167e() {
    }

    /* renamed from: a */
    public C0174g mo722a() {
        return new C0168a();
    }

    /* renamed from: a */
    public void mo723a(View view) {
    }
}
