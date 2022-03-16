package android.support.constraint.p003a.p004a;

/* renamed from: android.support.constraint.a.a.n */
public class C0080n {

    /* renamed from: a */
    public int f496a;

    /* renamed from: b */
    public int f497b;

    /* renamed from: c */
    public int f498c;

    /* renamed from: d */
    public int f499d;

    /* renamed from: a */
    public int mo333a() {
        return (this.f496a + this.f498c) / 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo334a(int i, int i2) {
        this.f496a -= i;
        this.f497b -= i2;
        this.f498c += i * 2;
        this.f499d += i2 * 2;
    }

    /* renamed from: a */
    public void mo335a(int i, int i2, int i3, int i4) {
        this.f496a = i;
        this.f497b = i2;
        this.f498c = i3;
        this.f499d = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo336a(C0080n nVar) {
        return this.f496a >= nVar.f496a && this.f496a < nVar.f496a + nVar.f498c && this.f497b >= nVar.f497b && this.f497b < nVar.f497b + nVar.f499d;
    }

    /* renamed from: b */
    public int mo337b() {
        return (this.f497b + this.f499d) / 2;
    }

    /* renamed from: b */
    public boolean mo338b(int i, int i2) {
        return i >= this.f496a && i < this.f496a + this.f498c && i2 >= this.f497b && i2 < this.f497b + this.f499d;
    }
}
