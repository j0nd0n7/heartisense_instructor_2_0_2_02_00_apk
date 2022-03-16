package android.support.constraint.p003a.p004a;

import java.util.Arrays;

/* renamed from: android.support.constraint.a.a.l */
public class C0078l extends C0070h {

    /* renamed from: aR */
    protected C0070h[] f482aR = new C0070h[4];

    /* renamed from: aS */
    protected int f483aS = 0;

    /* renamed from: e */
    public void mo143e() {
        this.f483aS = 0;
    }

    /* renamed from: f */
    public void mo332f(C0070h hVar) {
        if (this.f483aS + 1 > this.f482aR.length) {
            this.f482aR = (C0070h[]) Arrays.copyOf(this.f482aR, this.f482aR.length * 2);
        }
        this.f482aR[this.f483aS] = hVar;
        this.f483aS++;
    }
}
