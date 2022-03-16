package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0015aj;
import android.support.annotation.C0016ak;
import android.support.annotation.C0032k;
import android.support.annotation.C0036o;
import android.support.annotation.C0046y;
import android.support.annotation.C0047z;
import android.support.p010v4.p028k.C0808j;
import android.support.p010v4.p028k.C0810k;
import android.support.p010v4.view.C0919a;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1161h;
import android.support.p010v4.view.C1183r;
import android.support.p010v4.view.C1189u;
import android.support.p010v4.view.C1200x;
import android.support.p036v7.app.C1385a;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p038b.p039a.C1477b;
import android.support.p036v7.view.C1524c;
import android.support.p036v7.view.C1529g;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.C1555k;
import android.support.p036v7.view.menu.C1567p;
import android.support.p036v7.view.menu.C1569q;
import android.support.p036v7.view.menu.C1576v;
import android.support.p036v7.widget.ActionMenuView;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {

    /* renamed from: e */
    private static final String f5408e = "Toolbar";

    /* renamed from: A */
    private CharSequence f5409A;

    /* renamed from: B */
    private int f5410B;

    /* renamed from: C */
    private int f5411C;

    /* renamed from: D */
    private boolean f5412D;

    /* renamed from: E */
    private boolean f5413E;

    /* renamed from: F */
    private final ArrayList<View> f5414F;

    /* renamed from: G */
    private final ArrayList<View> f5415G;

    /* renamed from: H */
    private final int[] f5416H;

    /* renamed from: I */
    private final ActionMenuView.C1588e f5417I;

    /* renamed from: J */
    private C1808bq f5418J;

    /* renamed from: K */
    private C1821d f5419K;

    /* renamed from: L */
    private C1635a f5420L;

    /* renamed from: M */
    private C1567p.C1568a f5421M;

    /* renamed from: N */
    private C1550h.C1551a f5422N;

    /* renamed from: O */
    private boolean f5423O;

    /* renamed from: P */
    private final Runnable f5424P;

    /* renamed from: a */
    ImageButton f5425a;

    /* renamed from: b */
    View f5426b;

    /* renamed from: c */
    int f5427c;

    /* renamed from: d */
    C1637c f5428d;

    /* renamed from: f */
    private ActionMenuView f5429f;

    /* renamed from: g */
    private TextView f5430g;

    /* renamed from: h */
    private TextView f5431h;

    /* renamed from: i */
    private ImageButton f5432i;

    /* renamed from: j */
    private ImageView f5433j;

    /* renamed from: k */
    private Drawable f5434k;

    /* renamed from: l */
    private CharSequence f5435l;

    /* renamed from: m */
    private Context f5436m;

    /* renamed from: n */
    private int f5437n;

    /* renamed from: o */
    private int f5438o;

    /* renamed from: p */
    private int f5439p;

    /* renamed from: q */
    private int f5440q;

    /* renamed from: r */
    private int f5441r;

    /* renamed from: s */
    private int f5442s;

    /* renamed from: t */
    private int f5443t;

    /* renamed from: u */
    private int f5444u;

    /* renamed from: v */
    private C1780bc f5445v;

    /* renamed from: w */
    private int f5446w;

    /* renamed from: x */
    private int f5447x;

    /* renamed from: y */
    private int f5448y;

    /* renamed from: z */
    private CharSequence f5449z;

    /* renamed from: android.support.v7.widget.Toolbar$a */
    private class C1635a implements C1567p {

        /* renamed from: a */
        C1550h f5453a;

        /* renamed from: b */
        C1555k f5454b;

        C1635a() {
        }

        /* renamed from: a */
        public C1569q mo5256a(ViewGroup viewGroup) {
            return null;
        }

        /* renamed from: a */
        public void mo5259a(Context context, C1550h hVar) {
            if (!(this.f5453a == null || this.f5454b == null)) {
                this.f5453a.mo5372d(this.f5454b);
            }
            this.f5453a = hVar;
        }

        /* renamed from: a */
        public void mo5281a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo5260a(C1550h hVar, boolean z) {
        }

        /* renamed from: a */
        public void mo5262a(C1567p.C1568a aVar) {
        }

        /* renamed from: a */
        public boolean mo5265a(C1550h hVar, C1555k kVar) {
            Toolbar.this.mo6115j();
            if (Toolbar.this.f5425a.getParent() != Toolbar.this) {
                Toolbar.this.addView(Toolbar.this.f5425a);
            }
            Toolbar.this.f5426b = kVar.getActionView();
            this.f5454b = kVar;
            if (Toolbar.this.f5426b.getParent() != Toolbar.this) {
                C1636b k = Toolbar.this.generateDefaultLayoutParams();
                k.f4312a = 8388611 | (Toolbar.this.f5427c & 112);
                k.f5459e = 2;
                Toolbar.this.f5426b.setLayoutParams(k);
                Toolbar.this.addView(Toolbar.this.f5426b);
            }
            Toolbar.this.mo6117l();
            Toolbar.this.requestLayout();
            kVar.mo5427e(true);
            if (Toolbar.this.f5426b instanceof C1524c) {
                ((C1524c) Toolbar.this.f5426b).mo5124a();
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo5266a(C1576v vVar) {
            return false;
        }

        /* renamed from: b */
        public void mo5269b(boolean z) {
            boolean z2 = false;
            if (this.f5454b != null) {
                if (this.f5453a != null) {
                    int size = this.f5453a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f5453a.getItem(i) == this.f5454b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo5271b(this.f5453a, this.f5454b);
                }
            }
        }

        /* renamed from: b */
        public boolean mo5270b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo5271b(C1550h hVar, C1555k kVar) {
            if (Toolbar.this.f5426b instanceof C1524c) {
                ((C1524c) Toolbar.this.f5426b).mo5125b();
            }
            Toolbar.this.removeView(Toolbar.this.f5426b);
            Toolbar.this.removeView(Toolbar.this.f5425a);
            Toolbar.this.f5426b = null;
            Toolbar.this.mo6118m();
            this.f5454b = null;
            Toolbar.this.requestLayout();
            kVar.mo5427e(false);
            return true;
        }

        /* renamed from: c */
        public int mo5272c() {
            return 0;
        }

        /* renamed from: f */
        public Parcelable mo5291f() {
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public static class C1636b extends C1385a.C1387b {

        /* renamed from: b */
        static final int f5456b = 0;

        /* renamed from: c */
        static final int f5457c = 1;

        /* renamed from: d */
        static final int f5458d = 2;

        /* renamed from: e */
        int f5459e;

        public C1636b(int i) {
            this(-2, -1, i);
        }

        public C1636b(int i, int i2) {
            super(i, i2);
            this.f5459e = 0;
            this.f4312a = 8388627;
        }

        public C1636b(int i, int i2, int i3) {
            super(i, i2);
            this.f5459e = 0;
            this.f4312a = i3;
        }

        public C1636b(@C0047z Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5459e = 0;
        }

        public C1636b(C1385a.C1387b bVar) {
            super(bVar);
            this.f5459e = 0;
        }

        public C1636b(C1636b bVar) {
            super((C1385a.C1387b) bVar);
            this.f5459e = 0;
            this.f5459e = bVar.f5459e;
        }

        public C1636b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5459e = 0;
        }

        public C1636b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.f5459e = 0;
            mo6154a(marginLayoutParams);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6154a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$c */
    public interface C1637c {
        /* renamed from: a */
        boolean mo4976a(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.Toolbar$d */
    public static class C1638d extends C0919a {
        public static final Parcelable.Creator<C1638d> CREATOR = C0808j.m4090a(new C0810k<C1638d>() {
            /* renamed from: b */
            public C1638d mo2679a(Parcel parcel, ClassLoader classLoader) {
                return new C1638d(parcel, classLoader);
            }

            /* renamed from: b */
            public C1638d[] mo2680a(int i) {
                return new C1638d[i];
            }
        });

        /* renamed from: b */
        int f5460b;

        /* renamed from: c */
        boolean f5461c;

        public C1638d(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public C1638d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5460b = parcel.readInt();
            this.f5461c = parcel.readInt() != 0;
        }

        public C1638d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5460b);
            parcel.writeInt(this.f5461c ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(Context context, @C0003aa AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.toolbarStyle);
    }

    public Toolbar(Context context, @C0003aa AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5448y = 8388627;
        this.f5414F = new ArrayList<>();
        this.f5415G = new ArrayList<>();
        this.f5416H = new int[2];
        this.f5417I = new ActionMenuView.C1588e() {
            /* renamed from: a */
            public boolean mo5714a(MenuItem menuItem) {
                if (Toolbar.this.f5428d != null) {
                    return Toolbar.this.f5428d.mo4976a(menuItem);
                }
                return false;
            }
        };
        this.f5424P = new Runnable() {
            public void run() {
                Toolbar.this.mo6082d();
            }
        };
        C1807bp a = C1807bp.m10923a(getContext(), attributeSet, C1359b.C1371l.Toolbar, i, 0);
        this.f5438o = a.mo7312g(C1359b.C1371l.Toolbar_titleTextAppearance, 0);
        this.f5439p = a.mo7312g(C1359b.C1371l.Toolbar_subtitleTextAppearance, 0);
        this.f5448y = a.mo7301c(C1359b.C1371l.Toolbar_android_gravity, this.f5448y);
        this.f5427c = a.mo7301c(C1359b.C1371l.Toolbar_buttonGravity, 48);
        int d = a.mo7303d(C1359b.C1371l.Toolbar_titleMargin, 0);
        d = a.mo7316j(C1359b.C1371l.Toolbar_titleMargins) ? a.mo7303d(C1359b.C1371l.Toolbar_titleMargins, d) : d;
        this.f5444u = d;
        this.f5443t = d;
        this.f5442s = d;
        this.f5441r = d;
        int d2 = a.mo7303d(C1359b.C1371l.Toolbar_titleMarginStart, -1);
        if (d2 >= 0) {
            this.f5441r = d2;
        }
        int d3 = a.mo7303d(C1359b.C1371l.Toolbar_titleMarginEnd, -1);
        if (d3 >= 0) {
            this.f5442s = d3;
        }
        int d4 = a.mo7303d(C1359b.C1371l.Toolbar_titleMarginTop, -1);
        if (d4 >= 0) {
            this.f5443t = d4;
        }
        int d5 = a.mo7303d(C1359b.C1371l.Toolbar_titleMarginBottom, -1);
        if (d5 >= 0) {
            this.f5444u = d5;
        }
        this.f5440q = a.mo7306e(C1359b.C1371l.Toolbar_maxButtonHeight, -1);
        int d6 = a.mo7303d(C1359b.C1371l.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d7 = a.mo7303d(C1359b.C1371l.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e = a.mo7306e(C1359b.C1371l.Toolbar_contentInsetLeft, 0);
        int e2 = a.mo7306e(C1359b.C1371l.Toolbar_contentInsetRight, 0);
        m9793t();
        this.f5445v.mo7157b(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.f5445v.mo7154a(d6, d7);
        }
        this.f5446w = a.mo7303d(C1359b.C1371l.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f5447x = a.mo7303d(C1359b.C1371l.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f5434k = a.mo7293a(C1359b.C1371l.Toolbar_collapseIcon);
        this.f5435l = a.mo7304d(C1359b.C1371l.Toolbar_collapseContentDescription);
        CharSequence d8 = a.mo7304d(C1359b.C1371l.Toolbar_title);
        if (!TextUtils.isEmpty(d8)) {
            setTitle(d8);
        }
        CharSequence d9 = a.mo7304d(C1359b.C1371l.Toolbar_subtitle);
        if (!TextUtils.isEmpty(d9)) {
            setSubtitle(d9);
        }
        this.f5436m = getContext();
        setPopupTheme(a.mo7312g(C1359b.C1371l.Toolbar_popupTheme, 0));
        Drawable a2 = a.mo7293a(C1359b.C1371l.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        CharSequence d10 = a.mo7304d(C1359b.C1371l.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(d10)) {
            setNavigationContentDescription(d10);
        }
        Drawable a3 = a.mo7293a(C1359b.C1371l.Toolbar_logo);
        if (a3 != null) {
            setLogo(a3);
        }
        CharSequence d11 = a.mo7304d(C1359b.C1371l.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(d11)) {
            setLogoDescription(d11);
        }
        if (a.mo7316j(C1359b.C1371l.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo7298b(C1359b.C1371l.Toolbar_titleTextColor, -1));
        }
        if (a.mo7316j(C1359b.C1371l.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo7298b(C1359b.C1371l.Toolbar_subtitleTextColor, -1));
        }
        a.mo7308e();
    }

    /* renamed from: a */
    private int m9772a(View view, int i) {
        int max;
        C1636b bVar = (C1636b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        switch (m9780b(bVar.f4312a)) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i3 < bVar.topMargin) {
                    max = bVar.topMargin;
                } else {
                    int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    max = i4 < bVar.bottomMargin ? Math.max(0, i3 - (bVar.bottomMargin - i4)) : i3;
                }
                return max + paddingTop;
        }
    }

    /* renamed from: a */
    private int m9773a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m9774a(View view, int i, int[] iArr, int i2) {
        C1636b bVar = (C1636b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int a = m9772a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return bVar.rightMargin + measuredWidth + max;
    }

    /* renamed from: a */
    private int m9775a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (i3 < size) {
            View view = list.get(i3);
            C1636b bVar = (C1636b) view.getLayoutParams();
            int i7 = bVar.leftMargin - i6;
            int i8 = bVar.rightMargin - i5;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            i6 = Math.max(0, -i7);
            i5 = Math.max(0, -i8);
            i3++;
            i4 += view.getMeasuredWidth() + max + max2;
        }
        return i4;
    }

    /* renamed from: a */
    private void m9776a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m9777a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C1636b k = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C1636b) layoutParams;
        k.f5459e = 1;
        if (!z || this.f5426b == null) {
            addView(view, k);
            return;
        }
        view.setLayoutParams(k);
        this.f5415G.add(view);
    }

    /* renamed from: a */
    private void m9778a(List<View> list, int i) {
        boolean z = true;
        if (C1040ar.m5947k(this) != 1) {
            z = false;
        }
        int childCount = getChildCount();
        int a = C1161h.m6976a(i, C1040ar.m5947k(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C1636b bVar = (C1636b) childAt.getLayoutParams();
                if (bVar.f5459e == 0 && m9779a(childAt) && m9783c(bVar.f4312a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C1636b bVar2 = (C1636b) childAt2.getLayoutParams();
            if (bVar2.f5459e == 0 && m9779a(childAt2) && m9783c(bVar2.f4312a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private boolean m9779a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private int m9780b(int i) {
        int i2 = i & 112;
        switch (i2) {
            case 16:
            case 48:
            case 80:
                return i2;
            default:
                return this.f5448y & 112;
        }
    }

    /* renamed from: b */
    private int m9781b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C1183r.m7039b(marginLayoutParams) + C1183r.m7037a(marginLayoutParams);
    }

    /* renamed from: b */
    private int m9782b(View view, int i, int[] iArr, int i2) {
        C1636b bVar = (C1636b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m9772a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (bVar.leftMargin + measuredWidth);
    }

    /* renamed from: c */
    private int m9783c(int i) {
        int k = C1040ar.m5947k(this);
        int a = C1161h.m6976a(i, k) & 7;
        switch (a) {
            case 1:
            case 3:
            case 5:
                return a;
            default:
                return k == 1 ? 5 : 3;
        }
    }

    /* renamed from: c */
    private int m9784c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    /* renamed from: d */
    private static boolean m9785d(View view) {
        return ((C1636b) view.getLayoutParams()).f5459e == 0;
    }

    /* renamed from: e */
    private boolean m9786e(View view) {
        return view.getParent() == this || this.f5415G.contains(view);
    }

    private MenuInflater getMenuInflater() {
        return new C1529g(getContext());
    }

    /* renamed from: n */
    private void m9787n() {
        if (this.f5433j == null) {
            this.f5433j = new C1857q(getContext());
        }
    }

    /* renamed from: o */
    private void m9788o() {
        m9789p();
        if (this.f5429f.mo5690d() == null) {
            C1550h hVar = (C1550h) this.f5429f.getMenu();
            if (this.f5420L == null) {
                this.f5420L = new C1635a();
            }
            this.f5429f.setExpandedActionViewsExclusive(true);
            hVar.mo5337a((C1567p) this.f5420L, this.f5436m);
        }
    }

    /* renamed from: p */
    private void m9789p() {
        if (this.f5429f == null) {
            this.f5429f = new ActionMenuView(getContext());
            this.f5429f.setPopupTheme(this.f5437n);
            this.f5429f.setOnMenuItemClickListener(this.f5417I);
            this.f5429f.mo5682a(this.f5421M, this.f5422N);
            C1636b k = generateDefaultLayoutParams();
            k.f4312a = 8388613 | (this.f5427c & 112);
            this.f5429f.setLayoutParams(k);
            m9777a((View) this.f5429f, false);
        }
    }

    /* renamed from: q */
    private void m9790q() {
        if (this.f5432i == null) {
            this.f5432i = new C1855o(getContext(), (AttributeSet) null, C1359b.C1361b.toolbarNavigationButtonStyle);
            C1636b k = generateDefaultLayoutParams();
            k.f4312a = 8388611 | (this.f5427c & 112);
            this.f5432i.setLayoutParams(k);
        }
    }

    /* renamed from: r */
    private void m9791r() {
        removeCallbacks(this.f5424P);
        post(this.f5424P);
    }

    /* renamed from: s */
    private boolean m9792s() {
        if (!this.f5423O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m9779a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    private void m9793t() {
        if (this.f5445v == null) {
            this.f5445v = new C1780bc();
        }
    }

    /* renamed from: a */
    public C1636b generateLayoutParams(AttributeSet attributeSet) {
        return new C1636b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1636b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1636b ? new C1636b((C1636b) layoutParams) : layoutParams instanceof C1385a.C1387b ? new C1636b((C1385a.C1387b) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1636b((ViewGroup.MarginLayoutParams) layoutParams) : new C1636b(layoutParams);
    }

    /* renamed from: a */
    public void mo6070a(@C0046y int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: a */
    public void mo6071a(int i, int i2) {
        m9793t();
        this.f5445v.mo7154a(i, i2);
    }

    /* renamed from: a */
    public void mo6072a(int i, int i2, int i3, int i4) {
        this.f5441r = i;
        this.f5443t = i2;
        this.f5442s = i3;
        this.f5444u = i4;
        requestLayout();
    }

    /* renamed from: a */
    public void mo6073a(Context context, @C0016ak int i) {
        this.f5438o = i;
        if (this.f5430g != null) {
            this.f5430g.setTextAppearance(context, i);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo6074a(C1550h hVar, C1821d dVar) {
        if (hVar != null || this.f5429f != null) {
            m9789p();
            C1550h d = this.f5429f.mo5690d();
            if (d != hVar) {
                if (d != null) {
                    d.mo5358b((C1567p) this.f5419K);
                    d.mo5358b((C1567p) this.f5420L);
                }
                if (this.f5420L == null) {
                    this.f5420L = new C1635a();
                }
                dVar.mo7353d(true);
                if (hVar != null) {
                    hVar.mo5337a((C1567p) dVar, this.f5436m);
                    hVar.mo5337a((C1567p) this.f5420L, this.f5436m);
                } else {
                    dVar.mo5259a(this.f5436m, (C1550h) null);
                    this.f5420L.mo5259a(this.f5436m, (C1550h) null);
                    dVar.mo5269b(true);
                    this.f5420L.mo5269b(true);
                }
                this.f5429f.setPopupTheme(this.f5437n);
                this.f5429f.setPresenter(dVar);
                this.f5419K = dVar;
            }
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo6075a(C1567p.C1568a aVar, C1550h.C1551a aVar2) {
        this.f5421M = aVar;
        this.f5422N = aVar2;
        if (this.f5429f != null) {
            this.f5429f.mo5682a(aVar, aVar2);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public boolean mo6076a() {
        return getVisibility() == 0 && this.f5429f != null && this.f5429f.mo5683a();
    }

    /* renamed from: b */
    public void mo6077b(int i, int i2) {
        m9793t();
        this.f5445v.mo7157b(i, i2);
    }

    /* renamed from: b */
    public void mo6078b(Context context, @C0016ak int i) {
        this.f5439p = i;
        if (this.f5431h != null) {
            this.f5431h.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public boolean mo6079b() {
        return this.f5429f != null && this.f5429f.mo5694g();
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: c */
    public boolean mo6080c() {
        return this.f5429f != null && this.f5429f.mo5701h();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1636b);
    }

    /* renamed from: d */
    public boolean mo6082d() {
        return this.f5429f != null && this.f5429f.mo5692e();
    }

    /* renamed from: e */
    public boolean mo6083e() {
        return this.f5429f != null && this.f5429f.mo5693f();
    }

    /* renamed from: f */
    public void mo6084f() {
        if (this.f5429f != null) {
            this.f5429f.mo5702i();
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: g */
    public boolean mo6085g() {
        Layout layout;
        if (this.f5430g == null || (layout = this.f5430g.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    public int getContentInsetEnd() {
        if (this.f5445v != null) {
            return this.f5445v.mo7159d();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        return this.f5447x != Integer.MIN_VALUE ? this.f5447x : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        if (this.f5445v != null) {
            return this.f5445v.mo7153a();
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.f5445v != null) {
            return this.f5445v.mo7156b();
        }
        return 0;
    }

    public int getContentInsetStart() {
        if (this.f5445v != null) {
            return this.f5445v.mo7158c();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.f5446w != Integer.MIN_VALUE ? this.f5446w : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        if (this.f5429f != null) {
            C1550h d = this.f5429f.mo5690d();
            z = d != null && d.hasVisibleItems();
        } else {
            z = false;
        }
        return z ? Math.max(getContentInsetEnd(), Math.max(this.f5447x, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C1040ar.m5947k(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C1040ar.m5947k(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f5446w, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        if (this.f5433j != null) {
            return this.f5433j.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        if (this.f5433j != null) {
            return this.f5433j.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m9788o();
        return this.f5429f.getMenu();
    }

    @C0003aa
    public CharSequence getNavigationContentDescription() {
        if (this.f5432i != null) {
            return this.f5432i.getContentDescription();
        }
        return null;
    }

    @C0003aa
    public Drawable getNavigationIcon() {
        if (this.f5432i != null) {
            return this.f5432i.getDrawable();
        }
        return null;
    }

    @C0003aa
    public Drawable getOverflowIcon() {
        m9788o();
        return this.f5429f.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.f5437n;
    }

    public CharSequence getSubtitle() {
        return this.f5409A;
    }

    public CharSequence getTitle() {
        return this.f5449z;
    }

    public int getTitleMarginBottom() {
        return this.f5444u;
    }

    public int getTitleMarginEnd() {
        return this.f5442s;
    }

    public int getTitleMarginStart() {
        return this.f5441r;
    }

    public int getTitleMarginTop() {
        return this.f5443t;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public C1669ae getWrapper() {
        if (this.f5418J == null) {
            this.f5418J = new C1808bq(this, true);
        }
        return this.f5418J;
    }

    /* renamed from: h */
    public boolean mo6113h() {
        return (this.f5420L == null || this.f5420L.f5454b == null) ? false : true;
    }

    /* renamed from: i */
    public void mo6114i() {
        C1555k kVar = this.f5420L == null ? null : this.f5420L.f5454b;
        if (kVar != null) {
            kVar.collapseActionView();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6115j() {
        if (this.f5425a == null) {
            this.f5425a = new C1855o(getContext(), (AttributeSet) null, C1359b.C1361b.toolbarNavigationButtonStyle);
            this.f5425a.setImageDrawable(this.f5434k);
            this.f5425a.setContentDescription(this.f5435l);
            C1636b k = generateDefaultLayoutParams();
            k.f4312a = 8388611 | (this.f5427c & 112);
            k.f5459e = 2;
            this.f5425a.setLayoutParams(k);
            this.f5425a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toolbar.this.mo6114i();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C1636b generateDefaultLayoutParams() {
        return new C1636b(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6117l() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C1636b) childAt.getLayoutParams()).f5459e == 2 || childAt == this.f5429f)) {
                removeViewAt(childCount);
                this.f5415G.add(childAt);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6118m() {
        for (int size = this.f5415G.size() - 1; size >= 0; size--) {
            addView(this.f5415G.get(size));
        }
        this.f5415G.clear();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5424P);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a = C1200x.m7131a(motionEvent);
        if (a == 9) {
            this.f5413E = false;
        }
        if (!this.f5413E) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a == 9 && !onHoverEvent) {
                this.f5413E = true;
            }
        }
        if (a == 10 || a == 3) {
            this.f5413E = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int max;
        boolean z2 = C1040ar.m5947k(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i16 = width - paddingRight;
        int[] iArr = this.f5416H;
        iArr[1] = 0;
        iArr[0] = 0;
        int z3 = C1040ar.m5968z(this);
        int min = z3 >= 0 ? Math.min(z3, i4 - i2) : 0;
        if (!m9779a((View) this.f5432i)) {
            i5 = i16;
            i6 = paddingLeft;
        } else if (z2) {
            i5 = m9782b(this.f5432i, i16, iArr, min);
            i6 = paddingLeft;
        } else {
            int i17 = i16;
            i6 = m9774a((View) this.f5432i, paddingLeft, iArr, min);
            i5 = i17;
        }
        if (m9779a((View) this.f5425a)) {
            if (z2) {
                i5 = m9782b(this.f5425a, i5, iArr, min);
            } else {
                i6 = m9774a((View) this.f5425a, i6, iArr, min);
            }
        }
        if (m9779a((View) this.f5429f)) {
            if (z2) {
                i6 = m9774a((View) this.f5429f, i6, iArr, min);
            } else {
                i5 = m9782b(this.f5429f, i5, iArr, min);
            }
        }
        int currentContentInsetLeft = getCurrentContentInsetLeft();
        int currentContentInsetRight = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft - i6);
        iArr[1] = Math.max(0, currentContentInsetRight - ((width - paddingRight) - i5));
        int max2 = Math.max(i6, currentContentInsetLeft);
        int min2 = Math.min(i5, (width - paddingRight) - currentContentInsetRight);
        if (m9779a(this.f5426b)) {
            if (z2) {
                min2 = m9782b(this.f5426b, min2, iArr, min);
            } else {
                max2 = m9774a(this.f5426b, max2, iArr, min);
            }
        }
        if (!m9779a((View) this.f5433j)) {
            i7 = min2;
            i8 = max2;
        } else if (z2) {
            i7 = m9782b(this.f5433j, min2, iArr, min);
            i8 = max2;
        } else {
            i7 = min2;
            i8 = m9774a((View) this.f5433j, max2, iArr, min);
        }
        boolean a = m9779a((View) this.f5430g);
        boolean a2 = m9779a((View) this.f5431h);
        int i18 = 0;
        if (a) {
            C1636b bVar = (C1636b) this.f5430g.getLayoutParams();
            i18 = 0 + bVar.bottomMargin + bVar.topMargin + this.f5430g.getMeasuredHeight();
        }
        if (a2) {
            C1636b bVar2 = (C1636b) this.f5431h.getLayoutParams();
            i9 = bVar2.bottomMargin + bVar2.topMargin + this.f5431h.getMeasuredHeight() + i18;
        } else {
            i9 = i18;
        }
        if (a || a2) {
            TextView textView = a ? this.f5430g : this.f5431h;
            TextView textView2 = a2 ? this.f5431h : this.f5430g;
            C1636b bVar3 = (C1636b) textView.getLayoutParams();
            C1636b bVar4 = (C1636b) textView2.getLayoutParams();
            boolean z4 = (a && this.f5430g.getMeasuredWidth() > 0) || (a2 && this.f5431h.getMeasuredWidth() > 0);
            switch (this.f5448y & 112) {
                case 48:
                    i10 = bVar3.topMargin + getPaddingTop() + this.f5443t;
                    break;
                case 80:
                    i10 = (((height - paddingBottom) - bVar4.bottomMargin) - this.f5444u) - i9;
                    break;
                default:
                    int i19 = (((height - paddingTop) - paddingBottom) - i9) / 2;
                    if (i19 < bVar3.topMargin + this.f5443t) {
                        max = bVar3.topMargin + this.f5443t;
                    } else {
                        int i20 = (((height - paddingBottom) - i9) - i19) - paddingTop;
                        max = i20 < bVar3.bottomMargin + this.f5444u ? Math.max(0, i19 - ((bVar4.bottomMargin + this.f5444u) - i20)) : i19;
                    }
                    i10 = paddingTop + max;
                    break;
            }
            if (z2) {
                int i21 = (z4 ? this.f5441r : 0) - iArr[1];
                int max3 = i7 - Math.max(0, i21);
                iArr[1] = Math.max(0, -i21);
                if (a) {
                    int measuredWidth = max3 - this.f5430g.getMeasuredWidth();
                    int measuredHeight = this.f5430g.getMeasuredHeight() + i10;
                    this.f5430g.layout(measuredWidth, i10, max3, measuredHeight);
                    int i22 = measuredWidth - this.f5442s;
                    i10 = measuredHeight + ((C1636b) this.f5430g.getLayoutParams()).bottomMargin;
                    i14 = i22;
                } else {
                    i14 = max3;
                }
                if (a2) {
                    C1636b bVar5 = (C1636b) this.f5431h.getLayoutParams();
                    int i23 = bVar5.topMargin + i10;
                    int measuredHeight2 = this.f5431h.getMeasuredHeight() + i23;
                    this.f5431h.layout(max3 - this.f5431h.getMeasuredWidth(), i23, max3, measuredHeight2);
                    int i24 = bVar5.bottomMargin + measuredHeight2;
                    i15 = max3 - this.f5442s;
                } else {
                    i15 = max3;
                }
                i7 = z4 ? Math.min(i14, i15) : max3;
            } else {
                int i25 = (z4 ? this.f5441r : 0) - iArr[0];
                i8 += Math.max(0, i25);
                iArr[0] = Math.max(0, -i25);
                if (a) {
                    int measuredWidth2 = this.f5430g.getMeasuredWidth() + i8;
                    int measuredHeight3 = this.f5430g.getMeasuredHeight() + i10;
                    this.f5430g.layout(i8, i10, measuredWidth2, measuredHeight3);
                    int i26 = ((C1636b) this.f5430g.getLayoutParams()).bottomMargin + measuredHeight3;
                    i11 = measuredWidth2 + this.f5442s;
                    i12 = i26;
                } else {
                    i11 = i8;
                    i12 = i10;
                }
                if (a2) {
                    C1636b bVar6 = (C1636b) this.f5431h.getLayoutParams();
                    int i27 = i12 + bVar6.topMargin;
                    int measuredWidth3 = this.f5431h.getMeasuredWidth() + i8;
                    int measuredHeight4 = this.f5431h.getMeasuredHeight() + i27;
                    this.f5431h.layout(i8, i27, measuredWidth3, measuredHeight4);
                    int i28 = bVar6.bottomMargin + measuredHeight4;
                    i13 = this.f5442s + measuredWidth3;
                } else {
                    i13 = i8;
                }
                if (z4) {
                    i8 = Math.max(i11, i13);
                }
            }
        }
        m9778a((List<View>) this.f5414F, 3);
        int size = this.f5414F.size();
        int i29 = i8;
        for (int i30 = 0; i30 < size; i30++) {
            i29 = m9774a(this.f5414F.get(i30), i29, iArr, min);
        }
        m9778a((List<View>) this.f5414F, 5);
        int size2 = this.f5414F.size();
        for (int i31 = 0; i31 < size2; i31++) {
            i7 = m9782b(this.f5414F.get(i31), i7, iArr, min);
        }
        m9778a((List<View>) this.f5414F, 1);
        int a3 = m9775a((List<View>) this.f5414F, iArr);
        int i32 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (a3 / 2);
        int i33 = a3 + i32;
        if (i32 < i29) {
            i32 = i29;
        } else if (i33 > i7) {
            i32 -= i33 - i7;
        }
        int size3 = this.f5414F.size();
        int i34 = i32;
        for (int i35 = 0; i35 < size3; i35++) {
            i34 = m9774a(this.f5414F.get(i35), i34, iArr, min);
        }
        this.f5414F.clear();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int[] iArr = this.f5416H;
        if (C1819bu.m11063a(this)) {
            c = 0;
            c2 = 1;
        } else {
            c = 1;
            c2 = 0;
        }
        int i7 = 0;
        if (m9779a((View) this.f5432i)) {
            m9776a((View) this.f5432i, i, 0, i2, 0, this.f5440q);
            i7 = this.f5432i.getMeasuredWidth() + m9781b((View) this.f5432i);
            int max = Math.max(0, this.f5432i.getMeasuredHeight() + m9784c((View) this.f5432i));
            i6 = C1819bu.m11061a(0, C1040ar.m5958p(this.f5432i));
            i5 = max;
        }
        if (m9779a((View) this.f5425a)) {
            m9776a((View) this.f5425a, i, 0, i2, 0, this.f5440q);
            i7 = this.f5425a.getMeasuredWidth() + m9781b((View) this.f5425a);
            i5 = Math.max(i5, this.f5425a.getMeasuredHeight() + m9784c((View) this.f5425a));
            i6 = C1819bu.m11061a(i6, C1040ar.m5958p(this.f5425a));
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max2 = 0 + Math.max(currentContentInsetStart, i7);
        iArr[c2] = Math.max(0, currentContentInsetStart - i7);
        int i8 = 0;
        if (m9779a((View) this.f5429f)) {
            m9776a((View) this.f5429f, i, max2, i2, 0, this.f5440q);
            i8 = this.f5429f.getMeasuredWidth() + m9781b((View) this.f5429f);
            i5 = Math.max(i5, this.f5429f.getMeasuredHeight() + m9784c((View) this.f5429f));
            i6 = C1819bu.m11061a(i6, C1040ar.m5958p(this.f5429f));
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max2 + Math.max(currentContentInsetEnd, i8);
        iArr[c] = Math.max(0, currentContentInsetEnd - i8);
        if (m9779a(this.f5426b)) {
            max3 += m9773a(this.f5426b, i, max3, i2, 0, iArr);
            i5 = Math.max(i5, this.f5426b.getMeasuredHeight() + m9784c(this.f5426b));
            i6 = C1819bu.m11061a(i6, C1040ar.m5958p(this.f5426b));
        }
        if (m9779a((View) this.f5433j)) {
            max3 += m9773a((View) this.f5433j, i, max3, i2, 0, iArr);
            i5 = Math.max(i5, this.f5433j.getMeasuredHeight() + m9784c((View) this.f5433j));
            i6 = C1819bu.m11061a(i6, C1040ar.m5958p(this.f5433j));
        }
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = i5;
        int i11 = i6;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (((C1636b) childAt.getLayoutParams()).f5459e != 0) {
                i3 = i11;
                i4 = i10;
            } else if (!m9779a(childAt)) {
                i3 = i11;
                i4 = i10;
            } else {
                max3 += m9773a(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i10, childAt.getMeasuredHeight() + m9784c(childAt));
                i3 = C1819bu.m11061a(i11, C1040ar.m5958p(childAt));
                i4 = max4;
            }
            i9++;
            i11 = i3;
            i10 = i4;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = this.f5443t + this.f5444u;
        int i15 = this.f5441r + this.f5442s;
        if (m9779a((View) this.f5430g)) {
            m9773a((View) this.f5430g, i, max3 + i15, i2, i14, iArr);
            i12 = m9781b((View) this.f5430g) + this.f5430g.getMeasuredWidth();
            i13 = this.f5430g.getMeasuredHeight() + m9784c((View) this.f5430g);
            i11 = C1819bu.m11061a(i11, C1040ar.m5958p(this.f5430g));
        }
        if (m9779a((View) this.f5431h)) {
            i12 = Math.max(i12, m9773a((View) this.f5431h, i, max3 + i15, i2, i14 + i13, iArr));
            i13 += this.f5431h.getMeasuredHeight() + m9784c((View) this.f5431h);
            i11 = C1819bu.m11061a(i11, C1040ar.m5958p(this.f5431h));
        }
        int max5 = Math.max(i10, i13);
        int paddingLeft = i12 + max3 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max5 + getPaddingTop() + getPaddingBottom();
        int a = C1040ar.m5878a(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i11);
        int a2 = C1040ar.m5878a(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i11 << 16);
        if (m9792s()) {
            a2 = 0;
        }
        setMeasuredDimension(a, a2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C1638d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1638d dVar = (C1638d) parcelable;
        super.onRestoreInstanceState(dVar.mo3092a());
        C1550h d = this.f5429f != null ? this.f5429f.mo5690d() : null;
        if (!(dVar.f5460b == 0 || this.f5420L == null || d == null || (findItem = d.findItem(dVar.f5460b)) == null)) {
            C1189u.m7085c(findItem);
        }
        if (dVar.f5461c) {
            m9791r();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m9793t();
        C1780bc bcVar = this.f5445v;
        if (i != 1) {
            z = false;
        }
        bcVar.mo7155a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1638d dVar = new C1638d(super.onSaveInstanceState());
        if (!(this.f5420L == null || this.f5420L.f5454b == null)) {
            dVar.f5460b = this.f5420L.f5454b.getItemId();
        }
        dVar.f5461c = mo6079b();
        return dVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = C1200x.m7131a(motionEvent);
        if (a == 0) {
            this.f5412D = false;
        }
        if (!this.f5412D) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.f5412D = true;
            }
        }
        if (a == 1 || a == 3) {
            this.f5412D = false;
        }
        return true;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setCollapsible(boolean z) {
        this.f5423O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f5447x) {
            this.f5447x = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f5446w) {
            this.f5446w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@C0036o int i) {
        setLogo(C1477b.m8692b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m9787n();
            if (!m9786e(this.f5433j)) {
                m9777a((View) this.f5433j, true);
            }
        } else if (this.f5433j != null && m9786e(this.f5433j)) {
            removeView(this.f5433j);
            this.f5415G.remove(this.f5433j);
        }
        if (this.f5433j != null) {
            this.f5433j.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(@C0015aj int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m9787n();
        }
        if (this.f5433j != null) {
            this.f5433j.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@C0015aj int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(@C0003aa CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m9790q();
        }
        if (this.f5432i != null) {
            this.f5432i.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(@C0036o int i) {
        setNavigationIcon(C1477b.m8692b(getContext(), i));
    }

    public void setNavigationIcon(@C0003aa Drawable drawable) {
        if (drawable != null) {
            m9790q();
            if (!m9786e(this.f5432i)) {
                m9777a((View) this.f5432i, true);
            }
        } else if (this.f5432i != null && m9786e(this.f5432i)) {
            removeView(this.f5432i);
            this.f5415G.remove(this.f5432i);
        }
        if (this.f5432i != null) {
            this.f5432i.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m9790q();
        this.f5432i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C1637c cVar) {
        this.f5428d = cVar;
    }

    public void setOverflowIcon(@C0003aa Drawable drawable) {
        m9788o();
        this.f5429f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@C0016ak int i) {
        if (this.f5437n != i) {
            this.f5437n = i;
            if (i == 0) {
                this.f5436m = getContext();
            } else {
                this.f5436m = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(@C0015aj int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f5431h == null) {
                Context context = getContext();
                this.f5431h = new C1664ab(context);
                this.f5431h.setSingleLine();
                this.f5431h.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f5439p != 0) {
                    this.f5431h.setTextAppearance(context, this.f5439p);
                }
                if (this.f5411C != 0) {
                    this.f5431h.setTextColor(this.f5411C);
                }
            }
            if (!m9786e(this.f5431h)) {
                m9777a((View) this.f5431h, true);
            }
        } else if (this.f5431h != null && m9786e(this.f5431h)) {
            removeView(this.f5431h);
            this.f5415G.remove(this.f5431h);
        }
        if (this.f5431h != null) {
            this.f5431h.setText(charSequence);
        }
        this.f5409A = charSequence;
    }

    public void setSubtitleTextColor(@C0032k int i) {
        this.f5411C = i;
        if (this.f5431h != null) {
            this.f5431h.setTextColor(i);
        }
    }

    public void setTitle(@C0015aj int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f5430g == null) {
                Context context = getContext();
                this.f5430g = new C1664ab(context);
                this.f5430g.setSingleLine();
                this.f5430g.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f5438o != 0) {
                    this.f5430g.setTextAppearance(context, this.f5438o);
                }
                if (this.f5410B != 0) {
                    this.f5430g.setTextColor(this.f5410B);
                }
            }
            if (!m9786e(this.f5430g)) {
                m9777a((View) this.f5430g, true);
            }
        } else if (this.f5430g != null && m9786e(this.f5430g)) {
            removeView(this.f5430g);
            this.f5415G.remove(this.f5430g);
        }
        if (this.f5430g != null) {
            this.f5430g.setText(charSequence);
        }
        this.f5449z = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f5444u = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f5442s = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f5441r = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f5443t = i;
        requestLayout();
    }

    public void setTitleTextColor(@C0032k int i) {
        this.f5410B = i;
        if (this.f5430g != null) {
            this.f5430g.setTextColor(i);
        }
    }
}
