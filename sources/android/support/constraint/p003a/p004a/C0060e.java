package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.C0088c;
import android.support.constraint.p003a.C0096h;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: android.support.constraint.a.a.e */
public class C0060e {

    /* renamed from: a */
    public static final int f241a = 0;

    /* renamed from: b */
    public static final int f242b = 1;

    /* renamed from: c */
    public static final int f243c = 2;

    /* renamed from: j */
    private static final boolean f244j = false;

    /* renamed from: l */
    private static final int f245l = -1;

    /* renamed from: d */
    final C0070h f246d;

    /* renamed from: e */
    final C0064c f247e;

    /* renamed from: f */
    C0060e f248f;

    /* renamed from: g */
    public int f249g = 0;

    /* renamed from: h */
    int f250h = -1;

    /* renamed from: i */
    C0096h f251i;

    /* renamed from: k */
    private C0081o f252k = new C0081o(this);

    /* renamed from: m */
    private C0063b f253m = C0063b.NONE;

    /* renamed from: n */
    private C0062a f254n = C0062a.RELAXED;

    /* renamed from: o */
    private int f255o = 0;

    /* renamed from: android.support.constraint.a.a.e$a */
    public enum C0062a {
        RELAXED,
        STRICT
    }

    /* renamed from: android.support.constraint.a.a.e$b */
    public enum C0063b {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: android.support.constraint.a.a.e$c */
    public enum C0064c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0060e(C0070h hVar, C0064c cVar) {
        this.f246d = hVar;
        this.f247e = cVar;
    }

