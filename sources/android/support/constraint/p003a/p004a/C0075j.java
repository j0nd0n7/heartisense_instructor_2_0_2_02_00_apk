package android.support.constraint.p003a.p004a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: android.support.constraint.a.a.j */
public class C0075j {

    /* renamed from: a */
    public List<C0070h> f455a;

    /* renamed from: b */
    int f456b = -1;

    /* renamed from: c */
    int f457c = -1;

    /* renamed from: d */
    public boolean f458d = false;

    /* renamed from: e */
    public final int[] f459e = {this.f456b, this.f457c};

    /* renamed from: f */
    List<C0070h> f460f = new ArrayList();

    /* renamed from: g */
    List<C0070h> f461g = new ArrayList();

    /* renamed from: h */
    HashSet<C0070h> f462h = new HashSet<>();

    /* renamed from: i */
    HashSet<C0070h> f463i = new HashSet<>();

    /* renamed from: j */
    List<C0070h> f464j = new ArrayList();

    /* renamed from: k */
    List<C0070h> f465k = new ArrayList();

    C0075j(List<C0070h> list) {
        this.f455a = list;
    }

    C0075j(List<C0070h> list, boolean z) {
        this.f455a = list;
        this.f458d = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m331a(android.support.constraint.p003a.p004a.C0070h r7) {
        /*
            r6 = this;
            r1 = 0
            r3 = 1
            boolean r0 = r7.f358aF
            if (r0 == 0) goto L_0x000c
            boolean r0 = r7.mo279u()
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            android.support.constraint.a.a.e r0 = r7.f346O
            android.support.constraint.a.a.e r0 = r0.f248f
            if (r0 == 0) goto L_0x0074
            r2 = r3
        L_0x0014:
            if (r2 == 0) goto L_0x0076
            android.support.constraint.a.a.e r0 = r7.f346O
            android.support.constraint.a.a.e r0 = r0.f248f
        L_0x001a:
            if (r0 == 0) goto L_0x00f3
            android.support.constraint.a.a.h r4 = r0.f246d
            boolean r4 = r4.f359aG
            if (r4 != 0) goto L_0x0027
            android.support.constraint.a.a.h r4 = r0.f246d
            r6.m331a((android.support.constraint.p003a.p004a.C0070h) r4)
        L_0x0027:
            android.support.constraint.a.a.e$c r4 = r0.f247e
            android.support.constraint.a.a.e$c r5 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            if (r4 != r5) goto L_0x007b
            android.support.constraint.a.a.h r4 = r0.f246d
            int r4 = r4.f386aj
            android.support.constraint.a.a.h r0 = r0.f246d
            int r0 = r0.mo171M()
            int r0 = r0 + r4
        L_0x0038:
            if (r2 == 0) goto L_0x0086
            android.support.constraint.a.a.e r2 = r7.f346O
            int r2 = r2.mo122e()
            int r0 = r0 - r2
        L_0x0041:
            int r2 = r7.mo171M()
            int r2 = r0 - r2
            r7.mo255g(r2, r0)
            android.support.constraint.a.a.e r2 = r7.f348Q
            android.support.constraint.a.a.e r2 = r2.f248f
            if (r2 == 0) goto L_0x0093
            android.support.constraint.a.a.e r0 = r7.f348Q
            android.support.constraint.a.a.e r0 = r0.f248f
            android.support.constraint.a.a.h r1 = r0.f246d
            boolean r1 = r1.f359aG
            if (r1 != 0) goto L_0x005f
            android.support.constraint.a.a.h r1 = r0.f246d
            r6.m331a((android.support.constraint.p003a.p004a.C0070h) r1)
        L_0x005f:
            android.support.constraint.a.a.h r1 = r0.f246d
            int r1 = r1.f387ak
            android.support.constraint.a.a.h r0 = r0.f246d
            int r0 = r0.f392ap
            int r0 = r0 + r1
            int r1 = r7.f392ap
            int r0 = r0 - r1
            int r1 = r7.f383ag
            int r1 = r1 + r0
            r7.mo257h(r0, r1)
            r7.f359aG = r3
            goto L_0x000c
        L_0x0074:
            r2 = r1
            goto L_0x0014
        L_0x0076:
            android.support.constraint.a.a.e r0 = r7.f344M
            android.support.constraint.a.a.e r0 = r0.f248f
            goto L_0x001a
        L_0x007b:
            android.support.constraint.a.a.e$c r4 = r0.f247e
            android.support.constraint.a.a.e$c r5 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            if (r4 != r5) goto L_0x00f3
            android.support.constraint.a.a.h r0 = r0.f246d
            int r0 = r0.f386aj
            goto L_0x0038
        L_0x0086:
            android.support.constraint.a.a.e r2 = r7.f344M
            int r2 = r2.mo122e()
            int r4 = r7.mo171M()
            int r2 = r2 + r4
            int r0 = r0 + r2
            goto L_0x0041
        L_0x0093:
            android.support.constraint.a.a.e r2 = r7.f347P
            android.support.constraint.a.a.e r2 = r2.f248f
            if (r2 == 0) goto L_0x00d4
            r2 = r3
        L_0x009a:
            if (r2 == 0) goto L_0x00d6
            android.support.constraint.a.a.e r1 = r7.f347P
            android.support.constraint.a.a.e r1 = r1.f248f
        L_0x00a0:
            if (r1 == 0) goto L_0x00be
            android.support.constraint.a.a.h r4 = r1.f246d
            boolean r4 = r4.f359aG
            if (r4 != 0) goto L_0x00ad
            android.support.constraint.a.a.h r4 = r1.f246d
            r6.m331a((android.support.constraint.p003a.p004a.C0070h) r4)
        L_0x00ad:
            android.support.constraint.a.a.e$c r4 = r1.f247e
            android.support.constraint.a.a.e$c r5 = android.support.constraint.p003a.p004a.C0060e.C0064c.BOTTOM
            if (r4 != r5) goto L_0x00db
            android.support.constraint.a.a.h r0 = r1.f246d
            int r0 = r0.f387ak
            android.support.constraint.a.a.h r1 = r1.f246d
            int r1 = r1.mo175Q()
            int r0 = r0 + r1
        L_0x00be:
            if (r2 == 0) goto L_0x00e6
            android.support.constraint.a.a.e r1 = r7.f347P
            int r1 = r1.mo122e()
            int r0 = r0 - r1
        L_0x00c7:
            int r1 = r7.mo175Q()
            int r1 = r0 - r1
            r7.mo257h(r1, r0)
            r7.f359aG = r3
            goto L_0x000c
        L_0x00d4:
            r2 = r1
            goto L_0x009a
        L_0x00d6:
            android.support.constraint.a.a.e r1 = r7.f345N
            android.support.constraint.a.a.e r1 = r1.f248f
            goto L_0x00a0
        L_0x00db:
            android.support.constraint.a.a.e$c r4 = r1.f247e
            android.support.constraint.a.a.e$c r5 = android.support.constraint.p003a.p004a.C0060e.C0064c.TOP
            if (r4 != r5) goto L_0x00be
            android.support.constraint.a.a.h r0 = r1.f246d
            int r0 = r0.f387ak
            goto L_0x00be
        L_0x00e6:
            android.support.constraint.a.a.e r1 = r7.f345N
            int r1 = r1.mo122e()
            int r2 = r7.mo175Q()
            int r1 = r1 + r2
            int r0 = r0 + r1
            goto L_0x00c7
        L_0x00f3:
            r0 = r1
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p003a.p004a.C0075j.m331a(android.support.constraint.a.a.h):void");
    }

    /* renamed from: a */
    private void m332a(ArrayList<C0070h> arrayList, C0070h hVar) {
        if (!hVar.f360aH) {
            arrayList.add(hVar);
            hVar.f360aH = true;
            if (!hVar.mo279u()) {
                if (hVar instanceof C0078l) {
                    C0078l lVar = (C0078l) hVar;
                    int i = lVar.f483aS;
                    for (int i2 = 0; i2 < i; i2++) {
                        m332a(arrayList, lVar.f482aR[i2]);
                    }
                }
                for (C0060e eVar : hVar.f352Z) {
                    C0060e eVar2 = eVar.f248f;
                    if (eVar2 != null) {
                        C0070h hVar2 = eVar2.f246d;
                        if (!(eVar2 == null || hVar2 == hVar.mo157B())) {
                            m332a(arrayList, hVar2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0070h> mo311a() {
        if (!this.f464j.isEmpty()) {
            return this.f464j;
        }
        int size = this.f455a.size();
        for (int i = 0; i < size; i++) {
            C0070h hVar = this.f455a.get(i);
            if (!hVar.f358aF) {
                m332a((ArrayList<C0070h>) (ArrayList) this.f464j, hVar);
            }
        }
        this.f465k.clear();
        this.f465k.addAll(this.f455a);
        this.f465k.removeAll(this.f464j);
        return this.f464j;
    }

    /* renamed from: a */
    public List<C0070h> mo312a(int i) {
        if (i == 0) {
            return this.f460f;
        }
        if (i == 1) {
            return this.f461g;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo313a(C0070h hVar, int i) {
        if (i == 0) {
            this.f462h.add(hVar);
        } else if (i == 1) {
            this.f463i.add(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<C0070h> mo314b(int i) {
        if (i == 0) {
            return this.f462h;
        }
        if (i == 1) {
            return this.f463i;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo315b() {
        int size = this.f465k.size();
        for (int i = 0; i < size; i++) {
            m331a(this.f465k.get(i));
        }
    }
}
