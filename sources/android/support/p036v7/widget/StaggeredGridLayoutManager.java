package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0047z;
import android.support.p010v4.p025i.C0755t;
import android.support.p010v4.view.p034a.C0922a;
import android.support.p010v4.view.p034a.C0949h;
import android.support.p010v4.view.p034a.C0992u;
import android.support.p036v7.widget.ActivityChooserView;
import android.support.p036v7.widget.C1732az;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: android.support.v7.widget.StaggeredGridLayoutManager */
public class StaggeredGridLayoutManager extends C1732az.C1750h implements C1732az.C1768t.C1770b {

    /* renamed from: a */
    static final boolean f5340a = false;

    /* renamed from: b */
    public static final int f5341b = 0;

    /* renamed from: c */
    public static final int f5342c = 1;

    /* renamed from: d */
    public static final int f5343d = 0;
    @Deprecated

    /* renamed from: e */
    public static final int f5344e = 1;

    /* renamed from: f */
    public static final int f5345f = 2;

    /* renamed from: g */
    static final int f5346g = Integer.MIN_VALUE;

    /* renamed from: p */
    private static final String f5347p = "StaggeredGridLayoutManager";

    /* renamed from: q */
    private static final float f5348q = 0.33333334f;
    @C0047z

    /* renamed from: E */
    private final C1696am f5349E;

    /* renamed from: F */
    private BitSet f5350F;

    /* renamed from: G */
    private int f5351G = 2;

    /* renamed from: H */
    private boolean f5352H;

    /* renamed from: I */
    private boolean f5353I;

    /* renamed from: J */
    private C1629d f5354J;

    /* renamed from: K */
    private int f5355K;

    /* renamed from: L */
    private final Rect f5356L = new Rect();

    /* renamed from: M */
    private final C1624a f5357M = new C1624a();

    /* renamed from: N */
    private boolean f5358N = false;

    /* renamed from: O */
    private boolean f5359O = true;

    /* renamed from: P */
    private int[] f5360P;

    /* renamed from: Q */
    private final Runnable f5361Q = new Runnable() {
        public void run() {
            StaggeredGridLayoutManager.this.mo5981b();
        }
    };

    /* renamed from: h */
    C1631e[] f5362h;
    @C0047z

    /* renamed from: i */
    C1719av f5363i;
    @C0047z

    /* renamed from: j */
    C1719av f5364j;

    /* renamed from: k */
    boolean f5365k = false;

    /* renamed from: l */
    boolean f5366l = false;

    /* renamed from: m */
    int f5367m = -1;

    /* renamed from: n */
    int f5368n = Integer.MIN_VALUE;

    /* renamed from: o */
    C1626c f5369o = new C1626c();

    /* renamed from: r */
    private int f5370r = -1;

    /* renamed from: s */
    private int f5371s;

    /* renamed from: t */
    private int f5372t;

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$a */
    class C1624a {

        /* renamed from: a */
        int f5374a;

        /* renamed from: b */
        int f5375b;

        /* renamed from: c */
        boolean f5376c;

        /* renamed from: d */
        boolean f5377d;

        /* renamed from: e */
        boolean f5378e;

        /* renamed from: f */
        int[] f5379f;