    /* renamed from: a */
    private boolean m97a(C0070h hVar, HashSet<C0070h> hashSet) {
        if (hashSet.contains(hVar)) {
            return false;
        }
        hashSet.add(hVar);
        if (hVar == mo118c()) {
            return true;
        }
        ArrayList<C0060e> al = hVar.mo219al();
        int size = al.size();
        for (int i = 0; i < size; i++) {
            C0060e eVar = al.get(i);
            if (eVar.mo117b(this) && eVar.mo128k() && m97a(eVar.mo124g().mo118c(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C0081o mo103a() {
        return this.f252k;
    }

    /* renamed from: a */
    public void mo104a(int i) {
        this.f255o = i;
    }

    /* renamed from: a */
    public void mo105a(C0062a aVar) {
        this.f254n = aVar;
    }

    /* renamed from: a */
    public void mo106a(C0063b bVar) {
        if (mo128k()) {
            this.f253m = bVar;
        }
    }

    /* renamed from: a */
    public void mo107a(C0088c cVar) {
        if (this.f251i == null) {
            this.f251i = new C0096h(C0096h.C0098a.UNRESTRICTED, (String) null);
        } else {
            this.f251i.mo449d();
        }
    }

    /* renamed from: a */
    public boolean mo108a(C0060e eVar) {
        boolean z;
        boolean z2 = true;
        if (eVar == null) {
            return false;
        }
        C0064c d = eVar.mo121d();
        if (d == this.f247e) {
            return this.f247e != C0064c.BASELINE || (eVar.mo118c().mo216ai() && mo118c().mo216ai());
        }
        switch (this.f247e) {
            case CENTER:
                if (d == C0064c.BASELINE || d == C0064c.CENTER_X || d == C0064c.CENTER_Y) {
                    z2 = false;
                }
                return z2;
            case LEFT:
            case RIGHT:
                z = d == C0064c.LEFT || d == C0064c.RIGHT;
                if (eVar.mo118c() instanceof C0076k) {
                    return z || d == C0064c.CENTER_X;
                }
                break;
            case TOP:
            case BOTTOM:
                z = d == C0064c.TOP || d == C0064c.BOTTOM;
                if (eVar.mo118c() instanceof C0076k) {
                    return z || d == C0064c.CENTER_Y;
                }
                break;
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return false;
            default:
                throw new AssertionError(this.f247e.name());
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo109a(C0060e eVar, int i) {
        return mo111a(eVar, i, -1, C0063b.STRONG, 0, false);
    }

    /* renamed from: a */
    public boolean mo110a(C0060e eVar, int i, int i2) {
        return mo111a(eVar, i, -1, C0063b.STRONG, i2, false);
    }

    /* renamed from: a */
    public boolean mo111a(C0060e eVar, int i, int i2, C0063b bVar, int i3, boolean z) {
        if (eVar == null) {
            this.f248f = null;
            this.f249g = 0;
            this.f250h = -1;
            this.f253m = C0063b.NONE;
            this.f255o = 2;
            return true;
        } else if (!z && !mo108a(eVar)) {
            return false;
        } else {
            this.f248f = eVar;
            if (i > 0) {
                this.f249g = i;
            } else {
                this.f249g = 0;
            }
            this.f250h = i2;
            this.f253m = bVar;
            this.f255o = i3;
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo112a(C0060e eVar, int i, C0063b bVar, int i2) {
        return mo111a(eVar, i, -1, bVar, i2, false);
    }

    /* renamed from: a */
    public boolean mo113a(C0070h hVar) {
        if (m97a(hVar, (HashSet<C0070h>) new HashSet())) {
            return false;
        }
        C0070h B = mo118c().mo157B();
        if (B == hVar) {
            return true;
        }
        return hVar.mo157B() == B;
    }

    /* renamed from: a */
    public boolean mo114a(C0070h hVar, C0060e eVar) {
        return mo113a(hVar);
    }

    /* renamed from: b */
    public C0096h mo115b() {
        return this.f251i;
    }

    /* renamed from: b */
    public void mo116b(int i) {
        if (mo128k()) {
            this.f249g = i;
        }
    }

    /* renamed from: b */
    public boolean mo117b(C0060e eVar) {
        boolean z = true;
        C0064c d = eVar.mo121d();
        if (d == this.f247e) {
            return true;
        }
        switch (this.f247e) {
            case CENTER:
                if (d == C0064c.BASELINE) {
                    z = false;
                }
                return z;
            case LEFT:
            case RIGHT:
            case CENTER_X:
                return d == C0064c.LEFT || d == C0064c.RIGHT || d == C0064c.CENTER_X;
            case TOP:
            case BOTTOM:
            case BASELINE:
            case CENTER_Y:
                return d == C0064c.TOP || d == C0064c.BOTTOM || d == C0064c.CENTER_Y || d == C0064c.BASELINE;
            case NONE:
                return false;
            default:
                throw new AssertionError(this.f247e.name());
        }
    }

    /* renamed from: c */
    public C0070h mo118c() {
        return this.f246d;
    }

    /* renamed from: c */
    public void mo119c(int i) {
        if (mo128k()) {
            this.f250h = i;
        }
    }

    /* renamed from: c */
    public boolean mo120c(C0060e eVar) {
        if (this.f247e == C0064c.CENTER) {
            return false;
        }
        if (this.f247e == eVar.mo121d()) {
            return true;
        }
        switch (this.f247e) {
            case CENTER:
            case BASELINE:
            case NONE:
                return false;
            case LEFT:
                switch (eVar.mo121d()) {
                    case RIGHT:
                        return true;
                    case CENTER_X:
                        return true;
                    default:
                        return false;
                }
            case RIGHT:
                switch (eVar.mo121d()) {
                    case LEFT:
                        return true;
                    case CENTER_X:
                        return true;
                    default:
                        return false;
                }
            case TOP:
                switch (eVar.mo121d()) {
                    case BOTTOM:
                        return true;
                    case CENTER_Y:
                        return true;
                    default:
                        return false;
                }
            case BOTTOM:
                switch (eVar.mo121d()) {
                    case TOP:
                        return true;
                    case CENTER_Y:
                        return true;
                    default:
                        return false;
                }
            case CENTER_X:
                switch (eVar.mo121d()) {
                    case LEFT:
                        return true;
                    case RIGHT:
                        return true;
                    default:
                        return false;
                }
            case CENTER_Y:
                switch (eVar.mo121d()) {
                    case TOP:
                        return true;
                    case BOTTOM:
                        return true;
                    default:
                        return false;
                }
            default:
                throw new AssertionError(this.f247e.name());
        }
    }

    /* renamed from: d */
    public C0064c mo121d() {
        return this.f247e;
    }

    /* renamed from: e */
    public int mo122e() {
        if (this.f246d.mo163E() == 8) {
            return 0;
        }
        return (this.f250h <= -1 || this.f248f == null || this.f248f.f246d.mo163E() != 8) ? this.f249g : this.f250h;
    }

    /* renamed from: f */
    public C0063b mo123f() {
        return this.f253m;
    }

    /* renamed from: g */
    public C0060e mo124g() {
        return this.f248f;
    }

    /* renamed from: h */
    public C0062a mo125h() {
        return this.f254n;
    }

    /* renamed from: i */
    public int mo126i() {
        return this.f255o;
    }

    /* renamed from: j */
    public void mo127j() {
        this.f248f = null;
        this.f249g = 0;
        this.f250h = -1;
        this.f253m = C0063b.STRONG;
        this.f255o = 0;
        this.f254n = C0062a.RELAXED;
        this.f252k.mo347b();
    }

    /* renamed from: k */
    public boolean mo128k() {
        return this.f248f != null;
    }

    /* renamed from: l */
    public boolean mo129l() {
        switch (this.f247e) {
            case CENTER:
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return false;
            case LEFT:
            case RIGHT:
            case TOP:
            case BOTTOM:
                return true;
            default:
                throw new AssertionError(this.f247e.name());
        }
    }

    /* renamed from: m */
    public boolean mo130m() {
        switch (this.f247e) {
            case CENTER:
            case LEFT:
            case RIGHT:
            case CENTER_X:
                return false;
            case TOP:
            case BOTTOM:
            case BASELINE:
            case CENTER_Y:
            case NONE:
                return true;
            default:
                throw new AssertionError(this.f247e.name());
        }
    }

    /* renamed from: n */
    public int mo131n() {
        switch (this.f247e) {
            case CENTER:
                return 3;
            case LEFT:
            case RIGHT:
            case CENTER_Y:
                return 1;
            case TOP:
                return 0;
            case BOTTOM:
                return 0;
            case BASELINE:
                return 2;
            case CENTER_X:
                return 0;
            case NONE:
                return 0;
            default:
                throw new AssertionError(this.f247e.name());
        }
    }

    /* renamed from: o */
    public int mo132o() {
        switch (this.f247e) {
            case CENTER:
                return 2;
            case LEFT:
                return 2;
            case RIGHT:
                return 2;
            case TOP:
                return 2;
            case BOTTOM:
                return 2;
            case BASELINE:
                return 1;
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return 0;
            default:
                throw new AssertionError(this.f247e.name());
        }
    }

    /* renamed from: p */
    public final C0060e mo133p() {
        switch (this.f247e) {
            case CENTER:
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
            case LEFT:
                return this.f246d.f346O;
            case RIGHT:
                return this.f246d.f344M;
            case TOP:
                return this.f246d.f347P;
            case BOTTOM:
                return this.f246d.f345N;
            default:
                throw new AssertionError(this.f247e.name());
        }
    }

    public String toString() {
        return this.f246d.mo164F() + ":" + this.f247e.toString();
    }
}
