package android.support.p010v4.view.p034a;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.p034a.C0965i;
import android.support.p010v4.view.p034a.C0975q;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v4.view.a.h */
public class C0949h {

    /* renamed from: A */
    public static final String f3269A = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";

    /* renamed from: B */
    public static final String f3270B = "ACTION_ARGUMENT_SELECTION_START_INT";

    /* renamed from: C */
    public static final String f3271C = "ACTION_ARGUMENT_SELECTION_END_INT";

    /* renamed from: D */
    public static final String f3272D = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";

    /* renamed from: E */
    public static final String f3273E = "android.view.accessibility.action.ARGUMENT_ROW_INT";

    /* renamed from: F */
    public static final String f3274F = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";

    /* renamed from: G */
    public static final String f3275G = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* renamed from: H */
    public static final int f3276H = 1;

    /* renamed from: I */
    public static final int f3277I = 2;

    /* renamed from: J */
    public static final int f3278J = 1;

    /* renamed from: K */
    public static final int f3279K = 2;

    /* renamed from: L */
    public static final int f3280L = 4;

    /* renamed from: M */
    public static final int f3281M = 8;

    /* renamed from: N */
    public static final int f3282N = 16;

    /* renamed from: a */
    static final C0956g f3283a;

    /* renamed from: c */
    public static final int f3284c = 1;

    /* renamed from: d */
    public static final int f3285d = 2;

    /* renamed from: e */
    public static final int f3286e = 4;

    /* renamed from: f */
    public static final int f3287f = 8;

    /* renamed from: g */
    public static final int f3288g = 16;

    /* renamed from: h */
    public static final int f3289h = 32;

    /* renamed from: i */
    public static final int f3290i = 64;

    /* renamed from: j */
    public static final int f3291j = 128;

    /* renamed from: k */
    public static final int f3292k = 256;

    /* renamed from: l */
    public static final int f3293l = 512;

    /* renamed from: m */
    public static final int f3294m = 1024;

    /* renamed from: n */
    public static final int f3295n = 2048;

    /* renamed from: o */
    public static final int f3296o = 4096;

    /* renamed from: p */
    public static final int f3297p = 8192;

    /* renamed from: q */
    public static final int f3298q = 16384;

    /* renamed from: r */
    public static final int f3299r = 32768;

    /* renamed from: s */
    public static final int f3300s = 65536;

    /* renamed from: t */
    public static final int f3301t = 131072;

    /* renamed from: u */
    public static final int f3302u = 262144;

    /* renamed from: v */
    public static final int f3303v = 524288;

    /* renamed from: w */
    public static final int f3304w = 1048576;

    /* renamed from: x */
    public static final int f3305x = 2097152;

    /* renamed from: y */
    public static final String f3306y = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";

    /* renamed from: z */
    public static final String f3307z = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";

    /* renamed from: O */
    private final Object f3308O;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: b */
    public int f3309b = -1;

    /* renamed from: android.support.v4.view.a.h$a */
    public static class C0950a {

        /* renamed from: A */
        public static final C0950a f3310A = new C0950a(C0949h.f3283a.mo3276d());

        /* renamed from: B */
        public static final C0950a f3311B = new C0950a(C0949h.f3283a.mo3278f());

        /* renamed from: C */
        public static final C0950a f3312C = new C0950a(C0949h.f3283a.mo3279g());

        /* renamed from: D */
        public static final C0950a f3313D = new C0950a(C0949h.f3283a.mo3283h());

        /* renamed from: a */
        public static final C0950a f3314a = new C0950a(1, (CharSequence) null);

        /* renamed from: b */
        public static final C0950a f3315b = new C0950a(2, (CharSequence) null);

        /* renamed from: c */
        public static final C0950a f3316c = new C0950a(4, (CharSequence) null);

        /* renamed from: d */
        public static final C0950a f3317d = new C0950a(8, (CharSequence) null);

        /* renamed from: e */
        public static final C0950a f3318e = new C0950a(16, (CharSequence) null);

        /* renamed from: f */
        public static final C0950a f3319f = new C0950a(32, (CharSequence) null);

        /* renamed from: g */
        public static final C0950a f3320g = new C0950a(64, (CharSequence) null);

        /* renamed from: h */
        public static final C0950a f3321h = new C0950a(128, (CharSequence) null);

        /* renamed from: i */
        public static final C0950a f3322i = new C0950a(256, (CharSequence) null);

        /* renamed from: j */
        public static final C0950a f3323j = new C0950a(512, (CharSequence) null);

        /* renamed from: k */
        public static final C0950a f3324k = new C0950a(1024, (CharSequence) null);

        /* renamed from: l */
        public static final C0950a f3325l = new C0950a(2048, (CharSequence) null);

        /* renamed from: m */
        public static final C0950a f3326m = new C0950a(4096, (CharSequence) null);

        /* renamed from: n */
        public static final C0950a f3327n = new C0950a(8192, (CharSequence) null);

        /* renamed from: o */
        public static final C0950a f3328o = new C0950a(16384, (CharSequence) null);

        /* renamed from: p */
        public static final C0950a f3329p = new C0950a(32768, (CharSequence) null);

        /* renamed from: q */
        public static final C0950a f3330q = new C0950a(65536, (CharSequence) null);

        /* renamed from: r */
        public static final C0950a f3331r = new C0950a(131072, (CharSequence) null);

        /* renamed from: s */
        public static final C0950a f3332s = new C0950a(262144, (CharSequence) null);

        /* renamed from: t */
        public static final C0950a f3333t = new C0950a(524288, (CharSequence) null);

        /* renamed from: u */
        public static final C0950a f3334u = new C0950a(1048576, (CharSequence) null);

        /* renamed from: v */
        public static final C0950a f3335v = new C0950a(2097152, (CharSequence) null);

        /* renamed from: w */
        public static final C0950a f3336w = new C0950a(C0949h.f3283a.mo3274b());

        /* renamed from: x */
        public static final C0950a f3337x = new C0950a(C0949h.f3283a.mo3272a());

        /* renamed from: y */
        public static final C0950a f3338y = new C0950a(C0949h.f3283a.mo3275c());

        /* renamed from: z */
        public static final C0950a f3339z = new C0950a(C0949h.f3283a.mo3277e());

        /* renamed from: E */
        final Object f3340E;

        public C0950a(int i, CharSequence charSequence) {
            this(C0949h.f3283a.mo3251a(i, charSequence));
        }

        C0950a(Object obj) {
            this.f3340E = obj;
        }

        /* renamed from: a */
        public int mo3247a() {
            return C0949h.f3283a.mo3258b(this.f3340E);
        }

        /* renamed from: b */
        public CharSequence mo3248b() {
            return C0949h.f3283a.mo3260c(this.f3340E);
        }
    }

    /* renamed from: android.support.v4.view.a.h$b */
    static class C0951b extends C0960k {
        C0951b() {
        }

        /* renamed from: a */
        public Object mo3249a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return C0965i.m5279a(i, i2, i3, i4, z, z2);
        }

        /* renamed from: a */
        public Object mo3250a(int i, int i2, boolean z, int i3) {
            return C0965i.m5280a(i, i2, z, i3);
        }

        /* renamed from: a */
        public Object mo3251a(int i, CharSequence charSequence) {
            return C0965i.m5281a(i, charSequence);
        }

        /* renamed from: a */
        public List<Object> mo3252a(Object obj) {
            return C0965i.m5282a(obj);
        }

        /* renamed from: a */
        public void mo3253a(Object obj, int i) {
            C0965i.m5283a(obj, i);
        }

        /* renamed from: a */
        public void mo3254a(Object obj, CharSequence charSequence) {
            C0965i.m5284a(obj, charSequence);
        }

        /* renamed from: a */
        public void mo3255a(Object obj, Object obj2) {
            C0965i.m5285a(obj, obj2);
        }

        /* renamed from: a */
        public boolean mo3256a(Object obj, View view) {
            return C0965i.m5286a(obj, view);
        }

        /* renamed from: a */
        public boolean mo3257a(Object obj, View view, int i) {
            return C0965i.m5287a(obj, view, i);
        }

        /* renamed from: b */
        public int mo3258b(Object obj) {
            return C0965i.m5292e(obj);
        }

        /* renamed from: b */
        public boolean mo3259b(Object obj, Object obj2) {
            return C0965i.m5289b(obj, obj2);
        }

        /* renamed from: c */
        public CharSequence mo3260c(Object obj) {
            return C0965i.m5293f(obj);
        }

        /* renamed from: d */
        public boolean mo3261d(Object obj) {
            return C0965i.C0967b.m5295a(obj);
        }

        /* renamed from: e */
        public CharSequence mo3262e(Object obj) {
            return C0965i.m5288b(obj);
        }

        /* renamed from: f */
        public int mo3263f(Object obj) {
            return C0965i.m5290c(obj);
        }

        /* renamed from: g */
        public Object mo3264g(Object obj) {
            return C0965i.m5291d(obj);
        }