        public C1624a() {
            mo6006a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6006a() {
            this.f5374a = -1;
            this.f5375b = Integer.MIN_VALUE;
            this.f5376c = false;
            this.f5377d = false;
            this.f5378e = false;
            if (this.f5379f != null) {
                Arrays.fill(this.f5379f, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6007a(int i) {
            if (this.f5376c) {
                this.f5375b = StaggeredGridLayoutManager.this.f5363i.mo6548d() - i;
            } else {
                this.f5375b = StaggeredGridLayoutManager.this.f5363i.mo6546c() + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6008a(C1631e[] eVarArr) {
            int length = eVarArr.length;
            if (this.f5379f == null || this.f5379f.length < length) {
                this.f5379f = new int[StaggeredGridLayoutManager.this.f5362h.length];
            }
            for (int i = 0; i < length; i++) {
                this.f5379f[i] = eVarArr[i].mo6041a(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6009b() {
            this.f5375b = this.f5376c ? StaggeredGridLayoutManager.this.f5363i.mo6548d() : StaggeredGridLayoutManager.this.f5363i.mo6546c();
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$b */
    public static class C1625b extends C1732az.C1755i {

        /* renamed from: a */
        public static final int f5381a = -1;

        /* renamed from: b */
        C1631e f5382b;

        /* renamed from: c */
        boolean f5383c;

        public C1625b(int i, int i2) {
            super(i, i2);
        }

        public C1625b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1625b(C1732az.C1755i iVar) {
            super(iVar);
        }

        public C1625b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1625b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        public void mo6010a(boolean z) {
            this.f5383c = z;
        }

        /* renamed from: a */
        public boolean mo6011a() {
            return this.f5383c;
        }

        /* renamed from: b */
        public final int mo6012b() {
            if (this.f5382b == null) {
                return -1;
            }
            return this.f5382b.f5406f;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$c */
    static class C1626c {

        /* renamed from: c */
        private static final int f5384c = 10;

        /* renamed from: a */
        int[] f5385a;

        /* renamed from: b */
        List<C1627a> f5386b;

        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$c$a */
        static class C1627a implements Parcelable {
            public static final Parcelable.Creator<C1627a> CREATOR = new Parcelable.Creator<C1627a>() {
                /* renamed from: a */
                public C1627a createFromParcel(Parcel parcel) {
                    return new C1627a(parcel);
                }

                /* renamed from: a */
                public C1627a[] newArray(int i) {
                    return new C1627a[i];
                }
            };

            /* renamed from: a */
            int f5387a;

            /* renamed from: b */
            int f5388b;

            /* renamed from: c */
            int[] f5389c;

            /* renamed from: d */
            boolean f5390d;

            public C1627a() {
            }

            public C1627a(Parcel parcel) {
                boolean z = true;
                this.f5387a = parcel.readInt();
                this.f5388b = parcel.readInt();
                this.f5390d = parcel.readInt() != 1 ? false : z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f5389c = new int[readInt];
                    parcel.readIntArray(this.f5389c);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo6025a(int i) {
                if (this.f5389c == null) {
                    return 0;
                }
                return this.f5389c[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f5387a + ", mGapDir=" + this.f5388b + ", mHasUnwantedGapAfter=" + this.f5390d + ", mGapPerSpan=" + Arrays.toString(this.f5389c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f5387a);
                parcel.writeInt(this.f5388b);
                parcel.writeInt(this.f5390d ? 1 : 0);
                if (this.f5389c == null || this.f5389c.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(this.f5389c.length);
                parcel.writeIntArray(this.f5389c);
            }
        }

        C1626c() {
        }

        /* renamed from: c */
        private void m9723c(int i, int i2) {
            if (this.f5386b != null) {
                int i3 = i + i2;
                for (int size = this.f5386b.size() - 1; size >= 0; size--) {
                    C1627a aVar = this.f5386b.get(size);
                    if (aVar.f5387a >= i) {
                        if (aVar.f5387a < i3) {
                            this.f5386b.remove(size);
                        } else {
                            aVar.f5387a -= i2;
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private void m9724d(int i, int i2) {
            if (this.f5386b != null) {
                for (int size = this.f5386b.size() - 1; size >= 0; size--) {
                    C1627a aVar = this.f5386b.get(size);
                    if (aVar.f5387a >= i) {
                        aVar.f5387a += i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m9725g(int i) {
            if (this.f5386b == null) {
                return -1;
            }
            C1627a f = mo6024f(i);
            if (f != null) {
                this.f5386b.remove(f);
            }
            int size = this.f5386b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f5386b.get(i2).f5387a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f5386b.remove(i2);
            return this.f5386b.get(i2).f5387a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo6013a(int i) {
            if (this.f5386b != null) {
                for (int size = this.f5386b.size() - 1; size >= 0; size--) {
                    if (this.f5386b.get(size).f5387a >= i) {
                        this.f5386b.remove(size);
                    }
                }
            }
            return mo6019b(i);
        }

        /* renamed from: a */
        public C1627a mo6014a(int i, int i2, int i3, boolean z) {
            if (this.f5386b == null) {
                return null;
            }
            int size = this.f5386b.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1627a aVar = this.f5386b.get(i4);
                if (aVar.f5387a >= i2) {
                    return null;
                }
                if (aVar.f5387a >= i) {
                    if (i3 == 0 || aVar.f5388b == i3) {
                        return aVar;
                    }
                    if (z && aVar.f5390d) {
                        return aVar;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6015a() {
            if (this.f5385a != null) {
                Arrays.fill(this.f5385a, -1);
            }
            this.f5386b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6016a(int i, int i2) {
            if (this.f5385a != null && i < this.f5385a.length) {
                mo6023e(i + i2);
                System.arraycopy(this.f5385a, i + i2, this.f5385a, i, (this.f5385a.length - i) - i2);
                Arrays.fill(this.f5385a, this.f5385a.length - i2, this.f5385a.length, -1);
                m9723c(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6017a(int i, C1631e eVar) {
            mo6023e(i);
            this.f5385a[i] = eVar.f5406f;
        }

        /* renamed from: a */
        public void mo6018a(C1627a aVar) {
            if (this.f5386b == null) {
                this.f5386b = new ArrayList();
            }
            int size = this.f5386b.size();
            for (int i = 0; i < size; i++) {
                C1627a aVar2 = this.f5386b.get(i);
                if (aVar2.f5387a == aVar.f5387a) {
                    this.f5386b.remove(i);
                }
                if (aVar2.f5387a >= aVar.f5387a) {
                    this.f5386b.add(i, aVar);
                    return;
                }
            }
            this.f5386b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo6019b(int i) {
            if (this.f5385a == null || i >= this.f5385a.length) {
                return -1;
            }
            int g = m9725g(i);
            if (g == -1) {
                Arrays.fill(this.f5385a, i, this.f5385a.length, -1);
                return this.f5385a.length;
            }
            Arrays.fill(this.f5385a, i, g + 1, -1);
            return g + 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6020b(int i, int i2) {
            if (this.f5385a != null && i < this.f5385a.length) {
                mo6023e(i + i2);
                System.arraycopy(this.f5385a, i, this.f5385a, i + i2, (this.f5385a.length - i) - i2);
                Arrays.fill(this.f5385a, i, i + i2, -1);
                m9724d(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo6021c(int i) {
            if (this.f5385a == null || i >= this.f5385a.length) {
                return -1;
            }
            return this.f5385a[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo6022d(int i) {
            int length = this.f5385a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6023e(int i) {
            if (this.f5385a == null) {
                this.f5385a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f5385a, -1);
            } else if (i >= this.f5385a.length) {
                int[] iArr = this.f5385a;
                this.f5385a = new int[mo6022d(i)];
                System.arraycopy(iArr, 0, this.f5385a, 0, iArr.length);
                Arrays.fill(this.f5385a, iArr.length, this.f5385a.length, -1);
            }
        }

        /* renamed from: f */
        public C1627a mo6024f(int i) {
            if (this.f5386b == null) {
                return null;
            }
            for (int size = this.f5386b.size() - 1; size >= 0; size--) {
                C1627a aVar = this.f5386b.get(size);
                if (aVar.f5387a == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$d */
    public static class C1629d implements Parcelable {
        public static final Parcelable.Creator<C1629d> CREATOR = new Parcelable.Creator<C1629d>() {
            /* renamed from: a */
            public C1629d createFromParcel(Parcel parcel) {
                return new C1629d(parcel);
            }

            /* renamed from: a */
            public C1629d[] newArray(int i) {
                return new C1629d[i];
            }
        };

        /* renamed from: a */
        int f5391a;

        /* renamed from: b */
        int f5392b;

        /* renamed from: c */
        int f5393c;

        /* renamed from: d */
        int[] f5394d;

        /* renamed from: e */
        int f5395e;

        /* renamed from: f */
        int[] f5396f;

        /* renamed from: g */
        List<C1626c.C1627a> f5397g;

        /* renamed from: h */
        boolean f5398h;

        /* renamed from: i */
        boolean f5399i;

        /* renamed from: j */
        boolean f5400j;

        public C1629d() {
        }

        C1629d(Parcel parcel) {
            boolean z = true;
            this.f5391a = parcel.readInt();
            this.f5392b = parcel.readInt();
            this.f5393c = parcel.readInt();
            if (this.f5393c > 0) {
                this.f5394d = new int[this.f5393c];
                parcel.readIntArray(this.f5394d);
            }
            this.f5395e = parcel.readInt();
            if (this.f5395e > 0) {
                this.f5396f = new int[this.f5395e];
                parcel.readIntArray(this.f5396f);
            }
            this.f5398h = parcel.readInt() == 1;
            this.f5399i = parcel.readInt() == 1;
            this.f5400j = parcel.readInt() != 1 ? false : z;
            this.f5397g = parcel.readArrayList(C1626c.C1627a.class.getClassLoader());
        }

        public C1629d(C1629d dVar) {
            this.f5393c = dVar.f5393c;
            this.f5391a = dVar.f5391a;
            this.f5392b = dVar.f5392b;
            this.f5394d = dVar.f5394d;
            this.f5395e = dVar.f5395e;
            this.f5396f = dVar.f5396f;
            this.f5398h = dVar.f5398h;
            this.f5399i = dVar.f5399i;
            this.f5400j = dVar.f5400j;
            this.f5397g = dVar.f5397g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6033a() {
            this.f5394d = null;
            this.f5393c = 0;
            this.f5395e = 0;
            this.f5396f = null;
            this.f5397g = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6034b() {
            this.f5394d = null;
            this.f5393c = 0;
            this.f5391a = -1;
            this.f5392b = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2 = 1;
            parcel.writeInt(this.f5391a);
            parcel.writeInt(this.f5392b);
            parcel.writeInt(this.f5393c);
            if (this.f5393c > 0) {
                parcel.writeIntArray(this.f5394d);
            }
            parcel.writeInt(this.f5395e);
            if (this.f5395e > 0) {
                parcel.writeIntArray(this.f5396f);
            }
            parcel.writeInt(this.f5398h ? 1 : 0);
            parcel.writeInt(this.f5399i ? 1 : 0);
            if (!this.f5400j) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeList(this.f5397g);
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$e */
    class C1631e {

        /* renamed from: a */
        static final int f5401a = Integer.MIN_VALUE;

        /* renamed from: b */
        ArrayList<View> f5402b = new ArrayList<>();

        /* renamed from: c */
        int f5403c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f5404d = Integer.MIN_VALUE;

        /* renamed from: e */
        int f5405e = 0;

        /* renamed from: f */
        final int f5406f;

        C1631e(int i) {
            this.f5406f = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo6041a(int i) {
            if (this.f5403c != Integer.MIN_VALUE) {
                return this.f5403c;
            }
            if (this.f5402b.size() == 0) {
                return i;
            }
            mo6045a();
            return this.f5403c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo6042a(int i, int i2, boolean z) {
            return mo6043a(i, i2, z, true, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo6043a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int c = StaggeredGridLayoutManager.this.f5363i.mo6546c();
            int d = StaggeredGridLayoutManager.this.f5363i.mo6548d();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f5402b.get(i);
                int a = StaggeredGridLayoutManager.this.f5363i.mo6540a(view);
                int b = StaggeredGridLayoutManager.this.f5363i.mo6545b(view);
                boolean z4 = z3 ? a <= d : a < d;
                boolean z5 = z3 ? b >= c : b > c;
                if (z4 && z5) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo6912e(view);
                        }
                        if (a < c || b > d) {
                            return StaggeredGridLayoutManager.this.mo6912e(view);
                        }
                    } else if (a >= c && b <= d) {
                        return StaggeredGridLayoutManager.this.mo6912e(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: a */
        public View mo6044a(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.f5402b.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.f5402b.get(i3);
                    if ((StaggeredGridLayoutManager.this.f5365k && StaggeredGridLayoutManager.this.mo6912e(view2) <= i) || ((!StaggeredGridLayoutManager.this.f5365k && StaggeredGridLayoutManager.this.mo6912e(view2) >= i) || !view2.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f5402b.size() - 1;
            while (size2 >= 0) {
                View view3 = this.f5402b.get(size2);
                if (StaggeredGridLayoutManager.this.f5365k && StaggeredGridLayoutManager.this.mo6912e(view3) >= i) {
                    break;
                } else if (StaggeredGridLayoutManager.this.f5365k || StaggeredGridLayoutManager.this.mo6912e(view3) > i) {
                    if (!view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                } else {
                    return view;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6045a() {
            C1626c.C1627a f;
            View view = this.f5402b.get(0);
            C1625b c = mo6052c(view);
            this.f5403c = StaggeredGridLayoutManager.this.f5363i.mo6540a(view);
            if (c.f5383c && (f = StaggeredGridLayoutManager.this.f5369o.mo6024f(c.mo6956h())) != null && f.f5388b == -1) {
                this.f5403c -= f.mo6025a(this.f5406f);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6046a(View view) {
            C1625b c = mo6052c(view);
            c.f5382b = this;
            this.f5402b.add(0, view);
            this.f5403c = Integer.MIN_VALUE;
            if (this.f5402b.size() == 1) {
                this.f5404d = Integer.MIN_VALUE;
            }
            if (c.mo6953e() || c.mo6954f()) {
                this.f5405e += StaggeredGridLayoutManager.this.f5363i.mo6551e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6047a(boolean z, int i) {
            int b = z ? mo6049b(Integer.MIN_VALUE) : mo6041a(Integer.MIN_VALUE);
            mo6057e();
            if (b != Integer.MIN_VALUE) {
                if (z && b < StaggeredGridLayoutManager.this.f5363i.mo6548d()) {
                    return;
                }
                if (z || b <= StaggeredGridLayoutManager.this.f5363i.mo6546c()) {
                    if (i != Integer.MIN_VALUE) {
                        b += i;
                    }
                    this.f5404d = b;
                    this.f5403c = b;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo6048b() {
            if (this.f5403c != Integer.MIN_VALUE) {
                return this.f5403c;
            }
            mo6045a();
            return this.f5403c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo6049b(int i) {
            if (this.f5404d != Integer.MIN_VALUE) {
                return this.f5404d;
            }
            if (this.f5402b.size() == 0) {
                return i;
            }
            mo6053c();
            return this.f5404d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo6050b(int i, int i2, boolean z) {
            return mo6043a(i, i2, false, false, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6051b(View view) {
            C1625b c = mo6052c(view);
            c.f5382b = this;
            this.f5402b.add(view);
            this.f5404d = Integer.MIN_VALUE;
            if (this.f5402b.size() == 1) {
                this.f5403c = Integer.MIN_VALUE;
            }
            if (c.mo6953e() || c.mo6954f()) {
                this.f5405e += StaggeredGridLayoutManager.this.f5363i.mo6551e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1625b mo6052c(View view) {
            return (C1625b) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6053c() {
            C1626c.C1627a f;
            View view = this.f5402b.get(this.f5402b.size() - 1);
            C1625b c = mo6052c(view);
            this.f5404d = StaggeredGridLayoutManager.this.f5363i.mo6545b(view);
            if (c.f5383c && (f = StaggeredGridLayoutManager.this.f5369o.mo6024f(c.mo6956h())) != null && f.f5388b == 1) {
                this.f5404d = f.mo6025a(this.f5406f) + this.f5404d;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6054c(int i) {
            this.f5403c = i;
            this.f5404d = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo6055d() {
            if (this.f5404d != Integer.MIN_VALUE) {
                return this.f5404d;
            }
            mo6053c();
            return this.f5404d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6056d(int i) {
            if (this.f5403c != Integer.MIN_VALUE) {
                this.f5403c += i;
            }
            if (this.f5404d != Integer.MIN_VALUE) {
                this.f5404d += i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6057e() {
            this.f5402b.clear();
            mo6058f();
            this.f5405e = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo6058f() {
            this.f5403c = Integer.MIN_VALUE;
            this.f5404d = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo6059g() {
            int size = this.f5402b.size();
            View remove = this.f5402b.remove(size - 1);
            C1625b c = mo6052c(remove);
            c.f5382b = null;
            if (c.mo6953e() || c.mo6954f()) {
                this.f5405e -= StaggeredGridLayoutManager.this.f5363i.mo6551e(remove);
            }
            if (size == 1) {
                this.f5403c = Integer.MIN_VALUE;
            }
            this.f5404d = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo6060h() {
            View remove = this.f5402b.remove(0);
            C1625b c = mo6052c(remove);
            c.f5382b = null;
            if (this.f5402b.size() == 0) {
                this.f5404d = Integer.MIN_VALUE;
            }
            if (c.mo6953e() || c.mo6954f()) {
                this.f5405e -= StaggeredGridLayoutManager.this.f5363i.mo6551e(remove);
            }
            this.f5403c = Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public int mo6061i() {
            return this.f5405e;
        }

        /* renamed from: j */
        public int mo6062j() {
            return StaggeredGridLayoutManager.this.f5365k ? mo6042a(this.f5402b.size() - 1, -1, false) : mo6042a(0, this.f5402b.size(), false);
        }

        /* renamed from: k */
        public int mo6063k() {
            return StaggeredGridLayoutManager.this.f5365k ? mo6050b(this.f5402b.size() - 1, -1, true) : mo6050b(0, this.f5402b.size(), true);
        }

        /* renamed from: l */
        public int mo6064l() {
            return StaggeredGridLayoutManager.this.f5365k ? mo6042a(this.f5402b.size() - 1, -1, true) : mo6042a(0, this.f5402b.size(), true);
        }

        /* renamed from: m */
        public int mo6065m() {
            return StaggeredGridLayoutManager.this.f5365k ? mo6042a(0, this.f5402b.size(), false) : mo6042a(this.f5402b.size() - 1, -1, false);
        }

        /* renamed from: n */
        public int mo6066n() {
            return StaggeredGridLayoutManager.this.f5365k ? mo6050b(0, this.f5402b.size(), true) : mo6050b(this.f5402b.size() - 1, -1, true);
        }

        /* renamed from: o */
        public int mo6067o() {
            return StaggeredGridLayoutManager.this.f5365k ? mo6042a(0, this.f5402b.size(), true) : mo6042a(this.f5402b.size() - 1, -1, true);
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        boolean z = true;
        this.f5371s = i2;
        mo5973a(i);
        mo6915e(this.f5351G == 0 ? false : z);
        this.f5349E = new C1696am();
        m9638t();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z = true;
        C1732az.C1750h.C1754b a = m10462a(context, attributeSet, i, i2);
        mo5980b(a.f5874a);
        mo5973a(a.f5875b);
        mo5977a(a.f5876c);
        mo6915e(this.f5351G == 0 ? false : z);
        this.f5349E = new C1696am();
        m9638t();
    }

    /* renamed from: a */
    private int m9609a(C1732az.C1762o oVar, C1696am amVar, C1732az.C1771u uVar) {
        C1631e eVar;
        int e;
        int i;
        int e2;
        int i2;
        this.f5350F.set(0, this.f5370r, true);
        int i3 = this.f5349E.f5685o ? amVar.f5681k == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : amVar.f5681k == 1 ? amVar.f5683m + amVar.f5678h : amVar.f5682l - amVar.f5678h;
        m9622b(amVar.f5681k, i3);
        int d = this.f5366l ? this.f5363i.mo6548d() : this.f5363i.mo6546c();
        boolean z = false;
        while (amVar.mo6391a(uVar) && (this.f5349E.f5685o || !this.f5350F.isEmpty())) {
            View a = amVar.mo6390a(oVar);
            C1625b bVar = (C1625b) a.getLayoutParams();
            int h = bVar.mo6956h();
            int c = this.f5369o.mo6021c(h);
            boolean z2 = c == -1;
            if (z2) {
                C1631e a2 = bVar.f5383c ? this.f5362h[0] : m9610a(amVar);
                this.f5369o.mo6017a(h, a2);
                eVar = a2;
            } else {
                eVar = this.f5362h[c];
            }
            bVar.f5382b = eVar;
            if (amVar.f5681k == 1) {
                mo6905c(a);
            } else {
                mo6894b(a, 0);
            }
            m9618a(a, bVar, false);
            if (amVar.f5681k == 1) {
                int s = bVar.f5383c ? m9636s(d) : eVar.mo6049b(d);
                i = s + this.f5363i.mo6551e(a);
                if (!z2 || !bVar.f5383c) {
                    e = s;
                } else {
                    C1626c.C1627a o = m9632o(s);
                    o.f5388b = -1;
                    o.f5387a = h;
                    this.f5369o.mo6018a(o);
                    e = s;
                }
            } else {
                int r = bVar.f5383c ? m9635r(d) : eVar.mo6041a(d);
                e = r - this.f5363i.mo6551e(a);
                if (z2 && bVar.f5383c) {
                    C1626c.C1627a p = m9633p(r);
                    p.f5388b = 1;
                    p.f5387a = h;
                    this.f5369o.mo6018a(p);
                }
                i = r;
            }
            if (bVar.f5383c && amVar.f5680j == -1) {
                if (z2) {
                    this.f5358N = true;
                } else {
                    if (amVar.f5681k == 1 ? !mo6000n() : !mo6001o()) {
                        C1626c.C1627a f = this.f5369o.mo6024f(h);
                        if (f != null) {
                            f.f5390d = true;
                        }
                        this.f5358N = true;
                    }
                }
            }
            m9617a(a, bVar, amVar);
            if (!mo5995k() || this.f5371s != 1) {
                int c2 = bVar.f5383c ? this.f5364j.mo6546c() : (eVar.f5406f * this.f5372t) + this.f5364j.mo6546c();
                e2 = c2 + this.f5364j.mo6551e(a);
                i2 = c2;
            } else {
                int d2 = bVar.f5383c ? this.f5364j.mo6548d() : this.f5364j.mo6548d() - (((this.f5370r - 1) - eVar.f5406f) * this.f5372t);
                i2 = d2 - this.f5364j.mo6551e(a);
                e2 = d2;
            }
            if (this.f5371s == 1) {
                mo6896b(a, i2, e, e2, i);
            } else {
                mo6896b(a, e, i2, i, e2);
            }
            if (bVar.f5383c) {
                m9622b(this.f5349E.f5681k, i3);
            } else {
                m9612a(eVar, this.f5349E.f5681k, i3);
            }
            m9614a(oVar, this.f5349E);
            if (this.f5349E.f5684n && a.hasFocusable()) {
                if (bVar.f5383c) {
                    this.f5350F.clear();
                } else {
                    this.f5350F.set(eVar.f5406f, false);
                }
            }
            z = true;
        }
        if (!z) {
            m9614a(oVar, this.f5349E);
        }
        int c3 = this.f5349E.f5681k == -1 ? this.f5363i.mo6546c() - m9635r(this.f5363i.mo6546c()) : m9636s(this.f5363i.mo6548d()) - this.f5363i.mo6548d();
        if (c3 > 0) {
            return Math.min(amVar.f5678h, c3);
        }
        return 0;
    }

    /* renamed from: a */
    private C1631e m9610a(C1696am amVar) {
        int i;
        int i2;
        C1631e eVar;
        C1631e eVar2;
        C1631e eVar3 = null;
        int i3 = -1;
        if (m9640u(amVar.f5681k)) {
            i = this.f5370r - 1;
            i2 = -1;
        } else {
            i = 0;
            i2 = this.f5370r;
            i3 = 1;
        }
        if (amVar.f5681k == 1) {
            int c = this.f5363i.mo6546c();
            int i4 = i;
            int i5 = Integer.MAX_VALUE;
            while (i4 != i2) {
                C1631e eVar4 = this.f5362h[i4];
                int b = eVar4.mo6049b(c);
                if (b < i5) {
                    eVar2 = eVar4;
                } else {
                    b = i5;
                    eVar2 = eVar3;
                }
                i4 += i3;
                eVar3 = eVar2;
                i5 = b;
            }
        } else {
            int d = this.f5363i.mo6548d();
            int i6 = i;
            int i7 = Integer.MIN_VALUE;
            while (i6 != i2) {
                C1631e eVar5 = this.f5362h[i6];
                int a = eVar5.mo6041a(d);
                if (a > i7) {
                    eVar = eVar5;
                } else {
                    a = i7;
                    eVar = eVar3;
                }
                i6 += i3;
                eVar3 = eVar;
                i7 = a;
            }
        }
        return eVar3;
    }

    /* renamed from: a */
    private void m9611a(C1624a aVar) {
        if (this.f5354J.f5393c > 0) {
            if (this.f5354J.f5393c == this.f5370r) {
                for (int i = 0; i < this.f5370r; i++) {
                    this.f5362h[i].mo6057e();
                    int i2 = this.f5354J.f5394d[i];
                    if (i2 != Integer.MIN_VALUE) {
                        i2 = this.f5354J.f5399i ? i2 + this.f5363i.mo6548d() : i2 + this.f5363i.mo6546c();
                    }
                    this.f5362h[i].mo6054c(i2);
                }
            } else {
                this.f5354J.mo6033a();
                this.f5354J.f5391a = this.f5354J.f5392b;
            }
        }
        this.f5353I = this.f5354J.f5400j;
        mo5977a(this.f5354J.f5398h);
        m9639u();
        if (this.f5354J.f5391a != -1) {
            this.f5367m = this.f5354J.f5391a;
            aVar.f5376c = this.f5354J.f5399i;
        } else {
            aVar.f5376c = this.f5366l;
        }
        if (this.f5354J.f5395e > 1) {
            this.f5369o.f5385a = this.f5354J.f5396f;
            this.f5369o.f5386b = this.f5354J.f5397g;
        }
    }

    /* renamed from: a */
    private void m9612a(C1631e eVar, int i, int i2) {
        int i3 = eVar.mo6061i();
        if (i == -1) {
            if (i3 + eVar.mo6048b() <= i2) {
                this.f5350F.set(eVar.f5406f, false);
            }
        } else if (eVar.mo6055d() - i3 >= i2) {
            this.f5350F.set(eVar.f5406f, false);
        }
    }

    /* renamed from: a */
    private void m9613a(C1732az.C1762o oVar, int i) {
        while (mo6839H() > 0) {
            View j = mo6928j(0);
            if (this.f5363i.mo6545b(j) <= i && this.f5363i.mo6547c(j) <= i) {
                C1625b bVar = (C1625b) j.getLayoutParams();
                if (bVar.f5383c) {
                    int i2 = 0;
                    while (i2 < this.f5370r) {
                        if (this.f5362h[i2].f5402b.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f5370r; i3++) {
                        this.f5362h[i3].mo6060h();
                    }
                } else if (bVar.f5382b.f5402b.size() != 1) {
                    bVar.f5382b.mo6060h();
                } else {
                    return;
                }
                mo6898b(j, oVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m9614a(C1732az.C1762o oVar, C1696am amVar) {
        if (amVar.f5677g && !amVar.f5685o) {
            if (amVar.f5678h == 0) {
                if (amVar.f5681k == -1) {
                    m9624b(oVar, amVar.f5683m);
                } else {
                    m9613a(oVar, amVar.f5682l);
                }
            } else if (amVar.f5681k == -1) {
                int q = amVar.f5682l - m9634q(amVar.f5682l);
                m9624b(oVar, q < 0 ? amVar.f5683m : amVar.f5683m - Math.min(q, amVar.f5678h));
            } else {
                int t = m9637t(amVar.f5683m) - amVar.f5683m;
                m9613a(oVar, t < 0 ? amVar.f5682l : Math.min(t, amVar.f5678h) + amVar.f5682l);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9615a(android.support.p036v7.widget.C1732az.C1762o r9, android.support.p036v7.widget.C1732az.C1771u r10, boolean r11) {
        /*
            r8 = this;
            r7 = -1
            r2 = 1
            r1 = 0
            android.support.v7.widget.StaggeredGridLayoutManager$a r3 = r8.f5357M
            android.support.v7.widget.StaggeredGridLayoutManager$d r0 = r8.f5354J
            if (r0 != 0) goto L_0x000d
            int r0 = r8.f5367m
            if (r0 == r7) goto L_0x001a
        L_0x000d:
            int r0 = r10.mo7056i()
            if (r0 != 0) goto L_0x001a
            r8.mo6902c((android.support.p036v7.widget.C1732az.C1762o) r9)
            r3.mo6006a()
        L_0x0019:
            return
        L_0x001a:
            boolean r0 = r3.f5378e
            if (r0 == 0) goto L_0x0026
            int r0 = r8.f5367m
            if (r0 != r7) goto L_0x0026
            android.support.v7.widget.StaggeredGridLayoutManager$d r0 = r8.f5354J
            if (r0 == 0) goto L_0x0087
        L_0x0026:
            r0 = r2
        L_0x0027:
            if (r0 == 0) goto L_0x0038
            r3.mo6006a()
            android.support.v7.widget.StaggeredGridLayoutManager$d r4 = r8.f5354J
            if (r4 == 0) goto L_0x0089
            r8.m9611a((android.support.p036v7.widget.StaggeredGridLayoutManager.C1624a) r3)
        L_0x0033:
            r8.mo5976a((android.support.p036v7.widget.C1732az.C1771u) r10, (android.support.p036v7.widget.StaggeredGridLayoutManager.C1624a) r3)
            r3.f5378e = r2
        L_0x0038:
            android.support.v7.widget.StaggeredGridLayoutManager$d r4 = r8.f5354J
            if (r4 != 0) goto L_0x0055
            int r4 = r8.f5367m
            if (r4 != r7) goto L_0x0055
            boolean r4 = r3.f5376c
            boolean r5 = r8.f5352H
            if (r4 != r5) goto L_0x004e
            boolean r4 = r8.mo5995k()
            boolean r5 = r8.f5353I
            if (r4 == r5) goto L_0x0055
        L_0x004e:
            android.support.v7.widget.StaggeredGridLayoutManager$c r4 = r8.f5369o
            r4.mo6015a()
            r3.f5377d = r2
        L_0x0055:
            int r4 = r8.mo6839H()
            if (r4 <= 0) goto L_0x00b3
            android.support.v7.widget.StaggeredGridLayoutManager$d r4 = r8.f5354J
            if (r4 == 0) goto L_0x0065
            android.support.v7.widget.StaggeredGridLayoutManager$d r4 = r8.f5354J
            int r4 = r4.f5393c
            if (r4 >= r2) goto L_0x00b3
        L_0x0065:
            boolean r4 = r3.f5377d
            if (r4 == 0) goto L_0x0091
            r0 = r1
        L_0x006a:
            int r4 = r8.f5370r
            if (r0 >= r4) goto L_0x00b3
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r4 = r8.f5362h
            r4 = r4[r0]
            r4.mo6057e()
            int r4 = r3.f5375b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r5) goto L_0x0084
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r4 = r8.f5362h
            r4 = r4[r0]
            int r5 = r3.f5375b
            r4.mo6054c((int) r5)
        L_0x0084:
            int r0 = r0 + 1
            goto L_0x006a
        L_0x0087:
            r0 = r1
            goto L_0x0027
        L_0x0089:
            r8.m9639u()
            boolean r4 = r8.f5366l
            r3.f5376c = r4
            goto L_0x0033
        L_0x0091:
            if (r0 != 0) goto L_0x0099
            android.support.v7.widget.StaggeredGridLayoutManager$a r0 = r8.f5357M
            int[] r0 = r0.f5379f
            if (r0 != 0) goto L_0x0148
        L_0x0099:
            r0 = r1
        L_0x009a:
            int r4 = r8.f5370r
            if (r0 >= r4) goto L_0x00ac
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r4 = r8.f5362h
            r4 = r4[r0]
            boolean r5 = r8.f5366l
            int r6 = r3.f5375b
            r4.mo6047a((boolean) r5, (int) r6)
            int r0 = r0 + 1
            goto L_0x009a
        L_0x00ac:
            android.support.v7.widget.StaggeredGridLayoutManager$a r0 = r8.f5357M
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r4 = r8.f5362h
            r0.mo6008a((android.support.p036v7.widget.StaggeredGridLayoutManager.C1631e[]) r4)
        L_0x00b3:
            r8.mo6861a((android.support.p036v7.widget.C1732az.C1762o) r9)
            android.support.v7.widget.am r0 = r8.f5349E
            r0.f5677g = r1
            r8.f5358N = r1
            android.support.v7.widget.av r0 = r8.f5364j
            int r0 = r0.mo6552f()
            r8.mo5991g((int) r0)
            int r0 = r3.f5374a
            r8.m9623b((int) r0, (android.support.p036v7.widget.C1732az.C1771u) r10)
            boolean r0 = r3.f5376c
            if (r0 == 0) goto L_0x0160
            r8.m9631n(r7)
            android.support.v7.widget.am r0 = r8.f5349E
            r8.m9609a((android.support.p036v7.widget.C1732az.C1762o) r9, (android.support.p036v7.widget.C1696am) r0, (android.support.p036v7.widget.C1732az.C1771u) r10)
            r8.m9631n(r2)
            android.support.v7.widget.am r0 = r8.f5349E
            int r4 = r3.f5374a
            android.support.v7.widget.am r5 = r8.f5349E
            int r5 = r5.f5680j
            int r4 = r4 + r5
            r0.f5679i = r4
            android.support.v7.widget.am r0 = r8.f5349E
            r8.m9609a((android.support.p036v7.widget.C1732az.C1762o) r9, (android.support.p036v7.widget.C1696am) r0, (android.support.p036v7.widget.C1732az.C1771u) r10)
        L_0x00e9:
            r8.m9642v()
            int r0 = r8.mo6839H()
            if (r0 <= 0) goto L_0x00fc
            boolean r0 = r8.f5366l
            if (r0 == 0) goto L_0x017d
            r8.m9625b((android.support.p036v7.widget.C1732az.C1762o) r9, (android.support.p036v7.widget.C1732az.C1771u) r10, (boolean) r2)
            r8.m9627c((android.support.p036v7.widget.C1732az.C1762o) r9, (android.support.p036v7.widget.C1732az.C1771u) r10, (boolean) r1)
        L_0x00fc:
            if (r11 == 0) goto L_0x0187
            boolean r0 = r10.mo7050c()
            if (r0 != 0) goto L_0x0187
            int r0 = r8.f5351G
            if (r0 == 0) goto L_0x0185
            int r0 = r8.mo6839H()
            if (r0 <= 0) goto L_0x0185
            boolean r0 = r8.f5358N
            if (r0 != 0) goto L_0x0118
            android.view.View r0 = r8.mo5985c()
            if (r0 == 0) goto L_0x0185
        L_0x0118:
            r0 = r2
        L_0x0119:
            if (r0 == 0) goto L_0x0187
            java.lang.Runnable r0 = r8.f5361Q
            r8.mo6901b((java.lang.Runnable) r0)
            boolean r0 = r8.mo5981b()
            if (r0 == 0) goto L_0x0187
            r0 = r2
        L_0x0127:
            boolean r2 = r10.mo7050c()
            if (r2 == 0) goto L_0x0132
            android.support.v7.widget.StaggeredGridLayoutManager$a r2 = r8.f5357M
            r2.mo6006a()
        L_0x0132:
            boolean r2 = r3.f5376c
            r8.f5352H = r2
            boolean r2 = r8.mo5995k()
            r8.f5353I = r2
            if (r0 == 0) goto L_0x0019
            android.support.v7.widget.StaggeredGridLayoutManager$a r0 = r8.f5357M
            r0.mo6006a()
            r8.m9615a((android.support.p036v7.widget.C1732az.C1762o) r9, (android.support.p036v7.widget.C1732az.C1771u) r10, (boolean) r1)
            goto L_0x0019
        L_0x0148:
            r0 = r1
        L_0x0149:
            int r4 = r8.f5370r
            if (r0 >= r4) goto L_0x00b3
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r4 = r8.f5362h
            r4 = r4[r0]
            r4.mo6057e()
            android.support.v7.widget.StaggeredGridLayoutManager$a r5 = r8.f5357M
            int[] r5 = r5.f5379f
            r5 = r5[r0]
            r4.mo6054c((int) r5)
            int r0 = r0 + 1
            goto L_0x0149
        L_0x0160:
            r8.m9631n(r2)
            android.support.v7.widget.am r0 = r8.f5349E
            r8.m9609a((android.support.p036v7.widget.C1732az.C1762o) r9, (android.support.p036v7.widget.C1696am) r0, (android.support.p036v7.widget.C1732az.C1771u) r10)
            r8.m9631n(r7)
            android.support.v7.widget.am r0 = r8.f5349E
            int r4 = r3.f5374a
            android.support.v7.widget.am r5 = r8.f5349E
            int r5 = r5.f5680j
            int r4 = r4 + r5
            r0.f5679i = r4
            android.support.v7.widget.am r0 = r8.f5349E
            r8.m9609a((android.support.p036v7.widget.C1732az.C1762o) r9, (android.support.p036v7.widget.C1696am) r0, (android.support.p036v7.widget.C1732az.C1771u) r10)
            goto L_0x00e9
        L_0x017d:
            r8.m9627c((android.support.p036v7.widget.C1732az.C1762o) r9, (android.support.p036v7.widget.C1732az.C1771u) r10, (boolean) r2)
            r8.m9625b((android.support.p036v7.widget.C1732az.C1762o) r9, (android.support.p036v7.widget.C1732az.C1771u) r10, (boolean) r1)
            goto L_0x00fc
        L_0x0185:
            r0 = r1
            goto L_0x0119
        L_0x0187:
            r0 = r1
            goto L_0x0127
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.StaggeredGridLayoutManager.m9615a(android.support.v7.widget.az$o, android.support.v7.widget.az$u, boolean):void");
    }

    /* renamed from: a */
    private void m9616a(View view, int i, int i2, boolean z) {
        mo6897b(view, this.f5356L);
        C1625b bVar = (C1625b) view.getLayoutParams();
        int b = m9620b(i, bVar.leftMargin + this.f5356L.left, bVar.rightMargin + this.f5356L.right);
        int b2 = m9620b(i2, bVar.topMargin + this.f5356L.top, bVar.bottomMargin + this.f5356L.bottom);
        if (z ? mo6884a(view, b, b2, (C1732az.C1755i) bVar) : mo6900b(view, b, b2, (C1732az.C1755i) bVar)) {
            view.measure(b, b2);
        }
    }

    /* renamed from: a */
    private void m9617a(View view, C1625b bVar, C1696am amVar) {
        if (amVar.f5681k == 1) {
            if (bVar.f5383c) {
                m9644w(view);
            } else {
                bVar.f5382b.mo6051b(view);
            }
        } else if (bVar.f5383c) {
            m9646x(view);
        } else {
            bVar.f5382b.mo6046a(view);
        }
    }

    /* renamed from: a */
    private void m9618a(View view, C1625b bVar, boolean z) {
        if (bVar.f5383c) {
            if (this.f5371s == 1) {
                m9616a(view, this.f5355K, m10460a(mo6843L(), mo6841J(), 0, bVar.height, true), z);
            } else {
                m9616a(view, m10460a(mo6842K(), mo6840I(), 0, bVar.width, true), this.f5355K, z);
            }
        } else if (this.f5371s == 1) {
            m9616a(view, m10460a(this.f5372t, mo6840I(), 0, bVar.width, false), m10460a(mo6843L(), mo6841J(), 0, bVar.height, true), z);
        } else {
            m9616a(view, m10460a(mo6842K(), mo6840I(), 0, bVar.width, true), m10460a(this.f5372t, mo6841J(), 0, bVar.height, false), z);
        }
    }

    /* renamed from: a */
    private boolean m9619a(C1631e eVar) {
        boolean z = true;
        if (this.f5366l) {
            if (eVar.mo6055d() < this.f5363i.mo6548d()) {
                return !eVar.mo6052c(eVar.f5402b.get(eVar.f5402b.size() + -1)).f5383c;
            }
        } else if (eVar.mo6048b() > this.f5363i.mo6546c()) {
            if (eVar.mo6052c(eVar.f5402b.get(0)).f5383c) {
                z = false;
            }
            return z;
        }
        return false;
    }

    /* renamed from: b */
    private int m9620b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: b */
    private int m9621b(C1732az.C1771u uVar) {
        boolean z = true;
        if (mo6839H() == 0) {
            return 0;
        }
        C1719av avVar = this.f5363i;
        View b = mo5979b(!this.f5359O);
        if (this.f5359O) {
            z = false;
        }
        return C1781bd.m10798a(uVar, avVar, b, mo5986c(z), this, this.f5359O, this.f5366l);
    }

    /* renamed from: b */
    private void m9622b(int i, int i2) {
        for (int i3 = 0; i3 < this.f5370r; i3++) {
            if (!this.f5362h[i3].f5402b.isEmpty()) {
                m9612a(this.f5362h[i3], i, i2);
            }
        }
    }

    /* renamed from: b */
    private void m9623b(int i, C1732az.C1771u uVar) {
        int i2;
        int i3;
        int f;
        boolean z = false;
        this.f5349E.f5678h = 0;
        this.f5349E.f5679i = i;
        if (!mo6835D() || (f = uVar.mo7053f()) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f5366l == (f < i)) {
                i2 = this.f5363i.mo6552f();
                i3 = 0;
            } else {
                i3 = this.f5363i.mo6552f();
                i2 = 0;
            }
        }
        if (mo6834C()) {
            this.f5349E.f5682l = this.f5363i.mo6546c() - i3;
            this.f5349E.f5683m = i2 + this.f5363i.mo6548d();
        } else {
            this.f5349E.f5683m = i2 + this.f5363i.mo6550e();
            this.f5349E.f5682l = -i3;
        }
        this.f5349E.f5684n = false;
        this.f5349E.f5677g = true;
        C1696am amVar = this.f5349E;
        if (this.f5363i.mo6555h() == 0 && this.f5363i.mo6550e() == 0) {
            z = true;
        }
        amVar.f5685o = z;
    }

    /* renamed from: b */
    private void m9624b(C1732az.C1762o oVar, int i) {
        int H = mo6839H() - 1;
        while (H >= 0) {
            View j = mo6928j(H);
            if (this.f5363i.mo6540a(j) >= i && this.f5363i.mo6549d(j) >= i) {
                C1625b bVar = (C1625b) j.getLayoutParams();
                if (bVar.f5383c) {
                    int i2 = 0;
                    while (i2 < this.f5370r) {
                        if (this.f5362h[i2].f5402b.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f5370r; i3++) {
                        this.f5362h[i3].mo6059g();
                    }
                } else if (bVar.f5382b.f5402b.size() != 1) {
                    bVar.f5382b.mo6059g();
                } else {
                    return;
                }
                mo6898b(j, oVar);
                H--;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m9625b(C1732az.C1762o oVar, C1732az.C1771u uVar, boolean z) {
        int d;
        int s = m9636s(Integer.MIN_VALUE);
        if (s != Integer.MIN_VALUE && (d = this.f5363i.mo6548d() - s) > 0) {
            int i = d - (-mo5984c(-d, oVar, uVar));
            if (z && i > 0) {
                this.f5363i.mo6542a(i);
            }
        }
    }

    /* renamed from: c */
    private void m9626c(int i, int i2, int i3) {
        int i4;
        int i5;
        int p = this.f5366l ? mo6002p() : mo6003q();
        if (i3 != 8) {
            i4 = i + i2;
            i5 = i;
        } else if (i < i2) {
            i4 = i2 + 1;
            i5 = i;
        } else {
            i4 = i + 1;
            i5 = i2;
        }
        this.f5369o.mo6019b(i5);
        switch (i3) {
            case 1:
                this.f5369o.mo6020b(i, i2);
                break;
            case 2:
                this.f5369o.mo6016a(i, i2);
                break;
            case 8:
                this.f5369o.mo6016a(i, 1);
                this.f5369o.mo6020b(i2, 1);
                break;
        }
        if (i4 > p) {
            if (i5 <= (this.f5366l ? mo6003q() : mo6002p())) {
                mo6942y();
            }
        }
    }

    /* renamed from: c */
    private void m9627c(C1732az.C1762o oVar, C1732az.C1771u uVar, boolean z) {
        int c;
        int r = m9635r(ActivityChooserView.C1593a.f5166a);
        if (r != Integer.MAX_VALUE && (c = r - this.f5363i.mo6546c()) > 0) {
            int c2 = c - mo5984c(c, oVar, uVar);
            if (z && c2 > 0) {
                this.f5363i.mo6542a(-c2);
            }
        }
    }

    /* renamed from: c */
    private boolean m9628c(C1732az.C1771u uVar, C1624a aVar) {
        aVar.f5374a = this.f5352H ? m9645x(uVar.mo7056i()) : m9643w(uVar.mo7056i());
        aVar.f5375b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: i */
    private int m9629i(C1732az.C1771u uVar) {
        boolean z = true;
        if (mo6839H() == 0) {
            return 0;
        }
        C1719av avVar = this.f5363i;
        View b = mo5979b(!this.f5359O);
        if (this.f5359O) {
            z = false;
        }
        return C1781bd.m10797a(uVar, avVar, b, mo5986c(z), this, this.f5359O);
    }

    /* renamed from: j */
    private int m9630j(C1732az.C1771u uVar) {
        boolean z = true;
        if (mo6839H() == 0) {
            return 0;
        }
        C1719av avVar = this.f5363i;
        View b = mo5979b(!this.f5359O);
        if (this.f5359O) {
            z = false;
        }
        return C1781bd.m10799b(uVar, avVar, b, mo5986c(z), this, this.f5359O);
    }

    /* renamed from: n */
    private void m9631n(int i) {
        int i2 = 1;
        this.f5349E.f5681k = i;
        C1696am amVar = this.f5349E;
        if (this.f5366l != (i == -1)) {
            i2 = -1;
        }
        amVar.f5680j = i2;
    }

    /* renamed from: o */
    private C1626c.C1627a m9632o(int i) {
        C1626c.C1627a aVar = new C1626c.C1627a();
        aVar.f5389c = new int[this.f5370r];
        for (int i2 = 0; i2 < this.f5370r; i2++) {
            aVar.f5389c[i2] = i - this.f5362h[i2].mo6049b(i);
        }
        return aVar;
    }

    /* renamed from: p */
    private C1626c.C1627a m9633p(int i) {
        C1626c.C1627a aVar = new C1626c.C1627a();
        aVar.f5389c = new int[this.f5370r];
        for (int i2 = 0; i2 < this.f5370r; i2++) {
            aVar.f5389c[i2] = this.f5362h[i2].mo6041a(i) - i;
        }
        return aVar;
    }

    /* renamed from: q */
    private int m9634q(int i) {
        int a = this.f5362h[0].mo6041a(i);
        for (int i2 = 1; i2 < this.f5370r; i2++) {
            int a2 = this.f5362h[i2].mo6041a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: r */
    private int m9635r(int i) {
        int a = this.f5362h[0].mo6041a(i);
        for (int i2 = 1; i2 < this.f5370r; i2++) {
            int a2 = this.f5362h[i2].mo6041a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: s */
    private int m9636s(int i) {
        int b = this.f5362h[0].mo6049b(i);
        for (int i2 = 1; i2 < this.f5370r; i2++) {
            int b2 = this.f5362h[i2].mo6049b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: t */
    private int m9637t(int i) {
        int b = this.f5362h[0].mo6049b(i);
        for (int i2 = 1; i2 < this.f5370r; i2++) {
            int b2 = this.f5362h[i2].mo6049b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: t */
    private void m9638t() {
        this.f5363i = C1719av.m10281a((C1732az.C1750h) this, this.f5371s);
        this.f5364j = C1719av.m10281a((C1732az.C1750h) this, 1 - this.f5371s);
    }

    /* renamed from: u */
    private void m9639u() {
        boolean z = true;
        if (this.f5371s == 1 || !mo5995k()) {
            this.f5366l = this.f5365k;
            return;
        }
        if (this.f5365k) {
            z = false;
        }
        this.f5366l = z;
    }

    /* renamed from: u */
    private boolean m9640u(int i) {
        if (this.f5371s == 0) {
            return (i == -1) != this.f5366l;
        }
        return ((i == -1) == this.f5366l) == mo5995k();
    }

    /* renamed from: v */
    private int m9641v(int i) {
        int i2 = -1;
        if (mo6839H() == 0) {
            return this.f5366l ? 1 : -1;
        }
        if ((i < mo6003q()) == this.f5366l) {
            i2 = 1;
        }
        return i2;
    }

    /* renamed from: v */
    private void m9642v() {
        float max;
        if (this.f5364j.mo6555h() != 1073741824) {
            float f = 0.0f;
            int H = mo6839H();
            int i = 0;
            while (i < H) {
                View j = mo6928j(i);
                float e = (float) this.f5364j.mo6551e(j);
                if (e < f) {
                    max = f;
                } else {
                    max = Math.max(f, ((C1625b) j.getLayoutParams()).mo6011a() ? (1.0f * e) / ((float) this.f5370r) : e);
                }
                i++;
                f = max;
            }
            int i2 = this.f5372t;
            int round = Math.round(((float) this.f5370r) * f);
            if (this.f5364j.mo6555h() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f5364j.mo6552f());
            }
            mo5991g(round);
            if (this.f5372t != i2) {
                for (int i3 = 0; i3 < H; i3++) {
                    View j2 = mo6928j(i3);
                    C1625b bVar = (C1625b) j2.getLayoutParams();
                    if (!bVar.f5383c) {
                        if (!mo5995k() || this.f5371s != 1) {
                            int i4 = bVar.f5382b.f5406f * this.f5372t;
                            int i5 = bVar.f5382b.f5406f * i2;
                            if (this.f5371s == 1) {
                                j2.offsetLeftAndRight(i4 - i5);
                            } else {
                                j2.offsetTopAndBottom(i4 - i5);
                            }
                        } else {
                            j2.offsetLeftAndRight(((-((this.f5370r - 1) - bVar.f5382b.f5406f)) * this.f5372t) - ((-((this.f5370r - 1) - bVar.f5382b.f5406f)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: w */
    private int m9643w(int i) {
        int H = mo6839H();
        for (int i2 = 0; i2 < H; i2++) {
            int e = mo6912e(mo6928j(i2));
            if (e >= 0 && e < i) {
                return e;
            }
        }
        return 0;
    }

    /* renamed from: w */
    private void m9644w(View view) {
        for (int i = this.f5370r - 1; i >= 0; i--) {
            this.f5362h[i].mo6051b(view);
        }
    }

    /* renamed from: x */
    private int m9645x(int i) {
        for (int H = mo6839H() - 1; H >= 0; H--) {
            int e = mo6912e(mo6928j(H));
            if (e >= 0 && e < i) {
                return e;
            }
        }
        return 0;
    }

    /* renamed from: x */
    private void m9646x(View view) {
        for (int i = this.f5370r - 1; i >= 0; i--) {
            this.f5362h[i].mo6046a(view);
        }
    }

    /* renamed from: y */
    private int m9647y(int i) {
        int i2 = Integer.MIN_VALUE;
        int i3 = 1;
        switch (i) {
            case 1:
                return (this.f5371s == 1 || !mo5995k()) ? -1 : 1;
            case 2:
                if (this.f5371s == 1) {
                    return 1;
                }
                return !mo5995k() ? 1 : -1;
            case 17:
                return this.f5371s != 0 ? Integer.MIN_VALUE : -1;
            case 33:
                return this.f5371s != 1 ? Integer.MIN_VALUE : -1;
            case 66:
                if (this.f5371s != 0) {
                    i3 = Integer.MIN_VALUE;
                }
                return i3;
            case C0755t.f2804k:
                if (this.f5371s == 1) {
                    i2 = 1;
                }
                return i2;
            default:
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: a */
    public int mo5777a(int i, C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return mo5984c(i, oVar, uVar);
    }

    /* renamed from: a */
    public int mo5778a(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return this.f5371s == 0 ? this.f5370r : super.mo5778a(oVar, uVar);
    }

    /* renamed from: a */
    public C1732az.C1755i mo5779a() {
        return this.f5371s == 0 ? new C1625b(-2, -1) : new C1625b(-1, -2);
    }

    /* renamed from: a */
    public C1732az.C1755i mo5780a(Context context, AttributeSet attributeSet) {
        return new C1625b(context, attributeSet);
    }

    /* renamed from: a */
    public C1732az.C1755i mo5781a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1625b((ViewGroup.MarginLayoutParams) layoutParams) : new C1625b(layoutParams);
    }

    @C0003aa
    /* renamed from: a */
    public View mo5783a(View view, int i, C1732az.C1762o oVar, C1732az.C1771u uVar) {
        View a;
        if (mo6839H() == 0) {
            return null;
        }
        View g = mo6921g(view);
        if (g == null) {
            return null;
        }
        m9639u();
        int y = m9647y(i);
        if (y == Integer.MIN_VALUE) {
            return null;
        }
        C1625b bVar = (C1625b) g.getLayoutParams();
        boolean z = bVar.f5383c;
        C1631e eVar = bVar.f5382b;
        int p = y == 1 ? mo6002p() : mo6003q();
        m9623b(p, uVar);
        m9631n(y);
        this.f5349E.f5679i = this.f5349E.f5680j + p;
        this.f5349E.f5678h = (int) (f5348q * ((float) this.f5363i.mo6552f()));
        this.f5349E.f5684n = true;
        this.f5349E.f5677g = false;
        m9609a(oVar, this.f5349E, uVar);
        this.f5352H = this.f5366l;
        if (!z && (a = eVar.mo6044a(p, y)) != null && a != g) {
            return a;
        }
        if (m9640u(y)) {
            for (int i2 = this.f5370r - 1; i2 >= 0; i2--) {
                View a2 = this.f5362h[i2].mo6044a(p, y);
                if (a2 != null && a2 != g) {
                    return a2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f5370r; i3++) {
                View a3 = this.f5362h[i3].mo6044a(p, y);
                if (a3 != null && a3 != g) {
                    return a3;
                }
            }
        }
        boolean z2 = (!this.f5365k) == (y == -1);
        if (!z) {
            View c = mo5831c(z2 ? eVar.mo6063k() : eVar.mo6066n());
            if (!(c == null || c == g)) {
                return c;
            }
        }
        if (m9640u(y)) {
            for (int i4 = this.f5370r - 1; i4 >= 0; i4--) {
                if (i4 != eVar.f5406f) {
                    View c2 = mo5831c(z2 ? this.f5362h[i4].mo6063k() : this.f5362h[i4].mo6066n());
                    if (!(c2 == null || c2 == g)) {
                        return c2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f5370r; i5++) {
                View c3 = mo5831c(z2 ? this.f5362h[i5].mo6063k() : this.f5362h[i5].mo6066n());
                if (c3 != null && c3 != g) {
                    return c3;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo5973a(int i) {
        mo5824a((String) null);
        if (i != this.f5370r) {
            mo5993j();
            this.f5370r = i;
            this.f5350F = new BitSet(this.f5370r);
            this.f5362h = new C1631e[this.f5370r];
            for (int i2 = 0; i2 < this.f5370r; i2++) {
                this.f5362h[i2] = new C1631e(i2);
            }
            mo6942y();
        }
    }

    /* renamed from: a */
    public void mo5974a(int i, int i2) {
        if (this.f5354J != null) {
            this.f5354J.mo6034b();
        }
        this.f5367m = i;
        this.f5368n = i2;
        mo6942y();
    }

    /* renamed from: a */
    public void mo5817a(int i, int i2, C1732az.C1771u uVar, C1732az.C1750h.C1753a aVar) {
        if (this.f5371s != 0) {
            i = i2;
        }
        if (mo6839H() != 0 && i != 0) {
            mo5975a(i, uVar);
            if (this.f5360P == null || this.f5360P.length < this.f5370r) {
                this.f5360P = new int[this.f5370r];
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f5370r; i4++) {
                int a = this.f5349E.f5680j == -1 ? this.f5349E.f5682l - this.f5362h[i4].mo6041a(this.f5349E.f5682l) : this.f5362h[i4].mo6049b(this.f5349E.f5683m) - this.f5349E.f5683m;
                if (a >= 0) {
                    this.f5360P[i3] = a;
                    i3++;
                }
            }
            Arrays.sort(this.f5360P, 0, i3);
            for (int i5 = 0; i5 < i3 && this.f5349E.mo6391a(uVar); i5++) {
                aVar.mo6388b(this.f5349E.f5679i, this.f5360P[i5]);
                this.f5349E.f5679i += this.f5349E.f5680j;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5975a(int i, C1732az.C1771u uVar) {
        int i2;
        int q;
        if (i > 0) {
            q = mo6002p();
            i2 = 1;
        } else {
            i2 = -1;
            q = mo6003q();
        }
        this.f5349E.f5677g = true;
        m9623b(q, uVar);
        m9631n(i2);
        this.f5349E.f5679i = this.f5349E.f5680j + q;
        this.f5349E.f5678h = Math.abs(i);
    }

    /* renamed from: a */
    public void mo5785a(Rect rect, int i, int i2) {
        int a;
        int a2;
        int O = mo6846O() + mo6844M();
        int N = mo6845N() + mo6847P();
        if (this.f5371s == 1) {
            a2 = m10459a(i2, N + rect.height(), mo6856Y());
            a = m10459a(i, O + (this.f5372t * this.f5370r), mo6855X());
        } else {
            a = m10459a(i, O + rect.width(), mo6855X());
            a2 = m10459a(i2, N + (this.f5372t * this.f5370r), mo6856Y());
        }
        mo6922g(a, a2);
    }

    /* renamed from: a */
    public void mo5819a(Parcelable parcelable) {
        if (parcelable instanceof C1629d) {
            this.f5354J = (C1629d) parcelable;
            mo6942y();
        }
    }

    /* renamed from: a */
    public void mo5789a(C1732az.C1762o oVar, C1732az.C1771u uVar, View view, C0949h hVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1625b)) {
            super.mo6872a(view, hVar);
            return;
        }
        C1625b bVar = (C1625b) layoutParams;
        if (this.f5371s == 0) {
            hVar.mo3180c((Object) C0949h.C0963n.m5267a(bVar.mo6012b(), bVar.f5383c ? this.f5370r : 1, -1, -1, bVar.f5383c, false));
        } else {
            hVar.mo3180c((Object) C0949h.C0963n.m5267a(-1, -1, bVar.mo6012b(), bVar.f5383c ? this.f5370r : 1, bVar.f5383c, false));
        }
    }

    /* renamed from: a */
    public void mo5790a(C1732az.C1771u uVar) {
        super.mo5790a(uVar);
        this.f5367m = -1;
        this.f5368n = Integer.MIN_VALUE;
        this.f5354J = null;
        this.f5357M.mo6006a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5976a(C1732az.C1771u uVar, C1624a aVar) {
        if (!mo5982b(uVar, aVar) && !m9628c(uVar, aVar)) {
            aVar.mo6009b();
            aVar.f5374a = 0;
        }
    }

    /* renamed from: a */
    public void mo5792a(C1732az azVar) {
        this.f5369o.mo6015a();
        mo6942y();
    }

    /* renamed from: a */
    public void mo5793a(C1732az azVar, int i, int i2) {
        m9626c(i, i2, 1);
    }

    /* renamed from: a */
    public void mo5794a(C1732az azVar, int i, int i2, int i3) {
        m9626c(i, i2, 8);
    }

    /* renamed from: a */
    public void mo5795a(C1732az azVar, int i, int i2, Object obj) {
        m9626c(i, i2, 4);
    }

    /* renamed from: a */
    public void mo5820a(C1732az azVar, C1732az.C1762o oVar) {
        mo6901b(this.f5361Q);
        for (int i = 0; i < this.f5370r; i++) {
            this.f5362h[i].mo6057e();
        }
        azVar.requestLayout();
    }

    /* renamed from: a */
    public void mo5821a(C1732az azVar, C1732az.C1771u uVar, int i) {
        C1701ao aoVar = new C1701ao(azVar.getContext());
        aoVar.mo7022d(i);
        mo6865a((C1732az.C1768t) aoVar);
    }

    /* renamed from: a */
    public void mo5823a(AccessibilityEvent accessibilityEvent) {
        super.mo5823a(accessibilityEvent);
        if (mo6839H() > 0) {
            C0992u b = C0922a.m4609b(accessibilityEvent);
            View b2 = mo5979b(false);
            View c = mo5986c(false);
            if (b2 != null && c != null) {
                int e = mo6912e(b2);
                int e2 = mo6912e(c);
                if (e < e2) {
                    b.mo3438c(e);
                    b.mo3442d(e2);
                    return;
                }
                b.mo3438c(e2);
                b.mo3442d(e);
            }
        }
    }

    /* renamed from: a */
    public void mo5824a(String str) {
        if (this.f5354J == null) {
            super.mo5824a(str);
        }
    }

    /* renamed from: a */
    public void mo5977a(boolean z) {
        mo5824a((String) null);
        if (!(this.f5354J == null || this.f5354J.f5398h == z)) {
            this.f5354J.f5398h = z;
        }
        this.f5365k = z;
        mo6942y();
    }

    /* renamed from: a */
    public boolean mo5797a(C1732az.C1755i iVar) {
        return iVar instanceof C1625b;
    }

    /* renamed from: a */
    public int[] mo5978a(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5370r];
        } else if (iArr.length < this.f5370r) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5370r + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f5370r; i++) {
            iArr[i] = this.f5362h[i].mo6062j();
        }
        return iArr;
    }

    /* renamed from: b */
    public int mo5798b(int i, C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return mo5984c(i, oVar, uVar);
    }

    /* renamed from: b */
    public int mo5799b(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return this.f5371s == 1 ? this.f5370r : super.mo5799b(oVar, uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo5979b(boolean z) {
        int c = this.f5363i.mo6546c();
        int d = this.f5363i.mo6548d();
        int H = mo6839H();
        View view = null;
        for (int i = 0; i < H; i++) {
            View j = mo6928j(i);
            int a = this.f5363i.mo6540a(j);
            if (this.f5363i.mo6545b(j) > c && a < d) {
                if (a >= c || !z) {
                    return j;
                }
                if (view == null) {
                    view = j;
                }
            }
        }
        return view;
    }

    /* renamed from: b */
    public void mo5980b(int i) {
        if (i == 0 || i == 1) {
            mo5824a((String) null);
            if (i != this.f5371s) {
                this.f5371s = i;
                C1719av avVar = this.f5363i;
                this.f5363i = this.f5364j;
                this.f5364j = avVar;
                mo6942y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: b */
    public void mo5801b(C1732az azVar, int i, int i2) {
        m9626c(i, i2, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo5981b() {
        int q;
        int p;
        if (mo6839H() == 0 || this.f5351G == 0 || !mo6833B()) {
            return false;
        }
        if (this.f5366l) {
            q = mo6002p();
            p = mo6003q();
        } else {
            q = mo6003q();
            p = mo6002p();
        }
        if (q == 0 && mo5985c() != null) {
            this.f5369o.mo6015a();
            mo6887aa();
            mo6942y();
            return true;
        } else if (!this.f5358N) {
            return false;
        } else {
            int i = this.f5366l ? -1 : 1;
            C1626c.C1627a a = this.f5369o.mo6014a(q, p + 1, i, true);
            if (a == null) {
                this.f5358N = false;
                this.f5369o.mo6013a(p + 1);
                return false;
            }
            C1626c.C1627a a2 = this.f5369o.mo6014a(q, a.f5387a, i * -1, true);
            if (a2 == null) {
                this.f5369o.mo6013a(a.f5387a);
            } else {
                this.f5369o.mo6013a(a2.f5387a + 1);
            }
            mo6887aa();
            mo6942y();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo5982b(C1732az.C1771u uVar, C1624a aVar) {
        boolean z = false;
        if (uVar.mo7050c() || this.f5367m == -1) {
            return false;
        }
        if (this.f5367m < 0 || this.f5367m >= uVar.mo7056i()) {
            this.f5367m = -1;
            this.f5368n = Integer.MIN_VALUE;
            return false;
        } else if (this.f5354J == null || this.f5354J.f5391a == -1 || this.f5354J.f5393c < 1) {
            View c = mo5831c(this.f5367m);
            if (c != null) {
                aVar.f5374a = this.f5366l ? mo6002p() : mo6003q();
                if (this.f5368n != Integer.MIN_VALUE) {
                    if (aVar.f5376c) {
                        aVar.f5375b = (this.f5363i.mo6548d() - this.f5368n) - this.f5363i.mo6545b(c);
                        return true;
                    }
                    aVar.f5375b = (this.f5363i.mo6546c() + this.f5368n) - this.f5363i.mo6540a(c);
                    return true;
                } else if (this.f5363i.mo6551e(c) > this.f5363i.mo6552f()) {
                    aVar.f5375b = aVar.f5376c ? this.f5363i.mo6548d() : this.f5363i.mo6546c();
                    return true;
                } else {
                    int a = this.f5363i.mo6540a(c) - this.f5363i.mo6546c();
                    if (a < 0) {
                        aVar.f5375b = -a;
                        return true;
                    }
                    int d = this.f5363i.mo6548d() - this.f5363i.mo6545b(c);
                    if (d < 0) {
                        aVar.f5375b = d;
                        return true;
                    }
                    aVar.f5375b = Integer.MIN_VALUE;
                    return true;
                }
            } else {
                aVar.f5374a = this.f5367m;
                if (this.f5368n == Integer.MIN_VALUE) {
                    if (m9641v(aVar.f5374a) == 1) {
                        z = true;
                    }
                    aVar.f5376c = z;
                    aVar.mo6009b();
                } else {
                    aVar.mo6007a(this.f5368n);
                }
                aVar.f5377d = true;
                return true;
            }
        } else {
            aVar.f5375b = Integer.MIN_VALUE;
            aVar.f5374a = this.f5367m;
            return true;
        }
    }

    /* renamed from: b */
    public int[] mo5983b(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5370r];
        } else if (iArr.length < this.f5370r) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5370r + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f5370r; i++) {
            iArr[i] = this.f5362h[i].mo6064l();
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo5984c(int i, C1732az.C1762o oVar, C1732az.C1771u uVar) {
        if (mo6839H() == 0 || i == 0) {
            return 0;
        }
        mo5975a(i, uVar);
        int a = m9609a(oVar, this.f5349E, uVar);
        if (this.f5349E.f5678h >= a) {
            i = i < 0 ? -a : a;
        }
        this.f5363i.mo6542a(-i);
        this.f5352H = this.f5366l;
        this.f5349E.f5678h = 0;
        m9614a(oVar, this.f5349E);
        return i;
    }

    /* renamed from: c */
    public int mo5830c(C1732az.C1771u uVar) {
        return m9621b(uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo5985c() {
        int i;
        boolean z;
        int H = mo6839H() - 1;
        BitSet bitSet = new BitSet(this.f5370r);
        bitSet.set(0, this.f5370r, true);
        char c = (this.f5371s != 1 || !mo5995k()) ? (char) 65535 : 1;
        if (this.f5366l) {
            i = -1;
        } else {
            i = H + 1;
            H = 0;
        }
        int i2 = H < i ? 1 : -1;
        for (int i3 = H; i3 != i; i3 += i2) {
            View j = mo6928j(i3);
            C1625b bVar = (C1625b) j.getLayoutParams();
            if (bitSet.get(bVar.f5382b.f5406f)) {
                if (m9619a(bVar.f5382b)) {
                    return j;
                }
                bitSet.clear(bVar.f5382b.f5406f);
            }
            if (!bVar.f5383c && i3 + i2 != i) {
                View j2 = mo6928j(i3 + i2);
                if (this.f5366l) {
                    int b = this.f5363i.mo6545b(j);
                    int b2 = this.f5363i.mo6545b(j2);
                    if (b < b2) {
                        return j;
                    }
                    if (b == b2) {
                        z = true;
                    }
                    z = false;
                } else {
                    int a = this.f5363i.mo6540a(j);
                    int a2 = this.f5363i.mo6540a(j2);
                    if (a > a2) {
                        return j;
                    }
                    if (a == a2) {
                        z = true;
                    }
                    z = false;
                }
                if (!z) {
                    continue;
                } else {
                    if ((bVar.f5382b.f5406f - ((C1625b) j2.getLayoutParams()).f5382b.f5406f < 0) != (c < 0)) {
                        return j;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo5986c(boolean z) {
        int c = this.f5363i.mo6546c();
        int d = this.f5363i.mo6548d();
        View view = null;
        for (int H = mo6839H() - 1; H >= 0; H--) {
            View j = mo6928j(H);
            int a = this.f5363i.mo6540a(j);
            int b = this.f5363i.mo6545b(j);
            if (b > c && a < d) {
                if (b <= d || !z) {
                    return j;
                }
                if (view == null) {
                    view = j;
                }
            }
        }
        return view;
    }

    /* renamed from: c */
    public void mo5803c(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        m9615a(oVar, uVar, true);
    }

    /* renamed from: c */
    public int[] mo5987c(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5370r];
        } else if (iArr.length < this.f5370r) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5370r + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f5370r; i++) {
            iArr[i] = this.f5362h[i].mo6065m();
        }
        return iArr;
    }

    /* renamed from: d */
    public int mo5834d(C1732az.C1771u uVar) {
        return m9621b(uVar);
    }

    /* renamed from: d */
    public PointF mo5835d(int i) {
        int v = m9641v(i);
        PointF pointF = new PointF();
        if (v == 0) {
            return null;
        }
        if (this.f5371s == 0) {
            pointF.x = (float) v;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = (float) v;
        return pointF;
    }

    /* renamed from: d */
    public boolean mo5804d() {
        return this.f5354J == null;
    }

    /* renamed from: d */
    public int[] mo5988d(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5370r];
        } else if (iArr.length < this.f5370r) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5370r + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f5370r; i++) {
            iArr[i] = this.f5362h[i].mo6067o();
        }
        return iArr;
    }

    /* renamed from: e */
    public int mo5989e() {
        return this.f5351G;
    }

    /* renamed from: e */
    public int mo5837e(C1732az.C1771u uVar) {
        return m9629i(uVar);
    }

    /* renamed from: e */
    public void mo5838e(int i) {
        if (!(this.f5354J == null || this.f5354J.f5391a == i)) {
            this.f5354J.mo6034b();
        }
        this.f5367m = i;
        this.f5368n = Integer.MIN_VALUE;
        mo6942y();
    }

    /* renamed from: f */
    public int mo5840f(C1732az.C1771u uVar) {
        return m9629i(uVar);
    }

    /* renamed from: f */
    public Parcelable mo5841f() {
        int a;
        if (this.f5354J != null) {
            return new C1629d(this.f5354J);
        }
        C1629d dVar = new C1629d();
        dVar.f5398h = this.f5365k;
        dVar.f5399i = this.f5352H;
        dVar.f5400j = this.f5353I;
        if (this.f5369o == null || this.f5369o.f5385a == null) {
            dVar.f5395e = 0;
        } else {
            dVar.f5396f = this.f5369o.f5385a;
            dVar.f5395e = dVar.f5396f.length;
            dVar.f5397g = this.f5369o.f5386b;
        }
        if (mo6839H() > 0) {
            dVar.f5391a = this.f5352H ? mo6002p() : mo6003q();
            dVar.f5392b = mo5998m();
            dVar.f5393c = this.f5370r;
            dVar.f5394d = new int[this.f5370r];
            for (int i = 0; i < this.f5370r; i++) {
                if (this.f5352H) {
                    a = this.f5362h[i].mo6049b(Integer.MIN_VALUE);
                    if (a != Integer.MIN_VALUE) {
                        a -= this.f5363i.mo6548d();
                    }
                } else {
                    a = this.f5362h[i].mo6041a(Integer.MIN_VALUE);
                    if (a != Integer.MIN_VALUE) {
                        a -= this.f5363i.mo6546c();
                    }
                }
                dVar.f5394d[i] = a;
            }
        } else {
            dVar.f5391a = -1;
            dVar.f5392b = -1;
            dVar.f5393c = 0;
        }
        return dVar;
    }

    /* renamed from: f */
    public void mo5990f(int i) {
        mo5824a((String) null);
        if (i != this.f5351G) {
            if (i == 0 || i == 2) {
                this.f5351G = i;
                mo6915e(this.f5351G != 0);
                mo6942y();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    /* renamed from: g */
    public int mo5844g(C1732az.C1771u uVar) {
        return m9630j(uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5991g(int i) {
        this.f5372t = i / this.f5370r;
        this.f5355K = View.MeasureSpec.makeMeasureSpec(i, this.f5364j.mo6555h());
    }

    /* renamed from: g */
    public boolean mo5845g() {
        return this.f5371s == 0;
    }

    /* renamed from: h */
    public int mo5846h(C1732az.C1771u uVar) {
        return m9630j(uVar);
    }

    /* renamed from: h */
    public boolean mo5847h() {
        return this.f5371s == 1;
    }

    /* renamed from: i */
    public int mo5992i() {
        return this.f5370r;
    }

    /* renamed from: j */
    public void mo5993j() {
        this.f5369o.mo6015a();
        mo6942y();
    }

    /* renamed from: k */
    public void mo5994k(int i) {
        super.mo5994k(i);
        for (int i2 = 0; i2 < this.f5370r; i2++) {
            this.f5362h[i2].mo6056d(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo5995k() {
        return mo6836E() == 1;
    }

    /* renamed from: l */
    public void mo5996l(int i) {
        super.mo5996l(i);
        for (int i2 = 0; i2 < this.f5370r; i2++) {
            this.f5362h[i2].mo6056d(i);
        }
    }

    /* renamed from: l */
    public boolean mo5997l() {
        return this.f5365k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo5998m() {
        View c = this.f5366l ? mo5986c(true) : mo5979b(true);
        if (c == null) {
            return -1;
        }
        return mo6912e(c);
    }

    /* renamed from: m */
    public void mo5999m(int i) {
        if (i == 0) {
            mo5981b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo6000n() {
        int b = this.f5362h[0].mo6049b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f5370r; i++) {
            if (this.f5362h[i].mo6049b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo6001o() {
        int a = this.f5362h[0].mo6041a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f5370r; i++) {
            if (this.f5362h[i].mo6041a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo6002p() {
        int H = mo6839H();
        if (H == 0) {
            return 0;
        }
        return mo6912e(mo6928j(H - 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo6003q() {
        if (mo6839H() == 0) {
            return 0;
        }
        return mo6912e(mo6928j(0));
    }

    /* renamed from: r */
    public int mo6004r() {
        return this.f5371s;
    }
}
