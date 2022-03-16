package com.p048a.p049a.p074h.p076b;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.p048a.p049a.p074h.C2217c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.a.a.h.b.n */
public abstract class C2214n<T extends View, Z> extends C2201b<Z> {

    /* renamed from: c */
    private static final String f7274c = "ViewTarget";

    /* renamed from: d */
    private static boolean f7275d = false;

    /* renamed from: e */
    private static Integer f7276e = null;

    /* renamed from: b */
    protected final T f7277b;

    /* renamed from: f */
    private final C2215a f7278f;

    /* renamed from: com.a.a.h.b.n$a */
    private static class C2215a {

        /* renamed from: a */
        private static final int f7279a = 0;

        /* renamed from: b */
        private final View f7280b;

        /* renamed from: c */
        private final List<C2210k> f7281c = new ArrayList();

        /* renamed from: d */
        private C2216a f7282d;

        /* renamed from: e */
        private Point f7283e;

        /* renamed from: com.a.a.h.b.n$a$a */
        private static class C2216a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            private final WeakReference<C2215a> f7284a;

            public C2216a(C2215a aVar) {
                this.f7284a = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable(C2214n.f7274c, 2)) {
                    Log.v(C2214n.f7274c, "OnGlobalLayoutListener called listener=" + this);
                }
                C2215a aVar = (C2215a) this.f7284a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m12547a();
                return true;
            }
        }

        public C2215a(View view) {
            this.f7280b = view;
        }

        /* renamed from: a */
        private int m12546a(int i, boolean z) {
            if (i != -2) {
                return i;
            }
            Point d = m12553d();
            return z ? d.y : d.x;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m12547a() {
            if (!this.f7281c.isEmpty()) {
                int c = m12552c();
                int b = m12551b();
                if (m12550a(c) && m12550a(b)) {
                    m12548a(c, b);
                    ViewTreeObserver viewTreeObserver = this.f7280b.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this.f7282d);
                    }
                    this.f7282d = null;
                }
            }
        }

        /* renamed from: a */
        private void m12548a(int i, int i2) {
            for (C2210k a : this.f7281c) {
                a.mo8196a(i, i2);
            }
            this.f7281c.clear();
        }

        /* renamed from: a */
        private boolean m12550a(int i) {
            return i > 0 || i == -2;
        }

        /* renamed from: b */
        private int m12551b() {
            ViewGroup.LayoutParams layoutParams = this.f7280b.getLayoutParams();
            if (m12550a(this.f7280b.getHeight())) {
                return this.f7280b.getHeight();
            }
            if (layoutParams != null) {
                return m12546a(layoutParams.height, true);
            }
            return 0;
        }

        /* renamed from: c */
        private int m12552c() {
            ViewGroup.LayoutParams layoutParams = this.f7280b.getLayoutParams();
            if (m12550a(this.f7280b.getWidth())) {
                return this.f7280b.getWidth();
            }
            if (layoutParams != null) {
                return m12546a(layoutParams.width, false);
            }
            return 0;
        }

        @TargetApi(13)
        /* renamed from: d */
        private Point m12553d() {
            if (this.f7283e != null) {
                return this.f7283e;
            }
            Display defaultDisplay = ((WindowManager) this.f7280b.getContext().getSystemService("window")).getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 13) {
                this.f7283e = new Point();
                defaultDisplay.getSize(this.f7283e);
            } else {
                this.f7283e = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
            }
            return this.f7283e;
        }

        /* renamed from: a */
        public void mo8255a(C2210k kVar) {
            int c = m12552c();
            int b = m12551b();
            if (!m12550a(c) || !m12550a(b)) {
                if (!this.f7281c.contains(kVar)) {
                    this.f7281c.add(kVar);
                }
                if (this.f7282d == null) {
                    ViewTreeObserver viewTreeObserver = this.f7280b.getViewTreeObserver();
                    this.f7282d = new C2216a(this);
                    viewTreeObserver.addOnPreDrawListener(this.f7282d);
                    return;
                }
                return;
            }
            kVar.mo8196a(c, b);
        }
    }

    public C2214n(T t) {
        if (t == null) {
            throw new NullPointerException("View must not be null!");
        }
        this.f7277b = t;
        this.f7278f = new C2215a(t);
    }

    /* renamed from: a */
    public static void m12539a(int i) {
        if (f7276e != null || f7275d) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        f7276e = Integer.valueOf(i);
    }

    /* renamed from: a */
    private void mo8214a(Object obj) {
        if (f7276e == null) {
            f7275d = true;
            this.f7277b.setTag(obj);
            return;
        }
        this.f7277b.setTag(f7276e.intValue(), obj);
    }

    /* renamed from: c */
    private Object m12541c() {
        return f7276e == null ? this.f7277b.getTag() : this.f7277b.getTag(f7276e.intValue());
    }

    /* renamed from: a */
    public T mo8253a() {
        return this.f7277b;
    }

    /* renamed from: a */
    public void mo8220a(C2210k kVar) {
        this.f7278f.mo8255a(kVar);
    }

    /* renamed from: a */
    public void mo8209a(C2217c cVar) {
        mo8214a((Object) cVar);
    }

    /* renamed from: d_ */
    public C2217c mo8212d_() {
        Object c = m12541c();
        if (c == null) {
            return null;
        }
        if (c instanceof C2217c) {
            return (C2217c) c;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        return "Target for: " + this.f7277b;
    }
}