        /* renamed from: h */
        public int mo3265h(Object obj) {
            return C0965i.C0966a.m5294a(obj);
        }
    }

    /* renamed from: android.support.v4.view.a.h$c */
    static class C0952c extends C0951b {
        C0952c() {
        }

        /* renamed from: b */
        public void mo3266b(Object obj, View view) {
            C0968j.m5297a(obj, view);
        }

        /* renamed from: b */
        public void mo3267b(Object obj, View view, int i) {
            C0968j.m5298a(obj, view, i);
        }

        /* renamed from: c */
        public void mo3268c(Object obj, View view) {
            C0968j.m5300b(obj, view);
        }

        /* renamed from: c */
        public void mo3269c(Object obj, View view, int i) {
            C0968j.m5301b(obj, view, i);
        }

        /* renamed from: i */
        public Object mo3270i(Object obj) {
            return C0968j.m5296a(obj);
        }

        /* renamed from: j */
        public Object mo3271j(Object obj) {
            return C0968j.m5299b(obj);
        }
    }

    /* renamed from: android.support.v4.view.a.h$d */
    static class C0953d extends C0952c {
        C0953d() {
        }

        /* renamed from: a */
        public Object mo3272a() {
            return C0969k.m5302a();
        }

        /* renamed from: a */
        public void mo3273a(Object obj, boolean z) {
            C0969k.m5303a(obj, z);
        }

        /* renamed from: b */
        public Object mo3274b() {
            return C0969k.m5305b();
        }

        /* renamed from: c */
        public Object mo3275c() {
            return C0969k.m5306c();
        }

        /* renamed from: d */
        public Object mo3276d() {
            return C0969k.m5307d();
        }

        /* renamed from: e */
        public Object mo3277e() {
            return C0969k.m5308e();
        }

        /* renamed from: f */
        public Object mo3278f() {
            return C0969k.m5309f();
        }

        /* renamed from: g */
        public Object mo3279g() {
            return C0969k.m5310g();
        }

        /* renamed from: k */
        public boolean mo3280k(Object obj) {
            return C0969k.m5304a(obj);
        }
    }

    /* renamed from: android.support.v4.view.a.h$e */
    static class C0954e extends C0953d {
        C0954e() {
        }

        /* renamed from: b */
        public void mo3281b(Object obj, int i) {
            C0970l.m5313a(obj, i);
        }

        /* renamed from: b */
        public void mo3282b(Object obj, boolean z) {
            C0970l.m5314a(obj, z);
        }

        /* renamed from: h */
        public Object mo3283h() {
            return C0970l.m5312a();
        }

        /* renamed from: l */
        public int mo3284l(Object obj) {
            return C0970l.m5311a(obj);
        }

        /* renamed from: m */
        public boolean mo3285m(Object obj) {
            return C0970l.m5315b(obj);
        }
    }

    /* renamed from: android.support.v4.view.a.h$f */
    static class C0955f extends C0961l {
        C0955f() {
        }

        /* renamed from: A */
        public boolean mo3286A(Object obj) {
            return C0971m.m5356n(obj);
        }

        /* renamed from: B */
        public boolean mo3287B(Object obj) {
            return C0971m.m5357o(obj);
        }

        /* renamed from: C */
        public boolean mo3288C(Object obj) {
            return C0971m.m5358p(obj);
        }

        /* renamed from: D */
        public boolean mo3289D(Object obj) {
            return C0971m.m5359q(obj);
        }

        /* renamed from: E */
        public boolean mo3290E(Object obj) {
            return C0971m.m5360r(obj);
        }

        /* renamed from: F */
        public boolean mo3291F(Object obj) {
            return C0971m.m5361s(obj);
        }

        /* renamed from: G */
        public void mo3292G(Object obj) {
            C0971m.m5362t(obj);
        }

        /* renamed from: a */
        public Object mo3293a(View view) {
            return C0971m.m5317a(view);
        }

        /* renamed from: a */
        public List<Object> mo3294a(Object obj, String str) {
            return C0971m.m5319a(obj, str);
        }

        /* renamed from: a */
        public void mo3295a(Object obj, Rect rect) {
            C0971m.m5321a(obj, rect);
        }

        /* renamed from: b */
        public void mo3296b(Object obj, Rect rect) {
            C0971m.m5327b(obj, rect);
        }

        /* renamed from: b */
        public void mo3297b(Object obj, CharSequence charSequence) {
            C0971m.m5323a(obj, charSequence);
        }

        /* renamed from: c */
        public void mo3298c(Object obj, int i) {
            C0971m.m5320a(obj, i);
        }

        /* renamed from: c */
        public void mo3299c(Object obj, Rect rect) {
            C0971m.m5332c(obj, rect);
        }

        /* renamed from: c */
        public void mo3300c(Object obj, CharSequence charSequence) {
            C0971m.m5329b(obj, charSequence);
        }

        /* renamed from: c */
        public void mo3301c(Object obj, boolean z) {
            C0971m.m5324a(obj, z);
        }

        /* renamed from: d */
        public Object mo3302d(Object obj, int i) {
            return C0971m.m5326b(obj, i);
        }

        /* renamed from: d */
        public void mo3303d(Object obj, Rect rect) {
            C0971m.m5338d(obj, rect);
        }

        /* renamed from: d */
        public void mo3304d(Object obj, View view) {
            C0971m.m5322a(obj, view);
        }

        /* renamed from: d */
        public void mo3305d(Object obj, CharSequence charSequence) {
            C0971m.m5334c(obj, charSequence);
        }

        /* renamed from: d */
        public void mo3306d(Object obj, boolean z) {
            C0971m.m5330b(obj, z);
        }

        /* renamed from: e */
        public void mo3307e(Object obj, View view) {
            C0971m.m5328b(obj, view);
        }

        /* renamed from: e */
        public void mo3308e(Object obj, CharSequence charSequence) {
            C0971m.m5339d(obj, charSequence);
        }

        /* renamed from: e */
        public void mo3309e(Object obj, boolean z) {
            C0971m.m5335c(obj, z);
        }

        /* renamed from: e */
        public boolean mo3310e(Object obj, int i) {
            return C0971m.m5336c(obj, i);
        }

        /* renamed from: f */
        public void mo3311f(Object obj, View view) {
            C0971m.m5333c(obj, view);
        }

        /* renamed from: f */
        public void mo3312f(Object obj, boolean z) {
            C0971m.m5340d(obj, z);
        }

        /* renamed from: g */
        public void mo3313g(Object obj, boolean z) {
            C0971m.m5342e(obj, z);
        }

        /* renamed from: h */
        public void mo3314h(Object obj, boolean z) {
            C0971m.m5344f(obj, z);
        }

        /* renamed from: i */
        public Object mo3315i() {
            return C0971m.m5316a();
        }

        /* renamed from: i */
        public void mo3316i(Object obj, boolean z) {
            C0971m.m5346g(obj, z);
        }

        /* renamed from: j */
        public void mo3317j(Object obj, boolean z) {
            C0971m.m5348h(obj, z);
        }

        /* renamed from: k */
        public void mo3318k(Object obj, boolean z) {
            C0971m.m5350i(obj, z);
        }

        /* renamed from: l */
        public void mo3319l(Object obj, boolean z) {
            C0971m.m5351j(obj, z);
        }

        /* renamed from: n */
        public Object mo3320n(Object obj) {
            return C0971m.m5318a(obj);
        }

        /* renamed from: o */
        public int mo3321o(Object obj) {
            return C0971m.m5325b(obj);
        }

        /* renamed from: p */
        public int mo3322p(Object obj) {
            return C0971m.m5331c(obj);
        }

        /* renamed from: q */
        public CharSequence mo3323q(Object obj) {
            return C0971m.m5337d(obj);
        }

        /* renamed from: r */
        public CharSequence mo3324r(Object obj) {
            return C0971m.m5341e(obj);
        }

        /* renamed from: s */
        public CharSequence mo3325s(Object obj) {
            return C0971m.m5343f(obj);
        }

        /* renamed from: t */
        public Object mo3326t(Object obj) {
            return C0971m.m5345g(obj);
        }

        /* renamed from: u */
        public CharSequence mo3327u(Object obj) {
            return C0971m.m5347h(obj);
        }

        /* renamed from: v */
        public int mo3328v(Object obj) {
            return C0971m.m5349i(obj);
        }

        /* renamed from: w */
        public boolean mo3329w(Object obj) {
            return C0971m.m5352j(obj);
        }

        /* renamed from: x */
        public boolean mo3330x(Object obj) {
            return C0971m.m5353k(obj);
        }

        /* renamed from: y */
        public boolean mo3331y(Object obj) {
            return C0971m.m5354l(obj);
        }

        /* renamed from: z */
        public boolean mo3332z(Object obj) {
            return C0971m.m5355m(obj);
        }
    }

    /* renamed from: android.support.v4.view.a.h$g */
    interface C0956g {
        /* renamed from: A */
        boolean mo3286A(Object obj);

        /* renamed from: B */
        boolean mo3287B(Object obj);

        /* renamed from: C */
        boolean mo3288C(Object obj);

        /* renamed from: D */
        boolean mo3289D(Object obj);

        /* renamed from: E */
        boolean mo3290E(Object obj);

        /* renamed from: F */
        boolean mo3291F(Object obj);

        /* renamed from: G */
        void mo3292G(Object obj);

        /* renamed from: H */
        int mo3333H(Object obj);

        /* renamed from: I */
        boolean mo3334I(Object obj);

        /* renamed from: J */
        boolean mo3335J(Object obj);

        /* renamed from: K */
        String mo3336K(Object obj);

        /* renamed from: L */
        int mo3337L(Object obj);

        /* renamed from: M */
        Object mo3338M(Object obj);

        /* renamed from: N */
        Object mo3339N(Object obj);

        /* renamed from: O */
        Object mo3340O(Object obj);

        /* renamed from: P */
        int mo3341P(Object obj);

        /* renamed from: Q */
        int mo3342Q(Object obj);

        /* renamed from: R */
        boolean mo3343R(Object obj);

        /* renamed from: S */
        int mo3344S(Object obj);

        /* renamed from: T */
        int mo3345T(Object obj);

        /* renamed from: U */
        int mo3346U(Object obj);

        /* renamed from: V */
        int mo3347V(Object obj);

        /* renamed from: W */
        boolean mo3348W(Object obj);

        /* renamed from: X */
        boolean mo3349X(Object obj);

        /* renamed from: Y */
        Object mo3350Y(Object obj);

        /* renamed from: Z */
        Object mo3351Z(Object obj);

        /* renamed from: a */
        Object mo3272a();

        /* renamed from: a */
        Object mo3352a(int i, float f, float f2, float f3);

        /* renamed from: a */
        Object mo3353a(int i, int i2, int i3, int i4, boolean z);

        /* renamed from: a */
        Object mo3249a(int i, int i2, int i3, int i4, boolean z, boolean z2);

        /* renamed from: a */
        Object mo3354a(int i, int i2, boolean z);

        /* renamed from: a */
        Object mo3250a(int i, int i2, boolean z, int i3);

        /* renamed from: a */
        Object mo3251a(int i, CharSequence charSequence);

        /* renamed from: a */
        Object mo3293a(View view);

        /* renamed from: a */
        Object mo3355a(View view, int i);

        /* renamed from: a */
        List<Object> mo3252a(Object obj);

        /* renamed from: a */
        List<Object> mo3294a(Object obj, String str);

        /* renamed from: a */
        void mo3253a(Object obj, int i);

        /* renamed from: a */
        void mo3356a(Object obj, int i, int i2);

        /* renamed from: a */
        void mo3295a(Object obj, Rect rect);

        /* renamed from: a */
        void mo3254a(Object obj, CharSequence charSequence);

        /* renamed from: a */
        void mo3255a(Object obj, Object obj2);

        /* renamed from: a */
        void mo3273a(Object obj, boolean z);

        /* renamed from: a */
        boolean mo3357a(Object obj, int i, Bundle bundle);

        /* renamed from: a */
        boolean mo3256a(Object obj, View view);

        /* renamed from: a */
        boolean mo3257a(Object obj, View view, int i);

        /* renamed from: aa */
        boolean mo3358aa(Object obj);

        /* renamed from: ab */
        Bundle mo3359ab(Object obj);

        /* renamed from: ac */
        int mo3360ac(Object obj);

        /* renamed from: ad */
        int mo3361ad(Object obj);

        /* renamed from: ae */
        int mo3362ae(Object obj);

        /* renamed from: af */
        boolean mo3363af(Object obj);

        /* renamed from: ag */
        boolean mo3364ag(Object obj);

        /* renamed from: ah */
        boolean mo3365ah(Object obj);

        /* renamed from: ai */
        boolean mo3366ai(Object obj);

        /* renamed from: aj */
        CharSequence mo3367aj(Object obj);

        /* renamed from: b */
        int mo3258b(Object obj);

        /* renamed from: b */
        Object mo3274b();

        /* renamed from: b */
        void mo3281b(Object obj, int i);

        /* renamed from: b */
        void mo3296b(Object obj, Rect rect);

        /* renamed from: b */
        void mo3266b(Object obj, View view);

        /* renamed from: b */
        void mo3267b(Object obj, View view, int i);

        /* renamed from: b */
        void mo3297b(Object obj, CharSequence charSequence);

        /* renamed from: b */
        void mo3368b(Object obj, String str);

        /* renamed from: b */
        void mo3282b(Object obj, boolean z);

        /* renamed from: b */
        boolean mo3259b(Object obj, Object obj2);

        /* renamed from: c */
        CharSequence mo3260c(Object obj);

        /* renamed from: c */
        Object mo3275c();

        /* renamed from: c */
        List<Object> mo3369c(Object obj, String str);

        /* renamed from: c */
        void mo3298c(Object obj, int i);

        /* renamed from: c */
        void mo3299c(Object obj, Rect rect);

        /* renamed from: c */
        void mo3268c(Object obj, View view);

        /* renamed from: c */
        void mo3269c(Object obj, View view, int i);

        /* renamed from: c */
        void mo3300c(Object obj, CharSequence charSequence);

        /* renamed from: c */
        void mo3370c(Object obj, Object obj2);

        /* renamed from: c */
        void mo3301c(Object obj, boolean z);

        /* renamed from: d */
        Object mo3276d();

        /* renamed from: d */
        Object mo3302d(Object obj, int i);

        /* renamed from: d */
        void mo3303d(Object obj, Rect rect);

        /* renamed from: d */
        void mo3304d(Object obj, View view);

        /* renamed from: d */
        void mo3371d(Object obj, View view, int i);

        /* renamed from: d */
        void mo3305d(Object obj, CharSequence charSequence);

        /* renamed from: d */
        void mo3372d(Object obj, Object obj2);

        /* renamed from: d */
        void mo3306d(Object obj, boolean z);

        /* renamed from: d */
        boolean mo3261d(Object obj);

        /* renamed from: e */
        CharSequence mo3262e(Object obj);

        /* renamed from: e */
        Object mo3277e();

        /* renamed from: e */
        void mo3307e(Object obj, View view);

        /* renamed from: e */
        void mo3373e(Object obj, View view, int i);

        /* renamed from: e */
        void mo3308e(Object obj, CharSequence charSequence);

        /* renamed from: e */
        void mo3374e(Object obj, Object obj2);

        /* renamed from: e */
        void mo3309e(Object obj, boolean z);

        /* renamed from: e */
        boolean mo3310e(Object obj, int i);

        /* renamed from: f */
        int mo3263f(Object obj);

        /* renamed from: f */
        Object mo3278f();

        /* renamed from: f */
        Object mo3375f(Object obj, int i);

        /* renamed from: f */
        void mo3311f(Object obj, View view);

        /* renamed from: f */
        void mo3376f(Object obj, View view, int i);

        /* renamed from: f */
        void mo3377f(Object obj, CharSequence charSequence);

        /* renamed from: f */
        void mo3312f(Object obj, boolean z);

        /* renamed from: g */
        Object mo3279g();

        /* renamed from: g */
        Object mo3264g(Object obj);

        /* renamed from: g */
        Object mo3378g(Object obj, int i);

        /* renamed from: g */
        void mo3379g(Object obj, View view);

        /* renamed from: g */
        void mo3380g(Object obj, View view, int i);

        /* renamed from: g */
        void mo3313g(Object obj, boolean z);

        /* renamed from: h */
        int mo3265h(Object obj);

        /* renamed from: h */
        Object mo3283h();

        /* renamed from: h */
        void mo3381h(Object obj, int i);

        /* renamed from: h */
        void mo3382h(Object obj, View view);

        /* renamed from: h */
        void mo3383h(Object obj, View view, int i);

        /* renamed from: h */
        void mo3314h(Object obj, boolean z);

        /* renamed from: i */
        Object mo3315i();

        /* renamed from: i */
        Object mo3270i(Object obj);

        /* renamed from: i */
        void mo3384i(Object obj, int i);

        /* renamed from: i */
        void mo3316i(Object obj, boolean z);

        /* renamed from: j */
        Object mo3271j(Object obj);

        /* renamed from: j */
        void mo3385j(Object obj, int i);

        /* renamed from: j */
        void mo3317j(Object obj, boolean z);

        /* renamed from: k */
        void mo3318k(Object obj, boolean z);

        /* renamed from: k */
        boolean mo3280k(Object obj);

        /* renamed from: l */
        int mo3284l(Object obj);

        /* renamed from: l */
        void mo3319l(Object obj, boolean z);

        /* renamed from: m */
        void mo3386m(Object obj, boolean z);

        /* renamed from: m */
        boolean mo3285m(Object obj);

        /* renamed from: n */
        Object mo3320n(Object obj);

        /* renamed from: n */
        void mo3387n(Object obj, boolean z);

        /* renamed from: o */
        int mo3321o(Object obj);

        /* renamed from: o */
        void mo3388o(Object obj, boolean z);

        /* renamed from: p */
        int mo3322p(Object obj);

        /* renamed from: p */
        void mo3389p(Object obj, boolean z);

        /* renamed from: q */
        CharSequence mo3323q(Object obj);

        /* renamed from: q */
        void mo3390q(Object obj, boolean z);

        /* renamed from: r */
        CharSequence mo3324r(Object obj);

        /* renamed from: r */
        void mo3391r(Object obj, boolean z);

        /* renamed from: s */
        CharSequence mo3325s(Object obj);

        /* renamed from: s */
        void mo3392s(Object obj, boolean z);

        /* renamed from: t */
        Object mo3326t(Object obj);

        /* renamed from: u */
        CharSequence mo3327u(Object obj);

        /* renamed from: v */
        int mo3328v(Object obj);

        /* renamed from: w */
        boolean mo3329w(Object obj);

        /* renamed from: x */
        boolean mo3330x(Object obj);

        /* renamed from: y */
        boolean mo3331y(Object obj);

        /* renamed from: z */
        boolean mo3332z(Object obj);
    }

    /* renamed from: android.support.v4.view.a.h$h */
    static class C0957h extends C0955f {
        C0957h() {
        }

        /* renamed from: H */
        public int mo3333H(Object obj) {
            return C0972n.m5369b(obj);
        }

        /* renamed from: I */
        public boolean mo3334I(Object obj) {
            return C0972n.m5367a(obj);
        }

        /* renamed from: J */
        public boolean mo3335J(Object obj) {
            return C0972n.m5375c(obj);
        }

        /* renamed from: a */
        public Object mo3355a(View view, int i) {
            return C0972n.m5363a(view, i);
        }

        /* renamed from: a */
        public boolean mo3357a(Object obj, int i, Bundle bundle) {
            return C0972n.m5368a(obj, i, bundle);
        }

        /* renamed from: d */
        public void mo3371d(Object obj, View view, int i) {
            C0972n.m5371b(obj, view, i);
        }

        /* renamed from: e */
        public void mo3373e(Object obj, View view, int i) {
            C0972n.m5365a(obj, view, i);
        }

        /* renamed from: f */
        public Object mo3375f(Object obj, int i) {
            return C0972n.m5370b(obj, i);
        }

        /* renamed from: f */
        public void mo3376f(Object obj, View view, int i) {
            C0972n.m5374c(obj, view, i);
        }

        /* renamed from: g */
        public Object mo3378g(Object obj, int i) {
            return C0972n.m5373c(obj, i);
        }

        /* renamed from: h */
        public void mo3381h(Object obj, int i) {
            C0972n.m5364a(obj, i);
        }

        /* renamed from: m */
        public void mo3386m(Object obj, boolean z) {
            C0972n.m5366a(obj, z);
        }

        /* renamed from: n */
        public void mo3387n(Object obj, boolean z) {
            C0972n.m5372b(obj, z);
        }
    }

    /* renamed from: android.support.v4.view.a.h$i */
    static class C0958i extends C0957h {
        C0958i() {
        }

        /* renamed from: Y */
        public Object mo3350Y(Object obj) {
            return C0973o.m5376a(obj);
        }

        /* renamed from: Z */
        public Object mo3351Z(Object obj) {
            return C0973o.m5379b(obj);
        }

        /* renamed from: g */
        public void mo3379g(Object obj, View view) {
            C0973o.m5377a(obj, view);
        }

        /* renamed from: g */
        public void mo3380g(Object obj, View view, int i) {
            C0973o.m5378a(obj, view, i);
        }

        /* renamed from: h */
        public void mo3382h(Object obj, View view) {
            C0973o.m5380b(obj, view);
        }

        /* renamed from: h */
        public void mo3383h(Object obj, View view, int i) {
            C0973o.m5381b(obj, view, i);
        }
    }

    /* renamed from: android.support.v4.view.a.h$j */
    static class C0959j extends C0958i {
        C0959j() {
        }

        /* renamed from: K */
        public String mo3336K(Object obj) {
            return C0974p.m5382a(obj);
        }

        /* renamed from: a */
        public void mo3356a(Object obj, int i, int i2) {
            C0974p.m5383a(obj, i, i2);
        }

        /* renamed from: ad */
        public int mo3361ad(Object obj) {
            return C0974p.m5386b(obj);
        }

        /* renamed from: ae */
        public int mo3362ae(Object obj) {
            return C0974p.m5388c(obj);
        }

        /* renamed from: ag */
        public boolean mo3364ag(Object obj) {
            return C0974p.m5389d(obj);
        }

        /* renamed from: ai */
        public boolean mo3366ai(Object obj) {
            return C0974p.m5390e(obj);
        }

        /* renamed from: b */
        public void mo3368b(Object obj, String str) {
            C0974p.m5384a(obj, str);
        }

        /* renamed from: c */
        public List<Object> mo3369c(Object obj, String str) {
            return C0974p.m5387b(obj, str);
        }

        /* renamed from: r */
        public void mo3391r(Object obj, boolean z) {
            C0974p.m5385a(obj, z);
        }
    }

    /* renamed from: android.support.v4.view.a.h$k */
    static class C0960k extends C0959j {
        C0960k() {
        }

        /* renamed from: L */
        public int mo3337L(Object obj) {
            return C0975q.m5391a(obj);
        }

        /* renamed from: M */
        public Object mo3338M(Object obj) {
            return C0975q.m5401b(obj);
        }

        /* renamed from: N */
        public Object mo3339N(Object obj) {
            return C0975q.m5405c(obj);
        }

        /* renamed from: O */
        public Object mo3340O(Object obj) {
            return C0975q.m5408d(obj);
        }

        /* renamed from: P */
        public int mo3341P(Object obj) {
            return C0975q.C0976a.m5418a(obj);
        }

        /* renamed from: Q */
        public int mo3342Q(Object obj) {
            return C0975q.C0976a.m5419b(obj);
        }

        /* renamed from: R */
        public boolean mo3343R(Object obj) {
            return C0975q.C0976a.m5420c(obj);
        }

        /* renamed from: S */
        public int mo3344S(Object obj) {
            return C0975q.C0977b.m5421a(obj);
        }

        /* renamed from: T */
        public int mo3345T(Object obj) {
            return C0975q.C0977b.m5422b(obj);
        }

        /* renamed from: U */
        public int mo3346U(Object obj) {
            return C0975q.C0977b.m5423c(obj);
        }

        /* renamed from: V */
        public int mo3347V(Object obj) {
            return C0975q.C0977b.m5424d(obj);
        }

        /* renamed from: W */
        public boolean mo3348W(Object obj) {
            return C0975q.C0977b.m5425e(obj);
        }

        /* renamed from: X */
        public boolean mo3349X(Object obj) {
            return C0975q.m5410e(obj);
        }

        /* renamed from: a */
        public Object mo3352a(int i, float f, float f2, float f3) {
            return C0975q.m5392a(i, f, f2, f3);
        }

        /* renamed from: a */
        public Object mo3353a(int i, int i2, int i3, int i4, boolean z) {
            return C0975q.m5393a(i, i2, i3, i4, z);
        }

        /* renamed from: a */
        public Object mo3249a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return C0975q.m5393a(i, i2, i3, i4, z);
        }

        /* renamed from: a */
        public Object mo3354a(int i, int i2, boolean z) {
            return C0975q.m5394a(i, i2, z);
        }

        /* renamed from: a */
        public Object mo3250a(int i, int i2, boolean z, int i3) {
            return C0975q.m5395a(i, i2, z, i3);
        }

        /* renamed from: aa */
        public boolean mo3358aa(Object obj) {
            return C0975q.m5411f(obj);
        }

        /* renamed from: ab */
        public Bundle mo3359ab(Object obj) {
            return C0975q.m5412g(obj);
        }

        /* renamed from: ac */
        public int mo3360ac(Object obj) {
            return C0975q.m5413h(obj);
        }

        /* renamed from: af */
        public boolean mo3363af(Object obj) {
            return C0975q.m5414i(obj);
        }

        /* renamed from: ah */
        public boolean mo3365ah(Object obj) {
            return C0975q.m5415j(obj);
        }

        /* renamed from: aj */
        public CharSequence mo3367aj(Object obj) {
            return C0975q.m5416k(obj);
        }

        /* renamed from: c */
        public void mo3370c(Object obj, Object obj2) {
            C0975q.m5399a(obj, obj2);
        }

        /* renamed from: d */
        public void mo3372d(Object obj, Object obj2) {
            C0975q.m5403b(obj, obj2);
        }

        /* renamed from: e */
        public void mo3374e(Object obj, Object obj2) {
            C0975q.m5406c(obj, obj2);
        }

        /* renamed from: f */
        public void mo3377f(Object obj, CharSequence charSequence) {
            C0975q.m5398a(obj, charSequence);
        }

        /* renamed from: i */
        public void mo3384i(Object obj, int i) {
            C0975q.m5396a(obj, i);
        }

        /* renamed from: j */
        public void mo3385j(Object obj, int i) {
            C0975q.m5402b(obj, i);
        }

        /* renamed from: o */
        public void mo3388o(Object obj, boolean z) {
            C0975q.m5400a(obj, z);
        }

        /* renamed from: p */
        public void mo3389p(Object obj, boolean z) {
            C0975q.m5404b(obj, z);
        }

        /* renamed from: q */
        public void mo3390q(Object obj, boolean z) {
            C0975q.m5407c(obj, z);
        }

        /* renamed from: s */
        public void mo3392s(Object obj, boolean z) {
            C0975q.m5409d(obj, z);
        }
    }

    /* renamed from: android.support.v4.view.a.h$l */
    static class C0961l implements C0956g {
        C0961l() {
        }

        /* renamed from: A */
        public boolean mo3286A(Object obj) {
            return false;
        }

        /* renamed from: B */
        public boolean mo3287B(Object obj) {
            return false;
        }

        /* renamed from: C */
        public boolean mo3288C(Object obj) {
            return false;
        }

        /* renamed from: D */
        public boolean mo3289D(Object obj) {
            return false;
        }

        /* renamed from: E */
        public boolean mo3290E(Object obj) {
            return false;
        }

        /* renamed from: F */
        public boolean mo3291F(Object obj) {
            return false;
        }

        /* renamed from: G */
        public void mo3292G(Object obj) {
        }

        /* renamed from: H */
        public int mo3333H(Object obj) {
            return 0;
        }

        /* renamed from: I */
        public boolean mo3334I(Object obj) {
            return false;
        }

        /* renamed from: J */
        public boolean mo3335J(Object obj) {
            return false;
        }

        /* renamed from: K */
        public String mo3336K(Object obj) {
            return null;
        }

        /* renamed from: L */
        public int mo3337L(Object obj) {
            return 0;
        }

        /* renamed from: M */
        public Object mo3338M(Object obj) {
            return null;
        }

        /* renamed from: N */
        public Object mo3339N(Object obj) {
            return null;
        }

        /* renamed from: O */
        public Object mo3340O(Object obj) {
            return null;
        }

        /* renamed from: P */
        public int mo3341P(Object obj) {
            return 0;
        }

        /* renamed from: Q */
        public int mo3342Q(Object obj) {
            return 0;
        }

        /* renamed from: R */
        public boolean mo3343R(Object obj) {
            return false;
        }

        /* renamed from: S */
        public int mo3344S(Object obj) {
            return 0;
        }

        /* renamed from: T */
        public int mo3345T(Object obj) {
            return 0;
        }

        /* renamed from: U */
        public int mo3346U(Object obj) {
            return 0;
        }

        /* renamed from: V */
        public int mo3347V(Object obj) {
            return 0;
        }

        /* renamed from: W */
        public boolean mo3348W(Object obj) {
            return false;
        }

        /* renamed from: X */
        public boolean mo3349X(Object obj) {
            return false;
        }

        /* renamed from: Y */
        public Object mo3350Y(Object obj) {
            return null;
        }

        /* renamed from: Z */
        public Object mo3351Z(Object obj) {
            return null;
        }

        /* renamed from: a */
        public Object mo3272a() {
            return null;
        }

        /* renamed from: a */
        public Object mo3352a(int i, float f, float f2, float f3) {
            return null;
        }

        /* renamed from: a */
        public Object mo3353a(int i, int i2, int i3, int i4, boolean z) {
            return null;
        }

        /* renamed from: a */
        public Object mo3249a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return null;
        }

        /* renamed from: a */
        public Object mo3354a(int i, int i2, boolean z) {
            return null;
        }

        /* renamed from: a */
        public Object mo3250a(int i, int i2, boolean z, int i3) {
            return null;
        }

        /* renamed from: a */
        public Object mo3251a(int i, CharSequence charSequence) {
            return null;
        }

        /* renamed from: a */
        public Object mo3293a(View view) {
            return null;
        }

        /* renamed from: a */
        public Object mo3355a(View view, int i) {
            return null;
        }

        /* renamed from: a */
        public List<Object> mo3252a(Object obj) {
            return null;
        }

        /* renamed from: a */
        public List<Object> mo3294a(Object obj, String str) {
            return Collections.emptyList();
        }

        /* renamed from: a */
        public void mo3253a(Object obj, int i) {
        }

        /* renamed from: a */
        public void mo3356a(Object obj, int i, int i2) {
        }

        /* renamed from: a */
        public void mo3295a(Object obj, Rect rect) {
        }

        /* renamed from: a */
        public void mo3254a(Object obj, CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo3255a(Object obj, Object obj2) {
        }

        /* renamed from: a */
        public void mo3273a(Object obj, boolean z) {
        }

        /* renamed from: a */
        public boolean mo3357a(Object obj, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3256a(Object obj, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3257a(Object obj, View view, int i) {
            return false;
        }

        /* renamed from: aa */
        public boolean mo3358aa(Object obj) {
            return false;
        }

        /* renamed from: ab */
        public Bundle mo3359ab(Object obj) {
            return new Bundle();
        }

        /* renamed from: ac */
        public int mo3360ac(Object obj) {
            return 0;
        }

        /* renamed from: ad */
        public int mo3361ad(Object obj) {
            return -1;
        }

        /* renamed from: ae */
        public int mo3362ae(Object obj) {
            return -1;
        }

        /* renamed from: af */
        public boolean mo3363af(Object obj) {
            return false;
        }

        /* renamed from: ag */
        public boolean mo3364ag(Object obj) {
            return false;
        }

        /* renamed from: ah */
        public boolean mo3365ah(Object obj) {
            return false;
        }

        /* renamed from: ai */
        public boolean mo3366ai(Object obj) {
            return false;
        }

        /* renamed from: aj */
        public CharSequence mo3367aj(Object obj) {
            return null;
        }

        /* renamed from: b */
        public int mo3258b(Object obj) {
            return 0;
        }

        /* renamed from: b */
        public Object mo3274b() {
            return null;
        }

        /* renamed from: b */
        public void mo3281b(Object obj, int i) {
        }

        /* renamed from: b */
        public void mo3296b(Object obj, Rect rect) {
        }

        /* renamed from: b */
        public void mo3266b(Object obj, View view) {
        }

        /* renamed from: b */
        public void mo3267b(Object obj, View view, int i) {
        }

        /* renamed from: b */
        public void mo3297b(Object obj, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo3368b(Object obj, String str) {
        }

        /* renamed from: b */
        public void mo3282b(Object obj, boolean z) {
        }

        /* renamed from: b */
        public boolean mo3259b(Object obj, Object obj2) {
            return false;
        }

        /* renamed from: c */
        public CharSequence mo3260c(Object obj) {
            return null;
        }

        /* renamed from: c */
        public Object mo3275c() {
            return null;
        }

        /* renamed from: c */
        public List<Object> mo3369c(Object obj, String str) {
            return Collections.emptyList();
        }

        /* renamed from: c */
        public void mo3298c(Object obj, int i) {
        }

        /* renamed from: c */
        public void mo3299c(Object obj, Rect rect) {
        }

        /* renamed from: c */
        public void mo3268c(Object obj, View view) {
        }

        /* renamed from: c */
        public void mo3269c(Object obj, View view, int i) {
        }

        /* renamed from: c */
        public void mo3300c(Object obj, CharSequence charSequence) {
        }

        /* renamed from: c */
        public void mo3370c(Object obj, Object obj2) {
        }

        /* renamed from: c */
        public void mo3301c(Object obj, boolean z) {
        }

        /* renamed from: d */
        public Object mo3276d() {
            return null;
        }

        /* renamed from: d */
        public Object mo3302d(Object obj, int i) {
            return null;
        }

        /* renamed from: d */
        public void mo3303d(Object obj, Rect rect) {
        }

        /* renamed from: d */
        public void mo3304d(Object obj, View view) {
        }

        /* renamed from: d */
        public void mo3371d(Object obj, View view, int i) {
        }

        /* renamed from: d */
        public void mo3305d(Object obj, CharSequence charSequence) {
        }

        /* renamed from: d */
        public void mo3372d(Object obj, Object obj2) {
        }

        /* renamed from: d */
        public void mo3306d(Object obj, boolean z) {
        }

        /* renamed from: d */
        public boolean mo3261d(Object obj) {
            return false;
        }

        /* renamed from: e */
        public CharSequence mo3262e(Object obj) {
            return null;
        }

        /* renamed from: e */
        public Object mo3277e() {
            return null;
        }

        /* renamed from: e */
        public void mo3307e(Object obj, View view) {
        }

        /* renamed from: e */
        public void mo3373e(Object obj, View view, int i) {
        }

        /* renamed from: e */
        public void mo3308e(Object obj, CharSequence charSequence) {
        }

        /* renamed from: e */
        public void mo3374e(Object obj, Object obj2) {
        }

        /* renamed from: e */
        public void mo3309e(Object obj, boolean z) {
        }

        /* renamed from: e */
        public boolean mo3310e(Object obj, int i) {
            return false;
        }

        /* renamed from: f */
        public int mo3263f(Object obj) {
            return -1;
        }

        /* renamed from: f */
        public Object mo3278f() {
            return null;
        }

        /* renamed from: f */
        public Object mo3375f(Object obj, int i) {
            return null;
        }

        /* renamed from: f */
        public void mo3311f(Object obj, View view) {
        }

        /* renamed from: f */
        public void mo3376f(Object obj, View view, int i) {
        }

        /* renamed from: f */
        public void mo3377f(Object obj, CharSequence charSequence) {
        }

        /* renamed from: f */
        public void mo3312f(Object obj, boolean z) {
        }

        /* renamed from: g */
        public Object mo3279g() {
            return null;
        }

        /* renamed from: g */
        public Object mo3264g(Object obj) {
            return null;
        }

        /* renamed from: g */
        public Object mo3378g(Object obj, int i) {
            return null;
        }

        /* renamed from: g */
        public void mo3379g(Object obj, View view) {
        }

        /* renamed from: g */
        public void mo3380g(Object obj, View view, int i) {
        }

        /* renamed from: g */
        public void mo3313g(Object obj, boolean z) {
        }

        /* renamed from: h */
        public int mo3265h(Object obj) {
            return 0;
        }

        /* renamed from: h */
        public Object mo3283h() {
            return null;
        }

        /* renamed from: h */
        public void mo3381h(Object obj, int i) {
        }

        /* renamed from: h */
        public void mo3382h(Object obj, View view) {
        }

        /* renamed from: h */
        public void mo3383h(Object obj, View view, int i) {
        }

        /* renamed from: h */
        public void mo3314h(Object obj, boolean z) {
        }

        /* renamed from: i */
        public Object mo3315i() {
            return null;
        }

        /* renamed from: i */
        public Object mo3270i(Object obj) {
            return null;
        }

        /* renamed from: i */
        public void mo3384i(Object obj, int i) {
        }

        /* renamed from: i */
        public void mo3316i(Object obj, boolean z) {
        }

        /* renamed from: j */
        public Object mo3271j(Object obj) {
            return null;
        }

        /* renamed from: j */
        public void mo3385j(Object obj, int i) {
        }

        /* renamed from: j */
        public void mo3317j(Object obj, boolean z) {
        }

        /* renamed from: k */
        public void mo3318k(Object obj, boolean z) {
        }

        /* renamed from: k */
        public boolean mo3280k(Object obj) {
            return false;
        }

        /* renamed from: l */
        public int mo3284l(Object obj) {
            return 0;
        }

        /* renamed from: l */
        public void mo3319l(Object obj, boolean z) {
        }

        /* renamed from: m */
        public void mo3386m(Object obj, boolean z) {
        }

        /* renamed from: m */
        public boolean mo3285m(Object obj) {
            return true;
        }

        /* renamed from: n */
        public Object mo3320n(Object obj) {
            return null;
        }

        /* renamed from: n */
        public void mo3387n(Object obj, boolean z) {
        }

        /* renamed from: o */
        public int mo3321o(Object obj) {
            return 0;
        }

        /* renamed from: o */
        public void mo3388o(Object obj, boolean z) {
        }

        /* renamed from: p */
        public int mo3322p(Object obj) {
            return 0;
        }

        /* renamed from: p */
        public void mo3389p(Object obj, boolean z) {
        }

        /* renamed from: q */
        public CharSequence mo3323q(Object obj) {
            return null;
        }

        /* renamed from: q */
        public void mo3390q(Object obj, boolean z) {
        }

        /* renamed from: r */
        public CharSequence mo3324r(Object obj) {
            return null;
        }

        /* renamed from: r */
        public void mo3391r(Object obj, boolean z) {
        }

        /* renamed from: s */
        public CharSequence mo3325s(Object obj) {
            return null;
        }

        /* renamed from: s */
        public void mo3392s(Object obj, boolean z) {
        }

        /* renamed from: t */
        public Object mo3326t(Object obj) {
            return null;
        }

        /* renamed from: u */
        public CharSequence mo3327u(Object obj) {
            return null;
        }

        /* renamed from: v */
        public int mo3328v(Object obj) {
            return 0;
        }

        /* renamed from: w */
        public boolean mo3329w(Object obj) {
            return false;
        }

        /* renamed from: x */
        public boolean mo3330x(Object obj) {
            return false;
        }

        /* renamed from: y */
        public boolean mo3331y(Object obj) {
            return false;
        }

        /* renamed from: z */
        public boolean mo3332z(Object obj) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.a.h$m */
    public static class C0962m {

        /* renamed from: a */
        public static final int f3341a = 0;

        /* renamed from: b */
        public static final int f3342b = 1;

        /* renamed from: c */
        public static final int f3343c = 2;

        /* renamed from: d */
        final Object f3344d;

        C0962m(Object obj) {
            this.f3344d = obj;
        }

        /* renamed from: a */
        public static C0962m m5260a(int i, int i2, boolean z) {
            return new C0962m(C0949h.f3283a.mo3354a(i, i2, z));
        }

        /* renamed from: a */
        public static C0962m m5261a(int i, int i2, boolean z, int i3) {
            return new C0962m(C0949h.f3283a.mo3250a(i, i2, z, i3));
        }

        /* renamed from: a */
        public int mo3393a() {
            return C0949h.f3283a.mo3341P(this.f3344d);
        }

        /* renamed from: b */
        public int mo3394b() {
            return C0949h.f3283a.mo3342Q(this.f3344d);
        }

        /* renamed from: c */
        public boolean mo3395c() {
            return C0949h.f3283a.mo3343R(this.f3344d);
        }

        /* renamed from: d */
        public int mo3396d() {
            return C0949h.f3283a.mo3265h(this.f3344d);
        }
    }

    /* renamed from: android.support.v4.view.a.h$n */
    public static class C0963n {

        /* renamed from: a */
        final Object f3345a;

        C0963n(Object obj) {
            this.f3345a = obj;
        }

        /* renamed from: a */
        public static C0963n m5266a(int i, int i2, int i3, int i4, boolean z) {
            return new C0963n(C0949h.f3283a.mo3353a(i, i2, i3, i4, z));
        }

        /* renamed from: a */
        public static C0963n m5267a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C0963n(C0949h.f3283a.mo3249a(i, i2, i3, i4, z, z2));
        }

        /* renamed from: a */
        public int mo3397a() {
            return C0949h.f3283a.mo3344S(this.f3345a);
        }

        /* renamed from: b */
        public int mo3398b() {
            return C0949h.f3283a.mo3345T(this.f3345a);
        }

        /* renamed from: c */
        public int mo3399c() {
            return C0949h.f3283a.mo3346U(this.f3345a);
        }

        /* renamed from: d */
        public int mo3400d() {
            return C0949h.f3283a.mo3347V(this.f3345a);
        }

        /* renamed from: e */
        public boolean mo3401e() {
            return C0949h.f3283a.mo3348W(this.f3345a);
        }

        /* renamed from: f */
        public boolean mo3402f() {
            return C0949h.f3283a.mo3261d(this.f3345a);
        }
    }

    /* renamed from: android.support.v4.view.a.h$o */
    public static class C0964o {

        /* renamed from: a */
        public static final int f3346a = 0;

        /* renamed from: b */
        public static final int f3347b = 1;

        /* renamed from: c */
        public static final int f3348c = 2;

        /* renamed from: d */
        final Object f3349d;

        C0964o(Object obj) {
            this.f3349d = obj;
        }

        /* renamed from: a */
        public static C0964o m5274a(int i, float f, float f2, float f3) {
            return new C0964o(C0949h.f3283a.mo3352a(i, f, f2, f3));
        }

        /* renamed from: a */
        public float mo3403a() {
            return C0975q.C0978c.m5426a(this.f3349d);
        }

        /* renamed from: b */
        public float mo3404b() {
            return C0975q.C0978c.m5427b(this.f3349d);
        }

        /* renamed from: c */
        public float mo3405c() {
            return C0975q.C0978c.m5428c(this.f3349d);
        }

        /* renamed from: d */
        public int mo3406d() {
            return C0975q.C0978c.m5429d(this.f3349d);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            f3283a = new C0954e();
        } else if (Build.VERSION.SDK_INT >= 23) {
            f3283a = new C0953d();
        } else if (Build.VERSION.SDK_INT >= 22) {
            f3283a = new C0952c();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f3283a = new C0951b();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f3283a = new C0960k();
        } else if (Build.VERSION.SDK_INT >= 18) {
            f3283a = new C0959j();
        } else if (Build.VERSION.SDK_INT >= 17) {
            f3283a = new C0958i();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f3283a = new C0957h();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f3283a = new C0955f();
        } else {
            f3283a = new C0961l();
        }
    }

    public C0949h(Object obj) {
        this.f3308O = obj;
    }

    /* renamed from: a */
    public static C0949h m4703a(C0949h hVar) {
        return m4706a(f3283a.mo3320n(hVar.f3308O));
    }

    /* renamed from: a */
    public static C0949h m4704a(View view) {
        return m4706a(f3283a.mo3293a(view));
    }

    /* renamed from: a */
    public static C0949h m4705a(View view, int i) {
        return m4706a(f3283a.mo3355a(view, i));
    }

    /* renamed from: a */
    static C0949h m4706a(Object obj) {
        if (obj != null) {
            return new C0949h(obj);
        }
        return null;
    }

    /* renamed from: b */
    public static C0949h m4707b() {
        return m4706a(f3283a.mo3315i());
    }

    /* renamed from: k */
    private static String m4708k(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: A */
    public int mo3129A() {
        return f3283a.mo3337L(this.f3308O);
    }

    /* renamed from: B */
    public int mo3130B() {
        return f3283a.mo3284l(this.f3308O);
    }

    /* renamed from: C */
    public C0962m mo3131C() {
        Object M = f3283a.mo3338M(this.f3308O);
        if (M == null) {
            return null;
        }
        return new C0962m(M);
    }

    /* renamed from: D */
    public C0963n mo3132D() {
        Object N = f3283a.mo3339N(this.f3308O);
        if (N == null) {
            return null;
        }
        return new C0963n(N);
    }

    /* renamed from: E */
    public C0964o mo3133E() {
        Object O = f3283a.mo3340O(this.f3308O);
        if (O == null) {
            return null;
        }
        return new C0964o(O);
    }

    /* renamed from: F */
    public List<C0950a> mo3134F() {
        List<Object> a = f3283a.mo3252a(this.f3308O);
        if (a == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C0950a(a.get(i)));
        }
        return arrayList;
    }

    /* renamed from: G */
    public boolean mo3135G() {
        return f3283a.mo3349X(this.f3308O);
    }

    /* renamed from: H */
    public boolean mo3136H() {
        return f3283a.mo3280k(this.f3308O);
    }

    /* renamed from: I */
    public CharSequence mo3137I() {
        return f3283a.mo3262e(this.f3308O);
    }

    /* renamed from: J */
    public C0949h mo3138J() {
        return m4706a(f3283a.mo3350Y(this.f3308O));
    }

    /* renamed from: K */
    public C0949h mo3139K() {
        return m4706a(f3283a.mo3351Z(this.f3308O));
    }

    /* renamed from: L */
    public boolean mo3140L() {
        return f3283a.mo3358aa(this.f3308O);
    }

    /* renamed from: M */
    public Bundle mo3141M() {
        return f3283a.mo3359ab(this.f3308O);
    }

    /* renamed from: N */
    public int mo3142N() {
        return f3283a.mo3360ac(this.f3308O);
    }

    /* renamed from: O */
    public int mo3143O() {
        return f3283a.mo3263f(this.f3308O);
    }

    /* renamed from: P */
    public int mo3144P() {
        return f3283a.mo3361ad(this.f3308O);
    }

    /* renamed from: Q */
    public int mo3145Q() {
        return f3283a.mo3362ae(this.f3308O);
    }

    /* renamed from: R */
    public C0949h mo3146R() {
        return m4706a(f3283a.mo3270i(this.f3308O));
    }

    /* renamed from: S */
    public C0949h mo3147S() {
        return m4706a(f3283a.mo3271j(this.f3308O));
    }

    /* renamed from: T */
    public C1001y mo3148T() {
        return C1001y.m5687a(f3283a.mo3264g(this.f3308O));
    }

    /* renamed from: U */
    public boolean mo3149U() {
        return f3283a.mo3363af(this.f3308O);
    }

    /* renamed from: V */
    public boolean mo3150V() {
        return f3283a.mo3364ag(this.f3308O);
    }

    /* renamed from: W */
    public boolean mo3151W() {
        return f3283a.mo3365ah(this.f3308O);
    }

    /* renamed from: X */
    public boolean mo3152X() {
        return f3283a.mo3366ai(this.f3308O);
    }

    @C0003aa
    /* renamed from: Y */
    public CharSequence mo3153Y() {
        return f3283a.mo3367aj(this.f3308O);
    }

    /* renamed from: a */
    public C0949h mo3154a(int i) {
        return m4706a(f3283a.mo3375f(this.f3308O, i));
    }

    /* renamed from: a */
    public Object mo3155a() {
        return this.f3308O;
    }

    /* renamed from: a */
    public List<C0949h> mo3156a(String str) {
        ArrayList arrayList = new ArrayList();
        List<Object> a = f3283a.mo3294a(this.f3308O, str);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C0949h(a.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo3157a(int i, int i2) {
        f3283a.mo3356a(this.f3308O, i, i2);
    }

    /* renamed from: a */
    public void mo3158a(Rect rect) {
        f3283a.mo3295a(this.f3308O, rect);
    }

    /* renamed from: a */
    public void mo3159a(C0950a aVar) {
        f3283a.mo3255a(this.f3308O, aVar.f3340E);
    }

    /* renamed from: a */
    public void mo3160a(C0964o oVar) {
        f3283a.mo3374e(this.f3308O, oVar.f3349d);
    }

    /* renamed from: a */
    public void mo3161a(CharSequence charSequence) {
        f3283a.mo3305d(this.f3308O, charSequence);
    }

    /* renamed from: a */
    public void mo3162a(boolean z) {
        f3283a.mo3301c(this.f3308O, z);
    }

    /* renamed from: a */
    public boolean mo3163a(int i, Bundle bundle) {
        return f3283a.mo3357a(this.f3308O, i, bundle);
    }

    /* renamed from: b */
    public C0949h mo3164b(int i) {
        return m4706a(f3283a.mo3378g(this.f3308O, i));
    }

    /* renamed from: b */
    public void mo3165b(Rect rect) {
        f3283a.mo3299c(this.f3308O, rect);
    }

    /* renamed from: b */
    public void mo3166b(View view) {
        f3283a.mo3311f(this.f3308O, view);
    }

    /* renamed from: b */
    public void mo3167b(View view, int i) {
        f3283a.mo3371d(this.f3308O, view, i);
    }

    /* renamed from: b */
    public void mo3168b(CharSequence charSequence) {
        f3283a.mo3297b(this.f3308O, charSequence);
    }

    /* renamed from: b */
    public void mo3169b(Object obj) {
        f3283a.mo3370c(this.f3308O, ((C0962m) obj).f3344d);
    }

    /* renamed from: b */
    public void mo3170b(String str) {
        f3283a.mo3368b(this.f3308O, str);
    }

    /* renamed from: b */
    public void mo3171b(boolean z) {
        f3283a.mo3306d(this.f3308O, z);
    }

    /* renamed from: b */
    public boolean mo3172b(C0950a aVar) {
        return f3283a.mo3259b(this.f3308O, aVar.f3340E);
    }

    /* renamed from: c */
    public int mo3173c() {
        return f3283a.mo3328v(this.f3308O);
    }

    /* renamed from: c */
    public C0949h mo3174c(int i) {
        return m4706a(f3283a.mo3302d(this.f3308O, i));
    }

    /* renamed from: c */
    public List<C0949h> mo3175c(String str) {
        List<Object> c = f3283a.mo3369c(this.f3308O, str);
        if (c == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object hVar : c) {
            arrayList.add(new C0949h(hVar));
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo3176c(Rect rect) {
        f3283a.mo3296b(this.f3308O, rect);
    }

    /* renamed from: c */
    public void mo3177c(View view) {
        f3283a.mo3304d(this.f3308O, view);
    }

    /* renamed from: c */
    public void mo3178c(View view, int i) {
        f3283a.mo3373e(this.f3308O, view, i);
    }

    /* renamed from: c */
    public void mo3179c(CharSequence charSequence) {
        f3283a.mo3308e(this.f3308O, charSequence);
    }

    /* renamed from: c */
    public void mo3180c(Object obj) {
        f3283a.mo3372d(this.f3308O, ((C0963n) obj).f3345a);
    }

    /* renamed from: c */
    public void mo3181c(boolean z) {
        f3283a.mo3313g(this.f3308O, z);
    }

    /* renamed from: d */
    public int mo3182d() {
        return f3283a.mo3322p(this.f3308O);
    }

    /* renamed from: d */
    public void mo3183d(int i) {
        f3283a.mo3298c(this.f3308O, i);
    }

    /* renamed from: d */
    public void mo3184d(Rect rect) {
        f3283a.mo3303d(this.f3308O, rect);
    }

    /* renamed from: d */
    public void mo3185d(CharSequence charSequence) {
        f3283a.mo3300c(this.f3308O, charSequence);
    }

    /* renamed from: d */
    public void mo3186d(boolean z) {
        f3283a.mo3314h(this.f3308O, z);
    }

    /* renamed from: d */
    public boolean mo3187d(View view) {
        return f3283a.mo3256a(this.f3308O, view);
    }

    /* renamed from: d */
    public boolean mo3188d(View view, int i) {
        return f3283a.mo3257a(this.f3308O, view, i);
    }

    /* renamed from: e */
    public int mo3189e() {
        return f3283a.mo3321o(this.f3308O);
    }

    /* renamed from: e */
    public void mo3190e(View view) {
        f3283a.mo3307e(this.f3308O, view);
    }

    /* renamed from: e */
    public void mo3191e(View view, int i) {
        this.f3309b = i;
        f3283a.mo3376f(this.f3308O, view, i);
    }

    /* renamed from: e */
    public void mo3192e(CharSequence charSequence) {
        f3283a.mo3254a(this.f3308O, charSequence);
    }

    /* renamed from: e */
    public void mo3193e(boolean z) {
        f3283a.mo3386m(this.f3308O, z);
    }

    /* renamed from: e */
    public boolean mo3194e(int i) {
        return f3283a.mo3310e(this.f3308O, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0949h hVar = (C0949h) obj;
        return this.f3308O == null ? hVar.f3308O == null : this.f3308O.equals(hVar.f3308O);
    }

    /* renamed from: f */
    public int mo3196f() {
        return f3283a.mo3333H(this.f3308O);
    }

    /* renamed from: f */
    public void mo3197f(int i) {
        f3283a.mo3381h(this.f3308O, i);
    }

    /* renamed from: f */
    public void mo3198f(View view) {
        f3283a.mo3379g(this.f3308O, view);
    }

    /* renamed from: f */
    public void mo3199f(View view, int i) {
        f3283a.mo3380g(this.f3308O, view, i);
    }

    /* renamed from: f */
    public void mo3200f(@C0003aa CharSequence charSequence) {
        f3283a.mo3377f(this.f3308O, charSequence);
    }

    /* renamed from: f */
    public void mo3201f(boolean z) {
        f3283a.mo3387n(this.f3308O, z);
    }

    /* renamed from: g */
    public C0949h mo3202g() {
        return m4706a(f3283a.mo3326t(this.f3308O));
    }

    /* renamed from: g */
    public void mo3203g(int i) {
        f3283a.mo3384i(this.f3308O, i);
    }

    /* renamed from: g */
    public void mo3204g(View view) {
        f3283a.mo3382h(this.f3308O, view);
    }

    /* renamed from: g */
    public void mo3205g(View view, int i) {
        f3283a.mo3383h(this.f3308O, view, i);
    }

    /* renamed from: g */
    public void mo3206g(boolean z) {
        f3283a.mo3319l(this.f3308O, z);
    }

    /* renamed from: h */
    public void mo3207h(int i) {
        f3283a.mo3281b(this.f3308O, i);
    }

    /* renamed from: h */
    public void mo3208h(View view) {
        f3283a.mo3266b(this.f3308O, view);
    }

    /* renamed from: h */
    public void mo3209h(View view, int i) {
        f3283a.mo3267b(this.f3308O, view, i);
    }

    /* renamed from: h */
    public void mo3210h(boolean z) {
        f3283a.mo3309e(this.f3308O, z);
    }

    /* renamed from: h */
    public boolean mo3211h() {
        return f3283a.mo3329w(this.f3308O);
    }

    public int hashCode() {
        if (this.f3308O == null) {
            return 0;
        }
        return this.f3308O.hashCode();
    }

    /* renamed from: i */
    public void mo3213i(int i) {
        f3283a.mo3385j(this.f3308O, i);
    }

    /* renamed from: i */
    public void mo3214i(View view) {
        f3283a.mo3268c(this.f3308O, view);
    }

    /* renamed from: i */
    public void mo3215i(View view, int i) {
        f3283a.mo3269c(this.f3308O, view, i);
    }

    /* renamed from: i */
    public void mo3216i(boolean z) {
        f3283a.mo3316i(this.f3308O, z);
    }

    /* renamed from: i */
    public boolean mo3217i() {
        return f3283a.mo3330x(this.f3308O);
    }

    /* renamed from: j */
    public void mo3218j(int i) {
        f3283a.mo3253a(this.f3308O, i);
    }

    /* renamed from: j */
    public void mo3219j(boolean z) {
        f3283a.mo3312f(this.f3308O, z);
    }

    /* renamed from: j */
    public boolean mo3220j() {
        return f3283a.mo3286A(this.f3308O);
    }

    /* renamed from: k */
    public void mo3221k(boolean z) {
        f3283a.mo3317j(this.f3308O, z);
    }

    /* renamed from: k */
    public boolean mo3222k() {
        return f3283a.mo3287B(this.f3308O);
    }

    /* renamed from: l */
    public void mo3223l(boolean z) {
        f3283a.mo3318k(this.f3308O, z);
    }

    /* renamed from: l */
    public boolean mo3224l() {
        return f3283a.mo3334I(this.f3308O);
    }

    /* renamed from: m */
    public void mo3225m(boolean z) {
        f3283a.mo3282b(this.f3308O, z);
    }

    /* renamed from: m */
    public boolean mo3226m() {
        return f3283a.mo3335J(this.f3308O);
    }

    /* renamed from: n */
    public void mo3227n(boolean z) {
        f3283a.mo3388o(this.f3308O, z);
    }

    /* renamed from: n */
    public boolean mo3228n() {
        return f3283a.mo3291F(this.f3308O);
    }

    /* renamed from: o */
    public void mo3229o(boolean z) {
        f3283a.mo3273a(this.f3308O, z);
    }

    /* renamed from: o */
    public boolean mo3230o() {
        return f3283a.mo3331y(this.f3308O);
    }

    /* renamed from: p */
    public void mo3231p(boolean z) {
        f3283a.mo3389p(this.f3308O, z);
    }

    /* renamed from: p */
    public boolean mo3232p() {
        return f3283a.mo3288C(this.f3308O);
    }

    /* renamed from: q */
    public void mo3233q(boolean z) {
        f3283a.mo3390q(this.f3308O, z);
    }

    /* renamed from: q */
    public boolean mo3234q() {
        return f3283a.mo3332z(this.f3308O);
    }

    /* renamed from: r */
    public void mo3235r(boolean z) {
        f3283a.mo3391r(this.f3308O, z);
    }

    /* renamed from: r */
    public boolean mo3236r() {
        return f3283a.mo3289D(this.f3308O);
    }

    /* renamed from: s */
    public void mo3237s(boolean z) {
        f3283a.mo3392s(this.f3308O, z);
    }

    /* renamed from: s */
    public boolean mo3238s() {
        return f3283a.mo3290E(this.f3308O);
    }

    /* renamed from: t */
    public boolean mo3239t() {
        return f3283a.mo3285m(this.f3308O);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo3158a(rect);
        sb.append("; boundsInParent: " + rect);
        mo3176c(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(mo3241u());
        sb.append("; className: ").append(mo3242v());
        sb.append("; text: ").append(mo3243w());
        sb.append("; contentDescription: ").append(mo3244x());
        sb.append("; viewId: ").append(mo3246z());
        sb.append("; checkable: ").append(mo3211h());
        sb.append("; checked: ").append(mo3217i());
        sb.append("; focusable: ").append(mo3220j());
        sb.append("; focused: ").append(mo3222k());
        sb.append("; selected: ").append(mo3228n());
        sb.append("; clickable: ").append(mo3230o());
        sb.append("; longClickable: ").append(mo3232p());
        sb.append("; enabled: ").append(mo3234q());
        sb.append("; password: ").append(mo3236r());
        sb.append("; scrollable: " + mo3238s());
        sb.append("; [");
        int e = mo3189e();
        while (e != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(e);
            e &= numberOfTrailingZeros ^ -1;
            sb.append(m4708k(numberOfTrailingZeros));
            if (e != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public CharSequence mo3241u() {
        return f3283a.mo3325s(this.f3308O);
    }

    /* renamed from: v */
    public CharSequence mo3242v() {
        return f3283a.mo3323q(this.f3308O);
    }

    /* renamed from: w */
    public CharSequence mo3243w() {
        return f3283a.mo3327u(this.f3308O);
    }

    /* renamed from: x */
    public CharSequence mo3244x() {
        return f3283a.mo3324r(this.f3308O);
    }

    /* renamed from: y */
    public void mo3245y() {
        f3283a.mo3292G(this.f3308O);
    }

    /* renamed from: z */
    public String mo3246z() {
        return f3283a.mo3336K(this.f3308O);
    }
}
