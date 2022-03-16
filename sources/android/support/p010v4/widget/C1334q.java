package android.support.p010v4.widget;

import android.graphics.Rect;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p010v4.p025i.C0755t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: android.support.v4.widget.q */
class C1334q {

    /* renamed from: android.support.v4.widget.q$a */
    public interface C1335a<T> {
        /* renamed from: a */
        void mo4508a(T t, Rect rect);
    }

    /* renamed from: android.support.v4.widget.q$b */
    public interface C1336b<T, V> {
        /* renamed from: a */
        int mo4510a(T t);

        /* renamed from: a */
        V mo4512a(T t, int i);
    }

    /* renamed from: android.support.v4.widget.q$c */
    private static class C1337c<T> implements Comparator<T> {

        /* renamed from: a */
        private final Rect f4117a = new Rect();

        /* renamed from: b */
        private final Rect f4118b = new Rect();

        /* renamed from: c */
        private final boolean f4119c;

        /* renamed from: d */
        private final C1335a<T> f4120d;

        C1337c(boolean z, C1335a<T> aVar) {
            this.f4119c = z;
            this.f4120d = aVar;
        }

        public int compare(T t, T t2) {
            int i = 1;
            Rect rect = this.f4117a;
            Rect rect2 = this.f4118b;
            this.f4120d.mo4508a(t, rect);
            this.f4120d.mo4508a(t2, rect2);
            if (rect.top < rect2.top) {
                return -1;
            }
            if (rect.top > rect2.top) {
                return 1;
            }
            if (rect.left < rect2.left) {
                if (!this.f4119c) {
                    i = -1;
                }
                return i;
            } else if (rect.left > rect2.left) {
                return !this.f4119c ? 1 : -1;
            } else {
                if (rect.bottom < rect2.bottom) {
                    return -1;
                }
                if (rect.bottom > rect2.bottom) {
                    return 1;
                }
                if (rect.right < rect2.right) {
                    if (!this.f4119c) {
                        i = -1;
                    }
                    return i;
                } else if (rect.right > rect2.right) {
                    return !this.f4119c ? 1 : -1;
                } else {
                    return 0;
                }
            }
        }
    }

    C1334q() {
    }

    /* renamed from: a */
    private static int m7854a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: a */
    public static <L, T> T m7855a(@C0047z L l, @C0047z C1336b<L, T> bVar, @C0047z C1335a<T> aVar, @C0003aa T t, int i, boolean z, boolean z2) {
        int a = bVar.mo4510a(l);
        ArrayList arrayList = new ArrayList(a);
        for (int i2 = 0; i2 < a; i2++) {
            arrayList.add(bVar.mo4512a(l, i2));
        }
        Collections.sort(arrayList, new C1337c(z, aVar));
        switch (i) {
            case 1:
                return m7861b(t, arrayList, z2);
            case 2:
                return m7857a(t, arrayList, z2);
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
    }

    /* renamed from: a */
    public static <L, T> T m7856a(@C0047z L l, @C0047z C1336b<L, T> bVar, @C0047z C1335a<T> aVar, @C0003aa T t, @C0047z Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        switch (i) {
            case 17:
                rect2.offset(rect.width() + 1, 0);
                break;
            case 33:
                rect2.offset(0, rect.height() + 1);
                break;
            case 66:
                rect2.offset(-(rect.width() + 1), 0);
                break;
            case C0755t.f2804k:
                rect2.offset(0, -(rect.height() + 1));
                break;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int a = bVar.mo4510a(l);
        Rect rect3 = new Rect();
        T t2 = null;
        for (int i2 = 0; i2 < a; i2++) {
            T a2 = bVar.mo4512a(l, i2);
            if (a2 != t) {
                aVar.mo4508a(a2, rect3);
                if (m7859a(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a2;
                }
            }
        }
        return t2;
    }

    /* renamed from: a */
    private static <T> T m7857a(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: a */
    private static boolean m7858a(int i, @C0047z Rect rect, @C0047z Rect rect2) {
        switch (i) {
            case 17:
            case 66:
                return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
            case 33:
            case C0755t.f2804k:
                return rect2.right >= rect.left && rect2.left <= rect.right;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: a */
    private static boolean m7859a(int i, @C0047z Rect rect, @C0047z Rect rect2, @C0047z Rect rect3) {
        if (!m7860a(rect, rect2, i)) {
            return false;
        }
        if (!m7860a(rect, rect3, i) || m7863b(i, rect, rect2, rect3)) {
            return true;
        }
        if (m7863b(i, rect, rect3, rect2)) {
            return false;
        }
        return m7854a(m7864c(i, rect, rect2), m7868g(i, rect, rect2)) < m7854a(m7864c(i, rect, rect3), m7868g(i, rect, rect3));
    }

    /* renamed from: a */
    private static boolean m7860a(@C0047z Rect rect, @C0047z Rect rect2, int i) {
        switch (i) {
            case 17:
                return (rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left;
            case 33:
                return (rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top;
            case 66:
                return (rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right;
            case C0755t.f2804k:
                return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: b */
    private static <T> T m7861b(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: b */
    private static boolean m7862b(int i, @C0047z Rect rect, @C0047z Rect rect2) {
        switch (i) {
            case 17:
                return rect.left >= rect2.right;
            case 33:
                return rect.top >= rect2.bottom;
            case 66:
                return rect.right <= rect2.left;
            case C0755t.f2804k:
                return rect.bottom <= rect2.top;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: b */
    private static boolean m7863b(int i, @C0047z Rect rect, @C0047z Rect rect2, @C0047z Rect rect3) {
        boolean a = m7858a(i, rect, rect2);
        if (m7858a(i, rect, rect3) || !a) {
            return false;
        }
        return !m7862b(i, rect, rect3) || i == 17 || i == 66 || m7864c(i, rect, rect2) < m7866e(i, rect, rect3);
    }

    /* renamed from: c */
    private static int m7864c(int i, @C0047z Rect rect, @C0047z Rect rect2) {
        return Math.max(0, m7865d(i, rect, rect2));
    }

    /* renamed from: d */
    private static int m7865d(int i, @C0047z Rect rect, @C0047z Rect rect2) {
        switch (i) {
            case 17:
                return rect.left - rect2.right;
            case 33:
                return rect.top - rect2.bottom;
            case 66:
                return rect2.left - rect.right;
            case C0755t.f2804k:
                return rect2.top - rect.bottom;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: e */
    private static int m7866e(int i, @C0047z Rect rect, @C0047z Rect rect2) {
        return Math.max(1, m7867f(i, rect, rect2));
    }

    /* renamed from: f */
    private static int m7867f(int i, @C0047z Rect rect, @C0047z Rect rect2) {
        switch (i) {
            case 17:
                return rect.left - rect2.left;
            case 33:
                return rect.top - rect2.top;
            case 66:
                return rect2.right - rect.right;
            case C0755t.f2804k:
                return rect2.bottom - rect.bottom;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: g */
    private static int m7868g(int i, @C0047z Rect rect, @C0047z Rect rect2) {
        switch (i) {
            case 17:
            case 66:
                return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
            case 33:
            case C0755t.f2804k:
                return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }
}
