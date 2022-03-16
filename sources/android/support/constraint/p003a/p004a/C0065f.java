package android.support.constraint.p003a.p004a;

/* renamed from: android.support.constraint.a.a.f */
public class C0065f extends C0074i {

    /* renamed from: a */
    private C0066a f274a = C0066a.MIDDLE;

    /* renamed from: android.support.constraint.a.a.f$a */
    public enum C0066a {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public C0065f() {
    }

    public C0065f(int i, int i2) {
        super(i, i2);
    }

    public C0065f(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.support.constraint.a.a.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.support.constraint.a.a.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.support.constraint.a.a.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.support.constraint.a.a.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87a(android.support.constraint.p003a.C0090e r12) {
        /*
            r11 = this;
            r4 = 0
            java.util.ArrayList r0 = r11.f535bi
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0066
            java.util.ArrayList r0 = r11.f535bi
            int r7 = r0.size()
            r6 = r4
            r2 = r11
        L_0x0011:
            if (r6 >= r7) goto L_0x0050
            java.util.ArrayList r0 = r11.f535bi
            java.lang.Object r0 = r0.get(r6)
            android.support.constraint.a.a.h r0 = (android.support.constraint.p003a.p004a.C0070h) r0
            if (r2 == r11) goto L_0x003e
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            r0.mo192a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r2, (android.support.constraint.p003a.p004a.C0060e.C0064c) r3)
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            r2.mo192a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r0, (android.support.constraint.p003a.p004a.C0060e.C0064c) r3)
        L_0x002b:
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.TOP
            android.support.constraint.a.a.e$c r2 = android.support.constraint.p003a.p004a.C0060e.C0064c.TOP
            r0.mo192a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r11, (android.support.constraint.p003a.p004a.C0060e.C0064c) r2)
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.BOTTOM
            android.support.constraint.a.a.e$c r2 = android.support.constraint.p003a.p004a.C0060e.C0064c.BOTTOM
            r0.mo192a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r11, (android.support.constraint.p003a.p004a.C0060e.C0064c) r2)
            int r1 = r6 + 1
            r6 = r1
            r2 = r0
            goto L_0x0011
        L_0x003e:
            android.support.constraint.a.a.e$b r5 = android.support.constraint.p003a.p004a.C0060e.C0063b.STRONG
            android.support.constraint.a.a.f$a r1 = r11.f274a
            android.support.constraint.a.a.f$a r3 = android.support.constraint.p003a.p004a.C0065f.C0066a.END
            if (r1 != r3) goto L_0x0048
            android.support.constraint.a.a.e$b r5 = android.support.constraint.p003a.p004a.C0060e.C0063b.WEAK
        L_0x0048:
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            r0.mo195a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r2, (android.support.constraint.p003a.p004a.C0060e.C0064c) r3, (int) r4, (android.support.constraint.p003a.p004a.C0060e.C0063b) r5)
            goto L_0x002b
        L_0x0050:
            if (r2 == r11) goto L_0x0066
            android.support.constraint.a.a.e$b r10 = android.support.constraint.p003a.p004a.C0060e.C0063b.STRONG
            android.support.constraint.a.a.f$a r0 = r11.f274a
            android.support.constraint.a.a.f$a r1 = android.support.constraint.p003a.p004a.C0065f.C0066a.BEGIN
            if (r0 != r1) goto L_0x005c
            android.support.constraint.a.a.e$b r10 = android.support.constraint.p003a.p004a.C0060e.C0063b.WEAK
        L_0x005c:
            android.support.constraint.a.a.e$c r6 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            android.support.constraint.a.a.e$c r8 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            r5 = r2
            r7 = r11
            r9 = r4
            r5.mo195a((android.support.constraint.p003a.p004a.C0060e.C0064c) r6, (android.support.constraint.p003a.p004a.C0070h) r7, (android.support.constraint.p003a.p004a.C0060e.C0064c) r8, (int) r9, (android.support.constraint.p003a.p004a.C0060e.C0063b) r10)
        L_0x0066:
            super.mo87a((android.support.constraint.p003a.C0090e) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p003a.p004a.C0065f.mo87a(android.support.constraint.a.e):void");
    }
}
