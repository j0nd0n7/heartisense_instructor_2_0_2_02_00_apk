package android.support.p010v4.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p010v4.p025i.C0755t;
import android.support.p010v4.p033o.C0901p;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1066b;
import android.support.p010v4.view.C1103bk;
import android.support.p010v4.view.C1167k;
import android.support.p010v4.view.p034a.C0922a;
import android.support.p010v4.view.p034a.C0932e;
import android.support.p010v4.view.p034a.C0949h;
import android.support.p010v4.view.p034a.C0979r;
import android.support.p010v4.view.p034a.C0992u;
import android.support.p010v4.widget.C1334q;
import android.support.p036v7.widget.ActivityChooserView;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.p */
public abstract class C1330p extends C1066b {

    /* renamed from: b */
    public static final int f4100b = Integer.MIN_VALUE;

    /* renamed from: c */
    public static final int f4101c = -1;

    /* renamed from: d */
    private static final String f4102d = "android.view.View";

    /* renamed from: e */
    private static final Rect f4103e = new Rect(ActivityChooserView.C1593a.f5166a, ActivityChooserView.C1593a.f5166a, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: p */
    private static final C1334q.C1335a<C0949h> f4104p = new C1334q.C1335a<C0949h>() {
        /* renamed from: a */
        public void mo4508a(C0949h hVar, Rect rect) {
            hVar.mo3158a(rect);
        }
    };

    /* renamed from: q */
    private static final C1334q.C1336b<C0901p<C0949h>, C0949h> f4105q = new C1334q.C1336b<C0901p<C0949h>, C0949h>() {
        /* renamed from: a */
        public int mo4510a(C0901p<C0949h> pVar) {
            return pVar.mo2986b();
        }

        /* renamed from: a */
        public C0949h mo4512a(C0901p<C0949h> pVar, int i) {
            return pVar.mo2996f(i);
        }
    };

    /* renamed from: f */
    private final Rect f4106f = new Rect();

    /* renamed from: g */
    private final Rect f4107g = new Rect();

    /* renamed from: h */
    private final Rect f4108h = new Rect();

    /* renamed from: i */
    private final int[] f4109i = new int[2];

    /* renamed from: j */
    private final AccessibilityManager f4110j;

    /* renamed from: k */
    private final View f4111k;

    /* renamed from: l */
    private C1333a f4112l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f4113m = Integer.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f4114n = Integer.MIN_VALUE;

    /* renamed from: o */
    private int f4115o = Integer.MIN_VALUE;

    /* renamed from: android.support.v4.widget.p$a */
    private class C1333a extends C0979r {
        C1333a() {
        }

        /* renamed from: a */
        public C0949h mo3407a(int i) {
            return C0949h.m4703a(C1330p.this.mo4499b(i));
        }

        /* renamed from: a */
        public boolean mo3410a(int i, int i2, Bundle bundle) {
            return C1330p.this.mo4495a(i, i2, bundle);
        }

        /* renamed from: b */
        public C0949h mo3411b(int i) {
            int a = i == 2 ? C1330p.this.f4113m : C1330p.this.f4114n;
            if (a == Integer.MIN_VALUE) {
                return null;
            }
            return mo3407a(a);
        }
    }

    public C1330p(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f4111k = view;
        this.f4110j = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (C1040ar.m5928e(view) == 0) {
            C1040ar.m5926d(view, 1);
        }
    }

    /* renamed from: a */
    private static Rect m7802a(@C0047z View view, int i, @C0047z Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        switch (i) {
            case 17:
                rect.set(width, 0, width, height);
                break;
            case 33:
                rect.set(0, height, width, height);
                break;
            case 66:
                rect.set(-1, 0, -1, height);
                break;
            case C0755t.f2804k:
                rect.set(0, -1, width, -1);
                break;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: a */
    private void m7803a(int i, Rect rect) {
        mo4499b(i).mo3158a(rect);
    }

    /* renamed from: a */
    private boolean m7804a(int i, Bundle bundle) {
        return C1040ar.m5905a(this.f4111k, i, bundle);
    }

    /* renamed from: a */
    private boolean m7805a(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f4111k.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f4111k.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (C1040ar.m5938h(view) <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* renamed from: b */
    private boolean m7807b(int i, @C0003aa Rect rect) {
        C0949h hVar;
        boolean z = true;
        C0901p<C0949h> f = m7812f();
        int i2 = this.f4114n;
        C0949h a = i2 == Integer.MIN_VALUE ? null : f.mo2983a(i2);
        switch (i) {
            case 1:
            case 2:
                if (C1040ar.m5947k(this.f4111k) != 1) {
                    z = false;
                }
                hVar = (C0949h) C1334q.m7855a(f, f4105q, f4104p, a, i, z, false);
                break;
            case 17:
            case 33:
            case 66:
            case C0755t.f2804k:
                Rect rect2 = new Rect();
                if (this.f4114n != Integer.MIN_VALUE) {
                    m7803a(this.f4114n, rect2);
                } else if (rect != null) {
                    rect2.set(rect);
                } else {
                    m7802a(this.f4111k, i, rect2);
                }
                hVar = (C0949h) C1334q.m7856a(f, f4105q, f4104p, a, rect2, i);
                break;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return mo4503c(hVar == null ? Integer.MIN_VALUE : f.mo2995e(f.mo2981a(hVar)));
    }

    /* renamed from: c */
    private AccessibilityEvent m7808c(int i, int i2) {
        switch (i) {
            case -1:
                return m7814g(i2);
            default:
                return m7810d(i, i2);
        }
    }

    /* renamed from: c */
    private boolean m7809c(int i, int i2, Bundle bundle) {
        switch (i2) {
            case 1:
                return mo4503c(i);
            case 2:
                return mo4505d(i);
            case 64:
                return m7818i(i);
            case 128:
                return m7819j(i);
            default:
                return mo4501b(i, i2, bundle);
        }
    }

    /* renamed from: d */
    private AccessibilityEvent m7810d(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C0992u b = C0922a.m4609b(obtain);
        C0949h b2 = mo4499b(i);
        b.mo3469u().add(b2.mo3243w());
        b.mo3439c(b2.mo3244x());
        b.mo3445e(b2.mo3238s());
        b.mo3440c(b2.mo3236r());
        b.mo3436b(b2.mo3234q());
        b.mo3433a(b2.mo3217i());
        mo4488a(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            b.mo3432a(b2.mo3242v());
            b.mo3431a(this.f4111k, i);
            obtain.setPackageName(this.f4111k.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: e */
    private static int m7811e(int i) {
        switch (i) {
            case 19:
                return 33;
            case 21:
                return 17;
            case 22:
                return 66;
            default:
                return C0755t.f2804k;
        }
    }

    /* renamed from: f */
    private C0901p<C0949h> m7812f() {
        ArrayList arrayList = new ArrayList();
        mo4492a((List<Integer>) arrayList);
        C0901p<C0949h> pVar = new C0901p<>();
        for (int i = 0; i < arrayList.size(); i++) {
            pVar.mo2988b(i, m7817h(i));
        }
        return pVar;
    }

    /* renamed from: f */
    private void m7813f(int i) {
        if (this.f4115o != i) {
            int i2 = this.f4115o;
            this.f4115o = i;
            mo4494a(i, 128);
            mo4494a(i2, 256);
        }
    }

    /* renamed from: g */
    private AccessibilityEvent m7814g(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        C1040ar.m5916b(this.f4111k, obtain);
        return obtain;
    }

    /* renamed from: g */
    private boolean m7815g() {
        return this.f4114n != Integer.MIN_VALUE && mo4501b(this.f4114n, 16, (Bundle) null);
    }

    @C0047z
    /* renamed from: h */
    private C0949h m7816h() {
        C0949h a = C0949h.m4704a(this.f4111k);
        C1040ar.m5890a(this.f4111k, a);
        ArrayList arrayList = new ArrayList();
        mo4492a((List<Integer>) arrayList);
        if (a.mo3182d() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a.mo3178c(this.f4111k, ((Integer) arrayList.get(i)).intValue());
            }
            return a;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    @C0047z
    /* renamed from: h */
    private C0949h m7817h(int i) {
        C0949h b = C0949h.m4707b();
        b.mo3219j(true);
        b.mo3181c(true);
        b.mo3168b((CharSequence) f4102d);
        b.mo3165b(f4103e);
        b.mo3184d(f4103e);
        b.mo3190e(this.f4111k);
        mo4487a(i, b);
        if (b.mo3243w() == null && b.mo3244x() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        b.mo3158a(this.f4107g);
        if (this.f4107g.equals(f4103e)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int e = b.mo3189e();
        if ((e & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else if ((e & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else {
            b.mo3161a((CharSequence) this.f4111k.getContext().getPackageName());
            b.mo3167b(this.f4111k, i);
            if (this.f4113m == i) {
                b.mo3201f(true);
                b.mo3183d(128);
            } else {
                b.mo3201f(false);
                b.mo3183d(64);
            }
            boolean z = this.f4114n == i;
            if (z) {
                b.mo3183d(2);
            } else if (b.mo3220j()) {
                b.mo3183d(1);
            }
            b.mo3186d(z);
            this.f4111k.getLocationOnScreen(this.f4109i);
            b.mo3176c(this.f4106f);
            if (this.f4106f.equals(f4103e)) {
                b.mo3158a(this.f4106f);
                if (b.f3309b != -1) {
                    C0949h b2 = C0949h.m4707b();
                    for (int i2 = b.f3309b; i2 != -1; i2 = b2.f3309b) {
                        b2.mo3191e(this.f4111k, -1);
                        b2.mo3165b(f4103e);
                        mo4487a(i2, b2);
                        b2.mo3158a(this.f4107g);
                        this.f4106f.offset(this.f4107g.left, this.f4107g.top);
                    }
                    b2.mo3245y();
                }
                this.f4106f.offset(this.f4109i[0] - this.f4111k.getScrollX(), this.f4109i[1] - this.f4111k.getScrollY());
            }
            if (this.f4111k.getLocalVisibleRect(this.f4108h)) {
                this.f4108h.offset(this.f4109i[0] - this.f4111k.getScrollX(), this.f4109i[1] - this.f4111k.getScrollY());
                this.f4106f.intersect(this.f4108h);
                b.mo3184d(this.f4106f);
                if (m7805a(this.f4106f)) {
                    b.mo3193e(true);
                }
            }
            return b;
        }
    }

    /* renamed from: i */
    private boolean m7818i(int i) {
        if (!this.f4110j.isEnabled() || !C0932e.m4659b(this.f4110j) || this.f4113m == i) {
            return false;
        }
        if (this.f4113m != Integer.MIN_VALUE) {
            m7819j(this.f4113m);
        }
        this.f4113m = i;
        this.f4111k.invalidate();
        mo4494a(i, 32768);
        return true;
    }

    /* renamed from: j */
    private boolean m7819j(int i) {
        if (this.f4113m != i) {
            return false;
        }
        this.f4113m = Integer.MIN_VALUE;
        this.f4111k.invalidate();
        mo4494a(i, 65536);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo4485a(float f, float f2);

    /* renamed from: a */
    public C0979r mo3763a(View view) {
        if (this.f4112l == null) {
            this.f4112l = new C1333a();
        }
        return this.f4112l;
    }

    /* renamed from: a */
    public final void mo4486a(int i) {
        mo4500b(i, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4487a(int i, C0949h hVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4488a(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4489a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4490a(C0949h hVar) {
    }

    /* renamed from: a */
    public void mo3076a(View view, C0949h hVar) {
        super.mo3076a(view, hVar);
        mo4490a(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4491a(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4492a(List<Integer> list);

    /* renamed from: a */
    public final void mo4493a(boolean z, int i, @C0003aa Rect rect) {
        if (this.f4114n != Integer.MIN_VALUE) {
            mo4505d(this.f4114n);
        }
        if (z) {
            m7807b(i, rect);
        }
    }

    /* renamed from: a */
    public final boolean mo4494a(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f4110j.isEnabled() || (parent = this.f4111k.getParent()) == null) {
            return false;
        }
        return C1103bk.m6573a(parent, this.f4111k, m7808c(i, i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4495a(int i, int i2, Bundle bundle) {
        switch (i) {
            case -1:
                return m7804a(i2, bundle);
            default:
                return m7809c(i, i2, bundle);
        }
    }

    /* renamed from: a */
    public final boolean mo4496a(@C0047z KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            case 19:
            case 20:
            case 21:
            case 22:
                if (!C1167k.m6999a(keyEvent)) {
                    return false;
                }
                int e = m7811e(keyCode);
                int repeatCount = keyEvent.getRepeatCount() + 1;
                int i = 0;
                while (i < repeatCount && m7807b(e, (Rect) null)) {
                    i++;
                    z = true;
                }
                return z;
            case 23:
            case 66:
                if (!C1167k.m6999a(keyEvent) || keyEvent.getRepeatCount() != 0) {
                    return false;
                }
                m7815g();
                return true;
            case 61:
                if (C1167k.m6999a(keyEvent)) {
                    return m7807b(2, (Rect) null);
                }
                if (C1167k.m7000a(keyEvent, 1)) {
                    return m7807b(1, (Rect) null);
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final boolean mo4497a(@C0047z MotionEvent motionEvent) {
        boolean z = true;
        if (!this.f4110j.isEnabled() || !C0932e.m4659b(this.f4110j)) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 7:
            case 9:
                int a = mo4485a(motionEvent.getX(), motionEvent.getY());
                m7813f(a);
                if (a == Integer.MIN_VALUE) {
                    z = false;
                }
                return z;
            case 10:
                if (this.f4113m == Integer.MIN_VALUE) {
                    return false;
                }
                m7813f(Integer.MIN_VALUE);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final int mo4498b() {
        return this.f4113m;
    }

    /* access modifiers changed from: package-private */
    @C0047z
    /* renamed from: b */
    public C0949h mo4499b(int i) {
        return i == -1 ? m7816h() : m7817h(i);
    }

    /* renamed from: b */
    public final void mo4500b(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f4110j.isEnabled() && (parent = this.f4111k.getParent()) != null) {
            AccessibilityEvent c = m7808c(i, 2048);
            C0922a.m4610b(c, i2);
            C1103bk.m6573a(parent, this.f4111k, c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo4501b(int i, int i2, Bundle bundle);

    /* renamed from: c */
    public final int mo4502c() {
        return this.f4114n;
    }

    /* renamed from: c */
    public final boolean mo4503c(int i) {
        if ((!this.f4111k.isFocused() && !this.f4111k.requestFocus()) || this.f4114n == i) {
            return false;
        }
        if (this.f4114n != Integer.MIN_VALUE) {
            mo4505d(this.f4114n);
        }
        this.f4114n = i;
        mo4489a(i, true);
        mo4494a(i, 8);
        return true;
    }

    /* renamed from: d */
    public final void mo4504d() {
        mo4500b(-1, 1);
    }

    /* renamed from: d */
    public void mo3078d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3078d(view, accessibilityEvent);
        mo4491a(accessibilityEvent);
    }

    /* renamed from: d */
    public final boolean mo4505d(int i) {
        if (this.f4114n != i) {
            return false;
        }
        this.f4114n = Integer.MIN_VALUE;
        mo4489a(i, false);
        mo4494a(i, 8);
        return true;
    }

    @Deprecated
    /* renamed from: e */
    public int mo4506e() {
        return mo4498b();
    }
}
