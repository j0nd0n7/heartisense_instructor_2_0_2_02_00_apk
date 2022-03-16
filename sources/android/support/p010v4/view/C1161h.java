package android.support.p010v4.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: android.support.v4.view.h */
public final class C1161h {

    /* renamed from: a */
    static final C1162a f3606a;

    /* renamed from: b */
    public static final int f3607b = 8388608;

    /* renamed from: c */
    public static final int f3608c = 8388611;

    /* renamed from: d */
    public static final int f3609d = 8388613;

    /* renamed from: e */
    public static final int f3610e = 8388615;

    /* renamed from: android.support.v4.view.h$a */
    interface C1162a {
        /* renamed from: a */
        int mo3991a(int i, int i2);

        /* renamed from: a */
        void mo3992a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6);

        /* renamed from: a */
        void mo3993a(int i, int i2, int i3, Rect rect, Rect rect2, int i4);

        /* renamed from: a */
        void mo3994a(int i, Rect rect, Rect rect2, int i2);
    }

    /* renamed from: android.support.v4.view.h$b */
    static class C1163b implements C1162a {
        C1163b() {
        }

        /* renamed from: a */
        public int mo3991a(int i, int i2) {
            return -8388609 & i;
        }

        /* renamed from: a */
        public void mo3992a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2);
        }

        /* renamed from: a */
        public void mo3993a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2);
        }

        /* renamed from: a */
        public void mo3994a(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2);
        }
    }

    /* renamed from: android.support.v4.view.h$c */
    static class C1164c implements C1162a {
        C1164c() {
        }

        /* renamed from: a */
        public int mo3991a(int i, int i2) {
            return C1165i.m6992a(i, i2);
        }

        /* renamed from: a */
        public void mo3992a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            C1165i.m6993a(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        /* renamed from: a */
        public void mo3993a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            C1165i.m6994a(i, i2, i3, rect, rect2, i4);
        }

        /* renamed from: a */
        public void mo3994a(int i, Rect rect, Rect rect2, int i2) {
            C1165i.m6995a(i, rect, rect2, i2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f3606a = new C1164c();
        } else {
            f3606a = new C1163b();
        }
    }

    private C1161h() {
    }

    /* renamed from: a */
    public static int m6976a(int i, int i2) {
        return f3606a.mo3991a(i, i2);
    }

    /* renamed from: a */
    public static void m6977a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
        f3606a.mo3992a(i, i2, i3, rect, i4, i5, rect2, i6);
    }

    /* renamed from: a */
    public static void m6978a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        f3606a.mo3993a(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: a */
    public static void m6979a(int i, Rect rect, Rect rect2, int i2) {
        f3606a.mo3994a(i, rect, rect2, i2);
    }
}
