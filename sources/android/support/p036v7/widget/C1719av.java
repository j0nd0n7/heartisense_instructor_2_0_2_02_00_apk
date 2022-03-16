package android.support.p036v7.widget;

import android.graphics.Rect;
import android.support.p036v7.widget.C1732az;
import android.view.View;

/* renamed from: android.support.v7.widget.av */
public abstract class C1719av {

    /* renamed from: b */
    public static final int f5803b = 0;

    /* renamed from: c */
    public static final int f5804c = 1;

    /* renamed from: e */
    private static final int f5805e = Integer.MIN_VALUE;

    /* renamed from: a */
    protected final C1732az.C1750h f5806a;

    /* renamed from: d */
    final Rect f5807d;

    /* renamed from: f */
    private int f5808f;

    private C1719av(C1732az.C1750h hVar) {
        this.f5808f = Integer.MIN_VALUE;
        this.f5807d = new Rect();
        this.f5806a = hVar;
    }

    /* renamed from: a */
    public static C1719av m10280a(C1732az.C1750h hVar) {
        return new C1719av(hVar) {
            /* renamed from: a */
            public int mo6540a(View view) {
                return this.f5806a.mo6934o(view) - ((C1732az.C1755i) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: a */
            public void mo6542a(int i) {
                this.f5806a.mo5994k(i);
            }

            /* renamed from: a */
            public void mo6543a(View view, int i) {
                view.offsetLeftAndRight(i);
            }

            /* renamed from: b */
            public int mo6545b(View view) {
                return ((C1732az.C1755i) view.getLayoutParams()).rightMargin + this.f5806a.mo6936q(view);
            }

            /* renamed from: c */
            public int mo6546c() {
                return this.f5806a.mo6844M();
            }

            /* renamed from: c */
            public int mo6547c(View view) {
                this.f5806a.mo6874a(view, true, this.f5807d);
                return this.f5807d.right;
            }

            /* renamed from: d */
            public int mo6548d() {
                return this.f5806a.mo6842K() - this.f5806a.mo6846O();
            }

            /* renamed from: d */
            public int mo6549d(View view) {
                this.f5806a.mo6874a(view, true, this.f5807d);
                return this.f5807d.left;
            }

            /* renamed from: e */
            public int mo6550e() {
                return this.f5806a.mo6842K();
            }

            /* renamed from: e */
            public int mo6551e(View view) {
                C1732az.C1755i iVar = (C1732az.C1755i) view.getLayoutParams();
                return iVar.rightMargin + this.f5806a.mo6932m(view) + iVar.leftMargin;
            }

            /* renamed from: f */
            public int mo6552f() {
                return (this.f5806a.mo6842K() - this.f5806a.mo6844M()) - this.f5806a.mo6846O();
            }

            /* renamed from: f */
            public int mo6553f(View view) {
                C1732az.C1755i iVar = (C1732az.C1755i) view.getLayoutParams();
                return iVar.bottomMargin + this.f5806a.mo6933n(view) + iVar.topMargin;
            }

            /* renamed from: g */
            public int mo6554g() {
                return this.f5806a.mo6846O();
            }

            /* renamed from: h */
            public int mo6555h() {
                return this.f5806a.mo6840I();
            }

            /* renamed from: i */
            public int mo6556i() {
                return this.f5806a.mo6841J();
            }
        };
    }

    /* renamed from: a */
    public static C1719av m10281a(C1732az.C1750h hVar, int i) {
        switch (i) {
            case 0:
                return m10280a(hVar);
            case 1:
                return m10282b(hVar);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    /* renamed from: b */
    public static C1719av m10282b(C1732az.C1750h hVar) {
        return new C1719av(hVar) {
            /* renamed from: a */
            public int mo6540a(View view) {
                return this.f5806a.mo6935p(view) - ((C1732az.C1755i) view.getLayoutParams()).topMargin;
            }

            /* renamed from: a */
            public void mo6542a(int i) {
                this.f5806a.mo5996l(i);
            }

            /* renamed from: a */
            public void mo6543a(View view, int i) {
                view.offsetTopAndBottom(i);
            }

            /* renamed from: b */
            public int mo6545b(View view) {
                return ((C1732az.C1755i) view.getLayoutParams()).bottomMargin + this.f5806a.mo6937r(view);
            }

            /* renamed from: c */
            public int mo6546c() {
                return this.f5806a.mo6845N();
            }

            /* renamed from: c */
            public int mo6547c(View view) {
                this.f5806a.mo6874a(view, true, this.f5807d);
                return this.f5807d.bottom;
            }

            /* renamed from: d */
            public int mo6548d() {
                return this.f5806a.mo6843L() - this.f5806a.mo6847P();
            }

            /* renamed from: d */
            public int mo6549d(View view) {
                this.f5806a.mo6874a(view, true, this.f5807d);
                return this.f5807d.top;
            }

            /* renamed from: e */
            public int mo6550e() {
                return this.f5806a.mo6843L();
            }

            /* renamed from: e */
            public int mo6551e(View view) {
                C1732az.C1755i iVar = (C1732az.C1755i) view.getLayoutParams();
                return iVar.bottomMargin + this.f5806a.mo6933n(view) + iVar.topMargin;
            }

            /* renamed from: f */
            public int mo6552f() {
                return (this.f5806a.mo6843L() - this.f5806a.mo6845N()) - this.f5806a.mo6847P();
            }

            /* renamed from: f */
            public int mo6553f(View view) {
                C1732az.C1755i iVar = (C1732az.C1755i) view.getLayoutParams();
                return iVar.rightMargin + this.f5806a.mo6932m(view) + iVar.leftMargin;
            }

            /* renamed from: g */
            public int mo6554g() {
                return this.f5806a.mo6847P();
            }

            /* renamed from: h */
            public int mo6555h() {
                return this.f5806a.mo6841J();
            }

            /* renamed from: i */
            public int mo6556i() {
                return this.f5806a.mo6840I();
            }
        };
    }

    /* renamed from: a */
    public abstract int mo6540a(View view);

    /* renamed from: a */
    public void mo6541a() {
        this.f5808f = mo6552f();
    }

    /* renamed from: a */
    public abstract void mo6542a(int i);

    /* renamed from: a */
    public abstract void mo6543a(View view, int i);

    /* renamed from: b */
    public int mo6544b() {
        if (Integer.MIN_VALUE == this.f5808f) {
            return 0;
        }
        return mo6552f() - this.f5808f;
    }

    /* renamed from: b */
    public abstract int mo6545b(View view);

    /* renamed from: c */
    public abstract int mo6546c();

    /* renamed from: c */
    public abstract int mo6547c(View view);

    /* renamed from: d */
    public abstract int mo6548d();

    /* renamed from: d */
    public abstract int mo6549d(View view);

    /* renamed from: e */
    public abstract int mo6550e();

    /* renamed from: e */
    public abstract int mo6551e(View view);

    /* renamed from: f */
    public abstract int mo6552f();

    /* renamed from: f */
    public abstract int mo6553f(View view);

    /* renamed from: g */
    public abstract int mo6554g();

    /* renamed from: h */
    public abstract int mo6555h();

    /* renamed from: i */
    public abstract int mo6556i();
}
