package android.support.p036v7.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import android.support.annotation.C0032k;
import android.support.annotation.C0036o;
import android.support.annotation.C0047z;
import android.support.p006e.p007a.C0120c;
import android.support.p006e.p007a.C0132i;
import android.support.p010v4.p014d.C0434d;
import android.support.p010v4.p018f.C0516e;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p010v4.p033o.C0876a;
import android.support.p010v4.p033o.C0886i;
import android.support.p010v4.p033o.C0887j;
import android.support.p010v4.p033o.C0901p;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p038b.p039a.C1477b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.m */
public final class C1849m {

    /* renamed from: a */
    private static final String f6291a = "AppCompatDrawableManager";

    /* renamed from: b */
    private static final boolean f6292b = false;

    /* renamed from: c */
    private static final PorterDuff.Mode f6293c = PorterDuff.Mode.SRC_IN;

    /* renamed from: d */
    private static final String f6294d = "appcompat_skip_skip";

    /* renamed from: e */
    private static final String f6295e = "android.graphics.drawable.VectorDrawable";

    /* renamed from: f */
    private static C1849m f6296f;

    /* renamed from: g */
    private static final C1851b f6297g = new C1851b(6);

    /* renamed from: h */
    private static final int[] f6298h = {C1359b.C1365f.abc_textfield_search_default_mtrl_alpha, C1359b.C1365f.abc_textfield_default_mtrl_alpha, C1359b.C1365f.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: i */
    private static final int[] f6299i = {C1359b.C1365f.abc_ic_commit_search_api_mtrl_alpha, C1359b.C1365f.abc_seekbar_tick_mark_material, C1359b.C1365f.abc_ic_menu_share_mtrl_alpha, C1359b.C1365f.abc_ic_menu_copy_mtrl_am_alpha, C1359b.C1365f.abc_ic_menu_cut_mtrl_alpha, C1359b.C1365f.abc_ic_menu_selectall_mtrl_alpha, C1359b.C1365f.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: j */
    private static final int[] f6300j = {C1359b.C1365f.abc_textfield_activated_mtrl_alpha, C1359b.C1365f.abc_textfield_search_activated_mtrl_alpha, C1359b.C1365f.abc_cab_background_top_mtrl_alpha, C1359b.C1365f.abc_text_cursor_material, C1359b.C1365f.abc_text_select_handle_left_mtrl_dark, C1359b.C1365f.abc_text_select_handle_middle_mtrl_dark, C1359b.C1365f.abc_text_select_handle_right_mtrl_dark, C1359b.C1365f.abc_text_select_handle_left_mtrl_light, C1359b.C1365f.abc_text_select_handle_middle_mtrl_light, C1359b.C1365f.abc_text_select_handle_right_mtrl_light};

    /* renamed from: k */
    private static final int[] f6301k = {C1359b.C1365f.abc_popup_background_mtrl_mult, C1359b.C1365f.abc_cab_background_internal_bg, C1359b.C1365f.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: l */
    private static final int[] f6302l = {C1359b.C1365f.abc_tab_indicator_material, C1359b.C1365f.abc_textfield_search_material};

    /* renamed from: m */
    private static final int[] f6303m = {C1359b.C1365f.abc_btn_check_material, C1359b.C1365f.abc_btn_radio_material};

    /* renamed from: n */
    private WeakHashMap<Context, C0901p<ColorStateList>> f6304n;

    /* renamed from: o */
    private C0876a<String, C1852c> f6305o;

    /* renamed from: p */
    private C0901p<String> f6306p;

    /* renamed from: q */
    private final Object f6307q = new Object();

    /* renamed from: r */
    private final WeakHashMap<Context, C0886i<WeakReference<Drawable.ConstantState>>> f6308r = new WeakHashMap<>(0);

    /* renamed from: s */
    private TypedValue f6309s;

    /* renamed from: t */
    private boolean f6310t;

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    /* renamed from: android.support.v7.widget.m$a */
    private static class C1850a implements C1852c {
        C1850a() {
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public Drawable mo7456a(@C0047z Context context, @C0047z XmlPullParser xmlPullParser, @C0047z AttributeSet attributeSet, @C0003aa Resources.Theme theme) {
            try {
                return C0120c.m637a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.m$b */
    private static class C1851b extends C0887j<Integer, PorterDuffColorFilter> {
        public C1851b(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m11226b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo7457a(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo2875a(Integer.valueOf(m11226b(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo7458a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo2876a(Integer.valueOf(m11226b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: android.support.v7.widget.m$c */
    private interface C1852c {
        /* renamed from: a */
        Drawable mo7456a(@C0047z Context context, @C0047z XmlPullParser xmlPullParser, @C0047z AttributeSet attributeSet, @C0003aa Resources.Theme theme);
    }

    /* renamed from: android.support.v7.widget.m$d */
    private static class C1853d implements C1852c {
        C1853d() {
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public Drawable mo7456a(@C0047z Context context, @C0047z XmlPullParser xmlPullParser, @C0047z AttributeSet attributeSet, @C0003aa Resources.Theme theme) {
            try {
                return C0132i.m677a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m11195a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    static PorterDuff.Mode m11196a(int i) {
        if (i == C1359b.C1365f.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    public static PorterDuffColorFilter m11197a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a = f6297g.mo7457a(i, mode);
        if (a != null) {
            return a;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        f6297g.mo7458a(i, mode, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m11198a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m11197a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private Drawable m11199a(@C0047z Context context, @C0036o int i, boolean z, @C0047z Drawable drawable) {
        ColorStateList b = mo7455b(context, i);
        if (b != null) {
            if (C1683ah.m10102c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable g = C0484a.m2551g(drawable);
            C0484a.m2540a(g, b);
            PorterDuff.Mode a = m11196a(i);
            if (a == null) {
                return g;
            }
            C0484a.m2543a(g, a);
            return g;
        } else if (i == C1359b.C1365f.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m11203a(layerDrawable.findDrawableByLayerId(16908288), C1801bk.m10907a(context, C1359b.C1361b.colorControlNormal), f6293c);
            m11203a(layerDrawable.findDrawableByLayerId(16908303), C1801bk.m10907a(context, C1359b.C1361b.colorControlNormal), f6293c);
            m11203a(layerDrawable.findDrawableByLayerId(16908301), C1801bk.m10907a(context, C1359b.C1361b.colorControlActivated), f6293c);
            return drawable;
        } else if (i == C1359b.C1365f.abc_ratingbar_material || i == C1359b.C1365f.abc_ratingbar_indicator_material || i == C1359b.C1365f.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m11203a(layerDrawable2.findDrawableByLayerId(16908288), C1801bk.m10912c(context, C1359b.C1361b.colorControlNormal), f6293c);
            m11203a(layerDrawable2.findDrawableByLayerId(16908303), C1801bk.m10907a(context, C1359b.C1361b.colorControlActivated), f6293c);
            m11203a(layerDrawable2.findDrawableByLayerId(16908301), C1801bk.m10907a(context, C1359b.C1361b.colorControlActivated), f6293c);
            return drawable;
        } else if (m11207a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m11200a(@android.support.annotation.C0047z android.content.Context r5, long r6) {
        /*
            r4 = this;
            r2 = 0
            java.lang.Object r3 = r4.f6307q
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, android.support.v4.o.i<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r4.f6308r     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x002b }
            android.support.v4.o.i r0 = (android.support.p010v4.p033o.C0886i) r0     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            r0 = r2
        L_0x0010:
            return r0
        L_0x0011:
            java.lang.Object r1 = r0.mo2860a((long) r6)     // Catch:{ all -> 0x002b }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x002e
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable r0 = r1.newDrawable(r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            goto L_0x0010
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0
        L_0x002e:
            r0.mo2866b((long) r6)     // Catch:{ all -> 0x002b }
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            r0 = r2
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1849m.m11200a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static C1849m m11201a() {
        if (f6296f == null) {
            f6296f = new C1849m();
            m11205a(f6296f);
        }
        return f6296f;
    }

    /* renamed from: a */
    private void m11202a(@C0047z Context context, @C0036o int i, @C0047z ColorStateList colorStateList) {
        if (this.f6304n == null) {
            this.f6304n = new WeakHashMap<>();
        }
        C0901p pVar = this.f6304n.get(context);
        if (pVar == null) {
            pVar = new C0901p();
            this.f6304n.put(context, pVar);
        }
        pVar.mo2994d(i, colorStateList);
    }

    /* renamed from: a */
    private static void m11203a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C1683ah.m10102c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f6293c;
        }
        drawable.setColorFilter(m11197a(i, mode));
    }

    /* renamed from: a */
    static void m11204a(Drawable drawable, C1805bn bnVar, int[] iArr) {
        if (!C1683ah.m10102c(drawable) || drawable.mutate() == drawable) {
            if (bnVar.f6103d || bnVar.f6102c) {
                drawable.setColorFilter(m11198a(bnVar.f6103d ? bnVar.f6100a : null, bnVar.f6102c ? bnVar.f6101b : f6293c, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d(f6291a, "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static void m11205a(@C0047z C1849m mVar) {
        if (Build.VERSION.SDK_INT < 24) {
            mVar.m11206a("vector", (C1852c) new C1853d());
            if (Build.VERSION.SDK_INT >= 11) {
                mVar.m11206a("animated-vector", (C1852c) new C1850a());
            }
        }
    }

    /* renamed from: a */
    private void m11206a(@C0047z String str, @C0047z C1852c cVar) {
        if (this.f6305o == null) {
            this.f6305o = new C0876a<>();
        }
        this.f6305o.put(str, cVar);
    }

    /* renamed from: a */
    static boolean m11207a(@C0047z Context context, @C0036o int i, @C0047z Drawable drawable) {
        int i2;
        int i3;
        PorterDuff.Mode mode;
        boolean z;
        PorterDuff.Mode mode2 = f6293c;
        if (m11210a(f6298h, i)) {
            i3 = C1359b.C1361b.colorControlNormal;
            mode = mode2;
            z = true;
            i2 = -1;
        } else if (m11210a(f6300j, i)) {
            i3 = C1359b.C1361b.colorControlActivated;
            mode = mode2;
            z = true;
            i2 = -1;
        } else if (m11210a(f6301k, i)) {
            z = true;
            mode = PorterDuff.Mode.MULTIPLY;
            i3 = 16842801;
            i2 = -1;
        } else if (i == C1359b.C1365f.abc_list_divider_mtrl_alpha) {
            i3 = 16842800;
            i2 = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i == C1359b.C1365f.abc_dialog_material_background) {
            i3 = 16842801;
            mode = mode2;
            z = true;
            i2 = -1;
        } else {
            i2 = -1;
            i3 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (C1683ah.m10102c(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(m11197a(C1801bk.m10907a(context, i3), mode));
        if (i2 == -1) {
            return true;
        }
        drawable.setAlpha(i2);
        return true;
    }

    /* renamed from: a */
    private boolean m11208a(@C0047z Context context, long j, @C0047z Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f6307q) {
            C0886i iVar = this.f6308r.get(context);
            if (iVar == null) {
                iVar = new C0886i();
                this.f6308r.put(context, iVar);
            }
            iVar.mo2867b(j, new WeakReference(constantState));
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m11209a(@C0047z Drawable drawable) {
        return (drawable instanceof C0132i) || f6295e.equals(drawable.getClass().getName());
    }

    /* renamed from: a */
    private static boolean m11210a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private ColorStateList m11211b(@C0047z Context context) {
        return m11219f(context, C1801bk.m10907a(context, C1359b.C1361b.colorButtonNormal));
    }

    /* renamed from: b */
    private void m11212b(@C0047z String str, @C0047z C1852c cVar) {
        if (this.f6305o != null && this.f6305o.get(str) == cVar) {
            this.f6305o.remove(str);
        }
    }

    /* renamed from: c */
    private ColorStateList m11213c(@C0047z Context context) {
        return m11219f(context, 0);
    }

    /* renamed from: c */
    private Drawable m11214c(@C0047z Context context, @C0036o int i) {
        if (this.f6309s == null) {
            this.f6309s = new TypedValue();
        }
        TypedValue typedValue = this.f6309s;
        context.getResources().getValue(i, typedValue, true);
        long a = m11195a(typedValue);
        Drawable a2 = m11200a(context, a);
        if (a2 == null) {
            if (i == C1359b.C1365f.abc_cab_background_top_material) {
                a2 = new LayerDrawable(new Drawable[]{mo7451a(context, C1359b.C1365f.abc_cab_background_internal_bg), mo7451a(context, C1359b.C1365f.abc_cab_background_top_mtrl_alpha)});
            }
            if (a2 != null) {
                a2.setChangingConfigurations(typedValue.changingConfigurations);
                m11208a(context, a, a2);
            }
        }
        return a2;
    }

    /* renamed from: d */
    private ColorStateList m11215d(@C0047z Context context) {
        return m11219f(context, C1801bk.m10907a(context, C1359b.C1361b.colorAccent));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m11216d(@android.support.annotation.C0047z android.content.Context r10, @android.support.annotation.C0036o int r11) {
        /*
            r9 = this;
            r1 = 0
            r8 = 2
            r7 = 1
            android.support.v4.o.a<java.lang.String, android.support.v7.widget.m$c> r0 = r9.f6305o
            if (r0 == 0) goto L_0x00bf
            android.support.v4.o.a<java.lang.String, android.support.v7.widget.m$c> r0 = r9.f6305o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00bf
            android.support.v4.o.p<java.lang.String> r0 = r9.f6306p
            if (r0 == 0) goto L_0x002f
            android.support.v4.o.p<java.lang.String> r0 = r9.f6306p
            java.lang.Object r0 = r0.mo2983a((int) r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "appcompat_skip_skip"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x002d
            if (r0 == 0) goto L_0x0036
            android.support.v4.o.a<java.lang.String, android.support.v7.widget.m$c> r2 = r9.f6305o
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L_0x0036
        L_0x002d:
            r0 = r1
        L_0x002e:
            return r0
        L_0x002f:
            android.support.v4.o.p r0 = new android.support.v4.o.p
            r0.<init>()
            r9.f6306p = r0
        L_0x0036:
            android.util.TypedValue r0 = r9.f6309s
            if (r0 != 0) goto L_0x0041
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r9.f6309s = r0
        L_0x0041:
            android.util.TypedValue r2 = r9.f6309s
            android.content.res.Resources r0 = r10.getResources()
            r0.getValue(r11, r2, r7)
            long r4 = m11195a((android.util.TypedValue) r2)
            android.graphics.drawable.Drawable r1 = r9.m11200a((android.content.Context) r10, (long) r4)
            if (r1 == 0) goto L_0x0056
            r0 = r1
            goto L_0x002e
        L_0x0056:
            java.lang.CharSequence r3 = r2.string
            if (r3 == 0) goto L_0x008a
            java.lang.CharSequence r3 = r2.string
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = ".xml"
            boolean r3 = r3.endsWith(r6)
            if (r3 == 0) goto L_0x008a
            android.content.res.XmlResourceParser r3 = r0.getXml(r11)     // Catch:{ Exception -> 0x0082 }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r3)     // Catch:{ Exception -> 0x0082 }
        L_0x0070:
            int r0 = r3.next()     // Catch:{ Exception -> 0x0082 }
            if (r0 == r8) goto L_0x0078
            if (r0 != r7) goto L_0x0070
        L_0x0078:
            if (r0 == r8) goto L_0x0095
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0082 }
            java.lang.String r2 = "No start tag found"
            r0.<init>(r2)     // Catch:{ Exception -> 0x0082 }
            throw r0     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            java.lang.String r2 = "AppCompatDrawableManager"
            java.lang.String r3 = "Exception while inflating drawable"
            android.util.Log.e(r2, r3, r0)
        L_0x008a:
            r0 = r1
        L_0x008b:
            if (r0 != 0) goto L_0x002e
            android.support.v4.o.p<java.lang.String> r1 = r9.f6306p
            java.lang.String r2 = "appcompat_skip_skip"
            r1.mo2994d(r11, r2)
            goto L_0x002e
        L_0x0095:
            java.lang.String r0 = r3.getName()     // Catch:{ Exception -> 0x0082 }
            android.support.v4.o.p<java.lang.String> r7 = r9.f6306p     // Catch:{ Exception -> 0x0082 }
            r7.mo2994d(r11, r0)     // Catch:{ Exception -> 0x0082 }
            android.support.v4.o.a<java.lang.String, android.support.v7.widget.m$c> r7 = r9.f6305o     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x0082 }
            android.support.v7.widget.m$c r0 = (android.support.p036v7.widget.C1849m.C1852c) r0     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x00b0
            android.content.res.Resources$Theme r7 = r10.getTheme()     // Catch:{ Exception -> 0x0082 }
            android.graphics.drawable.Drawable r1 = r0.mo7456a(r10, r3, r6, r7)     // Catch:{ Exception -> 0x0082 }
        L_0x00b0:
            if (r1 == 0) goto L_0x00bd
            int r0 = r2.changingConfigurations     // Catch:{ Exception -> 0x0082 }
            r1.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x0082 }
            boolean r0 = r9.m11208a((android.content.Context) r10, (long) r4, (android.graphics.drawable.Drawable) r1)     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x00bd
        L_0x00bd:
            r0 = r1
            goto L_0x008b
        L_0x00bf:
            r0 = r1
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1849m.m11216d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: e */
    private ColorStateList m11217e(@C0047z Context context, @C0036o int i) {
        if (this.f6304n == null) {
            return null;
        }
        C0901p pVar = this.f6304n.get(context);
        if (pVar != null) {
            return (ColorStateList) pVar.mo2983a(i);
        }
        return null;
    }

    /* renamed from: e */
    private void m11218e(@C0047z Context context) {
        if (!this.f6310t) {
            this.f6310t = true;
            Drawable a = mo7451a(context, C1359b.C1365f.abc_vector_test);
            if (a == null || !m11209a(a)) {
                this.f6310t = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: f */
    private ColorStateList m11219f(@C0047z Context context, @C0032k int i) {
        int a = C1801bk.m10907a(context, C1359b.C1361b.colorControlHighlight);
        int c = C1801bk.m10912c(context, C1359b.C1361b.colorButtonNormal);
        return new ColorStateList(new int[][]{C1801bk.f6083a, C1801bk.f6086d, C1801bk.f6084b, C1801bk.f6090h}, new int[]{c, C0516e.m2689a(a, i), C0516e.m2689a(a, i), i});
    }

    /* renamed from: a */
    public Drawable mo7451a(@C0047z Context context, @C0036o int i) {
        return mo7452a(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo7452a(@C0047z Context context, @C0036o int i, boolean z) {
        m11218e(context);
        Drawable d = m11216d(context, i);
        if (d == null) {
            d = m11214c(context, i);
        }
        if (d == null) {
            d = C0434d.m2370a(context, i);
        }
        if (d != null) {
            d = m11199a(context, i, z, d);
        }
        if (d != null) {
            C1683ah.m10101b(d);
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo7453a(@C0047z Context context, @C0047z C1811br brVar, @C0036o int i) {
        Drawable d = m11216d(context, i);
        if (d == null) {
            d = brVar.mo7319a(i);
        }
        if (d != null) {
            return m11199a(context, i, false, d);
        }
        return null;
    }

    /* renamed from: a */
    public void mo7454a(@C0047z Context context) {
        synchronized (this.f6307q) {
            C0886i iVar = this.f6308r.get(context);
            if (iVar != null) {
                iVar.mo2869c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo7455b(@C0047z Context context, @C0036o int i) {
        ColorStateList e = m11217e(context, i);
        if (e == null) {
            if (i == C1359b.C1365f.abc_edit_text_material) {
                e = C1477b.m8689a(context, C1359b.C1363d.abc_tint_edittext);
            } else if (i == C1359b.C1365f.abc_switch_track_mtrl_alpha) {
                e = C1477b.m8689a(context, C1359b.C1363d.abc_tint_switch_track);
            } else if (i == C1359b.C1365f.abc_switch_thumb_material) {
                e = C1477b.m8689a(context, C1359b.C1363d.abc_tint_switch_thumb);
            } else if (i == C1359b.C1365f.abc_btn_default_mtrl_shape) {
                e = m11211b(context);
            } else if (i == C1359b.C1365f.abc_btn_borderless_material) {
                e = m11213c(context);
            } else if (i == C1359b.C1365f.abc_btn_colored_material) {
                e = m11215d(context);
            } else if (i == C1359b.C1365f.abc_spinner_mtrl_am_alpha || i == C1359b.C1365f.abc_spinner_textfield_background_material) {
                e = C1477b.m8689a(context, C1359b.C1363d.abc_tint_spinner);
            } else if (m11210a(f6299i, i)) {
                e = C1801bk.m10911b(context, C1359b.C1361b.colorControlNormal);
            } else if (m11210a(f6302l, i)) {
                e = C1477b.m8689a(context, C1359b.C1363d.abc_tint_default);
            } else if (m11210a(f6303m, i)) {
                e = C1477b.m8689a(context, C1359b.C1363d.abc_tint_btn_checkable);
            } else if (i == C1359b.C1365f.abc_seekbar_thumb_material) {
                e = C1477b.m8689a(context, C1359b.C1363d.abc_tint_seek_thumb);
            }
            if (e != null) {
                m11202a(context, i, e);
            }
        }
        return e;
    }
}
